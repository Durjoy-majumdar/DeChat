package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.video.lite;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoView;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.video.lite.VideoLiteControBar;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C88989a;
import p625nu.C100196e;
import qn0.C22116f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/lite/VideoLiteUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.video.lite.VideoLiteUI */
public final class VideoLiteUI extends MMActivity {

    /* renamed from: d */
    public String f51386d;

    /* renamed from: e */
    public AppBrandVideoView f51387e;

    /* renamed from: f */
    public VideoLiteControBar f51388f;

    /* renamed from: g */
    public ImageView f51389g;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.video.lite.VideoLiteUI$a */
    public static final class C18499a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ VideoLiteUI f51390d;

        public C18499a(VideoLiteUI videoLiteUI) {
            this.f51390d = videoLiteUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/video/lite/VideoLiteUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f51390d.onBackPressed();
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/video/lite/VideoLiteUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.video.lite.VideoLiteUI$b */
    public static final class C18500b implements VideoLiteControBar.C18498c {

        /* renamed from: a */
        public final /* synthetic */ VideoLiteUI f51391a;

        public C18500b(VideoLiteUI videoLiteUI) {
            this.f51391a = videoLiteUI;
        }

        /* renamed from: d */
        public final void mo23131d(boolean z) {
            ImageView imageView = this.f51391a.f51389g;
            if (imageView != null) {
                imageView.setVisibility(z ? 8 : 0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.video.lite.VideoLiteUI$c */
    public static final class C18501c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ VideoLiteUI f51392d;

        public C18501c(VideoLiteUI videoLiteUI) {
            this.f51392d = videoLiteUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/timeline/video/lite/VideoLiteUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AppBrandVideoView appBrandVideoView = this.f51392d.f51387e;
            if (appBrandVideoView != null) {
                appBrandVideoView.mo22277w();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/timeline/video/lite/VideoLiteUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cbk;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        VideoLiteControBar videoLiteControBar = this.f51388f;
        if (videoLiteControBar != null) {
            int i = configuration.orientation;
            if (i == 1) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) videoLiteControBar.f51370F.getLayoutParams();
                layoutParams.addRule(2, C0966R.C0970id.l4y);
                layoutParams.removeRule(8);
                layoutParams.removeRule(1);
                layoutParams.setMargins(C76577a.m92155f(videoLiteControBar.getContext(), C0966R.dimen.f3743cv), 0, C76577a.m92155f(videoLiteControBar.getContext(), C0966R.dimen.f3743cv), 0);
                videoLiteControBar.f51370F.setLayoutParams(layoutParams);
                ((RelativeLayout.LayoutParams) videoLiteControBar.f51368D.getLayoutParams()).setMargins(C76577a.m92155f(videoLiteControBar.getContext(), C0966R.dimen.f3743cv), C76577a.m92155f(videoLiteControBar.getContext(), C0966R.dimen.f3743cv), 0, 0);
                ((RelativeLayout.LayoutParams) videoLiteControBar.f51369E.getLayoutParams()).setMargins(0, 0, 0, C76577a.m92155f(videoLiteControBar.getContext(), C0966R.dimen.f3736cp));
            } else if (i == 2) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) videoLiteControBar.f51370F.getLayoutParams();
                layoutParams2.removeRule(2);
                layoutParams2.addRule(8, C0966R.C0970id.l4y);
                layoutParams2.addRule(1, C0966R.C0970id.l4y);
                layoutParams2.setMargins(C76577a.m92155f(videoLiteControBar.getContext(), C0966R.dimen.f3758d_), 0, C76577a.m92155f(videoLiteControBar.getContext(), C0966R.dimen.f3743cv), 0);
                videoLiteControBar.f51370F.setLayoutParams(layoutParams2);
                int f = C76577a.m92155f(videoLiteControBar.getContext(), C0966R.dimen.f3743cv);
                ((RelativeLayout.LayoutParams) videoLiteControBar.f51368D.getLayoutParams()).setMargins(f, C76577a.m92155f(videoLiteControBar.getContext(), C0966R.dimen.f3736cp), 0, C76577a.m92151b(videoLiteControBar.getContext(), -5));
                ((RelativeLayout.LayoutParams) videoLiteControBar.f51369E.getLayoutParams()).setMargins(f, 0, 0, C76577a.m92155f(videoLiteControBar.getContext(), C0966R.dimen.f3753d4));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        ((C100196e) C86312j.m106911c(C100196e.class)).il0(true);
        getWindow().setNavigationBarColor(-16777216);
        getWindow().getDecorView().setSystemUiVisibility(1284);
        this.f51386d = getIntent().getStringExtra("rawUrl");
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.ayo);
        this.f51389g = imageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        AppBrandVideoWrapper appBrandVideoWrapper = new AppBrandVideoWrapper(this, (AttributeSet) null);
        appBrandVideoWrapper.setMyVideoViewFactory(C22116f.f62532a);
        this.f51387e = new AppBrandVideoView((Context) this, appBrandVideoWrapper);
        VideoLiteControBar videoLiteControBar = new VideoLiteControBar(this);
        this.f51388f = videoLiteControBar;
        videoLiteControBar.setBtnCloseListener(new C18499a(this));
        VideoLiteControBar videoLiteControBar2 = this.f51388f;
        C87412m.m108591d(videoLiteControBar2);
        videoLiteControBar2.setOnPlayStatusChangeListener(new C18500b(this));
        AppBrandVideoView appBrandVideoView = this.f51387e;
        if (appBrandVideoView != null) {
            appBrandVideoView.mo22230k(this.f51388f);
        }
        appBrandVideoWrapper.setVideoFooterView(this.f51388f);
        FrameLayout frameLayout = (FrameLayout) findViewById(C0966R.C0970id.br9);
        if (frameLayout != null) {
            frameLayout.addView(this.f51387e, 0, new FrameLayout.LayoutParams(-1, -1));
        }
        ImageView imageView2 = this.f51389g;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new C18501c(this));
        }
        AppBrandVideoView appBrandVideoView2 = this.f51387e;
        if (appBrandVideoView2 != null) {
            appBrandVideoView2.setAutoPlay(true);
        }
        AppBrandVideoView appBrandVideoView3 = this.f51387e;
        if (appBrandVideoView3 != null) {
            appBrandVideoView3.setLoop(false);
        }
        AppBrandVideoView appBrandVideoView4 = this.f51387e;
        if (appBrandVideoView4 != null) {
            appBrandVideoView4.setMute(false);
        }
        AppBrandVideoView appBrandVideoView5 = this.f51387e;
        if (appBrandVideoView5 != null) {
            appBrandVideoView5.setCookieData((String) null);
        }
        AppBrandVideoView appBrandVideoView6 = this.f51387e;
        if (appBrandVideoView6 != null) {
            appBrandVideoView6.setObjectFit("contain");
        }
        AppBrandVideoView appBrandVideoView7 = this.f51387e;
        if (appBrandVideoView7 != null) {
            appBrandVideoView7.setShowDanmakuBtn(false);
        }
        AppBrandVideoView appBrandVideoView8 = this.f51387e;
        if (appBrandVideoView8 != null) {
            appBrandVideoView8.setShowMuteBtn(false);
        }
        AppBrandVideoView appBrandVideoView9 = this.f51387e;
        if (appBrandVideoView9 != null) {
            appBrandVideoView9.setShowPlayBtn(true);
        }
        AppBrandVideoView appBrandVideoView10 = this.f51387e;
        if (appBrandVideoView10 != null) {
            appBrandVideoView10.setShowProgress(true);
        }
        AppBrandVideoView appBrandVideoView11 = this.f51387e;
        if (appBrandVideoView11 != null) {
            appBrandVideoView11.setShowFullScreenBtn(false);
        }
        AppBrandVideoView appBrandVideoView12 = this.f51387e;
        if (appBrandVideoView12 != null) {
            appBrandVideoView12.setIsShowBasicControls(true);
        }
        AppBrandVideoView appBrandVideoView13 = this.f51387e;
        if (appBrandVideoView13 != null) {
            appBrandVideoView13.setIsEnableBottomProgressBar(false);
        }
        AppBrandVideoView appBrandVideoView14 = this.f51387e;
        if (appBrandVideoView14 != null) {
            appBrandVideoView14.setShowCenterPlayBtn(false);
        }
        AppBrandVideoView appBrandVideoView15 = this.f51387e;
        if (appBrandVideoView15 != null) {
            appBrandVideoView15.setShowControlProgress(true);
        }
        AppBrandVideoView appBrandVideoView16 = this.f51387e;
        if (appBrandVideoView16 != null) {
            appBrandVideoView16.setPageGesture(true);
        }
        AppBrandVideoView appBrandVideoView17 = this.f51387e;
        if (appBrandVideoView17 != null) {
            appBrandVideoView17.mo22220g(true);
        }
        AppBrandVideoView appBrandVideoView18 = this.f51387e;
        if (appBrandVideoView18 != null) {
            appBrandVideoView18.mo22276v(this.f51386d, false, 0);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        AppBrandVideoView appBrandVideoView = this.f51387e;
        if (appBrandVideoView != null) {
            Log.m105924i("MicroMsg.Video.AppBrandVideoView", "onUIDestroy");
            appBrandVideoView.mo22219f();
        }
    }

    public void onPause() {
        super.onPause();
        AppBrandVideoView appBrandVideoView = this.f51387e;
        if (appBrandVideoView != null) {
            appBrandVideoView.f49521f.mo22296b();
        }
    }

    public void onResume() {
        super.onResume();
        AppBrandVideoView appBrandVideoView = this.f51387e;
        if (appBrandVideoView != null) {
            appBrandVideoView.mo22236p();
        }
    }

    public boolean onSwipeBackFinish() {
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        getWindow().getDecorView().setSystemUiVisibility(1284);
    }
}
