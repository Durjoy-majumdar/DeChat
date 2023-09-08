package rb0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44653b0;
import com.tencent.p014mm.storage.C72954a0;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.xweb.file.XVFSFile;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import f62.C45758e0;
import f62.C75700k0;
import g62.C75875l;
import sb0.C48334c;
import sb0.C48353j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: rb0.s */
public class C48004s extends C86301e implements C47966e0, C45758e0 {

    /* renamed from: d */
    public volatile C72954a0 f128759d;

    /* renamed from: e */
    public volatile C44653b0 f128760e;

    public void In0(C72963f4 f4Var, C72976h2 h2Var) {
        if (h2Var != null && f4Var != null && f4Var.mo108759l2() != -1 && h2Var.mo108372k3(8388608)) {
            C48334c a0 = C48009v0.Ax0().mo73042a0(f4Var.mo108759l2());
            String p2 = h2Var.mo108822p2();
            if (!Util.isNullOrNil(f4Var.mo108760m2())) {
                C48353j jVar = C48009v0.Bx0().get(f4Var.mo108760m2());
                String str = null;
                String str2 = jVar != null ? jVar.field_userName : null;
                boolean equals = f4Var.mo108760m2().equals(C48009v0.Bx0().mo73076Pk(f4Var.mo108768t()));
                if (jVar != null && equals) {
                    h2Var.mo108794O2(MMApplicationContext.getContext().getString(C0966R.string.a09) + XVFSFile.PATH_SEPARATOR + p2);
                } else if (jVar != null && !Util.isNullOrNil(jVar.field_userName)) {
                    h2Var.mo108794O2(jVar.field_userName + XVFSFile.PATH_SEPARATOR + p2);
                }
                if (a0.mo73037p2()) {
                    return;
                }
                if (equals || str2 == null || str2.length() <= 0 || str2.equals(a0.field_chatName)) {
                    C48353j jVar2 = C48009v0.Bx0().get(a0.field_bizChatServId);
                    if (jVar2 != null) {
                        str = jVar2.field_userName;
                    }
                    if (str != null && str.length() > 0 && !str.equals(a0.field_chatName)) {
                        a0.field_chatName = str;
                        C48009v0.Ax0().mo73040Ow(a0);
                        return;
                    }
                    return;
                }
                a0.field_chatName = str2;
                C48009v0.Ax0().mo73040Ow(a0);
                return;
            }
            Log.m105929w("MicroMsg.BizConversationStorage", "BizChatUserId is null:%s %s", a0.field_bizChatServId, a0.field_chatName);
        }
    }

    /* renamed from: Km */
    public String mo72737Km() {
        StringBuilder sb = new StringBuilder();
        C86709a0.m107528h();
        sb.append(C86709a0.m107535s().f251806d);
        sb.append("bizcache/");
        return sb.toString();
    }

    /* renamed from: M3 */
    public String mo72738M3() {
        StringBuilder sb = new StringBuilder();
        C86709a0.m107528h();
        sb.append(C86709a0.m107535s().f251806d);
        sb.append("brandicon/");
        return sb.toString();
    }

    /* renamed from: Mm */
    public C72954a0 mo72739Mm() {
        return vx0((C75875l) null);
    }

    public C72954a0 vx0(C75875l lVar) {
        if (this.f128759d == null) {
            synchronized (this) {
                if (this.f128759d == null) {
                    if (lVar == null) {
                        lVar = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE();
                    }
                    this.f128759d = new C72954a0(lVar);
                }
            }
        }
        return this.f128759d;
    }

    /* renamed from: wp */
    public C44653b0 mo72740wp() {
        if (this.f128760e == null) {
            synchronized (this) {
                this.f128760e = new C44653b0(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku());
            }
        }
        return this.f128760e;
    }
}
