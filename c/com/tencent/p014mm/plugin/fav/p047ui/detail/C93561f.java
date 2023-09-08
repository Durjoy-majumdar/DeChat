package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import p159gw.C98250h;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.f */
public class C93561f implements C98250h.C98251a {

    /* renamed from: a */
    public final /* synthetic */ String f270214a;

    /* renamed from: b */
    public final /* synthetic */ FavoriteFileDetailUI f270215b;

    public C93561f(FavoriteFileDetailUI favoriteFileDetailUI, String str) {
        this.f270215b = favoriteFileDetailUI;
        this.f270214a = str;
    }

    /* renamed from: a */
    public void mo2055a(String str, String str2) {
        Log.m105925i("MicroMsg.FavoriteFileDetailUI", "%d save video now video path %s out path %s", Integer.valueOf(hashCode()), this.f270214a, str2);
        Toast.makeText(this.f270215b.getContext(), this.f270215b.getString(C0966R.string.kah, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(str2)}), 1).show();
        AndroidMediaUtil.refreshMediaScanner(str2, this.f270215b.getContext());
    }

    /* renamed from: b */
    public void mo2056b(String str, String str2) {
        Log.m105925i("MicroMsg.FavoriteFileDetailUI", "%d save video now video path %s out path %s", Integer.valueOf(hashCode()), this.f270214a, str2);
        Toast.makeText(this.f270215b.getContext(), this.f270215b.getString(C0966R.string.kag), 1).show();
    }
}
