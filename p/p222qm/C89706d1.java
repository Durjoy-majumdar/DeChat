package p222qm;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.SDKOpenBusiLuckyMoneyEvent;
import com.tencent.p014mm.plugin.base.stub.C85083h;
import com.tencent.p014mm.plugin.base.stub.WXBizEntryActivity;
import com.tencent.p014mm.pluginsdk.model.app.C6647c;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import p823sg.C90193h;

/* renamed from: qm.d1 */
public class C89706d1 extends IStaticListener<SDKOpenBusiLuckyMoneyEvent> {
    public boolean callback(IEvent iEvent) {
        String str;
        SDKOpenBusiLuckyMoneyEvent sDKOpenBusiLuckyMoneyEvent = (SDKOpenBusiLuckyMoneyEvent) iEvent;
        C80610p1 p1Var = C80610p1.f235824f;
        SDKOpenBusiLuckyMoneyEvent.C80737a aVar = sDKOpenBusiLuckyMoneyEvent.f236273d;
        Context context = aVar.f236276c;
        if (context == null) {
            Log.m105920e("MicroMsg.WorkerProfile", "add card to wx event, context is null");
        } else {
            String[] strArr = aVar.f236274a;
            String str2 = null;
            if (strArr == null || strArr.length <= 0) {
                str = null;
            } else {
                str2 = strArr[0];
                str = C90193h.m112878f(C6647c.m6936a(context, str2)[0].toByteArray());
            }
            String[] strArr2 = sDKOpenBusiLuckyMoneyEvent.f236273d.f236275b;
            if (strArr2 != null && strArr2.length >= 6) {
                Intent intent = new Intent(context, WXBizEntryActivity.class);
                intent.addFlags(268435456).addFlags(134217728).addFlags(67108864);
                intent.putExtra("key_way", 4);
                intent.putExtra("appId", strArr2[0]);
                intent.putExtra("timeStamp", strArr2[1]);
                intent.putExtra("nonceStr", strArr2[2]);
                intent.putExtra("packageExt", strArr2[5]);
                intent.putExtra("signtype", strArr2[3]);
                intent.putExtra("paySignature", strArr2[4]);
                intent.putExtra("key_wxapi_package_name", str2);
                intent.putExtra("key_wxapi_sign", str);
                intent.putExtra("key_command_id", 13);
                C85083h.m104929r(intent, context);
            }
        }
        return false;
    }
}
