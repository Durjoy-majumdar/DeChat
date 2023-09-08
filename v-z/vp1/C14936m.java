package vp1;

/* renamed from: vp1.m */
public final class C14936m {

    /* renamed from: a */
    public static final C14936m f40971a = new C14936m();

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r2 != false) goto L_0x0084;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.finder.storage.FinderItem mo13978a(te3.C50140kk0 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "data"
            gy3.C87412m.m108594g(r9, r0)
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r9.f136839f
            int r1 = r9.f136842i
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x000f
            r1 = 1
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            r4 = 0
            if (r1 == 0) goto L_0x0087
            if (r0 == 0) goto L_0x0087
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r1 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
            up1.p r1 = r1.Dx0()
            int r5 = r9.f136837d
            r6 = 2
            if (r5 != r6) goto L_0x003f
            long r5 = r9.f136838e
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r1.mo13662Lo(r5)
            if (r9 == 0) goto L_0x003d
            long r0 = r9.getLocalId()
            r5 = 0
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r2 = 0
        L_0x003a:
            if (r2 == 0) goto L_0x003d
            goto L_0x0084
        L_0x003d:
            r9 = r4
            goto L_0x0084
        L_0x003f:
            com.tencent.mm.plugin.finder.storage.FinderItem$a r1 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
            int r9 = r9.f136840g
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r1.mo79056a(r0, r9)
            fe1.d$b r0 = fe1.C58961d.f168673a
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r9.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r1.contact
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = r1.username
            goto L_0x0055
        L_0x0054:
            r1 = r4
        L_0x0055:
            fe1.q r1 = r0.mo84155b(r1)
            if (r1 != 0) goto L_0x0064
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r9.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r1.contact
            fe1.C58961d.C58963b.m68837m(r0, r1, r3, r6, r4)
        L_0x0064:
            vp1.e r0 = vp1.C65834e.f189316a
            vp1.e$b r1 = vp1.C65834e.C65836b.f189322b
            vp1.e$b r1 = vp1.C65834e.C65836b.f189322b
            r0.getClass()
            java.lang.String r2 = "source"
            gy3.C87412m.m108594g(r1, r2)
            com.tencent.mm.sdk.platformtools.ConcurrentLruCache<java.lang.Long, com.tencent.mm.plugin.finder.storage.FinderItem> r2 = vp1.C65834e.f189317b
            long r5 = r9.field_id
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            java.lang.Object r2 = r2.get(r3)
            if (r2 != 0) goto L_0x0084
            r0.mo89878l(r9, r1)
        L_0x0084:
            if (r9 == 0) goto L_0x0087
            return r9
        L_0x0087:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: vp1.C14936m.mo13978a(te3.kk0):com.tencent.mm.plugin.finder.storage.FinderItem");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b A[LOOP:0: B:1:0x0010->B:17:0x003b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f A[EDGE_INSN: B:22:0x003f->B:19:0x003f ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13979b(long r8, com.tencent.p014mm.protocal.protobuf.FinderObject r10, java.util.LinkedList<te3.C50140kk0> r11) {
        /*
            r7 = this;
            java.lang.String r0 = "newOne"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "list"
            gy3.C87412m.m108594g(r11, r0)
            java.util.Iterator r0 = r11.iterator()
            r1 = 0
            r2 = 0
        L_0x0010:
            boolean r3 = r0.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x003e
            java.lang.Object r3 = r0.next()
            te3.kk0 r3 = (te3.C50140kk0) r3
            int r5 = r3.f136842i
            if (r5 != 0) goto L_0x0037
            int r5 = r3.f136837d
            r6 = 2
            if (r5 == r6) goto L_0x0037
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.f136839f
            if (r3 == 0) goto L_0x0032
            long r5 = r3.f164794id
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0032
            r3 = 1
            goto L_0x0033
        L_0x0032:
            r3 = 0
        L_0x0033:
            if (r3 == 0) goto L_0x0037
            r3 = 1
            goto L_0x0038
        L_0x0037:
            r3 = 0
        L_0x0038:
            if (r3 == 0) goto L_0x003b
            goto L_0x003f
        L_0x003b:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x003e:
            r2 = -1
        L_0x003f:
            if (r2 < 0) goto L_0x004a
            java.lang.Object r8 = r11.get(r2)
            te3.kk0 r8 = (te3.C50140kk0) r8
            r8.f136839f = r10
            r1 = 1
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vp1.C14936m.mo13979b(long, com.tencent.mm.protocal.protobuf.FinderObject, java.util.LinkedList):boolean");
    }
}
