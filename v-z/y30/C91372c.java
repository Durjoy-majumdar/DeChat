package y30;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import d40.C86172c;
import n30.C47152a;
import n30.C47155b;

/* renamed from: y30.c */
public class C91372c implements C47152a.C47154b {

    /* renamed from: a */
    public final /* synthetic */ C91370a f262057a;

    /* renamed from: b */
    public final /* synthetic */ String f262058b;

    public C91372c(C91370a aVar, String str) {
        this.f262057a = aVar;
        this.f262058b = str;
    }

    /* renamed from: a */
    public void mo72243a() {
        C86172c.m106685a(11);
        Log.m105921e("Kara.ModelManager", "download file %s", this.f262057a.toString());
    }

    /* renamed from: b */
    public void mo72244b(String str) {
        C86172c.m106685a(10);
        String q = C86013q1.m106456q(str);
        if (!this.f262057a.f262054b.equals(q)) {
            C86172c.m106685a(13);
            Log.m105921e("Kara.ModelManager", "md5 check fail %s %s", this.f262057a.toString(), q);
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
                return;
            }
            return;
        }
        C86172c.m106685a(12);
        Log.m105925i("Kara.ModelManager", "download succ %s", this.f262057a.toString());
        Uri n2 = C116299g2.m163858n(str);
        String path2 = n2.getPath();
        if (path2 != null) {
            String k2 = C116299g2.m163855k(path2, false, false);
            if (!n2.getPath().equals(k2)) {
                n2 = n2.buildUpon().path(k2).build();
            }
        }
        C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
        if (!(!l2.mo177810a() ? false : l2.f348991a.mo119948x(l2.f348992b))) {
            return;
        }
        if (C47155b.m52440a(str, this.f262058b)) {
            C86172c.m106685a(14);
            Log.m105925i("Kara.ModelManager", "decompress succ save: %s", this.f262058b);
            return;
        }
        C86172c.m106685a(15);
        Log.m105921e("Kara.ModelManager", "decompress fail %s", this.f262058b);
    }
}
