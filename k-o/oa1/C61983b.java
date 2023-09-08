package oa1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;

/* renamed from: oa1.b */
public class C61983b {

    /* renamed from: c */
    public static C61983b f176204c;

    /* renamed from: a */
    public String f176205a = null;

    /* renamed from: b */
    public String f176206b = null;

    /* renamed from: e */
    public static C61983b m72724e() {
        if (f176204c == null) {
            f176204c = new C61983b();
        }
        return f176204c;
    }

    /* renamed from: a */
    public List<C61982a> mo86866a() {
        String[] allKeys;
        ArrayList arrayList = new ArrayList();
        MultiProcessMMKV c = mo86868c();
        if (!(c == null || (allKeys = c.allKeys()) == null || allKeys.length <= 0)) {
            for (String string : allKeys) {
                String string2 = c.getString(string, "");
                if (!Util.isNullOrNil(string2)) {
                    C61982a aVar = new C61982a();
                    if (aVar.mo86862a(string2)) {
                        arrayList.add(aVar);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo86867b(java.lang.String r10, java.lang.String r11, com.tencent.p014mm.pointers.PString r12) {
        /*
            r9 = this;
            r0 = 0
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r9.mo86869d()     // Catch:{ Exception -> 0x000a }
            int r1 = r1.getInt(r10, r0)     // Catch:{ Exception -> 0x000a }
            goto L_0x000b
        L_0x000a:
            r1 = 0
        L_0x000b:
            if (r1 <= 0) goto L_0x004f
            oa1.a r1 = r9.mo86870f(r1)
            if (r1 == 0) goto L_0x004f
            int r2 = r1.f176195c
            if (r2 >= 0) goto L_0x0018
            goto L_0x0030
        L_0x0018:
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            long r4 = r1.f176197e
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0030
            long r4 = r1.f176198f
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x002e
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0030
        L_0x002e:
            r2 = 1
            goto L_0x0031
        L_0x0030:
            r2 = 0
        L_0x0031:
            if (r2 == 0) goto L_0x004f
            java.util.HashMap r2 = r1.mo86864c()
            if (r2 == 0) goto L_0x004f
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x004f
            java.lang.Object r10 = r2.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            r12.value = r10
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x004f
            int r0 = r1.f176193a
        L_0x004f:
            if (r0 > 0) goto L_0x0053
            r12.value = r11
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oa1.C61983b.mo86867b(java.lang.String, java.lang.String, com.tencent.mm.pointers.PString):int");
    }

    /* renamed from: c */
    public MultiProcessMMKV mo86868c() {
        int h = C117731d.m166007c().mo182446h();
        if (h == 0) {
            return null;
        }
        String str = h + "_" + "WxExptAppIdMmkv";
        if (!Util.isEqual(this.f176205a, str)) {
            Log.m105925i("MicroMsg.ExptAppManager", "%s get exptId mmkv change uin old[%s] new[%s]", hashCode() + "", this.f176205a, str);
            this.f176205a = str;
        }
        return MultiProcessMMKV.getMMKV(this.f176205a);
    }

    /* renamed from: d */
    public MultiProcessMMKV mo86869d() {
        int h = C117731d.m166007c().mo182446h();
        if (h == 0) {
            return null;
        }
        String str = h + "_" + "WxExptAppKeyMmkv";
        if (!Util.isEqual(this.f176206b, str)) {
            Log.m105925i("MicroMsg.ExptAppManager", "%s get exptKey mmkv change uin old[%s] new[%s]", hashCode() + "", this.f176206b, str);
            this.f176206b = str;
        }
        return MultiProcessMMKV.getMMKV(this.f176206b);
    }

    /* renamed from: f */
    public C61982a mo86870f(int i) {
        MultiProcessMMKV c = mo86868c();
        if (c == null) {
            return null;
        }
        String string = c.getString(i + "", "");
        if (!Util.isNullOrNil(string)) {
            C61982a aVar = new C61982a();
            if (aVar.mo86862a(string)) {
                return aVar;
            }
        }
        return null;
    }
}
