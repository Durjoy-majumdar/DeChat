package p1161wh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.view.x2c.X2CImageView;
import com.tencent.p014mm.view.x2c.X2CLinearLayout;
import com.tencent.p014mm.view.x2c.X2CRelativeLayout;
import com.tencent.p014mm.view.x2c.X2CTextView;
import wq3.C111838a;
import wq3.C111841c;
import wq3.C111851n;

/* renamed from: wh.c */
public class C111802c extends C111838a {
    /* renamed from: c */
    public String mo163511c() {
        return "sns_finder_live_time_line_item_x2c";
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
        aVar.mo163589g(context2, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", C0966R.C0970id.jtc);
        aVar.mo163594l(context2, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        aVar.mo163592j(context2, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        x2CRelativeLayout2.setTag(C0966R.C0970id.mku, marginLayoutParams);
        mo163564o();
        X2CImageView x2CImageView = (X2CImageView) mo163559i(context2, "com.tencent.mm.view.x2c.X2CImageView", 1);
        if (x2CImageView == null) {
            x2CImageView = new X2CImageView(context2, mo163560j());
        }
        X2CImageView x2CImageView2 = x2CImageView;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(context2, mo163560j());
        aVar.mo163589g(context2, x2CImageView2, "com.tencent.mm.view.x2c.X2CImageView", C0966R.C0970id.jtg);
        aVar.mo163594l(context2, layoutParams, "X2CRelativeLayout.LayoutParams", -1);
        aVar.mo163592j(context2, layoutParams, "X2CRelativeLayout.LayoutParams", -1);
        aVar.mo163600r(context2, x2CImageView2, "com.tencent.mm.view.x2c.X2CImageView", ImageView.ScaleType.CENTER_CROP);
        Context context3 = context;
        X2CImageView x2CImageView3 = x2CImageView2;
        aVar.mo163602t(context2, x2CImageView2, "com.tencent.mm.view.x2c.X2CImageView", mo163568s(context3, x2CImageView3, "com.tencent.mm.view.x2c.X2CImageView", "@color/BG_3", C0966R.color.f2930d));
        x2CImageView2.setLayoutParams(layoutParams);
        x2CRelativeLayout2.addView(x2CImageView2);
        mo163557f(context3, x2CImageView3, "com.tencent.mm.view.x2c.X2CImageView", false, 1);
        X2CLinearLayout x2CLinearLayout = (X2CLinearLayout) mo163559i(context2, "com.tencent.mm.view.x2c.X2CLinearLayout", 2);
        if (x2CLinearLayout == null) {
            x2CLinearLayout = new X2CLinearLayout(context2, mo163560j());
        }
        X2CLinearLayout x2CLinearLayout2 = x2CLinearLayout;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(context2, mo163560j());
        aVar.mo163589g(context2, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", C0966R.C0970id.nf5);
        aVar.mo163594l(context2, layoutParams2, "X2CRelativeLayout.LayoutParams", -2);
        Context context4 = context;
        X2CLinearLayout x2CLinearLayout3 = x2CLinearLayout2;
        aVar.mo163592j(context2, layoutParams2, "X2CRelativeLayout.LayoutParams", mo163567r(context4, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 18.0f, 0));
        aVar.mo163588f(context2, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        aVar.mo163586d(context2, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", mo163568s(context4, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/finder_live_logo_bg", C0966R.C0969drawable.a0d));
        aVar.mo163598p(context2, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", mo163567r(context4, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, C0966R.dimen.f3757d9));
        aVar.mo163606x(context2, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 8);
        int r = mo163567r(context4, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, C0966R.dimen.f3703bv);
        int r2 = mo163567r(context4, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, C0966R.dimen.f3703bv);
        int r3 = mo163567r(context4, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, C0966R.dimen.f3703bv);
        int r4 = mo163567r(context4, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, C0966R.dimen.f3703bv);
        RelativeLayout.LayoutParams layoutParams3 = layoutParams2;
        X2CLinearLayout x2CLinearLayout4 = x2CLinearLayout2;
        C111851n.C111852a aVar2 = aVar;
        String str = "com.tencent.mm.view.x2c.X2CLinearLayout";
        X2CRelativeLayout x2CRelativeLayout3 = x2CRelativeLayout2;
        String str2 = "X2CRelativeLayout.LayoutParams";
        Context context5 = context2;
        aVar.mo163583a(context, layoutParams3, "X2CRelativeLayout.LayoutParams", r, r2, r3, r4);
        x2CLinearLayout4.setLayoutParams(layoutParams3);
        x2CRelativeLayout3.addView(x2CLinearLayout4);
        WeImageView weImageView = (WeImageView) mo163559i(context5, "com.tencent.mm.ui.widget.imageview.WeImageView", 3);
        if (weImageView == null) {
            weImageView = new WeImageView(context5, mo163560j());
        }
        WeImageView weImageView2 = weImageView;
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(context5, mo163560j());
        C111851n.C111852a aVar3 = aVar2;
        Context context6 = context;
        WeImageView weImageView3 = weImageView2;
        Context context7 = context5;
        String str3 = str2;
        String str4 = str;
        X2CLinearLayout x2CLinearLayout5 = x2CLinearLayout4;
        aVar3.mo163594l(context7, layoutParams4, "X2CLinearLayout.LayoutParams", mo163567r(context6, weImageView3, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, C0966R.dimen.f3723cd));
        aVar3.mo163592j(context7, layoutParams4, "X2CLinearLayout.LayoutParams", mo163567r(context6, weImageView3, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, C0966R.dimen.f3723cd));
        aVar3.mo163602t(context7, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", mo163568s(context6, weImageView3, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/finder_live_logo", C0966R.raw.finder_live_logo));
        C111841c.C111842a aVar4 = C111841c.f334881a;
        aVar4.mo163582a(context7, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", mo163566q(context6, weImageView3, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/White", C0966R.color.f2975b6));
        C111841c.C111842a aVar5 = aVar4;
        X2CRelativeLayout x2CRelativeLayout4 = x2CRelativeLayout3;
        X2CLinearLayout x2CLinearLayout6 = x2CLinearLayout5;
        X2CRelativeLayout x2CRelativeLayout5 = x2CRelativeLayout4;
        String str5 = "X2CLinearLayout.LayoutParams";
        C111851n.C111852a aVar6 = aVar3;
        WeImageView weImageView4 = weImageView2;
        aVar3.mo163583a(context, layoutParams4, "X2CLinearLayout.LayoutParams", mo163567r(context6, weImageView3, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, C0966R.dimen.f3703bv), 0, 0, 0);
        weImageView4.setLayoutParams(layoutParams4);
        x2CLinearLayout6.addView(weImageView4);
        String str6 = "com.tencent.mm.ui.widget.imageview.WeImageView";
        C111851n.C111852a aVar7 = aVar6;
        X2CLinearLayout x2CLinearLayout7 = x2CLinearLayout6;
        mo163557f(context, weImageView4, "com.tencent.mm.ui.widget.imageview.WeImageView", false, 3);
        Context context8 = context;
        X2CTextView x2CTextView = (X2CTextView) mo163559i(context8, "com.tencent.mm.view.x2c.X2CTextView", 4);
        if (x2CTextView == null) {
            x2CTextView = new X2CTextView(context8, mo163560j());
        }
        X2CTextView x2CTextView2 = x2CTextView;
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(context8, mo163560j());
        aVar7.mo163589g(context8, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", C0966R.C0970id.nf6);
        aVar7.mo163594l(context8, layoutParams5, str5, -2);
        aVar7.mo163592j(context8, layoutParams5, str5, -2);
        Context context9 = context;
        X2CTextView x2CTextView3 = x2CTextView2;
        aVar7.mo163603u(context8, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163570u(context9, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", "@string/finder_live_share_tag_text", C0966R.string.f360689e71));
        aVar7.mo163604v(context8, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163566q(context9, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", "@color/White", C0966R.color.f2975b6));
        String str7 = str5;
        X2CRelativeLayout x2CRelativeLayout6 = x2CRelativeLayout5;
        aVar7.mo163605w(context8, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163571v(context9, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, C0966R.dimen.f3645a3));
        LinearLayout.LayoutParams layoutParams6 = layoutParams5;
        X2CTextView x2CTextView4 = x2CTextView2;
        X2CLinearLayout x2CLinearLayout8 = x2CLinearLayout7;
        C111851n.C111852a aVar8 = aVar7;
        aVar7.mo163583a(context, layoutParams6, "X2CLinearLayout.LayoutParams", mo163567r(context9, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, C0966R.dimen.f3701bu), 0, mo163567r(context9, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, C0966R.dimen.f3766df), 0);
        x2CTextView4.setLayoutParams(layoutParams6);
        x2CLinearLayout8.addView(x2CTextView4);
        String str8 = str6;
        Context context10 = context;
        String str9 = "com.tencent.mm.view.x2c.X2CTextView";
        Context context11 = context8;
        mo163557f(context10, x2CTextView4, "com.tencent.mm.view.x2c.X2CTextView", false, 4);
        mo163557f(context10, x2CLinearLayout8, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 2);
        String str10 = str4;
        X2CLinearLayout x2CLinearLayout9 = (X2CLinearLayout) mo163559i(context11, str10, 5);
        if (x2CLinearLayout9 == null) {
            x2CLinearLayout9 = new X2CLinearLayout(context11, mo163560j());
        }
        X2CLinearLayout x2CLinearLayout10 = x2CLinearLayout9;
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(context11, mo163560j());
        C111851n.C111852a aVar9 = aVar8;
        aVar9.mo163589g(context11, x2CLinearLayout10, str10, C0966R.C0970id.nej);
        String str11 = str3;
        aVar9.mo163590h(context11, layoutParams7, str11, -1);
        aVar9.mo163594l(context11, layoutParams7, str11, -2);
        aVar9.mo163592j(context11, layoutParams7, str11, -2);
        aVar9.mo163606x(context11, x2CLinearLayout10, str10, 8);
        x2CLinearLayout10.setLayoutParams(layoutParams7);
        X2CRelativeLayout x2CRelativeLayout7 = x2CRelativeLayout6;
        x2CRelativeLayout7.addView(x2CLinearLayout10);
        WeImageView weImageView5 = (WeImageView) mo163559i(context11, str8, 6);
        if (weImageView5 == null) {
            weImageView5 = new WeImageView(context11, mo163560j());
        }
        WeImageView weImageView6 = weImageView5;
        Context context12 = context;
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(context11, mo163560j());
        WeImageView weImageView7 = weImageView6;
        X2CRelativeLayout x2CRelativeLayout8 = x2CRelativeLayout7;
        String str12 = str7;
        aVar9.mo163594l(context11, layoutParams8, str12, mo163567r(context12, weImageView6, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, C0966R.dimen.f3743cv));
        WeImageView weImageView8 = weImageView7;
        String str13 = str12;
        aVar9.mo163592j(context11, layoutParams8, str13, mo163567r(context12, weImageView8, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, C0966R.dimen.f3743cv));
        WeImageView weImageView9 = weImageView7;
        aVar9.mo163602t(context11, weImageView9, str8, mo163568s(context12, weImageView8, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/finder_live_logo", C0966R.raw.finder_live_logo));
        WeImageView weImageView10 = weImageView9;
        aVar5.mo163582a(context11, weImageView9, str8, mo163566q(context12, weImageView10, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/White", C0966R.color.f2975b6));
        weImageView9.setLayoutParams(layoutParams8);
        x2CLinearLayout10.addView(weImageView9);
        mo163557f(context, weImageView10, "com.tencent.mm.ui.widget.imageview.WeImageView", false, 6);
        X2CTextView x2CTextView5 = (X2CTextView) mo163559i(context11, str9, 7);
        if (x2CTextView5 == null) {
            x2CTextView5 = new X2CTextView(context11, mo163560j());
        }
        X2CTextView x2CTextView6 = x2CTextView5;
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(context11, mo163560j());
        aVar9.mo163589g(context11, x2CTextView6, str9, C0966R.C0970id.nek);
        aVar9.mo163594l(context11, layoutParams9, str13, -2);
        aVar9.mo163592j(context11, layoutParams9, str13, -2);
        Context context13 = context;
        X2CTextView x2CTextView7 = x2CTextView6;
        aVar9.mo163603u(context11, x2CTextView6, str9, mo163570u(context13, x2CTextView7, "com.tencent.mm.view.x2c.X2CTextView", "@string/finder_live_end", C0966R.string.dkt));
        aVar9.mo163604v(context11, x2CTextView6, str9, mo163566q(context13, x2CTextView7, "com.tencent.mm.view.x2c.X2CTextView", "@color/White", C0966R.color.f2975b6));
        aVar9.mo163605w(context11, x2CTextView6, str9, mo163571v(context13, x2CTextView7, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, C0966R.dimen.f3927j7));
        LinearLayout.LayoutParams layoutParams10 = layoutParams9;
        String str14 = str11;
        X2CTextView x2CTextView8 = x2CTextView6;
        C111851n.C111852a aVar10 = aVar9;
        X2CLinearLayout x2CLinearLayout11 = x2CLinearLayout10;
        aVar9.mo163583a(context, layoutParams10, "X2CLinearLayout.LayoutParams", mo163567r(context13, x2CTextView7, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, C0966R.dimen.f3703bv), 0, 0, 0);
        x2CTextView8.setLayoutParams(layoutParams10);
        x2CLinearLayout11.addView(x2CTextView8);
        X2CLinearLayout x2CLinearLayout12 = x2CLinearLayout11;
        Context context14 = context11;
        Context context15 = context;
        String str15 = str9;
        String str16 = str14;
        mo163557f(context15, x2CTextView8, "com.tencent.mm.view.x2c.X2CTextView", false, 7);
        mo163557f(context15, x2CLinearLayout12, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 5);
        X2CTextView x2CTextView9 = (X2CTextView) mo163559i(context14, str15, 8);
        if (x2CTextView9 == null) {
            x2CTextView9 = new X2CTextView(context14, mo163560j());
        }
        X2CTextView x2CTextView10 = x2CTextView9;
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(context14, mo163560j());
        C111851n.C111852a aVar11 = aVar10;
        aVar11.mo163589g(context14, x2CTextView10, str15, C0966R.C0970id.f358052mq2);
        aVar11.mo163594l(context14, layoutParams11, str16, -2);
        aVar11.mo163592j(context14, layoutParams11, str16, -2);
        aVar11.mo163591i(context14, layoutParams11, str16, 17);
        aVar11.mo163588f(context14, x2CTextView10, str15, 17);
        Context context16 = context;
        X2CTextView x2CTextView11 = x2CTextView10;
        aVar11.mo163604v(context14, x2CTextView10, str15, mo163566q(context16, x2CTextView11, "com.tencent.mm.view.x2c.X2CTextView", "#b3ffffff", 0));
        aVar11.mo163605w(context14, x2CTextView10, str15, mo163571v(context16, x2CTextView11, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, C0966R.dimen.f3879hn));
        aVar11.mo163606x(context14, x2CTextView10, str15, 8);
        aVar11.mo163590h(context14, layoutParams11, str16, -1);
        x2CTextView10.setLayoutParams(layoutParams11);
        X2CRelativeLayout x2CRelativeLayout9 = x2CRelativeLayout8;
        x2CRelativeLayout9.addView(x2CTextView10);
        mo163557f(context16, x2CTextView11, "com.tencent.mm.view.x2c.X2CTextView", false, 8);
        mo163557f(context16, x2CRelativeLayout9, "com.tencent.mm.view.x2c.X2CRelativeLayout", true, 0);
        return x2CRelativeLayout9;
    }

    /* renamed from: g */
    public View mo163513g(Context context, AttributeSet attributeSet, String str, int i) {
        Context context2 = context;
        int i2 = i;
        if (i2 == 0) {
            mo163565p();
        }
        View view = null;
        if (i2 == 0) {
            View view2 = (X2CRelativeLayout) mo163559i(context2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
            if (view2 != null) {
                view2.setId(C0966R.C0970id.jtc);
            }
            mo163558h(context2, view2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
            view = view2;
        }
        if (i2 == 1) {
            View view3 = (X2CImageView) mo163559i(context2, "com.tencent.mm.view.x2c.X2CImageView", 1);
            if (view3 != null) {
                C111851n.C111852a aVar = C111851n.f334884a;
                aVar.mo163589g(context2, view3, "com.tencent.mm.view.x2c.X2CImageView", C0966R.C0970id.jtg);
                aVar.mo163600r(context2, view3, "com.tencent.mm.view.x2c.X2CImageView", ImageView.ScaleType.CENTER_CROP);
                aVar.mo163602t(context2, view3, "com.tencent.mm.view.x2c.X2CImageView", mo163568s(context, view3, "com.tencent.mm.view.x2c.X2CImageView", "@color/BG_3", C0966R.color.f2930d));
            }
            mo163558h(context2, view3, "com.tencent.mm.view.x2c.X2CImageView", 1);
            view = view3;
        }
        if (i2 == 2) {
            View view4 = (X2CLinearLayout) mo163559i(context2, "com.tencent.mm.view.x2c.X2CLinearLayout", 2);
            if (view4 != null) {
                C111851n.C111852a aVar2 = C111851n.f334884a;
                aVar2.mo163589g(context2, view4, "com.tencent.mm.view.x2c.X2CLinearLayout", C0966R.C0970id.nf5);
                aVar2.mo163588f(context2, view4, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                Context context3 = context;
                View view5 = view4;
                aVar2.mo163586d(context2, view4, "com.tencent.mm.view.x2c.X2CLinearLayout", mo163568s(context3, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/finder_live_logo_bg", C0966R.C0969drawable.a0d));
                aVar2.mo163598p(context2, view4, "com.tencent.mm.view.x2c.X2CLinearLayout", mo163567r(context3, view5, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, C0966R.dimen.f3757d9));
                aVar2.mo163606x(context2, view4, "com.tencent.mm.view.x2c.X2CLinearLayout", 8);
            }
            mo163558h(context2, view4, "com.tencent.mm.view.x2c.X2CLinearLayout", 2);
            view = view4;
        }
        if (i2 == 3) {
            WeImageView weImageView = (WeImageView) mo163559i(context2, "com.tencent.mm.ui.widget.imageview.WeImageView", 3);
            if (weImageView != null) {
                weImageView.setImageDrawable(mo163568s(context, weImageView, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/finder_live_logo", C0966R.raw.finder_live_logo));
                weImageView.setIconColor(mo163566q(context, weImageView, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/White", C0966R.color.f2975b6));
            }
            mo163558h(context2, weImageView, "com.tencent.mm.ui.widget.imageview.WeImageView", 3);
            view = weImageView;
        }
        if (i2 == 4) {
            View view6 = (X2CTextView) mo163559i(context2, "com.tencent.mm.view.x2c.X2CTextView", 4);
            if (view6 != null) {
                C111851n.C111852a aVar3 = C111851n.f334884a;
                aVar3.mo163589g(context2, view6, "com.tencent.mm.view.x2c.X2CTextView", C0966R.C0970id.nf6);
                Context context4 = context;
                View view7 = view6;
                aVar3.mo163603u(context2, view6, "com.tencent.mm.view.x2c.X2CTextView", mo163570u(context4, view7, "com.tencent.mm.view.x2c.X2CTextView", "@string/finder_live_share_tag_text", C0966R.string.f360689e71));
                aVar3.mo163604v(context2, view6, "com.tencent.mm.view.x2c.X2CTextView", mo163566q(context4, view7, "com.tencent.mm.view.x2c.X2CTextView", "@color/White", C0966R.color.f2975b6));
                aVar3.mo163605w(context2, view6, "com.tencent.mm.view.x2c.X2CTextView", mo163571v(context4, view7, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, C0966R.dimen.f3645a3));
            }
            mo163558h(context2, view6, "com.tencent.mm.view.x2c.X2CTextView", 4);
            view = view6;
        }
        if (i2 == 5) {
            view = (X2CLinearLayout) mo163559i(context2, "com.tencent.mm.view.x2c.X2CLinearLayout", 5);
            if (view != null) {
                C111851n.C111852a aVar4 = C111851n.f334884a;
                aVar4.mo163589g(context2, view, "com.tencent.mm.view.x2c.X2CLinearLayout", C0966R.C0970id.nej);
                aVar4.mo163606x(context2, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 8);
            }
            mo163558h(context2, view, "com.tencent.mm.view.x2c.X2CLinearLayout", 5);
        }
        if (i2 == 6) {
            WeImageView weImageView2 = (WeImageView) mo163559i(context2, "com.tencent.mm.ui.widget.imageview.WeImageView", 6);
            if (weImageView2 != null) {
                weImageView2.setImageDrawable(mo163568s(context, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/finder_live_logo", C0966R.raw.finder_live_logo));
                weImageView2.setIconColor(mo163566q(context, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", "@color/White", C0966R.color.f2975b6));
            }
            mo163558h(context2, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", 6);
            view = weImageView2;
        }
        if (i2 == 7) {
            View view8 = (X2CTextView) mo163559i(context2, "com.tencent.mm.view.x2c.X2CTextView", 7);
            if (view8 != null) {
                C111851n.C111852a aVar5 = C111851n.f334884a;
                aVar5.mo163589g(context2, view8, "com.tencent.mm.view.x2c.X2CTextView", C0966R.C0970id.nek);
                Context context5 = context;
                View view9 = view8;
                aVar5.mo163603u(context2, view8, "com.tencent.mm.view.x2c.X2CTextView", mo163570u(context5, view9, "com.tencent.mm.view.x2c.X2CTextView", "@string/finder_live_end", C0966R.string.dkt));
                aVar5.mo163604v(context2, view8, "com.tencent.mm.view.x2c.X2CTextView", mo163566q(context5, view9, "com.tencent.mm.view.x2c.X2CTextView", "@color/White", C0966R.color.f2975b6));
                aVar5.mo163605w(context2, view8, "com.tencent.mm.view.x2c.X2CTextView", mo163571v(context5, view9, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, C0966R.dimen.f3927j7));
            }
            mo163558h(context2, view8, "com.tencent.mm.view.x2c.X2CTextView", 7);
            view = view8;
        }
        int i3 = 8;
        if (i2 == 8) {
            View view10 = (X2CTextView) mo163559i(context2, "com.tencent.mm.view.x2c.X2CTextView", 8);
            if (view10 != null) {
                C111851n.C111852a aVar6 = C111851n.f334884a;
                aVar6.mo163589g(context2, view10, "com.tencent.mm.view.x2c.X2CTextView", C0966R.C0970id.f358052mq2);
                aVar6.mo163588f(context2, view10, "com.tencent.mm.view.x2c.X2CTextView", 17);
                Context context6 = context;
                View view11 = view10;
                aVar6.mo163604v(context2, view10, "com.tencent.mm.view.x2c.X2CTextView", mo163566q(context6, view11, "com.tencent.mm.view.x2c.X2CTextView", "#b3ffffff", 0));
                aVar6.mo163605w(context2, view10, "com.tencent.mm.view.x2c.X2CTextView", mo163571v(context6, view11, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, C0966R.dimen.f3879hn));
                i3 = 8;
                aVar6.mo163606x(context2, view10, "com.tencent.mm.view.x2c.X2CTextView", 8);
            } else {
                i3 = 8;
            }
            mo163558h(context2, view10, "com.tencent.mm.view.x2c.X2CTextView", i3);
            view = view10;
        }
        if (i2 == i3) {
            mo163564o();
        }
        return view;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d0h;
    }

    /* renamed from: k */
    public String mo163515k() {
        return "MicroMsg.X2C.Sns_Finder_Live_Time_Line_Item_X2c_X2C";
    }
}
