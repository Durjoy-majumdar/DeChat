package z30;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import d40.C86172c;
import n30.C47152a;

/* renamed from: z30.a */
public class C91613a implements C47152a.C47154b {

    /* renamed from: a */
    public final /* synthetic */ String f262456a;

    public C91613a(String str) {
        this.f262456a = str;
    }

    /* renamed from: a */
    public void mo72243a() {
        if (BuildInfo.IS_ARM64) {
            C86172c.m106685a(2);
        } else {
            C86172c.m106685a(6);
        }
        C91614b.f262458b = false;
    }

    /* renamed from: b */
    public void mo72244b(String str) {
        if (BuildInfo.IS_ARM64) {
            C86172c.m106685a(1);
        } else {
            C86172c.m106685a(5);
        }
        String q = C86013q1.m106456q(str);
        if (!this.f262456a.equals(q)) {
            Log.m105921e("Kara.KaraEnv", "md5 check fail %s %s", this.f262456a, q);
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
                boolean c = l.f348991a.mo119933c(l.f348992b);
            }
            if (BuildInfo.IS_ARM64) {
                C86172c.m106685a(4);
            } else {
                C86172c.m106685a(8);
            }
        } else if (BuildInfo.IS_ARM64) {
            C86172c.m106685a(3);
        } else {
            C86172c.m106685a(7);
        }
        C91614b.f262458b = false;
    }
}
