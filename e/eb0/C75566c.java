package eb0;

import a11.C39479c;
import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C30752k;
import com.tencent.p014mm.storage.C30758m;
import com.tencent.p014mm.storage.C30762o;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44653b0;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72954a0;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.C86016v1;
import di3.C86312j;
import f12.C7970a;
import f40.C86709a0;
import f40.C86744o;
import f62.C75700k0;
import g62.C32327i;
import g62.C45888s;
import g62.C75875l;
import g62.C8233m;
import g62.C8235p;
import gb0.C75896b;
import gb0.C75899c;
import gb0.C75900d;
import p154fy.C87121j;
import p214om.C35192i;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38174i;
import rb0.C47966e0;
import u90.C37355b;
import u90.C78140c;
import zh3.C91753f;

@Deprecated
/* renamed from: eb0.c */
public class C75566c {

    /* renamed from: a */
    public volatile C45625q4 f221990a;

    /* renamed from: b */
    public volatile C45623p4 f221991b;

    /* renamed from: c */
    public volatile C75899c f221992c;

    /* renamed from: d */
    public volatile C75900d f221993d;

    /* renamed from: e */
    public volatile C30752k f221994e;

    /* renamed from: f */
    public volatile C30762o f221995f;

    /* renamed from: g */
    public volatile C30758m f221996g;

    /* renamed from: h */
    public volatile C75896b f221997h;

    /* renamed from: eb0.c$a */
    public class C75567a implements C86016v1 {
        public C75567a(C75566c cVar) {
        }

        public boolean accept(C86009m1 m1Var, String str) {
            return str.equals("EnMicroMsg.db") || str.startsWith("EnMicroMsg.dberr") || str.equals("FTS5IndexMicroMsg_encrypt.db");
        }
    }

    /* renamed from: A */
    public C37355b mo105875A() {
        C86709a0.m107528h();
        C86709a0.m107523b().mo121108c();
        return ((C78140c) C86312j.m106911c(C78140c.class)).ab0();
    }

    /* renamed from: B */
    public C8233m mo105876B() {
        return ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW();
    }

    /* renamed from: C */
    public C8235p mo105877C() {
        return ((C75700k0) C86709a0.m107533q(C75700k0.class)).V50();
    }

    /* renamed from: D */
    public C45623p4 mo105878D() {
        if (this.f221991b == null && C86709a0.m107522a()) {
            synchronized (this) {
                if (this.f221991b == null) {
                    this.f221991b = new C45623p4(C86709a0.m107535s().f251811i, ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni());
                }
            }
        }
        return this.f221991b;
    }

    /* renamed from: E */
    public C45625q4 mo105879E() {
        if (this.f221990a == null && C86709a0.m107522a()) {
            synchronized (this) {
                if (this.f221990a == null) {
                    this.f221990a = new C45625q4(C86709a0.m107535s().f251811i, ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku());
                }
            }
        }
        return this.f221990a;
    }

    /* renamed from: F */
    public C45888s mo105880F() {
        return ((C75700k0) C86709a0.m107533q(C75700k0.class)).mm0();
    }

    @Deprecated
    /* renamed from: G */
    public int mo105881G() {
        C86709a0.m107528h();
        return C86709a0.m107523b().mo121110g();
    }

    /* renamed from: H */
    public SharedPreferences mo105882H(String str) {
        C86709a0.m107528h();
        C86744o s = C86709a0.m107535s();
        s.getClass();
        C86709a0.m107528h();
        int g = C86709a0.m107523b().mo121110g();
        if (g == 0) {
            return null;
        }
        if (s.f251817o.containsKey(str)) {
            return s.f251817o.get(str);
        }
        try {
            String str2 = MMApplicationContext.getContext().getFilesDir().getParent() + "/shared_prefs/";
            String str3 = MMApplicationContext.getDefaultPreferencePath() + str + g + ".xml.bak";
            C86009m1 m1Var = new C86009m1(str2 + (MMApplicationContext.getDefaultPreferencePath() + str + g + ".xml"));
            if (m1Var.mo119967g()) {
                m1Var.mo119966f();
            }
            C86009m1 m1Var2 = new C86009m1(str2 + str3);
            if (m1Var2.mo119967g()) {
                m1Var2.mo119966f();
            }
        } catch (Exception unused) {
        }
        String mD5String = MD5Util.getMD5String(String.valueOf(g / 2));
        StringBuilder sb = new StringBuilder();
        sb.append(MMApplicationContext.getDefaultPreferencePath());
        sb.append(str);
        sb.append(MD5Util.getMD5String(g + mD5String));
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences(sb.toString(), 0);
        s.f251817o.put(str, sharedPreferences);
        return sharedPreferences;
    }

    @Deprecated
    /* renamed from: I */
    public boolean mo105883I() {
        C86709a0.m107528h();
        return C86709a0.m107535s().mo121147n();
    }

    /* renamed from: J */
    public boolean mo105884J() {
        C86709a0.m107528h();
        return C86709a0.m107523b().mo121120t();
    }

    /* renamed from: K */
    public void mo105885K(C31461f3 f3Var) {
        C86709a0.m107528h();
        C86709a0.m107523b().mo121124y(f3Var);
    }

    /* renamed from: a */
    public void mo105886a(C31461f3 f3Var) {
        C86709a0.m107528h();
        C86709a0.m107523b().mo121106a(f3Var);
    }

