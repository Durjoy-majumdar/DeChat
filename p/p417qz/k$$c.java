package p417qz;

import com.tencent.p014mm.sdk.platformtools.Log;
import hd0.C98408n0;
import hd0.C98429r0;
import ic3.C98663a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p682rz.C101480j;

/* renamed from: qz.k$$c */
public final /* synthetic */ class k$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C101319k f296834d;

    /* renamed from: e */
    public final /* synthetic */ List f296835e;

    /* renamed from: f */
    public final /* synthetic */ C101480j.C101481a f296836f;

    /* renamed from: g */
    public final /* synthetic */ long f296837g;

    /* renamed from: h */
    public final /* synthetic */ List f296838h;

    public /* synthetic */ k$$c(C101319k kVar, List list, C101480j.C101481a aVar, long j, List list2) {
        this.f296834d = kVar;
        this.f296835e = list;
        this.f296836f = aVar;
        this.f296837g = j;
        this.f296838h = list2;
    }

    public final void run() {
        C101319k kVar = this.f296834d;
        List<String> list = this.f296835e;
        C101480j.C101481a aVar = this.f296836f;
        long j = this.f296837g;
        List list2 = this.f296838h;
        synchronized (kVar) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                C98408n0 i = C98429r0.m127818i(str);
                if (i != null && i.f288562i == 199) {
                    if (aVar != null) {
                        C98663a aVar2 = new C98663a();
                        aVar2.mo141099d(i.mo137705i());
                        C101319k.vx0(i, aVar2);
                        aVar.mo139225b(str, aVar2);
                    }
                    arrayList.add(str);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                Log.m105924i("MicroMsg.ImportMultiVideoService", "video upload finish, remove it, file name = " + str2);
                list.remove(str2);
            }
            Log.m105924i("MicroMsg.ImportMultiVideoService", "put to process map, file name = " + list + " msg local id = " + j + " import path = " + list2);
            List list3 = kVar.f296821d.get(Long.valueOf(j));
            if (list3 == null) {
                list3 = new ArrayList();
            }
            list3.addAll(list);
            kVar.f296821d.put(Long.valueOf(j), list3);
            List list4 = kVar.f296822e.get(Long.valueOf(j));
            if (list4 == null) {
                list4 = new ArrayList();
            }
            list4.addAll(list2);
            kVar.f296822e.put(Long.valueOf(j), list4);
            kVar.f296823f.put(Long.valueOf(j), aVar);
        }
    }
}
