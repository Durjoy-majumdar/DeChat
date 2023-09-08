package p376qn;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import p227rn.C48052u;
import p227rn.C48053v;
import p248ug.C52558c;
import p749xh.C53349s0;
import rb0.C47984k;

@C86522b
/* renamed from: qn.m */
public class C47872m extends C86301e implements C48053v {
    public String A10(String str) {
        return C47984k.m53328b(str).field_brandIconURL;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r3 = (r3 = r3.mo73500r2(false)).mo73512e();
     */
    /* renamed from: El */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo72613El(java.lang.String r3) {
        /*
            r2 = this;
            ug.c r3 = rb0.C47984k.m53328b(r3)
            r0 = 0
            if (r3 == 0) goto L_0x001f
            ug.c$b r3 = r3.mo73500r2(r0)
            if (r3 == 0) goto L_0x001f
            ug.c$b$b r3 = r3.mo73512e()
            if (r3 == 0) goto L_0x001f
            boolean r1 = r3.mo73527a()
            if (r1 == 0) goto L_0x001f
            int r3 = r3.f146824c
            r1 = 1
            if (r3 != r1) goto L_0x001f
            return r1
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p376qn.C47872m.mo72613El(java.lang.String):boolean");
    }

    /* renamed from: OE */
    public boolean mo72614OE(String str) {
        return C47984k.m53334h(str);
    }

    /* renamed from: Pd */
    public boolean mo72615Pd(String str) {
        C52558c b = C47984k.m53328b(str);
        if (b == null) {
            Log.m105920e("MicroMsg.BizInfoStorageLogicService", "bizInfo is null");
            return false;
        }
        C52558c.C52560b r2 = b.mo73500r2(false);
        if (r2 != null && r2.mo73512e() != null && r2.mo73512e().mo73527a()) {
            return true;
        }
        Log.m105920e("MicroMsg.BizInfoStorageLogicService", "this is not hardware biz");
        return false;
    }

    /* renamed from: gE */
    public C53349s0 mo72616gE() {
        return new C52558c();
    }

    /* renamed from: gl */
    public boolean mo72617gl(String str) {
        return C47984k.m53337k(str);
    }

    /* renamed from: kL */
    public boolean mo72618kL(String str) {
        return C47984k.m53339m(str);
    }

    /* renamed from: v */
    public C48052u mo72619v(String str) {
        return C47984k.m53328b(str);
    }
}
