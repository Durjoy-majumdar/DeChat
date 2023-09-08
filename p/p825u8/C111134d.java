package p825u8;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import p1108f3.C107451b;
import p1108f3.C107452c;
import p1114g8.C107764a;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: u8.d */
public class C111134d extends FrameLayout {

    /* renamed from: d */
    public final AccessibilityManager f332739d;

    /* renamed from: e */
    public final C107451b f332740e;

    /* renamed from: u8.d$a */
    public class C111135a implements C107451b {
        public C111135a() {
        }

        public void onTouchExplorationStateChanged(boolean z) {
            C111134d.this.setClickableOrFocusableBasedOnAccessibility(z);
        }
    }

    public C111134d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C107764a.f322519s);
        if (obtainStyledAttributes.hasValue(1)) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107213g.m145234s(this, (float) obtainStyledAttributes.getDimensionPixelSize(1, 0));
        }
        obtainStyledAttributes.recycle();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        this.f332739d = accessibilityManager;
        C111135a aVar = new C111135a();
        this.f332740e = aVar;
        accessibilityManager.addTouchExplorationStateChangeListener(new C107452c(aVar));
        setClickableOrFocusableBasedOnAccessibility(accessibilityManager.isTouchExplorationEnabled());
    }

    /* access modifiers changed from: private */
    public void setClickableOrFocusableBasedOnAccessibility(boolean z) {
        setClickable(!z);
        setFocusable(z);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107212f.m145215c(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AccessibilityManager accessibilityManager = this.f332739d;
        C107451b bVar = this.f332740e;
        if (bVar != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new C107452c(bVar));
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setOnAttachStateChangeListener(C52475b bVar) {
    }

    public void setOnLayoutChangeListener(C65237c cVar) {
    }
}
