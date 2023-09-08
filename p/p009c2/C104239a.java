package p009c2;

import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import my3.C61595o;
import p735w1.C37958a;

/* renamed from: c2.a */
public final class C104239a implements C104247d {

    /* renamed from: a */
    public final C37958a f308544a;

    /* renamed from: b */
    public final int f308545b;

    public C104239a(String str, int i) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        this.f308544a = new C37958a(str, (List) null, (List) null, 6, (C8480h) null);
        this.f308545b = i;
    }

    /* renamed from: a */
    public void mo145851a(C104251f fVar) {
        C87412m.m108594g(fVar, "buffer");
        int i = fVar.f308579d;
        if (i != -1) {
            fVar.mo145874d(i, fVar.f308580e, this.f308544a.f100413d);
        } else {
            fVar.mo145874d(fVar.f308577b, fVar.f308578c, this.f308544a.f100413d);
        }
        int i2 = fVar.f308577b;
        int i3 = fVar.f308578c;
        if (i2 != i3) {
            i3 = -1;
        }
        int i4 = this.f308545b;
        int i5 = i3 + i4;
        int e = C61595o.m72297e(i4 > 0 ? i5 - 1 : i5 - this.f308544a.f100413d.length(), 0, fVar.mo145873c());
        fVar.mo145876f(e, e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C104239a)) {
            return false;
        }
        C104239a aVar = (C104239a) obj;
        return C87412m.m108589b(this.f308544a.f100413d, aVar.f308544a.f100413d) && this.f308545b == aVar.f308545b;
    }

    public int hashCode() {
        return (this.f308544a.f100413d.hashCode() * 31) + this.f308545b;
    }

    public String toString() {
        return "CommitTextCommand(text='" + this.f308544a.f100413d + "', newCursorPosition=" + this.f308545b + ')';
    }
}
