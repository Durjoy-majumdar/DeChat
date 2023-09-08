package p904j1;

import android.view.KeyEvent;
import gy3.C87412m;

/* renamed from: j1.c */
public final class C108523c {
    /* renamed from: a */
    public static final long m147065a(KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "$this$key");
        return C108527f.m147075a(keyEvent.getKeyCode());
    }

    /* renamed from: b */
    public static final int m147066b(KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "$this$type");
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }
}
