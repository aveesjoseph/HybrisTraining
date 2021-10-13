/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 13-Oct-2021, 10:41:01 AM                    ---
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
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.util.Utilities;
import de.hybris.training.core.constants.TrainingCoreConstants;
import de.hybris.training.core.jalo.Driver;
import de.hybris.training.core.jalo.Vehicle;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Dealer}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDealer extends GenericItem
{
	/** Qualifier of the <code>Dealer.dealerId</code> attribute **/
	public static final String DEALERID = "dealerId";
	/** Qualifier of the <code>Dealer.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Dealer.address</code> attribute **/
	public static final String ADDRESS = "address";
	/** Qualifier of the <code>Dealer.vehicles</code> attribute **/
	public static final String VEHICLES = "vehicles";
	/** Relation ordering override parameter constants for Dealer2Vehicle from ((trainingcore))*/
	protected static String DEALER2VEHICLE_SRC_ORDERED = "relation.Dealer2Vehicle.source.ordered";
	protected static String DEALER2VEHICLE_TGT_ORDERED = "relation.Dealer2Vehicle.target.ordered";
	/** Relation disable markmodifed parameter constants for Dealer2Vehicle from ((trainingcore))*/
	protected static String DEALER2VEHICLE_MARKMODIFIED = "relation.Dealer2Vehicle.markmodified";
	/** Qualifier of the <code>Dealer.drivers</code> attribute **/
	public static final String DRIVERS = "drivers";
	/** Relation ordering override parameter constants for Dealer2Driver from ((trainingcore))*/
	protected static String DEALER2DRIVER_SRC_ORDERED = "relation.Dealer2Driver.source.ordered";
	protected static String DEALER2DRIVER_TGT_ORDERED = "relation.Dealer2Driver.target.ordered";
	/** Relation disable markmodifed parameter constants for Dealer2Driver from ((trainingcore))*/
	protected static String DEALER2DRIVER_MARKMODIFIED = "relation.Dealer2Driver.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DEALERID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final Address value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.dealerId</code> attribute.
	 * @return the dealerId
	 */
	public Integer getDealerId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DEALERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.dealerId</code> attribute.
	 * @return the dealerId
	 */
	public Integer getDealerId()
	{
		return getDealerId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.dealerId</code> attribute. 
	 * @return the dealerId
	 */
	public int getDealerIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDealerId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.dealerId</code> attribute. 
	 * @return the dealerId
	 */
	public int getDealerIdAsPrimitive()
	{
		return getDealerIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.dealerId</code> attribute. 
	 * @param value the dealerId
	 */
	public void setDealerId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DEALERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.dealerId</code> attribute. 
	 * @param value the dealerId
	 */
	public void setDealerId(final Integer value)
	{
		setDealerId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.dealerId</code> attribute. 
	 * @param value the dealerId
	 */
	public void setDealerId(final SessionContext ctx, final int value)
	{
		setDealerId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.dealerId</code> attribute. 
	 * @param value the dealerId
	 */
	public void setDealerId(final int value)
	{
		setDealerId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.drivers</code> attribute.
	 * @return the drivers - Drivers
	 */
	public Set<Driver> getDrivers(final SessionContext ctx)
	{
		final List<Driver> items = getLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.DEALER2DRIVER,
			"Driver",
			null,
			false,
			false
		);
		return new LinkedHashSet<Driver>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.drivers</code> attribute.
	 * @return the drivers - Drivers
	 */
	public Set<Driver> getDrivers()
	{
		return getDrivers( getSession().getSessionContext() );
	}
	
	public long getDriversCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TrainingCoreConstants.Relations.DEALER2DRIVER,
			"Driver",
			null
		);
	}
	
	public long getDriversCount()
	{
		return getDriversCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.drivers</code> attribute. 
	 * @param value the drivers - Drivers
	 */
	public void setDrivers(final SessionContext ctx, final Set<Driver> value)
	{
		setLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.DEALER2DRIVER,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(DEALER2DRIVER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.drivers</code> attribute. 
	 * @param value the drivers - Drivers
	 */
	public void setDrivers(final Set<Driver> value)
	{
		setDrivers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to drivers. 
	 * @param value the item to add to drivers - Drivers
	 */
	public void addToDrivers(final SessionContext ctx, final Driver value)
	{
		addLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.DEALER2DRIVER,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DEALER2DRIVER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to drivers. 
	 * @param value the item to add to drivers - Drivers
	 */
	public void addToDrivers(final Driver value)
	{
		addToDrivers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from drivers. 
	 * @param value the item to remove from drivers - Drivers
	 */
	public void removeFromDrivers(final SessionContext ctx, final Driver value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.DEALER2DRIVER,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DEALER2DRIVER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from drivers. 
	 * @param value the item to remove from drivers - Drivers
	 */
	public void removeFromDrivers(final Driver value)
	{
		removeFromDrivers( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Vehicle");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(DEALER2VEHICLE_MARKMODIFIED);
		}
		ComposedType relationSecondEnd1 = TypeManager.getInstance().getComposedType("Driver");
		if(relationSecondEnd1.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(DEALER2DRIVER_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDealer.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.name</code> attribute. 
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
			throw new JaloInvalidParameterException("GeneratedDealer.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.vehicles</code> attribute.
	 * @return the vehicles - Vehicles
	 */
	public Set<Vehicle> getVehicles(final SessionContext ctx)
	{
		final List<Vehicle> items = getLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.DEALER2VEHICLE,
			"Vehicle",
			null,
			false,
			false
		);
		return new LinkedHashSet<Vehicle>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Dealer.vehicles</code> attribute.
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
			TrainingCoreConstants.Relations.DEALER2VEHICLE,
			"Vehicle",
			null
		);
	}
	
	public long getVehiclesCount()
	{
		return getVehiclesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.vehicles</code> attribute. 
	 * @param value the vehicles - Vehicles
	 */
	public void setVehicles(final SessionContext ctx, final Set<Vehicle> value)
	{
		setLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.DEALER2VEHICLE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(DEALER2VEHICLE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Dealer.vehicles</code> attribute. 
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
			TrainingCoreConstants.Relations.DEALER2VEHICLE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DEALER2VEHICLE_MARKMODIFIED)
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
			TrainingCoreConstants.Relations.DEALER2VEHICLE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DEALER2VEHICLE_MARKMODIFIED)
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
