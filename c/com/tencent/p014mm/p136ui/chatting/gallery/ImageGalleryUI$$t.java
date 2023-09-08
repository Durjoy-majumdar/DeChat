package com.tencent.p014mm.p136ui.chatting.gallery;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.NotifyDealQBarStrResultEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import gk3.C98136e;
import gk3.C98153k;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$t */
public class ImageGalleryUI$$t implements C98153k {

    /* renamed from: a */
    public final /* synthetic */ ImageGalleryUI f284539a;

    public ImageGalleryUI$$t(ImageGalleryUI imageGalleryUI) {
        this.f284539a = imageGalleryUI;
    }

    /* renamed from: a */
    public void mo135819a(NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent) {
        int i = 1;
        Log.m105925i("MicroMsg.ImageGalleryUI", "handleCode callback notifyEvent: %d", Integer.valueOf(notifyDealQBarStrResultEvent.f264935d.f264938c));
        ImageGalleryUI imageGalleryUI = this.f284539a;
        int i2 = ImageGalleryUI.f284337S2;
        imageGalleryUI.mo135783p8();
        if (imageGalleryUI.f284396T != null) {
            ImageGalleryUI imageGalleryUI2 = this.f284539a;
            imageGalleryUI2.mo135783p8();
            imageGalleryUI2.f284396T.setOnClickListener(this.f284539a);
        }
        Activity activity = notifyDealQBarStrResultEvent.f264935d.f264937b;
        ImageGalleryUI imageGalleryUI3 = this.f284539a;
        if (activity != imageGalleryUI3 || imageGalleryUI3.f284451n1.f287785a.isEmpty() || !notifyDealQBarStrResultEvent.f264935d.f264936a.equals(this.f284539a.f284451n1.f287785a.get(0).f273113d)) {
            Log.m105920e("MicroMsg.ImageGalleryUI", "handleCode callback not the same");
            return;
        }
        NotifyDealQBarStrResultEvent.C92533a aVar = notifyDealQBarStrResultEvent.f264935d;
        int i3 = aVar.f264938c;
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            this.f284539a.f284404V1.mo137415a(2);
            ImageGalleryUI imageGalleryUI4 = this.f284539a;
            if (imageGalleryUI4.f284399U == null) {
                imageGalleryUI4.f284399U = imageGalleryUI4.findViewById(C0966R.C0970id.j1z);
            }
            imageGalleryUI4.mo135743S8(imageGalleryUI4.f284399U, 8);
        } else if (i3 == 3) {
            Bundle bundle = aVar.f264939d;
            boolean z = bundle != null ? bundle.getBoolean("key_scan_qr_code_result", true) : true;
            C98136e eVar = this.f284539a.f284404V1;
            if (!z) {
                i = 2;
            }
            eVar.mo137415a(i);
            this.f284539a.finish();
        }
    }
}
