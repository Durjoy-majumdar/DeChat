package gx0;

import android.os.Message;
import com.tencent.p014mm.plugin.brandservice.p028ui.EnterpriseBizContactListUI;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import eb0.C45628s0;
import java.util.ArrayList;
import java.util.List;
import p227rn.C48053v;
import rb0.C47961a;
import rb0.C47984k;
import rb0.C48009v0;

/* renamed from: gx0.h */
public class C45967h extends MMHandler {

    /* renamed from: a */
    public final /* synthetic */ EnterpriseBizContactListUI f123978a;

    public C45967h(EnterpriseBizContactListUI enterpriseBizContactListUI) {
        this.f123978a = enterpriseBizContactListUI;
    }

    public void handleMessage(Message message) {
        EnterpriseBizContactListUI enterpriseBizContactListUI;
        if (message != null && message.what == 1 && (enterpriseBizContactListUI = this.f123978a) != null && !enterpriseBizContactListUI.isFinishing()) {
            C48009v0.wx0().mo72736c(this.f123978a.f109078e, (C47961a.C12965b) null);
            List<String> mI = C48009v0.Fx0().mo72767mI(this.f123978a.f109078e);
            int i = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) mI;
                if (i < arrayList.size()) {
                    String str = (String) arrayList.get(i);
                    if (C45628s0.m50740E(str) && (C47984k.m53339m(str) || ((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(str))) {
                        C48009v0.wx0().mo72736c(str, (C47961a.C12965b) null);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
