package com.tencent.p014mm.plugin.appbrand.p026ui.recommend;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pluginsdk.p133ui.CommonVideoView;
import gy3.C87412m;
import kotlin.Metadata;
import nj3.C88989a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendVideoUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(19)
/* renamed from: com.tencent.mm.plugin.appbrand.ui.recommend.AppBrandRecommendVideoUI */
public final class AppBrandRecommendVideoUI extends MMActivity {

    /* renamed from: d */
    public CommonVideoView f267607d;

    public void finish() {
        CommonVideoView commonVideoView = this.f267607d;
        if (commonVideoView != null) {
            if (commonVideoView.isPlaying()) {
                CommonVideoView commonVideoView2 = this.f267607d;
                if (commonVideoView2 != null) {
                    commonVideoView2.pause();
                } else {
                    C87412m.m108603p("videoView");
                    throw null;
                }
            }
            super.finish();
            return;
        }
        C87412m.m108603p("videoView");
        throw null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6461fh;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hideTitleView();
        getWindow().setFlags(1024, 1024);
        View findViewById = findViewById(C0966R.C0970id.f5993ua);
        C87412m.m108593f(findViewById, "findViewById(R.id.app_brand_recommend_player)");
        this.f267607d = (CommonVideoView) findViewById;
        String stringExtra = getIntent().getStringExtra("1");
        C87412m.m108591d(stringExtra);
        CommonVideoView commonVideoView = this.f267607d;
        if (commonVideoView != null) {
            commonVideoView.mo76636h(true, stringExtra, 1000);
            CommonVideoView commonVideoView2 = this.f267607d;
            if (commonVideoView2 != null) {
                commonVideoView2.start();
            } else {
                C87412m.m108603p("videoView");
                throw null;
            }
        } else {
            C87412m.m108603p("videoView");
            throw null;
        }
    }

    public void onPause() {
        super.onPause();
    }
}
