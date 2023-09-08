package com.tencent.p014mm.plugin.fav.p047ui.gallery;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import p159gw.C98250h;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.fav.ui.gallery.f */
public class C2295f implements C98250h.C98251a {

    /* renamed from: a */
    public final /* synthetic */ String f12442a;

    /* renamed from: b */
    public final /* synthetic */ FavMediaGalleryUI f12443b;

    public C2295f(FavMediaGalleryUI favMediaGalleryUI, String str) {
        this.f12443b = favMediaGalleryUI;
        this.f12442a = str;
    }

    /* renamed from: a */
    public void mo2055a(String str, String str2) {
        Log.m105925i("MicroMsg.FavMediaGalleryUI", "save video now video path %s out path %s", this.f12442a, str2);
        C76701a.makeText((Context) this.f12443b.getContext(), (CharSequence) this.f12443b.getString(C0966R.string.kah, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(str2)}), 1).show();
        AndroidMediaUtil.refreshMediaScanner(str2, this.f12443b.getContext());
    }

    /* renamed from: b */
    public void mo2056b(String str, String str2) {
        Log.m105925i("MicroMsg.FavMediaGalleryUI", "save video now video path %s out path %s", this.f12442a, str2);
        C76701a.makeText((Context) this.f12443b.getContext(), (CharSequence) this.f12443b.getString(C0966R.string.kag), 1).show();
    }
}
