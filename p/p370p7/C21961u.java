package p370p7;

import com.google.android.exoplayer2.Format;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import java.util.Arrays;
import p333e8.C20528a;

/* renamed from: p7.u */
public final class C21961u {

    /* renamed from: a */
    public final int f62173a;

    /* renamed from: b */
    public final Format[] f62174b;

    /* renamed from: c */
    public int f62175c;

    public C21961u(Format... formatArr) {
        C20528a.m22240d(formatArr.length > 0);
        this.f62174b = formatArr;
        this.f62173a = formatArr.length;
    }

    /* renamed from: a */
    public int mo35036a(Format format) {
        int i = 0;
        while (true) {
            Format[] formatArr = this.f62174b;
            if (i >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i]) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21961u.class != obj.getClass()) {
            return false;
        }
        C21961u uVar = (C21961u) obj;
        return this.f62173a == uVar.f62173a && Arrays.equals(this.f62174b, uVar.f62174b);
    }

    public int hashCode() {
        if (this.f62175c == 0) {
            this.f62175c = C1883v2.CTRL_INDEX + Arrays.hashCode(this.f62174b);
        }
        return this.f62175c;
    }
}
