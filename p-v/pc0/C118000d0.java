package pc0;

import com.tencent.mmkv.MMKV;
import com.tencent.p014mm.network.C114781l0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Arrays;
import p823sg.C77710q;
import qe3.C101126c1;

/* renamed from: pc0.d0 */
public final class C118000d0 {

    /* renamed from: a */
    public static final C118001a f352701a = new C118001a((C8480h) null);

    /* renamed from: b */
    public static MMKV f352702b;

    /* renamed from: c */
    public static byte[] f352703c;

    /* renamed from: pc0.d0$a */
    public static final class C118001a {
        public C118001a(C8480h hVar) {
        }

        /* renamed from: a */
        public final byte[] mo182756a() {
            boolean isMainProcess = MMApplicationContext.isMainProcess();
            String b = mo182757b();
            byte[] bArr = C118000d0.f352703c;
            if (bArr != null && isMainProcess) {
                return bArr;
            }
            if (MMApplicationContext.isPushProcess()) {
                return Util.decodeHexString(MMApplicationContext.getContext().getSharedPreferences("notify_sync_pref", 4).getString("notify_sync_key_keybuf", ""));
            }
            Object e = C86709a0.m107535s().mo121142i().mo119684e(8195, "");
            C87412m.m108592e(e, "null cannot be cast to non-null type kotlin.String");
            byte[] decodeHexString = Util.decodeHexString(Util.nullAsNil((String) e));
            Log.m105925i("MicroMsg.SyncKeyKV", "getSyncKeyBuf uin:%s buffer:%s ", b, C101126c1.m132547d(decodeHexString));
            if (decodeHexString == null) {
                decodeHexString = new byte[0];
            }
            byte[] bArr2 = decodeHexString;
            C118000d0.f352703c = bArr2;
            return bArr2;
        }

        /* renamed from: b */
        public final String mo182757b() {
            if (MMApplicationContext.isMainProcess()) {
                String i = C86709a0.m107523b().mo121111i();
                C87412m.m108593f(i, "{\n                    MM…nString\n                }");
                return i;
            } else if (MMApplicationContext.isPushProcess()) {
                String qVar = new C77710q(C114781l0.m161554a().f344208n.f344122j).toString();
                C87412m.m108593f(qVar, "{\n                    UI…tring()\n                }");
                return qVar;
            } else {
                throw new IllegalThreadStateException("invoke must main process current processName:" + MMApplicationContext.getProcessName());
            }
        }

        /* renamed from: c */
        public final void mo182758c(byte[] bArr, boolean z) {
            C87412m.m108594g(bArr, "buffer");
            String b = mo182757b();
            if (!Arrays.equals(bArr, C118000d0.f352703c)) {
                String encodeHexString = Util.encodeHexString(bArr);
                if (MMApplicationContext.isMainProcess()) {
                    C86709a0.m107535s().mo121142i().mo119676J(8195, encodeHexString);
                }
                C118000d0.f352703c = bArr;
                MMApplicationContext.getContext().getSharedPreferences("notify_sync_pref", 4).edit().putString("notify_sync_key_keybuf", encodeHexString).commit();
                if (z) {
                    C86709a0.m107535s().mo121142i().doNotify(4, C86709a0.m107535s().mo121142i(), 8195);
                }
                Log.m105925i("MicroMsg.SyncKeyKV", "setSyncKeyBuf uin:%s buffer:%s ", b, C101126c1.m132547d(bArr));
            }
        }
    }
}
