/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 14-Jul-2021, 12:16:37 AM                    ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import de.hybris.training.core.constants.TrainingCoreConstants;
import de.hybris.training.core.jalo.Dealer;
import de.hybris.training.core.jalo.Vehicle;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Driver}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDriver extends GenericItem
{
	/** Qualifier of the <code>Driver.driverId</code> attribute **/
	public static final String DRIVERID = "driverId";
	/** Qualifier of the <code>Driver.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Driver.experience</code> attribute **/
	public static final String EXPERIENCE = "experience";
	/** Qualifier of the <code>Driver.dealers</code> attribute **/
	public static final String DEALERS = "dealers";
	/** Relation ordering override parameter constants for Dealer2Driver from ((trainingcore))*/
	protected static String DEALER2DRIVER_SRC_ORDERED = "relation.Dealer2Driver.source.ordered";
	protected static String DEALER2DRIVER_TGT_ORDERED = "relation.Dealer2Driver.target.ordered";
	/** Relation disable markmodifed parameter constants for Dealer2Driver from ((trainingcore))*/
	protected static String DEALER2DRIVER_MARKMODIFIED = "relation.Dealer2Driver.markmodified";
	/** Qualifier of the <code>Driver.vehicles</code> attribute **/
	public static final String VEHICLES = "vehicles";
	/** Relation ordering override parameter constants for Driver2Vehicle from ((trainingcore))*/
	protected static String DRIVER2VEHICLE_SRC_ORDERED = "relation.Driver2Vehicle.source.ordered";
	protected static String DRIVER2VEHICLE_TGT_ORDERED = "relation.Driver2Vehicle.target.ordered";
	/** Relation disable markmodifed parameter constants for Driver2Vehicle from ((trainingcore))*/
	protected static String DRIVER2VEHICLE_MARKMODIFIED = "relation.Driver2Vehicle.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DRIVERID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(EXPERIENCE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.dealers</code> attribute.
	 * @return the dealers - Dealers
	 */
	public Collection<Dealer> getDealers(final SessionContext ctx)
	{
		final List<Dealer> items = getLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.DEALER2DRIVER,
			"Dealer",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.dealers</code> attribute.
	 * @return the dealers - Dealers
	 */
	public Collection<Dealer> getDealers()
	{
		return getDealers( getSession().getSessionContext() );
	}
	
	public long getDealersCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingCoreConstants.Relations.DEALER2DRIVER,
			"Dealer",
			null
		);
	}
	
	public long getDealersCount()
	{
		return getDealersCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.dealers</code> attribute. 
	 * @param value the dealers - Dealers
	 */
	public void setDealers(final SessionContext ctx, final Collection<Dealer> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.DEALER2DRIVER,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(DEALER2DRIVER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.dealers</code> attribute. 
	 * @param value the dealers - Dealers
	 */
	public void setDealers(final Collection<Dealer> value)
	{
		setDealers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to dealers. 
	 * @param value the item to add to dealers - Dealers
	 */
	public void addToDealers(final SessionContext ctx, final Dealer value)
	{
		addLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.DEALER2DRIVER,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DEALER2DRIVER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to dealers. 
	 * @param value the item to add to dealers - Dealers
	 */
	public void addToDealers(final Dealer value)
	{
		addToDealers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from dealers. 
	 * @param value the item to remove from dealers - Dealers
	 */
	public void removeFromDealers(final SessionContext ctx, final Dealer value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.DEALER2DRIVER,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DEALER2DRIVER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from dealers. 
	 * @param value the item to remove from dealers - Dealers
	 */
	public void removeFromDealers(final Dealer value)
	{
		removeFromDealers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.driverId</code> attribute.
	 * @return the driverId
	 */
	public Integer getDriverId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DRIVERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.driverId</code> attribute.
	 * @return the driverId
	 */
	public Integer getDriverId()
	{
		return getDriverId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.driverId</code> attribute. 
	 * @return the driverId
	 */
	public int getDriverIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDriverId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.driverId</code> attribute. 
	 * @return the driverId
	 */
	public int getDriverIdAsPrimitive()
	{
		return getDriverIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.driverId</code> attribute. 
	 * @param value the driverId
	 */
	public void setDriverId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DRIVERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.driverId</code> attribute. 
	 * @param value the driverId
	 */
	public void setDriverId(final Integer value)
	{
		setDriverId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.driverId</code> attribute. 
	 * @param value the driverId
	 */
	public void setDriverId(final SessionContext ctx, final int value)
	{
		setDriverId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.driverId</code> attribute. 
	 * @param value the driverId
	 */
	public void setDriverId(final int value)
	{
		setDriverId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.experience</code> attribute.
	 * @return the experience
	 */
	public Integer getExperience(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, EXPERIENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.experience</code> attribute.
	 * @return the experience
	 */
	public Integer getExperience()
	{
		return getExperience( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.experience</code> attribute. 
	 * @return the experience
	 */
	public int getExperienceAsPrimitive(final SessionContext ctx)
	{
		Integer value = getExperience( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.experience</code> attribute. 
	 * @return the experience
	 */
	public int getExperienceAsPrimitive()
	{
		return getExperienceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.experience</code> attribute. 
	 * @param value the experience
	 */
	public void setExperience(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, EXPERIENCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.experience</code> attribute. 
	 * @param value the experience
	 */
	public void setExperience(final Integer value)
	{
		setExperience( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.experience</code> attribute. 
	 * @param value the experience
	 */
	public void setExperience(final SessionContext ctx, final int value)
	{
		setExperience( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.experience</code> attribute. 
	 * @param value the experience
	 */
	public void setExperience(final int value)
	{
		setExperience( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Dealer");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(DEALER2DRIVER_MARKMODIFIED);
		}
		ComposedType relationSecondEnd1 = TypeManager.getInstance().getComposedType("Vehicle");
		if(relationSecondEnd1.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(DRIVER2VEHICLE_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDriver.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDriver.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.vehicles</code> attribute.
	 * @return the vehicles - Vehicles
	 */
	public Set<Vehicle> getVehicles(final SessionContext ctx)
	{
		final List<Vehicle> items = getLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.DRIVER2VEHICLE,
			"Vehicle",
			null,
			false,
			false
		);
		return new LinkedHashSet<Vehicle>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.vehicles</code> attribute.
	 * @return the vehicles - Vehicles
	 */
	public Set<Vehicle> getVehicles()
	{
		return getVehicles( getSession().getSessionContext() );
	}
	
	public long getVehiclesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TrainingCoreConstants.Relations.DRIVER2VEHICLE,
			"Vehicle",
			null
		);
	}
	
	public long getVehiclesCount()
	{
		return getVehiclesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.vehicles</code> attribute. 
	 * @param value the vehicles - Vehicles
	 */
	public void setVehicles(final SessionContext ctx, final Set<Vehicle> value)
	{
		setLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.DRIVER2VEHICLE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(DRIVER2VEHICLE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.vehicles</code> attribute. 
	 * @param value the vehicles - Vehicles
	 */
	public void setVehicles(final Set<Vehicle> value)
	{
		setVehicles( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to vehicles. 
	 * @param value the item to add to vehicles - Vehicles
	 */
	public void addToVehicles(final SessionContext ctx, final Vehicle value)
	{
		addLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.DRIVER2VEHICLE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DRIVER2VEHICLE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to vehicles. 
	 * @param value the item to add to vehicles - Vehicles
	 */
	public void addToVehicles(final Vehicle value)
	{
		addToVehicles( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from vehicles. 
	 * @param value the item to remove from vehicles - Vehicles
	 */
	public void removeFromVehicles(final SessionContext ctx, final Vehicle value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.DRIVER2VEHICLE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DRIVER2VEHICLE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from vehicles. 
	 * @param value the item to remove from vehicles - Vehicles
	 */
	public void removeFromVehicles(final Vehicle value)
	{
		removeFromVehicles( getSession().getSessionContext(), value );
	}
	
}
