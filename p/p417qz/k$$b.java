package p417qz;

import com.tencent.p014mm.pluginsdk.model.C96790t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.List;
import p682rz.C101480j;
import zt3.C119157j;

/* renamed from: qz.k$$b */
public final /* synthetic */ class k$$b implements C96790t0.C85608c {

    /* renamed from: a */
    public final /* synthetic */ C101319k f296831a;

    /* renamed from: b */
    public final /* synthetic */ C101480j.C101481a f296832b;

    /* renamed from: c */
    public final /* synthetic */ long f296833c;

    public /* synthetic */ k$$b(C101319k kVar, C101480j.C101481a aVar, long j) {
        this.f296831a = kVar;
        this.f296832b = aVar;
        this.f296833c = j;
    }

    /* renamed from: a */
    public final void mo102714a(List list, List list2, List list3, List list4) {
        C101319k kVar = this.f296831a;
        C101480j.C101481a aVar = this.f296832b;
        long j = this.f296833c;
        kVar.getClass();
        ArrayList arrayList = new ArrayList(list2);
        Log.m105924i("MicroMsg.ImportMultiVideoService", "onImport finish, file name = " + arrayList);
        if (aVar != null) {
            aVar.mo139224a(list, list2, list3, list4);
        }
        ((C119157j) C119157j.f356862d).mo183884o(new k$$c(kVar, arrayList, aVar, j, list3));
    }
}
