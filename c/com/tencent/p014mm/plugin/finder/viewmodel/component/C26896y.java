package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kg3.C76577a;
import nj3.C76901s0;
import o40.C61926c;
import rs1.C13122b3;
import rs1.C13136c3;
import rs1.C13562z2;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.y */
public final class C26896y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C13562z2 f74791d;

    public C26896y(C13562z2 z2Var) {
        this.f74791d = z2Var;
    }

    public final void run() {
        C13562z2.C13563a aVar;
        TextPaint paint;
        if (!this.f74791d.getActivity().isFinishing() && !this.f74791d.getActivity().isDestroyed()) {
            C13562z2 z2Var = this.f74791d;
            View inflate = View.inflate(z2Var.getContext(), C0966R.C0971layout.d7u, (ViewGroup) null);
            C76901s0 s0Var = z2Var.f38478h;
            if (s0Var != null) {
                s0Var.dismiss();
            }
            C76901s0 s0Var2 = new C76901s0(inflate);
            s0Var2.setAnimationStyle(C0966R.style.a8i);
            z2Var.f38478h = s0Var2;
            TextView textView = inflate != null ? (TextView) inflate.findViewById(C0966R.C0970id.o7u) : null;
            TextView textView2 = inflate != null ? (TextView) inflate.findViewById(C0966R.C0970id.o7v) : null;
            View findViewById = inflate != null ? inflate.findViewById(C0966R.C0970id.o7s) : null;
            String string = z2Var.getActivity().getResources().getString(C0966R.string.d3h);
            C87412m.m108593f(string, "activity.resources.getSt…(R.string.finder_comment)");
            int measureText = (textView2 == null || (paint = textView2.getPaint()) == null) ? 0 : (int) paint.measureText(string);
            String string2 = z2Var.getActivity().getResources().getString(C0966R.string.nbj, new Object[]{z2Var.f38477g});
            C87412m.m108593f(string2, "activity.resources.getSt…desc_to_comment, curDesc)");
            if (textView != null) {
                int b = (C74783i3.m89537a(z2Var.getContext()).f24704a - C76577a.m92151b(z2Var.getContext(), 136)) - measureText;
                if (b <= 0) {
                    z2Var.f38478h = null;
                    Log.m105924i("FinderFeedShareDescToCommentUIC", "showTipsBar error, availableWidth:" + b);
                    return;
                }
                TextPaint paint2 = textView.getPaint();
                C87412m.m108593f(paint2, "paint");
                StaticLayout staticLayout = r14;
                StaticLayout staticLayout2 = new StaticLayout(string2, 0, string2.length(), paint2, b, Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true);
                if (staticLayout.getLineCount() > 2) {
                    String string3 = textView.getContext().getString(C0966R.string.nbl);
                    C87412m.m108593f(string3, "context.getString(R.stri…s_to_comment_suffix_text)");
                    StaticLayout staticLayout3 = staticLayout;
                    int lineEnd = staticLayout3.getLineEnd(0);
                    String substring = string2.substring(0, lineEnd);
                    C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int lineStart = staticLayout3.getLineStart(1);
                    String substring2 = string2.substring(lineStart, string2.length());
                    C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    int measureText2 = b - ((int) textView.getPaint().measureText(string3));
                    if (measureText2 <= 0) {
                        z2Var.f38478h = null;
                        Log.m105924i("FinderFeedShareDescToCommentUIC", "showTipsBar error, leftAvailableWidth:" + measureText2);
                        return;
                    }
                    TextPaint paint3 = textView.getPaint();
                    C87412m.m108593f(paint3, "paint");
                    int lineEnd2 = new StaticLayout(substring2, 0, substring2.length(), paint3, measureText2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true).getLineEnd(0);
                    String substring3 = substring2.substring(0, lineEnd2);
                    C87412m.m108593f(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    SpannableString spannableString = new SpannableString(substring + substring3 + string3);
                    Log.m105924i("FinderFeedShareDescToCommentUIC", lineEnd + ' ' + lineStart + ' ' + lineEnd2 + " textLine0=" + substring + " textLine1=" + substring3 + " textStartFromLine1=" + substring2);
                    textView.setText(spannableString);
                } else {
                    textView.setText(string2);
                }
            }
            if (textView2 != null) {
                textView2.setOnClickListener(new C13122b3(z2Var));
            }
            if (findViewById != null) {
                findViewById.setOnClickListener(new C13136c3(z2Var));
            }
            BaseFinderFeed baseFinderFeed = z2Var.f38476f;
            String p = C61926c.m72691p(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0);
            C87412m.m108593f(inflate, "view");
            z2Var.mo12959c3(inflate, "guide_bubble", p, z2Var.f38477g, 32);
            if (textView2 != null) {
                z2Var.mo12959c3(textView2, "guide_bubble_comment_button", p, z2Var.f38477g, 8);
            }
            if (findViewById != null) {
                z2Var.mo12959c3(findViewById, "guide_bubble_close_button", p, z2Var.f38477g, 8);
            }
            C76901s0 s0Var3 = z2Var.f38478h;
            if (s0Var3 != null) {
                s0Var3.setWidth(-1);
            }
            C76901s0 s0Var4 = z2Var.f38478h;
            if (s0Var4 != null) {
                s0Var4.setHeight(-2);
            }
            int dimensionPixelSize = z2Var.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3705bx);
            C76901s0 s0Var5 = z2Var.f38478h;
            if (s0Var5 != null) {
                s0Var5.showAtLocation(z2Var.getContext().getWindow().getDecorView(), 80, 0, dimensionPixelSize);
            }
            BaseFinderFeed baseFinderFeed2 = z2Var.f38476f;
            if (baseFinderFeed2 != null && (aVar = z2Var.f38480i.get(Long.valueOf(baseFinderFeed2.getItemId()))) != null) {
                aVar.mo12961b(true);
            }
        }
    }
}
