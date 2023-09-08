package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C114451e;
import com.tencent.matrix.batterycanary.monitor.feature.C114519q0;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import p981ie.C117187w;
import p981ie.C87705i;

/* renamed from: xe.d$$a */
public final /* synthetic */ class d$$a implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C118873d f355638a;

    /* renamed from: b */
    public final /* synthetic */ long f355639b;

    /* renamed from: c */
    public final /* synthetic */ long f355640c;

    /* renamed from: d */
    public final /* synthetic */ C114519q0.C114524d.C114526b f355641d;

    public /* synthetic */ d$$a(C118873d dVar, long j, long j2, C114519q0.C114524d.C114526b bVar) {
        this.f355638a = dVar;
        this.f355639b = j;
        this.f355640c = j2;
        this.f355641d = bVar;
    }

    public final void accept(Object obj) {
        C118873d dVar = this.f355638a;
        long j = this.f355639b;
        long j2 = this.f355640c;
        C114519q0.C114524d.C114526b bVar = this.f355641d;
        C114451e eVar = (C114451e) obj;
        dVar.getClass();
        C114451e.C114458h i = eVar.mo173652i(j);
        if (i.f343204c) {
            long longValue = ((Long) i.f343146f.f343211a).longValue();
            C117187w.C117192d.C117193a b = eVar.mo173653j(j).mo181114b();
            if (b != null) {
                dVar.f338986e.mo173671o(C114536x.class, new d$$d(j, j2, bVar, longValue, b.f351077a, (long) b.f351078b));
            }
        }
    }
}
