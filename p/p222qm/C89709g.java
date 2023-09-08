package p222qm;

import android.content.Context;
import android.content.Intent;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.CreateOrJoinChatroomEvent;
import com.tencent.p014mm.plugin.base.stub.C85083h;
import com.tencent.p014mm.plugin.base.stub.WXBizEntryActivity;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: qm.g */
public class C89709g extends IStaticListener<CreateOrJoinChatroomEvent> {
    public boolean callback(IEvent iEvent) {
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        C80610p1 p1Var = C80610p1.f235824f;
        CreateOrJoinChatroomEvent.C80712a aVar = ((CreateOrJoinChatroomEvent) iEvent).f236173d;
        Context context = aVar.f236177d;
        if (context == null) {
            Log.m105920e("MicroMsg.WorkerProfile", "CreateOrJoinChatroomEvent, context is null");
            return false;
        }
        String[] strArr = aVar.f236176c;
        if (strArr == null || strArr.length < 2) {
            Log.m105920e("MicroMsg.WorkerProfile", "CreateOrJoinChatroomEvent, invalid args");
            return false;
        }
        String[] strArr2 = aVar.f236175b;
        String str5 = "";
        String str6 = (strArr2 == null || strArr2.length <= 0) ? str5 : strArr2[0];
        String str7 = strArr[0];
        String str8 = strArr[1];
        String str9 = strArr[2];
        int i2 = aVar.f236174a;
        if (i2 == 1) {
            String str10 = strArr.length >= 4 ? strArr[3] : str5;
            str3 = strArr.length >= 5 ? strArr[4] : str5;
            str2 = strArr.length >= 6 ? strArr[5] : str5;
            if (strArr.length >= 7) {
                str5 = strArr[6];
            }
            i = 14;
            str = "action_create";
            String str11 = str5;
            str5 = str10;
            str4 = str11;
        } else if (i2 != 2) {
            return false;
        } else {
            str3 = strArr.length >= 4 ? strArr[3] : str5;
            str2 = strArr.length >= 5 ? strArr[4] : str5;
            str4 = strArr.length >= 6 ? strArr[5] : str5;
            i = 15;
            str = "action_join";
        }
        Intent intent = new Intent(context, WXBizEntryActivity.class);
        intent.addFlags(268435456).addFlags(134217728).addFlags(67108864);
        intent.putExtra("key_app_id", str7);
        intent.putExtra("key_transaction", str8);
        intent.putExtra("key_command_id", i);
        intent.putExtra("action", str);
        intent.putExtra("package_name", str6);
        intent.putExtra(FirebaseAnalytics.C113379b.GROUP_ID, str9);
        intent.putExtra("chatroom_name", str5);
        intent.putExtra("chatroom_nickname", str3);
        intent.putExtra("ext_msg", str2);
        intent.putExtra("open_id", str4);
        C85083h.m104929r(intent, context);
        return true;
    }
}
