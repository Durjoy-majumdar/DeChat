package com.tencent.p014mm.p136ui.chatting.gallery;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import hd0.C98429r0;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.chatting.gallery.o0 */
public class C97104o0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f284909d;

    /* renamed from: e */
    public final /* synthetic */ ImageGalleryVideoHandler f284910e;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.o0$a */
    public class C97105a implements DialogInterface.OnClickListener {

        /* renamed from: com.tencent.mm.ui.chatting.gallery.o0$a$a */
        public class C97106a implements Runnable {
            public C97106a() {
            }

            public void run() {
                ImageGalleryUI imageGalleryUI;
                C97056h hVar = C97104o0.this.f284910e.f284638d;
                if (hVar != null && (imageGalleryUI = hVar.f284714g) != null) {
                    imageGalleryUI.onBackPressed();
                }
            }
        }

        public C97105a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.cancel();
            }
            MMHandlerThread.postToMainThread(new C97106a());
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.o0$b */
    public class C97107b implements DialogInterface.OnClickListener {
        public C97107b(C97104o0 o0Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.cancel();
            }
        }
    }

    public C97104o0(ImageGalleryVideoHandler imageGalleryVideoHandler, int i) {
        this.f284910e = imageGalleryVideoHandler;
        this.f284909d = i;
    }

    public void run() {
        DialogInterface.OnClickListener onClickListener;
        Log.m105928w("MicroMsg.Imagegallery.handler.video", "show play video error.");
        C98429r0.m127816g(this.f284910e.f284593z);
        C97056h hVar = this.f284910e.f284638d;
        if (hVar != null) {
            C97087m1 v = hVar.mo135934v();
            v.mo135970f();
            v.f284849p.stop();
            v.mo135973i(false, 0.0f);
            String string = this.f284910e.f284638d.f284714g.getString(C0966R.string.kae);
            int i = this.f284909d;
            if (i == -5103059 || i == -5103087) {
                string = this.f284910e.f284638d.f284714g.getString(C0966R.string.kad);
                onClickListener = new C97105a();
            } else {
                onClickListener = new C97107b(this);
            }
            ImageGalleryUI imageGalleryUI = this.f284910e.f284638d.f284714g;
            C76879j.m92749t(imageGalleryUI, string, imageGalleryUI.getString(C0966R.string.bam), onClickListener);
            this.f284910e.f284581n.clear();
            this.f284910e.f284638d.f284714g.getClass();
        }
    }
}
