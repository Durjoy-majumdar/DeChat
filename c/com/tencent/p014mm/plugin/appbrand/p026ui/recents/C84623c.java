package com.tencent.p014mm.plugin.appbrand.p026ui.recents;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandLauncherFolderUI;
import com.tencent.p014mm.plugin.appbrand.report.C84175n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.recents.c */
public final class C84623c extends C84628f {
    public C84623c(FragmentActivity fragmentActivity, ViewGroup viewGroup) {
        super(fragmentActivity, viewGroup);
    }

    /* renamed from: j */
    public void mo117282j(WeImageView weImageView) {
        C87412m.m108594g(weImageView, "imageView");
        weImageView.setVisibility(0);
        weImageView.setImageResource(C0966R.raw.icons_filled_myminiprogram);
        weImageView.setIconColor(this.f246909e.getResources().getColor(C0966R.color.f2976b7));
    }

    /* renamed from: m */
    public String mo117283m() {
        String string = this.f246909e.getString(C0966R.string.f7839tb);
        C87412m.m108593f(string, "activity.getString(R.str…list_collection_entrance)");
        return string;
    }

    public void onClick(View view) {
        Intent intent = this.f246909e.getIntent();
        int i = intent != null && intent.getIntExtra("extra_get_usage_reason", 3) == 9 ? 2 : 0;
        AppBrandLauncherFolderUI.C29657a aVar = AppBrandLauncherFolderUI.f246377f;
        FragmentActivity fragmentActivity = this.f246909e;
        C87412m.m108593f(fragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Intent intent2 = new Intent();
        intent2.putExtra("extra_get_usage_reason", 8);
        intent2.putExtra("extra_get_usage_prescene", i);
        intent2.putExtra("extra_enter_scene", 1);
        C13598b0 b0Var = C13598b0.f38549a;
        aVar.mo56887a(fragmentActivity, intent2);
        C84175n nVar = C84175n.f245826d;
        FragmentActivity fragmentActivity2 = this.f246909e;
        C87412m.m108593f(fragmentActivity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C115669n.INSTANCE.mo160131h(19468, 5, "", "", "", "", "", Long.valueOf(nVar.mo116851a(fragmentActivity2).f158155d));
    }
}
