package o53;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import m53.C10762h;
import q53.C12049b0;
import s43.C13620a;
import s43.C13622c;

/* renamed from: o53.a */
public final class C11355a implements C10762h<Void> {

    /* renamed from: a */
    public final /* synthetic */ C11367m f33450a;

    public C11355a(C11367m mVar) {
        this.f33450a = mVar;
    }

    /* renamed from: a */
    public void mo605a(int i, int i2, String str) {
        Log.m105925i("WeCoinConsumeLogic", "onFailed,errorType:%s,errorCode:%s, msg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i2 == -3) {
            C12049b0 b0Var = this.f33450a.f33469c;
            if (b0Var == null) {
                C87412m.m108603p("consumePanel");
                throw null;
            } else if (!b0Var.f35096c.mo12466f()) {
                Log.m105920e("WeCoinConsumeLogic", "call cancel");
                C11367m.m11183a(this.f33450a);
            }
        } else {
            this.f33450a.mo11380b(new C13620a(C13622c.Default));
        }
    }

    public void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        this.f33450a.mo11381c();
    }
}
