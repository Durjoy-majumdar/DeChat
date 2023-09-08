package p1161wh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.x2c.X2CFrameLayout;
import com.tencent.p014mm.view.x2c.X2CImageView;
import com.tencent.p014mm.view.x2c.X2CRelativeLayout;
import wq3.C111838a;
import wq3.C111851n;

/* renamed from: wh.d */
public class C111803d extends C111838a {
    /* renamed from: c */
    public String mo163511c() {
        return "sns_finder_media_time_line_item_x2c";
    }

    /* renamed from: e */
    public View mo163512e(Context context) {
        Context context2 = context;
        mo163565p();
        X2CFrameLayout x2CFrameLayout = (X2CFrameLayout) mo163559i(context2, "com.tencent.mm.view.x2c.X2CFrameLayout", 0);
        if (x2CFrameLayout == null) {
            x2CFrameLayout = new X2CFrameLayout(context2, mo163560j());
        }
        X2CFrameLayout x2CFrameLayout2 = x2CFrameLayout;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(context2, mo163560j());
        C111851n.C111852a aVar = C111851n.f334884a;
        aVar.mo163594l(context2, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        aVar.mo163592j(context2, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        x2CFrameLayout2.setTag(C0966R.C0970id.mku, marginLayoutParams);
        mo163564o();
        X2CRelativeLayout x2CRelativeLayout = (X2CRelativeLayout) mo163559i(context2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 1);
        if (x2CRelativeLayout == null) {
            x2CRelativeLayout = new X2CRelativeLayout(context2, mo163560j());
        }
        X2CRelativeLayout x2CRelativeLayout2 = x2CRelativeLayout;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(context2, mo163560j());
        aVar.mo163589g(context2, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", C0966R.C0970id.jtc);
        aVar.mo163594l(context2, layoutParams, "X2CFrameLayout.LayoutParams", -1);
        aVar.mo163592j(context2, layoutParams, "X2CFrameLayout.LayoutParams", -1);
        x2CRelativeLayout2.setLayoutParams(layoutParams);
        x2CFrameLayout2.addView(x2CRelativeLayout2);
        X2CImageView x2CImageView = (X2CImageView) mo163559i(context2, "com.tencent.mm.view.x2c.X2CImageView", 2);
        if (x2CImageView == null) {
            x2CImageView = new X2CImageView(context2, mo163560j());
        }
        X2CImageView x2CImageView2 = x2CImageView;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(context2, mo163560j());
        aVar.mo163589g(context2, x2CImageView2, "com.tencent.mm.view.x2c.X2CImageView", C0966R.C0970id.jtg);
        aVar.mo163594l(context2, layoutParams2, "X2CRelativeLayout.LayoutParams", -1);
        aVar.mo163592j(context2, layoutParams2, "X2CRelativeLayout.LayoutParams", -1);
        aVar.mo163600r(context2, x2CImageView2, "com.tencent.mm.view.x2c.X2CImageView", ImageView.ScaleType.CENTER_CROP);
        Context context3 = context;
        X2CImageView x2CImageView3 = x2CImageView2;
        aVar.mo163602t(context2, x2CImageView2, "com.tencent.mm.view.x2c.X2CImageView", mo163568s(context3, x2CImageView3, "com.tencent.mm.view.x2c.X2CImageView", "@color/BG_3", C0966R.color.f2930d));
        x2CImageView2.setLayoutParams(layoutParams2);
        x2CRelativeLayout2.addView(x2CImageView2);
        mo163557f(context3, x2CImageView3, "com.tencent.mm.view.x2c.X2CImageView", false, 2);
        X2CImageView x2CImageView4 = (X2CImageView) mo163559i(context2, "com.tencent.mm.view.x2c.X2CImageView", 3);
        if (x2CImageView4 == null) {
            x2CImageView4 = new X2CImageView(context2, mo163560j());
        }
        X2CImageView x2CImageView5 = x2CImageView4;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(context2, mo163560j());
        aVar.mo163589g(context2, x2CImageView5, "com.tencent.mm.view.x2c.X2CImageView", C0966R.C0970id.jtf);
        Context context4 = context;
        X2CImageView x2CImageView6 = x2CImageView5;
        RelativeLayout.LayoutParams layoutParams4 = layoutParams3;
        aVar.mo163594l(context2, layoutParams4, "X2CRelativeLayout.LayoutParams", mo163567r(context4, x2CImageView6, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, C0966R.dimen.f3753d4));
        aVar.mo163592j(context2, layoutParams4, "X2CRelativeLayout.LayoutParams", mo163567r(context4, x2CImageView6, "com.tencent.mm.view.x2c.X2CImageView", 0, 0.0f, C0966R.dimen.f3753d4));
        aVar.mo163590h(context2, layoutParams4, "X2CRelativeLayout.LayoutParams", -1);
        aVar.mo163602t(context2, x2CImageView5, "com.tencent.mm.view.x2c.X2CImageView", mo163568s(context4, x2CImageView6, "com.tencent.mm.view.x2c.X2CImageView", "@raw/shortvideo_play_btn", C0966R.raw.shortvideo_play_btn));
        x2CImageView5.setLayoutParams(layoutParams4);
        x2CRelativeLayout2.addView(x2CImageView5);
        mo163557f(context4, x2CImageView6, "com.tencent.mm.view.x2c.X2CImageView", false, 3);
        mo163557f(context4, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", false, 1);
        mo163557f(context4, x2CFrameLayout2, "com.tencent.mm.view.x2c.X2CFrameLayout", true, 0);
        return x2CFrameLayout2;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.tencent.mm.view.x2c.X2CRelativeLayout, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v4, types: [com.tencent.mm.view.x2c.X2CFrameLayout, android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo163513g(android.content.Context r9, android.util.AttributeSet r10, java.lang.String r11, int r12) {
        /*
            r8 = this;
            if (r12 != 0) goto L_0x0005
            r8.mo163565p()
        L_0x0005:
            r10 = 0
            if (r12 != 0) goto L_0x0015
            java.lang.String r10 = "com.tencent.mm.view.x2c.X2CFrameLayout"
            r11 = 0
            android.view.View r0 = r8.mo163559i(r9, r10, r11)
            com.tencent.mm.view.x2c.X2CFrameLayout r0 = (com.tencent.p014mm.view.x2c.X2CFrameLayout) r0
            r8.mo163558h(r9, r0, r10, r11)
            r10 = r0
        L_0x0015:
            r11 = 1
            if (r12 != r11) goto L_0x002c
            java.lang.String r10 = "com.tencent.mm.view.x2c.X2CRelativeLayout"
            android.view.View r0 = r8.mo163559i(r9, r10, r11)
            com.tencent.mm.view.x2c.X2CRelativeLayout r0 = (com.tencent.p014mm.view.x2c.X2CRelativeLayout) r0
            if (r0 == 0) goto L_0x0028
            r1 = 2131313983(0x7f09453f, float:1.8246378E38)
            r0.setId(r1)
        L_0x0028:
            r8.mo163558h(r9, r0, r10, r11)
            r10 = r0
        L_0x002c:
            r11 = 2
            java.lang.String r0 = "com.tencent.mm.view.x2c.X2CImageView"
            if (r12 != r11) goto L_0x005a
            android.view.View r10 = r8.mo163559i(r9, r0, r11)
            com.tencent.mm.view.x2c.X2CImageView r10 = (com.tencent.p014mm.view.x2c.X2CImageView) r10
            if (r10 == 0) goto L_0x0057
            wq3.n$a r7 = wq3.C111851n.f334884a
            r1 = 2131313987(0x7f094543, float:1.8246386E38)
            r7.mo163589g(r9, r10, r0, r1)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            r7.mo163600r(r9, r10, r0, r1)
            r6 = 2131099651(0x7f060003, float:1.7811661E38)
            java.lang.String r4 = "com.tencent.mm.view.x2c.X2CImageView"
            java.lang.String r5 = "@color/BG_3"
            r1 = r8
            r2 = r9
            r3 = r10
            android.graphics.drawable.Drawable r1 = r1.mo163568s(r2, r3, r4, r5, r6)
            r7.mo163602t(r9, r10, r0, r1)
        L_0x0057:
            r8.mo163558h(r9, r10, r0, r11)
        L_0x005a:
            r11 = 3
            if (r12 != r11) goto L_0x007f
            android.view.View r10 = r8.mo163559i(r9, r0, r11)
            com.tencent.mm.view.x2c.X2CImageView r10 = (com.tencent.p014mm.view.x2c.X2CImageView) r10
            if (r10 == 0) goto L_0x007c
            r1 = 2131313986(0x7f094542, float:1.8246384E38)
            r10.setId(r1)
            r6 = 2131756957(0x7f10079d, float:1.9144836E38)
            java.lang.String r4 = "com.tencent.mm.view.x2c.X2CImageView"
            java.lang.String r5 = "@raw/shortvideo_play_btn"
            r1 = r8
            r2 = r9
            r3 = r10
            android.graphics.drawable.Drawable r1 = r1.mo163568s(r2, r3, r4, r5, r6)
            r10.setImageDrawable(r1)
        L_0x007c:
            r8.mo163558h(r9, r10, r0, r11)
        L_0x007f:
            if (r12 != r11) goto L_0x0084
            r8.mo163564o()
        L_0x0084:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p1161wh.C111803d.mo163513g(android.content.Context, android.util.AttributeSet, java.lang.String, int):android.view.View");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d2v;
    }

    /* renamed from: k */
    public String mo163515k() {
        return "MicroMsg.X2C.Sns_Finder_Media_Time_Line_Item_X2c_X2C";
    }
}
