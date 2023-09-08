package ao1;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import bl3.C54492n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderProfileUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicFeedUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderSelfUI;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import er1.C58784w3;
import er1.C7779a2;
import er1.C7907w1;
import er1.C7921x1;
import er1.C7925y1;
import er1.C7927z1;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import qo3.C77389a;
import qo3.C77426q;
import qo3.C89779i0;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C50119ke1;
import te3.C52261zg3;
import tf0.C64916p1;
import up1.C37521f;
import zc1.C66785b;

/* renamed from: ao1.d1 */
public final class C0145d1 extends UIComponent implements C11385n {

    /* renamed from: d */
    public C50119ke1 f576d;

    /* renamed from: e */
    public boolean f577e;

    /* renamed from: f */
    public boolean f578f;

    /* renamed from: g */
    public C89779i0 f579g;

    /* renamed from: h */
    public C32224a<C13598b0> f580h;

    /* renamed from: i */
    public List<? extends Class<? extends Activity>> f581i = C64197v.m75537f(FinderTopicFeedUI.class, FinderSelfUI.class, FinderProfileUI.class);

    /* renamed from: j */
    public final Vector<C32228q<Integer, Integer, C50119ke1, C13598b0>> f582j = new Vector<>();

    /* renamed from: ao1.d1$a */
    public static final class C0146a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C0145d1 f583d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f584e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0146a(C0145d1 d1Var, C32224a<C13598b0> aVar) {
            super(0);
            this.f583d = d1Var;
            this.f584e = aVar;
        }

