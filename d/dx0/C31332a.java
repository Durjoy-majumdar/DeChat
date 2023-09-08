package dx0;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import zt3.C119157j;

/* renamed from: dx0.a */
public class C31332a {
    /* renamed from: a */
    public static void m39373a(String str, Runnable runnable, long j) {
        if (j > 0) {
            ((C119157j) C119157j.f356862d).mo183879j(runnable, j, str);
        } else {
            ((C119157j) C119157j.f356862d).mo183876g(runnable, str);
        }
    }

    /* renamed from: b */
    public static void m39374b(int i, Object obj) {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = obj == null ? "null" : obj.toString();
        Log.m105925i("MicroMsg.BrandService.BrandServiceApplication", "set config, key[%d], value[%s]", objArr);
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119676J(i, obj);
    }
}
