package com.tencent.p014mm.legacy.app;

import android.content.Context;
import bp3.C79760s;
import com.tencent.p014mm.app.C80622u0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import p934bj.C79707a;
import pf0.C21966a;

@C86522b
/* renamed from: com.tencent.mm.legacy.app.i */
public class C80964i extends C86301e {
    public void onCreate(Context context) {
        super.onCreate(context);
        C21966a.f62183p = new C79707a();
        if (!MMApplicationContext.isPushProcess()) {
            try {
                C79760s.m96908a("initSVG");
                C80962f.m98848c();
                if (C80622u0.m98265a(context).f235888f) {
                    C80962f.m98847b();
                }
            } finally {
                C79760s.m96909b();
            }
        }
    }
}
