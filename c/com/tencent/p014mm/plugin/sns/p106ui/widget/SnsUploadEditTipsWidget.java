package com.tencent.p014mm.plugin.sns.p106ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import java.util.Arrays;
import kg3.C76577a;
import kotlin.Metadata;
import p645pj.C77092c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/widget/SnsUploadEditTipsWidget;", "Lcom/tencent/mm/plugin/sns/ui/widget/SnsEditTipsWidget;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsUploadEditTipsWidget */
public final class SnsUploadEditTipsWidget extends SnsEditTipsWidget {
    public SnsUploadEditTipsWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: b */
    public int mo98033b() {
        SnsMethodCalculate.markStartTimeMs("maxInputCount", "com.tencent.mm.plugin.sns.ui.widget.SnsUploadEditTipsWidget");
        int l = C77092c.m93050l();
        SnsMethodCalculate.markEndTimeMs("maxInputCount", "com.tencent.mm.plugin.sns.ui.widget.SnsUploadEditTipsWidget");
        return l;
    }

    /* renamed from: c */
    public String mo98034c(int i) {
        SnsMethodCalculate.markStartTimeMs("overCountTips", "com.tencent.mm.plugin.sns.ui.widget.SnsUploadEditTipsWidget");
        String q = C76577a.m92166q(getContext(), C0966R.string.n5p);
        C87412m.m108593f(q, "getString(context, R.str…ips_over_character_count)");
        String format = String.format(q, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        SnsMethodCalculate.markEndTimeMs("overCountTips", "com.tencent.mm.plugin.sns.ui.widget.SnsUploadEditTipsWidget");
        return format;
    }

    /* renamed from: d */
    public String mo98035d(int i) {
        SnsMethodCalculate.markStartTimeMs("remainCountTips", "com.tencent.mm.plugin.sns.ui.widget.SnsUploadEditTipsWidget");
        String q = C76577a.m92166q(getContext(), C0966R.string.n5q);
        C87412m.m108593f(q, "getString(context, R.str…s_remain_character_count)");
        String format = String.format(q, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        SnsMethodCalculate.markEndTimeMs("remainCountTips", "com.tencent.mm.plugin.sns.ui.widget.SnsUploadEditTipsWidget");
        return format;
    }

    /* renamed from: e */
    public int mo98036e() {
        SnsMethodCalculate.markStartTimeMs("startShowRemainCount", "com.tencent.mm.plugin.sns.ui.widget.SnsUploadEditTipsWidget");
        SnsMethodCalculate.markEndTimeMs("startShowRemainCount", "com.tencent.mm.plugin.sns.ui.widget.SnsUploadEditTipsWidget");
        return 200;
    }

    public SnsUploadEditTipsWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
