package kl2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import tk2.C101904b;

/* renamed from: kl2.e */
public final class C10357e implements C101904b {

    /* renamed from: a */
    public final HashMap<String, Boolean> f31538a = new HashMap<>();

    /* renamed from: a */
    public void mo10651a(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(',');
        sb.append(i2);
        String sb4 = sb.toString();
        Log.m105927v("MicroMsg.ImageOCRReporter", "alvinluo reportOCRMenuOp key: %s, reported: %s, reason: %s", sb4, this.f31538a.get(sb4), Integer.valueOf(i3));
        Boolean bool = this.f31538a.get(sb4);
        Boolean bool2 = Boolean.TRUE;
        if (!C87412m.m108589b(bool, bool2)) {
            this.f31538a.put(sb4, bool2);
            C115669n.INSTANCE.mo160131h(22143, Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i3));
        }
    }

    public void reset() {
        Log.m105926v("MicroMsg.ImageOCRReporter", "alvinluo ImageOCRReporter reset");
        this.f31538a.clear();
    }
}
