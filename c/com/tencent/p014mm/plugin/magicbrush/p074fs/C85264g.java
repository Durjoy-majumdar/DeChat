package com.tencent.p014mm.plugin.magicbrush.p074fs;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86011o1;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.TimeUnit;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.magicbrush.fs.g */
public final class C85264g {

    /* renamed from: a */
    public static final C85267c f248417a = new C85267c((C8480h) null);

    /* renamed from: b */
    public static final long f248418b = TimeUnit.DAYS.toMillis(1);

    /* renamed from: c */
    public static final C86011o1 f248419c = C85266b.f248422a;

    /* renamed from: d */
    public static final C86011o1 f248420d = C85265a.f248421a;

    /* renamed from: com.tencent.mm.plugin.magicbrush.fs.g$a */
    public static final class C85265a implements C86011o1 {

        /* renamed from: a */
        public static final C85265a f248421a = new C85265a();

        public final boolean accept(C86009m1 m1Var) {
            C87412m.m108594g(m1Var, "pathname");
            C85267c cVar = C85264g.f248417a;
            if (!m1Var.mo119967g() || m1Var.mo119977o() || Util.isNullOrNil(m1Var.getName())) {
                return false;
            }
            String name = m1Var.getName();
            C87412m.m108593f(name, "pathname.name");
            return C112551y.m153819s(name, "store_", false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.magicbrush.fs.g$b */
    public static final class C85266b implements C86011o1 {

        /* renamed from: a */
        public static final C85266b f248422a = new C85266b();

        public final boolean accept(C86009m1 m1Var) {
            C87412m.m108594g(m1Var, "pathname");
            String name = m1Var.getName();
            C87412m.m108593f(name, "pathname.name");
            if (C112551y.m153808h(name, ".data", false, 2, (Object) null)) {
                return false;
            }
            String name2 = m1Var.getName();
            C87412m.m108593f(name2, "pathname.name");
            if (C112551y.m153819s(name2, "store_", false)) {
                return false;
            }
            String name3 = m1Var.getName();
            C87412m.m108593f(name3, "pathname.name");
            return !C112551y.m153808h(name3, FilePathGenerator.NO_MEDIA_FILENAME, false, 2, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.magicbrush.fs.g$c */
    public static final class C85267c {
        public C85267c(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo118429a(String str) {
            C86001b0 q;
            if (C86013q1.m106450k(str + "/dir.lock")) {
                long nowMilliSecond = Util.nowMilliSecond();
                Uri n = C116299g2.m163858n(str + "/dir.lock");
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                long j = 0;
                if (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) {
                    j = q.f250475e;
                }
                if (nowMilliSecond - j < C85264g.f248418b) {
                    Log.m105925i("MicroMsg.MagicBrushTempFileCleaner", "checkMagicDirHasLocked path %s, locked", str);
                    return true;
                }
                Log.m105921e("MicroMsg.MagicBrushTempFileCleaner", "checkMagicDirHasLocked path %s, lock expired", str);
            }
            Log.m105925i("MicroMsg.MagicBrushTempFileCleaner", "checkMagicDirHasLocked path %s, lock free", str);
            return false;
        }
    }
}
