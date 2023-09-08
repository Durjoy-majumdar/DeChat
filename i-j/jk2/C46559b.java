package jk2;

import android.os.Bundle;
import c30.C104289g;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import g02.C32291d;
import gy3.C87412m;
import kk2.C46730a;
import kotlin.Metadata;
import ob0.C47350c;
import pe3.C47465a;
import q20.C89449a;
import te3.C49853ij;
import te3.C50316lw;
import te3.C51164rw;
import te3.C51605uw;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Ljk2/b;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "feature-exdevice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C89449a
/* renamed from: jk2.b */
public final class C46559b implements C80883e<Bundle, Bundle> {
    public void invoke(Object obj, C1256g gVar) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        String str5;
        String str6;
        String str7;
        C114770g gVar2;
        C47465a aVar;
        C1256g gVar3 = gVar;
        Bundle bundle = (Bundle) obj;
        Log.m105918d("MicroMsg.Rtos.IPCBuildDeviceSecureChannel", "invoke");
        Bundle bundle2 = new Bundle();
        C114770g gVar4 = C86709a0.m107524d().f256809d;
        int i2 = bundle != null ? bundle.getInt("taskid", -1) : -1;
        String string = bundle != null ? bundle.getString("handshke") : null;
        if (gVar4 == null || bundle == null || string == null || i2 == -1) {
            Log.m105928w("MicroMsg.Rtos.IPCBuildDeviceSecureChannel", "dispatcher null");
            C32291d.m39670c(bundle2, "code", -1);
            C32291d.m39670c(bundle2, "taskid", i2);
            if (gVar3 != null) {
                gVar3.mo894a(bundle2);
                return;
            }
            return;
        }
        C46730a aVar2 = new C46730a();
        String str8 = "";
        C104289g gVar5 = new C104289g(string);
        int optInt = gVar5.optInt("req_handshake_type_flag", 0);
        C104289g m = gVar5.optJSONObject("ecdh_req");
        if (m != null) {
            str2 = m.optString("device4wxapp_ecdh_pub_key");
            C87412m.m108593f(str2, "ecdhReq.optString(\"device4wxapp_ecdh_pub_key\")");
            str = m.optString("wxapp4device_ecdh_pub_key");
            C87412m.m108593f(str, "ecdhReq.optString(\"wxapp4device_ecdh_pub_key\")");
            str3 = m.optString("local_base_key");
            C87412m.m108593f(str3, "ecdhReq.optString(\"local_base_key\")");
        } else {
            str3 = str8;
            str2 = str3;
            str = str2;
        }
        C104289g m2 = gVar5.optJSONObject("psk_req");
        if (m2 != null) {
            str4 = m2.optString("ticket_key");
            C87412m.m108593f(str4, "pskReq.optString(\"ticket_key\")");
        } else {
            str4 = str8;
        }
        C104289g m3 = gVar5.optJSONObject("handshake_base_req");
        if (m3 != null) {
            str8 = m3.optString("device_random");
            C87412m.m108593f(str8, "handshakeBaseReq.optString(\"device_random\")");
            str6 = m3.optString("wxapp_random");
            C87412m.m108593f(str6, "handshakeBaseReq.optString(\"wxapp_random\")");
            str5 = m3.optString("client_id");
            C87412m.m108593f(str5, "handshakeBaseReq.optString(\"client_id\")");
            i = m3.getInt("hw_client_version");
            str7 = m3.optString("hw_device_type");
            C87412m.m108593f(str7, "handshakeBaseReq.optString(\"hw_device_type\")");
        } else {
            str7 = str8;
            str6 = str7;
            str5 = str6;
            i = 0;
        }
        C47350c cVar = aVar2.f125806f;
        if (cVar != null) {
            aVar = cVar.f127055a.f127080a;
            gVar2 = gVar4;
        } else {
            gVar2 = gVar4;
            aVar = null;
        }
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BuildDeviceSecureChannelReq");
        C49853ij ijVar = (C49853ij) aVar;
        ijVar.f135371g = optInt;
        C51164rw rwVar = new C51164rw();
        rwVar.f141177d = aVar2.mo71963j1(str2);
        rwVar.f141179f = aVar2.mo71963j1(str);
        rwVar.f141180g = aVar2.mo71963j1(str3);
        ijVar.f135368d = rwVar;
        C51605uw uwVar = new C51605uw();
        uwVar.f143160d = aVar2.mo71963j1(str4);
        ijVar.f135369e = uwVar;
        C50316lw lwVar = new C50316lw();
        lwVar.f137671d = aVar2.mo71963j1(str8);
        lwVar.f137672e = aVar2.mo71963j1(str6);
        lwVar.f137673f = str5;
        lwVar.f137675h = str7;
        lwVar.f137674g = i;
        ijVar.f135370f = lwVar;
        aVar2.doScene(gVar2, new C46558a(bundle2, this, i2, gVar3));
    }
}
