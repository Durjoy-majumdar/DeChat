package y72;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C97625j3;
import yu0.C102913k;

/* renamed from: y72.i */
public class C102825i {
    /* renamed from: a */
    public static void m135892a(String str, String str2, byte[] bArr) {
        int i;
        String str3 = str;
        String str4 = str2;
        byte[] bArr2 = bArr;
        if (TextUtils.isEmpty(str) || bArr2 == null) {
            Log.m105921e("MicroMsg.MsgSynchronizeUtil", "appendFile dir:%s fileName:%s ", str3, str4);
            return;
        }
        int i2 = 3;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                long f = C102913k.m136041f(str3 + str4);
                try {
                    Uri n = C116299g2.m163858n(str);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    C116281f0 f0Var = C116281f0.C116289i.f348994a;
                    C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
                    if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                        C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                        if (l2.mo177810a()) {
                            l2.f348991a.mo119937g(l2.f348992b);
                        }
                    }
                    String str5 = str3 + "/" + str4;
                    C86009m1 m1Var = new C86009m1(str5);
                    if (!m1Var.mo119967g()) {
                        m1Var.mo119964e();
                    }
                    i = C86013q1.m106440a(str5, bArr2);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.MsgSynchronizeUtil", e, "", new Object[0]);
                    i = -1;
                }
                long f2 = C102913k.m136041f(str3 + str4);
                if (i != 0 || f2 < ((long) bArr2.length)) {
                    Log.m105921e("MicroMsg.MsgSynchronizeUtil", "appendFile retry:%d append:%d  old:%d  new:%d  data:%d", Integer.valueOf(i3), Integer.valueOf(i), Long.valueOf(f), Long.valueOf(f2), Integer.valueOf(bArr2.length));
                    i2 = i3;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static String m135893b() {
        return C97625j3.m125812b().mo105901p() + "msgsynchronize/";
    }

    /* renamed from: c */
    public static String m135894c() {
        try {
            String str = C97625j3.m125812b().mo105901p() + "msgsynchronize.zip";
            C86009m1 m1Var = new C86009m1(str);
            if (!m1Var.mo119967g()) {
                m1Var.mo119964e();
            }
            return str;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MsgSynchronizeUtil", e, "", new Object[0]);
            return "";
        }
    }
}
