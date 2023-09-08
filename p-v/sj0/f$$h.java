package sj0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import sj0.C90203b;
import xj0.C91216b0;
import xj0.C91237o;

public final /* synthetic */ class f$$h implements C91216b0 {

    /* renamed from: a */
    public final /* synthetic */ C90210f f259001a;

    /* renamed from: b */
    public final /* synthetic */ C90203b.C90205b f259002b;

    /* renamed from: c */
    public final /* synthetic */ C90203b.C90205b f259003c;

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f259004d;

    /* renamed from: e */
    public final /* synthetic */ int f259005e;

    public /* synthetic */ f$$h(C90210f fVar, C90203b.C90205b bVar, C90203b.C90205b bVar2, C81925i2 i2Var, int i) {
        this.f259001a = fVar;
        this.f259002b = bVar;
        this.f259003c = bVar2;
        this.f259004d = i2Var;
        this.f259005e = i;
    }

    /* renamed from: a */
    public final void mo123718a(int i, int i2, String str, Object obj) {
        C90210f fVar = this.f259001a;
        C90203b.C90205b bVar = this.f259002b;
        C90203b.C90205b bVar2 = this.f259003c;
        C81925i2 i2Var = this.f259004d;
        int i3 = this.f259005e;
        C91237o.C91239b bVar3 = (C91237o.C91239b) obj;
        if (i == 0 && i2 == 0) {
            fVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("path", bVar.f258968b);
            hashMap.put("thumbPath", bVar2.f258968b);
            fVar.mo124449A(i2Var, i3, hashMap);
            C90202a aVar = fVar.f258980g;
            String str2 = bVar.f258968b;
            String str3 = bVar2.f258968b;
            long j = bVar3.f261814a * 1000;
            long j2 = bVar3.f261815b;
            aVar.mo115194p(i2Var);
            Log.m105925i("MicroMsg.OnGameRecorderStateChangeEvent", "hy: dispatch stop: %s, %d, %d", str2, Long.valueOf(j), Long.valueOf(j2));
            HashMap hashMap2 = new HashMap(4);
            hashMap2.put("state", "stop");
            hashMap2.put("tempFilePath", str2);
            hashMap2.put("tempThumbPath", str3);
            hashMap2.put("duration", Long.valueOf(j));
            hashMap2.put("fileSize", Long.valueOf(j2));
            aVar.mo115165o(hashMap2);
            aVar.mo115158h();
            return;
        }
        fVar.mo124450z(i2Var, i3, i, i2, str);
    }
}
