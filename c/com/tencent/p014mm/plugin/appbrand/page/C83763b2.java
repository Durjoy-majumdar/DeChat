package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.page.C83745a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p1044ub.C90630c;

/* renamed from: com.tencent.mm.plugin.appbrand.page.b2 */
public class C83763b2 extends C83756a2 {

    /* renamed from: A */
    public View f244500A;

    /* renamed from: B */
    public ImageView f244501B;

    /* renamed from: C */
    public ImageView f244502C;

    /* renamed from: D */
    public ImageView f244503D;

    /* renamed from: E */
    public final Runnable f244504E = new C83764a();

    /* renamed from: F */
    public long f244505F = 0;

    /* renamed from: u */
    public C83765b f244506u;

    /* renamed from: v */
    public C83766c f244507v;

    /* renamed from: w */
    public boolean f244508w = false;

    /* renamed from: x */
    public C83797e3 f244509x;

    /* renamed from: y */
    public LinearLayout f244510y;

    /* renamed from: z */
    public TextView f244511z;

    /* renamed from: com.tencent.mm.plugin.appbrand.page.b2$a */
    public class C83764a implements Runnable {
        public C83764a() {
        }

        public void run() {
            LinearLayout linearLayout = C83763b2.this.f244510y;
            linearLayout.setTranslationY((float) (-linearLayout.getHeight()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.b2$b */
    public interface C83765b {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.b2$c */
    public interface C83766c {
        /* renamed from: e */
        void mo111231e(int i);
    }

    public C83763b2(Context context, C83797e3 e3Var) {
        super(context);
        this.f244509x = e3Var;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6447f4, this, false);
        this.f244510y = linearLayout;
        View wrapperView = e3Var.getWrapperView();
        this.f244478d = linearLayout;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f244479e = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f244479e.addView(linearLayout);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.f244480f = frameLayout2;
        frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f244480f.addView(wrapperView);
        addView(this.f244479e);
        addView(this.f244480f);
        this.f244511z = (TextView) findViewById(C0966R.C0970id.f5981tz);
        this.f244500A = findViewById(C0966R.C0970id.f5977tv);
        this.f244501B = (ImageView) findViewById(C0966R.C0970id.f5978tw);
        this.f244502C = (ImageView) findViewById(C0966R.C0970id.f5979tx);
        this.f244503D = (ImageView) findViewById(C0966R.C0970id.f5980ty);
    }

    /* renamed from: a */
    public boolean mo116083a() {
        return this.f244509x.mo63333t0();
    }

    /* renamed from: d */
    public void mo116086d(int i) {
        C83766c cVar = this.f244507v;
        if (cVar != null) {
            cVar.mo111231e(i);
        }
        if (this.f244508w) {
            removeCallbacks(this.f244504E);
            if (i > this.f244510y.getHeight()) {
                i = this.f244510y.getHeight();
            }
            LinearLayout linearLayout = this.f244510y;
            linearLayout.setTranslationY((float) (i - linearLayout.getHeight()));
        }
    }

    /* renamed from: e */
    public void mo116087e() {
        ImageView imageView = this.f244501B;
        if (imageView == null || imageView.getDrawable() == null) {
            Log.m105928w("MicroMsg.AppBrandPullDownWebView", "stopLoadingAnimation but drawable is null, try protect");
            return;
        }
        ((AnimationDrawable) this.f244501B.getDrawable()).stop();
        ((AnimationDrawable) this.f244501B.getDrawable()).selectDrawable(0);
        ((AnimationDrawable) this.f244502C.getDrawable()).stop();
        ((AnimationDrawable) this.f244502C.getDrawable()).selectDrawable(0);
        ((AnimationDrawable) this.f244503D.getDrawable()).stop();
        ((AnimationDrawable) this.f244503D.getDrawable()).selectDrawable(0);
    }

    /* renamed from: f */
    public void mo116088f() {
        ImageView imageView = this.f244501B;
        if (imageView == null) {
            Log.m105920e("MicroMsg.AppBrandPullDownWebView", "startLoadingAnimation, mLoading0 is null");
        } else {
            if (imageView.getDrawable() == null) {
                Log.m105928w("MicroMsg.AppBrandPullDownWebView", "startLoadingAnimation but drawable is null, try protect");
                mo116102j();
                this.f244511z.setTextColor(-16777216);
                this.f244511z.setAlpha(0.2f);
            }
            ((AnimationDrawable) this.f244501B.getDrawable()).start();
            ((AnimationDrawable) this.f244502C.getDrawable()).start();
            ((AnimationDrawable) this.f244503D.getDrawable()).start();
        }
        C83765b bVar = this.f244506u;
        if (bVar != null) {
            C83745a.C83747b bVar2 = (C83745a.C83747b) bVar;
            if (C83745a.this.mo124764Z() != null) {
                ((C90630c) C83745a.this.mo124764Z()).mo109651e("onPullDownRefresh", (String) null, new int[]{((C90630c) C83745a.this.mo124764Z()).getComponentId()});
            }
        }
        this.f244505F = System.currentTimeMillis();
    }

    /* renamed from: g */
    public void mo116099g(boolean z) {
        this.f244508w = z;
        setNeedStay(z);
        View view = this.f244500A;
        int i = z ? 0 : 4;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/page/AppBrandPullDownWebView", "enablePullDownRefresh", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/page/AppBrandPullDownWebView", "enablePullDownRefresh", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public int getStayHeight() {
        return this.f244510y.getHeight();
    }

    /* renamed from: h */
    public final AnimationDrawable mo116100h(int i, float[] fArr) {
        AnimationDrawable animationDrawable = new AnimationDrawable();
        Log.m105924i("MicroMsg.AppBrandPullDownWebView", "AnimationDrawable hash:" + animationDrawable.hashCode());
        animationDrawable.setOneShot(false);
        animationDrawable.addFrame(mo116101i(i, fArr[0]), 0);
        animationDrawable.addFrame(mo116101i(i, fArr[1]), 300);
        animationDrawable.addFrame(mo116101i(i, fArr[2]), 300);
        animationDrawable.addFrame(mo116101i(i, fArr[3]), 300);
        return animationDrawable;
    }

    /* renamed from: i */
    public final Drawable mo116101i(int i, float f) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setIntrinsicHeight(32);
        shapeDrawable.setIntrinsicWidth(32);
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.getPaint().setAlpha((int) (f * 255.0f));
        return shapeDrawable;
    }

    /* renamed from: j */
    public final void mo116102j() {
        ImageView imageView = this.f244501B;
        if (imageView == null) {
            Log.m105928w("MicroMsg.AppBrandPullDownWebView", "setupDarkLoading but mLoading0 is null, try protect");
            return;
        }
        imageView.setImageDrawable(mo116100h(-16777216, new float[]{0.1f, 0.4f, 0.2f, 0.1f}));
        this.f244502C.setImageDrawable(mo116100h(-16777216, new float[]{0.1f, 0.1f, 0.4f, 0.2f}));
        this.f244503D.setImageDrawable(mo116100h(-16777216, new float[]{0.1f, 0.2f, 0.1f, 0.4f}));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(this.f244504E);
    }

    public void setBackgroundTextStyle(String str) {
        if ("light".equals(str)) {
            ImageView imageView = this.f244501B;
            if (imageView == null) {
                Log.m105928w("MicroMsg.AppBrandPullDownWebView", "setupLightLoading but mLoading0 is null, try protect");
            } else {
                imageView.setImageDrawable(mo116100h(-1, new float[]{0.2f, 0.6f, 0.4f, 0.2f}));
                this.f244502C.setImageDrawable(mo116100h(-1, new float[]{0.2f, 0.2f, 0.6f, 0.4f}));
                this.f244503D.setImageDrawable(mo116100h(-1, new float[]{0.2f, 0.4f, 0.2f, 0.6f}));
            }
            this.f244511z.setTextColor(-1);
            this.f244511z.setAlpha(0.4f);
        } else if ("dark".equals(str)) {
            mo116102j();
            this.f244511z.setTextColor(-16777216);
            this.f244511z.setAlpha(0.2f);
        } else if (!"ignore".equals(str)) {
            mo116102j();
            this.f244511z.setTextColor(-16777216);
            this.f244511z.setAlpha(0.2f);
        }
    }

    public void setHeadViewHeight(int i) {
        if (i > this.f244510y.getHeight()) {
            this.f244510y.getLayoutParams().height = i;
            this.f244510y.requestLayout();
        }
    }

    public void setOnPullDownListener(C83765b bVar) {
        this.f244506u = bVar;
    }

    public void setOnPullDownOffsetListener(C83766c cVar) {
        this.f244507v = cVar;
    }

    public void setPullDownText(String str) {
        if (Util.isNullOrNil(str)) {
            this.f244511z.setVisibility(8);
            return;
        }
        this.f244511z.setVisibility(0);
        this.f244511z.setText(str);
    }
}
