package com.tencent.p014mm.accessibility.core.provider;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/provider/TypeModifier;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "Lrx3/b0;", "dealNodeInfo", "", "getAuthority", "", "TAG", "Ljava/lang/String;", "BUTTON_CLASS", "TEXTVIEW_CLASS", "<init>", "()V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.provider.TypeModifier */
public final class TypeModifier extends Provider {
    public static final int $stable = 0;
    public static final String BUTTON_CLASS = "android.widget.Button";
    public static final TypeModifier INSTANCE;
    public static final String TAG = "MicroMsg.Acc.TypeModifier";
    public static final String TEXTVIEW_CLASS = "android.widget.TextView";

    static {
        TypeModifier typeModifier = new TypeModifier();
        INSTANCE = typeModifier;
        typeModifier.addRootIdMapper$plugin_autoaccessibility_release(C1045871.INSTANCE);
    }

    private TypeModifier() {
    }

    public void dealNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(accessibilityNodeInfo, "nodeInfo");
        getConfig(view, new TypeModifier$dealNodeInfo$1(view, accessibilityNodeInfo));
    }

    public int getAuthority() {
        return 1;
    }
}
