package p1161wh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.MaskImageView;
import com.tencent.p014mm.plugin.sns.p106ui.item.improve.view.ImproveVideoFrameLayout;
import com.tencent.p014mm.view.x2c.X2CImageView;
import com.tencent.p014mm.view.x2c.X2CRelativeLayout;
import wq3.C111838a;
import wq3.C111851n;

/* renamed from: wh.g */
public class C111806g extends C111838a {
    /* renamed from: c */
    public String mo163511c() {
        return "sns_media_video_item_x2c";
    }

    /* renamed from: e */
    public View mo163512e(Context context) {
        mo163565p();
        X2CRelativeLayout x2CRelativeLayout = (X2CRelativeLayout) mo163559i(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
        if (x2CRelativeLayout == null) {
            x2CRelativeLayout = new X2CRelativeLayout(context, mo163560j());
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(context, mo163560j());
        C111851n.C111852a aVar = C111851n.f334884a;
        aVar.mo163594l(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        aVar.mo163592j(context, marginLayoutParams, "ViewGroup.MarginLayoutParams", -1);
        x2CRelativeLayout.setTag(C0966R.C0970id.mku, marginLayoutParams);
        mo163564o();
        MaskImageView maskImageView = (MaskImageView) mo163559i(context, "com.tencent.mm.plugin.sns.ui.MaskImageView", 1);
        if (maskImageView == null) {
            maskImageView = new MaskImageView(context, mo163560j());
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(context, mo163560j());
        aVar.mo163589g(context, maskImageView, "com.tencent.mm.plugin.sns.ui.MaskImageView", C0966R.C0970id.nwr);
        aVar.mo163594l(context, layoutParams, "X2CRelativeLayout.LayoutParams", -1);
        aVar.mo163592j(context, layoutParams, "X2CRelativeLayout.LayoutParams", -1);
        Context context2 = context;
        MaskImageView maskImageView2 = maskImageView;
        aVar.mo163602t(context, maskImageView, "com.tencent.mm.plugin.sns.ui.MaskImageView", mo163568s(context2, maskImageView2, "com.tencent.mm.plugin.sns.ui.MaskImageView", "@color/BG_3", C0966R.color.f2930d));
        aVar.mo163600r(context, maskImageView, "com.tencent.mm.plugin.sns.ui.MaskImageView", ImageView.ScaleType.CENTER_CROP);
        maskImageView.setLayoutParams(layoutParams);
        x2CRelativeLayout.addView(maskImageView);
        mo163557f(context2, maskImageView2, "com.tencent.mm.plugin.sns.ui.MaskImageView", false, 1);
        X2CImageView x2CImageView = (X2CImageView) mo163559i(context, "com.tencent.mm.view.x2c.X2CImageView", 2);
        if (x2CImageView == null) {
            x2CImageView = new X2CImageView(context, mo163560j());
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(context, mo163560j());
        aVar.mo163589g(context, x2CImageView, "com.tencent.mm.view.x2c.X2CImageView", C0966R.C0970id.nwp);
        aVar.mo163594l(context, layoutParams2, "X2CRelativeLayout.LayoutParams", -2);
        aVar.mo163592j(context, layoutParams2, "X2CRelativeLayout.LayoutParams", -2);
        aVar.mo163590h(context, layoutParams2, "X2CRelativeLayout.LayoutParams", -1);
        Context context3 = context;
        X2CImageView x2CImageView2 = x2CImageView;
        aVar.mo163586d(context, x2CImageView, "com.tencent.mm.view.x2c.X2CImageView", mo163568s(context3, x2CImageView2, "com.tencent.mm.view.x2c.X2CImageView", "@raw/shortvideo_play_btn", C0966R.raw.shortvideo_play_btn));
        x2CImageView.setLayoutParams(layoutParams2);
        x2CRelativeLayout.addView(x2CImageView);
        mo163557f(context3, x2CImageView2, "com.tencent.mm.view.x2c.X2CImageView", false, 2);
        ImproveVideoFrameLayout improveVideoFrameLayout = (ImproveVideoFrameLayout) mo163559i(context, "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout", 3);
        if (improveVideoFrameLayout == null) {
            improveVideoFrameLayout = new ImproveVideoFrameLayout(context, mo163560j());
        }
        ImproveVideoFrameLayout improveVideoFrameLayout2 = improveVideoFrameLayout;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(context, mo163560j());
        aVar.mo163589g(context, improveVideoFrameLayout2, "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout", C0966R.C0970id.nwq);
        aVar.mo163594l(context, layoutParams3, "X2CRelativeLayout.LayoutParams", -1);
        aVar.mo163592j(context, layoutParams3, "X2CRelativeLayout.LayoutParams", -1);
        improveVideoFrameLayout2.setLayoutParams(layoutParams3);
        x2CRelativeLayout.addView(improveVideoFrameLayout2);
        mo163557f(context, improveVideoFrameLayout2, "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout", false, 3);
        mo163557f(context, x2CRelativeLayout, "com.tencent.mm.view.x2c.X2CRelativeLayout", true, 0);
        return x2CRelativeLayout;
    }

    /* renamed from: g */
    public View mo163513g(Context context, AttributeSet attributeSet, String str, int i) {
        if (i == 0) {
            mo163565p();
        }
        X2CRelativeLayout x2CRelativeLayout = null;
        if (i == 0) {
            X2CRelativeLayout x2CRelativeLayout2 = (X2CRelativeLayout) mo163559i(context, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
            mo163558h(context, x2CRelativeLayout2, "com.tencent.mm.view.x2c.X2CRelativeLayout", 0);
            x2CRelativeLayout = x2CRelativeLayout2;
        }
        if (i == 1) {
            MaskImageView maskImageView = (MaskImageView) mo163559i(context, "com.tencent.mm.plugin.sns.ui.MaskImageView", 1);
            if (maskImageView != null) {
                C111851n.C111852a aVar = C111851n.f334884a;
                aVar.mo163589g(context, maskImageView, "com.tencent.mm.plugin.sns.ui.MaskImageView", C0966R.C0970id.nwr);
                aVar.mo163602t(context, maskImageView, "com.tencent.mm.plugin.sns.ui.MaskImageView", mo163568s(context, maskImageView, "com.tencent.mm.plugin.sns.ui.MaskImageView", "@color/BG_3", C0966R.color.f2930d));
                aVar.mo163600r(context, maskImageView, "com.tencent.mm.plugin.sns.ui.MaskImageView", ImageView.ScaleType.CENTER_CROP);
            }
            mo163558h(context, maskImageView, "com.tencent.mm.plugin.sns.ui.MaskImageView", 1);
            x2CRelativeLayout = maskImageView;
        }
        if (i == 2) {
            X2CImageView x2CImageView = (X2CImageView) mo163559i(context, "com.tencent.mm.view.x2c.X2CImageView", 2);
            if (x2CImageView != null) {
                x2CImageView.setId(C0966R.C0970id.nwp);
                x2CImageView.setBackground(mo163568s(context, x2CImageView, "com.tencent.mm.view.x2c.X2CImageView", "@raw/shortvideo_play_btn", C0966R.raw.shortvideo_play_btn));
            }
            mo163558h(context, x2CImageView, "com.tencent.mm.view.x2c.X2CImageView", 2);
            x2CRelativeLayout = x2CImageView;
        }
        if (i == 3) {
            ImproveVideoFrameLayout improveVideoFrameLayout = (ImproveVideoFrameLayout) mo163559i(context, "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout", 3);
            if (improveVideoFrameLayout != null) {
                improveVideoFrameLayout.setId(C0966R.C0970id.nwq);
            }
            mo163558h(context, improveVideoFrameLayout, "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveVideoFrameLayout", 3);
            x2CRelativeLayout = improveVideoFrameLayout;
        }
        if (i == 3) {
            mo163564o();
        }
        return x2CRelativeLayout;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d5m;
    }

    /* renamed from: k */
    public String mo163515k() {
        return "MicroMsg.X2C.Sns_Media_Video_Item_X2c_X2C";
    }
}
