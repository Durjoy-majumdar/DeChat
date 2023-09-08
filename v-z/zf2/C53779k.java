package zf2;

import ag2.C39586i1;
import ag2.C39596r0;
import android.os.Bundle;
import cg2.C39950f;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C47465a;

/* renamed from: zf2.k */
public class C53779k implements C80883e<IPCVoid, Bundle>, C11385n {

    /* renamed from: d */
    public C1256g<Bundle> f150939d;

    /* renamed from: e */
    public long f150940e;

    /* renamed from: f */
    public ArrayList<Bundle> f150941f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<Bundle> f150942g = new ArrayList<>();

    /* renamed from: h */
    public ArrayList<Bundle> f150943h = new ArrayList<>();

    public void invoke(Object obj, C1256g gVar) {
        IPCVoid iPCVoid = (IPCVoid) obj;
        this.f150939d = gVar;
        long G = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_XMAIL_SYNC_CONTACT_KEY_LONG_SYNC, 0);
        this.f150940e = G;
        C86709a0.m107524d().mo123460f(new C39950f(G));
        C86709a0.m107524d().mo123455a(14418, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.SyncMailAddrTask", "search mail, errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C39950f fVar = (C39950f) yVar;
        if (fVar.f107098f != this.f150940e) {
            Log.m105928w("MicroMsg.SyncMailAddrTask", "not my scene, ignore");
            return;
        }
        if (i == 0 && i2 == 0) {
            LinkedList<C39596r0> linkedList = ((C39586i1) fVar.f107096d.f127056b.f127083a).f106260d;
            if (!linkedList.isEmpty()) {
                for (C39596r0 next : linkedList) {
                    Bundle bundle = new Bundle();
                    bundle.putString(FirebaseAnalytics.C113379b.ITEM_NAME, next.f106287d);
                    bundle.putString("item_addr", next.f106288e);
                    this.f150941f.add(bundle);
                }
            }
            LinkedList<C39596r0> linkedList2 = ((C39586i1) fVar.f107096d.f127056b.f127083a).f106261e;
            if (!linkedList2.isEmpty()) {
                for (C39596r0 next2 : linkedList2) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(FirebaseAnalytics.C113379b.ITEM_NAME, next2.f106287d);
                    bundle2.putString("item_addr", next2.f106288e);
                    this.f150942g.add(bundle2);
                }
            }
            LinkedList<C39596r0> linkedList3 = ((C39586i1) fVar.f107096d.f127056b.f127083a).f106262f;
            if (!linkedList3.isEmpty()) {
                for (C39596r0 next3 : linkedList3) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString(FirebaseAnalytics.C113379b.ITEM_NAME, next3.f106287d);
                    bundle3.putString("item_addr", next3.f106288e);
                    this.f150943h.add(bundle3);
                }
            }
            C47465a aVar = fVar.f107096d.f127056b.f127083a;
            if (((C39586i1) aVar).f106264h) {
                long j = ((C39586i1) aVar).f106263g;
                this.f150940e = j;
                C86709a0.m107524d().mo123460f(new C39950f(j));
                return;
            }
        }
        Bundle bundle4 = new Bundle();
        bundle4.putInt("err_type", i);
        bundle4.putInt("err_code", i2);
        bundle4.putString("err_msg", str);
        bundle4.putParcelableArrayList("sync_add_list", this.f150941f);
        bundle4.putParcelableArrayList("sync_update_list", this.f150942g);
        bundle4.putParcelableArrayList("sync_delete_list", this.f150943h);
        bundle4.putLong("last_sync_key", this.f150940e);
        C1256g<Bundle> gVar = this.f150939d;
        if (gVar != null) {
            gVar.mo894a(bundle4);
        }
    }
}
