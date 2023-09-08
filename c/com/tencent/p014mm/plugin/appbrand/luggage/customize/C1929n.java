package com.tencent.p014mm.plugin.appbrand.luggage.customize;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import f40.C86709a0;
import no0.C117633g;
import pl0.C11975p;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.customize.n */
public class C1929n extends C117633g {

    /* renamed from: d */
    public boolean f11802d = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.customize.n$a */
    public static final class C1930a implements C80916r<IPCVoid, IPCBoolean> {
        private C1930a() {
        }

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            try {
                Log.m105924i("MicroMsg.WxaMapViewFactoryWC", "ipc IsOverseaUserTask");
                boolean equalsIgnoreCase = "CN".equalsIgnoreCase((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null));
                boolean z = true;
                Log.m105925i("MicroMsg.WxaMapViewFactoryWC", "chinaReg:%b", Boolean.valueOf(equalsIgnoreCase));
                if (equalsIgnoreCase) {
                    z = false;
                }
                return new IPCBoolean(z);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WxaMapViewFactoryWC", e, "ipc IsOverseaUserTask task", new Object[0]);
                return new IPCBoolean(false);
            }
        }
    }

    /* renamed from: X2 */
    public C11975p mo1822X2(byte[] bArr) {
        return new C92908m(bArr);
    }

    /* renamed from: a */
    public boolean mo1823a() {
        if (this.f11802d) {
            return true;
        }
        IPCBoolean iPCBoolean = (IPCBoolean) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, null, C1930a.class);
        boolean z = iPCBoolean == null ? false : iPCBoolean.f10312d;
        Log.m105925i("MicroMsg.WxaMapViewFactoryWC", "isOverseasUserFromMainTask:%b", Boolean.valueOf(z));
        this.f11802d = z;
        return z;
    }
}
