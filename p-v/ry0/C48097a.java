package ry0;

import com.tencent.p014mm.plugin.zero.C72670r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44667s4;
import di3.C86312j;
import f40.C86709a0;
import f62.C31934j0;
import f62.C75699i1;
import f62.C75700k0;
import f62.C75707s0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import jc3.C76400h;
import ob0.C35136m;
import pc0.C118010i;
import sf0.C48374j0;
import te3.C50974ql;
import te3.C51018qv3;
import te3.C51771w2;
import te3.C77949j3;

/* renamed from: ry0.a */
public abstract class C48097a implements C36583g {

    /* renamed from: d */
    public C72670r f128950d = new C72670r();

    /* renamed from: e */
    public C118010i f128951e = new C48098a(this);

    /* renamed from: ry0.a$a */
    public class C48098a implements C118010i {
        public C48098a(C48097a aVar) {
        }

        /* renamed from: G0 */
        public boolean mo72839G0(Queue<C118010i> queue) {
            Log.m105925i("BaseBypSyncHandler", "RUN... %s", Integer.valueOf(queue.size()));
            return false;
        }

        public String toString() {
            return "BaseBypSyncHandler";
        }
    }

    /* renamed from: B */
    public void mo72836B() {
        C72670r rVar = this.f128950d;
        C118010i iVar = this.f128951e;
        C76400h hVar = rVar.f211433a;
        if (hVar != null) {
            hVar.mo96080a(iVar);
        }
        Log.m105924i("BaseBypSyncHandler", "[finishReceive]");
    }

    /* renamed from: D */
    public abstract int mo55695D();

    /* renamed from: O */
    public abstract int mo55698O();

    /* renamed from: Q */
    public abstract C75699i1 mo58464Q();

    /* renamed from: S */
    public final void mo72837S(C75700k0 k0Var, C51771w2 w2Var, C50974ql qlVar) {
        String g = C48374j0.m53718g(w2Var.f143822h ? w2Var.f143818d.f227628e : w2Var.f143818d.f227629f);
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(2, "");
        if (w2Var.f143822h && !g.equals(str)) {
            ((C44667s4) k0Var.V50()).mo69817Ow(g, mo55698O());
        }
        if (w2Var.f143822h) {
            w2Var.f143818d.f227629f = C48374j0.m53720i(w2Var.f143819e);
        } else {
            w2Var.f143818d.f227628e = C48374j0.m53720i(w2Var.f143819e);
        }
        C35136m.C35137a aVar = new C35136m.C35137a(w2Var.f143818d, false, false, false);
        aVar.f94248g = new C51771w2().parseFrom(qlVar.f140372f.f257327a);
        aVar.f94249h = mo55695D();
        ((C31934j0) C86312j.m106911c(C31934j0.class)).mo57256nn(aVar, mo58464Q());
    }

    /* renamed from: Z2 */
    public void mo60726Z2(LinkedList<C50974ql> linkedList, boolean z) {
        int i;
        Log.m105925i("BaseBypSyncHandler", "[onReceive] size=%s", Integer.valueOf(linkedList.size()));
        C75700k0 k0Var = (C75700k0) C86709a0.m107533q(C75700k0.class);
        try {
            this.f128950d.mo100128b(this.f128951e);
            Iterator<C50974ql> it = linkedList.iterator();
            while (it.hasNext()) {
                C50974ql next = it.next();
                if (next.f140371e == 1) {
                    C51771w2 w2Var = new C51771w2();
                    w2Var.parseFrom(next.f140372f.f257327a);
                    if (Util.isNullOrNil(w2Var.f143819e) && ((i = w2Var.f143818d.f227630g) == 10002 || i == 10001)) {
                        Log.m105925i("BaseBypSyncHandler", "dispatchToSysCmdMsgExtension, MsgType=%s isContinue=%s", Integer.valueOf(i), Boolean.valueOf(z));
                        mo72838q(w2Var);
                    } else if (Util.isNullOrNil(w2Var.f143819e)) {
                        Log.m105921e("BaseBypSyncHandler", "msg_session_id is null! FromUserName=%s ToUserName=%s", C48374j0.m53718g(w2Var.f143818d.f227628e), C48374j0.m53718g(w2Var.f143818d.f227629f));
                    } else {
                        C77949j3 j3Var = w2Var.f143818d;
                        if (j3Var.f227638r == 0) {
                            Log.m105921e("BaseBypSyncHandler", "NewMsgId is zero! FromUserName=%s ToUserName=%s", C48374j0.m53718g(j3Var.f227628e), C48374j0.m53718g(w2Var.f143818d.f227629f));
                        } else if (!mo61032d(w2Var)) {
                            Log.m105921e("BaseBypSyncHandler", "[onReceive] ignore this msg %s", w2Var.f143819e);
                        } else {
                            mo72837S(k0Var, w2Var, next);
                        }
                    }
                }
            }
            this.f128950d.mo100127a(this.f128951e);
            if (z) {
                return;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("BaseBypSyncHandler", e, "", new Object[0]);
            if (!mo55699f0(e)) {
                this.f128950d.mo100127a(this.f128951e);
                if (z) {
                    return;
                }
            } else {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            this.f128950d.mo100127a(this.f128951e);
            if (!z) {
                mo72836B();
            }
            throw th;
        }
        mo72836B();
    }

    /* renamed from: d */
    public boolean mo61032d(C51771w2 w2Var) {
        return true;
    }

    /* renamed from: f0 */
    public boolean mo55699f0(Exception exc) {
        return false;
    }

    /* renamed from: q */
    public final void mo72838q(C51771w2 w2Var) {
        C77949j3 j3Var = w2Var.f143818d;
        if (j3Var.f227634n == null) {
            j3Var.f227634n = new C51018qv3();
            Log.m105920e("BaseBypSyncHandler", "[processToFunctionMsg] ImgBuf is null");
        }
        ((C75707s0) C86312j.m106911c(C75707s0.class)).H60().mo56403Fg(new C35136m.C35137a(w2Var.f143818d, false, false, false));
    }
}
