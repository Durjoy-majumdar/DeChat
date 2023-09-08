package com.tencent.p014mm.plugin.sns.p106ui;

import android.text.Layout;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.AbsSnsUploadSayFooter;
import com.tencent.p014mm.sdk.platformtools.Log;
import o40.C61926c;

/* renamed from: com.tencent.mm.plugin.sns.ui.o7 */
public final class C96103o7 implements C74974a.C74977c {

    /* renamed from: a */
    public final /* synthetic */ C96173q7 f280683a;

    /* renamed from: b */
    public final /* synthetic */ AbsSnsUploadSayFooter f280684b;

    /* renamed from: c */
    public final /* synthetic */ C74974a f280685c;

    public C96103o7(C96173q7 q7Var, AbsSnsUploadSayFooter absSnsUploadSayFooter, C74974a aVar) {
        this.f280683a = q7Var;
        this.f280684b = absSnsUploadSayFooter;
        this.f280685c = aVar;
    }

    /* renamed from: a */
    public final void mo71794a(int i, int i2, Layout layout) {
        SnsMethodCalculate.markStartTimeMs("onSelectionChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$2");
        if (i == 0 && i2 == 0) {
            Log.m105924i(C96173q7.m123250c(this.f280683a), "onSelectionChanged: selStart = selEnd = 0, skip");
            SnsMethodCalculate.markEndTimeMs("onSelectionChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$2");
            return;
        }
        int i3 = C61926c.m72688m(this.f280684b).top;
        Log.m105919d(C96173q7.m123250c(this.f280683a), "onSelectionChanged: selStart:%d, selEnd:%d, footerBarTopRawY:%d, inputView scrollY:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(this.f280685c.view().getScrollY()));
        if (this.f280684b.getVisibility() != 0 || i3 == 0) {
            C96173q7 q7Var = this.f280683a;
            SnsMethodCalculate.markStartTimeMs("access$setNeedScrollCursorOnInputPanelChange$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
            q7Var.f280959f = true;
            SnsMethodCalculate.markEndTimeMs("access$setNeedScrollCursorOnInputPanelChange$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
            Log.m105918d(C96173q7.m123250c(this.f280683a), "editText onSelectionChanged: wait to run onInputPanelChange");
        } else {
            C96173q7.m123249b(this.f280683a, C96173q7.m123248a(this.f280683a, i, layout, i3));
        }
        SnsMethodCalculate.markEndTimeMs("onSelectionChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$2");
    }
}
