package com.tencent.p014mm.plugin.sight.decode.p1077ui;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.xweb.file.XVFSFile;
import xn2.C102691a;
import xn2.C102692b;
import xn2.C102693c;

/* renamed from: com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar */
public class AdVideoPlayerLoadingBar extends RelativeLayout implements C102692b {

    /* renamed from: d */
    public C102693c f273520d = null;

    /* renamed from: e */
    public View f273521e = null;

    /* renamed from: f */
    public ImageView f273522f;

    /* renamed from: g */
    public ImageView f273523g = null;

    /* renamed from: h */
    public ImageView f273524h = null;

    /* renamed from: i */
    public ImageView f273525i = null;

    /* renamed from: j */
    public TextView f273526j;

    /* renamed from: n */
    public TextView f273527n;

    /* renamed from: o */
    public int f273528o = 0;

    /* renamed from: p */
    public int f273529p = 0;

    /* renamed from: q */
    public int f273530q = 0;

    /* renamed from: r */
    public int f273531r = 0;

    /* renamed from: s */
    public boolean f273532s = false;

    /* renamed from: t */
    public float f273533t = 0.0f;

    /* renamed from: u */
    public int f273534u = -1;

    /* renamed from: v */
    public int f273535v = -1;

    /* renamed from: w */
    public int f273536w = -1;

    /* renamed from: x */
    public int f273537x = -1;

