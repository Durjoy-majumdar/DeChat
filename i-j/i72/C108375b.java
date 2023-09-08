package i72;

import android.app.ActivityManager;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Build;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f72.C97842b;
import java.util.List;
import org.json.JSONObject;
import p156gj.C107842p;
import p156gj.C87203t;

/* renamed from: i72.b */
public class C108375b {

    /* renamed from: J */
    public static C108375b f324441J;

    /* renamed from: A */
    public int f324442A;

    /* renamed from: B */
    public int f324443B;

    /* renamed from: C */
    public int f324444C;

    /* renamed from: D */
    public int f324445D;

    /* renamed from: E */
    public int f324446E;

    /* renamed from: F */
    public long f324447F;

    /* renamed from: G */
    public long f324448G;

    /* renamed from: H */
    public int f324449H;

    /* renamed from: I */
    public JSONObject f324450I = null;

    /* renamed from: a */
    public String f324451a = C87203t.m108275k();

    /* renamed from: b */
    public String f324452b = (Build.VERSION.SDK_INT + "");

    /* renamed from: c */
    public int f324453c;

    /* renamed from: d */
    public int f324454d;

    /* renamed from: e */
    public String f324455e;

    /* renamed from: f */
    public int f324456f;

    /* renamed from: g */
    public int f324457g;

    /* renamed from: h */
    public String f324458h;

    /* renamed from: i */
    public String f324459i;

    /* renamed from: j */
    public String f324460j;

    /* renamed from: k */
    public String f324461k;

    /* renamed from: l */
    public int f324462l;

    /* renamed from: m */
    public int f324463m;

    /* renamed from: n */
    public int f324464n;

    /* renamed from: o */
    public int f324465o;

    /* renamed from: p */
    public int f324466p;

    /* renamed from: q */
    public int f324467q;

    /* renamed from: r */
    public int f324468r = 0;

    /* renamed from: s */
    public int f324469s;

    /* renamed from: t */
    public int f324470t;

    /* renamed from: u */
    public int f324471u;

    /* renamed from: v */
    public int f324472v;

    /* renamed from: w */
    public int f324473w;

    /* renamed from: x */
    public int f324474x;

    /* renamed from: y */
    public int f324475y;

    /* renamed from: z */
    public int f324476z;

    /* renamed from: b */
    public static C108375b m146794b() {
        if (f324441J == null) {
            m146795c();
        }
        return f324441J;
    }

    /* renamed from: c */
    public static void m146795c() {
        C108375b bVar = new C108375b();
        f324441J = bVar;
        bVar.f324453c = ((ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getLargeMemoryClass();
        f324441J.f324454d = C97842b.m126299p(MMApplicationContext.getContext());
        f324441J.f324455e = C107842p.m146110c();
        Point g = C97842b.m126290g(MMApplicationContext.getContext());
        C108375b bVar2 = f324441J;
        bVar2.f324456f = g.x;
        bVar2.f324457g = g.y;
    }

    /* renamed from: a */
    public void mo158889a(String str, int i) {
        C108392r rVar = C108388k.f324540d;
        this.f324471u = rVar.f324551a;
        this.f324472v = rVar.f324554d;
        this.f324473w = rVar.f324555e ? 1 : 0;
        this.f324474x = rVar.f324556f ? 1 : 0;
        this.f324475y = rVar.f324557g;
        this.f324476z = i;
        this.f324447F = C86013q1.m106451l(str);
        C94554a c = C94555d.m119567c(str, true);
        if (c != null) {
            this.f324444C = c.f273445c;
            this.f324445D = c.f273446d;
            this.f324446E = c.f273444b;
            this.f324442A = c.f273443a;
        }
    }

    /* renamed from: d */
    public void mo158890d(Point point, Point point2, Point point3) {
        this.f324467q = -1;
        this.f324466p = -1;
        this.f324463m = -1;
        this.f324462l = -1;
        this.f324465o = -1;
        this.f324464n = -1;
        if (point != null) {
            this.f324464n = point.x;
            this.f324465o = point.y;
        }
        if (point2 != null) {
            this.f324462l = point2.x;
            this.f324463m = point2.y;
        }
        if (point3 != null) {
            this.f324466p = point3.x;
            this.f324467q = point3.y;
        }
    }

    /* renamed from: e */
    public void mo158891e(List<Camera.Size> list, List<Camera.Size> list2, int i) {
        if (Util.isNullOrNil(this.f324458h)) {
            this.f324458h = C97842b.m126306w(list);
        }
        if (Util.isNullOrNil(this.f324459i)) {
            this.f324459i = C97842b.m126306w(list2);
        }
        this.f324468r = i;
        this.f324449H = 1;
    }

    /* renamed from: f */
    public void mo158892f(List<Camera.Size> list, List<Camera.Size> list2, int i) {
        if (Util.isNullOrNil(this.f324460j)) {
            this.f324460j = C97842b.m126306w(list);
        }
        if (Util.isNullOrNil(this.f324461k)) {
            this.f324461k = C97842b.m126306w(list2);
        }
        this.f324468r = i;
        this.f324449H = 2;
    }
}
