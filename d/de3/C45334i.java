package de3;

import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.kiss.widget.textview.StaticTextView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: de3.i */
public class C45334i {
    /* renamed from: a */
    public static boolean m50245a(View view, Spanned spanned) {
        boolean z;
        if (!(view == null || spanned == null || (!((z = view instanceof TextView)) && !(view instanceof StaticTextView)))) {
            int lineCount = z ? ((TextView) view).getLineCount() : view instanceof StaticTextView ? ((StaticTextView) view).getLineCount() : 0;
            if (lineCount != 1 || spanned.length() <= 500) {
                for (int i = 1; i < lineCount; i++) {
                    if (m50246b(view, i) - m50246b(view, i - 1) > 500) {
                        Log.m105920e("MicroMsg.InvalidTextCheck", "error black dot");
                        return true;
                    }
                }
            } else {
                Log.m105920e("MicroMsg.InvalidTextCheck", "error black dot");
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m50246b(View view, int i) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (textView.getLayout() == null) {
                return 0;
            }
            return textView.getLayout().getLineEnd(i);
        } else if (!(view instanceof StaticTextView)) {
            return 0;
        } else {
            StaticTextView staticTextView = (StaticTextView) view;
            if (staticTextView.getTvLayout() == null) {
                return 0;
            }
            return staticTextView.getTvLayout().getLineEnd(i);
        }
    }
}
