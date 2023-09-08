package p343gh;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import java.util.ArrayList;
import java.util.Iterator;
import p213oh.C11412b;
import p213oh.C89209a;
import p335eh.C116768d;
import p339fh.C116869j;

/* renamed from: gh.b */
public class C116964b implements C20835e {

    /* renamed from: a */
    public String f350532a;

    public C116964b(String str) {
        this.f350532a = str;
    }

    /* renamed from: a */
    public void mo32433a() {
        ArrayList arrayList;
        Object[] objArr = {this.f350532a};
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioPcmDataTrackRecycleCacheTask", "runTask, appId:%s", objArr);
        C116869j a = C116869j.m164845a();
        synchronized (a.f350296c) {
            Iterator<String> it = a.f350294a.iterator();
            while (it.hasNext()) {
                C116768d dVar = a.f350295b.get(it.next());
                if (dVar != null) {
                    dVar.mo180741g();
                }
            }
            a.f350294a.clear();
            a.f350295b.clear();
        }
        Log.m105925i("MicroMsg.Mix.AudioPcmDataTrackRecycleCacheTask", "delete all pcm cache File", (Object[]) null);
        C116869j a2 = C116869j.m164845a();
        synchronized (a2.f350296c) {
            arrayList = new ArrayList();
            arrayList.addAll(a2.f350294a);
        }
        if (arrayList.size() > 0) {
            String str = this.f350532a;
            if (arrayList.size() > 0) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    String f = C89209a.m111504f(str, (String) it4.next());
                    C86009m1 m1Var = new C86009m1(f);
                    if (m1Var.mo119967g()) {
                        m1Var.mo119966f();
                        Object[] objArr2 = {f};
                        int i2 = C11412b.f33577a;
                        Log.m105925i("MicroMsg.Mix.FileUtil", "delete pcm cache file, file:%s", objArr2);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo32434b() {
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mix.AudioPcmDataTrackRecycleCacheTask", "end task", (Object[]) null);
    }
}
