package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.tencent.p014mm.C0966R;
import p1115h.C107922a;

public class AppCompatRadioButton extends RadioButton {

    /* renamed from: d */
    public final C103525e f305457d;

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2915zl);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C103525e eVar = this.f305457d;
        if (eVar != null) {
            eVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        C103525e eVar = this.f305457d;
        if (eVar != null) {
            return eVar.f305715b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C103525e eVar = this.f305457d;
        if (eVar != null) {
            return eVar.f305716c;
        }
        return null;
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C103525e eVar = this.f305457d;
        if (eVar == null) {
            return;
        }
        if (eVar.f305719f) {
            eVar.f305719f = false;
            return;
        }
        eVar.f305719f = true;
        eVar.mo144321a();
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C103525e eVar = this.f305457d;
        if (eVar != null) {
            eVar.f305715b = colorStateList;
            eVar.f305717d = true;
            eVar.mo144321a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C103525e eVar = this.f305457d;
        if (eVar != null) {
            eVar.f305716c = mode;
            eVar.f305718e = true;
            eVar.mo144321a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C103522c0.m137532a(context);
        C103525e eVar = new C103525e(this);
        this.f305457d = eVar;
        eVar.mo144322b(attributeSet, i);
        new C103547l(this).mo144397d(attributeSet, i);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C107922a.m146228b(getContext(), i));
    }
}
