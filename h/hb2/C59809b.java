package hb2;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.plugin.appbrand.jsapi.offlinevoice.C29531a;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: hb2.b */
public final class C59809b {

    /* renamed from: f */
    public static final C59810a f170715f = new C59810a((C8480h) null);

    /* renamed from: g */
    public static int f170716g = 1;

    /* renamed from: a */
    public final String f170717a;

    /* renamed from: b */
    public final int f170718b;

    /* renamed from: c */
    public final int f170719c;

    /* renamed from: d */
    public long f170720d;

    /* renamed from: e */
    public String f170721e;

    /* renamed from: hb2.b$a */
    public static final class C59810a {
        public C59810a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C59809b mo84759a() {
            C59809b bVar = new C59809b(C59809b.f170716g + ".mp4", C29531a.CTRL_INDEX, 1080, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, (String) null, 16, (C8480h) null);
            if (C86013q1.m106450k(bVar.mo84758a())) {
                C59809b.f170716g++;
                return bVar;
            }
            C59809b.f170716g = 1;
            return new C59809b(C59809b.f170716g + ".mp4", C29531a.CTRL_INDEX, 1080, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, (String) null, 16, (C8480h) null);
        }
    }

    public C59809b(String str, int i, int i2, long j, String str2, int i3, C8480h hVar) {
        str2 = (i3 & 16) != 0 ? "" : str2;
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, "thumbPath");
        this.f170717a = str;
        this.f170718b = i;
        this.f170719c = i2;
        this.f170720d = j;
        this.f170721e = str2;
    }

    /* renamed from: a */
    public final String mo84758a() {
        StringBuilder sb = new StringBuilder();
        sb.append(C86709a0.m107535s().f251806d + "music/cover/");
        sb.append("mv_default_video/");
        String i = C86013q1.m106448i(new C86009m1(sb.toString(), this.f170717a).mo119971i(), false);
        return i == null ? "" : i;
    }
}
