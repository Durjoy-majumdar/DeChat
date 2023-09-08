package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.p026ui.recents.AppBrandLauncherRecentsList;
import uo3.C78253a;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.w */
public class C68657w extends C78253a {

    /* renamed from: R */
    public final /* synthetic */ AppBrandLauncherRecentsList.C84609n f197210R;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68657w(AppBrandLauncherRecentsList.C84609n nVar, Context context) {
        super(context);
        this.f197210R = nVar;
    }

    /* renamed from: n */
    public boolean mo71743n(int i, int i2) {
        if (this.f197210R.f44854d.getParent() != null) {
            this.f197210R.f44854d.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.mo71743n(i, i2);
    }

    public void onDismiss() {
        if (this.f197210R.f44854d.getParent() != null) {
            this.f197210R.f44854d.getParent().requestDisallowInterceptTouchEvent(false);
        }
        super.onDismiss();
    }
}
