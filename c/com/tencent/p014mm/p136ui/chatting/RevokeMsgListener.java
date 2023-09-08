package com.tencent.p014mm.p136ui.chatting;

import android.app.Activity;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C75604z3;
import f40.C86709a0;
import hd0.C98398h0;
import hd0.C98408n0;
import hd0.C98447z0;
import java.lang.ref.WeakReference;
import p663qo.C101213l;
import p682rz.C101491u;

/* renamed from: com.tencent.mm.ui.chatting.RevokeMsgListener */
public class RevokeMsgListener extends IListener<RevokeMsgEvent> {

    /* renamed from: d */
    public C73288a f284317d;

    /* renamed from: e */
    public WeakReference<Activity> f284318e;

    /* renamed from: com.tencent.mm.ui.chatting.RevokeMsgListener$a */
    public enum C73288a {
        CHATTING_ITEM_VIDEO,
        IMAGE_GALLERY_UI,
        VIDEO_GALLERY
    }

    public RevokeMsgListener(C73288a aVar, Activity activity) {
        super(C40008f.f107254d);
        this.f284317d = aVar;
        this.f284318e = new WeakReference<>(activity);
        this.__eventId = 675629679;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x017a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            com.tencent.mm.autogen.events.RevokeMsgEvent r0 = (com.tencent.p014mm.autogen.events.RevokeMsgEvent) r0
            java.lang.ref.WeakReference<android.app.Activity> r2 = r1.f284318e
            java.lang.Object r2 = r2.get()
            android.app.Activity r2 = (android.app.Activity) r2
            com.tencent.mm.ui.chatting.RevokeMsgListener$a r3 = r1.f284317d
            r4 = 0
            if (r3 == 0) goto L_0x01aa
            if (r0 == 0) goto L_0x01aa
            if (r2 == 0) goto L_0x01aa
            com.tencent.mm.autogen.events.RevokeMsgEvent$a r3 = r0.f78943d
            long r11 = r3.f78944a
            java.lang.String r13 = r3.f78945b
            com.tencent.mm.storage.f4 r3 = r3.f78947d
            r5 = 0
            if (r3 == 0) goto L_0x002b
            long r7 = r3.getMsgId()
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x002f
        L_0x002b:
            com.tencent.mm.autogen.events.RevokeMsgEvent$a r0 = r0.f78943d
            com.tencent.mm.storage.f4 r3 = r0.f78947d
        L_0x002f:
            java.lang.String r14 = "MicroMsg.RevokeMsgListener"
            if (r3 != 0) goto L_0x003a
            java.lang.String r0 = "in callback msgInfo null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            goto L_0x01aa
        L_0x003a:
            int r0 = r3.getType()
            r7 = 3
            java.lang.String r15 = ""
            r10 = 2
            r8 = 1
            if (r0 == r7) goto L_0x00e2
            r5 = 34
            if (r0 == r5) goto L_0x00d4
            r5 = 43
            if (r0 == r5) goto L_0x0053
            r5 = 62
            if (r0 == r5) goto L_0x0053
            goto L_0x01aa
        L_0x0053:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.tencent.mm.ui.chatting.RevokeMsgListener$a r5 = r1.f284317d
            r0[r4] = r5
            android.os.Looper r5 = android.os.Looper.myLooper()
            com.tencent.mm.sdk.platformtools.MMHandlerThread r6 = f40.C86709a0.m107525e()
            android.os.Looper r6 = r6.getLooper()
            if (r5 != r6) goto L_0x0069
            r5 = 1
            goto L_0x006a
        L_0x0069:
            r5 = 0
        L_0x006a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0[r8] = r5
            java.lang.String r5 = "ashutest::revoke msg, type %s, isWorkerThread %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r14, r5, r0)
            com.tencent.mm.ui.chatting.RevokeMsgListener$a r0 = r1.f284317d
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x00cf
            if (r0 == r10) goto L_0x0081
            goto L_0x01aa
        L_0x0081:
            r1.mo135710e(r3)
            boolean r0 = r2 instanceof com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI
            if (r0 == 0) goto L_0x01aa
            r0 = r2
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = (com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI) r0
            com.tencent.mm.ui.chatting.gallery.h r5 = r0.f284432g
            if (r5 != 0) goto L_0x0090
            goto L_0x00a9
        L_0x0090:
            boolean r5 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124955K(r3)
            if (r5 == 0) goto L_0x00a9
            long r5 = r3.getMsgId()
            com.tencent.mm.ui.chatting.gallery.h r3 = r0.f284432g
            com.tencent.mm.storage.f4 r3 = r3.mo135935w()
            long r9 = r3.getMsgId()
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r8 = 0
        L_0x00aa:
            if (r8 == 0) goto L_0x01aa
            int r3 = r0.mo135768f8()
            r0.mo135781o8()
            com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar r5 = r0.f284400U0
            if (r5 != 0) goto L_0x00b8
            goto L_0x00c5
        L_0x00b8:
            r0.mo135781o8()
            com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar r5 = r0.f284400U0
            com.tencent.mm.ui.chatting.gallery.g0 r6 = new com.tencent.mm.ui.chatting.gallery.g0
            r6.<init>(r0, r3)
            r5.post(r6)
        L_0x00c5:
            com.tencent.mm.ui.chatting.f4 r0 = new com.tencent.mm.ui.chatting.f4
            r0.<init>(r1, r2)
            nj3.C76879j.m92713G(r2, r13, r15, r4, r0)
            goto L_0x01aa
        L_0x00cf:
            r1.mo135710e(r3)
            goto L_0x01aa
        L_0x00d4:
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent r0 = new com.tencent.mm.autogen.events.ExtTranslateVoiceEvent
            r0.<init>()
            com.tencent.mm.autogen.events.ExtTranslateVoiceEvent$a r2 = r0.f193561d
            r2.f193565c = r8
            r0.publish()
            goto L_0x01aa
        L_0x00e2:
            com.tencent.mm.ui.chatting.RevokeMsgListener$a r0 = r1.f284317d
            int r0 = r0.ordinal()
            if (r0 == r8) goto L_0x00ec
            goto L_0x01aa
        L_0x00ec:
            long r16 = r3.getMsgId()
            int r0 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0172
            long r5 = r3.getCreateTime()
            java.lang.String r0 = r3.mo108768t()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r15)
            r16 = r11
            long r10 = r3.getMsgId()
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            java.lang.String r9 = "downimg"
            java.lang.String r0 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r9, r5, r0, r7)
            java.lang.Class<qo.l> r5 = p663qo.C101213l.class
            di3.d r5 = di3.C86312j.m106911c(r5)     // Catch:{ Exception -> 0x0161 }
            qo.l r5 = (p663qo.C101213l) r5     // Catch:{ Exception -> 0x0161 }
            boolean r0 = r5.Gm0(r0)     // Catch:{ Exception -> 0x0161 }
            java.lang.String r5 = "[oneliang][revokeMsgImage] cancel result:%s"
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0161 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0161 }
            r6[r4] = r0     // Catch:{ Exception -> 0x0161 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r5, r6)     // Catch:{ Exception -> 0x0161 }
            ob0.b0 r0 = eb0.C97625j3.m125815e()     // Catch:{ Exception -> 0x0161 }
            r5 = 109(0x6d, float:1.53E-43)
            r0.mo123457c(r5)     // Catch:{ Exception -> 0x0161 }
            com.tencent.mm.modelimage.k r0 = com.tencent.p014mm.p136ui.chatting.gallery.C97100o.m125011p(r3)     // Catch:{ Exception -> 0x0161 }
            java.lang.Class<gt.k> r3 = p158gt.C98201k.class
            di3.d r3 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x0161 }
            gt.k r3 = (p158gt.C98201k) r3     // Catch:{ Exception -> 0x0161 }
            gt.j r3 = r3.Jp0()     // Catch:{ Exception -> 0x0161 }
            long r6 = r0.f267374a     // Catch:{ Exception -> 0x0161 }
            r10 = 1
            com.tencent.mm.modelimage.e r3 = (com.tencent.p014mm.modelimage.C92822e) r3     // Catch:{ Exception -> 0x0161 }
            r3.getClass()     // Catch:{ Exception -> 0x0161 }
            com.tencent.mm.modelimage.e$a r0 = new com.tencent.mm.modelimage.e$a     // Catch:{ Exception -> 0x0161 }
            r5 = r0
            r11 = 1
            r8 = r16
            r12 = 2
            r5.<init>(r6, r8, r10)     // Catch:{ Exception -> 0x015f }
            r3.mo127103e(r0)     // Catch:{ Exception -> 0x015f }
            goto L_0x0176
        L_0x015f:
            r0 = move-exception
            goto L_0x0164
        L_0x0161:
            r0 = move-exception
            r11 = 1
            r12 = 2
        L_0x0164:
            java.lang.Object[] r3 = new java.lang.Object[r11]
            java.lang.String r5 = r0.getMessage()
            r3[r4] = r5
            java.lang.String r5 = "[oneliang][revokeMsgImage] cancel failure:%s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r5, r3)
            goto L_0x0176
        L_0x0172:
            r16 = r11
            r11 = 1
            r12 = 2
        L_0x0176:
            boolean r0 = r2 instanceof com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI
            if (r0 == 0) goto L_0x01aa
            r0 = r2
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = (com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI) r0
            java.lang.Object[] r3 = new java.lang.Object[r12]
            java.lang.Long r5 = java.lang.Long.valueOf(r16)
            r3[r4] = r5
            long r5 = r0.f284369K1
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r3[r11] = r5
            java.lang.String r5 = "[oneliang][revokeMsgImage] image gallery ui,msg id is:%s,downloadingImageMsgId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r5, r3)
            long r5 = r0.f284369K1
            int r0 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x01aa
            com.tencent.mm.ui.chatting.e4 r0 = new com.tencent.mm.ui.chatting.e4     // Catch:{ all -> 0x01a1 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x01a1 }
            nj3.C76879j.m92713G(r2, r13, r15, r4, r0)     // Catch:{ all -> 0x01a1 }
            goto L_0x01aa
        L_0x01a1:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r3 = "revokeMsgListener err"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r3, r2)
        L_0x01aa:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.RevokeMsgListener.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }

    /* renamed from: e */
    public final void mo135710e(C72963f4 f4Var) {
        C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(f4Var.mo108765s2());
        if (Zd != null) {
            try {
                Log.m105925i("MicroMsg.RevokeMsgListener", "ashutest::[oneliang][revokeMsgVideo] cancel result:%s", Boolean.valueOf(((C101213l) C86312j.m106911c(C101213l.class)).Gm0(C1297x.m1387b("downvideo", Zd.f288563j, Zd.mo137707k(), Zd.mo137700d()))));
                C98447z0 Dx0 = C98398h0.Dx0();
                Dx0.getClass();
                C86709a0.m107524d().mo123458d(Dx0.f288765u);
                Dx0.mo137785b();
                C75604z3.m90833e(f4Var, true);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.RevokeMsgListener", e, "[oneliang][revokeMsgVideo] chatting item video,cancel failure:%s", e.getMessage());
            }
        }
    }
}
