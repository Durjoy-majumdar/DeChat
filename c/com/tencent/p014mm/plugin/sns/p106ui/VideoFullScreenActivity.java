package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.model.C94978z0;
import com.tencent.p014mm.plugin.sns.p106ui.listener.C96011a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95050a2;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95094h;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95222u1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C88989a;
import qs2.C101271i0;
import qs2.C101278l0;
import qs2.C101284p0;
import qs2.C101297w;

@C88989a(32)
/* renamed from: com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity */
public class VideoFullScreenActivity extends MMActivity implements C96011a {

    /* renamed from: d */
    public int f279112d;

    /* renamed from: e */
    public String f279113e;

    /* renamed from: f */
    public int f279114f;

    /* renamed from: g */
    public int f279115g;

    /* renamed from: h */
    public boolean f279116h;

    /* renamed from: i */
    public boolean f279117i;

    /* renamed from: j */
    public String f279118j;

    /* renamed from: n */
    public String f279119n;

    /* renamed from: o */
    public boolean f279120o;

    /* renamed from: p */
    public int f279121p;

    /* renamed from: q */
    public int f279122q;

    /* renamed from: r */
    public SightVideoFullScreenView f279123r;

    /* renamed from: s */
    public LongVideoFullScreenView f279124s;

    /* renamed from: t */
    public FrameLayout f279125t;

    /* renamed from: u */
    public int f279126u;

    /* renamed from: v */
    public int f279127v;

    /* renamed from: w */
    public C95094h f279128w;

    /* renamed from: x */
    public boolean f279129x;

    /* renamed from: y */
    public long f279130y = 0;

    /* renamed from: z */
    public long f279131z = 0;

