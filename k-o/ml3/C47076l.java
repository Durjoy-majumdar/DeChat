package ml3;

import android.content.DialogInterface;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.conversation.BaseConversationUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C45618p;
import eb0.C45628s0;
import eb0.C75604z3;
import eb0.C97625j3;
import g62.C32330n;
import ml3.C47077m;
import nj3.C11184p0;
import nj3.C76879j;
import p154fy.C87121j;
import p248ug.C65347o0;
import rb0.C48009v0;
import tc0.C77885p;
import te3.C50904q20;
import te3.C51163rv3;

/* renamed from: ml3.l */
public class C47076l implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C47077m.C47078a f126510d;

    public C47076l(C47077m.C47078a aVar) {
        this.f126510d = aVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f(this.f126510d.f126518f);
        } else if (itemId == 1) {
            C47077m.C47078a aVar = this.f126510d;
            C47077m mVar = C47077m.this;
            String str = aVar.f126518f;
            mVar.getClass();
            if (Util.isNullOrNil(str)) {
                Log.m105920e("EnterpriseConversationPresenter", "Delete Conversation and messages fail because username is null or nil.");
                return;
            }
            C72963f4 Rx0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Rx0(str);
            C50904q20 q202 = new C50904q20();
            C51163rv3 rv32 = new C51163rv3();
            rv32.f141175d = Util.nullAsNil(str);
            rv32.f141176e = true;
            q202.f140097d = rv32;
            q202.f140099f = Rx0.mo108774y2();
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C32330n(8, q202));
            mVar.f126514g = false;
            BaseConversationUI baseConversationUI = mVar.f126511d;
            C75604z3.m90836h(str, new C47075k(mVar, C76879j.m92723Q(baseConversationUI, baseConversationUI.getString(C0966R.string.a3h), mVar.f126511d.getString(C0966R.string.a4d), true, true, new C47074j(mVar))));
            ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot(str, 15);
            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f(str);
            C97625j3.m125812b().mo105898m().mo69633b(C48009v0.Fx0().mo72757SE(str).field_enterpriseFather);
            ((C65347o0) C86312j.m106911c(C65347o0.class)).mo89078iG(str);
        } else if (itemId == 2) {
            C47077m.C47078a aVar2 = this.f126510d;
            C47077m mVar2 = C47077m.this;
            String str2 = aVar2.f126518f;
            BaseConversationUI baseConversationUI2 = mVar2.f126511d;
            C76879j.m92707A(baseConversationUI2, baseConversationUI2.getString(C0966R.string.cay), "", baseConversationUI2.getString(C0966R.string.cax), baseConversationUI2.getString(C0966R.string.f7926wf), new C47072i(mVar2, str2, baseConversationUI2), (DialogInterface.OnClickListener) null);
        } else if (itemId == 3) {
            C47077m.C47078a aVar3 = this.f126510d;
            C47077m mVar3 = C47077m.this;
            String str3 = aVar3.f126518f;
            mVar3.getClass();
            if (C97625j3.m125812b().mo105907v().get(str3) == null) {
                Log.m105920e("EnterpriseConversationPresenter", "changed biz stick status failed, contact is null, talker = " + str3);
            } else if (((C44660i2) C97625j3.m125812b().mo105908w()).mo69755a0(str3)) {
                C45628s0.m50803u0(str3, true);
            } else {
                C45618p.m50718b(str3, true);
            }
        }
    }
}
