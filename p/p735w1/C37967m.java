package p735w1;

import gy3.C8480h;
import p560i2.C33184p;
import p560i2.C33185q;

/* renamed from: w1.m */
public final class C37967m {

    /* renamed from: a */
    public final long f100441a;

    /* renamed from: b */
    public final long f100442b;

    /* renamed from: c */
    public final int f100443c;

    public C37967m(long j, long j2, int i, C8480h hVar) {
        this.f100441a = j;
        this.f100442b = j2;
        this.f100443c = i;
        if (!(!C33185q.m39975c(j))) {
            throw new IllegalArgumentException("width cannot be TextUnit.Unspecified".toString());
        } else if (!(!C33185q.m39975c(j2))) {
            throw new IllegalArgumentException("height cannot be TextUnit.Unspecified".toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37967m)) {
            return false;
        }
        C37967m mVar = (C37967m) obj;
        if (!C33184p.m39968a(this.f100441a, mVar.f100441a) || !C33184p.m39968a(this.f100442b, mVar.f100442b)) {
            return false;
        }
        return this.f100443c == mVar.f100443c;
    }

    public int hashCode() {
        return (((C33184p.m39971d(this.f100441a) * 31) + C33184p.m39971d(this.f100442b)) * 31) + this.f100443c;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Placeholder(width=");
        sb.append(C33184p.m39972e(this.f100441a));
        sb.append(", height=");
        sb.append(C33184p.m39972e(this.f100442b));
        sb.append(", placeholderVerticalAlign=");
        int i = this.f100443c;
        boolean z = false;
        if (i == 1) {
            str = "AboveBaseline";
        } else {
            if (i == 2) {
                str = "Top";
            } else {
                if (i == 3) {
                    str = "Bottom";
                } else {
                    if (i == 4) {
                        str = "Center";
                    } else {
                        if (i == 5) {
                            str = "TextTop";
                        } else {
                            if (i == 6) {
                                str = "TextBottom";
                            } else {
                                if (i == 7) {
                                    z = true;
                                }
                                str = z ? "TextCenter" : "Invalid";
                            }
                        }
                    }
                }
            }
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
