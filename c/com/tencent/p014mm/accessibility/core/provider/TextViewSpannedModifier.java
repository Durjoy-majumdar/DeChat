package com.tencent.p014mm.accessibility.core.provider;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.accessibility.uitl.AccUtil;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\r\u001a\u00020\f8\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/provider/TextViewSpannedModifier;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "Landroid/text/style/ClickableSpan;", "getIfOnlyClickableSpan", "Landroid/view/accessibility/AccessibilityEvent;", "event", "Lrx3/b0;", "dealAccEvent", "", "getAuthority", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.provider.TextViewSpannedModifier */
public final class TextViewSpannedModifier extends Provider {
    public static final int $stable = 0;
    public static final TextViewSpannedModifier INSTANCE = new TextViewSpannedModifier();
    public static final String TAG = "MicroMsg.Acc.TextViewSpannedModifier";

    private TextViewSpannedModifier() {
    }

    private final ClickableSpan getIfOnlyClickableSpan(View view) {
        CharSequence charSequence;
        boolean z = view instanceof NeatTextView;
        if (!z && !(view instanceof TextView)) {
            return null;
        }
        if (view instanceof TextView) {
            charSequence = ((TextView) view).getText();
            C87412m.m108593f(charSequence, "{\n                view.text\n            }");
        } else {
            if (z) {
                charSequence = ((NeatTextView) view).mo154968a();
                C87412m.m108593f(charSequence, "{\n                view._getText()\n            }");
            }
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            logMsg(TAG, view, "TextViewSpannedModifier," + charSequence + " type wrong:" + charSequence.getClass() + ' ');
            return null;
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        if (clickableSpanArr.length == 1 && clickableSpanArr[0] != null) {
            logMsg(TAG, view, "TextViewSpannedModifier," + charSequence + " success get Span");
            ClickableSpan clickableSpan = clickableSpanArr[0];
            C87412m.m108592e(clickableSpan, "null cannot be cast to non-null type android.text.style.ClickableSpan");
            return clickableSpan;
        }
        return null;
    }

    public void dealAccEvent(View view, AccessibilityEvent accessibilityEvent) {
        ClickableSpan ifOnlyClickableSpan;
        C87412m.m108594g(view, "view");
        C87412m.m108594g(accessibilityEvent, "event");
        if (accessibilityEvent.getEventType() == 1 && AccUtil.INSTANCE.isAccessibilityEnabled() && (ifOnlyClickableSpan = getIfOnlyClickableSpan(view)) != null) {
            ifOnlyClickableSpan.onClick(view);
        }
    }

    public int getAuthority() {
        return 4;
    }
}
