package com.tencent.p014mm.plugin.sns.p106ui.previewimageview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96148b;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import zu2.C103095c;
import zu2.C103098f;
import zu2.C103099g;
import zu2.C103100h;
import zu2.C103101i;
import zu2.C103104l;

/* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView */
public class DynamicGridView extends WrappingGridView {

    /* renamed from: x0 */
    public static final /* synthetic */ int f280798x0 = 0;

    /* renamed from: A */
    public boolean f280799A = false;

    /* renamed from: B */
    public List<ObjectAnimator> f280800B = new LinkedList();

    /* renamed from: C */
    public boolean f280801C;

    /* renamed from: D */
    public boolean f280802D;

    /* renamed from: E */
    public boolean f280803E = true;

    /* renamed from: F */
    public boolean f280804F = true;

    /* renamed from: G */
    public AbsListView.OnScrollListener f280805G;

    /* renamed from: H */
    public C96139h f280806H;

    /* renamed from: I */
    public C96138g f280807I;

    /* renamed from: J */
    public AdapterView.OnItemClickListener f280808J;

    /* renamed from: K */
    public AdapterView.OnItemClickListener f280809K = new C96132b();

    /* renamed from: L */
    public boolean f280810L;

    /* renamed from: M */
    public Stack<C96134d> f280811M;

    /* renamed from: N */
    public C96134d f280812N;

    /* renamed from: P */
    public View f280813P;

    /* renamed from: Q */
    public boolean f280814Q = false;

    /* renamed from: R */
    public C96137f f280815R = new C96137f((C96132b) null);

    /* renamed from: S */
    public int f280816S = -1;

    /* renamed from: T */
    public float f280817T;

    /* renamed from: U */
    public float f280818U;

    /* renamed from: V */
    public float f280819V = 0.0f;

    /* renamed from: W */
    public float f280820W = 0.0f;

    /* renamed from: d */
    public BitmapDrawable f280821d;

    /* renamed from: e */
    public Rect f280822e;

    /* renamed from: f */
    public Rect f280823f;

    /* renamed from: g */
    public Rect f280824g;

    /* renamed from: h */
    public Rect f280825h;

    /* renamed from: i */
    public int f280826i = 0;

    /* renamed from: j */
    public int f280827j = 0;

    /* renamed from: n */
    public float f280828n = 0.0f;

    /* renamed from: o */
    public float f280829o = 0.0f;

    /* renamed from: p */
    public int f280830p = -1;

    /* renamed from: p0 */
    public AbsListView.OnScrollListener f280831p0 = new C96131a();

    /* renamed from: q */
    public int f280832q = -1;

    /* renamed from: r */
    public int f280833r = -1;

    /* renamed from: s */
    public int f280834s = -1;

    /* renamed from: t */
    public int f280835t;

    /* renamed from: u */
    public List<Long> f280836u = new ArrayList();

    /* renamed from: v */
    public long f280837v = -1;

    /* renamed from: w */
    public boolean f280838w = false;

    /* renamed from: x */
    public int f280839x = -1;

    /* renamed from: y */
    public boolean f280840y;

    /* renamed from: z */
    public int f280841z = 0;

    /* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$a */
    public class C96131a implements AbsListView.OnScrollListener {

        /* renamed from: d */
        public int f280842d = -1;

        /* renamed from: e */
        public int f280843e = -1;

        /* renamed from: f */
        public int f280844f;

        /* renamed from: g */
        public int f280845g;

        /* renamed from: h */
        public int f280846h;

