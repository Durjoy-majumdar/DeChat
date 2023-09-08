package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.lang.reflect.Array;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.r */
public class C72603r {

    /* renamed from: a */
    public int f211222a;

    /* renamed from: b */
    public int f211223b;

    /* renamed from: c */
    public int f211224c;

    /* renamed from: d */
    public int f211225d;

    /* renamed from: e */
    public View f211226e;

    /* renamed from: f */
    public View f211227f;

    /* renamed from: g */
    public View f211228g;

    /* renamed from: h */
    public View f211229h;

    /* renamed from: i */
    public View f211230i;

    /* renamed from: j */
    public View f211231j;

    /* renamed from: k */
    public View f211232k;

    /* renamed from: l */
    public View f211233l;

    /* renamed from: m */
    public View f211234m;

    /* renamed from: n */
    public View f211235n;

    /* renamed from: o */
    public float[][] f211236o;

    /* renamed from: p */
    public float[] f211237p;

    /* renamed from: q */
    public C43975i f211238q = C43975i.Init;

    /* renamed from: r */
    public boolean f211239r;

    /* renamed from: s */
    public C72611h f211240s;

    /* renamed from: t */
    public int f211241t = 0;

    /* renamed from: u */
    public ValueAnimator.AnimatorUpdateListener f211242u = new C72607d();

    /* renamed from: v */
    public ValueAnimator.AnimatorUpdateListener f211243v = new C72608e();

    /* renamed from: w */
    public ValueAnimator.AnimatorUpdateListener f211244w = new C72609f();

    /* renamed from: x */
    public ValueAnimator.AnimatorUpdateListener f211245x = new C72610g();

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.r$i */
    public enum C43975i {
        Init,
        Search
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.r$a */
    public class C72604a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f211246d;

        public C72604a(View view) {
            this.f211246d = view;
        }

        public void run() {
            C72603r.this.f211236o[0][0] = this.f211246d.getY();
            float[][] fArr = C72603r.this.f211236o;
            fArr[0][1] = 0.0f;
            fArr[1][0] = this.f211246d.getX();
            float[][] fArr2 = C72603r.this.f211236o;
            fArr2[1][1] = 0.0f;
            fArr2[2][0] = (float) this.f211246d.getMeasuredWidth();
            float[] fArr3 = C72603r.this.f211236o[2];
            int measuredWidth = this.f211246d.getMeasuredWidth();
            C72603r rVar = C72603r.this;
            fArr3[1] = (float) (measuredWidth + (rVar.f211222a * 2));
            float[][] fArr4 = rVar.f211236o;
            rVar.getClass();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < fArr4.length; i++) {
                for (int i2 = 0; i2 < fArr4[i].length; i2++) {
                    stringBuffer.append(String.format("[%d,%d]: %.2f,", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(fArr4[i][i2])}));
                }
            }
            Log.m105924i("MicroMsg.WebSearch.SosAnimatorBaseController", "printArray:" + stringBuffer.toString());
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.r$b */
    public class C72605b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f211248d;

        /* renamed from: e */
        public final /* synthetic */ View f211249e;

        public C72605b(View view, View view2) {
            this.f211248d = view;
            this.f211249e = view2;
        }

        public void run() {
            C72603r.this.f211237p[0] = this.f211248d.getY();
            C72603r.this.f211237p[1] = this.f211248d.getY() - this.f211249e.getY();
            C72603r rVar = C72603r.this;
            float[] fArr = rVar.f211237p;
            rVar.getClass();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < fArr.length; i++) {
                stringBuffer.append(String.format("[%d]: %.2f,", new Object[]{Integer.valueOf(i), Float.valueOf(fArr[i])}));
            }
            Log.m105924i("MicroMsg.WebSearch.SosAnimatorBaseController", "printArray:" + stringBuffer.toString());
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.r$c */
    public class C72606c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f211251d;

        public C72606c(View view) {
            this.f211251d = view;
        }

