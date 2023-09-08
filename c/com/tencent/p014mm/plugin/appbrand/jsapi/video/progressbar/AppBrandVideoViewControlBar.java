package com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoView;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.C17978c;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.danmu.DanmuView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import hn0.C20959a;
import hn0.C20960b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar */
public class AppBrandVideoViewControlBar extends VideoPlayerSeekBar implements C17978c.C17979a {

    /* renamed from: R0 */
    public static final /* synthetic */ int f49613R0 = 0;

    /* renamed from: C */
    public ImageView f49614C;

    /* renamed from: D */
    public ImageView f49615D;

    /* renamed from: E */
    public LinearLayout f49616E;

    /* renamed from: F */
    public ImageView f49617F;

    /* renamed from: G */
    public FrameLayout f49618G;

    /* renamed from: H */
    public ImageView f49619H;

    /* renamed from: I */
    public ImageView f49620I;

    /* renamed from: J */
    public ImageView f49621J;

    /* renamed from: K */
    public TextView f49622K;

    /* renamed from: L */
    public LinearLayout f49623L;

    /* renamed from: M */
    public LinearLayout f49624M;

    /* renamed from: N */
    public C17978c.C17987i f49625N;

    /* renamed from: P */
    public MTimerHandler f49626P;

    /* renamed from: Q */
    public MTimerHandler f49627Q;

    /* renamed from: Q0 */
    public ConcurrentLinkedQueue<C17978c.C17984f> f49628Q0 = new ConcurrentLinkedQueue<>();

    /* renamed from: R */
    public boolean f49629R;

    /* renamed from: S */
    public boolean f49630S;

    /* renamed from: T */
    public boolean f49631T;

    /* renamed from: U */
    public boolean f49632U;

    /* renamed from: V */
    public boolean f49633V;

    /* renamed from: W */
    public boolean f49634W;

    /* renamed from: p0 */
    public boolean f49635p0;

    /* renamed from: x0 */
    public boolean f49636x0 = true;

    /* renamed from: y0 */
    public C17978c.C17983e f49637y0;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar$a */
    public class C17993a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C17978c.C17985g f49638d;

