package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import vr2.C52988j;
import wc3.C78538u;

/* renamed from: com.tencent.mm.plugin.sns.ui.z1 */
public class C43162z1 {

    /* renamed from: a */
    public Context f116765a;

    /* renamed from: b */
    public View.OnClickListener f116766b;

    /* renamed from: c */
    public FrameLayout f116767c;

    /* renamed from: d */
    public AbsoluteLayout f116768d = null;

    /* renamed from: e */
    public Animation f116769e;

    /* renamed from: f */
    public Animation f116770f;

    /* renamed from: g */
    public boolean f116771g = false;

    /* renamed from: h */
    public boolean f116772h = false;

    /* renamed from: i */
    public int f116773i = -1;

    /* renamed from: com.tencent.mm.plugin.sns.ui.z1$a */
    public class C43163a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f116774d;

        /* renamed from: e */
        public final /* synthetic */ View f116775e;

        public C43163a(View view, View view2) {
            this.f116774d = view;
            this.f116775e = view2;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper$1");
            C43162z1 z1Var = C43162z1.this;
            View view = this.f116775e;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            z1Var.getClass();
            SnsMethodCalculate.markStartTimeMs("initOpenIMView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/OpenIMUnlikeHelper", "initOpenIMView", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/OpenIMUnlikeHelper", "initOpenIMView", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z1Var.f116771g = true;
            z1Var.f116769e.setAnimationListener(new C43097a2(z1Var));
            view.startAnimation(z1Var.f116769e);
            SnsMethodCalculate.markEndTimeMs("initOpenIMView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.z1$b */
    public class C43164b {

        /* renamed from: a */
        public View f116777a;

        public C43164b(C43162z1 z1Var, String str, View view) {
            this.f116777a = view;
        }
    }

    public C43162z1(Context context, TimelineClickListener timelineClickListener, FrameLayout frameLayout, View view) {
        this.f116765a = context;
        this.f116766b = timelineClickListener.f280359O;
        this.f116767c = frameLayout;
        this.f116769e = new ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f, 1, 1.0f, 1, 0.0f);
        this.f116769e = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2368b5);
        this.f116770f = new ScaleAnimation(1.0f, 1.0f, 1.0f, 0.0f, 1, 1.0f, 1, 0.0f);
        this.f116770f = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2369b6);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m46734a(C43162z1 z1Var, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        z1Var.f116771g = z;
        SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        return z;
    }

    /* renamed from: b */
    public boolean mo67389b(View view, boolean z, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("addUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        if (this.f116771g) {
            SnsMethodCalculate.markEndTimeMs("addUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            return false;
        }
        AbsoluteLayout absoluteLayout = this.f116768d;
        if (absoluteLayout != null) {
            if (absoluteLayout.getTag() instanceof C43164b) {
                View view2 = ((C43164b) this.f116768d.getTag()).f116777a;
                SnsMethodCalculate.markStartTimeMs("closeAdUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
                this.f116771g = true;
                view2.startAnimation(this.f116770f);
                this.f116770f.setAnimationListener(new C43099b2(this, view2));
                SnsMethodCalculate.markEndTimeMs("closeAdUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            } else {
                mo67390c();
            }
            SnsMethodCalculate.markEndTimeMs("addUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            return false;
        } else if (view.getTag() == null || !(view.getTag() instanceof C52988j)) {
            SnsMethodCalculate.markEndTimeMs("addUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            return false;
        } else {
            C52988j jVar = (C52988j) view.getTag();
            String str = jVar.f147902b;
            AbsoluteLayout absoluteLayout2 = new AbsoluteLayout(this.f116765a);
            this.f116768d = absoluteLayout2;
            absoluteLayout2.setId(C0966R.C0970id.f5608jp);
            this.f116767c.addView(this.f116768d);
            int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f116765a, 126.0f);
            int fromDPToPix2 = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f116765a, 30.0f);
            View inflate = C85868k2.m106137b(this.f116765a).inflate(C0966R.C0971layout.blw, (ViewGroup) null);
            inflate.setOnClickListener(this.f116766b);
            inflate.setTag(jVar);
            int a = z ? C75044y4.m89989a(this.f116765a) : 0;
            int[] iArr = new int[2];
            int b = C78538u.m94866b(this.f116765a);
            jVar.f147901a.getLocationInWindow(iArr);
            Log.m105918d("MicroMsg.AdNotLikeHelper", "addCommentView getLocationInWindow " + iArr[0] + "  " + iArr[1] + " height: " + b);
            Context context = this.f116765a;
            SnsMethodCalculate.markStartTimeMs("getStatusBarHeight", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            int p = C85875k4.m106200p(context);
            SnsMethodCalculate.markEndTimeMs("getStatusBarHeight", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            this.f116773i = p;
            if (this.f116772h) {
                b = C76577a.m92151b(this.f116765a, 2);
                this.f116773i = 0;
            }
            AbsoluteLayout.LayoutParams layoutParams = new AbsoluteLayout.LayoutParams(-2, -2, iArr[0] - fromDPToPix, (((iArr[1] - this.f116773i) - b) + fromDPToPix2) - a);
            this.f116768d.setTag(new C43164b(this, str, inflate));
            this.f116768d.addView(inflate, layoutParams);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = inflate;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/OpenIMUnlikeHelper", "addUnLikeView", "(Landroid/view/View;ZZ)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/OpenIMUnlikeHelper", "addUnLikeView", "(Landroid/view/View;ZZ)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f116771g = true;
            new MMHandler().post(new C43163a(view, inflate));
            SnsMethodCalculate.markEndTimeMs("addUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            return true;
        }
    }

    /* renamed from: c */
    public boolean mo67390c() {
        SnsMethodCalculate.markStartTimeMs("removeUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        AbsoluteLayout absoluteLayout = this.f116768d;
        if (absoluteLayout != null) {
            this.f116767c.removeView(absoluteLayout);
            this.f116768d = null;
            SnsMethodCalculate.markEndTimeMs("removeUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            return true;
        }
        this.f116771g = false;
        SnsMethodCalculate.markEndTimeMs("removeUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        return false;
    }

    public C43162z1(Context context, View.OnClickListener onClickListener, FrameLayout frameLayout, View view) {
        this.f116765a = context;
        this.f116766b = onClickListener;
        this.f116767c = frameLayout;
        this.f116769e = new ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f, 1, 1.0f, 1, 0.0f);
        this.f116769e = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2368b5);
        this.f116770f = new ScaleAnimation(1.0f, 1.0f, 1.0f, 0.0f, 1, 1.0f, 1, 0.0f);
        this.f116770f = AnimationUtils.loadAnimation(context, C0966R.C0968anim.f2369b6);
    }
}
