package p1161wh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMTextView;
import com.tencent.p014mm.plugin.sns.p106ui.TagImageView;
import com.tencent.p014mm.view.x2c.X2CFrameLayout;
import com.tencent.p014mm.view.x2c.X2CImageView;
import com.tencent.p014mm.view.x2c.X2CLinearLayout;
import com.tencent.p014mm.view.x2c.X2CTextView;
import wq3.C111838a;
import wq3.C111851n;

/* renamed from: wh.h */
public class C111807h extends C111838a {
    /* renamed from: c */
    public String mo163511c() {
        return "sns_other_time_line_item_x2c";
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
        aVar.mo163589g(context2, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", C0966R.C0970id.f358729gq2);
        aVar.mo163594l(context2, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        aVar.mo163592j(context2, marginLayoutParams, "ViewGroup.MarginLayoutParams", -2);
        Context context3 = context;
        X2CLinearLayout x2CLinearLayout3 = x2CLinearLayout2;
        aVar.mo163586d(context2, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", mo163568s(context3, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", "@drawable/sns_media_link_bg", C0966R.C0969drawable.atk));
        aVar.mo163599q(context2, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", 0);
        int r = mo163567r(context3, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, C0966R.dimen.f3623g);
        int r2 = mo163567r(context3, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, C0966R.dimen.f3623g);
        int r3 = mo163567r(context3, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, C0966R.dimen.f3623g);
        int r4 = mo163567r(context3, x2CLinearLayout3, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, C0966R.dimen.f3623g);
        C111851n.C111852a aVar2 = aVar;
        X2CLinearLayout x2CLinearLayout4 = x2CLinearLayout2;
        String str = "com.tencent.mm.view.x2c.X2CLinearLayout";
        Context context4 = context2;
        aVar.mo163584b(context, x2CLinearLayout2, "com.tencent.mm.view.x2c.X2CLinearLayout", r, r2, r3, r4);
        x2CLinearLayout4.setTag(C0966R.C0970id.mku, marginLayoutParams);
        mo163564o();
        X2CFrameLayout x2CFrameLayout = (X2CFrameLayout) mo163559i(context4, "com.tencent.mm.view.x2c.X2CFrameLayout", 1);
        if (x2CFrameLayout == null) {
            x2CFrameLayout = new X2CFrameLayout(context4, mo163560j());
        }
        X2CFrameLayout x2CFrameLayout2 = x2CFrameLayout;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(context4, mo163560j());
        aVar2.mo163594l(context4, layoutParams, "X2CLinearLayout.LayoutParams", -2);
        aVar2.mo163592j(context4, layoutParams, "X2CLinearLayout.LayoutParams", -1);
        aVar2.mo163591i(context4, layoutParams, "X2CLinearLayout.LayoutParams", 16);
        X2CLinearLayout x2CLinearLayout5 = x2CLinearLayout4;
        C111851n.C111852a aVar3 = aVar2;
        Context context5 = context4;
        aVar3.mo163597o(context5, x2CFrameLayout2, "com.tencent.mm.view.x2c.X2CFrameLayout", mo163567r(context, x2CFrameLayout2, "com.tencent.mm.view.x2c.X2CFrameLayout", 1, 42.0f, 0));
        aVar3.mo163599q(context5, x2CFrameLayout2, "com.tencent.mm.view.x2c.X2CFrameLayout", 1);
        x2CFrameLayout2.setLayoutParams(layoutParams);
        x2CLinearLayout5.addView(x2CFrameLayout2);
        TagImageView tagImageView = (TagImageView) mo163559i(context5, "com.tencent.mm.plugin.sns.ui.TagImageView", 2);
        if (tagImageView == null) {
            tagImageView = new TagImageView(context5, mo163560j());
        }
        TagImageView tagImageView2 = tagImageView;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(context5, mo163560j());
        aVar3.mo163589g(context5, tagImageView2, "com.tencent.mm.plugin.sns.ui.TagImageView", C0966R.C0970id.f4p);
        Context context6 = context;
        FrameLayout.LayoutParams layoutParams3 = layoutParams2;
        TagImageView tagImageView3 = tagImageView2;
        aVar3.mo163594l(context5, layoutParams3, "X2CFrameLayout.LayoutParams", mo163567r(context6, tagImageView2, "com.tencent.mm.plugin.sns.ui.TagImageView", 1, 42.0f, 0));
        TagImageView tagImageView4 = tagImageView3;
        String str2 = "X2CFrameLayout.LayoutParams";
        aVar3.mo163592j(context5, layoutParams3, str2, mo163567r(context6, tagImageView4, "com.tencent.mm.plugin.sns.ui.TagImageView", 1, 42.0f, 0));
        TagImageView tagImageView5 = tagImageView3;
        aVar3.mo163595m(context5, tagImageView5, "com.tencent.mm.plugin.sns.ui.TagImageView", mo163567r(context6, tagImageView4, "com.tencent.mm.plugin.sns.ui.TagImageView", 1, 350.0f, 0));
        aVar3.mo163600r(context5, tagImageView5, "com.tencent.mm.plugin.sns.ui.TagImageView", ImageView.ScaleType.CENTER_CROP);
        tagImageView5.setContentDescription(mo163570u(context6, tagImageView5, "com.tencent.mm.plugin.sns.ui.TagImageView", "@string/sns_img", C0966R.string.jd8));
        aVar3.mo163591i(context5, layoutParams3, str2, 16);
        tagImageView5.setLayoutParams(layoutParams3);
        x2CFrameLayout2.addView(tagImageView5);
        mo163557f(context, tagImageView5, "com.tencent.mm.plugin.sns.ui.TagImageView", false, 2);
        X2CImageView x2CImageView = (X2CImageView) mo163559i(context5, "com.tencent.mm.view.x2c.X2CImageView", 3);
        if (x2CImageView == null) {
            x2CImageView = new X2CImageView(context5, mo163560j());
        }
        X2CImageView x2CImageView2 = x2CImageView;
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(context5, mo163560j());
        aVar3.mo163589g(context5, x2CImageView2, "com.tencent.mm.view.x2c.X2CImageView", C0966R.C0970id.k0s);
        Context context7 = context;
        X2CImageView x2CImageView3 = x2CImageView2;
        X2CLinearLayout x2CLinearLayout6 = x2CLinearLayout5;
        FrameLayout.LayoutParams layoutParams5 = layoutParams4;
        aVar3.mo163594l(context5, layoutParams5, str2, mo163567r(context7, x2CImageView3, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, C0966R.dimen.f3738cr));
        aVar3.mo163592j(context5, layoutParams5, str2, mo163567r(context7, x2CImageView3, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, C0966R.dimen.f3738cr));
        aVar3.mo163595m(context5, x2CImageView2, "com.tencent.mm.view.x2c.X2CImageView", mo163567r(context7, x2CImageView3, "com.tencent.mm.view.x2c.X2CImageView", 1, 350.0f, 0));
        x2CImageView2.setImportantForAccessibility(2);
        aVar3.mo163591i(context5, layoutParams5, str2, 17);
        x2CImageView2.setLayoutParams(layoutParams5);
        x2CFrameLayout2.addView(x2CImageView2);
        mo163557f(context, x2CImageView2, "com.tencent.mm.view.x2c.X2CImageView", false, 3);
        X2CTextView x2CTextView = (X2CTextView) mo163559i(context5, "com.tencent.mm.view.x2c.X2CTextView", 4);
        if (x2CTextView == null) {
            x2CTextView = new X2CTextView(context5, mo163560j());
        }
        X2CTextView x2CTextView2 = x2CTextView;
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(context5, mo163560j());
        aVar3.mo163589g(context5, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", C0966R.C0970id.f357791bs2);
        Context context8 = context;
        X2CTextView x2CTextView3 = x2CTextView2;
        FrameLayout.LayoutParams layoutParams7 = layoutParams6;
        aVar3.mo163594l(context5, layoutParams7, str2, mo163567r(context8, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 1, 42.0f, 0));
        aVar3.mo163592j(context5, layoutParams7, str2, mo163567r(context8, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 1, 42.0f, 0));
        aVar3.mo163596n(context5, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163569t(context8, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 3, 0));
        aVar3.mo163587e(context5, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", TextUtils.TruncateAt.END);
        aVar3.mo163588f(context5, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", 17);
        aVar3.mo163586d(context5, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163568s(context8, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", "@color/BG_0", C0966R.color.f2927a));
        aVar3.mo163606x(context5, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", 8);
        aVar3.mo163591i(context5, layoutParams7, str2, 16);
        x2CTextView2.setLayoutParams(layoutParams7);
        x2CFrameLayout2.addView(x2CTextView2);
        mo163557f(context8, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", false, 4);
        mo163557f(context8, x2CFrameLayout2, "com.tencent.mm.view.x2c.X2CFrameLayout", false, 1);
        String str3 = str;
        X2CLinearLayout x2CLinearLayout7 = (X2CLinearLayout) mo163559i(context5, str3, 5);
        if (x2CLinearLayout7 == null) {
            x2CLinearLayout7 = new X2CLinearLayout(context5, mo163560j());
        }
        X2CLinearLayout x2CLinearLayout8 = x2CLinearLayout7;
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(context5, mo163560j());
        aVar3.mo163594l(context5, layoutParams8, "X2CLinearLayout.LayoutParams", -1);
        aVar3.mo163592j(context5, layoutParams8, "X2CLinearLayout.LayoutParams", -1);
        aVar3.mo163591i(context5, layoutParams8, "X2CLinearLayout.LayoutParams", 16);
        aVar3.mo163588f(context5, x2CLinearLayout8, str3, 16);
        aVar3.mo163599q(context5, x2CLinearLayout8, str3, 1);
        X2CLinearLayout x2CLinearLayout9 = x2CLinearLayout8;
        X2CLinearLayout x2CLinearLayout10 = x2CLinearLayout6;
        Context context9 = context5;
        String str4 = "X2CLinearLayout.LayoutParams";
        C111851n.C111852a aVar4 = aVar3;
        aVar3.mo163583a(context, layoutParams8, "X2CLinearLayout.LayoutParams", mo163567r(context, x2CLinearLayout8, "com.tencent.mm.view.x2c.X2CLinearLayout", 0, 0.0f, C0966R.dimen.f3956le), 0, 0, 0);
        x2CLinearLayout9.setLayoutParams(layoutParams8);
        x2CLinearLayout10.addView(x2CLinearLayout9);
        MMTextView mMTextView = (MMTextView) mo163559i(context9, "com.tencent.mm.ui.widget.MMTextView", 6);
        if (mMTextView == null) {
            mMTextView = new MMTextView(context9, mo163560j());
        }
        MMTextView mMTextView2 = mMTextView;
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(context9, mo163560j());
        aVar4.mo163589g(context9, mMTextView2, "com.tencent.mm.ui.widget.MMTextView", C0966R.C0970id.kpq);
        aVar4.mo163594l(context9, layoutParams9, str4, -1);
        aVar4.mo163592j(context9, layoutParams9, str4, -2);
        aVar4.mo163601s(context9, mMTextView2, "com.tencent.mm.ui.widget.MMTextView", false);
        aVar4.mo163587e(context9, mMTextView2, "com.tencent.mm.ui.widget.MMTextView", TextUtils.TruncateAt.END);
        Context context10 = context9;
        String str5 = str4;
        Context context11 = context;
        C111851n.C111852a aVar5 = aVar4;
        MMTextView mMTextView3 = mMTextView2;
        X2CLinearLayout x2CLinearLayout11 = x2CLinearLayout10;
        X2CLinearLayout x2CLinearLayout12 = x2CLinearLayout9;
        aVar5.mo163604v(context10, mMTextView2, "com.tencent.mm.ui.widget.MMTextView", mo163566q(context11, mMTextView3, "com.tencent.mm.ui.widget.MMTextView", "@color/normal_text_color", C0966R.color.a7f));
        aVar5.mo163605w(context10, mMTextView2, "com.tencent.mm.ui.widget.MMTextView", mo163571v(context11, mMTextView3, "com.tencent.mm.ui.widget.MMTextView", 0, 0.0f, C0966R.dimen.f3881hq));
        mMTextView2.setLayoutParams(layoutParams9);
        x2CLinearLayout12.addView(mMTextView2);
        mo163557f(context11, mMTextView3, "com.tencent.mm.ui.widget.MMTextView", false, 6);
        MMTextView mMTextView4 = (MMTextView) mo163559i(context10, "com.tencent.mm.ui.widget.MMTextView", 7);
        if (mMTextView4 == null) {
            mMTextView4 = new MMTextView(context10, mo163560j());
        }
        MMTextView mMTextView5 = mMTextView4;
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(context10, mo163560j());
        aVar5.mo163589g(context10, mMTextView5, "com.tencent.mm.ui.widget.MMTextView", C0966R.C0970id.iub);
        aVar5.mo163594l(context10, layoutParams10, str5, -1);
        aVar5.mo163592j(context10, layoutParams10, str5, -2);
        aVar5.mo163601s(context10, mMTextView5, "com.tencent.mm.ui.widget.MMTextView", true);
        Context context12 = context;
        MMTextView mMTextView6 = mMTextView5;
        aVar5.mo163604v(context10, mMTextView5, "com.tencent.mm.ui.widget.MMTextView", mo163566q(context12, mMTextView6, "com.tencent.mm.ui.widget.MMTextView", "@color/sns_word_color", C0966R.color.f356983ae1));
        aVar5.mo163605w(context10, mMTextView5, "com.tencent.mm.ui.widget.MMTextView", mo163571v(context12, mMTextView6, "com.tencent.mm.ui.widget.MMTextView", 1, 12.0f, 0));
        mMTextView5.setLayoutParams(layoutParams10);
        x2CLinearLayout12.addView(mMTextView5);
        mo163557f(context12, mMTextView6, "com.tencent.mm.ui.widget.MMTextView", false, 7);
        mo163557f(context12, x2CLinearLayout12, "com.tencent.mm.view.x2c.X2CLinearLayout", false, 5);
        mo163557f(context12, x2CLinearLayout11, "com.tencent.mm.view.x2c.X2CLinearLayout", true, 0);
        return x2CLinearLayout11;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v44, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: com.tencent.mm.view.x2c.X2CLinearLayout} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo163513g(android.content.Context r21, android.util.AttributeSet r22, java.lang.String r23, int r24) {
        /*
            r20 = this;
            r7 = r20
            r15 = r21
            r14 = r24
            if (r14 != 0) goto L_0x000b
            r20.mo163565p()
        L_0x000b:
            r0 = 0
            java.lang.String r13 = "com.tencent.mm.view.x2c.X2CLinearLayout"
            r12 = 0
            if (r14 != 0) goto L_0x007f
            android.view.View r0 = r7.mo163559i(r15, r13, r12)
            r11 = r0
            com.tencent.mm.view.x2c.X2CLinearLayout r11 = (com.tencent.p014mm.view.x2c.X2CLinearLayout) r11
            if (r11 == 0) goto L_0x0075
            wq3.n$a r8 = wq3.C111851n.f334884a
            r0 = 2131309066(0x7f09320a, float:1.8236405E38)
            r8.mo163589g(r15, r11, r13, r0)
            r5 = 2131234977(0x7f0810a1, float:1.8086135E38)
            java.lang.String r3 = "com.tencent.mm.view.x2c.X2CLinearLayout"
            java.lang.String r4 = "@drawable/sns_media_link_bg"
            r0 = r20
            r1 = r21
            r2 = r11
            android.graphics.drawable.Drawable r0 = r0.mo163568s(r1, r2, r3, r4, r5)
            r8.mo163586d(r15, r11, r13, r0)
            r8.mo163599q(r15, r11, r13, r12)
            r9 = 0
            r10 = 0
            r16 = 2131165190(0x7f070006, float:1.794459E38)
            r4 = 0
            r5 = 0
            r6 = 2131165190(0x7f070006, float:1.794459E38)
            java.lang.String r3 = "com.tencent.mm.view.x2c.X2CLinearLayout"
            r0 = r20
            int r17 = r0.mo163567r(r1, r2, r3, r4, r5, r6)
            java.lang.String r3 = "com.tencent.mm.view.x2c.X2CLinearLayout"
            int r18 = r0.mo163567r(r1, r2, r3, r4, r5, r6)
            java.lang.String r3 = "com.tencent.mm.view.x2c.X2CLinearLayout"
            int r19 = r0.mo163567r(r1, r2, r3, r4, r5, r6)
            java.lang.String r3 = "com.tencent.mm.view.x2c.X2CLinearLayout"
            r4 = r9
            r5 = r10
            r6 = r16
            int r0 = r0.mo163567r(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = "com.tencent.mm.view.x2c.X2CLinearLayout"
            r9 = r21
            r10 = r11
            r11 = r1
            r6 = 0
            r12 = r17
            r5 = r13
            r13 = r18
            r4 = r14
            r14 = r19
            r3 = r15
            r15 = r0
            r8.mo163584b(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x007a
        L_0x0075:
            r2 = r11
            r5 = r13
            r4 = r14
            r3 = r15
            r6 = 0
        L_0x007a:
            r7.mo163558h(r3, r2, r5, r6)
            r0 = r2
            goto L_0x0083
        L_0x007f:
            r5 = r13
            r4 = r14
            r3 = r15
            r6 = 0
        L_0x0083:
            r8 = 1
            if (r4 != r8) goto L_0x00bc
            java.lang.String r9 = "com.tencent.mm.view.x2c.X2CFrameLayout"
            android.view.View r0 = r7.mo163559i(r3, r9, r8)
            r10 = r0
            com.tencent.mm.view.x2c.X2CFrameLayout r10 = (com.tencent.p014mm.view.x2c.X2CFrameLayout) r10
            if (r10 == 0) goto L_0x00b2
            wq3.n$a r11 = wq3.C111851n.f334884a
            r12 = 1
            r13 = 1109917696(0x42280000, float:42.0)
            r14 = 0
            java.lang.String r15 = "com.tencent.mm.view.x2c.X2CFrameLayout"
            r0 = r20
            r1 = r21
            r2 = r10
            r8 = r3
            r3 = r15
            r15 = r4
            r4 = r12
            r12 = r5
            r5 = r13
            r13 = 0
            r6 = r14
            int r0 = r0.mo163567r(r1, r2, r3, r4, r5, r6)
            r11.mo163597o(r8, r10, r9, r0)
            r0 = 1
            r11.mo163599q(r8, r10, r9, r0)
            goto L_0x00b7
        L_0x00b2:
            r8 = r3
            r15 = r4
            r12 = r5
            r0 = 1
            r13 = 0
        L_0x00b7:
            r7.mo163558h(r8, r10, r9, r0)
            r0 = r10
            goto L_0x00c0
        L_0x00bc:
            r8 = r3
            r15 = r4
            r12 = r5
            r13 = 0
        L_0x00c0:
            r9 = 2
            if (r15 != r9) goto L_0x0101
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ui.TagImageView"
            android.view.View r0 = r7.mo163559i(r8, r10, r9)
            r11 = r0
            com.tencent.mm.plugin.sns.ui.TagImageView r11 = (com.tencent.p014mm.plugin.sns.p106ui.TagImageView) r11
            if (r11 == 0) goto L_0x00fd
            wq3.n$a r14 = wq3.C111851n.f334884a
            r0 = 2131306309(0x7f092745, float:1.8230813E38)
            r14.mo163589g(r8, r11, r10, r0)
            r4 = 1
            r5 = 1135542272(0x43af0000, float:350.0)
            r6 = 0
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.TagImageView"
            r0 = r20
            r1 = r21
            r2 = r11
            int r0 = r0.mo163567r(r1, r2, r3, r4, r5, r6)
            r14.mo163595m(r8, r11, r10, r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r14.mo163600r(r8, r11, r10, r0)
            r5 = 2131836953(0x7f114019, float:1.9307087E38)
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.TagImageView"
            java.lang.String r4 = "@string/sns_img"
            r0 = r20
            java.lang.String r0 = r0.mo163570u(r1, r2, r3, r4, r5)
            r11.setContentDescription(r0)
        L_0x00fd:
            r7.mo163558h(r8, r11, r10, r9)
            r0 = r11
        L_0x0101:
            r10 = 3
            if (r15 != r10) goto L_0x0134
            java.lang.String r11 = "com.tencent.mm.view.x2c.X2CImageView"
            android.view.View r0 = r7.mo163559i(r8, r11, r10)
            r14 = r0
            com.tencent.mm.view.x2c.X2CImageView r14 = (com.tencent.p014mm.view.x2c.X2CImageView) r14
            if (r14 == 0) goto L_0x0130
            wq3.n$a r6 = wq3.C111851n.f334884a
            r0 = 2131314316(0x7f09468c, float:1.8247054E38)
            r6.mo163589g(r8, r14, r11, r0)
            r4 = 1
            r5 = 1135542272(0x43af0000, float:350.0)
            r16 = 0
            java.lang.String r3 = "com.tencent.mm.view.x2c.X2CImageView"
            r0 = r20
            r1 = r21
            r2 = r14
            r13 = r6
            r6 = r16
            int r0 = r0.mo163567r(r1, r2, r3, r4, r5, r6)
            r13.mo163595m(r8, r14, r11, r0)
            r14.setImportantForAccessibility(r9)
        L_0x0130:
            r7.mo163558h(r8, r14, r11, r10)
            r0 = r14
        L_0x0134:
            r6 = 4
            if (r15 != r6) goto L_0x017c
            java.lang.String r9 = "com.tencent.mm.view.x2c.X2CTextView"
            android.view.View r0 = r7.mo163559i(r8, r9, r6)
            r10 = r0
            com.tencent.mm.view.x2c.X2CTextView r10 = (com.tencent.p014mm.view.x2c.X2CTextView) r10
            if (r10 == 0) goto L_0x0178
            wq3.n$a r11 = wq3.C111851n.f334884a
            r0 = 2131300401(0x7f091031, float:1.821883E38)
            r11.mo163589g(r8, r10, r9, r0)
            r4 = 3
            r5 = 0
            java.lang.String r3 = "com.tencent.mm.view.x2c.X2CTextView"
            r0 = r20
            r1 = r21
            r2 = r10
            int r0 = r0.mo163569t(r1, r2, r3, r4, r5)
            r11.mo163596n(r8, r10, r9, r0)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r11.mo163587e(r8, r10, r9, r0)
            r0 = 17
            r11.mo163588f(r8, r10, r9, r0)
            r5 = 2131099648(0x7f060000, float:1.7811655E38)
            java.lang.String r3 = "com.tencent.mm.view.x2c.X2CTextView"
            java.lang.String r4 = "@color/BG_0"
            r0 = r20
            android.graphics.drawable.Drawable r0 = r0.mo163568s(r1, r2, r3, r4, r5)
            r11.mo163586d(r8, r10, r9, r0)
            r0 = 8
            r11.mo163606x(r8, r10, r9, r0)
        L_0x0178:
            r7.mo163558h(r8, r10, r9, r6)
            r0 = r10
        L_0x017c:
            r1 = 5
            if (r15 != r1) goto L_0x0195
            android.view.View r0 = r7.mo163559i(r8, r12, r1)
            com.tencent.mm.view.x2c.X2CLinearLayout r0 = (com.tencent.p014mm.view.x2c.X2CLinearLayout) r0
            if (r0 == 0) goto L_0x0192
            wq3.n$a r2 = wq3.C111851n.f334884a
            r3 = 16
            r2.mo163588f(r8, r0, r12, r3)
            r3 = 1
            r2.mo163599q(r8, r0, r12, r3)
        L_0x0192:
            r7.mo163558h(r8, r0, r12, r1)
        L_0x0195:
            r9 = 6
            java.lang.String r10 = "com.tencent.mm.ui.widget.MMTextView"
            if (r15 != r9) goto L_0x01db
            android.view.View r0 = r7.mo163559i(r8, r10, r9)
            r11 = r0
            com.tencent.mm.ui.widget.MMTextView r11 = (com.tencent.p014mm.p136ui.widget.MMTextView) r11
            if (r11 == 0) goto L_0x01d7
            wq3.n$a r12 = wq3.C111851n.f334884a
            r0 = 2131315436(0x7f094aec, float:1.8249325E38)
            r12.mo163589g(r8, r11, r10, r0)
            r0 = 0
            r12.mo163601s(r8, r11, r10, r0)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r12.mo163587e(r8, r11, r10, r0)
            r5 = 2131101252(0x7f060644, float:1.7814908E38)
            java.lang.String r3 = "com.tencent.mm.ui.widget.MMTextView"
            java.lang.String r4 = "@color/normal_text_color"
            r0 = r20
            r1 = r21
            r2 = r11
            int r0 = r0.mo163566q(r1, r2, r3, r4, r5)
            r12.mo163604v(r8, r11, r10, r0)
            r4 = 0
            r5 = 0
            r6 = 2131165537(0x7f070161, float:1.7945294E38)
            java.lang.String r3 = "com.tencent.mm.ui.widget.MMTextView"
            r0 = r20
            float r0 = r0.mo163571v(r1, r2, r3, r4, r5, r6)
            r12.mo163605w(r8, r11, r10, r0)
        L_0x01d7:
            r7.mo163558h(r8, r11, r10, r9)
            r0 = r11
        L_0x01db:
            r9 = 7
            if (r15 != r9) goto L_0x0219
            android.view.View r0 = r7.mo163559i(r8, r10, r9)
            r11 = r0
            com.tencent.mm.ui.widget.MMTextView r11 = (com.tencent.p014mm.p136ui.widget.MMTextView) r11
            if (r11 == 0) goto L_0x0215
            wq3.n$a r12 = wq3.C111851n.f334884a
            r0 = 2131312533(0x7f093f95, float:1.8243437E38)
            r12.mo163589g(r8, r11, r10, r0)
            r0 = 1
            r12.mo163601s(r8, r11, r10, r0)
            r5 = 2131101556(0x7f060774, float:1.7815525E38)
            java.lang.String r3 = "com.tencent.mm.ui.widget.MMTextView"
            java.lang.String r4 = "@color/sns_word_color"
            r0 = r20
            r1 = r21
            r2 = r11
            int r0 = r0.mo163566q(r1, r2, r3, r4, r5)
            r12.mo163604v(r8, r11, r10, r0)
            r4 = 1
            r5 = 1094713344(0x41400000, float:12.0)
            r6 = 0
            java.lang.String r3 = "com.tencent.mm.ui.widget.MMTextView"
            r0 = r20
            float r0 = r0.mo163571v(r1, r2, r3, r4, r5, r6)
            r12.mo163605w(r8, r11, r10, r0)
        L_0x0215:
            r7.mo163558h(r8, r11, r10, r9)
            r0 = r11
        L_0x0219:
            if (r15 != r9) goto L_0x021e
            r20.mo163564o()
        L_0x021e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1161wh.C111807h.mo163513g(android.content.Context, android.util.AttributeSet, java.lang.String, int):android.view.View");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f360009d33;
    }

    /* renamed from: k */
    public String mo163515k() {
        return "MicroMsg.X2C.Sns_Other_Time_Line_Item_X2c_X2C";
    }
}
