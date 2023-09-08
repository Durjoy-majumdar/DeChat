package p1161wh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.x2c.X2CLinearLayout;
import com.tencent.p014mm.view.x2c.X2CTextView;
import com.tencent.p014mm.view.x2c.X2CView;
import wq3.C111838a;
import wq3.C111851n;

/* renamed from: wh.j */
public class C111809j extends C111838a {
    /* renamed from: c */
    public String mo163511c() {
        return "sns_retry_edit_x2c";
    }

    /* renamed from: e */
    public View mo163512e(Context context) {
        Context context2 = context;
        mo163565p();
        X2CLinearLayout x2CLinearLayout = (X2CLinearLayout) mo163559i(context2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        if (x2CLinearLayout == null) {
            x2CLinearLayout = new X2CLinearLayout(context2, mo163560j());
        }
        X2CLinearLayout x2CLinearLayout2 = x2CLinearLayout;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(context2, mo163560j());
        C111851n.C111852a aVar = C111851n.f334884a;
        aVar.mo163599q(context2, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        aVar.mo163594l(context2, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        aVar.mo163592j(context2, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        x2CLinearLayout2.setTag(C0966R.C0970id.mku, marginLayoutParams);
        mo163564o();
        X2CLinearLayout x2CLinearLayout3 = (X2CLinearLayout) mo163559i(context2, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        if (x2CLinearLayout3 == null) {
            x2CLinearLayout3 = new X2CLinearLayout(context2, mo163560j());
        }
        X2CLinearLayout x2CLinearLayout4 = x2CLinearLayout3;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(context2, mo163560j());
        aVar.mo163589g(context2, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", C0966R.C0970id.jvl);
        aVar.mo163594l(context2, layoutParams, "X2CLinearLayout.LayoutParams", -2);
        aVar.mo163592j(context2, layoutParams, "X2CLinearLayout.LayoutParams", -2);
        aVar.mo163591i(context2, layoutParams, "X2CLinearLayout.LayoutParams", 17);
        Context context3 = context;
        X2CLinearLayout x2CLinearLayout5 = x2CLinearLayout4;
        int r = mo163567r(context3, x2CLinearLayout5, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, C0966R.dimen.f3743cv);
        int r2 = mo163567r(context3, x2CLinearLayout5, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, C0966R.dimen.f3758d_);
        int r3 = mo163567r(context3, x2CLinearLayout5, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, C0966R.dimen.f3743cv);
        int r4 = mo163567r(context3, x2CLinearLayout5, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, C0966R.dimen.f3758d_);
        String str = "X2CLinearLayout.LayoutParams";
        LinearLayout.LayoutParams layoutParams2 = layoutParams;
        X2CLinearLayout x2CLinearLayout6 = x2CLinearLayout4;
        C111851n.C111852a aVar2 = aVar;
        X2CLinearLayout x2CLinearLayout7 = x2CLinearLayout2;
        Context context4 = context2;
        aVar.mo163583a(context, layoutParams2, "X2CLinearLayout.LayoutParams", r, r2, r3, r4);
        x2CLinearLayout6.setLayoutParams(layoutParams2);
        x2CLinearLayout7.addView(x2CLinearLayout6);
        X2CTextView x2CTextView = (X2CTextView) mo163559i(context4, "com.tencent.mm.view.x2c.X2CTextView", 2);
        if (x2CTextView == null) {
            x2CTextView = new X2CTextView(context4, mo163560j());
        }
        X2CTextView x2CTextView2 = x2CTextView;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(context4, mo163560j());
        aVar2.mo163589g(context4, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", C0966R.C0970id.jvk);
        aVar2.mo163594l(context4, layoutParams3, str, -2);
        aVar2.mo163592j(context4, layoutParams3, str, -2);
        C111851n.C111852a aVar3 = aVar2;
        Context context5 = context;
        C111851n.C111852a aVar4 = aVar3;
        X2CTextView x2CTextView3 = x2CTextView2;
        X2CLinearLayout x2CLinearLayout8 = x2CLinearLayout7;
        X2CLinearLayout x2CLinearLayout9 = x2CLinearLayout6;
        String str2 = str;
        Context context6 = context;
        C111851n.C111852a aVar5 = aVar4;
        aVar5.mo163605w(context6, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163571v(context5, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 1, 14.0f, 0));
        aVar5.mo163604v(context6, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163566q(context5, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", "@color/FG_2", C0966R.color.FG_2));
        aVar5.mo163603u(context6, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163570u(context5, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_retry_edit_desc_text", C0966R.string.jgj));
        x2CTextView2.setLayoutParams(layoutParams3);
        x2CLinearLayout9.addView(x2CTextView2);
        mo163557f(context5, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", false, 2);
        X2CTextView x2CTextView4 = (X2CTextView) mo163559i(context6, "com.tencent.mm.view.x2c.X2CTextView", 3);
        if (x2CTextView4 == null) {
            x2CTextView4 = new X2CTextView(context6, mo163560j());
        }
        X2CTextView x2CTextView5 = x2CTextView4;
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(context6, mo163560j());
        aVar5.mo163589g(context6, x2CTextView5, "com.tencent.mm.view.x2c.X2CTextView", C0966R.C0970id.jvj);
        aVar5.mo163594l(context6, layoutParams4, str2, -2);
        aVar5.mo163592j(context6, layoutParams4, str2, -2);
        Context context7 = context;
        X2CTextView x2CTextView6 = x2CTextView5;
        X2CLinearLayout x2CLinearLayout10 = x2CLinearLayout8;
        C111851n.C111852a aVar6 = aVar5;
        aVar6.mo163605w(context6, x2CTextView5, "com.tencent.mm.view.x2c.X2CTextView", mo163571v(context7, x2CTextView6, "com.tencent.mm.view.x2c.X2CTextView", 1, 14.0f, 0));
        aVar6.mo163604v(context6, x2CTextView5, "com.tencent.mm.view.x2c.X2CTextView", mo163566q(context7, x2CTextView6, "com.tencent.mm.view.x2c.X2CTextView", "@color/Link", C0966R.color.f2958ae));
        aVar6.mo163603u(context6, x2CTextView5, "com.tencent.mm.view.x2c.X2CTextView", mo163570u(context7, x2CTextView6, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_retry_edit_text", C0966R.string.jgk));
        LinearLayout.LayoutParams layoutParams5 = layoutParams4;
        X2CTextView x2CTextView7 = x2CTextView5;
        X2CLinearLayout x2CLinearLayout11 = x2CLinearLayout9;
        X2CLinearLayout x2CLinearLayout12 = x2CLinearLayout10;
        aVar6.mo163583a(context, layoutParams5, "X2CLinearLayout.LayoutParams", mo163567r(context7, x2CTextView6, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, C0966R.dimen.f3736cp), 0, 0, 0);
        x2CTextView7.setLayoutParams(layoutParams5);
        x2CLinearLayout11.addView(x2CTextView7);
        String str3 = str2;
        Context context8 = context6;
        Context context9 = context;
        C111851n.C111852a aVar7 = aVar6;
        mo163557f(context9, x2CTextView7, "com.tencent.mm.view.x2c.X2CTextView", false, 3);
        mo163557f(context9, x2CLinearLayout11, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 1);
        X2CView x2CView = (X2CView) mo163559i(context8, "com.tencent.mm.view.x2c.X2CView", 4);
        if (x2CView == null) {
            x2CView = new X2CView(context8, mo163560j());
        }
        X2CView x2CView2 = x2CView;
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(context8, mo163560j());
        aVar7.mo163594l(context8, layoutParams6, str3, -1);
        Context context10 = context;
        X2CView x2CView3 = x2CView2;
        aVar7.mo163592j(context8, layoutParams6, str3, mo163567r(context10, x2CView3, "com.tencent.mm.view.x2c.X2CView", 1, 0.5f, 0));
        aVar7.mo163586d(context8, x2CView2, "com.tencent.mm.view.x2c.X2CView", mo163568s(context10, x2CView3, "com.tencent.mm.view.x2c.X2CView", "@drawable/grey_divider", C0966R.C0969drawable.a8l));
        x2CView2.setLayoutParams(layoutParams6);
        X2CLinearLayout x2CLinearLayout13 = x2CLinearLayout12;
        x2CLinearLayout13.addView(x2CView2);
        mo163557f(context10, x2CView3, "com.tencent.mm.view.x2c.X2CView", false, 4);
        mo163557f(context10, x2CLinearLayout13, "com.tencent.mm.view.x2c.X2CLinearLayout", true, 0);
        return x2CLinearLayout13;
    }

    /* renamed from: g */
    public View mo163513g(Context context, AttributeSet attributeSet, String str, int i) {
        if (i == 0) {
            mo163565p();
        }
        X2CLinearLayout x2CLinearLayout = null;
        if (i == 0) {
            X2CLinearLayout x2CLinearLayout2 = (X2CLinearLayout) mo163559i(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            if (x2CLinearLayout2 != null) {
                x2CLinearLayout2.setOrientation(1);
            }
            mo163558h(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            x2CLinearLayout = x2CLinearLayout2;
        }
        if (i == 1) {
            x2CLinearLayout = (X2CLinearLayout) mo163559i(context, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
            if (x2CLinearLayout != null) {
                x2CLinearLayout.setId(C0966R.C0970id.jvl);
            }
            mo163558h(context, x2CLinearLayout, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        }
        if (i == 2) {
            x2CLinearLayout = (X2CTextView) mo163559i(context, "com.tencent.mm.view.x2c.X2CTextView", 2);
            if (x2CLinearLayout != null) {
                C111851n.C111852a aVar = C111851n.f334884a;
                aVar.mo163589g(context, x2CLinearLayout, "com.tencent.mm.view.x2c.X2CTextView", C0966R.C0970id.jvk);
                Context context2 = context;
                View view = x2CLinearLayout;
                aVar.mo163605w(context, x2CLinearLayout, "com.tencent.mm.view.x2c.X2CTextView", mo163571v(context2, view, "com.tencent.mm.view.x2c.X2CTextView", 1, 14.0f, 0));
                aVar.mo163604v(context, x2CLinearLayout, "com.tencent.mm.view.x2c.X2CTextView", mo163566q(context2, view, "com.tencent.mm.view.x2c.X2CTextView", "@color/FG_2", C0966R.color.FG_2));
                aVar.mo163603u(context, x2CLinearLayout, "com.tencent.mm.view.x2c.X2CTextView", mo163570u(context2, view, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_retry_edit_desc_text", C0966R.string.jgj));
            }
            mo163558h(context, x2CLinearLayout, "com.tencent.mm.view.x2c.X2CTextView", 2);
        }
        if (i == 3) {
            x2CLinearLayout = (X2CTextView) mo163559i(context, "com.tencent.mm.view.x2c.X2CTextView", 3);
            if (x2CLinearLayout != null) {
                C111851n.C111852a aVar2 = C111851n.f334884a;
                aVar2.mo163589g(context, x2CLinearLayout, "com.tencent.mm.view.x2c.X2CTextView", C0966R.C0970id.jvj);
                Context context3 = context;
                View view2 = x2CLinearLayout;
                aVar2.mo163605w(context, x2CLinearLayout, "com.tencent.mm.view.x2c.X2CTextView", mo163571v(context3, view2, "com.tencent.mm.view.x2c.X2CTextView", 1, 14.0f, 0));
                aVar2.mo163604v(context, x2CLinearLayout, "com.tencent.mm.view.x2c.X2CTextView", mo163566q(context3, view2, "com.tencent.mm.view.x2c.X2CTextView", "@color/Link", C0966R.color.f2958ae));
                aVar2.mo163603u(context, x2CLinearLayout, "com.tencent.mm.view.x2c.X2CTextView", mo163570u(context3, view2, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_retry_edit_text", C0966R.string.jgk));
            }
            mo163558h(context, x2CLinearLayout, "com.tencent.mm.view.x2c.X2CTextView", 3);
        }
        if (i == 4) {
            X2CView x2CView = (X2CView) mo163559i(context, "com.tencent.mm.view.x2c.X2CView", 4);
            if (x2CView != null) {
                x2CView.setBackground(mo163568s(context, x2CView, "com.tencent.mm.view.x2c.X2CView", "@drawable/grey_divider", C0966R.C0969drawable.a8l));
            }
            mo163558h(context, x2CView, "com.tencent.mm.view.x2c.X2CView", 4);
            x2CLinearLayout = x2CView;
        }
        if (i == 4) {
            mo163564o();
        }
        return x2CLinearLayout;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d5n;
    }

    /* renamed from: k */
    public String mo163515k() {
        return "MicroMsg.X2C.Sns_Retry_Edit_X2c_X2C";
    }
}
