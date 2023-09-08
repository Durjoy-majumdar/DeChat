package com.tencent.p014mm.plugin.websearch.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sight.decode.p1077ui.AdVideoPlayerLoadingBar;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import j20.C117292a;
import java.util.ArrayList;
import vd3.C102173o;
import xn2.C102693c;

/* renamed from: com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar */
public class WebSearchVideoPlayerSeekBar extends AdVideoPlayerLoadingBar implements C102173o {

    /* renamed from: D */
    public static final /* synthetic */ int f282888D = 0;

    /* renamed from: A */
    public int f282889A = -1;

    /* renamed from: B */
    public int f282890B = -1;

    /* renamed from: C */
    public int f282891C = -1;

    /* renamed from: y */
    public float f282892y;

    /* renamed from: z */
    public boolean f282893z = false;

    /* renamed from: com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar$a */
    public class C96620a implements View.OnTouchListener {
        public C96620a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/websearch/widget/WebSearchVideoPlayerSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                Log.m105924i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "ontouch down");
                WebSearchVideoPlayerSeekBar webSearchVideoPlayerSeekBar = WebSearchVideoPlayerSeekBar.this;
                int i = WebSearchVideoPlayerSeekBar.f282888D;
                webSearchVideoPlayerSeekBar.f273532s = false;
                webSearchVideoPlayerSeekBar.f282892y = motionEvent.getX();
                WebSearchVideoPlayerSeekBar webSearchVideoPlayerSeekBar2 = WebSearchVideoPlayerSeekBar.this;
                webSearchVideoPlayerSeekBar2.f273533t = (float) ((FrameLayout.LayoutParams) webSearchVideoPlayerSeekBar2.f273524h.getLayoutParams()).leftMargin;
                C102693c cVar = WebSearchVideoPlayerSeekBar.this.f273520d;
                if (cVar != null) {
                    cVar.onSeekPre();
                }
            } else if (motionEvent.getAction() == 2) {
                float x = motionEvent.getX();
                Log.m105925i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "move dis %f ", Float.valueOf(x - WebSearchVideoPlayerSeekBar.this.f282892y));
                WebSearchVideoPlayerSeekBar webSearchVideoPlayerSeekBar3 = WebSearchVideoPlayerSeekBar.this;
                webSearchVideoPlayerSeekBar3.mo134718x((int) (((float) WebSearchVideoPlayerSeekBar.this.getCurProgressBarLen()) + (x - webSearchVideoPlayerSeekBar3.f282892y)));
                int v = WebSearchVideoPlayerSeekBar.this.getCurTimeByProgressBar();
                TextView textView = WebSearchVideoPlayerSeekBar.this.f273526j;
                textView.setText(WebSearchVideoPlayerSeekBar.this.mo130086q(v / 60) + XVFSFile.PATH_SEPARATOR + WebSearchVideoPlayerSeekBar.this.mo130086q(v % 60));
                WebSearchVideoPlayerSeekBar webSearchVideoPlayerSeekBar4 = WebSearchVideoPlayerSeekBar.this;
                webSearchVideoPlayerSeekBar4.f273532s = true;
                webSearchVideoPlayerSeekBar4.getClass();
            } else {
                Log.m105924i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "ontouch up");
                WebSearchVideoPlayerSeekBar webSearchVideoPlayerSeekBar5 = WebSearchVideoPlayerSeekBar.this;
                int i2 = WebSearchVideoPlayerSeekBar.f282888D;
                int i3 = webSearchVideoPlayerSeekBar5.f273529p;
                if (webSearchVideoPlayerSeekBar5.f273532s) {
                    i3 = webSearchVideoPlayerSeekBar5.getCurTimeByProgressBar();
                    webSearchVideoPlayerSeekBar5.f273529p = i3;
                }
                if (WebSearchVideoPlayerSeekBar.this.f273520d != null) {
                    Log.m105924i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "current time : " + i3);
                    WebSearchVideoPlayerSeekBar.this.f273520d.mo4335a(i3);
                }
                WebSearchVideoPlayerSeekBar.this.f273532s = false;
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/websearch/widget/WebSearchVideoPlayerSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar$b */
    public class C96621b implements View.OnLayoutChangeListener {
        public C96621b() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i3 - i != i7 - i5) {
                WebSearchVideoPlayerSeekBar.this.mo36658r();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar$c */
    public class C96622c implements View.OnLayoutChangeListener {
        public C96622c() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i3 - i != i7 - i5) {
                WebSearchVideoPlayerSeekBar.this.mo36658r();
            }
        }
    }

    public WebSearchVideoPlayerSeekBar(Context context) {
        super(context);
    }

    private int getBarPointPaddingLeft() {
        if (this.f282890B == -1) {
            this.f282890B = this.f273524h.getPaddingLeft();
        }
        return this.f282890B;
    }

    private int getBarPointPaddingRight() {
        if (this.f282891C == -1) {
            this.f282891C = this.f273524h.getPaddingRight();
        }
        return this.f282891C;
    }

    /* access modifiers changed from: private */
    public int getCurProgressBarLen() {
        return this.f273522f.getWidth();
    }

    /* access modifiers changed from: private */
    public int getCurTimeByProgressBar() {
        return (int) (((((double) getCurProgressBarLen()) * 1.0d) / ((double) getBarLen())) * ((double) this.f273528o));
    }

    /* renamed from: a */
    public void mo130492a(int i) {
        seek(i);
    }

    /* renamed from: c */
    public void mo130494c(boolean z) {
        setIsPlay(z);
    }

    public int getBarLen() {
        return this.f273523g.getWidth();
    }

    public int getBarPointWidth() {
        if (this.f282889A == -1) {
            this.f282889A = this.f273524h.getWidth();
        }
        return this.f282889A;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cbn;
    }

    public ImageView getPlayBtn() {
        return this.f273525i;
    }

    public TextView getPlaytimeTv() {
        return this.f273526j;
    }

    /* renamed from: p */
    public void mo36657p() {
        View inflate = View.inflate(getContext(), getLayoutId(), this);
        this.f273521e = inflate;
        this.f273522f = (ImageView) inflate.findViewById(C0966R.C0970id.hxl);
        this.f273523g = (ImageView) this.f273521e.findViewById(C0966R.C0970id.hxk);
        this.f273524h = (ImageView) this.f273521e.findViewById(C0966R.C0970id.hxo);
        this.f273525i = (ImageView) this.f273521e.findViewById(C0966R.C0970id.hwy);
        this.f273526j = (TextView) this.f273521e.findViewById(C0966R.C0970id.f358927hx0);
        this.f273527n = (TextView) this.f273521e.findViewById(C0966R.C0970id.hx_);
        this.f273524h.setOnTouchListener(new C96620a());
        this.f273524h.addOnLayoutChangeListener(new C96621b());
        this.f273523g.addOnLayoutChangeListener(new C96622c());
    }

    /* renamed from: r */
    public void mo36658r() {
        if (this.f273528o != 0 && !this.f273532s && this.f273524h != null && getBarLen() != 0) {
            if (this.f273529p == this.f273528o) {
                Log.m105924i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", APMidasPayAPI.ENV_TEST);
            }
            TextView textView = this.f273526j;
            textView.setText(mo130086q(this.f273529p / 60) + XVFSFile.PATH_SEPARATOR + mo130086q(this.f273529p % 60));
            mo134718x(mo134717w(this.f273529p));
        }
    }

    public void seek(int i) {
        Log.m105918d("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "seek position : " + i);
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f273528o;
        if (i >= i2) {
            i = i2;
        }
        if (this.f273529p != i) {
            this.f273529p = i;
            mo36658r();
        }
    }

    public void setIsPlay(boolean z) {
        this.f282893z = z;
        super.setIsPlay(z);
    }

    public void setPlayBtnOnClickListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f273525i;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setVideoTotalTime(int i) {
        this.f273528o = i;
        this.f273529p = 0;
        TextView textView = this.f273527n;
        textView.setText(mo130086q(this.f273528o / 60) + XVFSFile.PATH_SEPARATOR + mo130086q(this.f273528o % 60));
        mo36658r();
    }

    /* renamed from: w */
    public int mo134717w(int i) {
        if (i <= 0) {
            return 0;
        }
        int i2 = this.f273528o;
        return i >= i2 ? getBarLen() : (int) (((((double) i) * 1.0d) / ((double) i2)) * ((double) getBarLen()));
    }

    /* renamed from: x */
    public void mo134718x(int i) {
        if (i > getBarLen()) {
            i = getBarLen();
        } else if (i < 0) {
            i = 0;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f273524h.getLayoutParams();
        layoutParams.leftMargin = (((FrameLayout.LayoutParams) this.f273523g.getLayoutParams()).leftMargin + (i > getBarLen() ? getBarLen() : i)) - (getBarPointWidth() >>> 1);
        this.f273524h.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f273522f.getLayoutParams();
        layoutParams2.width = i;
        this.f273522f.setLayoutParams(layoutParams2);
        this.f273524h.requestLayout();
        this.f273522f.requestLayout();
    }

    public WebSearchVideoPlayerSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WebSearchVideoPlayerSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
