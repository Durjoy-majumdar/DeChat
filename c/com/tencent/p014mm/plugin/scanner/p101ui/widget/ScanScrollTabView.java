package com.tencent.p014mm.plugin.scanner.p101ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kotlin.Metadata;
import ul2.C111199e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/ui/widget/ScanScrollTabView;", "Lcom/tencent/mm/plugin/scanner/ui/widget/BaseScrollTabView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScanScrollTabView */
public final class ScanScrollTabView extends BaseScrollTabView {

    /* renamed from: I */
    public int f316113I;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScanScrollTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: g */
    public void mo151702g(C111199e eVar, int i) {
        C87412m.m108594g(eVar, "tab");
    }

    /* renamed from: h */
    public void mo151705h(C111199e eVar, int i) {
        C87412m.m108594g(eVar, "tab");
    }

    /* renamed from: k */
    public void mo151824k(C111199e eVar) {
        C87412m.m108594g(eVar, "tab");
        if (eVar instanceof View) {
            int i = this.f316113I;
            ((View) eVar).setPadding(i, 0, i, 0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanScrollTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f316113I = context.getResources().getDimensionPixelSize(C0966R.dimen.f3895i6);
    }
}
