package pu3;

import androidx.exifinterface.media.ExifInterface;
import pu3.C25499u;
import ru3.C110658e;
import ru3.C26118c;

/* renamed from: pu3.a */
public final class C25466a extends C25499u.C25500a.C25501a<C25466a> {

    /* renamed from: e */
    public byte f72082e;

    /* renamed from: f */
    public C25490l f72083f;

    public C25466a(int i, byte b, C25490l lVar) {
        super(i);
        this.f72082e = b;
        this.f72083f = lVar;
    }

    public int compareTo(Object obj) {
        C25466a aVar = (C25466a) obj;
        int d = C26118c.m33546d(this.f72083f.f72139e, aVar.f72083f.f72139e);
        if (d != 0) {
            return d;
        }
        byte b = this.f72082e;
        byte b2 = aVar.f72082e;
        if (b == b2) {
            return 0;
        }
        return (b & ExifInterface.MARKER) < (b2 & ExifInterface.MARKER) ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C25466a)) {
            return false;
        }
        C25466a aVar = (C25466a) obj;
        int d = C26118c.m33546d(this.f72083f.f72139e, aVar.f72083f.f72139e);
        if (d == 0) {
            byte b = this.f72082e;
            byte b2 = aVar.f72082e;
            d = b == b2 ? 0 : (b & ExifInterface.MARKER) < (b2 & ExifInterface.MARKER) ? -1 : 1;
        }
        return d == 0;
    }

    public int hashCode() {
        return C110658e.m150642a(Byte.valueOf(this.f72082e), this.f72083f);
    }
}
