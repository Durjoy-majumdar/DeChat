package com.tencent.p014mm.plugin.sight.decode.p1077ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import j20.C117292a;
import java.util.ArrayList;
import xn2.C102692b;
import xn2.C102693c;

/* renamed from: com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar */
public class SnsAdNativeLandingPagesVideoPlayerLoadingBar extends RelativeLayout implements C102692b {

    /* renamed from: d */
    public C102693c f273552d = null;

    /* renamed from: e */
    public View f273553e = null;

    /* renamed from: f */
    public ImageView f273554f;

    /* renamed from: g */
    public ImageView f273555g = null;

    /* renamed from: h */
    public ImageView f273556h = null;

    /* renamed from: i */
    public ImageView f273557i = null;

    /* renamed from: j */
    public TextView f273558j;

    /* renamed from: n */
    public TextView f273559n;

    /* renamed from: o */
    public int f273560o = 0;

    /* renamed from: p */
    public int f273561p = 0;

    /* renamed from: q */
    public boolean f273562q = false;

    /* renamed from: r */
    public float f273563r = 0.0f;

    /* renamed from: s */
    public boolean f273564s = false;

    /* renamed from: t */
    public int f273565t = -1;

    /* renamed from: u */
    public int f273566u = -1;

    /* renamed from: v */
    public int f273567v = -1;

    /* renamed from: w */
    public int f273568w = -1;

