package at0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: at0.d */
public final class C103916d extends AccessibilityNodeProvider {

    /* renamed from: a */
    public final /* synthetic */ C103915c f307275a;

    public C103916d(C103915c cVar) {
        this.f307275a = cVar;
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f307275a.f307264a);
        this.f307275a.f307264a.onInitializeAccessibilityNodeInfo(obtain);
        if (obtain != null) {
            obtain.getBoundsInScreen(this.f307275a.f307273j);
        }
        C103915c cVar = this.f307275a;
        Rect rect = cVar.f307273j;
        int i2 = rect.left;
        Rect rect2 = cVar.f307272i;
        rect.left = i2 - rect2.left;
        rect.top -= rect2.top;
        rect.right += rect2.right;
        rect.bottom += rect2.bottom;
        if (obtain != null) {
            obtain.setBoundsInScreen(rect);
        }
        return obtain;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return this.f307275a.f307264a.performAccessibilityAction(i2, bundle);
    }
}
