package p176jc;

import android.content.Context;
import p172io.flutter.plugin.editing.WxKeyboardAction;

/* renamed from: jc.h */
public interface C87929h {

    /* renamed from: jc.h$a */
    public static final class C87930a {
        /* renamed from: a */
        public static /* synthetic */ void m109438a(C87929h hVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                hVar.mo122399e(z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: switchToImage");
        }
    }

    /* renamed from: a */
    void mo122395a(boolean z);

    /* renamed from: b */
    void mo122396b(WxKeyboardAction wxKeyboardAction);

    /* renamed from: c */
    void mo122397c();

    /* renamed from: d */
    void mo122398d(boolean z);

    /* renamed from: e */
    void mo122399e(boolean z);

    /* renamed from: f */
    void mo122400f(Context context);

    /* renamed from: g */
    void mo122401g();

    C87933j getMode();

    /* renamed from: h */
    void mo122403h();

    void setBackgroundColor(int i);
}
