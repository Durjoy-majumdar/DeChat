package gj3;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import z04.C112551y;

/* renamed from: gj3.c */
public final class C59470c {
    /* renamed from: a */
    public static final List<Pair<View, String>> m69393a(View view) {
        C87412m.m108594g(view, "<this>");
        LinkedList linkedList = new LinkedList();
        m69394b(view, linkedList);
        if (linkedList.size() > 0) {
            return linkedList;
        }
        return null;
    }

    /* renamed from: b */
    public static final void m69394b(View view, List<Pair<View, String>> list) {
        boolean z = true;
        if (view.getVisibility() == 0) {
            String transitionName = view.getTransitionName();
            if (!(transitionName == null || C112551y.m153811k(transitionName))) {
                Pair create = Pair.create(view, view.getTransitionName());
                C87412m.m108593f(create, "create(this, transitionName)");
                list.add(create);
            }
        }
        if (view.getVisibility() != 0) {
            z = false;
        }
        if (z && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                C87412m.m108593f(childAt, "getChildAt(index)");
                m69394b(childAt, list);
            }
        }
    }
}
