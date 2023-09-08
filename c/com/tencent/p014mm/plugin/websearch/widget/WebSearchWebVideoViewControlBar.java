package com.tencent.p014mm.plugin.websearch.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import h83.C98321a;
import q83.C101053e;

/* renamed from: com.tencent.mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar */
public class WebSearchWebVideoViewControlBar extends WebSearchVideoPlayerSeekBar {

    /* renamed from: P */
    public static int f282897P = -1;

    /* renamed from: E */
    public ImageView f282898E;

    /* renamed from: F */
    public ImageView f282899F;

    /* renamed from: G */
    public RelativeLayout f282900G;

    /* renamed from: H */
    public ImageView f282901H;

    /* renamed from: I */
    public FrameLayout f282902I;

    /* renamed from: J */
    public ImageView f282903J;

    /* renamed from: K */
    public C96623a f282904K;

    /* renamed from: L */
    public MTimerHandler f282905L;

    /* renamed from: M */
    public MTimerHandler f282906M;

    /* renamed from: N */
    public boolean f282907N;

    /* renamed from: com.tencent.mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar$a */
    public interface C96623a {
    }

    public WebSearchWebVideoViewControlBar(Context context) {
        super(context);
    }

    /* renamed from: A */
    public final void mo134722A() {
        if (!this.f282907N) {
            if (this.f282893z) {
                this.f273525i.setImageResource(C0966R.C0969drawable.c3f);
            } else {
                this.f273525i.setImageResource(C0966R.C0969drawable.c3j);
            }
        } else if (this.f282893z) {
            this.f273525i.setImageResource(C0966R.C0969drawable.c3f);
        } else {
            this.f273525i.setImageResource(C0966R.C0969drawable.c3j);
        }
    }

    /* renamed from: B */
    public void mo134723B(boolean z) {
        if (getVisibility() == 0) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        if (!z) {
            this.f273525i.setVisibility(0);
        } else {
            this.f273525i.setVisibility(8);
        }
        if (this.f282905L == null) {
            this.f282905L = new MTimerHandler(new C98321a(this), false);
        }
        this.f282905L.stopTimer();
        this.f282905L.startTimer(2000);
    }

    /* renamed from: C */
    public final boolean mo134724C() {
        C96623a aVar = this.f282904K;
        if (aVar == null) {
            Log.m105924i("MicroMsg.FtsWebVideoViewControlBar", "updateMiddleBar mStatePorter null");
            return false;
        }
        int cacheTimeSec = ((C101053e) aVar).f295845a.f282960e.getCacheTimeSec();
        int videoDurationSec = ((C101053e) this.f282904K).f295845a.f282960e.getVideoDurationSec();
        if (cacheTimeSec < 0 || videoDurationSec < 0) {
            return false;
        }
        int width = this.f282902I.getWidth();
        if (width <= 0) {
            return true;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f282901H.getLayoutParams();
        if (videoDurationSec != 0) {
            width = (int) (((float) width) * (1.0f - (((float) cacheTimeSec) / ((float) videoDurationSec))));
        }
        if (width <= 0) {
            width = 0;
        }
        layoutParams.rightMargin = width + f282897P;
        this.f282901H.setLayoutParams(layoutParams);
        return cacheTimeSec < videoDurationSec || videoDurationSec == 0;
    }

    /* renamed from: a */
    public void mo130492a(int i) {
        seek((int) Math.ceil((((double) ((C101053e) this.f282904K).f295845a.f282960e.getCurrPosMs()) * 1.0d) / 1000.0d));
    }

    public int getBarPointWidth() {
        return this.f273524h.getWidth();
    }

    public ImageView getExitFullscreenIv() {
        return this.f282903J;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359797au0;
    }

    /* renamed from: p */
    public void mo36657p() {
        super.mo36657p();
        this.f282898E = (ImageView) this.f273521e.findViewById(C0966R.C0970id.egr);
        this.f282899F = (ImageView) this.f273521e.findViewById(C0966R.C0970id.la7);
        this.f282901H = (ImageView) this.f273521e.findViewById(C0966R.C0970id.hxm);
        this.f282902I = (FrameLayout) this.f273521e.findViewById(C0966R.C0970id.hxp);
        this.f282900G = (RelativeLayout) findViewById(C0966R.C0970id.iwc);
        this.f282903J = (ImageView) this.f273521e.findViewById(C0966R.C0970id.cmw);
        if (f282897P < 0) {
            f282897P = getResources().getDimensionPixelSize(C0966R.dimen.aae);
        }
    }

    public void setEnterFullScreenBtnClickListener(View.OnClickListener onClickListener) {
        this.f282898E.setOnClickListener(onClickListener);
    }

    public void setExitFullScreenBtnClickListener(View.OnClickListener onClickListener) {
        this.f282903J.setOnClickListener(onClickListener);
    }

    public void setIsPlay(boolean z) {
        this.f282893z = z;
        mo134722A();
    }

    public void setMuteBtnOnClickListener(View.OnClickListener onClickListener) {
        this.f282899F.setOnClickListener(onClickListener);
    }

    public void setStatePorter(C96623a aVar) {
        this.f282904K = aVar;
    }

    /* renamed from: y */
    public final void mo134730y() {
        ViewGroup.LayoutParams layoutParams = this.f282900G.getLayoutParams();
        if (this.f282907N) {
            layoutParams.height = getResources().getDimensionPixelSize(C0966R.dimen.aac);
        } else {
            layoutParams.height = getResources().getDimensionPixelSize(C0966R.dimen.aaa);
        }
        this.f282900G.setLayoutParams(layoutParams);
        if (this.f282907N) {
            this.f282898E.setImageResource(C0966R.raw.icons_fts_web_video_fullscreen_op_fullscreen_btn);
            this.f282898E.setVisibility(8);
            this.f282903J.setVisibility(0);
        } else {
            this.f282903J.setVisibility(8);
            this.f282898E.setVisibility(0);
            this.f282898E.setImageResource(C0966R.C0969drawable.c3h);
        }
        mo134722A();
        float dimensionPixelSize = (float) (this.f282907N ? getResources().getDimensionPixelSize(C0966R.dimen.aad) : getResources().getDimensionPixelSize(C0966R.dimen.aab));
        this.f273526j.setTextSize(0, dimensionPixelSize);
        this.f273527n.setTextSize(0, dimensionPixelSize);
    }

    /* renamed from: z */
    public void mo134731z() {
        MTimerHandler mTimerHandler = this.f282905L;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f282905L.startTimer(2000);
        }
    }

    public WebSearchWebVideoViewControlBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WebSearchWebVideoViewControlBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
