package me2;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.Calendar;

/* renamed from: me2.a */
public class C10783a {
    /* renamed from: a */
    public static String m10757a(String str, String str2, String str3) {
        String str4;
        Uri n = C116299g2.m163858n(str);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
            if (l2.mo177810a()) {
                l2.f348991a.mo119937g(l2.f348992b);
            }
        }
        if (Util.isNullOrNil(str2)) {
            str4 = str + "da_" + Util.nowMilliSecond();
            if (!Util.isNullOrNil(str3)) {
                str4 = str4 + "." + str3;
            }
        } else {
            if (!Util.isNullOrNil(str3) && !str2.endsWith(str3)) {
                str2 = str2 + "." + str3;
            }
            String str5 = str + str2;
            if (C86013q1.m106450k(str5)) {
                int i = 1;
                while (true) {
                    if (i >= 20) {
                        str4 = str5;
                        break;
                    }
                    if (!C86013q1.m106450k(str + i + "_" + str2)) {
                        str4 = str + i + "_" + str2;
                        break;
                    }
                    i++;
                }
                if (i == 20) {
                    str4 = str + "da_" + Util.nowMilliSecond();
                    if (!Util.isNullOrNil(str3)) {
                        str4 = str4 + "." + str3;
                    }
                }
            } else {
                str4 = str5;
            }
        }
        try {
            if (new C86009m1(str4).mo119974l().mo119971i().equalsIgnoreCase(new C86009m1(str).mo119971i())) {
                return str4;
            }
            String str6 = str + "da_" + Util.nowMilliSecond();
            Log.m105929w("MicroMsg.Priority.PriorityUtil", "maybe DirTraversal attach. %s", str6);
            return str6;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Priority.PriorityUtil", e, "", new Object[0]);
            String str7 = str + "da_" + Util.nowMilliSecond();
            if (Util.isNullOrNil(str3)) {
                return str7;
            }
            return str7 + "." + str3;
        }
    }

    /* renamed from: b */
    public static long m10758b() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }

    /* renamed from: c */
    public static final boolean m10759c(int i, int i2) {
        return (i & i2) > 0;
    }
}
