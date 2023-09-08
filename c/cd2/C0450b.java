package cd2;

import a70.C112760b;
import android.net.Uri;
import com.tencent.p014mm.plugin.notification.base.C115649j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: cd2.b */
public class C0450b {

    /* renamed from: a */
    public static final boolean[] f1075a = {false};

    /* renamed from: cd2.b$a */
    public static class C0451a {

        /* renamed from: a */
        public C115649j f1076a = new C115649j();

        /* renamed from: b */
        public int f1077b;

        /* renamed from: c */
        public ArrayList<Long> f1078c = new ArrayList<>();

        /* renamed from: d */
        public ArrayList<Long> f1079d = new ArrayList<>();

        /* renamed from: a */
        public void mo491a(String str) {
            Log.m105918d("MicroMsg.FailMsgFileCache", "CacheObj, createFromFileContent");
            if (Util.isNullOrNil(str)) {
                Log.m105921e("MicroMsg.FailMsgFileCache", "[createFromFileContent] content is null! stack:%s", Util.getStack());
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray jSONArray = jSONObject.getJSONArray("msg_list");
                JSONArray jSONArray2 = jSONObject.getJSONArray("fail_msg_list");
                JSONArray jSONArray3 = jSONObject.getJSONArray("success_msg_list");
                int i = jSONObject.getInt("current_send_index");
                Log.m105919d("MicroMsg.FailMsgFileCache", "createFromFileContent, msgArray.size:%d, failArray.size:%d, successArray.size:%d, index:%d", Integer.valueOf(jSONArray.length()), Integer.valueOf(jSONArray2.length()), Integer.valueOf(jSONArray3.length()), Integer.valueOf(i));
                C115649j jVar = this.f1076a;
                jVar.f346897a.clear();
                jVar.f346898b = 0;
                this.f1079d.clear();
                this.f1078c.clear();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    this.f1076a.mo175863a(jSONArray.getLong(i2));
                }
                for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                    this.f1079d.add(Long.valueOf(jSONArray2.getLong(i3)));
                }
                for (int i4 = 0; i4 < jSONArray3.length(); i4++) {
                    this.f1078c.add(Long.valueOf(jSONArray3.getLong(i4)));
                }
                this.f1077b = i;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FailMsgFileCache", e, str, new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static String m384a() {
        String str = C112760b.m154195C() + "FailMsgFileCache";
        boolean[] zArr = f1075a;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!zArr[0]) {
                    Uri n = C116299g2.m163858n(str);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                    if (l.mo177810a()) {
                        l.f348991a.mo119937g(l.f348992b);
                    }
                    zArr[0] = true;
                }
            }
        }
        return str;
    }

    /* renamed from: b */
    public static void m385b(int i) {
        String str;
        if (i == 1) {
            str = m384a() + "/" + "normalMsg";
        } else if (i == 2) {
            str = m384a() + "/" + "snsMsg";
        } else {
            str = null;
        }
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.FailMsgFileCache", "removeFile error, cannot find filename");
            return;
        }
        Log.m105919d("MicroMsg.FailMsgFileCache", "removeFile, filename:%s", str);
        if (C86013q1.m106450k(str)) {
            Uri n = C116299g2.m163858n(str);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (l.mo177810a()) {
                l.f348991a.mo119933c(l.f348992b);
            }
        }
    }
}
