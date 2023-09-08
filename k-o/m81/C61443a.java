package m81;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import java.util.List;
import oa1.C117731d;
import te3.C64723t60;
import u24.C90599h;
import u81.C118604a;
import u81.C118606c;

/* renamed from: m81.a */
public class C61443a implements C117542c {

    /* renamed from: a */
    public int f174731a;

    public C61443a(int i) {
        this.f174731a = i;
    }

    /* renamed from: a */
    public void mo86406a() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7 A[SYNTHETIC, Splitter:B:27:0x00a7] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo86407b(u81.C118604a r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r8.f174731a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r8.mo86411d(r0)
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            java.lang.String r1 = r9.f354920r
            java.lang.String r1 = r8.mo86412e(r1)
            boolean r2 = u24.C90599h.m113511d(r1)
            if (r2 == 0) goto L_0x0019
            return
        L_0x0019:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[EdgeComputingCacheStrategyMMKV] save key : "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "EdgeComputingCacheStrategyMMKV"
            j81.C87906e.m109407a(r3, r2)
            byte[] r2 = r0.decodeBytes(r1)
            r4 = 0
            if (r2 == 0) goto L_0x0067
            int r5 = r2.length
            if (r5 <= 0) goto L_0x0067
            te3.t60 r5 = new te3.t60
            r5.<init>()
            r5.parseFrom(r2)     // Catch:{ Exception -> 0x0046 }
            java.util.List r2 = u81.C118606c.m167291a(r5)     // Catch:{ Exception -> 0x0046 }
            goto L_0x0068
        L_0x0046:
            r2 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[EdgeComputingCacheStrategyMMKV] save parseFrom : "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = ", throw Exception : "
            r5.append(r6)
            java.lang.String r2 = r2.getMessage()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
        L_0x0067:
            r2 = r4
        L_0x0068:
            if (r2 != 0) goto L_0x006f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x006f:
            r2.add(r9)
            int r9 = r2.size()
            if (r9 > 0) goto L_0x0079
            goto L_0x00a5
        L_0x0079:
            te3.t60 r4 = new te3.t60
            r4.<init>()
            java.util.Iterator r9 = r2.iterator()
        L_0x0082:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x00a5
            java.lang.Object r2 = r9.next()
            u81.a r2 = (u81.C118604a) r2
            te3.s60 r5 = new te3.s60
            r5.<init>()
            long r6 = r2.f354921s
            r5.f185353e = r6
            java.lang.String r6 = r2.f354922t
            r5.f185354f = r6
            java.lang.String r2 = r2.f354920r
            r5.f185352d = r2
            java.util.LinkedList<te3.s60> r2 = r4.f185506d
            r2.add(r5)
            goto L_0x0082
        L_0x00a5:
            if (r4 == 0) goto L_0x00e5
            byte[] r9 = r4.toByteArray()     // Catch:{ Exception -> 0x00cc }
            boolean r9 = r0.encode((java.lang.String) r1, (byte[]) r9)     // Catch:{ Exception -> 0x00cc }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cc }
            r0.<init>()     // Catch:{ Exception -> 0x00cc }
            java.lang.String r2 = "[EdgeComputingCacheStrategyMMKV] save encode : "
            r0.append(r2)     // Catch:{ Exception -> 0x00cc }
            r0.append(r1)     // Catch:{ Exception -> 0x00cc }
            java.lang.String r1 = ", mmkvEncode : "
            r0.append(r1)     // Catch:{ Exception -> 0x00cc }
            r0.append(r9)     // Catch:{ Exception -> 0x00cc }
            java.lang.String r9 = r0.toString()     // Catch:{ Exception -> 0x00cc }
            j81.C87906e.m109407a(r3, r9)     // Catch:{ Exception -> 0x00cc }
            goto L_0x00e5
        L_0x00cc:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[EdgeComputingCacheStrategyMMKV] save encode throw Exception : "
            r0.append(r1)
            java.lang.String r9 = r9.getMessage()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r9)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m81.C61443a.mo86407b(u81.a):void");
    }

    /* renamed from: c */
    public void mo86408c(long j) {
    }

    public void close() {
    }

    public long count() {
        MultiProcessMMKV d = mo86411d(this.f174731a);
        long j = 0;
        if (d == null) {
            return 0;
        }
        String[] allKeys = d.allKeys();
        if (allKeys != null && allKeys.length > 0) {
            for (String str : allKeys) {
                List<C118604a> list = null;
                byte[] decodeBytes = d.decodeBytes(str);
                if (decodeBytes != null && decodeBytes.length > 0) {
                    C64723t60 t602 = new C64723t60();
                    try {
                        t602.parseFrom(decodeBytes);
                        list = C118606c.m167291a(t602);
                    } catch (Exception e) {
                        Log.m105920e("EdgeComputingCacheStrategyMMKV", "[EdgeComputingCacheStrategyMMKV] size parseFrom : " + str + ", throw Exception : " + e.getMessage());
                    }
                    if (list != null) {
                        j += (long) list.size();
                    }
                }
            }
        }
        return j;
    }

    /* renamed from: d */
    public final MultiProcessMMKV mo86411d(int i) {
        if (i == 2) {
            return MultiProcessMMKV.getMMKV("mmkv_name_edge_computing_instant_cache_" + C117731d.m166007c().mo182446h());
        } else if (i != 1) {
            return null;
        } else {
            return MultiProcessMMKV.getMMKV("mmkv_name_edge_computing_cache_" + C117731d.m166007c().mo182446h());
        }
    }

    /* renamed from: e */
    public final String mo86412e(String str) {
        if (C90599h.m113511d(str)) {
            return null;
        }
        return "mmkv_key_data_cache" + "_" + str;
    }

    /* renamed from: m */
    public List<C118604a> mo86413m(String str) {
        MultiProcessMMKV d;
        byte[] decodeBytes;
        List<C118604a> list;
        if (C90599h.m113511d(str) || (d = mo86411d(this.f174731a)) == null) {
            return null;
        }
        String e = mo86412e(str);
        if (!C90599h.m113511d(e) && (decodeBytes = d.decodeBytes(e)) != null && decodeBytes.length > 0) {
            C64723t60 t602 = new C64723t60();
            try {
                t602.parseFrom(decodeBytes);
                list = C118606c.m167291a(t602);
            } catch (Exception e2) {
                Log.m105920e("EdgeComputingCacheStrategyMMKV", "[EdgeComputingCacheStrategyMMKV] query parseFrom : " + e + ", throw Exception : " + e2.getMessage());
                list = null;
            }
            if (list != null) {
                return list;
            }
        }
        return null;
    }

    public void remove(String str) {
        MultiProcessMMKV d;
        if (!C90599h.m113511d(str) && (d = mo86411d(this.f174731a)) != null) {
            String e = mo86412e(str);
            if (!C90599h.m113511d(e)) {
                d.removeValueForKey(e);
                if (d.totalSize() >= 3145728) {
                    d.trim();
                }
            }
        }
    }

    public void reset() {
    }
}
