/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 08-Oct-2021, 10:07:38 AM                    ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import de.hybris.training.core.constants.TrainingCoreConstants;
import de.hybris.training.core.jalo.Dealer;
import de.hybris.training.core.jalo.Driver;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.product.Product Vehicle}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedVehicle extends Product
{
	/** Qualifier of the <code>Vehicle.registrationNo</code> attribute **/
	public static final String REGISTRATIONNO = "registrationNo";
	/** Qualifier of the <code>Vehicle.dealers</code> attribute **/
	public static final String DEALERS = "dealers";
	/** Relation ordering override parameter constants for Dealer2Vehicle from ((trainingcore))*/
	protected static String DEALER2VEHICLE_SRC_ORDERED = "relation.Dealer2Vehicle.source.ordered";
	protected static String DEALER2VEHICLE_TGT_ORDERED = "relation.Dealer2Vehicle.target.ordered";
	/** Relation disable markmodifed parameter constants for Dealer2Vehicle from ((trainingcore))*/
	protected static String DEALER2VEHICLE_MARKMODIFIED = "relation.Dealer2Vehicle.markmodified";
	/** Qualifier of the <code>Vehicle.drivers</code> attribute **/
	public static final String DRIVERS = "drivers";
	/** Relation ordering override parameter constants for Driver2Vehicle from ((trainingcore))*/
	protected static String DRIVER2VEHICLE_SRC_ORDERED = "relation.Driver2Vehicle.source.ordered";
	protected static String DRIVER2VEHICLE_TGT_ORDERED = "relation.Driver2Vehicle.target.ordered";
	/** Relation disable markmodifed parameter constants for Driver2Vehicle from ((trainingcore))*/
	protected static String DRIVER2VEHICLE_MARKMODIFIED = "relation.Driver2Vehicle.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(REGISTRATIONNO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.dealers</code> attribute.
	 * @return the dealers - Dealers
	 */
	public Collection<Dealer> getDealers(final SessionContext ctx)
	{
		final List<Dealer> items = getLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.DEALER2VEHICLE,
			"Dealer",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.dealers</code> attribute.
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
			TrainingCoreConstants.Relations.DEALER2VEHICLE,
			"Dealer",
			null
		);
	}
	
	public long getDealersCount()
	{
		return getDealersCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.dealers</code> attribute. 
	 * @param value the dealers - Dealers
	 */
	public void setDealers(final SessionContext ctx, final Collection<Dealer> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.DEALER2VEHICLE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(DEALER2VEHICLE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.dealers</code> attribute. 
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
			TrainingCoreConstants.Relations.DEALER2VEHICLE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DEALER2VEHICLE_MARKMODIFIED)
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
			TrainingCoreConstants.Relations.DEALER2VEHICLE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DEALER2VEHICLE_MARKMODIFIED)
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
	 * <i>Generated method</i> - Getter of the <code>Vehicle.drivers</code> attribute.
	 * @return the drivers - Drivers
	 */
	public Collection<Driver> getDrivers(final SessionContext ctx)
	{
		final List<Driver> items = getLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.DRIVER2VEHICLE,
			"Driver",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.drivers</code> attribute.
	 * @return the drivers - Drivers
	 */
	public Collection<Driver> getDrivers()
	{
		return getDrivers( getSession().getSessionContext() );
	}
	
	public long getDriversCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingCoreConstants.Relations.DRIVER2VEHICLE,
			"Driver",
			null
		);
	}
	
	public long getDriversCount()
	{
		return getDriversCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.drivers</code> attribute. 
	 * @param value the drivers - Drivers
	 */
	public void setDrivers(final SessionContext ctx, final Collection<Driver> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.DRIVER2VEHICLE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(DRIVER2VEHICLE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.drivers</code> attribute. 
	 * @param value the drivers - Drivers
	 */
	public void setDrivers(final Collection<Driver> value)
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
			false,
			TrainingCoreConstants.Relations.DRIVER2VEHICLE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DRIVER2VEHICLE_MARKMODIFIED)
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
			false,
			TrainingCoreConstants.Relations.DRIVER2VEHICLE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(DRIVER2VEHICLE_MARKMODIFIED)
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
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Dealer");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(DEALER2VEHICLE_MARKMODIFIED);
		}
		ComposedType relationSecondEnd1 = TypeManager.getInstance().getComposedType("Driver");
		if(relationSecondEnd1.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(DRIVER2VEHICLE_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.registrationNo</code> attribute.
	 * @return the registrationNo
	 */
	public Integer getRegistrationNo(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, REGISTRATIONNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.registrationNo</code> attribute.
	 * @return the registrationNo
	 */
	public Integer getRegistrationNo()
	{
		return getRegistrationNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.registrationNo</code> attribute. 
	 * @return the registrationNo
	 */
	public int getRegistrationNoAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRegistrationNo( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.registrationNo</code> attribute. 
	 * @return the registrationNo
	 */
	public int getRegistrationNoAsPrimitive()
	{
		return getRegistrationNoAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.registrationNo</code> attribute. 
	 * @param value the registrationNo
	 */
	public void setRegistrationNo(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, REGISTRATIONNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.registrationNo</code> attribute. 
	 * @param value the registrationNo
	 */
	public void setRegistrationNo(final Integer value)
	{
		setRegistrationNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.registrationNo</code> attribute. 
	 * @param value the registrationNo
	 */
	public void setRegistrationNo(final SessionContext ctx, final int value)
	{
		setRegistrationNo( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.registrationNo</code> attribute. 
	 * @param value the registrationNo
	 */
	public void setRegistrationNo(final int value)
	{
		setRegistrationNo( getSession().getSessionContext(), value );
	}
	
}
