package com.tencent.mapsdk.internal;

import android.content.Context;
import com.tencent.map.tools.Callback;
import com.tencent.mapsdk.internal.C113865kb;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;

/* renamed from: com.tencent.mapsdk.internal.pp */
public final class C114075pp {
    /* renamed from: a */
    private static void m158853a(final Context context, final String str, final Callback<Boolean> callback) {
        C113865kb.m157396a(new C113865kb.C113879g<Boolean>() {
            /* renamed from: a */
            private Boolean m158856a() {
                C114075pp.m158852a(context, str);
                return Boolean.TRUE;
            }

            public final /* synthetic */ Object call() {
                C114075pp.m158852a(context, str);
                return Boolean.TRUE;
            }
        }).mo172280a(Boolean.FALSE, callback != null ? new C113865kb.C113868a<Boolean>() {
            /* renamed from: a */
            private void m158855a(Boolean bool) {
                callback.callback(bool);
            }

            public final /* bridge */ /* synthetic */ void callback(Object obj) {
                callback.callback((Boolean) obj);
            }
        } : null);
    }

    /* renamed from: a */
    private static void m158854a(C113955mh mhVar) {
        if (C113798hb.m157079b(mhVar.mo172391a(C0939el.f2175e), "4.0.9.1") < 0) {
            mhVar.mo172396a(new String[]{C0939el.f2187q, C0939el.f2189s});
        }
    }

    /* renamed from: a */
    public static void m158852a(Context context, String str) {
        if (context != null) {
            String a = C113959ml.m157965a(context, (TencentMapOptions) null).mo172402a(str);
            C113958mk a2 = C113958mk.m157962a(context);
            if (C113798hb.m157079b(a2.mo172391a(C0939el.f2175e), "4.0.9.1") < 0) {
                a2.mo172396a(new String[]{C0939el.f2187q, C0939el.f2189s});
            }
            int b = C113798hb.m157079b(C113798hb.m157096m(), a2.mo172391a(C0939el.f2175e));
            C113955mh a3 = C113957mj.m157958a(context, str);
            C113956mi.m157948a(a3, a);
            C113956mi.m157947a(context, a3, a, C0938ej.f2146a);
            C113956mi.m157947a(context, a3, a, C0938ej.f2149d);
            C113956mi.m157947a(context, a3, a, C0938ej.f2147b);
            C113956mi.m157947a(context, a3, a, C0938ej.f2148c);
            C113956mi.m157947a(context, a3, a, C0938ej.f2150e);
            C113956mi.m157947a(context, a3, a, C0938ej.f2151f);
            C113956mi.m157947a(context, a3, a, C0938ej.f2152g);
            C113956mi.m157947a(context, a3, a, C0938ej.f2153h);
            if (b > 0) {
                a2.mo172395a(C0939el.f2175e, C113798hb.m157096m());
            }
        }
    }
}
