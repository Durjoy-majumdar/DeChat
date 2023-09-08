package ie0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import ge0.C32415b;
import he0.C46021h;

/* renamed from: ie0.t */
public final class C33310t implements C30783v3.C30788e {

    /* renamed from: ie0.t$a */
    public static final class C33311a implements MStorage.IOnStorageChange {
        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            String str2;
            if (mStorageEventData != null) {
                Object obj = mStorageEventData.obj;
                if (obj instanceof String) {
                    int i = mStorageEventData.eventId;
                    String str3 = "";
                    if ((i == 2 || i == 3 || i == 4) && (str2 = (String) obj) != null) {
                        str3 = str2;
                    }
                    if (C72996z1.m85846q5(str3)) {
                        ((C46021h) C86312j.m106911c(C46021h.class)).u80(str3);
                    }
                }
            }
        }
    }

    public C33310t() {
        ((C32415b) C86312j.m106911c(C32415b.class)).yx0().add(new C33311a());
    }

    /* renamed from: A */
    public void mo57712A(C72976h2 h2Var, C30783v3 v3Var) {
        if (h2Var != null) {
            String username = h2Var.getUsername();
            if (C72996z1.m85846q5(username)) {
                Log.m105925i("MicroMsg.OpenIMKefuConversationExtension", "alvinluo onMsgChangeNotify conversation is openim kefu username: %s", username);
                h2Var.mo108807c3("opencustomerservicemsg");
                ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69773k0(h2Var, username);
                ((C46021h) C86312j.m106911c(C46021h.class)).Dd0(h2Var);
            } else if (C72996z1.m85845p5(username)) {
                Log.m105924i("MicroMsg.OpenIMKefuConversationExtension", "openImKeService is created");
            }
        }
    }
}
