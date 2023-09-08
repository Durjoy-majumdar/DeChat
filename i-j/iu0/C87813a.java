package iu0;

import com.tencent.p014mm.plugin.appbrand.extendplugin.C81826e;
import gy3.C87412m;
import lu0.C88648a;
import lu0.C88652h;
import p964fd.C86826e;
import p980id.C87696b;
import vn0.C90847e;
import yk0.C91469a;

/* renamed from: iu0.a */
public final class C87813a extends C81826e {

    /* renamed from: e */
    public static final C87813a f254220e = new C87813a();

    public C87696b lj0(String str) {
        C87412m.m108594g(str, "type");
        int hashCode = str.hashCode();
        if (hashCode != -1960115589) {
            if (hashCode != 112202875) {
                if (hashCode == 113005369 && str.equals("webgl")) {
                    return new C91469a();
                }
            } else if (str.equals("video")) {
                C88652h hVar = new C88652h();
                C86826e eVar = new C86826e(hVar);
                hVar.f255961a = eVar;
                eVar.mo121267B(new C88648a());
                return eVar;
            }
        } else if (str.equals("voiproom")) {
            return new C90847e();
        }
        return super.lj0(str);
    }
}
