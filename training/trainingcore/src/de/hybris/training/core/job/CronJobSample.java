package de.hybris.training.core.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.apache.log4j.Logger;

public class CronJobSample extends AbstractJobPerformable<CronJobModel> {

    private static final Logger LOG = Logger.getLogger(String.valueOf(CronJobSample.class));

    @Override
    public PerformResult perform(final CronJobModel cronJobModel) {

        for(int i=0;i<100;i++ ){

            printSampleCronJobCount(i);

            if(clearAbortRequestedIfNeeded(cronJobModel)){
                LOG.info("Sample Cronjob is Aborted at count = "+i);
                return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);
            }
        }
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }

    private void printSampleCronJobCount(int i) {
        try {
            LOG.info("Printing Sample Cronjob where count = "+i);
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean isAbortable() {
        return true;
    }
}
