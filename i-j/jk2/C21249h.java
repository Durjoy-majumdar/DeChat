package jk2;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.rtos.bluetooth.RtosBCChannel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import gy3.C87412m;
import ik2.C21096a;
import kotlin.Metadata;
import nk2.C21641f;
import q20.C89449a;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Ljk2/h;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "<init>", "()V", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C89449a
/* renamed from: jk2.h */
public final class C21249h implements C80883e<Bundle, IPCInteger> {
    public void invoke(Object obj, C1256g gVar) {
        String str;
        Bundle bundle = (Bundle) obj;
        String str2 = null;
        String string = bundle != null ? bundle.getString(TPDownloadProxyEnum.USER_MAC) : null;
        String string2 = bundle != null ? bundle.getString("avatar") : null;
        boolean z = false;
        Log.m105925i("MicroMsg.Rtos.RtosWatchLoginUI", "invoke mac:%s avatar:%s", string, string2);
        C21641f a = C21641f.f61259l.mo33911a();
        C21248g gVar2 = new C21248g(gVar);
        a.getClass();
        if (!a.f61264d) {
            Log.m105928w("MicroMsg.Rtos.RtosWatchService", "handleScanResult but not init");
            gVar2.mo33233a(0);
            return;
        }
        Log.m105924i("MicroMsg.Rtos.RtosWatchService", "handleScanResult sha256=" + string);
        C21096a aVar = a.f61261a;
        if (aVar != null && !((RtosBCChannel) aVar).mo24191i()) {
            gVar2.mo33233a(13);
            return;
        }
        if (string == null || string.length() == 0) {
            gVar2.mo33233a(0);
            return;
        }
        C21096a aVar2 = a.f61261a;
        String f = aVar2 != null ? ((RtosBCChannel) aVar2).mo24188f(string) : null;
        Log.m105924i("MicroMsg.Rtos.RtosWatchService", "handleScanResult watch mac=" + f + ", avatar is " + string2);
        a.f61270j = string2;
        a.f61271k = false;
        Bundle bundle2 = (Bundle) C80907o.m98783f(WeChatProcess.PROCESS_MAIN, new IPCVoid(), C33589t.class);
        C21096a aVar3 = a.f61261a;
        if (aVar3 != null) {
            str = ((RtosBCChannel) aVar3).mo24188f(bundle2 != null ? bundle2.getString(TPDownloadProxyEnum.USER_MAC, "") : null);
        } else {
            str = null;
        }
        if (bundle2 != null) {
            str2 = bundle2.getString("username", "");
        }
        Log.m105924i("MicroMsg.Rtos.RtosWatchService", "storeMac:" + str + ", storeUsername:" + str2);
        if (str == null || str.length() == 0) {
            C21096a aVar4 = a.f61261a;
            if (aVar4 != null) {
                C87412m.m108591d(f);
                if (((RtosBCChannel) aVar4).mo24185d(f)) {
                    z = true;
                }
            }
            if (z) {
                C21096a aVar5 = a.f61261a;
                if (aVar5 != null) {
                    C87412m.m108591d(f);
                    ((RtosBCChannel) aVar5).init(f);
                }
                gVar2.mo33233a(12);
                return;
            }
            gVar2.mo33233a(9);
            return;
        }
        if (f != null && C112551y.m153809i(f, str, true)) {
            C21096a aVar6 = a.f61261a;
            if (aVar6 != null) {
                C87412m.m108591d(f);
                if (((RtosBCChannel) aVar6).mo24185d(f)) {
                    z = true;
                }
            }
            if (z) {
                Log.m105924i("MicroMsg.Rtos.RtosWatchService", "try establish channel");
                C21096a aVar7 = a.f61261a;
                if (aVar7 != null) {
                    C87412m.m108591d(f);
                    ((RtosBCChannel) aVar7).init(f);
                }
                C21096a aVar8 = a.f61261a;
                if (aVar8 != null) {
                    ((RtosBCChannel) aVar8).mo24197m();
                }
            }
            gVar2.mo33233a(10);
            return;
        }
        gVar2.mo33233a(11);
    }
}
