package p156gj;

import com.tencent.p014mm.sdk.platformtools.Log;
import kj2.C117407d;

/* renamed from: gj.u */
public final class C87225u {
    /* renamed from: a */
    public static void m108324a(int i, int i2, int i3, boolean z) {
        Log.m105925i("MicroMsg.DeviceInfoDiagHelper", "[+] report idkey id: %s, key: %s, val: %s, isImportant: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z));
        C117407d.INSTANCE.idkeyStat((long) i, (long) i2, (long) i3, z);
    }
}
