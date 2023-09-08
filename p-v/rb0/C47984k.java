package rb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMStack;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72954a0;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31450b4;
import eb0.z3$$g;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import g62.C75875l;
import java.util.ArrayList;
import java.util.List;
import p248ug.C52558c;
import sb0.C48340e;
import tc0.C77885p;
import te3.C48926by2;

/* renamed from: rb0.k */
public final class C47984k {
    /* renamed from: a */
    public static void m53327a(String str) {
        Class cls = C75700k0.class;
        String TE = C48009v0.Fx0().mo72758TE(str);
        int i = 0;
        if (TE != null) {
            C72954a0 Mm = ((C47966e0) C86312j.m106911c(C47966e0.class)).mo72739Mm();
            Mm.getClass();
            Log.m105929w("MicroMsg.BizChatMessageStorage", "not attention  deleteEnterpriseMsgByTalker :%s  stack:%s", TE, MMStack.getStack(true));
            String str2 = "talker= '" + TE + "'";
            ((C72972g4) Mm.f212648a).mo101099Yt(Mm.mo100941e(TE), str2, (String[]) null);
            int delete = Mm.mo100940c().delete(Mm.mo100941e(TE), str2, (String[]) null);
            if (delete != 0) {
                Mm.f212648a.doNotify("delete_talker " + TE);
                C75875l.C45886e eVar = new C75875l.C45886e(TE, "delete", (C72963f4) null, 0, delete);
                eVar.f123850g = -1;
                ((C72972g4) Mm.f212648a).mo101123jo(eVar);
            }
        }
        ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69763f(str);
        C52558c b = m53328b(str);
        if (b == null) {
            C48009v0.Ex0().mo72748c(str);
            return;
        }
        if (b.mo72811g1()) {
            C44660i2 i2Var = (C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
            int delete2 = i2Var.f121077c.delete(i2Var.mo69748T(str), "username=? or parentRef =?", new String[]{str, str});
            Log.m105919d("MicroMsg.ConversationStorage", "delEnterpriseFatherAndChildConv %s %d", str, Integer.valueOf(delete2));
            if (delete2 != 0) {
                i2Var.doNotify(5, i2Var, str);
            }
            List<String> mI = C48009v0.Fx0().mo72767mI(str);
            if (mI == null || ((ArrayList) mI).size() <= 0) {
                Log.m105918d("MicroMsg.MsgInfoStorageLogic", "deleteMsgByTalkers, empty talkers");
            } else {
                Log.m105925i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalkers stack[%s]", Util.getStack());
                ThreadPool.post(new C31450b4(mI), "deleteMsgByTalkers");
            }
            while (true) {
                ArrayList arrayList = (ArrayList) mI;
                if (i >= arrayList.size()) {
                    break;
                }
                String str3 = (String) arrayList.get(i);
                if (m53334h(str3)) {
                    C48340e.m53661b(str3, true, (z3$$g) null);
                }
                C48009v0.Fx0().mo72764c(str3);
                i++;
            }
        }
        if (b.mo73501s2()) {
            C48340e.m53661b(str, true, (z3$$g) null);
        }
        C48009v0.Fx0().mo72761bD(b);
        C48009v0.Ex0().mo72748c(str);
    }

    /* renamed from: b */
    public static C52558c m53328b(String str) {
        C52558c SE = C48009v0.Fx0().mo72757SE(str);
        if (SE.field_updateTime > 0) {
            return SE;
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m53329c() {
        return C48009v0.Fx0().mo72759TO(256) > 0;
    }

    /* renamed from: d */
    public static boolean m53330d() {
        return C48009v0.Fx0().mo72759TO(4) > 0;
    }

    /* renamed from: e */
    public static boolean m53331e() {
        return C48009v0.Fx0().mo72759TO(128) > 0;
    }

    /* renamed from: f */
    public static boolean m53332f() {
        return C48009v0.Fx0().mo72759TO(1) > 0;
    }

    /* renamed from: g */
    public static boolean m53333g() {
        return C48009v0.Fx0().mo72759TO(8) > 0;
    }

    /* renamed from: h */
    public static boolean m53334h(String str) {
        C52558c b = m53328b(str);
        return b != null && b.mo73501s2();
    }

    /* renamed from: i */
    public static boolean m53335i(String str) {
        C52558c b = m53328b(str);
        return b != null && b.mo73502t2();
    }

    /* renamed from: j */
    public static boolean m53336j(String str) {
        C52558c b = m53328b(str);
        if (b == null) {
            return false;
        }
        return b.mo73508z2();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r1 = m53328b(r1);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m53337k(java.lang.String r1) {
        /*
            r0 = 0
            if (r1 != 0) goto L_0x0004
            return r0
        L_0x0004:
            ug.c r1 = m53328b(r1)
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            boolean r1 = r1.mo72811g1()
            if (r1 == 0) goto L_0x0013
            r1 = 1
            return r1
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rb0.C47984k.m53337k(java.lang.String):boolean");
    }

    /* renamed from: l */
    public static boolean m53338l(String str) {
        C52558c b = m53328b(str);
        return b != null && b.mo73503u2();
    }

    /* renamed from: m */
    public static boolean m53339m(String str) {
        C52558c b = m53328b(str);
        return b != null && b.mo73504v2();
    }

    /* renamed from: n */
    public static boolean m53340n(String str) {
        C52558c b = m53328b(str);
        return b != null && b.mo73506x2();
    }

    /* renamed from: o */
    public static boolean m53341o(String str) {
        C52558c b = m53328b(str);
        if (b == null) {
            return false;
        }
        return b.mo73507y2();
    }

    /* renamed from: p */
    public static void m53342p(C52558c cVar) {
        if (cVar != null) {
            C48926by2 by22 = new C48926by2();
            by22.f131388d = cVar.field_brandFlag;
            by22.f131389e = cVar.field_username;
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(47, by22));
            C48009v0.Fx0().update(cVar, new String[0]);
        }
    }

    /* renamed from: q */
    public static void m53343q(C52558c cVar) {
        Class cls = C75700k0.class;
        if (cVar == null) {
            Log.m105920e("MicroMsg.BizInfoStorageLogic", "updateBrandFlagForTempSession bizInfo is Null");
            return;
        }
        C48926by2 by22 = new C48926by2();
        by22.f131388d = cVar.field_brandFlag;
        by22.f131389e = cVar.field_username;
        C72996z1 H3 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69656H3(cVar.field_username);
        if (H3 == null || !H3.mo62927s3()) {
            ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(new C32330n(58, by22));
        } else {
            ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(new C32330n(47, by22));
        }
        Log.m105925i("MicroMsg.BizInfoStorageLogic", "updateBrandFlagForTempSession ret = %b, BrandFlag = %b", Boolean.valueOf(C48009v0.Fx0().update(cVar, new String[0])), Integer.valueOf(cVar.field_brandFlag));
    }
}
