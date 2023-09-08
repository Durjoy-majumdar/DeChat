package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import di3.C86312j;
import kb0.C76529i;
import q20.C89449a;

@C89449a
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.b */
final class C29537b implements C1255d<Bundle, Bundle> {
    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        try {
            ((C76529i) C86312j.m106911c(C76529i.class)).mo106763kb(bundle.getInt("action"), bundle);
            if (gVar == null) {
                return;
            }
        } catch (Exception unused) {
            if (gVar == null) {
                return;
            }
        } catch (Throwable th) {
            if (gVar != null) {
                try {
                    gVar.mo894a(Bundle.EMPTY);
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
        try {
            gVar.mo894a(Bundle.EMPTY);
        } catch (Exception unused3) {
        }
    }
}
