package zf2;

import ag2.C39566a1;
import ag2.C39582g1;
import ag2.C39595q0;
import ag2.C39597s0;
import android.os.Bundle;
import cg2.C39947c;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: zf2.h */
public class C53777h implements C80883e<IPCString, Bundle>, C11385n {

    /* renamed from: d */
    public String f150935d;

    /* renamed from: e */
    public C1256g<Bundle> f150936e;

    public void invoke(Object obj, C1256g gVar) {
        IPCString iPCString = (IPCString) obj;
        Log.m105925i("MicroMsg.ReadMailTask", "read mail  %s", iPCString.f10315d);
        this.f150936e = gVar;
        String str = iPCString.f10315d;
        this.f150935d = str;
        C86709a0.m107524d().mo123460f(new C39947c(str));
        C86709a0.m107524d().mo123455a(11312, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.ReadMailTask", "read mail, errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C39947c cVar = (C39947c) yVar;
        if (!cVar.f107089f.equals(this.f150935d)) {
            Log.m105928w("MicroMsg.ReadMailTask", "not my scene, ignore");
            return;
        }
        C86709a0.m107524d().mo123470p(11312, this);
        if (this.f150936e != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("err_type", i);
            bundle.putInt("err_code", i2);
            bundle.putString("err_msg", str);
            bundle.putString("mail_id", this.f150935d);
            if (i == 0 && i2 == 0) {
                C39597s0 s0Var = ((C39566a1) cVar.f107087d.f127056b.f127083a).f106214d;
                if (s0Var != null) {
                    bundle.putString("mail_content", s0Var.f106300q);
                    if (!s0Var.f106301r.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<C39595q0> it = s0Var.f106301r.iterator();
                        while (it.hasNext()) {
                            C39595q0 next = it.next();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("attach_fileId", next.f106280d);
                            bundle2.putString("attach_key", next.f106285i);
                            bundle2.putString("attach_name", next.f106281e);
                            bundle2.putString("attach_type", next.f106283g);
                            bundle2.putInt("attach_size", next.f106282f);
                            bundle2.putString("attach_download_url", next.f106284h);
                            arrayList.add(bundle2);
                        }
                        bundle.putParcelableArrayList("mail_normal_attach", arrayList);
                    }
                    if (!s0Var.f106302s.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<C39595q0> it4 = s0Var.f106302s.iterator();
                        while (it4.hasNext()) {
                            C39595q0 next2 = it4.next();
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("attach_fileId", next2.f106280d);
                            bundle3.putString("attach_key", next2.f106285i);
                            bundle3.putString("attach_name", next2.f106281e);
                            bundle3.putString("attach_type", next2.f106283g);
                            bundle3.putInt("attach_size", next2.f106282f);
                            bundle3.putString("attach_download_url", next2.f106284h);
                            arrayList2.add(bundle3);
                        }
                        bundle.putParcelableArrayList("mail_big_attach", arrayList2);
                    }
                }
                C39582g1 g1Var = ((C39566a1) cVar.f107087d.f127056b.f127083a).f106215e;
                if (g1Var != null) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putLong("cookie_xmail_uin", g1Var.f106248d);
                    bundle4.putString("cookie_xmail_skey", g1Var.f106250f);
                    bundle4.putString("cookie_xmail_sid", g1Var.f106249e);
                    bundle.putParcelable("mail_cookie", bundle4);
                }
            }
            this.f150936e.mo894a(bundle);
        }
    }
}
