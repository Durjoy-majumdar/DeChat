package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import com.tencent.mars.ilink.comm.PlatformComm;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105134d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.wxmm.IConfCallBack;
import di3.C86312j;
import java.io.IOException;
import n11.C88873b;
import ob0.C47350c;
import p144dt.C7516d;
import p206nj.C88957l;
import te3.C110967kz;
import te3.C51120rk2;
import te3.C64660qk2;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.t0 */
public class C105173t0 implements C105134d1.C105136b {

    /* renamed from: a */
    public final /* synthetic */ C85147b f312298a;

    /* renamed from: b */
    public final /* synthetic */ C88873b f312299b;

    /* renamed from: c */
    public final /* synthetic */ C105181w f312300c;

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.t0$a */
    public class C105174a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f312301d;

        /* renamed from: e */
        public final /* synthetic */ int f312302e;

        /* renamed from: f */
        public final /* synthetic */ C105132c1 f312303f;

        /* renamed from: g */
        public final /* synthetic */ boolean f312304g;

        /* renamed from: h */
        public final /* synthetic */ String f312305h;

        public C105174a(int i, int i2, C105132c1 c1Var, boolean z, String str) {
            this.f312301d = i;
            this.f312302e = i2;
            this.f312303f = c1Var;
            this.f312304g = z;
            this.f312305h = str;
        }

