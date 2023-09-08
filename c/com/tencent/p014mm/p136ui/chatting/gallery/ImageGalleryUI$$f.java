package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.sdk.platformtools.Util;
import p200lx.C46900z;
import qo3.C77407n;
import te3.C51216sa2;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$f */
public class ImageGalleryUI$$f implements C46900z.C46902b {

    /* renamed from: a */
    public final /* synthetic */ ImageGalleryUI f284505a;

    public ImageGalleryUI$$f(ImageGalleryUI imageGalleryUI) {
        this.f284505a = imageGalleryUI;
    }

    /* renamed from: a */
    public void mo72110a(String str, C51216sa2 sa22) {
        ImageQBarDataBean imageQBarDataBean;
        C77407n nVar = this.f284505a.f284448m1;
        if (nVar != null && nVar.mo107563h() && (imageQBarDataBean = this.f284505a.f284451n1.f287787c) != null && Util.isEqual(str, imageQBarDataBean.f273113d)) {
            this.f284505a.mo135751W8();
        }
        this.f284505a.f284451n1.f287787c = null;
    }
}
