/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 08-Oct-2021, 4:14:44 PM                     ---
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
import de.hybris.training.core.jalo.VehicleAccessoryProduct;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem SupportedVehicle}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedSupportedVehicle extends GenericItem
{
	/** Qualifier of the <code>SupportedVehicle.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>SupportedVehicle.vehicleName</code> attribute **/
	public static final String VEHICLENAME = "vehicleName";
	/** Qualifier of the <code>SupportedVehicle.variant</code> attribute **/
	public static final String VARIANT = "variant";
	/** Qualifier of the <code>SupportedVehicle.accessory</code> attribute **/
	public static final String ACCESSORY = "accessory";
	/** Relation ordering override parameter constants for Vehicle2Accessories from ((trainingcore))*/
	protected static String VEHICLE2ACCESSORIES_SRC_ORDERED = "relation.Vehicle2Accessories.source.ordered";
	protected static String VEHICLE2ACCESSORIES_TGT_ORDERED = "relation.Vehicle2Accessories.target.ordered";
	/** Relation disable markmodifed parameter constants for Vehicle2Accessories from ((trainingcore))*/
	protected static String VEHICLE2ACCESSORIES_MARKMODIFIED = "relation.Vehicle2Accessories.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(VEHICLENAME, AttributeMode.INITIAL);
		tmp.put(VARIANT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupportedVehicle.accessory</code> attribute.
	 * @return the accessory - Vehicles
	 */
	public Set<VehicleAccessoryProduct> getAccessory(final SessionContext ctx)
	{
		final List<VehicleAccessoryProduct> items = getLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.VEHICLE2ACCESSORIES,
			"VehicleAccessoryProduct",
			null,
			false,
			false
		);
		return new LinkedHashSet<VehicleAccessoryProduct>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupportedVehicle.accessory</code> attribute.
	 * @return the accessory - Vehicles
	 */
	public Set<VehicleAccessoryProduct> getAccessory()
	{
		return getAccessory( getSession().getSessionContext() );
	}
	
	public long getAccessoryCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TrainingCoreConstants.Relations.VEHICLE2ACCESSORIES,
			"VehicleAccessoryProduct",
			null
		);
	}
	
	public long getAccessoryCount()
	{
		return getAccessoryCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupportedVehicle.accessory</code> attribute. 
	 * @param value the accessory - Vehicles
	 */
	public void setAccessory(final SessionContext ctx, final Set<VehicleAccessoryProduct> value)
	{
		setLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.VEHICLE2ACCESSORIES,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLE2ACCESSORIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupportedVehicle.accessory</code> attribute. 
	 * @param value the accessory - Vehicles
	 */
	public void setAccessory(final Set<VehicleAccessoryProduct> value)
	{
		setAccessory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to accessory. 
	 * @param value the item to add to accessory - Vehicles
	 */
	public void addToAccessory(final SessionContext ctx, final VehicleAccessoryProduct value)
	{
		addLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.VEHICLE2ACCESSORIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLE2ACCESSORIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to accessory. 
	 * @param value the item to add to accessory - Vehicles
	 */
	public void addToAccessory(final VehicleAccessoryProduct value)
	{
		addToAccessory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from accessory. 
	 * @param value the item to remove from accessory - Vehicles
	 */
	public void removeFromAccessory(final SessionContext ctx, final VehicleAccessoryProduct value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.VEHICLE2ACCESSORIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLE2ACCESSORIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from accessory. 
	 * @param value the item to remove from accessory - Vehicles
	 */
	public void removeFromAccessory(final VehicleAccessoryProduct value)
	{
		removeFromAccessory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupportedVehicle.code</code> attribute.
	 * @return the code - Unique Identifier code of the vehicle.
	 */
	public Integer getCode(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupportedVehicle.code</code> attribute.
	 * @return the code - Unique Identifier code of the vehicle.
	 */
	public Integer getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupportedVehicle.code</code> attribute. 
	 * @return the code - Unique Identifier code of the vehicle.
	 */
	public int getCodeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCode( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupportedVehicle.code</code> attribute. 
	 * @return the code - Unique Identifier code of the vehicle.
	 */
	public int getCodeAsPrimitive()
	{
		return getCodeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupportedVehicle.code</code> attribute. 
	 * @param value the code - Unique Identifier code of the vehicle.
	 */
	public void setCode(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupportedVehicle.code</code> attribute. 
	 * @param value the code - Unique Identifier code of the vehicle.
	 */
	public void setCode(final Integer value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupportedVehicle.code</code> attribute. 
	 * @param value the code - Unique Identifier code of the vehicle.
	 */
	public void setCode(final SessionContext ctx, final int value)
	{
		setCode( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupportedVehicle.code</code> attribute. 
	 * @param value the code - Unique Identifier code of the vehicle.
	 */
	public void setCode(final int value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("VehicleAccessoryProduct");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(VEHICLE2ACCESSORIES_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupportedVehicle.variant</code> attribute.
	 * @return the variant - Name of the Vehicle.
	 */
	public String getVariant(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSupportedVehicle.getVariant requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, VARIANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupportedVehicle.variant</code> attribute.
	 * @return the variant - Name of the Vehicle.
	 */
	public String getVariant()
	{
		return getVariant( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupportedVehicle.variant</code> attribute. 
	 * @return the localized variant - Name of the Vehicle.
	 */
	public Map<Language,String> getAllVariant(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,VARIANT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupportedVehicle.variant</code> attribute. 
	 * @return the localized variant - Name of the Vehicle.
	 */
	public Map<Language,String> getAllVariant()
	{
		return getAllVariant( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupportedVehicle.variant</code> attribute. 
	 * @param value the variant - Name of the Vehicle.
	 */
	public void setVariant(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSupportedVehicle.setVariant requires a session language", 0 );
		}
		setLocalizedProperty(ctx, VARIANT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupportedVehicle.variant</code> attribute. 
	 * @param value the variant - Name of the Vehicle.
	 */
	public void setVariant(final String value)
	{
		setVariant( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupportedVehicle.variant</code> attribute. 
	 * @param value the variant - Name of the Vehicle.
	 */
	public void setAllVariant(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,VARIANT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupportedVehicle.variant</code> attribute. 
	 * @param value the variant - Name of the Vehicle.
	 */
	public void setAllVariant(final Map<Language,String> value)
	{
		setAllVariant( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupportedVehicle.vehicleName</code> attribute.
	 * @return the vehicleName - Name of the Vehicle.
	 */
	public String getVehicleName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSupportedVehicle.getVehicleName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, VEHICLENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupportedVehicle.vehicleName</code> attribute.
	 * @return the vehicleName - Name of the Vehicle.
	 */
	public String getVehicleName()
	{
		return getVehicleName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupportedVehicle.vehicleName</code> attribute. 
	 * @return the localized vehicleName - Name of the Vehicle.
	 */
	public Map<Language,String> getAllVehicleName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,VEHICLENAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupportedVehicle.vehicleName</code> attribute. 
	 * @return the localized vehicleName - Name of the Vehicle.
	 */
	public Map<Language,String> getAllVehicleName()
	{
		return getAllVehicleName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupportedVehicle.vehicleName</code> attribute. 
	 * @param value the vehicleName - Name of the Vehicle.
	 */
	public void setVehicleName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSupportedVehicle.setVehicleName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, VEHICLENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupportedVehicle.vehicleName</code> attribute. 
	 * @param value the vehicleName - Name of the Vehicle.
	 */
	public void setVehicleName(final String value)
	{
		setVehicleName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupportedVehicle.vehicleName</code> attribute. 
	 * @param value the vehicleName - Name of the Vehicle.
	 */
	public void setAllVehicleName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,VEHICLENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupportedVehicle.vehicleName</code> attribute. 
	 * @param value the vehicleName - Name of the Vehicle.
	 */
	public void setAllVehicleName(final Map<Language,String> value)
	{
		setAllVehicleName( getSession().getSessionContext(), value );
	}
	
}
