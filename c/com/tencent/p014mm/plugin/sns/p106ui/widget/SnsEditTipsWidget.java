package com.tencent.p014mm.plugin.sns.p106ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.MMTextView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import vr2.C65874b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0001\u0017B%\b\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015B\u001d\b\u0016\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/widget/SnsEditTipsWidget;", "Lcom/tencent/mm/ui/widget/MMTextView;", "Lcom/tencent/mm/plugin/sns/ui/widget/SnsEditTipsWidget$a;", "listener", "Lrx3/b0;", "setOnEditTipsVisibilityChangedListener", "", "o", "I", "getErrorColorResId", "()I", "errorColorResId", "p", "getTipsColorResId", "tipsColorResId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget */
public abstract class SnsEditTipsWidget extends MMTextView {

    /* renamed from: n */
    public final String f206216n = "MicroMsg.SnsEditTipsWidget";

    /* renamed from: o */
    public final int f206217o = C0966R.color.f2966ao;

    /* renamed from: p */
    public final int f206218p = C0966R.color.f3288ma;

    /* renamed from: q */
    public int f206219q;

    /* renamed from: r */
    public boolean f206220r;

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget$a */
    public interface C71261a {
        /* renamed from: a */
        void mo98041a(boolean z);
    }

    public SnsEditTipsWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final boolean mo98037a(String str) {
        int i;
        boolean z;
        SnsMethodCalculate.markStartTimeMs("checkVisibilityByText", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        C87412m.m108594g(str, "newText");
        int f = C45078p0.m49927f(str);
        SnsMethodCalculate.markStartTimeMs("checkVisibilityByTextLength", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        int i2 = this.f206219q;
        this.f206219q = f;
        int visibility = getVisibility();
        int b = mo98033b();
        int e = mo98036e();
        int i3 = this.f206219q;
        if (i3 > b) {
            i = b - i3;
            C65874b0.C65875a aVar = C65874b0.f189421a;
            String c = mo98034c(C65874b0.C65875a.m77615a(aVar, i3, false, 2, (Object) null) - C65874b0.C65875a.m77615a(aVar, b, false, 2, (Object) null));
            int d = C76577a.m92153d(getContext(), this.f206217o);
            SnsMethodCalculate.markStartTimeMs("show", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
            C87412m.m108594g(c, "newText");
            setVisibility(0);
            setTextColor(d);
            setText(c);
            SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
            if (!this.f206220r) {
                this.f206220r = true;
                performHapticFeedback(3, 2);
            }
        } else if (i3 >= b - e) {
            i = b - i3;
            C65874b0.C65875a aVar2 = C65874b0.f189421a;
            String d2 = mo98035d(C65874b0.C65875a.m77615a(aVar2, b, false, 2, (Object) null) - C65874b0.C65875a.m77615a(aVar2, this.f206219q, false, 2, (Object) null));
            int d3 = C76577a.m92153d(getContext(), this.f206218p);
            SnsMethodCalculate.markStartTimeMs("show", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
            C87412m.m108594g(d2, "newText");
            setVisibility(0);
            setTextColor(d3);
            setText(d2);
            SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        } else {
            i = b - i3;
            SnsMethodCalculate.markStartTimeMs("hide", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
            setVisibility(8);
            setText("");
            SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
            z = false;
            int visibility2 = getVisibility();
            String str2 = this.f206216n;
            Log.m105918d(str2, "checkVisibilityByTextLength: lastTextCount:" + i2 + ", currentCount:" + this.f206219q + ", currentRemainCount:" + i);
            SnsMethodCalculate.markEndTimeMs("checkVisibilityByTextLength", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
            SnsMethodCalculate.markEndTimeMs("checkVisibilityByText", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
            return z;
        }
        z = true;
        int visibility22 = getVisibility();
        String str22 = this.f206216n;
        Log.m105918d(str22, "checkVisibilityByTextLength: lastTextCount:" + i2 + ", currentCount:" + this.f206219q + ", currentRemainCount:" + i);
        SnsMethodCalculate.markEndTimeMs("checkVisibilityByTextLength", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        SnsMethodCalculate.markEndTimeMs("checkVisibilityByText", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        return z;
    }

    /* renamed from: b */
    public abstract int mo98033b();

    /* renamed from: c */
    public abstract String mo98034c(int i);

    /* renamed from: d */
    public abstract String mo98035d(int i);

    /* renamed from: e */
    public abstract int mo98036e();

    public final int getErrorColorResId() {
        SnsMethodCalculate.markStartTimeMs("getErrorColorResId", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        int i = this.f206217o;
        SnsMethodCalculate.markEndTimeMs("getErrorColorResId", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        return i;
    }

    public final int getTipsColorResId() {
        SnsMethodCalculate.markStartTimeMs("getTipsColorResId", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        int i = this.f206218p;
        SnsMethodCalculate.markEndTimeMs("getTipsColorResId", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        return i;
    }

    public final void setOnEditTipsVisibilityChangedListener(C71261a aVar) {
        SnsMethodCalculate.markStartTimeMs("setOnEditTipsVisibilityChangedListener", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        SnsMethodCalculate.markEndTimeMs("setOnEditTipsVisibilityChangedListener", "com.tencent.mm.plugin.sns.ui.widget.SnsEditTipsWidget");
    }

    public SnsEditTipsWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
