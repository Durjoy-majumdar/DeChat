package ju0;

import com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p301cd.C16921b0;
import p301cd.C16923f;
import p301cd.C16924g;

/* renamed from: ju0.h */
public final class C21284h implements C16923f {

    /* renamed from: c */
    public final C16924g f60138c;

    public C21284h(C17643a aVar) {
        C16924g gVar;
        C87412m.m108594g(aVar, "weEffectManager");
        if (aVar instanceof C21285q) {
            Log.m105928w("MicroMsg.AppBrand.MakeupApplyAdapter", "weEffectManager is IWeEffectWorkaroundManager");
            gVar = ((C21285q) aVar).f60141e.mo18014h();
        } else {
            gVar = new C16921b0(aVar);
        }
        this.f60138c = gVar;
    }

    /* renamed from: b */
    public void mo18012b(C17643a.C17645c cVar, String str) {
        C87412m.m108594g(cVar, "type");
        C87412m.m108594g(str, "path");
        this.f60138c.mo18012b(cVar, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo18015c(p301cd.C113283b r10) {
        /*
            r9 = this;
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r10, r0)
            ju0.i r0 = ju0.C99037i.f290336b
            r0.getClass()
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            com.tencent.mm.vfs.m1 r2 = r0.mo138382a()
            java.lang.String r3 = r0.mo138384c(r10)
            r1.<init>((com.tencent.p014mm.vfs.C86009m1) r2, (java.lang.String) r3)
            boolean r2 = r1.mo119967g()
            r3 = 1
            r4 = 0
            java.lang.String r5 = "MicroMsg.AppBrand.MakeupApplyAdapterCoreLogic"
            r6 = 0
            if (r2 != 0) goto L_0x0033
            java.lang.String r2 = r1.mo119971i()
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106461v(r2)
            if (r2 != 0) goto L_0x0033
            java.lang.String r10 = "convert2PathImpl, create resDir fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r10)
            goto L_0x00e1
        L_0x0033:
            ju0.c r2 = new ju0.c
            r2.<init>()
            float r7 = r10.f338942a
            r2.f60110a = r7
            int r7 = r10.f338943b
            r2.f60111b = r7
            cd.a r7 = r10.f338944c
            int r7 = r7.f338941d
            r2.f60112c = r7
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1
            java.lang.String r10 = r10.f338945d
            r7.<init>((java.lang.String) r10)
            com.tencent.mm.vfs.m1 r10 = r0.mo138383b(r1, r7)
            if (r10 == 0) goto L_0x0058
            java.lang.String r10 = r10.getName()
            goto L_0x0059
        L_0x0058:
            r10 = r6
        L_0x0059:
            java.lang.String r0 = ""
            if (r10 != 0) goto L_0x005e
            r10 = r0
        L_0x005e:
            r2.f60113d = r10
            float r7 = r2.f60110a
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x006a
            r7 = 1
            goto L_0x006b
        L_0x006a:
            r7 = 0
        L_0x006b:
            if (r7 != 0) goto L_0x007f
            r7 = -1
            int r8 = r2.f60112c
            if (r7 == r8) goto L_0x007f
            int r10 = r10.length()
            if (r10 <= 0) goto L_0x007a
            r10 = 1
            goto L_0x007b
        L_0x007a:
            r10 = 0
        L_0x007b:
            if (r10 == 0) goto L_0x007f
            r10 = 1
            goto L_0x0080
        L_0x007f:
            r10 = 0
        L_0x0080:
            if (r10 != 0) goto L_0x008f
            java.lang.String r10 = "convert2PathImpl, flattenInfo is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r10)
            java.lang.String r10 = r1.mo119971i()
            com.tencent.p014mm.vfs.C86013q1.m106445f(r10)
            goto L_0x00e1
        L_0x008f:
            com.tencent.mm.vfs.m1 r10 = new com.tencent.mm.vfs.m1
            java.lang.String r6 = "config.json"
            r10.<init>((com.tencent.p014mm.vfs.C86009m1) r1, (java.lang.String) r6)
            java.lang.String r10 = r10.mo119971i()
            java.lang.String r6 = "configFile.absolutePath"
            gy3.C87412m.m108593f(r10, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "convert2PathImpl, configPath: "
            r6.append(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r6)
            org.json.JSONObject r2 = r2.mo33258a()     // Catch:{ Exception -> 0x00d1 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00d1 }
            java.lang.String r5 = "obj.toJson().toString()"
            gy3.C87412m.m108593f(r2, r5)     // Catch:{ Exception -> 0x00d1 }
            java.nio.charset.Charset r5 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x00d1 }
            byte[] r2 = r2.getBytes(r5)     // Catch:{ Exception -> 0x00d1 }
            java.lang.String r5 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r2, r5)     // Catch:{ Exception -> 0x00d1 }
            int r5 = r2.length     // Catch:{ Exception -> 0x00d1 }
            com.tencent.p014mm.vfs.C86013q1.m106438T(r10, r2, r4, r5)     // Catch:{ Exception -> 0x00d1 }
            goto L_0x00d9
        L_0x00d1:
            r10 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r5 = "MicroMsg.BaseJsonObject"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r10, r0, r2)
        L_0x00d9:
            java.lang.String r10 = r1.mo119971i()
            java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106448i(r10, r4)
        L_0x00e1:
            if (r6 == 0) goto L_0x00eb
            cd.g r10 = r9.f60138c
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$c r0 = com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a.C17645c.MAKEUP_BLUSHER_STICK
            r10.mo18012b(r0, r6)
            goto L_0x00ec
        L_0x00eb:
            r3 = 0
        L_0x00ec:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ju0.C21284h.mo18015c(cd.b):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b8  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo18016d(p301cd.C113285d r10) {
        /*
            r9 = this;
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r10, r0)
            ju0.i r0 = ju0.C99037i.f290336b
            r0.getClass()
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            com.tencent.mm.vfs.m1 r2 = r0.mo138382a()
            java.lang.String r3 = r0.mo138384c(r10)
            r1.<init>((com.tencent.p014mm.vfs.C86009m1) r2, (java.lang.String) r3)
            boolean r2 = r1.mo119967g()
            r3 = 1
            r4 = 0
            java.lang.String r5 = "MicroMsg.AppBrand.MakeupApplyAdapterCoreLogic"
            r6 = 0
            if (r2 != 0) goto L_0x0033
            java.lang.String r2 = r1.mo119971i()
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106461v(r2)
            if (r2 != 0) goto L_0x0033
            java.lang.String r10 = "convert2PathImpl, create resDir fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r10)
            goto L_0x010a
        L_0x0033:
            ju0.e r2 = new ju0.e
            r2.<init>()
            float r7 = r10.f338953a
            r2.f60121a = r7
            cd.a r7 = r10.f338954b
            int r7 = r7.f338941d
            r2.f60122b = r7
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1
            java.lang.String r8 = r10.f338955c
            r7.<init>((java.lang.String) r8)
            com.tencent.mm.vfs.m1 r7 = r0.mo138383b(r1, r7)
            if (r7 == 0) goto L_0x0054
            java.lang.String r7 = r7.getName()
            goto L_0x0055
        L_0x0054:
            r7 = r6
        L_0x0055:
            java.lang.String r8 = ""
            if (r7 != 0) goto L_0x005a
            r7 = r8
        L_0x005a:
            r2.f60123c = r7
            java.lang.String r7 = r10.f338957e
            if (r7 == 0) goto L_0x0069
            int r7 = r7.length()
            if (r7 != 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r7 = 0
            goto L_0x006a
        L_0x0069:
            r7 = 1
        L_0x006a:
            if (r7 == 0) goto L_0x006e
            r10 = r6
            goto L_0x0085
        L_0x006e:
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1
            java.lang.String r10 = r10.f338957e
            gy3.C87412m.m108591d(r10)
            r7.<init>((java.lang.String) r10)
            com.tencent.mm.vfs.m1 r10 = r0.mo138383b(r1, r7)
            if (r10 == 0) goto L_0x0084
            java.lang.String r10 = r10.getName()
            if (r10 != 0) goto L_0x0085
        L_0x0084:
            r10 = r8
        L_0x0085:
            r2.f60124d = r10
            float r10 = r2.f60121a
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r10 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r10 != 0) goto L_0x0091
            r10 = 1
            goto L_0x0092
        L_0x0091:
            r10 = 0
        L_0x0092:
            if (r10 != 0) goto L_0x00a8
            r10 = -1
            int r0 = r2.f60122b
            if (r10 == r0) goto L_0x00a8
            java.lang.String r10 = r2.f60123c
            int r10 = r10.length()
            if (r10 <= 0) goto L_0x00a3
            r10 = 1
            goto L_0x00a4
        L_0x00a3:
            r10 = 0
        L_0x00a4:
            if (r10 == 0) goto L_0x00a8
            r10 = 1
            goto L_0x00a9
        L_0x00a8:
            r10 = 0
        L_0x00a9:
            if (r10 != 0) goto L_0x00b8
            java.lang.String r10 = "convert2PathImpl, flattenInfo is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r10)
            java.lang.String r10 = r1.mo119971i()
            com.tencent.p014mm.vfs.C86013q1.m106445f(r10)
            goto L_0x010a
        L_0x00b8:
            com.tencent.mm.vfs.m1 r10 = new com.tencent.mm.vfs.m1
            java.lang.String r0 = "config.json"
            r10.<init>((com.tencent.p014mm.vfs.C86009m1) r1, (java.lang.String) r0)
            java.lang.String r10 = r10.mo119971i()
            java.lang.String r0 = "configFile.absolutePath"
            gy3.C87412m.m108593f(r10, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "convert2PathImpl, configPath: "
            r0.append(r6)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
            org.json.JSONObject r0 = r2.mo33258a()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00fa }
            java.lang.String r2 = "obj.toJson().toString()"
            gy3.C87412m.m108593f(r0, r2)     // Catch:{ Exception -> 0x00fa }
            java.nio.charset.Charset r2 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x00fa }
            byte[] r0 = r0.getBytes(r2)     // Catch:{ Exception -> 0x00fa }
            java.lang.String r2 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r0, r2)     // Catch:{ Exception -> 0x00fa }
            int r2 = r0.length     // Catch:{ Exception -> 0x00fa }
            com.tencent.p014mm.vfs.C86013q1.m106438T(r10, r0, r4, r2)     // Catch:{ Exception -> 0x00fa }
            goto L_0x0102
        L_0x00fa:
            r10 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = "MicroMsg.BaseJsonObject"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r10, r8, r0)
        L_0x0102:
            java.lang.String r10 = r1.mo119971i()
            java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106448i(r10, r4)
        L_0x010a:
            if (r6 == 0) goto L_0x0114
            cd.g r10 = r9.f60138c
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$c r0 = com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a.C17645c.MAKEUP_EYE_SHADOW
            r10.mo18012b(r0, r6)
            goto L_0x0115
        L_0x0114:
            r3 = 0
        L_0x0115:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ju0.C21284h.mo18016d(cd.d):boolean");
    }

    /* renamed from: h */
    public C16924g mo18014h() {
        return this.f60138c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009e  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo18017i(p301cd.C113284c r11) {
        /*
            r10 = this;
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r11, r0)
            ju0.i r0 = ju0.C99037i.f290336b
            r0.getClass()
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            com.tencent.mm.vfs.m1 r2 = r0.mo138382a()
            java.lang.String r3 = r0.mo138384c(r11)
            r1.<init>((com.tencent.p014mm.vfs.C86009m1) r2, (java.lang.String) r3)
            boolean r2 = r1.mo119967g()
            r3 = 1
            r4 = 0
            java.lang.String r5 = "MicroMsg.AppBrand.MakeupApplyAdapterCoreLogic"
            r6 = 0
            if (r2 != 0) goto L_0x0033
            java.lang.String r2 = r1.mo119971i()
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106461v(r2)
            if (r2 != 0) goto L_0x0033
            java.lang.String r11 = "convert2PathImpl, create resDir fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r11)
            goto L_0x00f0
        L_0x0033:
            ju0.d r2 = new ju0.d
            r2.<init>()
            float r7 = r11.f338947a
            r2.f60115a = r7
            int r7 = r11.f338948b
            r2.f60116b = r7
            cd.a r7 = r11.f338949c
            int r7 = r7.f338941d
            r2.f60117c = r7
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1
            java.lang.String r8 = r11.f338950d
            r7.<init>((java.lang.String) r8)
            com.tencent.mm.vfs.m1 r0 = r0.mo138383b(r1, r7)
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = r0.getName()
            goto L_0x0059
        L_0x0058:
            r0 = r6
        L_0x0059:
            java.lang.String r7 = ""
            if (r0 != 0) goto L_0x005e
            r0 = r7
        L_0x005e:
            r2.f60118d = r0
            float r11 = r11.f338952f
            r2.f60119e = r11
            float r11 = r2.f60115a
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r11 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x006e
            r11 = 1
            goto L_0x006f
        L_0x006e:
            r11 = 0
        L_0x006f:
            if (r11 != 0) goto L_0x008e
            r11 = -1
            int r9 = r2.f60117c
            if (r11 == r9) goto L_0x008e
            int r11 = r0.length()
            if (r11 <= 0) goto L_0x007e
            r11 = 1
            goto L_0x007f
        L_0x007e:
            r11 = 0
        L_0x007f:
            if (r11 == 0) goto L_0x008e
            float r11 = r2.f60119e
            int r11 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x0089
            r11 = 1
            goto L_0x008a
        L_0x0089:
            r11 = 0
        L_0x008a:
            if (r11 != 0) goto L_0x008e
            r11 = 1
            goto L_0x008f
        L_0x008e:
            r11 = 0
        L_0x008f:
            if (r11 != 0) goto L_0x009e
            java.lang.String r11 = "convert2PathImpl, flattenInfo is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r11)
            java.lang.String r11 = r1.mo119971i()
            com.tencent.p014mm.vfs.C86013q1.m106445f(r11)
            goto L_0x00f0
        L_0x009e:
            com.tencent.mm.vfs.m1 r11 = new com.tencent.mm.vfs.m1
            java.lang.String r0 = "config.json"
            r11.<init>((com.tencent.p014mm.vfs.C86009m1) r1, (java.lang.String) r0)
            java.lang.String r11 = r11.mo119971i()
            java.lang.String r0 = "configFile.absolutePath"
            gy3.C87412m.m108593f(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "convert2PathImpl, configPath: "
            r0.append(r6)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
            org.json.JSONObject r0 = r2.mo33258a()     // Catch:{ Exception -> 0x00e0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00e0 }
            java.lang.String r2 = "obj.toJson().toString()"
            gy3.C87412m.m108593f(r0, r2)     // Catch:{ Exception -> 0x00e0 }
            java.nio.charset.Charset r2 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x00e0 }
            byte[] r0 = r0.getBytes(r2)     // Catch:{ Exception -> 0x00e0 }
            java.lang.String r2 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r0, r2)     // Catch:{ Exception -> 0x00e0 }
            int r2 = r0.length     // Catch:{ Exception -> 0x00e0 }
            com.tencent.p014mm.vfs.C86013q1.m106438T(r11, r0, r4, r2)     // Catch:{ Exception -> 0x00e0 }
            goto L_0x00e8
        L_0x00e0:
            r11 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r2 = "MicroMsg.BaseJsonObject"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r11, r7, r0)
        L_0x00e8:
            java.lang.String r11 = r1.mo119971i()
            java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106448i(r11, r4)
        L_0x00f0:
            if (r6 == 0) goto L_0x00fa
            cd.g r11 = r10.f60138c
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$c r0 = com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a.C17645c.MAKEUP_EYE_BROW
            r11.mo18012b(r0, r6)
            goto L_0x00fb
        L_0x00fa:
            r3 = 0
        L_0x00fb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ju0.C21284h.mo18017i(cd.c):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00db A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo18018k(com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17652c r11) {
        /*
            r10 = this;
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r11, r0)
            ju0.i r0 = ju0.C99037i.f290336b
            r0.getClass()
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            com.tencent.mm.vfs.m1 r2 = r0.mo138382a()
            java.lang.String r0 = r0.mo138384c(r11)
            r1.<init>((com.tencent.p014mm.vfs.C86009m1) r2, (java.lang.String) r0)
            boolean r0 = r1.mo119967g()
            r2 = 1
            r3 = 0
            java.lang.String r4 = "MicroMsg.AppBrand.MakeupApplyAdapterCoreLogic"
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = r1.mo119971i()
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106461v(r0)
            if (r0 != 0) goto L_0x0031
            java.lang.String r11 = "convert2PathImpl, create resDir fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r11)
            goto L_0x007b
        L_0x0031:
            ju0.g r0 = new ju0.g
            r0.<init>()
            float r5 = r11.f48026a
            r0.f60130a = r5
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.c$a r6 = r11.f48027b
            int r7 = r6.f48031a
            r0.f60131b = r7
            int r8 = r6.f48032b
            r0.f60132c = r8
            int r6 = r6.f48033c
            r0.f60133d = r6
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.c$b r9 = r11.f48028c
            int r9 = r9.f48035d
            r0.f60134e = r9
            int r9 = r11.f48029d
            r0.f60135f = r9
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.c$c r11 = r11.f48030e
            int r11 = r11.f48038d
            r0.f60136g = r11
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x0060
            r11 = 1
            goto L_0x0061
        L_0x0060:
            r11 = 0
        L_0x0061:
            if (r11 != 0) goto L_0x006c
            r11 = -1
            if (r11 == r7) goto L_0x006c
            if (r11 == r8) goto L_0x006c
            if (r11 == r6) goto L_0x006c
            r11 = 1
            goto L_0x006d
        L_0x006c:
            r11 = 0
        L_0x006d:
            if (r11 != 0) goto L_0x007d
            java.lang.String r11 = "convert2PathImpl, flattenInfo is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r11)
            java.lang.String r11 = r1.mo119971i()
            com.tencent.p014mm.vfs.C86013q1.m106445f(r11)
        L_0x007b:
            r11 = 0
            goto L_0x00d1
        L_0x007d:
            com.tencent.mm.vfs.m1 r11 = new com.tencent.mm.vfs.m1
            java.lang.String r5 = "config.json"
            r11.<init>((com.tencent.p014mm.vfs.C86009m1) r1, (java.lang.String) r5)
            java.lang.String r11 = r11.mo119971i()
            java.lang.String r5 = "configFile.absolutePath"
            gy3.C87412m.m108593f(r11, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "convert2PathImpl, configPath: "
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r5)
            org.json.JSONObject r0 = r0.mo33258a()     // Catch:{ Exception -> 0x00bf }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00bf }
            java.lang.String r4 = "obj.toJson().toString()"
            gy3.C87412m.m108593f(r0, r4)     // Catch:{ Exception -> 0x00bf }
            java.nio.charset.Charset r4 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x00bf }
            byte[] r0 = r0.getBytes(r4)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r4 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r0, r4)     // Catch:{ Exception -> 0x00bf }
            int r4 = r0.length     // Catch:{ Exception -> 0x00bf }
            com.tencent.p014mm.vfs.C86013q1.m106438T(r11, r0, r3, r4)     // Catch:{ Exception -> 0x00bf }
            goto L_0x00c9
        L_0x00bf:
            r11 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r4 = "MicroMsg.BaseJsonObject"
            java.lang.String r5 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r11, r5, r0)
        L_0x00c9:
            java.lang.String r11 = r1.mo119971i()
            java.lang.String r11 = com.tencent.p014mm.vfs.C86013q1.m106448i(r11, r3)
        L_0x00d1:
            if (r11 == 0) goto L_0x00db
            cd.g r0 = r10.f60138c
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$c r1 = com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a.C17645c.MAKEUP_LIP_STICK
            r0.mo18012b(r1, r11)
            goto L_0x00dc
        L_0x00db:
            r2 = 0
        L_0x00dc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ju0.C21284h.mo18018k(com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.c):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo18019l(p301cd.C113286e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r10, r0)
            ju0.i r0 = ju0.C99037i.f290336b
            r0.getClass()
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            com.tencent.mm.vfs.m1 r2 = r0.mo138382a()
            java.lang.String r3 = r0.mo138384c(r10)
            r1.<init>((com.tencent.p014mm.vfs.C86009m1) r2, (java.lang.String) r3)
            boolean r2 = r1.mo119967g()
            r3 = 1
            r4 = 0
            java.lang.String r5 = "MicroMsg.AppBrand.MakeupApplyAdapterCoreLogic"
            r6 = 0
            if (r2 != 0) goto L_0x0033
            java.lang.String r2 = r1.mo119971i()
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106461v(r2)
            if (r2 != 0) goto L_0x0033
            java.lang.String r10 = "convert2PathImpl, create resDir fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r10)
            goto L_0x00d6
        L_0x0033:
            ju0.f r2 = new ju0.f
            r2.<init>()
            int r7 = r10.f338959a
            r2.f60126a = r7
            float r7 = r10.f338960b
            r2.f60127b = r7
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1
            java.lang.String r10 = r10.f338961c
            r7.<init>((java.lang.String) r10)
            com.tencent.mm.vfs.m1 r10 = r0.mo138383b(r1, r7)
            if (r10 == 0) goto L_0x0052
            java.lang.String r10 = r10.getName()
            goto L_0x0053
        L_0x0052:
            r10 = r6
        L_0x0053:
            java.lang.String r0 = ""
            if (r10 != 0) goto L_0x0058
            r10 = r0
        L_0x0058:
            r2.f60128c = r10
            float r7 = r2.f60127b
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x0064
            r7 = 1
            goto L_0x0065
        L_0x0064:
            r7 = 0
        L_0x0065:
            if (r7 != 0) goto L_0x0074
            int r10 = r10.length()
            if (r10 <= 0) goto L_0x006f
            r10 = 1
            goto L_0x0070
        L_0x006f:
            r10 = 0
        L_0x0070:
            if (r10 == 0) goto L_0x0074
            r10 = 1
            goto L_0x0075
        L_0x0074:
            r10 = 0
        L_0x0075:
            if (r10 != 0) goto L_0x0084
            java.lang.String r10 = "convert2PathImpl, flattenInfo is invalid"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r10)
            java.lang.String r10 = r1.mo119971i()
            com.tencent.p014mm.vfs.C86013q1.m106445f(r10)
            goto L_0x00d6
        L_0x0084:
            com.tencent.mm.vfs.m1 r10 = new com.tencent.mm.vfs.m1
            java.lang.String r6 = "config.json"
            r10.<init>((com.tencent.p014mm.vfs.C86009m1) r1, (java.lang.String) r6)
            java.lang.String r10 = r10.mo119971i()
            java.lang.String r6 = "configFile.absolutePath"
            gy3.C87412m.m108593f(r10, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "convert2PathImpl, configPath: "
            r6.append(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r6)
            org.json.JSONObject r2 = r2.mo33258a()     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r5 = "obj.toJson().toString()"
            gy3.C87412m.m108593f(r2, r5)     // Catch:{ Exception -> 0x00c6 }
            java.nio.charset.Charset r5 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x00c6 }
            byte[] r2 = r2.getBytes(r5)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r5 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r2, r5)     // Catch:{ Exception -> 0x00c6 }
            int r5 = r2.length     // Catch:{ Exception -> 0x00c6 }
            com.tencent.p014mm.vfs.C86013q1.m106438T(r10, r2, r4, r5)     // Catch:{ Exception -> 0x00c6 }
            goto L_0x00ce
        L_0x00c6:
            r10 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r5 = "MicroMsg.BaseJsonObject"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r10, r0, r2)
        L_0x00ce:
            java.lang.String r10 = r1.mo119971i()
            java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106448i(r10, r4)
        L_0x00d6:
            if (r6 == 0) goto L_0x00e0
            cd.g r10 = r9.f60138c
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$c r0 = com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a.C17645c.MAKEUP_FACE_CONTOUR
            r10.mo18012b(r0, r6)
            goto L_0x00e1
        L_0x00e0:
            r3 = 0
        L_0x00e1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ju0.C21284h.mo18019l(cd.e):boolean");
    }
}
