package io0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io0.k */
public final class C33374k extends C33376l {

    /* renamed from: e */
    public static final C33375a f90441e = new C33375a((C8480h) null);

    /* renamed from: d */
    public final List<C33376l> f90442d;

    /* renamed from: io0.k$a */
    public static final class C33375a {
        public C33375a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C33374k mo59114a(C86009m1 m1Var) {
            C87412m.m108594g(m1Var, "unzipDir");
            if (m1Var.mo119977o()) {
                return new C33374k(m1Var);
            }
            return null;
        }
    }

    public C33374k(String str, long j, List list, C8480h hVar) {
        super(str, j);
        this.f90442d = list;
    }

    /* renamed from: a */
    public JSONObject mo59113a() {
        try {
            JSONObject a = super.mo59113a();
            if (a == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (C33376l a2 : this.f90442d) {
                jSONArray.put(a2.mo59113a());
            }
            a.put("subMetas", jSONArray);
            return a;
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.AppBrandResCacheChecker", "DirMetaData#toJson, fail since " + e);
            return null;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C33374k(com.tencent.p014mm.vfs.C86009m1 r12) {
        /*
            r11 = this;
            java.lang.String r0 = "unzipDir"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = r12.getName()
            java.lang.String r1 = "unzipDir.name"
            gy3.C87412m.m108593f(r0, r1)
            long r1 = r12.mo119979q()
            com.tencent.mm.vfs.m1[] r12 = r12.mo119984u()
            gy3.C87412m.m108591d(r12)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r12.length
            r3.<init>(r4)
            int r4 = r12.length
            r5 = 0
        L_0x0023:
            if (r5 >= r4) goto L_0x0056
            r6 = r12[r5]
            java.lang.String r7 = "it"
            gy3.C87412m.m108593f(r6, r7)
            boolean r7 = r6.mo119977o()
            if (r7 == 0) goto L_0x003c
            io0.k$a r7 = f90441e
            io0.k r6 = r7.mo59114a(r6)
            gy3.C87412m.m108591d(r6)
            goto L_0x0050
        L_0x003c:
            io0.l r7 = new io0.l
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = "unzipFile.name"
            gy3.C87412m.m108593f(r8, r9)
            long r9 = r6.mo119979q()
            r7.<init>(r8, r9)
            r6 = r7
        L_0x0050:
            r3.add(r6)
            int r5 = r5 + 1
            goto L_0x0023
        L_0x0056:
            r11.<init>(r0, r1)
            r11.f90442d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io0.C33374k.<init>(com.tencent.mm.vfs.m1):void");
    }
}
