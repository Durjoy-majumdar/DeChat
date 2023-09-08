package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C114451e;
import com.tencent.matrix.batterycanary.monitor.feature.C114519q0;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import p981ie.C117187w;
import p981ie.C87705i;

/* renamed from: xe.d$$b */
public final /* synthetic */ class d$$b implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C118873d f355642a;

    /* renamed from: b */
    public final /* synthetic */ long f355643b;

    /* renamed from: c */
    public final /* synthetic */ int f355644c;

    /* renamed from: d */
    public final /* synthetic */ C114519q0.C114524d.C114526b f355645d;

    public /* synthetic */ d$$b(C118873d dVar, long j, int i, C114519q0.C114524d.C114526b bVar) {
        this.f355642a = dVar;
        this.f355643b = j;
        this.f355644c = i;
        this.f355645d = bVar;
    }

    public final void accept(Object obj) {
        C118873d dVar = this.f355642a;
        long j = this.f355643b;
        int i = this.f355644c;
        C114519q0.C114524d.C114526b bVar = this.f355645d;
        C114451e eVar = (C114451e) obj;
        dVar.getClass();
        C114451e.C114458h i2 = eVar.mo173652i(j);
        if (i2.f343204c) {
            long longValue = ((Long) i2.f343146f.f343211a).longValue();
            C117187w.C117192d.C117193a b = eVar.mo173653j(j).mo181114b();
            if (b != null) {
                dVar.f338986e.mo173671o(C114536x.class, new d$$e(j, i, bVar, longValue, b.f351077a, (long) b.f351078b));
            }
        }
    }
}
