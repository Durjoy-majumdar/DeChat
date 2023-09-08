package w33;

import c30.C104289g;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import java.util.Set;
import p981ie.C87705i;
import sx3.C64197v;

/* renamed from: w33.j */
public final class C118728j<T> implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ int f355254a;

    /* renamed from: b */
    public final /* synthetic */ C104289g f355255b;

    /* renamed from: c */
    public final /* synthetic */ C114467i f355256c;

    public C118728j(int i, C104289g gVar, C114467i iVar) {
        this.f355254a = i;
        this.f355255b = gVar;
        this.f355256c = iVar;
    }

    public void accept(Object obj) {
        Log.m105924i("MicroMsg.VoIPProfileReport", "dump all tasks:");
        Set entrySet = ((Map) obj).entrySet();
        int i = this.f355254a;
        C104289g gVar = this.f355255b;
        C114467i iVar = this.f355256c;
        int i2 = 0;
        for (Object next : entrySet) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                Map.Entry entry = (Map.Entry) next;
                if (i2 < i) {
                    C118738t.m167430a(gVar, String.valueOf(i2), new C118727i(entry, iVar, i2));
                }
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }
}
