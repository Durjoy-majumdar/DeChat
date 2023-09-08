package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.r0 */
public class C69260r0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CheckResUpdateCacheFileEvent f199310d;

    /* renamed from: e */
    public final /* synthetic */ C69266u0 f199311e;

    public C69260r0(C69266u0 u0Var, CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
        this.f199311e = u0Var;
        this.f199310d = checkResUpdateCacheFileEvent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0244  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r16 = this;
            r0 = r16
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent r1 = r0.f199310d
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r1 = r1.f78743d
            java.lang.String r1 = r1.f78746c
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0268
            com.tencent.mm.plugin.luckymoney.model.u0 r1 = r0.f199311e
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent r2 = r0.f199310d
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r2 = r2.f78743d
            int r3 = r2.f78745b
            java.lang.String r2 = r2.f78746c
            r1.getClass()
            java.lang.String r1 = com.tencent.p014mm.plugin.luckymoney.model.C69266u0.f199336d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r5 = ""
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            java.lang.String r6 = "MicroMsg.LuckyMoneyEnvelopeResUpdateListener"
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L_0x0047
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r4[r8] = r3
            java.lang.String r9 = "fileExists exist,first delete file ：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r9, r4)
            com.tencent.p014mm.vfs.C86013q1.m106446g(r3, r7)
        L_0x0047:
            android.net.Uri r3 = com.tencent.p014mm.vfs.C116299g2.m163858n(r1)
            r4 = 0
            java.lang.String r9 = r3.getPath()
            if (r9 == 0) goto L_0x006c
            java.lang.String r9 = com.tencent.p014mm.vfs.C116299g2.m163855k(r9, r8, r8)
            java.lang.String r10 = r3.getPath()
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L_0x006c
            android.net.Uri$Builder r3 = r3.buildUpon()
            android.net.Uri$Builder r3 = r3.path(r9)
            android.net.Uri r3 = r3.build()
        L_0x006c:
            com.tencent.mm.vfs.f0 r9 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r3 = r9.mo177799l(r3, r4)
            boolean r4 = r3.mo177810a()
            if (r4 != 0) goto L_0x0079
            goto L_0x0080
        L_0x0079:
            com.tencent.mm.vfs.FileSystem$c r4 = r3.f348991a
            java.lang.String r3 = r3.f348992b
            r4.mo119937g(r3)
        L_0x0080:
            int r2 = com.tencent.p014mm.vfs.C86013q1.m106436R(r2, r1)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3[r8] = r4
            java.lang.String r4 = "unzip ret: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r3)
            if (r2 != 0) goto L_0x0096
            r2 = 1
            goto L_0x0097
        L_0x0096:
            r2 = 0
        L_0x0097:
            r3 = 2
            r4 = 991(0x3df, float:1.389E-42)
            if (r2 == 0) goto L_0x024e
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 15
            r2.mo175911u(r4, r9)
            com.tencent.mm.plugin.luckymoney.model.u0 r2 = r0.f199311e
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent r9 = r0.f199310d
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r9 = r9.f78743d
            int r10 = r9.f78745b
            int r9 = r9.f78747d
            r2.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r5)
            r2.append(r10)
            java.lang.String r1 = "/"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r2 != 0) goto L_0x00cf
            goto L_0x01f0
        L_0x00cf:
            com.tencent.mm.plugin.luckymoney.model.w0 r2 = new com.tencent.mm.plugin.luckymoney.model.w0
            r2.<init>()
            r2.field_subtype = r10
            g32.b r5 = g32.C75846b.zx0()
            nr3.g<com.tencent.mm.plugin.luckymoney.model.x0> r5 = r5.f222492j
            java.lang.Object r5 = r5.mo59825a()
            com.tencent.mm.plugin.luckymoney.model.x0 r5 = (com.tencent.p014mm.plugin.luckymoney.model.C30170x0) r5
            java.lang.String[] r11 = new java.lang.String[r8]
            boolean r5 = r5.get(r2, (java.lang.String[]) r11)
            com.tencent.mm.vfs.m1 r11 = new com.tencent.mm.vfs.m1
            r11.<init>((java.lang.String) r1)
            com.tencent.mm.vfs.m1[] r1 = r11.mo119984u()
            if (r1 == 0) goto L_0x01e8
            int r11 = r1.length
            if (r11 <= 0) goto L_0x01e8
            r11 = 0
            r12 = 0
        L_0x00f8:
            int r13 = r1.length
            if (r11 >= r13) goto L_0x01e9
            r13 = r1[r11]
            boolean r14 = r13.mo119978p()
            if (r14 == 0) goto L_0x01e2
            java.lang.String r14 = r13.mo119971i()
            android.net.Uri r14 = com.tencent.p014mm.vfs.C116299g2.m163858n(r14)
            java.lang.String r15 = r14.getPath()
            if (r15 == 0) goto L_0x012b
            java.lang.String r15 = com.tencent.p014mm.vfs.C116299g2.m163855k(r15, r8, r8)
            java.lang.String r4 = r14.getPath()
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto L_0x012b
            android.net.Uri$Builder r4 = r14.buildUpon()
            android.net.Uri$Builder r4 = r4.path(r15)
            android.net.Uri r14 = r4.build()
        L_0x012b:
            java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163865u(r14)
            java.lang.String r4 = com.tencent.p014mm.vfs.C86013q1.m106456q(r4)
            java.lang.String r14 = r13.getName()
            java.lang.String r15 = "bubble.png"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0143
            r2.field_bubbleMd5 = r4
            goto L_0x01e1
        L_0x0143:
            java.lang.String r14 = r13.getName()
            java.lang.String r15 = "cover.png"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0153
            r2.field_coverMd5 = r4
            goto L_0x01e1
        L_0x0153:
            java.lang.String r14 = r13.getName()
            java.lang.String r15 = "minilogo.png"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0163
            r2.field_minilogoMd5 = r4
            goto L_0x01e1
        L_0x0163:
            java.lang.String r14 = r13.getName()
            java.lang.String r15 = "detail.png"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0173
            r2.field_detailMd5 = r4
            goto L_0x01e1
        L_0x0173:
            java.lang.String r14 = r13.getName()
            java.lang.String r15 = "bubblwidget.png"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0182
            r2.field_bubblewidgetMd5 = r4
            goto L_0x01e1
        L_0x0182:
            java.lang.String r14 = r13.getName()
            java.lang.String r15 = "coverwidget.png"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0191
            r2.field_coverwidgetMd5 = r4
            goto L_0x01e1
        L_0x0191:
            java.lang.String r14 = r13.getName()
            java.lang.String r15 = "bubbledynamic.png"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x01a0
            r2.field_bubbledynamicMd5 = r4
            goto L_0x01e1
        L_0x01a0:
            java.lang.String r4 = r13.getName()
            java.lang.String r14 = "bubble.pag"
            boolean r4 = r4.equals(r14)
            if (r4 == 0) goto L_0x01ad
            goto L_0x01e1
        L_0x01ad:
            java.lang.String r4 = r13.getName()
            java.lang.String r14 = "cover.pag"
            boolean r4 = r4.equals(r14)
            if (r4 == 0) goto L_0x01ba
            goto L_0x01e1
        L_0x01ba:
            java.lang.String r4 = r13.getName()
            java.lang.String r14 = "minilogo.pag"
            boolean r4 = r4.equals(r14)
            if (r4 == 0) goto L_0x01c7
            goto L_0x01e1
        L_0x01c7:
            java.lang.String r4 = r13.getName()
            java.lang.String r14 = "detail.pag"
            boolean r4 = r4.equals(r14)
            if (r4 == 0) goto L_0x01d4
            goto L_0x01e1
        L_0x01d4:
            java.lang.String r4 = r13.getName()
            java.lang.String r13 = "wxpaylibpag.wasm"
            boolean r4 = r4.equals(r13)
            if (r4 == 0) goto L_0x01e2
        L_0x01e1:
            r12 = 1
        L_0x01e2:
            int r11 = r11 + 1
            r4 = 991(0x3df, float:1.389E-42)
            goto L_0x00f8
        L_0x01e8:
            r12 = 0
        L_0x01e9:
            if (r12 != 0) goto L_0x01f2
            java.lang.String r1 = "error file dir"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r1)
        L_0x01f0:
            r1 = 0
            goto L_0x0233
        L_0x01f2:
            r2.field_version = r9
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r1[r8] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r1[r7] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            r1[r3] = r4
            java.lang.String r3 = "insert or update resource: %s, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r1)
            if (r5 == 0) goto L_0x0223
            g32.b r1 = g32.C75846b.zx0()
            nr3.g<com.tencent.mm.plugin.luckymoney.model.x0> r1 = r1.f222492j
            java.lang.Object r1 = r1.mo59825a()
            com.tencent.mm.plugin.luckymoney.model.x0 r1 = (com.tencent.p014mm.plugin.luckymoney.model.C30170x0) r1
            java.lang.String[] r3 = new java.lang.String[r8]
            boolean r1 = r1.update(r2, (java.lang.String[]) r3)
            goto L_0x0233
        L_0x0223:
            g32.b r1 = g32.C75846b.zx0()
            nr3.g<com.tencent.mm.plugin.luckymoney.model.x0> r1 = r1.f222492j
            java.lang.Object r1 = r1.mo59825a()
            com.tencent.mm.plugin.luckymoney.model.x0 r1 = (com.tencent.p014mm.plugin.luckymoney.model.C30170x0) r1
            boolean r1 = r1.insert(r2)
        L_0x0233:
            if (r1 == 0) goto L_0x0244
            java.lang.String r1 = "not retry"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 14
            r4 = 991(0x3df, float:1.389E-42)
            r1.mo175911u(r4, r2)
            goto L_0x024c
        L_0x0244:
            r4 = 991(0x3df, float:1.389E-42)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1.mo175911u(r4, r7)
            r7 = 0
        L_0x024c:
            r8 = r7
            goto L_0x0253
        L_0x024e:
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1.mo175911u(r4, r3)
        L_0x0253:
            java.lang.Class<fp.e> r1 = p523fp.C32147e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            fp.e r1 = (p523fp.C32147e) r1
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent r2 = r0.f199310d
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r2 = r2.f78743d
            int r3 = r2.f78744a
            int r4 = r2.f78745b
            int r2 = r2.f78747d
            r1.b70(r3, r4, r2, r8)
        L_0x0268:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.model.C69260r0.run():void");
    }
}
