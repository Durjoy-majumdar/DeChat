package p222qm;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.AddCardToWXEvent;
import com.tencent.p014mm.plugin.base.stub.C85083h;
import com.tencent.p014mm.plugin.base.stub.WXBizEntryActivity;
import com.tencent.p014mm.pluginsdk.model.app.C6647c;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import p823sg.C90193h;

/* renamed from: qm.c */
public class C89705c extends IStaticListener<AddCardToWXEvent> {
    public boolean callback(IEvent iEvent) {
        String str;
        String str2;
        String str3;
        String str4;
        AddCardToWXEvent addCardToWXEvent = (AddCardToWXEvent) iEvent;
        C80610p1 p1Var = C80610p1.f235824f;
        AddCardToWXEvent.C80699a aVar = addCardToWXEvent.f236123d;
        Context context = aVar.f236126c;
        if (context == null) {
            Log.m105920e("MicroMsg.WorkerProfile", "add card to wx event, context is null");
            return false;
        }
        String[] strArr = aVar.f236124a;
        String str5 = null;
        if (strArr == null || strArr.length <= 0) {
            str2 = null;
            str = null;
        } else {
            str2 = strArr[0];
            str = C90193h.m112878f(C6647c.m6936a(context, str2)[0].toByteArray());
        }
        String[] strArr2 = addCardToWXEvent.f236123d.f236125b;
        if (strArr2 == null || strArr2.length <= 1) {
            str4 = null;
            str3 = null;
        } else {
            str4 = strArr2[0];
            str3 = strArr2[1];
        }
        if (strArr2 != null && strArr2.length > 2) {
            str5 = strArr2[2];
        }
        Log.m105925i("MicroMsg.WorkerProfile", "carlist = %s, appid = %s, transcation = %s", str3, str4, str5);
        Intent intent = new Intent(context, WXBizEntryActivity.class);
        intent.addFlags(268435456).addFlags(134217728).addFlags(67108864);
        intent.putExtra("key_in_card_list", str3);
        intent.putExtra("key_package_name", str2);
        intent.putExtra("key_sign", str);
        intent.putExtra("key_from_scene", 8);
        intent.putExtra("key_command_id", 9);
        intent.putExtra("key_app_id", str4);
        intent.putExtra("key_transaction", str5);
        C85083h.m104929r(intent, context);
        return true;
    }
}
