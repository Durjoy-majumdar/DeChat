package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.i1 */
public interface C84963i1 {

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.i1$a */
    public static class C84964a {
        /* renamed from: a */
        public static C84963i1 m104748a(Context context) {
            Context baseContext;
            if (context == null) {
                return null;
            }
            if (context instanceof C84963i1) {
                return (C84963i1) context;
            }
            if (!(context instanceof ContextWrapper) || (baseContext = ((ContextWrapper) context).getBaseContext()) == context) {
                return null;
            }
            return m104748a(baseContext);
        }
    }

    Activity getHostActivity();

    void hideVKB();

    void hideVKB(View view);

    boolean hideVKBHavingResult();

    void showVKB();
}