        public Object invoke() {
            this.f583d.f576d = null;
            C32224a<C13598b0> aVar = this.f584e;
            if (aVar != null) {
                aVar.invoke();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0145d1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo135c3(int i, int i2, String str, C50119ke1 ke12) {
        boolean z;
        C89779i0 i0Var;
        Log.m105924i(C54492n.TAG, "errType:" + i + " , errCode:" + i2);
        boolean z2 = false;
        this.f577e = false;
        if (i == 0 && i2 == 0) {
            this.f576d = ke12;
            C89779i0 i0Var2 = this.f579g;
            if (i0Var2 != null && i0Var2.isShowing()) {
                Log.m105924i(C54492n.TAG, "loadingDialog is showing");
                C32224a<C13598b0> aVar = this.f580h;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            z = false;
        } else {
            C76912y0.makeText((Context) getActivity(), (int) C0966R.string.f360472d33, 0).show();
            z = true;
        }
        this.f578f = z;
        C89779i0 i0Var3 = this.f579g;
        if (i0Var3 != null && i0Var3.isShowing()) {
            z2 = true;
        }
        if (z2 && (i0Var = this.f579g) != null) {
            i0Var.dismiss();
        }
        for (C32228q invoke : this.f582j) {
            invoke.invoke(Integer.valueOf(i), Integer.valueOf(i2), this.f578f ? null : this.f576d);
        }
    }

    /* renamed from: d3 */
    public final boolean mo136d3(C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2) {
        boolean z;
        T t;
        FinderContact finderContact;
        FinderAuthInfo finderAuthInfo;
        C87412m.m108594g(aVar, "whenPreCheckReConnect");
        this.f580h = aVar;
        C50119ke1 ke12 = this.f576d;
        boolean z2 = true;
        Integer num = null;
        if (ke12 != null) {
            C7907w1 w1Var = C7907w1.f26566d;
            AppCompatActivity activity = getActivity();
            C0146a aVar3 = new C0146a(this, aVar2);
            w1Var.getClass();
            C87412m.m108594g(activity, "context");
            C37521f.f99374d.getClass();
            if (C37521f.f99466n5.mo60266n().intValue() == 1) {
                Log.m105924i(C7907w1.f26567e, "ignore all pre check");
                z = true;
            } else {
                int i = C66785b.f191882e.mo90673n0().mo62398d().f141692x;
                int intValue = C37521f.f99485p5.mo60266n().intValue();
                boolean z3 = intValue == 0 ? !C61926c.m72696u(i, 1) : !(intValue != 1 && (intValue == 2 || C61926c.m72696u(i, 1)));
                boolean a = w1Var.mo9028a();
                boolean Z0 = C58784w3.f168295a.mo83913Z0();
                LinkedList<C52261zg3> linkedList = ke12.f136709z;
                if (linkedList != null) {
                    Iterator<T> it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        FinderContact finderContact2 = ((C52261zg3) t).f145918e;
                        if (C87412m.m108589b(finderContact2 != null ? finderContact2.username : null, C66785b.f191882e.mo90662O5())) {
                            break;
                        }
                    }
                    C52261zg3 zg32 = (C52261zg3) t;
                    if (!(zg32 == null || (finderContact = zg32.f145918e) == null || (finderAuthInfo = finderContact.authInfo) == null)) {
                        num = Integer.valueOf(finderAuthInfo.authIconType);
                    }
                }
                String str = C7907w1.f26567e;
                Log.m105924i(str, "[preCheck] hasRealName:" + z3 + " , hasBindPhone:" + a + " isForeignUser:" + Z0 + ", authType:" + num);
                if (z3 || (num != null && num.intValue() == 2)) {
                    z = w1Var.mo9029b(activity, Integer.valueOf(C7907w1.f26569g), aVar3);
                } else {
                    if (num != null && num.intValue() == 1) {
                        C77426q qVar = new C77426q(activity);
                        qVar.mo107606r(activity.getString(C0966R.string.eih));
                        qVar.mo107595g(activity.getString(C0966R.string.eid));
                        qVar.mo107589a(true);
                        qVar.mo107602n(activity.getString(C0966R.string.eif));
                        qVar.mo107598j(activity.getString(C0966R.string.d4u));
                        qVar.mo107600l(new C7921x1(activity, aVar3));
                        qVar.mo107603o();
                    } else if (num != null && num.intValue() == 0) {
                        C77426q qVar2 = new C77426q(activity);
                        qVar2.mo107606r(activity.getString(C0966R.string.eii));
                        qVar2.mo107595g(activity.getString(C0966R.string.eie));
                        String string = activity.getString(C0966R.string.eif);
                        String string2 = activity.getString(C0966R.string.eig);
                        String string3 = activity.getString(C0966R.string.d4u);
                        C77389a aVar4 = qVar2.f225837a.f225714b;
                        aVar4.f225665v = string;
                        aVar4.f225666w = string2;
                        aVar4.f225667x = string3;
                        C7925y1 y1Var = new C7925y1(activity, aVar3);
                        C7927z1 z1Var = new C7927z1(activity, aVar3);
                        C7779a2 a2Var = C7779a2.f26279d;
                        aVar4.f225624G = y1Var;
                        aVar4.f225625H = z1Var;
                        aVar4.f225626I = a2Var;
                        qVar2.mo107603o();
                    } else {
                        z = w1Var.mo9029b(activity, Integer.valueOf(C7907w1.f26569g), aVar3);
                    }
                    z = false;
                }
                Log.m105924i(str, "[preCheck] result:" + z);
            }
            if (!z) {
                Log.m105924i(C54492n.TAG, "preCheck interrupt");
                z2 = false;
            }
            return z2;
        }
        Log.m105924i(C54492n.TAG, "prepareResp null,isNetSceneFailed:" + this.f578f + " , isNetScenePending:" + this.f577e);
        if (this.f578f) {
            C76912y0.makeText((Context) getActivity(), (int) C0966R.string.f360472d33, 0).show();
            return false;
        } else if (!this.f577e) {
            return false;
        } else {
            this.f579g = C89779i0.m112248e(getActivity(), getString(C0966R.string.a4d), true, 3, (DialogInterface.OnCancelListener) null);
            return false;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(7289, this);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f582j.clear();
        C86709a0.m107524d().mo123470p(7289, this);
    }

    public void onResume() {
        super.onResume();
        if (this.f576d == null) {
            this.f577e = true;
            if (!this.f581i.contains(getActivity().getClass())) {
                C7335d c = C86312j.m106911c(C64916p1.class);
                C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                C64916p1.C64917a.m76437d((C64916p1) c, 8, (C32226l) null, 2, (Object) null);
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C50119ke1 ke12 = null;
        C114799u reqResp = yVar != null ? yVar.getReqResp() : null;
        C47350c cVar = reqResp instanceof C47350c ? (C47350c) reqResp : null;
        C47465a aVar = cVar != null ? cVar.f127056b.f127083a : null;
        if (aVar instanceof C50119ke1) {
            ke12 = (C50119ke1) aVar;
        }
        mo135c3(i, i2, str, ke12);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0145d1(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
