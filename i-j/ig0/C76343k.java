package ig0;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.pay.tool.APPluginConstants;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GetSafeDeviceNameEvent;
import com.tencent.p014mm.autogen.events.GetSafeDeviceTypeEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.event.MvvmEventCenter;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75593t5;
import f40.C86709a0;
import hg0.C76170j0;
import java.util.HashSet;
import java.util.Iterator;
import junit.framework.Assert;
import mg0.C76754b;
import ng0.C11158b;
import ng0.C76855a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p910lj.C76701a;
import pe3.C47465a;
import qg0.C12215a;
import qo3.C89779i0;
import te3.C77928fd;
import te3.C77934gd;

/* renamed from: ig0.k */
public class C76343k implements C11385n {

    /* renamed from: d */
    public MMActivity f223595d;

    /* renamed from: e */
    public boolean f223596e = false;

    /* renamed from: f */
    public String f223597f;

    /* renamed from: g */
    public C89779i0 f223598g = null;

    /* renamed from: h */
    public final C76347d f223599h;

    /* renamed from: i */
    public C76170j0 f223600i;

    /* renamed from: j */
    public C76170j0 f223601j;

    /* renamed from: n */
    public boolean f223602n = true;

    /* renamed from: o */
    public String f223603o = "";

    /* renamed from: p */
    public C76348e f223604p;

    /* renamed from: ig0.k$a */
    public class C76344a implements IMvvmObserver<C11158b> {
        public C76344a() {
        }

        public void onChanged(Object obj) {
            C11158b bVar = (C11158b) obj;
            if (bVar.f32939a != C11158b.C11159a.CgiEnd) {
                return;
            }
            if (bVar.f32940b == 1) {
                C76343k kVar = C76343k.this;
                kVar.f223603o = bVar.f32942d;
                kVar.mo106572c();
                return;
            }
            C76343k.this.f223603o = null;
        }
    }

