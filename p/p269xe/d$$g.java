package p269xe;

import android.os.Process;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import p1177ce.C113287a;
import p981ie.C87705i;

/* renamed from: xe.d$$g */
public final /* synthetic */ class d$$g implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C113287a f355661a;

    /* renamed from: b */
    public final /* synthetic */ C114490k0.C114491a.C114492a f355662b;

    public /* synthetic */ d$$g(C113287a aVar, C114490k0.C114491a.C114492a aVar2) {
        this.f355661a = aVar;
        this.f355662b = aVar2;
    }

    public final void accept(Object obj) {
        ((JiffiesMonitorFeature) obj).mo173611j(this.f355661a.mo165844h(), Process.myPid(), ((JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesSnapshot) ((JiffiesMonitorFeature.JiffiesSnapshot) this.f355662b.f343207c).f343063h.f343212a.get(0)).f343066b);
    }
}