        public C96131a() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            Boolean bool;
            AbsListView absListView2 = absListView;
            int i4 = i;
            int i5 = i2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView2);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$10", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
            this.f280844f = i4;
            this.f280845g = i5;
            int i6 = this.f280842d;
            if (i6 == -1) {
                i6 = i4;
            }
            this.f280842d = i6;
            int i7 = this.f280843e;
            if (i7 == -1) {
                i7 = i5;
            }
            this.f280843e = i7;
            SnsMethodCalculate.markStartTimeMs("checkAndHandleFirstVisibleCellChange", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
            if (this.f280844f != this.f280842d) {
                DynamicGridView dynamicGridView = DynamicGridView.this;
                int i8 = DynamicGridView.f280798x0;
                SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                boolean z = dynamicGridView.f280838w;
                SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                if (z && DynamicGridView.m123186b(DynamicGridView.this) != -1) {
                    DynamicGridView dynamicGridView2 = DynamicGridView.this;
                    long b = DynamicGridView.m123186b(dynamicGridView2);
                    SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    dynamicGridView2.mo133706C(b);
                    SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    DynamicGridView dynamicGridView3 = DynamicGridView.this;
                    SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    dynamicGridView3.mo133717p();
                    SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                }
            }
            SnsMethodCalculate.markEndTimeMs("checkAndHandleFirstVisibleCellChange", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
            SnsMethodCalculate.markStartTimeMs("checkAndHandleLastVisibleCellChange", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
            if (this.f280844f + this.f280845g != this.f280842d + this.f280843e) {
                DynamicGridView dynamicGridView4 = DynamicGridView.this;
                int i9 = DynamicGridView.f280798x0;
                SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                boolean z2 = dynamicGridView4.f280838w;
                SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                if (z2 && DynamicGridView.m123186b(DynamicGridView.this) != -1) {
                    DynamicGridView dynamicGridView5 = DynamicGridView.this;
                    long b2 = DynamicGridView.m123186b(dynamicGridView5);
                    SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    dynamicGridView5.mo133706C(b2);
                    SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    DynamicGridView dynamicGridView6 = DynamicGridView.this;
                    SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    dynamicGridView6.mo133717p();
                    SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                }
            }
            SnsMethodCalculate.markEndTimeMs("checkAndHandleLastVisibleCellChange", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
            this.f280842d = this.f280844f;
            this.f280843e = this.f280845g;
            DynamicGridView dynamicGridView7 = DynamicGridView.this;
            int i15 = DynamicGridView.f280798x0;
            SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            dynamicGridView7.mo133720s();
            SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            DynamicGridView dynamicGridView8 = DynamicGridView.this;
            SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            boolean z3 = dynamicGridView8.f280803E;
            SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            if (z3) {
                SnsMethodCalculate.markStartTimeMs("updateWobbleState", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
                for (int i16 = 0; i16 < i5; i16++) {
                    View childAt = DynamicGridView.this.getChildAt(i16);
                    if (childAt != null) {
                        if (DynamicGridView.m123186b(DynamicGridView.this) == -1 || (bool = Boolean.TRUE) == childAt.getTag(C0966R.C0970id.c4q)) {
                            if (DynamicGridView.m123186b(DynamicGridView.this) == -1 && childAt.getRotation() != 0.0f) {
                                childAt.setRotation(0.0f);
                                childAt.setTag(C0966R.C0970id.c4q, Boolean.FALSE);
                            }
                        } else {
                            if (i16 % 2 == 0) {
                                DynamicGridView dynamicGridView9 = DynamicGridView.this;
                                SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                dynamicGridView9.mo133708i(childAt);
                                SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                            } else {
                                DynamicGridView dynamicGridView10 = DynamicGridView.this;
                                SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                dynamicGridView10.mo133709j(childAt);
                                SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                            }
                            childAt.setTag(C0966R.C0970id.c4q, bool);
                        }
                    }
                }
                SnsMethodCalculate.markEndTimeMs("updateWobbleState", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
            }
            if (DynamicGridView.m123188e(DynamicGridView.this) != null) {
                DynamicGridView.m123188e(DynamicGridView.this).onScroll(absListView2, i4, i5, i3);
            }
            SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$10", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$10", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
            this.f280846h = i;
            DynamicGridView dynamicGridView = DynamicGridView.this;
            int i2 = DynamicGridView.f280798x0;
            SnsMethodCalculate.markStartTimeMs("access$2202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            dynamicGridView.getClass();
            SnsMethodCalculate.markEndTimeMs("access$2202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            SnsMethodCalculate.markStartTimeMs("isScrollCompleted", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
            if (this.f280845g > 0 && this.f280846h == 0) {
                DynamicGridView dynamicGridView2 = DynamicGridView.this;
                SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                boolean z = dynamicGridView2.f280838w;
                SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                if (z) {
                    DynamicGridView dynamicGridView3 = DynamicGridView.this;
                    SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    boolean z2 = dynamicGridView3.f280840y;
                    SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    if (z2) {
                        DynamicGridView dynamicGridView4 = DynamicGridView.this;
                        SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                        dynamicGridView4.mo133718q();
                        SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    }
                }
                DynamicGridView dynamicGridView5 = DynamicGridView.this;
                SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                dynamicGridView5.getClass();
                SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            }
            SnsMethodCalculate.markEndTimeMs("isScrollCompleted", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
            if (DynamicGridView.m123188e(DynamicGridView.this) != null) {
                DynamicGridView.m123188e(DynamicGridView.this).onScrollStateChanged(absListView, i);
            }
            SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$10", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$b */
    public class C96132b implements AdapterView.OnItemClickListener {
        public C96132b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            AdapterView<?> adapterView2 = adapterView;
            arrayList.add(adapterView);
            View view2 = view;
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$1");
            DynamicGridView dynamicGridView = DynamicGridView.this;
            dynamicGridView.getClass();
            SnsMethodCalculate.markStartTimeMs("isEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            boolean z = dynamicGridView.f280799A;
            SnsMethodCalculate.markEndTimeMs("isEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            if (!z && DynamicGridView.this.isEnabled()) {
                DynamicGridView dynamicGridView2 = DynamicGridView.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                AdapterView.OnItemClickListener onItemClickListener = dynamicGridView2.f280808J;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                if (onItemClickListener != null) {
                    DynamicGridView dynamicGridView3 = DynamicGridView.this;
                    SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    AdapterView.OnItemClickListener onItemClickListener2 = dynamicGridView3.f280808J;
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    onItemClickListener2.onItemClick(adapterView, view, i, j);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$c */
    public class C96133c extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ View f280849d;

        public C96133c(DynamicGridView dynamicGridView, View view) {
            this.f280849d = view;
        }

        public void onAnimationEnd(Animator animator) {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$2");
            this.f280849d.setLayerType(0, (Paint) null);
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$d */
    public static class C96134d {

        /* renamed from: a */
        public List<Pair<Integer, Integer>> f280850a = new Stack();

        /* renamed from: a */
        public void mo133742a(int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("addTransition", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$DynamicGridModification");
            this.f280850a.add(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
            SnsMethodCalculate.markEndTimeMs("addTransition", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$DynamicGridModification");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$e */
    public class C96135e {

        /* renamed from: a */
        public int f280851a;

        /* renamed from: b */
        public int f280852b;

        /* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$e$a */
        public class C96136a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: d */
            public final int f280854d;

            /* renamed from: e */
            public final int f280855e;

            static {
                Class<DynamicGridView> cls = DynamicGridView.class;
            }

            public C96136a(int i, int i2) {
                this.f280854d = i;
                this.f280855e = i2;
            }

            public boolean onPreDraw() {
                SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener");
                DynamicGridView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                C96135e eVar = C96135e.this;
                DynamicGridView dynamicGridView = DynamicGridView.this;
                SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator");
                int i = eVar.f280851a;
                SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator");
                int i2 = DynamicGridView.f280798x0;
                SnsMethodCalculate.markStartTimeMs("access$712", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                dynamicGridView.f280826i += i;
                SnsMethodCalculate.markEndTimeMs("access$712", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                C96135e eVar2 = C96135e.this;
                DynamicGridView dynamicGridView2 = DynamicGridView.this;
                SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator");
                int i3 = eVar2.f280852b;
                SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator");
                SnsMethodCalculate.markStartTimeMs("access$812", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                dynamicGridView2.f280827j += i3;
                SnsMethodCalculate.markEndTimeMs("access$812", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                DynamicGridView.m123187c(DynamicGridView.this, this.f280854d, this.f280855e);
                StringBuilder sb = new StringBuilder();
                sb.append("id ");
                DynamicGridView dynamicGridView3 = DynamicGridView.this;
                sb.append(dynamicGridView3.mo133713n(DynamicGridView.m123186b(dynamicGridView3)));
                Log.m105924i("DynamicGridView", sb.toString());
                if (DynamicGridView.m123191h(DynamicGridView.this) == null) {
                    SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener");
                    return true;
                } else if (DynamicGridView.m123191h(DynamicGridView.this) == null) {
                    SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener");
                    return true;
                } else {
                    View h = DynamicGridView.m123191h(DynamicGridView.this);
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view = h;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener", "onPreDraw", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    h.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener", "onPreDraw", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    DynamicGridView dynamicGridView4 = DynamicGridView.this;
                    View o = dynamicGridView4.mo133714o(DynamicGridView.m123186b(dynamicGridView4));
                    SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    dynamicGridView4.f280813P = o;
                    SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    if (DynamicGridView.m123191h(DynamicGridView.this) == null) {
                        SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener");
                        return true;
                    }
                    View h2 = DynamicGridView.m123191h(DynamicGridView.this);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(4);
                    View view2 = h2;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener", "onPreDraw", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    h2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener", "onPreDraw", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator$AnimateSwitchViewOnPreDrawListener");
                    return true;
                }
            }
        }

        public C96135e(int i, int i2) {
            this.f280852b = i;
            this.f280851a = i2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$f */
    public class C96137f extends Handler {
        public C96137f(C96132b bVar) {
        }

        public void handleMessage(Message message) {
            SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$MyHandler");
            if (message.what == 1) {
                DynamicGridView dynamicGridView = DynamicGridView.this;
                dynamicGridView.getClass();
                SnsMethodCalculate.markStartTimeMs("detectedLongPress", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                View childAt = dynamicGridView.getChildAt(dynamicGridView.f280816S);
                Log.m105925i("DynamicGridView", "detectedLongPress downPos:%d, lastTouchX:%f, lastTouchY:%f, downX:%d, downY:%d, mTotalOffsetRawX:%f, mTotalOffsetRawY:%f", Integer.valueOf(dynamicGridView.f280816S), Float.valueOf(dynamicGridView.f280817T), Float.valueOf(dynamicGridView.f280818U), Integer.valueOf(dynamicGridView.f280830p), Integer.valueOf(dynamicGridView.f280832q), Float.valueOf(dynamicGridView.f280828n), Float.valueOf(dynamicGridView.f280829o));
                if (dynamicGridView.f280801C || dynamicGridView.f280802D || !C103098f.m136375a(childAt, dynamicGridView.f280817T, dynamicGridView.f280818U) || Math.abs(dynamicGridView.f280817T - ((float) dynamicGridView.f280830p)) >= 50.0f || Math.abs(dynamicGridView.f280818U - ((float) dynamicGridView.f280832q)) >= 50.0f) {
                    Log.m105924i("DynamicGridView", "touch outside");
                } else {
                    int i = dynamicGridView.f280816S;
                    SnsMethodCalculate.markStartTimeMs("startEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    if (!dynamicGridView.f280804F) {
                        SnsMethodCalculate.markEndTimeMs("startEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    } else {
                        Log.m105924i("DynamicGridView", "startEditMode: ");
                        dynamicGridView.requestDisallowInterceptTouchEvent(true);
                        dynamicGridView.mo133720s();
                        if (dynamicGridView.f280803E) {
                            dynamicGridView.mo133736y();
                        }
                        if (i != -1) {
                            boolean x = dynamicGridView.mo133735x(i);
                            dynamicGridView.f280799A = x;
                            if (x) {
                                dynamicGridView.f280838w = true;
                            }
                        }
                        dynamicGridView.getClass();
                        SnsMethodCalculate.markEndTimeMs("startEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("detectedLongPress", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            }
            SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$MyHandler");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$g */
    public interface C96138g {
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$h */
    public interface C96139h {
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$i */
    public interface C96140i {
        /* renamed from: a */
        void mo133745a(boolean z);
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$j */
    public interface C96141j {
        /* renamed from: a */
        void mo133746a(View view, int i, long j);

        /* renamed from: b */
        void mo133747b(View view, int i, long j);
    }

    public DynamicGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo133719r(context);
    }

    /* renamed from: b */
    public static /* synthetic */ long m123186b(DynamicGridView dynamicGridView) {
        SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        long j = dynamicGridView.f280837v;
        SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return j;
    }

    /* renamed from: c */
    public static void m123187c(DynamicGridView dynamicGridView, int i, int i2) {
        DynamicGridView dynamicGridView2 = dynamicGridView;
        SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        dynamicGridView.getClass();
        SnsMethodCalculate.markStartTimeMs("animateReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        boolean z = i2 > i;
        LinkedList linkedList = new LinkedList();
        if (z) {
            int min = Math.min(i, i2);
            while (min < Math.max(i, i2)) {
                View o = dynamicGridView.mo133714o(dynamicGridView.mo133712m(min));
                int i3 = min + 1;
                if (i3 % dynamicGridView.getColumnCount() == 0) {
                    linkedList.add(dynamicGridView.mo133711l(o, (float) ((-o.getWidth()) * (dynamicGridView.getColumnCount() - 1)), 0.0f, (float) o.getHeight(), 0.0f));
                } else {
                    linkedList.add(dynamicGridView.mo133711l(o, (float) o.getWidth(), 0.0f, 0.0f, 0.0f));
                }
                min = i3;
            }
        } else {
            for (int max = Math.max(i, i2); max > Math.min(i, i2); max--) {
                View o2 = dynamicGridView.mo133714o(dynamicGridView.mo133712m(max));
                if ((dynamicGridView.getColumnCount() + max) % dynamicGridView.getColumnCount() == 0) {
                    linkedList.add(dynamicGridView.mo133711l(o2, (float) (o2.getWidth() * (dynamicGridView.getColumnCount() - 1)), 0.0f, (float) (-o2.getHeight()), 0.0f));
                } else {
                    linkedList.add(dynamicGridView.mo133711l(o2, (float) (-o2.getWidth()), 0.0f, 0.0f, 0.0f));
                }
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(linkedList);
        animatorSet.setDuration(300);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.addListener(new C103104l(dynamicGridView));
        animatorSet.start();
        SnsMethodCalculate.markEndTimeMs("animateReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    /* renamed from: e */
    public static /* synthetic */ AbsListView.OnScrollListener m123188e(DynamicGridView dynamicGridView) {
        SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        AbsListView.OnScrollListener onScrollListener = dynamicGridView.f280805G;
        SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return onScrollListener;
    }

    /* renamed from: f */
    public static /* synthetic */ boolean m123189f(DynamicGridView dynamicGridView, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        dynamicGridView.f280801C = z;
        SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return z;
    }

    /* renamed from: g */
    public static void m123190g(DynamicGridView dynamicGridView) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        dynamicGridView.getClass();
        SnsMethodCalculate.markStartTimeMs("updateEnableState", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        dynamicGridView.setEnabled(!dynamicGridView.f280801C && !dynamicGridView.f280802D);
        SnsMethodCalculate.markEndTimeMs("updateEnableState", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    private C103095c getAdapterInterface() {
        SnsMethodCalculate.markStartTimeMs("getAdapterInterface", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        C103095c cVar = (C103095c) getAdapter();
        SnsMethodCalculate.markEndTimeMs("getAdapterInterface", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return cVar;
    }

    private int getColumnCount() {
        SnsMethodCalculate.markStartTimeMs("getColumnCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        int columnCount = getAdapterInterface().getColumnCount();
        SnsMethodCalculate.markEndTimeMs("getColumnCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return columnCount;
    }

    /* renamed from: h */
    public static /* synthetic */ View m123191h(DynamicGridView dynamicGridView) {
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        View view = dynamicGridView.f280813P;
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return view;
    }

    /* renamed from: t */
    public static boolean m123192t() {
        SnsMethodCalculate.markStartTimeMs("isPreLollipop", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        SnsMethodCalculate.markEndTimeMs("isPreLollipop", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return false;
    }

    /* renamed from: A */
    public final void mo133704A() {
        SnsMethodCalculate.markStartTimeMs("touchEventsCancelled", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        Log.m105918d("DynamicGridView", "touchEventsCancelled ");
        View o = mo133714o(this.f280837v);
        if (o == null) {
            Log.m105919d("DynamicGridView", "touchEventsCancelled mobileView null, MobileItemId: %d", Long.valueOf(this.f280837v));
            SnsMethodCalculate.markEndTimeMs("touchEventsCancelled", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            return;
        }
        if (this.f280838w) {
            mo133734w(o);
        }
        this.f280838w = false;
        this.f280840y = false;
        this.f280839x = -1;
        SnsMethodCalculate.markEndTimeMs("touchEventsCancelled", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0295  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo133705B() {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r2 = "touchEventsEnded"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r4 = "DynamicGridView"
            java.lang.String r0 = "touchEventsEnded: "
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r0)
            com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$f r0 = r1.f280815R
            r0.getClass()
            java.lang.String r5 = "stopDetectLongPress"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$MyHandler"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            r7 = 1
            r0.removeMessages(r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            long r5 = r1.f280837v
            android.view.View r5 = r1.mo133714o(r5)
            r6 = 0
            r1.f280820W = r6
            r1.f280819V = r6
            android.graphics.Rect r0 = r1.f280825h
            if (r0 == 0) goto L_0x0046
            android.graphics.Rect r0 = new android.graphics.Rect
            android.graphics.Rect r9 = r1.f280825h
            r0.<init>(r9)
            float r9 = r1.f280828n
            int r9 = (int) r9
            float r10 = r1.f280829o
            int r10 = (int) r10
            r0.offset(r9, r10)
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$g r9 = r1.f280807I
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1"
            r14 = -1
            if (r9 == 0) goto L_0x021a
            com.tencent.mm.plugin.sns.ui.previewimageview.b$a r9 = (com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96148b.C96149a) r9
            boolean r0 = r9.mo133770a(r0)
            if (r0 == 0) goto L_0x021a
            java.lang.String r9 = "animateDel"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r3)
            long r11 = r1.f280837v
            int r0 = r1.mo133713n(r11)
            if (r0 == r14) goto L_0x01fc
            com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$g r11 = r1.f280807I
            com.tencent.mm.plugin.sns.ui.previewimageview.b$a r11 = (com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96148b.C96149a) r11
            r11.getClass()
            java.lang.String r12 = "onDragDel"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r10)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "drag to del "
            r6.append(r8)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = "DynamicGrid"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
            com.tencent.mm.plugin.sns.ui.previewimageview.b r6 = com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96148b.this
            com.tencent.mm.plugin.sns.ui.previewimageview.a r6 = r6.f280878e
            r6.getClass()
            java.lang.String r8 = "removeItem"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r11)
            java.lang.Object r14 = r6.getItem(r0)
            java.lang.String r13 = "remove"
            java.lang.String r15 = "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r15)
            java.util.ArrayList<java.lang.Object> r7 = r6.f304201g
            r7.remove(r14)
            java.lang.String r7 = "removeStableID"
            r16 = r2
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r2)
            r17 = r5
            java.util.HashMap<java.lang.Object, java.lang.Integer> r5 = r6.f304199e
            r5.remove(r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r2)
            r6.notifyDataSetChanged()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r15)
            com.tencent.mm.plugin.sns.ui.previewimageview.a$b r2 = r6.f280865r
            if (r2 == 0) goto L_0x0147
            int r2 = r6.mo133762l(r0)
            com.tencent.mm.plugin.sns.ui.previewimageview.a$b r5 = r6.f280865r
            com.tencent.mm.plugin.sns.ui.d2$$d r5 = (com.tencent.p014mm.plugin.sns.p106ui.d2$$d) r5
            r5.getClass()
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.PicWidget$2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r6)
            r7 = 1
            java.lang.Object[] r13 = new java.lang.Object[r7]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r14 = 0
            r13[r14] = r7
            java.lang.String r7 = "MicroMsg.PicWidget"
            java.lang.String r14 = "removeItem: pos:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r14, r13)
            com.tencent.mm.plugin.sns.ui.d2 r7 = r5.f279337a
            com.tencent.mm.plugin.sns.ui.d2$$j r7 = r7.f279310c
            r7.getClass()
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ui.PicWidget$MediaObj"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r13)
            java.util.ArrayList<java.lang.String> r14 = r7.f279345a
            int r14 = r14.size()
            if (r14 <= r2) goto L_0x00ff
            java.util.ArrayList<java.lang.String> r7 = r7.f279345a
            r7.remove(r2)
        L_0x00ff:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r13)
            com.tencent.mm.plugin.sns.ui.d2 r2 = r5.f279337a
            com.tencent.mm.ui.MMActivity r2 = r2.f279311d
            boolean r7 = r2 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI
            if (r7 == 0) goto L_0x010f
            com.tencent.mm.plugin.sns.ui.SnsUploadUI r2 = (com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI) r2
            r2.mo133088a8()
        L_0x010f:
            com.tencent.mm.plugin.sns.ui.d2 r2 = r5.f279337a
            com.tencent.mm.ui.MMActivity r2 = r2.f279311d
            android.content.Intent r2 = r2.getIntent()
            com.tencent.mm.plugin.sns.ui.d2 r7 = r5.f279337a
            com.tencent.mm.plugin.sns.ui.d2$$j r7 = r7.f279310c
            java.util.ArrayList r7 = r7.mo133209d()
            java.lang.String r13 = "sns_kemdia_path_list"
            r2.putExtra(r13, r7)
            com.tencent.mm.plugin.sns.ui.d2 r2 = r5.f279337a
            com.tencent.mm.ui.MMActivity r2 = r2.f279311d
            android.content.Intent r2 = r2.getIntent()
            java.lang.String r7 = "sns_kemdia_path"
            java.lang.String r13 = ""
            r2.putExtra(r7, r13)
            com.tencent.mm.plugin.sns.ui.d2 r2 = r5.f279337a
            com.tencent.mm.plugin.sns.ui.b1 r5 = r2.f279312e
            com.tencent.mm.plugin.sns.ui.previewimageview.b r5 = (com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96148b) r5
            com.tencent.mm.plugin.sns.ui.d2$$j r2 = r2.f279310c
            int r2 = r2.mo133208c()
            r5.mo133768g(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r6)
        L_0x0147:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r10)
            android.view.View r2 = r1.f280813P
            if (r2 != 0) goto L_0x0156
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r3)
            goto L_0x0203
        L_0x0156:
            r2 = 2
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 0
            r5[r2] = r0
            long r6 = r1.f280837v
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r2 = 1
            r5[r2] = r0
            java.lang.String r0 = "animateDel: pos:%d, mMobileItemId:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r0, r5)
            android.view.View r0 = r1.f280813P     // Catch:{ NullPointerException -> 0x0175 }
            int r0 = r1.getPositionForView(r0)     // Catch:{ NullPointerException -> 0x0175 }
            goto L_0x018f
        L_0x0175:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "NullPointerException: "
            r2.append(r5)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            r0 = -1
        L_0x018f:
            int r2 = r18.getChildCount()
            r5 = 1
            int r2 = r2 - r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "switch "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r6 = ","
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            r5 = -1
            if (r0 != r5) goto L_0x01b9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r3)
            goto L_0x0203
        L_0x01b9:
            r1.mo133733v(r0, r2)
            boolean r5 = r1.f280810L
            if (r5 == 0) goto L_0x01c5
            com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$d r5 = r1.f280812N
            r5.mo133742a(r0, r2)
        L_0x01c5:
            int r5 = r1.f280833r
            r1.f280832q = r5
            int r5 = r1.f280834s
            r1.f280830p = r5
            r18.mo133720s()
            m123192t()
            m123192t()
            com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$e r5 = new com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$e
            r6 = 0
            r5.<init>(r6, r6)
            long r6 = r1.f280837v
            r1.mo133706C(r6)
            java.lang.String r6 = "animateSwitchCell"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            android.view.ViewTreeObserver r8 = r18.getViewTreeObserver()
            com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$e$a r11 = new com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$e$a
            r11.<init>(r0, r2)
            r8.addOnPreDrawListener(r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r3)
            r0 = 1
            goto L_0x0204
        L_0x01fc:
            r16 = r2
            r17 = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r3)
        L_0x0203:
            r0 = 0
        L_0x0204:
            if (r0 == 0) goto L_0x021e
            r2 = 0
            r1.f280821d = r2
            r18.mo133704A()
            com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$h r0 = r1.f280806H
            if (r0 == 0) goto L_0x0215
            com.tencent.mm.plugin.sns.ui.previewimageview.b$d r0 = (com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96148b.C96152d) r0
            r0.mo133773a()
        L_0x0215:
            r2 = 0
            r1.f280838w = r2
            goto L_0x0291
        L_0x021a:
            r16 = r2
            r17 = r5
        L_0x021e:
            if (r17 == 0) goto L_0x028e
            boolean r0 = r1.f280838w
            if (r0 != 0) goto L_0x0225
            goto L_0x028e
        L_0x0225:
            r2 = 0
            r1.f280838w = r2
            r1.f280840y = r2
            r5 = -1
            r1.f280839x = r5
            android.graphics.Rect r0 = r1.f280822e
            int r5 = r17.getLeft()
            int r6 = r17.getTop()
            int r7 = r17.getRight()
            int r8 = r17.getBottom()
            r0.set(r5, r6, r7, r8)
            r5 = 2
            java.lang.Object[] r0 = new java.lang.Object[r5]
            android.graphics.Rect r5 = r1.f280822e
            r0[r2] = r5
            boolean r2 = r1.f280838w
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r5 = 1
            r0[r5] = r2
            java.lang.String r2 = "animating to %s, CellIsMobile:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r0)
            java.lang.String r0 = "animateBounds"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            zu2.j r2 = new zu2.j
            r2.<init>(r1)
            android.graphics.drawable.BitmapDrawable r4 = r1.f280821d
            java.lang.Object[] r6 = new java.lang.Object[r5]
            android.graphics.Rect r5 = r1.f280822e
            r7 = 0
            r6[r7] = r5
            java.lang.String r5 = "bounds"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofObject(r4, r5, r2, r6)
            zu2.k r4 = new zu2.k
            r4.<init>(r1)
            r2.addUpdateListener(r4)
            com.tencent.mm.plugin.sns.ui.previewimageview.c r4 = new com.tencent.mm.plugin.sns.ui.previewimageview.c
            r5 = r17
            r4.<init>(r1, r5)
            r2.addListener(r4)
            r4 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r4)
            r2.start()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            goto L_0x0291
        L_0x028e:
            r18.mo133704A()
        L_0x0291:
            com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$g r0 = r1.f280807I
            if (r0 == 0) goto L_0x02e6
            com.tencent.mm.plugin.sns.ui.previewimageview.b$a r0 = (com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96148b.C96149a) r0
            java.lang.String r2 = "onDragStopped"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r10)
            com.tencent.mm.plugin.sns.ui.previewimageview.b r4 = com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96148b.this
            java.lang.String r5 = "access$500"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            r4.getClass()
            java.lang.String r7 = "animateHideDelArea"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r6)
            android.view.View r8 = r4.f280882i
            r9 = 2
            float[] r9 = new float[r9]
            r11 = 0
            r12 = 0
            r9[r12] = r11
            int r11 = r8.getHeight()
            float r11 = (float) r11
            r12 = 1
            r9[r12] = r11
            java.lang.String r11 = "translationY"
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r8, r11, r9)
            r11 = 200(0xc8, double:9.9E-322)
            r8.setDuration(r11)
            zu2.e r9 = new zu2.e
            r9.<init>(r4)
            r8.addListener(r9)
            r8.start()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            com.tencent.mm.plugin.sns.ui.previewimageview.b r0 = com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96148b.this
            com.tencent.mm.plugin.sns.ui.previewimageview.a r0 = r0.f280878e
            r0.mo133759i()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r10)
        L_0x02e6:
            r2 = r16
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.previewimageview.DynamicGridView.mo133705B():void");
    }

    /* renamed from: C */
    public final void mo133706C(long j) {
        SnsMethodCalculate.markStartTimeMs("updateNeighborViewsForId", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        Log.m105919d("DynamicGridView", "updateNeighborViewsForId: itemId:%s", Long.valueOf(j));
        ((ArrayList) this.f280836u).clear();
        int n = mo133713n(j);
        for (int firstVisiblePosition = getFirstVisiblePosition(); firstVisiblePosition <= getLastVisiblePosition(); firstVisiblePosition++) {
            if (n != firstVisiblePosition && getAdapterInterface().mo133753d(firstVisiblePosition)) {
                ((ArrayList) this.f280836u).add(Long.valueOf(mo133712m(firstVisiblePosition)));
            }
        }
        SnsMethodCalculate.markEndTimeMs("updateNeighborViewsForId", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void dispatchDraw(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        super.dispatchDraw(canvas);
        BitmapDrawable bitmapDrawable = this.f280821d;
        if (bitmapDrawable != null) {
            bitmapDrawable.draw(canvas);
        }
        SnsMethodCalculate.markEndTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    /* renamed from: i */
    public final void mo133708i(View view) {
        SnsMethodCalculate.markStartTimeMs("animateWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        ObjectAnimator k = mo133710k(view);
        k.setFloatValues(new float[]{-2.0f, 2.0f});
        k.start();
        ((LinkedList) this.f280800B).add(k);
        SnsMethodCalculate.markEndTimeMs("animateWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    /* renamed from: j */
    public final void mo133709j(View view) {
        SnsMethodCalculate.markStartTimeMs("animateWobbleInverse", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        ObjectAnimator k = mo133710k(view);
        k.setFloatValues(new float[]{2.0f, -2.0f});
        k.start();
        ((LinkedList) this.f280800B).add(k);
        SnsMethodCalculate.markEndTimeMs("animateWobbleInverse", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    /* renamed from: k */
    public final ObjectAnimator mo133710k(View view) {
        SnsMethodCalculate.markStartTimeMs("createBaseWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        m123192t();
        view.setLayerType(1, (Paint) null);
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setDuration(180);
        objectAnimator.setRepeatMode(2);
        objectAnimator.setRepeatCount(-1);
        objectAnimator.setPropertyName("rotation");
        objectAnimator.setTarget(view);
        objectAnimator.addListener(new C96133c(this, view));
        SnsMethodCalculate.markEndTimeMs("createBaseWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return objectAnimator;
    }

    /* renamed from: l */
    public final AnimatorSet mo133711l(View view, float f, float f2, float f3, float f4) {
        SnsMethodCalculate.markStartTimeMs("createTranslationAnimations", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{f, f2});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", new float[]{f3, f4});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        SnsMethodCalculate.markEndTimeMs("createTranslationAnimations", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return animatorSet;
    }

    /* renamed from: m */
    public final long mo133712m(int i) {
        SnsMethodCalculate.markStartTimeMs("getId", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        long itemId = getAdapter().getItemId(i);
        SnsMethodCalculate.markEndTimeMs("getId", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return itemId;
    }

    /* renamed from: n */
    public int mo133713n(long j) {
        SnsMethodCalculate.markStartTimeMs("getPositionForID", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        View o = mo133714o(j);
        if (o == null) {
            SnsMethodCalculate.markEndTimeMs("getPositionForID", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            return -1;
        }
        int positionForView = getPositionForView(o);
        SnsMethodCalculate.markEndTimeMs("getPositionForID", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return positionForView;
    }

    /* renamed from: o */
    public View mo133714o(long j) {
        SnsMethodCalculate.markStartTimeMs("getViewForId", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        int firstVisiblePosition = getFirstVisiblePosition();
        ListAdapter adapter = getAdapter();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (adapter.getItemId(firstVisiblePosition + i) == j) {
                SnsMethodCalculate.markEndTimeMs("getViewForId", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                return childAt;
            }
        }
        SnsMethodCalculate.markEndTimeMs("getViewForId", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return null;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        Log.m105924i("DynamicGridView", "onInterceptTouchEvent " + motionEvent.getAction() + " " + onInterceptTouchEvent);
        SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return onInterceptTouchEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C96134d dVar;
        SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        if (this.f280814Q) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            return onTouchEvent;
        }
        int findPointerIndex = motionEvent.findPointerIndex(this.f280839x);
        Log.m105924i("DynamicGridView", "onTouchEvent " + motionEvent.getAction());
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f280817T = motionEvent.getX();
            this.f280818U = motionEvent.getY();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            SnsMethodCalculate.markStartTimeMs("findChildViewPosUnderWithoutTranslation", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
            int childCount = getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    SnsMethodCalculate.markEndTimeMs("findChildViewPosUnderWithoutTranslation", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                    childCount = -1;
                    break;
                } else if (C103098f.m136375a(getChildAt(childCount), x, y)) {
                    SnsMethodCalculate.markEndTimeMs("findChildViewPosUnderWithoutTranslation", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                    break;
                } else {
                    childCount--;
                }
            }
            this.f280816S = childCount;
            Log.m105924i("DynamicGridView", "onTouchEvent " + motionEvent.getAction() + ",downPos " + this.f280816S);
            if (!this.f280801C && this.f280816S >= 0) {
                C96137f fVar = this.f280815R;
                fVar.getClass();
                SnsMethodCalculate.markStartTimeMs("startDetectLongPress", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$MyHandler");
                Log.m105918d("DynamicGridView", "startDetectLongPress: ");
                SnsMethodCalculate.markStartTimeMs("stopDetectLongPress", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$MyHandler");
                fVar.removeMessages(1);
                SnsMethodCalculate.markEndTimeMs("stopDetectLongPress", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$MyHandler");
                fVar.sendEmptyMessageDelayed(1, 300);
                SnsMethodCalculate.markEndTimeMs("startDetectLongPress", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$MyHandler");
            }
            this.f280833r = -1;
            this.f280834s = -1;
            this.f280830p = (int) motionEvent.getX();
            this.f280832q = (int) motionEvent.getY();
            this.f280819V = motionEvent.getRawX();
            this.f280820W = motionEvent.getRawY();
            this.f280839x = motionEvent.getPointerId(0);
            if (this.f280799A && isEnabled()) {
                layoutChildren();
                mo133735x(pointToPosition(this.f280830p, this.f280832q));
            } else if (!isEnabled()) {
                SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                return false;
            }
        } else if (action == 1) {
            mo133705B();
            if (this.f280810L && (dVar = this.f280812N) != null) {
                SnsMethodCalculate.markStartTimeMs("getTransitions", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$DynamicGridModification");
                Collections.reverse(dVar.f280850a);
                List<Pair<Integer, Integer>> list = dVar.f280850a;
                SnsMethodCalculate.markEndTimeMs("getTransitions", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$DynamicGridModification");
                if (!list.isEmpty()) {
                    this.f280811M.push(this.f280812N);
                    this.f280812N = new C96134d();
                }
            }
        } else if (action == 2) {
            this.f280817T = motionEvent.getX();
            this.f280818U = motionEvent.getY();
            Log.m105919d("DynamicGridView", "onTouchEvent: MOVE, CellIsMobile:%b, lastTouchX:%f, lastTouchY:%f", Boolean.valueOf(this.f280838w), Float.valueOf(this.f280817T), Float.valueOf(this.f280818U));
            if (!(!this.f280838w || this.f280839x == -1 || findPointerIndex == -1)) {
                if (this.f280834s == -1 && this.f280833r == -1) {
                    this.f280833r = (int) motionEvent.getY(findPointerIndex);
                    int x2 = (int) motionEvent.getX(findPointerIndex);
                    this.f280834s = x2;
                    this.f280830p = x2;
                    this.f280832q = this.f280833r;
                } else {
                    if (this.f280819V > 0.0f && this.f280820W > 0.0f) {
                        this.f280828n = motionEvent.getRawX() - this.f280819V;
                        this.f280829o = motionEvent.getRawY() - this.f280820W;
                    }
                    this.f280833r = (int) motionEvent.getY(findPointerIndex);
                    int x3 = (int) motionEvent.getX(findPointerIndex);
                    this.f280834s = x3;
                    int i = this.f280833r - this.f280832q;
                    int i2 = x3 - this.f280830p;
                    Rect rect = this.f280822e;
                    Rect rect2 = this.f280824g;
                    rect.offsetTo(rect2.left + i2 + this.f280827j, rect2.top + i + this.f280826i);
                    BitmapDrawable bitmapDrawable = this.f280821d;
                    if (bitmapDrawable != null) {
                        bitmapDrawable.setBounds(this.f280822e);
                    }
                    invalidate();
                    mo133717p();
                    this.f280840y = false;
                    mo133718q();
                    if (this.f280807I != null) {
                        Rect rect3 = new Rect(this.f280825h);
                        rect3.offset((int) this.f280828n, (int) this.f280829o);
                        Log.m105919d("DynamicGridView", "onTouchEvent drag: bitmap setBounds:%s, mLastEventY:%d, lastTouchY:%f, lastDownRawY:%f, RawY:%f, deltaY:%d, mTotalOffsetRawY:%f", rect3, Integer.valueOf(this.f280833r), Float.valueOf(this.f280818U), Float.valueOf(this.f280820W), Float.valueOf(motionEvent.getRawY()), Integer.valueOf(i), Float.valueOf(this.f280829o));
                        C96148b.C96149a aVar = (C96148b.C96149a) this.f280807I;
                        aVar.getClass();
                        SnsMethodCalculate.markStartTimeMs("onDragging", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
                        if (aVar.mo133770a(rect3)) {
                            C96148b bVar = C96148b.this;
                            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                            bVar.getClass();
                            SnsMethodCalculate.markStartTimeMs("highlightDelArea", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                            bVar.f280882i.setBackgroundColor(Color.parseColor("#ce3c39"));
                            bVar.f280883j.setImageResource(C0966R.raw.sns_img_highlight_delete);
                            bVar.f280884n.setText(C0966R.string.jef);
                            SnsMethodCalculate.markEndTimeMs("highlightDelArea", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                        } else {
                            C96148b.m123230c(C96148b.this);
                        }
                        SnsMethodCalculate.markEndTimeMs("onDragging", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
                    }
                    SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    return false;
                }
            }
        } else if (action == 3) {
            mo133704A();
            mo133705B();
        } else if (action == 6 && motionEvent.getPointerId((motionEvent.getAction() & 65280) >> 8) == this.f280839x) {
            mo133705B();
        }
        boolean onTouchEvent2 = super.onTouchEvent(motionEvent);
        SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return onTouchEvent2;
    }

    /* renamed from: p */
    public final void mo133717p() {
        int i;
        String str;
        Iterator it;
        String str2;
        String str3 = "handleCellSwitch";
        SnsMethodCalculate.markStartTimeMs(str3, "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        Log.m105918d("DynamicGridView", "handleCellSwitch: ");
        int i2 = this.f280833r - this.f280832q;
        int i3 = this.f280834s - this.f280830p;
        int centerY = this.f280823f.centerY() + this.f280826i + i2;
        int centerX = this.f280823f.centerX() + this.f280827j + i3;
        View o = mo133714o(this.f280837v);
        this.f280813P = o;
        if (o == null) {
            SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            return;
        }
        View view = null;
        String str4 = "getColumnAndRowForView";
        SnsMethodCalculate.markStartTimeMs(str4, "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        int positionForView = getPositionForView(o);
        int columnCount = getColumnCount();
        Point point = new Point(positionForView % columnCount, positionForView / columnCount);
        SnsMethodCalculate.markEndTimeMs(str4, "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        Iterator it4 = ((ArrayList) this.f280836u).iterator();
        float f = 0.0f;
        float f2 = 0.0f;
        while (it4.hasNext()) {
            View o2 = mo133714o(((Long) it4.next()).longValue());
            if (o2 != null) {
                SnsMethodCalculate.markStartTimeMs(str4, "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                int positionForView2 = getPositionForView(o2);
                int columnCount2 = getColumnCount();
                it = it4;
                int i4 = positionForView2 % columnCount2;
                int i5 = positionForView2 / columnCount2;
                str2 = str3;
                Point point2 = new Point(i4, i5);
                SnsMethodCalculate.markEndTimeMs(str4, "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                SnsMethodCalculate.markStartTimeMs("aboveRight", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                str = str4;
                boolean z = false;
                boolean z2 = point2.y < point.y && point2.x > point.x;
                SnsMethodCalculate.markEndTimeMs("aboveRight", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                if (!z2 || centerY >= o2.getBottom() || centerX <= o2.getLeft()) {
                    SnsMethodCalculate.markStartTimeMs("aboveLeft", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    boolean z3 = point2.y < point.y && point2.x < point.x;
                    SnsMethodCalculate.markEndTimeMs("aboveLeft", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    if (!z3 || centerY >= o2.getBottom() || centerX >= o2.getRight()) {
                        SnsMethodCalculate.markStartTimeMs("belowRight", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                        boolean z4 = point2.y > point.y && point2.x > point.x;
                        SnsMethodCalculate.markEndTimeMs("belowRight", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                        if (!z4 || centerY <= o2.getTop() || centerX <= o2.getLeft()) {
                            SnsMethodCalculate.markStartTimeMs("belowLeft", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                            boolean z5 = point2.y > point.y && point2.x < point.x;
                            SnsMethodCalculate.markEndTimeMs("belowLeft", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                            if (!z5 || centerY <= o2.getTop() || centerX >= o2.getRight()) {
                                SnsMethodCalculate.markStartTimeMs("above", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                boolean z6 = point2.y < point.y && point2.x == point.x;
                                SnsMethodCalculate.markEndTimeMs("above", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                if (!z6 || centerY >= o2.getBottom() - this.f280835t) {
                                    SnsMethodCalculate.markStartTimeMs("below", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                    boolean z7 = point2.y > point.y && point2.x == point.x;
                                    SnsMethodCalculate.markEndTimeMs("below", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                    if (!z7 || centerY <= o2.getTop() + this.f280835t) {
                                        SnsMethodCalculate.markStartTimeMs("right", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                        boolean z8 = point2.y == point.y && point2.x > point.x;
                                        SnsMethodCalculate.markEndTimeMs("right", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                        if (!z8 || centerX <= o2.getLeft() + this.f280835t) {
                                            SnsMethodCalculate.markStartTimeMs("left", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                            if (point2.y == point.y && point2.x < point.x) {
                                                z = true;
                                            }
                                            SnsMethodCalculate.markEndTimeMs("left", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                                            if (!z || centerX >= o2.getRight() - this.f280835t) {
                                                i = centerY;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                SnsMethodCalculate.markStartTimeMs("getViewX", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                SnsMethodCalculate.markEndTimeMs("getViewX", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                View view2 = this.f280813P;
                SnsMethodCalculate.markStartTimeMs("getViewX", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                SnsMethodCalculate.markEndTimeMs("getViewX", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                float abs = Math.abs(((float) Math.abs((o2.getRight() - o2.getLeft()) / 2)) - ((float) Math.abs((view2.getRight() - view2.getLeft()) / 2)));
                SnsMethodCalculate.markStartTimeMs("getViewY", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                SnsMethodCalculate.markEndTimeMs("getViewY", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                i = centerY;
                View view3 = this.f280813P;
                SnsMethodCalculate.markStartTimeMs("getViewY", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                SnsMethodCalculate.markEndTimeMs("getViewY", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
                float abs2 = Math.abs(((float) Math.abs((o2.getBottom() - o2.getTop()) / 2)) - ((float) Math.abs((view3.getBottom() - view3.getTop()) / 2)));
                if (abs >= f && abs2 >= f2) {
                    f = abs;
                    f2 = abs2;
                    view = o2;
                }
            } else {
                str2 = str3;
                i = centerY;
                it = it4;
                str = str4;
            }
            str3 = str2;
            it4 = it;
            str4 = str;
            centerY = i;
        }
        String str5 = str3;
        if (view != null) {
            int positionForView3 = getPositionForView(this.f280813P);
            int positionForView4 = getPositionForView(view);
            Log.m105924i("DynamicGridView", "switch " + positionForView3 + "," + positionForView4);
            C103095c adapterInterface = getAdapterInterface();
            if (positionForView4 == -1 || !adapterInterface.mo133753d(positionForView3) || !adapterInterface.mo133753d(positionForView4)) {
                mo133706C(this.f280837v);
                SnsMethodCalculate.markEndTimeMs(str5, "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                return;
            }
            mo133733v(positionForView3, positionForView4);
            if (this.f280810L) {
                this.f280812N.mo133742a(positionForView3, positionForView4);
            }
            this.f280832q = this.f280833r;
            this.f280830p = this.f280834s;
            mo133720s();
            m123192t();
            m123192t();
            C96135e eVar = new C96135e(i3, i2);
            mo133706C(this.f280837v);
            SnsMethodCalculate.markStartTimeMs("animateSwitchCell", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator");
            getViewTreeObserver().addOnPreDrawListener(new C96135e.C96136a(positionForView3, positionForView4));
            SnsMethodCalculate.markEndTimeMs("animateSwitchCell", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$LSwitchCellAnimator");
        }
        SnsMethodCalculate.markEndTimeMs(str5, "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    /* renamed from: q */
    public final void mo133718q() {
        SnsMethodCalculate.markStartTimeMs("handleMobileCellScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        Rect rect = this.f280822e;
        SnsMethodCalculate.markStartTimeMs("handleMobileCellScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        int computeVerticalScrollOffset = computeVerticalScrollOffset();
        int height = getHeight();
        int computeVerticalScrollExtent = computeVerticalScrollExtent();
        int computeVerticalScrollRange = computeVerticalScrollRange();
        int i = rect.top;
        int height2 = rect.height();
        boolean z = true;
        if (i <= 0 && computeVerticalScrollOffset > 0) {
            smoothScrollBy(-this.f280841z, 0);
            SnsMethodCalculate.markEndTimeMs("handleMobileCellScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        } else if (i + height2 < height || computeVerticalScrollOffset + computeVerticalScrollExtent >= computeVerticalScrollRange) {
            SnsMethodCalculate.markEndTimeMs("handleMobileCellScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            z = false;
        } else {
            smoothScrollBy(this.f280841z, 0);
            SnsMethodCalculate.markEndTimeMs("handleMobileCellScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        }
        this.f280840y = z;
        SnsMethodCalculate.markEndTimeMs("handleMobileCellScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    /* renamed from: r */
    public void mo133719r(Context context) {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        super.setOnScrollListener(this.f280831p0);
        this.f280841z = (int) ((context.getResources().getDisplayMetrics().density * 8.0f) + 0.5f);
        this.f280835t = getResources().getDimensionPixelSize(C0966R.dimen.a1e);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    /* renamed from: s */
    public final boolean mo133720s() {
        SnsMethodCalculate.markStartTimeMs("isPostHoneycomb", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        SnsMethodCalculate.markEndTimeMs("isPostHoneycomb", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return true;
    }

    public /* bridge */ /* synthetic */ void setAdapter(Adapter adapter) {
        SnsMethodCalculate.markStartTimeMs("setAdapter", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        setAdapter((ListAdapter) adapter);
        SnsMethodCalculate.markEndTimeMs("setAdapter", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void setEditModeEnabled(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setEditModeEnabled", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.f280804F = z;
        SnsMethodCalculate.markEndTimeMs("setEditModeEnabled", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void setNeedBanTouch(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setNeedBanTouch", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.f280814Q = z;
        SnsMethodCalculate.markEndTimeMs("setNeedBanTouch", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void setOnDragListener(C96138g gVar) {
        SnsMethodCalculate.markStartTimeMs("setOnDragListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.f280807I = gVar;
        SnsMethodCalculate.markEndTimeMs("setOnDragListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void setOnDropListener(C96139h hVar) {
        SnsMethodCalculate.markStartTimeMs("setOnDropListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.f280806H = hVar;
        SnsMethodCalculate.markEndTimeMs("setOnDropListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void setOnEditModeChangeListener(C96140i iVar) {
        SnsMethodCalculate.markStartTimeMs("setOnEditModeChangeListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        SnsMethodCalculate.markEndTimeMs("setOnEditModeChangeListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        SnsMethodCalculate.markStartTimeMs("setOnItemClickListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.f280808J = onItemClickListener;
        super.setOnItemClickListener(this.f280809K);
        SnsMethodCalculate.markEndTimeMs("setOnItemClickListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        SnsMethodCalculate.markStartTimeMs("setOnScrollListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.f280805G = onScrollListener;
        SnsMethodCalculate.markEndTimeMs("setOnScrollListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void setOnSelectedItemBitmapCreationListener(C96141j jVar) {
        SnsMethodCalculate.markStartTimeMs("setOnSelectedItemBitmapCreationListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        SnsMethodCalculate.markEndTimeMs("setOnSelectedItemBitmapCreationListener", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void setUndoSupportEnabled(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setUndoSupportEnabled", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        if (this.f280810L != z) {
            if (z) {
                this.f280811M = new Stack<>();
            } else {
                this.f280811M = null;
            }
        }
        this.f280810L = z;
        SnsMethodCalculate.markEndTimeMs("setUndoSupportEnabled", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void setWobbleInEditMode(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setWobbleInEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        this.f280803E = z;
        SnsMethodCalculate.markEndTimeMs("setWobbleInEditMode", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    /* renamed from: v */
    public final void mo133733v(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("reorderElements", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        C96138g gVar = this.f280807I;
        if (gVar != null) {
            ((C96148b.C96149a) gVar).getClass();
            SnsMethodCalculate.markStartTimeMs("onDragPositionsChanged", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
            SnsMethodCalculate.markEndTimeMs("onDragPositionsChanged", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
        }
        getAdapterInterface().mo133752b(i, i2);
        SnsMethodCalculate.markEndTimeMs("reorderElements", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    /* renamed from: w */
    public final void mo133734w(View view) {
        SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        Log.m105924i("DynamicGridView", "reseting");
        ((ArrayList) this.f280836u).clear();
        this.f280837v = -1;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView", "reset", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView", "reset", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f280821d = null;
        mo133720s();
        if (this.f280803E) {
            if (this.f280799A) {
                SnsMethodCalculate.markStartTimeMs("restartWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                mo133737z(false);
                mo133736y();
                SnsMethodCalculate.markEndTimeMs("restartWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            } else {
                mo133737z(true);
            }
        }
        for (int i = 0; i < getLastVisiblePosition() - getFirstVisiblePosition(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                C117292a.m165358d(childAt, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView", "reset", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(childAt, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView", "reset", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        invalidate();
        SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    /* renamed from: x */
    public final boolean mo133735x(int i) {
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("startDragAtPosition", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        if (!getAdapterInterface().mo133751a(i2)) {
            SnsMethodCalculate.markEndTimeMs("startDragAtPosition", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            return false;
        }
        this.f280826i = 0;
        this.f280827j = 0;
        this.f280828n = 0.0f;
        this.f280829o = 0.0f;
        View childAt = getChildAt(i2 - getFirstVisiblePosition());
        if (childAt != null) {
            this.f280837v = getAdapter().getItemId(i2);
            Log.m105925i("DynamicGridView", "startDragAtPosition: view pos=%d, mMobileItemId=%s", Integer.valueOf(i), Long.valueOf(this.f280837v));
            SnsMethodCalculate.markStartTimeMs("getAndAddHoverView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            int width = childAt.getWidth();
            int height = childAt.getHeight();
            int top = childAt.getTop();
            int left = childAt.getLeft();
            SnsMethodCalculate.markStartTimeMs("getBitmapFromView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            Bitmap createBitmap = Bitmap.createBitmap(childAt.getWidth(), childAt.getHeight(), Bitmap.Config.ARGB_8888);
            childAt.draw(new Canvas(createBitmap));
            SnsMethodCalculate.markEndTimeMs("getBitmapFromView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), createBitmap);
            this.f280823f = new Rect(left, top, left + width, top + height);
            Rect rect = this.f280823f;
            int i3 = (int) (((float) width) * 0.05f);
            int i4 = (int) (((float) height) * 0.05f);
            this.f280822e = new Rect(rect.left - i3, rect.top - i4, rect.right + i3, rect.bottom + i4);
            this.f280824g = new Rect(this.f280822e);
            bitmapDrawable.setBounds(this.f280823f);
            Rect m = C61926c.m72688m(childAt);
            this.f280825h = m;
            Log.m105925i("DynamicGridView", "getAndAddHoverView: mDraggingViewOriginBounds:%s", m);
            SnsMethodCalculate.markEndTimeMs("getAndAddHoverView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            this.f280821d = bitmapDrawable;
            SnsMethodCalculate.markStartTimeMs("animateBounds", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            C103099g gVar = new C103099g(this);
            ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f280821d, "bounds", gVar, new Object[]{this.f280822e});
            ofObject.addUpdateListener(new C103100h(this));
            ofObject.addListener(new C103101i(this));
            ofObject.setDuration(10);
            ofObject.start();
            SnsMethodCalculate.markEndTimeMs("animateBounds", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            mo133720s();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(childAt, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView", "startDragAtPosition", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(childAt, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView", "startDragAtPosition", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo133706C(this.f280837v);
            C96138g gVar2 = this.f280807I;
            if (gVar2 != null) {
                C96148b.C96149a aVar2 = (C96148b.C96149a) gVar2;
                aVar2.getClass();
                SnsMethodCalculate.markStartTimeMs("onDragStarted", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
                Log.m105924i("DynamicGrid", "drag started at position " + i2);
                C96148b bVar = C96148b.this;
                float elevation = aVar2.f280889a.getElevation();
                SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                bVar.f280881h = elevation;
                SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                aVar2.f280889a.setElevation(100.0f);
                C96148b bVar2 = C96148b.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                bVar2.getClass();
                SnsMethodCalculate.markStartTimeMs("animateShowDelArea", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                View view = bVar2.f280882i;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView", "animateShowDelArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridPreviewImgView", "animateShowDelArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = bVar2.f280882i;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, "translationY", new float[]{(float) view3.getHeight(), 0.0f});
                ofFloat.setDuration(200);
                ofFloat.start();
                SnsMethodCalculate.markEndTimeMs("animateShowDelArea", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView");
                C96148b.m123229b(C96148b.this);
                SnsMethodCalculate.markEndTimeMs("onDragStarted", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridPreviewImgView$1");
            }
            SnsMethodCalculate.markEndTimeMs("startDragAtPosition", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("startDragAtPosition", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        return false;
    }

    /* renamed from: y */
    public final void mo133736y() {
        Boolean bool;
        SnsMethodCalculate.markStartTimeMs("startWobbleAnimation", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (!(childAt == null || (bool = Boolean.TRUE) == childAt.getTag(C0966R.C0970id.c4q))) {
                if (i % 2 == 0) {
                    mo133708i(childAt);
                } else {
                    mo133709j(childAt);
                }
                childAt.setTag(C0966R.C0970id.c4q, bool);
            }
        }
        SnsMethodCalculate.markEndTimeMs("startWobbleAnimation", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    /* renamed from: z */
    public final void mo133737z(boolean z) {
        SnsMethodCalculate.markStartTimeMs("stopWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        for (ObjectAnimator cancel : this.f280800B) {
            cancel.cancel();
        }
        this.f280800B.clear();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                if (z) {
                    childAt.setRotation(0.0f);
                }
                childAt.setTag(C0966R.C0970id.c4q, Boolean.FALSE);
            }
        }
        SnsMethodCalculate.markEndTimeMs("stopWobble", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public void setAdapter(ListAdapter listAdapter) {
        SnsMethodCalculate.markStartTimeMs("setAdapter", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        super.setAdapter(listAdapter);
        SnsMethodCalculate.markEndTimeMs("setAdapter", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
    }

    public DynamicGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo133719r(context);
    }
}
