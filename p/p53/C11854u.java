package p53;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.wallet.wecoin.model.MidasPayLogCallbackImpl;
import com.tencent.p014mm.plugin.wallet.wecoin.model.WecoinEncashKVData;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinIncomeDetailView;
import com.tencent.p014mm.plugin.wallet.wecoin.p124ui.WeCoinRechargeView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import gy3.C87412m;
import hp3.C87581a;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.UUID;
import k20.C9556a;
import ke3.C88144b;
import m53.C10754b;
import m53.C10756c;
import m53.C10757d;
import m53.C10760f;
import m53.C10761g;
import m53.C10762h;
import m53.C10763i;
import m53.C10764j;
import m53.C10765k;
import n53.C11121d;
import n53.C11122e;
import n53.C11125h;
import o53.C11365k;
import o53.C11367m;
import o53.C11370o;
import o53.C11371p;
import ob0.C89132b;
import org.json.JSONArray;
import org.xwalk.core.XWalkEnvironment;
import p274xx.C15907f;
import q53.C12041a;
import q53.C12087k1;
import qo3.C89779i0;
import r53.C12953c;
import s43.C13623d;
import s43.C13624e;
import te3.C48643a02;
import te3.C48655a22;
import te3.C49028cn3;
import te3.C50943qc2;
import zt3.C119157j;

/* renamed from: p53.u */
public class C11854u implements C10756c {

    /* renamed from: p53.u$a */
    public class C11855a implements C10762h {

        /* renamed from: a */
        public final /* synthetic */ FragmentActivity f34672a;

        /* renamed from: b */
        public final /* synthetic */ C10761g f34673b;

        public C11855a(FragmentActivity fragmentActivity, C10761g gVar) {
            this.f34672a = fragmentActivity;
            this.f34673b = gVar;
        }

        /* renamed from: a */
        public void mo605a(int i, int i2, String str) {
            C10762h<Void> hVar = this.f34673b.f32225d;
            if (hVar != null) {
                hVar.mo605a(i, i2, str);
            }
        }

        public void onSuccess(Object obj) {
            C11854u.this.mo11733a(this.f34672a, this.f34673b);
        }
    }

    /* renamed from: p53.u$b */
    public class C11856b implements C87581a<Object, C89132b.C89134c<C48643a02>> {

        /* renamed from: a */
        public final /* synthetic */ C10762h f34675a;