        public C17993a(C17978c.C17985g gVar) {
            this.f49638d = gVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/video/progressbar/AppBrandVideoViewControlBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            AppBrandVideoViewControlBar appBrandVideoViewControlBar = AppBrandVideoViewControlBar.this;
            boolean z = !appBrandVideoViewControlBar.f49630S;
            appBrandVideoViewControlBar.f49630S = z;
            if (z) {
                appBrandVideoViewControlBar.f49615D.setImageResource(C0966R.raw.app_brand_video_danmu_on);
            } else {
                appBrandVideoViewControlBar.f49615D.setImageResource(C0966R.raw.app_brand_video_danmu_off);
            }
            C17978c.C17985g gVar = this.f49638d;
            if (gVar != null) {
                boolean z2 = AppBrandVideoViewControlBar.this.f49630S;
                AppBrandVideoView.C17968h hVar = (AppBrandVideoView.C17968h) gVar;
                if (!z2) {
                    DanmuView danmuView = AppBrandVideoView.this.f49523h;
                    danmuView.f311208t = 4;
                    danmuView.invalidate();
                } else if (AppBrandVideoView.this.f49521f.isPlaying()) {
                    DanmuView danmuView2 = AppBrandVideoView.this.f49523h;
                    danmuView2.f311208t = 1;
                    danmuView2.invalidate();
                } else {
                    DanmuView danmuView3 = AppBrandVideoView.this.f49523h;
                    danmuView3.f311208t = 2;
                    danmuView3.invalidate();
                }
                AppBrandVideoView appBrandVideoView = AppBrandVideoView.this;
                C20960b bVar = appBrandVideoView.f49491C;
                if (bVar != null) {
                    int i = appBrandVideoView.f49539y;
                    try {
                        Log.m105925i("MicroMsg.Video.JsApiVideoCallback", "onVideoClickDanmuBtn showDanmu=%b", Boolean.valueOf(z2));
                        JSONObject c = bVar.mo32717c();
                        c.put("showDanmu", z2);
                        c.put("videoPlayerId", i);
                        bVar.mo32716b(new C20960b.C20962b((C20959a) null), c);
                    } catch (JSONException e) {
                        Log.m105921e("MicroMsg.Video.JsApiVideoCallback", "onVideoClickDanmuBtn e=%s", e);
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/video/progressbar/AppBrandVideoViewControlBar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar$b */
    public class C17994b implements MTimerHandler.CallBack {
        public C17994b() {
        }

        public boolean onTimerExpired() {
            AppBrandVideoViewControlBar.this.setVisibility(8);
            AppBrandVideoViewControlBar.this.f49626P.stopTimer();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AppBrandVideoViewControlBar$c */
    public class C17995c implements MTimerHandler.CallBack {
        public C17995c() {
        }

        public boolean onTimerExpired() {
            AppBrandVideoViewControlBar appBrandVideoViewControlBar = AppBrandVideoViewControlBar.this;
            int i = AppBrandVideoViewControlBar.f49613R0;
            return appBrandVideoViewControlBar.mo22403m();
        }
    }

    public AppBrandVideoViewControlBar(Context context) {
        super(context);
    }

    /* renamed from: A */
    public void mo22335A() {
        if (this.f49634W && this.f49635p0) {
            this.f49620I.setVisibility(0);
        }
    }

    /* renamed from: B */
    public void mo22336B() {
        MTimerHandler mTimerHandler = this.f49627Q;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
    }

    /* renamed from: C */
    public void mo22337C() {
        if (mo22343q()) {
            setVisibility(8);
        } else {
            mo22366t();
        }
    }

    /* renamed from: D */
    public void mo22338D(C17978c.C17984f fVar) {
        this.f49628Q0.add(fVar);
    }

    /* renamed from: E */
    public void mo22339E() {
        if (this.f49627Q == null) {
            this.f49627Q = new MTimerHandler(new C17995c(), true);
        }
        mo22403m();
        this.f49627Q.stopTimer();
        this.f49627Q.startTimer(500);
    }

    /* renamed from: b */
    public void mo22382b() {
        super.mo22382b();
        this.f49614C = (ImageView) this.f49594e.findViewById(C0966R.C0970id.egr);
        this.f49615D = (ImageView) this.f49594e.findViewById(C0966R.C0970id.byr);
        this.f49617F = (ImageView) this.f49594e.findViewById(C0966R.C0970id.hxm);
        this.f49618G = (FrameLayout) this.f49594e.findViewById(C0966R.C0970id.hxp);
        this.f49616E = (LinearLayout) findViewById(C0966R.C0970id.iwc);
        this.f49619H = (ImageView) findViewById(C0966R.C0970id.h7i);
        this.f49620I = (ImageView) findViewById(C0966R.C0970id.ayo);
        this.f49621J = (ImageView) findViewById(C0966R.C0970id.cmw);
        this.f49622K = (TextView) findViewById(C0966R.C0970id.knx);
        this.f49623L = (LinearLayout) findViewById(C0966R.C0970id.ehc);
        this.f49624M = (LinearLayout) findViewById(C0966R.C0970id.hxj);
    }

    /* renamed from: e */
    public void mo22384e() {
        if (this.f49601o != 0 && !this.f49605s && this.f49597h != null) {
            TextView textView = this.f49599j;
            textView.setText(mo22383d(this.f49602p / 60) + XVFSFile.PATH_SEPARATOR + mo22383d(this.f49602p % 60));
            if (getBarLen() != 0) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f49597h.getLayoutParams();
                int barLen = getBarLen();
                layoutParams.leftMargin = mo22409h(this.f49602p, barLen);
                this.f49597h.setLayoutParams(layoutParams);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f49595f.getLayoutParams();
                layoutParams2.width = (int) (((((double) this.f49602p) * 1.0d) / ((double) this.f49601o)) * ((double) barLen));
                this.f49595f.setLayoutParams(layoutParams2);
                requestLayout();
                int i = this.f49602p;
                int i2 = this.f49601o;
                C17978c.C17983e eVar = this.f49637y0;
                if (eVar != null) {
                    ((AppBrandVideoView.C17965e) eVar).mo22282a(i, i2);
                }
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6491g_;
    }

    public void hide() {
        setVisibility(8);
    }

    /* renamed from: i */
    public final void mo22399i() {
        ViewGroup.LayoutParams layoutParams = this.f49616E.getLayoutParams();
        if (this.f49629R) {
            layoutParams.height = getResources().getDimensionPixelSize(C0966R.dimen.f4136ts);
        } else {
            layoutParams.height = getResources().getDimensionPixelSize(C0966R.dimen.f4128tj);
        }
        this.f49616E.setLayoutParams(layoutParams);
        int dimensionPixelSize = this.f49629R ? getResources().getDimensionPixelSize(C0966R.dimen.f4137tt) : getResources().getDimensionPixelSize(C0966R.dimen.f4129tk);
        this.f49616E.setPadding(0, 0, dimensionPixelSize, 0);
        LinearLayout linearLayout = this.f49623L;
        if (linearLayout != null) {
            linearLayout.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        }
        mo22400j();
        if (this.f49629R) {
            this.f49623L.setVisibility(0);
        } else {
            this.f49623L.setVisibility(8);
        }
        float dimensionPixelSize2 = (float) (this.f49629R ? getResources().getDimensionPixelSize(C0966R.dimen.f4138tu) : getResources().getDimensionPixelSize(C0966R.dimen.f4132tn));
        this.f49599j.setTextSize(0, dimensionPixelSize2);
        this.f49600n.setTextSize(0, dimensionPixelSize2);
        int dimensionPixelSize3 = this.f49629R ? getResources().getDimensionPixelSize(C0966R.dimen.f4135tr) : getResources().getDimensionPixelSize(C0966R.dimen.f4127th);
        ImageView imageView = this.f49598i;
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            marginLayoutParams.setMarginStart(dimensionPixelSize3);
            this.f49598i.setLayoutParams(marginLayoutParams);
        }
        LinearLayout linearLayout2 = this.f49624M;
        if (linearLayout2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) linearLayout2.getLayoutParams();
            marginLayoutParams2.setMarginStart(dimensionPixelSize3);
            this.f49624M.setLayoutParams(marginLayoutParams2);
        }
        ImageView imageView2 = this.f49615D;
        if (imageView2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
            marginLayoutParams3.setMarginStart(dimensionPixelSize3);
            this.f49615D.setLayoutParams(marginLayoutParams3);
        }
        ImageView imageView3 = this.f49619H;
        if (imageView3 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) imageView3.getLayoutParams();
            marginLayoutParams4.setMarginStart(dimensionPixelSize3);
            this.f49619H.setLayoutParams(marginLayoutParams4);
        }
        ImageView imageView4 = this.f49614C;
        if (imageView4 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) imageView4.getLayoutParams();
            marginLayoutParams5.setMarginStart(dimensionPixelSize3);
            this.f49614C.setLayoutParams(marginLayoutParams5);
        }
    }

    /* renamed from: j */
    public void mo22400j() {
        if (this.f49631T) {
            this.f49614C.setVisibility(0);
            if (this.f49629R) {
                this.f49614C.setImageResource(C0966R.raw.app_brand_video_fullscreen_exit_btn);
            } else {
                this.f49614C.setImageResource(C0966R.raw.app_brand_video_fullscreen_btn);
            }
        } else {
            this.f49614C.setVisibility(8);
        }
    }

    /* renamed from: k */
    public final void mo22401k() {
        if (!this.f49634W) {
            this.f49598i.setVisibility(8);
            this.f49620I.setVisibility(8);
        } else if (this.f49635p0) {
            this.f49598i.setVisibility(8);
            this.f49620I.setVisibility(0);
        } else {
            this.f49598i.setVisibility(0);
            this.f49620I.setVisibility(8);
        }
    }

    /* renamed from: l */
    public final void mo22402l() {
        int i = 0;
        boolean z = this.f49633V ? this.f49632U : false;
        this.f49618G.setVisibility(z ? 0 : 8);
        this.f49599j.setVisibility(z ? 0 : 8);
        TextView textView = this.f49600n;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* renamed from: m */
    public final boolean mo22403m() {
        C17978c.C17987i iVar = this.f49625N;
        int i = 0;
        if (iVar == null) {
            Log.m105924i("MicroMsg.AppBrandVideoViewControlBar", "updateMiddleBar mStatePorter null");
            return false;
        }
        int cacheTimeSec = AppBrandVideoView.this.f49521f.getCacheTimeSec();
        int videoDurationSec = AppBrandVideoView.this.f49521f.getVideoDurationSec();
        if (cacheTimeSec < 0 || videoDurationSec < 0) {
            return false;
        }
        if (cacheTimeSec > videoDurationSec) {
            cacheTimeSec = videoDurationSec;
        }
        int barLen = getBarLen();
        if (barLen <= 0) {
            return true;
        }
        if (videoDurationSec != 0) {
            i = (int) (((double) barLen) * ((((double) cacheTimeSec) * 1.0d) / ((double) videoDurationSec)));
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f49617F.getLayoutParams();
        layoutParams.width = i;
        this.f49617F.setLayoutParams(layoutParams);
        return true;
    }

    public void onDestroy() {
        MTimerHandler mTimerHandler = this.f49627Q;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        MTimerHandler mTimerHandler2 = this.f49626P;
        if (mTimerHandler2 != null) {
            mTimerHandler2.stopTimer();
        }
    }

    /* renamed from: p */
    public void mo22342p() {
        this.f49629R = true;
        mo22399i();
    }

    /* renamed from: q */
    public boolean mo22343q() {
        return getVisibility() == 0;
    }

    /* renamed from: r */
    public void mo22344r() {
        MTimerHandler mTimerHandler = this.f49626P;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f49626P.startTimer(7000);
        }
    }

    /* renamed from: s */
    public boolean mo22345s() {
        return this.f49618G != null && getVisibility() == 0 && this.f49618G.getVisibility() == 0;
    }

    public void seek(int i) {
        super.seek(i);
        int i2 = this.f49602p;
        int i3 = this.f49601o;
        C17978c.C17983e eVar = this.f49637y0;
        if (eVar != null) {
            ((AppBrandVideoView.C17965e) eVar).mo22282a(i2, i3);
        }
    }

    public void setAutoHide(boolean z) {
        this.f49636x0 = z;
    }

    public void setDanmakuBtnOnClickListener(C17978c.C17985g gVar) {
        this.f49615D.setOnClickListener(new C17993a(gVar));
    }

    public void setDanmakuBtnOpen(boolean z) {
        this.f49630S = z;
        if (z) {
            this.f49615D.setImageResource(C0966R.raw.app_brand_video_danmu_on);
        } else {
            this.f49615D.setImageResource(C0966R.raw.app_brand_video_danmu_off);
        }
    }

    public void setExitFullScreenBtnOnClickListener(View.OnClickListener onClickListener) {
        this.f49621J.setOnClickListener(onClickListener);
    }

    public void setFullScreenBtnOnClickListener(View.OnClickListener onClickListener) {
        this.f49614C.setOnClickListener(onClickListener);
    }

    public void setIsPlay(boolean z) {
        if (z) {
            this.f49598i.setImageResource(C0966R.raw.app_brand_video_play_btn_pause);
            this.f49620I.setImageResource(C0966R.raw.app_brand_video_play_btn_pause);
            return;
        }
        this.f49598i.setImageResource(C0966R.raw.app_brand_video_play_btn_play);
        this.f49620I.setImageResource(C0966R.raw.app_brand_video_play_btn_play);
    }

    public void setMuteBtnOnClickListener(View.OnClickListener onClickListener) {
        this.f49619H.setOnClickListener(onClickListener);
    }

    public void setMuteBtnState(boolean z) {
        if (z) {
            this.f49619H.setImageResource(C0966R.raw.app_brand_video_mute_btn_off);
        } else {
            this.f49619H.setImageResource(C0966R.raw.app_brand_video_mute_btn_on);
        }
    }

    public void setOnPlayButtonClickListener(View.OnClickListener onClickListener) {
        super.setOnPlayButtonClickListener(onClickListener);
        this.f49620I.setOnClickListener(onClickListener);
    }

    public void setOnUpdateProgressLenListener(C17978c.C17983e eVar) {
        this.f49637y0 = eVar;
    }

    public void setPlayBtnInCenterPosition(boolean z) {
        this.f49635p0 = z;
        mo22401k();
    }

    public void setShowControlProgress(boolean z) {
        this.f49633V = z;
        mo22402l();
    }

    public void setShowDanmakuBtn(boolean z) {
        if (z) {
            this.f49615D.setVisibility(0);
        } else {
            this.f49615D.setVisibility(8);
        }
    }

    public void setShowFullScreenBtn(boolean z) {
        this.f49631T = z;
        mo22400j();
        if (this.f49629R) {
            this.f49623L.setVisibility(0);
        } else {
            this.f49623L.setVisibility(8);
        }
    }

    public void setShowMuteBtn(boolean z) {
        this.f49619H.setVisibility(z ? 0 : 8);
    }

    public void setShowPlayBtn(boolean z) {
        this.f49634W = z;
        mo22401k();
    }

    public void setShowProgress(boolean z) {
        this.f49632U = z;
        mo22402l();
    }

    public void setStatePorter(C17978c.C17987i iVar) {
        this.f49625N = iVar;
    }

    public void setTitle(String str) {
        if (!Util.isNullOrNil(str)) {
            this.f49622K.setText(str);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            Iterator<C17978c.C17984f> it = this.f49628Q0.iterator();
            while (it.hasNext()) {
                C17978c.C17984f next = it.next();
                if (next != null) {
                    next.mo22281a(true);
                }
            }
        } else if (i == 8 || i == 4) {
            Iterator<C17978c.C17984f> it4 = this.f49628Q0.iterator();
            while (it4.hasNext()) {
                C17978c.C17984f next2 = it4.next();
                if (next2 != null) {
                    next2.mo22281a(false);
                }
            }
        }
    }

    /* renamed from: t */
    public void mo22366t() {
        setVisibility(0);
        if (this.f49636x0) {
            if (this.f49626P == null) {
                this.f49626P = new MTimerHandler(new C17994b(), false);
            }
            this.f49626P.stopTimer();
            this.f49626P.startTimer(7000);
        }
    }

    /* renamed from: v */
    public boolean mo22367v() {
        return this.f49630S;
    }

    /* renamed from: w */
    public void mo22368w() {
        this.f49629R = false;
        mo22399i();
    }

    /* renamed from: x */
    public boolean mo22369x() {
        return this.f49636x0;
    }

    /* renamed from: y */
    public boolean mo22370y() {
        return this.f49629R;
    }

    /* renamed from: z */
    public void mo22371z() {
        if (this.f49634W && this.f49635p0) {
            this.f49620I.setVisibility(8);
        }
    }

    public AppBrandVideoViewControlBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AppBrandVideoViewControlBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
