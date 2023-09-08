package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.GalleryTranslateReportStruct;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.plugin.scanner.C30391y;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75569c4;
import nj3.C11182m0;
import nj3.C76874e0;
import tk2.C101904b;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$x */
public class ImageGalleryUI$$x implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f284553d;

    /* renamed from: e */
    public final /* synthetic */ ImageGalleryUI f284554e;

    public ImageGalleryUI$$x(ImageGalleryUI imageGalleryUI, C72963f4 f4Var) {
        this.f284554e = imageGalleryUI;
        this.f284553d = f4Var;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.clear();
        if (C75569c4.m90671d(this.f284553d)) {
            ImageGalleryUI imageGalleryUI = this.f284554e;
            int i = ImageGalleryUI.f284337S2;
            if (imageGalleryUI.mo135745T8() && !this.f284554e.mo135726I8() && !C72996z1.m85812O4(this.f284554e.f284423d)) {
                e0Var.mo107144g(5, this.f284554e.getString(C0966R.string.b8e), C0966R.raw.icons_outlined_chats);
                return;
            }
            return;
        }
        int i2 = 1;
        if (!C75569c4.m90688u(this.f284553d) && !C75569c4.m90692y(this.f284553d) && !this.f284553d.mo101016t3()) {
            String str = null;
            if (C97056h.m124953H(this.f284553d) || C97056h.m124952F(this.f284553d)) {
                str = this.f284554e.getString(C0966R.string.iam);
            } else if (!C97056h.m124955K(this.f284553d) && !C97056h.m124954I(this.f284553d)) {
                str = this.f284554e.getString(C0966R.string.iaq);
            } else if (!this.f284553d.mo100983V3()) {
                str = this.f284554e.getString(C0966R.string.iar);
            }
            if (!this.f284553d.mo100983V3()) {
                e0Var.mo107144g(1, str, C0966R.raw.icons_outlined_download);
            }
        }
        if (C97056h.m124953H(this.f284553d)) {
            if ((this.f284554e.f284345C1 != 1) && !this.f284553d.mo101016t3()) {
                e0Var.mo107144g(6, this.f284554e.getString(C0966R.string.b8g), C0966R.raw.icons_outlined_pencil);
            }
        }
        ImageGalleryUI imageGalleryUI2 = this.f284554e;
        int i3 = ImageGalleryUI.f284337S2;
        if (imageGalleryUI2.mo135745T8() && !this.f284554e.mo135726I8() && !C72996z1.m85812O4(this.f284554e.f284423d)) {
            e0Var.mo107144g(5, this.f284554e.getString(C0966R.string.b8e), C0966R.raw.icons_outlined_chats);
        }
        if (this.f284554e.mo135745T8() && !C72996z1.m85812O4(this.f284554e.f284423d) && this.f284553d.mo101016t3()) {
            e0Var.mo107144g(13, this.f284554e.getString(C0966R.string.b_5), C0966R.raw.icons_filled_multiple_choice_new);
        }
        if ((C30391y.f81992d || this.f284554e.mo135792x8(1)) && !Util.isNullOrNil(this.f284554e.mo135788u5())) {
            e0Var.mo107144g(7, this.f284554e.getString(C0966R.string.b8i), C0966R.raw.icons_outlined_translate);
            GalleryTranslateReportStruct galleryTranslateReportStruct = new GalleryTranslateReportStruct();
            ImageGalleryUI imageGalleryUI3 = this.f284554e;
            galleryTranslateReportStruct.f265618d = imageGalleryUI3.f284363I1 == 2 ? 1 : 0;
            galleryTranslateReportStruct.f265619e = 2;
            galleryTranslateReportStruct.f265620f = 4;
            C72963f4 w = imageGalleryUI3.f284432g.mo135935w();
            imageGalleryUI3.getClass();
            C92836k p = C97100o.m125011p(w);
            if (p != null) {
                galleryTranslateReportStruct.mo126621t(p.mo127136g());
                galleryTranslateReportStruct.mo126620s(p.mo127133d());
            }
            galleryTranslateReportStruct.mo86054n();
        }
        ImageGalleryUI imageGalleryUI4 = this.f284554e;
        if (imageGalleryUI4.f284357G1) {
            e0Var.mo107144g(12, imageGalleryUI4.getString(C0966R.string.b8f), C0966R.raw.icons_outlined_ocr);
            boolean U5 = C72996z1.m85820U5(this.f284553d.mo108768t());
            ImageGalleryUI imageGalleryUI5 = this.f284554e;
            C101904b bVar = imageGalleryUI5.f284422c2;
            if (U5) {
                i2 = 2;
            }
            bVar.mo10651a(2, i2, imageGalleryUI5.f284360H1);
        }
    }
}
