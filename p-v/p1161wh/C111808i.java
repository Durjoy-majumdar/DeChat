package p1161wh;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.view.x2c.X2CLinearLayout;
import com.tencent.p014mm.view.x2c.X2CTextView;
import wq3.C111838a;
import wq3.C111841c;
import wq3.C111851n;

/* renamed from: wh.i */
public class C111808i extends C111838a {
    /* renamed from: c */
    public String mo163511c() {
        return "sns_post_finder_item_x2c";
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
        aVar.mo163589g(context2, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", C0966R.C0970id.ncl);
        aVar.mo163594l(context2, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        aVar.mo163592j(context2, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        Context context3 = context;
        X2CLinearLayout x2CLinearLayout3 = x2CLinearLayout2;
        aVar.mo163586d(context2, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", mo163568s(context3, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/friendactivity_comment_list_normal", C0966R.C0969drawable.a6s));
        aVar.mo163588f(context2, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        aVar.mo163599q(context2, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        C111851n.C111852a aVar2 = aVar;
        X2CLinearLayout x2CLinearLayout4 = x2CLinearLayout2;
        Context context4 = context2;
        aVar.mo163583a(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", 0, 0, 0, mo163567r(context3, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 13.0f, 0));
        x2CLinearLayout4.setTag(C0966R.C0970id.mku, marginLayoutParams);
        mo163564o();
        WeImageView weImageView = (WeImageView) mo163559i(context4, "com.tencent.mm.ui.widget.imageview.WeImageView", 1);
        if (weImageView == null) {
            weImageView = new WeImageView(context4, mo163560j());
        }
        WeImageView weImageView2 = weImageView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(context4, mo163560j());
        Context context5 = context;
        WeImageView weImageView3 = weImageView2;
        Context context6 = context4;
        C111851n.C111852a aVar3 = aVar2;
        aVar3.mo163594l(context6, layoutParams, "X2CLinearLayout.LayoutParams", mo163567r(context5, weImageView3, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, C0966R.dimen.f3725ce));
        aVar3.mo163592j(context6, layoutParams, "X2CLinearLayout.LayoutParams", mo163567r(context5, weImageView3, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, C0966R.dimen.f3725ce));
        aVar3.mo163602t(context6, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", mo163568s(context5, weImageView3, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/icons_outlined_finder_icon", C0966R.raw.icons_outlined_finder_icon));
        C111841c.C111842a aVar4 = C111841c.f334881a;
        aVar4.mo163582a(context6, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", mo163566q(context5, weImageView3, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/Orange", C0966R.color.f2960ag));
        C111841c.C111842a aVar5 = aVar4;
        C111851n.C111852a aVar6 = aVar3;
        String str = "X2CLinearLayout.LayoutParams";
        X2CLinearLayout x2CLinearLayout5 = x2CLinearLayout4;
        Context context7 = context6;
        int r = mo163567r(context5, weImageView3, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 7.0f, 0);
        WeImageView weImageView4 = weImageView2;
        aVar3.mo163583a(context, layoutParams, "X2CLinearLayout.LayoutParams", r, 0, 0, 0);
        weImageView4.setLayoutParams(layoutParams);
        x2CLinearLayout5.addView(weImageView4);
        String str2 = "com.tencent.mm.ui.widget.imageview.WeImageView";
        Context context8 = context7;
        X2CLinearLayout x2CLinearLayout6 = x2CLinearLayout5;
        mo163557f(context, weImageView4, "com.tencent.mm.ui.widget.imageview.WeImageView", false, 1);
        X2CTextView x2CTextView = (X2CTextView) mo163559i(context8, "com.tencent.mm.view.x2c.X2CTextView", 2);
        if (x2CTextView == null) {
            x2CTextView = new X2CTextView(context8, mo163560j());
        }
        X2CTextView x2CTextView2 = x2CTextView;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(context8, mo163560j());
        aVar6.mo163589g(context8, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", C0966R.C0970id.ncn);
        Context context9 = context;
        X2CTextView x2CTextView3 = x2CTextView2;
        C111851n.C111852a aVar7 = aVar6;
        String str3 = str;
        aVar7.mo163594l(context8, layoutParams2, str3, mo163567r(context9, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 1, 0.0f, 0));
        aVar7.mo163593k(context8, layoutParams2, str3, 1.0f);
        aVar7.mo163592j(context8, layoutParams2, str3, -2);
        aVar7.mo163591i(context8, layoutParams2, str3, 17);
        aVar7.mo163587e(context8, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", TextUtils.TruncateAt.END);
        aVar7.mo163596n(context8, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163569t(context9, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 1, 0));
        aVar7.mo163603u(context8, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163570u(context9, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_post_finder_tip", C0966R.string.mpv));
        aVar7.mo163604v(context8, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163566q(context9, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", "@color/sns_word_color", C0966R.color.f356983ae1));
        int r2 = mo163567r(context9, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 1, 6.0f, 0);
        int r3 = mo163567r(context9, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 1, 6.0f, 0);
        X2CTextView x2CTextView4 = x2CTextView2;
        String str4 = str2;
        aVar7.mo163584b(context, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", 0, r2, 0, r3);
        C111851n.C111852a aVar8 = aVar7;
        LinearLayout.LayoutParams layoutParams3 = layoutParams2;
        int r4 = mo163567r(context, x2CTextView4, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, C0966R.dimen.f3703bv);
        String str5 = str3;
        X2CTextView x2CTextView5 = x2CTextView4;
        X2CLinearLayout x2CLinearLayout7 = x2CLinearLayout6;
        aVar8.mo163583a(context, layoutParams3, "X2CLinearLayout.LayoutParams", r4, 0, 0, 0);
        x2CTextView5.setLayoutParams(layoutParams3);
        x2CLinearLayout7.addView(x2CTextView5);
        C111851n.C111852a aVar9 = aVar8;
        X2CLinearLayout x2CLinearLayout8 = x2CLinearLayout7;
        mo163557f(context, x2CTextView5, "com.tencent.mm.view.x2c.X2CTextView", false, 2);
        Context context10 = context;
        String str6 = str4;
        WeImageView weImageView5 = (WeImageView) mo163559i(context10, str6, 3);
        if (weImageView5 == null) {
            weImageView5 = new WeImageView(context10, mo163560j());
        }
        WeImageView weImageView6 = weImageView5;
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(context10, mo163560j());
        Context context11 = context;
        WeImageView weImageView7 = weImageView6;
        String str7 = str5;
        aVar9.mo163594l(context10, layoutParams4, str7, mo163567r(context11, weImageView7, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, C0966R.dimen.f3736cp));
        aVar9.mo163592j(context10, layoutParams4, str7, -2);
        aVar9.mo163602t(context10, weImageView6, str6, mo163568s(context11, weImageView7, "com.tencent.mm.ui.widget.imageview.WeImageView", "@drawable/right_arrow", C0966R.C0969drawable.bq5));
        aVar5.mo163582a(context10, weImageView6, str6, mo163566q(context11, weImageView7, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/BW_0_Alpha_0_3", C0966R.color.BW_0_Alpha_0_3));
        WeImageView weImageView8 = weImageView6;
        X2CLinearLayout x2CLinearLayout9 = x2CLinearLayout8;
        aVar9.mo163583a(context, layoutParams4, "X2CLinearLayout.LayoutParams", 0, 0, mo163567r(context, weImageView7, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, C0966R.dimen.f3766df), 0);
        weImageView8.setLayoutParams(layoutParams4);
        x2CLinearLayout9.addView(weImageView8);
        Context context12 = context;
        mo163557f(context12, weImageView8, "com.tencent.mm.ui.widget.imageview.WeImageView", false, 3);
        mo163557f(context12, x2CLinearLayout9, "com.tencent.mm.view.x2c.X2CLinearLayout", true, 0);
        return x2CLinearLayout9;
    }

    /* renamed from: g */
    public View mo163513g(Context context, AttributeSet attributeSet, String str, int i) {
        String str2;
        int i2;
        Context context2;
        int i3;
        Context context3;
        String str3;
        X2CTextView x2CTextView;
        int i4;
        Context context4 = context;
        int i5 = i;
        if (i5 == 0) {
            mo163565p();
        }
        X2CLinearLayout x2CLinearLayout = null;
        if (i5 == 0) {
            X2CLinearLayout x2CLinearLayout2 = (X2CLinearLayout) mo163559i(context4, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            if (x2CLinearLayout2 != null) {
                C111851n.C111852a aVar = C111851n.f334884a;
                aVar.mo163589g(context4, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", C0966R.C0970id.ncl);
                aVar.mo163586d(context4, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", mo163568s(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/friendactivity_comment_list_normal", C0966R.C0969drawable.a6s));
                aVar.mo163588f(context4, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                aVar.mo163599q(context4, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            }
            mo163558h(context4, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            x2CLinearLayout = x2CLinearLayout2;
        }
        if (i5 == 1) {
            WeImageView weImageView = (WeImageView) mo163559i(context4, "com.tencent.mm.ui.widget.imageview.WeImageView", 1);
            if (weImageView != null) {
                weImageView.setImageDrawable(mo163568s(context, weImageView, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/icons_outlined_finder_icon", C0966R.raw.icons_outlined_finder_icon));
                weImageView.setIconColor(mo163566q(context, weImageView, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/Orange", C0966R.color.f2960ag));
            }
            mo163558h(context4, weImageView, "com.tencent.mm.ui.widget.imageview.WeImageView", 1);
            x2CLinearLayout = weImageView;
        }
        if (i5 == 2) {
            X2CTextView x2CTextView2 = (X2CTextView) mo163559i(context4, "com.tencent.mm.view.x2c.X2CTextView", 2);
            if (x2CTextView2 != null) {
                C111851n.C111852a aVar2 = C111851n.f334884a;
                aVar2.mo163589g(context4, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", C0966R.C0970id.ncn);
                aVar2.mo163587e(context4, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", TextUtils.TruncateAt.END);
                Context context5 = context;
                x2CTextView = x2CTextView2;
                aVar2.mo163596n(context4, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163569t(context5, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", 1, 0));
                aVar2.mo163603u(context4, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163570u(context5, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_post_finder_tip", C0966R.string.mpv));
                aVar2.mo163604v(context4, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163566q(context5, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", "@color/sns_word_color", C0966R.color.f356983ae1));
                int r = mo163567r(context5, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", 1, 6.0f, 0);
                int r2 = mo163567r(context5, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", 1, 6.0f, 0);
                str3 = "com.tencent.mm.view.x2c.X2CTextView";
                i4 = 2;
                str2 = "com.tencent.mm.ui.widget.imageview.WeImageView";
                i2 = i5;
                context2 = context4;
                aVar2.mo163584b(context, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", 0, r, 0, r2);
            } else {
                x2CTextView = x2CTextView2;
                str3 = "com.tencent.mm.view.x2c.X2CTextView";
                str2 = "com.tencent.mm.ui.widget.imageview.WeImageView";
                i2 = i5;
                context2 = context4;
                i4 = 2;
            }
            mo163558h(context2, x2CTextView, str3, i4);
            x2CLinearLayout = x2CTextView;
        } else {
            str2 = "com.tencent.mm.ui.widget.imageview.WeImageView";
            i2 = i5;
            context2 = context4;
        }
        if (i2 == 3) {
            WeImageView weImageView2 = (WeImageView) mo163559i(context2, str2, 3);
            if (weImageView2 != null) {
                context3 = context2;
                i3 = i2;
                weImageView2.setImageDrawable(mo163568s(context, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", "@drawable/right_arrow", C0966R.C0969drawable.bq5));
                weImageView2.setIconColor(mo163566q(context, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/BW_0_Alpha_0_3", C0966R.color.BW_0_Alpha_0_3));
            } else {
                context3 = context2;
                i3 = i2;
            }
            mo163558h(context3, weImageView2, str2, 3);
            x2CLinearLayout = weImageView2;
        } else {
            i3 = i2;
        }
        if (i3 == 3) {
            mo163564o();
        }
        return x2CLinearLayout;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f360010d34;
    }

    /* renamed from: k */
    public String mo163515k() {
        return "MicroMsg.X2C.Sns_Post_Finder_Item_X2c_X2C";
    }
}
