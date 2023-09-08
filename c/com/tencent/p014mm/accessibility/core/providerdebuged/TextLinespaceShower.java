package com.tencent.p014mm.accessibility.core.providerdebuged;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.accessibility.core.provider.Provider;
import com.tencent.p014mm.accessibility.uitl.AccUtil;
import com.tencent.p014mm.kiss.widget.textview.StaticTextView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/providerdebuged/TextLinespaceShower;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "Lrx3/b0;", "dealNodeInfo", "", "getAuthority", "<init>", "()V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.providerdebuged.TextLinespaceShower */
public final class TextLinespaceShower extends Provider {
    public static final int $stable = 0;
    public static final TextLinespaceShower INSTANCE = new TextLinespaceShower();

    private TextLinespaceShower() {
    }

    public void dealNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(accessibilityNodeInfo, "nodeInfo");
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            accessibilityNodeInfo.getExtras().putInt("MM_lineCount", textView.getLineCount());
            accessibilityNodeInfo.getExtras().putFloat("MM_lineSpacingMultiplier", textView.getLineSpacingMultiplier());
        } else if (view instanceof NeatTextView) {
            NeatTextView neatTextView = (NeatTextView) view;
            accessibilityNodeInfo.getExtras().putInt("MM_lineCount", neatTextView.getLineCount());
            accessibilityNodeInfo.getExtras().putFloat("MM_lineSpacingMultiplier", neatTextView.getWrappedTextView().getLineSpacingMultiplier());
        } else if (view instanceof StaticTextView) {
            StaticTextView staticTextView = (StaticTextView) view;
            accessibilityNodeInfo.getExtras().putInt("MM_lineCount", staticTextView.getLineCount());
            accessibilityNodeInfo.getExtras().putFloat("MM_lineSpacingMultiplier", staticTextView.getLineSpacingMultiplier());
        }
    }

    public int getAuthority() {
        return AccUtil.INSTANCE.isEnableShowTextLinespace() ? 1 : 0;
    }
}
