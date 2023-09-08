package ot2;

import a14.C53973z1;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.TouchMediaPreviewLayout;
import com.tencent.p014mm.plugin.sns.model.C94847c1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.videocomposition.play.VideoCompositionPlayView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32224a;
import go3.C98164a0;
import go3.C98167z;
import gy3.C87412m;
import gy3.C87413o;
import hf3.C98449c;
import java.util.concurrent.CancellationException;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sn0.C90259e;
import wp3.C111824b;

/* renamed from: ot2.j */
public final class C100448j extends UIComponent {

    /* renamed from: d */
    public final C13601g f294264d = C36568h.m40985a(new C100449a(this));

    /* renamed from: e */
    public long f294265e = -1;

    /* renamed from: f */
    public C53973z1 f294266f;

    /* renamed from: g */
    public boolean f294267g;

    /* renamed from: h */
    public String f294268h = "";

    /* renamed from: i */
    public int f294269i = -1;

    /* renamed from: j */
    public int f294270j = -1;

    /* renamed from: n */
    public boolean f294271n;

    /* renamed from: o */
    public boolean f294272o;

    /* renamed from: p */
    public final C100451c f294273p;

    /* renamed from: ot2.j$a */
    public static final class C100449a extends C87413o implements C32224a<VideoCompositionPlayView> {

        /* renamed from: d */
        public final /* synthetic */ C100448j f294274d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100449a(C100448j jVar) {
            super(0);
            this.f294274d = jVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$backgroundVideoPreview$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$backgroundVideoPreview$2");
            VideoCompositionPlayView videoCompositionPlayView = (VideoCompositionPlayView) this.f294274d.findViewById(C0966R.C0970id.n4w);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$backgroundVideoPreview$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$backgroundVideoPreview$2");
            return videoCompositionPlayView;
        }
    }

    /* renamed from: ot2.j$b */
    public static final class C100450b implements TouchMediaPreviewLayout.C97276b {
        /* renamed from: a */
        public void mo132739a() {
            SnsMethodCalculate.markStartTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$onCreate$1");
            SnsMethodCalculate.markEndTimeMs(C90259e.C90260a.NAME, "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$onCreate$1");
        }
    }

    /* renamed from: ot2.j$c */
    public static final class C100451c implements C111824b {

        /* renamed from: d */
        public final /* synthetic */ C100448j f294275d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f294276e;

        public C100451c(C100448j jVar, AppCompatActivity appCompatActivity) {
            this.f294275d = jVar;
            this.f294276e = appCompatActivity;
        }

        /* renamed from: b */
        public void mo79528b(long j) {
            SnsMethodCalculate.markStartTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
            SnsMethodCalculate.markEndTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
        }

