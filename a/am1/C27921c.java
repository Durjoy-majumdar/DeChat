package am1;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C46111l4;
import o40.C11348f;
import pe3.C89349b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sf0.C48374j0;
import te3.C51393tg1;
import te3.C51771w2;
import ty0.C37302c;
import ue1.C37429f0;
import up1.C52599l0;

/* renamed from: am1.c */
public class C27921c extends C37302c<C37429f0> {

    /* renamed from: h */
    public int f77119h;

    /* renamed from: i */
    public final C13601g f77120i = C36568h.m40985a(C27922a.f77121d);

    /* renamed from: am1.c$a */
    public static final class C27922a extends C87413o implements C32224a<C52599l0> {

        /* renamed from: d */
        public static final C27922a f77121d = new C27922a();

        public C27922a() {
            super(0);
        }

        public Object invoke() {
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76736Au();
        }
    }

    /* renamed from: am1.c$b */
    public static final class C27923b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ Exception f77122d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27923b(Exception exc) {
            super(0);
            this.f77122d = exc;
        }

        public Object invoke() {
            String message = this.f77122d.getMessage();
            return message == null ? "" : message;
        }
    }

    public C27921c(int i) {
        this.f77119h = i;
    }

    /* renamed from: D */
    public int mo55695D() {
        return this.f77119h;
    }

    /* renamed from: H0 */
    public void mo55696H0(Object obj, String str) {
        C37429f0 f0Var = (C37429f0) obj;
        C87412m.m108594g(f0Var, "session");
        C87412m.m108594g(str, "sessionId");
        String str2 = f0Var.field_talker;
        C87412m.m108593f(str2, "session.field_talker");
        int i = f0Var.field_type;
        int i2 = f0Var.field_actionPermission;
        C46111l4.C33059a aVar = C46111l4.C33059a.RECEIVE;
        int i3 = f0Var.field_rejectMsg;
        int i4 = f0Var.field_disableSendMsg;
        String str3 = f0Var.field_senderUserName;
        C87412m.m108593f(str3, "session.field_senderUserName");
        ((C52599l0) ((C36570n) this.f77120i).getValue()).mo73558Yt(str, str2, i, i2, aVar, i3, i4, str3, f0Var.field_followFlag);
    }

    /* renamed from: N0 */
    public boolean mo55697N0(Object obj, C51771w2 w2Var) {
        int i;
        C51771w2 w2Var2 = w2Var;
        C37429f0 f0Var = (C37429f0) obj;
        C87412m.m108594g(f0Var, "localSessionInfo");
        C87412m.m108594g(w2Var2, "rawBypMsg");
        String str = w2Var2.f143819e;
        C51393tg1 tg12 = new C51393tg1();
        C89349b bVar = w2Var2.f143821g;
        if ((bVar != null ? tg12.parseFrom(bVar.mo123703f()) : null) == null) {
            String str2 = this.f98672f;
            Log.m105920e(str2, "extInfo is null! fromUser=" + w2Var2.f143818d.f227628e + " toUser=" + w2Var2.f143818d.f227629f + " sessionId=" + w2Var2.f143819e);
        }
        String str3 = f0Var.field_senderUserName;
        boolean z = str3 == null || str3.length() == 0;
        boolean z2 = f0Var.systemRowid > 0;
        boolean z3 = (tg12.f142212e & 1) > 0;
        int i2 = f0Var.field_rejectMsg;
        String j0 = mo55701j0(w2Var2);
        String n0 = mo61033n0(w2Var2);
        if (C72996z1.m85821V4(j0)) {
            i = 3;
        } else if ((tg12.f142212e & 2) > 0) {
            i = 2;
        } else if (!z2) {
            i = 1;
        } else {
            String str4 = this.f98672f;
            Log.m105920e(str4, "this sessionId[" + str + "] has exist, but it will be move to hi holder. just return");
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(20492, 4L, 1L, str);
            nVar.mo175913w(1473, 4, 1);
            i = f0Var.field_type;
        }
        int i3 = (tg12.f142212e & 4) > 0 ? 1 : 0;
        if (C72996z1.m85823W4(n0) || C72996z1.m85817T4(n0)) {
            boolean z4 = (f0Var.field_type == i && z3 == f0Var.field_actionPermission && i3 == f0Var.field_disableSendMsg && C87412m.m108589b(n0, f0Var.field_talker) && !z) ? false : true;
            f0Var.field_type = i;
            f0Var.field_actionPermission = z3 ? 1 : 0;
            f0Var.field_disableSendMsg = i3;
            f0Var.field_talker = n0;
            f0Var.field_rejectMsg = i2;
            f0Var.field_senderUserName = j0;
            String str5 = this.f98672f;
            Log.m105924i(str5, "[beforeProcessAddMsg] isNeedReplaceSession=" + z4 + " svrMsgId=" + w2Var2.f143818d.f227638r + " isSender=" + w2Var2 + ".isSender msgType=" + w2Var2.f143818d.f227630g + " createTime=" + w2Var2.f143818d.f227635o + " isExitSessionInfo=" + z2 + " isSupportSendMedia=" + z3 + " convType=" + i + " fromUser=" + w2Var2.f143818d.f227628e + " toUser=" + w2Var2.f143818d.f227629f + " sessionId=" + w2Var2.f143819e + " actionPermission=" + z3 + " extInfo=" + tg12.f142212e + " myUserName:" + j0 + " isSenderUserNameEmpty:" + z + ", followFlag:" + f0Var.field_followFlag);
            return z4;
        }
        String str6 = this.f98672f;
        Log.m105920e(str6, "[beforeProcessAddMsg] talker[" + n0 + "] is invalid.");
        C115669n nVar2 = C115669n.INSTANCE;
        nVar2.mo160131h(20492, 3L, 1L, n0);
        nVar2.mo175913w(1473, 3, 1);
        return false;
    }

    /* renamed from: O */
    public int mo55698O() {
        return 4;
    }

    /* renamed from: f0 */
    public boolean mo55699f0(Exception exc) {
        C87412m.m108594g(exc, "e");
        C11348f.C11349a.m11178b(C59319a.f169618b, this.f98672f, false, (C11348f.C11352b) null, false, false, new C27923b(exc), 28, (Object) null);
        return false;
    }

    /* renamed from: g0 */
    public Object mo55700g0(String str) {
        C87412m.m108594g(str, "sessionId");
        return ((C52599l0) ((C36570n) this.f77120i).getValue()).mo71553G2(str);
    }

    /* renamed from: j0 */
    public String mo55701j0(C51771w2 w2Var) {
        C87412m.m108594g(w2Var, "rawBypMsg");
        String g = C48374j0.m53718g(w2Var.f143818d.f227628e);
        String g2 = C48374j0.m53718g(w2Var.f143818d.f227629f);
        if (!w2Var.f143822h) {
            g = g2;
        }
        if (C72996z1.m85823W4(g)) {
            String s = C75592q0.m90789s();
            C87412m.m108593f(s, "{\n            //该消息是发给我的…eFromUserInfo()\n        }");
            return s;
        }
        C87412m.m108593f(g, "{\n            //该消息是发给我的…     myUserName\n        }");
        return g;
    }
}
