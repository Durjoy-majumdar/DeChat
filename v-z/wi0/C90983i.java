package wi0;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C86491q2;

/* renamed from: wi0.i */
public class C90983i extends C86491q2 {

    /* renamed from: b */
    public final /* synthetic */ C90985j f261057b;

    public C90983i(C90985j jVar) {
        this.f261057b = jVar;
    }

    /* renamed from: a */
    public String mo56580a() {
        return "MicroMsg.AppBrandNewContactFixVersionStateTransfer";
    }

    /* renamed from: b */
    public boolean mo56581b(int i) {
        return i >= 637863936 && i <= 637863988;
    }

    /* renamed from: c */
    public void mo56582c(int i) {
        if (mo56581b(i)) {
            try {
                C90985j.m114153a(this.f261057b);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AppBrandNewContactFixVersionStateTransfer", "doFix e = %s", e);
            }
        }
    }
}
