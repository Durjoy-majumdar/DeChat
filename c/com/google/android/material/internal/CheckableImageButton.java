package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import com.tencent.p014mm.C0966R;
import p1108f3.C107453d;
import p849e3.C107166a;
import p849e3.C107207u;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: g */
    public static final int[] f309434g = {16842912};

    /* renamed from: f */
    public boolean f309435f;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    public class C104460a extends C107166a {
        public C104460a() {
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        public void onInitializeAccessibilityNodeInfo(View view, C107453d dVar) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            dVar.mo157851k(true);
            dVar.f321473a.setChecked(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2840pc);
    }

    public boolean isChecked() {
        return this.f309435f;
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.f309435f) {
            return super.onCreateDrawableState(i);
        }
        return View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f309434g);
    }

    public void setChecked(boolean z) {
        if (this.f309435f != z) {
            this.f309435f = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void toggle() {
        setChecked(!this.f309435f);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C107207u.m145168i(this, new C104460a());
    }
}
