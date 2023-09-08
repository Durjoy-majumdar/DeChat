package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.openim.api.OpenIMKefuStartConversationRequest;
import com.tencent.p014mm.openim.model.OpenImKefuStartChattingResultReceiver;
import com.tencent.p014mm.p136ui.chatting.C73673d4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C97625j3;
import gy3.C87412m;
import he0.C46025n;
import he0.C59837i;
import he0.C76158j;
import p270xi.C91212b;
import tc0.C48629h;
import tc0.C77885p;
import te3.C51195s3;
import zj3.C79370m0;
import zt3.C119157j;
import zt3.C119179t;

@C91212b(exportInterface = C79370m0.class)
/* renamed from: com.tencent.mm.ui.chatting.component.u3 */
public final class C44844u3 extends C73412a implements C79370m0 {

    /* renamed from: com.tencent.mm.ui.chatting.component.u3$a */
    public static final class C44845a implements OpenImKefuStartChattingResultReceiver.C40388a {

        /* renamed from: a */
        public final /* synthetic */ C44844u3 f121678a;

        public C44845a(C44844u3 u3Var) {
            this.f121678a = u3Var;
        }

        /* renamed from: a */
        public void mo63102a(Bundle bundle) {
            Integer valueOf = bundle != null ? Integer.valueOf(bundle.getInt("result_key_action")) : null;
            Log.m105925i("MicroMsg.OpenIMKefuComponent", "alvinluo startConversation result action: %s", valueOf);
            if (valueOf != null && valueOf.intValue() == 3) {
                this.f121678a.getClass();
                C119179t tVar = C119157j.f356862d;
                C44841t3 t3Var = C44841t3.f121675d;
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(t3Var, 100, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.u3$b */
    public static final class C44846b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C44844u3 f121679d;

        public C44846b(C44844u3 u3Var) {
            this.f121679d = u3Var;
        }

        public final void run() {
            this.f121679d.f215752d.f193286j.getController().mo177047G0();
        }
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        C119179t tVar = C119157j.f356862d;
        C44846b bVar = new C44846b(this);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(bVar, 200, false);
    }

    /* renamed from: e */
    public void mo70065e() {
        Log.m105926v("MicroMsg.OpenIMKefuComponent", "alvinluo kefu onChattingInit");
    }

    /* renamed from: f2 */
    public void mo70140f2(String str, Bundle bundle) {
        String str2;
        String string;
        OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = new OpenIMKefuStartConversationRequest();
        C67391b bVar = this.f215752d;
        openIMKefuStartConversationRequest.f108515d = bVar != null ? bVar.mo91565f() : null;
        openIMKefuStartConversationRequest.f108517f = 2;
        openIMKefuStartConversationRequest.f108519h = C46025n.m51344a(2);
        openIMKefuStartConversationRequest.f108527s = true;
        openIMKefuStartConversationRequest.f108524p = true;
        openIMKefuStartConversationRequest.f108522n = true;
        Context context = openIMKefuStartConversationRequest.f108515d;
        String str3 = "";
        if (context == null || (str2 = context.getString(C0966R.string.hfd)) == null) {
            str2 = str3;
        }
        openIMKefuStartConversationRequest.f108523o = str2;
        C51195s3 s3Var = new C51195s3();
        if (!(bundle == null || (string = bundle.getString("kefu_card_ticket", str3)) == null)) {
            str3 = string;
        }
        s3Var.f141287f = str3;
        s3Var.f141289h = str;
        openIMKefuStartConversationRequest.f108520i = s3Var;
        openIMKefuStartConversationRequest.f108516e = System.currentTimeMillis();
        Intent intent = new Intent();
        Handler createFreeHandler = MMHandler.createFreeHandler(Looper.getMainLooper());
        C87412m.m108593f(createFreeHandler, "createFreeHandler(Looper.getMainLooper())");
        intent.putExtra("key_result_receiver", new OpenImKefuStartChattingResultReceiver(createFreeHandler, new C44845a(this)));
        openIMKefuStartConversationRequest.f108528t = intent;
        C59837i iVar = (C59837i) C86312j.m106911c(C59837i.class);
        if (iVar != null) {
            iVar.mo71855jT(openIMKefuStartConversationRequest);
        }
    }

    /* renamed from: g */
    public boolean mo70141g(C72963f4 f4Var) {
        if (!(f4Var != null && f4Var.mo100981T3())) {
            return false;
        }
        if (!C87412m.m108589b(this.f215752d.mo91577r(), "medianote")) {
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C48629h(f4Var.mo108768t(), f4Var.mo108774y2()));
        }
        C73673d4.m87248b(f4Var);
        this.f215752d.mo91541B(true);
        return true;
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
    }

    /* renamed from: u2 */
    public void mo70142u2(C67391b bVar) {
        C72996z1 o;
        super.mo70142u2(bVar);
        if (C72996z1.m85846q5(this.f215752d.mo91577r()) && (o = this.f215752d.mo91574o()) != null) {
            ((C76158j) C86312j.m106911c(C76158j.class)).Mg0(o.mo73980x2(), o.mo73976t2(), 1);
        }
    }
}
