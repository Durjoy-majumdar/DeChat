package com.tencent.p014mm.p136ui.chatting.gallery;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ScanTranslationResultEvent;
import com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.chatting.gallery.e0 */
public class C97046e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ScanTranslationResultEvent f284690d;

    /* renamed from: e */
    public final /* synthetic */ ImageGalleryUI.C9702041 f284691e;

    public C97046e0(ImageGalleryUI.C9702041 r1, ScanTranslationResultEvent scanTranslationResultEvent) {
        this.f284691e = r1;
        this.f284690d = scanTranslationResultEvent;
    }

    public void run() {
        if (ImageGalleryUI.this.f284351E1 == this.f284690d.f265089d.f265090a) {
            ImageGalleryUI.this.mo135756Z7(false);
            ScanTranslationResultEvent.C92560a aVar = this.f284690d.f265089d;
            if (aVar.f265092c) {
                if (C86013q1.m106450k(aVar.f265093d)) {
                    C97056h hVar = ImageGalleryUI.this.f284432g;
                    if (hVar != null) {
                        hVar.mo135918M(hVar.mo135935w(), true, ImageGalleryUI.this.f284488y2);
                        ImageGalleryUI imageGalleryUI = ImageGalleryUI.this;
                        imageGalleryUI.mo135732N7(imageGalleryUI.f284432g.mo135935w(), true);
                        return;
                    }
                    Log.m105920e("MicroMsg.ImageGalleryUI", "adapter is null, fail to set translate status.");
                } else {
                    Log.m105929w("MicroMsg.ImageGalleryUI", "trans result path %s not exist!", this.f284690d.f265089d.f265093d);
                }
            }
            ImageGalleryUI.this.f284351E1 = 0;
            ImageGalleryUI imageGalleryUI2 = ImageGalleryUI.this;
            C76879j.m92713G(imageGalleryUI2, imageGalleryUI2.getString(C0966R.string.ien), "", false, (DialogInterface.OnClickListener) null);
            ImageGalleryUI.this.f284404V1.mo137415a(2);
        }
    }
}
