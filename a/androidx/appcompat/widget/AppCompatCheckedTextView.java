package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.C103733h;
import p1115h.C107922a;

public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: e */
    public static final int[] f305448e = {16843016};

    /* renamed from: d */
    public final C103547l f305449d;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C103547l lVar = this.f305449d;
        if (lVar != null) {
            lVar.mo144396b();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C103534g.m137575a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C107922a.m146228b(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C103733h.m138112i(this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C103547l lVar = this.f305449d;
        if (lVar != null) {
            lVar.mo144398e(context, i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C103522c0.m137532a(context);
        C103547l lVar = new C103547l(this);
        this.f305449d = lVar;
        lVar.mo144397d(attributeSet, i);
        lVar.mo144396b();
        C103533f0 l = C103533f0.m137562l(getContext(), attributeSet, f305448e, i, 0);
        setCheckMarkDrawable(l.mo144336e(0));
        l.mo144343m();
    }
}
