package yo0;

import android.util.Pair;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import di3.C7335d;
import java.io.IOException;
import java.util.List;
import kr0.C88273g1;
import lp3.C88633e;
import p210o.C11323a;
import te3.C90443vg3;

/* renamed from: yo0.b */
public interface C91535b extends C7335d {

    /* renamed from: yo0.b$a */
    public static class C91536a extends C90443vg3 {

        /* renamed from: h */
        public String f262358h;

        /* renamed from: i */
        public String f262359i;

        /* renamed from: j */
        public long f262360j;

        /* renamed from: b */
        public final void mo125440b(byte[] bArr) {
            if (bArr == null || bArr.length == 0) {
                throw new IOException("Invalid bytes");
            }
            super.parseFrom(bArr);
        }

        /* renamed from: d */
        public final byte[] mo125441d() {
            return super.toByteArray();
        }

        public String toString() {
            return "PrefetchPkgDownloadInfo{packageMD5='" + this.f262358h + '\'' + ", packageURL='" + this.f262359i + '\'' + ", urlLifespan=" + this.f262360j + ", appId='" + this.f259876d + '\'' + ", packageKey='" + this.f259877e + '\'' + ", packageType=" + this.f259878f + ", packageVersion=" + this.f259879g + '}';
        }
    }

    C88633e<List<C91536a>> Pc0(String str, String str2, C88273g1 g1Var);

    /* renamed from: jB */
    void mo125306jB(List<Pair<C91536a, String>> list);

    /* renamed from: lO */
    void mo125307lO(String str, C11323a<WxaAttributes, Void> aVar);

    /* renamed from: za */
    void mo125308za(String str, String str2);
}
