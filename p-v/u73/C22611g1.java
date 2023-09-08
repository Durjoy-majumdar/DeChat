package u73;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import kj2.C117407d;
import qe3.C89625d;

/* renamed from: u73.g1 */
public class C22611g1 {

    /* renamed from: c */
    public static C22611g1 f65023c = new C22611g1();

    /* renamed from: a */
    public C22612a f65024a;

    /* renamed from: b */
    public boolean f65025b;

    /* renamed from: u73.g1$a */
    public static class C22612a {

        /* renamed from: a */
        public String f65026a;

        /* renamed from: b */
        public int f65027b;

        /* renamed from: c */
        public int f65028c;

        /* renamed from: d */
        public long f65029d;

        /* renamed from: e */
        public int f65030e;

        /* renamed from: f */
        public int f65031f;

        /* renamed from: g */
        public String f65032g;

        /* renamed from: h */
        public String f65033h;

        /* renamed from: i */
        public long f65034i;

        /* renamed from: j */
        public int f65035j;

        /* renamed from: k */
        public int f65036k;

        /* renamed from: l */
        public long f65037l = System.currentTimeMillis();

        /* renamed from: m */
        public int f65038m;

        /* renamed from: a */
        public boolean mo35735a() {
            if (this.f65036k == 1) {
                return false;
            }
            int i = this.f65028c;
            if (i > C89625d.f257841g) {
                Log.m105925i("MicroMsg.WebSearch.WebSearchRedPointMgr", "msgid %s clientVersion %d invalid ,curVer is %d", this.f65026a, Integer.valueOf(i), Integer.valueOf(C89625d.f257841g));
                return false;
            }
            if (System.currentTimeMillis() > this.f65037l + (this.f65029d * 1000)) {
                Log.m105925i("MicroMsg.WebSearch.WebSearchRedPointMgr", "msgid %s expired", this.f65026a);
                return false;
            }
            String str = this.f65027b + "h5 version valid ? %b, red.h5 %d, cur.h5 %s, red.timestamp %d, last rec.timestamp %d";
            Object[] objArr = new Object[5];
            objArr[0] = Boolean.valueOf(C43471q.m46977a(0) >= this.f65030e);
            objArr[1] = Integer.valueOf(this.f65030e);
            objArr[2] = Integer.valueOf(C43471q.m46977a(0));
            objArr[3] = Long.valueOf(this.f65034i);
            C85801v1 i2 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SEARCH_REDDOT_LONG;
            Object f = i2.mo119685f(aVar, (Object) null);
            long j = 0;
            objArr[4] = Long.valueOf(f == null ? 0 : ((Long) f).longValue());
            Log.m105925i("MicroMsg.WebSearch.WebSearchRedPointMgr", str, objArr);
            if (C43471q.m46977a(0) >= this.f65030e) {
                long j2 = this.f65034i;
                Object f2 = C86709a0.m107535s().mo121142i().mo119685f(aVar, (Object) null);
                if (f2 != null) {
                    j = ((Long) f2).longValue();
                }
                if (j2 > j) {
                    return true;
                }
            }
            return false;
        }
    }

    public C22611g1() {
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FTS_DISCOVERY_RED_XML_STRING, "");
        C22612a aVar = new C22612a();
        this.f65024a = aVar;
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split("&");
                aVar.f65026a = Util.safeFormatString(split[0], new Object[0]);
                aVar.f65027b = Util.safeParseInt(split[1]);
                aVar.f65028c = Util.safeParseInt(split[2]);
                aVar.f65029d = Util.safeParseLong(split[3]);
                aVar.f65030e = Util.safeParseInt(split[4]);
                aVar.f65031f = Util.safeParseInt(split[5]);
                aVar.f65032g = split[6];
                aVar.f65033h = split[7];
                aVar.f65034i = Util.safeParseLong(split[8]);
                aVar.f65035j = Util.safeParseInt(split[9]);
                aVar.f65037l = Util.safeParseLong(split[10]);
                aVar.f65038m = Util.safeParseInt(split[11]);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchRedPointMgr", e, "", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo35733a(int i) {
        C22612a aVar = this.f65024a;
        if (aVar != null) {
            boolean a = aVar.mo35735a();
            if (!this.f65025b || i != 1 || a) {
                String str = this.f65024a.f65026a;
                if (str == null || str.equals("null")) {
                    str = "";
                }
                String format = String.format("%d,%d,%s,%d", new Object[]{Integer.valueOf(i), Integer.valueOf(a ? 1 : 0), str, Long.valueOf(System.currentTimeMillis())});
                Log.m105924i("MicroMsg.WebSearch.WebSearchRedPointMgr", "report websearch reddot 17513: " + format);
                C117407d.INSTANCE.kvStat(17513, format);
                if (i == 1 && !a) {
                    this.f65025b = true;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo35734b() {
        String str;
        C22612a aVar = this.f65024a;
        if (aVar == null) {
            str = "";
        } else {
            str = aVar.f65026a + "&" + aVar.f65027b + "&" + aVar.f65028c + "&" + aVar.f65029d + "&" + aVar.f65030e + "&" + aVar.f65031f + "&" + aVar.f65032g + "&" + aVar.f65033h + "&" + aVar.f65034i + "&" + aVar.f65035j + "&" + aVar.f65037l + "&" + aVar.f65038m;
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FTS_DISCOVERY_RED_XML_STRING, str);
    }
}
