package eb0;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import d62.C75339i;
import di3.C86312j;
import ex0.C45696d;
import f40.C86709a0;
import f40.C86718e;
import ky2.C10432i;
import ky2.C10439o;
import p248ug.C52570c0;
import p749xh.C53349s0;

/* renamed from: eb0.b0 */
public final class C58537b0 implements C52570c0 {

    /* renamed from: d */
    public static final C58537b0 f167574d = new C58537b0();

    /* renamed from: e */
    public static MultiProcessMMKV f167575e;

    /* renamed from: f */
    public static boolean f167576f;

    /* renamed from: g */
    public static int f167577g;

    /* renamed from: h */
    public static boolean f167578h;

    /* renamed from: eb0.b0$a */
    public static final class C58538a implements C10439o {

        /* renamed from: d */
        public static final C58538a f167579d = new C58538a();

        public final void onDataChanged() {
            Class cls = C10432i.class;
            boolean e = ((C10432i) C86312j.m106911c(cls)).mo10750e();
            int fd = ((C10432i) C86312j.m106911c(cls)).mo10751fd();
            boolean z = (e == C58537b0.f167576f && fd == C58537b0.f167577g) ? false : true;
            Log.m105925i("MicroMsg.BizTeenModeService", "alvinluo onTeenModeDataChanged isTeenMode: %b, bizAcctOption: %d, isChanged: %b", Boolean.valueOf(e), Integer.valueOf(fd), Boolean.valueOf(z));
            if (z) {
                C58537b0.f167576f = e;
                C58537b0.f167577g = fd;
                C58537b0.f167574d.mo83446b();
                C45696d dVar = (C45696d) C86709a0.m107533q(C45696d.class);
                if (dVar != null) {
                    dVar.mo70958Eh();
                }
            }
        }
    }

    /* renamed from: H1 */
    public boolean mo58178H1() {
        if (!f167578h) {
            mo83445a();
        }
        return f167576f && f167577g == 2;
    }

    /* renamed from: IC */
    public void mo58179IC(C53349s0 s0Var) {
        if (s0Var != null && f167576f) {
            String str = s0Var.field_username;
            String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str);
            Log.m105919d("MicroMsg.BizTeenModeService", "reportRemoveBizContact username: %s, nickname: %s", str, displayName);
            C115669n.INSTANCE.mo160131h(20911, 1, str, displayName);
        }
    }

    /* renamed from: ND */
    public boolean mo58180ND() {
        if (!f167578h) {
            mo83445a();
        }
        return !f167576f || f167577g == 1;
    }

    /* renamed from: a */
    public void mo83445a() {
        Class cls = C10432i.class;
        if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.BizTeenModeService", "alvinluo initBizTeenModeService account not ready");
        } else if (((C10432i) C86312j.m106911c(cls)) == null) {
            Log.m105920e("MicroMsg.BizTeenModeService", "alvinluo initBizTeenModeService service null and ignore");
        } else {
            ((C10432i) C86312j.m106911c(cls)).mo10739MV(C58538a.f167579d);
            f167576f = ((C10432i) C86312j.m106911c(cls)).mo10750e();
            f167577g = ((C10432i) C86312j.m106911c(cls)).mo10751fd();
            int h = C86718e.m107549h();
            if (h == 0) {
                Log.m105920e("MicroMsg.BizTeenModeService", "alvinluo initBizTeenModeService invalid account");
                f167575e = null;
                return;
            }
            String str = h + "_biz_teen_mode_mmkv";
            f167575e = MultiProcessMMKV.getMMKV(str, 2);
            mo83446b();
            f167578h = true;
            Log.m105925i("MicroMsg.BizTeenModeService", "alvinluo initBizTeenModeService key: %s, isTeenMode: %b, bizAcctOption: %d", str, Boolean.valueOf(f167576f), Integer.valueOf(f167577g));
        }
    }

    /* renamed from: b */
    public final void mo83446b() {
        Log.m105927v("MicroMsg.BizTeenModeService", "alvinluo updateTeenModeData isTeenMode: %s, bizTeenModeOption: %s", Boolean.valueOf(f167576f), Integer.valueOf(f167577g));
        MultiProcessMMKV multiProcessMMKV = f167575e;
        if (multiProcessMMKV != null) {
            multiProcessMMKV.putBoolean("is_teen_mode", f167576f);
        }
        MultiProcessMMKV multiProcessMMKV2 = f167575e;
        if (multiProcessMMKV2 != null) {
            multiProcessMMKV2.putInt("biz_teen_mode_acct_option", f167577g);
        }
        MultiProcessMMKV multiProcessMMKV3 = f167575e;
        if (multiProcessMMKV3 != null) {
            multiProcessMMKV3.apply();
        }
    }

    /* renamed from: e */
    public boolean mo58182e() {
        if (!f167578h) {
            mo83445a();
        }
        return f167576f;
    }

    public void n80(int i, String str, String str2) {
        if (str != null && str2 != null) {
            Log.m105919d("MicroMsg.BizTeenModeService", "reportTeenModeToast username: %s, nickname: %s, scene: %d", str, str2, Integer.valueOf(i));
            C115669n.INSTANCE.mo160131h(20912, 1, Integer.valueOf(i), str, str2);
        }
    }

    /* renamed from: vU */
    public void mo58184vU(int i, String str) {
        if (str != null && f167576f) {
            n80(i, str, ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str));
        }
    }
}
