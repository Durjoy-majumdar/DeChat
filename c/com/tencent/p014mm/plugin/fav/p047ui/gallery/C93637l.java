package com.tencent.p014mm.plugin.fav.p047ui.gallery;

import android.net.Uri;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import pb1.C100734q;
import pb1.C100755z;
import te3.C101834rc0;

/* renamed from: com.tencent.mm.plugin.fav.ui.gallery.l */
public class C93637l {

    /* renamed from: a */
    public C100755z f270387a;

    /* renamed from: b */
    public C101834rc0 f270388b;

    public C93637l(C100755z zVar, C101834rc0 rc02) {
        this.f270387a = zVar;
        this.f270388b = rc02;
    }

    /* renamed from: a */
    public String mo128557a() {
        if (mo128558b()) {
            return this.f270388b.f299254G;
        }
        if (mo128560d() || mo128559c()) {
            return C100734q.m131826Q(this.f270388b);
        }
        String w = C100734q.m131880w(this.f270388b);
        Uri n = C116299g2.m163858n(w);
        String path = n.getPath();
        boolean z = false;
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (l.mo177810a()) {
            z = l.f348991a.mo119948x(l.f348992b);
        }
        return z ? w : C100734q.m131826Q(this.f270388b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r0.f299296c1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo128558b() {
        /*
            r3 = this;
            te3.rc0 r0 = r3.f270388b
            int r1 = r0.f299258I
            r2 = 4
            if (r1 != r2) goto L_0x0011
            te3.sc0 r0 = r0.f299296c1
            if (r0 == 0) goto L_0x0011
            te3.ad0 r0 = r0.f299422x
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.gallery.C93637l.mo128558b():boolean");
    }

    /* renamed from: c */
    public boolean mo128559c() {
        return this.f270388b.f299258I == 15;
    }

    /* renamed from: d */
    public boolean mo128560d() {
        return this.f270388b.f299258I == 4;
    }
}
