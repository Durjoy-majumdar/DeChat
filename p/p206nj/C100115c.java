package p206nj;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: nj.c */
public class C100115c {

    /* renamed from: a */
    public Context f293267a = null;

    /* renamed from: b */
    public C100117b f293268b = null;

    /* renamed from: nj.c$a */
    public interface C100116a {
        void onChange(int i);
    }

    /* renamed from: nj.c$b */
    public interface C100117b {
    }

    public C100115c(Context context) {
        this.f293267a = context instanceof Activity ? MMApplicationContext.getContext() : context;
        if (C11171e.m11046c(8)) {
            this.f293268b = new C100118d(this.f293267a);
        }
    }

    /* renamed from: a */
    public boolean mo139414a() {
        synchronized ("audio_lock") {
            C100117b bVar = this.f293268b;
            if (bVar == null) {
                return false;
            }
            boolean a = ((C100118d) bVar).mo139416a();
            return a;
        }
    }

    /* renamed from: b */
    public boolean mo139415b() {
        synchronized ("audio_lock") {
            C100117b bVar = this.f293268b;
            if (bVar == null) {
                return false;
            }
            boolean c = ((C100118d) bVar).mo139418c();
            return c;
        }
    }
}
