package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.appusage.C81478e0;
import com.tencent.p014mm.plugin.appbrand.appusage.C81508l;
import com.tencent.p014mm.plugin.appbrand.appusage.C81524s;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandLauncherBlankPage;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandLauncherUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.launcher.FolderActivityContextWithLifecycle;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.Set;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.RecentsFolderActivityContext */
public class RecentsFolderActivityContext extends FolderActivityContextWithLifecycle {

    /* renamed from: d */
    public int f246898d;

    /* renamed from: e */
    public String f246899e;

    /* renamed from: f */
    public int f246900f = 0;

    public RecentsFolderActivityContext(MMActivity mMActivity) {
        super(mMActivity);
    }

    /* renamed from: A2 */
    public void mo117057A2(boolean z) {
        AppBrandLauncherUI.Fragment fragment;
        Class cls = z ? AppBrandLauncherRecentsList.class : AppBrandLauncherBlankPage.class;
        Fragment findFragmentById = mo117251a().getSupportFragmentManager().findFragmentById(16908290);
        if ((findFragmentById == null || !cls.isInstance(findFragmentById)) && !mo117251a().isFinishing() && !mo117251a().activityHasDestroyed() && !mo117251a().isStopped()) {
            C112919c0 beginTransaction = mo117251a().getSupportFragmentManager().beginTransaction();
            if (z) {
                fragment = new AppBrandLauncherRecentsList(mo117251a() instanceof AppBrandLauncherUI);
            } else {
                String string = getString(C0966R.string.f7674nk);
                String string2 = getString(C0966R.string.f7742q6);
                AppBrandLauncherBlankPage appBrandLauncherBlankPage = new AppBrandLauncherBlankPage();
                Bundle bundle = new Bundle(2);
                bundle.putString("extra_title", string);
                bundle.putString("extra_tip", string2);
                appBrandLauncherBlankPage.setArguments(bundle);
                fragment = appBrandLauncherBlankPage;
            }
            fragment.mo117068O(this.f246898d);
            fragment.f246390f = this.f246899e;
            beginTransaction.mo165200l(16908290, fragment);
            beginTransaction.mo165162d();
        }
    }

    /* renamed from: b */
    public void mo117188b(Intent intent) {
        this.f246898d = intent.getIntExtra("extra_enter_scene", 1);
        this.f246899e = intent.getStringExtra("extra_enter_scene_note");
    }

    public void onActivityDidResume() {
        boolean z = true;
        if (mo117251a() instanceof AppBrandLauncherUI) {
            if (!C81508l.m100000b() && !C81508l.m99999a()) {
                Set<Object> set = C81478e0.f239071d;
                int ordinal = (!C86709a0.m107522a() ? C81478e0.C81479a.FORCE_OFF : C81478e0.C81479a.FORCE_ON).ordinal();
                if (!(ordinal == 1 || (ordinal == 2 && C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_APP_BRAND_ENTRANCE_HAS_SEEN_NEARBY_SHOWCASE_BOOLEAN_SYNC, false)))) {
                    if (C81524s.f239136a == null) {
                        synchronized (C81524s.class) {
                            if (C81524s.f239136a == null) {
                                C81524s.f239136a = new C81524s();
                            }
                        }
                    }
                    C81524s.f239136a.getClass();
                    C86709a0.m107522a();
                    z = false;
                }
            }
            mo117057A2(z);
            return;
        }
        mo117251a().setMMTitle((int) C0966R.string.f7741q5);
        int i = this.f246900f + 1;
        this.f246900f = i;
        if (i == 1) {
            mo117057A2(true);
        }
    }
}
