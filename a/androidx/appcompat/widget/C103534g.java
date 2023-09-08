package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: androidx.appcompat.widget.g */
public class C103534g {
    /* renamed from: a */
    public static InputConnection m137575a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof C103555o0) {
                    editorInfo.hintText = ((C103555o0) parent).getHint();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }
}
