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
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import de.hybris.platform.variants.jalo.VariantProduct;
import de.hybris.training.core.constants.TrainingCoreConstants;
import de.hybris.training.core.jalo.SupportedVehicle;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.variants.jalo.VariantProduct VehicleAccessoryStyleVariantProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedVehicleAccessoryStyleVariantProduct extends VariantProduct
{
	/** Qualifier of the <code>VehicleAccessoryStyleVariantProduct.accessoryColor</code> attribute **/
	public static final String ACCESSORYCOLOR = "accessoryColor";
	/** Qualifier of the <code>VehicleAccessoryStyleVariantProduct.vehicles</code> attribute **/
	public static final String VEHICLES = "vehicles";
	/** Relation ordering override parameter constants for Vehicle2Accessories from ((trainingcore))*/
	protected static String VEHICLE2ACCESSORIES_SRC_ORDERED = "relation.Vehicle2Accessories.source.ordered";
	protected static String VEHICLE2ACCESSORIES_TGT_ORDERED = "relation.Vehicle2Accessories.target.ordered";
	/** Relation disable markmodifed parameter constants for Vehicle2Accessories from ((trainingcore))*/
	protected static String VEHICLE2ACCESSORIES_MARKMODIFIED = "relation.Vehicle2Accessories.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(VariantProduct.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ACCESSORYCOLOR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleAccessoryStyleVariantProduct.accessoryColor</code> attribute.
	 * @return the accessoryColor - Color of the product.
	 */
	public String getAccessoryColor(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedVehicleAccessoryStyleVariantProduct.getAccessoryColor requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, ACCESSORYCOLOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleAccessoryStyleVariantProduct.accessoryColor</code> attribute.
	 * @return the accessoryColor - Color of the product.
	 */
	public String getAccessoryColor()
	{
		return getAccessoryColor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleAccessoryStyleVariantProduct.accessoryColor</code> attribute. 
	 * @return the localized accessoryColor - Color of the product.
	 */
	public Map<Language,String> getAllAccessoryColor(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,ACCESSORYCOLOR,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleAccessoryStyleVariantProduct.accessoryColor</code> attribute. 
	 * @return the localized accessoryColor - Color of the product.
	 */
	public Map<Language,String> getAllAccessoryColor()
	{
		return getAllAccessoryColor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleAccessoryStyleVariantProduct.accessoryColor</code> attribute. 
	 * @param value the accessoryColor - Color of the product.
	 */
	public void setAccessoryColor(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedVehicleAccessoryStyleVariantProduct.setAccessoryColor requires a session language", 0 );
		}
		setLocalizedProperty(ctx, ACCESSORYCOLOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleAccessoryStyleVariantProduct.accessoryColor</code> attribute. 
	 * @param value the accessoryColor - Color of the product.
	 */
	public void setAccessoryColor(final String value)
	{
		setAccessoryColor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleAccessoryStyleVariantProduct.accessoryColor</code> attribute. 
	 * @param value the accessoryColor - Color of the product.
	 */
	public void setAllAccessoryColor(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,ACCESSORYCOLOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleAccessoryStyleVariantProduct.accessoryColor</code> attribute. 
	 * @param value the accessoryColor - Color of the product.
	 */
	public void setAllAccessoryColor(final Map<Language,String> value)
	{
		setAllAccessoryColor( getSession().getSessionContext(), value );
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
	 * <i>Generated method</i> - Getter of the <code>VehicleAccessoryStyleVariantProduct.vehicles</code> attribute.
	 * @return the vehicles - Accessory Supported Vehicle
	 */
	public Collection<SupportedVehicle> getVehicles(final SessionContext ctx)
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
	 * <i>Generated method</i> - Getter of the <code>VehicleAccessoryStyleVariantProduct.vehicles</code> attribute.
	 * @return the vehicles - Accessory Supported Vehicle
	 */
	public Collection<SupportedVehicle> getVehicles()
	{
		return getVehicles( getSession().getSessionContext() );
	}
	
	public long getVehiclesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingCoreConstants.Relations.VEHICLE2ACCESSORIES,
			"SupportedVehicle",
			null
		);
	}
	
	public long getVehiclesCount()
	{
		return getVehiclesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleAccessoryStyleVariantProduct.vehicles</code> attribute. 
	 * @param value the vehicles - Accessory Supported Vehicle
	 */
	public void setVehicles(final SessionContext ctx, final Collection<SupportedVehicle> value)
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
	 * <i>Generated method</i> - Setter of the <code>VehicleAccessoryStyleVariantProduct.vehicles</code> attribute. 
	 * @param value the vehicles - Accessory Supported Vehicle
	 */
	public void setVehicles(final Collection<SupportedVehicle> value)
	{
		setVehicles( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to vehicles. 
	 * @param value the item to add to vehicles - Accessory Supported Vehicle
	 */
	public void addToVehicles(final SessionContext ctx, final SupportedVehicle value)
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
	 * <i>Generated method</i> - Adds <code>value</code> to vehicles. 
	 * @param value the item to add to vehicles - Accessory Supported Vehicle
	 */
	public void addToVehicles(final SupportedVehicle value)
	{
		addToVehicles( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from vehicles. 
	 * @param value the item to remove from vehicles - Accessory Supported Vehicle
	 */
	public void removeFromVehicles(final SessionContext ctx, final SupportedVehicle value)
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
	 * <i>Generated method</i> - Removes <code>value</code> from vehicles. 
	 * @param value the item to remove from vehicles - Accessory Supported Vehicle
	 */
	public void removeFromVehicles(final SupportedVehicle value)
	{
		removeFromVehicles( getSession().getSessionContext(), value );
	}
	
}