    /* renamed from: com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar$a */
    public class C94572a implements View.OnTouchListener {
        public C94572a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x00c8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
            /*
                r8 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r9)
                r0.add(r10)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/sight/decode/ui/AdVideoPlayerLoadingBar$1"
                java.lang.String r2 = "android/view/View$OnTouchListener"
                java.lang.String r3 = "onTouch"
                java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r5 = r8
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                int r9 = r10.getAction()
                r0 = 1
                r1 = 0
                java.lang.String r2 = "MicroMsg.VideoPlayerLoadingBar"
                if (r9 != 0) goto L_0x0044
                java.lang.String r9 = "ontouch down"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
                com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar r9 = com.tencent.p014mm.plugin.sight.decode.p1077ui.AdVideoPlayerLoadingBar.this
                r9.f273532s = r1
                float r10 = r10.getX()
                r9.f273533t = r10
                com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar r9 = com.tencent.p014mm.plugin.sight.decode.p1077ui.AdVideoPlayerLoadingBar.this
                xn2.c r9 = r9.f273520d
                if (r9 == 0) goto L_0x014b
                r9.onSeekPre()
                goto L_0x014b
            L_0x0044:
                int r9 = r10.getAction()
                r3 = 2
                if (r9 != r3) goto L_0x011c
                float r9 = r10.getX()
                com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar r10 = com.tencent.p014mm.plugin.sight.decode.p1077ui.AdVideoPlayerLoadingBar.this
                android.widget.ImageView r10 = r10.f273524h
                android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
                android.widget.FrameLayout$LayoutParams r10 = (android.widget.FrameLayout.LayoutParams) r10
                int r1 = r10.leftMargin
                com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar r2 = com.tencent.p014mm.plugin.sight.decode.p1077ui.AdVideoPlayerLoadingBar.this
                float r4 = r2.f273533t
                float r9 = r9 - r4
                int r9 = (int) r9
                int r1 = r1 + r9
                int r9 = r2.getBarPointWidth()
                android.widget.ImageView r4 = r2.f273524h
                int r4 = r4.getPaddingLeft()
                int r9 = r9 - r4
                android.widget.ImageView r4 = r2.f273524h
                int r4 = r4.getPaddingRight()
                int r9 = r9 - r4
                int r9 = r9 / r3
                android.widget.ImageView r3 = r2.f273523g
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
                int r4 = r3.leftMargin
                android.widget.ImageView r5 = r2.f273524h
                int r5 = r5.getPaddingLeft()
                int r4 = r4 - r5
                int r4 = r4 - r9
                if (r1 >= r4) goto L_0x0093
                int r1 = r3.leftMargin
                android.widget.ImageView r2 = r2.f273524h
                int r2 = r2.getPaddingLeft()
                int r1 = r1 - r2
                goto L_0x00b2
            L_0x0093:
                int r4 = r2.getBarLen()
                int r5 = r3.leftMargin
                int r4 = r4 + r5
                int r4 = r4 - r9
                android.widget.ImageView r5 = r2.f273524h
                int r5 = r5.getPaddingLeft()
                int r4 = r4 - r5
                if (r1 <= r4) goto L_0x00b3
                int r1 = r2.getBarLen()
                int r3 = r3.leftMargin
                int r1 = r1 + r3
                int r1 = r1 - r9
                android.widget.ImageView r9 = r2.f273524h
                int r9 = r9.getPaddingLeft()
            L_0x00b2:
                int r1 = r1 - r9
            L_0x00b3:
                r10.leftMargin = r1
                com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar r9 = com.tencent.p014mm.plugin.sight.decode.p1077ui.AdVideoPlayerLoadingBar.this
                android.widget.ImageView r9 = r9.f273524h
                r9.setLayoutParams(r10)
                com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar r9 = com.tencent.p014mm.plugin.sight.decode.p1077ui.AdVideoPlayerLoadingBar.this
                int r9 = r9.getCurrentTimeByBarPoint()
                com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar r10 = com.tencent.p014mm.plugin.sight.decode.p1077ui.AdVideoPlayerLoadingBar.this
                int r1 = r10.f273528o
                if (r1 <= 0) goto L_0x00ec
                android.widget.ImageView r10 = r10.f273522f
                android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
                android.widget.FrameLayout$LayoutParams r10 = (android.widget.FrameLayout.LayoutParams) r10
                double r1 = (double) r9
                r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r1 = r1 * r3
                com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar r3 = com.tencent.p014mm.plugin.sight.decode.p1077ui.AdVideoPlayerLoadingBar.this
                int r4 = r3.f273528o
                double r4 = (double) r4
                double r1 = r1 / r4
                int r3 = r3.getBarLen()
                double r3 = (double) r3
                double r1 = r1 * r3
                int r1 = (int) r1
                r10.width = r1
                com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar r1 = com.tencent.p014mm.plugin.sight.decode.p1077ui.AdVideoPlayerLoadingBar.this
                android.widget.ImageView r1 = r1.f273522f
                r1.setLayoutParams(r10)
            L_0x00ec:
                com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar r10 = com.tencent.p014mm.plugin.sight.decode.p1077ui.AdVideoPlayerLoadingBar.this
                android.widget.TextView r10 = r10.f273526j
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar r2 = com.tencent.p014mm.plugin.sight.decode.p1077ui.AdVideoPlayerLoadingBar.this
                int r3 = r9 / 60
                java.lang.String r2 = r2.mo130086q(r3)
                r1.append(r2)
                java.lang.String r2 = ":"
                r1.append(r2)
                com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar r2 = com.tencent.p014mm.plugin.sight.decode.p1077ui.AdVideoPlayerLoadingBar.this
                int r9 = r9 % 60
                java.lang.String r9 = r2.mo130086q(r9)
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                r10.setText(r9)
                com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar r9 = com.tencent.p014mm.plugin.sight.decode.p1077ui.AdVideoPlayerLoadingBar.this
                r9.f273532s = r0
                goto L_0x014b
            L_0x011c:
                com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar r9 = com.tencent.p014mm.plugin.sight.decode.p1077ui.AdVideoPlayerLoadingBar.this
                boolean r10 = r9.f273532s
                if (r10 == 0) goto L_0x014b
                int r9 = r9.getCurrentTimeByBarPoint()
                com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar r10 = com.tencent.p014mm.plugin.sight.decode.p1077ui.AdVideoPlayerLoadingBar.this
                xn2.c r10 = r10.f273520d
                if (r10 == 0) goto L_0x0147
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r3 = "current time : "
                r10.append(r3)
                r10.append(r9)
                java.lang.String r10 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
                com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar r10 = com.tencent.p014mm.plugin.sight.decode.p1077ui.AdVideoPlayerLoadingBar.this
                xn2.c r10 = r10.f273520d
                r10.mo4335a(r9)
            L_0x0147:
                com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar r9 = com.tencent.p014mm.plugin.sight.decode.p1077ui.AdVideoPlayerLoadingBar.this
                r9.f273532s = r1
            L_0x014b:
                r2 = 1
                java.lang.String r4 = "com/tencent/mm/plugin/sight/decode/ui/AdVideoPlayerLoadingBar$1"
                java.lang.String r5 = "android/view/View$OnTouchListener"
                java.lang.String r6 = "onTouch"
                java.lang.String r7 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r3 = r8
                j20.C117292a.m165362h(r2, r3, r4, r5, r6, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sight.decode.p1077ui.AdVideoPlayerLoadingBar.C94572a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar$b */
    public class C94573b implements Runnable {
        public C94573b() {
        }

