package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandLauncherUI;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherBlankPage */
public final class AppBrandLauncherBlankPage extends AppBrandLauncherUI.Fragment {
    /* renamed from: P */
    public static ViewGroup m103992P(Context context, String str) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(C0966R.raw.app_brand_launcher_blank_tip_icon);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C76577a.m92151b(context, 50), C76577a.m92151b(context, 50));
        layoutParams.topMargin = C76577a.m92151b(context, 91);
        layoutParams.gravity = 1;
        linearLayout.addView(imageView, layoutParams);
        TextView textView = new TextView(context);
        textView.setTextSize(2, 14.0f);
        textView.setTextColor(Color.parseColor("#B2B2B2"));
        textView.setGravity(17);
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = C76577a.m92151b(context, 16);
        layoutParams2.gravity = 1;
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    public int getLayoutId() {
        return -1;
    }

    public void initView() {
        ((ViewGroup) this.f246391g).addView(m103992P(getActivity(), getArguments() == null ? null : getArguments().getString("extra_tip")), new ViewGroup.LayoutParams(-1, -1));
        C84240s.m103837c(this.f246389e, "", 0, "", 0, "", this.f246390f);
    }

    public void onResume() {
        super.onResume();
        if (getActivity() != null) {
            getActivity().setTitle(getArguments() == null ? "" : getArguments().getString("extra_title"));
        }
    }
}
