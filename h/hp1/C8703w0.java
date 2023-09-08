package hp1;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kg3.C76577a;
import te3.C50972qk0;

/* renamed from: hp1.w0 */
public final class C8703w0 {

    /* renamed from: a */
    public static final C8703w0 f27927a = new C8703w0();

    /* renamed from: b */
    public static final int f27928b = (C76577a.m92145A(MMApplicationContext.getContext()) - C76577a.m92151b(MMApplicationContext.getContext(), 72));

    /* renamed from: c */
    public static C50972qk0 f27929c;

    /* renamed from: d */
    public static ConcurrentHashMap<Long, FinderItem> f27930d = new ConcurrentHashMap<>();

    /* renamed from: d */
    public static /* synthetic */ Spanned m8539d(C8703w0 w0Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return w0Var.mo9552c(str, str2);
    }

    /* renamed from: a */
    public final String mo9550a(String str) {
        Log.m105918d("getHighLightWordReplaceStart", "getHighLightWordReplaceStart: " + str);
        if (TextUtils.isEmpty(str)) {
            return "<font color=\"#06AD56\">";
        }
        return "<font color=" + str + '>';
    }

    /* renamed from: b */
    public final Spanned mo9551b(String str, TextPaint textPaint, int i, String str2, boolean z) {
        int i2;
        int i3;
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.ORIGIN);
        C87412m.m108594g(textPaint, "textPaint");
        C87412m.m108594g(str2, "highLightFontColor");
        String a = mo9550a(str2);
        Pattern compile = Pattern.compile("<em class=\"highlight\">");
        C87412m.m108593f(compile, "compile(pattern)");
        C87412m.m108594g(a, "replacement");
        String replaceAll = compile.matcher(str).replaceAll(a);
        C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        Pattern compile2 = Pattern.compile("</em>");
        C87412m.m108593f(compile2, "compile(pattern)");
        String replaceAll2 = compile2.matcher(replaceAll).replaceAll("</font>");
        C87412m.m108593f(replaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
        Spanned fromHtml = Html.fromHtml(replaceAll2);
        float f = (float) i;
        if (textPaint.measureText(fromHtml.toString()) <= f || !(fromHtml instanceof SpannableStringBuilder)) {
            return fromHtml;
        }
        float textSize = f - (z ? textPaint.getTextSize() * ((float) 2) : 0.0f);
        float measureText = textPaint.measureText("…");
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) fromHtml.getSpans(0, fromHtml.length(), ForegroundColorSpan.class);
        if (foregroundColorSpanArr != null) {
            int length = foregroundColorSpanArr.length;
            int i4 = 0;
            i3 = 0;
            i2 = 0;
            while (i4 < length) {
                ForegroundColorSpan foregroundColorSpan = foregroundColorSpanArr[i4];
                i4++;
                int spanStart = fromHtml.getSpanStart(foregroundColorSpan);
                i2 = fromHtml.getSpanEnd(foregroundColorSpan);
                i3 = spanStart;
            }
        } else {
            i3 = 0;
            i2 = 0;
        }
        if (i2 == 0) {
            return fromHtml;
        }
        float measureText2 = textPaint.measureText(fromHtml, 0, i3);
        float measureText3 = textPaint.measureText(fromHtml, i3, i2);
        float measureText4 = textPaint.measureText(fromHtml, i2, fromHtml.length());
        CharSequence subSequence = fromHtml.subSequence(0, i3);
        CharSequence subSequence2 = fromHtml.subSequence(i3, i2);
        CharSequence subSequence3 = fromHtml.subSequence(i2, fromHtml.length());
        if (measureText2 + measureText3 + measureText < textSize) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subSequence);
            spannableStringBuilder.append(subSequence2);
            spannableStringBuilder.append(TextUtils.ellipsize(subSequence3, textPaint, (textSize - measureText2) - measureText3, TextUtils.TruncateAt.END));
            return spannableStringBuilder;
        }
        float f2 = measureText + measureText3;
        if (f2 + measureText4 < textSize) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append(TextUtils.ellipsize(subSequence, textPaint, (textSize - measureText3) - measureText4, TextUtils.TruncateAt.START));
            spannableStringBuilder2.append(subSequence2);
            spannableStringBuilder2.append(subSequence3);
            return spannableStringBuilder2;
        } else if (f2 + measureText >= textSize) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append(TextUtils.ellipsize(subSequence2, textPaint, textSize, TextUtils.TruncateAt.END));
            return spannableStringBuilder3;
        } else {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
            float f3 = (textSize - measureText3) / ((float) 2);
            spannableStringBuilder4.append(TextUtils.ellipsize(subSequence, textPaint, f3, TextUtils.TruncateAt.START));
            spannableStringBuilder4.append(subSequence2);
            spannableStringBuilder4.append(TextUtils.ellipsize(subSequence3, textPaint, f3, TextUtils.TruncateAt.END));
            return spannableStringBuilder4;
        }
    }

    /* renamed from: c */
    public final Spanned mo9552c(String str, String str2) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.ORIGIN);
        C87412m.m108594g(str2, "highLightFontColor");
        String a = mo9550a(str2);
        Pattern compile = Pattern.compile("<em class=\"highlight\">");
        C87412m.m108593f(compile, "compile(pattern)");
        C87412m.m108594g(a, "replacement");
        String replaceAll = compile.matcher(str).replaceAll(a);
        C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        Pattern compile2 = Pattern.compile("</em>");
        C87412m.m108593f(compile2, "compile(pattern)");
        String replaceAll2 = compile2.matcher(replaceAll).replaceAll("</font>");
        C87412m.m108593f(replaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
        Spanned fromHtml = Html.fromHtml(replaceAll2);
        if (fromHtml instanceof SpannableStringBuilder) {
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) fromHtml.getSpans(0, fromHtml.length(), ForegroundColorSpan.class);
            if (foregroundColorSpanArr != null) {
                for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                    int spanStart = fromHtml.getSpanStart(foregroundColorSpan);
                    int spanEnd = fromHtml.getSpanEnd(foregroundColorSpan);
                    StringBuilder sb = new StringBuilder();
                    sb.append(spanStart);
                    sb.append(' ');
                    sb.append(spanEnd);
                    Log.m105924i("Finder.Hightlight", sb.toString());
                }
            }
        }
        C87412m.m108593f(fromHtml, "spanStr");
        return fromHtml;
    }

    /* renamed from: e */
    public final String mo9553e(String str) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.ORIGIN);
        Pattern compile = Pattern.compile("<em class=\"highlight\">");
        C87412m.m108593f(compile, "compile(pattern)");
        String replaceAll = compile.matcher(str).replaceAll("");
        C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        Pattern compile2 = Pattern.compile("</em>");
        C87412m.m108593f(compile2, "compile(pattern)");
        String replaceAll2 = compile2.matcher(replaceAll).replaceAll("");
        C87412m.m108593f(replaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll2;
    }
}
