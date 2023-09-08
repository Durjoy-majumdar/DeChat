package com.tencent.p014mm.plugin.topstory.p113ui.home;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.x */
public class C71551x implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ TopStoryUploadUI f207332d;

    public C71551x(TopStoryUploadUI topStoryUploadUI) {
        this.f207332d = topStoryUploadUI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0086, code lost:
        if (r1 != 6) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0099, code lost:
        if (r1 != 6) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onMenuItemClick(android.view.MenuItem r18) {
        /*
            r17 = this;
            r0 = r17
            com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI r1 = r0.f207332d
            boolean r1 = r1.isFinishing()
            r2 = 0
            if (r1 == 0) goto L_0x000c
            return r2
        L_0x000c:
            long r3 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI r1 = r0.f207332d
            long r5 = r1.f207323z
            long r3 = r3 - r5
            r5 = 500(0x1f4, double:2.47E-321)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x001c
            return r2
        L_0x001c:
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 17080(0x42b8, float:2.3934E-41)
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r4[r2] = r6
            r6 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8 = 1
            r4[r8] = r7
            com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI r7 = r0.f207332d
            java.lang.String r7 = r7.f207306f
            r4[r6] = r7
            r1.mo160131h(r3, r4)
            com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI r1 = r0.f207332d
            long r3 = java.lang.System.currentTimeMillis()
            r1.f207323z = r3
            com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI r1 = r0.f207332d
            com.tencent.mm.plugin.sns.ui.SnsEditText r1 = r1.f207321x
            android.text.Editable r1 = r1.getText()
            java.lang.String r13 = r1.toString()
            int r1 = r13.length()
            r3 = 200(0xc8, float:2.8E-43)
            java.lang.String r4 = ""
            if (r1 <= r3) goto L_0x0066
            com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI r1 = r0.f207332d
            r2 = 2131837247(0x7f11413f, float:1.9307684E38)
            java.lang.String r2 = r1.getString(r2)
            nj3.C76879j.m92748s(r1, r2, r4)
            return r8
        L_0x0066:
            com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI r1 = r0.f207332d
            r1.getClass()
            f40.j r1 = f40.C86709a0.m107531m()
            j40.a r1 = r1.mo58407a()
            j40.b r1 = (j40.C87829b) r1
            boolean r1 = r1.mo71804b()
            r3 = 6
            if (r1 == 0) goto L_0x008a
            ob0.b0 r1 = f40.C86709a0.m107524d()
            int r1 = r1.mo123467m()
            if (r1 == r5) goto L_0x0088
            if (r1 != r3) goto L_0x009c
        L_0x0088:
            r2 = 1
            goto L_0x009c
        L_0x008a:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isConnected((android.content.Context) r1)
            if (r1 == 0) goto L_0x0096
            r1 = 6
            goto L_0x0097
        L_0x0096:
            r1 = 0
        L_0x0097:
            if (r1 == r5) goto L_0x0088
            if (r1 != r3) goto L_0x009c
            goto L_0x0088
        L_0x009c:
            if (r2 != 0) goto L_0x00b8
            com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI r1 = r0.f207332d
            r2 = 2131821610(0x7f11042a, float:1.9275968E38)
            java.lang.String r2 = r1.getString(r2)
            nj3.C76879j.m92748s(r1, r2, r4)
            kj2.d r9 = kj2.C117407d.INSTANCE
            r10 = 1032(0x408, double:5.1E-321)
            r12 = 1
            r14 = 1
            r16 = 0
            r9.idkeyStat(r10, r12, r14, r16)
            return r8
        L_0x00b8:
            long r10 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI r1 = r0.f207332d
            r1.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            f40.e r2 = f40.C86709a0.m107523b()
            int r2 = r2.mo121110g()
            java.lang.String r2 = p823sg.C77710q.m93738a(r2)
            r1.append(r2)
            java.lang.String r2 = "_"
            r1.append(r2)
            long r2 = java.lang.System.currentTimeMillis()
            r1.append(r2)
            java.lang.String r14 = r1.toString()
            java.lang.Class<ym.l> r1 = p763ym.C79138l.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ym.l r1 = (p763ym.C79138l) r1
            com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI r2 = r0.f207332d
            java.lang.String r2 = r2.f207306f
            com.tencent.mm.pluginsdk.model.app.j r15 = r1.getAppInfo(r2)
            com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI r7 = r0.f207332d
            java.lang.String r12 = r7.f207309i
            java.lang.String r1 = r7.f207310j
            r7.getClass()
            s03.g r2 = new s03.g
            r9 = r2
            r16 = r1
            r9.<init>(r10, r12, r13, r14, r15, r16)
            ob0.b0 r1 = f40.C86709a0.m107524d()
            r1.mo123460f(r2)
            r1 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r2 = r7.getString(r1)
            r1 = 2131838116(0x7f1144a4, float:1.9309446E38)
            java.lang.String r3 = r7.getString(r1)
            r4 = 1
            r5 = 0
            r6 = 0
            r1 = r7
            qo3.i0 r1 = nj3.C76879j.m92723Q(r1, r2, r3, r4, r5, r6)
            r7.f207302B = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.topstory.p113ui.home.C71551x.onMenuItemClick(android.view.MenuItem):boolean");
    }
}
