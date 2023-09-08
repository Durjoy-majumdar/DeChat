package p1161wh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveTextView;
import com.tencent.p014mm.view.x2c.X2CImageView;
import com.tencent.p014mm.view.x2c.X2CLinearLayout;
import com.tencent.p014mm.view.x2c.X2CTextView;
import wq3.C111838a;
import wq3.C111851n;

/* renamed from: wh.b */
public class C111801b extends C111838a {
    /* renamed from: c */
    public String mo163511c() {
        return "improve_translate_layout_x2c";
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
        aVar.mo163594l(context2, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        aVar.mo163592j(context2, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        aVar.mo163599q(context2, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        x2CLinearLayout2.setTag(C0966R.C0970id.mku, marginLayoutParams);
        mo163564o();
        X2CLinearLayout x2CLinearLayout3 = (X2CLinearLayout) mo163559i(context2, "com.tencent.mm.view.x2c.X2CLinearLayout", 1);
        if (x2CLinearLayout3 == null) {
            x2CLinearLayout3 = new X2CLinearLayout(context2, mo163560j());
        }
        X2CLinearLayout x2CLinearLayout4 = x2CLinearLayout3;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(context2, mo163560j());
        aVar.mo163589g(context2, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", C0966R.C0970id.f359420ku2);
        aVar.mo163594l(context2, layoutParams, "X2CLinearLayout.LayoutParams", -1);
        aVar.mo163592j(context2, layoutParams, "X2CLinearLayout.LayoutParams", -2);
        aVar.mo163599q(context2, x2CLinearLayout4, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        Context context3 = context;
        X2CLinearLayout x2CLinearLayout5 = x2CLinearLayout4;
        int r = mo163567r(context3, x2CLinearLayout5, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, C0966R.dimen.aor);
        int r2 = mo163567r(context3, x2CLinearLayout5, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, C0966R.dimen.aor);
        X2CLinearLayout x2CLinearLayout6 = x2CLinearLayout4;
        C111851n.C111852a aVar2 = aVar;
        X2CLinearLayout x2CLinearLayout7 = x2CLinearLayout2;
        String str = "X2CLinearLayout.LayoutParams";
        Context context4 = context2;
        aVar.mo163583a(context, layoutParams, "X2CLinearLayout.LayoutParams", 0, r, 0, r2);
        x2CLinearLayout6.setLayoutParams(layoutParams);
        x2CLinearLayout7.addView(x2CLinearLayout6);
        X2CImageView x2CImageView = (X2CImageView) mo163559i(context4, "com.tencent.mm.view.x2c.X2CImageView", 2);
        if (x2CImageView == null) {
            x2CImageView = new X2CImageView(context4, mo163560j());
        }
        X2CImageView x2CImageView2 = x2CImageView;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(context4, mo163560j());
        X2CLinearLayout x2CLinearLayout8 = x2CLinearLayout7;
        Context context5 = context;
        X2CImageView x2CImageView3 = x2CImageView2;
        X2CLinearLayout x2CLinearLayout9 = x2CLinearLayout8;
        C111851n.C111852a aVar3 = aVar2;
        X2CLinearLayout x2CLinearLayout10 = x2CLinearLayout6;
        Context context6 = context4;
        String str2 = str;
        aVar3.mo163594l(context6, layoutParams2, str2, mo163567r(context5, x2CImageView3, "com.tencent.mm.view.x2c.X2CImageView", 1, 0.0f, 0));
        aVar3.mo163592j(context6, layoutParams2, str2, mo163567r(context5, x2CImageView3, "com.tencent.mm.view.x2c.X2CImageView", 1, 0.5f, 0));
        aVar3.mo163591i(context6, layoutParams2, str2, 16);
        aVar3.mo163593k(context6, layoutParams2, str2, 1.0f);
        aVar3.mo163600r(context6, x2CImageView2, "com.tencent.mm.view.x2c.X2CImageView", ImageView.ScaleType.FIT_XY);
        aVar3.mo163602t(context6, x2CImageView2, "com.tencent.mm.view.x2c.X2CImageView", mo163568s(context5, x2CImageView3, "com.tencent.mm.view.x2c.X2CImageView", "@color/small_line_color", C0966R.color.abr));
        x2CImageView2.setLayoutParams(layoutParams2);
        x2CLinearLayout10.addView(x2CImageView2);
        mo163557f(context5, x2CImageView3, "com.tencent.mm.view.x2c.X2CImageView", false, 2);
        X2CTextView x2CTextView = (X2CTextView) mo163559i(context6, "com.tencent.mm.view.x2c.X2CTextView", 3);
        if (x2CTextView == null) {
            x2CTextView = new X2CTextView(context6, mo163560j());
        }
        X2CTextView x2CTextView2 = x2CTextView;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(context6, mo163560j());
        aVar3.mo163589g(context6, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", C0966R.C0970id.jws);
        aVar3.mo163594l(context6, layoutParams3, str2, -2);
        aVar3.mo163592j(context6, layoutParams3, str2, -2);
        aVar3.mo163591i(context6, layoutParams3, str2, 5);
        Context context7 = context;
        X2CTextView x2CTextView3 = x2CTextView2;
        aVar3.mo163604v(context6, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163566q(context7, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", "@color/sns_translate_brand_color", C0966R.color.adq));
        aVar3.mo163605w(context6, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163571v(context7, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 0, 0.0f, C0966R.dimen.aoq));
        X2CLinearLayout x2CLinearLayout11 = x2CLinearLayout10;
        Context context8 = context6;
        X2CTextView x2CTextView4 = x2CTextView2;
        String str3 = str2;
        X2CLinearLayout x2CLinearLayout12 = x2CLinearLayout9;
        aVar3.mo163583a(context, layoutParams3, "X2CLinearLayout.LayoutParams", mo163567r(context7, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 1, 5.0f, 0), 0, 0, 0);
        x2CTextView4.setLayoutParams(layoutParams3);
        x2CLinearLayout11.addView(x2CTextView4);
        X2CTextView x2CTextView5 = x2CTextView4;
        Context context9 = context;
        C111851n.C111852a aVar4 = aVar3;
        X2CTextView x2CTextView6 = x2CTextView5;
        Context context10 = context8;
        mo163557f(context9, x2CTextView6, "com.tencent.mm.view.x2c.X2CTextView", false, 3);
        mo163557f(context9, x2CLinearLayout11, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 1);
        ImproveTextView improveTextView = (ImproveTextView) mo163559i(context10, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", 4);
        if (improveTextView == null) {
            improveTextView = new ImproveTextView(context10, mo163560j());
        }
        ImproveTextView improveTextView2 = improveTextView;
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(context10, mo163560j());
        aVar4.mo163589g(context10, improveTextView2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", C0966R.C0970id.jwt);
        String str4 = str3;
        aVar4.mo163594l(context10, layoutParams4, str4, -2);
        aVar4.mo163592j(context10, layoutParams4, str4, -2);
        Context context11 = context;
        ImproveTextView improveTextView3 = improveTextView2;
        aVar4.mo163604v(context10, improveTextView2, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", mo163566q(context11, improveTextView3, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", "@color/sns_translate_loading_text_color", C0966R.color.ads));
        improveTextView2.setLayoutParams(layoutParams4);
        X2CLinearLayout x2CLinearLayout13 = x2CLinearLayout12;
        x2CLinearLayout13.addView(improveTextView2);
        mo163557f(context11, improveTextView3, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView", false, 4);
        mo163557f(context11, x2CLinearLayout13, "com.tencent.mm.view.x2c.X2CLinearLayout", true, 0);
        return x2CLinearLayout13;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.widget.TextView, android.view.View, com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView] */
    /* JADX WARNING: type inference failed for: r0v6, types: [android.widget.ImageView, android.view.View, com.tencent.mm.view.x2c.X2CImageView] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo163513g(android.content.Context r10, android.util.AttributeSet r11, java.lang.String r12, int r13) {
        /*
            r9 = this;
            if (r13 != 0) goto L_0x0005
            r9.mo163565p()
        L_0x0005:
            r11 = 0
            r12 = 0
            java.lang.String r0 = "com.tencent.mm.view.x2c.X2CLinearLayout"
            r1 = 1
            if (r13 != 0) goto L_0x001a
            android.view.View r11 = r9.mo163559i(r10, r0, r12)
            com.tencent.mm.view.x2c.X2CLinearLayout r11 = (com.tencent.p014mm.view.x2c.X2CLinearLayout) r11
            if (r11 == 0) goto L_0x0017
            r11.setOrientation(r1)
        L_0x0017:
            r9.mo163558h(r10, r11, r0, r12)
        L_0x001a:
            if (r13 != r1) goto L_0x0030
            android.view.View r11 = r9.mo163559i(r10, r0, r1)
            com.tencent.mm.view.x2c.X2CLinearLayout r11 = (com.tencent.p014mm.view.x2c.X2CLinearLayout) r11
            if (r11 == 0) goto L_0x002d
            r2 = 2131315620(0x7f094ba4, float:1.8249698E38)
            r11.setId(r2)
            r11.setOrientation(r12)
        L_0x002d:
            r9.mo163558h(r10, r11, r0, r1)
        L_0x0030:
            r12 = 2
            if (r13 != r12) goto L_0x005c
            java.lang.String r11 = "com.tencent.mm.view.x2c.X2CImageView"
            android.view.View r0 = r9.mo163559i(r10, r11, r12)
            com.tencent.mm.view.x2c.X2CImageView r0 = (com.tencent.p014mm.view.x2c.X2CImageView) r0
            if (r0 == 0) goto L_0x0058
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY
            java.lang.String r2 = "value"
            gy3.C87412m.m108594g(r1, r2)
            r0.setScaleType(r1)
            r6 = 2131101462(0x7f060716, float:1.7815334E38)
            java.lang.String r4 = "com.tencent.mm.view.x2c.X2CImageView"
            java.lang.String r5 = "@color/small_line_color"
            r1 = r9
            r2 = r10
            r3 = r0
            android.graphics.drawable.Drawable r1 = r1.mo163568s(r2, r3, r4, r5, r6)
            r0.setImageDrawable(r1)
        L_0x0058:
            r9.mo163558h(r10, r0, r11, r12)
            r11 = r0
        L_0x005c:
            r12 = 3
            if (r13 != r12) goto L_0x0095
            java.lang.String r11 = "com.tencent.mm.view.x2c.X2CTextView"
            android.view.View r0 = r9.mo163559i(r10, r11, r12)
            com.tencent.mm.view.x2c.X2CTextView r0 = (com.tencent.p014mm.view.x2c.X2CTextView) r0
            if (r0 == 0) goto L_0x0091
            wq3.n$a r8 = wq3.C111851n.f334884a
            r1 = 2131314138(0x7f0945da, float:1.8246693E38)
            r8.mo163589g(r10, r0, r11, r1)
            r6 = 2131101544(0x7f060768, float:1.78155E38)
            java.lang.String r4 = "com.tencent.mm.view.x2c.X2CTextView"
            java.lang.String r5 = "@color/sns_translate_brand_color"
            r1 = r9
            r2 = r10
            r3 = r0
            int r1 = r1.mo163566q(r2, r3, r4, r5, r6)
            r8.mo163604v(r10, r0, r11, r1)
            r5 = 0
            r6 = 0
            r7 = 2131167222(0x7f0707f6, float:1.7948711E38)
            java.lang.String r4 = "com.tencent.mm.view.x2c.X2CTextView"
            r1 = r9
            float r1 = r1.mo163571v(r2, r3, r4, r5, r6, r7)
            r8.mo163605w(r10, r0, r11, r1)
        L_0x0091:
            r9.mo163558h(r10, r0, r11, r12)
            r11 = r0
        L_0x0095:
            r12 = 4
            if (r13 != r12) goto L_0x00bd
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView"
            android.view.View r0 = r9.mo163559i(r10, r11, r12)
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView r0 = (com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveTextView) r0
            if (r0 == 0) goto L_0x00b9
            r1 = 2131314139(0x7f0945db, float:1.8246695E38)
            r0.setId(r1)
            r6 = 2131101546(0x7f06076a, float:1.7815505E38)
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView"
            java.lang.String r5 = "@color/sns_translate_loading_text_color"
            r1 = r9
            r2 = r10
            r3 = r0
            int r1 = r1.mo163566q(r2, r3, r4, r5, r6)
            r0.setTextColor(r1)
        L_0x00b9:
            r9.mo163558h(r10, r0, r11, r12)
            r11 = r0
        L_0x00bd:
            if (r13 != r12) goto L_0x00c2
            r9.mo163564o()
        L_0x00c2:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p1161wh.C111801b.mo163513g(android.content.Context, android.util.AttributeSet, java.lang.String, int):android.view.View");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d_a;
    }

    /* renamed from: k */
    public String mo163515k() {
        return "MicroMsg.X2C.Improve_Translate_Layout_X2c_X2C";
    }
}
