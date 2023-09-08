package p396x6;

import android.content.Context;
import android.os.Handler;
import androidx.camera.core.FocusMeteringAction;
import java.util.ArrayList;
import p289a7.C16433b;
import p289a7.C16435d;
import p337f8.C20681c;
import p337f8.C20694l;
import p353k7.C21306c;
import p355l7.C21396d;
import p383t7.C22449j;
import p401y6.C118940c;
import p401y6.C23227d;
import p401y6.C23233i;
import p401y6.C23247n;

/* renamed from: x6.d */
public class C22996d implements C23022t {

    /* renamed from: a */
    public final Context f66079a;

    public C22996d(Context context) {
        this(context, (C16433b<C16435d>) null, 0);
    }

    /* renamed from: a */
    public C23019q[] mo36259a(Handler handler, C20694l lVar, C23233i iVar, C22449j.C22450a aVar, C21396d.C21397a aVar2) {
        ArrayList arrayList = new ArrayList();
        Context context = this.f66079a;
        C21306c cVar = C21306c.f60206a;
        arrayList.add(new C20681c(context, cVar, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, (C16433b<C16435d>) null, false, handler, lVar, 50));
        C21306c cVar2 = cVar;
        Handler handler2 = handler;
        C23233i iVar2 = iVar;
        arrayList.add(new C23247n(cVar2, (C16433b<C16435d>) null, true, handler2, iVar2, C118940c.m167684a(this.f66079a), new C23227d[0]));
        arrayList.add(new C22449j(aVar, handler.getLooper()));
        arrayList.add(new C21396d(aVar2, handler.getLooper()));
        return (C23019q[]) arrayList.toArray(new C23019q[arrayList.size()]);
    }

    public C22996d(Context context, C16433b<C16435d> bVar, int i) {
        this.f66079a = context;
    }
}
