package r92;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.viewpager.widget.C103853a;
import ba2.C39748b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.plugin.multitask.p079ui.base.MultiTaskSnapViewWrapper;
import com.tencent.p014mm.plugin.multitask.p079ui.base.MultiTaskViewPager;
import com.tencent.p014mm.sdk.platformtools.Log;
import d92.C107028a;
import d92.C45292b;
import gy3.C87412m;
import k92.C108974b;
import p385u2.C111105a;

/* renamed from: r92.c */
public class C110559c implements C45292b {

    /* renamed from: a */
    public Activity f330691a;

    /* renamed from: b */
    public MultiTaskViewPager f330692b;

    /* renamed from: c */
    public C108974b f330693c;

    /* renamed from: d */
    public FrameLayout f330694d;

    /* renamed from: e */
    public int f330695e;

    /* renamed from: r92.c$a */
    public final class C77493a extends C103853a {

        /* renamed from: d */
        public final View f225956d;

        /* renamed from: e */
        public final View f225957e;

        public C77493a(C110559c cVar, View view, View view2) {
            C87412m.m108594g(view, "multiTaskView");
            C87412m.m108594g(view2, "launcherView");
            this.f225956d = view;
            this.f225957e = view2;
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            C87412m.m108594g(viewGroup, "container");
            C87412m.m108594g(obj, "object");
            viewGroup.removeView((View) obj);
        }

        public int getCount() {
            return 2;
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "container");
            View view = i == 0 ? this.f225956d : this.f225957e;
            viewGroup.removeView(view);
            viewGroup.addView(view);
            return view;
        }

        public boolean isViewFromObject(View view, Object obj) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(obj, "obj");
            return C87412m.m108589b(view, obj);
        }
    }

    /* renamed from: r92.c$b */
    public static final class C77494b extends FrameLayout {

        /* renamed from: d */
        public final /* synthetic */ C110559c f225958d;

        /* renamed from: e */
        public final /* synthetic */ View f225959e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77494b(C110559c cVar, View view, Context context) {
            super(context);
            this.f225958d = cVar;
            this.f225959e = view;
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            Float f = null;
            Float valueOf = motionEvent != null ? Float.valueOf(motionEvent.getRawX()) : null;
            if (motionEvent != null) {
                f = Float.valueOf(motionEvent.getRawY());
            }
            C110559c cVar = this.f225958d;
            View view = this.f225959e;
            cVar.getClass();
            C87412m.m108594g(view, "view");
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            RectF rectF = new RectF((float) i, (float) iArr[1], (float) (i + view.getWidth()), (float) (iArr[1] + view.getHeight()));
            if (!(valueOf == null || f == null)) {
                if (rectF.contains(valueOf.floatValue(), f.floatValue())) {
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    public C110559c(Activity activity) {
        this.f330691a = activity;
    }

    /* renamed from: a */
    public Boolean mo70823a() {
        return Boolean.valueOf(this.f330692b != null);
    }

    /* renamed from: b */
    public void mo70824b(boolean z) {
        MultiTaskViewPager multiTaskViewPager = this.f330692b;
        if (multiTaskViewPager != null) {
            multiTaskViewPager.setCanSlide(z);
        }
        Log.m105925i("MicroMsg.MultiTaskWrapper", "canSlide:%b", Boolean.valueOf(z));
    }

    /* renamed from: c */
    public void mo70825c(SwipeBackLayout.C19854d dVar) {
        MultiTaskViewPager multiTaskViewPager = this.f330692b;
        if (multiTaskViewPager != null) {
            multiTaskViewPager.setSwipeBackListener(dVar);
        }
    }

    /* renamed from: d */
    public void mo70826d(C107028a aVar, C108974b bVar) {
        MultiTaskSnapViewWrapper multiTaskSnapViewWrapper = null;
        View contentView = aVar != null ? aVar.getContentView() : null;
        if (contentView == null || contentView.getParent() == null) {
            Log.m105924i("MicroMsg.MultiTaskWrapper", "addMultiTaskWrapper, contentView is null");
            return;
        }
        Bitmap h = bVar != null ? bVar.mo160084h() : null;
        if (h == null || h.isRecycled()) {
            Log.m105924i("MicroMsg.MultiTaskWrapper", "addMultiTaskWrapper, bitmap is null or recycle");
        } else if (contentView.getParent() == null) {
            Log.m105924i("MicroMsg.MultiTaskWrapper", "addMultiTaskWrapper, contentView parent is null");
        } else {
            this.f330693c = bVar;
            ViewParent parent = contentView.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            int indexOfChild = viewGroup.indexOfChild(contentView);
            viewGroup.removeView(contentView);
            ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
            View view = new View(contentView.getContext());
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C74942w4.m89784a(this.f330691a, 15), -1);
            layoutParams2.gravity = 5;
            view.setLayoutParams(layoutParams2);
            C77494b bVar2 = new C77494b(this, view, contentView.getContext());
            this.f330694d = bVar2;
            bVar2.addView(contentView);
            bVar2.addView(view);
            MultiTaskViewPager multiTaskViewPager = new MultiTaskViewPager(this.f330691a);
            multiTaskViewPager.setCanSlide(true);
            Activity activity = this.f330691a;
            if (activity != null) {
                multiTaskSnapViewWrapper = new MultiTaskSnapViewWrapper(activity);
            }
            if (multiTaskSnapViewWrapper != null) {
                multiTaskSnapViewWrapper.setBackgroundColor(C111105a.m151500b(multiTaskViewPager.getContext(), C0966R.color.f2928b));
            }
            C87412m.m108592e(multiTaskSnapViewWrapper, "null cannot be cast to non-null type com.tencent.mm.plugin.multitask.ui.base.IMultiTaskView");
            multiTaskSnapViewWrapper.setBitmap(h);
            multiTaskViewPager.setAdapter(new C77493a(this, bVar2, multiTaskSnapViewWrapper.getView()));
            multiTaskViewPager.addView(this.f330694d);
            C39748b bVar3 = C39748b.f106642a;
            multiTaskViewPager.setPageMargin(C39748b.f106643b);
            multiTaskViewPager.setPageMarginDrawable((int) C0966R.color.f356960a62);
            boolean z = false;
            multiTaskViewPager.setCurrentItem(0, false);
            this.f330692b = multiTaskViewPager;
            Boolean p = bVar.mo74194p();
            if (p != null) {
                z = p.booleanValue();
            }
            MultiTaskViewPager multiTaskViewPager2 = this.f330692b;
            if (multiTaskViewPager2 != null) {
                multiTaskViewPager2.setCanOnlySlideBySide(!z);
            }
            viewGroup.addView(this.f330692b, indexOfChild, layoutParams);
            MultiTaskViewPager multiTaskViewPager3 = this.f330692b;
            if (multiTaskViewPager3 != null) {
                multiTaskViewPager3.setOnPageChangeListener(new C110560d(this));
            }
        }
    }

    /* renamed from: e */
    public MultiTaskViewPager mo70827e() {
        return this.f330692b;
    }
}
