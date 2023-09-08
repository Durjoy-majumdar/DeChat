package p1161wh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.StoryAvatarDotsView;
import com.tencent.p014mm.view.x2c.X2CLinearLayout;
import com.tencent.p014mm.view.x2c.X2CRelativeLayout;
import com.tencent.p014mm.view.x2c.X2CTextView;
import com.tencent.p014mm.view.x2c.X2CView;
import wq3.C111838a;
import wq3.C111851n;

/* renamed from: wh.k */
public class C111810k extends C111838a {
    /* renamed from: c */
    public String mo163511c() {
        return "sns_unread_tip_layout_x2c";
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
        X2CRelativeLayout x2CRelativeLayout = (X2CRelativeLayout) mo163559i(context2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 1);
        if (x2CRelativeLayout == null) {
            x2CRelativeLayout = new X2CRelativeLayout(context2, mo163560j());
        }
        X2CRelativeLayout x2CRelativeLayout2 = x2CRelativeLayout;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(context2, mo163560j());
        aVar.mo163589g(context2, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", C0966R.C0970id.jwz);
        aVar.mo163594l(context2, layoutParams, "X2CLinearLayout.LayoutParams", -2);
        aVar.mo163592j(context2, layoutParams, "X2CLinearLayout.LayoutParams", -2);
        Context context3 = context;
        X2CRelativeLayout x2CRelativeLayout3 = x2CRelativeLayout2;
        String str = "X2CLinearLayout.LayoutParams";
        aVar.mo163586d(context2, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", mo163568s(context3, x2CRelativeLayout3, "com.tencent.mm.view.x2c.X2CRelativeLayout", "@drawable/sns_unread_tip_item_bg", C0966R.C0969drawable.aud));
        aVar.mo163591i(context2, layoutParams, str, 17);
        LinearLayout.LayoutParams layoutParams2 = layoutParams;
        X2CRelativeLayout x2CRelativeLayout4 = x2CRelativeLayout2;
        C111851n.C111852a aVar2 = aVar;
        X2CLinearLayout x2CLinearLayout3 = x2CLinearLayout2;
        aVar.mo163584b(context, x2CRelativeLayout4, "com.tencent.mm.view.x2c.X2CRelativeLayout", mo163567r(context3, x2CRelativeLayout3, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, C0966R.dimen.f3743cv), 0, mo163567r(context3, x2CRelativeLayout3, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, C0966R.dimen.f3743cv), 0);
        Context context4 = context;
        X2CRelativeLayout x2CRelativeLayout5 = x2CRelativeLayout4;
        LinearLayout.LayoutParams layoutParams3 = layoutParams2;
        int r = mo163567r(context4, x2CRelativeLayout4, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, C0966R.dimen.f3755d6);
        int r2 = mo163567r(context4, x2CRelativeLayout5, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0, 0.0f, C0966R.dimen.f3755d6);
        X2CRelativeLayout x2CRelativeLayout6 = x2CRelativeLayout5;
        LinearLayout.LayoutParams layoutParams4 = layoutParams3;
        Context context5 = context2;
        aVar2.mo163583a(context, layoutParams4, "X2CLinearLayout.LayoutParams", 0, r, 0, r2);
        x2CRelativeLayout6.setLayoutParams(layoutParams4);
        X2CLinearLayout x2CLinearLayout4 = x2CLinearLayout3;
        x2CLinearLayout4.addView(x2CRelativeLayout6);
        String str2 = str;
        X2CTextView x2CTextView = (X2CTextView) mo163559i(context5, "com.tencent.mm.view.x2c.X2CTextView", 2);
        if (x2CTextView == null) {
            x2CTextView = new X2CTextView(context5, mo163560j());
        }
        X2CTextView x2CTextView2 = x2CTextView;
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(context5, mo163560j());
        C111851n.C111852a aVar3 = aVar2;
        aVar3.mo163589g(context5, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", C0966R.C0970id.f359273jx1);
        aVar3.mo163594l(context5, layoutParams5, "X2CRelativeLayout.LayoutParams", -2);
        aVar3.mo163592j(context5, layoutParams5, "X2CRelativeLayout.LayoutParams", -2);
        layoutParams5.addRule(15, -1);
        String str3 = str2;
        Context context6 = context5;
        Context context7 = context;
        X2CTextView x2CTextView3 = x2CTextView2;
        aVar3.mo163604v(context6, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163566q(context7, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", "@color/Brand", C0966R.color.f2939n));
        X2CRelativeLayout x2CRelativeLayout7 = x2CRelativeLayout6;
        aVar3.mo163605w(context6, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163571v(context7, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", 1, 15.0f, 0));
        aVar3.mo163603u(context6, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163570u(context7, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", "@string/sns_unread_tip_text", C0966R.string.jjp));
        aVar3.mo163585c(context6, x2CTextView2, "com.tencent.mm.view.x2c.X2CTextView", mo163572w(context7, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", "bold", "", ""));
        x2CTextView2.setLayoutParams(layoutParams5);
        x2CRelativeLayout7.addView(x2CTextView2);
        mo163557f(context7, x2CTextView3, "com.tencent.mm.view.x2c.X2CTextView", false, 2);
        StoryAvatarDotsView storyAvatarDotsView = (StoryAvatarDotsView) mo163559i(context6, "com.tencent.mm.ui.widget.StoryAvatarDotsView", 3);
        if (storyAvatarDotsView == null) {
            storyAvatarDotsView = new StoryAvatarDotsView(context6, mo163560j());
        }
        StoryAvatarDotsView storyAvatarDotsView2 = storyAvatarDotsView;
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(context6, mo163560j());
        aVar3.mo163589g(context6, storyAvatarDotsView2, "com.tencent.mm.ui.widget.StoryAvatarDotsView", C0966R.C0970id.jwy);
        aVar3.mo163594l(context6, layoutParams6, "X2CRelativeLayout.LayoutParams", -2);
        aVar3.mo163592j(context6, layoutParams6, "X2CRelativeLayout.LayoutParams", -2);
        layoutParams6.addRule(15, -1);
        layoutParams6.addRule(1, C0966R.C0970id.f359273jx1);
        Context context8 = context;
        StoryAvatarDotsView storyAvatarDotsView3 = storyAvatarDotsView2;
        int r3 = mo163567r(context8, storyAvatarDotsView3, "com.tencent.mm.ui.widget.StoryAvatarDotsView", 0, 0.0f, C0966R.dimen.f3723cd);
        int r4 = mo163567r(context8, storyAvatarDotsView3, "com.tencent.mm.ui.widget.StoryAvatarDotsView", 0, 0.0f, C0966R.dimen.f3766df);
        int r5 = mo163567r(context8, storyAvatarDotsView3, "com.tencent.mm.ui.widget.StoryAvatarDotsView", 0, 0.0f, C0966R.dimen.f3766df);
        RelativeLayout.LayoutParams layoutParams7 = layoutParams6;
        StoryAvatarDotsView storyAvatarDotsView4 = storyAvatarDotsView2;
        X2CRelativeLayout x2CRelativeLayout8 = x2CRelativeLayout7;
        String str4 = str3;
        X2CLinearLayout x2CLinearLayout5 = x2CLinearLayout4;
        aVar3.mo163583a(context, layoutParams7, "X2CRelativeLayout.LayoutParams", r3, r4, 0, r5);
        storyAvatarDotsView4.setLayoutParams(layoutParams7);
        x2CRelativeLayout8.addView(storyAvatarDotsView4);
        Context context9 = context6;
        Context context10 = context;
        C111851n.C111852a aVar4 = aVar3;
        mo163557f(context10, storyAvatarDotsView4, "com.tencent.mm.ui.widget.StoryAvatarDotsView", false, 3);
        mo163557f(context10, x2CRelativeLayout8, "com.tencent.mm.view.x2c.X2CRelativeLayout", false, 1);
        X2CView x2CView = (X2CView) mo163559i(context9, "com.tencent.mm.view.x2c.X2CView", 4);
        if (x2CView == null) {
            x2CView = new X2CView(context9, mo163560j());
        }
        X2CView x2CView2 = x2CView;
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(context9, mo163560j());
        String str5 = str4;
        aVar4.mo163594l(context9, layoutParams8, str5, -1);
        Context context11 = context;
        X2CView x2CView3 = x2CView2;
        aVar4.mo163592j(context9, layoutParams8, str5, mo163567r(context11, x2CView3, "com.tencent.mm.view.x2c.X2CView", 1, 0.5f, 0));
        aVar4.mo163586d(context9, x2CView2, "com.tencent.mm.view.x2c.X2CView", mo163568s(context11, x2CView3, "com.tencent.mm.view.x2c.X2CView", "@drawable/grey_divider", C0966R.C0969drawable.a8l));
        x2CView2.setLayoutParams(layoutParams8);
        X2CLinearLayout x2CLinearLayout6 = x2CLinearLayout5;
        x2CLinearLayout6.addView(x2CView2);
        mo163557f(context11, x2CView3, "com.tencent.mm.view.x2c.X2CView", false, 4);
        mo163557f(context11, x2CLinearLayout6, "com.tencent.mm.view.x2c.X2CLinearLayout", true, 0);
        return x2CLinearLayout6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: com.tencent.mm.view.x2c.X2CView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: com.tencent.mm.view.x2c.X2CView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: com.tencent.mm.view.x2c.X2CView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: com.tencent.mm.view.x2c.X2CView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: com.tencent.mm.view.x2c.X2CView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: com.tencent.mm.view.x2c.X2CView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: com.tencent.mm.view.x2c.X2CView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: com.tencent.mm.ui.widget.StoryAvatarDotsView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: com.tencent.mm.view.x2c.X2CTextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: com.tencent.mm.view.x2c.X2CRelativeLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: com.tencent.mm.view.x2c.X2CView} */
    /* JADX WARNING: type inference failed for: r1v15, types: [com.tencent.mm.view.x2c.X2CLinearLayout, android.widget.LinearLayout, android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo163513g(android.content.Context r11, android.util.AttributeSet r12, java.lang.String r13, int r14) {
        /*
            r10 = this;
            if (r14 != 0) goto L_0x0005
            r10.mo163565p()
        L_0x0005:
            r12 = 0
            r13 = 0
            r0 = 1
            if (r14 != 0) goto L_0x001b
            java.lang.String r12 = "com.tencent.mm.view.x2c.X2CLinearLayout"
            android.view.View r1 = r10.mo163559i(r11, r12, r13)
            com.tencent.mm.view.x2c.X2CLinearLayout r1 = (com.tencent.p014mm.view.x2c.X2CLinearLayout) r1
            if (r1 == 0) goto L_0x0017
            r1.setOrientation(r0)
        L_0x0017:
            r10.mo163558h(r11, r1, r12, r13)
            r12 = r1
        L_0x001b:
            if (r14 != r0) goto L_0x0059
            java.lang.String r12 = "com.tencent.mm.view.x2c.X2CRelativeLayout"
            android.view.View r1 = r10.mo163559i(r11, r12, r0)
            com.tencent.mm.view.x2c.X2CRelativeLayout r1 = (com.tencent.p014mm.view.x2c.X2CRelativeLayout) r1
            if (r1 == 0) goto L_0x0055
            r2 = 2131314148(0x7f0945e4, float:1.8246713E38)
            r1.setId(r2)
            r7 = 2131235010(0x7f0810c2, float:1.8086202E38)
            java.lang.String r5 = "com.tencent.mm.view.x2c.X2CRelativeLayout"
            java.lang.String r6 = "@drawable/sns_unread_tip_item_bg"
            r2 = r10
            r3 = r11
            r4 = r1
            android.graphics.drawable.Drawable r2 = r2.mo163568s(r3, r4, r5, r6, r7)
            r1.setBackground(r2)
            r6 = 0
            r7 = 0
            r8 = 2131165337(0x7f070099, float:1.7944888E38)
            java.lang.String r5 = "com.tencent.mm.view.x2c.X2CRelativeLayout"
            r2 = r10
            r3 = r11
            r4 = r1
            int r9 = r2.mo163567r(r3, r4, r5, r6, r7, r8)
            java.lang.String r5 = "com.tencent.mm.view.x2c.X2CRelativeLayout"
            int r2 = r2.mo163567r(r3, r4, r5, r6, r7, r8)
            r1.setPadding(r9, r13, r2, r13)
        L_0x0055:
            r10.mo163558h(r11, r1, r12, r0)
            r12 = r1
        L_0x0059:
            r13 = 2
            if (r14 != r13) goto L_0x00b0
            java.lang.String r12 = "com.tencent.mm.view.x2c.X2CTextView"
            android.view.View r0 = r10.mo163559i(r11, r12, r13)
            com.tencent.mm.view.x2c.X2CTextView r0 = (com.tencent.p014mm.view.x2c.X2CTextView) r0
            if (r0 == 0) goto L_0x00ac
            wq3.n$a r8 = wq3.C111851n.f334884a
            r1 = 2131314150(0x7f0945e6, float:1.8246717E38)
            r8.mo163589g(r11, r0, r12, r1)
            r6 = 2131099756(0x7f06006c, float:1.7811874E38)
            java.lang.String r4 = "com.tencent.mm.view.x2c.X2CTextView"
            java.lang.String r5 = "@color/Brand"
            r1 = r10
            r2 = r11
            r3 = r0
            int r1 = r1.mo163566q(r2, r3, r4, r5, r6)
            r8.mo163604v(r11, r0, r12, r1)
            r5 = 1
            r6 = 1097859072(0x41700000, float:15.0)
            r7 = 0
            java.lang.String r4 = "com.tencent.mm.view.x2c.X2CTextView"
            r1 = r10
            float r1 = r1.mo163571v(r2, r3, r4, r5, r6, r7)
            r8.mo163605w(r11, r0, r12, r1)
            r6 = 2131837236(0x7f114134, float:1.9307661E38)
            java.lang.String r4 = "com.tencent.mm.view.x2c.X2CTextView"
            java.lang.String r5 = "@string/sns_unread_tip_text"
            r1 = r10
            java.lang.String r1 = r1.mo163570u(r2, r3, r4, r5, r6)
            r8.mo163603u(r11, r0, r12, r1)
            java.lang.String r4 = "com.tencent.mm.view.x2c.X2CTextView"
            java.lang.String r5 = "bold"
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            r1 = r10
            android.graphics.Typeface r1 = r1.mo163572w(r2, r3, r4, r5, r6, r7)
            r8.mo163585c(r11, r0, r12, r1)
        L_0x00ac:
            r10.mo163558h(r11, r0, r12, r13)
            r12 = r0
        L_0x00b0:
            r13 = 3
            if (r14 != r13) goto L_0x00c7
            java.lang.String r12 = "com.tencent.mm.ui.widget.StoryAvatarDotsView"
            android.view.View r0 = r10.mo163559i(r11, r12, r13)
            com.tencent.mm.ui.widget.StoryAvatarDotsView r0 = (com.tencent.p014mm.p136ui.widget.StoryAvatarDotsView) r0
            if (r0 == 0) goto L_0x00c3
            r1 = 2131314147(0x7f0945e3, float:1.824671E38)
            r0.setId(r1)
        L_0x00c3:
            r10.mo163558h(r11, r0, r12, r13)
            r12 = r0
        L_0x00c7:
            r13 = 4
            if (r14 != r13) goto L_0x00e9
            java.lang.String r12 = "com.tencent.mm.view.x2c.X2CView"
            android.view.View r0 = r10.mo163559i(r11, r12, r13)
            com.tencent.mm.view.x2c.X2CView r0 = (com.tencent.p014mm.view.x2c.X2CView) r0
            if (r0 == 0) goto L_0x00e5
            r6 = 2131233276(0x7f0809fc, float:1.8082685E38)
            java.lang.String r4 = "com.tencent.mm.view.x2c.X2CView"
            java.lang.String r5 = "@drawable/grey_divider"
            r1 = r10
            r2 = r11
            r3 = r0
            android.graphics.drawable.Drawable r1 = r1.mo163568s(r2, r3, r4, r5, r6)
            r0.setBackground(r1)
        L_0x00e5:
            r10.mo163558h(r11, r0, r12, r13)
            r12 = r0
        L_0x00e9:
            if (r14 != r13) goto L_0x00ee
            r10.mo163564o()
        L_0x00ee:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p1161wh.C111810k.mo163513g(android.content.Context, android.util.AttributeSet, java.lang.String, int):android.view.View");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d5p;
    }

    /* renamed from: k */
    public String mo163515k() {
        return "MicroMsg.X2C.Sns_Unread_Tip_Layout_X2c_X2C";
    }
}
