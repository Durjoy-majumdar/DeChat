package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.HashSet;

@C113200q(initialMode = 2)
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderLikeGuideUIC */
public final class FinderLikeGuideUIC extends UIComponent {

    /* renamed from: d */
    public LinearLayout f18758d;

    /* renamed from: e */
    public boolean f18759e = true;

    /* renamed from: f */
    public final HashSet<Long> f18760f = new HashSet<>();

    /* renamed from: g */
    public final FinderLikeGuideUIC$listener$1 f18761g = new FinderLikeGuideUIC$listener$1(this, C40008f.f107254d);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLikeGuideUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = false;
        if (getIntent().getIntExtra("report_scene", 0) == 22) {
            z = true;
        }
        if (z) {
            Log.m105924i("Finder.LikeGuideUIC", "FinderScanPreviewLogic hide likeGuide");
        } else {
            this.f18761g.alive();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f18761g.dead();
    }
}
