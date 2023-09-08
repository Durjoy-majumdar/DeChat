package p009c2;

import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import my3.C61595o;
import p735w1.C37958a;

/* renamed from: c2.x */
public final class C104276x implements C104247d {

    /* renamed from: a */
    public final C37958a f308617a;

    /* renamed from: b */
    public final int f308618b;

    public C104276x(String str, int i) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        this.f308617a = new C37958a(str, (List) null, (List) null, 6, (C8480h) null);
        this.f308618b = i;
    }

    /* renamed from: a */
    public void mo145851a(C104251f fVar) {
        C87412m.m108594g(fVar, "buffer");
        int i = fVar.f308579d;
        int i2 = -1;
        if (i != -1) {
            fVar.mo145874d(i, fVar.f308580e, this.f308617a.f100413d);
            if (this.f308617a.f100413d.length() > 0) {
                fVar.mo145875e(i, this.f308617a.f100413d.length() + i);
            }
        } else {
            int i3 = fVar.f308577b;
            fVar.mo145874d(i3, fVar.f308578c, this.f308617a.f100413d);
            if (this.f308617a.f100413d.length() > 0) {
                fVar.mo145875e(i3, this.f308617a.f100413d.length() + i3);
            }
        }
        int i4 = fVar.f308577b;
        int i5 = fVar.f308578c;
        if (i4 == i5) {
            i2 = i5;
        }
        int i6 = this.f308618b;
        int i7 = i2 + i6;
        int e = C61595o.m72297e(i6 > 0 ? i7 - 1 : i7 - this.f308617a.f100413d.length(), 0, fVar.mo145873c());
        fVar.mo145876f(e, e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C104276x)) {
            return false;
        }
        C104276x xVar = (C104276x) obj;
        return C87412m.m108589b(this.f308617a.f100413d, xVar.f308617a.f100413d) && this.f308618b == xVar.f308618b;
    }

    public int hashCode() {
        return (this.f308617a.f100413d.hashCode() * 31) + this.f308618b;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + this.f308617a.f100413d + "', newCursorPosition=" + this.f308618b + ')';
    }
}
