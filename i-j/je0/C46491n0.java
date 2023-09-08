package je0;

import android.database.Cursor;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68102u;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86301e;
import di3.C86312j;
import eb0.C75604z3;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32226l;
import ge0.C32415b;
import gy3.C87412m;
import gy3.C87413o;
import he0.C32867g;
import he0.C46020f;
import he0.C46021h;
import he0.C46026p;
import he0.C46027q;
import he0.C46028r;
import ie0.C46220j;
import ie0.C46222l;
import ie0.C46223m;
import ie0.C46225p;
import ie0.C46226q;
import ie0.C46229w;
import ie0.C46232y;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import p749xh.C53354z6;
import pc0.C100760a0;
import q90.C101062d;
import rx3.C13598b0;
import ve0.C14440b;
import z04.C112550d0;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: je0.n0 */
public final class C46491n0 extends C86301e implements C46021h {

    /* renamed from: je0.n0$b */
    public static final class C33545b extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f90819d;

        /* renamed from: e */
        public final /* synthetic */ C46491n0 f90820e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33545b(String str, C46491n0 n0Var) {
            super(1);
            this.f90819d = str;
            this.f90820e = n0Var;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            if (str == null || str.length() == 0) {
                Log.m105920e("MicroMsg.OpenIMKefuService", "alvinluo sendOpenImKfCard getShareCardContent failed");
            } else {
                List<String> U = C112550d0.m153785U(this.f90819d, new String[]{","}, false, 0, 6, (Object) null);
                C46491n0 n0Var = this.f90820e;
                for (String vx02 : U) {
                    n0Var.vx0(vx02, str);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: je0.n0$a */
    public static final class C46492a implements C46021h.C46022a {

        /* renamed from: a */
        public final /* synthetic */ C46026p f125255a;

        /* renamed from: b */
        public final /* synthetic */ C46021h.C46022a f125256b;

        public C46492a(C46026p pVar, C46021h.C46022a aVar) {
            this.f125255a = pVar;
            this.f125256b = aVar;
        }

        /* renamed from: a */
        public void mo33215a(C46027q qVar) {
            String str = null;
            C46020f fVar = qVar != null ? qVar.f124111d : null;
            Object[] objArr = new Object[3];
            C46026p pVar = this.f125255a;
            objArr[0] = pVar.f124103c;
            objArr[1] = pVar.f124102b;
            if (fVar != null) {
                str = fVar.mo71441O1();
            }
            objArr[2] = str;
            Log.m105925i("MicroMsg.OpenIMKefuService", "alvinluo fetchContact username: %s, url: %s, contact: %s", objArr);
            C46021h.C46022a aVar = this.f125256b;
            if (aVar != null) {
                aVar.mo33215a(qVar);
            }
        }

        /* renamed from: b */
        public void mo33216b(String str) {
            Log.m105925i("MicroMsg.OpenIMKefuService", "alvinluo fetchContact onTryFetch: %s", str);
            C46021h.C46022a aVar = this.f125256b;
            if (aVar != null) {
                aVar.mo33216b(str);
            }
        }
    }

    public boolean C20(C72996z1 z1Var) {
        if (z1Var == null) {
            return false;
        }
        C46225p pVar = C46225p.f124603a;
        return Util.nowSecond() - ((long) z1Var.f149509Q0) > C14440b.f40054a;
    }

    public void Cn0(C46028r rVar) {
        C87412m.m108594g(rVar, "request");
        C46232y yVar = C46232y.f124619d;
        rVar.f124115b = 1;
        C46232y.f124619d.mo71646e(rVar);
    }

    public void Dd0(C72976h2 h2Var) {
        Class cls = C75700k0.class;
        C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j("opencustomerservicemsg");
        if (j == null) {
            Log.m105924i("MicroMsg.OpenIMKefuConversationLogic", "create openim kefu service conversation");
            C72976h2 h2Var2 = new C72976h2("opencustomerservicemsg");
            h2Var2.mo101162m3();
            C46229w.f124612a.mo71640c(h2Var, h2Var2);
            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69751W(h2Var2);
            return;
        }
        Log.m105924i("MicroMsg.OpenIMKefuConversationLogic", "openim kefu service conversation has created");
        j.mo108807c3((String) null);
        C46229w.f124612a.mo71640c(h2Var, j);
        ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69773k0(j, "opencustomerservicemsg");
    }

    /* renamed from: Ju */
    public void mo71452Ju(C46026p pVar, C46021h.C46022a aVar) {
        C46232y.m51535a(pVar, aVar);
    }

    /* renamed from: N3 */
    public void mo71453N3(String str) {
        if (!(str == null || str.length() == 0) && C72996z1.m85846q5(str)) {
            C46232y yVar = C46232y.f124619d;
            C46220j b = C46225p.m51524b(str);
            Object[] objArr = new Object[2];
            objArr[0] = str;
            Long l = null;
            objArr[1] = b != null ? b.field_username : null;
            Log.m105919d("MicroMsg.OpenIMKefuService", "alvinluo unSetMute username: %s, ct.username: %s", objArr);
            if (!(b == null || b.f124591Z == 0)) {
                String str2 = b.field_username;
                if (!(str2 == null || str2.length() == 0)) {
                    b.field_type &= -513;
                    C46225p.m51525c(b);
                    ((C32867g) C86312j.m106911c(C32867g.class)).mo58839N3(str);
                    return;
                }
            }
            Object[] objArr2 = new Object[2];
            objArr2[0] = str;
            if (b != null) {
                l = Long.valueOf(b.f124591Z);
            }
            objArr2[1] = l;
            Log.m105921e("MicroMsg.OpenIMKefuService", "alvinluo unSetMute contact invalid username: %s, contactId: %s", objArr2);
        }
    }

    public void R40(C46026p pVar, C46021h.C46022a aVar) {
        if (pVar != null) {
            C46232y.m51536b(pVar, new C46492a(pVar, aVar));
        }
    }

    /* renamed from: Rm */
    public C46223m mo71455Rm(String str) {
        return C46225p.m51523a(str);
    }

    /* renamed from: Sq */
    public boolean mo71456Sq(String str, String str2) {
        boolean z = true;
        Log.m105925i("MicroMsg.OpenIMKefuService", "alvinluo sendOpenImkfCard toUsername: %s, cardSendingUsername: %s", str, str2);
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                z = false;
            }
            if (!z) {
                C33545b bVar = new C33545b(str, this);
                C87412m.m108594g(str2, "toSendUsername");
                C46026p pVar = new C46026p(0, str2, (String) null);
                pVar.f124104d = false;
                PBool pBool = new PBool();
                ((C46021h) C86312j.m106911c(C46021h.class)).mo71452Ju(pVar, new C46222l(pBool, bVar, "<msg bigheadimgurl=\"%s\" smallheadimgurl=\"%s\" username=\"%s\" nickname=\"%s\" openimappid=\"%s\" openimdesc=\"%s\" openimdescicon=\"%s\"/>", str2));
                return pBool.value;
            }
        }
        return false;
    }

    public void Ss0(String str, C46021h.C46022a aVar) {
        C46026p pVar = new C46026p(0, str, (String) null);
        pVar.f124104d = true;
        C46232y.m51535a(pVar, aVar);
    }

    /* renamed from: T3 */
    public void mo71458T3(String str) {
        if (!(str == null || str.length() == 0) && C72996z1.m85846q5(str)) {
            C46232y yVar = C46232y.f124619d;
            C46220j b = C46225p.m51524b(str);
            Object[] objArr = new Object[2];
            objArr[0] = str;
            Long l = null;
            objArr[1] = b != null ? b.field_username : null;
            Log.m105919d("MicroMsg.OpenIMKefuService", "alvinluo setMute username: %s, ct.username: %s", objArr);
            if (!(b == null || b.f124591Z == 0)) {
                String str2 = b.field_username;
                if (!(str2 == null || str2.length() == 0)) {
                    b.field_type |= 512;
                    C46225p.m51525c(b);
                    ((C32867g) C86312j.m106911c(C32867g.class)).mo58840T3(str);
                    return;
                }
            }
            Object[] objArr2 = new Object[2];
            objArr2[0] = str;
            if (b != null) {
                l = Long.valueOf(b.f124591Z);
            }
            objArr2[1] = l;
            Log.m105921e("MicroMsg.OpenIMKefuService", "alvinluo setMute contact invalid username: %s, contactId: %s", objArr2);
        }
    }

    /* renamed from: at */
    public void mo71459at() {
        C46232y yVar = C46232y.f124619d;
        C86709a0.m107524d().mo123455a(4010, yVar);
        C86709a0.m107524d().mo123455a(6849, yVar);
        C86709a0.m107524d().mo123455a(5997, yVar);
    }

    /* renamed from: au */
    public C53354z6 mo71460au(String str) {
        C46232y yVar = C46232y.f124619d;
        return C46225p.m51524b(str);
    }

    /* renamed from: gx */
    public void mo71461gx(String str, C46021h.C46023b bVar) {
        C46232y yVar = C46232y.f124619d;
        Log.m105924i("MicroMsg.OpenIMKefuGetContactService", "alvinluo closeContact username: " + str);
        if (str == null) {
            str = "";
        }
        C46028r rVar = new C46028r(str);
        rVar.f124115b = 2;
        rVar.f124117d = bVar;
        C46232y.f124619d.mo71646e(rVar);
    }

    /* renamed from: l */
    public void mo71462l() {
        C46232y yVar = C46232y.f124619d;
        C86709a0.m107524d().mo123470p(4010, yVar);
        C86709a0.m107524d().mo123470p(6849, yVar);
        C86709a0.m107524d().mo123470p(5997, yVar);
    }

    /* renamed from: s */
    public boolean mo71463s() {
        Cursor I = ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69738I(6, new ArrayList(), "opencustomerservicemsg", 1);
        return I != null && I.getCount() > 0;
    }

    public void t40() {
        C46225p pVar = C46225p.f124603a;
        C46226q yx02 = ((C32415b) C86312j.m106911c(C32415b.class)).yx0();
        if (yx02 != null) {
            yx02.f124609d.delete("OpenIMKefuContact", "", new String[0]);
        }
        ((C101062d) C46225p.f124605c.f124592a).clear();
        ((C101062d) C46225p.f124606d).clear();
    }

    public void u80(String str) {
        boolean z;
        if (str == null) {
            str = "";
        }
        Class cls = C75700k0.class;
        C46229w wVar = C46229w.f124612a;
        C72976h2 d = wVar.mo71641d();
        if (d != null) {
            if (!str.equals(d.getUsername())) {
                Log.m105925i("MicroMsg.OpenIMKefuConversationLogic", "alvinluo updateOpenImKfServiceConversation %s not the last conversation and ignore", str);
                return;
            }
            C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j("opencustomerservicemsg");
            C72963f4 Ex0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Ex0(d.getUsername());
            if (Ex0 != null) {
                if (Ex0.getMsgId() > 0) {
                    z = true;
                    if (z && j != null) {
                        Log.m105925i("MicroMsg.OpenIMKefuConversationLogic", "alvinluo updateOpenImKfServiceConversation username: %s, lastMsg talker: %s", str, Ex0.mo108768t());
                        String username = j.getUsername();
                        C87412m.m108593f(username, "parentConv.username");
                        wVar.mo71639b(username, Ex0, j);
                        ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69773k0(j, "opencustomerservicemsg");
                        return;
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
    }

    public void vx0(String str, String str2) {
        if (str2 != null) {
            String decode = URLDecoder.decode(str2, "UTF-8");
            C100760a0.C100764f a = C100760a0.m131931a(str);
            a.f295187a = str;
            a.f295189c = decode;
            a.f295190d = 67;
            a.f295191e = 1;
            a.f295194h = 5;
            a.mo140195a().mo123694a();
        }
    }

    /* renamed from: xy */
    public void mo71466xy(String str, boolean z) {
        Log.m105925i("MicroMsg.OpenIMKefuService", "alvinluo testNameCard %s", str);
        if (!(str == null || str.length() == 0)) {
            C72963f4 f4Var = new C72963f4();
            f4Var.mo108749c3(str);
            f4Var.mo108740T2(z ^ true ? 1 : 0);
            f4Var.mo100991d(z ? 3 : 2);
            f4Var.setType(67);
            f4Var.mo108733M2(C75604z3.m90844p());
            f4Var.mo108732L2("<msg" + " username=" + "\"25984993900277866@kefu.openim\"" + " nickname=" + "\"测试用客服\"" + " sex=" + "\"1\"" + " bigheadimgurl=" + "\"https://wwcdn.weixin.qq.com/node/wework/images/avatar4.c4b5b964d6.png\"" + " smallheadimgurl=" + "\"https://wwcdn.weixin.qq.com/node/wework/images/avatar4.c4b5b964d6.png\"" + " openimappid=" + "\"3552365301\"" + " openimdesc=" + "\"腾讯\"" + " openimdescicon=" + "\"https://wwcdn.weixin.qq.com/node/wework/images/uncert21.png\"" + " ticket=" + "\"test_ticket\"" + " />");
            Log.m105925i("MicroMsg.OpenIMKefuService", "alvinluo testNameCard xml: %s", f4Var.getContent());
            if (z) {
                C75604z3.m90852x(f4Var);
            } else {
                vx0(str, f4Var.getContent());
            }
            C68097n nVar = new C68097n();
            nVar.f195728a = "25984993900277866@kefu.openim";
            nVar.f195729b = 3;
            nVar.f195733f = 1;
            nVar.f195732e = "https://wwcdn.weixin.qq.com/node/wework/images/avatar4.c4b5b964d6.png";
            nVar.f195731d = "https://wwcdn.weixin.qq.com/node/wework/images/avatar4.c4b5b964d6.png";
            nVar.f195736i = -1;
            C68102u.zx0().mo93608Yt(nVar);
        }
    }
}
