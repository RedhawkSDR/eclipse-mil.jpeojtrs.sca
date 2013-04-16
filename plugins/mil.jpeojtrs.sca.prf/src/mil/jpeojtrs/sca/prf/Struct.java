/*******************************************************************************
 * This file is protected by Copyright. 
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under 
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package mil.jpeojtrs.sca.prf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.Struct#getSimple <em>Simple</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.Struct#getConfigurationKind <em>Configuration Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see mil.jpeojtrs.sca.prf.PrfPackage#getStruct()
 * @model extendedMetaData="name='struct' kind='elementOnly'"
 * @generated
 */
public interface Struct extends AbstractProperty, PropertyContainer {

	/**
	 * Returns the value of the '<em><b>Simple</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.prf.Simple}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getStruct_Simple()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='simple'"
	 * @generated
	 */
	EList<Simple> getSimple();

	/**
	 * Returns the value of the '<em><b>Configuration Kind</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.prf.ConfigurationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Kind</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Kind</em>' containment reference list.
	 * @see #isSetConfigurationKind()
	 * @see #unsetConfigurationKind()
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getStruct_ConfigurationKind()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='configurationkind'"
	 * @generated
	 */
	EList<ConfigurationKind> getConfigurationKind();

	/**
	 * Unsets the value of the '{@link mil.jpeojtrs.sca.prf.Struct#getConfigurationKind <em>Configuration Kind</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConfigurationKind()
	 * @see #getConfigurationKind()
	 * @generated
	 */
	void unsetConfigurationKind();

	/**
	 * Returns whether the value of the '{@link mil.jpeojtrs.sca.prf.Struct#getConfigurationKind <em>Configuration Kind</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Configuration Kind</em>' containment reference list is set.
	 * @see #unsetConfigurationKind()
	 * @see #getConfigurationKind()
	 * @generated
	 */
	boolean isSetConfigurationKind();

} // Struct