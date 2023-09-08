package eb0;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MMStack;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72954a0;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import junit.framework.Assert;
import p248ug.C52558c;
import rb0.C47966e0;
import rb0.C47984k;

/* renamed from: eb0.p */
public class C45618p {

    /* renamed from: eb0.p$a */
    public class C45619a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f123384d;

        /* renamed from: e */
        public final /* synthetic */ long f123385e;

        /* renamed from: f */
        public final /* synthetic */ z3$$g f123386f;

        /* renamed from: eb0.p$a$a */
        public class C45620a implements Runnable {
            public C45620a() {
            }

            public void run() {
                z3$$g z3__g = C45619a.this.f123386f;
                if (z3__g != null) {
                    z3__g.mo24604c();
                }
            }
        }

        public C45619a(String str, long j, z3$$g z3__g) {
            this.f123384d = str;
            this.f123385e = j;
            this.f123386f = z3__g;
        }

        public void run() {
            Class cls = C47966e0.class;
            C72954a0 Mm = ((C47966e0) C86312j.m106911c(cls)).mo72739Mm();
            String str = this.f123384d;
            Cursor query = Mm.mo100940c().query(Mm.mo100941e(str), (String[]) null, Mm.mo100928l(str, this.f123385e), (String[]) null, (String) null, (String) null, "createTime ASC ");
            if (query.moveToFirst()) {
                while (!query.isAfterLast() && ((r2 = this.f123386f) == null || !r2.mo24603b())) {
                    C72963f4 f4Var = new C72963f4();
                    f4Var.convertFrom(query);
                    C75604z3.m90833e(f4Var, true);
                    query.moveToNext();
                }
            }
            query.close();
            C72954a0 Mm2 = ((C47966e0) C86312j.m106911c(cls)).mo72739Mm();
            String str2 = this.f123384d;
            long j = this.f123385e;
            Mm2.getClass();
            Log.m105929w("MicroMsg.BizChatMessageStorage", "deleteByTalker :%s  stack:%s", str2, MMStack.getStack(true));
            ((C72972g4) Mm2.f212648a).mo101099Yt(Mm2.mo100941e(str2), Mm2.mo100928l(str2, j), (String[]) null);
            int delete = Mm2.mo100940c().delete(Mm2.mo100941e(str2), Mm2.mo100928l(str2, j), (String[]) null);
            if (delete != 0) {
                C75875l lVar = Mm2.f212648a;
                lVar.doNotify("delete_talker " + str2);
                C75875l.C45886e eVar = new C75875l.C45886e(str2, "delete", (C72963f4) null, 0, delete);
                eVar.f123850g = -1;
                ((C72972g4) Mm2.f212648a).mo101123jo(eVar);
            }
            MMHandlerThread.postToMainThread(new C45620a());
        }

        public String toString() {
            return super.toString() + "|deleteMsgByTalker";
        }
    }

    /* renamed from: a */
    public static int m50717a(String str, long j, z3$$g z3__g) {
        Log.m105919d("MicroMsg.BizConversationLogic", "deleteMsgByBizChatId %s", Long.valueOf(j));
        C86709a0.m107525e().postToWorker(new C45619a(str, j, z3__g));
        return 0;
    }

    /* renamed from: b */
    public static void m50718b(String str, boolean z) {
        Class cls = C75700k0.class;
        Assert.assertTrue(!Util.isNullOrNil(str));
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str);
        if (z1Var != null && !Util.isNullOrNil(z1Var.getUsername())) {
            z1Var.setType(z1Var.getType() | 2048);
            C45628s0.m50760Y(z1Var);
            if (z) {
                if (((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j(str) == null && z1Var.mo62916m3()) {
                    if (C47984k.m53341o(str)) {
                        if (((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j("officialaccounts") == null) {
                            C72976h2 h2Var = new C72976h2("officialaccounts");
                            h2Var.mo101162m3();
                            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69751W(h2Var);
                        }
                        C72976h2 h2Var2 = new C72976h2(str);
                        h2Var2.mo108793N2(System.currentTimeMillis());
                        h2Var2.mo108807c3("officialaccounts");
                        ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69751W(h2Var2);
                    } else if (C47984k.m53335i(str)) {
                        C52558c b = C47984k.m53328b(str);
                        if (((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j(b.field_enterpriseFather) == null) {
                            C72976h2 h2Var3 = new C72976h2(b.field_enterpriseFather);
                            h2Var3.mo101162m3();
                            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69751W(h2Var3);
                        }
                        C72976h2 h2Var4 = new C72976h2(str);
                        h2Var4.mo108793N2(System.currentTimeMillis());
                        h2Var4.mo108807c3(b.mo73498p2());
                        ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69751W(h2Var4);
                    }
                    Log.m105924i("MicroMsg.BizConversationLogic", "setPlacedTop username = " + str);
                }
                ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69766g0(str);
            }
        }
    }
}
