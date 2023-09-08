package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.video.lite;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoView;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.C17978c;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.xweb.file.XVFSFile;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.video.lite.VideoLiteControBar */
public class VideoLiteControBar extends VideoPlayerSeekBar implements C17978c.C17979a {

    /* renamed from: U */
    public static final /* synthetic */ int f51366U = 0;

    /* renamed from: C */
    public ImageView f51367C;

    /* renamed from: D */
    public ImageView f51368D;

    /* renamed from: E */
    public View f51369E;

    /* renamed from: F */
    public View f51370F;

    /* renamed from: G */
    public C17978c.C17987i f51371G;

    /* renamed from: H */
    public MTimerHandler f51372H;

    /* renamed from: I */
    public MTimerHandler f51373I;

    /* renamed from: J */
    public boolean f51374J;

    /* renamed from: K */
    public boolean f51375K;

    /* renamed from: L */
    public boolean f51376L;

    /* renamed from: M */
    public boolean f51377M;

    /* renamed from: N */
    public boolean f51378N;

    /* renamed from: P */
    public boolean f51379P;

    /* renamed from: Q */
    public boolean f51380Q = true;

    /* renamed from: R */
    public C18498c f51381R;

    /* renamed from: S */
    public C17978c.C17983e f51382S;

    /* renamed from: T */
    public ConcurrentLinkedQueue<C17978c.C17984f> f51383T = new ConcurrentLinkedQueue<>();

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.video.lite.VideoLiteControBar$a */
    public class C18496a implements MTimerHandler.CallBack {
        public C18496a() {
        }

