package s62;

import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82855e;
import com.tencent.p014mm.sdk.platformtools.Util;
import kj2.C117407d;

/* renamed from: s62.j */
public class C110766j {

    /* renamed from: a */
    public long f331296a = 0;

    /* renamed from: b */
    public long f331297b = 0;

    /* renamed from: c */
    public long f331298c = -1;

    /* renamed from: d */
    public long f331299d = 0;

    /* renamed from: e */
    public long f331300e = 0;

    /* renamed from: f */
    public long f331301f = 0;

    /* renamed from: g */
    public long f331302g = 0;

    /* renamed from: h */
    public long f331303h = 10;

    /* renamed from: i */
    public boolean f331304i = true;

    /* renamed from: j */
    public boolean f331305j = false;

    /* renamed from: k */
    public boolean f331306k = false;

    /* renamed from: l */
    public int f331307l;

    /* renamed from: m */
    public boolean f331308m = false;

    /* renamed from: n */
    public boolean f331309n = false;

    public C110766j(boolean z, int i) {
        this.f331307l = i;
    }

    /* renamed from: a */
    public int mo162287a() {
        if (this.f331307l == 1) {
            return 1427;
        }
        return C82855e.CTRL_INDEX;
    }

    /* renamed from: b */
    public int mo162288b() {
        return this.f331307l == 1 ? 20439 : 13836;
    }

    /* renamed from: c */
    public String mo162289c() {
        return hashCode() + "";
    }

    /* renamed from: d */
    public void mo162290d(String str) {
        C117407d dVar = C117407d.INSTANCE;
        dVar.idkeyStat((long) mo162287a(), 153, 1, false);
        dVar.mo160131h(mo162288b(), 501, Long.valueOf(Util.nowSecond()), str);
    }

    /* renamed from: e */
    public void mo162291e(String str) {
        C117407d dVar = C117407d.INSTANCE;
        dVar.idkeyStat((long) mo162287a(), 152, 1, false);
        dVar.mo160131h(mo162288b(), 500, Long.valueOf(Util.nowSecond()), str);
    }
}
