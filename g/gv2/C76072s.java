package gv2;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.tencent.p014mm.plugin.sns.model.C94847c1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import de3.C75359b0;
import de3.C75375u;
import di3.C86312j;
import p629ny.C76979h;
import zr2.C66976a;

/* renamed from: gv2.s */
public class C76072s {
    /* renamed from: a */
    public static CharSequence m91372a(Spannable spannable) {
        C75359b0[] b0VarArr;
        String str;
        SnsMethodCalculate.markStartTimeMs("compressedPostDesc", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescUtil");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
        try {
            if (!Util.isNullOrNil((CharSequence) spannable) && (b0VarArr = (C75359b0[]) spannable.getSpans(0, spannable.length(), C75359b0.class)) != null && b0VarArr.length > 0) {
                for (C75359b0 b0Var : b0VarArr) {
                    if (b0Var.getType() == 1 && (str = b0Var.getHrefInfo().f148312c) != null && str.length() > C94847c1.m120218f() && spannableStringBuilder.toString().contains(str)) {
                        String str2 = str.substring(0, C94847c1.m120218f()) + "...";
                        SpannableString spannableString = new SpannableString(str2);
                        spannableString.setSpan(new C75359b0(2, b0Var.getHrefInfo()), 0, str2.length(), 33);
                        int indexOf = spannableStringBuilder.toString().indexOf(str);
                        spannableStringBuilder.replace(indexOf, str.length() + indexOf, spannableString);
                    }
                }
            }
        } catch (Exception unused) {
            Log.m105929w("MicroMsg.SnsPostDescUtil", "compressedPostDesc fail:%s", spannable);
        }
        SnsMethodCalculate.markEndTimeMs("compressedPostDesc", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescUtil");
        return spannableStringBuilder;
    }

    /* renamed from: b */
    public static C75375u m91373b(Context context, String str, float f, Object obj, long j, int i) {
        SnsMethodCalculate.markStartTimeMs("getPostDescSpan", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescUtil");
        C75375u uVar = new C75375u(C66976a.m79134f(j, ((C76979h) C86312j.m106911c(C76979h.class)).mo107073mM(context, str, (int) f, i, obj), 0, i));
        SnsMethodCalculate.markEndTimeMs("getPostDescSpan", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescUtil");
        return uVar;
    }
}
