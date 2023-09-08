package zf2;

import ag2.C39573d1;
import ag2.C39596r0;
import android.os.Bundle;
import cg2.C39948d;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: zf2.j */
public class C53778j implements C80883e<IPCString, Bundle>, C11385n {

    /* renamed from: d */
    public String f150937d;

    /* renamed from: e */
    public C1256g<Bundle> f150938e;

    public void invoke(Object obj, C1256g gVar) {
        IPCString iPCString = (IPCString) obj;
        Log.m105925i("MicroMsg.SearchMailAddrTask", "search mail  %s", iPCString.f10315d);
        this.f150938e = gVar;
        String nullAsNil = Util.nullAsNil(iPCString.f10315d);
        this.f150937d = nullAsNil;
        C86709a0.m107524d().mo123460f(new C39948d(nullAsNil));
        C86709a0.m107524d().mo123455a(11016, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        LinkedList<C39596r0> linkedList;
        Log.m105925i("MicroMsg.SearchMailAddrTask", "search mail, errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C39948d dVar = (C39948d) yVar;
        if (!Util.nullAsNil(dVar.f107092f).equals(this.f150937d)) {
            Log.m105928w("MicroMsg.SearchMailAddrTask", "not my scene, ignore");
            return;
        }
        C86709a0.m107524d().mo123470p(11016, this);
        if (this.f150938e != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("err_type", i);
            bundle.putInt("err_code", i2);
            bundle.putString("err_msg", str);
            bundle.putString("search_text", this.f150937d);
            if (i == 0 && i2 == 0 && (linkedList = ((C39573d1) dVar.f107090d.f127056b.f127083a).f106229d) != null && !linkedList.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (C39596r0 next : linkedList) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(FirebaseAnalytics.C113379b.ITEM_NAME, next.f106287d);
                    bundle2.putString("item_addr", next.f106288e);
                    arrayList.add(bundle2);
                }
                bundle.putParcelableArrayList("search_addr_list", arrayList);
            }
            this.f150938e.mo894a(bundle);
        }
    }
}
