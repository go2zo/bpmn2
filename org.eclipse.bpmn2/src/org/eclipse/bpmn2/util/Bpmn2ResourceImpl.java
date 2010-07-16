/**
 * <copyright>
 * 
 * Copyright (c) 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Reiner Hille-Doering (SAP AG) - initial API and implementation and/or initial documentation
 * 
 * </copyright>
 */
package org.eclipse.bpmn2.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.eclipse.bpmn2.util.Bpmn2ResourceFactoryImpl
 * @generated
 */
public class Bpmn2ResourceImpl extends XMLResourceImpl {
    /**
     * Creates an instance of the resource.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param uri the URI of the new resource.
     * @generated
     */
    public Bpmn2ResourceImpl(URI uri) {
        super(uri);
    }

    /**
     * @generated NOT
     */
    @Override
    protected boolean useUUIDs() {
        // We better have a UUID generated instead of having XMLResourceImpl writing URIs, that
        // are not schema compliant
        return true;
    }

    /**
     * @generated NOT
     */
    @Override
    protected boolean assignIDsWhileLoading() {
        // For some reason this must be false. 
        // Else both, DocumentRoot and Definitions would create an ID (which is useless)
        // which is then both written into the root element.
        return false;
    }

} //Bpmn2ResourceImpl