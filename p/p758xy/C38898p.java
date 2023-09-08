package p758xy;

import b03.C39691c;
import com.tencent.p014mm.modelsimple.C68143w;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import di3.C86312j;
import f40.C31887k0;
import f40.C31896o0;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import lz2.C10699j;
import lz2.C46922e;
import o40.C61926c;
import ob0.C117747y;
import ob0.C35142u;
import ob0.C47350c;
import p773yy.C79168k;
import qy0.C36188b;
import qy2.C77448f0;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C90364q0;
import te3.C77984q62;
import te3.xo4;
import uz2.C52716t0;
import zh3.C91753f;

/* renamed from: xy.p */
public final class C38898p implements C31887k0.C31890c, C31896o0.C31897a, C35142u {

    /* renamed from: d */
    public boolean f104843d;

    /* renamed from: xy.p$a */
    public static final class C38899a implements C91753f.C66827b {

        /* renamed from: a */
        public static final C38899a f104844a = new C38899a();

        /* renamed from: a */
        public final String[] mo6410a() {
            String createSQLs = MAutoStorage.getCreateSQLs(C36188b.f96390T0, "textstatusmessage");
            C87412m.m108593f(createSQLs, "getCreateSQLs(BypMsgInfo.info, table)");
            return new String[]{createSQLs, "CREATE INDEX IF NOT EXISTS  textstatusmessageSvrIdIndex ON textstatusmessage ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  textstatusmessageTalkerIndex ON textstatusmessage ( talker )", "CREATE INDEX IF NOT EXISTS  textstatusmessageTalkerStatusIndex ON textstatusmessage ( talker,status )", "CREATE INDEX IF NOT EXISTS  textstatusmessageCreateTimeIndex ON textstatusmessage ( createTime )", "CREATE INDEX IF NOT EXISTS  textstatusmessageCreateTalkerTimeIndex ON textstatusmessage ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  textstatusmessageSendCreateTimeIndex ON textstatusmessage ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  textstatusmessageTalkerTypeIndex ON textstatusmessage ( talker,type )"};
        }
    }

    /* renamed from: xy.p$b */
    public static final class C38900b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C52716t0 f104845d;

        /* renamed from: e */
        public final /* synthetic */ C117747y f104846e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38900b(C52716t0 t0Var, C117747y yVar) {
            super(0);
            this.f104845d = t0Var;
            this.f104846e = yVar;
        }

        public Object invoke() {
            C39691c a = IStatusIconHelperKt.m39109a();
            if (!a.mo62307s(this.f104845d, (C46922e) this.f104846e)) {
                a.mo62306r(this.f104845d);
                a.mo62304p(this.f104845d);
                a.mo62305q(this.f104845d);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: Rg */
    public HashMap<Integer, C91753f.C66827b> mo9070Rg() {
        return C90364q0.m113146e(new C13604l(1719732168, C38899a.f104844a));
    }

    /* renamed from: aJ */
    public void mo58416aJ(int i) {
        if (i != BuildInfo.CLIENT_VERSION_INT) {
            SimpleDateFormat simpleDateFormat = C77448f0.f225876a;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_text_state_input_level, 1) == 1) {
                C86709a0.m107524d().mo123460f(new C10699j());
                this.f104843d = true;
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        xo4 xo4;
        C52716t0 t0Var;
        Log.m105924i("MicroMsg.TextStatusStaticCallbacks", "onSceneEnd: errType：" + i + " errCode:" + i2 + " errMsg:" + str + " scene:" + yVar);
        if (!(yVar instanceof C46922e)) {
            if (i == 0 && i2 == 0) {
                C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.modelsimple.NetSceneGetProfile");
                C114799u reqResp = ((C68143w) yVar).getReqResp();
                C87412m.m108592e(reqResp, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
                C77984q62 q622 = (C77984q62) ((C47350c) reqResp).f127056b.f127083a;
                if (!(q622 == null || (xo4 = q622.f228110e) == null)) {
                    String str2 = xo4.f228497Z;
                    String str3 = xo4.f228508p0;
                    Log.m105924i("MicroMsg.TextStatusStaticCallbacks", "statusID: " + str2 + ", extInfo: " + str3);
                    ((C79168k) C86312j.m106911c(C79168k.class)).Ru0(str2, str3, Boolean.TRUE);
                }
            }
            if (!this.f104843d) {
                SimpleDateFormat simpleDateFormat = C77448f0.f225876a;
                if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_text_state_input_level, 1) == 1) {
                    C86709a0.m107524d().mo123460f(new C10699j());
                }
            }
        } else if (i == 0 && i2 == 0 && (t0Var = ((C46922e) yVar).f126156g) != null) {
            C61926c.m72661F("TextStatusThread", new C38900b(t0Var, yVar));
        }
    }
}
