package rl3;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C96931e;
import com.tencent.p014mm.smiley.C96963p0;
import go3.C76003c;
import gy3.C87412m;
import pl3.C100822b;
import vl3.C102224a;
import vl3.C102226d;

/* renamed from: rl3.b */
public final class C101393b implements TextWatcher {

    /* renamed from: d */
    public final View f297000d;

    /* renamed from: e */
    public int f297001e;

    public C101393b(View view, int i) {
        this.f297000d = view;
        this.f297001e = i;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C87412m.m108594g(charSequence, "s");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C96963p0 p0Var;
        Spannable spannable;
        CharSequence charSequence2 = charSequence;
        int i4 = i;
        C87412m.m108594g(charSequence2, FirebaseAnalytics.C113379b.SOURCE);
        View view = this.f297000d;
        if (!(view != null && view.isInEditMode()) && i3 > 0 && (charSequence2 instanceof Spannable)) {
            int i5 = i4 + i3;
            Spannable spannable2 = (Spannable) charSequence2;
            C76003c[] cVarArr = (C76003c[]) spannable2.getSpans(i4, i5, C76003c.class);
            C100822b[] bVarArr = (C100822b[]) spannable2.getSpans(i4, i5, C100822b.class);
            C87412m.m108593f(bVarArr, "emojiInfoSpans");
            boolean a = (bVarArr.length == 0) ^ true ? true ^ bVarArr[bVarArr.length - 1].mo140271a(charSequence2.subSequence(i4, i5)) : false;
            if (cVarArr == null || cVarArr.length <= 0 || a) {
                if (a && cVarArr != null && cVarArr.length > 0) {
                    for (C76003c removeSpan : cVarArr) {
                        spannable2.removeSpan(removeSpan);
                    }
                }
                SpanWatcher[] spanWatcherArr = (SpanWatcher[]) spannable2.getSpans(0, charSequence.length(), SpanWatcher.class);
                if (spanWatcherArr != null) {
                    for (SpanWatcher removeSpan2 : spanWatcherArr) {
                        spannable2.removeSpan(removeSpan2);
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("text:");
                sb.append(charSequence2.subSequence(i4, i5));
                sb.append(", class name:");
                View view2 = this.f297000d;
                sb.append(view2 != null ? view2.getClass().getName() : null);
                sb.append(", source hash:");
                sb.append(charSequence.hashCode());
                sb.append(", ready to span");
                Log.m105926v("MicroMsg.EmojiTextWatcher", sb.toString());
                int i6 = this.f297001e;
                if (C102226d.f301013a != null) {
                    C96963p0.wx0().getClass();
                    C96963p0 wx02 = C96963p0.wx0();
                    wx02.getClass();
                    if (!Util.isNullOrNil(spannable2.toString())) {
                        C96931e a2 = C96931e.m124499a();
                        int i7 = wx02.f284063d;
                        a2.getClass();
                        if (spannable2.length() == 0) {
                            p0Var = wx02;
                            spannable = spannable2;
                        } else {
                            C102224a aVar = r2;
                            p0Var = wx02;
                            C102224a aVar2 = new C102224a(spannable2, i, i5, i6, i7, true, false);
                            spannable = a2.mo135522b(aVar).f229807a;
                        }
                        p0Var.vx0(spannable, i4, i5, i6);
                    }
                }
                if (spanWatcherArr != null) {
                    for (SpanWatcher span : spanWatcherArr) {
                        spannable2.setSpan(span, 0, charSequence.length(), 18);
                    }
                }
            }
        }
    }
}