    /* renamed from: com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar$a */
    public class C94576a implements View.OnTouchListener {
        public C94576a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sight/decode/ui/SnsAdNativeLandingPagesVideoPlayerLoadingBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                Log.m105924i("MicroMsg.SnsAdNativeLandingPagesVideoPlayerLoadingBar", "ontouch down");
                SnsAdNativeLandingPagesVideoPlayerLoadingBar snsAdNativeLandingPagesVideoPlayerLoadingBar = SnsAdNativeLandingPagesVideoPlayerLoadingBar.this;
                snsAdNativeLandingPagesVideoPlayerLoadingBar.f273562q = false;
                snsAdNativeLandingPagesVideoPlayerLoadingBar.f273563r = motionEvent.getX();
                C102693c cVar = SnsAdNativeLandingPagesVideoPlayerLoadingBar.this.f273552d;
                if (cVar != null) {
                    cVar.onSeekPre();
                }
            } else if (motionEvent.getAction() == 2) {
                float x = motionEvent.getX();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) SnsAdNativeLandingPagesVideoPlayerLoadingBar.this.f273556h.getLayoutParams();
                int i = layoutParams.leftMargin;
                SnsAdNativeLandingPagesVideoPlayerLoadingBar snsAdNativeLandingPagesVideoPlayerLoadingBar2 = SnsAdNativeLandingPagesVideoPlayerLoadingBar.this;
                layoutParams.leftMargin = SnsAdNativeLandingPagesVideoPlayerLoadingBar.m119604a(snsAdNativeLandingPagesVideoPlayerLoadingBar2, i + ((int) (x - snsAdNativeLandingPagesVideoPlayerLoadingBar2.f273563r)));
                SnsAdNativeLandingPagesVideoPlayerLoadingBar.this.f273556h.setLayoutParams(layoutParams);
                int b = SnsAdNativeLandingPagesVideoPlayerLoadingBar.this.getCurrentTimeByBarPoint();
                SnsAdNativeLandingPagesVideoPlayerLoadingBar snsAdNativeLandingPagesVideoPlayerLoadingBar3 = SnsAdNativeLandingPagesVideoPlayerLoadingBar.this;
                if (snsAdNativeLandingPagesVideoPlayerLoadingBar3.f273560o > 0) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) snsAdNativeLandingPagesVideoPlayerLoadingBar3.f273554f.getLayoutParams();
                    SnsAdNativeLandingPagesVideoPlayerLoadingBar snsAdNativeLandingPagesVideoPlayerLoadingBar4 = SnsAdNativeLandingPagesVideoPlayerLoadingBar.this;
                    layoutParams2.width = (int) (((((double) b) * 1.0d) / ((double) snsAdNativeLandingPagesVideoPlayerLoadingBar4.f273560o)) * ((double) snsAdNativeLandingPagesVideoPlayerLoadingBar4.getBarLen()));
                    SnsAdNativeLandingPagesVideoPlayerLoadingBar.this.f273554f.setLayoutParams(layoutParams2);
                }
                TextView textView = SnsAdNativeLandingPagesVideoPlayerLoadingBar.this.f273558j;
                textView.setText(SnsAdNativeLandingPagesVideoPlayerLoadingBar.this.mo130115e(b / 60) + XVFSFile.PATH_SEPARATOR + SnsAdNativeLandingPagesVideoPlayerLoadingBar.this.mo130115e(b % 60));
                SnsAdNativeLandingPagesVideoPlayerLoadingBar.this.f273562q = true;
            } else {
                SnsAdNativeLandingPagesVideoPlayerLoadingBar snsAdNativeLandingPagesVideoPlayerLoadingBar5 = SnsAdNativeLandingPagesVideoPlayerLoadingBar.this;
                if (snsAdNativeLandingPagesVideoPlayerLoadingBar5.f273562q) {
                    int b2 = snsAdNativeLandingPagesVideoPlayerLoadingBar5.getCurrentTimeByBarPoint();
                    if (SnsAdNativeLandingPagesVideoPlayerLoadingBar.this.f273552d != null) {
                        Log.m105924i("MicroMsg.SnsAdNativeLandingPagesVideoPlayerLoadingBar", "current time : " + b2);
                        SnsAdNativeLandingPagesVideoPlayerLoadingBar.this.f273552d.mo4335a(b2);
                    }
                    SnsAdNativeLandingPagesVideoPlayerLoadingBar.this.f273562q = false;
                }
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/sight/decode/ui/SnsAdNativeLandingPagesVideoPlayerLoadingBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar$b */
    public class C94577b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f273570d;

        public C94577b(int i) {
            this.f273570d = i;
        }

        public void run() {
            SnsAdNativeLandingPagesVideoPlayerLoadingBar.this.setVideoTotalTime(this.f273570d);
        }
    }

    public SnsAdNativeLandingPagesVideoPlayerLoadingBar(Context context) {
        super(context);
        mo130114d();
    }

    /* renamed from: a */
    public static int m119604a(SnsAdNativeLandingPagesVideoPlayerLoadingBar snsAdNativeLandingPagesVideoPlayerLoadingBar, int i) {
        int width = ((snsAdNativeLandingPagesVideoPlayerLoadingBar.f273556h.getWidth() - snsAdNativeLandingPagesVideoPlayerLoadingBar.f273556h.getPaddingLeft()) - snsAdNativeLandingPagesVideoPlayerLoadingBar.f273556h.getPaddingRight()) / 2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) snsAdNativeLandingPagesVideoPlayerLoadingBar.f273555g.getLayoutParams();
        if (i < (layoutParams.leftMargin - snsAdNativeLandingPagesVideoPlayerLoadingBar.f273556h.getPaddingLeft()) - width) {
            i = layoutParams.leftMargin - snsAdNativeLandingPagesVideoPlayerLoadingBar.f273556h.getPaddingLeft();
        } else if (i > snsAdNativeLandingPagesVideoPlayerLoadingBar.getBarLen()) {
            i = snsAdNativeLandingPagesVideoPlayerLoadingBar.getBarLen();
        }
        return i - width;
    }

    /* access modifiers changed from: private */
    public int getBarLen() {
        return this.f273555g.getWidth();
    }

    /* access modifiers changed from: private */
    public int getCurrentTimeByBarPoint() {
        int paddingLeft = (int) (((((double) (((FrameLayout.LayoutParams) this.f273556h.getLayoutParams()).leftMargin - (((FrameLayout.LayoutParams) this.f273555g.getLayoutParams()).leftMargin - this.f273556h.getPaddingLeft()))) * 1.0d) / ((double) getBarLen())) * ((double) this.f273560o));
        if (paddingLeft < 0) {
            return 0;
        }
        return paddingLeft;
    }

    /* renamed from: d */
    public final void mo130114d() {
        View inflate = View.inflate(getContext(), C0966R.C0971layout.c1q, this);
        this.f273553e = inflate;
        this.f273554f = (ImageView) inflate.findViewById(C0966R.C0970id.hxl);
        this.f273555g = (ImageView) this.f273553e.findViewById(C0966R.C0970id.hxk);
        this.f273556h = (ImageView) this.f273553e.findViewById(C0966R.C0970id.hxo);
        this.f273557i = (ImageView) this.f273553e.findViewById(C0966R.C0970id.hwy);
        this.f273558j = (TextView) this.f273553e.findViewById(C0966R.C0970id.f358927hx0);
        this.f273559n = (TextView) this.f273553e.findViewById(C0966R.C0970id.hx_);
        this.f273556h.setOnTouchListener(new C94576a());
    }

    /* renamed from: e */
    public String mo130115e(int i) {
        if (i < 10) {
            return "0" + i;
        }
        return i + "";
    }

    /* renamed from: f */
    public void mo130080f() {
    }

    /* renamed from: g */
    public void mo130116g() {
        if (this.f273560o != 0 && !this.f273562q && this.f273556h != null && getBarLen() != 0) {
            TextView textView = this.f273558j;
            textView.setText(mo130115e(this.f273561p / 60) + XVFSFile.PATH_SEPARATOR + mo130115e(this.f273561p % 60));
            int paddingLeft = ((FrameLayout.LayoutParams) this.f273555g.getLayoutParams()).leftMargin - this.f273556h.getPaddingLeft();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f273556h.getLayoutParams();
            layoutParams.leftMargin = (((int) (((((double) this.f273561p) * 1.0d) / ((double) this.f273560o)) * ((double) getBarLen()))) + paddingLeft) - (((this.f273556h.getWidth() - this.f273556h.getPaddingLeft()) - this.f273556h.getPaddingRight()) / 2);
            this.f273556h.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f273554f.getLayoutParams();
            layoutParams2.width = (int) (((((double) this.f273561p) * 1.0d) / ((double) this.f273560o)) * ((double) getBarLen()));
            this.f273554f.setLayoutParams(layoutParams2);
        }
    }

    public boolean getIsPlay() {
        return this.f273564s;
    }

    public int getVideoTotalTime() {
        return this.f273560o;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!(i == this.f273565t && i2 == this.f273566u && i3 == this.f273567v && i4 == this.f273568w)) {
            mo130116g();
        }
        this.f273565t = i;
        this.f273566u = i2;
        this.f273567v = i3;
        this.f273568w = i4;
    }

    public void seek(int i) {
        this.f273561p = i;
        mo130116g();
    }

    public void setIplaySeekCallback(C102693c cVar) {
        this.f273552d = cVar;
    }

    public void setIsPlay(boolean z) {
        this.f273564s = z;
        if (z) {
            this.f273557i.setImageResource(C0966R.raw.media_player_pause_btn);
        } else {
            this.f273557i.setImageResource(C0966R.raw.media_player_play_btn);
        }
    }

    public void setOnPlayButtonClickListener(View.OnClickListener onClickListener) {
        this.f273557i.setOnClickListener(onClickListener);
    }

    public void setVideoTotalTime(int i) {
        if (!this.f273556h.isShown() || this.f273556h.getWidth() != 0) {
            this.f273560o = i;
            this.f273561p = 0;
            TextView textView = this.f273559n;
            textView.setText(mo130115e(this.f273560o / 60) + XVFSFile.PATH_SEPARATOR + mo130115e(this.f273560o % 60));
            mo130116g();
            return;
        }
        post(new C94577b(i));
    }

    public SnsAdNativeLandingPagesVideoPlayerLoadingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo130114d();
    }

    public SnsAdNativeLandingPagesVideoPlayerLoadingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo130114d();
    }
}
