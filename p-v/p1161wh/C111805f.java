package p1161wh;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.view.x2c.X2CFrameLayout;
import com.tencent.p014mm.view.x2c.X2CLinearLayout;
import com.tencent.p014mm.view.x2c.X2CTextView;
import com.tencent.p014mm.view.x2c.X2CView;
import wq3.C111838a;
import wq3.C111851n;

/* renamed from: wh.f */
public class C111805f extends C111838a {
    /* renamed from: c */
    public String mo163511c() {
        return "sns_media_music_item_x2c";
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
        aVar.mo163594l(context2, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        aVar.mo163592j(context2, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        aVar.mo163588f(context2, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        aVar.mo163599q(context2, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        x2CLinearLayout2.setTag(C0966R.C0970id.mku, marginLayoutParams);
        mo163564o();
        RoundCornerRelativeLayout roundCornerRelativeLayout = (RoundCornerRelativeLayout) mo163559i(context2, "com.tencent.mm.ui.widget.RoundCornerRelativeLayout", 1);
        if (roundCornerRelativeLayout == null) {
            roundCornerRelativeLayout = new RoundCornerRelativeLayout(context2, mo163560j());
        }
        RoundCornerRelativeLayout roundCornerRelativeLayout2 = roundCornerRelativeLayout;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(context2, mo163560j());
        aVar.mo163589g(context2, roundCornerRelativeLayout2, "com.tencent.mm.ui.widget.RoundCornerRelativeLayout", C0966R.C0970id.iwu);
        Context context3 = context;
        LinearLayout.LayoutParams layoutParams2 = layoutParams;
        RoundCornerRelativeLayout roundCornerRelativeLayout3 = roundCornerRelativeLayout2;
        aVar.mo163594l(context2, layoutParams2, "X2CLinearLayout.LayoutParams", mo163567r(context3, roundCornerRelativeLayout2, "com.tencent.mm.ui.widget.RoundCornerRelativeLayout", 1, 268.0f, 0));
        String str = "X2CLinearLayout.LayoutParams";
        aVar.mo163592j(context2, layoutParams2, str, mo163567r(context3, roundCornerRelativeLayout3, "com.tencent.mm.ui.widget.RoundCornerRelativeLayout", 0, 0.0f, C0966R.dimen.f3705bx));
        RoundCornerRelativeLayout roundCornerRelativeLayout4 = roundCornerRelativeLayout3;
        roundCornerRelativeLayout4.setLayoutParams(layoutParams2);
        x2CLinearLayout2.addView(roundCornerRelativeLayout4);
        X2CView x2CView = (X2CView) mo163559i(context2, "com.tencent.mm.view.x2c.X2CView", 2);
        if (x2CView == null) {
            x2CView = new X2CView(context2, mo163560j());
        }
        X2CView x2CView2 = x2CView;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(context2, mo163560j());
        aVar.mo163589g(context2, x2CView2, "com.tencent.mm.view.x2c.X2CView", C0966R.C0970id.aft);
        aVar.mo163594l(context2, layoutParams3, "RoundCornerRelativeLayout.LayoutParams", -1);
        aVar.mo163592j(context2, layoutParams3, "RoundCornerRelativeLayout.LayoutParams", -1);
        x2CView2.setLayoutParams(layoutParams3);
        roundCornerRelativeLayout4.addView(x2CView2);
        X2CLinearLayout x2CLinearLayout3 = x2CLinearLayout2;
        String str2 = "RoundCornerRelativeLayout.LayoutParams";
        mo163557f(context, x2CView2, "com.tencent.mm.view.x2c.X2CView", false, 2);
        X2CFrameLayout x2CFrameLayout = (X2CFrameLayout) mo163559i(context2, "com.tencent.mm.view.x2c.X2CFrameLayout", 3);
        if (x2CFrameLayout == null) {
            x2CFrameLayout = new X2CFrameLayout(context2, mo163560j());
        }
        X2CFrameLayout x2CFrameLayout2 = x2CFrameLayout;
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(context2, mo163560j());
        aVar.mo163594l(context2, layoutParams4, str2, -1);
        aVar.mo163592j(context2, layoutParams4, str2, -1);
        X2CFrameLayout x2CFrameLayout3 = x2CFrameLayout2;
        String str3 = "com.tencent.mm.view.x2c.X2CView";
        aVar.mo163586d(context2, x2CFrameLayout3, "com.tencent.mm.view.x2c.X2CFrameLayout", mo163568s(context, x2CFrameLayout2, "com.tencent.mm.view.x2c.X2CFrameLayout", "@drawable/sns_music_mv_light_gradient_bg", C0966R.C0969drawable.atn));
        x2CFrameLayout3.setLayoutParams(layoutParams4);
        roundCornerRelativeLayout4.addView(x2CFrameLayout3);
        X2CLinearLayout x2CLinearLayout4 = (X2CLinearLayout) mo163559i(context2, "com.tencent.mm.view.x2c.X2CLinearLayout", 4);
        if (x2CLinearLayout4 == null) {
            x2CLinearLayout4 = new X2CLinearLayout(context2, mo163560j());
        }
        X2CLinearLayout x2CLinearLayout5 = x2CLinearLayout4;
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(context2, mo163560j());
        aVar.mo163589g(context2, x2CLinearLayout5, "com.tencent.mm.view.x2c.X2CLinearLayout", C0966R.C0970id.h5u);
        aVar.mo163594l(context2, layoutParams5, "X2CFrameLayout.LayoutParams", -1);
        aVar.mo163592j(context2, layoutParams5, "X2CFrameLayout.LayoutParams", -1);
        aVar.mo163588f(context2, x2CLinearLayout5, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        aVar.mo163599q(context2, x2CLinearLayout5, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        x2CLinearLayout5.setLayoutParams(layoutParams5);
        x2CFrameLayout3.addView(x2CLinearLayout5);
        MMRoundCornerImageView mMRoundCornerImageView = (MMRoundCornerImageView) mo163559i(context2, "com.tencent.mm.ui.widget.MMRoundCornerImageView", 5);
        if (mMRoundCornerImageView == null) {
            mMRoundCornerImageView = new MMRoundCornerImageView(context2, mo163560j());
        }
        MMRoundCornerImageView mMRoundCornerImageView2 = mMRoundCornerImageView;
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(context2, mo163560j());
        aVar.mo163589g(context2, mMRoundCornerImageView2, "com.tencent.mm.ui.widget.MMRoundCornerImageView", C0966R.C0970id.b7t);
        Context context4 = context;
        MMRoundCornerImageView mMRoundCornerImageView3 = mMRoundCornerImageView2;
        RoundCornerRelativeLayout roundCornerRelativeLayout5 = roundCornerRelativeLayout4;
        LinearLayout.LayoutParams layoutParams7 = layoutParams6;
        aVar.mo163594l(context2, layoutParams7, str, mo163567r(context4, mMRoundCornerImageView3, "com.tencent.mm.ui.widget.MMRoundCornerImageView", 0, 0.0f, C0966R.dimen.f3705bx));
        X2CFrameLayout x2CFrameLayout4 = x2CFrameLayout3;
        LinearLayout.LayoutParams layoutParams8 = layoutParams7;
        aVar.mo163592j(context2, layoutParams8, str, mo163567r(context4, mMRoundCornerImageView3, "com.tencent.mm.ui.widget.MMRoundCornerImageView", 0, 0.0f, C0966R.dimen.f3705bx));
        aVar.mo163600r(context2, mMRoundCornerImageView2, "com.tencent.mm.ui.widget.MMRoundCornerImageView", ImageView.ScaleType.CENTER_CROP);
        aVar.mo163602t(context2, mMRoundCornerImageView2, "com.tencent.mm.ui.widget.MMRoundCornerImageView", mo163568s(context4, mMRoundCornerImageView3, "com.tencent.mm.ui.widget.MMRoundCornerImageView", "@raw/icons_filled_music", C0966R.raw.icons_filled_music));
        mMRoundCornerImageView2.setLayoutParams(layoutParams8);
        x2CLinearLayout5.addView(mMRoundCornerImageView2);
        mo163557f(context4, mMRoundCornerImageView3, "com.tencent.mm.ui.widget.MMRoundCornerImageView", false, 5);
        X2CLinearLayout x2CLinearLayout6 = (X2CLinearLayout) mo163559i(context2, "com.tencent.mm.view.x2c.X2CLinearLayout", 6);
        if (x2CLinearLayout6 == null) {
            x2CLinearLayout6 = new X2CLinearLayout(context2, mo163560j());
        }
        X2CLinearLayout x2CLinearLayout7 = x2CLinearLayout6;
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(context2, mo163560j());
        Context context5 = context;
        X2CLinearLayout x2CLinearLayout8 = x2CLinearLayout7;
        aVar.mo163594l(context2, layoutParams9, str, mo163567r(context5, x2CLinearLayout8, "com.tencent.mm.view.x2c.X2CLinearLayout", 1, 0.0f, 0));
        aVar.mo163592j(context2, layoutParams9, str, -1);
        aVar.mo163593k(context2, layoutParams9, str, 1.0f);
        aVar.mo163588f(context2, x2CLinearLayout7, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        aVar.mo163599q(context2, x2CLinearLayout7, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        String str4 = str;
        X2CLinearLayout x2CLinearLayout9 = x2CLinearLayout5;
        String str5 = str3;
        int r = mo163567r(context5, x2CLinearLayout8, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, C0966R.dimen.f3766df);
        C111851n.C111852a aVar2 = aVar;
        X2CLinearLayout x2CLinearLayout10 = x2CLinearLayout7;
        X2CLinearLayout x2CLinearLayout11 = x2CLinearLayout3;
        X2CFrameLayout x2CFrameLayout5 = x2CFrameLayout4;
        Context context6 = context2;
        aVar.mo163583a(context, layoutParams9, "X2CLinearLayout.LayoutParams", r, 0, 0, 0);
        x2CLinearLayout10.setLayoutParams(layoutParams9);
        x2CLinearLayout9.addView(x2CLinearLayout10);
        X2CTextView x2CTextView = (X2CTextView) mo163559i(context6, "com.tencent.mm.view.x2c.X2CTextView", 7);
        if (x2CTextView == null) {
            x2CTextView = new X2CTextView(context6, mo163560j());
        }
        X2CTextView x2CTextView2 = x2CTextView;
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(context6, mo163560j());
        aVar2.mo163589g(context6, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", C0966R.C0970id.b7y);
        aVar2.mo163594l(context6, layoutParams10, str4, -1);
        aVar2.mo163592j(context6, layoutParams10, str4, -2);
        aVar2.mo163587e(context6, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", TextUtils.TruncateAt.END);
        aVar2.mo163601s(context6, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", true);
        C111851n.C111852a aVar3 = aVar2;
        X2CLinearLayout x2CLinearLayout12 = x2CLinearLayout10;
        Context context7 = context;
        Context context8 = context6;
        X2CTextView x2CTextView3 = x2CTextView2;
        X2CLinearLayout x2CLinearLayout13 = x2CLinearLayout9;
        String str6 = str4;
        aVar3.mo163604v(context8, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163566q(context7, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", "@color/normal_text_color", C0966R.color.a7f));
        Context context9 = context8;
        aVar3.mo163605w(context9, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163571v(context7, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, C0966R.dimen.f3879hn));
        x2CTextView2.setLayoutParams(layoutParams10);
        X2CLinearLayout x2CLinearLayout14 = x2CLinearLayout12;
        x2CLinearLayout14.addView(x2CTextView2);
        mo163557f(context7, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", false, 7);
        X2CTextView x2CTextView4 = (X2CTextView) mo163559i(context9, "com.tencent.mm.view.x2c.X2CTextView", 8);
        if (x2CTextView4 == null) {
            x2CTextView4 = new X2CTextView(context9, mo163560j());
        }
        X2CTextView x2CTextView5 = x2CTextView4;
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(context9, mo163560j());
        aVar3.mo163589g(context9, x2CTextView5, "com.tencent.mm.view.x2c.X2CTextView", C0966R.C0970id.b7x);
        aVar3.mo163594l(context9, layoutParams11, str6, -1);
        aVar3.mo163592j(context9, layoutParams11, str6, -2);
        aVar3.mo163587e(context9, x2CTextView5, "com.tencent.mm.view.x2c.X2CTextView", TextUtils.TruncateAt.END);
        Context context10 = context;
        X2CTextView x2CTextView6 = x2CTextView5;
        aVar3.mo163596n(context9, x2CTextView5, "com.tencent.mm.view.x2c.X2CTextView", mo163569t(context10, x2CTextView6, "com.tencent.mm.view.x2c.X2CTextView", 1, 0));
        aVar3.mo163603u(context9, x2CTextView5, "com.tencent.mm.view.x2c.X2CTextView", mo163570u(context10, x2CTextView6, "com.tencent.mm.view.x2c.X2CTextView", "BTS防弹少年团BTS防弹少年团", 0));
        aVar3.mo163604v(context9, x2CTextView5, "com.tencent.mm.view.x2c.X2CTextView", mo163566q(context10, x2CTextView6, "com.tencent.mm.view.x2c.X2CTextView", "@color/desc_text_color", C0966R.color.f3288ma));
        LinearLayout.LayoutParams layoutParams12 = layoutParams11;
        aVar3.mo163605w(context9, x2CTextView5, "com.tencent.mm.view.x2c.X2CTextView", mo163571v(context10, x2CTextView6, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, C0966R.dimen.f3964lm));
        aVar3.mo163606x(context9, x2CTextView5, "com.tencent.mm.view.x2c.X2CTextView", 8);
        X2CTextView x2CTextView7 = x2CTextView5;
        Context context11 = context9;
        X2CLinearLayout x2CLinearLayout15 = x2CLinearLayout14;
        String str7 = str6;
        aVar3.mo163583a(context, layoutParams12, "X2CLinearLayout.LayoutParams", 0, mo163567r(context10, x2CTextView6, "com.tencent.mm.view.x2c.X2CTextView", 1, 4.0f, 0), 0, 0);
        x2CTextView7.setLayoutParams(layoutParams12);
        x2CLinearLayout15.addView(x2CTextView7);
        C111851n.C111852a aVar4 = aVar3;
        String str8 = "com.tencent.mm.view.x2c.X2CTextView";
        X2CLinearLayout x2CLinearLayout16 = x2CLinearLayout15;
        mo163557f(context, x2CTextView7, "com.tencent.mm.view.x2c.X2CTextView", false, 8);
        String str9 = str5;
        X2CView x2CView3 = (X2CView) mo163559i(context11, str9, 9);
        if (x2CView3 == null) {
            x2CView3 = new X2CView(context11, mo163560j());
        }
        X2CView x2CView4 = x2CView3;
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(context11, mo163560j());
        aVar4.mo163589g(context11, x2CView4, str9, C0966R.C0970id.hqn);
        String str10 = str7;
        aVar4.mo163594l(context11, layoutParams13, str10, -1);
        Context context12 = context;
        X2CView x2CView5 = x2CView4;
        String str11 = str10;
        Context context13 = context11;
        aVar4.mo163592j(context13, layoutParams13, str11, mo163567r(context12, x2CView5, "com.tencent.mm.view.x2c.X2CView", 1, 0.0f, 0));
        aVar4.mo163593k(context13, layoutParams13, str11, 1.0f);
        aVar4.mo163606x(context13, x2CView4, str9, 8);
        x2CView4.setLayoutParams(layoutParams13);
        x2CLinearLayout16.addView(x2CView4);
        mo163557f(context12, x2CView5, "com.tencent.mm.view.x2c.X2CView", false, 9);
        X2CTextView x2CTextView8 = (X2CTextView) mo163559i(context13, str8, 10);
        if (x2CTextView8 == null) {
            x2CTextView8 = new X2CTextView(context13, mo163560j());
        }
        X2CTextView x2CTextView9 = x2CTextView8;
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(context13, mo163560j());
        aVar4.mo163589g(context13, x2CTextView9, str8, C0966R.C0970id.b7v);
        aVar4.mo163594l(context13, layoutParams14, str11, -1);
        aVar4.mo163592j(context13, layoutParams14, str11, -2);
        aVar4.mo163587e(context13, x2CTextView9, str8, TextUtils.TruncateAt.MIDDLE);
        aVar4.mo163601s(context13, x2CTextView9, str8, true);
        Context context14 = context;
        X2CTextView x2CTextView10 = x2CTextView9;
        aVar4.mo163604v(context13, x2CTextView9, str8, mo163566q(context14, x2CTextView10, "com.tencent.mm.view.x2c.X2CTextView", "@color/hint_text_color", C0966R.color.f3563xt));
        aVar4.mo163605w(context13, x2CTextView9, str8, mo163571v(context14, x2CTextView10, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, C0966R.dimen.f3640y));
        aVar4.mo163606x(context13, x2CTextView9, str8, 8);
        Context context15 = context13;
        X2CLinearLayout x2CLinearLayout17 = x2CLinearLayout16;
        aVar4.mo163583a(context, layoutParams14, "X2CLinearLayout.LayoutParams", 0, 0, 0, mo163567r(context14, x2CTextView10, "com.tencent.mm.view.x2c.X2CTextView", 1, 6.0f, 0));
        x2CTextView10.setLayoutParams(layoutParams14);
        x2CLinearLayout17.addView(x2CTextView10);
        Context context16 = context;
        C111851n.C111852a aVar5 = aVar4;
        String str12 = str11;
        mo163557f(context16, x2CTextView10, "com.tencent.mm.view.x2c.X2CTextView", false, 10);
        mo163557f(context16, x2CLinearLayout17, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 6);
        WeImageView weImageView = (WeImageView) mo163559i(context15, "com.tencent.mm.ui.widget.imageview.WeImageView", 11);
        if (weImageView == null) {
            weImageView = new WeImageView(context15, mo163560j());
        }
        WeImageView weImageView2 = weImageView;
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(context15, mo163560j());
        aVar5.mo163589g(context15, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", C0966R.C0970id.b7u);
        Context context17 = context;
        WeImageView weImageView3 = weImageView2;
        Context context18 = context15;
        aVar5.mo163594l(context18, layoutParams15, str12, mo163567r(context17, weImageView3, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 26.0f, 0));
        aVar5.mo163592j(context18, layoutParams15, str12, mo163567r(context17, weImageView3, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 26.0f, 0));
        aVar5.mo163600r(context18, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", ImageView.ScaleType.FIT_CENTER);
        aVar5.mo163602t(context18, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", mo163568s(context17, weImageView3, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/icons_outlined_play2", C0966R.raw.icons_outlined_play2));
        WeImageView weImageView4 = weImageView2;
        C111851n.C111852a aVar6 = aVar5;
        aVar5.mo163584b(context, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", mo163567r(context17, weImageView3, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0), mo163567r(context17, weImageView3, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0), mo163567r(context17, weImageView3, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0), mo163567r(context17, weImageView3, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0));
        WeImageView weImageView5 = weImageView4;
        LinearLayout.LayoutParams layoutParams16 = layoutParams15;
        WeImageView weImageView6 = weImageView5;
        aVar6.mo163583a(context, layoutParams16, "X2CLinearLayout.LayoutParams", mo163567r(context17, weImageView4, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, C0966R.dimen.f3723cd), 0, mo163567r(context17, weImageView5, "com.tencent.mm.ui.widget.imageview.WeImageView", 0, 0.0f, C0966R.dimen.f3723cd), 0);
        weImageView6.setLayoutParams(layoutParams16);
        X2CLinearLayout x2CLinearLayout18 = x2CLinearLayout13;
        x2CLinearLayout18.addView(weImageView6);
        Context context19 = context;
        mo163557f(context19, weImageView6, "com.tencent.mm.ui.widget.imageview.WeImageView", false, 11);
        mo163557f(context19, x2CLinearLayout18, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 4);
        mo163557f(context19, x2CFrameLayout5, "com.tencent.mm.view.x2c.X2CFrameLayout", false, 3);
        mo163557f(context19, roundCornerRelativeLayout5, "com.tencent.mm.ui.widget.RoundCornerRelativeLayout", false, 1);
        mo163557f(context19, x2CLinearLayout11, "com.tencent.mm.view.x2c.X2CLinearLayout", true, 0);
        return x2CLinearLayout11;
    }

    /* renamed from: g */
    public View mo163513g(Context context, AttributeSet attributeSet, String str, int i) {
        int i2;
        int i3;
        Context context2;
        WeImageView weImageView;
        String str2;
        X2CFrameLayout x2CFrameLayout;
        Context context3 = context;
        int i4 = i;
        if (i4 == 0) {
            mo163565p();
        }
        X2CTextView x2CTextView = null;
        if (i4 == 0) {
            x2CTextView = (X2CLinearLayout) mo163559i(context3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            if (x2CTextView != null) {
                C111851n.C111852a aVar = C111851n.f334884a;
                aVar.mo163588f(context3, x2CTextView, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                aVar.mo163599q(context3, x2CTextView, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            }
            mo163558h(context3, x2CTextView, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        }
        if (i4 == 1) {
            RoundCornerRelativeLayout roundCornerRelativeLayout = (RoundCornerRelativeLayout) mo163559i(context3, "com.tencent.mm.ui.widget.RoundCornerRelativeLayout", 1);
            if (roundCornerRelativeLayout != null) {
                roundCornerRelativeLayout.setId(C0966R.C0970id.iwu);
            }
            mo163558h(context3, roundCornerRelativeLayout, "com.tencent.mm.ui.widget.RoundCornerRelativeLayout", 1);
            x2CTextView = roundCornerRelativeLayout;
        }
        if (i4 == 2) {
            x2CTextView = (X2CView) mo163559i(context3, "com.tencent.mm.view.x2c.X2CView", 2);
            if (x2CTextView != null) {
                x2CTextView.setId(C0966R.C0970id.aft);
            }
            mo163558h(context3, x2CTextView, "com.tencent.mm.view.x2c.X2CView", 2);
        }
        if (i4 == 3) {
            X2CFrameLayout x2CFrameLayout2 = (X2CFrameLayout) mo163559i(context3, "com.tencent.mm.view.x2c.X2CFrameLayout", 3);
            if (x2CFrameLayout2 != null) {
                x2CFrameLayout = x2CFrameLayout2;
                x2CFrameLayout.setBackground(mo163568s(context, x2CFrameLayout2, "com.tencent.mm.view.x2c.X2CFrameLayout", "@drawable/sns_music_mv_light_gradient_bg", C0966R.C0969drawable.atn));
            } else {
                x2CFrameLayout = x2CFrameLayout2;
            }
            mo163558h(context3, x2CFrameLayout, "com.tencent.mm.view.x2c.X2CFrameLayout", 3);
            x2CTextView = x2CFrameLayout;
        }
        if (i4 == 4) {
            x2CTextView = (X2CLinearLayout) mo163559i(context3, "com.tencent.mm.view.x2c.X2CLinearLayout", 4);
            if (x2CTextView != null) {
                C111851n.C111852a aVar2 = C111851n.f334884a;
                aVar2.mo163589g(context3, x2CTextView, "com.tencent.mm.view.x2c.X2CLinearLayout", C0966R.C0970id.h5u);
                aVar2.mo163588f(context3, x2CTextView, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                aVar2.mo163599q(context3, x2CTextView, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            }
            mo163558h(context3, x2CTextView, "com.tencent.mm.view.x2c.X2CLinearLayout", 4);
        }
        if (i4 == 5) {
            MMRoundCornerImageView mMRoundCornerImageView = (MMRoundCornerImageView) mo163559i(context3, "com.tencent.mm.ui.widget.MMRoundCornerImageView", 5);
            if (mMRoundCornerImageView != null) {
                C111851n.C111852a aVar3 = C111851n.f334884a;
                aVar3.mo163589g(context3, mMRoundCornerImageView, "com.tencent.mm.ui.widget.MMRoundCornerImageView", C0966R.C0970id.b7t);
                aVar3.mo163600r(context3, mMRoundCornerImageView, "com.tencent.mm.ui.widget.MMRoundCornerImageView", ImageView.ScaleType.CENTER_CROP);
                aVar3.mo163602t(context3, mMRoundCornerImageView, "com.tencent.mm.ui.widget.MMRoundCornerImageView", mo163568s(context, mMRoundCornerImageView, "com.tencent.mm.ui.widget.MMRoundCornerImageView", "@raw/icons_filled_music", C0966R.raw.icons_filled_music));
            }
            mo163558h(context3, mMRoundCornerImageView, "com.tencent.mm.ui.widget.MMRoundCornerImageView", 5);
            x2CTextView = mMRoundCornerImageView;
        }
        if (i4 == 6) {
            x2CTextView = (X2CLinearLayout) mo163559i(context3, "com.tencent.mm.view.x2c.X2CLinearLayout", 6);
            if (x2CTextView != null) {
                C111851n.C111852a aVar4 = C111851n.f334884a;
                aVar4.mo163588f(context3, x2CTextView, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                aVar4.mo163599q(context3, x2CTextView, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
            }
            mo163558h(context3, x2CTextView, "com.tencent.mm.view.x2c.X2CLinearLayout", 6);
        }
        if (i4 == 7) {
            X2CTextView x2CTextView2 = (X2CTextView) mo163559i(context3, "com.tencent.mm.view.x2c.X2CTextView", 7);
            if (x2CTextView2 != null) {
                C111851n.C111852a aVar5 = C111851n.f334884a;
                aVar5.mo163589g(context3, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", C0966R.C0970id.b7y);
                aVar5.mo163587e(context3, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", TextUtils.TruncateAt.END);
                aVar5.mo163601s(context3, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", true);
                Context context4 = context;
                X2CTextView x2CTextView3 = x2CTextView2;
                aVar5.mo163604v(context3, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163566q(context4, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", "@color/normal_text_color", C0966R.color.a7f));
                aVar5.mo163605w(context3, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163571v(context4, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, C0966R.dimen.f3879hn));
            }
            mo163558h(context3, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", 7);
            x2CTextView = x2CTextView2;
        }
        if (i4 == 8) {
            X2CTextView x2CTextView4 = (X2CTextView) mo163559i(context3, "com.tencent.mm.view.x2c.X2CTextView", 8);
            if (x2CTextView4 != null) {
                C111851n.C111852a aVar6 = C111851n.f334884a;
                aVar6.mo163589g(context3, x2CTextView4, "com.tencent.mm.view.x2c.X2CTextView", C0966R.C0970id.b7x);
                aVar6.mo163587e(context3, x2CTextView4, "com.tencent.mm.view.x2c.X2CTextView", TextUtils.TruncateAt.END);
                Context context5 = context;
                X2CTextView x2CTextView5 = x2CTextView4;
                aVar6.mo163596n(context3, x2CTextView4, "com.tencent.mm.view.x2c.X2CTextView", mo163569t(context5, x2CTextView5, "com.tencent.mm.view.x2c.X2CTextView", 1, 0));
                aVar6.mo163603u(context3, x2CTextView4, "com.tencent.mm.view.x2c.X2CTextView", mo163570u(context5, x2CTextView5, "com.tencent.mm.view.x2c.X2CTextView", "BTS防弹少年团BTS防弹少年团", 0));
                aVar6.mo163604v(context3, x2CTextView4, "com.tencent.mm.view.x2c.X2CTextView", mo163566q(context5, x2CTextView5, "com.tencent.mm.view.x2c.X2CTextView", "@color/desc_text_color", C0966R.color.f3288ma));
                aVar6.mo163605w(context3, x2CTextView4, "com.tencent.mm.view.x2c.X2CTextView", mo163571v(context5, x2CTextView5, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, C0966R.dimen.f3964lm));
                aVar6.mo163606x(context3, x2CTextView4, "com.tencent.mm.view.x2c.X2CTextView", 8);
            }
            mo163558h(context3, x2CTextView4, "com.tencent.mm.view.x2c.X2CTextView", 8);
            x2CTextView = x2CTextView4;
        }
        if (i4 == 9) {
            x2CTextView = (X2CView) mo163559i(context3, "com.tencent.mm.view.x2c.X2CView", 9);
            if (x2CTextView != null) {
                C111851n.C111852a aVar7 = C111851n.f334884a;
                aVar7.mo163589g(context3, x2CTextView, "com.tencent.mm.view.x2c.X2CView", C0966R.C0970id.hqn);
                aVar7.mo163606x(context3, x2CTextView, "com.tencent.mm.view.x2c.X2CView", 8);
            }
            mo163558h(context3, x2CTextView, "com.tencent.mm.view.x2c.X2CView", 9);
        }
        if (i4 == 10) {
            X2CTextView x2CTextView6 = (X2CTextView) mo163559i(context3, "com.tencent.mm.view.x2c.X2CTextView", 10);
            if (x2CTextView6 != null) {
                C111851n.C111852a aVar8 = C111851n.f334884a;
                aVar8.mo163589g(context3, x2CTextView6, "com.tencent.mm.view.x2c.X2CTextView", C0966R.C0970id.b7v);
                aVar8.mo163587e(context3, x2CTextView6, "com.tencent.mm.view.x2c.X2CTextView", TextUtils.TruncateAt.MIDDLE);
                aVar8.mo163601s(context3, x2CTextView6, "com.tencent.mm.view.x2c.X2CTextView", true);
                Context context6 = context;
                X2CTextView x2CTextView7 = x2CTextView6;
                aVar8.mo163604v(context3, x2CTextView6, "com.tencent.mm.view.x2c.X2CTextView", mo163566q(context6, x2CTextView7, "com.tencent.mm.view.x2c.X2CTextView", "@color/hint_text_color", C0966R.color.f3563xt));
                aVar8.mo163605w(context3, x2CTextView6, "com.tencent.mm.view.x2c.X2CTextView", mo163571v(context6, x2CTextView7, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, C0966R.dimen.f3640y));
                aVar8.mo163606x(context3, x2CTextView6, "com.tencent.mm.view.x2c.X2CTextView", 8);
            }
            mo163558h(context3, x2CTextView6, "com.tencent.mm.view.x2c.X2CTextView", 10);
            x2CTextView = x2CTextView6;
        }
        if (i4 == 11) {
            WeImageView weImageView2 = (WeImageView) mo163559i(context3, "com.tencent.mm.ui.widget.imageview.WeImageView", 11);
            if (weImageView2 != null) {
                C111851n.C111852a aVar9 = C111851n.f334884a;
                aVar9.mo163589g(context3, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", C0966R.C0970id.b7u);
                aVar9.mo163600r(context3, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", ImageView.ScaleType.FIT_CENTER);
                Context context7 = context;
                weImageView = weImageView2;
                aVar9.mo163602t(context3, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", mo163568s(context7, weImageView, "com.tencent.mm.ui.widget.imageview.WeImageView", "@raw/icons_outlined_play2", C0966R.raw.icons_outlined_play2));
                int r = mo163567r(context7, weImageView, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0);
                int r2 = mo163567r(context7, weImageView, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0);
                int r3 = mo163567r(context7, weImageView, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0);
                int r4 = mo163567r(context7, weImageView, "com.tencent.mm.ui.widget.imageview.WeImageView", 1, 1.0f, 0);
                str2 = "com.tencent.mm.ui.widget.imageview.WeImageView";
                i3 = 11;
                i2 = i4;
                context2 = context3;
                aVar9.mo163584b(context, weImageView2, "com.tencent.mm.ui.widget.imageview.WeImageView", r, r2, r3, r4);
            } else {
                weImageView = weImageView2;
                str2 = "com.tencent.mm.ui.widget.imageview.WeImageView";
                i2 = i4;
                context2 = context3;
                i3 = 11;
            }
            mo163558h(context2, weImageView, str2, i3);
            x2CTextView = weImageView;
        } else {
            i2 = i4;
            i3 = 11;
        }
        if (i2 == i3) {
            mo163564o();
        }
        return x2CTextView;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f360008d32;
    }

    /* renamed from: k */
    public String mo163515k() {
        return "MicroMsg.X2C.Sns_Media_Music_Item_X2c_X2C";
    }
}
