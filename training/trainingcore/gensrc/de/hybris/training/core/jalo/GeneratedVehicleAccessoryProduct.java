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
import de.hybris.platform.jalo.product.Product;
import de.hybris.training.core.constants.TrainingCoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.product.Product VehicleAccessoryProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedVehicleAccessoryProduct extends Product
{
	/** Qualifier of the <code>VehicleAccessoryProduct.accessoryName</code> attribute **/
	public static final String ACCESSORYNAME = "accessoryName";
	/** Qualifier of the <code>VehicleAccessoryProduct.accessoryBrandName</code> attribute **/
	public static final String ACCESSORYBRANDNAME = "accessoryBrandName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ACCESSORYNAME, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>VehicleAccessoryProduct.accessoryName</code> attribute.
	 * @return the accessoryName - Name of the Vehicle Accessory
	 */
	public String getAccessoryName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedVehicleAccessoryProduct.getAccessoryName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, ACCESSORYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleAccessoryProduct.accessoryName</code> attribute.
	 * @return the accessoryName - Name of the Vehicle Accessory
	 */
	public String getAccessoryName()
	{
		return getAccessoryName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleAccessoryProduct.accessoryName</code> attribute. 
	 * @return the localized accessoryName - Name of the Vehicle Accessory
	 */
	public Map<Language,String> getAllAccessoryName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,ACCESSORYNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VehicleAccessoryProduct.accessoryName</code> attribute. 
	 * @return the localized accessoryName - Name of the Vehicle Accessory
	 */
	public Map<Language,String> getAllAccessoryName()
	{
		return getAllAccessoryName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleAccessoryProduct.accessoryName</code> attribute. 
	 * @param value the accessoryName - Name of the Vehicle Accessory
	 */
	public void setAccessoryName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedVehicleAccessoryProduct.setAccessoryName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, ACCESSORYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleAccessoryProduct.accessoryName</code> attribute. 
	 * @param value the accessoryName - Name of the Vehicle Accessory
	 */
	public void setAccessoryName(final String value)
	{
		setAccessoryName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleAccessoryProduct.accessoryName</code> attribute. 
	 * @param value the accessoryName - Name of the Vehicle Accessory
	 */
	public void setAllAccessoryName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,ACCESSORYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VehicleAccessoryProduct.accessoryName</code> attribute. 
	 * @param value the accessoryName - Name of the Vehicle Accessory
	 */
	public void setAllAccessoryName(final Map<Language,String> value)
	{
		setAllAccessoryName( getSession().getSessionContext(), value );
	}
	
}
