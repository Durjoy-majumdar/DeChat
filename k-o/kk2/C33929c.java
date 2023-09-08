package kk2;

import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import gy3.C87412m;

/* renamed from: kk2.c */
public final class C33929c {

    /* renamed from: a */
    public final String f91634a;

    /* renamed from: b */
    public final String f91635b;

    public C33929c(String str, String str2) {
        C87412m.m108594g(str, TPDownloadProxyEnum.USER_MAC);
        C87412m.m108594g(str2, "username");
        this.f91634a = str;
        this.f91635b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33929c)) {
            return false;
        }
        C33929c cVar = (C33929c) obj;
        return C87412m.m108589b(this.f91634a, cVar.f91634a) && C87412m.m108589b(this.f91635b, cVar.f91635b);
    }

    public int hashCode() {
        return (this.f91634a.hashCode() * 31) + this.f91635b.hashCode();
    }

    public String toString() {
        return "RtosBindInfo(mac=" + this.f91634a + ", username=" + this.f91635b + ')';
    }
}
