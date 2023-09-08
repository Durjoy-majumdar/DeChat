package d60;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44660i2;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import i60.C33210j;
import java.util.ArrayList;
import java.util.List;
import o40.C61926c;
import p740wo.C53193b;
import p922vj.C78420a;
import rx3.C13598b0;

/* renamed from: d60.y1 */
public final class C58232y1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C32226l<List<C33210j>, C13598b0> f166756d;

    /* renamed from: d60.y1$a */
    public static final class C58233a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<List<C33210j>, C13598b0> f166757d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<C33210j> f166758e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58233a(C32226l<? super List<C33210j>, C13598b0> lVar, ArrayList<C33210j> arrayList) {
            super(0);
            this.f166757d = lVar;
            this.f166758e = arrayList;
        }

        public Object invoke() {
            this.f166757d.invoke(this.f166758e);
            return C13598b0.f38549a;
        }
    }

    public C58232y1(C32226l<? super List<C33210j>, C13598b0> lVar) {
        this.f166756d = lVar;
    }

    public final void run() {
        C30783v3 Ku = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku();
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C78420a.f229768m1;
        Cursor R = ((C44660i2) Ku).mo69747R(5, (List<String>) null, (String) null, true, "");
        ArrayList arrayList = new ArrayList();
        while (R.moveToNext()) {
            String string = R.getString(R.getColumnIndex("username"));
            int p1 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(string);
            C87412m.m108593f(string, "name");
            arrayList.add(new C33210j(string, p1));
        }
        C61926c.m72668M(new C58233a(this.f166756d, arrayList));
    }
}
