package ob0;

import a24.C112734b;
import c24.C113237b;
import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import oa1.C117731d;
import oicq.wlogin_sdk.request.WUserSigInfo;
import oicq.wlogin_sdk.sharemem.WloginSigInfo;
import oicq.wlogin_sdk.tools.C117790util;
import p156gj.C87203t;
import qe3.C89625d;
import sf0.C90188n0;

/* renamed from: ob0.o0 */
public class C117744o0 {

    /* renamed from: a */
    public C112734b f352113a = null;

    /* renamed from: b */
    public long f352114b = 0;

    /* renamed from: ob0.o0$a */
    public class C117745a extends C113237b {
        public C117745a(C117744o0 o0Var) {
        }

        /* renamed from: a */
        public void mo165786a(int i, String str, String str2) {
            if (i == 1) {
                Log.m105925i("MicroMsg.WtloginMgr.Core", "[%s]%s", str, str2);
            } else if (i == 2) {
                Log.m105919d("MicroMsg.WtloginMgr.Core", "[%s]%s", str, str2);
            } else if (i == 0) {
                Log.m105929w("MicroMsg.WtloginMgr.Core", "[%s]%s", str, str2);
            }
        }
    }

    public C117744o0() {
        try {
            long nowMilliSecond = Util.nowMilliSecond();
            if (C117790util.m166192n(MMApplicationContext.getContext()).length == 0) {
                C117790util.m166198t(MMApplicationContext.getContext(), C87203t.m108273i().getBytes());
            }
            this.f352113a = new C112734b(MMApplicationContext.getContext(), C89625d.f257841g);
            C117790util.f352326a = 1;
            C117790util.f352327b = new C117745a(this);
            Log.m105919d("MicroMsg.WtloginMgr", "dkstart wtlogin init :%d", Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WtloginMgr", e, "Failed initializing WtloginMgr.", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo182471a(long j) {
        long j2 = this.f352114b;
        if (j != j2) {
            Log.m105921e("MicroMsg.WtloginMgr", "dkwt clearUserWtInfo Error uin ReqUin:%d RespUin:%d", Long.valueOf(j2), Long.valueOf(j));
            return;
        }
        try {
            this.f352113a.mo164480b(j);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WtloginMgr", "dkwt clearUserWtInfo e:%s", e.getMessage());
            Log.m105921e("MicroMsg.WtloginMgr", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: b */
    public byte[] mo182472b(long j) {
        WUserSigInfo wUserSigInfo;
        long j2 = this.f352114b;
        if (j != j2) {
            Log.m105921e("MicroMsg.WtloginMgr", "dkwt getA2KeyByRespBuf Error uin ReqUin:%d RespUin:%d", Long.valueOf(j2), Long.valueOf(j));
            return new byte[0];
        }
        try {
            WloginSigInfo a = this.f352113a.f337550a.mo164497a(j, 522017402);
            if (a == null) {
                wUserSigInfo = null;
            } else {
                WUserSigInfo wUserSigInfo2 = new WUserSigInfo();
                wUserSigInfo2.get_clone(a);
                wUserSigInfo = wUserSigInfo2;
            }
            return wUserSigInfo == null ? new byte[0] : wUserSigInfo._A2;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WtloginMgr", "dkwt getA2KeyByRespBuf e:%s", e.getMessage());
            Log.m105921e("MicroMsg.WtloginMgr", "exception:%s", Util.stackTraceToString(e));
            return new byte[0];
        }
    }

    /* renamed from: c */
    public byte[] mo182473c(long j, String str) {
        long j2 = this.f352114b;
        if (j != j2) {
            Log.m105921e("MicroMsg.WtloginMgr", "dkwt getReqLoginBufbyVerifyImg Error uin ReqUin:%d RespUin:%d", Long.valueOf(j2), Long.valueOf(j));
            return new byte[0];
        }
        try {
            return this.f352113a.mo164479a(j, Util.isNullOrNil(str) ? "****".getBytes() : str.getBytes());
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WtloginMgr", "dkwt getReqLoginBufbyVerifyImg e:%s", e.getMessage());
            Log.m105921e("MicroMsg.WtloginMgr", "exception:%s", Util.stackTraceToString(e));
            return new byte[0];
        }
    }

    /* renamed from: d */
    public byte[] mo182474d(long j, String str, boolean z) {
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(C90188n0.f258950r == 10006);
        objArr[1] = Integer.valueOf(C90188n0.f258951s);
        Log.m105919d("MicroMsg.WtloginMgr", "dkwt isTestWtLogin:%b val:%d", objArr);
        if (C90188n0.f258950r == 10006) {
            int i = C90188n0.f258951s;
            if (i == 1) {
                C90188n0.f258951s = 0;
                return new byte[0];
            } else if (i == 2) {
                return new byte[0];
            }
        }
        if (!z) {
            try {
                if (C86709a0.m107522a()) {
                    if ((C117731d.m166007c().mo182443e("clicfg_wtlogin_buf_expr", 0, true, true) == 0) && !C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_MANUAL_AUTH_AS_QQ_ACCOUNT_BOOLEAN_SYNC, true)) {
                        return new byte[0];
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WtloginMgr", "dkwt getReqLoginBuf e:%s", e.getMessage());
                Log.m105921e("MicroMsg.WtloginMgr", "exception:%s", Util.stackTraceToString(e));
                return new byte[0];
            }
        }
        this.f352114b = j;
        byte[] e2 = z ? null : this.f352113a.mo164483e(j, 522017402, 8256, C112734b.C112735a.USER_WITH_A1, "");
        Object[] objArr2 = new Object[4];
        objArr2[0] = 8256;
        objArr2[1] = Long.valueOf(j);
        objArr2[2] = Boolean.valueOf(z);
        objArr2[3] = Boolean.valueOf(!Util.isNullOrNil(e2));
        Log.m105919d("MicroMsg.WtloginMgr", "dkwt getReqLoginBuf sig:%d uin:%d manualauth:%b  byA1Buf:%b ", objArr2);
        if (!Util.isNullOrNil(e2)) {
            return e2;
        }
        return this.f352113a.mo164483e(j, 522017402, 8256, C112734b.C112735a.USER_WITH_MD5, new String(Util.decodeHexString(str), KindaConfigCacheStg.SAVE_CHARSET));
    }

    /* renamed from: e */
    public byte[] mo182475e(long j) {
        long j2 = this.f352114b;
        if (j != j2) {
            Log.m105921e("MicroMsg.WtloginMgr", "dkwt getVerifyImg Error uin ReqUin:%d RespUin:%d", Long.valueOf(j2), Long.valueOf(j));
            return new byte[0];
        }
        try {
            return this.f352113a.mo164482d(j);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WtloginMgr", "dkwt getVerifyImg e:%s", e.getMessage());
            Log.m105921e("MicroMsg.WtloginMgr", "exception:%s", Util.stackTraceToString(e));
            return new byte[0];
        }
    }

    /* renamed from: f */
    public boolean mo182476f(long j, byte[] bArr) {
        long j2 = this.f352114b;
        if (j != j2) {
            Log.m105921e("MicroMsg.WtloginMgr", "dkwt parseRespLoginBuf Error uin ReqUin:%d RespUin:%d", Long.valueOf(j2), Long.valueOf(j));
            return false;
        } else if (Util.isNullOrNil(bArr)) {
            Log.m105920e("MicroMsg.WtloginMgr", "dkwt parseRespLoginBuf respBuf is null.");
            return false;
        } else {
            try {
                int f = this.f352113a.mo164484f(bArr);
                Log.m105919d("MicroMsg.WtloginMgr", "dkwt parseRespLoginBuf buflen:%d ret:%d", Integer.valueOf(bArr.length), Integer.valueOf(f));
                return f == 0;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WtloginMgr", "dkwt parseRespLoginBuf e:%s", e.getMessage());
                Log.m105921e("MicroMsg.WtloginMgr", "exception:%s", Util.stackTraceToString(e));
                return false;
            }
        }
    }
}
