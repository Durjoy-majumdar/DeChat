package p295b8;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import java.util.Arrays;

/* renamed from: b8.g */
public final class C16774g {

    /* renamed from: a */
    public final int f45334a;

    /* renamed from: b */
    public final C16772f[] f45335b;

    /* renamed from: c */
    public int f45336c;

    public C16774g(C16772f... fVarArr) {
        this.f45335b = fVarArr;
        this.f45334a = fVarArr.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16774g.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f45335b, ((C16774g) obj).f45335b);
    }

    public int hashCode() {
        if (this.f45336c == 0) {
            this.f45336c = C1883v2.CTRL_INDEX + Arrays.hashCode(this.f45335b);
        }
        return this.f45336c;
    }
}
