package p176jc;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C24560g0;
import gy3.C24568q;
import gy3.C87412m;
import ny3.C89104m;
import p225rc.C89918i;

/* renamed from: jc.d */
public final class C87919d {

    /* renamed from: a */
    public static final C87919d f254457a = new C87919d();

    /* renamed from: b */
    public static final /* synthetic */ C89104m<Object>[] f254458b = {C24560g0.f70158a.mo51270d(new C24568q(f254457a, C87919d.class, "forceEnableCronet", "getForceEnableCronet()Z", 0))};

    /* renamed from: c */
    public static final MultiProcessMMKV f254459c;

    /* renamed from: d */
    public static final C89918i f254460d = new C89918i(Boolean.FALSE);

    /* renamed from: e */
    public static boolean f254461e;

    /* renamed from: f */
    public static boolean f254462f;

    /* renamed from: g */
    public static boolean f254463g;

    static {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("SkylineConfig", 2);
        C87412m.m108591d(mmkv);
        f254459c = mmkv;
    }

    /* renamed from: a */
    public final boolean mo122386a() {
        MultiProcessMMKV multiProcessMMKV = f254459c;
        if (!(multiProcessMMKV.getInt("renderBackend", 0) == 1)) {
            return multiProcessMMKV.getInt("renderBackend", 0) == 2;
        }
    }
}
