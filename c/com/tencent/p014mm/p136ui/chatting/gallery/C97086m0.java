package com.tencent.p014mm.p136ui.chatting.gallery;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.ui.chatting.gallery.m0 */
public class C97086m0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ View f284816d;

    /* renamed from: e */
    public final /* synthetic */ ImageGalleryUI f284817e;

    public C97086m0(ImageGalleryUI imageGalleryUI, View view) {
        this.f284817e = imageGalleryUI;
        this.f284816d = view;
    }

    public void onGlobalLayout() {
        this.f284816d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int A = C76577a.m92145A(this.f284817e);
        int j = C76577a.m92159j(this.f284817e);
        Log.m105925i("MicroMsg.ImageGalleryUI", "handleHorizontalUI width = %d, height = %d", Integer.valueOf(A), Integer.valueOf(j));
        if (A <= j || (C11171e.m11046c(24) && this.f284817e.isInMultiWindowMode())) {
            ImageGalleryUI.m124726H7(this.f284817e);
            return;
        }
        ImageGalleryUI imageGalleryUI = this.f284817e;
        int i = ImageGalleryUI.f284337S2;
        imageGalleryUI.getClass();
        int c = C75044y4.m89991c(imageGalleryUI);
        Log.m105925i("MicroMsg.ImageGalleryUI", "%d handleHorizontalUI image gallery ui isNavigationBarTint %b navBarHeight %d", Integer.valueOf(imageGalleryUI.hashCode()), Boolean.valueOf(imageGalleryUI.f284463r), Integer.valueOf(c));
        View view = imageGalleryUI.f284346C2;
        if (view != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, c, 0);
            imageGalleryUI.f284346C2.setLayoutParams(layoutParams);
        }
        int f = C76577a.m92155f(imageGalleryUI, C0966R.dimen.f3766df);
        int f2 = C76577a.m92155f(imageGalleryUI, C0966R.dimen.f3743cv);
        int f3 = C76577a.m92155f(imageGalleryUI, C0966R.dimen.f3723cd);
        int f4 = C76577a.m92155f(imageGalleryUI, C0966R.dimen.f3749d0);
        int f5 = C76577a.m92155f(imageGalleryUI, C0966R.dimen.f3761db);
        int i2 = f * 3;
        int max = Math.max(c - i2, 0);
        int i3 = f * 2;
        int max2 = Math.max(f4 - max, 0);
        imageGalleryUI.f284456p.setPadding(max, i3, max, i3);
        imageGalleryUI.f284489z = f3;
        int i4 = max + f4;
        imageGalleryUI.f284338A = i4;
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageGalleryUI.f284353F.getLayoutParams();
        layoutParams2.removeRule(3);
        layoutParams2.setMargins(max2, f2, 0, f2);
        layoutParams2.addRule(15);
        imageGalleryUI.f284353F.setLayoutParams(layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) imageGalleryUI.f284359H.getLayoutParams();
        layoutParams3.removeRule(3);
        layoutParams3.setMargins(f3, f2, 0, f2);
        layoutParams3.addRule(15);
        imageGalleryUI.f284359H.setLayoutParams(layoutParams3);
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) imageGalleryUI.f284368K.getLayoutParams();
        layoutParams4.setMargins(0, i3, f4, 0);
        imageGalleryUI.f284368K.setLayoutParams(layoutParams4);
        RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) imageGalleryUI.f284362I.getLayoutParams();
        layoutParams5.removeRule(3);
        layoutParams5.setMargins(f3, f2, 0, f2);
        layoutParams5.addRule(15);
        imageGalleryUI.f284362I.setLayoutParams(layoutParams5);
        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) imageGalleryUI.f284365J.getLayoutParams();
        layoutParams6.removeRule(3);
        layoutParams6.setMargins(f3, f2, 0, f2);
        layoutParams6.addRule(15);
        imageGalleryUI.f284365J.setLayoutParams(layoutParams6);
        imageGalleryUI.mo135781o8();
        RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) imageGalleryUI.f284403V0.getLayoutParams();
        layoutParams7.height = C76577a.m92157h(imageGalleryUI, C0966R.dimen.f3713c6);
        layoutParams7.bottomMargin = 0;
        imageGalleryUI.mo135781o8();
        imageGalleryUI.f284403V0.setLayoutParams(layoutParams7);
        RelativeLayout.LayoutParams layoutParams8 = (RelativeLayout.LayoutParams) imageGalleryUI.f284382P.getLayoutParams();
        layoutParams8.removeRule(3);
        layoutParams8.setMargins(0, f2, f4, f2);
        layoutParams8.addRule(15);
        imageGalleryUI.f284382P.setLayoutParams(layoutParams8);
        imageGalleryUI.mo135779m8();
        RelativeLayout.LayoutParams layoutParams9 = (RelativeLayout.LayoutParams) imageGalleryUI.f284377N.getLayoutParams();
        layoutParams9.removeRule(3);
        layoutParams9.setMargins(0, f2, f3, f2);
        layoutParams9.addRule(15);
        imageGalleryUI.mo135779m8();
        imageGalleryUI.f284377N.setLayoutParams(layoutParams9);
        imageGalleryUI.mo135777k8();
        RelativeLayout.LayoutParams layoutParams10 = (RelativeLayout.LayoutParams) imageGalleryUI.f284385Q.getLayoutParams();
        layoutParams10.removeRule(3);
        layoutParams10.setMargins(0, f2, f3, f2);
        layoutParams10.addRule(15);
        imageGalleryUI.mo135777k8();
        imageGalleryUI.f284385Q.setLayoutParams(layoutParams10);
        RelativeLayout.LayoutParams layoutParams11 = (RelativeLayout.LayoutParams) imageGalleryUI.f284389R.getLayoutParams();
        layoutParams11.removeRule(3);
        layoutParams11.setMargins(0, f2, f3, f2);
        layoutParams11.addRule(15);
        imageGalleryUI.f284389R.setLayoutParams(layoutParams11);
        RelativeLayout.LayoutParams layoutParams12 = (RelativeLayout.LayoutParams) imageGalleryUI.f284393S.getLayoutParams();
        layoutParams12.setMargins(f * 5, 0, 0, i2);
        imageGalleryUI.f284393S.setLayoutParams(layoutParams12);
        imageGalleryUI.mo135783p8();
        RelativeLayout.LayoutParams layoutParams13 = (RelativeLayout.LayoutParams) imageGalleryUI.f284396T.getLayoutParams();
        layoutParams13.removeRule(3);
        layoutParams13.setMargins(0, f2, f3, f2);
        layoutParams13.addRule(15);
        imageGalleryUI.mo135783p8();
        imageGalleryUI.f284396T.setLayoutParams(layoutParams13);
        imageGalleryUI.mo135784q8();
        RelativeLayout.LayoutParams layoutParams14 = (RelativeLayout.LayoutParams) imageGalleryUI.f284402V.getLayoutParams();
        layoutParams14.removeRule(3);
        layoutParams14.setMargins(0, f2, f3, f2);
        layoutParams14.addRule(15);
        imageGalleryUI.mo135784q8();
        imageGalleryUI.f284402V.setLayoutParams(layoutParams14);
        imageGalleryUI.mo135778l8();
        RelativeLayout.LayoutParams layoutParams15 = (RelativeLayout.LayoutParams) imageGalleryUI.f284405W.getLayoutParams();
        layoutParams15.removeRule(3);
        layoutParams15.setMargins(0, f2, f3, f2);
        layoutParams15.addRule(15);
        imageGalleryUI.mo135778l8();
        imageGalleryUI.f284405W.setLayoutParams(layoutParams15);
        imageGalleryUI.mo135780n8();
        RelativeLayout.LayoutParams layoutParams16 = (RelativeLayout.LayoutParams) imageGalleryUI.f284414Z.getLayoutParams();
        layoutParams16.setMargins(max2, f2, 0, f2);
        layoutParams16.removeRule(3);
        layoutParams16.addRule(15);
        layoutParams16.addRule(9);
        imageGalleryUI.mo135780n8();
        imageGalleryUI.f284414Z.setLayoutParams(layoutParams16);
        imageGalleryUI.mo135781o8();
        RelativeLayout.LayoutParams layoutParams17 = (RelativeLayout.LayoutParams) imageGalleryUI.f284400U0.getLayoutParams();
        layoutParams17.addRule(1, C0966R.C0970id.l4y);
        layoutParams17.addRule(0, C0966R.C0970id.ck7);
        layoutParams17.setMargins(f5, f2, f5, f2);
        imageGalleryUI.mo135781o8();
        imageGalleryUI.f284400U0.setLayoutParams(layoutParams17);
        layoutParams17.addRule(1, C0966R.C0970id.m8t);
        if (imageGalleryUI.f284362I.getVisibility() == 0) {
            layoutParams17.addRule(1, C0966R.C0970id.m8w);
        }
        if (imageGalleryUI.f284365J.getVisibility() == 0) {
            layoutParams17.addRule(1, C0966R.C0970id.m8v);
        }
        imageGalleryUI.mo135785r8();
        RelativeLayout.LayoutParams layoutParams18 = (RelativeLayout.LayoutParams) imageGalleryUI.f284411Y.getLayoutParams();
        layoutParams18.setMargins(0, 0, i4, i3 + f2 + imageGalleryUI.f284485y + f);
        imageGalleryUI.mo135785r8();
        imageGalleryUI.f284411Y.setLayoutParams(layoutParams18);
        if (imageGalleryUI.f284344C) {
            imageGalleryUI.f284344C = false;
            imageGalleryUI.mo135771g9();
            imageGalleryUI.mo135785r8();
            if (imageGalleryUI.f284411Y.getVisibility() == 0) {
                imageGalleryUI.mo135759a9(true);
            }
        }
    }
}
