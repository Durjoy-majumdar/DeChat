package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import b34.C79664a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Locale;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.p1 */
public enum C84975p1 {
    ;
    

    /* renamed from: d */
    public static final Class f247639d = null;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.p1$a */
    public enum C84976a {
        ;

        /* renamed from: a */
        public static int m104770a(EditText editText, float f, float f2) {
            Editable editableText;
            TextPaint paint;
            if (editText == null) {
                return -1;
            }
            int paddingTop = editText.getPaddingTop();
            Layout layout = editText.getLayout();
            if (layout == null || (editableText = editText.getEditableText()) == null || (paint = editText.getPaint()) == null) {
                return -1;
            }
            Rect rect = new Rect();
            for (int i = 0; i < layout.getLineCount(); i++) {
                layout.getLineBounds(i, rect);
                paddingTop += rect.height();
                if (((float) paddingTop) >= f2) {
                    int lineStart = layout.getLineStart(i);
                    int lineEnd = layout.getLineEnd(i);
                    if (i != layout.getLineCount() - 1) {
                        lineEnd = Math.max(lineEnd - 1, lineStart);
                    }
                    if (lineStart == lineEnd) {
                        return lineStart;
                    }
                    RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) editableText.getSpans(lineStart, lineEnd, RelativeSizeSpan.class);
                    float f3 = 1.0f;
                    if (relativeSizeSpanArr != null) {
                        for (RelativeSizeSpan sizeChange : relativeSizeSpanArr) {
                            f3 = sizeChange.getSizeChange();
                        }
                    }
                    String charSequence = editableText.subSequence(lineStart, lineEnd).toString();
                    float[] fArr = new float[charSequence.length()];
                    paint.getTextWidths(charSequence, fArr);
                    float f4 = 0.0f;
                    for (int i2 = 0; i2 < charSequence.length(); i2++) {
                        f4 += fArr[i2] * f3;
                        if (i2 == charSequence.length() - 1 && f >= f4) {
                            return lineStart + charSequence.length();
                        }
                        if (f4 >= f || i2 == charSequence.length() - 1) {
                            return lineStart + i2;
                        }
                    }
                    continue;
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    public static void m104766a(View view) {
        String str;
        if (Build.VERSION.SDK_INT >= 30) {
            Log.m105928w("MicroMsg.AppBrand.InputUtil", "dumpImmDebugInfo skip >=30");
            return;
        }
        InputMethodManager b = m104767b(view);
        if (b == null) {
            str = "NULL Imm";
        } else {
            try {
                str = String.format(Locale.US, "mServedView=%s, mNextServedView=%s", new Object[]{(View) C79664a.m96761i(b).mo109794f("mServedView"), (View) C79664a.m96761i(b).mo109794f("mNextServedView")});
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrand.InputUtil", "dumpImmDebugInfo reflect failed %s", e);
                return;
            }
        }
        Log.m105925i("MicroMsg.AppBrand.InputUtil", "dumpImmDebugInfo: %s", str);
    }

    /* renamed from: b */
    public static InputMethodManager m104767b(View view) {
        Context context;
        if (view == null || (context = view.getContext()) == null) {
            context = MMApplicationContext.getContext();
        }
        return (InputMethodManager) context.getSystemService("input_method");
    }

    /* renamed from: c */
    public static boolean m104768c(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    /* renamed from: e */
    public static boolean m104769e(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) charSequence;
        Object[] spans = spanned.getSpans(0, spanned.length(), f247639d);
        return spans != null && spans.length > 0;
    }
}
