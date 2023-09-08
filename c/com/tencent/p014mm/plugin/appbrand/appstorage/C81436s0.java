package com.tencent.p014mm.plugin.appbrand.appstorage;

import android.net.Uri;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86011o1;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.s0 */
public class C81436s0 implements C86011o1 {

    /* renamed from: a */
    public final /* synthetic */ LuggageLocalFileObjectManager f238988a;

    public C81436s0(LuggageLocalFileObjectManager luggageLocalFileObjectManager) {
        this.f238988a = luggageLocalFileObjectManager;
    }

    public boolean accept(C86009m1 m1Var) {
        Uri n = C116299g2.m163858n(this.f238988a.mo113719f());
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        Uri n2 = C116299g2.m163858n(m1Var.mo119973k());
        String path2 = n2.getPath();
        if (path2 != null) {
            String k2 = C116299g2.m163855k(path2, false, false);
            if (!n2.getPath().equals(k2)) {
                n2 = n2.buildUpon().path(k2).build();
            }
        }
        return n.equals(n2) && LuggageLocalFileObjectManager.m99850g(m1Var, "tmp_", true);
    }
}
