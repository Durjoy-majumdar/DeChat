package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.r6 */
public class C1850r6 implements C1256g<Bundle> {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f11661d;

    /* renamed from: e */
    public final /* synthetic */ int f11662e;

    /* renamed from: f */
    public final /* synthetic */ C1878t6 f11663f;

    public C1850r6(C1878t6 t6Var, C81925i2 i2Var, int i) {
        this.f11663f = t6Var;
        this.f11661d = i2Var;
        this.f11662e = i;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = bundle.getInt("ret", 1);
        if (i == 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("fileUrl", bundle.getString("fileUrl", ""));
            hashMap.put("thumbUrl", bundle.getString("thumbUrl", ""));
            this.f11661d.mo109647a(this.f11662e, this.f11663f.mo115112m("ok", hashMap));
        } else if (i == 1) {
            this.f11661d.mo109647a(this.f11662e, this.f11663f.mo115109j("fail:cdn com upload error"));
        } else if (i == 2) {
            this.f11661d.mo109647a(this.f11662e, this.f11663f.mo115109j("fail:cdn com call error"));
        } else {
            this.f11661d.mo109647a(this.f11662e, this.f11663f.mo115109j("fail:cdn com upload error"));
        }
    }
}