        public C11856b(C11854u uVar, C10762h hVar) {
            this.f34675a = hVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.WeCoinManagerImplement", "getWecoinPriceListInfo errorType: %s, errorCode: %s, errorMsg: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b), cVar.f256795c);
            if (C12953c.m12398g(cVar)) {
                C10762h hVar = this.f34675a;
                if (hVar == null) {
                    return null;
                }
                hVar.mo605a(cVar.f256793a, cVar.f256794b, cVar.f256795c);
                return null;
            }
            T t = cVar.f256796d;
            if (t == null) {
                C10762h hVar2 = this.f34675a;
                if (hVar2 == null) {
                    return null;
                }
                hVar2.mo605a(3, -1, "");
                return null;
            }
            C10762h hVar3 = this.f34675a;
            if (hVar3 == null) {
                return null;
            }
            hVar3.onSuccess((C48643a02) t);
            return null;
        }
    }

    /* renamed from: p53.u$c */
    public class C11857c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C10762h f34676d;

        public C11857c(C11854u uVar, C10762h hVar) {
            this.f34676d = hVar;
        }

        public void run() {
            C10762h hVar = this.f34676d;
            if (hVar != null) {
                hVar.mo605a(3, -2, "");
            }
        }
    }

    /* renamed from: p53.u$d */
    public class C11858d implements C87581a<Object, C89132b.C89134c<C48655a22>> {

        /* renamed from: a */
        public final /* synthetic */ C10762h f34677a;

        public C11858d(C11854u uVar, C10762h hVar) {
            this.f34677a = hVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (C12953c.m12398g(cVar)) {
                C10762h hVar = this.f34677a;
                if (hVar == null) {
                    return null;
                }
                hVar.mo605a(cVar.f256793a, cVar.f256794b, cVar.f256795c);
                return null;
            }
            C48655a22 a222 = (C48655a22) cVar.f256796d;
            if (a222 == null) {
                C10762h hVar2 = this.f34677a;
                if (hVar2 == null) {
                    return null;
                }
                hVar2.mo605a(3, -1, "");
                return null;
            }
            C10762h hVar3 = this.f34677a;
            if (hVar3 == null) {
                return null;
            }
            hVar3.onSuccess(Long.valueOf(a222.f130236d));
            return null;
        }
    }

    public C11854u() {
        APMidasPayAPI.setLogEnable(false);
        APMidasPayAPI.setLogCallback(MidasPayLogCallbackImpl.class);
    }

    public Object C70(MMActivity mMActivity, C10764j jVar, WeakReference<C10763i> weakReference) {
        C11371p pVar = new C11371p(mMActivity, jVar, weakReference);
        C49028cn3 cn32 = pVar.f33475b.f32237d;
        if (cn32 == null || cn32.f131844i != 1) {
            pVar.mo11385b();
        } else {
            Log.m105924i("WeCoinEncashLogic", "openRealNameAuth, info: " + cn32);
            Intent intent = new Intent();
            intent.putExtra("intent_appid", cn32.f131839d);
            intent.putExtra("intent_category_id", new JSONArray(cn32.f131840e).toString());
            intent.putExtra("intent_auth_type", cn32.f131841f);
            intent.putExtra("id_ui_theme", 2);
            intent.putExtra("wecoin_apply_info", cn32.f131842g);
            intent.putExtra("wecoin_protocol_url", cn32.f131843h);
            pVar.f33474a.mmSetOnActivityResultCallback(new C11370o(pVar));
            C88144b.m109795m(pVar.f33474a, XWalkEnvironment.MODULE_APPBRAND, ".ui.autofill.AppBrandIDCardUI", intent, 20001);
        }
        return pVar;
    }

    public C10754b Ed0(Context context, boolean z) {
        if (context == null) {
            return null;
        }
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WECOIN_HAS_SHOW_ENTRANCE_TUTORIAL_BOOLEAN_SYNC;
        Object f = i.mo119685f(aVar, Boolean.FALSE);
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
        if (((Boolean) f).booleanValue()) {
            return null;
        }
        C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
        return new C12087k1(context, z);
    }

    /* renamed from: F3 */
    public void mo10991F3(Context context, String str, int i, boolean z, String str2) {
        if (context != null) {
            Intent intent = new Intent(context, WeCoinIncomeDetailView.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            if (str2 == null) {
                str2 = "";
            }
            intent.putExtra("wecoin_enter_encash_business_kv_data", new WecoinEncashKVData(1, str, ""));
            intent.putExtra("wecoin_enter_encash_business_kv_is_cocert_activate", z);
            intent.putExtra("wecoin_enter_encash_business_kv_tips", str2);
            intent.putExtra("WECOIN_BUSINESS_ID", i);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/model/WeCoinManagerImplement", "startWeCoinIncomeDetailView", "(Landroid/content/Context;Ljava/lang/String;IZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/wallet/wecoin/model/WeCoinManagerImplement", "startWeCoinIncomeDetailView", "(Landroid/content/Context;Ljava/lang/String;IZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: Gy */
    public Object mo10992Gy(C13624e eVar) {
        C11367m mVar = new C11367m(eVar);
        C10765k.f32239a = mVar.f33467a.f38597a;
        String uuid = UUID.randomUUID().toString();
        C87412m.m108593f(uuid, "randomUUID().toString()");
        C10765k.f32240b = uuid;
        int ordinal = mVar.f33467a.f38602f.ordinal();
        if (ordinal == 0) {
            mVar.mo11381c();
        } else if (ordinal == 1) {
            Log.m105924i("WeCoinConsumeLogic", "showConsumePanel");
            C13624e eVar2 = mVar.f33467a;
            if (eVar2.f38602f == C13623d.ShowPanel) {
                FragmentActivity fragmentActivity = eVar2.f38598b;
                mVar.f33468b = C89779i0.m112248e(fragmentActivity, fragmentActivity.getString(C0966R.string.gas), false, 3, (DialogInterface.OnCancelListener) null);
            }
            new C11125h().mo9225i().mo123062e(new C11365k(mVar));
        }
        return mVar;
    }

    /* renamed from: S4 */
    public void mo10993S4(Context context) {
        if (context != null) {
            Intent intent = new Intent(context, WeCoinRechargeView.class);
            intent.addFlags(268435456);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/wecoin/model/WeCoinManagerImplement", "startWeCoinMainPageView", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/wallet/wecoin/model/WeCoinManagerImplement", "startWeCoinMainPageView", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: Sk */
    public void mo10994Sk(Context context, C10762h<Boolean> hVar) {
        if (context == null) {
            Log.m105920e("MicroMsg.WeCoinManagerImplement", "initEngine context is null.");
            ((C119157j) C119157j.f356862d).mo183895z(new C11857c(this, hVar));
            return;
        }
        C11862y yVar = C11862y.f34681e;
        C11862y.f34681e.mo11737c(context, hVar);
    }

    /* renamed from: Wl */
    public Long mo10995Wl() {
        return Long.valueOf(C12953c.m12400i());
    }

    /* renamed from: a */
    public final C10757d mo11733a(FragmentActivity fragmentActivity, C10761g gVar) {
        if (gVar.f32228g == C10760f.DIRECT_CHARGE) {
            if (fragmentActivity == null || TextUtils.isEmpty(gVar.f32227f)) {
                Log.m105920e("MicroMsg.WeCoinManagerImplement", "DirectRecharge productInfo is invalid.");
                ((C119157j) C119157j.f356862d).mo183895z(new C11860w(this, gVar));
            } else {
                C11862y.f34681e.mo11738d(fragmentActivity, gVar);
            }
            return null;
        } else if (fragmentActivity != null) {
            return new C12041a(fragmentActivity, gVar);
        } else {
            return null;
        }
    }

    /* renamed from: d4 */
    public void mo10996d4(C10762h<Long> hVar) {
        new C11122e().mo9225i().mo123062e(new C11858d(this, hVar));
    }

    /* renamed from: dF */
    public void mo10997dF(LinkedList<Integer> linkedList, C10762h<C48643a02> hVar) {
        new C11121d(linkedList).mo9225i().mo123062e(new C11856b(this, hVar));
    }

    /* renamed from: j3 */
    public boolean mo10998j3() {
        return "CN".equalsIgnoreCase(C86709a0.m107535s().mo121142i().mo119674H(274436, "CN")) || (C75592q0.m90780j() & 8) != 0;
    }

    public C10757d q10(FragmentActivity fragmentActivity, C10761g gVar) {
        Log.m105924i("MicroMsg.WeCoinManagerImplement", "prepareWeCoinRecharge");
        if (gVar.f32231j) {
            String uuid = UUID.randomUUID().toString();
            C87412m.m108593f(uuid, "randomUUID().toString()");
            C10765k.f32240b = uuid;
            C10765k.f32239a = gVar.f32223b;
        }
        if (mo10998j3()) {
            return mo11733a(fragmentActivity, gVar);
        }
        MMActivity mMActivity = (MMActivity) fragmentActivity;
        C11855a aVar = new C11855a(fragmentActivity, gVar);
        Log.m105924i("MicroMsg.WeCoinManagerImplement", "showWecoinAuthDialog");
        if (mMActivity == null) {
            return null;
        }
        ((C15907f) C86312j.m106911c(C15907f.class)).mo14557hz(mMActivity, 8, true, new C11853t(this, aVar));
        return null;
    }

    /* renamed from: qy */
    public void mo11000qy(C10762h<C50943qc2> hVar) {
        new C11125h().mo9225i().mo123062e(new C11859v(this, hVar));
    }

    public void xa0(Context context, String str) {
        mo10991F3(context, str, 1, false, "");
    }
}
