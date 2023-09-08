package com.tencent.p014mm.plugin.game.commlib.util;

import a70.C112760b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.FrequentLimiter;

/* renamed from: com.tencent.mm.plugin.game.commlib.util.f */
public class C41872f {

    /* renamed from: a */
    public static final String f112815a = (C112760b.m154225d() + "game/");

    /* renamed from: b */
    public static final String f112816b = (C112760b.m154195C() + "game/");

    /* renamed from: com.tencent.mm.plugin.game.commlib.util.f$a */
    public enum C41873a {
        ONE_DAY(86400000),
        ONE_WEEK(FrequentLimiter.WEEK_MILLS),
        ONE_MONTH(2592000000L),
        PERMANENT(MAlarmHandler.NEXT_FIRE_INTERVAL);
        

        /* renamed from: d */
        public long f112822d;

        /* access modifiers changed from: public */
        C41873a(long j) {
            this.f112822d = j;
        }
    }

    /* renamed from: a */
    public static boolean m45391a(C86009m1 m1Var, long j) {
        C86009m1[] u;
        if (m1Var == null || !m1Var.mo119967g()) {
            return false;
        }
        if (m1Var.mo119978p()) {
            if (System.currentTimeMillis() - m1Var.mo119979q() > j) {
                Log.m105925i("MicroMsg.GameFileManager", "remove file:%s, lifetime:%d", m1Var.mo119971i(), Long.valueOf(j));
                m1Var.mo119966f();
            }
        } else if (m1Var.mo119977o() && (u = m1Var.mo119984u()) != null) {
            for (C86009m1 a : u) {
                m45391a(a, j);
            }
        }
        return true;
    }

    /* renamed from: b */
    public static String m45392b(C41873a aVar) {
        return f112816b + aVar.name() + "/";
    }

    /* renamed from: c */
    public static String m45393c(C41873a aVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        String d = C116299g2.m163848d(C116281f0.C116289i.f348994a.mo177791d(), "account");
        if (!Util.isNullOrNil(d)) {
            str = C112760b.m154195C() + d + "/" + "game/";
        } else {
            str = f112816b;
        }
        Log.m105925i("MicroMsg.GameFileManager", "getGameSdcardRootPathByUin, validPath:%s", str);
        sb.append(str);
        sb.append(aVar.name());
        sb.append("/");
        return sb.toString();
    }

    /* renamed from: d */
    public static String m45394d() {
        String str;
        String d = C116299g2.m163848d(C116281f0.C116289i.f348994a.mo177791d(), "account");
        if (!Util.isNullOrNil(d)) {
            str = C112760b.m154225d() + d + "/" + "game/";
        } else {
            str = f112815a;
        }
        Log.m105925i("MicroMsg.GameFileManager", "getGameDataRootPathByUin, validPath:%s", str);
        return str;
    }

    /* renamed from: e */
    public static String m45395e(C41873a aVar) {
        return m45394d() + aVar.name() + "/";
    }

    /* renamed from: f */
    public static void m45396f(String str) {
        if (!Util.isNullOrNil(str)) {
            Log.m105925i("MicroMsg.GameFileManager", "delete file:%s, ret:%b", str, Boolean.valueOf(C86013q1.m106447h(str)));
        }
    }
}
