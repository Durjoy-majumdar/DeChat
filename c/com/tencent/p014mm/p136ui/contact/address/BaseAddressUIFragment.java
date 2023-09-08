package com.tencent.p014mm.p136ui.contact.address;

import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.AbstractTabChildActivity;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.ui.contact.address.BaseAddressUIFragment */
public abstract class BaseAddressUIFragment extends AbstractTabChildActivity.AbStractTabFragment {

    /* renamed from: n */
    public static final /* synthetic */ int f218926n = 0;

    /* renamed from: com.tencent.mm.ui.contact.address.BaseAddressUIFragment$a */
    public class C74457a implements Runnable {

        /* renamed from: d */
        public int f218927d = 0;

        /* renamed from: e */
        public final /* synthetic */ View f218928e;

        public C74457a(View view) {
            this.f218928e = view;
        }

        public void run() {
            if (BaseAddressUIFragment.this.getView() != null) {
                int a = C75044y4.m89989a(BaseAddressUIFragment.this.getContext());
                int g = C75044y4.m89995g(BaseAddressUIFragment.this.getContext(), -1);
                if (g <= 0) {
                    if (this.f218927d < 2) {
                        Log.m105924i(BaseAddressUIFragment.this.mo103309R(), "[trySetParentViewPadding] try getStatusHeight again!");
                        BaseAddressUIFragment.this.getView().post(this);
                    } else {
                        Log.m105920e(BaseAddressUIFragment.this.mo103309R(), "[trySetParentViewPadding] try getStatusHeight finally!");
                    }
                    this.f218927d++;
                } else {
                    BaseAddressUIFragment baseAddressUIFragment = BaseAddressUIFragment.this;
                    int i = BaseAddressUIFragment.f218926n;
                    int S = baseAddressUIFragment.mo103516S();
                    if (S != BaseAddressUIFragment.this.getView().getPaddingTop()) {
                        Log.m105925i(BaseAddressUIFragment.this.mo103309R(), "[trySetParentViewPadding] now:%s old:%s", Integer.valueOf(S), Integer.valueOf(BaseAddressUIFragment.this.getView().getPaddingTop()));
                        BaseAddressUIFragment.this.getView().setPadding(0, S, 0, this.f218928e.getHeight());
                    } else {
                        Log.m105925i(BaseAddressUIFragment.this.mo103309R(), "[trySetParentViewPadding] has try more once! it's right! actionBarHeight:%s actionBarHeight:%s", Integer.valueOf(g), Integer.valueOf(a));
                    }
                }
                Log.m105925i(BaseAddressUIFragment.this.mo103309R(), "[trySetParentViewPadding] tryCount:%s actionBarHeight:%s actionBarHeight:%s", Integer.valueOf(this.f218927d), Integer.valueOf(g), Integer.valueOf(a));
            }
        }
    }

    /* renamed from: K */
    public void mo101235K(Bundle bundle) {
    }

    /* renamed from: L */
    public void mo101236L() {
    }

    /* renamed from: M */
    public void mo101237M() {
    }

    /* renamed from: N */
    public void mo101238N() {
    }

    /* renamed from: O */
    public void mo101239O() {
    }

    /* renamed from: P */
    public void mo101240P() {
    }

    /* renamed from: Q */
    public void mo101241Q() {
    }

    /* renamed from: R */
    public abstract String mo103309R();

    /* renamed from: S */
    public final int mo103516S() {
        int i;
        int a = C75044y4.m89989a(getContext());
        int g = C75044y4.m89995g(getContext(), -1);
        View findViewById = getView().getRootView().findViewById(C0966R.C0970id.f5383do);
        if (!C85875k4.m106164U()) {
            int i2 = Build.VERSION.SDK_INT;
            boolean isInMultiWindowMode = (i2 < 24 || LauncherUI.getInstance() == null) ? false : LauncherUI.getInstance().isInMultiWindowMode();
            if (!isInMultiWindowMode) {
                SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
                if (((defaultPreference != null ? defaultPreference.getBoolean("Main_need_read_top_margin", false) : false) || i2 >= 31) && (i = defaultPreference.getInt("Main_top_marign", -1)) >= 0) {
                    return a + i;
                }
            }
            if (isInMultiWindowMode) {
                g = findViewById != null ? findViewById.getTop() : 0;
            }
            Log.m105925i(mo103309R(), "getTopHeight statusHeight:%s, isInMultiWindowMode:%s", Integer.valueOf(g), Boolean.valueOf(isInMultiWindowMode));
        } else if (findViewById == null) {
            return a + g;
        } else {
            g = findViewById.getTop();
        }
        return a + g;
    }

    /* renamed from: T */
    public abstract void mo103310T();

    /* renamed from: U */
    public abstract void mo103311U(boolean z);

    /* renamed from: V */
    public void mo103517V() {
        View findViewById = getView().getRootView().findViewById(C0966R.C0970id.f358508fj3);
        int a = C75044y4.m89989a(getContext());
        int g = C75044y4.m89995g(getContext(), -1);
        C74457a aVar = new C74457a(findViewById);
        if (g <= 0) {
            getView().post(aVar);
            return;
        }
        getView().setPadding(0, mo103516S(), 0, findViewById.getHeight());
        Log.m105925i(mo103309R(), "[trySetParentViewPadding] actionBarHeight:%s actionBarHeight:%s", Integer.valueOf(g), Integer.valueOf(a));
        getView().postDelayed(aVar, 100);
    }

    /* renamed from: d */
    public void mo25899d() {
    }

    /* renamed from: g */
    public void mo25903g() {
    }

    public boolean noActionBar() {
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo103517V();
    }

    /* renamed from: r */
    public void mo25918r() {
    }

    public boolean supportNavigationSwipeBack() {
        return false;
    }

    /* renamed from: t */
    public void mo25922t() {
    }
}