        public void run() {
            C72603r.this.f211224c = this.f211251d.getMeasuredHeight();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.r$d */
    public class C72607d implements ValueAnimator.AnimatorUpdateListener {
        public C72607d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view;
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C72603r rVar = C72603r.this;
            float[][] fArr = rVar.f211236o;
            float[] fArr2 = fArr[1];
            float f = fArr2[1];
            float f2 = fArr2[0];
            float f3 = ((f - f2) * floatValue) + f2;
            float[] fArr3 = fArr[0];
            float f4 = fArr3[1];
            float f5 = fArr3[0];
            rVar.f211226e.setX(f3);
            C72603r.this.f211226e.setY(((f4 - f5) * floatValue) + f5);
            C72603r rVar2 = C72603r.this;
            float[] fArr4 = rVar2.f211237p;
            float f6 = fArr4[1];
            float f7 = fArr4[0];
            rVar2.f211227f.setY(((f6 - f7) * floatValue) + f7);
            View view2 = C72603r.this.f211227f;
            float f8 = 1.0f - floatValue;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(f8));
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C72603r rVar3 = C72603r.this;
            int i = rVar3.f211241t;
            if (i == 1 || i == 3) {
                View view4 = rVar3.f211234m;
                if (view4 != null) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(Float.valueOf(floatValue));
                    View view5 = view4;
                    C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view4.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    View view6 = C72603r.this.f211234m;
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(0);
                    View view7 = view6;
                    C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view7, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C72603r rVar4 = C72603r.this;
                    View view8 = rVar4.f211234m;
                    if (view8 != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view8.getLayoutParams();
                        layoutParams.leftMargin = (int) (((float) rVar4.f211223b) * f8);
                        C72603r.this.f211234m.setLayoutParams(layoutParams);
                    }
                }
                View view9 = C72603r.this.f211235n;
                if (view9 != null) {
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(0);
                    View view10 = view9;
                    C117292a.m165358d(view10, aVar4.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view10, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view11 = C72603r.this.f211235n;
                    C9556a aVar5 = new C9556a();
                    aVar5.mo10233c(Float.valueOf(floatValue));
                    View view12 = view11;
                    C117292a.m165358d(view12, aVar5.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view11.setAlpha(((Float) aVar5.mo10231a(0)).floatValue());
                    C117292a.m165359e(view12, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            } else if (i == 2 && (view = rVar3.f211234m) != null) {
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(Float.valueOf(floatValue));
                View view13 = view;
                C117292a.m165358d(view13, aVar6.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar6.mo10231a(0)).floatValue());
                C117292a.m165359e(view13, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                View view14 = C72603r.this.f211234m;
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(0);
                View view15 = view14;
                C117292a.m165358d(view15, aVar7.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view14.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view15, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$4", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C72603r.this.getClass();
            C72603r rVar5 = C72603r.this;
            View view16 = rVar5.f211226e;
            int i2 = rVar5.f211225d;
            rVar5.getClass();
            C72603r.this.getClass();
            view16.setPadding((int) ((((float) (i2 - 0)) * floatValue) + ((float) 0)), 0, 0, 0);
            Log.m105927v("MicroMsg.WebSearch.SosAnimatorBaseController", "searchBarView.paddingLeft %d value %f", Integer.valueOf(C72603r.this.f211226e.getPaddingLeft()), Float.valueOf(floatValue));
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) C72603r.this.f211226e.getLayoutParams();
            C72603r rVar6 = C72603r.this;
            int i3 = rVar6.f211222a;
            int i4 = (int) (((float) i3) * f8);
            layoutParams2.leftMargin = i4;
            layoutParams2.rightMargin = 0;
            layoutParams2.width = ((int) rVar6.f211236o[2][0]) + ((i3 - i4) * 2);
            rVar6.f211226e.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.r$e */
    public class C72608e implements ValueAnimator.AnimatorUpdateListener {
        public C72608e() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            View view = C72603r.this.f211226e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$5", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$5", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view2 = C72603r.this.f211227f;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(floatValue));
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$5", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$5", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C72603r rVar = C72603r.this;
            rVar.f211226e.setX(rVar.f211236o[1][1]);
            C72603r rVar2 = C72603r.this;
            rVar2.f211226e.setY(rVar2.f211236o[0][1]);
            C72603r rVar3 = C72603r.this;
            rVar3.f211227f.setY(rVar3.f211237p[1]);
            C72603r.this.getClass();
            C72603r rVar4 = C72603r.this;
            View view3 = rVar4.f211226e;
            int i = rVar4.f211225d;
            rVar4.getClass();
            C72603r.this.getClass();
            view3.setPadding((int) ((floatValue * ((float) (i - 0))) + ((float) 0)), 0, 0, 0);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) C72603r.this.f211226e.getLayoutParams();
            if (layoutParams.leftMargin != 0) {
                layoutParams.leftMargin = 0;
                layoutParams.rightMargin = 0;
                C72603r rVar5 = C72603r.this;
                layoutParams.width = ((int) rVar5.f211236o[2][0]) + (rVar5.f211222a * 2);
                rVar5.f211226e.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.r$f */
    public class C72609f implements ValueAnimator.AnimatorUpdateListener {
        public C72609f() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view;
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C72603r rVar = C72603r.this;
            float[][] fArr = rVar.f211236o;
            float[] fArr2 = fArr[1];
            float f = fArr2[0];
            float f2 = fArr2[1];
            float f3 = ((f - f2) * floatValue) + f2;
            float[] fArr3 = fArr[0];
            float f4 = fArr3[0];
            float f5 = fArr3[1];
            rVar.f211226e.setX(f3);
            C72603r.this.f211226e.setY(((f4 - f5) * floatValue) + f5);
            C72603r rVar2 = C72603r.this;
            float[] fArr4 = rVar2.f211237p;
            float f6 = fArr4[0];
            float f7 = fArr4[1];
            rVar2.f211227f.setY(((f6 - f7) * floatValue) + f7);
            View view2 = C72603r.this.f211227f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$6", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$6", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C72603r rVar3 = C72603r.this;
            int i = rVar3.f211241t;
            if (i == 1 || i == 3) {
                View view4 = rVar3.f211234m;
                if (view4 != null) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(Float.valueOf(1.0f - floatValue));
                    View view5 = view4;
                    C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$6", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view4.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$6", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    View view6 = C72603r.this.f211234m;
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(0);
                    View view7 = view6;
                    C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$6", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view7, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$6", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C72603r rVar4 = C72603r.this;
                    View view8 = rVar4.f211234m;
                    if (view8 != null) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view8.getLayoutParams();
                        layoutParams.leftMargin = (int) (((float) rVar4.f211223b) * floatValue);
                        C72603r.this.f211234m.setLayoutParams(layoutParams);
                    }
                }
                View view9 = C72603r.this.f211235n;
                if (view9 != null) {
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(0);
                    View view10 = view9;
                    C117292a.m165358d(view10, aVar4.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$6", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view10, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$6", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view11 = C72603r.this.f211235n;
                    C9556a aVar5 = new C9556a();
                    aVar5.mo10233c(Float.valueOf(1.0f - floatValue));
                    View view12 = view11;
                    C117292a.m165358d(view12, aVar5.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$6", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view11.setAlpha(((Float) aVar5.mo10231a(0)).floatValue());
                    C117292a.m165359e(view12, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$6", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            } else if (i == 2 && (view = rVar3.f211234m) != null) {
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(Float.valueOf(1.0f - floatValue));
                View view13 = view;
                C117292a.m165358d(view13, aVar6.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$6", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar6.mo10231a(0)).floatValue());
                C117292a.m165359e(view13, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$6", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                View view14 = C72603r.this.f211234m;
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(0);
                View view15 = view14;
                C117292a.m165358d(view15, aVar7.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$6", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view14.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view15, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$6", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C72603r.this.getClass();
            C72603r rVar5 = C72603r.this;
            View view16 = rVar5.f211226e;
            rVar5.getClass();
            int i2 = C72603r.this.f211225d;
            view16.setPadding((int) ((((float) (0 - i2)) * floatValue) + ((float) i2)), 0, 0, 0);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) C72603r.this.f211226e.getLayoutParams();
            C72603r rVar6 = C72603r.this;
            int i3 = rVar6.f211222a;
            int i4 = (int) (((float) i3) * floatValue);
            layoutParams2.leftMargin = i4;
            layoutParams2.rightMargin = i4;
            layoutParams2.width = ((int) rVar6.f211236o[2][0]) + ((i3 - i4) * 2);
            rVar6.f211226e.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.r$g */
    public class C72610g implements ValueAnimator.AnimatorUpdateListener {
        public C72610g() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            Float valueOf = Float.valueOf(1.0f);
            if (((double) Math.abs(floatValue - 1.0f)) <= 0.001d) {
                C72603r rVar = C72603r.this;
                rVar.f211226e.setX(rVar.f211236o[1][0]);
                C72603r rVar2 = C72603r.this;
                rVar2.f211226e.setY(rVar2.f211236o[0][0]);
                C72603r rVar3 = C72603r.this;
                rVar3.f211227f.setY(rVar3.f211237p[0]);
                C72603r.this.getClass();
                C72603r.this.f211226e.setPadding(0, 0, 0, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) C72603r.this.f211226e.getLayoutParams();
                C72603r rVar4 = C72603r.this;
                int i = rVar4.f211222a;
                layoutParams.leftMargin = i;
                layoutParams.rightMargin = i;
                layoutParams.width = (int) rVar4.f211236o[2][0];
                rVar4.f211226e.setLayoutParams(layoutParams);
                View view = C72603r.this.f211226e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(valueOf);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$7", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$7", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                View view3 = C72603r.this.f211227f;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(valueOf);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$7", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$7", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                return;
            }
            View view5 = C72603r.this.f211227f;
            float f = 1.0f - floatValue;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(Float.valueOf(f));
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$7", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$7", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            View view7 = C72603r.this.f211226e;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(Float.valueOf(f));
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$7", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view7.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/webview/ui/tools/fts/SosAnimatorBaseController$7", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.r$h */
    public interface C72611h {
        void onAnimationEnd();

        void onAnimationStart();
    }

    public C72603r(Context context, View view, View view2, View view3, View view4, View view5, View view6, View view7, View view8, View view9, View view10) {
        this.f211222a = C76577a.m92151b(context, 20);
        C76577a.m92151b(context, 14);
        this.f211223b = C76577a.m92151b(context, 16);
        this.f211236o = (float[][]) Array.newInstance(Float.TYPE, new int[]{3, 2});
        this.f211237p = new float[2];
        this.f211226e = view;
        this.f211227f = view2;
        this.f211228g = view3;
        this.f211229h = view4;
        this.f211230i = view5;
        this.f211231j = view6;
        this.f211232k = view7;
        this.f211233l = view8;
        this.f211234m = view9;
        this.f211235n = view10;
        this.f211225d = this.f211222a * 2;
        view.postDelayed(new C72604a(view), 100);
        this.f211227f.postDelayed(new C72605b(view2, view), 150);
        this.f211232k.post(new C72606c(view7));
        this.f211241t = FTSEditTextView.getSearchInputType();
    }
}
