/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 08-Oct-2021, 10:07:38 AM                    ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.training.core.constants.TrainingCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.user.Employee TrainingEmployee}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTrainingEmployee extends Employee
{
	/** Qualifier of the <code>TrainingEmployee.employeeName</code> attribute **/
	public static final String EMPLOYEENAME = "employeeName";
	/** Qualifier of the <code>TrainingEmployee.employeeAge</code> attribute **/
	public static final String EMPLOYEEAGE = "employeeAge";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Employee.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(EMPLOYEENAME, AttributeMode.INITIAL);
		tmp.put(EMPLOYEEAGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.employeeAge</code> attribute.
	 * @return the employeeAge
	 */
	public Integer getEmployeeAge(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, EMPLOYEEAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.employeeAge</code> attribute.
	 * @return the employeeAge
	 */
	public Integer getEmployeeAge()
	{
		return getEmployeeAge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.employeeAge</code> attribute. 
	 * @return the employeeAge
	 */
	public int getEmployeeAgeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getEmployeeAge( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.employeeAge</code> attribute. 
	 * @return the employeeAge
	 */
	public int getEmployeeAgeAsPrimitive()
	{
		return getEmployeeAgeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.employeeAge</code> attribute. 
	 * @param value the employeeAge
	 */
	public void setEmployeeAge(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, EMPLOYEEAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.employeeAge</code> attribute. 
	 * @param value the employeeAge
	 */
	public void setEmployeeAge(final Integer value)
	{
		setEmployeeAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.employeeAge</code> attribute. 
	 * @param value the employeeAge
	 */
	public void setEmployeeAge(final SessionContext ctx, final int value)
	{
		setEmployeeAge( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.employeeAge</code> attribute. 
	 * @param value the employeeAge
	 */
	public void setEmployeeAge(final int value)
	{
		setEmployeeAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.employeeName</code> attribute.
	 * @return the employeeName
	 */
	public String getEmployeeName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTrainingEmployee.getEmployeeName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, EMPLOYEENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.employeeName</code> attribute.
	 * @return the employeeName
	 */
	public String getEmployeeName()
	{
		return getEmployeeName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.employeeName</code> attribute. 
	 * @return the localized employeeName
	 */
	public Map<Language,String> getAllEmployeeName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,EMPLOYEENAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingEmployee.employeeName</code> attribute. 
	 * @return the localized employeeName
	 */
	public Map<Language,String> getAllEmployeeName()
	{
		return getAllEmployeeName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.employeeName</code> attribute. 
	 * @param value the employeeName
	 */
	public void setEmployeeName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTrainingEmployee.setEmployeeName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, EMPLOYEENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.employeeName</code> attribute. 
	 * @param value the employeeName
	 */
	public void setEmployeeName(final String value)
	{
		setEmployeeName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.employeeName</code> attribute. 
	 * @param value the employeeName
	 */
	public void setAllEmployeeName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,EMPLOYEENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingEmployee.employeeName</code> attribute. 
	 * @param value the employeeName
	 */
	public void setAllEmployeeName(final Map<Language,String> value)
	{
		setAllEmployeeName( getSession().getSessionContext(), value );
	}
	
}
