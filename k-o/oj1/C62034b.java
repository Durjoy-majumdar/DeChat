package oj1;

import gy3.C87412m;
import te3.C64239aq2;
import te3.C64890zp2;

/* renamed from: oj1.b */
public final class C62034b {

    /* renamed from: a */
    public final String f176354a;

    /* renamed from: b */
    public final C64239aq2 f176355b;

    public C62034b(String str, C64239aq2 aq22) {
        C87412m.m108594g(str, "anchorUserName");
        C87412m.m108594g(aq22, "channelParamsDesc");
        this.f176354a = str;
        this.f176355b = aq22;
    }

    /* renamed from: a */
    public final String mo86978a() {
        String str = this.f176355b.f182132e;
        C87412m.m108593f(str, "channelParamsDesc.stream_id");
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62034b)) {
            return false;
        }
        C62034b bVar = (C62034b) obj;
        return C87412m.m108589b(this.f176354a, bVar.f176354a) && C87412m.m108589b(this.f176355b, bVar.f176355b);
    }

    public int hashCode() {
        return (this.f176354a.hashCode() * 31) + this.f176355b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("anchorUserName: ");
        sb.append(this.f176354a);
        sb.append(" desc: ");
        C64239aq2 aq22 = this.f176355b;
        C87412m.m108594g(aq22, "<this>");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("stream_id: ");
        sb4.append(aq22.f182132e);
        sb4.append(" view_desc: ");
        sb4.append(aq22.f182133f);
        sb4.append(" params: ");
        C64890zp2 zp22 = aq22.f182131d;
        C87412m.m108593f(zp22, "channel_params");
        sb4.append("streamId: " + zp22.f186807e + " quality: " + zp22.f186813n + " videoWidth: " + zp22.f186801V + " videoHeight: " + zp22.f186802W + " support_rotate: " + zp22.f186819s + '}');
        sb.append(sb4.toString());
        return sb.toString();
    }
}