        public void run() {
            AdVideoPlayerLoadingBar.this.mo130087s();
        }
    }

    public AdVideoPlayerLoadingBar(Context context) {
        super(context);
        mo36657p();
    }

    /* renamed from: f */
    public void mo130080f() {
        this.f273530q = 0;
    }

    public int getBarLen() {
        if (this.f273530q <= 0) {
            this.f273530q = this.f273523g.getWidth();
        }
        return this.f273530q;
    }

    public int getBarPointWidth() {
        if (this.f273531r <= 0) {
            this.f273531r = this.f273524h.getWidth();
        }
        return this.f273531r;
    }

    public int getCurrentTimeByBarPoint() {
        return Math.max(0, (int) (((((double) ((((FrameLayout.LayoutParams) this.f273524h.getLayoutParams()).leftMargin - (((FrameLayout.LayoutParams) this.f273523g.getLayoutParams()).leftMargin - this.f273524h.getPaddingLeft())) + (((getBarPointWidth() - this.f273524h.getPaddingLeft()) - this.f273524h.getPaddingRight()) / 2))) * 1.0d) / ((double) getBarLen())) * ((double) this.f273528o)));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cbm;
    }

    public int getVideoTotalTime() {
        return this.f273528o;
    }

    public int getmPosition() {
        return this.f273529p;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f273530q = 0;
        if (!(i == this.f273534u && i2 == this.f273535v && i3 == this.f273536w && i4 == this.f273537x)) {
            mo36658r();
        }
        this.f273534u = i;
        this.f273535v = i2;
        this.f273536w = i3;
        this.f273537x = i4;
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
        this.f273524h.setOnTouchListener(new C94572a());
        this.f273524h.post(new C102691a(this));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f273522f.getLayoutParams();
        layoutParams.width = 0;
        this.f273522f.setLayoutParams(layoutParams);
    }

    /* renamed from: q */
    public String mo130086q(int i) {
        if (i < 10) {
            return "0" + i;
        }
        return i + "";
    }

    /* renamed from: r */
    public void mo36658r() {
        if (this.f273528o != 0 && !this.f273532s && this.f273524h != null && getBarLen() != 0) {
            TextView textView = this.f273526j;
            textView.setText(mo130086q(this.f273529p / 60) + XVFSFile.PATH_SEPARATOR + mo130086q(this.f273529p % 60));
            int paddingLeft = ((FrameLayout.LayoutParams) this.f273523g.getLayoutParams()).leftMargin - this.f273524h.getPaddingLeft();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f273524h.getLayoutParams();
            layoutParams.leftMargin = (((int) (((((double) this.f273529p) * 1.0d) / ((double) this.f273528o)) * ((double) getBarLen()))) + paddingLeft) - (((getBarPointWidth() - this.f273524h.getPaddingLeft()) - this.f273524h.getPaddingRight()) / 2);
            this.f273524h.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f273522f.getLayoutParams();
            layoutParams2.width = (int) (((((double) this.f273529p) * 1.0d) / ((double) this.f273528o)) * ((double) getBarLen()));
            this.f273522f.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: s */
    public void mo130087s() {
        TextView textView = this.f273527n;
        textView.setText(mo130086q(this.f273528o / 60) + XVFSFile.PATH_SEPARATOR + mo130086q(this.f273528o % 60));
        mo36658r();
    }

    public void seek(int i) {
        this.f273529p = i;
        mo36658r();
    }

    public void setIplaySeekCallback(C102693c cVar) {
        this.f273520d = cVar;
    }

    public void setIsPlay(boolean z) {
        if (z) {
            this.f273525i.setImageResource(C0966R.raw.media_player_pause_btn);
        } else {
            this.f273525i.setImageResource(C0966R.raw.media_player_play_btn);
        }
    }

    public void setOnPlayButtonClickListener(View.OnClickListener onClickListener) {
        this.f273525i.setOnClickListener(onClickListener);
    }

    public void setVideoTotalTime(int i) {
        this.f273528o = i;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            post(new C94573b());
        } else {
            mo130087s();
        }
    }

    public AdVideoPlayerLoadingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo36657p();
    }

    public AdVideoPlayerLoadingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo36657p();
    }
}
