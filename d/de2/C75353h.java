package de2;

import android.net.Uri;
import com.tencent.p014mm.app.C114663g0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;

/* renamed from: de2.h */
public class C75353h implements C114663g0.C114666c {

    /* renamed from: a */
    public final /* synthetic */ boolean f221517a;

    public C75353h(boolean z) {
        this.f221517a = z;
    }

    /* renamed from: a */
    public void mo105672a(String str) {
        mo105674c(str);
    }

    /* renamed from: b */
    public void mo105673b(String str, int i, long j, long j2) {
        if (i == 100) {
            mo105674c(str);
        }
    }

    /* renamed from: c */
    public final void mo105674c(String str) {
        if (str != null && this.f221517a) {
            Uri n = C116299g2.m163858n(str);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            Log.m105925i(C86244g.f250838d, "Delete file %s, res: %s", str, Boolean.valueOf(l.mo177810a() && l.f348991a.mo119933c(l.f348992b)));
        }
    }
}
