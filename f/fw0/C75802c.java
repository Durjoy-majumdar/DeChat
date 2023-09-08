package fw0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.LbsSayHiEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72956b4;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C31519v2;
import eb0.C75597w2;
import eb0.C75604z3;
import eb0.C97625j3;
import eb0.z3$$h;
import f62.C75712z;
import fd0.C75743h;
import ob0.C35136m;
import sf0.C48374j0;
import te3.C77949j3;

/* renamed from: fw0.c */
public class C75802c implements C75712z {

    /* renamed from: fw0.c$a */
    public class C75803a implements C75597w2.C31525a {

        /* renamed from: a */
        public final /* synthetic */ String f222418a;

        /* renamed from: b */
        public final /* synthetic */ C77949j3 f222419b;

        /* renamed from: c */
        public final /* synthetic */ z3$$h f222420c;

        public C75803a(String str, C77949j3 j3Var, z3$$h z3__h) {
            this.f222418a = str;
            this.f222419b = j3Var;
            this.f222420c = z3__h;
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            C75802c.this.mo106101a(this.f222419b, this.f222420c, C97625j3.m125812b().mo105907v().get(this.f222418a));
        }
    }

    /* renamed from: C4 */
    public void mo105912C4(C35136m.C35137a aVar, C72963f4 f4Var, String str, String str2, boolean z) {
    }

    /* renamed from: a */
    public final void mo106101a(C77949j3 j3Var, z3$$h z3__h, C72996z1 z1Var) {
        String g = C48374j0.m53718g(j3Var.f227628e);
        C97625j3.m125812b().mo105906u().mo119676J(73729, 1);
        String nickname = z1Var.getNickname();
        C72956b4 b4Var = new C72956b4();
        b4Var.field_content = C48374j0.m53718g(j3Var.f227631h);
        b4Var.field_createtime = Util.nowSecond();
        b4Var.field_imgpath = "";
        int i = 3;
        b4Var.field_sayhicontent = j3Var.f227630g == 3 ? MMApplicationContext.getContext().getString(C0966R.string.h6y) : C48374j0.m53718g(j3Var.f227631h);
        b4Var.field_sayhiuser = g;
        b4Var.field_scene = 18;
        int i2 = j3Var.f227632i;
        if (i2 > 3) {
            i = i2;
        }
        b4Var.field_status = i;
        b4Var.field_svrid = j3Var.f227638r;
        b4Var.field_talker = nickname;
        b4Var.field_type = j3Var.f227630g;
        b4Var.field_isSend = 0;
        b4Var.field_sayhiencryptuser = g;
        b4Var.field_ticket = z3__h.f222103j;
        C75743h.xx0().insert(b4Var);
        LbsSayHiEvent lbsSayHiEvent = new LbsSayHiEvent();
        lbsSayHiEvent.f193718d.f193719a = g;
        lbsSayHiEvent.publish();
    }

    /* renamed from: u4 */
    public void mo105913u4(C35136m.C35137a aVar, C72963f4 f4Var, String str, String str2, boolean z) {
        C77949j3 j3Var = aVar.f94242a;
        z3$$h w = C75604z3.m90851w(j3Var.f227636p);
        if (w != null) {
            f4Var.mo108731K2(w.f222099f);
            f4Var.f230739W = w.f222100g;
            f4Var.f230755r = true;
            f4Var.mo108730J2(w.f222098e);
            Log.m105925i("MicroMsg.BaseMsgCallbackImpl", "bizClientMsgId = %s", w.f222098e);
            if (w.f222103j != null && w.f222104k == 1 && j3Var.f227630g != 10000) {
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
                if (z1Var == null || ((int) z1Var.f108320R1) <= 0) {
                    C31519v2.m39436a().mo55988e(str, (String) null, new C75803a(str, j3Var, w));
                } else {
                    mo106101a(j3Var, w, z1Var);
                }
            }
        }
    }
}
