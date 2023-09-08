package com.tencent.p014mm.p136ui.chatting.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import s90.C48300n;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$h0 */
public class ImageGalleryUI$$h0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C48300n f284512d;

    /* renamed from: e */
    public final /* synthetic */ ImageGalleryUI f284513e;

    public ImageGalleryUI$$h0(ImageGalleryUI imageGalleryUI, C48300n nVar) {
        this.f284513e = imageGalleryUI;
        this.f284512d = nVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$45", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C48300n nVar = this.f284512d;
        if (nVar == null || Util.isNullOrNil(nVar.f133375p)) {
            Log.m105928w("MicroMsg.ImageGalleryUI", "srcUserName is null");
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$45", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("Contact_User", this.f284512d.f133375p);
        intent.putExtra("Contact_Scene", 163);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        C88144b.m109791i(this.f284513e.f284432g.f284714g, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        C115669n.INSTANCE.mo160131h(18589, 1, Integer.valueOf(this.f284513e.mo135786s8()));
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$45", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
