package com.tencent.p014mm.plugin.scanner.box;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/box/ScanGoodsDialogView;", "Lcom/tencent/mm/plugin/scanner/box/BaseBoxDialogView;", "", "getLayoutId", "getCloseLayoutHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.scanner.box.ScanGoodsDialogView */
public final class ScanGoodsDialogView extends BaseBoxDialogView {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScanGoodsDialogView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: d */
    public View mo67095d(View view) {
        C87412m.m108594g(view, "root");
        View findViewById = view.findViewById(C0966R.C0970id.beq);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.close_img)");
        return findViewById;
    }

    public int getCloseLayoutHeight() {
        return getContext().getResources().getDimensionPixelSize(C0966R.dimen.alg);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b4s;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanGoodsDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
