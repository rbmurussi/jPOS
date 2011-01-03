/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2011 Alejandro P. Revilla
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jpos.core;

import org.w3c.dom.Node;

/**
 * Object is DOM-Node Configurable
 * @author <a href="mailto:tzymail@163.com">Zhiyu Tang</a>
 * @version $Revision$ $Date$
 * @since jPOS 1.4.3
 */
public interface NodeConfigurable {
   /**
    * @param cfg Configuration object
    * @throws ConfigurationException
    */
    public void setConfiguration (Node node)
        throws ConfigurationException;
}