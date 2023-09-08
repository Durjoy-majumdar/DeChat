package rb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import lc3.C10485b;
import p248ug.C52558c;
import rb0.C47982j0;

/* renamed from: rb0.a */
public class C47961a {

    /* renamed from: a */
    public static String f128666a = "";

    /* renamed from: b */
    public static long f128667b;

    /* renamed from: rb0.a$b */
    public interface C12965b {
        /* renamed from: a */
        void mo12496a(boolean z, String str);
    }

    /* renamed from: rb0.a$a */
    public class C47962a implements C47982j0.C47983a<C47982j0> {

        /* renamed from: a */
        public final /* synthetic */ String f128668a;

        /* renamed from: b */
        public final /* synthetic */ WeakReference f128669b;

        public C47962a(String str, WeakReference weakReference) {
            this.f128668a = str;
            this.f128669b = weakReference;
        }
    }

    /* renamed from: a */
    public static boolean m53282a() {
        int i;
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_BIZ_ATTR_SYNC_OPEN_FLAG_INT, (Object) null);
        if (f == null || !(f instanceof Integer)) {
            Log.m105924i("MicroMsg.BizAttrRenovator", "openFlag is null.");
            i = 1;
        } else {
            i = ((Integer) f).intValue();
        }
        Log.m105925i("MicroMsg.BizAttrRenovator", "openFlag is %d.", Integer.valueOf(i));
        return i == 1;
    }

    /* renamed from: b */
    public final boolean mo72735b(C52558c cVar) {
        if (cVar == null) {
            Log.m105924i("MicroMsg.BizAttrRenovator", "BizInfo is null.");
            return false;
        } else if (!m53282a()) {
            return false;
        } else {
            int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("MMBizAttrSyncFreq", -1);
            if (b == -1) {
                Log.m105924i("MicroMsg.BizAttrRenovator", "MMBizAttrSyncFreq is null.");
                b = 3600;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = cVar.field_incrementUpdateTime;
            Log.m105925i("MicroMsg.BizAttrRenovator", "currentMS(%d), lastUpdateTime(%d), freq(%d), version(%s).", Long.valueOf(currentTimeMillis), Long.valueOf(j), Integer.valueOf(b), cVar.field_attrSyncVersion);
            return currentTimeMillis - j >= ((long) b) * 1000;
        }
    }

    /* renamed from: c */
    public boolean mo72736c(String str, C12965b bVar) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.BizAttrRenovator", "try2UpdateBizAttributes failed, username is null or nil.");
            return false;
        }
        if (Util.isEqual(f128666a, str) && System.currentTimeMillis() - f128667b < 1000) {
            Log.m105924i("MicroMsg.BizAttrRenovator", "try2UpdateBizAttributes failed, username is just delete.");
            return false;
        }
        Log.m105918d("MicroMsg.BizAttrRenovator", "try2UpdateBizAttributes");
        C52558c SE = C48009v0.Fx0().mo72757SE(str);
        if (!mo72735b(SE)) {
            Log.m105924i("MicroMsg.BizAttrRenovator", "do not need to update biz attrs now.");
            return false;
        }
        if (str.equals("gh_f0a92aa7146c")) {
            Log.m105924i("MicroMsg.BizAttrRenovator", "username == ContactStorageLogic.SPUSER_WXPAY_COLLECTION，go NetScene Plugin");
            C86709a0.m107529k().f251779b.mo123460f(new C48000p0(new C47963b(this, str)));
        }
        C86709a0.m107529k().f251779b.mo123460f(new C47982j0(str, SE.field_attrSyncVersion, new C47962a(str, new WeakReference(bVar))));
        return true;
    }
}
