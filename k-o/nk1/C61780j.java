package nk1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import o40.C61937h;
import p823sg.C101614i;
import te3.C64224a61;

/* renamed from: nk1.j */
public final class C61780j {

    /* renamed from: a */
    public static final C61780j f175629a = new C61780j();

    /* renamed from: b */
    public static final String f175630b = "FinderLiveRedPacketCache";

    /* renamed from: c */
    public static final C101614i<String, C64224a61> f175631c = new C101614i<>(1000);

    /* renamed from: a */
    public final C64224a61 mo86701a(String str) {
        C87412m.m108594g(str, "coverUrl");
        C64224a61 a612 = (C64224a61) f175631c.get(str);
        String str2 = f175630b;
        StringBuilder sb = new StringBuilder();
        sb.append("[getStatus] status:");
        sb.append(a612 != null ? C61937h.m72709h(a612) : "null");
        sb.append(", url:");
        sb.append(str);
        Log.m105924i(str2, sb.toString());
        return a612;
    }
}
