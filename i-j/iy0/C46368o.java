package iy0;

import android.net.Uri;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40780x0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import gy3.C8480h;
import gy3.C87412m;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import sx3.C110818d0;
import sx3.C36907w;
import t73.C48555a;
import t73.C48556b;
import t73.C48558d;
import z04.C112550d0;

/* renamed from: iy0.o */
public final class C46368o {

    /* renamed from: a */
    public static final C46368o f124957a = new C46368o();

    /* renamed from: iy0.o$a */
    public static final class C46369a {

        /* renamed from: a */
        public static final C46369a f124958a = new C46369a();

        /* renamed from: b */
        public static final MMKVSlotManager f124959b = new MMKVSlotManager(C40780x0.m44078a(), 43200);

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00a0  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final te3.m25 m51704a(java.lang.String r14, java.lang.String r15) {
            /*
                java.lang.String r0 = "url"
                gy3.C87412m.m108594g(r14, r0)
                r0 = 0
                java.lang.String r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43960i(r14, r0)
                com.tencent.mm.sdk.platformtools.MMKVSlotManager r2 = f124959b
                boolean r3 = r2.containsKey(r1)
                java.lang.String r4 = ""
                r5 = 0
                r6 = 1
                r7 = 2
                java.lang.String r8 = "MicroMsg.WebPrefetcherInfoManager"
                if (r3 != 0) goto L_0x004f
                if (r15 == 0) goto L_0x0025
                int r3 = r15.length()
                if (r3 != 0) goto L_0x0023
                goto L_0x0025
            L_0x0023:
                r3 = 0
                goto L_0x0026
            L_0x0025:
                r3 = 1
            L_0x0026:
                if (r3 != 0) goto L_0x0030
                java.lang.String r3 = r2.decodeString(r15, r4)
                if (r3 != 0) goto L_0x0050
                r3 = r4
                goto L_0x0050
            L_0x0030:
                iy0.o r15 = iy0.C46368o.f124957a
                java.lang.String r15 = r15.mo71786b(r14, r5, r6)
                boolean r3 = gy3.C87412m.m108589b(r15, r1)
                if (r3 != 0) goto L_0x004f
                java.lang.String r3 = r2.decodeString(r15, r4)
                if (r3 != 0) goto L_0x0043
                r3 = r4
            L_0x0043:
                java.lang.Object[] r9 = new java.lang.Object[r7]
                r9[r0] = r15
                r9[r6] = r3
                java.lang.String r10 = "getValidPreloadWebInfo getPefetchInfoId: %s, realId: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r9)
                goto L_0x0050
            L_0x004f:
                r3 = r1
            L_0x0050:
                boolean r9 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                r10 = 3
                if (r9 == 0) goto L_0x0065
                r9 = 4
                java.lang.Object[] r9 = new java.lang.Object[r9]
                r9[r0] = r1
                r9[r6] = r15
                r9[r7] = r3
                r9[r10] = r14
                java.lang.String r11 = "getValidPreloadWebInfo id: %s, prefetchId: %s, realId: %s, url: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r8, r11, r9)
            L_0x0065:
                java.lang.Object r2 = r2.findSlot(r3)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r2
                if (r2 == 0) goto L_0x009b
                boolean r9 = r2.containsKey(r3)
                if (r9 == 0) goto L_0x009b
                byte[] r2 = r2.decodeBytes(r3)
                if (r2 == 0) goto L_0x009b
                int r9 = r2.length
                if (r9 != 0) goto L_0x007e
                r9 = 1
                goto L_0x007f
            L_0x007e:
                r9 = 0
            L_0x007f:
                r9 = r9 ^ r6
                if (r9 == 0) goto L_0x009b
                java.lang.Class<te3.m25> r9 = te3.m25.class
                java.lang.Object r9 = r9.newInstance()     // Catch:{ Exception -> 0x0091 }
                r11 = r9
                pe3.a r11 = (pe3.C47465a) r11     // Catch:{ Exception -> 0x0091 }
                r11.parseFrom(r2)     // Catch:{ Exception -> 0x0091 }
                pe3.a r9 = (pe3.C47465a) r9     // Catch:{ Exception -> 0x0091 }
                goto L_0x009c
            L_0x0091:
                r2 = move-exception
                java.lang.Object[] r9 = new java.lang.Object[r0]
                java.lang.String r11 = "MultiProcessMMKV.decodeProtoBuffer"
                java.lang.String r12 = "decode ProtoBuffer"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r2, r12, r9)
            L_0x009b:
                r9 = r5
            L_0x009c:
                te3.m25 r9 = (te3.m25) r9
                if (r9 == 0) goto L_0x0169
                long r11 = r9.f137779e
                r2 = 600(0x258, float:8.41E-43)
                boolean r2 = com.tencent.p014mm.sdk.platformtools.MMSlotKt.isExpire((long) r11, (int) r2)
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "[TRACE_PREFETCH] getValidPreloadWebInfo: webId#"
                r11.append(r12)
                r11.append(r1)
                java.lang.String r12 = ", realId: "
                r11.append(r12)
                r11.append(r3)
                java.lang.String r12 = ", bizId: "
                r11.append(r12)
                java.lang.String r12 = r9.f137784j
                r11.append(r12)
                java.lang.String r12 = ", prefetch:"
                r11.append(r12)
                boolean r12 = r9.f137785n
                r11.append(r12)
                java.lang.String r12 = ", authorized:"
                r11.append(r12)
                boolean r12 = r9.f137781g
                r11.append(r12)
                java.lang.String r12 = ", antispam:"
                r11.append(r12)
                boolean r12 = r9.f137780f
                r11.append(r12)
                java.lang.String r12 = ", lastModify:"
                r11.append(r12)
                long r12 = r9.f137779e
                r11.append(r12)
                java.lang.String r12 = ", expire:"
                r11.append(r12)
                r11.append(r2)
                java.lang.String r12 = ", url:%s"
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                java.lang.Object[] r12 = new java.lang.Object[r6]
                r12[r0] = r14
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r11, r12)
                boolean r11 = r9.f137780f
                if (r11 != 0) goto L_0x0168
                if (r2 == 0) goto L_0x010e
                goto L_0x0168
            L_0x010e:
                boolean r2 = r9.f137781g
                if (r2 != 0) goto L_0x0113
                return r9
            L_0x0113:
                boolean r11 = r9.f137785n
                if (r11 == 0) goto L_0x0169
                if (r2 == 0) goto L_0x0169
                iy0.o$a r2 = f124958a
                java.lang.String r11 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43960i(r14, r0)
                boolean r11 = r2.mo71787b(r14, r11)
                if (r11 == 0) goto L_0x0127
                r15 = 1
                goto L_0x0156
            L_0x0127:
                if (r15 == 0) goto L_0x0132
                int r11 = r15.length()
                if (r11 != 0) goto L_0x0130
                goto L_0x0132
            L_0x0130:
                r11 = 0
                goto L_0x0133
            L_0x0132:
                r11 = 1
            L_0x0133:
                if (r11 != 0) goto L_0x0155
                java.lang.String r11 = "prefetchId"
                gy3.C87412m.m108594g(r15, r11)
                com.tencent.mm.sdk.platformtools.MMKVSlotManager r11 = f124959b
                java.lang.String r15 = r11.decodeString(r15, r4)
                if (r15 != 0) goto L_0x0144
                goto L_0x0145
            L_0x0144:
                r4 = r15
            L_0x0145:
                int r15 = r4.length()
                if (r15 <= 0) goto L_0x014d
                r15 = 1
                goto L_0x014e
            L_0x014d:
                r15 = 0
            L_0x014e:
                if (r15 == 0) goto L_0x0155
                boolean r15 = r2.mo71787b(r14, r4)
                goto L_0x0156
            L_0x0155:
                r15 = 0
            L_0x0156:
                java.lang.Object[] r2 = new java.lang.Object[r7]
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r15)
                r2[r0] = r4
                r2[r6] = r1
                java.lang.String r4 = "isUrlCache %s, webId: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r4, r2)
                if (r15 == 0) goto L_0x0169
                return r9
            L_0x0168:
                return r5
            L_0x0169:
                java.lang.Object[] r15 = new java.lang.Object[r10]
                r15[r0] = r1
                r15[r6] = r3
                r15[r7] = r14
                java.lang.String r14 = "[TRACE_PREFETCH] getValidPreloadWebInfo: webId#%s, realId: %s, not cached, url:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r8, r14, r15)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: iy0.C46368o.C46369a.m51704a(java.lang.String, java.lang.String):te3.m25");
        }

        /* renamed from: b */
        public final boolean mo71787b(String str, String str2) {
            C48558d.C48560b bVar = C48558d.f129896H;
            C48556b bVar2 = C48558d.f129901M;
            C40717k0.f109363a.getClass();
            C46353a aVar = new C46353a(str, str2, bVar2, C40717k0.f109365c, (String) null, (String) null, (Boolean) null, (C48555a) null, false, (String) null, (String) null, 2032, (C8480h) null);
            boolean z = true;
            boolean z2 = aVar.mo71781w() && !aVar.mo71782x();
            boolean y = aVar.mo71783y();
            if (z2 && !y) {
                return true;
            }
            if (y) {
                if (aVar.mo71771m().length() <= 0) {
                    z = false;
                }
                if (z) {
                    return mo71787b(aVar.mo71771m(), C40714i.m43960i(aVar.mo71771m(), false));
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r5 = "";
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final te3.m25 mo71785a(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "webId"
            gy3.C87412m.m108594g(r5, r0)
            iy0.o$a r0 = iy0.C46368o.C46369a.f124958a
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x0015
            int r2 = r6.length()
            if (r2 != 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            goto L_0x0016
        L_0x0015:
            r2 = 1
        L_0x0016:
            if (r2 != 0) goto L_0x002a
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r2 = iy0.C46368o.C46369a.f124959b
            boolean r3 = r2.containsKey(r5)
            if (r3 != 0) goto L_0x002a
            java.lang.String r5 = ""
            java.lang.String r6 = r2.decodeString(r6, r5)
            if (r6 != 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r5 = r6
        L_0x002a:
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x0032
            r6 = 1
            goto L_0x0033
        L_0x0032:
            r6 = 0
        L_0x0033:
            r2 = 0
            if (r6 == 0) goto L_0x0071
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r6 = iy0.C46368o.C46369a.f124959b
            java.lang.Object r6 = r6.findSlot(r5)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r6
            if (r6 == 0) goto L_0x006f
            boolean r3 = r6.containsKey(r5)
            if (r3 == 0) goto L_0x006f
            byte[] r5 = r6.decodeBytes(r5)
            if (r5 == 0) goto L_0x006f
            int r6 = r5.length
            if (r6 != 0) goto L_0x0051
            r6 = 1
            goto L_0x0052
        L_0x0051:
            r6 = 0
        L_0x0052:
            r6 = r6 ^ r0
            if (r6 == 0) goto L_0x006f
            java.lang.Class<te3.m25> r6 = te3.m25.class
            java.lang.Object r6 = r6.newInstance()     // Catch:{ Exception -> 0x0065 }
            r0 = r6
            pe3.a r0 = (pe3.C47465a) r0     // Catch:{ Exception -> 0x0065 }
            r0.parseFrom(r5)     // Catch:{ Exception -> 0x0065 }
            pe3.a r6 = (pe3.C47465a) r6     // Catch:{ Exception -> 0x0065 }
            r2 = r6
            goto L_0x006f
        L_0x0065:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.String r0 = "MultiProcessMMKV.decodeProtoBuffer"
            java.lang.String r1 = "decode ProtoBuffer"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r5, r1, r6)
        L_0x006f:
            te3.m25 r2 = (te3.m25) r2
        L_0x0071:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: iy0.C46368o.mo71785a(java.lang.String, java.lang.String):te3.m25");
    }

    /* renamed from: b */
    public final String mo71786b(String str, String str2, boolean z) {
        List list;
        C87412m.m108594g(str, "url");
        Log.m105924i("MicroMsg.WebPrefetcherCacheManager", "getPrefetchInfoId urlQueryKeys: " + str2 + ", readUrlQueryKeysFromLocal: " + z);
        if ((str2 == null || str2.length() == 0) || z) {
            MMKVSlotManager mMKVSlotManager = C9263p.f29013a;
            ArrayList arrayList = null;
            if (!(str.length() == 0)) {
                String a = C9263p.m8906a(str);
                if (!(a.length() == 0)) {
                    String decodeString = C9263p.f29013a.decodeString(a, "");
                    String str3 = decodeString == null ? "" : decodeString;
                    Log.m105918d("MicroMsg.WebPrefetcherUrlQueryManager", "getUrlQueryList key: " + a + ", value: " + str3);
                    if (str3.length() > 0) {
                        List<String> U = C112550d0.m153785U(str3, new String[]{","}, false, 0, 6, (Object) null);
                        arrayList = new ArrayList(C36907w.m41090l(U, 10));
                        for (String decode : U) {
                            arrayList.add(URLDecoder.decode(decode));
                        }
                    }
                }
            }
            list = arrayList;
        } else {
            list = C112550d0.m153785U(str2, new String[]{","}, false, 0, 6, (Object) null);
        }
        if (list == null || list.isEmpty()) {
            return "";
        }
        MMKVSlotManager mMKVSlotManager2 = C9263p.f29013a;
        C87412m.m108594g(list, "urlQueryList");
        if (!list.isEmpty()) {
            try {
                Uri parse = Uri.parse(str);
                Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                C87412m.m108593f(queryParameterNames, "uri.queryParameterNames");
                ArrayList arrayList2 = new ArrayList();
                for (T next : queryParameterNames) {
                    String str4 = (String) next;
                    C87412m.m108593f(str4, LocaleUtil.ITALIAN);
                    if ((str4.length() > 0) && list.contains(str4)) {
                        arrayList2.add(next);
                    }
                }
                List<String> n0 = C110818d0.m150942n0(arrayList2);
                for (String str5 : n0) {
                    String queryParameter = parse.getQueryParameter(str5);
                    if (queryParameter == null) {
                        queryParameter = "";
                    }
                    clearQuery.appendQueryParameter(str5, queryParameter);
                }
                String builder = clearQuery.toString();
                C87412m.m108593f(builder, "newUriBuilder.toString()");
                Log.m105924i("MicroMsg.WebPrefetcherUrlQueryManager", "filterUrl url: " + str + ", newUrl: " + builder + ", queryKeyList: " + n0);
                str = builder;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WebPrefetcherUrlQueryManager", e, "filterUrl exception", new Object[0]);
            }
        }
        return C40714i.m43960i(str, false);
    }
}
