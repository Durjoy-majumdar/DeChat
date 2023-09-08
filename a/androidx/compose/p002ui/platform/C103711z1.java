package androidx.compose.p002ui.platform;

import android.view.ActionMode;
import android.view.View;
import gy3.C87412m;

/* renamed from: androidx.compose.ui.platform.z1 */
public final class C103711z1 {

    /* renamed from: a */
    public static final C103711z1 f306299a = new C103711z1();

    /* renamed from: a */
    public final void mo144869a(ActionMode actionMode) {
        C87412m.m108594g(actionMode, "actionMode");
        actionMode.invalidateContentRect();
    }

    /* renamed from: b */
    public final ActionMode mo144870b(View view, ActionMode.Callback callback, int i) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(callback, "actionModeCallback");
        return view.startActionMode(callback, i);
    }
}
