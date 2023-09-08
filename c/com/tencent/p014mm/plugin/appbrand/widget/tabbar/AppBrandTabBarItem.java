package com.tencent.p014mm.plugin.appbrand.widget.tabbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.tabbar.AppBrandTabBarItem */
public class AppBrandTabBarItem extends RelativeLayout {
    public AppBrandTabBarItem(Context context) {
        super(context);
        mo1990a();
    }

    /* renamed from: a */
    public final void mo1990a() {
        Context context = getContext();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.gravity = 16;
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setId(C0966R.C0970id.f6012uu);
        boolean D = C76577a.m92148D(getContext());
        Log.m105918d("MicroMsg.AppBrandPageTabBar", "init, useLargerText: " + D);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(C0966R.C0970id.f6014uw);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13, -1);
        linearLayout.setLayoutParams(layoutParams2);
        ImageView imageView = new ImageView(context);
        imageView.setId(C0966R.C0970id.f6013uv);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int b = D ? C76577a.m92151b(getContext(), 34) : C76577a.m92151b(getContext(), 28);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(b, b));
        linearLayout.addView(imageView);
        TextView textView = new TextView(context);
        textView.setId(C0966R.C0970id.f6017uz);
        textView.setTextSize(0, ((float) C76577a.m92155f(context, C0966R.dimen.f3964lm)) * C76577a.m92161l(getContext()));
        textView.setPadding(C76577a.m92155f(context, C0966R.dimen.f3703bv), 0, C76577a.m92155f(context, C0966R.dimen.f3703bv), 0);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.addView(textView);
        addView(linearLayout);
        TextView textView2 = new TextView(context);
        textView2.setId(C0966R.C0970id.f6011ut);
        textView2.setTextSize(0, ((float) C76577a.m92155f(context, C0966R.dimen.f3962lk)) * C76577a.m92161l(getContext()));
        textView2.setBackground(C76577a.m92158i(context, C0966R.C0969drawable.f4472dk));
        textView2.setTextAppearance(context, C0966R.style.f8833zh);
        textView2.setGravity(17);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(6, C0966R.C0970id.f6014uw);
        layoutParams3.addRule(17, C0966R.C0970id.f6014uw);
        layoutParams3.setMarginStart(D ? C76577a.m92151b(getContext(), -12) : C76577a.m92151b(getContext(), -8));
        textView2.setLayoutParams(layoutParams3);
        addView(textView2);
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(C0966R.C0970id.f6016uy);
        imageView2.setBackground(C76577a.m92158i(context, C0966R.C0969drawable.az5));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(C76577a.m92155f(context, C0966R.dimen.f3723cd), C76577a.m92155f(context, C0966R.dimen.f3723cd));
        layoutParams4.addRule(6, C0966R.C0970id.f6014uw);
        layoutParams4.addRule(19, C0966R.C0970id.f6014uw);
        layoutParams4.setMarginEnd(D ? C76577a.m92151b(getContext(), -1) : C76577a.m92151b(getContext(), -3));
        layoutParams4.topMargin = C76577a.m92151b(context, 1);
        imageView2.setLayoutParams(layoutParams4);
        addView(imageView2);
        View view = new View(context);
        view.setId(C0966R.C0970id.f6015ux);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, C76577a.m92155f(context, C0966R.dimen.f3703bv));
        layoutParams5.addRule(18, C0966R.C0970id.f6014uw);
        layoutParams5.addRule(19, C0966R.C0970id.f6014uw);
        layoutParams5.addRule(12, -1);
        view.setLayoutParams(layoutParams5);
        addView(view);
    }

    public AppBrandTabBarItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo1990a();
    }
}
