package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import com.tencent.p014mm.C0966R;
import p1115h.C107922a;

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView {

    /* renamed from: f */
    public static final int[] f305454f = {16843126};

    /* renamed from: d */
    public final C103523d f305455d;

    /* renamed from: e */
    public final C103547l f305456e;

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2661bt);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C103523d dVar = this.f305455d;
        if (dVar != null) {
            dVar.mo144312a();
        }
        C103547l lVar = this.f305456e;
        if (lVar != null) {
            lVar.mo144396b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C103523d dVar = this.f305455d;
        if (dVar != null) {
            return dVar.mo144313b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C103523d dVar = this.f305455d;
        if (dVar != null) {
            return dVar.mo144314c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C103534g.m137575a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C103523d dVar = this.f305455d;
        if (dVar != null) {
            dVar.mo144316e(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C103523d dVar = this.f305455d;
        if (dVar != null) {
            dVar.mo144317f(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C107922a.m146228b(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C103523d dVar = this.f305455d;
        if (dVar != null) {
            dVar.mo144319h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C103523d dVar = this.f305455d;
        if (dVar != null) {
            dVar.mo144320i(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C103547l lVar = this.f305456e;
        if (lVar != null) {
            lVar.mo144398e(context, i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C103522c0.m137532a(context);
        C103533f0 l = C103533f0.m137562l(getContext(), attributeSet, f305454f, i, 0);
        if (l.mo144342k(0)) {
            setDropDownBackgroundDrawable(l.mo144336e(0));
        }
        l.mo144343m();
        C103523d dVar = new C103523d(this);
        this.f305455d = dVar;
        dVar.mo144315d(attributeSet, i);
        C103547l lVar = new C103547l(this);
        this.f305456e = lVar;
        lVar.mo144397d(attributeSet, i);
        lVar.mo144396b();
    }
}
