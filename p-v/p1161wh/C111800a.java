package p1161wh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveTextView;
import com.tencent.p014mm.view.x2c.X2CRelativeLayout;
import wq3.C111838a;
import wq3.C111851n;

/* renamed from: wh.a */
public class C111800a extends C111838a {
    /* renamed from: c */
    public String mo163511c() {
        return "improve_comment_view_x2c";
    }

    /* renamed from: e */
    public View mo163512e(Context context) {
        Context context2 = context;
        mo163565p();
        X2CRelativeLayout x2CRelativeLayout = (X2CRelativeLayout) mo163559i(context2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
        if (x2CRelativeLayout == null) {
            x2CRelativeLayout = new X2CRelativeLayout(context2, mo163560j());
        }
        X2CRelativeLayout x2CRelativeLayout2 = x2CRelativeLayout;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(context2, mo163560j());
        C111851n.C111852a aVar = C111851n.f334884a;
        aVar.mo163594l(context2, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        aVar.mo163592j(context2, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        x2CRelativeLayout2.setTag(C0966R.C0970id.mku, marginLayoutParams);
        mo163564o();
        ImproveTextView improveTextView = (ImproveTextView) mo163559i(context2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 1);
        if (improveTextView == null) {
            improveTextView = new ImproveTextView(context2, mo163560j());
        }
        ImproveTextView improveTextView2 = improveTextView;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(context2, mo163560j());
        aVar.mo163589g(context2, improveTextView2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", C0966R.C0970id.bjb);
        aVar.mo163594l(context2, layoutParams, "X2CRelativeLayout.LayoutParams", -1);
        aVar.mo163592j(context2, layoutParams, "X2CRelativeLayout.LayoutParams", -2);
        Context context3 = context;
        ImproveTextView improveTextView3 = improveTextView2;
        String str = "X2CRelativeLayout.LayoutParams";
        aVar.mo163604v(context2, improveTextView2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", mo163566q(context3, improveTextView3, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@color/FG_0_5", C0966R.color.FG_0_5));
        aVar.mo163605w(context2, improveTextView2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", mo163571v(context3, improveTextView3, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, C0966R.dimen.f3879hn));
        improveTextView2.setLayoutParams(layoutParams);
        x2CRelativeLayout2.addView(improveTextView2);
        mo163557f(context3, improveTextView3, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", false, 1);
        ImproveTextView improveTextView4 = (ImproveTextView) mo163559i(context2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 2);
        if (improveTextView4 == null) {
            improveTextView4 = new ImproveTextView(context2, mo163560j());
        }
        ImproveTextView improveTextView5 = improveTextView4;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(context2, mo163560j());
        aVar.mo163589g(context2, improveTextView5, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", C0966R.C0970id.obn);
        aVar.mo163594l(context2, layoutParams2, str, -2);
        aVar.mo163592j(context2, layoutParams2, str, -2);
        layoutParams2.addRule(8, C0966R.C0970id.bjb);
        layoutParams2.addRule(21, -1);
        Context context4 = context;
        ImproveTextView improveTextView6 = improveTextView5;
        aVar.mo163586d(context2, improveTextView5, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", mo163568s(context4, improveTextView6, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@drawable/sns_clickable_bg", C0966R.C0969drawable.f357356at2));
        aVar.mo163603u(context2, improveTextView5, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", mo163570u(context4, improveTextView6, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@string/sns_desc_spread", C0966R.string.jbo));
        aVar.mo163604v(context2, improveTextView5, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", mo163566q(context4, improveTextView6, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@color/link_color", C0966R.color.a1d));
        aVar.mo163605w(context2, improveTextView5, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", mo163571v(context4, improveTextView6, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, C0966R.dimen.f3879hn));
        aVar.mo163606x(context2, improveTextView5, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 8);
        int r = mo163567r(context4, improveTextView6, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, C0966R.dimen.f3623g);
        int r2 = mo163567r(context4, improveTextView6, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, C0966R.dimen.f3623g);
        ImproveTextView improveTextView7 = improveTextView5;
        X2CRelativeLayout x2CRelativeLayout3 = x2CRelativeLayout2;
        aVar.mo163584b(context, improveTextView5, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", r, 0, r2, 0);
        improveTextView7.setLayoutParams(layoutParams2);
        x2CRelativeLayout3.addView(improveTextView7);
        Context context5 = context;
        mo163557f(context5, improveTextView7, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", false, 2);
        mo163557f(context5, x2CRelativeLayout3, "com.tencent.mm.view.x2c.X2CRelativeLayout", true, 0);
        return x2CRelativeLayout3;
    }

    /* renamed from: g */
    public View mo163513g(Context context, AttributeSet attributeSet, String str, int i) {
        int i2;
        int i3;
        String str2;
        ImproveTextView improveTextView;
        Context context2;
        Context context3 = context;
        int i4 = i;
        if (i4 == 0) {
            mo163565p();
        }
        X2CRelativeLayout x2CRelativeLayout = null;
        if (i4 == 0) {
            X2CRelativeLayout x2CRelativeLayout2 = (X2CRelativeLayout) mo163559i(context3, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
            mo163558h(context3, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
            x2CRelativeLayout = x2CRelativeLayout2;
        }
        if (i4 == 1) {
            ImproveTextView improveTextView2 = (ImproveTextView) mo163559i(context3, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 1);
            if (improveTextView2 != null) {
                C111851n.C111852a aVar = C111851n.f334884a;
                aVar.mo163589g(context3, improveTextView2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", C0966R.C0970id.bjb);
                Context context4 = context;
                ImproveTextView improveTextView3 = improveTextView2;
                aVar.mo163604v(context3, improveTextView2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", mo163566q(context4, improveTextView3, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@color/FG_0_5", C0966R.color.FG_0_5));
                aVar.mo163605w(context3, improveTextView2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", mo163571v(context4, improveTextView3, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, C0966R.dimen.f3879hn));
            }
            mo163558h(context3, improveTextView2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 1);
            x2CRelativeLayout = improveTextView2;
        }
        if (i4 == 2) {
            ImproveTextView improveTextView4 = (ImproveTextView) mo163559i(context3, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 2);
            if (improveTextView4 != null) {
                C111851n.C111852a aVar2 = C111851n.f334884a;
                aVar2.mo163589g(context3, improveTextView4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", C0966R.C0970id.obn);
                Context context5 = context;
                ImproveTextView improveTextView5 = improveTextView4;
                aVar2.mo163586d(context3, improveTextView4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", mo163568s(context5, improveTextView5, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@drawable/sns_clickable_bg", C0966R.C0969drawable.f357356at2));
                aVar2.mo163603u(context3, improveTextView4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", mo163570u(context5, improveTextView5, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@string/sns_desc_spread", C0966R.string.jbo));
                aVar2.mo163604v(context3, improveTextView4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", mo163566q(context5, improveTextView5, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@color/link_color", C0966R.color.a1d));
                aVar2.mo163605w(context3, improveTextView4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", mo163571v(context5, improveTextView5, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, C0966R.dimen.f3879hn));
                aVar2.mo163606x(context3, improveTextView4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 8);
                int r = mo163567r(context5, improveTextView5, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, C0966R.dimen.f3623g);
                int r2 = mo163567r(context5, improveTextView5, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 0, 0.0f, C0966R.dimen.f3623g);
                improveTextView = improveTextView4;
                i3 = 2;
                str2 = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView";
                i2 = i4;
                int i5 = r2;
                context2 = context3;
                aVar2.mo163584b(context, improveTextView4, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", r, 0, i5, 0);
            } else {
                improveTextView = improveTextView4;
                str2 = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView";
                i2 = i4;
                context2 = context3;
                i3 = 2;
            }
            mo163558h(context2, improveTextView, str2, i3);
            x2CRelativeLayout = improveTextView;
        } else {
            i2 = i4;
            i3 = 2;
        }
        if (i2 == i3) {
            mo163564o();
        }
        return x2CRelativeLayout;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d_5;
    }

    /* renamed from: k */
    public String mo163515k() {
        return "MicroMsg.X2C.Improve_Comment_View_X2c_X2C";
    }
}
