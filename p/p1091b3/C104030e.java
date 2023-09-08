package p1091b3;

import android.util.Base64;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.List;

/* renamed from: b3.e */
public final class C104030e {

    /* renamed from: a */
    public final String f307662a;

    /* renamed from: b */
    public final String f307663b;

    /* renamed from: c */
    public final String f307664c;

    /* renamed from: d */
    public final List<List<byte[]>> f307665d;

    /* renamed from: e */
    public final String f307666e;

    public C104030e(String str, String str2, String str3, List<List<byte[]>> list) {
        str.getClass();
        this.f307662a = str;
        str2.getClass();
        this.f307663b = str2;
        str3.getClass();
        this.f307664c = str3;
        list.getClass();
        this.f307665d = list;
        this.f307666e = str + "-" + str2 + "-" + str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f307662a + ", mProviderPackage: " + this.f307663b + ", mQuery: " + this.f307664c + ", mCertificates:");
        for (int i = 0; i < this.f307665d.size(); i++) {
            sb.append(" [");
            List list = this.f307665d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append(FastJsonResponse.QUOTE);
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: 0");
        return sb.toString();
    }
}
