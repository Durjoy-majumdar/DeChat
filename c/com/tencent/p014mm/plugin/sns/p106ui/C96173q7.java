package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.text.Layout;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.AbsSnsUploadSayFooter;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import o40.C61926c;

/* renamed from: com.tencent.mm.plugin.sns.ui.q7 */
public final class C96173q7 {

    /* renamed from: a */
    public final Context f280954a;

    /* renamed from: b */
    public final String f280955b = "MicroMsg.SnsUpload.InputScrollHelper";

    /* renamed from: c */
    public int f280956c;

    /* renamed from: d */
    public int f280957d;

    /* renamed from: e */
    public int f280958e = -1;

    /* renamed from: f */
    public boolean f280959f;

    /* renamed from: g */
    public C74974a f280960g;

    /* renamed from: h */
    public WrapScollview f280961h;

    /* renamed from: i */
    public AbsSnsUploadSayFooter f280962i;

    public C96173q7(Context context) {
        C87412m.m108594g(context, "context");
        this.f280954a = context;
    }

    /* renamed from: a */
    public static final C96209r7 m123248a(C96173q7 q7Var, int i, Layout layout, int i2) {
        SnsMethodCalculate.markStartTimeMs("access$buildScrollCursorTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        q7Var.getClass();
        SnsMethodCalculate.markStartTimeMs("buildScrollCursorTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        C96209r7 r7Var = null;
        if (q7Var.f280962i == null || q7Var.f280960g == null || q7Var.f280961h == null) {
            Log.m105920e(q7Var.f280955b, "buildScrollCursorTask: view null");
            SnsMethodCalculate.markEndTimeMs("buildScrollCursorTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        } else if (layout == null || layout.getLineCount() < 0) {
            Log.m105920e(q7Var.f280955b, "buildScrollCursorTask: editTextLayout error");
            SnsMethodCalculate.markEndTimeMs("buildScrollCursorTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        } else {
            int lineForOffset = layout.getLineForOffset(i);
            int lineTop = layout.getLineTop(lineForOffset);
            int lineBottom = layout.getLineBottom(lineForOffset);
            if (i2 != 0) {
                AbsSnsUploadSayFooter absSnsUploadSayFooter = q7Var.f280962i;
                C87412m.m108591d(absSnsUploadSayFooter);
                Boolean a = absSnsUploadSayFooter.mo98021a();
                C87412m.m108593f(a, "footerView!!.isFooterBarLayOnPageBottom");
                if (a.booleanValue()) {
                    AbsSnsUploadSayFooter absSnsUploadSayFooter2 = q7Var.f280962i;
                    C87412m.m108591d(absSnsUploadSayFooter2);
                    i2 -= absSnsUploadSayFooter2.getKeyboardHeight();
                }
            }
            if (q7Var.f280956c == 0) {
                C74974a aVar = q7Var.f280960g;
                C87412m.m108591d(aVar);
                View view = aVar.view();
                C87412m.m108593f(view, "inputView!!.view()");
                q7Var.f280956c = C61926c.m72688m(view).top;
            }
            WrapScollview wrapScollview = q7Var.f280961h;
            C87412m.m108591d(wrapScollview);
            int scrollY = wrapScollview.getScrollY();
            int i3 = q7Var.f280956c;
            int i4 = (lineTop + i3) - scrollY;
            q7Var.f280958e = i4;
            if (i4 > i3) {
                q7Var.f280958e = (lineBottom + i3) - scrollY;
            }
            C96209r7 r7Var2 = new C96209r7(q7Var.f280958e, i3, q7Var.f280957d, q7Var.f280961h);
            SnsMethodCalculate.markStartTimeMs("setFooterBarTopRawY", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
            r7Var2.f281145e = i2;
            SnsMethodCalculate.markEndTimeMs("setFooterBarTopRawY", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
            String str = q7Var.f280955b;
            Log.m105918d(str, "buildScrollCursorTask selStart:" + i + ", line:" + lineForOffset + ", lineTop:" + lineTop + ", lineBottom:" + lineBottom + ", etTopRawY：" + q7Var.f280956c + ", cursorRawY:" + q7Var.f280958e + ", scrollY:" + scrollY);
            SnsMethodCalculate.markEndTimeMs("buildScrollCursorTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
            r7Var = r7Var2;
        }
        SnsMethodCalculate.markEndTimeMs("access$buildScrollCursorTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        return r7Var;
    }

    /* renamed from: b */
    public static final void m123249b(C96173q7 q7Var, C96209r7 r7Var) {
        SnsMethodCalculate.markStartTimeMs("access$doUpdateCursorScrollTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        q7Var.getClass();
        SnsMethodCalculate.markStartTimeMs("doUpdateCursorScrollTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        if (r7Var != null) {
            SnsMethodCalculate.markStartTimeMs("isHadRun", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
            boolean z = r7Var.f281149i;
            SnsMethodCalculate.markEndTimeMs("isHadRun", "com.tencent.mm.plugin.sns.ui.SnsUploadUIManualScrollCursorTask");
            if (!z) {
                Log.m105924i(q7Var.f280955b, "do UpdateCursorScrollTask");
                r7Var.run();
            }
        }
        SnsMethodCalculate.markEndTimeMs("doUpdateCursorScrollTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        SnsMethodCalculate.markEndTimeMs("access$doUpdateCursorScrollTask", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
    }

    /* renamed from: c */
    public static final /* synthetic */ String m123250c(C96173q7 q7Var) {
        SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        String str = q7Var.f280955b;
        SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        return str;
    }
}
