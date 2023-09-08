package com.tencent.p014mm.plugin.multitalk.p078ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.multitalk.model.C105853x;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import v82.C111418b0;
import v82.C111450g;
import v82.C111455j;
import v82.C111468k;
import v82.C111471l;
import v82.C14415h;

/* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.CollapseView */
public class CollapseView extends LinearLayout {

    /* renamed from: d */
    public Context f314958d;

    /* renamed from: e */
    public long f314959e = 200;

    /* renamed from: f */
    public ImageView f314960f;

    /* renamed from: g */
    public RelativeLayout f314961g;

    /* renamed from: h */
    public RelativeLayout f314962h;

    /* renamed from: i */
    public RelativeLayout f314963i;

    /* renamed from: j */
    public TextView f314964j;

    /* renamed from: n */
    public ImageView f314965n;

    /* renamed from: o */
    public View f314966o;

    /* renamed from: p */
    public View f314967p;

    /* renamed from: q */
    public float f314968q = 0.7f;

    /* renamed from: r */
    public String f314969r;

    /* renamed from: s */
    public ImageButton f314970s;

    /* renamed from: t */
    public float f314971t;

    /* renamed from: u */
    public boolean f314972u = false;

    /* renamed from: v */
    public boolean f314973v = false;

    /* renamed from: w */
    public boolean f314974w = false;

    /* renamed from: x */
    public float f314975x = 0.0f;

    /* renamed from: y */
    public boolean f314976y = true;

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.CollapseView$b */
    public class C69858b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C69859c f201552d;

