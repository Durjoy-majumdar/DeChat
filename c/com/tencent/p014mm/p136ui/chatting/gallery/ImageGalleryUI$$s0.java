package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$s0 */
public class ImageGalleryUI$$s0 extends C29060q.C29061a {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryUI f284537d;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$s0$a */
    public class C97024a implements Runnable {
        public C97024a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
            r0 = r0.mo135768f8();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                ob0.b0 r0 = f40.C86709a0.m107524d()
                int r0 = r0.mo123467m()
                r1 = 6
                if (r0 == r1) goto L_0x003e
                ob0.b0 r0 = f40.C86709a0.m107524d()
                int r0 = r0.mo123467m()
                r1 = 4
                if (r0 == r1) goto L_0x003e
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$s0 r0 = com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI$$s0.this
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284537d
                int r1 = r0.f284363I1
                r2 = 1
                if (r1 != r2) goto L_0x00a9
                r1 = 2131821610(0x7f11042a, float:1.9275968E38)
                java.lang.String r1 = r0.getString(r1)
                java.lang.String r2 = ""
                nj3.C76879j.m92748s(r0, r1, r2)
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$s0 r0 = com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI$$s0.this
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284537d
                r1 = 0
                r0.mo135756Z7(r1)
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$s0 r0 = com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI$$s0.this
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284537d
                gk3.e r0 = r0.f284404V1
                r1 = 2
                r0.mo137415a(r1)
                goto L_0x00a9
            L_0x003e:
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$s0 r0 = com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI$$s0.this
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284537d
                com.tencent.mm.ui.chatting.gallery.h r1 = r0.f284432g
                if (r1 != 0) goto L_0x0047
                return
            L_0x0047:
                int r0 = r0.mo135768f8()
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$s0 r1 = com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI$$s0.this
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r1 = r1.f284537d
                com.tencent.mm.ui.chatting.gallery.h r1 = r1.f284432g
                com.tencent.mm.storage.f4 r1 = r1.mo135937y(r0)
                if (r1 == 0) goto L_0x00a9
                boolean r1 = r1.mo100983V3()
                if (r1 == 0) goto L_0x00a9
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$s0 r1 = com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI$$s0.this
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r1 = r1.f284537d
                com.tencent.mm.ui.chatting.gallery.h r1 = r1.f284432g
                com.tencent.mm.ui.chatting.gallery.m1 r1 = r1.mo135934v()
                if (r1 != 0) goto L_0x0076
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$s0 r1 = com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI$$s0.this
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r1 = r1.f284537d
                com.tencent.mm.ui.chatting.gallery.h r1 = r1.f284432g
                com.tencent.mm.ui.chatting.gallery.m1 r1 = r1.mo135934v()
                r1.mo135970f()
            L_0x0076:
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$s0 r1 = com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI$$s0.this
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r1 = r1.f284537d
                com.tencent.mm.ui.chatting.gallery.h r1 = r1.f284432g
                com.tencent.mm.ui.chatting.gallery.m1 r1 = r1.mo135934v()
                r1.mo135970f()
                com.tencent.mm.ui.widget.MMPinProgressBtn r1 = r1.f284850q
                int r1 = r1.getVisibility()
                if (r1 == 0) goto L_0x00a0
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$s0 r1 = com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI$$s0.this
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r1 = r1.f284537d
                com.tencent.mm.ui.chatting.gallery.h r1 = r1.f284432g
                com.tencent.mm.ui.chatting.gallery.m1 r1 = r1.mo135934v()
                r1.mo135970f()
                android.widget.ProgressBar r1 = r1.f284858y
                int r1 = r1.getVisibility()
                if (r1 != 0) goto L_0x00a9
            L_0x00a0:
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$s0 r1 = com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI$$s0.this
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r1 = r1.f284537d
                com.tencent.mm.ui.chatting.gallery.h r1 = r1.f284432g
                r1.mo135921P(r0)
            L_0x00a9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI$$s0.C97024a.run():void");
        }
    }

    public ImageGalleryUI$$s0(ImageGalleryUI imageGalleryUI) {
        this.f284537d = imageGalleryUI;
    }

    public void onNetworkChange(int i) {
        MMHandlerThread.postToMainThread(new C97024a());
    }
}
