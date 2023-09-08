package com.tencent.p014mm.accessibility.core;

import android.view.View;
import android.view.ViewGroup;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0007\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/AccOnHierarchyChangeListenerMerger;", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "Landroid/view/View;", "p0", "p1", "Lrx3/b0;", "onChildViewAdded", "onChildViewRemoved", "l1", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "getL1", "()Landroid/view/ViewGroup$OnHierarchyChangeListener;", "l2", "getL2", "<init>", "(Landroid/view/ViewGroup$OnHierarchyChangeListener;Landroid/view/ViewGroup$OnHierarchyChangeListener;)V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.AccOnHierarchyChangeListenerMerger */
public final class AccOnHierarchyChangeListenerMerger implements ViewGroup.OnHierarchyChangeListener {
    private byte _hellAccFlag_;

    /* renamed from: l1 */
    private final ViewGroup.OnHierarchyChangeListener f309985l1;

    /* renamed from: l2 */
    private final ViewGroup.OnHierarchyChangeListener f309986l2;

    public AccOnHierarchyChangeListenerMerger(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener, ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener2) {
        this.f309985l1 = onHierarchyChangeListener;
        this.f309986l2 = onHierarchyChangeListener2;
    }

    public final ViewGroup.OnHierarchyChangeListener getL1() {
        return this.f309985l1;
    }

    public final ViewGroup.OnHierarchyChangeListener getL2() {
        return this.f309986l2;
    }

    public void onChildViewAdded(View view, View view2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/accessibility/core/AccOnHierarchyChangeListenerMerger", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f309985l1;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener2 = this.f309986l2;
        if (onHierarchyChangeListener2 != null) {
            onHierarchyChangeListener2.onChildViewAdded(view, view2);
        }
        C117292a.m165361g(this, "com/tencent/mm/accessibility/core/AccOnHierarchyChangeListenerMerger", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewAdded", "(Landroid/view/View;Landroid/view/View;)V");
    }

    public void onChildViewRemoved(View view, View view2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/accessibility/core/AccOnHierarchyChangeListenerMerger", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V", this, array);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f309985l1;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener2 = this.f309986l2;
        if (onHierarchyChangeListener2 != null) {
            onHierarchyChangeListener2.onChildViewRemoved(view, view2);
        }
        C117292a.m165361g(this, "com/tencent/mm/accessibility/core/AccOnHierarchyChangeListenerMerger", "android/view/ViewGroup$OnHierarchyChangeListener", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V");
    }
}