        public boolean onTimerExpired() {
            VideoLiteControBar.this.setVisibility(8);
            VideoLiteControBar.this.f51372H.stopTimer();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.video.lite.VideoLiteControBar$b */
    public class C18497b implements MTimerHandler.CallBack {
        public C18497b() {
        }

        public boolean onTimerExpired() {
            VideoLiteControBar videoLiteControBar = VideoLiteControBar.this;
            int i = VideoLiteControBar.f51366U;
            return videoLiteControBar.mo23126l();
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.video.lite.VideoLiteControBar$c */
    public interface C18498c {
        /* renamed from: d */
        void mo23131d(boolean z);
    }

    public VideoLiteControBar(Context context) {
        super(context);
    }

    /* renamed from: A */
    public void mo22335A() {
    }

    /* renamed from: B */
    public void mo22336B() {
        MTimerHandler mTimerHandler = this.f51373I;
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
        this.f51383T.add(fVar);
    }

    /* renamed from: E */
    public void mo22339E() {
        if (this.f51373I == null) {
            this.f51373I = new MTimerHandler(new C18497b(), true);
        }
        mo23126l();
        this.f51373I.stopTimer();
        this.f51373I.startTimer(500);
    }

    /* renamed from: b */
    public void mo22382b() {
        super.mo22382b();
        this.f51367C = (ImageView) this.f49594e.findViewById(C0966R.C0970id.hxm);
        this.f51368D = (ImageView) findViewById(C0966R.C0970id.l4y);
        this.f51369E = findViewById(C0966R.C0970id.iwc);
        this.f51370F = findViewById(C0966R.C0970id.bsu);
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
                C17978c.C17983e eVar = this.f51382S;
                if (eVar != null) {
                    ((AppBrandVideoView.C17965e) eVar).mo22282a(i, i2);
                }
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cbj;
    }

    public void hide() {
        setVisibility(8);
    }

    /* renamed from: i */
    public final void mo23123i() {
        float dimensionPixelSize = (float) (this.f51374J ? getResources().getDimensionPixelSize(C0966R.dimen.f4138tu) : getResources().getDimensionPixelSize(C0966R.dimen.f4132tn));
        this.f49599j.setTextSize(0, dimensionPixelSize);
        this.f49600n.setTextSize(0, dimensionPixelSize);
        int dimensionPixelSize2 = this.f51374J ? getResources().getDimensionPixelSize(C0966R.dimen.f4135tr) : getResources().getDimensionPixelSize(C0966R.dimen.f4127th);
        ImageView imageView = this.f49598i;
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            marginLayoutParams.setMarginStart(dimensionPixelSize2);
            this.f49598i.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: j */
    public final void mo23124j() {
        if (!this.f51378N) {
            this.f49598i.setVisibility(8);
        } else if (this.f51379P) {
            this.f49598i.setVisibility(8);
        } else {
            this.f49598i.setVisibility(0);
        }
    }

    /* renamed from: k */
    public final void mo23125k() {
        int i = 0;
        boolean z = this.f51377M ? this.f51376L : false;
        this.f49599j.setVisibility(z ? 0 : 8);
        TextView textView = this.f49600n;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* renamed from: l */
    public final boolean mo23126l() {
        C17978c.C17987i iVar = this.f51371G;
        int i = 0;
        if (iVar == null) {
            Log.m105924i("MicroMsg.VideoLiteControlBar", "updateMiddleBar mStatePorter null");
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
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f51367C.getLayoutParams();
        layoutParams.width = i;
        this.f51367C.setLayoutParams(layoutParams);
        return true;
    }

    public void onDestroy() {
        MTimerHandler mTimerHandler = this.f51373I;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        MTimerHandler mTimerHandler2 = this.f51372H;
        if (mTimerHandler2 != null) {
            mTimerHandler2.stopTimer();
        }
    }

    /* renamed from: p */
    public void mo22342p() {
        this.f51374J = true;
        mo23123i();
    }

    /* renamed from: q */
    public boolean mo22343q() {
        return getVisibility() == 0;
    }

    /* renamed from: r */
    public void mo22344r() {
        MTimerHandler mTimerHandler = this.f51372H;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f51372H.startTimer(7000);
        }
    }

    /* renamed from: s */
    public boolean mo22345s() {
        return false;
    }

    public void seek(int i) {
        super.seek(i);
        int i2 = this.f49602p;
        int i3 = this.f49601o;
        C17978c.C17983e eVar = this.f51382S;
        if (eVar != null) {
            ((AppBrandVideoView.C17965e) eVar).mo22282a(i2, i3);
        }
    }

    public void setAutoHide(boolean z) {
        this.f51380Q = z;
    }

    public void setBtnCloseListener(View.OnClickListener onClickListener) {
        this.f51368D.setOnClickListener(onClickListener);
    }

    public void setDanmakuBtnOnClickListener(C17978c.C17985g gVar) {
    }

    public void setDanmakuBtnOpen(boolean z) {
        this.f51375K = z;
    }

    public void setExitFullScreenBtnOnClickListener(View.OnClickListener onClickListener) {
    }

    public void setFullScreenBtnOnClickListener(View.OnClickListener onClickListener) {
    }

    public void setIsPlay(boolean z) {
        if (z) {
            this.f49598i.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_pause, -1));
        } else {
            this.f49598i.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_play, -1));
        }
        C18498c cVar = this.f51381R;
        if (cVar != null) {
            cVar.mo23131d(z);
        }
    }

    public void setMuteBtnOnClickListener(View.OnClickListener onClickListener) {
    }

    public void setMuteBtnState(boolean z) {
    }

    public void setOnPlayButtonClickListener(View.OnClickListener onClickListener) {
        super.setOnPlayButtonClickListener(onClickListener);
    }

    public void setOnPlayStatusChangeListener(C18498c cVar) {
        this.f51381R = cVar;
    }

    public void setOnUpdateProgressLenListener(C17978c.C17983e eVar) {
        this.f51382S = eVar;
    }

    public void setPlayBtnInCenterPosition(boolean z) {
        this.f51379P = z;
        mo23124j();
    }

    public void setShowControlProgress(boolean z) {
        this.f51377M = z;
        mo23125k();
    }

    public void setShowDanmakuBtn(boolean z) {
    }

    public void setShowFullScreenBtn(boolean z) {
    }

    public void setShowMuteBtn(boolean z) {
    }

    public void setShowPlayBtn(boolean z) {
        this.f51378N = z;
        mo23124j();
    }

    public void setShowProgress(boolean z) {
        this.f51376L = z;
        mo23125k();
    }

    public void setStatePorter(C17978c.C17987i iVar) {
        this.f51371G = iVar;
    }

    public void setTitle(String str) {
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            Iterator<C17978c.C17984f> it = this.f51383T.iterator();
            while (it.hasNext()) {
                C17978c.C17984f next = it.next();
                if (next != null) {
                    next.mo22281a(true);
                }
            }
        } else if (i == 8 || i == 4) {
            Iterator<C17978c.C17984f> it4 = this.f51383T.iterator();
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
        if (this.f51380Q) {
            if (this.f51372H == null) {
                this.f51372H = new MTimerHandler(new C18496a(), false);
            }
            this.f51372H.stopTimer();
            this.f51372H.startTimer(7000);
        }
    }

    /* renamed from: v */
    public boolean mo22367v() {
        return this.f51375K;
    }

    /* renamed from: w */
    public void mo22368w() {
        this.f51374J = false;
        mo23123i();
    }

    /* renamed from: x */
    public boolean mo22369x() {
        return this.f51380Q;
    }

    /* renamed from: y */
    public boolean mo22370y() {
        return this.f51374J;
    }

    /* renamed from: z */
    public void mo22371z() {
    }

    public VideoLiteControBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VideoLiteControBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
