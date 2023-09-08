package df3;

import com.tencent.p014mm.recoveryv2.C85672d;

/* renamed from: df3.a */
public class C86272a {

    /* renamed from: a */
    public int f250884a;

    /* renamed from: b */
    public final C85672d f250885b;

    public C86272a(C85672d dVar) {
        this.f250885b = dVar;
        this.f250884a = Math.max(dVar.getInt("crash_count", 0), 0);
    }

    public C86272a(int i, C85672d dVar) {
        this.f250884a = i;
        this.f250885b = dVar;
    }
}
