package com.tencent.p014mm.p136ui.chatting.gallery;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import gq0.C45944i0;
import hd0.C98408n0;
import hd0.C98429r0;
import java.lang.ref.WeakReference;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$y0 */
public class ImageGalleryUI$$y0 implements C45944i0 {

    /* renamed from: b */
    public final WeakReference<ImageGalleryUI> f284558b;

    /* renamed from: c */
    public Runnable f284559c = null;

    /* renamed from: d */
    public C72963f4 f284560d = null;

    public ImageGalleryUI$$y0(ImageGalleryUI imageGalleryUI) {
        this.f284558b = new WeakReference<>(imageGalleryUI);
    }

    /* renamed from: a */
    public void mo71346a(Runnable runnable) {
        int i;
        Log.m105924i("MicroMsg.ImageGalleryUI", "executeOrDefer");
        ImageGalleryUI imageGalleryUI = this.f284558b.get();
        if (imageGalleryUI == null) {
            Log.m105924i("MicroMsg.ImageGalleryUI", "executeOrDefer, ui is null");
            return;
        }
        C72963f4 w = imageGalleryUI.f284432g.mo135935w();
        if (w != null && w.mo100994f4()) {
            C98408n0 i2 = C98429r0.m127818i(w.mo108765s2());
            if (i2 != null && (i = i2.f288562i) != 199 && i != 199) {
                Log.m105924i("MicroMsg.ImageGalleryUI", "executeOrDefer, video start download and waiting");
                imageGalleryUI.f284372L1 = C98429r0.m127814e(w.getMsgId(), 4);
                C97056h hVar = imageGalleryUI.f284432g;
                int currentItem = imageGalleryUI.f284450n.getCurrentItem();
                hVar.f284720p.mo135825B(hVar.mo135937y(currentItem), currentItem);
                this.f284559c = runnable;
                this.f284560d = w;
            } else if (Looper.getMainLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                ((C119157j) C119157j.f356862d).mo183895z(runnable);
            }
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            ((C119157j) C119157j.f356862d).mo183895z(runnable);
        }
    }
}
