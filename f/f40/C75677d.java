package f40;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86718e;
import f40.C86744o;
import qe3.C89625d;

/* renamed from: f40.d */
public class C75677d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C86718e f222288d;

    public C75677d(C86718e eVar) {
        this.f222288d = eVar;
    }

    public void run() {
        C86709a0.m107528h();
        C86744o s = C86709a0.m107535s();
        s.getClass();
        C86744o.C75680f fVar = new C86744o.C75680f();
        int nullAsNil = Util.nullAsNil((Integer) s.f251812j.mo119684e(14, (Object) null));
        int i = C89625d.f257841g;
        Log.m105919d("MMKernel.CoreStorage", "sVer: %s, cVer: %s.", Integer.toHexString(nullAsNil), Integer.toHexString(i));
        boolean z = i != nullAsNil && ((i > 570425344 && nullAsNil <= 570425344) || (i > 570556456 && nullAsNil <= 570556456));
        if (z) {
            s.f251812j.mo119676J(8197, "");
            s.f251812j.mo119676J(15, 0);
        }
        boolean z2 = nullAsNil != i;
        if (nullAsNil > 620822536 || nullAsNil == i) {
            s.f251812j.mo119676J(274480, Boolean.FALSE);
            Log.m105924i("MMKernel.CoreStorage", "[initialize] need not init emoji");
        } else {
            s.f251812j.mo119676J(274480, Boolean.TRUE);
            Log.m105924i("MMKernel.CoreStorage", "[initialize] need init emoji");
        }
        if (nullAsNil != 0 && nullAsNil < 637599744) {
            s.f251812j.mo119676J(348162, Boolean.TRUE);
        }
        if (nullAsNil != i) {
            Log.m105928w("MMKernel.CoreStorage", "account storage version changed from " + Integer.toHexString(nullAsNil) + " to " + Integer.toHexString(i) + ", init=" + z);
            if (((Integer) s.f251803a.mo119661b(37, 0)).intValue() == 0) {
                s.f251803a.mo119664f(37, Integer.valueOf(nullAsNil));
            }
            C85801v1 v1Var = s.f251812j;
            Boolean bool = Boolean.FALSE;
            v1Var.mo119676J(30, bool);
            s.f251812j.mo119676J(-2046825377, bool);
            s.f251812j.mo119676J(-2046825369, bool);
            s.f251812j.mo119676J(54, bool);
            s.f251812j.mo119676J(-2046825368, bool);
            C85801v1 v1Var2 = s.f251812j;
            Boolean bool2 = Boolean.TRUE;
            v1Var2.mo119676J(-2046825366, bool2);
            s.f251812j.mo119676J(62, bool2);
            MMApplicationContext.getContext().getSharedPreferences("update_config_prefs", 4).edit().clear().commit();
            if (nullAsNil != 0 && (nullAsNil & -16777216) == (i & -16777216)) {
                Log.m105918d("MMKernel.CoreStorage", "lock show_whatsnew by same major version");
                MMEntryLock.lock("show_whatsnew");
            }
        } else {
            Log.m105918d("MMKernel.CoreStorage", "lock show_whatsnew from else.");
            MMEntryLock.lock("show_whatsnew");
        }
        Log.m105925i("MMKernel.CoreStorage", "unlock show_whatsnew from testWhatsNew, %s.", Boolean.valueOf(s.f251812j.mo119689j(C72994y1.C72995a.USERINFO_FINDER_WHATS_NEW_LOCAL_STYLE_INT_SYNC, -1) > 0));
        fVar.f222289a = z2;
        fVar.f222290b = nullAsNil;
        C86718e eVar = this.f222288d;
        eVar.f251754e = fVar;
        eVar.getClass();
        Log.m105924i("MMKernel.CoreAccount", "changeToAccountHasReady");
        eVar.f251763n = C86718e.C58914d.AccountHasReady;
    }
}
