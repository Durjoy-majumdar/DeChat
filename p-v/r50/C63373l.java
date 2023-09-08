package r50;

import android.graphics.Bitmap;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: r50.l */
public final class C63373l {

    /* renamed from: a */
    public boolean f179762a;

    /* renamed from: b */
    public int f179763b;

    /* renamed from: c */
    public boolean f179764c;

    /* renamed from: d */
    public boolean f179765d;

    /* renamed from: e */
    public boolean f179766e;

    /* renamed from: f */
    public String f179767f;

    /* renamed from: g */
    public Bitmap f179768g;

    public C63373l() {
        this(false, 0, false, false, false, (String) null, (Bitmap) null, 127, (C8480h) null);
    }

    public C63373l(boolean z, int i, boolean z2, boolean z3, boolean z4, String str, Bitmap bitmap, int i2, C8480h hVar) {
        z = (i2 & 1) != 0 ? true : z;
        i = (i2 & 2) != 0 ? -1 : i;
        z2 = (i2 & 4) != 0 ? true : z2;
        z3 = (i2 & 8) != 0 ? true : z3;
        z4 = (i2 & 16) != 0 ? true : z4;
        str = (i2 & 32) != 0 ? null : str;
        bitmap = (i2 & 64) != 0 ? null : bitmap;
        this.f179762a = z;
        this.f179763b = i;
        this.f179764c = z2;
        this.f179765d = z3;
        this.f179766e = z4;
        this.f179767f = str;
        this.f179768g = bitmap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63373l)) {
            return false;
        }
        C63373l lVar = (C63373l) obj;
        return this.f179762a == lVar.f179762a && this.f179763b == lVar.f179763b && this.f179764c == lVar.f179764c && this.f179765d == lVar.f179765d && this.f179766e == lVar.f179766e && C87412m.m108589b(this.f179767f, lVar.f179767f) && C87412m.m108589b(this.f179768g, lVar.f179768g);
    }

    public int hashCode() {
        boolean z = this.f179762a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (((z ? 1 : 0) * true) + this.f179763b) * 31;
        boolean z3 = this.f179764c;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f179765d;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f179766e;
        if (!z5) {
            z2 = z5;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        String str = this.f179767f;
        int i5 = 0;
        int hashCode = (i4 + (str == null ? 0 : str.hashCode())) * 31;
        Bitmap bitmap = this.f179768g;
        if (bitmap != null) {
            i5 = bitmap.hashCode();
        }
        return hashCode + i5;
    }

    public String toString() {
        return "MiniWindowInfo(isPlaying=" + this.f179762a + ", showBtnColor=" + this.f179763b + ", enablePlayButton=" + this.f179764c + ", showPlayButton=" + this.f179765d + ", showDeleteButton=" + this.f179766e + ", coverUrl=" + this.f179767f + ", bitmap=" + this.f179768g + ')';
    }
}
