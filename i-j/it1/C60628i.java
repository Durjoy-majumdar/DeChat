package it1;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import it1.C60625c;
import it1.C9247b;
import kj2.C117407d;
import kt1.C46744d;
import kt1.C61169f;
import kt1.C61170g;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONObject;
import ot1.C11767a;
import qo3.C77426q;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;

/* renamed from: it1.i */
public abstract class C60628i extends C117747y implements C1311n, C61170g {

    /* renamed from: d */
    public final C49712hj1 f172736d;

    /* renamed from: e */
    public C9247b f172737e;

    /* renamed from: f */
    public final C13601g f172738f;

    /* renamed from: it1.i$a */
    public static final class C60629a extends C87413o implements C32224a<C61169f> {

        /* renamed from: d */
        public final /* synthetic */ C60628i f172739d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60629a(C60628i iVar) {
            super(0);
            this.f172739d = iVar;
        }

        public Object invoke() {
            return new C61169f(this.f172739d);
        }
    }

    public C60628i() {
        this((C49712hj1) null, 1, (C8480h) null);
    }

    public C60628i(C49712hj1 hj12) {
        this.f172736d = hj12;
        C13601g a = C36568h.m40985a(new C60629a(this));
        this.f172738f = a;
        if (hj12 != null) {
            Log.m105924i("Finder.NetSceneFinderBase", "Create commentScene:" + hj12.f134675i + " fromCommentScene:" + hj12.f134677n);
            ((C61169f) ((C36570n) a).getValue()).f174150j = hj12.f134677n;
        }
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Default;
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return null;
    }

    /* renamed from: R0 */
    public JSONObject mo8510R0() {
        return null;
    }

    public void cancel() {
        C9247b bVar = this.f172737e;
        if (bVar != null) {
            bVar.mo8913b();
        }
        super.cancel();
    }

    public int dispatch(C114770g gVar, C114799u uVar, C1311n nVar) {
        C9247b bVar = this.f172737e;
        if (bVar != null) {
            bVar.begin();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[dispatchCgi] ");
        C47350c cVar = null;
        sb.append(uVar != null ? uVar.getUri() : null);
        Log.m105924i("Finder.NetSceneFinderBase", sb.toString());
        C61169f fVar = (C61169f) ((C36570n) this.f172738f).getValue();
        if (uVar instanceof C47350c) {
            cVar = (C47350c) uVar;
        }
        fVar.mo86106c(cVar);
        C60625c.C60626a aVar = C60625c.f172729q;
        C49712hj1 hj12 = this.f172736d;
        C60625c.f172730r.put(hj12 != null ? hj12.f134675i : 0, Long.valueOf(C31543z5.m39453c()));
        return super.dispatch(gVar, uVar, nVar);
    }

    /* renamed from: j1 */
    public final C60628i mo85584j1(Context context, String str, long j) {
        C87412m.m108594g(context, "context");
        this.f172737e = C9247b.C9248a.m8889a(C9247b.f28989d, context, str, j, (DialogInterface.OnCancelListener) null, 8, (Object) null);
        return this;
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        C114799u uVar2 = uVar;
        Class cls = C60200t1.class;
        C61169f fVar = (C61169f) ((C36570n) this.f172738f).getValue();
        fVar.f174146f = fVar.f174145e.mo72288a();
        C9247b bVar = this.f172737e;
        if (bVar != null) {
            bVar.mo8913b();
        }
        if (i4 == 4 && i5 == -4019) {
            if (str2 != null) {
                C77426q qVar = new C77426q(((C60200t1) C86312j.m106911c(cls)).mo76771JP());
                qVar.mo107595g(str2);
                qVar.mo107601m(C0966R.string.lkg);
                qVar.mo107589a(true);
                qVar.mo107600l(C11767a.C11768a.f34454a);
                qVar.mo107603o();
            }
            C117407d.INSTANCE.idkeyStat(1264, 6, 1, false);
        }
        if (i4 == 4 && ((i5 == -5300 || i5 == -5000) && str2 != null)) {
            C77426q qVar2 = new C77426q(((C60200t1) C86312j.m106911c(cls)).mo76771JP());
            qVar2.mo107595g(str2);
            qVar2.mo107601m(C0966R.string.lkg);
            qVar2.mo107589a(true);
            qVar2.mo107600l(C11767a.C11768a.f34454a);
            qVar2.mo107603o();
        }
        mo8516k1(i, i2, i3, str, uVar, bArr);
        C61169f fVar2 = (C61169f) ((C36570n) this.f172738f).getValue();
        fVar2.f174147g = fVar2.f174145e.mo72288a();
        ((C61169f) ((C36570n) this.f172738f).getValue()).mo86104a(i4, i5, str2, uVar2 instanceof C47350c ? (C47350c) uVar2 : null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C60628i(C49712hj1 hj12, int i, C8480h hVar) {
        this((i & 1) != 0 ? null : hj12);
    }
}
