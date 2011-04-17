package org.geotools.filter.function;

/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 * 
 *    (C) 2005-2008, Open Source Geospatial Foundation (OSGeo)
 *    
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */

//this code is autogenerated - you shouldnt be modifying it!
import org.geotools.filter.FunctionExpressionImpl;

public class FilterFunction_in7 extends FunctionExpressionImpl {

    public FilterFunction_in7() {
        super("in7");
    }

    public int getArgCount() {
        return 8;
    }

    public Object evaluate(Object feature) {
        Object arg0;
        Object arg1;
        Object arg2;
        Object arg3;
        Object arg4;
        Object arg5;
        Object arg6;
        Object arg7;

        try { // attempt to get value and perform conversion
            arg0 = (Object) getExpression(0).evaluate(feature);
        } catch (Exception e) // probably a type error
        {
            throw new IllegalArgumentException(
                    "Filter Function problem for function in7 argument #0 - expected type Object");
        }

        try { // attempt to get value and perform conversion
            arg1 = (Object) getExpression(1).evaluate(feature);
        } catch (Exception e) // probably a type error
        {
            throw new IllegalArgumentException(
                    "Filter Function problem for function in7 argument #1 - expected type Object");
        }

        try { // attempt to get value and perform conversion
            arg2 = (Object) getExpression(2).evaluate(feature);
        } catch (Exception e) // probably a type error
        {
            throw new IllegalArgumentException(
                    "Filter Function problem for function in7 argument #2 - expected type Object");
        }

        try { // attempt to get value and perform conversion
            arg3 = (Object) getExpression(3).evaluate(feature);
        } catch (Exception e) // probably a type error
        {
            throw new IllegalArgumentException(
                    "Filter Function problem for function in7 argument #3 - expected type Object");
        }

        try { // attempt to get value and perform conversion
            arg4 = (Object) getExpression(4).evaluate(feature);
        } catch (Exception e) // probably a type error
        {
            throw new IllegalArgumentException(
                    "Filter Function problem for function in7 argument #4 - expected type Object");
        }

        try { // attempt to get value and perform conversion
            arg5 = (Object) getExpression(5).evaluate(feature);
        } catch (Exception e) // probably a type error
        {
            throw new IllegalArgumentException(
                    "Filter Function problem for function in7 argument #5 - expected type Object");
        }

        try { // attempt to get value and perform conversion
            arg6 = (Object) getExpression(6).evaluate(feature);
        } catch (Exception e) // probably a type error
        {
            throw new IllegalArgumentException(
                    "Filter Function problem for function in7 argument #6 - expected type Object");
        }

        try { // attempt to get value and perform conversion
            arg7 = (Object) getExpression(7).evaluate(feature);
        } catch (Exception e) // probably a type error
        {
            throw new IllegalArgumentException(
                    "Filter Function problem for function in7 argument #7 - expected type Object");
        }

        return new Boolean(StaticGeometry.in7(arg0, arg1, arg2, arg3, arg4,
                arg5, arg6, arg7));
    }
}
