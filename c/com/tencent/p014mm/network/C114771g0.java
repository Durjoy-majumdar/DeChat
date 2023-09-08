package com.tencent.p014mm.network;

import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.booter.CoreService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import p823sg.C90196p;
import tl0.C90509a;
import zn0.C91802b;

/* renamed from: com.tencent.mm.network.g0 */
public class C114771g0 {

    /* renamed from: b */
    public static final byte[] f344145b = C90196p.m112888e(7);

    /* renamed from: a */
    public C114792p f344146a;

    /* renamed from: a */
    public void mo174420a(int i, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("onNotify, datalen=");
        sb.append(bArr == null ? 0 : bArr.length);
        sb.append(" cmd= ");
        sb.append(i);
        Log.m105924i("MicroMsg.MMNativeNetNotifyAdapter", sb.toString());
        switch (i) {
            case 5:
                Log.m105924i("MicroMsg.MMNativeNetNotifyAdapter", "old notify");
                ((CoreService) this.f344146a).mo174261d(0, 0, "", 138, f344145b);
                return;
            case 8:
                if (bArr.length > 0) {
                    ((CoreService) this.f344146a).mo174261d(0, 0, "", 10, bArr);
                    return;
                }
                return;
            case 24:
                Log.m105925i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush new notify [%s]", Util.dumpHex(bArr));
                ((CoreService) this.f344146a).mo174261d(0, 0, "", 138, bArr);
                return;
            case 39:
                Log.m105924i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush do synccheck");
                ((CoreService) this.f344146a).mo174261d(0, 0, "", 39, (byte[]) null);
                return;
            case 61:
                ((CoreService) this.f344146a).mo174261d(0, 0, "", WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE, bArr);
                return;
            case 120:
                Log.m105924i("MicroMsg.MMNativeNetNotifyAdapter", "MM_PKT_VOIP_REQ");
                if (bArr.length > 0) {
                    ((CoreService) this.f344146a).mo174261d(0, 0, "", 120, bArr);
                    return;
                }
                return;
            case 122:
                Log.m105924i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush MM_PKT_PUSH_DATA_REQ");
                if (bArr.length > 0) {
                    ((CoreService) this.f344146a).mo174261d(0, 0, "", 268369921, bArr);
                    return;
                }
                return;
            case 192:
                ((CoreService) this.f344146a).mo174261d(0, 0, "", 192, bArr);
                return;
            case 241:
                Log.m105924i("MicroMsg.MMNativeNetNotifyAdapter", "jacks do voice notify PUSH");
                ((CoreService) this.f344146a).mo174261d(0, 0, "", 241, bArr);
                return;
            case 244:
                Log.m105924i("MicroMsg.MMNativeNetNotifyAdapter", "pandy do gamesync notify");
                ((CoreService) this.f344146a).mo174261d(0, 0, "", 244, bArr);
                return;
            case C90509a.C90511b.CTRL_INDEX:
                ((CoreService) this.f344146a).mo174261d(0, 0, "", C90509a.C90511b.CTRL_INDEX, bArr);
                return;
            case 311:
                Log.m105924i("MicroMsg.MMNativeNetNotifyAdapter", "on notify F2F data");
                ((CoreService) this.f344146a).mo174261d(0, 0, "", 311, bArr);
                return;
            case 3941:
                ((CoreService) this.f344146a).mo174261d(0, 0, "", 3941, bArr);
                return;
            case 6238:
                ((CoreService) this.f344146a).mo174261d(0, 0, "", 6238, bArr);
                return;
            case 10098:
                ((CoreService) this.f344146a).mo174261d(0, 0, "", 10098, bArr);
                return;
            case 268369923:
                Log.m105924i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush do oob do notify");
                ((CoreService) this.f344146a).mo174261d(0, 0, "", 268369923, bArr);
                return;
            case 1000000205:
                ((CoreService) this.f344146a).mo174261d(0, 0, "", 1000000205, bArr);
                return;
            default:
                switch (i) {
                    case C91802b.CTRL_INDEX:
                        Log.m105924i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on silence notify");
                        ((CoreService) this.f344146a).mo174261d(0, 0, "", C91802b.CTRL_INDEX, bArr);
                        return;
                    case 319:
                        Log.m105924i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on byp notify");
                        ((CoreService) this.f344146a).mo174261d(0, 0, "", 319, bArr);
                        return;
                    case C0947jz.f2205e:
                        Log.m105924i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on byp notify ACTION_EVENT");
                        ((CoreService) this.f344146a).mo174261d(0, 0, "", C0947jz.f2205e, bArr);
                        return;
                    case 321:
                        Log.m105924i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on byp notify encryted ACTION_EVENT");
                        ((CoreService) this.f344146a).mo174261d(0, 0, "", 321, bArr);
                        return;
                    case 322:
                        Log.m105924i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on byp notify ACTION_EVENT_FINDER_REDDOT");
                        ((CoreService) this.f344146a).mo174261d(0, 0, "", 322, bArr);
                        return;
                    default:
                        return;
                }
        }
    }
}
