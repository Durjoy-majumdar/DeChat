package com.tencent.p014mm.plugin.profile.p088ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.profile.ui.v */
public final class C5020v extends C87413o implements C32226l<View, String> {

    /* renamed from: d */
    public static final C5020v f20334d = new C5020v();

    public C5020v() {
        super(1);
    }

    public Object invoke(Object obj) {
        View view = (View) obj;
        C87412m.m108594g(view, LocaleUtil.ITALIAN);
        CharSequence charSequence = null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        CharSequence charSequence2 = "";
        if (viewGroup == null) {
            return charSequence2;
        }
        if (viewGroup.findViewById(C0966R.C0970id.f359327ka3) == null) {
            StringBuilder sb = new StringBuilder();
            TextView textView = (TextView) viewGroup.findViewById(16908310);
            CharSequence text = textView != null ? textView.getText() : null;
            if (text == null) {
                text = charSequence2;
            }
            sb.append(text);
            sb.append(',');
            TextView textView2 = (TextView) viewGroup.findViewById(16908304);
            if (textView2 != null) {
                charSequence = textView2.getText();
            }
            if (charSequence != null) {
                charSequence2 = charSequence;
            }
            sb.append(charSequence2);
            return sb.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        TextView textView3 = (TextView) viewGroup.findViewById(C0966R.C0970id.knx);
        CharSequence text2 = textView3 != null ? textView3.getText() : null;
        if (text2 == null) {
            text2 = charSequence2;
        }
        sb4.append(text2);
        sb4.append(',');
        TextView textView4 = (TextView) viewGroup.findViewById(C0966R.C0970id.ka7);
        CharSequence text3 = textView4 != null ? textView4.getText() : null;
        if (text3 == null) {
            text3 = charSequence2;
        }
        sb4.append(text3);
        sb4.append(", ");
        TextView textView5 = (TextView) viewGroup.findViewById(C0966R.C0970id.ka8);
        CharSequence text4 = textView5 != null ? textView5.getText() : null;
        if (text4 == null) {
            text4 = charSequence2;
        }
        sb4.append(text4);
        if (!(C112550d0.m153799i0(C112551y.m153816p(sb4.toString(), ",", "", false, 4, (Object) null)).toString().length() == 0)) {
            return charSequence2;
        }
        StringBuilder sb5 = new StringBuilder();
        TextView textView6 = (TextView) viewGroup.findViewById(16908310);
        CharSequence text5 = textView6 != null ? textView6.getText() : null;
        if (text5 == null) {
            text5 = charSequence2;
        }
        sb5.append(text5);
        sb5.append(',');
        TextView textView7 = (TextView) viewGroup.findViewById(16908304);
        if (textView7 != null) {
            charSequence = textView7.getText();
        }
        if (charSequence != null) {
            charSequence2 = charSequence;
        }
        sb5.append(charSequence2);
        return sb5.toString();
    }
}