        /* renamed from: h */
        public void mo79529h() {
            SnsMethodCalculate.markStartTimeMs("onPlayError", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
            Log.m105924i("MicroMsg.SnsFakeVideoPlayUIC", "video on error");
            SnsMethodCalculate.markEndTimeMs("onPlayError", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
        }

        /* renamed from: i */
        public void mo79530i() {
            SnsMethodCalculate.markStartTimeMs("onPlayCompleted", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
            Log.m105924i("MicroMsg.SnsFakeVideoPlayUIC", "video on completed");
            SnsMethodCalculate.markEndTimeMs("onPlayCompleted", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
        }

        /* renamed from: n */
        public void mo84658n() {
            SnsMethodCalculate.markStartTimeMs("onFrame", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
            SnsMethodCalculate.markEndTimeMs("onFrame", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
        }

        /* renamed from: o */
        public void mo79531o() {
            SnsMethodCalculate.markStartTimeMs("onPlayStarted", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
            Log.m105924i("MicroMsg.SnsFakeVideoPlayUIC", "video on start");
            SnsMethodCalculate.markEndTimeMs("onPlayStarted", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
        }

        /* renamed from: r */
        public void mo79532r() {
            Class cls = C100437h.class;
            SnsMethodCalculate.markStartTimeMs("onPlayFirstFrame", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
            Log.m105924i("MicroMsg.SnsFakeVideoPlayUIC", "videoView on FirstFrame");
            C100448j jVar = this.f294275d;
            SnsMethodCalculate.markStartTimeMs("access$setFirstFrame$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            jVar.f294272o = true;
            SnsMethodCalculate.markEndTimeMs("access$setFirstFrame$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            C39818r rVar = C39818r.f106831a;
            C100437h hVar = (C100437h) rVar.mo62444c(this.f294276e).mo75002a(cls);
            hVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getIsEnterAniEnd", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
            boolean z = hVar.f294243s;
            SnsMethodCalculate.markEndTimeMs("getIsEnterAniEnd", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
            if (z) {
                Log.m105924i("MicroMsg.SnsFakeVideoPlayUIC", "first frame >> ani is end");
                C100437h hVar2 = (C100437h) rVar.mo62444c(this.f294276e).mo75002a(cls);
                hVar2.getClass();
                SnsMethodCalculate.markStartTimeMs("setThumbViewVisible", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
                Log.m105924i("MicroMsg.SnsFakeVideoAniUIC", "setThumbViewVisible >> " + 8 + ", " + hVar2.f294243s);
                if (hVar2.f294243s) {
                    hVar2.mo139926j3().setVisibility(8);
                }
                SnsMethodCalculate.markEndTimeMs("setThumbViewVisible", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
            } else {
                Log.m105924i("MicroMsg.SnsFakeVideoPlayUIC", "first frame >> ani is no end");
                C100448j.m131469c3(this.f294275d).setAlpha(0.0f);
                C100448j.m131469c3(this.f294275d).pause();
            }
            SnsMethodCalculate.markEndTimeMs("onPlayFirstFrame", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
        }

        /* renamed from: u */
        public void mo79533u() {
            SnsMethodCalculate.markStartTimeMs("onPlayStop", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
            Log.m105924i("MicroMsg.SnsFakeVideoPlayUIC", "video on stop");
            SnsMethodCalculate.markEndTimeMs("onPlayStop", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100448j(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f294273p = new C100451c(this, appCompatActivity);
    }

    /* renamed from: c3 */
    public static final /* synthetic */ VideoCompositionPlayView m131469c3(C100448j jVar) {
        SnsMethodCalculate.markStartTimeMs("access$getBackgroundVideoPreview", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        VideoCompositionPlayView d3 = jVar.mo139938d3();
        SnsMethodCalculate.markEndTimeMs("access$getBackgroundVideoPreview", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        return d3;
    }

    /* renamed from: d3 */
    public final VideoCompositionPlayView mo139938d3() {
        SnsMethodCalculate.markStartTimeMs("getBackgroundVideoPreview", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        Object value = ((C36570n) this.f294264d).getValue();
        C87412m.m108593f(value, "<get-backgroundVideoPreview>(...)");
        VideoCompositionPlayView videoCompositionPlayView = (VideoCompositionPlayView) value;
        SnsMethodCalculate.markEndTimeMs("getBackgroundVideoPreview", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        return videoCompositionPlayView;
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        super.onCreate(bundle);
        this.f294267g = getIntent().getBooleanExtra("intent_video_is_preview", false);
        String stringExtra = getIntent().getStringExtra("intent_video_background_word_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f294268h = stringExtra;
        this.f294269i = getIntent().getIntExtra("intent_video_sns_local_id", -1);
        this.f294271n = getIntent().getBooleanExtra("intent_video_is_mute_play", false);
        this.f294270j = getIntent().getIntExtra("intent_video_sns_create_time", -1);
        Log.m105924i("MicroMsg.SnsFakeVideoPlayUIC", "initView >> " + this.f294268h + ", " + this.f294267g + ", " + this.f294269i);
        if (C94847c1.m120216d()) {
            AppCompatActivity activity = getActivity();
            View rootView = getRootView();
            VideoCompositionPlayView d3 = mo139938d3();
            C100450b bVar = new C100450b();
            C87412m.m108594g(activity, "context");
            C87412m.m108594g(rootView, "contentView");
            TouchMediaPreviewLayout touchMediaPreviewLayout = new TouchMediaPreviewLayout(activity);
            touchMediaPreviewLayout.mo153909c(rootView);
            touchMediaPreviewLayout.setDoubleTapListener(new C98167z(touchMediaPreviewLayout, d3));
            touchMediaPreviewLayout.setScaleListener(new C98164a0(d3, touchMediaPreviewLayout));
            touchMediaPreviewLayout.setLongPressListener(bVar);
        }
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        super.onDestroy();
        if (this.f294265e != -1) {
            ((C98449c) C86312j.m106911c(C98449c.class)).mo136686yH(this.f294265e);
            mo139938d3().mo154756f();
        }
        C53973z1 z1Var = this.f294266f;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        super.onPause();
        mo139938d3().pause();
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        super.onResume();
        mo139938d3().mo154761h();
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
    }
}
