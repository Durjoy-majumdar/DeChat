package com.tencent.p014mm.appbrand.p942v8;

import android.text.TextUtils;
import com.eclipsesource.mmv8.MultiContextV8;
import com.tencent.p014mm.appbrand.p942v8.C80695s;
import com.tencent.p014mm.appbrand.p942v8.IJSRuntime;
import com.tencent.p014mm.sdk.platformtools.Log;
import p774zg.a$$b;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.appbrand.v8.q */
public class C80691q extends C80649a {

    /* renamed from: y */
    public MultiContextV8 f236093y;

    /* renamed from: com.tencent.mm.appbrand.v8.q$a */
    public class C80692a implements C80695s.C80696a {
        public C80692a() {
        }
    }

    public C80691q(IJSRuntime.Config config) {
        super(config);
    }

    /* renamed from: b */
    public void mo112468b() {
        C119179t tVar = C119157j.f356862d;
        a$$b a__b = new a$$b();
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183886q(a__b, 30000, (String) null);
        try {
            this.f236093y.release();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.V8JSRuntime", "commonCleanUp exp = %s", e);
        }
    }

    /* renamed from: k */
    public C80656d mo112471k() {
        C80692a aVar = new C80692a();
        boolean z = this.f236012u.f235982j;
        ThreadLocal<C80695s> threadLocal = C80695s.f236111n;
        if (threadLocal.get() == null) {
            C80695s sVar = new C80695s(aVar, z);
            threadLocal.set(sVar);
            return sVar;
        }
        throw new RuntimeException("Only one Looper may be created per thread");
    }

    /* renamed from: l */
    public MultiContextV8 mo112472l() {
        String str = this.f235999h;
        byte[] bArr = this.f236000i;
        String str2 = this.f236001j;
        MultiContextV8 createMultiContextV8 = MultiContextV8.createMultiContextV8((String) null, str, bArr, str2, !TextUtils.isEmpty(str2) && this.f236002k);
        this.f236093y = createMultiContextV8;
        this.f236000i = null;
        return createMultiContextV8;
    }
}
