package p1022pe;

import com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner;
import com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner;
import com.tencent.matrix.lifecycle.supervisor.AppDeepBackgroundOwner;
import com.tencent.matrix.lifecycle.supervisor.AppStagedBackgroundOwner;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import p1028re.C89929b;
import p659qe.C89612g;
import p659qe.C89616n;

/* renamed from: pe.a */
public final class C89347a {

    /* renamed from: a */
    public final C89612g[] f257323a;

    /* renamed from: b */
    public final C89616n[] f257324b;

    /* renamed from: c */
    public final C89929b f257325c;

    public C89347a(C89612g[] gVarArr, C89616n[] nVarArr, C89929b bVar) {
        C87412m.m108594g(gVarArr, "appBgSumPssMonitorConfigs");
        C87412m.m108594g(nVarArr, "processBgMemoryMonitorConfigs");
        C87412m.m108594g(bVar, "trimMemoryConfig");
        this.f257323a = gVarArr;
        this.f257324b = nVarArr;
        this.f257325c = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C89347a)) {
            return false;
        }
        C89347a aVar = (C89347a) obj;
        return C87412m.m108589b(this.f257323a, aVar.f257323a) && C87412m.m108589b(this.f257324b, aVar.f257324b) && C87412m.m108589b(this.f257325c, aVar.f257325c);
    }

    public int hashCode() {
        C89612g[] gVarArr = this.f257323a;
        int i = 0;
        int hashCode = (gVarArr != null ? Arrays.hashCode(gVarArr) : 0) * 31;
        C89616n[] nVarArr = this.f257324b;
        int hashCode2 = (hashCode + (nVarArr != null ? Arrays.hashCode(nVarArr) : 0)) * 31;
        C89929b bVar = this.f257325c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "MemoryCanaryConfig(appBgSumPssMonitorConfigs=" + Arrays.toString(this.f257323a) + ", processBgMemoryMonitorConfigs=" + Arrays.toString(this.f257324b) + ", trimMemoryConfig=" + this.f257325c + ")";
    }

    public C89347a() {
        this(new C89612g[]{new C89612g(false, AppStagedBackgroundOwner.INSTANCE, 0, 0, 0, 0, (C32229r) null, (C32224a) null, 253, (C8480h) null), new C89612g(false, AppDeepBackgroundOwner.INSTANCE, 0, 0, 0, 0, (C32229r) null, (C32224a) null, 253, (C8480h) null)}, new C89616n[]{new C89616n(false, ProcessStagedBackgroundOwner.INSTANCE, 0, 0, 0, 0, 0, 0, (C32226l) null, 509, (C8480h) null), new C89616n(false, ProcessDeepBackgroundOwner.INSTANCE, 0, 0, 0, 0, 0, 0, (C32226l) null, 509, (C8480h) null)}, new C89929b(false, (ArrayList) null, 3, (C8480h) null));
    }
}
