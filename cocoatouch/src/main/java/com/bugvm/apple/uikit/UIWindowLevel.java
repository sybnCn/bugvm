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
import com.bugvm.apple.foundation.CocoaUtility;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("UIKit")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIWindowLevel/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(UIWindowLevel.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    public static double Normal = LevelNormal();
    public static double Alert = LevelAlert();
    public static double StatusBar = LevelStatusBar();
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="UIWindowLevelNormal", optional=true)
    protected static native @MachineSizedFloat double LevelNormal();
    @GlobalValue(symbol="UIWindowLevelAlert", optional=true)
    protected static native @MachineSizedFloat double LevelAlert();
    @GlobalValue(symbol="UIWindowLevelStatusBar", optional=true)
    protected static native @MachineSizedFloat double LevelStatusBar();
    /*</methods>*/
}