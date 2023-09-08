package af3;

import android.content.Context;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117293c;
import java.util.Arrays;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: af3.d */
public final class C79523d {

    /* renamed from: a */
    public static long f233167a;

    /* renamed from: af3.d$a */
    public static class C79524a implements C117293c {

        /* renamed from: a */
        public final Context f233168a;

        public C79524a(Context context) {
            this.f233168a = context;
        }

        /* renamed from: a */
        public Object mo109570a(String str, String str2, String str3, String str4, String str5, Object obj, Object[] objArr) {
            if (!str4.equals("getRemoteService")) {
                return null;
            }
            C79523d.f233167a++;
            Log.m105924i("MicroMsg.RecoveryInspector", "BaseGmsClient#getRemoteService, args = " + Arrays.toString(objArr) + ", count = " + C79523d.f233167a);
            if (!(obj instanceof BaseGmsClient)) {
                return null;
            }
            Log.m105924i("MicroMsg.RecoveryInspector", "post");
            C119179t tVar = C119157j.f356862d;
            d$a$$a d_a__a = new d$a$$a(obj, objArr);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183881l(d_a__a, 0, "gms-invoke");
            return null;
        }
    }
}
