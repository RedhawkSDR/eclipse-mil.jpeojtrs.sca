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
package mil.jpeojtrs.sca.sad.impl;

import mil.jpeojtrs.sca.sad.Port;
import mil.jpeojtrs.sca.sad.SadComponentInstantiationRef;
import mil.jpeojtrs.sca.sad.SadPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.PortImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.PortImpl#getUsesIdentifier <em>Uses Identifier</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.PortImpl#getProvidesIndentifier <em>Provides Indentifier</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.PortImpl#getSupportedIdentifier <em>Supported Identifier</em>}</li>
 *   <li>{@link mil.jpeojtrs.sca.sad.impl.PortImpl#getComponentInstantiationRef <em>Component Instantiation Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends EObjectImpl implements Port {

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getUsesIdentifier() <em>Uses Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String USES_IDENTIFIER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUsesIdentifier() <em>Uses Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String usesIdentifier = USES_IDENTIFIER_EDEFAULT;
	/**
	 * The default value of the '{@link #getProvidesIndentifier() <em>Provides Indentifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidesIndentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDES_INDENTIFIER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProvidesIndentifier() <em>Provides Indentifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidesIndentifier()
	 * @generated
	 * @ordered
	 */
	protected String providesIndentifier = PROVIDES_INDENTIFIER_EDEFAULT;
	/**
	 * The default value of the '{@link #getSupportedIdentifier() <em>Supported Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPORTED_IDENTIFIER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSupportedIdentifier() <em>Supported Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String supportedIdentifier = SUPPORTED_IDENTIFIER_EDEFAULT;
	/**
	 * The cached value of the '{@link #getComponentInstantiationRef() <em>Component Instantiation Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstantiationRef()
	 * @generated
	 * @ordered
	 */
	protected SadComponentInstantiationRef componentInstantiationRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SadPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.PORT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsesIdentifier() {
		return usesIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesIdentifier(String newUsesIdentifier) {
		String oldUsesIdentifier = usesIdentifier;
		usesIdentifier = newUsesIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.PORT__USES_IDENTIFIER, oldUsesIdentifier, usesIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvidesIndentifier() {
		return providesIndentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidesIndentifier(String newProvidesIndentifier) {
		String oldProvidesIndentifier = providesIndentifier;
		providesIndentifier = newProvidesIndentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.PORT__PROVIDES_INDENTIFIER, oldProvidesIndentifier, providesIndentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupportedIdentifier() {
		return supportedIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportedIdentifier(String newSupportedIdentifier) {
		String oldSupportedIdentifier = supportedIdentifier;
		supportedIdentifier = newSupportedIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.PORT__SUPPORTED_IDENTIFIER, oldSupportedIdentifier, supportedIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SadComponentInstantiationRef getComponentInstantiationRef() {
		return componentInstantiationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentInstantiationRef(SadComponentInstantiationRef newComponentInstantiationRef, NotificationChain msgs) {
		SadComponentInstantiationRef oldComponentInstantiationRef = componentInstantiationRef;
		componentInstantiationRef = newComponentInstantiationRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SadPackage.PORT__COMPONENT_INSTANTIATION_REF, oldComponentInstantiationRef, newComponentInstantiationRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstantiationRef(SadComponentInstantiationRef newComponentInstantiationRef) {
		if (newComponentInstantiationRef != componentInstantiationRef) {
			NotificationChain msgs = null;
			if (componentInstantiationRef != null)
				msgs = ((InternalEObject)componentInstantiationRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SadPackage.PORT__COMPONENT_INSTANTIATION_REF, null, msgs);
			if (newComponentInstantiationRef != null)
				msgs = ((InternalEObject)newComponentInstantiationRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SadPackage.PORT__COMPONENT_INSTANTIATION_REF, null, msgs);
			msgs = basicSetComponentInstantiationRef(newComponentInstantiationRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SadPackage.PORT__COMPONENT_INSTANTIATION_REF, newComponentInstantiationRef, newComponentInstantiationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SadPackage.PORT__COMPONENT_INSTANTIATION_REF:
				return basicSetComponentInstantiationRef(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SadPackage.PORT__DESCRIPTION:
				return getDescription();
			case SadPackage.PORT__USES_IDENTIFIER:
				return getUsesIdentifier();
			case SadPackage.PORT__PROVIDES_INDENTIFIER:
				return getProvidesIndentifier();
			case SadPackage.PORT__SUPPORTED_IDENTIFIER:
				return getSupportedIdentifier();
			case SadPackage.PORT__COMPONENT_INSTANTIATION_REF:
				return getComponentInstantiationRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SadPackage.PORT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SadPackage.PORT__USES_IDENTIFIER:
				setUsesIdentifier((String)newValue);
				return;
			case SadPackage.PORT__PROVIDES_INDENTIFIER:
				setProvidesIndentifier((String)newValue);
				return;
			case SadPackage.PORT__SUPPORTED_IDENTIFIER:
				setSupportedIdentifier((String)newValue);
				return;
			case SadPackage.PORT__COMPONENT_INSTANTIATION_REF:
				setComponentInstantiationRef((SadComponentInstantiationRef)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SadPackage.PORT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SadPackage.PORT__USES_IDENTIFIER:
				setUsesIdentifier(USES_IDENTIFIER_EDEFAULT);
				return;
			case SadPackage.PORT__PROVIDES_INDENTIFIER:
				setProvidesIndentifier(PROVIDES_INDENTIFIER_EDEFAULT);
				return;
			case SadPackage.PORT__SUPPORTED_IDENTIFIER:
				setSupportedIdentifier(SUPPORTED_IDENTIFIER_EDEFAULT);
				return;
			case SadPackage.PORT__COMPONENT_INSTANTIATION_REF:
				setComponentInstantiationRef((SadComponentInstantiationRef)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SadPackage.PORT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SadPackage.PORT__USES_IDENTIFIER:
				return USES_IDENTIFIER_EDEFAULT == null ? usesIdentifier != null : !USES_IDENTIFIER_EDEFAULT.equals(usesIdentifier);
			case SadPackage.PORT__PROVIDES_INDENTIFIER:
				return PROVIDES_INDENTIFIER_EDEFAULT == null ? providesIndentifier != null : !PROVIDES_INDENTIFIER_EDEFAULT.equals(providesIndentifier);
			case SadPackage.PORT__SUPPORTED_IDENTIFIER:
				return SUPPORTED_IDENTIFIER_EDEFAULT == null ? supportedIdentifier != null : !SUPPORTED_IDENTIFIER_EDEFAULT.equals(supportedIdentifier);
			case SadPackage.PORT__COMPONENT_INSTANTIATION_REF:
				return componentInstantiationRef != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", usesIdentifier: ");
		result.append(usesIdentifier);
		result.append(", providesIndentifier: ");
		result.append(providesIndentifier);
		result.append(", supportedIdentifier: ");
		result.append(supportedIdentifier);
		result.append(')');
		return result.toString();
	}

} //PortImpl