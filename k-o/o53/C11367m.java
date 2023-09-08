package o53;

import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114766b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hp3.C87581a;
import n53.C11119b;
import ob0.C89132b;
import pe3.C89349b;
import q53.C12049b0;
import qo3.C89779i0;
import r53.C12953c;
import rx3.C13598b0;
import s43.C13620a;
import s43.C13621b;
import s43.C13622c;
import s43.C13623d;
import s43.C13624e;
import te3.C48932c00;
import te3.C49286eh3;
import te3.C49966ja;
import te3.C50182ku3;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: o53.m */
public final class C11367m {

    /* renamed from: a */
    public final C13624e f33467a;

    /* renamed from: b */
    public C89779i0 f33468b;

    /* renamed from: c */
    public C12049b0 f33469c;

    /* renamed from: o53.m$a */
    public static final class C11368a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C11367m f33470a;

        /* renamed from: b */
        public final /* synthetic */ C49286eh3 f33471b;

        public C11368a(C11367m mVar, C49286eh3 eh32) {
            this.f33470a = mVar;
            this.f33471b = eh32;
        }

        public Object call(Object obj) {
            C50182ku3 ku32;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("WeCoinConsumeLogic", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b), cVar.f256795c);
            C48932c00 c002 = (C48932c00) cVar.f256796d;
            if (C12953c.m12397f(cVar)) {
                C115669n.INSTANCE.mo175911u(1581, 75);
                int i = cVar.f256794b;
                if (i != 10001 || c002 == null || (ku32 = c002.f131418e) == null) {
                    if (i == 10003) {
                        this.f33470a.mo11380b(new C13620a(C13622c.NoMoney));
                    } else {
                        this.f33470a.mo11380b(new C13620a(C13622c.Default));
                    }
                    return C13598b0.f38549a;
                }
                Log.m105925i("WeCoinConsumeLogic", "retry, retry time: %s", Integer.valueOf(ku32.f137050d));
                return C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C11366l(c002, this.f33470a, this.f33471b, (C15601d<? super C11366l>) null), 3, (Object) null);
            }
            C115669n.INSTANCE.mo175911u(1581, 74);
            Log.m105925i("WeCoinConsumeLogic", "success, balance: %s", Long.valueOf(c002.f131417d));
            C12953c.m12403l(c002.f131417d);
            C11367m mVar = this.f33470a;
            long j = c002.f131417d;
            mVar.getClass();
            Log.m105924i("WeCoinConsumeLogic", "success");
            mVar.mo11382d();
            mVar.f33467a.f38599c.invoke(new C13621b(j));
            return C13598b0.f38549a;
        }
    }

    public C11367m(C13624e eVar) {
        C87412m.m108594g(eVar, "parameter");
        this.f33467a = eVar;
    }

    /* renamed from: a */
    public static final void m11183a(C11367m mVar) {
        mVar.getClass();
        Log.m105924i("WeCoinConsumeLogic", "cancel");
        mVar.mo11382d();
        mVar.f33467a.f38601e.invoke();
    }

    /* renamed from: b */
    public final void mo11380b(C13620a aVar) {
        Log.m105924i("WeCoinConsumeLogic", "fail");
        mo11382d();
        this.f33467a.f38600d.invoke(aVar);
    }

    /* renamed from: c */
    public final void mo11381c() {
        C13622c cVar = C13622c.Default;
        Log.m105924i("WeCoinConsumeLogic", "directConsume");
        C13624e eVar = this.f33467a;
        if (eVar.f38602f == C13623d.ShowPanel) {
            FragmentActivity fragmentActivity = eVar.f38598b;
            this.f33468b = C89779i0.m112248e(fragmentActivity, fragmentActivity.getString(C0966R.string.gas), false, 3, (DialogInterface.OnCancelListener) null);
        }
        if (this.f33467a.f38603g == null) {
            Log.m105920e("WeCoinConsumeLogic", "contextBuff == null");
            mo11380b(new C13620a(cVar));
            return;
        }
        C49286eh3 eh32 = new C49286eh3();
        try {
            eh32.parseFrom(this.f33467a.f38603g);
            C12953c.m12402k("WeCoinConsumeLogic", eh32);
            C49966ja jaVar = eh32.BaseResponse;
            if (jaVar == null || jaVar.f135955d == 0) {
                mo11383e(eh32);
                return;
            }
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175911u(1581, 72);
            if (eh32.f132929f != null) {
                Log.m105924i("WeCoinConsumeLogic", "consumeWeCoin intercept_info is not null");
                nVar.mo175911u(1581, 77);
                C12953c.m12396e(this.f33467a.f38598b, eh32.f132929f, new C11361g(this, eh32));
            } else if (jaVar.f135955d == 10003) {
                mo11380b(new C13620a(C13622c.NoMoney));
            } else {
                mo11380b(new C13620a(cVar));
            }
        } catch (Exception e) {
            C115669n.INSTANCE.mo175911u(1581, 72);
            Log.m105921e("WeCoinConsumeLogic", "parse failed, exception: %s", e.getMessage());
            mo11380b(new C13620a(cVar));
        }
    }

    /* renamed from: d */
    public final void mo11382d() {
        if (this.f33467a.f38602f == C13623d.ShowPanel) {
            C89779i0 i0Var = this.f33468b;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            this.f33468b = null;
        }
    }

    /* renamed from: e */
    public final void mo11383e(C49286eh3 eh32) {
        C13622c cVar = C13622c.Default;
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175911u(1581, 71);
        C89349b bVar = eh32.f132927d;
        if (bVar == null) {
            nVar.mo175911u(1581, 72);
            Log.m105920e("WeCoinConsumeLogic", "contextByteString is null");
            mo11380b(new C13620a(cVar));
            return;
        }
        nVar.mo175911u(1581, 73);
        byte[] d = C114766b.f344135e.mo174419d(bVar.f257327a);
        if (d == null) {
            Log.m105920e("WeCoinConsumeLogic", "signData is null");
            nVar.mo175911u(1581, 76);
            nVar.mo175911u(1581, 75);
            mo11380b(new C13620a(cVar));
            return;
        }
        new C11119b(bVar, new C89349b(d, 0, d.length)).mo9225i().mo123062e(new C11368a(this, eh32));
    }
}
