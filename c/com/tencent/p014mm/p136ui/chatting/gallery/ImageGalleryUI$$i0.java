package com.tencent.p014mm.p136ui.chatting.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import ex0.C45696d;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import s90.C48300n;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$i0 */
public class ImageGalleryUI$$i0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C48300n f284514d;

    /* renamed from: e */
    public final /* synthetic */ ImageGalleryUI f284515e;

    public ImageGalleryUI$$i0(ImageGalleryUI imageGalleryUI, C48300n nVar) {
        this.f284515e = imageGalleryUI;
        this.f284514d = nVar;
    }

    public void onClick(View view) {
        Class cls = C45696d.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$46", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        int intExtra = this.f284515e.getIntent().getIntExtra("KOpenArticleSceneFromScene", 1);
        intent.putExtra("srcUsername", this.f284514d.f133375p);
        intent.putExtra("srcDisplayname", this.f284514d.f133376q);
        String a = C92721n.m116873a(this.f284514d.f133366d, 139, intExtra, (int) (System.currentTimeMillis() / 1000));
        if (!(((C45696d) C86709a0.m107533q(cls)).mo70957E5(139) && ((C45696d) C86709a0.m107533q(cls)).Ms0(this.f284515e, a, -1, true, 139, intExtra, intent))) {
            intent.putExtra("rawUrl", a);
            C88144b.m109791i(this.f284515e, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
        C115669n nVar = C115669n.INSTANCE;
        ImageGalleryUI imageGalleryUI = this.f284515e;
        int i = ImageGalleryUI.f284337S2;
        nVar.mo160131h(18589, 15, Integer.valueOf(imageGalleryUI.mo135786s8()));
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$46", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
