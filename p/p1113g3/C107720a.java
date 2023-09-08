package p1113g3;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.inputmethod.EditorInfo;

/* renamed from: g3.a */
public final class C107720a {

    /* renamed from: g3.a$a */
    public static class C107721a {
        /* renamed from: a */
        public static void m145919a(EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }

    /* renamed from: a */
    public static void m145918a(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }
}
