package p152f0;

import android.view.KeyEvent;
import gy3.C24575y;
import gy3.C87412m;
import p904j1.C108522a;
import p904j1.C108523c;
import p904j1.C76379b;

/* renamed from: f0.n0 */
public final class C107384n0 {

    /* renamed from: a */
    public static final C107361l0 f321302a;

    /* renamed from: f0.n0$b */
    public static final class C27048b implements C107361l0 {

        /* renamed from: a */
        public final /* synthetic */ C107361l0 f75220a;

        public C27048b(C107361l0 l0Var) {
            this.f75220a = l0Var;
        }

        /* renamed from: a */
        public C27046k0 mo54536a(KeyEvent keyEvent) {
            C87412m.m108594g(keyEvent, "event");
            C27046k0 k0Var = null;
            if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                long a = C108523c.m147065a(keyEvent);
                int i = C27045a1.f75177w;
                if (C108522a.m147064a(a, C27045a1.f75162h)) {
                    k0Var = C27046k0.SELECT_LEFT_WORD;
                } else if (C108522a.m147064a(a, C27045a1.f75163i)) {
                    k0Var = C27046k0.SELECT_RIGHT_WORD;
                } else if (C108522a.m147064a(a, C27045a1.f75164j)) {
                    k0Var = C27046k0.SELECT_PREV_PARAGRAPH;
                } else if (C108522a.m147064a(a, C27045a1.f75165k)) {
                    k0Var = C27046k0.SELECT_NEXT_PARAGRAPH;
                }
            } else if (keyEvent.isCtrlPressed()) {
                long a2 = C108523c.m147065a(keyEvent);
                int i2 = C27045a1.f75177w;
                if (C108522a.m147064a(a2, C27045a1.f75162h)) {
                    k0Var = C27046k0.LEFT_WORD;
                } else if (C108522a.m147064a(a2, C27045a1.f75163i)) {
                    k0Var = C27046k0.RIGHT_WORD;
                } else if (C108522a.m147064a(a2, C27045a1.f75164j)) {
                    k0Var = C27046k0.PREV_PARAGRAPH;
                } else if (C108522a.m147064a(a2, C27045a1.f75165k)) {
                    k0Var = C27046k0.NEXT_PARAGRAPH;
                } else if (C108522a.m147064a(a2, C27045a1.f75157c)) {
                    k0Var = C27046k0.DELETE_PREV_CHAR;
                } else if (C108522a.m147064a(a2, C27045a1.f75173s)) {
                    k0Var = C27046k0.DELETE_NEXT_WORD;
                } else if (C108522a.m147064a(a2, C27045a1.f75172r)) {
                    k0Var = C27046k0.DELETE_PREV_WORD;
                } else if (C108522a.m147064a(a2, C27045a1.f75161g)) {
                    k0Var = C27046k0.DESELECT;
                }
            } else if (keyEvent.isShiftPressed()) {
                long a3 = C108523c.m147065a(keyEvent);
                int i3 = C27045a1.f75177w;
                if (C108522a.m147064a(a3, C27045a1.f75168n)) {
                    k0Var = C27046k0.SELECT_HOME;
                } else if (C108522a.m147064a(a3, C27045a1.f75169o)) {
                    k0Var = C27046k0.SELECT_END;
                }
            }
            return k0Var == null ? this.f75220a.mo54536a(keyEvent) : k0Var;
        }
    }

    /* renamed from: f0.n0$a */
    public /* synthetic */ class C107385a extends C24575y {

        /* renamed from: d */
        public static final C107385a f321303d = new C107385a();

        public C107385a() {
            super(C108523c.class, "isCtrlPressed", "isCtrlPressed-ZmokQxo(Landroid/view/KeyEvent;)Z", 1);
        }

        public Object get(Object obj) {
            KeyEvent keyEvent = ((C76379b) obj).f223658a;
            C87412m.m108594g(keyEvent, "$this$isCtrlPressed");
            return Boolean.valueOf(keyEvent.isCtrlPressed());
        }
    }

    static {
        C107385a aVar = C107385a.f321303d;
        C87412m.m108594g(aVar, "shortcutModifier");
        f321302a = new C27048b(new C27047m0(aVar));
    }
}
