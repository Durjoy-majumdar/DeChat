package d02;

import com.tencent.p014mm.plugin.handoff.model.HandOff;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Collection;
import sx3.C64186f0;
import z04.C112550d0;

/* renamed from: d02.c */
public final class C31041c {

    /* renamed from: a */
    public int f83273a;

    /* renamed from: b */
    public Collection<? extends HandOff> f83274b;

    public C31041c(int i, Collection<? extends HandOff> collection, long j, int i2, C8480h hVar) {
        i = (i2 & 1) != 0 ? 0 : i;
        collection = (i2 & 2) != 0 ? C64186f0.f181907d : collection;
        C87412m.m108594g(collection, "items");
        this.f83273a = i;
        this.f83274b = collection;
    }

    /* renamed from: a */
    public final String mo57941a(String str, String str2, int i) {
        C87412m.m108594g(str, "deviceId");
        C87412m.m108594g(str2, "networkStatus");
        StringBuilder sb = new StringBuilder();
        sb.append("\n        <handofflist opcode=\"");
        sb.append(this.f83273a);
        sb.append("\" seq=\"<![CSEQ]>\" devicevirtualid=\"");
        sb.append(MD5Util.getMD5String(str));
        sb.append("\" networkstatus=\"");
        String lowerCase = str2.toLowerCase();
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
        sb.append(lowerCase);
        sb.append("\" availablecount=\"");
        sb.append(i);
        sb.append("\">\n        ");
        String str3 = "";
        for (HandOff build : this.f83274b) {
            str3 = str3 + build.build();
        }
        sb.append(str3);
        sb.append("\n        </handofflist>\n        ");
        return C112550d0.m153799i0(sb.toString()).toString();
    }
}