    /* renamed from: H7 */
    public final void mo133146H7(C101278l0 l0Var) {
        SnsMethodCalculate.markStartTimeMs("initFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        if (!(l0Var == null || this.f279125t == null || this.f279128w != null)) {
            if (Util.isNullOrNil(l0Var.f296655z) || l0Var.f296654C == null) {
                SnsMethodCalculate.markEndTimeMs("initFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
                return;
            }
            this.f279128w = new C95094h(this, l0Var, this.f279125t, 0);
            if (getResources().getConfiguration().orientation == 1) {
                this.f279128w.mo131607J();
            } else if (getResources().getConfiguration().orientation == 2) {
                this.f279128w.mo131606I();
            }
            SnsMethodCalculate.markStartTimeMs("hideFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            if (this.f279128w != null) {
                Log.m105918d("VideoFullScreenActivity", "hideFloatBarView");
                this.f279128w.mo131605H(false, 0);
            }
            SnsMethodCalculate.markEndTimeMs("hideFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        }
        SnsMethodCalculate.markEndTimeMs("initFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    /* renamed from: I7 */
    public void mo133147I7(boolean z) {
        SnsMethodCalculate.markStartTimeMs("progressBarStatus", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        Log.m105924i("VideoFullScreenActivity", "progressBarStatus visiblity = " + z);
        if (z) {
            SnsMethodCalculate.markStartTimeMs("hideFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            if (this.f279128w != null) {
                Log.m105918d("VideoFullScreenActivity", "hideFloatBarView");
                this.f279128w.mo131605H(true, 0);
            }
            SnsMethodCalculate.markEndTimeMs("hideFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        } else {
            SnsMethodCalculate.markStartTimeMs("showFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            if (this.f279128w != null) {
                Log.m105918d("VideoFullScreenActivity", "showFloatBarView");
                this.f279128w.mo131608K(true, 0);
            }
            SnsMethodCalculate.markEndTimeMs("showFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        }
        SnsMethodCalculate.markEndTimeMs("progressBarStatus", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    /* renamed from: T0 */
    public C101271i0 mo133148T0() {
        SnsMethodCalculate.markStartTimeMs("getAdLandingPageData", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        C101271i0 i0Var = C94978z0.f275381a;
        if (i0Var != null) {
            SnsMethodCalculate.markEndTimeMs("getAdLandingPageData", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            return i0Var;
        }
        C101271i0 i0Var2 = new C101271i0();
        SnsMethodCalculate.markEndTimeMs("getAdLandingPageData", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        return i0Var2;
    }

    public void finish() {
        SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        Intent intent = null;
        try {
            int i = this.f279112d;
            if (i == 0) {
                intent = this.f279123r.mo132457m();
            } else if (i == 1) {
                intent = this.f279124s.mo132198j();
            }
            if (intent != null) {
                long currentTimeMillis = this.f279131z + (System.currentTimeMillis() - this.f279130y);
                this.f279131z = currentTimeMillis;
                intent.putExtra("KComponentFullScreenStayTime", currentTimeMillis);
                C95094h hVar = this.f279128w;
                if (hVar != null) {
                    hVar.mo67235C();
                    intent.putExtra("KComponentFullVideoFloatBarReportInfo", this.f279128w.mo131604G());
                }
            }
            setResult(1000, intent);
        } catch (Throwable th) {
            Log.m105920e("VideoFullScreenActivity", th.toString());
        }
        super.finish();
        SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        return C0966R.C0971layout.f6332by;
    }

    public void onCancel() {
        SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        super.onCancel();
        setRequestedOrientation(4);
        SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        super.onConfigurationChanged(configuration);
        try {
            int i = configuration.orientation;
            if (i == 2) {
                Log.m105924i("VideoFullScreenActivity", "ORIENTATION_LANDSCAPE");
                C95094h hVar = this.f279128w;
                if (hVar != null) {
                    hVar.mo131606I();
                }
            } else if (i == 1) {
                Log.m105924i("VideoFullScreenActivity", "ORIENTATION_PORTRAIT");
                C95094h hVar2 = this.f279128w;
                if (hVar2 != null) {
                    hVar2.mo131607J();
                }
            }
        } catch (Throwable th) {
            Log.m105920e("VideoFullScreenActivity", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    public void onCreate(Bundle bundle) {
        String str;
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        super.onCreate(bundle);
        this.f279130y = System.currentTimeMillis();
        C95198o2.m121134f(this);
        this.mController.mo177043E();
        SnsMethodCalculate.markStartTimeMs("initParams", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        try {
            this.f279112d = getIntent().getIntExtra("KComponentVideoType", 0);
            this.f279113e = getIntent().getStringExtra("KComponentCid");
            this.f279114f = getIntent().getIntExtra("KComponentCurrentTime", 0);
            this.f279115g = getIntent().getIntExtra("KComponentTotalTime", 0);
            this.f279116h = getIntent().getBooleanExtra("KComponentVoiceType", false);
            this.f279117i = getIntent().getBooleanExtra("KComponentProgressType", false);
            this.f279118j = getIntent().getStringExtra("KComponentVideoSightThumbUrl");
            this.f279119n = getIntent().getStringExtra("KComponentStreamVideoUrlPath");
            this.f279120o = getIntent().getBooleanExtra("KComponentIsWaiting", false);
            this.f279121p = getIntent().getIntExtra("KComponentSeekTimeDueWaiting", 0);
            this.f279122q = getIntent().getIntExtra("KComponentKComponentCacheTime", 0);
            this.f279129x = getIntent().getBooleanExtra("KComponentForceLandMode", false);
            Log.m105924i("VideoFullScreenActivity", "videoType = " + this.f279112d + ", cid = " + this.f279113e + ", currPosSec = " + this.f279114f + " , videoDurationSec = " + this.f279115g + ", bNoVoice = " + this.f279116h + ", isPlaying = " + this.f279117i + ", streamVideoUrlPath = " + this.f279119n + ", isWaiting = " + this.f279120o + ", seekTime = " + this.f279121p + ", forceLandscapeMode=" + this.f279129x);
        } catch (Throwable th) {
            Log.m105920e("VideoFullScreenActivity", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initParams", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        SnsMethodCalculate.markStartTimeMs("handleOriention", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        if (this.f279112d == 1 && this.f279129x) {
            setRequestedOrientation(0);
            MMHandlerThread.postToMainThreadDelayed(new C85474v8(this), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        }
        SnsMethodCalculate.markEndTimeMs("handleOriention", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        SnsMethodCalculate.markStartTimeMs("initScreenParams", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        try {
            int[] b = C95198o2.m121130b(this);
            this.f279126u = b[0];
            this.f279127v = b[1];
            if (C85875k4.m106205t(this, false) && getResources().getConfiguration().orientation == 1) {
                this.f279127v -= C85875k4.m106198o(this);
            } else if (C85875k4.m106205t(this, false) && getResources().getConfiguration().orientation == 2) {
                this.f279126u -= C85875k4.m106198o(this);
            }
            Log.m105924i("VideoFullScreenActivity", "screenHeight = " + this.f279127v + ", screenWidth = " + this.f279126u);
        } catch (Throwable th4) {
            Log.m105920e("VideoFullScreenActivity", th4.toString());
        }
        SnsMethodCalculate.markEndTimeMs("initScreenParams", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        int i = this.f279112d;
        if (i == 0) {
            SnsMethodCalculate.markStartTimeMs("initSightVideoView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            try {
                this.f279125t = (FrameLayout) findViewById(C0966R.C0970id.iwc);
                SightVideoFullScreenView sightVideoFullScreenView = new SightVideoFullScreenView(this);
                this.f279123r = sightVideoFullScreenView;
                this.f279125t.addView(sightVideoFullScreenView);
                this.f279123r.mo132472p(this.f279126u, this.f279127v);
                this.f279123r.mo132477t(this.f279112d, this.f279113e, this.f279114f, this.f279115g, this.f279116h, this.f279117i, this.f279118j, this.f279119n);
                this.f279123r.mo132475s();
                this.f279123r.setProgressBarStatusListener(this);
                C101297w wVar = C95222u1.C95239m.f276391a;
                if (wVar != null) {
                    mo133146H7(wVar.f296768O);
                }
            } catch (Throwable th5) {
                Log.m105920e("VideoFullScreenActivity", th5.toString());
            }
            SnsMethodCalculate.markEndTimeMs("initSightVideoView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        } else if (i == 1) {
            SnsMethodCalculate.markStartTimeMs("initLongVideoView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            try {
                this.f279125t = (FrameLayout) findViewById(C0966R.C0970id.iwc);
                LongVideoFullScreenView longVideoFullScreenView = new LongVideoFullScreenView(this);
                this.f279124s = longVideoFullScreenView;
                this.f279125t.addView(longVideoFullScreenView);
                this.f279124s.mo132203o(this.f279126u, this.f279127v);
                str = "onCreate";
                try {
                    this.f279124s.mo132217q(this.f279112d, this.f279113e, this.f279114f, this.f279115g, this.f279116h, this.f279117i, this.f279118j, this.f279119n, this.f279120o, this.f279121p, this.f279122q);
                    this.f279124s.mo132216p();
                    this.f279124s.setProgressBarStatusListener(this);
                    C101284p0 p0Var = C95050a2.C95057i.f275903a;
                    if (p0Var != null) {
                        mo133146H7(p0Var.f296677E);
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
                str = "onCreate";
                Log.m105920e("VideoFullScreenActivity", th.toString());
                SnsMethodCalculate.markEndTimeMs("initLongVideoView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
                SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            }
            SnsMethodCalculate.markEndTimeMs("initLongVideoView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        }
        str = "onCreate";
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        try {
            C94978z0.f275381a = null;
            int i = this.f279112d;
            if (i == 0) {
                this.f279123r.mo132478v();
                C95222u1.C95239m.f276391a = null;
            } else if (i == 1) {
                this.f279124s.mo132218r();
                C95050a2.C95057i.f275903a = null;
            }
        } catch (Throwable th) {
            Log.m105920e("VideoFullScreenActivity", th.toString());
        }
        super.onDestroy();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        super.onPause();
        try {
            this.f279131z += System.currentTimeMillis() - this.f279130y;
            int i = this.f279112d;
            if (i == 0) {
                SightVideoFullScreenView sightVideoFullScreenView = this.f279123r;
                sightVideoFullScreenView.getClass();
                SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                sightVideoFullScreenView.f277454z = false;
                MMHandlerThread.removeRunnable(sightVideoFullScreenView.f277433W);
                MMHandlerThread.removeRunnable(sightVideoFullScreenView.f277444p0);
                SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            }
            if (i == 1) {
                LongVideoFullScreenView longVideoFullScreenView = this.f279124s;
                longVideoFullScreenView.getClass();
                SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                try {
                    longVideoFullScreenView.f276918J = false;
                    MMHandlerThread.removeRunnable(longVideoFullScreenView.f276953y0);
                    MMHandlerThread.removeRunnable(longVideoFullScreenView.f276925Q0);
                } catch (Throwable th) {
                    Log.m105920e("LongVideoFullScreenView", th.toString());
                }
                SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            }
            SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        } catch (Throwable th4) {
            Log.m105920e("VideoFullScreenActivity", th4.toString());
        }
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        super.onResume();
        try {
            this.f279130y = System.currentTimeMillis();
            C95198o2.m121134f(this);
            int i = this.f279112d;
            if (i == 0) {
                SightVideoFullScreenView sightVideoFullScreenView = this.f279123r;
                sightVideoFullScreenView.getClass();
                SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                sightVideoFullScreenView.f277454z = true;
                SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            } else if (i == 1) {
                LongVideoFullScreenView longVideoFullScreenView = this.f279124s;
                longVideoFullScreenView.getClass();
                SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                longVideoFullScreenView.f276918J = true;
                SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            }
        } catch (Throwable th) {
            Log.m105920e("VideoFullScreenActivity", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    public void onStart() {
        SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        super.onStart();
        try {
            C95198o2.m121134f(this);
            int i = this.f279112d;
            if (i == 0) {
                this.f279123r.mo132479w();
            } else if (i == 1) {
                this.f279124s.mo132219s();
            }
        } catch (Throwable th) {
            Log.m105920e("VideoFullScreenActivity", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    public void onStop() {
        SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        super.onStop();
        try {
            int i = this.f279112d;
            if (i == 0) {
                SightVideoFullScreenView sightVideoFullScreenView = this.f279123r;
                sightVideoFullScreenView.getClass();
                SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                sightVideoFullScreenView.f277412A = false;
                if (sightVideoFullScreenView.f277438h.mo132290h()) {
                    sightVideoFullScreenView.mo132482z();
                    sightVideoFullScreenView.f277413B = true;
                }
                SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            }
            if (i == 1) {
                LongVideoFullScreenView longVideoFullScreenView = this.f279124s;
                longVideoFullScreenView.getClass();
                SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                try {
                    longVideoFullScreenView.f276919K = false;
                    if (longVideoFullScreenView.f276938j.isPlaying()) {
                        longVideoFullScreenView.mo132222v();
                        longVideoFullScreenView.f276920L = true;
                    }
                } catch (Throwable th) {
                    Log.m105920e("LongVideoFullScreenView", th.toString());
                }
                SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            }
            SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        } catch (Throwable th4) {
            Log.m105920e("VideoFullScreenActivity", th4.toString());
        }
    }

    public void setMMOrientation() {
        SnsMethodCalculate.markStartTimeMs("setMMOrientation", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        SnsMethodCalculate.markEndTimeMs("setMMOrientation", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }
}
