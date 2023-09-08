package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.AbsSnsUploadSayFooter;
import com.tencent.p014mm.sdk.platformtools.Log;
import o40.C61926c;

/* renamed from: com.tencent.mm.plugin.sns.ui.p7 */
public final class C96115p7 implements AbsSnsUploadSayFooter.C71260b {

    /* renamed from: a */
    public int f280726a;

    /* renamed from: b */
    public final /* synthetic */ C74974a f280727b;

    /* renamed from: c */
    public final /* synthetic */ AbsSnsUploadSayFooter f280728c;

    /* renamed from: d */
    public final /* synthetic */ C96173q7 f280729d;

    public C96115p7(C74974a aVar, AbsSnsUploadSayFooter absSnsUploadSayFooter, C96173q7 q7Var) {
        this.f280727b = aVar;
        this.f280728c = absSnsUploadSayFooter;
        this.f280729d = q7Var;
    }

    /* renamed from: Q */
    public void mo98032Q(boolean z, int i) {
        SnsMethodCalculate.markStartTimeMs("onInputChange", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$3");
        int selectionStart = this.f280727b.getSelectionStart();
        int i2 = C61926c.m72688m(this.f280728c).top;
        C96173q7 q7Var = this.f280729d;
        SnsMethodCalculate.markStartTimeMs("access$getNeedScrollCursorOnInputPanelChange$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        boolean z2 = q7Var.f280959f;
        SnsMethodCalculate.markEndTimeMs("access$getNeedScrollCursorOnInputPanelChange$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        boolean z3 = z2 || (this.f280726a == selectionStart && selectionStart != 0);
        String c = C96173q7.m123250c(this.f280729d);
        Log.m105924i(c, "onInputChange: lastCursorStart:" + this.f280726a + ", newCursorStart:" + selectionStart + ", needUpdateCursor:" + z3);
        if (z3) {
            C96173q7.m123249b(this.f280729d, C96173q7.m123248a(this.f280729d, selectionStart, this.f280727b.getLayout(), i2));
        }
        C96173q7 q7Var2 = this.f280729d;
        SnsMethodCalculate.markStartTimeMs("access$setNeedScrollCursorOnInputPanelChange$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        q7Var2.f280959f = false;
        SnsMethodCalculate.markEndTimeMs("access$setNeedScrollCursorOnInputPanelChange$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
        this.f280726a = selectionStart;
        SnsMethodCalculate.markEndTimeMs("onInputChange", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$3");
    }
}
