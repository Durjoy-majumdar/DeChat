package p009c2;

import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C8480h;
import gy3.C87412m;
import p735w1.C37958a;
import p735w1.C38006x;
import p735w1.C38007y;

/* renamed from: c2.f */
public final class C104251f {

    /* renamed from: a */
    public final C104272t f308576a;

    /* renamed from: b */
    public int f308577b;

    /* renamed from: c */
    public int f308578c;

    /* renamed from: d */
    public int f308579d = -1;

    /* renamed from: e */
    public int f308580e = -1;

    public C104251f(C37958a aVar, long j, C8480h hVar) {
        this.f308576a = new C104272t(aVar.f100413d);
        this.f308577b = C38006x.m41698f(j);
        this.f308578c = C38006x.m41697e(j);
        int f = C38006x.m41698f(j);
        int e = C38006x.m41697e(j);
        if (f < 0 || f > aVar.length()) {
            throw new IndexOutOfBoundsException("start (" + f + ") offset is outside of text region " + aVar.length());
        } else if (e < 0 || e > aVar.length()) {
            throw new IndexOutOfBoundsException("end (" + e + ") offset is outside of text region " + aVar.length());
        } else if (f > e) {
            throw new IllegalArgumentException("Do not set reversed range: " + f + " > " + e);
        }
    }

    /* renamed from: a */
    public final void mo145871a(int i, int i2) {
        long a = C38007y.m41701a(i, i2);
        this.f308576a.mo145899b(i, i2, "");
        long a2 = C28481g.m38222a(C38007y.m41701a(this.f308577b, this.f308578c), a);
        this.f308577b = C38006x.m41698f(a2);
        this.f308578c = C38006x.m41697e(a2);
        int i3 = this.f308579d;
        if (i3 != -1) {
            long a3 = C28481g.m38222a(C38007y.m41701a(i3, this.f308580e), a);
            if (C38006x.m41694b(a3)) {
                this.f308579d = -1;
                this.f308580e = -1;
                return;
            }
            this.f308579d = C38006x.m41698f(a3);
            this.f308580e = C38006x.m41697e(a3);
        }
    }

    /* renamed from: b */
    public final char mo145872b(int i) {
        C104272t tVar = this.f308576a;
        C104255i iVar = tVar.f308604b;
        if (iVar == null) {
            return tVar.f308603a.charAt(i);
        }
        int i2 = tVar.f308605c;
        if (i < i2) {
            return tVar.f308603a.charAt(i);
        }
        int i3 = iVar.f308584a;
        int i4 = iVar.f308587d;
        int i5 = iVar.f308586c;
        int i6 = i3 - (i4 - i5);
        if (i >= i6 + i2) {
            return tVar.f308603a.charAt(i - ((i6 - tVar.f308606d) + i2));
        }
        int i7 = i - i2;
        return i7 < i5 ? iVar.f308585b[i7] : iVar.f308585b[(i7 - i5) + i4];
    }

    /* renamed from: c */
    public final int mo145873c() {
        return this.f308576a.mo145898a();
    }

    /* renamed from: d */
    public final void mo145874d(int i, int i2, String str) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        if (i < 0 || i > this.f308576a.mo145898a()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.f308576a.mo145898a());
        } else if (i2 < 0 || i2 > this.f308576a.mo145898a()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.f308576a.mo145898a());
        } else if (i <= i2) {
            this.f308576a.mo145899b(i, i2, str);
            this.f308577b = str.length() + i;
            this.f308578c = i + str.length();
            this.f308579d = -1;
            this.f308580e = -1;
        } else {
            throw new IllegalArgumentException("Do not set reversed range: " + i + " > " + i2);
        }
    }

    /* renamed from: e */
    public final void mo145875e(int i, int i2) {
        if (i < 0 || i > this.f308576a.mo145898a()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.f308576a.mo145898a());
        } else if (i2 < 0 || i2 > this.f308576a.mo145898a()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.f308576a.mo145898a());
        } else if (i < i2) {
            this.f308579d = i;
            this.f308580e = i2;
        } else {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + i + " > " + i2);
        }
    }

    /* renamed from: f */
    public final void mo145876f(int i, int i2) {
        if (i < 0 || i > this.f308576a.mo145898a()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.f308576a.mo145898a());
        } else if (i2 < 0 || i2 > this.f308576a.mo145898a()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.f308576a.mo145898a());
        } else if (i <= i2) {
            this.f308577b = i;
            this.f308578c = i2;
        } else {
            throw new IllegalArgumentException("Do not set reversed range: " + i + " > " + i2);
        }
    }

    public String toString() {
        return this.f308576a.toString();
    }
}
