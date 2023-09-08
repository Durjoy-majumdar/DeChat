package com.tencent.p014mm.plugin.fav.p047ui.gallery;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import p159gw.C98250h;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.fav.ui.gallery.g */
public class C93625g implements C98250h.C98251a {

    /* renamed from: a */
    public final /* synthetic */ FavMediaGalleryUI f270349a;

    public C93625g(FavMediaGalleryUI favMediaGalleryUI) {
        this.f270349a = favMediaGalleryUI;
    }

    /* renamed from: a */
    public void mo2055a(String str, String str2) {
        FavMediaGalleryUI favMediaGalleryUI = this.f270349a;
        C76701a.makeText((Context) favMediaGalleryUI, (CharSequence) favMediaGalleryUI.getString(C0966R.string.bwc, new Object[]{AndroidMediaUtil.getToastSysCameraPath()}), 1).show();
    }

    /* renamed from: b */
    public void mo2056b(String str, String str2) {
        FavMediaGalleryUI favMediaGalleryUI = this.f270349a;
        C76701a.makeText((Context) favMediaGalleryUI, (CharSequence) favMediaGalleryUI.getString(C0966R.string.cr4), 1).show();
    }
}
