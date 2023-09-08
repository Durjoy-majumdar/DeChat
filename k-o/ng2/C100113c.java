package ng2;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import ei3.C86522b;
import f40.C86709a0;
import i40.C98597b;
import i40.C98598e;
import java.util.HashSet;
import og2.C100336e;
import og2.C100337f;
import og2.C100340i;
import og2.C100341k;
import og2.C100346q;
import qg2.C101133a0;
import qg2.C101136b0;
import qg2.C101143h0;
import qg2.C101153n0;
import qg2.C101170w;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: ng2.c */
public class C100113c extends C98598e implements C100336e {

    /* renamed from: i */
    public C100341k f293263i;

    /* renamed from: j */
    public C100340i f293264j;

    /* renamed from: n */
    public C101153n0 f293265n = null;

    /* renamed from: o */
    public C101133a0 f293266o = null;

    public static void Ax0() {
        StringBuilder sb = new StringBuilder();
        C86709a0.m107528h();
        sb.append(C86709a0.m107535s().f251806d);
        sb.append("record/");
        C86009m1 m1Var = new C86009m1(sb.toString());
        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
            Log.m105918d("MicroMsg.PluginRecord", "record stg dir[%s] not exsit, create it");
            m1Var.mo119987x();
        }
        StringBuilder sb4 = new StringBuilder();
        C86709a0.m107528h();
        sb4.append(C86709a0.m107535s().f251806d);
        sb4.append("record/record2/");
        C86009m1 m1Var2 = new C86009m1(sb4.toString());
        if (!m1Var2.mo119967g() || !m1Var2.mo119977o()) {
            Log.m105918d("MicroMsg.PluginRecord", "record stg2 dir[%s] not exsit, create it");
            m1Var2.mo119987x();
        }
    }

    /* renamed from: Bx0 */
    public C101153n0 mo139409NS() {
        C86709a0.m107523b().mo121108c();
        if (this.f293265n == null) {
            this.f293265n = new C101153n0();
        }
        return this.f293265n;
    }

    /* renamed from: hi */
    public C100340i mo139410hi() {
        if (this.f293264j == null && C86709a0.m107522a()) {
            synchronized (this) {
                if (this.f293264j == null) {
                    this.f293264j = new C101136b0(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f293264j;
    }

    public C100341k k10() {
        if (this.f293263i == null && C86709a0.m107522a()) {
            synchronized (this) {
                if (this.f293263i == null) {
                    this.f293263i = new C101143h0(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f293263i;
    }

    public C100337f kl0() {
        C86709a0.m107523b().mo121108c();
        if (this.f293266o == null) {
            this.f293266o = new C101133a0();
        }
        return this.f293266o;
    }

    public void wx0(HashSet<Class<? extends C98597b>> hashSet) {
        hashSet.add(C101170w.class);
    }

    public void xx0(Context context) {
        Ax0();
        mo139409NS().mo140599f((C100346q) null, false);
        Log.m105924i("MicroMsg.PluginRecord", "onAccountInitialized start recordMsgSendService");
    }

    public void zx0() {
        C101153n0 n0Var = this.f293265n;
        if (n0Var != null) {
            n0Var.f296074g.clear();
            n0Var.f296073f.clear();
            n0Var.f296071d = false;
            C86709a0.m107529k().f251779b.mo123470p(632, n0Var);
        }
        C101133a0 a0Var = this.f293266o;
        if (a0Var != null) {
            a0Var.mo140621c();
        }
    }
}
