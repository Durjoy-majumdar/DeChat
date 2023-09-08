package com.tencent.p014mm.plugin.appbrand.debugger;

import java.util.Comparator;
import te3.mw4;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.b0 */
public class C81699b0 implements Comparator<mw4> {
    public C81699b0(C81695a0 a0Var) {
    }

    public int compare(Object obj, Object obj2) {
        mw4 mw4 = (mw4) obj;
        mw4 mw42 = (mw4) obj2;
        if (mw4 == null || mw42 == null) {
            return 0;
        }
        return mw4.f138252d - mw42.f138252d;
    }
}
