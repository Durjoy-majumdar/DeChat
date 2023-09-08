package p1107f1;

import android.graphics.Shader;
import gy3.C8480h;
import p1050v2.C111318d;
import p436a1.C103257q;
import p436a1.C103260r;
import p436a1.C103273w0;
import p436a1.C103276y;

/* renamed from: f1.c */
public final class C107445c {
    /* renamed from: a */
    public static final C103257q m145528a(C111318d dVar) {
        Shader shader = dVar.f333285a;
        boolean z = false;
        if ((shader != null) || dVar.f333287c != 0) {
            z = true;
        }
        if (z) {
            return shader != null ? new C103260r(shader) : new C103273w0(C103276y.m136791b(dVar.f333287c), (C8480h) null);
        }
        return null;
    }
}
