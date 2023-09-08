package go3;

import android.view.View;
import android.view.ViewGroup;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import nj3.C100123u0;

/* renamed from: go3.b0 */
public final class C98165b0 {

    /* renamed from: a */
    public static final C98166a f287797a = new C98166a((C8480h) null);

    /* renamed from: go3.b0$a */
    public static final class C98166a {
        public C98166a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C100123u0 mo137447a(View view) {
            C87412m.m108594g(view, "rootView");
            if (view instanceof ViewGroup) {
                LinkedList linkedList = new LinkedList();
                linkedList.add(view);
                while (!linkedList.isEmpty()) {
                    Object pollFirst = linkedList.pollFirst();
                    C87412m.m108593f(pollFirst, "queue.pollFirst()");
                    View view2 = (View) pollFirst;
                    if (view2 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view2;
                        int childCount = viewGroup.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            View childAt = viewGroup.getChildAt(i);
                            if (childAt instanceof ViewGroup) {
                                linkedList.addLast(childAt);
                            } else if (childAt instanceof C100123u0) {
                                return (C100123u0) childAt;
                            }
                        }
                        continue;
                    }
                }
                return null;
            } else if (view instanceof C100123u0) {
                return (C100123u0) view;
            } else {
                return null;
            }
        }
    }
}
