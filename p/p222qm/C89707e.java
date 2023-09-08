package p222qm;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.ChooseCardFromWXEvent;
import com.tencent.p014mm.plugin.base.stub.C85083h;
import com.tencent.p014mm.plugin.base.stub.WXBizEntryActivity;
import com.tencent.p014mm.pluginsdk.model.app.C6647c;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p823sg.C90193h;

/* renamed from: qm.e */
public class C89707e extends IStaticListener<ChooseCardFromWXEvent> {
    public boolean callback(IEvent iEvent) {
        ChooseCardFromWXEvent chooseCardFromWXEvent = (ChooseCardFromWXEvent) iEvent;
        C80610p1 p1Var = C80610p1.f235824f;
        ChooseCardFromWXEvent.C80709a aVar = chooseCardFromWXEvent.f236163d;
        Context context = aVar.f236166c;
        int i = 0;
        if (context == null) {
            Log.m105920e("MicroMsg.WorkerProfile", "choose card from wx event, context is null");
            return false;
        }
        String[] strArr = aVar.f236164a;
        String str = null;
        if (strArr != null && strArr.length > 0) {
            str = strArr[0];
            C90193h.m112878f(C6647c.m6936a(context, str)[0].toByteArray());
        }
        String[] strArr2 = chooseCardFromWXEvent.f236163d.f236165b;
        if (strArr2 == null || strArr2.length < 10) {
            if (strArr2 != null) {
                i = strArr2.length;
            }
            Log.m105920e("MicroMsg.WorkerProfile", "ChooseCardFromWXEvent selectionArgs is null or length is < 10, the length is " + i);
            return true;
        }
        for (String str2 : strArr2) {
        }
        Log.m105925i("MicroMsg.WorkerProfile", "ChooseCardFromWXEvent selectionArgs:", strArr2.toString());
        Intent intent = new Intent(context, WXBizEntryActivity.class);
        intent.addFlags(268435456).addFlags(134217728).addFlags(67108864);
        intent.putExtra("app_id", strArr2[0]);
        intent.putExtra("shop_id", Util.getInt(strArr2[1], 0));
        intent.putExtra("sign_type", strArr2[2]);
        intent.putExtra("card_sign", strArr2[3]);
        intent.putExtra("time_stamp", Util.getInt(strArr2[4], 0));
        intent.putExtra("nonce_str", strArr2[5]);
        intent.putExtra("card_tp_id", strArr2[6]);
        intent.putExtra("card_type", strArr2[7]);
        intent.putExtra("can_multi_select", Util.getInt(strArr2[8], 0));
        intent.putExtra("key_from_scene", 8);
        intent.putExtra("key_command_id", 16);
        intent.putExtra("key_app_id", strArr2[0]);
        intent.putExtra("key_package_name", str);
        intent.putExtra("key_transaction", strArr2[9]);
        C85083h.m104929r(intent, context);
        return true;
    }
}
