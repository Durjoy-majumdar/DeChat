package yl1;

import android.app.Activity;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.CustomViewPager;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d92.C45293c;
import gy3.C87412m;

/* renamed from: yl1.c */
public final class C53533c extends C45293c {

    /* renamed from: g */
    public final View f150503g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53533c(Activity activity, CustomViewPager customViewPager, View view) {
        super(activity, customViewPager);
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(view, "mContentView");
        this.f150503g = view;
    }

    /* renamed from: g */
    public boolean mo67907g() {
        return true;
    }

    public View getContentView() {
        return this.f122669a instanceof MMActivity ? super.getContentView() : this.f150503g;
    }

    public View getMaskView() {
        return this.f122669a instanceof MMActivity ? super.getMaskView() : getContentView();
    }
}
