package p1161wh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.x2c.X2CImageView;
import com.tencent.p014mm.view.x2c.X2CLinearLayout;
import com.tencent.p014mm.view.x2c.X2CTextView;
import wq3.C111838a;
import wq3.C111851n;

/* renamed from: wh.e */
public class C111804e extends C111838a {
    /* renamed from: c */
    public String mo163511c() {
        return "sns_item_error_tip_x2c";
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
        aVar.mo163589g(context2, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", C0966R.C0970id.jv_);
        aVar.mo163594l(context2, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        aVar.mo163592j(context2, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        aVar.mo163586d(context2, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", mo163568s(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/friendactivity_comment_list_normal", C0966R.C0969drawable.a6s));
        aVar.mo163588f(context2, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
        aVar.mo163599q(context2, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        x2CLinearLayout2.setTag(C0966R.C0970id.mku, marginLayoutParams);
        mo163564o();
        X2CImageView x2CImageView = (X2CImageView) mo163559i(context2, "com.tencent.mm.view.x2c.X2CImageView", 1);
        if (x2CImageView == null) {
            x2CImageView = new X2CImageView(context2, mo163560j());
        }
        X2CImageView x2CImageView2 = x2CImageView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(context2, mo163560j());
        Context context3 = context;
        X2CImageView x2CImageView3 = x2CImageView2;
        aVar.mo163594l(context2, layoutParams, "X2CLinearLayout.LayoutParams", mo163567r(context3, x2CImageView3, "com.tencent.mm.view.x2c.X2CImageView", 1, 18.0f, 0));
        aVar.mo163592j(context2, layoutParams, "X2CLinearLayout.LayoutParams", mo163567r(context3, x2CImageView3, "com.tencent.mm.view.x2c.X2CImageView", 1, 18.0f, 0));
        aVar.mo163602t(context2, x2CImageView2, "com.tencent.mm.view.x2c.X2CImageView", mo163568s(context3, x2CImageView3, "com.tencent.mm.view.x2c.X2CImageView", "@drawable/state_failed", C0966R.C0969drawable.aur));
        String str = "X2CLinearLayout.LayoutParams";
        X2CImageView x2CImageView4 = x2CImageView2;
        X2CLinearLayout x2CLinearLayout3 = x2CLinearLayout2;
        aVar.mo163583a(context, layoutParams, "X2CLinearLayout.LayoutParams", mo163567r(context3, x2CImageView3, "com.tencent.mm.view.x2c.X2CImageView", 1, 10.0f, 0), 0, mo163567r(context3, x2CImageView3, "com.tencent.mm.view.x2c.X2CImageView", 1, 6.0f, 0), 0);
        x2CImageView4.setLayoutParams(layoutParams);
        x2CLinearLayout3.addView(x2CImageView4);
        Context context4 = context2;
        C111851n.C111852a aVar2 = aVar;
        X2CLinearLayout x2CLinearLayout4 = x2CLinearLayout3;
        mo163557f(context, x2CImageView4, "com.tencent.mm.view.x2c.X2CImageView", false, 1);
        X2CTextView x2CTextView = (X2CTextView) mo163559i(context4, "com.tencent.mm.view.x2c.X2CTextView", 2);
        if (x2CTextView == null) {
            x2CTextView = new X2CTextView(context4, mo163560j());
        }
        X2CTextView x2CTextView2 = x2CTextView;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(context4, mo163560j());
        aVar2.mo163589g(context4, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", C0966R.C0970id.hzs);
        aVar2.mo163594l(context4, layoutParams2, str, -2);
        aVar2.mo163592j(context4, layoutParams2, str, -2);
        aVar2.mo163591i(context4, layoutParams2, str, 17);
        aVar2.mo163588f(context4, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", 3);
        Context context5 = context;
        X2CTextView x2CTextView3 = x2CTextView2;
        aVar2.mo163603u(context4, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163570u(context5, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_post_error_touch_again", C0966R.string.jg7));
        aVar2.mo163604v(context4, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163566q(context5, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", "@color/sns_word_color", C0966R.color.f356983ae1));
        X2CLinearLayout x2CLinearLayout5 = x2CLinearLayout4;
        aVar2.mo163584b(context, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", 0, mo163567r(context5, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 1, 6.0f, 0), 0, mo163567r(context5, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 1, 6.0f, 0));
        x2CTextView3.setLayoutParams(layoutParams2);
        x2CLinearLayout5.addView(x2CTextView3);
        Context context6 = context;
        mo163557f(context6, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", false, 2);
        mo163557f(context6, x2CLinearLayout5, "com.tencent.mm.view.x2c.X2CLinearLayout", true, 0);
        return x2CLinearLayout5;
    }

    /* renamed from: g */
    public View mo163513g(Context context, AttributeSet attributeSet, String str, int i) {
        int i2;
        int i3;
        Context context2;
        X2CTextView x2CTextView;
        String str2;
        Context context3 = context;
        int i4 = i;
        if (i4 == 0) {
            mo163565p();
        }
        X2CLinearLayout x2CLinearLayout = null;
        if (i4 == 0) {
            X2CLinearLayout x2CLinearLayout2 = (X2CLinearLayout) mo163559i(context3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            if (x2CLinearLayout2 != null) {
                C111851n.C111852a aVar = C111851n.f334884a;
                aVar.mo163589g(context3, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", C0966R.C0970id.jv_);
                aVar.mo163586d(context3, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", mo163568s(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/friendactivity_comment_list_normal", C0966R.C0969drawable.a6s));
                aVar.mo163588f(context3, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 16);
                aVar.mo163599q(context3, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            }
            mo163558h(context3, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
            x2CLinearLayout = x2CLinearLayout2;
        }
        if (i4 == 1) {
            X2CImageView x2CImageView = (X2CImageView) mo163559i(context3, "com.tencent.mm.view.x2c.X2CImageView", 1);
            if (x2CImageView != null) {
                x2CImageView.setImageDrawable(mo163568s(context, x2CImageView, "com.tencent.mm.view.x2c.X2CImageView", "@drawable/state_failed", C0966R.C0969drawable.aur));
            }
            mo163558h(context3, x2CImageView, "com.tencent.mm.view.x2c.X2CImageView", 1);
            x2CLinearLayout = x2CImageView;
        }
        if (i4 == 2) {
            X2CTextView x2CTextView2 = (X2CTextView) mo163559i(context3, "com.tencent.mm.view.x2c.X2CTextView", 2);
            if (x2CTextView2 != null) {
                C111851n.C111852a aVar2 = C111851n.f334884a;
                aVar2.mo163589g(context3, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", C0966R.C0970id.hzs);
                aVar2.mo163588f(context3, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", 3);
                Context context4 = context;
                x2CTextView = x2CTextView2;
                aVar2.mo163603u(context3, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163570u(context4, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_post_error_touch_again", C0966R.string.jg7));
                aVar2.mo163604v(context3, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163566q(context4, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", "@color/sns_word_color", C0966R.color.f356983ae1));
                int r = mo163567r(context4, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", 1, 6.0f, 0);
                int r2 = mo163567r(context4, x2CTextView, "com.tencent.mm.view.x2c.X2CTextView", 1, 6.0f, 0);
                str2 = "com.tencent.mm.view.x2c.X2CTextView";
                i3 = 2;
                i2 = i4;
                context2 = context3;
                aVar2.mo163584b(context, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", 0, r, 0, r2);
            } else {
                x2CTextView = x2CTextView2;
                str2 = "com.tencent.mm.view.x2c.X2CTextView";
                i2 = i4;
                context2 = context3;
                i3 = 2;
            }
            mo163558h(context2, x2CTextView, str2, i3);
            x2CLinearLayout = x2CTextView;
        } else {
            i2 = i4;
            i3 = 2;
        }
        if (i2 == i3) {
            mo163564o();
        }
        return x2CLinearLayout;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d0j;
    }

    /* renamed from: k */
    public String mo163515k() {
        return "MicroMsg.X2C.Sns_Item_Error_Tip_X2c_X2C";
    }
}
