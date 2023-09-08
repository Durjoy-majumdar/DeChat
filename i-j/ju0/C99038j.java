package ju0;

import com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p301cd.C92415c0;
import p301cd.C92417j;
import p301cd.C92418k;

/* renamed from: ju0.j */
public final class C99038j implements C92417j {

    /* renamed from: c */
    public final C92418k f290337c;

    public C99038j(C17643a aVar) {
        C92418k kVar;
        C87412m.m108594g(aVar, "weEffectManager");
        if (aVar instanceof C21285q) {
            Log.m105928w("MicroMsg.AppBrand.StickerApplyAdapter", "weEffectManager is IWeEffectWorkaroundManager");
            kVar = ((C21285q) aVar).f60140d.mo126420e();
        } else {
            kVar = new C92415c0(aVar);
        }
        this.f290337c = kVar;
    }

    /* renamed from: a */
    public void mo126419a(C17643a.C17646d dVar, String str) {
        C87412m.m108594g(dVar, "type");
        C87412m.m108594g(str, "path");
        this.f290337c.mo126419a(dVar, str);
    }

    /* renamed from: e */
    public C92418k mo126420e() {
        return this.f290337c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0157 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo18020g(com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a.C17646d r20, java.util.List<com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo> r21, org.json.JSONObject r22) {
        /*
            r19 = this;
            r1 = r20
            r0 = r21
            java.lang.String r2 = "type"
            gy3.C87412m.m108594g(r1, r2)
            java.lang.String r2 = "stickerInfo"
            gy3.C87412m.m108594g(r0, r2)
            ju0.m r2 = ju0.C99039m.f290338b
            r2.getClass()
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1
            com.tencent.mm.vfs.m1 r2 = r2.mo138382a()
            r4 = 0
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo[] r5 = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo[r4]
            java.lang.Object[] r5 = r0.toArray(r5)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            gy3.C87412m.m108592e(r5, r6)
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo[] r5 = (com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo[]) r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = 91
            r6.append(r7)
            int r7 = r5.length
            r8 = 0
        L_0x0036:
            if (r8 >= r7) goto L_0x0049
            r9 = r5[r8]
            java.lang.String r9 = r9.mo21064a()
            r6.append(r9)
            java.lang.String r9 = ", "
            r6.append(r9)
            int r8 = r8 + 1
            goto L_0x0036
        L_0x0049:
            r5 = 93
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "StringBuilder().apply(builderAction).toString()"
            gy3.C87412m.m108593f(r5, r6)
            java.nio.charset.Charset r6 = z04.C119027c.f356488a
            byte[] r5 = r5.getBytes(r6)
            java.lang.String r6 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r5, r6)
            java.lang.String r5 = p823sg.C90193h.m112878f(r5)
            java.lang.String r7 = "getMessageDigest(itemInfoListStr.toByteArray())"
            gy3.C87412m.m108593f(r5, r7)
            r3.<init>((com.tencent.p014mm.vfs.C86009m1) r2, (java.lang.String) r5)
            java.lang.String r2 = ""
            ju0.l r5 = new ju0.l
            r5.<init>()
            java.util.List r0 = sx3.C110818d0.m150943o0(r0, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r7 = 10
            int r7 = sx3.C36907w.m41090l(r0, r7)
            r5.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x0089:
            boolean r7 = r0.hasNext()
            java.lang.String r8 = "MicroMsg.AppBrand.StickerApplyAdapterCoreLogic"
            if (r7 == 0) goto L_0x01ab
            java.lang.Object r7 = r0.next()
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo r7 = (com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo) r7
            ju0.m r11 = ju0.C99039m.f290338b
            int r12 = r7.f264607c
            com.tencent.mm.vfs.m1 r13 = new com.tencent.mm.vfs.m1
            java.lang.String r14 = r7.f264609e
            r13.<init>((java.lang.String) r14)
            java.lang.String r14 = r7.f264606b
            r11.getClass()
            com.tencent.mm.vfs.m1 r11 = new com.tencent.mm.vfs.m1
            r11.<init>((com.tencent.p014mm.vfs.C86009m1) r3, (java.lang.String) r14)
            io0.f r14 = io0.C33370f.f90435a
            boolean r14 = r14.mo59107a(r11)
            if (r14 == 0) goto L_0x00cf
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "copyStickerItemResourcesIfNeed, stickerItemDir("
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = ") already exist"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r11)
            goto L_0x0154
        L_0x00cf:
            my3.j r14 = my3.C61595o.m72301i(r4, r12)
            ju0.k r15 = new ju0.k
            r15.<init>(r14)
            com.tencent.mm.vfs.m1[] r13 = r13.mo119986w(r15)
            if (r13 != 0) goto L_0x00e0
            com.tencent.mm.vfs.m1[] r13 = new com.tencent.p014mm.vfs.C86009m1[r4]
        L_0x00e0:
            int r14 = r13.length
            if (r12 == r14) goto L_0x00e9
            java.lang.String r11 = "copyStickerItemResourcesIfNeed, can not find all res"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r11)
            goto L_0x0152
        L_0x00e9:
            boolean r12 = r11.mo119967g()
            if (r12 != 0) goto L_0x00fb
            boolean r12 = r11.mo119987x()
            if (r12 != 0) goto L_0x00fb
            java.lang.String r11 = "copyStickerItemResourcesIfNeed, create stickerItemDir fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r11)
            goto L_0x0152
        L_0x00fb:
            int r12 = r13.length
            r14 = 0
        L_0x00fd:
            if (r14 >= r12) goto L_0x0145
            r15 = r13[r14]
            java.lang.String r9 = r15.getName()
            java.lang.String r10 = "itemResFile.name"
            gy3.C87412m.m108593f(r9, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r4 = "copyStickerItemResourcesIfNeed, itemResName: "
            r10.append(r4)
            r10.append(r9)
            java.lang.String r4 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r4)
            com.tencent.mm.vfs.m1 r4 = new com.tencent.mm.vfs.m1
            r4.<init>((com.tencent.p014mm.vfs.C86009m1) r11, (java.lang.String) r9)
            r9 = 0
            java.lang.String r15 = r15.mo119971i()
            java.lang.String r4 = r4.mo119971i()
            r16 = r12
            r12 = 0
            long r17 = com.tencent.p014mm.vfs.C86013q1.m106443d(r15, r4, r12)
            int r4 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r4 <= 0) goto L_0x013f
            java.lang.String r4 = "copyStickerItemResourcesIfNeed, copy fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r4)
            goto L_0x0152
        L_0x013f:
            int r14 = r14 + 1
            r12 = r16
            r4 = 0
            goto L_0x00fd
        L_0x0145:
            io0.f r4 = io0.C33370f.f90435a
            boolean r4 = r4.mo59108b(r11)
            if (r4 != 0) goto L_0x0154
            java.lang.String r4 = "copyStickerItemResourcesIfNeed, record stickerItemDir fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r4)
        L_0x0152:
            r4 = 0
            goto L_0x0155
        L_0x0154:
            r4 = 1
        L_0x0155:
            if (r4 != 0) goto L_0x015c
            r0 = 0
            r4 = 0
            r7 = 1
            goto L_0x0241
        L_0x015c:
            java.lang.String r4 = r7.f264606b
            rh3.e r8 = new rh3.e
            r8.<init>()
            java.lang.String r9 = r7.f264606b
            java.lang.String r10 = "<set-?>"
            gy3.C87412m.m108594g(r9, r10)
            int r9 = r7.f264607c
            r8.f296963a = r9
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction r9 = r7.f264608d
            int r9 = r9.getJsonVal()
            r8.f296964b = r9
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$d r9 = com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a.C17646d.STICKER_BACK
            if (r9 != r1) goto L_0x0183
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType r7 = r7.f264612h
            int r7 = r7.getJsonVal()
            r8.f296965c = r7
            goto L_0x01a0
        L_0x0183:
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$a r7 = r7.f264611g
            if (r7 == 0) goto L_0x01a0
            r9 = 4
            double[] r9 = new double[r9]
            double r10 = r7.f78586a
            r12 = 0
            r9[r12] = r10
            double r10 = r7.f78587b
            r12 = 1
            r9[r12] = r10
            double r10 = r7.f78588c
            r12 = 2
            r9[r12] = r10
            r10 = 3
            double r11 = r7.f78589d
            r9[r10] = r11
            r8.f296968f = r9
        L_0x01a0:
            rx3.l r7 = new rx3.l
            r7.<init>(r4, r8)
            r5.add(r7)
            r4 = 0
            goto L_0x0089
        L_0x01ab:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            sx3.C90364q0.m113153l(r5, r0)
            ju0.o r4 = new ju0.o
            r4.<init>()
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r4.f296970b = r9
            int r5 = r20.ordinal()
            if (r5 == 0) goto L_0x01d4
            r7 = 1
            if (r5 == r7) goto L_0x01d1
            r9 = 2
            if (r5 != r9) goto L_0x01cb
            java.lang.String r5 = "Sticker2D"
            goto L_0x01d7
        L_0x01cb:
            rx3.j r0 = new rx3.j
            r0.<init>()
            throw r0
        L_0x01d1:
            java.lang.String r5 = "StickerFixed"
            goto L_0x01d7
        L_0x01d4:
            r7 = 1
            java.lang.String r5 = "Segment"
        L_0x01d7:
            r4.f296971c = r5
            r4.f296974f = r0
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$d r0 = com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a.C17646d.STICKER_2D
            if (r0 != r1) goto L_0x01e3
            r0 = r22
            r4.f290340g = r0
        L_0x01e3:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.String r5 = "config.json"
            r0.<init>((com.tencent.p014mm.vfs.C86009m1) r3, (java.lang.String) r5)
            java.lang.String r0 = r0.mo119971i()
            java.lang.String r5 = "stickerConfigFile.absolutePath"
            gy3.C87412m.m108593f(r0, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "realConvert2StickerApplyParams, stickerConfigPath: "
            r5.append(r9)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r5)
            org.json.JSONObject r4 = r4.mo33258a()     // Catch:{ Exception -> 0x0227 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0227 }
            java.lang.String r5 = "obj.toJson().toString()"
            gy3.C87412m.m108593f(r4, r5)     // Catch:{ Exception -> 0x0227 }
            java.nio.charset.Charset r5 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x0227 }
            byte[] r4 = r4.getBytes(r5)     // Catch:{ Exception -> 0x0227 }
            gy3.C87412m.m108593f(r4, r6)     // Catch:{ Exception -> 0x0227 }
            int r5 = r4.length     // Catch:{ Exception -> 0x0227 }
            r6 = 0
            com.tencent.p014mm.vfs.C86013q1.m106438T(r0, r4, r6, r5)     // Catch:{ Exception -> 0x0227 }
            r4 = 0
            goto L_0x0230
        L_0x0227:
            r0 = move-exception
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "MicroMsg.BaseJsonObject"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r2, r5)
        L_0x0230:
            ju0.n r0 = new ju0.n
            java.lang.String r5 = r3.mo119971i()
            java.lang.String r5 = com.tencent.p014mm.vfs.C86013q1.m106448i(r5, r4)
            if (r5 != 0) goto L_0x023d
            goto L_0x023e
        L_0x023d:
            r2 = r5
        L_0x023e:
            r0.<init>(r1, r2)
        L_0x0241:
            if (r0 != 0) goto L_0x024a
            java.lang.String r1 = r3.mo119971i()
            com.tencent.p014mm.vfs.C86013q1.m106445f(r1)
        L_0x024a:
            if (r0 == 0) goto L_0x0259
            r1 = r19
            cd.k r2 = r1.f290337c
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$d r3 = r0.f91145a
            java.lang.String r0 = r0.f91146b
            r2.mo126419a(r3, r0)
            r4 = 1
            goto L_0x025b
        L_0x0259:
            r1 = r19
        L_0x025b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ju0.C99038j.mo18020g(com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$d, java.util.List, org.json.JSONObject):boolean");
    }
}
