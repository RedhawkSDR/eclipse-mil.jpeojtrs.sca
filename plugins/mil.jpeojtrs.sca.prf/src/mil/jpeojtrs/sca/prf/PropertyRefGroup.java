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
// BEGIN GENERATED CODE
package mil.jpeojtrs.sca.prf;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Ref Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.prf.PropertyRefGroup#getProperties <em>Properties</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.PropertyRefGroup#getSimpleRef <em>Simple Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.PropertyRefGroup#getSimpleSequenceRef <em>Simple Sequence Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.PropertyRefGroup#getStructRef <em>Struct Ref</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.prf.PropertyRefGroup#getStructSequenceRef <em>Struct Sequence Ref</em>}</li>
 * </ul>
 *
 * @see mil.jpeojtrs.sca.prf.PrfPackage#getPropertyRefGroup()
 * @model abstract="true"
 *        extendedMetaData="kind='elementOnly' name='propertyrefgroup' qualified='false'"
 * @generated
 */
public interface PropertyRefGroup extends PropertyRefContainer {

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' attribute list.
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getPropertyRefGroup_Properties()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="true"
	 *        extendedMetaData="kind='group' name='properties:0'"
	 * @generated
	 */
	FeatureMap getProperties();

	/**
	 * Returns the value of the '<em><b>Simple Ref</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.prf.SimpleRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Ref</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getPropertyRefGroup_SimpleRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simpleref' group='#properties:0'"
	 * @generated
	 */
	EList<SimpleRef> getSimpleRef();

	/**
	 * Returns the value of the '<em><b>Simple Sequence Ref</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.prf.SimpleSequenceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Sequence Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Sequence Ref</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getPropertyRefGroup_SimpleSequenceRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='simplesequenceref' group='#properties:0'"
	 * @generated
	 */
	EList<SimpleSequenceRef> getSimpleSequenceRef();

	/**
	 * Returns the value of the '<em><b>Struct Ref</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.prf.StructRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct Ref</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getPropertyRefGroup_StructRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='structref' group='#properties:0'"
	 * @generated
	 */
	EList<StructRef> getStructRef();

	/**
	 * Returns the value of the '<em><b>Struct Sequence Ref</b></em>' containment reference list.
	 * The list contents are of type {@link mil.jpeojtrs.sca.prf.StructSequenceRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct Sequence Ref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct Sequence Ref</em>' containment reference list.
	 * @see mil.jpeojtrs.sca.prf.PrfPackage#getPropertyRefGroup_StructSequenceRef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='structsequenceref' group='#properties:0'"
	 * @generated
	 */
	EList<StructSequenceRef> getStructSequenceRef();

} // PropertyRefGroup
