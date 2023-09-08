package com.tencent.p014mm.plugin.downloader.model;

import android.content.Context;
import com.tencent.p014mm.plugin.downloader_app.model.C40979a;
import org.json.JSONObject;
import p237sp.C13747c0;
import p237sp.C90271s;

/* renamed from: com.tencent.mm.plugin.downloader.model.c0 */
public class C2197c0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f12208d;

    /* renamed from: e */
    public final /* synthetic */ C40979a f12209e;

    /* renamed from: f */
    public final /* synthetic */ C90271s.C13750a f12210f;

    /* renamed from: com.tencent.mm.plugin.downloader.model.c0$a */
    public class C2198a implements C13747c0.C13748a {
        public C2198a() {
        }

        /* renamed from: a */
        public void mo287a(String str, JSONObject jSONObject) {
            if (str != null) {
                C2197c0.this.f12210f.mo13120b(C2205h0.m2038a(str), str);
            } else if (jSONObject == null) {
                C2197c0.this.f12210f.mo13120b(809, "fail");
            } else {
                long optLong = jSONObject.optLong("download_id", -1);
                if (optLong <= 0) {
                    C2197c0.this.f12210f.mo13120b(809, "fail");
                } else {
                    C2197c0.this.f12210f.mo13120b(0, String.valueOf(optLong));
                }
            }
        }
    }

    public C2197c0(Context context, C40979a aVar, C90271s.C13750a aVar2) {
        this.f12208d = context;
        this.f12209e = aVar;
        this.f12210f = aVar2;
    }

    public void run() {
        C40955x.m44387b(this.f12208d, this.f12209e, new C2198a());
    }
}