    /* renamed from: ig0.k$b */
    public class C76345b implements DialogInterface.OnCancelListener {
        public C76345b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C76343k.this.f223596e = true;
        }
    }

    /* renamed from: ig0.k$c */
    public class C76346c implements DialogInterface.OnCancelListener {
        public C76346c() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C76343k.this.f223596e = true;
        }
    }

    /* renamed from: ig0.k$d */
    public interface C76347d {
        /* renamed from: a */
        void mo93913a(int i, Bundle bundle);
    }

    /* renamed from: ig0.k$e */
    public enum C76348e {
        BINDMOBILE,
        CHANGEMOBILE
    }

    public C76343k(C76348e eVar, MMActivity mMActivity, C76347d dVar) {
        this.f223604p = eVar;
        this.f223595d = mMActivity;
        this.f223599h = dVar;
        ((C76855a) MvvmEventCenter.getEvent(C76855a.class)).observe(this.f223595d, new C76344a());
    }

    /* renamed from: a */
    public final void mo106570a(int i, Bundle bundle) {
        C76348e eVar = this.f223604p;
        if (eVar == C76348e.BINDMOBILE || eVar == C76348e.CHANGEMOBILE) {
            C86709a0.m107524d().mo123470p(132, this);
        }
        if (!Util.isNullOrNil(this.f223603o)) {
            bundle.putString("policyTicket", this.f223603o);
        }
        C76347d dVar = this.f223599h;
        if (dVar != null) {
            dVar.mo93913a(i, bundle);
        }
    }

    /* renamed from: b */
    public void mo106571b() {
        C86709a0.m107524d().mo123470p(132, this);
        this.f223595d = null;
        this.f223596e = true;
        C89779i0 i0Var = this.f223598g;
        if (i0Var != null) {
            i0Var.dismiss();
        }
    }

    /* renamed from: c */
    public final void mo106572c() {
        C76348e eVar = C76348e.CHANGEMOBILE;
        Log.m105925i("MicroMsg.SmsBindMobileObserver", "sendGetVerifyReq %s policyTicket:%s", this.f223604p, this.f223603o);
        C76348e eVar2 = this.f223604p;
        if (eVar2 == C76348e.BINDMOBILE || eVar2 == eVar) {
            C76170j0 j0Var = new C76170j0(this.f223597f, eVar2 == eVar ? 18 : 1, "", 0, "");
            this.f223601j = j0Var;
            ((C77928fd) j0Var.f223161d.f127055a.f127080a).f227358D = this.f223603o;
            C86709a0.m107524d().mo123460f(this.f223601j);
        }
    }

    /* renamed from: d */
    public void mo106573d(String str) {
        C76348e eVar = this.f223604p;
        if (eVar == C76348e.BINDMOBILE || eVar == C76348e.CHANGEMOBILE) {
            C86709a0.m107524d().mo123455a(132, this);
        }
        this.f223597f = str;
        this.f223596e = false;
        mo106572c();
        C89779i0 i0Var = this.f223598g;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        MMActivity mMActivity = this.f223595d;
        this.f223598g = C76879j.m92723Q(mMActivity, "", mMActivity.getString(C0966R.string.a2w), false, true, new C76345b());
    }

    /* renamed from: e */
    public void mo106574e(String str, String str2, int i, String str3) {
        C76348e eVar = C76348e.CHANGEMOBILE;
        Log.m105925i("MicroMsg.SmsBindMobileObserver", "start send verify sms %s %s %s", str, str2, Integer.valueOf(i));
        if (Util.isNullOrNil(this.f223597f)) {
            this.f223597f = str;
        }
        C89779i0 i0Var = this.f223598g;
        if (i0Var != null) {
            i0Var.setCancelable(true);
        }
        C76348e eVar2 = this.f223604p;
        if (eVar2 == C76348e.BINDMOBILE || eVar2 == eVar) {
            C86709a0.m107524d().mo123455a(132, this);
            GetSafeDeviceNameEvent getSafeDeviceNameEvent = new GetSafeDeviceNameEvent();
            getSafeDeviceNameEvent.f193657d.f193659a = this.f223595d;
            getSafeDeviceNameEvent.publish();
            String str4 = getSafeDeviceNameEvent.f193658e.f193660a;
            GetSafeDeviceTypeEvent getSafeDeviceTypeEvent = new GetSafeDeviceTypeEvent();
            getSafeDeviceTypeEvent.publish();
            String str5 = getSafeDeviceTypeEvent.f78827d.f78828a;
            int i2 = (this.f223604p != eVar || i == 25) ? i : 19;
            this.f223596e = false;
            C76170j0 j0Var = new C76170j0(this.f223597f, i2, str2, 0, "", str4, str5);
            C47465a aVar = j0Var.f223161d.f127055a.f127080a;
            ((C77928fd) aVar).f227359E = str3;
            this.f223600i = j0Var;
            ((C77928fd) aVar).f227358D = this.f223603o;
            C86709a0.m107524d().mo123460f(this.f223600i);
            C89779i0 i0Var2 = this.f223598g;
            if (i0Var2 != null) {
                i0Var2.dismiss();
            }
            MMActivity mMActivity = this.f223595d;
            this.f223598g = C76879j.m92723Q(mMActivity, "", mMActivity.getString(C0966R.string.al4), false, true, new C76346c());
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        C7660a a;
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        C117747y yVar2 = yVar;
        C76348e eVar = C76348e.CHANGEMOBILE;
        Log.m105924i("MicroMsg.SmsBindMobileObserver", "onSceneEnd: errType = " + i3 + " errCode = " + i4 + " errMsg = " + str2);
        C89779i0 i0Var = this.f223598g;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (yVar2 != this.f223600i && yVar2 != this.f223601j) {
            Log.m105924i("MicroMsg.SmsBindMobileObserver", "onSceneEnd, doScene is not called by this class");
        } else if (!this.f223596e) {
            boolean z2 = false;
            if (i3 == 4 && i4 == -445 && !Util.isNullOrNil(str) && (a = C7660a.m7782a(str)) != null && a.f26002c == 9) {
                C12215a.m11778c(this.f223595d, a.f26000a, 0, true);
                return;
            }
            C76348e eVar2 = C76348e.BINDMOBILE;
            C76348e eVar3 = this.f223604p;
            if ((eVar2 == eVar3 || eVar == eVar3) && yVar.getType() == 132) {
                Class cls = C76754b.class;
                C76170j0 j0Var = (C76170j0) yVar2;
                int f = j0Var.mo106407f();
                Log.m105925i("MicroMsg.SmsBindMobileObserver", "bindMobileOnSceneEnd %s %s %s %s", Integer.valueOf(i), Integer.valueOf(i2), str2, Integer.valueOf(f));
                if (f != 1 && f != 2 && f != 18 && f != 19 && f != 25) {
                    return;
                }
                if (i3 != 0 || i4 != 0) {
                    if (i4 == -445 || i4 == -214) {
                        C7660a a2 = C7660a.m7782a(str);
                        if (a2 != null) {
                            if (a2.f26002c == 8) {
                                C12215a.m11778c(this.f223595d, a2.f26000a, 100, true);
                            } else {
                                a2.mo8792b(this.f223595d, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                            }
                        }
                    } else if (i4 == -74) {
                        C76879j.m92742m(this.f223595d, C0966R.string.ajt, C0966R.string.a3h, (DialogInterface.OnClickListener) null);
                    } else if (i4 != -59) {
                        if (i4 != -57) {
                            if (i4 == -43) {
                                Log.m105920e("MicroMsg.SmsBindMobileObserver", "dealErrCodeBindMobile");
                                C76348e eVar4 = this.f223604p;
                                if (eVar2 == eVar4 || eVar4 == eVar) {
                                    C86709a0.m107535s().mo121142i().mo119676J(4097, "");
                                    String str3 = (String) C86709a0.m107535s().mo121142i().mo119684e(6, "");
                                    C86709a0.m107535s().mo121142i().mo119676J(6, this.f223597f);
                                    if (!Util.isNullOrNil(str3)) {
                                        C85801v1 i5 = C86709a0.m107535s().mo121142i();
                                        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_LAST_LOGIN_USERNAME_STRING;
                                        if (i5.mo119685f(aVar, "").equals(str3)) {
                                            C86709a0.m107535s().mo121142i().mo119677K(aVar, C75592q0.m90789s());
                                        }
                                        Iterator it = ((HashSet) C75593t5.f222075c.mo105942e()).iterator();
                                        while (it.hasNext()) {
                                            String str4 = (String) it.next();
                                            if (str3.equals(C75593t5.f222075c.mo105941d(str4, "login_user_name"))) {
                                                C75593t5.f222075c.mo105946i(str4, "login_user_name", str4);
                                            }
                                        }
                                    }
                                    ((C76754b) C86312j.m106911c(cls)).mo105747jG();
                                }
                                mo106570a(2, new Bundle());
                                C76701a.makeText((Context) this.f223595d, (int) C0966R.string.aju, 0).show();
                            } else if (i4 != -41) {
                                if (i4 != -1) {
                                    switch (i4) {
                                        case APPluginConstants.ERROR_IO_ObjectStreamException_NotSerializableException:
                                            C76701a.makeText((Context) this.f223595d, (int) C0966R.string.ajz, 0).show();
                                            break;
                                        case APPluginConstants.ERROR_IO_ObjectStreamException_NotActiveException:
                                            C76879j.m92742m(this.f223595d, C0966R.string.ajv, C0966R.string.ale, new C76349l(this));
                                            break;
                                        case APPluginConstants.ERROR_IO_ObjectStreamException_InvalidObjectException:
                                            C76701a.makeText((Context) this.f223595d, (int) C0966R.string.ajx, 0).show();
                                            break;
                                        default:
                                            z = false;
                                            break;
                                    }
                                }
                            } else {
                                C76701a.makeText((Context) this.f223595d, (int) C0966R.string.ajw, 0).show();
                            }
                        }
                        C76701a.makeText((Context) this.f223595d, (int) C0966R.string.f7966xq, 0).show();
                    } else {
                        C76879j.m92742m(this.f223595d, C0966R.string.ajy, C0966R.string.a3h, (DialogInterface.OnClickListener) null);
                    }
                    z = true;
                    if (!z) {
                        C7660a a3 = C7660a.m7782a(str);
                        if (a3 != null) {
                            a3.mo8792b(this.f223595d, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                            return;
                        }
                        MMActivity mMActivity = this.f223595d;
                        C76701a.makeText((Context) mMActivity, (CharSequence) mMActivity.getString(C0966R.string.al8, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
                    } else if (i4 == -445) {
                        Bundle bundle = new Bundle();
                        bundle.putString("setpwd_ticket", ((C77934gd) j0Var.f223161d.f127056b.f127083a).f227439D);
                        mo106570a(3, bundle);
                    }
                } else if (j0Var.mo106407f() == 2 || j0Var.mo106407f() == 25 || j0Var.mo106407f() == 19) {
                    if (this.f223602n) {
                        ((C76754b) C86312j.m106911c(cls)).mo105747jG();
                    }
                    Bundle bundle2 = new Bundle();
                    if (j0Var.mo106407f() == 2) {
                        Log.m105925i("MicroMsg.SmsBindMobileObserver", "bind mobile check, ticket %s", j0Var.mo106408j1());
                        bundle2.putString("setpwd_ticket", j0Var.mo106408j1());
                    }
                    if (((C77934gd) j0Var.f223161d.f127056b.f127083a).f227437B != 0) {
                        z2 = true;
                    }
                    if (z2) {
                        bundle2.putBoolean("restart_wechat", true);
                    }
                    mo106570a(2, bundle2);
                } else {
                    mo106570a(1, new Bundle());
                }
            } else {
                Assert.assertTrue("code path should not be here!", false);
            }
        }
    }
}
