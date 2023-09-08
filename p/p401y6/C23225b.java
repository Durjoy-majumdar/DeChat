package p401y6;

import android.media.AudioAttributes;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;

/* renamed from: y6.b */
public final class C23225b {

    /* renamed from: e */
    public static final C23225b f66671e = new C23225b(0, 0, 1, (C23226a) null);

    /* renamed from: a */
    public final int f66672a;

    /* renamed from: b */
    public final int f66673b;

    /* renamed from: c */
    public final int f66674c;

    /* renamed from: d */
    public AudioAttributes f66675d;

    public C23225b(int i, int i2, int i3, C23226a aVar) {
        this.f66672a = i;
        this.f66673b = i2;
        this.f66674c = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C23225b.class != obj.getClass()) {
            return false;
        }
        C23225b bVar = (C23225b) obj;
        return this.f66672a == bVar.f66672a && this.f66673b == bVar.f66673b && this.f66674c == bVar.f66674c;
    }

    public int hashCode() {
        return ((((C1883v2.CTRL_INDEX + this.f66672a) * 31) + this.f66673b) * 31) + this.f66674c;
    }
}
