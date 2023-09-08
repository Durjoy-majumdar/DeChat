package com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.C17978c;
import com.tencent.xweb.file.XVFSFile;
import nn0.C21684a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar */
public class AdVideoPlayerLoadingBar extends RelativeLayout {

    /* renamed from: d */
    public C17978c.C17982d f49593d = null;

    /* renamed from: e */
    public View f49594e = null;

    /* renamed from: f */
    public ImageView f49595f;

    /* renamed from: g */
    public ImageView f49596g = null;

    /* renamed from: h */
    public ImageView f49597h = null;

    /* renamed from: i */
    public ImageView f49598i = null;

    /* renamed from: j */
    public TextView f49599j;

    /* renamed from: n */
    public TextView f49600n;

    /* renamed from: o */
    public int f49601o = 0;

    /* renamed from: p */
    public int f49602p = 0;

    /* renamed from: q */
    public int f49603q = 0;

    /* renamed from: r */
    public int f49604r = 0;

    /* renamed from: s */
    public boolean f49605s = false;

    /* renamed from: t */
    public float f49606t = 0.0f;

    /* renamed from: u */
    public int f49607u = -1;

    /* renamed from: v */
    public int f49608v = -1;

    /* renamed from: w */
    public int f49609w = -1;

    /* renamed from: x */
    public int f49610x = -1;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar$a */
    public class C17991a implements View.OnTouchListener {
        public C17991a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x00c6  */
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
                java.lang.String r1 = "com/tencent/mm/plugin/appbrand/jsapi/video/progressbar/AdVideoPlayerLoadingBar$1"
                java.lang.String r2 = "android/view/View$OnTouchListener"
                java.lang.String r3 = "onTouch"
                java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r5 = r8
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                int r9 = r10.getAction()
                r0 = 1
                r1 = 0
                java.lang.String r2 = "MicroMsg.AdVideoPlayerLoadingBar"
                if (r9 != 0) goto L_0x0042
                java.lang.String r9 = "ontouch down"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
                com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar r9 = com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar.this
                r9.f49605s = r1
                float r10 = r10.getX()
                r9.f49606t = r10
                com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar r9 = com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar.this
                com.tencent.mm.plugin.appbrand.jsapi.video.c$d r9 = r9.f49593d
                if (r9 == 0) goto L_0x0149
                r9.onSeekPre()
                goto L_0x0149
            L_0x0042:
                int r9 = r10.getAction()
                r3 = 2
                if (r9 != r3) goto L_0x011a
                float r9 = r10.getX()
                com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar r10 = com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar.this
                android.widget.ImageView r10 = r10.f49597h
                android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
                android.widget.FrameLayout$LayoutParams r10 = (android.widget.FrameLayout.LayoutParams) r10
                int r1 = r10.leftMargin
                com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar r2 = com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar.this
                float r4 = r2.f49606t
                float r9 = r9 - r4
                int r9 = (int) r9
                int r1 = r1 + r9
                int r9 = r2.getBarPointWidth()
                android.widget.ImageView r4 = r2.f49597h
                int r4 = r4.getPaddingLeft()
                int r9 = r9 - r4
                android.widget.ImageView r4 = r2.f49597h
                int r4 = r4.getPaddingRight()
                int r9 = r9 - r4
                int r9 = r9 / r3
                android.widget.ImageView r3 = r2.f49596g
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
                int r4 = r3.leftMargin
                android.widget.ImageView r5 = r2.f49597h
                int r5 = r5.getPaddingLeft()
                int r4 = r4 - r5
                int r4 = r4 - r9
                if (r1 >= r4) goto L_0x0091
                int r1 = r3.leftMargin
                android.widget.ImageView r2 = r2.f49597h
                int r2 = r2.getPaddingLeft()
                int r1 = r1 - r2
                goto L_0x00b0
            L_0x0091:
                int r4 = r2.getBarLen()
                int r5 = r3.leftMargin
                int r4 = r4 + r5
                int r4 = r4 - r9
                android.widget.ImageView r5 = r2.f49597h
                int r5 = r5.getPaddingLeft()
                int r4 = r4 - r5
                if (r1 <= r4) goto L_0x00b1
                int r1 = r2.getBarLen()
                int r3 = r3.leftMargin
                int r1 = r1 + r3
                int r1 = r1 - r9
                android.widget.ImageView r9 = r2.f49597h
                int r9 = r9.getPaddingLeft()
            L_0x00b0:
                int r1 = r1 - r9
            L_0x00b1:
                r10.leftMargin = r1
                com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar r9 = com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar.this
                android.widget.ImageView r9 = r9.f49597h
                r9.setLayoutParams(r10)
                com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar r9 = com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar.this
                int r9 = r9.getCurrentTimeByBarPoint()
                com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar r10 = com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar.this
                int r1 = r10.f49601o
                if (r1 <= 0) goto L_0x00ea
                android.widget.ImageView r10 = r10.f49595f
                android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
                android.widget.FrameLayout$LayoutParams r10 = (android.widget.FrameLayout.LayoutParams) r10
                double r1 = (double) r9
                r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r1 = r1 * r3
                com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar r3 = com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar.this
                int r4 = r3.f49601o
                double r4 = (double) r4
                double r1 = r1 / r4
                int r3 = r3.getBarLen()
                double r3 = (double) r3
                double r1 = r1 * r3
                int r1 = (int) r1
                r10.width = r1
                com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar r1 = com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar.this
                android.widget.ImageView r1 = r1.f49595f
                r1.setLayoutParams(r10)
            L_0x00ea:
                com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar r10 = com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar.this
                android.widget.TextView r10 = r10.f49599j
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar r2 = com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar.this
                int r3 = r9 / 60
                java.lang.String r2 = r2.mo22383d(r3)
                r1.append(r2)
                java.lang.String r2 = ":"
                r1.append(r2)
                com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar r2 = com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar.this
                int r9 = r9 % 60
                java.lang.String r9 = r2.mo22383d(r9)
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                r10.setText(r9)
                com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar r9 = com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar.this
                r9.f49605s = r0
                goto L_0x0149
            L_0x011a:
                com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar r9 = com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar.this
                boolean r10 = r9.f49605s
                if (r10 == 0) goto L_0x0149
                int r9 = r9.getCurrentTimeByBarPoint()
                com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar r10 = com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar.this
                com.tencent.mm.plugin.appbrand.jsapi.video.c$d r10 = r10.f49593d
                if (r10 == 0) goto L_0x0145
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r3 = "current time : "
                r10.append(r3)
                r10.append(r9)
                java.lang.String r10 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
                com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar r10 = com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar.this
                com.tencent.mm.plugin.appbrand.jsapi.video.c$d r10 = r10.f49593d
                r10.mo22286a(r9)
            L_0x0145:
                com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar r9 = com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar.this
                r9.f49605s = r1
            L_0x0149:
                r2 = 1
                java.lang.String r4 = "com/tencent/mm/plugin/appbrand/jsapi/video/progressbar/AdVideoPlayerLoadingBar$1"
                java.lang.String r5 = "android/view/View$OnTouchListener"
                java.lang.String r6 = "onTouch"
                java.lang.String r7 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r3 = r8
                j20.C117292a.m165362h(r2, r3, r4, r5, r6, r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar.C17991a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar$b */
    public class C17992b implements Runnable {
        public C17992b() {
        }

        public void run() {
            AdVideoPlayerLoadingBar.this.mo22385f();
        }
    }

    public AdVideoPlayerLoadingBar(Context context) {
        super(context);
        mo22382b();
    }

    /* renamed from: b */
    public void mo22382b() {
        View inflate = View.inflate(getContext(), getLayoutId(), this);
        this.f49594e = inflate;
        this.f49595f = (ImageView) inflate.findViewById(C0966R.C0970id.hxl);
        this.f49596g = (ImageView) this.f49594e.findViewById(C0966R.C0970id.hxk);
        this.f49597h = (ImageView) this.f49594e.findViewById(C0966R.C0970id.hxo);
        this.f49598i = (ImageView) this.f49594e.findViewById(C0966R.C0970id.hwy);
        this.f49599j = (TextView) this.f49594e.findViewById(C0966R.C0970id.f358927hx0);
        this.f49600n = (TextView) this.f49594e.findViewById(C0966R.C0970id.hx_);
        this.f49597h.setOnTouchListener(new C17991a());
        this.f49597h.post(new C21684a(this));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f49595f.getLayoutParams();
        layoutParams.width = 0;
        this.f49595f.setLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public String mo22383d(int i) {
        if (i < 10) {
            return "0" + i;
        }
        return i + "";
    }

    /* renamed from: e */
    public void mo22384e() {
        if (this.f49601o != 0 && !this.f49605s && this.f49597h != null && getBarLen() != 0) {
            TextView textView = this.f49599j;
            textView.setText(mo22383d(this.f49602p / 60) + XVFSFile.PATH_SEPARATOR + mo22383d(this.f49602p % 60));
            int paddingLeft = ((FrameLayout.LayoutParams) this.f49596g.getLayoutParams()).leftMargin - this.f49597h.getPaddingLeft();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f49597h.getLayoutParams();
            layoutParams.leftMargin = (((int) (((((double) this.f49602p) * 1.0d) / ((double) this.f49601o)) * ((double) getBarLen()))) + paddingLeft) - (((getBarPointWidth() - this.f49597h.getPaddingLeft()) - this.f49597h.getPaddingRight()) / 2);
            this.f49597h.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f49595f.getLayoutParams();
            layoutParams2.width = (int) (((((double) this.f49602p) * 1.0d) / ((double) this.f49601o)) * ((double) getBarLen()));
            this.f49595f.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: f */
    public void mo22385f() {
        TextView textView = this.f49600n;
        textView.setText(mo22383d(this.f49601o / 60) + XVFSFile.PATH_SEPARATOR + mo22383d(this.f49601o % 60));
        mo22384e();
    }

    public int getBarLen() {
        if (this.f49603q <= 0) {
            this.f49603q = this.f49596g.getWidth();
        }
        return this.f49603q;
    }

    public int getBarPointWidth() {
        if (this.f49604r <= 0) {
            this.f49604r = this.f49597h.getWidth();
        }
        return this.f49604r;
    }

    public int getCurrentTimeByBarPoint() {
        return Math.max(0, (int) (((((double) ((((FrameLayout.LayoutParams) this.f49597h.getLayoutParams()).leftMargin - (((FrameLayout.LayoutParams) this.f49596g.getLayoutParams()).leftMargin - this.f49597h.getPaddingLeft())) + (((getBarPointWidth() - this.f49597h.getPaddingLeft()) - this.f49597h.getPaddingRight()) / 2))) * 1.0d) / ((double) getBarLen())) * ((double) this.f49601o)));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6487g6;
    }

    public int getVideoTotalTime() {
        return this.f49601o;
    }

    public int getmPosition() {
        return this.f49602p;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f49603q = 0;
        if (!(i == this.f49607u && i2 == this.f49608v && i3 == this.f49609w && i4 == this.f49610x)) {
            mo22384e();
        }
        this.f49607u = i;
        this.f49608v = i2;
        this.f49609w = i3;
        this.f49610x = i4;
    }

    public void setIplaySeekCallback(C17978c.C17982d dVar) {
        this.f49593d = dVar;
    }

    public void setIsPlay(boolean z) {
        if (z) {
            this.f49598i.setImageResource(C0966R.raw.media_player_pause_btn);
        } else {
            this.f49598i.setImageResource(C0966R.raw.media_player_play_btn);
        }
    }

    public void setOnPlayButtonClickListener(View.OnClickListener onClickListener) {
        this.f49598i.setOnClickListener(onClickListener);
    }

    public void setVideoTotalTime(int i) {
        this.f49601o = i;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            post(new C17992b());
        } else {
            mo22385f();
        }
    }

    public AdVideoPlayerLoadingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo22382b();
    }

    public AdVideoPlayerLoadingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo22382b();
    }
}
