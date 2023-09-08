package com.tencent.p014mm.p136ui.chatting.gallery;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler$$g */
public class ImageGalleryVideoHandler$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f284601d;

    /* renamed from: e */
    public final /* synthetic */ ImageGalleryVideoHandler f284602e;

    public ImageGalleryVideoHandler$$g(ImageGalleryVideoHandler imageGalleryVideoHandler, String str) {
        this.f284602e = imageGalleryVideoHandler;
        this.f284601d = str;
    }

    public void run() {
        C97056h hVar = this.f284602e.f284638d;
        if (!(hVar == null || hVar.mo135934v() == null)) {
            ImageGalleryVideoHandler imageGalleryVideoHandler = this.f284602e;
            if (imageGalleryVideoHandler.f284579i != null) {
                imageGalleryVideoHandler.f284638d.mo135934v().mo135973i(false, 0.0f);
                if (!Util.isNullOrNil(this.f284601d)) {
                    Log.m105921e("MicroMsg.Imagegallery.handler.video", "mediaplay play video error, use third player.[%s]", this.f284601d);
                    try {
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.VIEW");
                        FileProviderHelper.setIntentDataAndType((Context) this.f284602e.f284638d.f284714g, intent, new C86009m1(this.f284601d), "video/*", false);
                        ImageGalleryUI imageGalleryUI = this.f284602e.f284638d.f284714g;
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        C117292a.m165358d(imageGalleryUI, aVar.mo10232b(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryVideoHandler$5", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        imageGalleryUI.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(imageGalleryUI, "com/tencent/mm/ui/chatting/gallery/ImageGalleryVideoHandler$5", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } catch (Exception unused) {
                        Log.m105920e("MicroMsg.Imagegallery.handler.video", "startActivity fail, activity not found");
                        C76879j.m92738i(this.f284602e.f284638d.f284714g, C0966R.string.cpc, C0966R.string.cpd);
                    }
                }
                ImageGalleryVideoHandler imageGalleryVideoHandler2 = this.f284602e;
                ImageGalleryVideoHandler$$k imageGalleryVideoHandler$$k = imageGalleryVideoHandler2.f284579i.get(imageGalleryVideoHandler2.f284593z);
                if (imageGalleryVideoHandler$$k != null && imageGalleryVideoHandler$$k.f284606a != null) {
                    this.f284602e.mo135850w(imageGalleryVideoHandler$$k.f284607b);
                    return;
                }
                return;
            }
        }
        Log.m105928w("MicroMsg.Imagegallery.handler.video", "show error alert but adapter is null.");
    }
}
