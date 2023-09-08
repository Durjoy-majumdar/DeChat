package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Intent;
import ck3.C39969i;
import zj3.C79387w;

/* renamed from: com.tencent.mm.ui.chatting.component.t4$$b */
public class t4$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Intent f216121d;

    /* renamed from: e */
    public final /* synthetic */ String f216122e;

    /* renamed from: f */
    public final /* synthetic */ C39969i f216123f;

    /* renamed from: g */
    public final /* synthetic */ C79387w f216124g;

    /* renamed from: h */
    public final /* synthetic */ int f216125h;

    /* renamed from: i */
    public final /* synthetic */ C73601t4 f216126i;

    public t4$$b(C73601t4 t4Var, Intent intent, String str, C39969i iVar, C79387w wVar, int i) {
        this.f216126i = t4Var;
        this.f216121d = intent;
        this.f216122e = str;
        this.f216123f = iVar;
        this.f216124g = wVar;
        this.f216125h = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:137:0x05a2  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03ca A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x03b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r43 = this;
            r0 = r43
            com.tencent.mm.sdk.platformtools.MMHandlerThread r1 = f40.C86709a0.m107525e()
            r1.setHighPriority()
            com.tencent.mm.ui.chatting.component.t4 r1 = r0.f216126i
            android.content.Intent r2 = r0.f216121d
            java.lang.String r11 = r0.f216122e
            ck3.i r3 = r0.f216123f
            r1.getClass()
            r12 = 1
            if (r2 != 0) goto L_0x0019
            goto L_0x05e9
        L_0x0019:
            java.lang.String r4 = "CropImage_OutputPath_List"
            java.util.ArrayList r4 = r2.getStringArrayListExtra(r4)
            java.lang.String r5 = "KSelectImgUseTime"
            r6 = 0
            r2.getLongExtra(r5, r6)
            java.lang.String r5 = "MicroMsg.ChattingUI.SendImgComponent"
            if (r4 == 0) goto L_0x05e2
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x05e2
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r10 = 0
            r9[r10] = r11
            java.lang.String r13 = r4.toString()
            r9[r12] = r13
            java.lang.String r13 = "sendMutiImage recvUser:%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r13, r9)
            java.lang.String r9 = "GalleryUI_ImgIdList"
            java.util.ArrayList r9 = r2.getIntegerArrayListExtra(r9)
            if (r9 == 0) goto L_0x0060
            int r14 = r9.size()
            if (r14 != r12) goto L_0x005d
            java.lang.Object r14 = r9.get(r10)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r15 = -1
            if (r14 != r15) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            r12 = r1
            goto L_0x018f
        L_0x0060:
            com.tencent.mm.modelimage.i0 r9 = com.tencent.p014mm.modelimage.C68118i0.m80524a()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.mm.modelimage.i0$e> r14 = r9.f195776c
            java.util.Collection r14 = r14.values()
            java.util.Iterator r15 = r14.iterator()
        L_0x006e:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x0101
            java.lang.Object r16 = r15.next()
            r12 = r16
            com.tencent.mm.modelimage.i0$e r12 = (com.tencent.p014mm.modelimage.C68118i0.C68123e) r12
            java.lang.Class<f62.k0> r16 = f62.C75700k0.class
            com.tencent.mm.pointers.PString r10 = new com.tencent.mm.pointers.PString
            r24 = r10
            r10.<init>()
            com.tencent.mm.pointers.PInt r8 = new com.tencent.mm.pointers.PInt
            r25 = r8
            r8.<init>()
            com.tencent.mm.pointers.PInt r13 = new com.tencent.mm.pointers.PInt
            r26 = r13
            r13.<init>()
            com.tencent.mm.modelimage.m r18 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            r12.getClass()
            int r6 = r12.f195784a
            r21 = r6
            r19 = 0
            r20 = 0
            r23 = 0
            r22 = r23
            r27 = 0
            r28 = 0
            r29 = 0
            r32 = 0
            r31 = r32
            r33 = 0
            r34 = -1
            long r6 = r18.zs0(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r32, r33, r34)
            r12.f195785b = r6
            k40.a r6 = f40.C86709a0.m107533q(r16)
            f62.k0 r6 = (f62.C75700k0) r6
            g62.l r6 = r6.mo96095LE()
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
            r12 = r1
            r0 = 0
            com.tencent.mm.storage.f4 r6 = r6.b00(r0)
            java.lang.String r0 = r6.mo108765s2()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x00f7
            java.lang.String r0 = r10.value
            r6.mo108739S2(r0)
            int r0 = r8.value
            r6.mo108752f3(r0)
            int r0 = r13.value
            r6.mo108751e3(r0)
            k40.a r0 = f40.C86709a0.m107533q(r16)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            r7 = 0
            r0.xy0(r7, r6)
        L_0x00f7:
            r6 = 0
            r8 = 2
            r10 = 0
            r0 = r43
            r1 = r12
            r12 = 1
            goto L_0x006e
        L_0x0101:
            r12 = r1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            java.lang.String r1 = "MicroMsg.SendImgSpeeder"
            if (r0 != 0) goto L_0x0147
            java.util.Iterator r0 = r14.iterator()
        L_0x010e:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0147
            java.lang.Object r6 = r0.next()
            com.tencent.mm.modelimage.i0$e r6 = (com.tencent.p014mm.modelimage.C68118i0.C68123e) r6
            r6.getClass()
            r6 = 0
            boolean r7 = r11.equals(r6)
            if (r7 != 0) goto L_0x010e
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.mm.modelimage.i0$e> r7 = r9.f195776c
            r13 = 0
            java.lang.Long r8 = java.lang.Long.valueOf(r13)
            r7.remove(r8)
            java.util.ArrayList<java.lang.Long> r7 = r9.f195777d
            java.lang.Long r8 = java.lang.Long.valueOf(r13)
            r7.remove(r8)
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r7 = 0
            r8[r7] = r11
            r7 = 1
            r8[r7] = r6
            java.lang.String r6 = "fatal!! Send user mis-match, want:%s, fact:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r6, r8)
            goto L_0x010e
        L_0x0147:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6 = 0
        L_0x014d:
            java.util.ArrayList<java.lang.Long> r7 = r9.f195777d
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x0170
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.mm.modelimage.i0$e> r7 = r9.f195776c
            java.util.ArrayList<java.lang.Long> r8 = r9.f195777d
            java.lang.Object r8 = r8.get(r6)
            java.lang.Object r7 = r7.get(r8)
            com.tencent.mm.modelimage.i0$e r7 = (com.tencent.p014mm.modelimage.C68118i0.C68123e) r7
            long r7 = r7.f195785b
            int r8 = (int) r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r0.add(r7)
            int r6 = r6 + 1
            goto L_0x014d
        L_0x0170:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.mm.modelimage.i0$e> r6 = r9.f195776c
            r6.clear()
            java.util.ArrayList<java.lang.Long> r6 = r9.f195777d
            r6.clear()
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            int r6 = r0.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8 = 0
            r7[r8] = r6
            java.lang.String r6 = "syncImgData, id size %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r7)
            r9 = r0
        L_0x018f:
            h81.h$c r0 = h81.C32735h.C32737c.clicfg_clear_c2c_tmp_file
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            int r6 = r4.size()
            if (r6 != 0) goto L_0x01a0
            java.lang.String r0 = "filelist is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x05e7
        L_0x01a0:
            java.lang.String r6 = "isTakePhoto"
            r7 = 0
            boolean r6 = r2.getBooleanExtra(r6, r7)
            java.lang.String r8 = "CropImage_Compress_Img"
            r10 = 1
            boolean r13 = r2.getBooleanExtra(r8, r10)
            r8 = 11095(0x2b57, float:1.5547E-41)
            if (r13 != 0) goto L_0x01c0
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r15 = new java.lang.Object[r10]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r7)
            r15[r7] = r16
            r14.mo160131h(r8, r15)
            goto L_0x01cd
        L_0x01c0:
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r15 = new java.lang.Object[r10]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r10)
            r15[r7] = r16
            r14.mo160131h(r8, r15)
        L_0x01cd:
            java.lang.String r8 = "CropImage_rotateCount"
            int r14 = r2.getIntExtra(r8, r7)
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r10 = 3
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            r8[r7] = r15
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            r15 = 1
            r8[r15] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r15 = 2
            r8[r15] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r13)
            r8[r10] = r7
            java.lang.String r7 = r3.f107141a
            r15 = 4
            r8[r15] = r7
            java.lang.String r7 = "dkimgsource source:%d  isTakePhoto:%b rotateCount:%d compressImg:%b rawUserName:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r8)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r10 = p645pj.C77092c.m93042d()
            int r15 = p645pj.C77092c.m93039a()
            java.util.Iterator r4 = r4.iterator()
        L_0x0211:
            boolean r19 = r4.hasNext()
            r20 = r0
            java.lang.String r0 = ""
            if (r19 == 0) goto L_0x03da
            java.lang.Object r19 = r4.next()
            r21 = r4
            r4 = r19
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x03ba
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x03ba
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r0 != 0) goto L_0x0235
            goto L_0x03ba
        L_0x0235:
            java.lang.Class<z51.g> r0 = z51.C39315g.class
            boolean r19 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isGif((java.lang.String) r4)
            long r22 = com.tencent.p014mm.vfs.C86013q1.m106451l(r4)
            r24 = r1
            ck3.b r1 = r12.f215752d
            r25 = r14
            java.lang.Class<zj3.w> r14 = zj3.C79387w.class
            com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
            xi.d r1 = r1.mo102812a(r14)
            zj3.w r1 = (zj3.C79387w) r1
            if (r19 == 0) goto L_0x03ab
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r14 = r1.mo102193k1()
            if (r14 == 0) goto L_0x03ab
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r14 = r1.mo102193k1()
            com.tencent.mm.pluginsdk.ui.chat.y0 r14 = r14.getCallback()
            if (r14 == 0) goto L_0x03ab
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r14 = r1.mo102193k1()
            com.tencent.mm.pluginsdk.ui.chat.y0 r14 = r14.getCallback()
            boolean r14 = r14 instanceof com.tencent.p014mm.p136ui.chatting.C73681e3
            if (r14 == 0) goto L_0x03ab
            android.graphics.BitmapFactory$Options r14 = new android.graphics.BitmapFactory$Options
            r14.<init>()
            r19 = r9
            r9 = 1
            r14.inJustDecodeBounds = r9
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r4, r14)
            int r9 = r14.outHeight
            r26 = r13
            int r13 = p645pj.C77092c.m93041c()
            if (r9 > r13) goto L_0x028f
            int r9 = r14.outWidth
            int r13 = p645pj.C77092c.m93041c()
            if (r9 <= r13) goto L_0x028d
            goto L_0x028f
        L_0x028d:
            r9 = 0
            goto L_0x0290
        L_0x028f:
            r9 = 1
        L_0x0290:
            boolean r13 = com.tencent.p014mm.storage.C72996z1.m85804J4(r11)
            if (r13 == 0) goto L_0x02a3
            java.lang.String r0 = "tummy, add gif msg filePath"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r8.add(r4)
            r27 = r8
            goto L_0x0329
        L_0x02a3:
            long r13 = (long) r10
            r27 = r8
            r8 = 13459(0x3493, float:1.886E-41)
            int r28 = (r22 > r13 ? 1 : (r22 == r13 ? 0 : -1))
            if (r28 > 0) goto L_0x032d
            if (r9 != 0) goto L_0x032d
            java.lang.String r9 = com.tencent.p014mm.vfs.C86013q1.m106456q(r4)
            di3.d r13 = di3.C86312j.m106911c(r0)
            z51.g r13 = (z51.C39315g) r13
            zc3.a r13 = r13.mo58035cm()
            i61.h r13 = (i61.C98602h) r13
            com.tencent.mm.storage.emotion.EmojiInfo r9 = r13.mo137999G(r9)
            if (r9 != 0) goto L_0x02ea
            di3.d r9 = di3.C86312j.m106911c(r0)
            z51.g r9 = (z51.C39315g) r9
            zc3.a r9 = r9.mo58035cm()
            ck3.b r13 = r12.f215752d
            android.app.Activity r13 = r13.mo91565f()
            i61.h r9 = (i61.C98602h) r9
            java.lang.String r9 = r9.mo137995C(r13, r4)
            di3.d r0 = di3.C86312j.m106911c(r0)
            z51.g r0 = (z51.C39315g) r0
            zc3.a r0 = r0.mo58035cm()
            i61.h r0 = (i61.C98602h) r0
            com.tencent.mm.storage.emotion.EmojiInfo r9 = r0.mo137999G(r9)
        L_0x02ea:
            if (r9 == 0) goto L_0x031f
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r0 = r1.mo102193k1()
            com.tencent.mm.pluginsdk.ui.chat.y0 r0 = r0.getCallback()
            com.tencent.mm.ui.chatting.e3 r0 = (com.tencent.p014mm.p136ui.chatting.C73681e3) r0
            r0.mo65586X1(r9)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 4
            java.lang.Object[] r13 = new java.lang.Object[r1]
            java.lang.Long r1 = java.lang.Long.valueOf(r22)
            r14 = 0
            r13[r14] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r17 = 1
            r13[r17] = r1
            java.lang.String r1 = r9.getMd5()
            r9 = 2
            r13[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r9 = 3
            r13[r9] = r1
            r0.mo160131h(r8, r13)
            goto L_0x0324
        L_0x031f:
            java.lang.String r0 = "emoji is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
        L_0x0324:
            java.lang.String r0 = "cpan send custom emoji."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
        L_0x0329:
            r1 = 1
            r8 = 0
            goto L_0x03b3
        L_0x032d:
            long r13 = (long) r15
            int r28 = (r22 > r13 ? 1 : (r22 == r13 ? 0 : -1))
            if (r28 > 0) goto L_0x039d
            if (r9 != 0) goto L_0x039d
            com.tencent.mm.opensdk.modelmsg.WXEmojiObject r9 = new com.tencent.mm.opensdk.modelmsg.WXEmojiObject
            r9.<init>((java.lang.String) r4)
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r13 = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage
            r13.<init>(r9)
            di3.d r9 = di3.C86312j.m106911c(r0)
            z51.g r9 = (z51.C39315g) r9
            zc3.a r9 = r9.mo58035cm()
            ck3.b r14 = r12.f215752d
            android.app.Activity r14 = r14.mo91565f()
            i61.h r9 = (i61.C98602h) r9
            r8 = 0
            java.lang.String r9 = r9.mo137996D(r14, r13, r8)
            if (r9 == 0) goto L_0x0374
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r1.mo102193k1()
            com.tencent.mm.pluginsdk.ui.chat.y0 r1 = r1.getCallback()
            com.tencent.mm.ui.chatting.e3 r1 = (com.tencent.p014mm.p136ui.chatting.C73681e3) r1
            di3.d r0 = di3.C86312j.m106911c(r0)
            z51.g r0 = (z51.C39315g) r0
            zc3.a r0 = r0.mo58035cm()
            i61.h r0 = (i61.C98602h) r0
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r0.mo137999G(r9)
            r1.mo102724c(r0)
        L_0x0374:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 4
            java.lang.Object[] r13 = new java.lang.Object[r1]
            java.lang.Long r14 = java.lang.Long.valueOf(r22)
            r18 = 0
            r13[r18] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r18)
            r1 = 1
            r13[r1] = r14
            r14 = 2
            r13[r14] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r18)
            r14 = 3
            r13[r14] = r9
            r9 = 13459(0x3493, float:1.886E-41)
            r0.mo160131h(r9, r13)
            java.lang.String r0 = "cpan send app emoji msg."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x03b3
        L_0x039d:
            r1 = 1
            r8 = 0
            r18 = 0
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r18] = r4
            java.lang.String r1 = "cpan emoji is too large, ignore.filePath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r0)
            goto L_0x03b2
        L_0x03ab:
            r27 = r8
            r19 = r9
            r26 = r13
            r8 = 0
        L_0x03b2:
            r1 = 0
        L_0x03b3:
            if (r1 == 0) goto L_0x03b6
            goto L_0x03ca
        L_0x03b6:
            r7.add(r4)
            goto L_0x03ca
        L_0x03ba:
            r24 = r1
            r27 = r8
            r19 = r9
            r26 = r13
            r25 = r14
            r8 = 0
            java.lang.String r0 = " doSendImage : filePath is null or empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
        L_0x03ca:
            r9 = r19
            r0 = r20
            r4 = r21
            r1 = r24
            r14 = r25
            r13 = r26
            r8 = r27
            goto L_0x0211
        L_0x03da:
            r24 = r1
            r27 = r8
            r19 = r9
            r26 = r13
            r25 = r14
            com.tencent.mm.storage.z1 r1 = r3.f107143c
            java.lang.String r1 = r1.getUsername()
            java.lang.String r3 = "medianote"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x03fc
            int r1 = eb0.C75592q0.m90787q()
            r1 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r1 != 0) goto L_0x03fc
            r1 = 1
            goto L_0x03fd
        L_0x03fc:
            r1 = 0
        L_0x03fd:
            if (r1 == 0) goto L_0x0401
            goto L_0x05e7
        L_0x0401:
            r1 = 98
            if (r6 == 0) goto L_0x0413
            java.lang.String r1 = "is_long_click"
            r3 = 0
            boolean r1 = r2.getBooleanExtra(r1, r3)
            if (r1 == 0) goto L_0x0411
            r1 = 99
            goto L_0x0413
        L_0x0411:
            r1 = 97
        L_0x0413:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 106(0x6a, double:5.24E-322)
            long r8 = (long) r1
            r40 = 1
            r42 = 0
            r36 = 106(0x6a, double:5.24E-322)
            r35 = r2
            r38 = r8
            r35.idkeyStat(r36, r38, r40, r42)
            if (r26 == 0) goto L_0x042a
            r8 = 94
            goto L_0x042c
        L_0x042a:
            r8 = 95
        L_0x042c:
            r38 = r8
            r40 = 1
            r42 = 0
            r35 = r2
            r36 = r3
            r35.idkeyStat(r36, r38, r40, r42)
            int r1 = r7.size()
            if (r1 <= 0) goto L_0x0598
            int r1 = r19.size()
            if (r1 <= 0) goto L_0x0547
            java.util.Iterator r1 = r7.iterator()
            r7 = 0
        L_0x044a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0598
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r19.size()
            if (r3 > r7) goto L_0x0474
            r3 = 2
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r1 = 0
            r0[r1] = r2
            int r1 = r19.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "Wrong! origImgPath:%s size:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r1, r0)
            goto L_0x0598
        L_0x0474:
            r9 = r19
            r3 = 2
            java.lang.Object r4 = r9.get(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.util.Set<java.lang.Integer> r6 = com.tencent.p014mm.modelimage.C68129u.f195788r
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            java.util.HashSet r6 = (java.util.HashSet) r6
            boolean r6 = r6.contains(r8)
            if (r6 != 0) goto L_0x0525
            com.tencent.mm.modelimage.u r6 = com.tencent.p014mm.modelimage.C92837k0.Ax0()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            ck3.b r8 = r12.f215752d
            java.lang.String r8 = r8.mo91573n()
            r6.getClass()
            r13 = r26
            boolean r10 = eb0.C75592q0.m90771a(r2, r11, r13)
            com.tencent.mm.modelimage.m r14 = com.tencent.p014mm.modelimage.C92837k0.Bx0()
            int r15 = r4.intValue()
            com.tencent.mm.modelimage.k r14 = r14.mo127173TO(r15)
            java.lang.String r14 = r14.f267393t
            pc0.a0$e r15 = pc0.C100760a0.C100763e.IMAGE
            pc0.a0$f r15 = pc0.C100760a0.m131932b(r15)
            int r4 = r4.intValue()
            r15.f295207u = r4
            r4 = 3
            r15.f295195i = r4
            r15.f295188b = r8
            r15.f295187a = r11
            r15.f295196j = r2
            r15.f295197k = r10
            r15.f295198l = r6
            r10 = r25
            r15.f295200n = r10
            r15.f295204r = r14
            r15.f295205s = r0
            r8 = 1
            r15.f295202p = r8
            r14 = 2131231570(0x7f080352, float:1.8079225E38)
            r15.f295201o = r14
            r15.f295208v = r8
            r8 = 14
            r15.f295194h = r8
            pc0.a0$b r8 = r15.mo140195a()
            T r8 = r8.f257313a
            com.tencent.mm.modelimage.c0 r8 = (com.tencent.p014mm.modelimage.C92809c0) r8
            ob0.v r14 = r6.f195792g
            r8.getClass()
            com.tencent.mm.modelimage.c0$f r15 = new com.tencent.mm.modelimage.c0$f
            r15.<init>(r14)
            r8.f267248A = r15
            r6.mo93638h(r8)
            com.tencent.mm.storage.f4 r6 = r8.getMsg()
            long r14 = r6.getMsgId()
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            long r14 = r6.longValue()
            di3.d r6 = di3.C86312j.m106911c(r24)
            h81.h r6 = (h81.C32735h) r6
            r8 = r20
            r3 = 1
            boolean r6 = r6.mo58784wf(r8, r3)
            if (r6 == 0) goto L_0x0522
            hi2.h r6 = hi2.C98453h.f288774a
            java.lang.String r14 = java.lang.String.valueOf(r14)
            r6.mo137803a(r14, r2)
        L_0x0522:
            r2 = 3
            r4 = 0
            goto L_0x053b
        L_0x0525:
            r8 = r20
            r10 = r25
            r13 = r26
            r2 = 3
            r3 = 1
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r4 = 0
            r6[r4] = r3
            java.lang.String r3 = "imgInfoId already running %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r6)
        L_0x053b:
            int r7 = r7 + 1
            r20 = r8
            r19 = r9
            r25 = r10
            r26 = r13
            goto L_0x044a
        L_0x0547:
            r8 = r20
            r10 = r25
            r13 = r26
            java.util.Iterator r0 = r7.iterator()
        L_0x0551:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0595
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            com.tencent.mm.modelimage.u r3 = com.tencent.p014mm.modelimage.C92837k0.Ax0()
            ck3.b r2 = r12.f215752d
            java.lang.String r5 = r2.mo91573n()
            r2 = 2131231570(0x7f080352, float:1.8079225E38)
            r4 = 3
            r6 = r11
            r7 = r1
            r14 = r8
            r15 = r27
            r8 = r10
            r9 = r13
            r16 = r10
            r10 = r2
            long r2 = r3.mo93636c(r4, r5, r6, r7, r8, r9, r10)
            di3.d r4 = di3.C86312j.m106911c(r24)
            h81.h r4 = (h81.C32735h) r4
            r5 = 1
            boolean r4 = r4.mo58784wf(r14, r5)
            if (r4 == 0) goto L_0x058f
            hi2.h r4 = hi2.C98453h.f288774a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r4.mo137803a(r2, r1)
        L_0x058f:
            r8 = r14
            r27 = r15
            r10 = r16
            goto L_0x0551
        L_0x0595:
            r16 = r10
            goto L_0x059a
        L_0x0598:
            r16 = r25
        L_0x059a:
            r15 = r27
            int r0 = r15.size()
            if (r0 <= 0) goto L_0x05d3
            java.util.Iterator r0 = r15.iterator()
        L_0x05a6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x05d3
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            com.tencent.mm.modelimage.u r3 = com.tencent.p014mm.modelimage.C92837k0.Ax0()
            ck3.b r2 = r12.f215752d
            java.lang.String r5 = r2.mo91573n()
            r9 = 1
            r10 = 2131231570(0x7f080352, float:1.8079225E38)
            r4 = 3
            r6 = r11
            r7 = r1
            r8 = r16
            long r2 = r3.mo93636c(r4, r5, r6, r7, r8, r9, r10)
            hi2.h r4 = hi2.C98453h.f288774a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r4.mo137803a(r2, r1)
            goto L_0x05a6
        L_0x05d3:
            ck3.b r0 = r12.f215752d
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.mo91571l()
            com.tencent.mm.ui.chatting.component.u4 r1 = new com.tencent.mm.ui.chatting.component.u4
            r1.<init>(r12)
            r0.post(r1)
            goto L_0x05e7
        L_0x05e2:
            java.lang.String r0 = "send image list is null or nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x05e7:
            r0 = r43
        L_0x05e9:
            com.tencent.mm.ui.chatting.component.t4 r1 = r0.f216126i
            ck3.b r1 = r1.f215752d
            java.lang.Class<zj3.g1> r2 = zj3.C79359g1.class
            com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
            xi.d r1 = r1.mo102812a(r2)
            zj3.g1 r1 = (zj3.C79359g1) r1
            android.content.Intent r2 = r0.f216121d
            java.lang.String r3 = r0.f216122e
            r1.mo102707Z0(r2, r3)
            com.tencent.mm.ui.chatting.component.t4 r1 = r0.f216126i
            ck3.b r1 = r1.f215752d
            r2 = 1
            r1.mo91543D(r2)
            zj3.w r1 = r0.f216124g
            com.tencent.mm.ui.chatting.ChatFooterCustom r1 = r1.mo102179E1()
            if (r1 == 0) goto L_0x061b
            zj3.w r1 = r0.f216124g
            com.tencent.mm.ui.chatting.ChatFooterCustom r1 = r1.mo102179E1()
            int r2 = r0.f216125h
            android.content.Intent r3 = r0.f216121d
            r1.mo102050f(r2, r3)
        L_0x061b:
            com.tencent.mm.sdk.platformtools.MMHandlerThread r1 = f40.C86709a0.m107525e()
            r1.setLowPriority()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.t4$$b.run():void");
    }
}
