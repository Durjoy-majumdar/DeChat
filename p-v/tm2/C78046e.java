package tm2;

import android.content.Context;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.tools.C74854r0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86301e;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75593t5;
import eb0.C75604z3;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import h81.C32735h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l20.C21388a;
import lc3.C10485b;
import p327ct.C30914c;
import p918s2.C77604h;
import qe3.C89625d;
import tc0.C77885p;
import te3.C48993ce3;
import te3.C49750ht;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: tm2.e */
public class C78046e extends C86301e {

    /* renamed from: e */
    public static List<C49750ht> f228784e;

    /* renamed from: d */
    public MStorageEx.IOnStorageChange f228785d = new C37214a(this);

    /* renamed from: tm2.e$a */
    public class C37214a implements MStorageEx.IOnStorageChange {

        /* renamed from: tm2.e$a$a */
        public class C37215a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f98506d;

            public C37215a(C37214a aVar, String str) {
                this.f98506d = str;
            }

            public void run() {
                Class cls = C75700k0.class;
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(this.f98506d);
                if (z1Var != null && !z1Var.mo62927s3()) {
                    if (((z1Var.getType() & 2) != 0) && !z1Var.mo62924q3()) {
                        C72963f4 f4Var = new C72963f4();
                        f4Var.mo108740T2(0);
                        f4Var.mo108749c3(this.f98506d);
                        f4Var.mo100991d(6);
                        f4Var.mo108732L2(MMApplicationContext.getContext().getString(C0966R.string.isy));
                        f4Var.mo108733M2(C75604z3.m90841m(this.f98506d, System.currentTimeMillis() / 1000));
                        f4Var.setType(10000);
                        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).my0(f4Var);
                        Log.m105925i("MicroMsg.SubCoreSetting", "insert chatcontact verify sysmsg. %s", this.f98506d);
                    }
                }
            }
        }

        public C37214a(C78046e eVar) {
        }

        public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
            String str;
            C72996z1 W2;
            if (i == 2 && (W2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69674W2(str)) != null && !W2.mo62927s3()) {
                if (((2 & W2.getType()) != 0) && !W2.mo62924q3()) {
                    C86709a0.m107525e().postToWorkerDelayed(new C37215a(this, (str = (String) obj)), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                }
            }
        }
    }

    public static void vx0() {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CROWDTEST_APPLY_EXPIRE_LONG, 0L);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CROWDTEST_APPLY_LINK_STRING, "");
        ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33507p(262157, false);
    }

    public void onAccountInitialized(Context context) {
        Class cls = C32735h.class;
        Class cls2 = C75700k0.class;
        super.onAccountInitialized(context);
        Log.m105925i("MicroMsg.SubCoreSetting", "SubCoreSetting onAccountPostReset:%s", Long.valueOf(System.currentTimeMillis()));
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CROWDTEST_CLIENT_VERSION_INT, Integer.valueOf(C89625d.f257841g))).intValue();
        long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CROWDTEST_APPLY_EXPIRE_LONG, 0L)).longValue();
        if (intValue <= C89625d.f257841g || longValue < System.currentTimeMillis()) {
            vx0();
        }
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FLAVOR_BLUE_CLIENT_VERSION_INT;
        int intValue2 = ((Integer) i.mo119685f(aVar, 0)).intValue();
        Log.m105924i("MicroMsg.SubCoreSetting", "SubCoreSetting onAccountPostReset flavorBlueCV: " + intValue2 + ",CLIENT_VERSION:" + C89625d.f257841g);
        if (BuildInfo.IS_FLAVOR_BLUE && intValue2 < C89625d.f257841g) {
            ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33507p(262164, true);
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(C89625d.f257841g));
        }
        if (C86709a0.m107523b().f251754e.f222289a) {
            C86709a0.m107535s().mo121142i().mo119676J(34, Integer.valueOf(C75592q0.m90785o() & -1048577 & -4194305));
            C48993ce3 ce32 = new C48993ce3();
            ce32.f131680d = 1048576;
            ce32.f131681e = 0;
            ((C77885p) ((C75700k0) C86709a0.m107533q(cls2)).mo96100XW()).mo107993q(new C32330n(39, ce32));
            C48993ce3 ce33 = new C48993ce3();
            ce33.f131680d = 4194304;
            ce33.f131681e = 0;
            ((C77885p) ((C75700k0) C86709a0.m107533q(cls2)).mo96100XW()).mo107993q(new C32330n(39, ce33));
            Log.m105924i("MicroMsg.SubCoreSetting", "set void default open");
            if (!new C77604h(MMApplicationContext.getContext()).mo107781a()) {
                Log.m105928w("MicroMsg.SubCoreSetting", "sys notification disable！");
                C115669n.INSTANCE.idkeyStat(500, 18, 1, false);
            }
            Log.m105925i("MicroMsg.SubCoreSetting", "is update from %s", Integer.valueOf(C86709a0.m107523b().f251754e.f222290b));
            HashSet hashSet = (HashSet) C75593t5.f222075c.mo105942e();
            if (hashSet.size() == 2) {
                String[] strArr = new String[2];
                Iterator it = hashSet.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    strArr[i2] = C75593t5.f222075c.mo105941d((String) it.next(), "login_user_name");
                    i2++;
                }
                if (!Util.isNullOrNil(strArr[0], strArr[1]) && strArr[0].equals(strArr[1])) {
                    Log.m105928w("MicroMsg.SubCoreSetting", "old dirty data!!!");
                    C75593t5.f222075c.mo105947j(strArr[0]);
                    C75593t5.f222075c.mo105947j(strArr[1]);
                }
            }
        }
        if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("ShowTurnOnFriendVerificationSysmsgSwitch", 0) == 1 && (C75592q0.m90787q() & 32) == 0) {
            ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().add(this.f228785d);
        }
        KeyboardHeightProvider.f220014p = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_keyboard_version_switch, 1);
        C74854r0.f220092b = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_keyboard_apply_windowinsets_switch, 1);
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        Log.m105924i("MicroMsg.SubCoreSetting", "SubCoreSetting onAccountRelease: " + System.currentTimeMillis());
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this.f228785d);
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        C111038g gVar = C111038g.f332519b;
        gVar.getClass();
        Log.m105924i("MicroMsg.VAS.WxVAS", "init isVASOpen:" + gVar.mo162725d());
        MMFragmentActivity.aReporter = C111038g.f332521d;
        VASActivity.Companion.getClass();
        VASActivity.vasController = gVar;
    }
}
