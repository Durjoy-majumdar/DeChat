package com.tencent.matrix.batterycanary.monitor.feature;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.xweb.file.XVFSFile;
import p1177ce.C113314g;
import p1195ge.C116947b;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.l */
public class C114506l implements C114467i.C114482o.C114483a {

    /* renamed from: a */
    public final /* synthetic */ C114490k0.C114491a.C114492a f343237a;

    /* renamed from: b */
    public final /* synthetic */ C114508m f343238b;

    public C114506l(C114508m mVar, C114490k0.C114491a.C114492a aVar) {
        this.f343238b = mVar;
        this.f343237a = aVar;
    }

    /* renamed from: a */
    public long mo173684a(String str) {
        C116947b.C116948a aVar = (C116947b.C116948a) this.f343237a.f343207c;
        if (str == null) {
            return ((Long) aVar.f350501v.f343211a).longValue() + ((Long) aVar.f350503w.f343211a).longValue();
        }
        C113314g gVar = this.f343238b.f343239a.f343255b.f343294d.f343162k;
        long j = 0;
        if (gVar == null) {
            return 0;
        }
        String packageName = gVar.mo165879a().getPackageName();
        if (FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT.equals(str)) {
            packageName = this.f343238b.f343239a.f343255b.f343294d.f343162k.mo165879a().getPackageName() + XVFSFile.PATH_SEPARATOR + str;
        }
        C114490k0.C114491a.C114494b.C114497b bVar = aVar.f350500u0.get(packageName);
        C114490k0.C114491a.C114494b.C114497b bVar2 = aVar.f350502v0.get(packageName);
        long longValue = bVar == null ? 0 : ((Long) bVar.f343211a).longValue();
        if (bVar2 != null) {
            j = ((Long) bVar2.f343211a).longValue();
        }
        return longValue + j;
    }
}