        public void run() {
            C105132c1 c1Var;
            String[] strArr;
            if (!C105173t0.this.f312300c.f312348K) {
                Log.m105928w("MicroMsg.OpenVoice.OpenVoiceService", "hy: not joining room! abort");
            } else if (this.f312301d != 0 || this.f312302e != 0 || (c1Var = this.f312303f) == null || !c1Var.mo149444a()) {
                C105173t0 t0Var = C105173t0.this;
                t0Var.f312300c.mo149497c(t0Var.f312298a, -10088, -8, String.format("get session key failed. errType: %d, errCode: %d errMsg: %s", new Object[]{Integer.valueOf(this.f312301d), Integer.valueOf(this.f312302e), this.f312305h}));
            } else {
                C105181w wVar = C105173t0.this.f312300c;
                if (!wVar.f312349L) {
                    String str = this.f312303f.f312154a;
                    IConfCallBack a = wVar.f312375e.mo149489a(true);
                    String str2 = wVar.f312385q;
                    String str3 = wVar.f312383p;
                    int i = wVar.f312387s;
                    int i2 = wVar.f312389u;
                    int i3 = wVar.f312390v;
                    String[] strArr2 = C105172s.f312295a;
                    Log.m105924i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "hy: init voip");
                    ((C7516d) C86312j.m106911c(C7516d.class)).mo8638Za();
                    Context context = MMApplicationContext.getContext();
                    Log.m105924i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "prepareOpenVoiceEnv, hasInit " + C105172s.f312296b);
                    if (!C105172s.f312296b) {
                        C105172s.f312296b = true;
                        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "hy: load so");
                        String[] strArr3 = C105172s.f312295a;
                        int i4 = 0;
                        while (i4 < 5) {
                            try {
                                C88957l.m111079o(strArr3[i4], C105172s.class.getClassLoader());
                                strArr = strArr3;
                            } catch (Throwable th) {
                                StringBuilder sb = new StringBuilder();
                                strArr = strArr3;
                                sb.append("tryLoadLibrary fail, error = ");
                                sb.append(th.getMessage());
                                Log.m105928w("MicroMsg.OpenVoice.OpenVoiceNativeEngine", sb.toString());
                            }
                            i4++;
                            strArr3 = strArr;
                        }
                        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "load so end");
                        if (Looper.getMainLooper() == Looper.myLooper()) {
                            PlatformComm.init(context, new Handler(Looper.getMainLooper()));
                            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "main thread exec PlatformComm.init");
                        } else {
                            ConditionVariable conditionVariable = new ConditionVariable();
                            ((C119157j) C119157j.f356862d).mo183868B(new C105171r(context, conditionVariable));
                            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "condition block wait for open");
                            conditionVariable.block(2000);
                            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "condition block release...");
                        }
                    }
                    int i5 = -1;
                    try {
                        C110967kz a2 = C105172s.m141220a(str2, str3, str, i, i2, i3, false);
                        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "envInfo:" + new String(a2.toByteArray()) + ",length:" + a2.toByteArray().length);
                        i5 = C105172s.f312297c.InitSDK(a2.toByteArray(), a2.toByteArray().length, a);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("init ret:");
                        sb4.append(i5);
                        Log.m105926v("MicroMsg.OpenVoice.OpenVoiceNativeEngine", sb4.toString());
                    } catch (IOException e) {
                        Log.printErrStackTrace("MicroMsg.OpenVoice.OpenVoiceNativeEngine", e, "envInfo exception", new Object[0]);
                    }
                    C105180v0 v0Var = new C105180v0(wVar);
                    wVar.f312341D = v0Var;
                    wVar.f312375e.mo149490b(27, v0Var);
                    if (i5 != 0) {
                        C105173t0 t0Var2 = C105173t0.this;
                        C105181w wVar2 = t0Var2.f312300c;
                        C85147b bVar = t0Var2.f312298a;
                        wVar2.mo149497c(bVar, -10086, -3, "init failed: " + i5);
                        return;
                    }
                    C29812t tVar = C29812t.INSTANCE;
                    Log.m105924i("MicroMsg.OpenVoice.OpenVoiceNetworkMgr", "hy: start listen to network change");
                    tVar.mo56930a(0);
                } else if (this.f312304g) {
                    Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "hy: already initialized, but the former ");
                    String str4 = this.f312303f.f312154a;
                    C105172s.f312297c.UpdateAuthKey(str4.getBytes(), str4.getBytes().length);
                }
                C105173t0 t0Var3 = C105173t0.this;
                t0Var3.f312300c.f312349L = true;
                C88873b bVar2 = t0Var3.f312299b;
                long j = bVar2.f256344o;
                if (j > 0) {
                    Log.m105925i("MicroMsg.OpenVoice.OpenVoiceService", "hy: roomId:%d already initialized, furtherJoinCheck", Long.valueOf(j));
                    C105173t0 t0Var4 = C105173t0.this;
                    C105181w wVar3 = t0Var4.f312300c;
                    C88873b bVar3 = t0Var4.f312299b;
                    C105181w.m141243b(wVar3, bVar3.f256344o, bVar3.f256340k.f256327a, t0Var4.f312298a);
                    return;
                }
                Log.m105925i("MicroMsg.OpenVoice.OpenVoiceService", "hy: joinRoomImp with groupId:%s", bVar2.f256335f);
                C105173t0 t0Var5 = C105173t0.this;
                C105181w wVar4 = t0Var5.f312300c;
                C88873b bVar4 = t0Var5.f312299b;
                String str5 = bVar4.f256333d;
                String str6 = bVar4.f256335f;
                String str7 = bVar4.f256334e;
                int i6 = bVar4.f256336g;
                boolean z = bVar4.f256340k.f256327a;
                C85147b bVar5 = t0Var5.f312298a;
                wVar4.getClass();
                C47350c.C47352b bVar6 = new C47350c.C47352b();
                bVar6.f127066a = new C64660qk2();
                bVar6.f127067b = new C51120rk2();
                bVar6.f127069d = 1991;
                bVar6.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/joincloudimroom";
                bVar6.f127070e = 0;
                bVar6.f127071f = 0;
                C47350c a3 = bVar6.mo72403a();
                C64660qk2 qk22 = (C64660qk2) a3.f127055a.f127080a;
                qk22.f185052d = wVar4.f312383p;
                qk22.f185053e = str6;
                qk22.f185054f = str5;
                qk22.f185055g = i6;
                qk22.f185056h = str7;
                qk22.f185057i = wVar4.f312386r;
                ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(a3, new C105184w0(wVar4, bVar5, z));
            }
        }
    }

    public C105173t0(C105181w wVar, C85147b bVar, C88873b bVar2) {
        this.f312300c = wVar;
        this.f312298a = bVar;
        this.f312299b = bVar2;
    }

    /* renamed from: a */
    public void mo149449a(int i, int i2, String str, C105132c1 c1Var, boolean z) {
        Log.m105925i("MicroMsg.OpenVoice.OpenVoiceService", "hy: session result: %d, %d, %s, %s, %b", Integer.valueOf(i), Integer.valueOf(i2), str, c1Var, Boolean.valueOf(z));
        this.f312300c.mo149500g(new C105174a(i, i2, c1Var, z, str));
    }
}
