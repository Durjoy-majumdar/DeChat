package k11;

import android.content.DialogInterface;
import android.os.CancellationSignal;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81427p;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanCacheUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8479f0;
import gy3.C87412m;
import i11.C98581d;
import i11.C98584f;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import nj3.C76879j;
import qo3.C47883u;
import qo3.C77426q;
import qo3.C89779i0;
import sx3.C64187h0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: k11.g */
public final class C9551g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CleanCacheUI f29744d;

    /* renamed from: k11.g$a */
    public static final class C9552a implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ CleanCacheUI f29745a;

        public C9552a(CleanCacheUI cleanCacheUI, boolean z) {
            this.f29745a = cleanCacheUI;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            Collection collection;
            Collection collection2;
            CleanCacheUI cleanCacheUI = this.f29745a;
            int i = CleanCacheUI.f312121r;
            cleanCacheUI.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            C108809b bVar = cleanCacheUI.f312123e;
            C87412m.m108591d(bVar);
            int i2 = cleanCacheUI.f312124f ? 1 : 2;
            byte[] bArr = new byte[16];
            for (int i3 = 0; i3 < 16; i3++) {
                bArr[i3] = Byte.MAX_VALUE;
            }
            int length = bVar.f325822f.length;
            for (int i4 = 0; i4 < length; i4++) {
                if (bVar.f325822f[i4]) {
                    for (Integer intValue : C88070q.f254721a[i4]) {
                        bArr[intValue.intValue()] = (byte) i2;
                    }
                }
            }
            long f = bVar.mo159908f();
            ArrayList arrayList = new ArrayList();
            C8479f0 f0Var = new C8479f0();
            Collection collection3 = C64187h0.f181908d;
            C8479f0 f0Var2 = new C8479f0();
            if (bVar.f325822f[3]) {
                CancellationSignal cancellationSignal = cleanCacheUI.f312126h;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                f0Var2.f27484d = C88069n.f254720d;
            } else if (bVar.f325826j[3] != null) {
                for (C108808a aVar : bVar.mo159907e(3, true)) {
                    T t = aVar.f325819d;
                    if (t == null) {
                        C8479f0 f0Var3 = f0Var2;
                        long j = aVar.f325816a;
                        if (j == -1) {
                            arrayList.addAll(cleanCacheUI.f312127i);
                            collection2 = collection3;
                            f0Var2 = f0Var3;
                        } else if (j == -2) {
                            bArr[6] = (byte) (cleanCacheUI.f312124f ? 1 : 2);
                            collection3 = C88070q.f254723c;
                            f0Var2 = f0Var3;
                            f0Var2.f27484d = C88068m.f254719d;
                        } else {
                            f0Var2 = f0Var3;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid special ID: ");
                            collection2 = collection3;
                            sb.append(aVar.f325816a);
                            Log.m105920e("MicroMsg.CleanCacheUI", sb.toString());
                        }
                    } else {
                        collection2 = collection3;
                        arrayList.add(((C81427p) t).f238965a);
                    }
                    collection3 = collection2;
                }
                f0Var.f27484d = bVar.mo159907e(3, false);
                collection = collection3;
                Collection collection4 = collection;
                C89779i0 Q = C76879j.m92723Q(cleanCacheUI, cleanCacheUI.getString(C0966R.string.a3h), cleanCacheUI.getString(C0966R.string.bea), false, false, (DialogInterface.OnCancelListener) null);
                C119179t tVar = C119157j.f356862d;
                C108821o oVar = new C108821o(bVar, f0Var2);
                C108822p pVar = new C108822p(arrayList, bArr, cleanCacheUI, bVar, currentTimeMillis, f, Q, f0Var, false);
                C64187h0 h0Var = C64187h0.f181908d;
                Collection collection5 = collection4;
                C87412m.m108594g(collection5, "forceKeepSelfAccountFs");
                C98584f fVar = new C98584f(h0Var, collection5, h0Var, h0Var, h0Var, h0Var, bArr, ((long) 120000) + System.currentTimeMillis(), pVar);
                ((C119157j) tVar).mo183875f(new C98581d(fVar, true, fVar, (com.tencent.wcdb.support.CancellationSignal) null, oVar));
            }
            collection = collection3;
            Collection collection42 = collection;
            C89779i0 Q2 = C76879j.m92723Q(cleanCacheUI, cleanCacheUI.getString(C0966R.string.a3h), cleanCacheUI.getString(C0966R.string.bea), false, false, (DialogInterface.OnCancelListener) null);
            C119179t tVar2 = C119157j.f356862d;
            C108821o oVar2 = new C108821o(bVar, f0Var2);
            C108822p pVar2 = new C108822p(arrayList, bArr, cleanCacheUI, bVar, currentTimeMillis, f, Q2, f0Var, false);
            C64187h0 h0Var2 = C64187h0.f181908d;
            Collection collection52 = collection42;
            C87412m.m108594g(collection52, "forceKeepSelfAccountFs");
            C98584f fVar2 = new C98584f(h0Var2, collection52, h0Var2, h0Var2, h0Var2, h0Var2, bArr, ((long) 120000) + System.currentTimeMillis(), pVar2);
            ((C119157j) tVar2).mo183875f(new C98581d(fVar2, true, fVar2, (com.tencent.wcdb.support.CancellationSignal) null, oVar2));
        }
    }

    public C9551g(CleanCacheUI cleanCacheUI) {
        this.f29744d = cleanCacheUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI$initUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = Integer.valueOf(C0966R.string.f8049aw);
        Integer valueOf2 = Integer.valueOf(C0966R.string.bdu);
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        C77426q qVar = new C77426q(this.f29744d);
        CleanCacheUI cleanCacheUI = this.f29744d;
        qVar.mo107599k(cleanCacheUI.getResources().getColor(C0966R.color.f3041d1));
        qVar.mo107601m(intValue);
        qVar.mo107595g(cleanCacheUI.getString(intValue2));
        qVar.mo107600l(new C9552a(cleanCacheUI, false));
        qVar.mo107597i((C47883u) null);
        qVar.mo107603o();
        C117292a.m165361g(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI$initUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
