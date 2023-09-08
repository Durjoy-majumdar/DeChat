package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.widget.C103733h;
import com.tencent.p014mm.C0966R;

public class AppCompatEditText extends EditText {
    private final C103523d mBackgroundTintHelper;
    private final C103547l mTextHelper;

    public AppCompatEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C103523d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo144312a();
        }
        C103547l lVar = this.mTextHelper;
        if (lVar != null) {
            lVar.mo144396b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C103523d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.mo144313b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C103523d dVar = this.mBackgroundTintHelper;
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
        C103523d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo144316e(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C103523d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo144317f(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C103733h.m138112i(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C103523d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo144319h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C103523d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo144320i(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C103547l lVar = this.mTextHelper;
        if (lVar != null) {
            lVar.mo144398e(context, i);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2794kn);
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C103522c0.m137532a(context);
        C103523d dVar = new C103523d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.mo144315d(attributeSet, i);
        C103547l lVar = new C103547l(this);
        this.mTextHelper = lVar;
        lVar.mo144397d(attributeSet, i);
        lVar.mo144396b();
    }
}
