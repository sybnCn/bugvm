/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.uikit;

/*<imports>*/

import com.bugvm.apple.foundation.NSArray;
import com.bugvm.apple.foundation.NSObject;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 3.2 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UISplitViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UISplitViewControllerPtr extends Ptr<UISplitViewController, UISplitViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UISplitViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UISplitViewController() {}
    protected UISplitViewController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "viewControllers")
    public native NSArray<UIViewController> getViewControllers();
    @Property(selector = "setViewControllers:")
    public native void setViewControllers(NSArray<UIViewController> v);
    @Property(selector = "delegate")
    public native UISplitViewControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UISplitViewControllerDelegate v);
    /**
     * @since Available in iOS 5.1 and later.
     */
    @Property(selector = "presentsWithGesture")
    public native boolean presentsWithGesture();
    /**
     * @since Available in iOS 5.1 and later.
     */
    @Property(selector = "setPresentsWithGesture:")
    public native void setPresentsWithGesture(boolean v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "isCollapsed")
    public native boolean isCollapsed();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "preferredDisplayMode")
    public native UISplitViewControllerDisplayMode getPreferredDisplayMode();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setPreferredDisplayMode:")
    public native void setPreferredDisplayMode(UISplitViewControllerDisplayMode v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "displayMode")
    public native UISplitViewControllerDisplayMode getDisplayMode();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "preferredPrimaryColumnWidthFraction")
    public native @MachineSizedFloat double getPreferredPrimaryColumnWidthFraction();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setPreferredPrimaryColumnWidthFraction:")
    public native void setPreferredPrimaryColumnWidthFraction(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "minimumPrimaryColumnWidth")
    public native @MachineSizedFloat double getMinimumPrimaryColumnWidth();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setMinimumPrimaryColumnWidth:")
    public native void setMinimumPrimaryColumnWidth(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "maximumPrimaryColumnWidth")
    public native @MachineSizedFloat double getMaximumPrimaryColumnWidth();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "setMaximumPrimaryColumnWidth:")
    public native void setMaximumPrimaryColumnWidth(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "primaryColumnWidth")
    public native @MachineSizedFloat double getPrimaryColumnWidth();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalValue(symbol="UISplitViewControllerAutomaticDimension", optional=true)
    public static native @MachineSizedFloat double getAutomaticDimension();
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "displayModeButtonItem")
    public native UIBarButtonItem getDisplayModeButtonItem();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "showViewController:sender:")
    public native void showViewController(UIViewController vc, NSObject sender);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "showDetailViewController:sender:")
    public native void showDetailViewController(UIViewController vc, NSObject sender);
    /*</methods>*/
}