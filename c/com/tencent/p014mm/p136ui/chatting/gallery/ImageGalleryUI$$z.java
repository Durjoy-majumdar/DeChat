package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import gk3.C98136e;
import gk3.C98162q;
import java.util.HashMap;
import qo3.C77407n;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$z */
public class ImageGalleryUI$$z implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ ImageGalleryUI f284561a;

    public ImageGalleryUI$$z(ImageGalleryUI imageGalleryUI) {
        this.f284561a = imageGalleryUI;
    }

    public void onDismiss() {
        HashMap<String, Boolean> hashMap;
        ImageGalleryUI imageGalleryUI = this.f284561a;
        imageGalleryUI.f284448m1 = null;
        ((ScanCodeSheetItemLogic) imageGalleryUI.f284401U1).mo67083n();
        C98136e.C98138b bVar = this.f284561a.f284404V1.f287731c;
        if (!(bVar == null || (hashMap = bVar.f287747j) == null)) {
            Boolean put = hashMap.put("1,2", Boolean.FALSE);
        }
        this.f284561a.f284422c2.reset();
        C98162q qVar = this.f284561a.f284451n1;
        qVar.f287786b = null;
        qVar.f287787c = null;
    }
}
