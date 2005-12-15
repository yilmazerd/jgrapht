/* ==========================================
 * JGraphT : a free Java graph-theory library
 * ==========================================
 *
 * Project Info:  http://jgrapht.sourceforge.net/
 * Project Lead:  Barak Naveh (http://sourceforge.net/users/barak_naveh)
 *
 * (C) Copyright 2003-2005, by Barak Naveh and Contributors.
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation,
 * Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 */
/* ------------------
 * StringNameProvider.java
 * ------------------
 * (C) Copyright 2005, by Charles Fry and Contributors.
 *
 * Original Author:  Charles Fry
 *
 * $Id$
 *
 * Changes
 * -------
 * 13-Dec-2005 : Initial Version (CF);
 *
 */
package org._3pq.jgrapht.ext;

import java.io.*;

import java.util.*;

import org._3pq.jgrapht.*;

/**
 * Generates vertex names by invoking {@link toString()} on them. This assumes
 * that the vertex's {@link toString()} method returns a unique String
 * representation for each vertex.
 *
 * @author Charles Fry
 */
public class StringNameProvider implements VertexNameProvider
{
    //~ Static fields/initializers --------------------------------------------

    private static final StringNameProvider SINGLETON = new StringNameProvider();

    public static StringNameProvider getInstance()
    {
        return SINGLETON;
    }

    //~ Constructors ----------------------------------------------------------

    protected StringNameProvider()
    {
        // obtain singleton instance through factory method
    }

    //~ Methods ---------------------------------------------------------------

    /**
     * Returns the String representation of the unique integer representing
     * a vertex.
     *
     * @param vertex the vertex to be named
     * @return the name of
     * @see GraphListener#edgeAdded(GraphEdgeChangeEvent)
     */
    public String getVertexName(Object vertex)
    {
        return vertex.toString();
    }

}