    /* renamed from: b */
    public void mo105887b(int i) {
        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C35192i.class);
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            C38174i iVar = (C38174i) bVar.next();
            if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                ((C35192i) ((C15510f) iVar.get())).mo55915bK(i);
            }
        }
        if ((i & 16) != 0) {
            C75604z3.m90836h("medianote", (z3$$g) null);
            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f("medianote");
            ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot("medianote", 15);
        }
    }

    /* renamed from: c */
    public void mo105888c() {
        String str = C86709a0.m107535s().f251807e;
        String str2 = C86709a0.m107535s().f251806d;
        String[] t = new C86009m1(str).mo119982t(new C75567a(this));
        if (t != null) {
            for (String str3 : t) {
                String str4 = str2 + str3 + ".dump";
                C86013q1.m106447h(str4);
                C86013q1.m106442c(str + str3, str4);
                Log.m105924i("MicroMsg.AccountStorage", "Exported: " + str4);
            }
        }
    }

    /* renamed from: d */
    public String mo105889d() {
        StringBuilder sb = new StringBuilder();
        C86709a0.m107528h();
        sb.append(C86709a0.m107535s().f251806d);
        sb.append("attachment/");
        return sb.toString();
    }

    /* renamed from: e */
    public String mo105890e() {
        return C7970a.m8127a();
    }

    /* renamed from: f */
    public String mo105891f() {
        C86709a0.m107528h();
        return C86709a0.m107535s().f251806d;
    }

    /* renamed from: g */
    public String mo105892g() {
        StringBuilder sb = new StringBuilder();
        C86709a0.m107528h();
        sb.append(C86709a0.m107535s().f251806d);
        sb.append("record/");
        return sb.toString();
    }

    /* renamed from: h */
    public String mo105893h() {
        StringBuilder sb = new StringBuilder();
        C86709a0.m107528h();
        sb.append(C86709a0.m107535s().f251806d);
        sb.append("image/shakeTranImg/");
        return sb.toString();
    }

    /* renamed from: i */
    public C30752k mo105894i() {
        C86709a0.m107528h();
        C86709a0.m107523b().mo121108c();
        if (this.f221994e == null) {
            synchronized (this) {
                if (this.f221994e == null) {
                    this.f221994e = new C30752k(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f221994e;
    }

    /* renamed from: j */
    public C30758m mo105895j() {
        C86709a0.m107528h();
        C86709a0.m107523b().mo121108c();
        if (this.f221996g == null) {
            synchronized (this) {
                if (this.f221996g == null) {
                    this.f221996g = new C30758m(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f221996g;
    }

    /* renamed from: k */
    public C30762o mo105896k() {
        C86709a0.m107528h();
        C86709a0.m107523b().mo121108c();
        if (this.f221995f == null) {
            synchronized (this) {
                if (this.f221995f == null) {
                    this.f221995f = new C30762o(C86709a0.m107535s().f251811i);
                }
            }
        }
        return this.f221995f;
    }

    /* renamed from: l */
    public C72954a0 mo105897l() {
        return ((C47966e0) C86312j.m106911c(C47966e0.class)).mo72739Mm();
    }

    /* renamed from: m */
    public C44653b0 mo105898m() {
        return ((C47966e0) C86312j.m106911c(C47966e0.class)).mo72740wp();
    }

    /* renamed from: n */
    public String mo105899n() {
        C86709a0.m107528h();
        return C86709a0.m107535s().mo121139f();
    }

    /* renamed from: o */
    public String mo105900o() {
        C86709a0.m107528h();
        return C86709a0.m107535s().mo121140g();
    }

    /* renamed from: p */
    public String mo105901p() {
        C86709a0.m107528h();
        return C86709a0.m107535s().f251807e;
    }

    /* renamed from: q */
    public C45613m2 mo105902q() {
        C86709a0.m107528h();
        C86709a0.m107523b().mo121108c();
        return ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr();
    }

    /* renamed from: r */
    public C75896b mo105903r() {
        C86709a0.m107528h();
        C86709a0.m107523b().mo121108c();
        if (this.f221997h == null) {
            synchronized (this) {
                if (this.f221997h == null) {
                    this.f221997h = new C75896b();
                }
            }
        }
        return this.f221997h;
    }

    /* renamed from: s */
    public C75899c mo105904s() {
        C86709a0.m107528h();
        C86709a0.m107523b().mo121108c();
        if (this.f221992c == null) {
            synchronized (this) {
                if (this.f221992c == null) {
                    this.f221992c = new C75899c();
                }
            }
        }
        return this.f221992c;
    }

    /* renamed from: t */
    public C75900d mo105905t() {
        C86709a0.m107528h();
        C86709a0.m107523b().mo121108c();
        if (this.f221993d == null) {
            synchronized (this) {
                if (this.f221993d == null) {
                    this.f221993d = new C75900d();
                }
            }
        }
        return this.f221993d;
    }

    /* renamed from: u */
    public C85801v1 mo105906u() {
        C86709a0.m107528h();
        return C86709a0.m107535s().mo121142i();
    }

    /* renamed from: v */
    public C44668u3 mo105907v() {
        return ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
    }

    /* renamed from: w */
    public C30783v3 mo105908w() {
        return ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku();
    }

    /* renamed from: x */
    public C91753f mo105909x() {
        C86709a0.m107528h();
        return C86709a0.m107535s().f251811i;
    }

    /* renamed from: y */
    public C32327i mo105910y() {
        return ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96107x4();
    }

    /* renamed from: z */
    public C75875l mo105911z() {
        return ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE();
    }
}
