package zf2;

import android.os.Bundle;
import cg2.C0502g;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: zf2.l */
public class C16163l implements C80883e<Bundle, Bundle>, C11385n {

    /* renamed from: d */
    public String f43354d;

    /* renamed from: e */
    public C1256g<Bundle> f43355e;

    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        this.f43354d = bundle.getString("mail_id");
        int i = bundle.getInt("mail_status");
        this.f43355e = gVar;
        C86709a0.m107524d().mo123460f(new C0502g(this.f43354d, i));
        C86709a0.m107524d().mo123455a(11480, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.UpdateMailStatusTask", "read mail, errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (!((C0502g) yVar).f1228f.equals(this.f43354d)) {
            Log.m105928w("MicroMsg.UpdateMailStatusTask", "not my scene, ignore");
            return;
        }
        C86709a0.m107524d().mo123470p(11480, this);
        if (this.f43355e != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("err_type", i);
            bundle.putInt("err_code", i2);
            bundle.putString("err_msg", str);
            bundle.putString("mail_id", this.f43354d);
            this.f43355e.mo894a(bundle);
        }
    }
}
