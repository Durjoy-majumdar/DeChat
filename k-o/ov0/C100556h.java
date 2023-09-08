package ov0;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C86484b;

/* renamed from: ov0.h */
public class C100556h {
    /* renamed from: a */
    public static int m131581a(String str) {
        if (str == null || str.length() <= 0) {
            return -1;
        }
        int indexOf = str.indexOf(58);
        if (indexOf == -1 || !str.substring(0, indexOf).contains("<")) {
            return indexOf;
        }
        return -1;
    }

    /* renamed from: b */
    public static String m131582b(String str) {
        C100554g h = C100546d.m131563g().mo139995h();
        if (h.f294625o != 0) {
            String genPath = FilePathGenerator.genPath(h.f294626p + "voice2/", "msg_", str, ".amr", 2);
            if (Util.isNullOrNil(genPath)) {
                return null;
            }
            Uri n = C116299g2.m163858n(genPath);
            String path = n.getPath();
            boolean z = false;
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
                return genPath;
            }
            StringBuilder sb = new StringBuilder();
            C100554g h2 = C100546d.m131563g().mo139995h();
            if (h2.f294625o != 0) {
                sb.append(h2.f294626p + "voice/");
                sb.append(str);
                String sb4 = sb.toString();
                Uri n2 = C116299g2.m163858n(sb4 + ".amr");
                String path2 = n2.getPath();
                if (path2 != null) {
                    String k2 = C116299g2.m163855k(path2, false, false);
                    if (!n2.getPath().equals(k2)) {
                        n2 = n2.buildUpon().path(k2).build();
                    }
                }
                C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
                if (!l2.mo177810a() ? false : l2.f348991a.mo119948x(l2.f348992b)) {
                    C86013q1.m106463x(sb4 + ".amr", genPath);
                } else {
                    Uri n3 = C116299g2.m163858n(sb4);
                    String path3 = n3.getPath();
                    if (path3 != null) {
                        String k3 = C116299g2.m163855k(path3, false, false);
                        if (!n3.getPath().equals(k3)) {
                            n3 = n3.buildUpon().path(k3).build();
                        }
                    }
                    C116281f0.C116288h l3 = C116281f0.C116289i.f348994a.mo177799l(n3, (C116281f0.C116288h) null);
                    if (l3.mo177810a()) {
                        z = l3.f348991a.mo119948x(l3.f348992b);
                    }
                    if (z) {
                        C86013q1.m106463x(sb4, genPath);
                    }
                }
                return genPath;
            }
            throw new C86484b();
        }
        throw new C86484b();
    }

    /* renamed from: c */
    public static long m131583c(C72963f4 f4Var) {
        C100554g h = C100546d.m131563g().mo139995h();
        if (h.f294625o != 0) {
            C72996z1 z1Var = h.f294612b.get(f4Var.mo108768t());
            if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
                if (!Util.isNullOrNil(f4Var.mo108768t())) {
                    C100544c f = C100546d.m131563g().mo139994f();
                    f.f294588b.post(new C100542a(f, 2, f4Var.mo108768t()));
                    C100554g h2 = C100546d.m131563g().mo139995h();
                    if (h2.f294625o != 0) {
                        h2.f294612b.mo69667P3(new C72996z1(f4Var.mo108768t()));
                    } else {
                        throw new C86484b();
                    }
                } else if (f4Var.mo108768t().endsWith("@chatroom")) {
                    C100554g h3 = C100546d.m131563g().mo139995h();
                    if (h3.f294625o != 0) {
                        if (((C44662n1) h3.f294619i).mo69804bD(f4Var.mo108768t()) == null) {
                            C100544c f2 = C100546d.m131563g().mo139994f();
                            f2.f294588b.post(new C100542a(f2, 2, f4Var.mo108768t()));
                        }
                    } else {
                        throw new C86484b();
                    }
                }
            }
            long my02 = ((C72972g4) C100546d.m131563g().mo139995h().mo140008h()).my0(f4Var);
            if (my02 < 0) {
                Log.m105921e("MicroMsg.BakOldTempStorageLogic", "insertMsgWithContact faile: type:%d, talker:%s", Integer.valueOf(f4Var.getType()), f4Var.mo108768t());
            }
            return my02;
        }
        throw new C86484b();
    }

    /* renamed from: d */
    public static boolean m131584d(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return str.endsWith("@chatroom");
    }
}
