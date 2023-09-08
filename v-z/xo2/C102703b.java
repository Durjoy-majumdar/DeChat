package xo2;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdLandingPageFloatView;
import java.util.LinkedHashMap;
import ps2.C100882l;
import ps2.C100894u;
import qs2.C101255a0;
import qs2.C101298y;
import rq2.C101425k;

/* renamed from: xo2.b */
public final class C102703b {

    /* renamed from: a */
    public C100894u.C100895a f303325a;

    /* renamed from: b */
    public boolean f303326b = false;

    /* renamed from: c */
    public SnsAdLandingPageFloatView f303327c;

    public C102703b(C100894u.C100895a aVar) {
        this.f303325a = aVar;
    }

    /* renamed from: a */
    public boolean mo142510a(ViewGroup viewGroup, Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("attachFloatPageViewToParentIfExist", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
        this.f303326b = false;
        if (viewGroup == null) {
            SnsMethodCalculate.markEndTimeMs("attachFloatPageViewToParentIfExist", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
            return false;
        }
        try {
            C101298y b = mo142511b();
            if (b != null) {
                SnsAdLandingPageFloatView snsAdLandingPageFloatView = new SnsAdLandingPageFloatView(viewGroup.getContext());
                Bundle bundle2 = new Bundle();
                bundle2.putString("sns_float_component_id", b.f296495a);
                if (bundle != null && bundle.size() > 0) {
                    bundle2.putAll(bundle);
                }
                snsAdLandingPageFloatView.mo134020e(bundle2, this.f303325a.f295461a.get(0));
                viewGroup.addView(snsAdLandingPageFloatView, viewGroup.getChildCount() - 1, new ViewGroup.LayoutParams(-1, -1));
                this.f303327c = snsAdLandingPageFloatView;
                this.f303326b = true;
                mo142512c(b.f296770A);
            }
        } catch (Throwable unused) {
        }
        boolean z = this.f303326b;
        SnsMethodCalculate.markEndTimeMs("attachFloatPageViewToParentIfExist", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
        return z;
    }

    /* renamed from: b */
    public final C101298y mo142511b() {
        SnsMethodCalculate.markStartTimeMs("findAutoShowFloatPageViewInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
        C100894u.C100895a aVar = this.f303325a;
        if (aVar != null && C101425k.m133100d(aVar.f295461a)) {
            C100882l lVar = aVar.f295461a.get(0);
            if (lVar == null || C101425k.m133098b(lVar.f295430e)) {
                SnsMethodCalculate.markEndTimeMs("findAutoShowFloatPageViewInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
                return null;
            }
            for (C101255a0 a0Var : ((LinkedHashMap) lVar.f295430e).values()) {
                if (a0Var instanceof C101298y) {
                    C101298y yVar = (C101298y) a0Var;
                    if (yVar.f296771B > 0) {
                        SnsMethodCalculate.markEndTimeMs("findAutoShowFloatPageViewInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
                        return yVar;
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("findAutoShowFloatPageViewInfo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
        return null;
    }

    /* renamed from: c */
    public final void mo142512c(float f) {
        View childAt;
        SnsMethodCalculate.markStartTimeMs("setFloatChildViewElevation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
        SnsAdLandingPageFloatView snsAdLandingPageFloatView = this.f303327c;
        if (!(snsAdLandingPageFloatView == null || snsAdLandingPageFloatView.getChildCount() <= 0 || (childAt = snsAdLandingPageFloatView.getChildAt(0)) == null)) {
            Context context = childAt.getContext();
            SnsMethodCalculate.markStartTimeMs("createDrawable", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(context.getResources().getColor(C0966R.color.ac4));
            gradientDrawable.setCornerRadius(f);
            SnsMethodCalculate.markEndTimeMs("createDrawable", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
            childAt.setBackground(gradientDrawable);
            childAt.setElevation(childAt.getContext().getResources().getDimension(C0966R.dimen.ank));
        }
        SnsMethodCalculate.markEndTimeMs("setFloatChildViewElevation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatPageViewHelper");
    }
}
