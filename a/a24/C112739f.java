package a24;

import android.content.Context;
import b24.C113088d;
import b24.C113090e;
import java.security.SecureRandom;
import oicq.wlogin_sdk.sharemem.WloginSigInfo;
import oicq.wlogin_sdk.tools.C117790util;
import oicq.wlogin_sdk.tools.ErrMsg;

/* renamed from: a24.f */
public class C112739f {

    /* renamed from: A */
    public static byte[] f337570A = new byte[0];

    /* renamed from: a */
    public SecureRandom f337571a = new SecureRandom();

    /* renamed from: b */
    public byte[] f337572b = SecureRandom.getSeed(16);

    /* renamed from: c */
    public byte[] f337573c = new byte[16];

    /* renamed from: d */
    public C113088d f337574d = new C113088d();

    /* renamed from: e */
    public C113090e f337575e = new C113090e();

    /* renamed from: f */
    public long f337576f = 0;

    /* renamed from: g */
    public long f337577g = 0;

    /* renamed from: h */
    public long f337578h = -1;

    /* renamed from: i */
    public int f337579i = 0;

    /* renamed from: j */
    public Context f337580j = null;

    /* renamed from: k */
    public byte[] f337581k = new byte[0];

    /* renamed from: l */
    public byte[] f337582l = new byte[0];

    /* renamed from: m */
    public int f337583m = 0;

    /* renamed from: n */
    public byte[] f337584n = new byte[0];

    /* renamed from: o */
    public byte[] f337585o = new byte[0];

    /* renamed from: p */
    public byte[] f337586p = new byte[0];

    /* renamed from: q */
    public byte[] f337587q = new byte[0];

    /* renamed from: r */
    public byte[] f337588r = new byte[0];

    /* renamed from: s */
    public int f337589s = 0;

    /* renamed from: t */
    public int f337590t = 0;

    /* renamed from: u */
    public int f337591u = 0;

    /* renamed from: v */
    public byte[] f337592v = new byte[0];

    /* renamed from: w */
    public ErrMsg f337593w = new ErrMsg();

    /* renamed from: x */
    public byte[] f337594x = new byte[0];

    /* renamed from: y */
    public byte[] f337595y = new byte[4];

    /* renamed from: z */
    public C112736c f337596z = null;

    public C112739f(Context context) {
    }

    /* renamed from: a */
    public synchronized WloginSigInfo mo164497a(long j, long j2) {
        C117790util.m166180b("get_siginfo", "uin=" + j + "appid=" + j2);
        WloginSigInfo b = this.f337596z.mo164487b(j, j2);
        return b != null ? b : b;
    }
}
