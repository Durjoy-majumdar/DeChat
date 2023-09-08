package com.tencent.p014mm.p136ui.transmit.recent;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import qo3.C77407n;

/* renamed from: com.tencent.mm.ui.transmit.recent.f */
public final class C74927f {

    /* renamed from: a */
    public static final C74927f f220307a = new C74927f();

    /* renamed from: a */
    public final void mo104182a(Context context, C77407n nVar, int i) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(nVar, "sheet");
        if (3 == i) {
            if (nVar.f225745T0 == null) {
                nVar.mo107561f();
            }
            if (nVar.f225747U0 == null) {
                nVar.f225747U0 = (TextView) nVar.f225735M.findViewById(C0966R.C0970id.lvm);
            }
            TextView textView = nVar.f225747U0;
            if (textView != null) {
                textView.setVisibility(0);
                nVar.f225747U0.setText(C0966R.string.iil);
                if (nVar.f225794u1) {
                    nVar.f225747U0.setTextColor(nVar.f225769h.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                } else {
                    nVar.f225747U0.setTextColor(nVar.f225769h.getResources().getColor(C0966R.color.FG_0));
                }
            }
        } else {
            View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.bpz, (ViewGroup) null);
            if (inflate != null) {
                TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.e5d);
                TextView textView3 = (TextView) inflate.findViewById(C0966R.C0970id.ahj);
                C85875k4.m106189j0(textView3.getPaint(), 0.8f);
                context.getResources().getDimension(C0966R.dimen.f3755d6);
                nVar.f225772i1 = true;
                ImageView imageView = nVar.f225760c1;
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
                LinearLayout linearLayout = nVar.f225737P;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                    nVar.f225737P.removeAllViews();
                    nVar.f225737P.setGravity(17);
                    nVar.f225737P.addView(inflate, -1, -2);
                }
                if (i == 1) {
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    textView3.setTextColor(context.getResources().getColor(C0966R.color.FG_0));
                    textView3.setVisibility(0);
                } else if (i == 2) {
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    textView3.setTextColor(context.getResources().getColor(C0966R.color.FG_0));
                    textView3.setVisibility(0);
                } else if (i == 5) {
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    textView3.setVisibility(0);
                } else if (i != 6) {
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    textView3.setVisibility(0);
                    Log.m105928w("MircoMsg.RecentForwardUtils", "invalid type:" + i);
                } else {
                    textView3.setVisibility(8);
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = 0;
                    textView2.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }
}
