/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 11-Oct-2021, 12:23:12 PM                    ---
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
import de.hybris.platform.variants.jalo.VariantProduct;
import de.hybris.training.core.constants.TrainingCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.variants.jalo.VariantProduct VehicleAccessoryStyleVariantProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedVehicleAccessoryStyleVariantProduct extends VariantProduct
{
	/** Qualifier of the <code>VehicleAccessoryStyleVariantProduct.accessoryColor</code> attribute **/
	public static final String ACCESSORYCOLOR = "accessoryColor";
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
	
}
