/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 13-Oct-2021, 1:05:16 PM                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.training.core.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import de.hybris.training.core.constants.TrainingCoreConstants;
import de.hybris.training.core.jalo.SupportedVehicle;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.product.Product VehicleAccessoryProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedVehicleAccessoryProduct extends Product
{
	/** Qualifier of the <code>VehicleAccessoryProduct.accessoryBrandName</code> attribute **/
	public static final String ACCESSORYBRANDNAME = "accessoryBrandName";
	/** Qualifier of the <code>VehicleAccessoryProduct.supportedVehicles</code> attribute **/
	public static final String SUPPORTEDVEHICLES = "supportedVehicles";
	/** Relation ordering override parameter constants for Vehicle2Accessories from ((trainingcore))*/
	protected static String VEHICLE2ACCESSORIES_SRC_ORDERED = "relation.Vehicle2Accessories.source.ordered";
	protected static String VEHICLE2ACCESSORIES_TGT_ORDERED = "relation.Vehicle2Accessories.target.ordered";
	/** Relation disable markmodifed parameter constants for Vehicle2Accessories from ((trainingcore))*/
	protected static String VEHICLE2ACCESSORIES_MARKMODIFIED = "relation.Vehicle2Accessories.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ACCESSORYBRANDNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleAccessoryProduct.accessoryBrandName</code> attribute.
	 * @return the accessoryBrandName - Brand name of the Vehicle Accessory
	 */
	public String getAccessoryBrandName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedVehicleAccessoryProduct.getAccessoryBrandName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, ACCESSORYBRANDNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleAccessoryProduct.accessoryBrandName</code> attribute.
	 * @return the accessoryBrandName - Brand name of the Vehicle Accessory
	 */
	public String getAccessoryBrandName()
	{
		return getAccessoryBrandName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleAccessoryProduct.accessoryBrandName</code> attribute. 
	 * @return the localized accessoryBrandName - Brand name of the Vehicle Accessory
	 */
	public Map<Language,String> getAllAccessoryBrandName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,ACCESSORYBRANDNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleAccessoryProduct.accessoryBrandName</code> attribute. 
	 * @return the localized accessoryBrandName - Brand name of the Vehicle Accessory
	 */
	public Map<Language,String> getAllAccessoryBrandName()
	{
		return getAllAccessoryBrandName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleAccessoryProduct.accessoryBrandName</code> attribute. 
	 * @param value the accessoryBrandName - Brand name of the Vehicle Accessory
	 */
	public void setAccessoryBrandName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedVehicleAccessoryProduct.setAccessoryBrandName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, ACCESSORYBRANDNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleAccessoryProduct.accessoryBrandName</code> attribute. 
	 * @param value the accessoryBrandName - Brand name of the Vehicle Accessory
	 */
	public void setAccessoryBrandName(final String value)
	{
		setAccessoryBrandName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleAccessoryProduct.accessoryBrandName</code> attribute. 
	 * @param value the accessoryBrandName - Brand name of the Vehicle Accessory
	 */
	public void setAllAccessoryBrandName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,ACCESSORYBRANDNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleAccessoryProduct.accessoryBrandName</code> attribute. 
	 * @param value the accessoryBrandName - Brand name of the Vehicle Accessory
	 */
	public void setAllAccessoryBrandName(final Map<Language,String> value)
	{
		setAllAccessoryBrandName( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("SupportedVehicle");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(VEHICLE2ACCESSORIES_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleAccessoryProduct.supportedVehicles</code> attribute.
	 * @return the supportedVehicles - Accessory Supported Vehicle
	 */
	public Collection<SupportedVehicle> getSupportedVehicles(final SessionContext ctx)
	{
		final List<SupportedVehicle> items = getLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.VEHICLE2ACCESSORIES,
			"SupportedVehicle",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleAccessoryProduct.supportedVehicles</code> attribute.
	 * @return the supportedVehicles - Accessory Supported Vehicle
	 */
	public Collection<SupportedVehicle> getSupportedVehicles()
	{
		return getSupportedVehicles( getSession().getSessionContext() );
	}
	
	public long getSupportedVehiclesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingCoreConstants.Relations.VEHICLE2ACCESSORIES,
			"SupportedVehicle",
			null
		);
	}
	
	public long getSupportedVehiclesCount()
	{
		return getSupportedVehiclesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleAccessoryProduct.supportedVehicles</code> attribute. 
	 * @param value the supportedVehicles - Accessory Supported Vehicle
	 */
	public void setSupportedVehicles(final SessionContext ctx, final Collection<SupportedVehicle> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.VEHICLE2ACCESSORIES,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLE2ACCESSORIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleAccessoryProduct.supportedVehicles</code> attribute. 
	 * @param value the supportedVehicles - Accessory Supported Vehicle
	 */
	public void setSupportedVehicles(final Collection<SupportedVehicle> value)
	{
		setSupportedVehicles( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supportedVehicles. 
	 * @param value the item to add to supportedVehicles - Accessory Supported Vehicle
	 */
	public void addToSupportedVehicles(final SessionContext ctx, final SupportedVehicle value)
	{
		addLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.VEHICLE2ACCESSORIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLE2ACCESSORIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supportedVehicles. 
	 * @param value the item to add to supportedVehicles - Accessory Supported Vehicle
	 */
	public void addToSupportedVehicles(final SupportedVehicle value)
	{
		addToSupportedVehicles( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supportedVehicles. 
	 * @param value the item to remove from supportedVehicles - Accessory Supported Vehicle
	 */
	public void removeFromSupportedVehicles(final SessionContext ctx, final SupportedVehicle value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.VEHICLE2ACCESSORIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(VEHICLE2ACCESSORIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supportedVehicles. 
	 * @param value the item to remove from supportedVehicles - Accessory Supported Vehicle
	 */
	public void removeFromSupportedVehicles(final SupportedVehicle value)
	{
		removeFromSupportedVehicles( getSession().getSessionContext(), value );
	}
	
}
