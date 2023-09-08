package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.C103725b;
import androidx.core.widget.C103733h;
import com.tencent.p014mm.C0966R;

public class AppCompatButton extends Button implements C103725b {

    /* renamed from: d */
    public final C103523d f305445d;

    /* renamed from: e */
    public final C103547l f305446e;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2687dp);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C103523d dVar = this.f305445d;
        if (dVar != null) {
            dVar.mo144312a();
        }
        C103547l lVar = this.f305446e;
        if (lVar != null) {
            lVar.mo144396b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C103725b.f306419d0) {
            return super.getAutoSizeMaxTextSize();
        }
        C103547l lVar = this.f305446e;
        if (lVar != null) {
            return Math.round(lVar.f305794h.f305813e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C103725b.f306419d0) {
            return super.getAutoSizeMinTextSize();
        }
        C103547l lVar = this.f305446e;
        if (lVar != null) {
            return Math.round(lVar.f305794h.f305812d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C103725b.f306419d0) {
            return super.getAutoSizeStepGranularity();
        }
        C103547l lVar = this.f305446e;
        if (lVar != null) {
            return Math.round(lVar.f305794h.f305811c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C103725b.f306419d0) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C103547l lVar = this.f305446e;
        return lVar != null ? lVar.f305794h.f305814f : new int[0];
    }

    public int getAutoSizeTextType() {
        if (C103725b.f306419d0) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C103547l lVar = this.f305446e;
        if (lVar != null) {
            return lVar.f305794h.f305809a;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C103523d dVar = this.f305445d;
        if (dVar != null) {
            return dVar.mo144313b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C103523d dVar = this.f305445d;
        if (dVar != null) {
            return dVar.mo144314c();
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C103547l lVar = this.f305446e;
        if (lVar != null && !C103725b.f306419d0) {
            lVar.f305794h.mo144405a();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C103547l lVar = this.f305446e;
        if (lVar != null && !C103725b.f306419d0) {
            C103550m mVar = lVar.f305794h;
            if (mVar.mo144412h() && mVar.f305809a != 0) {
                this.f305446e.f305794h.mo144405a();
            }
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (C103725b.f306419d0) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C103547l lVar = this.f305446e;
        if (lVar != null) {
            lVar.mo144399f(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (C103725b.f306419d0) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C103547l lVar = this.f305446e;
        if (lVar != null) {
            lVar.mo144400g(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C103725b.f306419d0) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C103547l lVar = this.f305446e;
        if (lVar != null) {
            lVar.mo144401h(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C103523d dVar = this.f305445d;
        if (dVar != null) {
            dVar.mo144316e(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C103523d dVar = this.f305445d;
        if (dVar != null) {
            dVar.mo144317f(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C103733h.m138112i(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C103547l lVar = this.f305446e;
        if (lVar != null) {
            lVar.f305787a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C103523d dVar = this.f305445d;
        if (dVar != null) {
            dVar.mo144319h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C103523d dVar = this.f305445d;
        if (dVar != null) {
            dVar.mo144320i(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C103547l lVar = this.f305446e;
        if (lVar != null) {
            lVar.mo144398e(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        boolean z = C103725b.f306419d0;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C103547l lVar = this.f305446e;
        if (lVar != null && !z) {
            C103550m mVar = lVar.f305794h;
            if (!(mVar.mo144412h() && mVar.f305809a != 0)) {
                lVar.f305794h.mo144409e(i, f);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C103522c0.m137532a(context);
        C103523d dVar = new C103523d(this);
        this.f305445d = dVar;
        dVar.mo144315d(attributeSet, i);
        C103547l lVar = new C103547l(this);
        this.f305446e = lVar;
        lVar.mo144397d(attributeSet, i);
        lVar.mo144396b();
    }
}
