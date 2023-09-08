package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import p1108f3.C107453d;
import p849e3.C107166a;

/* renamed from: androidx.recyclerview.widget.c0 */
public class C103775c0 extends C107166a {

    /* renamed from: e */
    public final RecyclerView f306551e;

    /* renamed from: f */
    public final C107166a f306552f = new C103776a(this);

    /* renamed from: androidx.recyclerview.widget.c0$a */
    public static class C103776a extends C107166a {

        /* renamed from: e */
        public final C103775c0 f306553e;

        public C103776a(C103775c0 c0Var) {
            this.f306553e = c0Var;
        }

        public void onInitializeAccessibilityNodeInfo(View view, C107453d dVar) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            RecyclerView recyclerView = this.f306553e.f306551e;
            if (!(!recyclerView.f44791z || recyclerView.f44728I || recyclerView.f44761g.mo17470g()) && this.f306553e.f306551e.getLayoutManager() != null) {
                this.f306553e.f306551e.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, dVar);
            }
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            boolean z = true;
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            RecyclerView recyclerView = this.f306553e.f306551e;
            if (recyclerView.f44791z && !recyclerView.f44728I && !recyclerView.f44761g.mo17470g()) {
                z = false;
            }
            if (z || this.f306553e.f306551e.getLayoutManager() == null) {
                return false;
            }
            return this.f306553e.f306551e.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }
    }

    public C103775c0(RecyclerView recyclerView) {
        this.f306551e = recyclerView;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.f306551e;
            if (!(!recyclerView.f44791z || recyclerView.f44728I || recyclerView.f44761g.mo17470g())) {
                RecyclerView recyclerView2 = (RecyclerView) view;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
                }
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(View view, C107453d dVar) {
        super.onInitializeAccessibilityNodeInfo(view, dVar);
        dVar.mo157852l(RecyclerView.class.getName());
        RecyclerView recyclerView = this.f306551e;
        if (!(!recyclerView.f44791z || recyclerView.f44728I || recyclerView.f44761g.mo17470g()) && this.f306551e.getLayoutManager() != null) {
            this.f306551e.getLayoutManager().onInitializeAccessibilityNodeInfo(dVar);
        }
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        boolean z = true;
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f306551e;
        if (recyclerView.f44791z && !recyclerView.f44728I && !recyclerView.f44761g.mo17470g()) {
            z = false;
        }
        if (z || this.f306551e.getLayoutManager() == null) {
            return false;
        }
        return this.f306551e.getLayoutManager().performAccessibilityAction(i, bundle);
    }
}
