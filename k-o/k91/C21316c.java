package k91;

import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import f91.C116850b;

/* renamed from: k91.c */
public final class C21316c {

    /* renamed from: b */
    public static volatile C21316c f60218b;

    /* renamed from: a */
    public C21315a f60219a = new C21317d();

    public C21316c() {
        if (C116711b.m164589n()) {
            ((C21317d) this.f60219a).getClass();
            Log.m105924i("HABBYGE-MALI.ActivityDao_MMKV", "ActivityDao_MMKV reset");
            C116850b.m164834d("hell_aty_action_mmkv_key", new byte[0]);
        }
    }

    /* renamed from: a */
    public static C21316c m23893a() {
        if (f60218b == null) {
            synchronized (C21316c.class) {
                if (f60218b == null) {
                    f60218b = new C21316c();
                }
            }
        }
        return f60218b;
    }
}
