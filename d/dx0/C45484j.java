package dx0;

import android.net.Uri;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40746q0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40750s0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40779w0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMCacheSlotManager;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import ea3.C45590f;
import ex0.C45700h;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import i93.C46206e;
import iy0.C46353a;
import iy0.C46368o;
import java.util.Date;
import java.util.List;
import org.xwalk.core.XWalkEnvironment;
import p564iq.C87790d;
import py0.C47539a;
import rx3.C36570n;
import sf0.C48374j0;
import t73.C48555a;
import t73.C48556b;
import t73.C48558d;
import te3.m25;
import z04.C112550d0;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: dx0.j */
public final class C45484j implements C45700h {
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0072, code lost:
        if (z04.C112551y.m153819s(r3, "http", false) == false) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003f A[SYNTHETIC] */
    /* renamed from: A3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo71026A3(java.util.List<? extends ex0.C45700h.C45702b> r9, int r10) {
        /*
            r8 = this;
            java.lang.String r0 = "auths"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.Class<iq.d> r0 = p564iq.C87790d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            iq.d r0 = (p564iq.C87790d) r0
            java.lang.String r1 = "appbrand"
            boolean r0 = r0.isInstalled(r1)
            if (r0 != 0) goto L_0x0016
            return
        L_0x0016:
            r0 = 0
            boolean r0 = r8.mo71035a(r10, r0)
            if (r0 != 0) goto L_0x0034
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "[TRACE_PREFETCH] preAuths isEntranceOpen false, entranceBit = "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "MicroMsg.WebPrefetchServiceImpl"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r10, r9)
            return
        L_0x0034:
            r0 = -1
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x003f:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x007b
            java.lang.Object r2 = r9.next()
            r3 = r2
            ex0.h$b r3 = (ex0.C45700h.C45702b) r3
            java.lang.String r4 = r3.f123504a
            java.lang.String r5 = "info.url"
            gy3.C87412m.m108593f(r4, r5)
            boolean r4 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.m43989g(r4)
            r6 = 0
            if (r4 == 0) goto L_0x0074
            java.lang.String r4 = r3.f123504a
            gy3.C87412m.m108593f(r4, r5)
            java.lang.String r7 = ":"
            boolean r4 = z04.C112550d0.m153801u(r4, r7, r6)
            if (r4 == 0) goto L_0x0075
            java.lang.String r3 = r3.f123504a
            gy3.C87412m.m108593f(r3, r5)
            java.lang.String r4 = "http"
            boolean r3 = z04.C112551y.m153819s(r3, r4, r6)
            if (r3 != 0) goto L_0x0075
        L_0x0074:
            r6 = 1
        L_0x0075:
            if (r6 != 0) goto L_0x003f
            r10.add(r2)
            goto L_0x003f
        L_0x007b:
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.m43991j(r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dx0.C45484j.mo71026A3(java.util.List, int):void");
    }

    /* renamed from: B3 */
    public boolean mo71027B3(String str, String str2) {
        if (str == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = C46368o.C46369a.m51704a(str, str2) != null;
        Log.m105919d("MicroMsg.WebPrefetchServiceImpl", "isUrlPreAuthed cost: %d, ret: %s, url: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Boolean.valueOf(z), str);
        return z;
    }

    /* renamed from: Fu */
    public void mo71028Fu(String str, String str2, String str3) {
        C87412m.m108594g(str3, "url");
        if (str2 != null) {
            Log.m105924i("MicroMsg.WebPrefetcherCacheManager", "clearPrefetchContent webId: " + str + ", bizId: " + str2);
            C86009m1 B = C48558d.f129901M.mo73172B(str2);
            if (B.mo119967g()) {
                B.mo119966f();
            }
            C40717k0.f109363a.getClass();
            MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) C40717k0.f109365c.findSlot(str2);
            if (multiProcessMMKV != null) {
                multiProcessMMKV.remove(str2);
            }
            if (str == null) {
                str = "";
            }
            MultiProcessMMKV multiProcessMMKV2 = (MultiProcessMMKV) C46368o.C46369a.f124959b.findSlot(str);
            if (multiProcessMMKV2 != null) {
                multiProcessMMKV2.removeValueForKey(str);
            }
        }
    }

    public boolean Gw0(String str) {
        String host;
        if (str == null || C112551y.m153811k(str) || (host = Uri.parse(str).getHost()) == null) {
            return false;
        }
        MMCacheSlotManager mMCacheSlotManager = C45469b.f123066j;
        return C45469b.f123068o.decodeBool(host, false);
    }

    /* renamed from: OO */
    public String[][] mo71030OO(String str, String str2) {
        C87412m.m108594g(str, "url");
        C40717k0.f109363a.getClass();
        String i = C40714i.m43960i(str, false);
        m25 a = C46368o.f124957a.mo71785a(i, str2);
        if (a == null) {
            return null;
        }
        String[][] strArr = new String[8][];
        strArr[0] = new String[]{"section", "PreAuthInfo"};
        strArr[1] = new String[]{"webId", i};
        strArr[2] = new String[]{"authorized", String.valueOf(a.f137781g)};
        strArr[3] = new String[]{"antiSpam", String.valueOf(a.f137780f)};
        String date = new Date(a.f137779e).toString();
        C87412m.m108593f(date, "Date(it.lastModifyTime).toString()");
        strArr[4] = new String[]{"modifyTime", date};
        strArr[5] = new String[]{"bizScene", String.valueOf(a.f137787p)};
        String[] strArr2 = new String[2];
        strArr2[0] = "appId";
        String str3 = a.f137789r;
        String str4 = "";
        if (str3 == null) {
            str3 = str4;
        }
        strArr2[1] = str3;
        strArr[6] = strArr2;
        String[] strArr3 = new String[2];
        strArr3[0] = "businessData";
        String b = C48374j0.m53713b(a.f137793v);
        if (b != null) {
            str4 = b;
        }
        strArr3[1] = str4;
        strArr[7] = strArr3;
        return strArr;
    }

    /* renamed from: UP */
    public void mo71031UP(List<? extends C45700h.C45702b> list) {
        C87412m.m108594g(list, "preAuthInfoList");
        mo71040k1(-1, list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00e1 A[RETURN, SYNTHETIC] */
    /* renamed from: Xq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo71032Xq(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r20
            r14 = r21
            r15 = 0
            if (r1 == 0) goto L_0x00e5
            if (r14 != 0) goto L_0x000b
            goto L_0x00e5
        L_0x000b:
            java.lang.String r0 = "#"
            java.lang.String r2 = ""
            java.lang.String r3 = z04.C112550d0.m153791a0(r1, r0, r2)
            java.lang.String r2 = z04.C112550d0.m153791a0(r14, r0, r2)
            boolean r2 = gy3.C87412m.m108589b(r3, r2)
            r13 = 1
            if (r2 == 0) goto L_0x00e3
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.f109363a
            r2.getClass()
            java.lang.String r2 = z04.C112550d0.m153795e0(r1, r0, r1)
            java.lang.String r0 = z04.C112550d0.m153795e0(r14, r0, r14)
            boolean r0 = gy3.C87412m.m108589b(r2, r0)
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43960i(r14, r13)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "isWebUrlEqual: target:#"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r12 = "MicroMsg.WebPrefetcher"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r12, r2)
            java.lang.String r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43960i(r1, r13)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "isWebUrlEqual: raw:#"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r12, r3)
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            if (r0 != 0) goto L_0x00dd
            iy0.a r16 = new iy0.a
            java.lang.String r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43960i(r1, r15)
            t73.b r3 = t73.C48558d.f129901M
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r4 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.f109365c
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r17 = 2032(0x7f0, float:2.847E-42)
            r18 = 0
            r0 = r16
            r1 = r20
            r15 = r12
            r12 = r17
            r14 = 1
            r13 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r0 = r16.mo71771m()
            boolean r1 = z04.C112551y.m153811k(r0)
            r1 = r1 ^ r14
            if (r1 == 0) goto L_0x00d6
            java.lang.String r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43960i(r0, r14)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "isWebUrlStorageEqual: location:#"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = ", "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r15, r0)
            r0 = r21
            r2 = 1
            java.lang.String r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43960i(r0, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "isWebUrlStorageEqual: target:#"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r15, r3)
            boolean r0 = gy3.C87412m.m108589b(r1, r0)
            goto L_0x00d8
        L_0x00d6:
            r2 = 1
            r0 = 0
        L_0x00d8:
            if (r0 == 0) goto L_0x00db
            goto L_0x00de
        L_0x00db:
            r13 = 0
            goto L_0x00df
        L_0x00dd:
            r2 = 1
        L_0x00de:
            r13 = 1
        L_0x00df:
            if (r13 == 0) goto L_0x00e3
            r15 = 1
            goto L_0x00e4
        L_0x00e3:
            r15 = 0
        L_0x00e4:
            return r15
        L_0x00e5:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dx0.C45484j.mo71032Xq(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: Y4 */
    public void mo71033Y4(long j, C45700h.C45701a aVar) {
        C40746q0 q0Var = C40746q0.f109487a;
        if (aVar != null) {
            ((C119157j) C119157j.f356862d).mo183876g(new C40750s0(j, aVar), "MicroMsg.WebPrefetcherCallbackManager");
        }
    }

    /* renamed from: Ym */
    public void mo71034Ym(List<? extends C45700h.C45702b> list) {
        C87412m.m108594g(list, "preAuthInfoList");
        Log.m105924i("MicroMsg.WebPrefetchServiceImpl", "preloadVideo:" + Integer.valueOf(list.size()));
        if (list.isEmpty()) {
            Log.m105920e("MicroMsg.WebPrefetchServiceImpl", "preloadVideo preAuthInfoList is null or empty");
            return;
        }
        for (C45700h.C45702b bVar : list) {
            C40726l.f109414a.mo63637f(bVar.f123504a, -1, bVar.f123512i);
        }
    }

    /* renamed from: a */
    public boolean mo71035a(int i, String str) {
        if (!((C87790d) C86312j.m106911c(C87790d.class)).isInstalled(XWalkEnvironment.MODULE_APPBRAND)) {
            return false;
        }
        boolean z = true;
        boolean z2 = (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_async_entrance, 65531) & i) > 0;
        if (!z2 && i == 4) {
            if (!(str == null || C112551y.m153811k(str))) {
                try {
                    z2 = C87412m.m108589b(Uri.parse(str).getHost(), "wzq.tenpay.com");
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.WebPrefetchServiceImpl", "isEntranceOpen ex=" + e.getMessage());
                }
            }
        }
        if (!(str == null || str.length() == 0)) {
            z = false;
        }
        if (z || !C45590f.m50648h(str) || i == 2) {
            return z2;
        }
        return false;
    }

    /* renamed from: ed */
    public void mo71036ed(String str, int i, String str2, String str3, String str4, String str5, int i2) {
        String str6 = str;
        int i3 = i2;
        C87412m.m108594g(str, "url");
        if (((C87790d) C86312j.m106911c(C87790d.class)).isInstalled(XWalkEnvironment.MODULE_APPBRAND)) {
            C46206e.m51503j(i, str, true, false, false, false, false, false, 240, (Object) null);
            if (!mo71035a(i3, str)) {
                Log.m105926v("MicroMsg.WebPrefetchServiceImpl", "[TRACE_PREFETCH] preAuth isEntranceOpen false, entranceBit = " + i3);
            } else if (!C40717k0.m43989g(str)) {
            } else {
                if (!C112550d0.m153801u(str, XVFSFile.PATH_SEPARATOR, false) || C112551y.m153819s(str, "http", false)) {
                    String h = C40714i.m43959h(str);
                    MMCacheSlotManager mMCacheSlotManager = C45469b.f123067n;
                    if (mMCacheSlotManager.contains(h)) {
                        C40717k0.f109363a.getClass();
                        if (!((Boolean) ((C36570n) C40717k0.f109368f).getValue()).booleanValue()) {
                            return;
                        }
                    }
                    mMCacheSlotManager.add(h);
                    long j = i3 == 4 ? 10 : 1000;
                    MMKVSlotManager mMKVSlotManager = C47539a.f127550a;
                    int i4 = i3 != 1 ? i3 != 2 ? i3 != 4 ? i3 != 8 ? i3 != 16 ? i3 != 32 ? 99 : 6 : 5 : 4 : 3 : 2 : 1;
                    Log.m105926v("MicroMsg.WebPrefetchServiceImpl", "preauth: " + h + ", entranceBit: " + i3 + ", entranceScene: " + i4);
                    C40717k0.m43990i(str, str2 == null ? "" : str2, str3 == null ? "" : str3, str4 == null ? "" : str4, str5 == null ? "" : str5, i, i4, j, (String) null, 256, (Object) null);
                }
            }
        }
    }

    /* renamed from: fH */
    public C45700h.C45703c mo71037fH(String str, String str2, String str3, String str4) {
        String str5 = str2;
        C87412m.m108594g(str, "referer");
        C87412m.m108594g(str5, "url");
        String o = C40714i.m43966o(C40714i.m43961j(str), str5);
        C48556b bVar = C48558d.f129902N;
        C40717k0.f109363a.getClass();
        return new C46353a(str2, o, bVar, C40717k0.f109366d, C40714i.m43961j(str), str3, (Boolean) null, (C48555a) null, false, str4, (String) null, 1472, (C8480h) null).mo71776r();
    }

    /* renamed from: j1 */
    public void mo71038j1(long j) {
        C40746q0 q0Var = C40746q0.f109487a;
        ((C119157j) C119157j.f356862d).mo183876g(new C40779w0(j), "MicroMsg.WebPrefetcherCallbackManager");
    }

    /* renamed from: jM */
    public C45700h.C45703c mo71039jM(String str, String str2) {
        C45700h.C45703c cVar;
        String str3 = str;
        C87412m.m108594g(str3, "url");
        C46368o oVar = C46368o.f124957a;
        String i = C40714i.m43960i(str3, false);
        C48556b bVar = C48558d.f129901M;
        C40717k0.f109363a.getClass();
        MMKVSlotManager mMKVSlotManager = C40717k0.f109365c;
        Boolean bool = Boolean.TRUE;
        boolean z = false;
        C45700h.C45703c r = new C46353a(str, i, bVar, mMKVSlotManager, (String) null, (String) null, bool, (C48555a) null, false, (String) null, (String) null, 1968, (C8480h) null).mo71776r();
        if (r != null) {
            return r;
        }
        String b = str2 == null || str2.length() == 0 ? oVar.mo71786b(str3, (String) null, true) : str2;
        if (b.length() == 0) {
            cVar = null;
        } else {
            Log.m105925i("MicroMsg.WebPrefetcherCacheManager", "getPrefetchContentResp id: %s, prefetchInfoId: %s", i, b);
            C46368o.C46369a aVar = C46368o.C46369a.f124958a;
            String decodeString = C46368o.C46369a.f124959b.decodeString(b, "");
            String str4 = decodeString == null ? "" : decodeString;
            if (str4.length() > 0) {
                z = true;
            }
            if (!z) {
                return r;
            }
            cVar = null;
            C45700h.C45703c r2 = new C46353a(str, str4, bVar, mMKVSlotManager, (String) null, (String) null, bool, (C48555a) null, false, (String) null, (String) null, 1968, (C8480h) null).mo71776r();
            if (r2 != null) {
                r2.f123527m = true;
                r2.f123515a = str3;
                return r2;
            }
        }
        return cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0013 A[SYNTHETIC] */
    /* renamed from: k1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo71040k1(long r17, java.util.List<? extends ex0.C45700h.C45702b> r19) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r2 = "preAuthInfoList"
            r3 = r19
            gy3.C87412m.m108594g(r3, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r19.iterator()
        L_0x0013:
            boolean r4 = r3.hasNext()
            java.lang.String r5 = "MicroMsg.WebPrefetchServiceImpl"
            if (r4 == 0) goto L_0x00da
            java.lang.Object r4 = r3.next()
            r6 = r4
            ex0.h$b r6 = (ex0.C45700h.C45702b) r6
            java.lang.Class<h81.h> r7 = h81.C32735h.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            h81.h r7 = (h81.C32735h) r7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "prefetchWebPage, scene: "
            r8.append(r9)
            int r9 = r6.f123506c
            r8.append(r9)
            java.lang.String r9 = ", session: "
            r8.append(r9)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)
            int r6 = r6.f123506c
            r8 = 181(0xb5, float:2.54E-43)
            r9 = 0
            r10 = 1
            if (r6 == r8) goto L_0x00b5
            r8 = 998(0x3e6, float:1.398E-42)
            if (r6 == r8) goto L_0x00d3
            switch(r6) {
                case 175: goto L_0x0096;
                case 176: goto L_0x0078;
                case 177: goto L_0x005a;
                default: goto L_0x0058;
            }
        L_0x0058:
            goto L_0x00d3
        L_0x005a:
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_webview_prefetch_api_app_brand_open
            int r6 = r7.mo58779Qe(r6, r10)
            if (r6 != r10) goto L_0x0063
            r9 = 1
        L_0x0063:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "clicfg_webview_prefetch_api_app_brand_open:"
            r6.append(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            goto L_0x00b3
        L_0x0078:
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_webview_prefetch_api_web_open
            int r6 = r7.mo58779Qe(r6, r10)
            if (r6 != r10) goto L_0x0081
            r9 = 1
        L_0x0081:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "clicfg_webview_prefetch_api_web_open:"
            r6.append(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            goto L_0x00b3
        L_0x0096:
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_webview_prefetch_api_wechat_pay_open
            int r6 = r7.mo58779Qe(r6, r10)
            if (r6 != r10) goto L_0x009f
            r9 = 1
        L_0x009f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "clicfg_webview_prefetch_api_wechat_pay_open:"
            r6.append(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
        L_0x00b3:
            r10 = r9
            goto L_0x00d3
        L_0x00b5:
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_webview_prefetch_api_sns_ad_open
            int r6 = r7.mo58779Qe(r6, r10)
            if (r6 != r10) goto L_0x00be
            r9 = 1
        L_0x00be:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "clicfg_webview_prefetch_api_sns_ad_open:"
            r6.append(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            goto L_0x00b3
        L_0x00d3:
            if (r10 == 0) goto L_0x0013
            r2.add(r4)
            goto L_0x0013
        L_0x00da:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x00e7
            java.lang.String r0 = "result is null after filter"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            return
        L_0x00e7:
            java.util.Iterator r3 = r2.iterator()
        L_0x00eb:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0111
            java.lang.Object r4 = r3.next()
            ex0.h$b r4 = (ex0.C45700h.C45702b) r4
            r5 = 99
            r4.f123507d = r5
            int r6 = r4.f123506c
            java.lang.String r7 = r4.f123504a
            java.lang.String r4 = "it.url"
            gy3.C87412m.m108593f(r7, r4)
            r8 = 1
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 240(0xf0, float:3.36E-43)
            r15 = 0
            i93.C46206e.m51503j(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x00eb
        L_0x0111:
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.m43991j(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dx0.C45484j.mo71040k1(long, java.util.List):void");
    }

    /* renamed from: q3 */
    public String mo71041q3(String str) {
        C87412m.m108594g(str, "url");
        return C40714i.m43960i(str, false);
    }

    public int ss0(String str) {
        MMKVSlotManager mMKVSlotManager = C47539a.f127550a;
        if (str == null) {
            return 0;
        }
        String i = C40714i.m43960i(str, false);
        MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) C47539a.f127550a.findSlot(i);
        if (multiProcessMMKV != null) {
            return multiProcessMMKV.getInt(i, 0);
        }
        return 0;
    }

    public String ul0(String str) {
        if (str == null) {
            return "";
        }
        String str2 = null;
        m25 a = C46368o.C46369a.m51704a(str, (String) null);
        if (a != null) {
            str2 = a.f137783i;
        }
        return str2 == null ? "" : str2;
    }
}
