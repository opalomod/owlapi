package org.semanticweb.owl.model;
/*
 * Copyright (C) 2006, University of Manchester
 *
 * Modifications to the initial code base are copyright of their
 * respective authors, or their employers as appropriate.  Authorship
 * of the modifications may be determined from the ChangeLog placed at
 * the end of this file.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.

 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */


/**
 * Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Bio-Health Informatics Group
 * Date: 24-Oct-2006
 */
public interface OWLUntypedLiteral extends OWLLiteral {

    /**
     * Gets the language tag (if present)
     * @return A <code>String</code> which represents the langauge tag,
     * or <code>null</code> if there is no language tag
     */
    public String getLang();


    /**
     * Language tags on untyped constants are optional.  This
     * method determines if the language tag is present.
     * @return <code>true</code> if there is a language tag, or
     * <code>false</code> if there is not a langauge tag.
     */
    boolean hasLang();


    /**
     * Determines if this constant has a specific language tag.
     * @param lang The specific lang to test for.
     * @return <code>true</code> if this constant has the specified
     * langauge tag, or <code>false</code> if this constant does not
     * have a language tag or if this constant has a language tag that
     * is not equal to the specified language tag.
     */
    boolean hasLang(String lang);
}