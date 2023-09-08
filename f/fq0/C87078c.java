package fq0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import cq0.C86093e;
import java.util.HashMap;
import li0.C88508b;
import li0.C88509c;

/* renamed from: fq0.c */
public class C87078c extends C86093e {

    /* renamed from: d */
    public C88509c.C88512b f252666d;

    /* renamed from: fq0.c$a */
    public class C87079a implements C88509c.C88512b {
        public C87079a() {
        }

        /* renamed from: b */
        public void mo113102b(String str, C88508b bVar) {
            HashMap hashMap = new HashMap();
            hashMap.put("state", Integer.valueOf(bVar.ordinal()));
            C87078c.this.mo120520c(hashMap);
        }
    }

    public C87078c(C86093e.C86094a aVar, C81925i2 i2Var) {
        super(aVar, i2Var);
    }

    /* renamed from: a */
    public void mo120518a() {
        C88509c cVar;
        if (this.f252666d != null && this.f250577a.getRuntime() != null && (cVar = this.f250577a.getRuntime().f238113K) != null) {
            cVar.mo122982e(this.f252666d);
        }
    }

    /* renamed from: b */
    public void mo120519b() {
        this.f252666d = new C87079a();
        this.f250577a.getRuntime().f238113K.mo122978a(this.f252666d);
    }
}
