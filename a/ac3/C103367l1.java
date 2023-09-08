package ac3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.xeffect.WeEffectRender;
import com.tencent.p014mm.xeffect.XEffectLog;
import gy3.C87412m;
import java.util.Arrays;
import java.util.HashSet;
import qr3.C36070f;

/* renamed from: ac3.l1 */
public final class C103367l1 {

    /* renamed from: a */
    public static boolean f304841a;

    /* renamed from: b */
    public static final HashSet<String> f304842b = new HashSet<>();

    /* renamed from: ac3.l1$a */
    public static final class C103368a implements XEffectLog.C106869c {
        /* renamed from: d */
        public void mo143270d(String str, String str2, Object... objArr) {
            C87412m.m108594g(objArr, "args");
            Log.m105919d(str, str2, Arrays.copyOf(objArr, objArr.length));
        }

        /* renamed from: e */
        public void mo143271e(String str, String str2, Object... objArr) {
            C87412m.m108594g(objArr, "args");
            Log.m105921e(str, str2, Arrays.copyOf(objArr, objArr.length));
        }

        /* renamed from: i */
        public void mo143272i(String str, String str2, Object... objArr) {
            C87412m.m108594g(objArr, "args");
            Log.m105925i(str, str2, Arrays.copyOf(objArr, objArr.length));
        }

        /* renamed from: w */
        public void mo143273w(String str, String str2, Object... objArr) {
            C87412m.m108594g(objArr, "args");
            Log.m105929w(str, str2, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: a */
    public static final void m137008a() {
        if (!f304841a) {
            f304841a = true;
            XEffectLog.f319986a = new C103368a();
            try {
                C36070f.m40901a("xeffect_xlog");
                WeEffectRender.nSetNativeLog(XEffectLog.m144537a());
            } catch (Throwable th) {
                XEffectLog.f319986a.mo143271e("XEffectLog", "init xlog error %s", th.getMessage());
            }
        }
    }
}
