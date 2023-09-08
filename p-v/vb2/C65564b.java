package vb2;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8480h;
import java.util.List;
import kg3.C76577a;
import sx3.C64197v;

/* renamed from: vb2.b */
public final class C65564b {

    /* renamed from: d */
    public static final List<Long> f188647d = C64197v.m75537f(1000L, 2000L, 3000L, Long.valueOf(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION), 10000L, 15000L, 30000L);

    /* renamed from: e */
    public static final int f188648e = C76577a.m92151b(MMApplicationContext.getContext(), 40);

    /* renamed from: f */
    public static final int f188649f = C76577a.m92151b(MMApplicationContext.getContext(), 80);

    /* renamed from: a */
    public int f188650a = 2;

    /* renamed from: b */
    public long f188651b = f188647d.get(2).longValue();

    /* renamed from: c */
    public float f188652c = 1.0f;

    /* renamed from: vb2.b$a */
    public static final class C65565a {
        public C65565a(C8480h hVar) {
        }
    }

    static {
        new C65565a((C8480h) null);
    }

    /* renamed from: a */
    public final void mo89648a(long j) {
        float f;
        float f2;
        int i = (j > 120000 ? 1 : (j == 120000 ? 0 : -1));
        int i2 = i < 0 ? 2 : 3;
        this.f188650a = i2;
        this.f188651b = f188647d.get(i2).longValue();
        int b = C76577a.m92151b(MMApplicationContext.getContext(), 8);
        if (i < 0) {
            f2 = (float) b;
            f = 2.0f;
        } else {
            int i3 = (j > 240000 ? 1 : (j == 240000 ? 0 : -1));
            f2 = (float) b;
            f = i3 < 0 ? 1.5f : 1.0f;
        }
        this.f188652c = (f2 * f) / ((float) 1000);
    }
}
