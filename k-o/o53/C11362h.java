package o53;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import m53.C10762h;
import n53.C11125h;
import q53.C12049b0;
import qo3.C89779i0;
import s43.C13620a;
import s43.C13622c;
import s43.C13623d;
import s43.C13624e;

/* renamed from: o53.h */
public final class C11362h implements C10762h<Void> {

    /* renamed from: a */
    public final /* synthetic */ C11367m f33458a;

    public C11362h(C11367m mVar) {
        this.f33458a = mVar;
    }

    /* renamed from: a */
    public void mo605a(int i, int i2, String str) {
        Log.m105925i("WeCoinConsumeLogic", "onFailed,errorType:%s,errorCode:%s, msg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i2 == -3) {
            C12049b0 b0Var = this.f33458a.f33469c;
            if (b0Var == null) {
                C87412m.m108603p("consumePanel");
                throw null;
            } else if (!b0Var.f35096c.mo12466f()) {
                C11367m.m11183a(this.f33458a);
            }
        } else {
            this.f33458a.mo11380b(new C13620a(C13622c.Default));
        }
    }

    public void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        C11367m mVar = this.f33458a;
        mVar.getClass();
        Log.m105924i("WeCoinConsumeLogic", "showConsumePanel");
        C13624e eVar = mVar.f33467a;
        if (eVar.f38602f == C13623d.ShowPanel) {
            FragmentActivity fragmentActivity = eVar.f38598b;
            mVar.f33468b = C89779i0.m112248e(fragmentActivity, fragmentActivity.getString(C0966R.string.gas), false, 3, (DialogInterface.OnCancelListener) null);
        }
        new C11125h().mo9225i().mo123062e(new C11365k(mVar));
    }
}
