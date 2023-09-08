package com.tencent.p014mm.plugin.downloader.model;

import android.content.Context;
import org.json.JSONObject;
import p237sp.C13747c0;
import p237sp.C90271s;

/* renamed from: com.tencent.mm.plugin.downloader.model.d0 */
public class C2199d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f12212d;

    /* renamed from: e */
    public final /* synthetic */ long f12213e;

    /* renamed from: f */
    public final /* synthetic */ boolean f12214f;

    /* renamed from: g */
    public final /* synthetic */ boolean f12215g;

    /* renamed from: h */
    public final /* synthetic */ C90271s.C13750a f12216h;

    /* renamed from: com.tencent.mm.plugin.downloader.model.d0$a */
    public class C2200a implements C13747c0.C13748a {
        public C2200a() {
        }

        /* renamed from: a */
        public void mo287a(String str, JSONObject jSONObject) {
            if (str != null) {
                C2199d0.this.f12216h.mo13120b(C2205h0.m2038a(str), str);
            } else {
                C2199d0.this.f12216h.mo13120b(0, "none");
            }
        }
    }

    public C2199d0(Context context, long j, boolean z, boolean z2, C90271s.C13750a aVar) {
        this.f12212d = context;
        this.f12213e = j;
        this.f12214f = z;
        this.f12215g = z2;
        this.f12216h = aVar;
    }

    public void run() {
        C40955x.m44390e(this.f12212d, this.f12213e, this.f12214f, this.f12215g, new C2200a());
    }
}
