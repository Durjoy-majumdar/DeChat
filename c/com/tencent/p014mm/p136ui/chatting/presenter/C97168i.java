package com.tencent.p014mm.p136ui.chatting.presenter;

import com.tencent.p014mm.C0966R;
import dk3.C97483d;
import java.util.List;

/* renamed from: com.tencent.mm.ui.chatting.presenter.i */
public class C97168i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f285136d;

    /* renamed from: e */
    public final /* synthetic */ MediaHistoryGalleryPresenter f285137e;

    /* renamed from: com.tencent.mm.ui.chatting.presenter.i$a */
    public class C97169a implements Runnable {
        public C97169a() {
        }

        public void run() {
            C97168i.this.f285137e.f285110d.mo135871u3(C0966R.string.f6n);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.i$b */
    public class C97170b implements Runnable {
        public C97170b() {
        }

        public void run() {
            C97168i.this.f285137e.f285110d.mo135871u3(C0966R.string.f6n);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.i$c */
    public class C97171c implements Runnable {
        public C97171c() {
        }

        public void run() {
            C97168i.this.f285137e.f285110d.mo135871u3(C0966R.string.f6o);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.i$d */
    public class C97172d implements Runnable {
        public C97172d() {
        }

        public void run() {
            C97483d dVar = C97168i.this.f285137e.f285110d;
            if (dVar != null) {
                dVar.mo135858B6();
            }
        }
    }

    public C97168i(MediaHistoryGalleryPresenter mediaHistoryGalleryPresenter, List list) {
        this.f285137e = mediaHistoryGalleryPresenter;
        this.f285136d = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e8, code lost:
        if (r4 != false) goto L_0x00fd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r27 = this;
            r1 = r27
            java.lang.Class<rz.s> r2 = p682rz.C101488s.class
            com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r0 = r1.f285137e
            java.util.List r3 = r1.f285136d
            r0.getClass()
            r5 = -1
            r6 = 1
            r7 = 0
            r8 = 268435505(0x10000031, float:2.5243696E-29)
            r9 = 2
            java.lang.String r10 = "MicroMsg.MediaHistoryGalleryPresenter"
            if (r3 != 0) goto L_0x0019
            r12 = 0
            goto L_0x0211
        L_0x0019:
            java.util.Iterator r11 = r3.iterator()
            r12 = 0
        L_0x001e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01fa
            java.lang.Object r0 = r11.next()
            com.tencent.mm.storage.f4 r0 = (com.tencent.p014mm.storage.C72963f4) r0
            boolean r13 = r0.mo100972K3()
            if (r13 != 0) goto L_0x01f5
            boolean r13 = eb0.C75569c4.m90690w(r0)
            if (r13 == 0) goto L_0x0038
            goto L_0x01f5
        L_0x0038:
            boolean r13 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124955K(r0)
            java.lang.String r14 = "[checkLegal] getStatus:%s"
            if (r13 == 0) goto L_0x010d
            hd0.n0 r13 = com.tencent.p014mm.p136ui.chatting.gallery.C97052g.m124927o(r0)
            if (r13 == 0) goto L_0x00fc
            java.lang.Object[] r15 = new java.lang.Object[r6]
            int r4 = r13.f288562i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r15[r7] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r14, r15)
            java.lang.String r4 = "/"
            int r14 = r13.f288576w
            if (r14 != r5) goto L_0x007c
            java.lang.String r4 = r13.mo137702f()
            boolean r14 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r14 != 0) goto L_0x0079
            di3.d r4 = di3.C86312j.m106911c(r2)
            rz.s r4 = (p682rz.C101488s) r4
            rz.t r4 = r4.Kj0()
            java.lang.String r0 = r0.mo108765s2()
            hd0.o0 r4 = (hd0.C98410o0) r4
            java.lang.String r0 = r4.mo137728q(r0)
            goto L_0x00fd
        L_0x0079:
            r0 = r4
            goto L_0x00fd
        L_0x007c:
            di3.d r14 = di3.C86312j.m106911c(r2)
            rz.s r14 = (p682rz.C101488s) r14
            rz.t r14 = r14.Kj0()
            java.lang.String r15 = r0.mo108765s2()
            hd0.o0 r14 = (hd0.C98410o0) r14
            java.lang.String r14 = r14.mo137728q(r15)
            int r0 = r0.mo108769t2()
            if (r0 != r6) goto L_0x00fa
            te3.gu2 r0 = r13.f288538F
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r0.f298309e
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106458s(r14)     // Catch:{ Exception -> 0x00eb }
            boolean r15 = r0.endsWith(r4)     // Catch:{ Exception -> 0x00eb }
            if (r15 != 0) goto L_0x00b7
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00eb }
            r15.<init>()     // Catch:{ Exception -> 0x00eb }
            r15.append(r0)     // Catch:{ Exception -> 0x00eb }
            r15.append(r4)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r0 = r15.toString()     // Catch:{ Exception -> 0x00eb }
        L_0x00b7:
            java.lang.String r4 = com.tencent.p014mm.vfs.C86013q1.m106457r(r14)     // Catch:{ Exception -> 0x00eb }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00eb }
            r15.<init>()     // Catch:{ Exception -> 0x00eb }
            r15.append(r0)     // Catch:{ Exception -> 0x00eb }
            r15.append(r4)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r0 = "_hd"
            r15.append(r0)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r0 = ".mp4"
            r15.append(r0)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r0 = r15.toString()     // Catch:{ Exception -> 0x00eb }
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r15 = "local capture video, hdFilePath: %s, exist: %s"
            java.lang.Object[] r5 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00eb }
            r5[r7] = r0     // Catch:{ Exception -> 0x00eb }
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x00eb }
            r5[r6] = r16     // Catch:{ Exception -> 0x00eb }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r15, r5)     // Catch:{ Exception -> 0x00eb }
            if (r4 == 0) goto L_0x00fa
            goto L_0x00fd
        L_0x00eb:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r0 = r0.getMessage()
            r4[r7] = r0
            java.lang.String r0 = "try to get hd filePath error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r4)
        L_0x00fa:
            r0 = r14
            goto L_0x00fd
        L_0x00fc:
            r0 = 0
        L_0x00fd:
            if (r13 == 0) goto L_0x01f5
            int r4 = r13.f288562i
            r5 = 198(0xc6, float:2.77E-43)
            if (r4 == r5) goto L_0x01f5
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 != 0) goto L_0x01f7
            goto L_0x01f5
        L_0x010d:
            com.tencent.mm.modelimage.k r4 = com.tencent.p014mm.p136ui.chatting.gallery.C97100o.m125011p(r0)
            if (r4 == 0) goto L_0x0120
            java.lang.Object[] r5 = new java.lang.Object[r6]
            int r13 = r4.f267388o
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r5[r7] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r14, r5)
        L_0x0120:
            int r5 = r0.getType()
            java.lang.String r13 = ""
            if (r5 != r8) goto L_0x0189
            java.lang.String r0 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124960s(r0)
            java.lang.Object[] r4 = new java.lang.Object[r9]
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4[r7] = r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r13)
            android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r5)
            java.lang.String r13 = r5.getPath()
            if (r13 == 0) goto L_0x0160
            java.lang.String r13 = com.tencent.p014mm.vfs.C116299g2.m163855k(r13, r7, r7)
            java.lang.String r14 = r5.getPath()
            boolean r14 = r14.equals(r13)
            if (r14 != 0) goto L_0x0160
            android.net.Uri$Builder r5 = r5.buildUpon()
            android.net.Uri$Builder r5 = r5.path(r13)
            android.net.Uri r5 = r5.build()
        L_0x0160:
            com.tencent.mm.vfs.f0 r13 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r14 = 0
            com.tencent.mm.vfs.f0$h r5 = r13.mo177799l(r5, r14)
            boolean r13 = r5.mo177810a()
            if (r13 != 0) goto L_0x016f
            r5 = 0
            goto L_0x0177
        L_0x016f:
            com.tencent.mm.vfs.FileSystem$c r13 = r5.f348991a
            java.lang.String r5 = r5.f348992b
            boolean r5 = r13.mo119948x(r5)
        L_0x0177:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4[r6] = r5
            java.lang.String r5 = "[checkLegal] is appmsg! null?%s,exists:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r4)
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 != 0) goto L_0x01f7
            goto L_0x01f5
        L_0x0189:
            if (r4 == 0) goto L_0x0191
            java.lang.String r0 = com.tencent.p014mm.p136ui.chatting.gallery.C97100o.m125012r(r0, r4, r7)
            r14 = r0
            goto L_0x0192
        L_0x0191:
            r14 = 0
        L_0x0192:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0[r7] = r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r14, (java.lang.String) r13)
            android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r5)
            java.lang.String r13 = r5.getPath()
            if (r13 == 0) goto L_0x01c6
            java.lang.String r13 = com.tencent.p014mm.vfs.C116299g2.m163855k(r13, r7, r7)
            java.lang.String r15 = r5.getPath()
            boolean r15 = r15.equals(r13)
            if (r15 != 0) goto L_0x01c6
            android.net.Uri$Builder r5 = r5.buildUpon()
            android.net.Uri$Builder r5 = r5.path(r13)
            android.net.Uri r5 = r5.build()
        L_0x01c6:
            com.tencent.mm.vfs.f0 r13 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r15 = 0
            com.tencent.mm.vfs.f0$h r5 = r13.mo177799l(r5, r15)
            boolean r13 = r5.mo177810a()
            if (r13 != 0) goto L_0x01d5
            r5 = 0
            goto L_0x01dd
        L_0x01d5:
            com.tencent.mm.vfs.FileSystem$c r13 = r5.f348991a
            java.lang.String r5 = r5.f348992b
            boolean r5 = r13.mo119948x(r5)
        L_0x01dd:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0[r6] = r5
            java.lang.String r5 = "[checkLegal] null?%s,exists:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r0)
            if (r4 == 0) goto L_0x01f5
            int r0 = r4.f267388o
            r4 = -1
            if (r0 == r4) goto L_0x01f5
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r14)
            if (r0 != 0) goto L_0x01f7
        L_0x01f5:
            int r12 = r12 + 1
        L_0x01f7:
            r5 = -1
            goto L_0x001e
        L_0x01fa:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r0[r7] = r4
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r6] = r3
            java.lang.String r3 = "[checkLegal] count:%s size:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r0)
        L_0x0211:
            java.util.List r0 = r1.f285136d
            int r0 = r0.size()
            if (r0 != r12) goto L_0x0226
            com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r0 = r1.f285137e
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.f285120q
            com.tencent.mm.ui.chatting.presenter.i$a r2 = new com.tencent.mm.ui.chatting.presenter.i$a
            r2.<init>()
            r0.post(r2)
            return
        L_0x0226:
            com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r0 = r1.f285137e
            if (r12 <= 0) goto L_0x022c
            r3 = 1
            goto L_0x022d
        L_0x022c:
            r3 = 0
        L_0x022d:
            r0.f285121r = r3
            java.util.List r3 = r1.f285136d
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x023a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x02d1
            java.lang.Object r5 = r3.next()
            com.tencent.mm.storage.f4 r5 = (com.tencent.p014mm.storage.C72963f4) r5
            boolean r11 = eb0.C75569c4.m90690w(r5)
            if (r11 == 0) goto L_0x024d
            goto L_0x023a
        L_0x024d:
            boolean r11 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124953H(r5)
            if (r11 == 0) goto L_0x026d
            com.tencent.mm.modelimage.k r11 = com.tencent.p014mm.p136ui.chatting.gallery.C97100o.m125011p(r5)
            boolean r11 = r11.mo127146q()
            if (r11 != 0) goto L_0x0261
            r4.add(r5)
            goto L_0x023a
        L_0x0261:
            int r11 = r0.f285119p
            r12 = -1
            int r11 = r11 + r12
            r0.f285119p = r11
            android.content.Context r11 = r0.f285112f
            com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124957k(r11, r5, r7)
            goto L_0x023a
        L_0x026d:
            int r11 = r5.getType()
            if (r11 != r8) goto L_0x023a
            java.lang.String r11 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124960s(r5)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x02cb
            java.lang.String r11 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124960s(r5)
            android.net.Uri r11 = com.tencent.p014mm.vfs.C116299g2.m163858n(r11)
            java.lang.String r12 = r11.getPath()
            if (r12 == 0) goto L_0x02a5
            java.lang.String r12 = com.tencent.p014mm.vfs.C116299g2.m163855k(r12, r7, r7)
            java.lang.String r13 = r11.getPath()
            boolean r13 = r13.equals(r12)
            if (r13 != 0) goto L_0x02a5
            android.net.Uri$Builder r11 = r11.buildUpon()
            android.net.Uri$Builder r11 = r11.path(r12)
            android.net.Uri r11 = r11.build()
        L_0x02a5:
            com.tencent.mm.vfs.f0 r12 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r13 = 0
            com.tencent.mm.vfs.f0$h r11 = r12.mo177799l(r11, r13)
            boolean r12 = r11.mo177810a()
            if (r12 != 0) goto L_0x02b4
            r11 = 0
            goto L_0x02bc
        L_0x02b4:
            com.tencent.mm.vfs.FileSystem$c r12 = r11.f348991a
            java.lang.String r11 = r11.f348992b
            boolean r11 = r12.mo119948x(r11)
        L_0x02bc:
            if (r11 == 0) goto L_0x02cc
            int r11 = r0.f285119p
            r12 = -1
            int r11 = r11 + r12
            r0.f285119p = r11
            android.content.Context r11 = r0.f285112f
            com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124957k(r11, r5, r7)
            goto L_0x023a
        L_0x02cb:
            r13 = 0
        L_0x02cc:
            r4.add(r5)
            goto L_0x023a
        L_0x02d1:
            com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r0 = r1.f285137e
            java.util.List r3 = r1.f285136d
            r0.getClass()
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x02e1:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x0314
            java.lang.Object r11 = r3.next()
            com.tencent.mm.storage.f4 r11 = (com.tencent.p014mm.storage.C72963f4) r11
            boolean r12 = eb0.C75569c4.m90690w(r11)
            if (r12 == 0) goto L_0x02f4
            goto L_0x02e1
        L_0x02f4:
            boolean r12 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124955K(r11)
            if (r12 == 0) goto L_0x02e1
            hd0.n0 r12 = com.tencent.p014mm.p136ui.chatting.gallery.C97052g.m124927o(r11)
            boolean r12 = r12.mo137710n()
            if (r12 != 0) goto L_0x0308
            r5.add(r11)
            goto L_0x02e1
        L_0x0308:
            int r12 = r0.f285119p
            r13 = -1
            int r12 = r12 + r13
            r0.f285119p = r12
            android.content.Context r12 = r0.f285112f
            com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124959m(r12, r11, r7)
            goto L_0x02e1
        L_0x0314:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            int r3 = r4.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r7] = r3
            int r3 = r5.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r6] = r3
            java.lang.String r3 = "[innerHandleSave] needDownloadImageList size:%s needDownloadVideoList:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r0)
            com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r0 = r1.f285137e
            int r3 = r4.size()
            int r11 = r5.size()
            int r3 = r3 + r11
            r0.f285119p = r3
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r0)
            if (r0 != 0) goto L_0x035f
            com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r0 = r1.f285137e
            int r0 = r0.f285119p
            java.util.List r3 = r1.f285136d
            int r3 = r3.size()
            if (r0 != r3) goto L_0x035f
            com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r0 = r1.f285137e
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.f285120q
            com.tencent.mm.ui.chatting.presenter.i$b r2 = new com.tencent.mm.ui.chatting.presenter.i$b
            r2.<init>()
            r0.post(r2)
            return
        L_0x035f:
            java.util.Iterator r0 = r4.iterator()
        L_0x0363:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x03ef
            java.lang.Object r3 = r0.next()
            com.tencent.mm.storage.f4 r3 = (com.tencent.p014mm.storage.C72963f4) r3
            com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r4 = r1.f285137e
            com.tencent.mm.modelimage.k r11 = com.tencent.p014mm.p136ui.chatting.gallery.C97100o.m125011p(r3)
            r4.getClass()
            java.lang.Object[] r12 = new java.lang.Object[r9]
            if (r3 != 0) goto L_0x037e
            r13 = 1
            goto L_0x037f
        L_0x037e:
            r13 = 0
        L_0x037f:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r12[r7] = r13
            if (r11 != 0) goto L_0x0389
            r13 = 1
            goto L_0x038a
        L_0x0389:
            r13 = 0
        L_0x038a:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            r12[r6] = r13
            java.lang.String r13 = "[downloadImg] %s %s "
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r13, r12)
            if (r3 != 0) goto L_0x0399
        L_0x0397:
            r15 = -1
            goto L_0x0363
        L_0x0399:
            int r12 = r3.getType()
            if (r12 != r8) goto L_0x03a8
            com.tencent.mm.ui.chatting.presenter.j r11 = new com.tencent.mm.ui.chatting.presenter.j
            r11.<init>(r4, r3)
            com.tencent.p014mm.pluginsdk.model.app.C72695v.m85062d(r3, r11)
            goto L_0x0397
        L_0x03a8:
            if (r11 == 0) goto L_0x0397
            java.lang.Class<gt.k> r12 = p158gt.C98201k.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            gt.k r12 = (p158gt.C98201k) r12
            gt.j r12 = r12.Jp0()
            long r13 = r11.f267374a
            long r19 = r3.getMsgId()
            r21 = 0
            r15 = -1
            java.lang.Integer r22 = java.lang.Integer.valueOf(r15)
            r23 = -1
            r25 = 0
            r26 = 1
            r16 = r12
            com.tencent.mm.modelimage.e r16 = (com.tencent.p014mm.modelimage.C92822e) r16
            r17 = r13
            r24 = r4
            int r12 = r16.mo127100b(r17, r19, r21, r22, r23, r24, r25, r26)
            r13 = -2
            if (r12 != r13) goto L_0x0363
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.String r11 = r11.f267378e
            r12[r7] = r11
            java.lang.String r11 = "[downloadImg] this img has download! %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r11, r12)
            int r11 = r4.f285119p
            int r11 = r11 - r6
            r4.f285119p = r11
            android.content.Context r4 = r4.f285112f
            com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124957k(r4, r3, r7)
            goto L_0x0363
        L_0x03ef:
            java.util.Iterator r0 = r5.iterator()
        L_0x03f3:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0462
            java.lang.Object r3 = r0.next()
            com.tencent.mm.storage.f4 r3 = (com.tencent.p014mm.storage.C72963f4) r3
            com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r4 = r1.f285137e
            r4.getClass()
            java.lang.Class<rz.u> r5 = p682rz.C101491u.class
            hd0.n0 r8 = com.tencent.p014mm.p136ui.chatting.gallery.C97052g.m124927o(r3)
            if (r8 != 0) goto L_0x0412
            java.lang.String r3 = "[saveVideo] info == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r3)
            goto L_0x03f3
        L_0x0412:
            di3.d r9 = di3.C86312j.m106911c(r2)
            rz.s r9 = (p682rz.C101488s) r9
            rz.t r9 = r9.Kj0()
            android.os.Looper r11 = android.os.Looper.getMainLooper()
            hd0.o0 r9 = (hd0.C98410o0) r9
            r9.mo137716b(r4, r11)
            boolean r4 = r8.mo137711o()
            if (r4 == 0) goto L_0x043f
            java.lang.String r4 = "start complete online video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
            di3.d r4 = di3.C86312j.m106911c(r5)
            rz.u r4 = (p682rz.C101491u) r4
            java.lang.String r3 = r3.mo108765s2()
            r4.mo140797FT(r3)
            goto L_0x03f3
        L_0x043f:
            java.lang.String r4 = "start complete offline video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
            di3.d r4 = di3.C86312j.m106911c(r5)
            rz.u r4 = (p682rz.C101491u) r4
            java.lang.String r8 = r3.mo108765s2()
            r9 = 10
            r4.Tk0(r8, r9)
            di3.d r4 = di3.C86312j.m106911c(r5)
            rz.u r4 = (p682rz.C101491u) r4
            java.lang.String r3 = r3.mo108765s2()
            r4.M00(r3)
            goto L_0x03f3
        L_0x0462:
            com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r0 = r1.f285137e
            boolean r2 = r0.f285121r
            if (r2 == 0) goto L_0x0472
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.f285120q
            com.tencent.mm.ui.chatting.presenter.i$c r2 = new com.tencent.mm.ui.chatting.presenter.i$c
            r2.<init>()
            r0.post(r2)
        L_0x0472:
            com.tencent.mm.ui.chatting.presenter.MediaHistoryGalleryPresenter r0 = r1.f285137e
            int r2 = r0.f285119p
            if (r2 != 0) goto L_0x0479
            goto L_0x047a
        L_0x0479:
            r6 = 0
        L_0x047a:
            if (r6 == 0) goto L_0x048a
            boolean r2 = r0.f285121r
            if (r2 != 0) goto L_0x048a
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.f285120q
            com.tencent.mm.ui.chatting.presenter.i$d r2 = new com.tencent.mm.ui.chatting.presenter.i$d
            r2.<init>()
            r0.post(r2)
        L_0x048a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.presenter.C97168i.run():void");
    }
}
