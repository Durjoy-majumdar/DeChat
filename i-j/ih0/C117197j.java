package ih0;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.mmdata.rpt.AiWeixinGpsInfoStruct;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86301e;
import di3.C86312j;
import eb0.C45628s0;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import lh0.C34262g;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: ih0.j */
public class C117197j extends C86301e {

    /* renamed from: d */
    public long f351081d = 0;

    /* renamed from: e */
    public boolean f351082e = false;

    /* renamed from: f */
    public AiWeixinGpsInfoStruct f351083f = null;

    public static String vx0(String str) {
        if (C72996z1.m85840k5(str) || C72996z1.m85806K4(str)) {
            return "notifyMessage";
        }
        if (C72996z1.m85841l5(str)) {
            return "subscribe";
        }
        if (C45628s0.m50751P(str) || C72996z1.m85795C5(str)) {
            return "plugin";
        }
        if (str.startsWith("gh_")) {
            return "service";
        }
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        return (z1Var == null || Util.isNullOrNil(z1Var.getUsername())) ? "error" : C72996z1.m85820U5(str) ? z1Var.f149512S == 0 ? "groupMute" : "group" : z1Var.mo62916m3() ? "subscribe" : C45628s0.m50746K(z1Var) ? "singleMute" : MStorageEventData.EventType.SINGLE;
    }

    public static C117197j wx0() {
        return (C117197j) C86312j.m106911c(C117197j.class);
    }

    public void onCreate(Context context) {
        C34262g vx02 = C34262g.vx0();
        vx02.requireAccountInitialized();
        MultiProcessMMKV b = vx02.f92371i.mo33601b();
        String str = "";
        if (b != null) {
            str = b.getString("last_gps_info", str);
        }
        if (!Util.isNullOrNil(str)) {
            this.f351083f = new AiWeixinGpsInfoStruct(str);
        } else {
            this.f351083f = new AiWeixinGpsInfoStruct();
        }
    }
}
