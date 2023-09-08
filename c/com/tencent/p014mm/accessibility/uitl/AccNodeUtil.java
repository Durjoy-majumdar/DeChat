package com.tencent.p014mm.accessibility.uitl;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.C103775c0;
import com.tencent.p014mm.accessibility.base.MapExpandKt;
import com.tencent.p014mm.accessibility.core.MMAccessibilityDelegateWrap;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.reflect.Field;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import p849e3.C107166a;
import p849e3.C107207u;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\r\u001a\u00020\f8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/uitl/AccNodeUtil;", "", "Landroid/view/accessibility/AccessibilityNodeInfo;", "originNode", "target", "Lrx3/b0;", "copy", "Landroid/view/View;", "view", "checkDelegate", "Landroid/view/View$AccessibilityDelegate;", "getOriginDelegate", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.uitl.AccNodeUtil */
public final class AccNodeUtil {
    public static final int $stable = 0;
    public static final AccNodeUtil INSTANCE = new AccNodeUtil();
    private static final String TAG = "MicroMsg.Acc.AccNodeUtil";

    private AccNodeUtil() {
    }

    public final void checkDelegate(View view) {
        C87412m.m108594g(view, "view");
        if (MapExpandKt.canDelegate(view)) {
            try {
                if (view.getAccessibilityDelegate() == null) {
                    view.setAccessibilityDelegate(new MMAccessibilityDelegateWrap((View.AccessibilityDelegate) null, 1, (C8480h) null));
                    return;
                }
                View.AccessibilityDelegate originDelegate = getOriginDelegate(view);
                if (originDelegate != null && !(originDelegate instanceof MMAccessibilityDelegateWrap)) {
                    view.setAccessibilityDelegate(new MMAccessibilityDelegateWrap(originDelegate));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void copy(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        C87412m.m108594g(accessibilityNodeInfo, "originNode");
        C87412m.m108594g(accessibilityNodeInfo2, "target");
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setClassName(accessibilityNodeInfo.getClassName());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        C87412m.m108593f(actionList, "it.actionList");
        for (AccessibilityNodeInfo.AccessibilityAction addAction : actionList) {
            accessibilityNodeInfo2.addAction(addAction);
        }
    }

    public final View.AccessibilityDelegate getOriginDelegate(View view) {
        C87412m.m108594g(view, "view");
        View.AccessibilityDelegate c = C107207u.m145162c(view);
        C107166a aVar = c == null ? null : c instanceof C107166a.C107167a ? ((C107166a.C107167a) c).f320754a : new C107166a(c);
        if (aVar == null) {
            return null;
        }
        if (aVar instanceof C103775c0.C103776a) {
            Field declaredField = C103775c0.C103776a.class.getDeclaredField("mOriginalItemDelegates");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            WeakHashMap weakHashMap = obj instanceof WeakHashMap ? (WeakHashMap) obj : null;
            Object obj2 = weakHashMap != null ? weakHashMap.get(view) : null;
            C107166a aVar2 = obj2 instanceof C107166a ? (C107166a) obj2 : null;
            if (aVar2 != null) {
                aVar = aVar2;
            }
        }
        Field declaredField2 = C107166a.class.getDeclaredField("mOriginalDelegate");
        declaredField2.setAccessible(true);
        Object obj3 = declaredField2.get(aVar);
        if (obj3 instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj3;
        }
        return null;
    }
}