        public C69858b(C69859c cVar) {
            this.f201552d = cVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (CollapseView.this.findViewById(C0966R.C0970id.has) != null) {
                this.f201552d.mo96156a();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.CollapseView$c */
    public interface C69859c {
        /* renamed from: a */
        void mo96156a();
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.CollapseView$a */
    public class C105886a extends Animation {

        /* renamed from: d */
        public final /* synthetic */ View f314977d;

        /* renamed from: e */
        public final /* synthetic */ int f314978e;

        public C105886a(View view, int i) {
            this.f314977d = view;
            this.f314978e = i;
        }

        public void applyTransformation(float f, Transformation transformation) {
            View view;
            float f2 = 1.0f;
            if (f == 1.0f) {
                View view2 = this.f314977d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$7", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$7", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                CollapseView.this.getClass();
            } else {
                CollapseView collapseView = CollapseView.this;
                if (f >= collapseView.f314968q && (view = collapseView.f314966o) != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(4);
                    View view4 = view;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$7", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$7", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View view5 = CollapseView.this.f314966o;
                if (view5 != null) {
                    float f3 = 1.0f - f;
                    if (((double) f3) * 2.5d < 1.0d) {
                        f2 = 2.5f * f3;
                    }
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(Float.valueOf(f2));
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$7", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view5.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView$7", "applyTransformation", "(FLandroid/view/animation/Transformation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
                ((LinearLayout.LayoutParams) this.f314977d.getLayoutParams()).topMargin = (int) (((float) C111418b0.f333549j) * f);
                ((LinearLayout.LayoutParams) this.f314977d.getLayoutParams()).bottomMargin = (int) (((float) C111418b0.f333544e) * f);
                ViewGroup.LayoutParams layoutParams = this.f314977d.getLayoutParams();
                int i = this.f314978e;
                layoutParams.height = i - ((int) (((float) i) * f));
            }
            this.f314977d.requestLayout();
        }

        public boolean willChangeBounds() {
            return true;
        }
    }

    public CollapseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f314958d = context;
        LayoutInflater.from(context).inflate(C0966R.C0971layout.bhf, this);
        this.f314964j = (TextView) findViewById(C0966R.C0970id.f359525ld0);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.f356907for);
        this.f314965n = imageView;
        imageView.setImageDrawable(C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_filled_arrow, -1));
        this.f314963i = (RelativeLayout) findViewById(C0966R.C0970id.brc);
        this.f314962h = (RelativeLayout) findViewById(C0966R.C0970id.ete);
        ImageView imageView2 = (ImageView) findViewById(C0966R.C0970id.f358770gz3);
        this.f314960f = imageView2;
        imageView2.setBackground(C74933u4.m89768e(context, C0966R.raw.icons_filled_arrow, -1));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C0966R.C0970id.gzb);
        this.f314961g = relativeLayout;
        int i = C111418b0.f333550k;
        View view = (View) relativeLayout.getParent();
        view.post(new C14415h(relativeLayout, i, view));
        this.f314961g.setOnClickListener(new C111450g(this));
        this.f314960f.setRotation(270.0f);
        this.f314963i.setVisibility(4);
    }

    /* renamed from: a */
    public final void mo150907a(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(C85875k4.m106184h(this.f314958d).x, 1073741824), View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
        int measuredHeight = view.getMeasuredHeight();
        View view2 = this.f314966o;
        if (view2 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "collapse", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "collapse", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C105886a aVar2 = new C105886a(view, measuredHeight);
        aVar2.setDuration(this.f314959e);
        view.startAnimation(aVar2);
    }

    /* renamed from: b */
    public void mo150908b(View view) {
        int i = C111418b0.f333554o;
        int i2 = C111418b0.f333550k;
        int i3 = i2 + ((int) (((float) (i - i2)) * this.f314975x));
        view.getLayoutParams().height = i3;
        view.getLayoutParams().width = i3;
        int i4 = C111418b0.f333546g;
        ((RelativeLayout.LayoutParams) view.getLayoutParams()).bottomMargin = ((int) (((float) (C111418b0.f333547h - i4)) * this.f314975x)) + i4;
        ((RelativeLayout.LayoutParams) view.getLayoutParams()).topMargin = (int) (((float) i4) * (1.0f - this.f314975x));
        view.requestLayout();
        this.f314970s.setTag(Boolean.valueOf(i3 != i));
    }

    /* renamed from: c */
    public final void mo150909c(View view, float f) {
        View view2 = view;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = this.f314966o;
        if (view3 != null) {
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(4);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        view2.measure(View.MeasureSpec.makeMeasureSpec(C85875k4.m106184h(this.f314958d).x, 1073741824), View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
        int measuredHeight = view.getMeasuredHeight();
        float f2 = ((float) view.getLayoutParams().height) + f;
        float f3 = (float) measuredHeight;
        if (f2 >= f3) {
            f2 = f3;
        } else if (f2 <= 0.0f) {
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f2 = 0.0f;
        }
        float f4 = f2 / f3;
        this.f314975x = f4;
        if (f4 >= this.f314968q) {
            View view5 = this.f314966o;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view7 = this.f314966o;
            float f5 = this.f314975x;
            float f6 = this.f314968q;
            float f7 = (((double) (f5 - f6)) + 0.1d) * 2.5d >= 1.0d ? 1.0f : ((f5 - f6) + 0.1f) * 2.5f;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(Float.valueOf(f7));
            View view8 = view7;
            C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view7.setAlpha(((Float) aVar5.mo10231a(0)).floatValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        ((LinearLayout.LayoutParams) view.getLayoutParams()).topMargin = (int) (this.f314975x * ((float) C111418b0.f333549j));
        ((LinearLayout.LayoutParams) view.getLayoutParams()).bottomMargin = (int) (this.f314975x * ((float) C111418b0.f333544e));
        view.getLayoutParams().height = (int) f2;
        view.requestLayout();
    }

    /* renamed from: d */
    public void mo150910d(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                float f = this.f314975x;
                float f2 = this.f314968q;
                if (f > f2 && f < 1.0f) {
                    this.f314973v = true;
                    this.f314974w = false;
                } else if (f < 1.0f - f2 && f > 0.0f) {
                    this.f314973v = false;
                    this.f314974w = true;
                } else if (!(f == 0.0f || f == 1.0f)) {
                    this.f314973v = !this.f314973v;
                    this.f314974w = !this.f314974w;
                }
                if (this.f314973v && this.f314972u) {
                    this.f314973v = false;
                    mo150909c(this.f314963i, 9999.0f);
                    mo150908b(this.f314970s);
                    mo150914h();
                } else if (this.f314974w && this.f314972u) {
                    this.f314974w = false;
                    mo150909c(this.f314963i, -9999.0f);
                    mo150908b(this.f314970s);
                    mo150914h();
                }
                this.f314972u = false;
            } else if (action == 2) {
                float rawY = motionEvent.getRawY() - this.f314971t;
                if (this.f314972u || Math.abs(rawY) >= 5.0f) {
                    this.f314971t = motionEvent.getRawY();
                    if (Math.abs(rawY) > 1.0f) {
                        mo150909c(this.f314963i, -rawY);
                        mo150908b(this.f314970s);
                        mo150914h();
                        if (rawY > 0.0f) {
                            this.f314972u = true;
                            this.f314974w = true;
                            this.f314973v = false;
                        } else if (rawY < 0.0f) {
                            this.f314972u = true;
                            this.f314973v = true;
                            this.f314974w = false;
                        }
                    }
                }
            }
        } else if (!this.f314972u) {
            this.f314971t = motionEvent.getRawY();
        }
    }

    /* renamed from: e */
    public void mo150911e() {
        if (this.f314970s.getTag() == null || this.f314970s.getTag().equals(Boolean.TRUE)) {
            mo150912f();
        }
        if (this.f314960f.getTag() == null || this.f314960f.getTag().equals(Boolean.TRUE)) {
            mo150913g();
        }
    }

    /* renamed from: f */
    public final void mo150912f() {
        ImageButton imageButton = this.f314970s;
        if (imageButton != null) {
            if (imageButton.getTag() != null) {
                Object tag = this.f314970s.getTag();
                Boolean bool = Boolean.TRUE;
                if (!tag.equals(bool)) {
                    this.f314970s.setTag(bool);
                    ImageButton imageButton2 = this.f314970s;
                    C111468k kVar = new C111468k(this, imageButton2, C111418b0.f333554o - C111418b0.f333550k);
                    kVar.setDuration(this.f314959e);
                    imageButton2.startAnimation(kVar);
                    return;
                }
            }
            this.f314970s.setTag(Boolean.FALSE);
            ImageButton imageButton3 = this.f314970s;
            int i = C111418b0.f333554o;
            imageButton3.measure(i, i);
            C111455j jVar = new C111455j(this, imageButton3, i - C111418b0.f333550k);
            jVar.setDuration(this.f314959e);
            imageButton3.startAnimation(jVar);
        }
    }

    /* renamed from: g */
    public void mo150913g() {
        int i;
        if (this.f314960f.getTag() != null) {
            Object tag = this.f314960f.getTag();
            Boolean bool = Boolean.TRUE;
            if (!tag.equals(bool)) {
                i = 270;
                this.f314960f.setTag(bool);
                mo150907a(this.f314963i);
                String str = this.f314969r;
                if (str != null) {
                    C105853x.m142237h(2, str, 2);
                }
                C115669n.INSTANCE.idkeyStat(220, 31, 1, false);
                this.f314960f.animate().setDuration(this.f314959e).rotation((float) i);
            }
        }
        this.f314960f.setTag(Boolean.FALSE);
        i = 90;
        RelativeLayout relativeLayout = this.f314963i;
        relativeLayout.measure(View.MeasureSpec.makeMeasureSpec(C85875k4.m106184h(this.f314958d).x, 1073741824), View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
        int measuredHeight = relativeLayout.getMeasuredHeight();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(relativeLayout, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expand", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        relativeLayout.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(relativeLayout, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expand", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view = this.f314966o;
        if (view != null) {
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(4);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expand", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expand", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C111471l lVar = new C111471l(this, relativeLayout, measuredHeight);
        lVar.setDuration(this.f314959e);
        relativeLayout.startAnimation(lVar);
        String str2 = this.f314969r;
        if (str2 != null) {
            C105853x.m142237h(2, str2, 1);
        }
        C115669n.INSTANCE.idkeyStat(220, 30, 1, false);
        this.f314960f.animate().setDuration(this.f314959e).rotation((float) i);
    }

    /* renamed from: h */
    public void mo150914h() {
        this.f314960f.setRotation((float) ((int) (((float) 270) + (this.f314975x * 180.0f))));
        this.f314960f.setTag(Boolean.valueOf(this.f314975x == 0.0f));
        this.f314960f.requestLayout();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mo150910d(motionEvent);
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Log.m105918d("MicroMsg.CollapseView", "event: " + motionEvent.getAction());
        mo150910d(motionEvent);
        return true;
    }

    public void setLinkToAutoMobileListener(C69859c cVar) {
        if (findViewById(C0966R.C0970id.has) != null) {
            findViewById(C0966R.C0970id.has).setOnClickListener(new C69858b(cVar));
        }
    }

    public void setRoomKey(String str) {
        this.f314969r = str;
    }
}
