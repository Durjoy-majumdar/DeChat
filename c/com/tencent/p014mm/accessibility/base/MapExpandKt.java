package com.tencent.p014mm.accessibility.base;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import rx3.C13598b0;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000:\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001e\u0010\f\u001a\u00020\u0006*\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\n\u001a\u0018\u0010\u000f\u001a\u00020\u0006*\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u001a\n\u0010\u0011\u001a\u00020\u0010*\u00020\t\u001a\n\u0010\u0012\u001a\u00020\u0010*\u00020\t\u001a\n\u0010\u0013\u001a\u00020\u0010*\u00020\t\u001a\n\u0010\u0014\u001a\u00020\u0010*\u00020\t\u001a\n\u0010\u0016\u001a\u00020\u0006*\u00020\u0015¨\u0006\u0017"}, mo182094d2 = {"T", "", "", "outsideInt", "insideInt", "data", "Lrx3/b0;", "putData", "(Ljava/util/Map;IILjava/lang/Object;)V", "Landroid/view/View;", "Lkotlin/Function1;", "visitor", "visitChild", "Lkotlin/Function0;", "invoke", "postIfNeed", "", "isList", "canDelegateOnInflate", "canDelegate", "isComposeView", "Landroid/view/accessibility/AccessibilityNodeInfo;", "disable", "plugin-autoaccessibility_release"}, mo182095k = 2, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.base.MapExpandKt */
public final class MapExpandKt {
    public static final boolean canDelegate(View view) {
        C87412m.m108594g(view, "<this>");
        return !isList(view) && !isComposeView(view);
    }

    public static final boolean canDelegateOnInflate(View view) {
        C87412m.m108594g(view, "<this>");
        if (!isList(view)) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            return !(viewGroup != null && isList(viewGroup)) && !isComposeView(view);
        }
    }

    public static final void disable(AccessibilityNodeInfo accessibilityNodeInfo) {
        C87412m.m108594g(accessibilityNodeInfo, "<this>");
        accessibilityNodeInfo.setText("");
        accessibilityNodeInfo.setContentDescription("");
        accessibilityNodeInfo.setHintText("");
        accessibilityNodeInfo.setCheckable(false);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        accessibilityNodeInfo.setFocusable(false);
    }

    public static final boolean isComposeView(View view) {
        C87412m.m108594g(view, "<this>");
        return C112550d0.m153801u(view.getClass().getSimpleName(), "AndroidComposeView", false);
    }

    public static final boolean isList(View view) {
        C87412m.m108594g(view, "<this>");
        return (view instanceof ListView) || (view instanceof RecyclerView);
    }

    public static final void postIfNeed(View view, C32224a<C13598b0> aVar) {
        C87412m.m108594g(view, "<this>");
        C87412m.m108594g(aVar, "invoke");
        if (view.getWidth() == 0 && view.getHeight() == 0) {
            view.post(new MapExpandKt$postIfNeed$1(aVar));
        } else {
            aVar.invoke();
        }
    }

    public static final <T> void putData(Map<Integer, Map<Integer, T>> map, int i, int i2, T t) {
        C87412m.m108594g(map, "<this>");
        if (map.get(Integer.valueOf(i)) == null) {
            map.put(Integer.valueOf(i), new LinkedHashMap());
        }
        Integer valueOf = Integer.valueOf(i2);
        Map<Integer, T> map2 = map.get(Integer.valueOf(i));
        C87412m.m108591d(map2);
        map2.put(valueOf, t);
    }

    public static final void visitChild(View view, C32226l<? super View, C13598b0> lVar) {
        C87412m.m108594g(view, "<this>");
        C87412m.m108594g(lVar, "visitor");
        lVar.invoke(view);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    visitChild(childAt, lVar);
                }
            }
        }
    }
}
