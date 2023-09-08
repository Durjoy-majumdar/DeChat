package ju2;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.smiley.C96965r;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedHashMap;
import java.util.Map;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: ju2.l */
public final class C99053l {

    /* renamed from: a */
    public static final C99053l f290358a = new C99053l();

    /* renamed from: b */
    public static final C13601g f290359b = C36568h.m40985a(C33696a.f91150d);

    /* renamed from: ju2.l$a */
    public static final class C33696a extends C87413o implements C32224a<Map<String, CharSequence>> {

        /* renamed from: d */
        public static final C33696a f91150d = new C33696a();

        public C33696a() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil$foldCommentContentMap$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil$foldCommentContentMap$2");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil$foldCommentContentMap$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil$foldCommentContentMap$2");
            return linkedHashMap;
        }
    }

    /* renamed from: a */
    public final Map<String, CharSequence> mo138403a() {
        SnsMethodCalculate.markStartTimeMs("getFoldCommentContentMap", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        Map<String, CharSequence> map = (Map) ((C36570n) f290359b).getValue();
        SnsMethodCalculate.markEndTimeMs("getFoldCommentContentMap", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        return map;
    }

    /* renamed from: b */
    public final CharSequence mo138404b(CharSequence charSequence, TextView textView, int i, int i2, int i3) {
        CharSequence charSequence2 = charSequence;
        int i4 = i;
        SnsMethodCalculate.markStartTimeMs("getFoldCommentString", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        C87412m.m108594g(charSequence, "content");
        C87412m.m108594g(textView, "tv");
        StaticLayout staticLayout = new StaticLayout(charSequence, textView.getPaint(), i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        double d = (double) (i4 - i2);
        int i5 = i3 - 1;
        int lineEnd = staticLayout.getLineEnd(i5);
        int lineStart = staticLayout.getLineStart(i5);
        int min = Math.min(charSequence.length() - 1, lineEnd);
        if (lineStart < 0 || min >= charSequence.length() || lineStart >= min) {
            Log.m105920e("MicroMsg.Improve.TextUtil", "getFoldCommentString error,start:" + lineStart + " last:" + min);
            SnsMethodCalculate.markEndTimeMs("getFoldCommentString", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
            return "";
        }
        CharSequence subSequence = charSequence.subSequence(lineStart, min);
        boolean z = C96965r.f284067d;
        int g = C96965r.C44649c.f121057a.mo135555g(subSequence.toString(), 0, (int) (((double) (lineEnd - lineStart)) * (d / ((double) i4))));
        int i6 = g + lineStart;
        Log.m105918d("MicroMsg.Improve.TextUtil", "getFoldCommentString: safeCutIndex:" + i6 + ", lineWidth:" + i4 + ", lastShowLine:[TargetWidth:" + d + ", StartIndex:" + lineStart + ", EndIndex:" + lineEnd + ", cutIndex:" + g + ']');
        CharSequence subSequence2 = charSequence.subSequence(0, i6);
        SnsMethodCalculate.markEndTimeMs("getFoldCommentString", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        return subSequence2;
    }

    /* renamed from: c */
    public final int mo138405c(TextView textView, CharSequence charSequence, int i) {
        StaticLayout staticLayout;
        CharSequence charSequence2 = charSequence;
        SnsMethodCalculate.markStartTimeMs("getTextViewLines", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        C87412m.m108594g(textView, "textView");
        if (charSequence2 == null) {
            SnsMethodCalculate.markEndTimeMs("getTextViewLines", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
            return 0;
        }
        int compoundPaddingLeft = (i - textView.getCompoundPaddingLeft()) - textView.getCompoundPaddingRight();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            SnsMethodCalculate.markStartTimeMs("getStaticLayout23", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence2, 0, charSequence.length(), textView.getPaint(), compoundPaddingLeft).setAlignment(Layout.Alignment.ALIGN_NORMAL).setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            C87412m.m108593f(hyphenationFrequency, "obtain(\n            cont…iew.hyphenationFrequency)");
            if (i2 >= 26) {
                hyphenationFrequency.setJustificationMode(textView.getJustificationMode());
            }
            if (textView.getEllipsize() != null && textView.getKeyListener() == null) {
                hyphenationFrequency.setEllipsize(textView.getEllipsize()).setEllipsizedWidth(compoundPaddingLeft);
            }
            staticLayout = hyphenationFrequency.build();
            C87412m.m108593f(staticLayout, "builder.build()");
            SnsMethodCalculate.markEndTimeMs("getStaticLayout23", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        } else {
            SnsMethodCalculate.markStartTimeMs("getStaticLayout", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
            StaticLayout staticLayout2 = new StaticLayout(charSequence, 0, charSequence.length(), textView.getPaint(), compoundPaddingLeft, Layout.Alignment.ALIGN_NORMAL, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding(), textView.getEllipsize(), compoundPaddingLeft);
            SnsMethodCalculate.markEndTimeMs("getStaticLayout", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
            staticLayout = staticLayout2;
        }
        int lineCount = staticLayout.getLineCount();
        SnsMethodCalculate.markEndTimeMs("getTextViewLines", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        return lineCount;
    }
}
