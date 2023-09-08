package com.tencent.p014mm.console;

import a70.C112760b;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Looper;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C114663g0;
import com.tencent.p014mm.autogen.events.BackupProcessMgrExitEvent;
import com.tencent.p014mm.autogen.events.SnsNewSyncObjectEvent;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.modelsimple.C40371t;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C40377j;
import com.tencent.p014mm.network.C40384w;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.plugin.magicbrush.api.WxaMagicPkgInfo;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.pluginsdk.platformtools.C85623c;
import com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateTestCommand;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences;
import com.tencent.p014mm.sdk.platformtools.SdcardUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85798u1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.xwebutil.C86032n;
import com.tencent.xweb.CookieManager;
import d42.C31066c0;
import di3.C86312j;
import eb0.C75576f4;
import eb0.C75604z3;
import eb0.C97625j3;
import ee0.C45649c;
import f40.C75681p0;
import f40.C86709a0;
import f62.C75700k0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import lu3.C88656g;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import p1087sj.C101633a;
import p214om.C11502f;
import p620nm.C89013r;
import p661qj.C101201d;
import p661qj.C35904a;
import p661qj.C35905b;
import p661qj.C35906e;
import p661qj.C35908g;
import p661qj.C35909k;
import p661qj.C35910n;
import p661qj.C47841m;
import p661qj.C77352c;
import p661qj.C77353l;
import p661qj.C89677h;
import p661qj.C89678i;
import p661qj.C89679j;
import p757xv.C38850q;
import p910lj.C76701a;
import qe3.C89625d;
import r41.C47926a;
import s51.C48226a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.console.a */
public final class C92618a {

    /* renamed from: a */
    public static final HashSet<String> f266588a;

    /* renamed from: com.tencent.mm.console.a$d */
    public class C17720d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f48780d;

        /* renamed from: e */
        public final /* synthetic */ int f48781e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f48782f;

        /* renamed from: g */
        public final /* synthetic */ Context f48783g;

        /* renamed from: com.tencent.mm.console.a$d$a */
        public class C17721a implements Runnable {

            /* renamed from: com.tencent.mm.console.a$d$a$a */
            public class C17722a implements Runnable {
                public C17722a() {
                }

                public void run() {
                    Context context = C17720d.this.f48783g;
                    C76879j.m92727U(context, context.getString(C0966R.string.bvq), 1);
                }
            }

            /* renamed from: com.tencent.mm.console.a$d$a$b */
            public class C17723b implements Runnable {
                public C17723b() {
                }

                public void run() {
                    Context context = C17720d.this.f48783g;
                    C76879j.m92727U(context, context.getString(C0966R.string.bvp), 1);
                }
            }

            public C17721a() {
            }

            public void run() {
                try {
                    String substring = C17720d.this.f48780d.substring(10);
                    String f0 = C112760b.m154230f0();
                    String f = C97625j3.m125812b().mo105891f();
                    String str = f + substring;
                    String substring2 = str.substring(f0.length());
                    Log.m105925i("MicroMsg.CommandProcessor", "summercmd copy -n subDir:%s, root:%s, accPath:%s destPath:%s, subPath:%s", substring, f0, f, str, substring2);
                    int i = 0;
                    while (true) {
                        C17720d dVar = C17720d.this;
                        if (i < dVar.f48781e) {
                            String str2 = ((SdcardUtil.StatMountParse) dVar.f48782f.get(i)).mountDir;
                            if (!Util.isNullOrNil(str2)) {
                                if (!f0.contains(str2)) {
                                    C86009m1 m1Var = new C86009m1(str2 + substring2);
                                    if (m1Var.mo119967g() && m1Var.mo119977o()) {
                                        C86009m1 m1Var2 = new C86009m1(str);
                                        if (!m1Var2.mo119967g()) {
                                            m1Var2.mo119987x();
                                        }
                                        boolean b = C86013q1.m106441b(m1Var.mo119971i(), m1Var2.mo119971i());
                                        Log.m105925i("MicroMsg.CommandProcessor", "summercmd copy -n done new:%s, old:%s, ret:%b", m1Var2.mo119971i(), m1Var.mo119971i(), Boolean.valueOf(b));
                                        if (b) {
                                            new MMHandler(Looper.getMainLooper()).post(new C17722a());
                                            return;
                                        }
                                    }
                                }
                            }
                            i++;
                        } else {
                            new MMHandler(Looper.getMainLooper()).post(new C17723b());
                            return;
                        }
                    }
                } catch (Exception e) {
                    Log.m105929w("MicroMsg.CommandProcessor", "summercmd copy -n e:%s", e.getMessage());
                }
            }
        }

        public C17720d(String str, int i, ArrayList arrayList, Context context) {
            this.f48780d = str;
            this.f48781e = i;
            this.f48782f = arrayList;
            this.f48783g = context;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C119157j) C119157j.f356862d).mo183875f(new C17721a());
        }
    }

    /* renamed from: com.tencent.mm.console.a$e */
    public class C40282e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C44661m1 f108307d;

        /* renamed from: e */
        public final /* synthetic */ String f108308e;

        /* renamed from: f */
        public final /* synthetic */ String f108309f;

        public C40282e(C44661m1 m1Var, String str, String str2) {
            this.f108307d = m1Var;
            this.f108308e = str;
            this.f108309f = str2;
        }

        public void run() {
            int i;
            Class cls = C75700k0.class;
            int s2 = this.f108307d.mo69791s2();
            C44661m1 m1Var = this.f108307d;
            int i2 = m1Var.field_chatroomdataflag;
            int p2 = m1Var.mo69788p2();
            C44661m1 m1Var2 = this.f108307d;
            if (m1Var2.mo69794v2(m1Var2.f121084u1)) {
                m1Var2.mo69784l2();
            }
            int i3 = m1Var2.f121084u1.f106338g;
            int o2 = this.f108307d.mo69787o2();
            C44661m1 m1Var3 = this.f108307d;
            if (m1Var3.mo69794v2(m1Var3.f121084u1)) {
                m1Var3.mo69784l2();
            }
            String str = m1Var3.f121084u1.f106340i;
            List<String> r2 = this.f108307d.mo69790r2();
            C72963f4 Fx0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Fx0(this.f108308e, " and msgSeq != 0 and flag & 2 != 0");
            boolean z = Fx0 != null && Fx0.getMsgId() > 0;
            int Vx0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Vx0(this.f108308e);
            Log.m105925i("MicroMsg.CommandProcessor", "summercrinfo chatroomId[%s], version[%d], flag[%d], type[%d], status[%d], get[%b], msgCount[%d], maxCount[%d], upgrader[%s], membersize[%d]", this.f108308e, Integer.valueOf(s2), Integer.valueOf(i2), Integer.valueOf(p2), Integer.valueOf(i3), Boolean.valueOf(z), Integer.valueOf(Vx0), Integer.valueOf(o2), str, Integer.valueOf(r2.size()));
            StringBuilder sb = new StringBuilder();
            sb.append("---chatroominfo---");
            sb.append("\nid:");
            sb.append(this.f108308e);
            sb.append("\nver:");
            sb.append(s2);
            sb.append("\nflag:");
            sb.append(i2);
            sb.append("\ntype:");
            sb.append(p2);
            sb.append("\nstatus:");
            sb.append(i3);
            sb.append("\nget:");
            sb.append(z);
            sb.append("\nmsgCount:");
            sb.append(Vx0);
            sb.append("\nmaxCount:");
            sb.append(o2);
            sb.append("\nupgrader:");
            sb.append(str);
            sb.append("\nmembersize:");
            sb.append(r2.size());
            sb.append("\nisSilence:");
            sb.append(((C75700k0) C86709a0.m107533q(cls)).mo96101cU().mo101205k(this.f108308e));
            sb.append("\nsillenceBlock:");
            sb.append(((C75700k0) C86709a0.m107533q(cls)).mo96101cU().mo101209o(this.f108308e).toString());
            try {
                i = Util.getInt(this.f108309f.split(" ")[1], 0);
            } catch (Exception unused) {
                i = -1;
            }
            if (i == -1) {
                i = r2.size();
            }
            if (i > r2.size()) {
                i = r2.size();
            }
            if (i > 10) {
                i = 10;
            }
            if (i > 0) {
                sb.append("\nmember:");
            }
            for (int i4 = 0; i4 < i; i4++) {
                sb.append("\n");
                sb.append(r2.get(i4));
            }
            C72963f4 f4Var = new C72963f4();
            f4Var.mo108749c3(this.f108308e);
            f4Var.mo108740T2(2);
            f4Var.setType(1);
            f4Var.mo108733M2(System.currentTimeMillis());
            f4Var.mo108732L2(sb.toString());
            C75604z3.m90852x(f4Var);
        }
    }

    /* renamed from: com.tencent.mm.console.a$g */
    public class C40283g implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ Context f108310d;

        public C40283g(Context context) {
            this.f108310d = context;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if (2812 == yVar.getType()) {
                C86709a0.m107524d().mo123470p(2812, this);
                C48226a aVar = (C48226a) yVar;
                Context context = this.f108310d;
                C76701a.makeText(context, (CharSequence) "errType:" + i + ", errCode:" + i2 + ", coupon ret_code:" + aVar.f129215f + ", coupon ret_msg:" + aVar.f129216g + ".", 1).show();
            }
        }
    }

    /* renamed from: com.tencent.mm.console.a$h */
    public class C40284h implements C75576f4.C75578b {
        /* renamed from: a */
        public void mo57753a(C114770g gVar) {
            if (gVar != null) {
                gVar.mo55443A3().mo55422X0(new byte[0], new byte[0], new byte[0], C97625j3.m125812b().mo105881G());
            }
        }
    }

    /* renamed from: com.tencent.mm.console.a$j */
    public class C40285j extends C40384w.C40385a {
        /* renamed from: Yt */
        public void mo62838Yt(boolean z, float f, float f2, boolean z2, int i, int i2, int i3, boolean z3, int i4, int i5, int i6) {
            Log.m105918d("MicroMsg.CommandProcessor", "onSpeedTestDone " + z + " " + f + " " + z2 + " " + i + " " + z3 + " " + i4);
        }

        /* renamed from: pB */
        public void mo62839pB(boolean z, float f, float f2, boolean z2, int i, int i2, int i3) {
            Log.m105918d("MicroMsg.CommandProcessor", "onUploadAndRttDone " + z + " " + f + " " + z2 + " " + i);
        }
    }

    /* renamed from: com.tencent.mm.console.a$k */
    public class C40286k implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f108311d;

        public C40286k(String str) {
            this.f108311d = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ClipboardHelper.setText(this.f108311d);
        }
    }

    /* renamed from: com.tencent.mm.console.a$l */
    public class C40287l extends C40377j.C40378a {
        /* renamed from: q2 */
        public void mo59883q2(boolean z, int i) {
            Log.m105918d("weaknet", "receive weak net " + (z ? 1 : 0) + ", rtt " + i);
        }
    }

    /* renamed from: com.tencent.mm.console.a$m */
    public class C40288m implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f108312d;

        /* renamed from: e */
        public final /* synthetic */ Context f108313e;

        public C40288m(String str, Context context) {
            this.f108312d = str;
            this.f108313e = context;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ClipboardHelper.setText(this.f108312d);
            C76701a.makeText(this.f108313e, (int) C0966R.string.kgu, 0).show();
        }
    }

    /* renamed from: com.tencent.mm.console.a$o */
    public class C40289o implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f108314d;

        public C40289o(String str) {
            this.f108314d = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ClipboardHelper.setText(this.f108314d);
        }
    }

    /* renamed from: com.tencent.mm.console.a$q */
    public class C40290q implements C75576f4.C75578b {
        /* renamed from: a */
        public void mo57753a(C114770g gVar) {
            if (gVar != null) {
                String[] E5 = gVar.mo55446E5(true);
                for (int i = 0; i < E5.length; i++) {
                    Log.m105919d("MicroMsg.CommandProcessor", "dkip long:%d  %s", Integer.valueOf(i), E5[i]);
                    Log.m105919d("MicroMsg.CommandProcessor", "dkip long:%d %s", Integer.valueOf(i), C45649c.m50850a(E5[i]).toString());
                }
                String[] E52 = gVar.mo55446E5(false);
                for (int i2 = 0; i2 < E52.length; i2++) {
                    Log.m105919d("MicroMsg.CommandProcessor", "dkip short:%d %s", Integer.valueOf(i2), E52[i2]);
                    Log.m105919d("MicroMsg.CommandProcessor", "dkip long:%d %s", Integer.valueOf(i2), C45649c.m50850a(E52[i2]).toString());
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.console.a$r */
    public class C40291r implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f108315d;

        /* renamed from: e */
        public final /* synthetic */ Context f108316e;

        public C40291r(String str, Context context) {
            this.f108315d = str;
            this.f108316e = context;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ClipboardHelper.setText(this.f108315d);
            C76701a.makeText(this.f108316e, (int) C0966R.string.kgu, 0).show();
        }
    }

    /* renamed from: com.tencent.mm.console.a$s */
    public class C40292s implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f108317d;

        public C40292s(String str) {
            this.f108317d = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ClipboardHelper.setText(this.f108317d);
        }
    }

    /* renamed from: com.tencent.mm.console.a$t */
    public static class C40293t implements C80883e {
        private C40293t() {
        }

        public void invoke(Object obj, C1256g gVar) {
            CookieManager instance = CookieManager.getInstance();
            Log.m105925i("MicroMsg.CommandProcessor", "ClearGameA8keyCookie before, cookie : %s", instance.getCookie("." + WeChatHosts.domainString(C0966R.string.flk)));
            CookieManager instance2 = CookieManager.getInstance();
            instance2.setCookie("." + WeChatHosts.domainString(C0966R.string.flk), "cookie_passkey=; max-age=0");
            CookieManager instance3 = CookieManager.getInstance();
            instance3.setCookie("." + WeChatHosts.domainString(C0966R.string.flk), "uin=; max-age=0; httponly");
            CookieManager instance4 = CookieManager.getInstance();
            instance4.setCookie("." + WeChatHosts.domainString(C0966R.string.flk), "key=; max-age=0; httponly");
            CookieManager instance5 = CookieManager.getInstance();
            instance5.setCookie("." + WeChatHosts.domainString(C0966R.string.flk), "pass_ticket=; max-age=0; httponly");
            CookieManager.getInstance().flush();
            CookieManager instance6 = CookieManager.getInstance();
            Log.m105925i("MicroMsg.CommandProcessor", "ClearGameA8keyCookie end, cookie : %s", instance6.getCookie("." + WeChatHosts.domainString(C0966R.string.flk)));
        }
    }

    /* renamed from: com.tencent.mm.console.a$a */
    public class C80834a implements C31066c0 {

        /* renamed from: com.tencent.mm.console.a$a$a */
        public class C80835a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ WxaMagicPkgInfo f237623d;

            public C80835a(C80834a aVar, WxaMagicPkgInfo wxaMagicPkgInfo) {
                this.f237623d = wxaMagicPkgInfo;
            }

            public void run() {
                C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) this.f237623d.f81571n, 1).show();
            }
        }

        /* renamed from: com.tencent.mm.console.a$a$b */
        public class C80836b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f237624d;

            public C80836b(C80834a aVar, String str) {
                this.f237624d = str;
            }

            public void run() {
                C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) this.f237624d, 1).show();
            }
        }

        /* renamed from: a */
        public void mo112588a(int i, String str) {
            Log.m105925i("shortlink", "checkMagicPkg failed with %d, %s", Integer.valueOf(i), str);
            ((C119157j) C119157j.f356862d).mo183895z(new C80836b(this, str));
        }

        /* renamed from: b */
        public void mo112589b(WxaMagicPkgInfo wxaMagicPkgInfo) {
            Log.m105925i("shortlink", "checkMagicPkg success with %s", wxaMagicPkgInfo);
            if (wxaMagicPkgInfo != null) {
                ((C119157j) C119157j.f356862d).mo183895z(new C80835a(this, wxaMagicPkgInfo));
            }
        }
    }

    /* renamed from: com.tencent.mm.console.a$i */
    public class C80837i implements C75576f4.C75578b {

        /* renamed from: a */
        public final /* synthetic */ int f237625a;

        /* renamed from: b */
        public final /* synthetic */ int f237626b;

        public C80837i(int i, int i2) {
            this.f237625a = i;
            this.f237626b = i2;
        }

        /* renamed from: a */
        public void mo57753a(C114770g gVar) {
            int i = this.f237625a;
            int i2 = this.f237626b;
            C114770g[] gVarArr = C114663g0.f343521a;
            Date date = new Date();
            date.setTime(Util.nowMilliSecond() - (((long) i) * 86400000));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
            C114663g0.m161243c(C112760b.m154219a() + "crash_" + simpleDateFormat.format(date) + ".txt", 20001, i2, (String) null, (String) null, (C114663g0.C114666c) null);
        }
    }

    /* renamed from: com.tencent.mm.console.a$n */
    public class C80838n implements Runnable {

        /* renamed from: com.tencent.mm.console.a$n$a */
        public class C80839a implements MTimerHandler.CallBack {
            public C80839a(C80838n nVar) {
            }

            /* JADX WARNING: Removed duplicated region for block: B:31:0x00ce A[SYNTHETIC, Splitter:B:31:0x00ce] */
            /* JADX WARNING: Removed duplicated region for block: B:38:0x0102  */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x012e A[SYNTHETIC, Splitter:B:44:0x012e] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean onTimerExpired() {
                /*
                    r10 = this;
                    java.lang.String r0 = "getRunningProcessesByPs finally got ex = %s"
                    r1 = 23
                    boolean r2 = p206nj.C11171e.m11046c(r1)
                    r3 = 2
                    r4 = 0
                    r5 = 1
                    java.lang.String r6 = "MicroMsg.CommandProcessor"
                    if (r2 == 0) goto L_0x001d
                    java.util.Map r2 = android.os.Debug.getRuntimeStats()
                    java.lang.Object[] r7 = new java.lang.Object[r5]
                    r7[r4] = r2
                    java.lang.String r2 = "gcCount: %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r7)
                    goto L_0x0038
                L_0x001d:
                    int r2 = android.os.Debug.getGlobalGcInvocationCount()
                    int r7 = android.os.Debug.getThreadGcInvocationCount()
                    java.lang.Object[] r8 = new java.lang.Object[r3]
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r8[r4] = r2
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
                    r8[r5] = r2
                    java.lang.String r2 = "gcCount: %d %d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r8)
                L_0x0038:
                    long r7 = android.os.Debug.getPss()
                    android.os.Debug$MemoryInfo r2 = new android.os.Debug$MemoryInfo
                    r2.<init>()
                    android.os.Debug.getMemoryInfo(r2)
                    boolean r1 = p206nj.C11171e.m11046c(r1)
                    if (r1 == 0) goto L_0x005f
                    java.lang.Object[] r1 = new java.lang.Object[r3]
                    java.lang.Long r7 = java.lang.Long.valueOf(r7)
                    r1[r4] = r7
                    java.util.Map r2 = r2.getMemoryStats()
                    r1[r5] = r2
                    java.lang.String r2 = "pss: %d, memoryInfo:%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r1)
                    goto L_0x0075
                L_0x005f:
                    java.lang.Object[] r1 = new java.lang.Object[r3]
                    java.lang.Long r7 = java.lang.Long.valueOf(r7)
                    r1[r4] = r7
                    int r2 = r2.nativePss
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r1[r5] = r2
                    java.lang.String r2 = "pss: %d, memoryInfo:%d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r1)
                L_0x0075:
                    r1 = 0
                    java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x00bc, all -> 0x00b8 }
                    java.lang.String r7 = "top -m 5 -n 1"
                    java.lang.Process r2 = r2.exec(r7)     // Catch:{ Exception -> 0x00bc, all -> 0x00b8 }
                    java.io.LineNumberReader r7 = new java.io.LineNumberReader     // Catch:{ Exception -> 0x00bc, all -> 0x00b8 }
                    java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00bc, all -> 0x00b8 }
                    java.io.InputStream r9 = r2.getInputStream()     // Catch:{ Exception -> 0x00bc, all -> 0x00b8 }
                    r8.<init>(r9)     // Catch:{ Exception -> 0x00bc, all -> 0x00b8 }
                    r7.<init>(r8)     // Catch:{ Exception -> 0x00bc, all -> 0x00b8 }
                L_0x008f:
                    java.lang.String r1 = r7.readLine()     // Catch:{ Exception -> 0x00b6 }
                    if (r1 == 0) goto L_0x009f
                    int r8 = r1.length()     // Catch:{ Exception -> 0x00b6 }
                    if (r8 <= 0) goto L_0x008f
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)     // Catch:{ Exception -> 0x00b6 }
                    goto L_0x008f
                L_0x009f:
                    r2.waitFor()     // Catch:{ Exception -> 0x00b6 }
                    r2.destroy()     // Catch:{ Exception -> 0x00b6 }
                    r7.close()     // Catch:{ Exception -> 0x00a9 }
                    goto L_0x00de
                L_0x00a9:
                    r1 = move-exception
                    java.lang.Object[] r2 = new java.lang.Object[r5]
                    java.lang.String r1 = r1.getMessage()
                    r2[r4] = r1
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r2)
                    goto L_0x00de
                L_0x00b6:
                    r1 = move-exception
                    goto L_0x00bf
                L_0x00b8:
                    r2 = move-exception
                    r7 = r1
                    r1 = r2
                    goto L_0x012c
                L_0x00bc:
                    r2 = move-exception
                    r7 = r1
                    r1 = r2
                L_0x00bf:
                    java.lang.String r2 = "getRunningAppProcessesByPs fail, ex = %s"
                    java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x012b }
                    java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x012b }
                    r8[r4] = r1     // Catch:{ all -> 0x012b }
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r2, r8)     // Catch:{ all -> 0x012b }
                    if (r7 == 0) goto L_0x00de
                    r7.close()     // Catch:{ Exception -> 0x00d2 }
                    goto L_0x00de
                L_0x00d2:
                    r1 = move-exception
                    java.lang.Object[] r2 = new java.lang.Object[r5]
                    java.lang.String r1 = r1.getMessage()
                    r2[r4] = r1
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r2)
                L_0x00de:
                    int r0 = java.lang.Thread.activeCount()
                    java.lang.Object[] r1 = new java.lang.Object[r5]
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r1[r4] = r0
                    java.lang.String r0 = "thread count:%d"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r1)
                    java.util.Map r0 = java.lang.Thread.getAllStackTraces()
                    java.util.Set r1 = r0.keySet()
                    java.util.Iterator r1 = r1.iterator()
                L_0x00fc:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L_0x012a
                    java.lang.Object r2 = r1.next()
                    java.lang.Thread r2 = (java.lang.Thread) r2
                    java.lang.Thread$State r7 = r2.getState()
                    java.lang.Thread$State r8 = java.lang.Thread.State.RUNNABLE
                    if (r7 != r8) goto L_0x00fc
                    java.lang.Object[] r7 = new java.lang.Object[r3]
                    java.lang.String r8 = r2.getName()
                    r7[r4] = r8
                    java.lang.Object r2 = r0.get(r2)
                    java.lang.StackTraceElement[] r2 = (java.lang.StackTraceElement[]) r2
                    java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.MMStack.stackTraceToString((java.lang.StackTraceElement[]) r2)
                    r7[r5] = r2
                    java.lang.String r2 = "Running thread: %s\n %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r7)
                    goto L_0x00fc
                L_0x012a:
                    return r5
                L_0x012b:
                    r1 = move-exception
                L_0x012c:
                    if (r7 == 0) goto L_0x013e
                    r7.close()     // Catch:{ Exception -> 0x0132 }
                    goto L_0x013e
                L_0x0132:
                    r2 = move-exception
                    java.lang.Object[] r3 = new java.lang.Object[r5]
                    java.lang.String r2 = r2.getMessage()
                    r3[r4] = r2
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r3)
                L_0x013e:
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.console.C92618a.C80838n.C80839a.onTimerExpired():boolean");
            }
        }

        public void run() {
            new MTimerHandler(new C80839a(this), true).startTimer(10000);
        }
    }

    /* renamed from: com.tencent.mm.console.a$p */
    public class C80840p implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f237627d;

        /* renamed from: e */
        public final /* synthetic */ Context f237628e;

        /* renamed from: f */
        public final /* synthetic */ Activity f237629f;

        public C80840p(String str, Context context, Activity activity) {
            this.f237627d = str;
            this.f237628e = context;
            this.f237629f = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C85798u1 u1Var = new C85798u1(C72994y1.f212832a + "SdcardInfo.cfg");
            u1Var.mo119664f(1, this.f237627d);
            Log.m105924i("MicroMsg.CommandProcessor", "switchsdcard reset to sdcard root: " + u1Var.mo119660a(1));
            MMEntryLock.unlock("welcome_page_show");
            C75681p0.m90934a(this.f237628e, true);
            BackupProcessMgrExitEvent backupProcessMgrExitEvent = new BackupProcessMgrExitEvent();
            backupProcessMgrExitEvent.f78724d.f78725a = false;
            backupProcessMgrExitEvent.publish();
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93150TO();
            ((MMNotification) C97625j3.m125816f()).mo93209g();
            C86032n.m106476b("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
            C85623c.C85624a aVar = C85623c.f249568a;
            if (aVar != null) {
                Activity activity = this.f237629f;
                ((C89013r.C89016c) aVar).getClass();
                MMAppMgr.m85985e(activity, true);
            }
            this.f237629f.finish();
        }
    }

    /* renamed from: com.tencent.mm.console.a$b */
    public class C92619b implements Runnable {
        public void run() {
            new SnsNewSyncObjectEvent().publish();
        }
    }

    /* renamed from: com.tencent.mm.console.a$c */
    public class C92620c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f266589d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList f266590e;

        /* renamed from: f */
        public final /* synthetic */ Context f266591f;

        /* renamed from: com.tencent.mm.console.a$c$a */
        public class C92621a implements C88656g {

            /* renamed from: com.tencent.mm.console.a$c$a$a */
            public class C92622a implements Runnable {
                public C92622a() {
                }

                public void run() {
                    Context context = C92620c.this.f266591f;
                    C76879j.m92727U(context, context.getString(C0966R.string.bvq), 1);
                }
            }

            /* renamed from: com.tencent.mm.console.a$c$a$b */
            public class C92623b implements Runnable {
                public C92623b() {
                }

                public void run() {
                    Context context = C92620c.this.f266591f;
                    C76879j.m92727U(context, context.getString(C0966R.string.bvp), 1);
                }
            }

            public C92621a() {
            }

            public String getKey() {
                return "copypackage";
            }

            public void run() {
                try {
                    String f0 = C112760b.m154230f0();
                    C97625j3.m125812b().getClass();
                    String a = C47926a.m53249a();
                    C97625j3.m125812b().getClass();
                    C86709a0.m107528h();
                    String str = C86709a0.m107535s().f251805c;
                    String substring = a.substring(f0.length());
                    Log.m105925i("MicroMsg.CommandProcessor", "summercmd copypackage size:%d, root:%s, pkgFullPath:%s, sysPath:%s, pkgPath:%s", Integer.valueOf(C92620c.this.f266589d), f0, a, str, substring);
                    int i = 0;
                    while (true) {
                        C92620c cVar = C92620c.this;
                        if (i < cVar.f266589d) {
                            String str2 = ((SdcardUtil.StatMountParse) cVar.f266590e.get(i)).mountDir;
                            if (!Util.isNullOrNil(str2)) {
                                if (!f0.contains(str2)) {
                                    C86009m1 m1Var = new C86009m1(str2 + substring);
                                    if (m1Var.mo119967g() && m1Var.mo119977o()) {
                                        boolean b = C86013q1.m106441b(m1Var.mo119971i(), a);
                                        Log.m105925i("MicroMsg.CommandProcessor", "summercmd copypackage done pkgFullPath:%s, old:%s, ret:%b", a, m1Var.mo119971i(), Boolean.valueOf(b));
                                        if (b) {
                                            new MMHandler(Looper.getMainLooper()).post(new C92622a());
                                            return;
                                        }
                                    }
                                }
                            }
                            i++;
                        } else {
                            new MMHandler(Looper.getMainLooper()).post(new C92623b());
                            return;
                        }
                    }
                } catch (Exception e) {
                    Log.m105929w("MicroMsg.CommandProcessor", "summercmd copypackage e:%s", e.getMessage());
                }
            }
        }

        public C92620c(int i, ArrayList arrayList, Context context) {
            this.f266589d = i;
            this.f266590e = arrayList;
            this.f266591f = context;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C119157j) C119157j.f356862d).mo183875f(new C92621a());
        }
    }

    /* renamed from: com.tencent.mm.console.a$f */
    public class C92624f implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ boolean f266595d;

        /* renamed from: e */
        public final /* synthetic */ Context f266596e;

        /* renamed from: com.tencent.mm.console.a$f$a */
        public class C92625a implements Runnable {
            public C92625a() {
            }

            public void run() {
                C92618a.m116691a(C92624f.this.f266596e, "RSA(req) fatal err, must recheck!!!");
            }
        }

        /* renamed from: com.tencent.mm.console.a$f$b */
        public class C92626b implements C11385n {

            /* renamed from: com.tencent.mm.console.a$f$b$a */
            public class C92627a implements Runnable {
                public C92627a() {
                }

                public void run() {
                    C92618a.m116691a(C92624f.this.f266596e, "RSA(base) fatal err, must recheck!!!");
                }
            }

            public C92626b() {
            }

            public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
                Log.m105925i("MicroMsg.CommandProcessor", "summercert testdefaultrsa  NetSceneGetCert onSceneEnd [%d, %d, %s]", Integer.valueOf(i), Integer.valueOf(i2), str);
                if (i == 4 && i2 == -102) {
                    MMHandlerThread.postToMainThread(new C92627a());
                    return;
                }
                C76701a.makeText(C92624f.this.f266596e, (CharSequence) "DefaultRSA check pass", 0).show();
                C92618a.m116691a(C92624f.this.f266596e, "");
            }
        }

        public C92624f(boolean z, Context context) {
            this.f266595d = z;
            this.f266596e = context;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            Log.m105925i("MicroMsg.CommandProcessor", "summercert testdefaultrsa NetSceneManualAuth onSceneEnd [%d, %d, %s]", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i != 4 || i2 == -102 || this.f266595d) {
                new C40371t(0).doScene(C86709a0.m107529k().f251779b.f256809d, new C92626b());
            } else {
                MMHandlerThread.postToMainThread(new C92625a());
            }
        }
    }

    static {
        int i = C35906e.f95797a;
        int i2 = C89678i.f257922a;
        int i3 = C89679j.f257923a;
        int i4 = C35908g.f95799a;
        int i5 = C89677h.f257921a;
        int i6 = C77352c.f225544a;
        int i7 = C101201d.f296340a;
        int i8 = C47841m.f128419a;
        int i9 = C35909k.f95800a;
        int i15 = C35910n.f95801a;
        int i16 = C77353l.f225545a;
        try {
            int[] iArr = C101633a.f297502a;
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.CommandProcessor", th, "", new Object[0]);
        }
        C30650a.m39147b(new C35904a(), "//clearrecent");
        int i17 = C35905b.f95796a;
        int i18 = ExtStorageMigrateTestCommand.f347864a;
        ((C38850q) C86312j.m106911c(C38850q.class)).mo61798RY();
        HashSet<String> hashSet = new HashSet<>();
        f266588a = hashSet;
        hashSet.add("//uplog");
        hashSet.add("//pullxlog");
        hashSet.add("//upcrash");
        hashSet.add("//getfpkey");
        hashSet.add("//voipdebug");
        hashSet.add("//setkey");
        hashSet.add("//wxcamera");
        hashSet.add("//setNfcOpenUrl");
        hashSet.add("//resetwxspace");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0167, code lost:
        if (r9 != null) goto L_0x0169;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0192 A[SYNTHETIC, Splitter:B:30:0x0192] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m116691a(android.content.Context r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "DefaultRSARef.java"
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r2 != 0) goto L_0x0021
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            java.lang.String r9 = "\n\n"
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r1.append(r9)
        L_0x0021:
            java.lang.String r9 = "Default RSA Info:\n"
            r1.append(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "ClientVersion: "
            r9.append(r2)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION
            r9.append(r2)
            java.lang.String r2 = "\n"
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            r1.append(r9)
            java.lang.String r9 = "BASE_RSA_PUBLIC_VERSION = 199\n"
            r1.append(r9)
            java.lang.String r9 = "BASE_RSA_PUBLIC_KEYN = ADA9E573417691226521F9FF1B3732DF83EDA19BA60870A357E430135298469E68EF31E9E2109CA5E0CA661F769FCB2FE33A3021B9A790D5DFCA6720A439BEF69E138FAB1B05475228FD33BB11D07321A6DB4DB2689CA850C483630855DB7EDDD8B4505349DA863677E3EB78A46B5912FAE11BDE92BE9D98E3E2F2A47E03777E8795A51D67D7CC4B86EDEBD3D8968AAC51A58FFDBAA068750E4771BD364911B22420F96F8B0D7730455CC8CE1933B406C38675A9540E51C11C9872F692E2EC693448913781D1A8DD61A1FCC97B8B078CA06DDE9EBC35A1A22A697831879588F52BD6A108E1EE6519C518EDC887F65587D7F769C22E81131940085E6FAED67FCF len(512)\n"
            r1.append(r9)
            java.lang.String r9 = "BASE_RSA_PUBLIC_KEYE = 010001\n\n"
            r1.append(r9)
            java.lang.String r9 = "REQ_RSA_PUBLIC_VERSION = 200\n"
            r1.append(r9)
            java.lang.String r9 = "REQ_RSA_PUBLIC_KEYN = 9357B6A18EE981DDA2C3CBBF39F5D308FC21656F30CF2EE7D75F6E9CB12928B972364B1AC57E2FB1F4ECC113A4060B9E97EEEF868FBD2623DDEFF77C3A048507F65DF9200CE4B2321E8D39B414C0663A8A10F6278543D28B2939BC8BD5CC7BE9A95F868C4F3C4F758C6A78ADD98BDE33D56E58377B10DD7F225426B5B27F4038302BE2DCA9332B8EC57B5E29C90B7A7DE6417D7378CB1D8B51E68BE1E99B2EB5EB49E613DCFF3FAED6F8C4875F6425F1AF6AEF3358403E4B0A92E456E1D5BE84999907A1246F2BECE05683959614312026492BDC302F82F38AD2EE99FDDB8675736274989B2389E95E80F8B597E69FD6A2CCB279226A578465EF9D50D29AE5ED len(512)\n"
            r1.append(r9)
            java.lang.String r9 = "REQ_RSA_PUBLIC_KEYE = 010001\n"
            r1.append(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r3 = "summercert dumpdefaultrsa "
            r9.append(r3)
            java.lang.String r3 = r1.toString()
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            java.lang.String r3 = "MicroMsg.CommandProcessor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            boolean r9 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()
            r3 = 0
            if (r9 != 0) goto L_0x0082
            return r3
        L_0x0082:
            android.widget.TextView r9 = new android.widget.TextView
            r9.<init>(r8)
            java.lang.String r1 = r1.toString()
            r9.setText(r1)
            r1 = 19
            r9.setGravity(r1)
            r1 = 1092616192(0x41200000, float:10.0)
            r4 = 1
            r9.setTextSize(r4, r1)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r5 = -1
            r6 = -2
            r1.<init>(r5, r6)
            r9.setLayoutParams(r1)
            android.content.res.Resources r1 = r8.getResources()
            r5 = 2131099800(0x7f060098, float:1.7811963E38)
            int r1 = r1.getColor(r5)
            r9.setTextColor(r1)
            android.graphics.Typeface r1 = android.graphics.Typeface.MONOSPACE
            r9.setTypeface(r1)
            android.content.res.Resources r1 = r8.getResources()
            r5 = 2131165651(0x7f0701d3, float:1.7945525E38)
            int r1 = r1.getDimensionPixelSize(r5)
            r9.setPadding(r1, r1, r1, r1)
            android.text.method.MovementMethod r1 = android.text.method.ScrollingMovementMethod.getInstance()
            r9.setMovementMethod(r1)
            r1 = 0
            nj3.C76879j.m92746q(r8, r1, r9, r1)
            com.tencent.mm.vfs.u1 r9 = new com.tencent.mm.vfs.u1     // Catch:{ Exception -> 0x015a, all -> 0x0158 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015a, all -> 0x0158 }
            r5.<init>()     // Catch:{ Exception -> 0x015a, all -> 0x0158 }
            java.lang.String r6 = a70.C112760b.m154195C()     // Catch:{ Exception -> 0x015a, all -> 0x0158 }
            r5.append(r6)     // Catch:{ Exception -> 0x015a, all -> 0x0158 }
            r5.append(r0)     // Catch:{ Exception -> 0x015a, all -> 0x0158 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x015a, all -> 0x0158 }
            r9.<init>((java.lang.String) r5)     // Catch:{ Exception -> 0x015a, all -> 0x0158 }
            java.lang.String r1 = "package com.tencent.mm.protocal;\n\n"
            r9.write(r1)     // Catch:{ Exception -> 0x0156 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0156 }
            r1.<init>()     // Catch:{ Exception -> 0x0156 }
            java.lang.String r5 = "/**\n *\n * @ClientVersion: "
            r1.append(r5)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION     // Catch:{ Exception -> 0x0156 }
            r1.append(r5)     // Catch:{ Exception -> 0x0156 }
            r1.append(r2)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0156 }
            r9.write(r1)     // Catch:{ Exception -> 0x0156 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0156 }
            r1.<init>()     // Catch:{ Exception -> 0x0156 }
            java.lang.String r2 = " * @DumpTime: "
            r1.append(r2)     // Catch:{ Exception -> 0x0156 }
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0156 }
            java.lang.String r5 = "yyyy-MM-dd HH:mm:ss"
            r2.<init>(r5)     // Catch:{ Exception -> 0x0156 }
            java.util.Date r5 = new java.util.Date     // Catch:{ Exception -> 0x0156 }
            r5.<init>()     // Catch:{ Exception -> 0x0156 }
            java.lang.String r2 = r2.format(r5)     // Catch:{ Exception -> 0x0156 }
            r1.append(r2)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r2 = " \n */\n"
            r1.append(r2)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0156 }
            r9.write(r1)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r1 = "public final class DefaultRSA {\n"
            r9.write(r1)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r1 = "\n\tpublic final static int BASE_RSA_PUBLIC_VERSION = 199;"
            r9.write(r1)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r1 = "\n\tpublic final static String BASE_RSA_PUBLIC_KEYN = \"ADA9E573417691226521F9FF1B3732DF83EDA19BA60870A357E430135298469E68EF31E9E2109CA5E0CA661F769FCB2FE33A3021B9A790D5DFCA6720A439BEF69E138FAB1B05475228FD33BB11D07321A6DB4DB2689CA850C483630855DB7EDDD8B4505349DA863677E3EB78A46B5912FAE11BDE92BE9D98E3E2F2A47E03777E8795A51D67D7CC4B86EDEBD3D8968AAC51A58FFDBAA068750E4771BD364911B22420F96F8B0D7730455CC8CE1933B406C38675A9540E51C11C9872F692E2EC693448913781D1A8DD61A1FCC97B8B078CA06DDE9EBC35A1A22A697831879588F52BD6A108E1EE6519C518EDC887F65587D7F769C22E81131940085E6FAED67FCF\";"
            r9.write(r1)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r1 = "\n\tpublic final static String BASE_RSA_PUBLIC_KEYE = \"010001\";\n"
            r9.write(r1)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r1 = "\n\tpublic final static int REQ_RSA_PUBLIC_VERSION = 200;"
            r9.write(r1)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r1 = "\n\tpublic final static String REQ_RSA_PUBLIC_KEYN = \"9357B6A18EE981DDA2C3CBBF39F5D308FC21656F30CF2EE7D75F6E9CB12928B972364B1AC57E2FB1F4ECC113A4060B9E97EEEF868FBD2623DDEFF77C3A048507F65DF9200CE4B2321E8D39B414C0663A8A10F6278543D28B2939BC8BD5CC7BE9A95F868C4F3C4F758C6A78ADD98BDE33D56E58377B10DD7F225426B5B27F4038302BE2DCA9332B8EC57B5E29C90B7A7DE6417D7378CB1D8B51E68BE1E99B2EB5EB49E613DCFF3FAED6F8C4875F6425F1AF6AEF3358403E4B0A92E456E1D5BE84999907A1246F2BECE05683959614312026492BDC302F82F38AD2EE99FDDB8675736274989B2389E95E80F8B597E69FD6A2CCB279226A578465EF9D50D29AE5ED\";"
            r9.write(r1)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r1 = "\n\tpublic final static String REQ_RSA_PUBLIC_KEYE = \"010001\";\n\n}\n"
            r9.write(r1)     // Catch:{ Exception -> 0x0156 }
            r3 = 1
            goto L_0x0169
        L_0x0156:
            r1 = move-exception
            goto L_0x015e
        L_0x0158:
            r8 = move-exception
            goto L_0x0190
        L_0x015a:
            r9 = move-exception
            r7 = r1
            r1 = r9
            r9 = r7
        L_0x015e:
            java.lang.String r2 = "MicroMsg.RsaInfo"
            java.lang.String r5 = ""
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x018e }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r5, r6)     // Catch:{ all -> 0x018e }
            if (r9 == 0) goto L_0x016c
        L_0x0169:
            r9.close()     // Catch:{ Exception -> 0x016c }
        L_0x016c:
            if (r3 == 0) goto L_0x018d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "dump file:"
            r9.append(r1)
            java.lang.String r1 = a70.C112760b.m154195C()
            r9.append(r1)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            android.widget.Toast r8 = p910lj.C76701a.makeText((android.content.Context) r8, (java.lang.CharSequence) r9, (int) r4)
            r8.show()
        L_0x018d:
            return r4
        L_0x018e:
            r8 = move-exception
            r1 = r9
        L_0x0190:
            if (r1 == 0) goto L_0x0195
            r1.close()     // Catch:{ Exception -> 0x0195 }
        L_0x0195:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.console.C92618a.m116691a(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: b */
    public static String m116692b(String str) {
        int indexOf = str.indexOf(" ");
        return indexOf < 0 ? "" : str.substring(indexOf).trim();
    }

    /* renamed from: c */
    public static boolean m116693c(String str) {
        Iterator<String> it = f266588a.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00de A[SYNTHETIC, Splitter:B:31:0x00de] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e4 A[SYNTHETIC, Splitter:B:36:0x00e4] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.StringBuilder m116694d(int r7) {
        /*
            java.util.Date r0 = new java.util.Date
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r3 = (long) r7
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 * r5
            long r1 = r1 - r3
            r0.<init>(r1)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r3 = "yyyyMMdd"
            r1.<init>(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = a70.C112760b.m154219a()
            r2.append(r3)
            java.lang.String r3 = "crash_"
            r2.append(r3)
            java.lang.String r0 = r1.format(r0)
            r2.append(r0)
            java.lang.String r0 = ".txt"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r2 == 0) goto L_0x0064
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " day -"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = " no crash."
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            return r0
        L_0x0064:
            r2 = 0
            r3 = 0
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00d2 }
            com.tencent.mm.vfs.t1 r5 = new com.tencent.mm.vfs.t1     // Catch:{ Exception -> 0x00d2 }
            r5.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x00d2 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r0 = r4.readLine()     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            if (r0 == 0) goto L_0x009d
            r4.close()     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            r2.<init>()     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            java.lang.String r5 = "read day -"
            r2.append(r5)     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            r2.append(r7)     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            java.lang.String r7 = "file failed"
            r2.append(r7)     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            java.lang.String r7 = r2.toString()     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            r0.<init>(r7)     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            r4.close()     // Catch:{ Exception -> 0x009c }
        L_0x009c:
            return r0
        L_0x009d:
            java.lang.String r7 = r4.readLine()     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            if (r7 == 0) goto L_0x00c6
            java.lang.String r0 = "error_"
            java.lang.String[] r7 = r7.split(r0)     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            r2 = 1
            r7 = r7[r2]     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            byte[] r7 = android.util.Base64.decode(r7, r3)     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            r0.<init>(r7)     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            java.lang.String r7 = "#accinfo.uin="
            java.lang.String[] r7 = r0.split(r7)     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            r7 = r7[r2]     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            r1.append(r7)     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            java.lang.String r7 = "\n_____________________________________\n"
            r1.append(r7)     // Catch:{ Exception -> 0x00cd, all -> 0x00ca }
            goto L_0x009d
        L_0x00c6:
            r4.close()     // Catch:{ Exception -> 0x00e1 }
            goto L_0x00e1
        L_0x00ca:
            r7 = move-exception
            r2 = r4
            goto L_0x00e2
        L_0x00cd:
            r7 = move-exception
            r2 = r4
            goto L_0x00d3
        L_0x00d0:
            r7 = move-exception
            goto L_0x00e2
        L_0x00d2:
            r7 = move-exception
        L_0x00d3:
            java.lang.String r0 = "MicroMsg.CommandProcessor"
            java.lang.String r4 = ""
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00d0 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r7, r4, r3)     // Catch:{ all -> 0x00d0 }
            if (r2 == 0) goto L_0x00e1
            r2.close()     // Catch:{ Exception -> 0x00e1 }
        L_0x00e1:
            return r1
        L_0x00e2:
            if (r2 == 0) goto L_0x00e7
            r2.close()     // Catch:{ Exception -> 0x00e7 }
        L_0x00e7:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.console.C92618a.m116694d(int):java.lang.StringBuilder");
    }

    /* JADX WARNING: type inference failed for: r3v193, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v194 */
    /* JADX WARNING: type inference failed for: r3v195 */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ee, code lost:
        return true;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:1397:0x299d  */
    /* JADX WARNING: Removed duplicated region for block: B:1406:0x29d2  */
    /* JADX WARNING: Removed duplicated region for block: B:1559:0x2edf  */
    /* JADX WARNING: Removed duplicated region for block: B:1560:0x2f01  */
    /* JADX WARNING: Removed duplicated region for block: B:1671:0x3126  */
    /* JADX WARNING: Removed duplicated region for block: B:2068:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:472:0x0e88  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x0e8a  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m116695e(android.content.Context r26, java.lang.String r27, java.lang.String r28) {
        /*
            r9 = r26
            r1 = r27
            java.lang.String r2 = "getdltaskinfo"
            java.lang.Class<com.tencent.mm.plugin.magicbrush.n0> r0 = com.tencent.p014mm.plugin.magicbrush.C30211n0.class
            java.lang.Class<lc3.b> r3 = lc3.C10485b.class
            java.lang.String r4 = "//"
            boolean r4 = r1.startsWith(r4)
            r10 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            if (r4 != 0) goto L_0x0018
            return r10
        L_0x0018:
            int r4 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()
            java.lang.String r6 = "MicroMsg.CommandProcessor"
            r11 = 1
            if (r11 >= r4) goto L_0x003a
            boolean r4 = m116693c(r27)
            if (r4 != 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r11]
            int r1 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r10] = r1
            java.lang.String r1 = "summer processed log level[%s], need open debug ret false"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            return r10
        L_0x003a:
            boolean r4 = com.tencent.p014mm.pluginsdk.cmd.C30650a.m39146a(r26, r27, r28)
            if (r4 == 0) goto L_0x0041
            return r11
        L_0x0041:
            java.lang.String r4 = "//clearWXSNSDB"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0052
            com.tencent.mm.autogen.events.SnsClearDBEvent r0 = new com.tencent.mm.autogen.events.SnsClearDBEvent
            r0.<init>()
            r0.publish()
            return r11
        L_0x0052:
            java.lang.String r4 = "//verifytokenerror"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x005d
            sf0.C90188n0.f258924R = r11
            return r11
        L_0x005d:
            java.lang.String r4 = "//testcrash"
            boolean r4 = r1.startsWith(r4)
            if (r4 != 0) goto L_0x3926
            java.lang.String r4 = "//testcov"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0082
            java.lang.String r0 = "TEST TCOV xxx1"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            java.lang.String r0 = "TEST TCOV xxx2"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            java.lang.String r0 = "TEST TCOV xxx3"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            java.lang.String r0 = "TEST TCOV xxx4"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            return r11
        L_0x0082:
            java.lang.String r4 = "//nativeLibraries"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x008e
            com.tencent.p014mm.sdk.NativeLibraries.list()
            return r11
        L_0x008e:
            java.lang.String r4 = "//getprofile"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x00ad
            java.lang.String r0 = eb0.C75592q0.m90789s()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x00ac
            com.tencent.mm.modelsimple.w r1 = new com.tencent.mm.modelsimple.w
            r1.<init>(r0)
            ob0.b0 r0 = eb0.C97625j3.m125815e()
            r0.mo123460f(r1)
        L_0x00ac:
            return r11
        L_0x00ad:
            java.lang.String r4 = "//testLqt"
            boolean r4 = r1.startsWith(r4)
            java.lang.String r7 = " "
            r8 = 2
            if (r4 == 0) goto L_0x00cd
            java.lang.String[] r0 = r1.split(r7)
            int r1 = r0.length
            if (r1 != r8) goto L_0x00cc
            r0 = r0[r11]
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r10)
            if (r0 != r11) goto L_0x00ca
            sf0.C90188n0.f258926T = r11
            goto L_0x00cc
        L_0x00ca:
            sf0.C90188n0.f258926T = r10
        L_0x00cc:
            return r11
        L_0x00cd:
            java.lang.String r4 = "//resetbackupdata"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0154
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_BACKUP_PC_BACKUPING_BOOLEAN
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.mo119677K(r1, r2)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_BACKUP_PC_RECOVERING_BOOLEAN
            r0.mo119677K(r1, r2)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_BACKUP_PC_MERGERING_BOOLEAN
            r0.mo119677K(r1, r2)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_BACKUP_MOVE_BACKUPING_BOOLEAN
            r0.mo119677K(r1, r2)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_BACKUP_MOVE_RECOVERING_BOOLEAN
            r0.mo119677K(r1, r2)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_BACKUP_MOVE_MERGERING_BOOLEAN
            r0.mo119677K(r1, r2)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.o r0 = r0.mo105896k()
            r0.deleteAllData()
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.m r0 = r0.mo105895j()
            r0.deleteAllData()
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.k r0 = r0.mo105894i()
            r0.deleteAllData()
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "backup data has been reset!"
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r11)
            r0.show()
            return r11
        L_0x0154:
            java.lang.String r4 = "//backuptest"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0169
            com.tencent.mm.autogen.events.BackupStartMergeEvent r0 = new com.tencent.mm.autogen.events.BackupStartMergeEvent
            r0.<init>()
            com.tencent.mm.autogen.events.BackupStartMergeEvent$a r1 = r0.f264640d
            r1.f264641a = r11
            r0.publish()
            return r11
        L_0x0169:
            java.lang.String r4 = "//startmerge"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x017e
            com.tencent.mm.autogen.events.BackupStartMergeEvent r0 = new com.tencent.mm.autogen.events.BackupStartMergeEvent
            r0.<init>()
            com.tencent.mm.autogen.events.BackupStartMergeEvent$a r1 = r0.f264640d
            r1.f264641a = r8
            r0.publish()
            return r11
        L_0x017e:
            java.lang.String r4 = "//deletemerge"
            boolean r4 = r1.startsWith(r4)
            r12 = 3
            if (r4 == 0) goto L_0x0194
            com.tencent.mm.autogen.events.BackupStartMergeEvent r0 = new com.tencent.mm.autogen.events.BackupStartMergeEvent
            r0.<init>()
            com.tencent.mm.autogen.events.BackupStartMergeEvent$a r1 = r0.f264640d
            r1.f264641a = r12
            r0.publish()
            return r11
        L_0x0194:
            java.lang.String r4 = "//cleanadd"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x01ef
            java.lang.String[] r0 = r1.split(r7)
            r1 = 500(0x1f4, double:2.47E-321)
            int r3 = r0.length
            if (r3 <= r11) goto L_0x01ae
            r0 = r0[r11]
            r1 = 500(0x1f4, float:7.0E-43)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
            long r1 = (long) r0
        L_0x01ae:
            r3 = 1048576(0x100000, double:5.180654E-318)
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = a70.C112760b.m154216X()
            r5.append(r6)
            java.lang.String r6 = "/testtest/"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.<init>((java.lang.String) r5)
            boolean r5 = r0.mo119967g()     // Catch:{ IOException -> 0x01ee, all -> 0x01ec }
            if (r5 != 0) goto L_0x01d4
            r0.mo119964e()     // Catch:{ IOException -> 0x01ee, all -> 0x01ec }
        L_0x01d4:
            java.nio.channels.WritableByteChannel r0 = com.tencent.p014mm.vfs.C86013q1.m106431M(r0)     // Catch:{ IOException -> 0x01ee, all -> 0x01ec }
        L_0x01d8:
            long r5 = (long) r10     // Catch:{ IOException -> 0x01ee, all -> 0x01ec }
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 >= 0) goto L_0x01e8
            int r5 = (int) r3     // Catch:{ IOException -> 0x01ee, all -> 0x01ec }
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r5)     // Catch:{ IOException -> 0x01ee, all -> 0x01ec }
            r0.write(r5)     // Catch:{ IOException -> 0x01ee, all -> 0x01ec }
            int r10 = r10 + 1
            goto L_0x01d8
        L_0x01e8:
            r0.close()     // Catch:{ IOException -> 0x01ee, all -> 0x01ec }
            return r11
        L_0x01ec:
            r0 = move-exception
            throw r0
        L_0x01ee:
            return r11
        L_0x01ef:
            java.lang.String r4 = "//cleanresetindex"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0203
            java.lang.String r0 = "CleanCalcMMKV"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            java.lang.String r1 = "CleanCalcAlreadyResetIndex"
            r0.encode((java.lang.String) r1, (boolean) r10)
            return r11
        L_0x0203:
            java.lang.String r4 = "//resetwxspace"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0214
            java.lang.String r0 = "//clean reset"
            r1 = r28
            boolean r0 = com.tencent.p014mm.pluginsdk.cmd.C30650a.m39146a(r9, r0, r1)
            return r0
        L_0x0214:
            java.lang.String r4 = "//resetliveverify"
            boolean r4 = r1.startsWith(r4)
            java.lang.String r13 = "tag_live_core"
            if (r4 == 0) goto L_0x0229
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r13)
            java.lang.String r1 = "anchor_verify"
            r0.putBoolean(r1, r10)
            return r11
        L_0x0229:
            java.lang.String r4 = "//open livefaceverify"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x023c
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r13)
            java.lang.String r1 = "test_mmkv_live_face_verify"
            r0.putBoolean(r1, r11)
            return r11
        L_0x023c:
            java.lang.String r4 = "//close livefaceverify"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x024f
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r13)
            java.lang.String r1 = "test_mmkv_live_face_verify"
            r0.putBoolean(r1, r10)
            return r11
        L_0x024f:
            java.lang.String r4 = "//skip livemobileverify"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0262
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r13)
            java.lang.String r1 = "test_mmkv_live_skip_mobile_verify"
            r0.putBoolean(r1, r11)
            return r11
        L_0x0262:
            java.lang.String r4 = "//reset livemobileverify"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0275
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r13)
            java.lang.String r1 = "test_mmkv_live_skip_mobile_verify"
            r0.putBoolean(r1, r10)
            return r11
        L_0x0275:
            java.lang.String r4 = "//delete livetipsbar"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x028d
            java.lang.Class<wt.c> r0 = p744wt.C66190c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            wt.c r0 = (p744wt.C66190c) r0
            b60.b r0 = r0.o40()
            r0.deleteAllData()
            return r11
        L_0x028d:
            java.lang.String r4 = "//add livetipsbar"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x02a3
            java.lang.Class<wt.c> r0 = p744wt.C66190c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            wt.c r0 = (p744wt.C66190c) r0
            java.lang.String r1 = com.tencent.p014mm.p136ui.chatting.ChattingUIFragment.f215287Q
            r0.mo89937zB(r1)
            return r11
        L_0x02a3:
            java.lang.String r4 = "//dbcheck"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x02af
            p983ik.C87743a.m109162a()
            return r11
        L_0x02af:
            java.lang.String r4 = "//threadpool replace"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x02eb
            java.lang.String r0 = "//threadpool replace false"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x02d1
            android.content.SharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "REPLACE_WORKER_BOOLEAN"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r10)
            r0.commit()
            goto L_0x02ea
        L_0x02d1:
            java.lang.String r0 = "//threadpool replace true"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x02ea
            android.content.SharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "REPLACE_WORKER_BOOLEAN"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r11)
            r0.commit()
        L_0x02ea:
            return r11
        L_0x02eb:
            java.lang.String r4 = "//ftsmsbiz"
            boolean r4 = r1.equalsIgnoreCase(r4)
            r14 = -2
            r15 = -1
            r13 = 0
            if (r4 == 0) goto L_0x038b
            te3.m03 r0 = u73.C52469w0.m58725c()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.LinkedList<te3.l03> r0 = r0.f137742d
            java.util.Iterator r0 = r0.iterator()
        L_0x0305:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0348
            java.lang.Object r2 = r0.next()
            te3.l03 r2 = (te3.C50200l03) r2
            java.lang.Object[] r3 = new java.lang.Object[r12]
            java.lang.Class<d62.i> r4 = d62.C75339i.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            d62.i r4 = (d62.C75339i) r4
            java.lang.String r5 = r2.f137121d
            java.lang.String r4 = r4.getDisplayName(r5)
            r3[r10] = r4
            double r4 = r2.f137122e
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r3[r11] = r4
            long r4 = r2.f137123f
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            java.lang.String r2 = "yyyy-MM-dd HH:mm"
            java.lang.String r2 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85111d(r2, r4)
            r3[r8] = r2
            java.lang.String r2 = "%s | %.2f | %s"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.append(r2)
            java.lang.String r2 = "\n"
            r1.append(r2)
            goto L_0x0305
        L_0x0348:
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r9)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            r1 = 19
            r0.setGravity(r1)
            r1 = 1092616192(0x41200000, float:10.0)
            r0.setTextSize(r11, r1)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r15, r14)
            r0.setLayoutParams(r1)
            android.content.res.Resources r1 = r26.getResources()
            r2 = 2131099800(0x7f060098, float:1.7811963E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            android.graphics.Typeface r1 = android.graphics.Typeface.MONOSPACE
            r0.setTypeface(r1)
            android.content.res.Resources r1 = r26.getResources()
            r2 = 2131165553(0x7f070171, float:1.7945326E38)
            int r1 = r1.getDimensionPixelSize(r2)
            r0.setPadding(r1, r1, r1, r1)
            nj3.C76879j.m92746q(r9, r13, r0, r13)
            return r11
        L_0x038b:
            java.lang.String r4 = "//cleanww"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x039f
            java.lang.Class<he0.j> r0 = he0.C76158j.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            he0.j r0 = (he0.C76158j) r0
            r0.mo106364Xg()
            return r11
        L_0x039f:
            boolean r4 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()
            java.lang.String r14 = ""
            if (r4 == 0) goto L_0x0403
            java.lang.String r4 = "//launchapp clear"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x03bd
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LAUNCH_APP_NOT_ASK_PKG_STRING
            r0.mo119677K(r1, r14)
            return r11
        L_0x03bd:
            java.lang.String r4 = "//setsupportwxcode"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x03d5
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SET_SUPPORT_WX_CODE_BOOLEAN
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.mo119677K(r1, r2)
            return r11
        L_0x03d5:
            java.lang.String r4 = "//setnotsupportwxcode"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x03ed
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SET_SUPPORT_WX_CODE_BOOLEAN
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.mo119677K(r1, r2)
            return r11
        L_0x03ed:
            java.lang.String r4 = "//resetsupportwxcode"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0403
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SET_SUPPORT_WX_CODE_BOOLEAN
            r0.mo119677K(r1, r13)
            return r11
        L_0x0403:
            java.lang.String r4 = "//testsightwidget"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0446
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "KSightPath"
            java.lang.String r2 = "/mnt/sdcard/tencent/tempvideo4.mp4"
            r0.putExtra(r1, r2)
            java.lang.String r1 = "KSightThumbPath"
            r0.putExtra(r1, r14)
            java.lang.String r1 = "/mnt/sdcard/tencent/tempvideo4.mp4"
            java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106456q(r1)
            java.lang.String r2 = "sight_md5"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "KSnsPostManu"
            r0.putExtra(r1, r11)
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.String r3 = "KTouchCameraTime"
            r0.putExtra(r3, r1)
            r1 = 14
            java.lang.String r2 = "Ksnsupload_type"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "sns"
            java.lang.String r2 = ".ui.SnsUploadUI"
            ke3.C88144b.m109790h(r9, r1, r2, r0)
            return r11
        L_0x0446:
            java.lang.String r4 = "//openremitbank"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0460
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_BANK_REMIT_OPEN_INT_SYNC
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r0.mo119677K(r1, r2)
            return r11
        L_0x0460:
            java.lang.String r4 = "//chatroomdebug "
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0492
            int r0 = r1.indexOf(r7)
            int r0 = r0 + r11
            java.lang.String r0 = r1.substring(r0)
            java.lang.String r1 = "true"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0486
            java.lang.Class<a11.c> r0 = a11.C39479c.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            a11.c r0 = (a11.C39479c) r0
            r0.mo62085n0(r11)
            goto L_0x0491
        L_0x0486:
            java.lang.Class<a11.c> r0 = a11.C39479c.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            a11.c r0 = (a11.C39479c) r0
            r0.mo62085n0(r10)
        L_0x0491:
            return r11
        L_0x0492:
            java.lang.String r4 = "//angerbag"
            boolean r4 = r1.startsWith(r4)
            java.lang.String r13 = "0"
            java.lang.String r15 = "1"
            if (r4 == 0) goto L_0x04c1
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEBVIEW_BAG_TEST_INFO_STRING_SYNC
            java.lang.Object r0 = r0.mo119685f(r1, r13)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x04b5
            r13 = r15
        L_0x04b5:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r0.mo119677K(r1, r13)
            return r11
        L_0x04c1:
            java.lang.String r4 = "//clearbag"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x04d7
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEBVIEW_BAG_INFO_STRING_SYNC
            r0.mo119677K(r1, r14)
            return r11
        L_0x04d7:
            java.lang.String r4 = "//closeremitbank"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x04ed
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_BANK_REMIT_OPEN_INT_SYNC
            r0.mo119677K(r1, r5)
            return r11
        L_0x04ed:
            java.lang.String r4 = "//ftstemplatetest"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0505
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent r4 = new com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent
            r4.<init>()
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r12 = r4.f78743d
            r12.f78744a = r11
            java.lang.String r10 = "/sdcard/fts_template.zip"
            r12.f78746c = r10
            r4.publish()
        L_0x0505:
            java.lang.String r4 = "//remit"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x051b
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "remittance"
            java.lang.String r2 = ".ui.RemittanceBusiUI"
            ke3.C88144b.m109790h(r9, r1, r2, r0)
            return r11
        L_0x051b:
            java.lang.String r4 = "//fixtools"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x056f
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUI"
            r0.setClassName(r9, r1)
            java.lang.String r1 = "entry_fix_tools"
            r0.putExtra(r1, r8)
            k20.a r10 = new k20.a
            r10.<init>()
            r10.mo10233c(r0)
            java.lang.Object[] r2 = r10.mo10232b()
            java.lang.String r3 = "com/tencent/mm/console/CommandProcessor"
            java.lang.String r4 = "processed"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r26
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            java.lang.Object r0 = r10.mo10231a(r1)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/console/CommandProcessor"
            java.lang.String r3 = "processed"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r26
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            return r11
        L_0x056f:
            java.lang.String r4 = "//uplog"
            boolean r4 = r1.startsWith(r4)
            r10 = 5
            if (r4 == 0) goto L_0x058b
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI"
            r0.setClassName(r9, r1)
            java.lang.String r1 = "entry_fix_tools_uplog"
            r0.putExtra(r1, r10)
            com.tencent.p014mm.p136ui.MMWizardActivity.m7017L7(r9, r0)
            return r11
        L_0x058b:
            java.lang.String r4 = "//pullxlog"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x05a2
            com.tencent.p014mm.sdk.platformtools.Log.moveLogsFromCacheDirToLogDir()
            java.lang.String r0 = "move success"
            r1 = 0
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r9, (java.lang.CharSequence) r0, (int) r1)
            r0.show()
            return r11
        L_0x05a2:
            java.lang.String r4 = "//upcrash"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x05de
            boolean r0 = eb0.C97625j3.m125811a()
            if (r0 == 0) goto L_0x05b9
            f40.e r0 = f40.C86709a0.m107523b()
            int r0 = r0.mo121110g()
            goto L_0x05ba
        L_0x05b9:
            r0 = 0
        L_0x05ba:
            java.lang.String[] r1 = r1.split(r7)
            if (r1 == 0) goto L_0x05cb
            int r2 = r1.length
            if (r2 <= r11) goto L_0x05cb
            r1 = r1[r11]
            r2 = 0
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)
            goto L_0x05cc
        L_0x05cb:
            r10 = 0
        L_0x05cc:
            ob0.b0 r1 = eb0.C97625j3.m125815e()
            eb0.f4 r2 = new eb0.f4
            com.tencent.mm.console.a$i r3 = new com.tencent.mm.console.a$i
            r3.<init>(r10, r0)
            r2.<init>(r3)
            r1.mo123460f(r2)
            return r11
        L_0x05de:
            java.lang.String r4 = "//fixError0831"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x05f4
            java.lang.String r0 = "fixError0831"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            com.tencent.mm.autogen.events.CleanError0831Event r0 = new com.tencent.mm.autogen.events.CleanError0831Event
            r0.<init>()
            r0.publish()
            return r11
        L_0x05f4:
            java.lang.String r4 = "//resetbankremit"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x060a
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_BANK_REMIT_HAS_SHOWN_RED_DOT_INT_SYNC
            r0.mo119677K(r1, r5)
            return r11
        L_0x060a:
            java.lang.String r4 = "//busiluck "
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0644
            java.lang.String r0 = "//busiluck "
            java.lang.String r0 = r1.replace(r0, r14)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "weixin://openNativeUrl/weixinHB/startreceivebizhbrequest?sendid="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "key_way"
            r1.putExtra(r2, r10)
            java.lang.String r2 = "key_native_url"
            r1.putExtra(r2, r0)
            java.lang.String r0 = "luckymoney"
            java.lang.String r2 = ".ui.LuckyMoneyBusiReceiveUI"
            ke3.C88144b.m109790h(r9, r0, r2, r1)
            return r11
        L_0x0644:
            java.lang.String r4 = "//testsoter"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0697
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            java.lang.String r2 = "com.tencent.mm.plugin.soter.ui.SoterTestUI"
            r0.setClassName(r1, r2)
            k20.a r10 = new k20.a
            r10.<init>()
            r10.mo10233c(r0)
            java.lang.Object[] r2 = r10.mo10232b()
            java.lang.String r3 = "com/tencent/mm/console/CommandProcessor"
            java.lang.String r4 = "processed"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r26
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            java.lang.Object r0 = r10.mo10231a(r1)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/console/CommandProcessor"
            java.lang.String r3 = "processed"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r26
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            return r11
        L_0x0697:
            java.lang.String r4 = "//facevideo"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x06ba
            java.lang.String[] r0 = r1.split(r7)
            int r1 = r0.length
            r2 = 3
            if (r1 != r2) goto L_0x06b9
            eb0.i3 r1 = eb0.C7624i3.f25910c
            r2 = r0[r11]
            java.lang.String r3 = "imgType"
            r1.mo8756d(r3, r2)
            eb0.i3 r1 = eb0.C7624i3.f25910c
            r0 = r0[r8]
            java.lang.String r2 = "depth"
            r1.mo8756d(r2, r0)
        L_0x06b9:
            return r11
        L_0x06ba:
            java.lang.String r4 = "//alpha"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x06d3
            java.lang.String[] r0 = r1.split(r7)
            int r1 = r0.length
            if (r1 != r8) goto L_0x06d2
            eb0.i3 r1 = eb0.C7624i3.f25910c
            r0 = r0[r11]
            java.lang.String r2 = "alpha_duration"
            r1.mo8756d(r2, r0)
        L_0x06d2:
            return r11
        L_0x06d3:
            java.lang.String r4 = "//forceNotifyError"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x06f7
            java.lang.String[] r0 = r1.split(r7)
            int r1 = r0.length
            if (r1 != r8) goto L_0x06f6
            java.lang.Class<bv1.b> r1 = bv1.C28426b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            bv1.b r1 = (bv1.C28426b) r1
            r0 = r0[r11]
            java.lang.String r2 = "true"
            boolean r0 = r0.equalsIgnoreCase(r2)
            r1.mo55961Pr(r0)
        L_0x06f6:
            return r11
        L_0x06f7:
            java.lang.String r4 = "//rectwidth"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0711
            java.lang.String[] r0 = r1.split(r7)
            int r1 = r0.length
            if (r1 != r8) goto L_0x0710
            eb0.i3 r1 = eb0.C7624i3.f25910c
            r0 = r0[r11]
            java.lang.String r2 = "rect_width"
            r1.mo8756d(r2, r0)
        L_0x0710:
            return r11
        L_0x0711:
            java.lang.String r4 = "//clearnewtips"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0721
            jc2.b r0 = gc2.C116945b.xx0()
            r0.deleteAllData()
            return r11
        L_0x0721:
            java.lang.String r4 = "//clearfavoffline"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x072d
            bc1.C92240b.m115963b()
            return r11
        L_0x072d:
            java.lang.String r4 = "//newyearsw "
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x075a
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LUCKY_MONEY_NEWYEAR_LOCAL_SWITCH_INT
            java.lang.Object r0 = r0.mo119685f(r1, r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r0 = r0 ^ r11
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r2 = r2.mo105906u()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.mo119677K(r1, r0)
            return r11
        L_0x075a:
            java.lang.String r4 = "//openimcreatesw"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x07a8
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_OPEN_IM_CREATE_ROOM_LOCAL_SWITCH_INT
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            java.lang.Object r0 = r0.mo119685f(r1, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r0 = r0 ^ r11
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "sw:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            android.widget.Toast r2 = nj3.C76912y0.makeText((android.content.Context) r2, (java.lang.CharSequence) r3, (int) r11)
            r2.show()
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r2 = r2.mo105906u()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.mo119677K(r1, r0)
            return r11
        L_0x07a8:
            java.lang.String r4 = "//commitxlog"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x07bb
            ob0.b0 r0 = eb0.C97625j3.m125815e()
            r0.mo123463i()
            com.tencent.p014mm.sdk.platformtools.Log.appenderFlush()
            return r11
        L_0x07bb:
            java.lang.String r4 = "//liteapppreload"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x07ed
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Class<tt.e> r2 = p244tt.C14088e.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            tt.e r2 = (p244tt.C14088e) r2
            r2.mo13505KY()
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "johnjh preload liteapp time : "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            return r11
        L_0x07ed:
            java.lang.String r4 = "//open neattextview"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0805
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CELLTEXTVIEW_CONFIG_BOOLEAN_SYNC
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.mo119677K(r1, r2)
            return r11
        L_0x0805:
            java.lang.String r4 = "//close neattextview"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x081d
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CELLTEXTVIEW_CONFIG_BOOLEAN_SYNC
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.mo119677K(r1, r2)
            return r11
        L_0x081d:
            java.lang.String r4 = "//unprint specialtext"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0829
            r4 = 0
            com.tencent.p014mm.p136ui.widget.MMNeat7extView.f220391S = r4
            return r11
        L_0x0829:
            java.lang.String r4 = "//print specialtext"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0834
            com.tencent.p014mm.p136ui.widget.MMNeat7extView.f220391S = r11
            return r11
        L_0x0834:
            java.lang.String r4 = "//netstatus"
            boolean r4 = r1.startsWith(r4)
            r12 = 2131824009(0x7f110d89, float:1.9280834E38)
            if (r4 == 0) goto L_0x0861
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.dumpNetStatus(r0)
            r0 = 2131838625(0x7f1146a1, float:1.9310479E38)
            java.lang.String r4 = r9.getString(r0)
            java.lang.String r5 = r9.getString(r12)
            com.tencent.mm.console.a$k r6 = new com.tencent.mm.console.a$k
            r6.<init>(r2)
            r7 = 0
            java.lang.String r3 = "netstatus"
            r1 = r26
            nj3.C76879j.m92707A(r1, r2, r3, r4, r5, r6, r7)
            return r11
        L_0x0861:
            java.lang.String r4 = "//scaninterval "
            boolean r4 = r1.startsWith(r4)
            r18 = r13
            r12 = -1
            r8 = 0
            if (r4 == 0) goto L_0x08a2
            java.lang.String[] r4 = r1.split(r7)
            r4 = r4[r11]     // Catch:{ Exception -> 0x087a }
            long r20 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r4, r12)     // Catch:{ Exception -> 0x087a }
            goto L_0x087d
        L_0x087a:
            r20 = r12
        L_0x087d:
            int r4 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x08a2
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WECHAT_FILE_SCAN_INTERVAL_LONG
            java.lang.Long r2 = java.lang.Long.valueOf(r20)
            r0.mo119677K(r1, r2)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Long r1 = java.lang.Long.valueOf(r20)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "summerclean reset scaninterval[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            return r11
        L_0x08a2:
            java.lang.String r4 = "//scanwait "
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x08dd
            java.lang.String[] r4 = r1.split(r7)
            r4 = r4[r11]     // Catch:{ Exception -> 0x08b5 }
            long r20 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r4, r12)     // Catch:{ Exception -> 0x08b5 }
            goto L_0x08b8
        L_0x08b5:
            r20 = r12
        L_0x08b8:
            int r4 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x08dd
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WECHAT_FILE_SCAN_WAIT_TIME_LONG
            java.lang.Long r2 = java.lang.Long.valueOf(r20)
            r0.mo119677K(r1, r2)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Long r1 = java.lang.Long.valueOf(r20)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "summerclean reset scanwait[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            return r11
        L_0x08dd:
            java.lang.String r4 = "//delayquery"
            boolean r4 = r1.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x08eb
            boolean r0 = sf0.C90188n0.f258925S
            r0 = r0 ^ r11
            sf0.C90188n0.f258925S = r0
            return r11
        L_0x08eb:
            java.lang.String r4 = "//newinit -hard"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0904
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r1 = 15
            r0.mo119676J(r1, r5)
            return r11
        L_0x0904:
            java.lang.String r4 = "//websearch-widget-draw "
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x092c
            java.lang.String r0 = "\\s+"
            java.lang.String[] r0 = r1.split(r0)
            int r1 = r0.length
            r2 = 2
            if (r1 != r2) goto L_0x092b
            java.lang.Class<c00.s> r1 = c00.C39885s.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            c00.s r1 = (c00.C39885s) r1
            r0 = r0[r11]
            java.lang.String r0 = r0.trim()
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r1.ra0(r0)
        L_0x092b:
            return r11
        L_0x092c:
            java.lang.String r4 = "//swipe"
            boolean r4 = r1.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x094f
            android.content.SharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            java.lang.String r1 = "settings_support_swipe"
            boolean r1 = r0.getBoolean(r1, r11)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r1 = r1 ^ r11
            java.lang.String r2 = "settings_support_swipe"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r1)
            r0.commit()
            return r11
        L_0x094f:
            java.lang.String r4 = "//multiwebview"
            boolean r4 = r1.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x097e
            com.tencent.mm.ui.LauncherUI r0 = com.tencent.p014mm.p136ui.LauncherUI.getInstance()
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "settings_multi_webview"
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L_0x096e
            goto L_0x097d
        L_0x096e:
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r1 = r1 ^ r11
            java.lang.String r2 = "settings_multi_webview"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r1)
            r0.commit()
        L_0x097d:
            return r11
        L_0x097e:
            java.lang.String r4 = "//sightinfo"
            boolean r4 = r1.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x09bc
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r1 = 344065(0x54001, float:4.82138E-40)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.mo119684e(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            r2 = 344065(0x54001, float:4.82138E-40)
            r0 = r0 ^ r11
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.mo119676J(r2, r0)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r0.mo119681a(r11)
            return r11
        L_0x09bc:
            java.lang.String r4 = "//verifycgi"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x09d0
            java.lang.Class<zz.f> r0 = p287zz.C79442f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            zz.f r0 = (p287zz.C79442f) r0
            r0.mo109149BN()
            return r11
        L_0x09d0:
            java.lang.String r4 = "//reusetopush"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x09dc
            eb0.C86480a.m107210e()
            return r11
        L_0x09dc:
            java.lang.String r4 = "//sighttest"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0a0c
            java.lang.String r0 = "//sighttest "
            java.lang.String r0 = r1.replace(r0, r14)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            r2 = 344066(0x54002, float:4.82139E-40)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.mo119676J(r2, r0)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r0.mo119681a(r11)
            return r11
        L_0x0a0c:
            java.lang.String r4 = "//wxcamera"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0a3f
            java.lang.String r0 = "//wxcamera "
            java.lang.String r0 = r1.replace(r0, r14)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "set param %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r1)
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LOCAL_SIGHT_SETTING_PRESET_INT_SYNC
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.mo119677K(r2, r0)
            return r11
        L_0x0a3f:
            java.lang.String r4 = "//printcrash"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0aa1
            java.lang.String r0 = "//printcrash "
            java.lang.String r0 = r1.replace(r0, r14)
            android.widget.TextView r1 = new android.widget.TextView
            r9 = r26
            r1.<init>(r9)
            r2 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)
            java.lang.StringBuilder r0 = m116694d(r0)
            r1.setText(r0)
            r0 = 19
            r1.setGravity(r0)
            r0 = 1090519040(0x41000000, float:8.0)
            r1.setTextSize(r11, r0)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r0.<init>(r3, r2)
            r1.setLayoutParams(r0)
            android.content.res.Resources r0 = r26.getResources()
            r2 = 2131099800(0x7f060098, float:1.7811963E38)
            int r0 = r0.getColor(r2)
            r1.setTextColor(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.MONOSPACE
            r1.setTypeface(r0)
            android.content.res.Resources r0 = r26.getResources()
            r2 = 2131165651(0x7f0701d3, float:1.7945525E38)
            int r0 = r0.getDimensionPixelSize(r2)
            r1.setPadding(r0, r0, r0, r0)
            android.text.method.MovementMethod r0 = android.text.method.ScrollingMovementMethod.getInstance()
            r1.setMovementMethod(r0)
            r2 = 0
            nj3.C76879j.m92746q(r9, r2, r1, r2)
            return r11
        L_0x0aa1:
            r20 = r8
            r9 = r26
            java.lang.String r4 = "//printleak"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0afa
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r9)
            java.lang.String r1 = p331dj.C107046f.m144907b()
            r0.setText(r1)
            r1 = 19
            r0.setGravity(r1)
            r1 = 1090519040(0x41000000, float:8.0)
            r0.setTextSize(r11, r1)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r1.<init>(r3, r2)
            r0.setLayoutParams(r1)
            android.content.res.Resources r1 = r26.getResources()
            r2 = 2131099800(0x7f060098, float:1.7811963E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            android.graphics.Typeface r1 = android.graphics.Typeface.MONOSPACE
            r0.setTypeface(r1)
            android.content.res.Resources r1 = r26.getResources()
            r2 = 2131165651(0x7f0701d3, float:1.7945525E38)
            int r1 = r1.getDimensionPixelSize(r2)
            r0.setPadding(r1, r1, r1, r1)
            android.text.method.MovementMethod r1 = android.text.method.ScrollingMovementMethod.getInstance()
            r0.setMovementMethod(r1)
            r1 = 0
            nj3.C76879j.m92746q(r9, r1, r0, r1)
            return r11
        L_0x0afa:
            java.lang.String r4 = "//resetmapcnt"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0b10
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_TENCENT_MAP_COUNT_INT
            r0.mo119677K(r1, r5)
            return r11
        L_0x0b10:
            java.lang.String r4 = "//testrsa"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x0b22
            r0 = 106(0x6a, float:1.49E-43)
            java.lang.String r1 = "010001"
            java.lang.String r2 = "E338E5DAD46B331E3071FAFD4C0F84C7C7965DBBE64C6F8CC0F7CF04DC640C1F84A2014431A48D65F2B2F172BA9BE6F5A049BF52C78C14B0965E20F0D80D85A9180EBABB913D49821D28BFD9601DF52A4F3230AECAD96D23415F5E94D51A87CAA7630C5F3CB70345BAF572A4F61A134A2265AFD8FADDFE0222BD9ABF7DBEB7444D031454E8F21820BBC725E6857F765660E987FADEBCF6B3A15355C4CD3752A7B544D1D7E037AF4F9725BE37681A84C9E1DC431B3065294EAD53E913BAF16D46714B013EA077191E6CA08ABA6D70E9CA792D898D692E3168D6341369976657CD5E1504B9E2458F107225176734D11621AD36D7FFA26C573D6612455B09105C41"
            qe3.C101125b1.m132539g(r1, r2, r0)
            return r11
        L_0x0b22:
            java.lang.String r4 = "//testrsabad"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x0b34
            r0 = 106(0x6a, float:1.49E-43)
            java.lang.String r1 = "010001"
            java.lang.String r2 = "F338E5DAD46B331E3071FAFD4C0F84C7C7965DBBE64C6F8CC0F7CF04DC640C1F84A2014431A48D65F2B2F172BA9BE6F5A049BF52C78C14B0965E20F0D80D85A9180EBABB913D49821D28BFD9601DF52A4F3230AECAD96D23415F5E94D51A87CAA7630C5F3CB70345BAF572A4F61A134A2265AFD8FADDFE0222BD9ABF7DBEB7444D031454E8F21820BBC725E6857F765660E987FADEBCF6B3A15355C4CD3752A7B544D1D7E037AF4F9725BE37681A84C9E1DC431B3065294EAD53E913BAF16D46714B013EA077191E6CA08ABA6D70E9CA792D898D692E3168D6341369976657CD5E1504B9E2458F107225176734D11621AD36D7FFA26C573D6612455B09105C41"
            qe3.C101125b1.m132539g(r1, r2, r0)
            return r11
        L_0x0b34:
            java.lang.String r4 = "//walletofflinetest"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x0b4d
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE_DIALOG_BOOLEAN_SYNC
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.mo119677K(r1, r2)
            r4 = 0
            return r4
        L_0x0b4d:
            r4 = 0
            java.lang.String r8 = "//makemsgdata "
            boolean r8 = r1.startsWith(r8)
            if (r8 == 0) goto L_0x0b71
            java.lang.String[] r0 = r1.split(r7)
            r0 = r0[r11]
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            java.lang.String r2 = com.tencent.p014mm.p136ui.chatting.ChattingUIFragment.f215287Q
            long r3 = (long) r0
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            r1.ry0(r2, r3)
            return r11
        L_0x0b71:
            java.lang.String r4 = "//pullappservice"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0b85
            com.tencent.mm.pluginsdk.model.app.a2 r0 = com.tencent.p014mm.pluginsdk.model.app.C44547a2.m48943c()
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0.mo69335e(r1)
            return r11
        L_0x0b85:
            java.lang.String r4 = "//boundaryconfig"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0cfa
            java.lang.Object[] r0 = new java.lang.Object[r11]
            k40.a r1 = f40.C86709a0.m107533q(r3)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r2 = "InputLimitSessionTextMsg"
            java.lang.String r1 = r1.mo107405c(r2)
            r2 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "boundaryconfig SessionTextMsg:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            k40.a r1 = f40.C86709a0.m107533q(r3)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r4 = "InputLimitSNSObjectText"
            java.lang.String r1 = r1.mo107405c(r4)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "boundaryconfig SNSObjectText:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            k40.a r1 = f40.C86709a0.m107533q(r3)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r4 = "SnsCommentMaxSize"
            java.lang.String r1 = r1.mo107405c(r4)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "boundaryconfig SnsCommentMaxSize:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            k40.a r1 = f40.C86709a0.m107533q(r3)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r4 = "InputLimitFavText"
            java.lang.String r1 = r1.mo107405c(r4)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "boundaryconfig FavText:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            k40.a r1 = f40.C86709a0.m107533q(r3)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r4 = "InputLimitSendEmotionBufSize"
            java.lang.String r1 = r1.mo107405c(r4)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "boundaryconfig EmotionBufSize:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            k40.a r1 = f40.C86709a0.m107533q(r3)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r4 = "InputLimitSendEmotionWidth"
            java.lang.String r1 = r1.mo107405c(r4)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "boundaryconfig EmotionWidth:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            k40.a r1 = f40.C86709a0.m107533q(r3)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r4 = "InputLimitFavImageSize"
            java.lang.String r1 = r1.mo107405c(r4)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "boundaryconfig FavImageSize:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            k40.a r1 = f40.C86709a0.m107533q(r3)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r4 = "InputLimitFavVoiceLength"
            java.lang.String r1 = r1.mo107405c(r4)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "boundaryconfig FavVoiceLength:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            k40.a r1 = f40.C86709a0.m107533q(r3)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r4 = "InputLimitSessionShortVideoBufSize"
            java.lang.String r1 = r1.mo107405c(r4)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "boundaryconfig ShortVideoAutoDownloadBufSize:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            k40.a r1 = f40.C86709a0.m107533q(r3)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r4 = "InputLimitVideoSize"
            java.lang.String r1 = r1.mo107405c(r4)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "boundaryconfig VideoSize:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            k40.a r1 = f40.C86709a0.m107533q(r3)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r3 = "InputLimitFileSize"
            java.lang.String r1 = r1.mo107405c(r3)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.lang.String r1 = "boundaryconfig FileSize:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            return r11
        L_0x0cfa:
            java.lang.String r4 = "//whatsnew"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0d06
            r0 = r9
            android.app.Activity r0 = (android.app.Activity) r0
            return r11
        L_0x0d06:
            java.lang.String r4 = "//profile "
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0d43
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r0 = r0.mo105907v()
            java.lang.String r2 = "//profile "
            java.lang.String r1 = r1.replace(r2, r14)
            java.lang.String r1 = r1.trim()
            com.tencent.mm.storage.z1 r0 = r0.get(r1)
            if (r0 == 0) goto L_0x0d42
            int r1 = r0.mo62907i3()
            if (r1 == 0) goto L_0x0d42
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r0 = r0.getUsername()
            java.lang.String r2 = "Contact_User"
            r1.putExtra(r2, r0)
            java.lang.String r0 = "profile"
            java.lang.String r2 = ".ui.ContactInfoUI"
            ke3.C88144b.m109790h(r9, r0, r2, r1)
        L_0x0d42:
            return r11
        L_0x0d43:
            java.lang.String r4 = "//minigameupdate"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0d5d
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_MINIGAME_SEARCH_LIST_UPDATE_TIME_LONG
            java.lang.Long r2 = java.lang.Long.valueOf(r20)
            r0.mo119677K(r1, r2)
            return r11
        L_0x0d5d:
            boolean r4 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()
            if (r4 == 0) goto L_0x0e0a
            java.lang.String r4 = "//cs"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0d8e
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "voipCSBizId"
            java.lang.String r2 = "gh_b35727b00b78"
            r0.putExtra(r1, r2)
            java.lang.String r1 = "voipCSAppId"
            java.lang.String r2 = "wx6e7147e8d764e85d"
            r0.putExtra(r1, r2)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = "voip_cs"
            java.lang.String r3 = ".ui.VoipCSMainUI"
            ke3.C88144b.m109790h(r1, r2, r3, r0)
            return r11
        L_0x0d8e:
            java.lang.String r4 = "//acs"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0db9
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "voipCSBizId"
            java.lang.String r2 = "gh_e8b085bb67e0"
            r0.putExtra(r1, r2)
            java.lang.String r1 = "voipCSAppId"
            java.lang.String r2 = "wx1224160e0adcefd6"
            r0.putExtra(r1, r2)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = "voip_cs"
            java.lang.String r3 = ".ui.VoipCSMainUI"
            ke3.C88144b.m109790h(r1, r2, r3, r0)
            return r11
        L_0x0db9:
            java.lang.String r4 = "//wifiset"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0dc2
            return r11
        L_0x0dc2:
            java.lang.String r4 = "//bcs"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0e0a
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "voipCSBizId"
            java.lang.String r2 = "gh_e8b085bb67e0"
            r0.putExtra(r1, r2)
            java.lang.String r1 = "voipCSAppId"
            java.lang.String r2 = "wx1224160e0adcefd6"
            r0.putExtra(r1, r2)
            java.lang.String r1 = "voipCSAllowBackCamera"
            r0.putExtra(r1, r15)
            java.lang.String r1 = "voipCSShowOther"
            r0.putExtra(r1, r15)
            java.lang.String r1 = "voipCSAvatarUrl"
            java.lang.String r2 = "https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=28737416,3249768666&fm=58"
            r0.putExtra(r1, r2)
            java.lang.String r1 = "voipCSContext"
            java.lang.String r2 = "test"
            r0.putExtra(r1, r2)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = "voip_cs"
            java.lang.String r3 = ".ui.VoipCSMainUI"
            ke3.C88144b.m109790h(r1, r2, r3, r0)
            return r11
        L_0x0e0a:
            java.lang.String r4 = "//getfpkey"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0e32
            java.lang.String r2 = com.tencent.p014mm.storage.C85796t4.m105983jo()
            r0 = 2131838625(0x7f1146a1, float:1.9310479E38)
            java.lang.String r4 = r9.getString(r0)
            r0 = 2131824009(0x7f110d89, float:1.9280834E38)
            java.lang.String r5 = r9.getString(r0)
            com.tencent.mm.console.a$m r6 = new com.tencent.mm.console.a$m
            r6.<init>(r2, r9)
            r7 = 0
            java.lang.String r3 = "Fingerprint Key"
            r1 = r26
            nj3.C76879j.m92707A(r1, r2, r3, r4, r5, r6, r7)
            return r11
        L_0x0e32:
            java.lang.String r4 = "//commitwd"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0e3e
            com.tencent.p014mm.modelstat.WatchDogPushReceiver.m98923b()
            return r11
        L_0x0e3e:
            java.lang.String r4 = "//setsnstestenv"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0eb9
            java.lang.String r0 = " +"
            java.lang.String[] r0 = r1.split(r0)
            int r1 = r0.length
            if (r1 <= r11) goto L_0x0e82
            r1 = r0[r11]
            boolean r2 = com.tencent.p014mm.sdk.platformtools.InetUtil.isIPv4Address(r1)
            if (r2 != 0) goto L_0x0e5d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.InetUtil.isIPv6Address(r1)
            if (r2 == 0) goto L_0x0e82
        L_0x0e5d:
            int r2 = r0.length
            r3 = 2
            if (r2 <= r3) goto L_0x0e7f
            r2 = r0[r3]
            boolean r3 = com.tencent.p014mm.sdk.platformtools.InetUtil.isIPv4Address(r2)
            if (r3 != 0) goto L_0x0e6f
            boolean r3 = com.tencent.p014mm.sdk.platformtools.InetUtil.isIPv6Address(r2)
            if (r3 == 0) goto L_0x0e7f
        L_0x0e6f:
            int r3 = r0.length
            r4 = 3
            if (r3 <= r4) goto L_0x0e7a
            r13 = r0[r4]
            r16 = r2
            r0 = r13
            r13 = r1
            goto L_0x0e86
        L_0x0e7a:
            r13 = r1
            r16 = r2
            r0 = 0
            goto L_0x0e86
        L_0x0e7f:
            r13 = r1
            r0 = 0
            goto L_0x0e84
        L_0x0e82:
            r0 = 0
            r13 = 0
        L_0x0e84:
            r16 = 0
        L_0x0e86:
            if (r13 == 0) goto L_0x0e8a
            r1 = 1
            goto L_0x0e8b
        L_0x0e8a:
            r1 = 0
        L_0x0e8b:
            sf0.C90188n0.f258910D = r1
            sf0.C90188n0.f258908B = r13
            sf0.C90188n0.f258922P = r16
            sf0.C90188n0.f258923Q = r0
            com.tencent.mm.modelcdntran.i0 r0 = com.tencent.p014mm.modelcdntran.C92779i0.Cx0()
            r0.Gx0(r10)
            r1 = 3
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = sf0.C90188n0.f258908B
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = sf0.C90188n0.f258922P
            r0[r11] = r1
            java.lang.String r1 = sf0.C90188n0.f258923Q
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "%s %s %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r9, (java.lang.CharSequence) r0, (int) r11)
            r0.show()
            return r11
        L_0x0eb9:
            java.lang.String r4 = "//snswithtateach"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0ecd
            java.lang.String r0 = "SnsMMKV"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            java.lang.String r1 = "SnsMMKVWithTaTeachDialog"
            r0.encode((java.lang.String) r1, (boolean) r11)
            return r11
        L_0x0ecd:
            java.lang.String r4 = "//snsfold"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0f2c
            java.lang.String[] r0 = r1.split(r7)
            int r1 = r0.length
            r2 = 2
            if (r1 < r2) goto L_0x0f2b
            te3.mt2 r1 = new te3.mt2
            r1.<init>()
            r2 = r0[r11]
            r1.mo141223b(r2)
            r2 = 0
            r1.mo141224d(r2)
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.m r2 = r2.mo96100XW()
            g62.n r3 = new g62.n
            r4 = 230(0xe6, float:3.22E-43)
            r3.<init>(r4, r1)
            tc0.p r2 = (tc0.C77885p) r2
            r2.mo107993q(r3)
            com.tencent.mm.plugin.sns.ui.g2 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Kx0()
            r1.mo133238a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "已重置"
            r1.append(r2)
            r0 = r0[r11]
            r1.append(r0)
            java.lang.String r0 = "折叠标记"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r9, (java.lang.CharSequence) r0, (int) r11)
            r0.show()
        L_0x0f2b:
            return r11
        L_0x0f2c:
            java.lang.String r4 = "//deleteopenimsnstable"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0f44
            java.lang.Class<ge0.b> r0 = ge0.C32415b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ge0.b r0 = (ge0.C32415b) r0
            re0.j r0 = r0.Ax0()
            r0.mo60612jo()
            return r11
        L_0x0f44:
            java.lang.String r4 = "//profileopenAlbum"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0f68
            boolean r0 = com.tencent.p014mm.plugin.profile.NewContactWidgetNormal.f202418A
            r0 = r0 ^ r11
            com.tencent.p014mm.plugin.profile.NewContactWidgetNormal.f202418A = r0
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "debugOpenAlbum: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r9, (java.lang.CharSequence) r0, (int) r2)
            r0.show()
            return r11
        L_0x0f68:
            java.lang.String r4 = "//snsvcodec"
            boolean r4 = r1.startsWith(r4)
            java.lang.String r8 = "off"
            java.lang.String r12 = "on"
            if (r4 == 0) goto L_0x0fad
            java.lang.String r0 = " +"
            java.lang.String[] r0 = r1.split(r0)
            int r1 = r0.length
            if (r1 <= r11) goto L_0x0fa2
            r0 = r0[r11]
            boolean r1 = r12.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x0f91
            m116696f(r11)
            java.lang.String r0 = "snsvcodec val: 1"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x0fac
        L_0x0f91:
            boolean r0 = r8.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0fac
            r1 = 0
            m116696f(r1)
            java.lang.String r0 = "snsvcodec val: 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x0fac
        L_0x0fa2:
            r1 = -1
            m116696f(r1)
            java.lang.String r0 = "snsvcodec val: -1"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
        L_0x0fac:
            return r11
        L_0x0fad:
            java.lang.String r4 = "//snswxpc"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x0fec
            java.lang.String r0 = " +"
            java.lang.String[] r0 = r1.split(r0)
            int r1 = r0.length
            if (r1 <= r11) goto L_0x0fe1
            r0 = r0[r11]
            boolean r1 = r12.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x0fd0
            m116697g(r11)
            java.lang.String r0 = "snswxpc val: 1"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x0feb
        L_0x0fd0:
            boolean r0 = r8.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0feb
            r1 = 0
            m116697g(r1)
            java.lang.String r0 = "snswxpc val: 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x0feb
        L_0x0fe1:
            r1 = -1
            m116697g(r1)
            java.lang.String r0 = "snswxpc val: -1"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
        L_0x0feb:
            return r11
        L_0x0fec:
            java.lang.String r4 = "//mmdumpsys"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x1001
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.console.a$n r1 = new com.tencent.mm.console.a$n
            r1.<init>()
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183875f(r1)
            return r11
        L_0x1001:
            java.lang.String r4 = "//remittance reset"
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L_0x101a
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r1 = 327729(0x50031, float:4.59246E-40)
            r4 = r18
            r0.mo119676J(r1, r4)
            return r11
        L_0x101a:
            r4 = r18
            java.lang.String r13 = "//wv "
            boolean r13 = r1.startsWith(r13)
            java.lang.String r10 = "webview"
            java.lang.String r11 = ".ui.tools.WebViewUI"
            r22 = r2
            java.lang.String r2 = "rawUrl"
            if (r13 == 0) goto L_0x1041
            java.lang.String r0 = "//wv "
            java.lang.String r0 = r1.replace(r0, r14)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r1.putExtra(r2, r0)
            ke3.C88144b.m109790h(r9, r10, r11, r1)
            r13 = 1
            return r13
        L_0x1041:
            java.lang.String r13 = "//wvjsapi "
            boolean r13 = r1.startsWith(r13)
            if (r13 == 0) goto L_0x105e
            java.lang.String r0 = "//wvjsapi "
            java.lang.String r0 = r1.replace(r0, r14)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r1.putExtra(r2, r0)
            java.lang.String r0 = ".ui.tools.WebViewTestUI"
            ke3.C88144b.m109790h(r9, r10, r0, r1)
            r13 = 1
            return r13
        L_0x105e:
            java.lang.String r13 = "//setibeacontabuinopen"
            boolean r13 = r1.startsWith(r13)
            if (r13 == 0) goto L_0x1082
            boolean r0 = eb0.C97625j3.m125811a()
            if (r0 == 0) goto L_0x107f
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_IBEACON_SHAKE_TAB_IS_UIN_RESIDENT_INT
            r13 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r0.mo119677K(r1, r2)
            return r13
        L_0x107f:
            r17 = 0
            return r17
        L_0x1082:
            r17 = 0
            java.lang.String r13 = "//setibeacontabuinclose"
            boolean r13 = r1.startsWith(r13)
            if (r13 == 0) goto L_0x10a2
            boolean r0 = eb0.C97625j3.m125811a()
            if (r0 == 0) goto L_0x10a1
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_IBEACON_SHAKE_TAB_IS_UIN_RESIDENT_INT
            r0.mo119677K(r1, r5)
            r1 = 1
            return r1
        L_0x10a1:
            return r17
        L_0x10a2:
            java.lang.String r13 = "//setibeaconpushopen"
            boolean r13 = r1.startsWith(r13)
            if (r13 == 0) goto L_0x10c3
            boolean r0 = eb0.C97625j3.m125811a()
            if (r0 == 0) goto L_0x10c1
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_IBEACON_PUSH_IS_OPEN_BOOLEAN
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.mo119677K(r1, r2)
            r1 = 1
            return r1
        L_0x10c1:
            r1 = 0
            return r1
        L_0x10c3:
            java.lang.String r13 = "//setibeaconpushclose"
            boolean r13 = r1.startsWith(r13)
            if (r13 == 0) goto L_0x10e4
            boolean r0 = eb0.C97625j3.m125811a()
            if (r0 == 0) goto L_0x10e2
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_IBEACON_PUSH_IS_OPEN_BOOLEAN
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.mo119677K(r1, r2)
            r1 = 1
            return r1
        L_0x10e2:
            r1 = 0
            return r1
        L_0x10e4:
            java.lang.String r13 = "//ibeacon"
            boolean r13 = r1.startsWith(r13)
            if (r13 == 0) goto L_0x1180
            int r0 = android.os.Build.VERSION.SDK_INT
            android.bluetooth.BluetoothAdapter r1 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            if (r1 == 0) goto L_0x10fe
            int r1 = r1.getState()
            r2 = 12
            if (r1 != r2) goto L_0x10fe
            r1 = 1
            goto L_0x10ff
        L_0x10fe:
            r1 = 0
        L_0x10ff:
            android.content.pm.PackageManager r2 = r26.getPackageManager()
            java.lang.String r3 = "android.hardware.bluetooth_le"
            boolean r2 = r2.hasSystemFeature(r3)
            if (r1 == 0) goto L_0x110f
            if (r2 == 0) goto L_0x110f
            r10 = 1
            goto L_0x1110
        L_0x110f:
            r10 = 0
        L_0x1110:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "isNowSupportedIbeacon:"
            r3.append(r4)
            r3.append(r10)
            java.lang.String r4 = "\n\nisSystemSupported:"
            r3.append(r4)
            r4 = 1
            r3.append(r4)
            java.lang.String r4 = "\nisBlueStateOn:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = "\nisSupportedBLE:"
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = "\nSDK:"
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = "\nModel:"
            r3.append(r0)
            java.lang.String r0 = android.os.Build.BRAND
            r3.append(r0)
            java.lang.String r0 = "-"
            r3.append(r0)
            java.lang.String r0 = p156gj.C87203t.m108275k()
            r3.append(r0)
            java.lang.String r0 = "\noperatingSystemInfo:"
            r3.append(r0)
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r3.append(r0)
            java.lang.String r2 = r3.toString()
            r0 = 2131823446(0x7f110b56, float:1.9279692E38)
            java.lang.String r4 = r9.getString(r0)
            r0 = 2131824009(0x7f110d89, float:1.9280834E38)
            java.lang.String r5 = r9.getString(r0)
            com.tencent.mm.console.a$o r6 = new com.tencent.mm.console.a$o
            r6.<init>(r2)
            r7 = 0
            java.lang.String r3 = "TestResult"
            r1 = r26
            nj3.C76879j.m92707A(r1, r2, r3, r4, r5, r6, r7)
            r1 = 1
            return r1
        L_0x1180:
            java.lang.String r13 = "//wvsha1"
            boolean r13 = r1.startsWith(r13)
            r23 = r3
            r3 = 4
            if (r13 == 0) goto L_0x11b0
            java.lang.String r0 = "com.tencent.mm_webview_x5_preferences"
            android.content.SharedPreferences r0 = r9.getSharedPreferences(r0, r3)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = ":"
            int r2 = r1.indexOf(r2)     // Catch:{ IndexOutOfBoundsException -> 0x11a1 }
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r14 = r1.substring(r2)     // Catch:{ IndexOutOfBoundsException -> 0x11a1 }
        L_0x11a1:
            boolean r1 = java.lang.Boolean.parseBoolean(r14)
            java.lang.String r2 = "wvsha1"
            r0.putBoolean(r2, r1)
            r0.apply()
            r1 = 1
            return r1
        L_0x11b0:
            java.lang.String r13 = "//channelId"
            boolean r13 = r1.startsWith(r13)
            if (r13 == 0) goto L_0x11ce
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r14)
            int r3 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.channelId
            r13.append(r3)
            java.lang.String r3 = r13.toString()
            java.lang.String r13 = "channelId"
            nj3.C76879j.m92748s(r9, r3, r13)
        L_0x11ce:
            java.lang.String r3 = "//traceroute"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x11e0
            java.lang.String r0 = "traceroute"
            java.lang.String r1 = ".ui.NetworkDiagnoseIntroUI"
            ke3.C88144b.m109789g(r9, r0, r1)
            r1 = 1
            return r1
        L_0x11e0:
            java.lang.String r3 = "//testoom"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x1233
            r0 = 0
        L_0x11e9:
            r1 = 20
            if (r0 >= r1) goto L_0x11f9
            r1 = 1024(0x400, float:1.435E-42)
            r2 = 1920(0x780, float:2.69E-42)
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap.createBitmap(r1, r2, r3)
            int r0 = r0 + 1
            goto L_0x11e9
        L_0x11f9:
            r0 = 23
            boolean r0 = p206nj.C11171e.m11046c(r0)
            if (r0 == 0) goto L_0x1231
            android.os.Debug$MemoryInfo r0 = new android.os.Debug$MemoryInfo
            r0.<init>()
            android.os.Debug.getMemoryInfo(r0)
            r1 = 2
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            long r1 = r1.totalMemory()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            long r1 = r1.freeMemory()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "testoom %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            goto L_0x1232
        L_0x1231:
            r2 = 1
        L_0x1232:
            return r2
        L_0x1233:
            java.lang.String r3 = "//qzone "
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x1249
            java.lang.String r3 = "//qzone "
            java.lang.String r3 = r1.replace(r3, r14)
            wd3.h1 r13 = new wd3.h1
            r13.<init>(r9)
            r13.mo73842a(r3)
        L_0x1249:
            java.lang.String r3 = "//dumpcrash"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x126f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = a70.C112760b.m154225d()
            r0.append(r1)
            java.lang.String r1 = "crash/"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = a70.C112760b.m154219a()
            com.tencent.p014mm.vfs.C86013q1.m106441b(r0, r1)
            r3 = 1
            return r3
        L_0x126f:
            r3 = 1
            java.lang.String r13 = "//dumpanr"
            boolean r13 = r1.startsWith(r13)
            if (r13 == 0) goto L_0x1282
            java.lang.String r0 = a70.C112760b.m154219a()
            java.lang.String r1 = "/data/anr/"
            com.tencent.p014mm.vfs.C86013q1.m106441b(r1, r0)
            return r3
        L_0x1282:
            java.lang.String r13 = "//testanr"
            boolean r13 = r1.startsWith(r13)
            if (r13 == 0) goto L_0x128e
            eb0.C75604z3.m90827B()
            return r3
        L_0x128e:
            java.lang.String r13 = "//opensnsadRightbar"
            boolean r13 = r1.startsWith(r13)
            if (r13 == 0) goto L_0x1299
            sf0.C90188n0.f258957y = r3
            return r3
        L_0x1299:
            java.lang.String r13 = "//setlocation "
            boolean r13 = r1.startsWith(r13)
            if (r13 == 0) goto L_0x12ce
            java.lang.String[] r0 = r1.split(r7)
            if (r0 == 0) goto L_0x12cc
            boolean r1 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()
            if (r1 != 0) goto L_0x12ae
            goto L_0x12cc
        L_0x12ae:
            sf0.C90188n0.f258934b = r3
            int r1 = r0.length
            if (r1 <= 0) goto L_0x12bd
            r1 = r0[r3]
            r4 = 0
            double r1 = com.tencent.p014mm.sdk.platformtools.Util.getDouble(r1, r4)
            sf0.C90188n0.f258958z = r1
        L_0x12bd:
            int r1 = r0.length
            if (r1 <= r3) goto L_0x12cb
            r1 = 2
            r0 = r0[r1]
            r1 = 0
            double r0 = com.tencent.p014mm.sdk.platformtools.Util.getDouble(r0, r1)
            sf0.C90188n0.f258907A = r0
        L_0x12cb:
            return r3
        L_0x12cc:
            r1 = 0
            return r1
        L_0x12ce:
            java.lang.String r3 = "//switchsdcard"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x13a1
            java.util.ArrayList r0 = com.tencent.p014mm.sdk.platformtools.SdcardUtil.getWritableStatMountParseForStorage()
            int r1 = r0.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "switchsdcard sdcard size = "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            if (r1 <= 0) goto L_0x1331
            r2 = 0
            java.lang.Object r3 = r0.get(r2)
            if (r3 == 0) goto L_0x1331
            java.lang.Object r3 = r0.get(r2)
            com.tencent.mm.sdk.platformtools.SdcardUtil$StatMountParse r3 = (com.tencent.p014mm.sdk.platformtools.SdcardUtil.StatMountParse) r3
            java.lang.String r2 = r3.mountDir
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x1331
            r2 = 0
        L_0x130b:
            if (r2 >= r1) goto L_0x1331
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "switchsdcard list i = "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = " StatMountParse: "
            r3.append(r4)
            java.lang.Object r4 = r0.get(r2)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            int r2 = r2 + 1
            goto L_0x130b
        L_0x1331:
            r10 = 0
        L_0x1332:
            if (r10 >= r1) goto L_0x1352
            java.lang.Object r2 = r0.get(r10)
            com.tencent.mm.sdk.platformtools.SdcardUtil$StatMountParse r2 = (com.tencent.p014mm.sdk.platformtools.SdcardUtil.StatMountParse) r2
            java.lang.String r2 = r2.mountDir
            java.lang.String r3 = a70.C112760b.m154230f0()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x134f
            java.lang.Object r0 = r0.get(r10)
            com.tencent.mm.sdk.platformtools.SdcardUtil$StatMountParse r0 = (com.tencent.p014mm.sdk.platformtools.SdcardUtil.StatMountParse) r0
            java.lang.String r13 = r0.mountDir
            goto L_0x1353
        L_0x134f:
            int r10 = r10 + 1
            goto L_0x1332
        L_0x1352:
            r13 = 0
        L_0x1353:
            r0 = r9
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "switchsdcard newSdcard: "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r1 == 0) goto L_0x137d
            r0 = 2131837600(0x7f1142a0, float:1.93084E38)
            java.lang.String r0 = r9.getString(r0)
            r1 = 1
            nj3.C76879j.m92727U(r9, r0, r1)
            return r1
        L_0x137d:
            r1 = 2131837601(0x7f1142a1, float:1.9308402E38)
            java.lang.String r2 = r9.getString(r1)
            r1 = 2131821617(0x7f110431, float:1.9275982E38)
            java.lang.String r4 = r9.getString(r1)
            r1 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r5 = r9.getString(r1)
            com.tencent.mm.console.a$p r6 = new com.tencent.mm.console.a$p
            r6.<init>(r13, r9, r0)
            r7 = 0
            java.lang.String r3 = ""
            r1 = r26
            nj3.C76879j.m92707A(r1, r2, r3, r4, r5, r6, r7)
            r3 = 1
            return r3
        L_0x13a1:
            r3 = 1
            java.lang.String r13 = "//getip"
            boolean r13 = r1.startsWith(r13)
            if (r13 == 0) goto L_0x13bc
            ob0.b0 r0 = eb0.C97625j3.m125815e()
            eb0.f4 r1 = new eb0.f4
            com.tencent.mm.console.a$q r2 = new com.tencent.mm.console.a$q
            r2.<init>()
            r1.<init>(r2)
            r0.mo123460f(r1)
            return r3
        L_0x13bc:
            java.lang.String r3 = "//localjsapi"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x13f6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "file://"
            r0.append(r1)
            java.lang.String r1 = a70.C112760b.m154195C()
            r0.append(r1)
            java.lang.String r1 = "test_jsapi.html"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r4 = 0
            r3[r4] = r0
            java.lang.String r4 = "alvinluo path: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r6, r4, r3)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            r3.putExtra(r2, r0)
            ke3.C88144b.m109790h(r9, r10, r11, r3)
            return r1
        L_0x13f6:
            java.lang.String r3 = "//getlocalkey"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x141f
            java.lang.String r2 = com.tencent.p014mm.storage.C85796t4.m105984qq()
            r0 = 2131838625(0x7f1146a1, float:1.9310479E38)
            java.lang.String r4 = r9.getString(r0)
            r0 = 2131824009(0x7f110d89, float:1.9280834E38)
            java.lang.String r5 = r9.getString(r0)
            com.tencent.mm.console.a$r r6 = new com.tencent.mm.console.a$r
            r6.<init>(r2, r9)
            r7 = 0
            java.lang.String r3 = "Fingerprint Key"
            r1 = r26
            nj3.C76879j.m92707A(r1, r2, r3, r4, r5, r6, r7)
            r1 = 1
            return r1
        L_0x141f:
            java.lang.String r3 = "//getdevid"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x1448
            java.lang.String r2 = p156gj.C87203t.m108272h()
            r0 = 2131823446(0x7f110b56, float:1.9279692E38)
            java.lang.String r4 = r9.getString(r0)
            r0 = 2131824009(0x7f110d89, float:1.9280834E38)
            java.lang.String r5 = r9.getString(r0)
            com.tencent.mm.console.a$s r6 = new com.tencent.mm.console.a$s
            r6.<init>(r2)
            r7 = 0
            java.lang.String r3 = "devid"
            r1 = r26
            nj3.C76879j.m92707A(r1, r2, r3, r4, r5, r6, r7)
            r3 = 1
            return r3
        L_0x1448:
            r3 = 1
            java.lang.String r13 = "//testhtml"
            boolean r13 = r1.startsWith(r13)
            if (r13 == 0) goto L_0x145f
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "file:///android_asset/jsapi/reader_test1.html"
            r0.putExtra(r2, r1)
            ke3.C88144b.m109790h(r9, r10, r11, r0)
            return r3
        L_0x145f:
            java.lang.String r3 = "//testlocalhtml "
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x1491
            java.lang.String r0 = "//testlocalhtml "
            java.lang.String r0 = r1.replace(r0, r14)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "file://"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.putExtra(r2, r0)
            java.lang.String r0 = "neverGetA8Key"
            r2 = 1
            r1.putExtra(r0, r2)
            ke3.C88144b.m109790h(r9, r10, r11, r1)
            return r2
        L_0x1491:
            java.lang.String r2 = "//setkey"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x14b2
            java.lang.String r0 = "//setkey"
            java.lang.String r0 = r1.replace(r0, r14)
            boolean r0 = com.tencent.p014mm.storage.C85796t4.m105982bD(r0)
            if (r0 == 0) goto L_0x14b0
            r0 = 2131838570(0x7f11466a, float:1.9310367E38)
            r1 = 0
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r9, (int) r0, (int) r1)
            r0.show()
        L_0x14b0:
            r2 = 1
            return r2
        L_0x14b2:
            r2 = 1
            java.lang.String r3 = "//tinker"
            boolean r3 = r1.startsWith(r3)
            java.lang.String r11 = "shortlink"
            if (r3 == 0) goto L_0x14d0
            java.lang.String r0 = "tinker update"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
            java.lang.Class<xn.h> r0 = p271xn.C91294h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            xn.h r0 = (p271xn.C91294h) r0
            r0.mo125094Z9()
            return r2
        L_0x14d0:
            java.lang.String r3 = "//mbpkg "
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x1518
            java.lang.String r3 = "//mbpkg "
            java.lang.String r1 = r1.replace(r3, r14)
            java.lang.String r3 = ","
            java.lang.String[] r1 = r1.split(r3)
            int r3 = r1.length
            r4 = 2
            if (r3 != r4) goto L_0x14ee
            r3 = 0
            r4 = r1[r3]
            r1 = r1[r2]
            goto L_0x14f8
        L_0x14ee:
            r3 = 0
            int r4 = r1.length
            if (r4 != r2) goto L_0x14f6
            r4 = r1[r3]
            r1 = r14
            goto L_0x14f8
        L_0x14f6:
            r1 = r14
            r4 = r1
        L_0x14f8:
            boolean r2 = r4.equalsIgnoreCase(r14)
            if (r2 == 0) goto L_0x1501
            java.lang.String r4 = "magicemo"
        L_0x1501:
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.magicbrush.n0 r0 = (com.tencent.p014mm.plugin.magicbrush.C30211n0) r0
            com.tencent.mm.console.a$a r2 = new com.tencent.mm.console.a$a
            r2.<init>()
            r3 = 0
            r0.mo57240SE(r4, r1, r3, r2)
            java.lang.String r0 = "mbpkg update"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
            r2 = 1
            return r2
        L_0x1518:
            java.lang.String r3 = "//clearmbpkg"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x1534
            java.lang.String r3 = "//clearmbpkg "
            r1.replace(r3, r14)
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.magicbrush.n0 r0 = (com.tencent.p014mm.plugin.magicbrush.C30211n0) r0
            r0.mo57242d(r14)
            java.lang.String r0 = "clearmbpkg"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
            return r2
        L_0x1534:
            java.lang.String r3 = "//registmbpkg "
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x1583
            java.lang.String r3 = "//registmbpkg "
            java.lang.String r1 = r1.replace(r3, r14)
            java.lang.String r3 = ","
            java.lang.String[] r1 = r1.split(r3)
            int r3 = r1.length
            r4 = 2
            if (r3 < r4) goto L_0x1552
            r3 = 0
            r3 = r1[r3]
            r1 = r1[r2]
            goto L_0x1556
        L_0x1552:
            java.lang.String r3 = "regist"
            r1 = r14
        L_0x1556:
            boolean r2 = r1.equalsIgnoreCase(r14)
            if (r2 == 0) goto L_0x155f
            java.lang.String r1 = "magicemo"
        L_0x155f:
            java.lang.String r2 = "regist"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x1572
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.magicbrush.n0 r0 = (com.tencent.p014mm.plugin.magicbrush.C30211n0) r0
            r0.mo57244gY(r1)
            goto L_0x157b
        L_0x1572:
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.magicbrush.n0 r0 = (com.tencent.p014mm.plugin.magicbrush.C30211n0) r0
            r0.mo57245pl(r1)
        L_0x157b:
            java.lang.String r0 = "registmbpkg"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
            r1 = 1
            return r1
        L_0x1583:
            java.lang.String r2 = "//getmbpkg "
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x15c3
            java.lang.String r2 = "//getmbpkg "
            java.lang.String r1 = r1.replace(r2, r14)
            boolean r2 = r1.equalsIgnoreCase(r14)
            if (r2 == 0) goto L_0x159a
            java.lang.String r1 = "magicemo"
        L_0x159a:
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.magicbrush.n0 r0 = (com.tencent.p014mm.plugin.magicbrush.C30211n0) r0
            com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo r0 = r0.zs0(r1)
            if (r0 == 0) goto L_0x15c1
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = r0.f81571n
            r3 = 1
            android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r1, (java.lang.CharSequence) r2, (int) r3)
            r1.show()
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = r0.f81571n
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "getmbpkg patchId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r0, r1)
            goto L_0x15c2
        L_0x15c1:
            r3 = 1
        L_0x15c2:
            return r3
        L_0x15c3:
            r3 = 1
            java.lang.String r0 = "//mbsetpkg "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x161a
            java.lang.String r0 = "//mbsetpkg "
            java.lang.String r0 = r1.replace(r0, r14)
            java.lang.String[] r0 = r0.split(r7)
            int r2 = r0.length
            r11 = 2
            if (r2 != r11) goto L_0x15e5
            r2 = 0
            r11 = r0[r2]
            r0 = r0[r3]
            int r0 = java.lang.Integer.parseInt(r0)
            long r2 = (long) r0
            goto L_0x15e8
        L_0x15e5:
            r11 = r14
            r2 = r20
        L_0x15e8:
            java.lang.String r0 = "MagicBootsPkgVersion"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            r0.encode((java.lang.String) r11, (long) r2)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r19 = r5
            java.lang.String r5 = "Done, bizName:"
            r13.append(r5)
            r13.append(r11)
            java.lang.String r5 = "to version:"
            r13.append(r5)
            r13.append(r2)
            java.lang.String r2 = r13.toString()
            r3 = 1
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (java.lang.CharSequence) r2, (int) r3)
            r0.show()
            goto L_0x161c
        L_0x161a:
            r19 = r5
        L_0x161c:
            java.lang.String r0 = "//checkspell"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1678
            java.lang.String r0 = "//checkspell "
            java.lang.String r0 = r1.replace(r0, r14)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x1631
            return r3
        L_0x1631:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r10 = 0
        L_0x1637:
            int r2 = r0.length()
            if (r10 >= r2) goto L_0x166d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "["
            r2.append(r3)
            char r3 = r0.charAt(r10)
            r2.append(r3)
            java.lang.String r3 = ":"
            r2.append(r3)
            char r3 = r0.charAt(r10)
            java.lang.String r3 = com.tencent.p014mm.platformtools.SpellMap.m80581a(r3)
            r2.append(r3)
            java.lang.String r3 = "]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            int r10 = r10 + 1
            goto L_0x1637
        L_0x166d:
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Check Spell"
            nj3.C76879j.m92748s(r9, r0, r1)
            r2 = 1
            return r2
        L_0x1678:
            r2 = 1
            java.lang.String r0 = "//gallery "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x16a5
            java.lang.String r0 = "//gallery "
            java.lang.String r0 = r1.replace(r0, r14)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x168e
            return r2
        L_0x168e:
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            r3 = 0
            android.content.SharedPreferences r1 = r9.getSharedPreferences(r1, r3)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r3 = "gallery"
            android.content.SharedPreferences$Editor r0 = r1.putString(r3, r0)
            r0.commit()
            return r2
        L_0x16a5:
            java.lang.String r0 = "//svgtag"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x16c8
            java.lang.String r0 = "//svgtag "
            java.lang.String r0 = r1.replace(r0, r14)
            boolean r1 = r0.equals(r12)
            if (r1 == 0) goto L_0x16bd
            lg3.C88500i.m110373a(r2)
            goto L_0x16c7
        L_0x16bd:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x16c7
            r1 = 0
            lg3.C88500i.m110373a(r1)
        L_0x16c7:
            return r2
        L_0x16c8:
            java.lang.String r0 = "//svgcode"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x173c
            java.lang.String r0 = "//svgcode "
            java.lang.String r0 = r1.replace(r0, r14)     // Catch:{ ClassNotFoundException -> 0x170b, NoSuchFieldException -> 0x1703, IllegalAccessException -> 0x16fb, IllegalArgumentException -> 0x16f3 }
            boolean r1 = r0.equals(r12)     // Catch:{ ClassNotFoundException -> 0x170b, NoSuchFieldException -> 0x1703, IllegalAccessException -> 0x16fb, IllegalArgumentException -> 0x16f3 }
            if (r1 == 0) goto L_0x16dd
            goto L_0x16e0
        L_0x16dd:
            r0.equals(r8)     // Catch:{ ClassNotFoundException -> 0x170b, NoSuchFieldException -> 0x1703, IllegalAccessException -> 0x16fb, IllegalArgumentException -> 0x16f3 }
        L_0x16e0:
            java.lang.Class<com.tencent.mm.BuildConfig> r0 = com.tencent.p014mm.BuildConfig.class
            java.lang.String r1 = "SVGCode"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch:{ ClassNotFoundException -> 0x170b, NoSuchFieldException -> 0x1703, IllegalAccessException -> 0x16fb, IllegalArgumentException -> 0x16f3 }
            r2 = 1
            r1.setAccessible(r2)     // Catch:{ ClassNotFoundException -> 0x170b, NoSuchFieldException -> 0x1703, IllegalAccessException -> 0x16fb, IllegalArgumentException -> 0x16f3 }
            boolean r10 = r1.getBoolean(r0)     // Catch:{ ClassNotFoundException -> 0x170b, NoSuchFieldException -> 0x1703, IllegalAccessException -> 0x16fb, IllegalArgumentException -> 0x16f3 }
            goto L_0x1713
        L_0x16f1:
            r1 = 1
            goto L_0x173b
        L_0x16f3:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x16f1 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r14, r2)     // Catch:{ Exception -> 0x16f1 }
            goto L_0x1712
        L_0x16fb:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x16f1 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r14, r2)     // Catch:{ Exception -> 0x16f1 }
            goto L_0x1712
        L_0x1703:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x16f1 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r14, r2)     // Catch:{ Exception -> 0x16f1 }
            goto L_0x1712
        L_0x170b:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x16f1 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r14, r2)     // Catch:{ Exception -> 0x16f1 }
        L_0x1712:
            r10 = 0
        L_0x1713:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x16f1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x16f1 }
            r1.<init>()     // Catch:{ Exception -> 0x16f1 }
            java.lang.String r2 = "Using SVG Code : "
            r1.append(r2)     // Catch:{ Exception -> 0x16f1 }
            r1.append(r10)     // Catch:{ Exception -> 0x16f1 }
            r1.append(r7)     // Catch:{ Exception -> 0x16f1 }
            boolean r2 = ii3.C87739b.m109157b()     // Catch:{ Exception -> 0x16f1 }
            r1.append(r2)     // Catch:{ Exception -> 0x16f1 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x16f1 }
            r2 = 1
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r2)     // Catch:{ Exception -> 0x16f1 }
            r0.show()     // Catch:{ Exception -> 0x16f1 }
            goto L_0x16f1
        L_0x173b:
            return r1
        L_0x173c:
            java.lang.String r0 = "//testMbanner"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1779
            java.lang.String r0 = "//testMbanner "
            java.lang.String r0 = r1.replace(r0, r14)     // Catch:{ Exception -> 0x1777 }
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)     // Catch:{ Exception -> 0x1777 }
            int r1 = r0.length     // Catch:{ Exception -> 0x1777 }
            r2 = 2
            if (r1 < r2) goto L_0x1777
            eb0.w3 r1 = eb0.C75598w3.m90816e()     // Catch:{ Exception -> 0x1777 }
            eb0.v3 r2 = new eb0.v3     // Catch:{ Exception -> 0x1777 }
            r3 = 0
            r3 = r0[r3]     // Catch:{ Exception -> 0x1777 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x1777 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x1777 }
            r4 = 1
            r0 = r0[r4]     // Catch:{ Exception -> 0x1777 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x1777 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x1777 }
            r4 = 0
            r2.<init>(r3, r0, r4)     // Catch:{ Exception -> 0x1777 }
            r1.mo105954g(r2)     // Catch:{ Exception -> 0x1777 }
        L_0x1777:
            r1 = 1
            return r1
        L_0x1779:
            java.lang.String r0 = "//testrsa"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x178a
            r0 = 106(0x6a, float:1.49E-43)
            java.lang.String r2 = "010001"
            java.lang.String r3 = "E338E5DAD46B331E3071FAFD4C0F84C7C7965DBBE64C6F8CC0F7CF04DC640C1F84A2014431A48D65F2B2F172BA9BE6F5A049BF52C78C14B0965E20F0D80D85A9180EBABB913D49821D28BFD9601DF52A4F3230AECAD96D23415F5E94D51A87CAA7630C5F3CB70345BAF572A4F61A134A2265AFD8FADDFE0222BD9ABF7DBEB7444D031454E8F21820BBC725E6857F765660E987FADEBCF6B3A15355C4CD3752A7B544D1D7E037AF4F9725BE37681A84C9E1DC431B3065294EAD53E913BAF16D46714B013EA077191E6CA08ABA6D70E9CA792D898D692E3168D6341369976657CD5E1504B9E2458F107225176734D11621AD36D7FFA26C573D6612455B09105C41"
            qe3.C101125b1.m132539g(r2, r3, r0)
        L_0x178a:
            java.lang.String r0 = "//recomT"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x17a8
            java.lang.String r0 = "//recomT "
            java.lang.String r0 = r1.replace(r0, r14)     // Catch:{ Exception -> 0x17a6 }
            eb0.c r1 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x17a6 }
            gb0.c r1 = r1.mo105904s()     // Catch:{ Exception -> 0x17a6 }
            r2 = 0
            r3 = 1
            r1.mo106161g(r0, r3, r2)     // Catch:{ Exception -> 0x17a7 }
            goto L_0x17a7
        L_0x17a6:
            r3 = 1
        L_0x17a7:
            return r3
        L_0x17a8:
            java.lang.String r0 = "//recomF"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x17c5
            java.lang.String r0 = "//recomF "
            java.lang.String r0 = r1.replace(r0, r14)     // Catch:{ Exception -> 0x17c3 }
            eb0.c r1 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x17c3 }
            gb0.c r1 = r1.mo105904s()     // Catch:{ Exception -> 0x17c3 }
            r2 = 0
            r3 = 0
            r1.mo106161g(r0, r3, r2)     // Catch:{ Exception -> 0x17c3 }
        L_0x17c3:
            r2 = 1
            return r2
        L_0x17c5:
            r2 = 1
            java.lang.String r0 = "//resetwxpayagree"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x17e1
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_AGREE_PAY_BOOLEAN_SYNC
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r0.mo119677K(r1, r3)
            return r2
        L_0x17e1:
            java.lang.String r0 = "//ffmpeg"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x184e
            java.lang.String r0 = "-r "
            int r0 = r1.indexOf(r0)     // Catch:{ Exception -> 0x183e }
            java.lang.String r2 = "-b "
            int r2 = r1.indexOf(r2)     // Catch:{ Exception -> 0x183e }
            r3 = 3
            int r0 = r0 + r3
            java.lang.String r0 = r1.substring(r0, r2)     // Catch:{ Exception -> 0x183e }
            int r2 = r2 + r3
            java.lang.String r1 = r1.substring(r2)     // Catch:{ Exception -> 0x183e }
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x183e }
            r2 = 0
            float r0 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r0, r2)     // Catch:{ Exception -> 0x183e }
            java.lang.String r1 = r1.trim()     // Catch:{ Exception -> 0x183e }
            r2 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r2)     // Catch:{ Exception -> 0x183e }
            com.tencent.p014mm.plugin.sight.base.C85457c.f249058c = r1     // Catch:{ Exception -> 0x183e }
            com.tencent.p014mm.plugin.sight.base.C85457c.f249059d = r0     // Catch:{ Exception -> 0x183e }
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x183e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x183e }
            r3.<init>()     // Catch:{ Exception -> 0x183e }
            java.lang.String r4 = "set C2C video encode frame rate "
            r3.append(r4)     // Catch:{ Exception -> 0x183e }
            r3.append(r0)     // Catch:{ Exception -> 0x183e }
            java.lang.String r0 = " bitrate "
            r3.append(r0)     // Catch:{ Exception -> 0x183e }
            r3.append(r1)     // Catch:{ Exception -> 0x183e }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x183e }
            r1 = 0
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r2, (java.lang.CharSequence) r0, (int) r1)     // Catch:{ Exception -> 0x183e }
            r0.show()     // Catch:{ Exception -> 0x183e }
            r2 = 1
            goto L_0x184d
        L_0x183e:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "set C2C video frame rate fail, please ensure your command."
            r2 = 1
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r2)
            r0.show()
        L_0x184d:
            return r2
        L_0x184e:
            java.lang.String r0 = "//onlinevideo"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x18a0
            java.lang.String r0 = "//onlinevideo "
            java.lang.String r0 = r1.replace(r0, r14)     // Catch:{ Exception -> 0x1889 }
            r1 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)     // Catch:{ Exception -> 0x1889 }
            eb0.c r1 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x1889 }
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()     // Catch:{ Exception -> 0x1889 }
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_ONLINE_VIDEO_INT     // Catch:{ Exception -> 0x1889 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x1889 }
            r1.mo119677K(r2, r3)     // Catch:{ Exception -> 0x1889 }
            if (r0 <= 0) goto L_0x1878
            java.lang.String r0 = "online video"
            goto L_0x187b
        L_0x1878:
            java.lang.String r0 = "offline video"
        L_0x187b:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x1889 }
            r2 = 0
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r1, (java.lang.CharSequence) r0, (int) r2)     // Catch:{ Exception -> 0x1889 }
            r0.show()     // Catch:{ Exception -> 0x1889 }
            r2 = 1
            goto L_0x189f
        L_0x1889:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r14, r1)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "set online video fail, please ensure your command."
            r2 = 1
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r2)
            r0.show()
        L_0x189f:
            return r2
        L_0x18a0:
            r2 = 1
            java.lang.String r0 = "//hevcinfo"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x18cc
            java.lang.String r0 = s62.C101554f.m133318c()
            java.lang.String r1 = com.tencent.p014mm.p136ui.chatting.ChattingUIFragment.f215287Q
            com.tencent.mm.storage.f4 r3 = new com.tencent.mm.storage.f4
            r3.<init>()
            r3.mo108749c3(r1)
            r1 = 2
            r3.mo108740T2(r1)
            r3.setType(r2)
            long r4 = java.lang.System.currentTimeMillis()
            r3.mo108733M2(r4)
            r3.mo108732L2(r0)
            eb0.C75604z3.m90852x(r3)
            return r2
        L_0x18cc:
            java.lang.String r0 = "//presns"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x18f3
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.console.a$b r1 = new com.tencent.mm.console.a$b
            r1.<init>()
            r2 = 3000(0xbb8, double:1.482E-320)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183878i(r1, r2)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "preload sns"
            r2 = 0
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r2)
            r0.show()
            r1 = 1
            return r1
        L_0x18f3:
            java.lang.String r0 = "//calcwxdata"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x191c
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_BACKGROUND_CALC_TIME_LONG
            java.lang.Long r2 = java.lang.Long.valueOf(r20)
            r0.mo119677K(r1, r2)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "calc wx data success"
            r2 = 0
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r2)
            r0.show()
            r1 = 1
            return r1
        L_0x191c:
            java.lang.String r0 = "//checkspace"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1970
            java.lang.String r0 = "//checkspace "
            java.lang.String r0 = r1.replace(r0, r14)     // Catch:{ Exception -> 0x195a }
            r1 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)     // Catch:{ Exception -> 0x195a }
            com.tencent.mm.autogen.events.CheckMobileSpaceEvent r1 = new com.tencent.mm.autogen.events.CheckMobileSpaceEvent     // Catch:{ Exception -> 0x195a }
            r1.<init>()     // Catch:{ Exception -> 0x195a }
            com.tencent.mm.autogen.events.CheckMobileSpaceEvent$a r2 = r1.f193524d     // Catch:{ Exception -> 0x195a }
            r2.f193525a = r0     // Catch:{ Exception -> 0x195a }
            r1.publish()     // Catch:{ Exception -> 0x195a }
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x195a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x195a }
            r2.<init>()     // Catch:{ Exception -> 0x195a }
            java.lang.String r3 = "check space code "
            r2.append(r3)     // Catch:{ Exception -> 0x195a }
            r2.append(r0)     // Catch:{ Exception -> 0x195a }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x195a }
            r2 = 0
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r1, (java.lang.CharSequence) r0, (int) r2)     // Catch:{ Exception -> 0x195a }
            r0.show()     // Catch:{ Exception -> 0x195a }
            r2 = 1
            goto L_0x196f
        L_0x195a:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r14, r1)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "check space code fail, please ensure your command."
            r2 = 1
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r2)
            r0.show()
        L_0x196f:
            return r2
        L_0x1970:
            java.lang.String r0 = "//showkv"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x19ab
            boolean r0 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()
            if (r0 == 0) goto L_0x19ab
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x199a }
            r0.<init>()     // Catch:{ Exception -> 0x199a }
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r2)     // Catch:{ Exception -> 0x199a }
            r2 = 524288(0x80000, float:7.34684E-40)
            r0.addFlags(r2)     // Catch:{ Exception -> 0x199a }
            java.lang.Class<h81.g> r2 = h81.C59773g.class
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x199a }
            h81.g r2 = (h81.C59773g) r2     // Catch:{ Exception -> 0x199a }
            r2.mo84745bA(r9, r0)     // Catch:{ Exception -> 0x199a }
            r1 = 1
            return r1
        L_0x199a:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r0 = r0.toString()
            r2 = 0
            r3[r2] = r0
            java.lang.String r0 = "showkv error [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r0, r3)
        L_0x19ab:
            java.lang.String r0 = "//showexpt2"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x19cb
            boolean r0 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()
            if (r0 == 0) goto L_0x19cb
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r0.mo58778Id(r9, r1)
            r1 = 1
            return r1
        L_0x19cb:
            java.lang.String r0 = r27.trim()
            java.lang.String r2 = "//testreportsdk"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x19ef
            boolean r0 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()
            if (r0 == 0) goto L_0x19ef
            java.lang.Class<l31.e> r0 = l31.C61212e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            l31.e r0 = (l31.C61212e) r0
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r0.mo86161cQ(r9, r1)
            r1 = 1
            return r1
        L_0x19ef:
            java.lang.String r0 = "//showexpt"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1a0f
            boolean r0 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()
            if (r0 == 0) goto L_0x1a0f
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r0.Qm0(r9, r1)
            r1 = 1
            return r1
        L_0x1a0f:
            java.lang.String r0 = "//resetvfs"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1a53
            boolean r0 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()
            if (r0 == 0) goto L_0x1a53
            java.lang.String r0 = "VFSStrategy"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            java.lang.String r1 = "VFSSwitch"
            r2 = 0
            r0.encode((java.lang.String) r1, (boolean) r2)
            java.lang.String r0 = "extmig_status_memo_storage"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            android.content.SharedPreferences$Editor r0 = r0.clear()
            r0.commit()
            java.lang.String r0 = "extmig_switch_storage"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            android.content.SharedPreferences$Editor r0 = r0.clear()
            r0.commit()
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "vfsSwitch close"
            r2 = 1
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r2)
            r0.show()
            return r2
        L_0x1a53:
            r2 = 1
            java.lang.String r0 = "//openvfs"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1a88
            boolean r0 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()
            if (r0 == 0) goto L_0x1a88
            java.lang.String r0 = "VFSStrategy"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            java.lang.String r1 = "VFSSwitch"
            r0.encode((java.lang.String) r1, (boolean) r2)
            java.lang.String r0 = "extmig_switch_storage"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            java.lang.String r1 = "is_routine_enabled"
            r0.encode((java.lang.String) r1, (boolean) r2)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "vfsSwitch open"
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r2)
            r0.show()
            return r2
        L_0x1a88:
            java.lang.String r0 = "//upfacemodel"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1a9f
            ob0.b0 r0 = eb0.C97625j3.m125815e()
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.o r1 = new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.o
            r3 = 42
            r1.<init>((int) r3)
            r0.mo123460f(r1)
            return r2
        L_0x1a9f:
            java.lang.String r0 = "//facett"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1ab7
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FACE_SHOW_TUTORIAL_BOOLEAN_SYNC
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r0.mo119677K(r1, r3)
            return r2
        L_0x1ab7:
            java.lang.String r0 = "//startstory"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1ac2
            boolean r0 = sf0.C90188n0.f258933a
            return r2
        L_0x1ac2:
            java.lang.String r0 = "//axauth"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1ade
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.mo121127b()
            com.tencent.mm.network.g r0 = r0.mo123464j()
            com.tencent.mm.network.e r0 = r0.mo55443A3()
            r0.mo55432j1()
            return r2
        L_0x1ade:
            java.lang.String r0 = "//timeout"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1b09
            java.lang.String r0 = "//timeout "
            java.lang.String r0 = r1.replace(r0, r14)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r3 = 0
            r1[r3] = r0
            java.lang.String r3 = "set session timeouot cgi %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r1)
            com.tencent.p014mm.network.C114803y.f344200A = r0
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.mo121127b()
            com.tencent.mm.network.g r1 = r1.mo123464j()
            r1.mo55449H1(r0)
            return r2
        L_0x1b09:
            java.lang.String r0 = "//mmlogic"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1b31
            java.lang.String r0 = "//mmlogic "
            java.lang.String r0 = r1.replace(r0, r14)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r3 = 0
            r1[r3] = r0
            java.lang.String r3 = "get mmlogic command %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r1)
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.mo121127b()
            com.tencent.mm.network.g r1 = r1.mo123464j()
            r1.mo55454O4(r0)
            return r2
        L_0x1b31:
            java.lang.String r0 = "//livespeedtest"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1b6d
            java.lang.String r0 = "do livespeedtest"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.mo121127b()
            com.tencent.mm.network.g r1 = r0.mo123464j()
            r3 = 524288(0x80000, float:7.34684E-40)
            r4 = 10
            r5 = 6
            r6 = 5
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r2 = "upload Ctx"
            byte[] r7 = r2.getBytes(r0)
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r2 = "download Ctx"
            byte[] r8 = r2.getBytes(r0)
            com.tencent.mm.console.a$j r9 = new com.tencent.mm.console.a$j
            r9.<init>()
            java.lang.String r2 = "101.91.37.26"
            r1.mo55453O0(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = 1
            return r1
        L_0x1b6d:
            java.lang.String r0 = "//weaknet"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1b90
            java.lang.String r0 = "do weaknet"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.mo121127b()
            com.tencent.mm.network.g r0 = r0.mo123464j()
            com.tencent.mm.console.a$l r1 = new com.tencent.mm.console.a$l
            r1.<init>()
            r0.mo55461T2(r1)
            r1 = 1
            return r1
        L_0x1b90:
            java.lang.String r0 = "//mockextdeeplink"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1c09
            java.lang.String r0 = "//mockextdeeplink"
            java.lang.String r0 = r1.replaceFirst(r0, r14)
            java.lang.String r0 = r0.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x1c07
            java.lang.String r1 = "weixin://dl"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x1c07
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity> r2 = com.tencent.p014mm.plugin.base.stub.WXCustomSchemeEntryActivity.class
            r1.<init>(r9, r2)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r2)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.setData(r0)
            java.lang.String r0 = "translate_link_scene"
            r2 = 2
            r1.putExtra(r0, r2)
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r1)
            java.lang.Object[] r2 = r0.mo10232b()
            java.lang.String r3 = "com/tencent/mm/console/CommandProcessor"
            java.lang.String r4 = "processed"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r26
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/console/CommandProcessor"
            java.lang.String r3 = "processed"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r26
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
        L_0x1c07:
            r2 = 1
            return r2
        L_0x1c09:
            r2 = 1
            java.lang.String r0 = "//switchpaytype"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1c40
            java.lang.String[] r0 = r1.split(r7)
            if (r0 == 0) goto L_0x1c3e
            int r1 = r0.length
            r3 = 2
            if (r1 < r3) goto L_0x1c3e
            r0 = r0[r2]     // Catch:{ Exception -> 0x1c37 }
            r1 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)     // Catch:{ Exception -> 0x1c37 }
            eb0.c r1 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x1c37 }
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()     // Catch:{ Exception -> 0x1c37 }
            r2 = 339975(0x53007, float:4.76406E-40)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x1c37 }
            r1.mo119676J(r2, r0)     // Catch:{ Exception -> 0x1c37 }
            r1 = 1
            return r1
        L_0x1c37:
            java.lang.String r0 = "hy: switch wallet type error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            r1 = 0
            return r1
        L_0x1c3e:
            r1 = 0
            return r1
        L_0x1c40:
            java.lang.String r0 = "//setNfcOpenUrl "
            boolean r0 = r1.startsWith(r0)
            java.lang.String r2 = "null"
            if (r0 == 0) goto L_0x1c6c
            java.lang.String r0 = "//setNfcOpenUrl "
            java.lang.String r0 = r1.replace(r0, r14)
            android.content.SharedPreferences r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getToolsProcesstPreference()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x1c60
            goto L_0x1c61
        L_0x1c60:
            r14 = r0
        L_0x1c61:
            java.lang.String r0 = "nfc_open_url"
            r1.putString(r0, r14)
            r1.commit()
            r1 = 1
            return r1
        L_0x1c6c:
            java.lang.String r0 = "//setMBV8Debug "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1c9d
            java.lang.String r0 = "//setMBV8Debug "
            java.lang.String r0 = r1.replace(r0, r14)
            android.content.SharedPreferences r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getToolsProcesstPreference()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "true"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x1c92
            java.lang.String r0 = "appbrandgame_open_v8debug"
            r2 = 1
            r1.putBoolean(r0, r2)
            goto L_0x1c99
        L_0x1c92:
            r2 = 1
            java.lang.String r0 = "appbrandgame_open_v8debug"
            r3 = 0
            r1.putBoolean(r0, r3)
        L_0x1c99:
            r1.commit()
            return r2
        L_0x1c9d:
            java.lang.String r0 = "//setWcwss "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1cc5
            java.lang.String r0 = "//setWcwss "
            java.lang.String r0 = r1.replace(r0, r14)
            android.content.SharedPreferences r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getToolsProcesstPreference()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x1cba
            goto L_0x1cbb
        L_0x1cba:
            r14 = r0
        L_0x1cbb:
            java.lang.String r0 = "appbrandgame_open_wcwss"
            r1.putString(r0, r14)
            r1.commit()
            r1 = 1
            return r1
        L_0x1cc5:
            java.lang.String r0 = "//setNativeWss "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1ced
            java.lang.String r0 = "//setNativeWss "
            java.lang.String r0 = r1.replace(r0, r14)
            android.content.SharedPreferences r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getToolsProcesstPreference()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x1ce2
            goto L_0x1ce3
        L_0x1ce2:
            r14 = r0
        L_0x1ce3:
            java.lang.String r0 = "appbrandgame_open_nativewss"
            r1.putString(r0, r14)
            r1.commit()
            r1 = 1
            return r1
        L_0x1ced:
            java.lang.String r0 = "//setCdnRequest "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1d15
            java.lang.String r0 = "//setCdnRequest "
            java.lang.String r0 = r1.replace(r0, r14)
            android.content.SharedPreferences r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getToolsProcesstPreference()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x1d0a
            goto L_0x1d0b
        L_0x1d0a:
            r14 = r0
        L_0x1d0b:
            java.lang.String r0 = "appbrandgame_open_cdnrequest"
            r1.putString(r0, r14)
            r1.commit()
            r1 = 1
            return r1
        L_0x1d15:
            java.lang.String r0 = "//setCronetDownload "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1d3d
            java.lang.String r0 = "//setCronetDownload "
            java.lang.String r0 = r1.replace(r0, r14)
            android.content.SharedPreferences r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getToolsProcesstPreference()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x1d32
            goto L_0x1d33
        L_0x1d32:
            r14 = r0
        L_0x1d33:
            java.lang.String r0 = "appbrandgame_open_cronetdownload"
            r1.putString(r0, r14)
            r1.commit()
            r1 = 1
            return r1
        L_0x1d3d:
            java.lang.String r0 = "//setCronetUpload "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1d65
            java.lang.String r0 = "//setCronetUpload "
            java.lang.String r0 = r1.replace(r0, r14)
            android.content.SharedPreferences r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getToolsProcesstPreference()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x1d5a
            goto L_0x1d5b
        L_0x1d5a:
            r14 = r0
        L_0x1d5b:
            java.lang.String r0 = "appbrandgame_open_cronetupload"
            r1.putString(r0, r14)
            r1.commit()
            r1 = 1
            return r1
        L_0x1d65:
            java.lang.String r0 = "//setNativeLibuv "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1d8d
            java.lang.String r0 = "//setNativeLibuv "
            java.lang.String r0 = r1.replace(r0, r14)
            android.content.SharedPreferences r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getToolsProcesstPreference()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x1d82
            goto L_0x1d83
        L_0x1d82:
            r14 = r0
        L_0x1d83:
            java.lang.String r0 = "appbrandgame_open_nativelibuv"
            r1.putString(r0, r14)
            r1.commit()
            r2 = 1
            return r2
        L_0x1d8d:
            r2 = 1
            java.lang.String r0 = "//reportfailip "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1db0
            java.lang.String r0 = "//reportfailip "
            java.lang.String r0 = r1.replace(r0, r14)
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.mo121127b()
            com.tencent.mm.network.g r1 = r1.mo123464j()
            boolean r0 = r0.equals(r15)
            r1.mo55452J4(r0)
            return r2
        L_0x1db0:
            java.lang.String r0 = "//forcev6 "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1dd2
            java.lang.String r0 = "//forcev6 "
            java.lang.String r0 = r1.replace(r0, r14)
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.mo121127b()
            com.tencent.mm.network.g r1 = r1.mo123464j()
            boolean r0 = r0.equals(r15)
            r1.mo55471e4(r0)
            return r2
        L_0x1dd2:
            java.lang.String r0 = "//active "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1df4
            java.lang.String r0 = "//active "
            java.lang.String r0 = r1.replace(r0, r14)
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.mo121127b()
            com.tencent.mm.network.g r1 = r1.mo123464j()
            boolean r0 = r0.equals(r15)
            r1.mo55470d4(r0)
            return r2
        L_0x1df4:
            java.lang.String r0 = "//testcrash"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x3924
            java.lang.String r0 = "//deletepsk"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1e14
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.mo121127b()
            com.tencent.mm.network.g r0 = r0.mo123464j()
            r0.mo55469c4()
            return r2
        L_0x1e14:
            java.lang.String r0 = "//setmmtlsregion "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1e36
            java.lang.String r0 = "//setmmtlsregion "
            java.lang.String r0 = r1.replace(r0, r14)
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.mo121127b()
            com.tencent.mm.network.g r1 = r1.mo123464j()
            int r0 = java.lang.Integer.parseInt(r0)
            r1.mo55485n4(r0)
            return r2
        L_0x1e36:
            java.lang.String r0 = "//setecdhversion "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1e4c
            java.lang.String r0 = "//setecdhversion "
            java.lang.String r0 = r1.replace(r0, r14)
            int r0 = java.lang.Integer.parseInt(r0)
            qe3.C101127f.m132554g(r0)
            return r2
        L_0x1e4c:
            java.lang.String r0 = "//debughost "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1e67
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.mo121127b()
            com.tencent.mm.network.g r0 = r0.mo123464j()
            java.lang.String r1 = "short.wechat.com"
            r0.mo55490s5(r1)
            return r2
        L_0x1e67:
            java.lang.String r0 = "//getcdndns"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1e7c
            java.lang.String r0 = "getcdndns"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)
            com.tencent.mm.modelcdntran.i0 r0 = com.tencent.p014mm.modelcdntran.C92779i0.Cx0()
            r0.Gx0(r2)
            return r2
        L_0x1e7c:
            java.lang.String r0 = "//cronet "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1e92
            java.lang.String r0 = "//cronet "
            java.lang.String r0 = r1.replace(r0, r14)
            java.lang.String r0 = r0.trim()
            com.tencent.mars.cdn.CronetLogic.cronetDebugTest(r0)
            return r2
        L_0x1e92:
            java.lang.String r0 = "//gamecb "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1ee7
            java.lang.String r0 = "//gamecb "
            java.lang.String r0 = r1.replace(r0, r14)
            java.lang.String r0 = r0.trim()
            android.content.SharedPreferences r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getToolsProcesstPreference()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            java.lang.String r2 = "appbrandgame_use_commandbuffer"
            r1.putInt(r2, r0)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "小游戏 CommandBuffer "
            r3.append(r4)
            if (r0 != 0) goto L_0x1eca
            java.lang.String r0 = "关闭"
            goto L_0x1ed4
        L_0x1eca:
            r4 = -1
            if (r0 != r4) goto L_0x1ed1
            java.lang.String r0 = "默认"
            goto L_0x1ed4
        L_0x1ed1:
            java.lang.String r0 = "开启"
        L_0x1ed4:
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r3 = 1
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r2, (java.lang.CharSequence) r0, (int) r3)
            r0.show()
            r1.commit()
            return r3
        L_0x1ee7:
            java.lang.String r0 = "//gamecp "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1f50
            java.lang.String r0 = "//gamecp "
            java.lang.String r0 = r1.replace(r0, r14)
            java.lang.String r0 = r0.trim()
            android.content.SharedPreferences r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getToolsProcesstPreference()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            java.lang.String r2 = "appbrandgame_cmd_pool_type"
            r1.putInt(r2, r0)
            java.lang.String r2 = "readwritequeue"
            java.lang.String r3 = "swapqueue"
            java.lang.String r4 = "cmdqueue"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4}
            r3 = -1
            if (r0 >= r3) goto L_0x1f1b
            r3 = 1
            goto L_0x1f1c
        L_0x1f1b:
            r3 = 0
        L_0x1f1c:
            r4 = 2
            if (r0 <= r4) goto L_0x1f21
            r10 = 1
            goto L_0x1f22
        L_0x1f21:
            r10 = 0
        L_0x1f22:
            r3 = r3 | r10
            if (r3 == 0) goto L_0x1f26
            r0 = -1
        L_0x1f26:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "小游戏 cmd pool "
            r4.append(r5)
            r5 = -1
            if (r0 != r5) goto L_0x1f3b
            java.lang.String r0 = "default"
            goto L_0x1f3d
        L_0x1f3b:
            r0 = r2[r0]
        L_0x1f3d:
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2 = 1
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r3, (java.lang.CharSequence) r0, (int) r2)
            r0.show()
            r1.commit()
            return r2
        L_0x1f50:
            java.lang.String r0 = "//wasmopt "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1fab
            java.lang.String r0 = "//wasmopt "
            java.lang.String r0 = r1.replace(r0, r14)
            java.lang.String r0 = r0.trim()
            android.content.SharedPreferences r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getToolsProcesstPreference()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            java.lang.String r2 = "appbrand_wasm_opt"
            r1.putInt(r2, r0)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Wasm优化 "
            r3.append(r4)
            if (r0 != 0) goto L_0x1f87
            java.lang.String r0 = "关闭"
            goto L_0x1f98
        L_0x1f87:
            r4 = -1
            if (r0 != r4) goto L_0x1f8e
            java.lang.String r0 = "默认开启"
            goto L_0x1f98
        L_0x1f8e:
            r4 = -2
            if (r0 != r4) goto L_0x1f95
            java.lang.String r0 = "默认关闭"
            goto L_0x1f98
        L_0x1f95:
            java.lang.String r0 = "开启"
        L_0x1f98:
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r3 = 1
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r2, (java.lang.CharSequence) r0, (int) r3)
            r0.show()
            r1.commit()
            return r3
        L_0x1fab:
            java.lang.String r0 = "//snskvtest "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1fd2
            java.lang.String r0 = "//snskvtest"
            java.lang.String r0 = r1.replace(r0, r14)
            java.lang.String r0 = r0.trim()
            boolean r1 = r0.equals(r4)
            if (r1 == 0) goto L_0x1fc8
            r1 = 0
            sf0.C90188n0.f258915I = r1
            r1 = 1
            goto L_0x1fd1
        L_0x1fc8:
            boolean r0 = r0.equals(r15)
            r1 = 1
            if (r0 == 0) goto L_0x1fd1
            sf0.C90188n0.f258915I = r1
        L_0x1fd1:
            return r1
        L_0x1fd2:
            java.lang.String r0 = "//emoji "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x1ff3
            java.lang.String r0 = "//emoji "
            java.lang.String r0 = r1.replace(r0, r14)
            java.lang.Class<z51.g> r1 = z51.C39315g.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            z51.g r1 = (z51.C39315g) r1
            zc3.a r1 = r1.mo58035cm()
            i61.h r1 = (i61.C98602h) r1
            r1.mo138039x(r0)
            r1 = 1
            return r1
        L_0x1ff3:
            java.lang.String r0 = "//share "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x201d
            java.lang.String r0 = "//share "
            java.lang.String r0 = r1.replace(r0, r14)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r0.intValue()
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            r2 = 229635(0x38103, float:3.21787E-40)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.mo119676J(r2, r0)
            r1 = 1
            return r1
        L_0x201d:
            java.lang.String r0 = "//dumpappinfoblob "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2060
            java.lang.String r0 = "//dumpappinfoblob "
            java.lang.String r0 = r1.replace(r0, r14)
            com.tencent.mm.pluginsdk.model.app.p r1 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.yx0()
            com.tencent.mm.pluginsdk.model.app.j r0 = r1.mo69371Lo(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.mo73944m2()
            r1.append(r2)
            java.lang.String r2 = "\n"
            r1.append(r2)
            java.lang.String r2 = r0.mo73943l2()
            r1.append(r2)
            java.lang.String r2 = "\n"
            r1.append(r2)
            java.lang.String r0 = r0.mo73945n2()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            nj3.C76879j.m92748s(r9, r0, r14)
            r1 = 1
            return r1
        L_0x2060:
            java.lang.String r0 = "//googleauth "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x20b3
            java.lang.String r0 = "//googleauth "
            java.lang.String r0 = r1.replace(r0, r14)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x20b1
            boolean r1 = r10.equals(r0)
            if (r1 == 0) goto L_0x2092
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            r1 = 0
            android.content.SharedPreferences r0 = r9.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "googleauth"
            r2 = 1
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r2)
            r0.commit()
            goto L_0x20b1
        L_0x2092:
            r1 = 0
            java.lang.String r2 = "local"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x20b1
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreferencePath()
            android.content.SharedPreferences r0 = r9.getSharedPreferences(r0, r1)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "googleauth"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r1)
            r0.commit()
        L_0x20b1:
            r2 = 1
            return r2
        L_0x20b3:
            r2 = 1
            java.lang.String r0 = "//clrgamecache"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x20c6
            sw1.m r0 = sw1.C48477m.C13789a.m13091a()
            if (r0 == 0) goto L_0x20c5
            r0.Hb0(r9)
        L_0x20c5:
            return r2
        L_0x20c6:
            java.lang.String r0 = "//clearwepkg"
            boolean r0 = r1.startsWith(r0)
            r2 = 6
            if (r0 == 0) goto L_0x20f9
            com.tencent.mm.autogen.events.WepkgNotifyEvent r0 = new com.tencent.mm.autogen.events.WepkgNotifyEvent
            r0.<init>()
            com.tencent.mm.autogen.events.WepkgNotifyEvent$a r3 = r0.f107837d
            r3.f107838a = r2
            java.lang.String r2 = "//clearwepkg "
            java.lang.String r1 = r1.replace(r2, r14)
            java.lang.String r1 = r1.trim()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x20f4
            java.lang.String r2 = "//clearwepkg"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x20f4
            com.tencent.mm.autogen.events.WepkgNotifyEvent$a r2 = r0.f107837d
            r2.f107839b = r1
        L_0x20f4:
            r0.publish()
            r3 = 1
            return r3
        L_0x20f9:
            r3 = 1
            java.lang.String r0 = "//disableWePkg"
            boolean r0 = r1.startsWith(r0)
            r5 = 7
            if (r0 == 0) goto L_0x2110
            com.tencent.mm.autogen.events.WepkgNotifyEvent r0 = new com.tencent.mm.autogen.events.WepkgNotifyEvent
            r0.<init>()
            com.tencent.mm.autogen.events.WepkgNotifyEvent$a r1 = r0.f107837d
            r1.f107838a = r5
            r0.publish()
            return r3
        L_0x2110:
            java.lang.String r0 = "//gameBgMix "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2130
            java.lang.String r0 = "//gameBgMix "
            java.lang.String r0 = r1.replace(r0, r14)
            java.lang.String r0 = r0.trim()
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GAME_VIDEO_IS_BG_MIX_STRING
            r1.mo119677K(r2, r0)
            return r3
        L_0x2130:
            java.lang.String r0 = "//deleteChatRoomDB"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2162
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            f40.o r1 = f40.C86709a0.m107535s()
            java.lang.String r1 = r1.mo121141h()
            r0.append(r1)
            java.lang.String r1 = "GameChatRoom.db"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            com.tencent.mm.autogen.events.GameCommOperationEvent r0 = new com.tencent.mm.autogen.events.GameCommOperationEvent
            r0.<init>()
            com.tencent.mm.autogen.events.GameCommOperationEvent$a r1 = r0.f9268d
            r1.f9270a = r2
            r0.publish()
            r1 = 1
            return r1
        L_0x2162:
            java.lang.String r0 = "//updateGameConfig"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2181
            com.tencent.mm.autogen.events.GameCommOperationEvent r0 = new com.tencent.mm.autogen.events.GameCommOperationEvent
            r0.<init>()
            com.tencent.mm.autogen.events.GameCommOperationEvent$a r1 = r0.f9268d
            r2 = 5
            r1.f9270a = r2
            r2 = 8
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.f9271b = r2
            r0.publish()
            r1 = 1
            return r1
        L_0x2181:
            java.lang.String r0 = "//resetGameMsgExposure"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x21a9
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GAME_HIDE_ENTRANCE_RED_DOT_TIME_LONG
            java.lang.Long r2 = java.lang.Long.valueOf(r20)
            r0.mo119677K(r1, r2)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SHAKE_CARD_TAB_RED_DOT_DESC_STRING_SYNC
            r0.mo119677K(r1, r14)
            r3 = 1
            return r3
        L_0x21a9:
            r3 = 1
            java.lang.String r0 = "//forceFirstEnterRoom"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x21b5
            sf0.C90188n0.f258928V = r3
            return r3
        L_0x21b5:
            java.lang.String r0 = "//clrgsd"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x21e8
            com.tencent.mm.autogen.events.GameSilentDownloadNotifyEvent r0 = new com.tencent.mm.autogen.events.GameSilentDownloadNotifyEvent
            r0.<init>()
            com.tencent.mm.autogen.events.GameSilentDownloadNotifyEvent$a r2 = r0.f107567d
            r3 = 3
            r2.f107568a = r3
            java.lang.String r2 = "//clrgsd "
            java.lang.String r1 = r1.replace(r2, r14)
            java.lang.String r1 = r1.trim()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x21e3
            java.lang.String r2 = "//clrgsd"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x21e3
            com.tencent.mm.autogen.events.GameSilentDownloadNotifyEvent$a r2 = r0.f107567d
            r2.f107569b = r1
        L_0x21e3:
            r0.publish()
            r1 = 1
            return r1
        L_0x21e8:
            java.lang.String r0 = "//delDownload"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x221b
            com.tencent.mm.autogen.events.GameSilentDownloadNotifyEvent r0 = new com.tencent.mm.autogen.events.GameSilentDownloadNotifyEvent
            r0.<init>()
            com.tencent.mm.autogen.events.GameSilentDownloadNotifyEvent$a r2 = r0.f107567d
            r3 = 4
            r2.f107568a = r3
            java.lang.String r2 = "//delDownload "
            java.lang.String r1 = r1.replace(r2, r14)
            java.lang.String r1 = r1.trim()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x2219
            java.lang.String r2 = "//delDownload"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x2219
            com.tencent.mm.autogen.events.GameSilentDownloadNotifyEvent$a r2 = r0.f107567d
            r2.f107569b = r1
            r0.publish()
        L_0x2219:
            r3 = 1
            return r3
        L_0x221b:
            r3 = 1
            java.lang.String r0 = "//googlemap"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2227
            boolean r0 = sf0.C90188n0.f258933a
            return r3
        L_0x2227:
            java.lang.String r0 = "//sosomap"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2232
            boolean r0 = sf0.C90188n0.f258933a
            return r3
        L_0x2232:
            java.lang.String r0 = "//updateConversation"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2287
            java.lang.String r0 = "update all conversation start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r0 = r0.mo105908w()
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
            r1 = 0
            java.util.List r0 = r0.mo69735F(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x2255:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x227f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            eb0.c r2 = eb0.C97625j3.m125812b()
            g62.l r2 = r2.mo105911z()
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            java.lang.String r3 = " and not ( type = 10000 and isSend != 2 ) "
            com.tencent.mm.storage.f4 r1 = r2.Fx0(r1, r3)
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r2 = r2.mo105908w()
            com.tencent.mm.storage.i2 r2 = (com.tencent.p014mm.storage.C44660i2) r2
            r2.mo69777o0(r1)
            goto L_0x2255
        L_0x227f:
            java.lang.String r0 = "update all conversation end"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            r3 = 1
            return r3
        L_0x2287:
            r3 = 1
            java.lang.String r0 = "//setshakecarddata"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2298
            wc3.b0 r0 = wc3.C78535a0.m94863b()
            r0.setShakeCardEntranceData()
            return r3
        L_0x2298:
            java.lang.String r0 = "//clearshakecarddata"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x22a8
            wc3.b0 r0 = wc3.C78535a0.m94863b()
            r0.clearShakeCardEntranceData()
            return r3
        L_0x22a8:
            java.lang.String r0 = "//pageSize"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x22db
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "pageSize is "
            r1.append(r2)
            eb0.c r2 = eb0.C97625j3.m125812b()
            zh3.f r2 = r2.mo105909x()
            long r2 = r2.mo125619i()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r2)
            r0.show()
            return r2
        L_0x22db:
            java.lang.String r0 = "//resetDBStatus"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2372
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            eb0.c r1 = eb0.C97625j3.m125812b()
            java.lang.String r1 = r1.mo105900o()
            r0.<init>((java.lang.String) r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x2357 }
            r1.<init>()     // Catch:{ Exception -> 0x2357 }
            eb0.c r2 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x2357 }
            java.lang.String r2 = r2.mo105901p()     // Catch:{ Exception -> 0x2357 }
            r1.append(r2)     // Catch:{ Exception -> 0x2357 }
            java.lang.String r2 = r0.getName()     // Catch:{ Exception -> 0x2357 }
            java.lang.String r3 = ".db"
            java.lang.String r4 = ".db.backup"
            java.lang.String r2 = r2.replace(r3, r4)     // Catch:{ Exception -> 0x2357 }
            r1.append(r2)     // Catch:{ Exception -> 0x2357 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x2357 }
            java.lang.String r2 = r0.mo119976n()     // Catch:{ Exception -> 0x2357 }
            com.tencent.p014mm.vfs.C86013q1.m106442c(r1, r2)     // Catch:{ Exception -> 0x2357 }
            java.lang.String r2 = "backupPath db path is %s"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x2357 }
            r3 = 0
            r4[r3] = r1     // Catch:{ Exception -> 0x2357 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r4)     // Catch:{ Exception -> 0x2357 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x2357 }
            r1.<init>()     // Catch:{ Exception -> 0x2357 }
            java.lang.String r2 = r0.mo119971i()     // Catch:{ Exception -> 0x2357 }
            r1.append(r2)     // Catch:{ Exception -> 0x2357 }
            java.lang.String r2 = "err"
            r1.append(r2)     // Catch:{ Exception -> 0x2357 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x2357 }
            r1.append(r2)     // Catch:{ Exception -> 0x2357 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x2357 }
            java.lang.String r0 = r0.mo119976n()     // Catch:{ Exception -> 0x2357 }
            com.tencent.p014mm.vfs.C86013q1.m106463x(r0, r1)     // Catch:{ Exception -> 0x2357 }
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x2357 }
            java.lang.String r1 = "db状态已重置,请重启微信"
            r2 = 1
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r2)     // Catch:{ Exception -> 0x2357 }
            r0.show()     // Catch:{ Exception -> 0x2357 }
            goto L_0x2370
        L_0x2357:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "delete failed: "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
        L_0x2370:
            r3 = 1
            return r3
        L_0x2372:
            r3 = 1
            java.lang.String r0 = "//setsnsupload "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2389
            java.lang.String r0 = "//setsnsupload "
            java.lang.String r0 = r1.replace(r0, r14)
            r1 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
            sf0.C90188n0.f258909C = r0
            return r3
        L_0x2389:
            java.lang.String r0 = "//logsnstable"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x239a
            com.tencent.mm.autogen.events.DumpSnsTableInfoEvent r0 = new com.tencent.mm.autogen.events.DumpSnsTableInfoEvent
            r0.<init>()
            r0.publish()
            return r3
        L_0x239a:
            java.lang.String r0 = "//resetsnstip"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x23b3
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r1 = 327776(0x50060, float:4.59312E-40)
            r8 = r19
            r0.mo119676J(r1, r8)
            return r3
        L_0x23b3:
            r8 = r19
            java.lang.String r0 = "//checkcount"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x23ff
            eb0.c r0 = eb0.C97625j3.m125812b()
            g62.l r0 = r0.mo105911z()
            java.lang.String r1 = com.tencent.p014mm.p136ui.chatting.ChattingUIFragment.f215287Q
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            int r0 = r0.Yx0(r1)
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            java.lang.String r2 = com.tencent.p014mm.p136ui.chatting.ChattingUIFragment.f215287Q
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            int r1 = r1.Vx0(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "current count :"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " countAuto :"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r1 = 1
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r9, (java.lang.CharSequence) r0, (int) r1)
            r0.show()
            return r1
        L_0x23ff:
            java.lang.String r0 = "//changeframe "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2430
            java.lang.String r0 = "//changeframe "
            java.lang.String r0 = r1.replace(r0, r14)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = "preferences_animation"
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r0 = r0.floatValue()
            java.lang.String r2 = "frameInterval"
            android.content.SharedPreferences$Editor r0 = r1.putFloat(r2, r0)
            r0.commit()
            r1 = 1
            return r1
        L_0x2430:
            java.lang.String r0 = "//dumpmemory"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2459
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r0.gc()
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            r0.gc()
            java.lang.Class<xv.u> r0 = p757xv.C91353u.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            xv.u r0 = (p757xv.C91353u) r0
            xv.r r0 = r0.mo112623CU()
            com.tencent.mm.plugin.performance.watchdogs.MemoryWatchDog r0 = (com.tencent.p014mm.plugin.performance.watchdogs.MemoryWatchDog) r0
            r0.mo118581g()
            r3 = 1
            return r3
        L_0x2459:
            r3 = 1
            java.lang.String r0 = "//dumpsnsfile"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x246b
            com.tencent.mm.autogen.events.SnsFileCollectEvent r0 = new com.tencent.mm.autogen.events.SnsFileCollectEvent
            r0.<init>()
            r0.publish()
            return r3
        L_0x246b:
            java.lang.String r0 = "//testverifypsw "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x24a6
            java.lang.String r0 = "//testverifypsw "
            java.lang.String r0 = r1.replace(r0, r14)
            java.lang.String r0 = r0.trim()
            boolean r2 = r0.equals(r4)
            if (r2 == 0) goto L_0x2488
            r2 = 0
            sf0.C90188n0.f258917K = r2
            r3 = 1
            goto L_0x2492
        L_0x2488:
            r2 = 0
            boolean r0 = r0.equals(r15)
            r3 = 1
            if (r0 == 0) goto L_0x2492
            sf0.C90188n0.f258917K = r3
        L_0x2492:
            r4 = 2
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r2] = r1
            boolean r1 = sf0.C90188n0.f258917K
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0[r3] = r1
            java.lang.String r1 = "summerdktext testverifypsw msg[%s], testVerifyPsw[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r1, r0)
            return r3
        L_0x24a6:
            java.lang.String r0 = "//netid"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x24c8
            java.lang.String r0 = "zyzhang"
            java.lang.String r1 = "do get net id"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.mo121127b()
            de0.a r1 = new de0.a
            r1.<init>()
            r0.mo123460f(r1)
            r3 = 1
            return r3
        L_0x24c8:
            r3 = 1
            java.lang.String r0 = "//flushreport"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x24dd
            java.lang.String r0 = "zyzhang"
            java.lang.String r1 = "do flush report"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            com.tencent.mars.smc.SmcLogic.flushAllReportData()
            return r3
        L_0x24dd:
            java.lang.String r0 = "//pickpoi"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x24fc
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r1 = 8
            java.lang.String r2 = "map_view_type"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "location"
            java.lang.String r2 = ".ui.RedirectUI"
            ke3.C88144b.m109790h(r9, r1, r2, r0)
            r1 = 1
            return r1
        L_0x24fc:
            java.lang.String r0 = "//configlist"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x25f4
            java.lang.String r0 = "^//configlist set ([\\S]*)=([\\S]*)$"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L_0x2541
            java.lang.String r0 = "^//configlist set ([\\S]*)=([\\S]*)$"
            java.util.List r0 = sf0.C77702q0.m93720c(r1, r0)
            if (r0 == 0) goto L_0x253e
            int r1 = r0.size()
            r2 = 2
            if (r1 != r2) goto L_0x253e
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 1
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            k40.a r2 = f40.C86709a0.m107533q(r23)
            lc3.b r2 = (lc3.C10485b) r2
            pj.f r2 = r2.vh0()
            r2.mo107408f(r1, r0)
            com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent r0 = new com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent
            r0.<init>()
            r0.publish()
        L_0x253e:
            r1 = 1
            goto L_0x25f3
        L_0x2541:
            java.lang.String r0 = "^//configlist get ([\\S]*)$"
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L_0x258a
            java.lang.String r0 = "^//configlist get ([\\S]*)$"
            java.util.List r0 = sf0.C77702q0.m93720c(r1, r0)
            if (r0 == 0) goto L_0x253e
            int r1 = r0.size()
            r2 = 1
            if (r1 != r2) goto L_0x253e
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            k40.a r1 = f40.C86709a0.m107533q(r23)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r1 = r1.mo107405c(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r1 = 0
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r9, (java.lang.CharSequence) r0, (int) r1)
            r0.show()
            goto L_0x253e
        L_0x258a:
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r1 = 278530(0x44002, float:3.90304E-40)
            java.lang.Object r0 = r0.mo119684e(r1, r14)
            java.lang.String r0 = (java.lang.String) r0
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            r2 = 278529(0x44001, float:3.90302E-40)
            java.lang.Object r1 = r1.mo119684e(r2, r14)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = a70.C112760b.m154195C()
            r2.append(r3)
            java.lang.String r3 = "dynacfg.xml"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            byte[] r0 = r0.getBytes()
            com.tencent.p014mm.sdk.platformtools.Util.writeToFile(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "output dynacfg xml to "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1 = 0
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r9, (java.lang.CharSequence) r0, (int) r1)
            r0.show()
            goto L_0x253e
        L_0x25f3:
            return r1
        L_0x25f4:
            java.lang.String r0 = "//security"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2612
            java.lang.String r0 = "//security "
            java.lang.String r0 = r1.replace(r0, r14)     // Catch:{ Exception -> 0x2610 }
            eb0.c r1 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x2610 }
            gb0.d r1 = r1.mo105905t()     // Catch:{ Exception -> 0x2610 }
            r2 = 0
            r3 = 1
            r1.mo106161g(r0, r3, r2)     // Catch:{ Exception -> 0x2611 }
            goto L_0x2611
        L_0x2610:
            r3 = 1
        L_0x2611:
            return r3
        L_0x2612:
            java.lang.String r0 = "//updatepackage"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2637
            java.lang.String r0 = "//updatepackage "
            java.lang.String r0 = r1.replace(r0, r14)     // Catch:{ Exception -> 0x2635 }
            uc0.u r1 = new uc0.u     // Catch:{ Exception -> 0x2635 }
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x2635 }
            r2 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)     // Catch:{ Exception -> 0x2635 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x2635 }
            ob0.b0 r0 = eb0.C97625j3.m125815e()     // Catch:{ Exception -> 0x2635 }
            r0.mo123460f(r1)     // Catch:{ Exception -> 0x2635 }
        L_0x2635:
            r3 = 1
            return r3
        L_0x2637:
            r3 = 1
            java.lang.String r0 = "//copypackage"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2693
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "summercmd copypackage msg:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            java.util.ArrayList r0 = com.tencent.p014mm.sdk.platformtools.SdcardUtil.getWritableStatMountParseForStorage()
            int r1 = r0.size()
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r4[r2] = r5
            java.lang.String r2 = "summercmd copypackage size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r4)
            r2 = 2
            if (r1 >= r2) goto L_0x266f
            r0 = 2131824482(0x7f110f62, float:1.9281793E38)
            java.lang.String r0 = r9.getString(r0)
            nj3.C76879j.m92727U(r9, r0, r3)
            goto L_0x2692
        L_0x266f:
            r2 = 2131824484(0x7f110f64, float:1.9281797E38)
            java.lang.String r2 = r9.getString(r2)
            r3 = 2131821617(0x7f110431, float:1.9275982E38)
            java.lang.String r4 = r9.getString(r3)
            r3 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r5 = r9.getString(r3)
            com.tencent.mm.console.a$c r6 = new com.tencent.mm.console.a$c
            r6.<init>(r1, r0, r9)
            r7 = 0
            java.lang.String r3 = ""
            r1 = r26
            nj3.C76879j.m92707A(r1, r2, r3, r4, r5, r6, r7)
            r3 = 1
        L_0x2692:
            return r3
        L_0x2693:
            java.lang.String r0 = "//copy -n "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x26f2
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r2 = 0
            r0[r2] = r1
            java.lang.String r4 = "summercmd copy -n msg:%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r0)
            java.util.ArrayList r0 = com.tencent.p014mm.sdk.platformtools.SdcardUtil.getWritableStatMountParseForStorage()
            int r4 = r0.size()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r5[r2] = r7
            java.lang.String r2 = "summercmd copy -n size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r5)
            r2 = 2
            if (r4 >= r2) goto L_0x26ca
            r0 = 2131824482(0x7f110f62, float:1.9281793E38)
            java.lang.String r0 = r9.getString(r0)
            nj3.C76879j.m92727U(r9, r0, r3)
            goto L_0x26f0
        L_0x26ca:
            r2 = 2131824484(0x7f110f64, float:1.9281797E38)
            java.lang.String r2 = r9.getString(r2)
            r3 = 2131821617(0x7f110431, float:1.9275982E38)
            java.lang.String r5 = r9.getString(r3)
            r3 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r6 = r9.getString(r3)
            com.tencent.mm.console.a$d r7 = new com.tencent.mm.console.a$d
            r7.<init>(r1, r4, r0, r9)
            r0 = 0
            java.lang.String r3 = ""
            r1 = r26
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r0
            nj3.C76879j.m92707A(r1, r2, r3, r4, r5, r6, r7)
        L_0x26f0:
            r1 = 1
            return r1
        L_0x26f2:
            java.lang.String r0 = "//deletepackage"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2713
            java.lang.String r0 = "//deletepackage "
            java.lang.String r0 = r1.replace(r0, r14)     // Catch:{ Exception -> 0x2711 }
            com.tencent.mm.autogen.events.DeletePackageEvent r1 = new com.tencent.mm.autogen.events.DeletePackageEvent     // Catch:{ Exception -> 0x2711 }
            r1.<init>()     // Catch:{ Exception -> 0x2711 }
            com.tencent.mm.autogen.events.DeletePackageEvent$a r2 = r1.f264672d     // Catch:{ Exception -> 0x2711 }
            r3 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r3)     // Catch:{ Exception -> 0x2711 }
            r2.f264673a = r0     // Catch:{ Exception -> 0x2711 }
            r1.publish()     // Catch:{ Exception -> 0x2711 }
        L_0x2711:
            r3 = 1
            return r3
        L_0x2713:
            r3 = 1
            java.lang.String r0 = "//audiowritetofile"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2721
            gj.c r0 = p156gj.C107835h0.f322846c
            r0.f322696J = r3
            return r3
        L_0x2721:
            java.lang.String r0 = "//bankcard"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x275a
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "BaseScanUI_select_scan_mode"
            r0.putExtra(r1, r5)
            java.lang.String r1 = "bank_card_owner"
            java.lang.String r2 = "test"
            r0.putExtra(r1, r2)
            boolean r1 = p182kk.C61104a.m71651g(r26)
            if (r1 != 0) goto L_0x2758
            boolean r1 = p182kk.C61104a.m71665u(r26)
            if (r1 != 0) goto L_0x2758
            boolean r1 = p182kk.C61104a.m71646b(r26)
            if (r1 != 0) goto L_0x2758
            r1 = r9
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r2 = "scanner"
            java.lang.String r3 = ".ui.ScanCardUI"
            ke3.C88144b.m109790h(r1, r2, r3, r0)
        L_0x2758:
            r1 = 1
            return r1
        L_0x275a:
            java.lang.String r0 = "//banner"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2796
            java.lang.String r0 = "<sysmsg type=\"banner\"><mainframebanner type=\"11\"><showtype>1</showtype></mainframebanner></sysmsg>"
            java.lang.String r3 = "sysmsg"
            r10 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r3, r10)
            java.lang.String r3 = ".sysmsg.mainframebanner.$type"
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r10 = ".sysmsg.mainframebanner.showtype"
            java.lang.Object r10 = r0.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = ".sysmsg.mainframebanner.data"
            java.lang.Object r0 = r0.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            r11 = 3
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r11 = 0
            r12[r11] = r3
            r3 = 1
            r12[r3] = r10
            r3 = 2
            r12[r3] = r0
            java.lang.String r0 = "type:%s showType:%s data:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r0, r12)
        L_0x2796:
            java.lang.String r0 = "//gamemsg"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x27ac
            com.tencent.mm.autogen.events.QueryGameMessageEvent r0 = new com.tencent.mm.autogen.events.QueryGameMessageEvent
            r0.<init>()
            com.tencent.mm.autogen.events.QueryGameMessageEvent$a r2 = r0.f107710d
            r2.f107721k = r1
            r0.publish()
            r3 = 1
            return r3
        L_0x27ac:
            r3 = 1
            java.lang.String r0 = "//shortcut#"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x27c2
            com.tencent.mm.autogen.events.WebViewShortcutCommandEvent r0 = new com.tencent.mm.autogen.events.WebViewShortcutCommandEvent
            r0.<init>()
            com.tencent.mm.autogen.events.WebViewShortcutCommandEvent$a r2 = r0.f79066d
            r2.f79067a = r1
            r0.publish()
            return r3
        L_0x27c2:
            java.lang.String r0 = "//gallerytype"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x27d0
            boolean r0 = com.tencent.p014mm.p136ui.chatting.C73852u1.f216731v
            r0 = r0 ^ r3
            com.tencent.p014mm.p136ui.chatting.C73852u1.f216731v = r0
            return r3
        L_0x27d0:
            r0 = 2131838749(0x7f11471d, float:1.931073E38)
            r9.getString(r0)
            java.lang.String r0 = "//fullexit"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x27f8
            java.lang.String r0 = "show_whatsnew"
            com.tencent.p014mm.sdk.platformtools.MMEntryLock.unlock(r0)
            f40.C75681p0.m90934a(r9, r3)
            com.tencent.p014mm.p136ui.MMAppMgr.m85984d(r26)
            eb0.C97625j3.m125821k()
            f40.a0 r0 = f40.C86709a0.m107528h()
            r0.mo121099j(r14)
            com.tencent.p014mm.p136ui.MMAppMgr.m85987g()
            return r3
        L_0x27f8:
            java.lang.String r0 = "//cleardldb"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2812
            java.lang.Class<com.tencent.mm.plugin.downloader.api.c> r0 = com.tencent.p014mm.plugin.downloader.api.C29841c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.downloader.api.c r0 = (com.tencent.p014mm.plugin.downloader.api.C29841c) r0
            sp.u r0 = r0.mo56945gI()
            z41.b r0 = (z41.C53737b) r0
            r0.mo74327jo()
            return r3
        L_0x2812:
            java.lang.String r0 = "//setcardlayouttestdata"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x282e
            java.lang.String r0 = "//setcardlayouttestdata "
            java.lang.String r0 = r1.replace(r0, r14)
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARDLAYOUT_TESTDATA_STRING
            r1.mo119677K(r2, r0)
            return r3
        L_0x282e:
            java.lang.String r0 = "//delchatroomsysmsg"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2878
            java.lang.String r0 = "//delchatroomsysmsg "
            java.lang.String r0 = r1.replace(r0, r14)
            int r1 = r0.indexOf(r7)
            r2 = 0
            java.lang.String r3 = r0.substring(r2, r1)
            java.lang.String r0 = r0.substring(r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r1 == 0) goto L_0x2850
            return r2
        L_0x2850:
            java.lang.String r1 = "<"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x2877
            com.tencent.mm.storage.f4 r1 = new com.tencent.mm.storage.f4
            r1.<init>()
            long r4 = java.lang.System.currentTimeMillis()
            r1.mo108733M2(r4)
            r4 = 10002(0x2712, float:1.4016E-41)
            r1.setType(r4)
            r1.mo108732L2(r0)
            r1.mo108740T2(r2)
            r1.mo108749c3(r3)
            eb0.C75604z3.m90852x(r1)
            r3 = 1
            return r3
        L_0x2877:
            return r2
        L_0x2878:
            r3 = 1
            java.lang.String r0 = "//resetcrseq"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2990
            java.lang.String[] r0 = r1.split(r7)
            r10 = r0[r3]     // Catch:{ Exception -> 0x297f }
            r11 = -1
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r10, r11)     // Catch:{ Exception -> 0x297f }
            r10 = 2
            r13 = r0[r10]     // Catch:{ Exception -> 0x297f }
            r10 = r6
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r13, r11)     // Catch:{ Exception -> 0x297c }
            r13 = 3
            r11 = r0[r13]     // Catch:{ Exception -> 0x297c }
            r25 = r7
            r24 = r8
            r12 = -1
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r11, r12)     // Catch:{ Exception -> 0x2979 }
            r11 = 4
            r0 = r0[r11]     // Catch:{ Exception -> 0x2979 }
            r11 = -1
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r11)     // Catch:{ Exception -> 0x2979 }
            r11 = r20
            int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x2995
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x2979 }
            r13.<init>()     // Catch:{ Exception -> 0x2979 }
            r13.append(r2)     // Catch:{ Exception -> 0x2979 }
            java.lang.String r2 = "@chatroom"
            r13.append(r2)     // Catch:{ Exception -> 0x2979 }
            java.lang.String r2 = r13.toString()     // Catch:{ Exception -> 0x2979 }
            eb0.c r3 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x2979 }
            com.tencent.mm.storage.v3 r3 = r3.mo105908w()     // Catch:{ Exception -> 0x2979 }
            com.tencent.mm.storage.i2 r3 = (com.tencent.p014mm.storage.C44660i2) r3     // Catch:{ Exception -> 0x2979 }
            com.tencent.mm.storage.h2 r2 = r3.mo69771j(r2)     // Catch:{ Exception -> 0x2979 }
            if (r2 == 0) goto L_0x2995
            java.lang.String r3 = "summerbadcr resetcrseq [%s] before [%d, %d, %d] [%d, %d, %d]"
            r13 = 7
            java.lang.Object[] r11 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x2979 }
            java.lang.String r12 = r2.getUsername()     // Catch:{ Exception -> 0x2979 }
            r13 = 0
            r11[r13] = r12     // Catch:{ Exception -> 0x2979 }
            long r12 = r2.mo108827t2()     // Catch:{ Exception -> 0x2979 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x2979 }
            r13 = 1
            r11[r13] = r12     // Catch:{ Exception -> 0x2979 }
            long r12 = r2.mo108833z2()     // Catch:{ Exception -> 0x2979 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x2979 }
            r13 = 2
            r11[r13] = r12     // Catch:{ Exception -> 0x2979 }
            int r12 = r2.mo108785F2()     // Catch:{ Exception -> 0x2979 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ Exception -> 0x2979 }
            r13 = 3
            r11[r13] = r12     // Catch:{ Exception -> 0x2979 }
            java.lang.Long r12 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x2979 }
            r13 = 4
            r11[r13] = r12     // Catch:{ Exception -> 0x2979 }
            java.lang.Long r12 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x2979 }
            r13 = 5
            r11[r13] = r12     // Catch:{ Exception -> 0x2979 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x2979 }
            r13 = 6
            r11[r13] = r12     // Catch:{ Exception -> 0x2979 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r11)     // Catch:{ Exception -> 0x2979 }
            r11 = -1
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x2920
            r2.mo108798S2(r5)     // Catch:{ Exception -> 0x2979 }
        L_0x2920:
            int r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x2927
            r2.mo108804Z2(r7)     // Catch:{ Exception -> 0x2979 }
        L_0x2927:
            r3 = -1
            if (r0 <= r3) goto L_0x292d
            r2.mo108811f3(r0)     // Catch:{ Exception -> 0x2979 }
        L_0x292d:
            eb0.c r0 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x2979 }
            com.tencent.mm.storage.v3 r0 = r0.mo105908w()     // Catch:{ Exception -> 0x2979 }
            java.lang.String r3 = r2.getUsername()     // Catch:{ Exception -> 0x2979 }
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0     // Catch:{ Exception -> 0x2979 }
            r5 = 0
            int r0 = r0.mo69774l0(r2, r3, r5)     // Catch:{ Exception -> 0x2979 }
            java.lang.String r3 = "summerbadcr resetcrseq [%s] done [%d, %d, %d] ret:%d"
            r6 = 5
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x2979 }
            java.lang.String r6 = r2.getUsername()     // Catch:{ Exception -> 0x2979 }
            r7[r5] = r6     // Catch:{ Exception -> 0x2979 }
            long r5 = r2.mo108827t2()     // Catch:{ Exception -> 0x2979 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x2979 }
            r6 = 1
            r7[r6] = r5     // Catch:{ Exception -> 0x2979 }
            long r5 = r2.mo108833z2()     // Catch:{ Exception -> 0x2979 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x2979 }
            r6 = 2
            r7[r6] = r5     // Catch:{ Exception -> 0x2979 }
            int r2 = r2.mo108785F2()     // Catch:{ Exception -> 0x2979 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x2979 }
            r5 = 3
            r7[r5] = r2     // Catch:{ Exception -> 0x2979 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x2979 }
            r2 = 4
            r7[r2] = r0     // Catch:{ Exception -> 0x2979 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r7)     // Catch:{ Exception -> 0x2979 }
            r1 = 1
            return r1
        L_0x2979:
            r0 = move-exception
            goto L_0x2985
        L_0x297c:
            r0 = move-exception
            goto L_0x2981
        L_0x297f:
            r0 = move-exception
            r10 = r6
        L_0x2981:
            r25 = r7
            r24 = r8
        L_0x2985:
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r2 = "summerbadcr resetcrseq"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r2, r3)
            goto L_0x2995
        L_0x2990:
            r10 = r6
            r25 = r7
            r24 = r8
        L_0x2995:
            java.lang.String r0 = "//printchatroominfo"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x29d2
            java.lang.String r0 = com.tencent.p014mm.p136ui.chatting.ChattingUIFragment.f215287Q
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85820U5(r0)
            if (r2 != 0) goto L_0x29a7
            r2 = 0
            return r2
        L_0x29a7:
            r2 = 0
            eb0.c r3 = eb0.C97625j3.m125812b()
            eb0.m2 r3 = r3.mo105902q()
            com.tencent.mm.storage.n1 r3 = (com.tencent.p014mm.storage.C44662n1) r3
            com.tencent.mm.storage.m1 r3 = r3.mo69799Lo(r0)
            if (r3 != 0) goto L_0x29c4
            r4 = 1
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r2] = r0
            java.lang.String r0 = "summercrinfo chatroomId[%s], member is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r1)
            return r2
        L_0x29c4:
            r4 = 1
            zt3.t r2 = zt3.C119157j.f356862d
            com.tencent.mm.console.a$e r5 = new com.tencent.mm.console.a$e
            r5.<init>(r3, r0, r1)
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183875f(r5)
            return r4
        L_0x29d2:
            java.lang.String r0 = "//clean chatroomblock"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2a8c
            java.lang.String r0 = com.tencent.p014mm.p136ui.chatting.ChattingUIFragment.f215287Q
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            g62.e r2 = r2.mo96101cU()
            java.lang.String r3 = "//clean chatroomblock hard"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x2a12
            long r0 = r2.mo101204c(r0)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "clean block hard! ret:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1 = 1
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r2, (java.lang.CharSequence) r0, (int) r1)
            r0.show()
            return r1
        L_0x2a12:
            java.lang.String r3 = "//clean chatroomblock all"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x2a3c
            boolean r0 = r2.mo101202D()
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "delete table! ret:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 1
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r1, (java.lang.CharSequence) r0, (int) r2)
            r0.show()
            return r2
        L_0x2a3c:
            com.tencent.mm.storage.o1 r0 = r2.mo101216v(r0)
            if (r0 == 0) goto L_0x2a8a
            long r3 = r0.field_lastPushSeq
            r0.field_lastLocalSeq = r3
            long r3 = r0.field_lastPushCreateTime
            r0.field_lastLocalCreateTime = r3
            aj.d r1 = r0.field_seqBlockInfo
            if (r1 == 0) goto L_0x2a53
            java.util.LinkedList<aj.c> r1 = r1.f192605d
            r1.clear()
        L_0x2a53:
            long r0 = r2.mo101203E(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[chatroomblock] ret:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "clean chatroomblock! ret:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1 = 1
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r2, (java.lang.CharSequence) r0, (int) r1)
            r0.show()
            goto L_0x2a8b
        L_0x2a8a:
            r1 = 1
        L_0x2a8b:
            return r1
        L_0x2a8c:
            java.lang.String r0 = "//testupdate"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x2ad9
            android.content.res.AssetManager r0 = r26.getAssets()     // Catch:{ IOException -> 0x2aa4 }
            java.lang.String r1 = "aplha_update_info.xml"
            java.io.InputStream r0 = r0.open(r1)     // Catch:{ IOException -> 0x2aa4 }
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.convertStreamToString(r0)     // Catch:{ IOException -> 0x2aa4 }
            goto L_0x2aab
        L_0x2aa4:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r14, r1)
        L_0x2aab:
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r1 = 352273(0x56011, float:4.9364E-40)
            r0.mo119676J(r1, r14)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r1 = 352274(0x56012, float:4.93641E-40)
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.mo119676J(r1, r2)
            com.tencent.mm.pluginsdk.model.app.b r0 = new com.tencent.mm.pluginsdk.model.app.b
            r0.<init>(r14)
            r0.mo100142b()
            r1 = 1
            return r1
        L_0x2ad9:
            java.lang.String r0 = "//checkUpdate0"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x3913
            java.lang.String r0 = "//checkUpdate1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x2aeb
            goto L_0x3913
        L_0x2aeb:
            java.lang.String r0 = "//debugsnstimelinestat"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x2b1a
            boolean r0 = sf0.C90188n0.f258912F
            r1 = 1
            r0 = r0 ^ r1
            sf0.C90188n0.f258912F = r0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "debugSnsTimelineStat: "
            r1.append(r2)
            boolean r2 = sf0.C90188n0.f258912F
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r2)
            r0.show()
            r1 = 1
            return r1
        L_0x2b1a:
            java.lang.String r0 = "//abtestmsg"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2b48
            boolean r0 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()
            if (r0 != 0) goto L_0x2b29
            goto L_0x2b48
        L_0x2b29:
            java.lang.String r0 = "//abtestmsg"
            java.lang.String r0 = r1.replace(r0, r14)
            com.tencent.mm.model.newabtest.a$a r0 = com.tencent.p014mm.model.newabtest.C92722a.m116886c(r0)
            com.tencent.mm.storage.d r1 = com.tencent.p014mm.model.newabtest.SubCoreNewABTest.wx0()
            java.util.List<com.tencent.mm.storage.c> r2 = r0.f79472a
            r3 = 0
            r1.mo57625qq(r2, r3)
            com.tencent.mm.storage.b r1 = com.tencent.p014mm.model.newabtest.SubCoreNewABTest.vx0()
            java.util.List<com.tencent.mm.storage.a> r0 = r0.f79473b
            r2 = 1
            r1.mo57618Lo(r0, r2)
            return r2
        L_0x2b48:
            r2 = 1
            java.lang.String r0 = "//triggergetabtest"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2b65
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_ABTEST_LAST_UPDATE_TIME_LONG
            r3 = 1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.mo119677K(r1, r3)
            return r2
        L_0x2b65:
            java.lang.String r0 = "//vad"
            boolean r0 = r1.startsWith(r0)
            r2 = 9
            if (r0 == 0) goto L_0x2c2f
            android.content.SharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            if (r0 != 0) goto L_0x2b77
            r3 = 0
            return r3
        L_0x2b77:
            java.lang.String r3 = "//vad get"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x2b8e
            java.lang.String r0 = nd0.C117623b.m165899a()
            java.lang.String r1 = "VAD PARAMS"
            qo3.g r0 = nj3.C76879j.m92748s(r9, r0, r1)
            r0.show()
            r1 = 1
            return r1
        L_0x2b8e:
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r3 = "//vad sd"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x2bb0
            java.lang.String r3 = r1.substring(r2)
            java.lang.String r3 = r3.trim()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r3 = r3.intValue()
            java.lang.String r4 = "s_delay_time"
            r0.putInt(r4, r3)
        L_0x2bb0:
            java.lang.String r3 = "//vad st"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x2bce
            java.lang.String r3 = r1.substring(r2)
            java.lang.String r3 = r3.trim()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r3 = r3.intValue()
            java.lang.String r4 = "sil_time"
            r0.putInt(r4, r3)
        L_0x2bce:
            java.lang.String r3 = "//vad snr"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x2bee
            r3 = 10
            java.lang.String r3 = r1.substring(r3)
            java.lang.String r3 = r3.trim()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            float r3 = r3.floatValue()
            java.lang.String r4 = "s_n_ration"
            r0.putFloat(r4, r3)
        L_0x2bee:
            java.lang.String r3 = "//vad sw"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x2c0c
            java.lang.String r3 = r1.substring(r2)
            java.lang.String r3 = r3.trim()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r3 = r3.intValue()
            java.lang.String r4 = "s_window"
            r0.putInt(r4, r3)
        L_0x2c0c:
            java.lang.String r3 = "//vad sl"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x2c2a
            java.lang.String r1 = r1.substring(r2)
            java.lang.String r1 = r1.trim()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r1.intValue()
            java.lang.String r2 = "s_length"
            r0.putInt(r2, r1)
        L_0x2c2a:
            r0.apply()
            r1 = 1
            return r1
        L_0x2c2f:
            java.lang.String r0 = "//dumpabtestrecords"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2ca7
            int r0 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()
            r2 = 2
            if (r2 >= r0) goto L_0x2c40
            r2 = 0
            return r2
        L_0x2c40:
            java.lang.String r0 = "info"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x2c52
            com.tencent.mm.storage.b r0 = com.tencent.p014mm.model.newabtest.SubCoreNewABTest.vx0()
            java.lang.String r0 = r0.mo57619jo()
            goto L_0x2c5a
        L_0x2c52:
            com.tencent.mm.storage.d r0 = com.tencent.p014mm.model.newabtest.SubCoreNewABTest.wx0()
            java.lang.String r0 = r0.mo57624jo()
        L_0x2c5a:
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r9)
            r1.setText(r0)
            r0 = 8388627(0x800013, float:1.175497E-38)
            r1.setGravity(r0)
            r0 = 1092616192(0x41200000, float:10.0)
            r2 = 1
            r1.setTextSize(r2, r0)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r0.<init>(r3, r2)
            r1.setLayoutParams(r0)
            android.content.res.Resources r0 = r26.getResources()
            r2 = 2131099800(0x7f060098, float:1.7811963E38)
            int r0 = r0.getColor(r2)
            r1.setTextColor(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.MONOSPACE
            r1.setTypeface(r0)
            android.text.method.ScrollingMovementMethod r0 = new android.text.method.ScrollingMovementMethod
            r0.<init>()
            r1.setMovementMethod(r0)
            android.content.res.Resources r0 = r26.getResources()
            r2 = 2131165553(0x7f070171, float:1.7945326E38)
            int r0 = r0.getDimensionPixelSize(r2)
            r1.setPadding(r0, r0, r0, r0)
            r2 = 0
            nj3.C76879j.m92746q(r9, r2, r1, r2)
            r3 = 1
            return r3
        L_0x2ca7:
            r3 = 1
            java.lang.String r0 = "//triggerWebViewCookiesCleanup"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2cc4
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEBVIEW_CLEAR_HOST_COOKIES_INTERVAL_LONG
            r4 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r0.mo119677K(r1, r2)
            return r3
        L_0x2cc4:
            java.lang.String r0 = "//cleanwebcache"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2cd5
            com.tencent.mm.autogen.events.CleanWebViewCacheEvent r0 = new com.tencent.mm.autogen.events.CleanWebViewCacheEvent
            r0.<init>()
            r0.publish()
            return r3
        L_0x2cd5:
            java.lang.String r0 = "//triggerWebViewCacheCleanup"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2ce3
            java.lang.String r0 = "com.tencent.mm.intent.ACTION_CLEAR_WEBVIEW_CACHE"
            com.tencent.p014mm.xwebutil.C86032n.m106476b(r0)
            return r3
        L_0x2ce3:
            java.lang.String r0 = "//dumpsilkvoicefile"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2cee
            sf0.C90188n0.f258914H = r3
            return r3
        L_0x2cee:
            java.lang.String r0 = "//fucktit"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2d06
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SUBMENU_SHOW_TIT_BOOLEAN
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.mo119677K(r1, r2)
            return r3
        L_0x2d06:
            java.lang.String r0 = "//clog "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2d30
            r3 = 7
            java.lang.String r0 = r1.substring(r3)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "test cLog "
            r2.append(r3)
            long r3 = java.lang.System.currentTimeMillis()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.mo175907q(r0, r2)
            r1 = 1
            return r1
        L_0x2d30:
            java.lang.String r0 = "//testformsg"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2d9b
            boolean r0 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()
            if (r0 != 0) goto L_0x2d3f
            goto L_0x2d9b
        L_0x2d3f:
            r0 = 12
            java.lang.String r0 = r1.substring(r0)
            java.lang.String r0 = r0.trim()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "MMCore.getSysCmdMsgExtension() "
            r1.append(r2)
            eb0.v5 r2 = eb0.C97625j3.m125819i()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            te3.j3 r1 = new te3.j3
            r1.<init>()
            te3.rv3 r0 = sf0.C48374j0.m53720i(r0)
            r1.f227631h = r0
            java.lang.String r0 = "weixin"
            te3.rv3 r0 = sf0.C48374j0.m53720i(r0)
            r1.f227628e = r0
            java.lang.String r0 = eb0.C75592q0.m90789s()
            te3.rv3 r0 = sf0.C48374j0.m53720i(r0)
            r1.f227629f = r0
            java.lang.String r0 = "test"
            r2 = 1
            te3.qv3 r0 = sf0.C48374j0.m53719h(r0, r2)
            r1.f227634n = r0
            r0 = 10002(0x2712, float:1.4016E-41)
            r1.f227630g = r0
            ob0.m$a r0 = new ob0.m$a
            r3 = 0
            r0.<init>(r1, r3, r3, r3)
            eb0.v5 r1 = eb0.C97625j3.m125819i()
            r1.mo56403Fg(r0)
            return r2
        L_0x2d9b:
            java.lang.String r0 = "//resetsnslukcy"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2dd8
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_NEWYEAR_2016_HONGBAO_SNS_CTRLLUCKYCTRLHASSHOW_BOOLEAN_SYNC
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.mo119677K(r1, r2)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_NEWYEAR_2016_HONGBAO_SNS_CTRLLUCKYCOUNT_INT_SYNC
            r3 = r24
            r0.mo119677K(r1, r3)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_NEWYEAR_2016_HONGBAO_SNS_CTRLLUCKYCOUNT2_INT_SYNC
            r0.mo119677K(r1, r3)
            com.tencent.mm.autogen.events.SnsResetLuckyEvent r0 = new com.tencent.mm.autogen.events.SnsResetLuckyEvent
            r0.<init>()
            r0.publish()
            r5 = 1
            return r5
        L_0x2dd8:
            r3 = r24
            r5 = 1
            java.lang.String r0 = "//enablempsp"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2df2
            r6 = 0
            com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.DynamicConfigStorage.setDisabledFlagManually(r6)
            java.lang.String r0 = "设置成功，请重启微信！"
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r9, (java.lang.CharSequence) r0, (int) r6)
            r0.show()
            return r5
        L_0x2df2:
            r6 = 0
            java.lang.String r0 = "//disablempsp"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2e09
            com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences.DynamicConfigStorage.setDisabledFlagManually(r5)
            java.lang.String r0 = "设置成功，请重启微信！"
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r9, (java.lang.CharSequence) r0, (int) r6)
            r0.show()
            return r5
        L_0x2e09:
            java.lang.String r0 = "//soterpay"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2e19
            java.lang.String r0 = "fingerprint"
            java.lang.String r1 = ".ui.SoterPayTestUI"
            ke3.C88144b.m109789g(r9, r0, r1)
            return r5
        L_0x2e19:
            r0 = 2131838606(0x7f11468e, float:1.931044E38)
            java.lang.String r0 = r9.getString(r0)
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2e52
            r6 = r25
            java.lang.String[] r0 = r1.split(r6)
            int r0 = r0.length
            if (r0 != r5) goto L_0x2e51
            boolean r0 = sf0.C90188n0.f258920N
            r0 = r0 ^ r5
            sf0.C90188n0.f258920N = r0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            boolean r2 = sf0.C90188n0.f258920N
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "showVoipDebugLog:%b"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r3)
            r0.show()
        L_0x2e51:
            return r5
        L_0x2e52:
            r6 = r25
            java.lang.String r0 = "//cameraeffectdebug"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2e7f
            boolean r0 = sf0.C90188n0.f258921O
            r0 = r0 ^ r5
            sf0.C90188n0.f258921O = r0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            boolean r2 = sf0.C90188n0.f258921O
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "showCameraEffectDebugLog:%b"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r3)
            r0.show()
            return r5
        L_0x2e7f:
            java.lang.String r0 = "//getdltaskinfo"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2f08
            java.lang.String r0 = "//getdltaskinfo "
            java.lang.String r0 = r1.replace(r0, r14)
            r1 = 0
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r0, r1)     // Catch:{ Exception -> 0x2ece }
            java.lang.Class<sp.t> r3 = p237sp.C48456t.class
            di3.d r3 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x2ece }
            sp.t r3 = (p237sp.C48456t) r3     // Catch:{ Exception -> 0x2ece }
            xh.w2 r1 = r3.mo72824nh(r1)     // Catch:{ Exception -> 0x2ece }
            if (r1 == 0) goto L_0x2ec5
            java.lang.String r2 = "%d, %s, %s, %s"
            r3 = 4
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x2ece }
            long r5 = r1.field_downloadId     // Catch:{ Exception -> 0x2ece }
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x2ece }
            r5 = 0
            r4[r5] = r3     // Catch:{ Exception -> 0x2ece }
            java.lang.String r3 = r1.field_downloadUrl     // Catch:{ Exception -> 0x2ece }
            r5 = 1
            r4[r5] = r3     // Catch:{ Exception -> 0x2ece }
            java.lang.String r3 = r1.field_filePath     // Catch:{ Exception -> 0x2ece }
            r5 = 2
            r4[r5] = r3     // Catch:{ Exception -> 0x2ece }
            java.lang.String r1 = r1.field_md5     // Catch:{ Exception -> 0x2ece }
            r3 = 3
            r4[r3] = r1     // Catch:{ Exception -> 0x2ece }
            r1 = r22
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r4)     // Catch:{ Exception -> 0x2ed0 }
            goto L_0x2ecc
        L_0x2ec5:
            r1 = r22
            java.lang.String r2 = "infoID null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x2ed0 }
        L_0x2ecc:
            r5 = 1
            goto L_0x2f07
        L_0x2ece:
            r1 = r22
        L_0x2ed0:
            java.lang.Class<sp.t> r2 = p237sp.C48456t.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            sp.t r2 = (p237sp.C48456t) r2
            xh.w2 r0 = r2.I60(r0)
            if (r0 == 0) goto L_0x2f01
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            long r3 = r0.field_downloadId
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = r0.field_downloadUrl
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = r0.field_filePath
            r4 = 2
            r2[r4] = r3
            java.lang.String r0 = r0.field_md5
            r3 = 3
            r2[r3] = r0
            java.lang.String r0 = "%d, %s, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r2)
            goto L_0x2f07
        L_0x2f01:
            r5 = 1
            java.lang.String r0 = "infoURL null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x2f07:
            return r5
        L_0x2f08:
            r5 = 1
            java.lang.String r0 = "//testscan "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2f53
            java.lang.String[] r0 = r1.split(r6)
            r1 = r0[r5]
            r2 = 0
            float r1 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r1, r2)
            sf0.C90188n0.f258919M = r1
            r1 = 2
            r0 = r0[r1]
            r1 = 0
            float r0 = com.tencent.p014mm.sdk.platformtools.Util.getFloat(r0, r1)
            sf0.C90188n0.f258918L = r0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mode auto:"
            r1.append(r2)
            float r2 = sf0.C90188n0.f258919M
            r1.append(r2)
            java.lang.String r2 = ",mode continuous:"
            r1.append(r2)
            float r2 = sf0.C90188n0.f258918L
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r2)
            r0.show()
            return r2
        L_0x2f53:
            java.lang.String r0 = "//switchrecordmode"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2f98
            android.content.SharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            java.lang.String r1 = "settings_voicerecorder_mode"
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            r2 = r1 ^ 1
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r3 = "settings_voicerecorder_mode"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r3, r2)
            r0.commit()
            if (r1 == 0) goto L_0x2f89
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "Turn off silk record"
            r5 = 1
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r5)
            r0.show()
            goto L_0x2f97
        L_0x2f89:
            r5 = 1
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "Turn on silk record"
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r5)
            r0.show()
        L_0x2f97:
            return r5
        L_0x2f98:
            r5 = 1
            java.lang.String r0 = "//facedebug"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2fa2
            return r5
        L_0x2fa2:
            java.lang.String r0 = "//rstfacett"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2fab
            return r5
        L_0x2fab:
            java.lang.String r0 = "//rfcdn"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2fd1
            com.tencent.mm.modelcdntran.u r0 = com.tencent.p014mm.modelcdntran.C92779i0.Dx0()     // Catch:{ Exception -> 0x2fbf }
            r1 = 888(0x378, float:1.244E-42)
            r0.keep_OnRequestDoGetCdnDnsInfo(r1)     // Catch:{ Exception -> 0x2fbf }
            r5 = 1
            goto L_0x2fd0
        L_0x2fbf:
            r0 = move-exception
            r5 = 1
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "rfcdn :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r1)
        L_0x2fd0:
            return r5
        L_0x2fd1:
            r5 = 1
            java.lang.String r0 = "//testcrscroll "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x2ff9
            java.lang.String[] r0 = r1.split(r6)
            if (r0 == 0) goto L_0x2ff9
            int r7 = r0.length
            if (r7 <= r5) goto L_0x2ff9
            r0 = r0[r5]
            r1 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r1] = r0
            java.lang.String r0 = "summerbadcr testscroll new BADCR_SCROLL_DELAY[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r2)
            return r5
        L_0x2ff9:
            java.lang.String r0 = "//removeaudioplayer"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x3027
            java.lang.String[] r0 = r1.split(r6)
            int r1 = r0.length
            r3 = 2
            if (r1 < r3) goto L_0x3026
            r0 = r0[r5]
            r1 = 3
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
            if (r0 < r3) goto L_0x3025
            if (r0 > r2) goto L_0x3025
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_MUSIC_RREMOVE_PLAYING_AUDIO_PLAYER_GROUP_COUNT_INT_SYNC
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.mo119677K(r2, r0)
        L_0x3025:
            r5 = 1
        L_0x3026:
            return r5
        L_0x3027:
            java.lang.String r0 = "//showaudiotoast"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x3056
            java.lang.String[] r0 = r1.split(r6)
            int r1 = r0.length
            r2 = 2
            if (r1 < r2) goto L_0x3055
            r0 = r0[r5]
            r1 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_MUSIC_SHOW_AUDIO_TOAST_BOOLEAN_SYNC
            if (r0 != r5) goto L_0x304d
            r10 = 1
            goto L_0x304e
        L_0x304d:
            r10 = 0
        L_0x304e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r1.mo119677K(r2, r0)
        L_0x3055:
            return r5
        L_0x3056:
            java.lang.String r0 = "//openmixaudio"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x3085
            java.lang.String[] r0 = r1.split(r6)
            int r1 = r0.length
            r2 = 2
            if (r1 < r2) goto L_0x3084
            r0 = r0[r5]
            r1 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_MUSIC_OPEN_MIX_AUDIO_BOOLEAN_SYNC
            if (r0 != r5) goto L_0x307c
            r10 = 1
            goto L_0x307d
        L_0x307c:
            r10 = 0
        L_0x307d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r1.mo119677K(r2, r0)
        L_0x3084:
            return r5
        L_0x3085:
            java.lang.String r0 = "//switchmusicplayer"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x3137
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r4 = 0
            r0[r4] = r1
            java.lang.String r7 = "msg:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r7, r0)
            java.lang.String[] r0 = r1.split(r6)
            int r1 = r0.length
            r6 = 2
            if (r1 <= r6) goto L_0x3135
            r1 = r0[r5]
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r4)
            if (r1 != 0) goto L_0x30ab
            r1 = 0
            goto L_0x30ac
        L_0x30ab:
            r1 = 1
        L_0x30ac:
            r0 = r0[r6]
            r4 = -1
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r5 = r5.mo105906u()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_MUSIC_PLAYER_SWITCH_FLAG_INT_SYNC
            java.lang.Object r3 = r5.mo119685f(r6, r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r0 != r4) goto L_0x30d1
            if (r1 == 0) goto L_0x30cf
            r10 = 255(0xff, float:3.57E-43)
            goto L_0x311f
        L_0x30cf:
            r10 = 0
            goto L_0x311f
        L_0x30d1:
            if (r0 != 0) goto L_0x30dd
            if (r1 == 0) goto L_0x30d9
            r0 = r3 | 1
            goto L_0x30db
        L_0x30d9:
            r0 = r3 & -2
        L_0x30db:
            r10 = r0
            goto L_0x311f
        L_0x30dd:
            r4 = 1
            if (r0 != r4) goto L_0x30e8
            if (r1 == 0) goto L_0x30e5
            r0 = r3 | 2
            goto L_0x30db
        L_0x30e5:
            r0 = r3 & -3
            goto L_0x30db
        L_0x30e8:
            r4 = 4
            if (r0 != r4) goto L_0x30f3
            if (r1 == 0) goto L_0x30f0
            r0 = r3 | 4
            goto L_0x30db
        L_0x30f0:
            r0 = r3 & -5
            goto L_0x30db
        L_0x30f3:
            r4 = 6
            if (r0 != r4) goto L_0x30fe
            if (r1 == 0) goto L_0x30fb
            r0 = r3 | 16
            goto L_0x30db
        L_0x30fb:
            r0 = r3 & -17
            goto L_0x30db
        L_0x30fe:
            r4 = 7
            if (r0 != r4) goto L_0x3109
            if (r1 == 0) goto L_0x3106
            r0 = r3 | 32
            goto L_0x30db
        L_0x3106:
            r0 = r3 & -33
            goto L_0x30db
        L_0x3109:
            r4 = 8
            if (r0 != r4) goto L_0x3115
            if (r1 == 0) goto L_0x3112
            r0 = r3 | 64
            goto L_0x30db
        L_0x3112:
            r0 = r3 & -65
            goto L_0x30db
        L_0x3115:
            if (r0 != r2) goto L_0x3123
            if (r1 == 0) goto L_0x311c
            r0 = r3 | 128(0x80, float:1.794E-43)
            goto L_0x30db
        L_0x311c:
            r0 = r3 & -129(0xffffffffffffff7f, float:NaN)
            goto L_0x30db
        L_0x311f:
            r3 = r10
            r10 = 1
            goto L_0x3124
        L_0x3123:
            r10 = 0
        L_0x3124:
            if (r10 == 0) goto L_0x3135
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.mo119677K(r6, r1)
        L_0x3135:
            r2 = 1
            return r2
        L_0x3137:
            r2 = 1
            java.lang.String r0 = "//testdefaultrsa"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x317e
            java.lang.String r0 = "summercert testdefaultrsa"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            java.lang.String[] r0 = r1.split(r6)
            if (r0 == 0) goto L_0x3152
            int r0 = r0.length
            if (r0 <= r2) goto L_0x3152
            r0 = 1
            goto L_0x3153
        L_0x3152:
            r0 = 0
        L_0x3153:
            r1 = 0
            qe3.C101125b1.m132539g(r14, r14, r1)
            f40.g r2 = f40.C86709a0.m107529k()
            ob0.b0 r2 = r2.mo121127b()
            com.tencent.mm.network.g r2 = r2.mo123464j()
            if (r2 != 0) goto L_0x316c
            java.lang.String r0 = "summercert testdefaultrsa push not alive"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            return r1
        L_0x316c:
            com.tencent.mm.modelsimple.a0 r3 = new com.tencent.mm.modelsimple.a0
            r3.<init>((java.lang.String) r14, (java.lang.String) r14, (java.lang.String) r14, (int) r1)
            r1 = 1
            r3.mo174367w1(r1)
            com.tencent.mm.console.a$f r4 = new com.tencent.mm.console.a$f
            r4.<init>(r0, r9)
            r3.doScene(r2, r4)
            return r1
        L_0x317e:
            java.lang.String r0 = "//dumpdefaultrsa"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x318b
            boolean r0 = m116691a(r9, r14)
            return r0
        L_0x318b:
            java.lang.String r0 = "//hardwareinfo"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x31a0
            java.lang.Class<i02.b> r0 = i02.C33175b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            i02.b r0 = (i02.C33175b) r0
            r2 = 1
            r0.mo58995On(r2)
            return r2
        L_0x31a0:
            r2 = 1
            java.lang.String r0 = "//showStringName"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x31c3
            android.content.SharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            java.lang.String r1 = "ShowStringName"
            r3 = 0
            boolean r1 = r0.getBoolean(r1, r3)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r1 = r1 ^ r2
            java.lang.String r3 = "ShowStringName"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r3, r1)
            r0.commit()
            return r2
        L_0x31c3:
            java.lang.String r0 = "//mmphotoedit"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x31d9
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "mmsight"
            java.lang.String r3 = ".ui.TestVideoEditUI"
            ke3.C88144b.m109790h(r9, r1, r3, r0)
            return r2
        L_0x31d9:
            java.lang.String r0 = "//msgDelay"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x31e5
            com.tencent.p014mm.p136ui.conversation.banner.C116079e0.m163369i(r26)
            return r2
        L_0x31e5:
            java.lang.String r0 = "//cpDelayedMsg"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x31f1
            com.tencent.p014mm.p136ui.conversation.banner.C116079e0.m163368h(r26)
            return r2
        L_0x31f1:
            java.lang.String r0 = "//testhce"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x3202
            java.lang.String r0 = "nfc"
            java.lang.String r1 = ".ui.HceTestUI"
            ke3.C88144b.m109789g(r9, r0, r1)
            return r2
        L_0x3202:
            java.lang.String r0 = "//debugbigimg"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x3240
            java.lang.String[] r0 = r1.split(r6)
            int r1 = r0.length
            r3 = 2
            if (r1 != r3) goto L_0x323f
            r0 = r0[r2]
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x322d
            android.content.SharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "debug_big_img"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r2)
            r0.apply()
            goto L_0x323f
        L_0x322d:
            android.content.SharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "debug_big_img"
            r3 = 0
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r3)
            r0.apply()
        L_0x323f:
            return r2
        L_0x3240:
            java.lang.String r0 = "//testservice "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x3270
            java.lang.String r0 = "//testservice "
            java.lang.String r0 = r1.replace(r0, r14)
            java.lang.String r1 = "com.tencent.mm_webview_x5_preferences"
            r2 = 4
            android.content.SharedPreferences r1 = r9.getSharedPreferences(r1, r2)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            if (r0 == 0) goto L_0x3264
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x3264
            r10 = 1
            goto L_0x3265
        L_0x3264:
            r10 = 0
        L_0x3265:
            java.lang.String r0 = "forceTrigger"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r10)
            r0.commit()
            r2 = 1
            return r2
        L_0x3270:
            r2 = 1
            java.lang.String r0 = "//openDetect"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x3295
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "system_config_prefs"
            r5 = 4
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r5)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "msg_delay_close_detect"
            r3 = 0
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r3)
            r0.apply()
            return r2
        L_0x3295:
            r5 = 4
            java.lang.String r0 = "//closeDetect"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x32b8
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "system_config_prefs"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r5)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "msg_delay_close_detect"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r2)
            r0.apply()
            return r2
        L_0x32b8:
            java.lang.String r0 = "//snsimage"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x3301
            java.lang.String r0 = "//snsimage "
            java.lang.String r0 = r1.replace(r0, r14)     // Catch:{ Exception -> 0x32ea }
            r1 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)     // Catch:{ Exception -> 0x32ea }
            com.tencent.mm.modelcdntran.CdnTransportService r1 = com.tencent.p014mm.modelcdntran.C92779i0.Ex0()     // Catch:{ Exception -> 0x32ea }
            r1.mo126957o(r0)     // Catch:{ Exception -> 0x32ea }
            if (r0 <= 0) goto L_0x32d9
            java.lang.String r0 = "tcp sns image download"
            goto L_0x32db
        L_0x32d9:
            java.lang.String r0 = "http sns image download"
        L_0x32db:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x32ea }
            r2 = 0
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r1, (java.lang.CharSequence) r0, (int) r2)     // Catch:{ Exception -> 0x32ea }
            r0.show()     // Catch:{ Exception -> 0x32ea }
            r2 = 1
            goto L_0x3300
        L_0x32ea:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r14, r1)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r1 = "set snsimage fail, please ensure your command."
            r2 = 1
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r1, (int) r2)
            r0.show()
        L_0x3300:
            return r2
        L_0x3301:
            r2 = 1
            java.lang.String r0 = "//resetWeishi"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x3318
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEISHI_EXPOSE_COUNT_INT_SYNC
            r0.mo119677K(r1, r3)
            return r2
        L_0x3318:
            java.lang.String r0 = "//clearWxWebCacheAndCookie"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x3337
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "tools_process_action_code_key"
            java.lang.String r3 = "com.tencent.mm.intent.ACTION_CLEAR_WEBVIEW_CACHE"
            r0.putExtra(r1, r3)
            java.lang.String r1 = "tools_clean_webview_cache_ignore_cookie"
            r0.putExtra(r1, r2)
            com.tencent.p014mm.xwebutil.C86032n.m106475a(r0)
            return r2
        L_0x3337:
            java.lang.String r0 = "//destroyPreloadGameWebCore"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x3343
            com.tencent.p014mm.plugin.game.luggage.C41985r.m45634b()
            return r2
        L_0x3343:
            java.lang.String r0 = "//ecdhml "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x3434
            java.lang.String r0 = "//ecdhml "
            java.lang.String r0 = r1.replace(r0, r14)     // Catch:{ Exception -> 0x3433 }
            r2 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)     // Catch:{ Exception -> 0x3433 }
            if (r0 <= 0) goto L_0x3434
            r2 = 5
            if (r0 >= r2) goto L_0x3434
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x3433 }
            java.lang.String r5 = "auth_info_key_prefs"
            r7 = 4
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r5, r7)     // Catch:{ Exception -> 0x3433 }
            r5 = 3
            if (r0 >= r5) goto L_0x33cd
            android.content.SharedPreferences$Editor r5 = r2.edit()     // Catch:{ Exception -> 0x3433 }
            java.lang.String r7 = "auth_info_prefs_use_new_ecdh"
            r8 = 1
            if (r0 != r8) goto L_0x3375
            r0 = 1
            goto L_0x3376
        L_0x3375:
            r0 = 0
        L_0x3376:
            android.content.SharedPreferences$Editor r0 = r5.putBoolean(r7, r0)     // Catch:{ Exception -> 0x3433 }
            r0.commit()     // Catch:{ Exception -> 0x3433 }
            java.lang.String r0 = "auth_info_prefs_use_new_ecdh"
            boolean r0 = r2.getBoolean(r0, r8)     // Catch:{ Exception -> 0x3433 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x3433 }
            r2.<init>()     // Catch:{ Exception -> 0x3433 }
            java.lang.String r5 = "reset ecdh mode "
            r2.append(r5)     // Catch:{ Exception -> 0x3433 }
            boolean r5 = qe3.C101127f.f296015a     // Catch:{ Exception -> 0x3433 }
            if (r5 == 0) goto L_0x3396
            java.lang.String r5 = "enable"
            goto L_0x3398
        L_0x3396:
            java.lang.String r5 = "disable"
        L_0x3398:
            r2.append(r5)     // Catch:{ Exception -> 0x3433 }
            java.lang.String r5 = " to "
            r2.append(r5)     // Catch:{ Exception -> 0x3433 }
            if (r0 == 0) goto L_0x33a6
            java.lang.String r5 = "enable"
            goto L_0x33a8
        L_0x33a6:
            java.lang.String r5 = "disable"
        L_0x33a8:
            r2.append(r5)     // Catch:{ Exception -> 0x3433 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x3433 }
            r5 = 0
            android.widget.Toast r2 = nj3.C76912y0.makeText((android.content.Context) r9, (java.lang.CharSequence) r2, (int) r5)     // Catch:{ Exception -> 0x3433 }
            r2.show()     // Catch:{ Exception -> 0x3433 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x3433 }
            r2.<init>()     // Catch:{ Exception -> 0x3433 }
            java.lang.String r5 = "summerauths reset ecdh "
            r2.append(r5)     // Catch:{ Exception -> 0x3433 }
            r2.append(r0)     // Catch:{ Exception -> 0x3433 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x3433 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ Exception -> 0x3433 }
            goto L_0x3431
        L_0x33cd:
            android.content.SharedPreferences$Editor r5 = r2.edit()     // Catch:{ Exception -> 0x3433 }
            java.lang.String r7 = "auth_info_prefs_use_net_ml_cert"
            r8 = 3
            if (r0 != r8) goto L_0x33d9
            r0 = 1
            goto L_0x33da
        L_0x33d9:
            r0 = 0
        L_0x33da:
            android.content.SharedPreferences$Editor r0 = r5.putBoolean(r7, r0)     // Catch:{ Exception -> 0x3433 }
            r0.commit()     // Catch:{ Exception -> 0x3433 }
            java.lang.String r0 = "auth_info_prefs_use_new_ecdh"
            r5 = 0
            boolean r0 = r2.getBoolean(r0, r5)     // Catch:{ Exception -> 0x3433 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x3433 }
            r2.<init>()     // Catch:{ Exception -> 0x3433 }
            java.lang.String r5 = "reset ecdh ml mode "
            r2.append(r5)     // Catch:{ Exception -> 0x3433 }
            boolean r5 = qe3.C101127f.f296016b     // Catch:{ Exception -> 0x3433 }
            if (r5 == 0) goto L_0x33fb
            java.lang.String r5 = "enable"
            goto L_0x33fd
        L_0x33fb:
            java.lang.String r5 = "disable"
        L_0x33fd:
            r2.append(r5)     // Catch:{ Exception -> 0x3433 }
            java.lang.String r5 = " to "
            r2.append(r5)     // Catch:{ Exception -> 0x3433 }
            if (r0 == 0) goto L_0x340b
            java.lang.String r5 = "enable"
            goto L_0x340d
        L_0x340b:
            java.lang.String r5 = "disable"
        L_0x340d:
            r2.append(r5)     // Catch:{ Exception -> 0x3433 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x3433 }
            r5 = 0
            android.widget.Toast r2 = nj3.C76912y0.makeText((android.content.Context) r9, (java.lang.CharSequence) r2, (int) r5)     // Catch:{ Exception -> 0x3433 }
            r2.show()     // Catch:{ Exception -> 0x3433 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x3433 }
            r2.<init>()     // Catch:{ Exception -> 0x3433 }
            java.lang.String r5 = "summerauths reset ecdh ml"
            r2.append(r5)     // Catch:{ Exception -> 0x3433 }
            r2.append(r0)     // Catch:{ Exception -> 0x3433 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x3433 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ Exception -> 0x3433 }
        L_0x3431:
            r1 = 1
            return r1
        L_0x3433:
        L_0x3434:
            java.lang.String r0 = "//storyPostThreshold "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x3468
            r0 = 21
            java.lang.String r0 = r1.substring(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x344c }
            int r10 = r0.intValue()     // Catch:{ NumberFormatException -> 0x344c }
            goto L_0x3455
        L_0x344c:
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "NumberFormatException"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r10, r1, r0)
            r10 = 0
        L_0x3455:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_STORY_ONE_DAY_POST_COUNT_INT_SYNC
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r0.mo119677K(r1, r2)
            r2 = 1
            return r2
        L_0x3468:
            r2 = 1
            java.lang.String r0 = "//hbemojisw"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x3496
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LUCKY_MONEY_HONGBAO_LOCAL_SWITCH_INT
            java.lang.Object r0 = r0.mo119685f(r1, r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r0 = r0 ^ r2
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r3 = r3.mo105906u()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.mo119677K(r1, r0)
            return r2
        L_0x3496:
            java.lang.String r0 = "//addbywework"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x34c3
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_ADD_CONTACT_BY_WEWORK_SWITCH_INT
            java.lang.Object r0 = r0.mo119685f(r1, r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r0 = r0 ^ r2
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r3 = r3.mo105906u()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.mo119677K(r1, r0)
            return r2
        L_0x34c3:
            java.lang.String r0 = "//enableDyBg "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x3501
            java.lang.String[] r0 = r1.split(r6)
            int r1 = r0.length
            r3 = 2
            if (r1 != r3) goto L_0x3500
            r0 = r0[r2]
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x34ee
            android.content.SharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "enable_dynamic_background_for_test"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r2)
            r0.apply()
            goto L_0x3500
        L_0x34ee:
            android.content.SharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "enable_dynamic_background_for_test"
            r3 = 0
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r3)
            r0.apply()
        L_0x3500:
            return r2
        L_0x3501:
            java.lang.String r0 = "//setbgfps "
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x3534
            java.lang.String[] r0 = r1.split(r6)
            int r1 = r0.length
            r3 = 2
            if (r1 != r3) goto L_0x3532
            r0 = r0[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x3532
            r1 = 50
            if (r0 > r1) goto L_0x3532
            android.content.SharedPreferences r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "dynamic_bg_fps"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r2, r0)
            r0.apply()
        L_0x3532:
            r1 = 1
            return r1
        L_0x3534:
            java.lang.String r0 = "//luckyBag"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x3581
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.eggspring.ui.SpringCardActivity> r1 = com.tencent.p014mm.plugin.eggspring.p882ui.SpringCardActivity.class
            r0.<init>(r9, r1)
            k20.a r10 = new k20.a
            r10.<init>()
            r10.mo10233c(r0)
            java.lang.Object[] r2 = r10.mo10232b()
            java.lang.String r3 = "com/tencent/mm/console/CommandProcessor"
            java.lang.String r4 = "processed"
            java.lang.String r5 = "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r26
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            java.lang.Object r0 = r10.mo10231a(r1)
            android.content.Intent r0 = (android.content.Intent) r0
            r9.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/console/CommandProcessor"
            java.lang.String r3 = "processed"
            java.lang.String r4 = "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r26
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            r1 = 1
            return r1
        L_0x3581:
            java.lang.String r0 = "//weChatCouponTest"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x35b0
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r1 = 2812(0xafc, float:3.94E-42)
            com.tencent.mm.console.a$g r2 = new com.tencent.mm.console.a$g
            r2.<init>(r9)
            r0.mo123455a(r1, r2)
            pe3.b r0 = new pe3.b
            java.lang.String r1 = "2970ab7af847a6f4df4cc859d1b9713ef3834fe2cedc52624957de63ea3f6e8e6d02ae00148de17691af0b721bbd1abc4efdb29074030220142ed6a027e0ae8970881aa5fb0045845c23c04184829f96b5cca9ad420081d7e4a9fb9afdef515b50611066d1c969b0b71f3db61da723483880fceca2f7fb9482c57b963c05c67bde9860f5fec35f50a9990cc144b9a7455f73aa7234c3a8a57793c6c7ee7a74a9a74426ab3488d42031c3e3caebeb984f7bdb00850f3a4288ca3cbd5a457f843cda1cb8b335f9baac584afc35e9de62830add14bdf3711c7bbc46bc81cc9f1e3d4c79b76661aecc300024052d01846db357d8f6f98ea0452adcaa2b6a737812ffd70c86f8f3798724ffe3f43e5a753783c3ef0d79aa0378885c4f24b6572e596d"
            byte[] r1 = r1.getBytes()
            r0.<init>(r1)
            s51.a r1 = new s51.a
            r1.<init>(r0)
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r0.mo123460f(r1)
            r2 = 1
            return r2
        L_0x35b0:
            r2 = 1
            java.lang.String r0 = "//transVoice"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x35de
            java.lang.String[] r0 = r1.split(r6)
            int r1 = r0.length
            r3 = 2
            if (r3 != r1) goto L_0x35dd
            r1 = r0[r2]
            boolean r1 = r15.equals(r1)
            if (r1 == 0) goto L_0x35cd
            i13.C76259g.f223395Q0 = r2
            goto L_0x35dd
        L_0x35cd:
            r0 = r0[r2]
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x35da
            r1 = 0
            i13.C76259g.f223395Q0 = r1
            goto L_0x35dd
        L_0x35da:
            r1 = -1
            i13.C76259g.f223395Q0 = r1
        L_0x35dd:
            return r2
        L_0x35de:
            java.lang.String r0 = "//voice2TxtBlur"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x3614
            java.lang.String[] r0 = r1.split(r6)
            int r1 = r0.length
            r3 = 2
            if (r3 != r1) goto L_0x3613
            r1 = r0[r2]
            boolean r1 = r15.equals(r1)
            if (r1 == 0) goto L_0x35fd
            h13.b$a r0 = h13.C76096b.f223006a
            r0.mo106317a(r2)
            goto L_0x3613
        L_0x35fd:
            r0 = r0[r2]
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x360d
            h13.b$a r0 = h13.C76096b.f223006a
            r1 = 0
            r0.mo106317a(r1)
            goto L_0x3613
        L_0x360d:
            h13.b$a r0 = h13.C76096b.f223006a
            r1 = -1
            r0.mo106317a(r1)
        L_0x3613:
            return r2
        L_0x3614:
            java.lang.String r0 = "//scanSample"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x3626
            java.lang.String r0 = "scanner"
            java.lang.String r1 = ".ui.ScanSampleActivity"
            r3 = 0
            ke3.C88144b.m109790h(r9, r0, r1, r3)
            return r2
        L_0x3626:
            java.lang.String r0 = "//setcdnip"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x366e
            java.lang.String[] r0 = r1.split(r6)
            r1 = 0
            sf0.C90188n0.f258910D = r1
            int r1 = r0.length
            r3 = 2
            if (r1 < r3) goto L_0x3662
            sf0.C90188n0.f258910D = r2
            r0 = r0[r2]
            sf0.C90188n0.f258911E = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "set cdn debugip "
            r0.append(r1)
            java.lang.String r1 = sf0.C90188n0.f258911E
            r0.append(r1)
            java.lang.String r1 = " ok."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2 = 0
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r9, (java.lang.CharSequence) r0, (int) r2)
            r0.show()
            goto L_0x366c
        L_0x3662:
            r2 = 0
            java.lang.String r0 = "clean cdn debugip ok."
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r9, (java.lang.CharSequence) r0, (int) r2)
            r0.show()
        L_0x366c:
            r3 = 1
            return r3
        L_0x366e:
            r2 = 0
            r3 = 1
            java.lang.String r0 = "//snsvideoredirect"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x369a
            java.lang.String[] r0 = r1.split(r6)
            sf0.C90188n0.f258910D = r2
            int r1 = r0.length
            r4 = 2
            if (r1 < r4) goto L_0x3699
            sf0.C90188n0.f258910D = r3
            r0 = r0[r3]
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r2)
            if (r0 == 0) goto L_0x3690
            java.lang.String r0 = "enable sns video redirect"
            goto L_0x3692
        L_0x3690:
            java.lang.String r0 = "disable sns video redirect"
        L_0x3692:
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r9, (java.lang.CharSequence) r0, (int) r2)
            r0.show()
        L_0x3699:
            return r3
        L_0x369a:
            java.lang.String r0 = "//gamelifecleardb"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x36ae
            java.lang.Class<wy1.d> r0 = wy1.C53224d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            wy1.d r0 = (wy1.C53224d) r0
            r0.wx0()
            return r3
        L_0x36ae:
            java.lang.String r0 = "//gamelifechat"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x36c2
            java.lang.Class<wy1.d> r0 = wy1.C53224d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            wy1.d r0 = (wy1.C53224d) r0
            r0.Hx0()
            return r3
        L_0x36c2:
            java.lang.String r0 = "//cdnnodebug"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x36ce
            r2 = 0
            sf0.C90188n0.f258910D = r2
            return r3
        L_0x36ce:
            java.lang.String r0 = "//setLaunchRecovery"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x36e7
            java.lang.String r0 = "#setLaunchRecovery, set crash to launch recovery"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            java.lang.Class<tw.b> r0 = p705tw.C37284b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            tw.b r0 = (p705tw.C37284b) r0
            r0.K50(r9)
            return r3
        L_0x36e7:
            java.lang.String r0 = "//clearGameA8keyCookie"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x36f8
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_TOOLS
            java.lang.Class<com.tencent.mm.console.a$t> r1 = com.tencent.p014mm.console.C92618a.C40293t.class
            r2 = 0
            com.tencent.p014mm.ipcinvoker.C80907o.m98781d(r0, r2, r1, r2)
            return r3
        L_0x36f8:
            java.lang.String r0 = "//weseeSwitch"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x3737
            java.lang.String[] r0 = r1.split(r6)
            int r2 = r0.length
            r4 = 2
            if (r4 != r2) goto L_0x3737
            r0 = r0[r3]
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x3724
            android.content.SharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "wesee_switch"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r3)
            r0.apply()
            goto L_0x3737
        L_0x3724:
            android.content.SharedPreferences r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "wesee_switch"
            r3 = 0
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r2, r3)
            r0.apply()
        L_0x3737:
            java.lang.String r0 = "//snsad"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x3744
            ao2.C79618h.m96687a(r26, r27)
            r2 = 1
            return r2
        L_0x3744:
            r2 = 1
            java.lang.String r0 = "//snsdist"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x375d
            ob0.b0 r0 = eb0.C97625j3.m125815e()
            com.tencent.mm.modelcdntran.c0 r1 = new com.tencent.mm.modelcdntran.c0
            r3 = 30
            r4 = 2
            r1.<init>(r4, r3, r2)
            r0.mo123460f(r1)
            return r2
        L_0x375d:
            java.lang.String r0 = "//accrotation"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x3799
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r1 = "accelerometer_rotation"
            r2 = 0
            int r0 = android.provider.Settings.System.getInt(r0, r1, r2)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "自动旋转："
            r2.append(r3)
            r3 = 1
            if (r0 != r3) goto L_0x378b
            java.lang.String r0 = "开"
            goto L_0x378e
        L_0x378b:
            java.lang.String r0 = "关"
        L_0x378e:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            nj3.C76912y0.m92773l(r1, r0)
            return r3
        L_0x3799:
            java.lang.String r0 = "//myuid"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x37c0
            int r0 = android.os.Process.myUid()
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "myuid："
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            nj3.C76912y0.m92773l(r1, r0)
            r2 = 1
            return r2
        L_0x37c0:
            r2 = 1
            int r0 = m116698h(r27)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "processed : in ret:[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r2, r3)
            switch(r0) {
                case 568: goto L_0x390a;
                case 569: goto L_0x3901;
                case 570: goto L_0x38ea;
                case 571: goto L_0x38db;
                case 572: goto L_0x38cb;
                case 573: goto L_0x37d7;
                case 574: goto L_0x38a0;
                case 575: goto L_0x37d7;
                case 576: goto L_0x37d7;
                case 577: goto L_0x37d7;
                case 578: goto L_0x37d7;
                case 579: goto L_0x3893;
                case 580: goto L_0x3880;
                case 581: goto L_0x3873;
                case 582: goto L_0x384f;
                case 583: goto L_0x384d;
                case 584: goto L_0x3844;
                case 585: goto L_0x3844;
                case 586: goto L_0x3827;
                case 587: goto L_0x381d;
                case 588: goto L_0x3809;
                case 589: goto L_0x37d7;
                case 590: goto L_0x3807;
                case 591: goto L_0x37d9;
                default: goto L_0x37d7;
            }
        L_0x37d7:
            r1 = 0
            return r1
        L_0x37d9:
            java.lang.String[] r0 = r1.split(r6)     // Catch:{ Exception -> 0x37fc }
            if (r0 == 0) goto L_0x37f9
            int r1 = r0.length     // Catch:{ Exception -> 0x37fc }
            r2 = 1
            if (r1 <= r2) goto L_0x3806
            r1 = 0
            r0 = r0[r1]     // Catch:{ Exception -> 0x37fc }
            java.lang.String r1 = "sysmsg"
            r2 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r1, r2)     // Catch:{ Exception -> 0x37fc }
            eb0.c r1 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x37fc }
            gb0.b r1 = r1.mo105903r()     // Catch:{ Exception -> 0x37fc }
            r1.mo106166e(r0)     // Catch:{ Exception -> 0x37fc }
        L_0x37f9:
            r2 = 1
            goto L_0x3806
        L_0x37fc:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "hy: error occured in commandProcessor"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r2, r1)
            goto L_0x37f9
        L_0x3806:
            return r2
        L_0x3807:
            r2 = 1
            return r2
        L_0x3809:
            r2 = 1
            java.lang.String r0 = "/sdcard/tencent/MicroMsg/back"
            com.tencent.p014mm.vfs.C86013q1.m106461v(r0)
            eb0.c r0 = eb0.C97625j3.m125812b()
            java.lang.String r0 = r0.mo105901p()
            java.lang.String r1 = "/sdcard/tencent/MicroMsg/back"
            com.tencent.p014mm.vfs.C86013q1.m106441b(r0, r1)
            return r2
        L_0x381d:
            r2 = 1
            com.tencent.mm.autogen.events.DumpSnsEvent r0 = new com.tencent.mm.autogen.events.DumpSnsEvent
            r0.<init>()
            r0.publish()
            return r2
        L_0x3827:
            r2 = 1
            java.lang.String[] r0 = r1.split(r6)
            if (r0 == 0) goto L_0x3843
            int r1 = r0.length
            r3 = 3
            if (r1 != r3) goto L_0x3843
            r1 = r0[r2]
            r3 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r3)
            r4 = 2
            r0 = r0[r4]
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r3)
            pc0.C100766h0.m131941a(r1, r0, r14)
        L_0x3843:
            return r2
        L_0x3844:
            r2 = 1
            java.lang.String r0 = m116692b(r27)
            eb0.C75569c4.m90660F(r0)
            return r2
        L_0x384d:
            r2 = 1
            return r2
        L_0x384f:
            r2 = 1
            java.lang.String r0 = m116692b(r27)
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r1 = r1.mo105907v()
            com.tencent.mm.storage.z1 r0 = r1.get(r0)
            if (r0 == 0) goto L_0x3871
            int r1 = r0.mo62907i3()
            if (r1 != 0) goto L_0x386a
            goto L_0x3871
        L_0x386a:
            r0.mo62868O3()
            eb0.C45628s0.m50760Y(r0)
            return r2
        L_0x3871:
            r1 = 0
            return r1
        L_0x3873:
            r2 = 1
            java.lang.String r0 = m116692b(r27)
            com.tencent.mm.pluginsdk.model.app.o r1 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.xx0()
            r1.mo69369e(r0)
            return r2
        L_0x3880:
            r2 = 1
            ob0.b0 r0 = eb0.C97625j3.m125815e()
            eb0.f4 r1 = new eb0.f4
            com.tencent.mm.console.a$h r3 = new com.tencent.mm.console.a$h
            r3.<init>()
            r1.<init>(r3)
            r0.mo123460f(r1)
            return r2
        L_0x3893:
            r2 = 1
            java.lang.String r0 = m116692b(r27)
            eb0.w2 r1 = eb0.C31519v2.m39436a()
            r1.mo55987c(r0, r14)
            return r2
        L_0x38a0:
            r2 = 1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = p156gj.C87203t.m108270f(r2)
            r0.append(r1)
            eb0.c r1 = eb0.C97625j3.m125812b()
            int r1 = r1.mo105881G()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            byte[] r0 = r0.getBytes()
            java.lang.String r0 = p823sg.C90193h.m112878f(r0)
            java.lang.String r1 = "md5"
            nj3.C76879j.m92748s(r9, r0, r1)
            return r2
        L_0x38cb:
            r2 = 1
            java.lang.String r0 = m116692b(r27)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r0.intValue()
            com.tencent.p014mm.sdk.platformtools.ChannelUtil.updateMode = r0
            return r2
        L_0x38db:
            r2 = 1
            java.lang.String r0 = m116692b(r27)
            pc0.d0$a r1 = pc0.C118000d0.f352701a
            byte[] r0 = com.tencent.p014mm.sdk.platformtools.Util.decodeHexString(r0)
            r1.mo182758c(r0, r2)
            return r2
        L_0x38ea:
            r2 = 1
            java.lang.String r0 = m116692b(r27)
            boolean r0 = com.tencent.p014mm.storage.C85796t4.m105982bD(r0)
            if (r0 == 0) goto L_0x3900
            r0 = 2131838570(0x7f11466a, float:1.9310367E38)
            r1 = 0
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r9, (int) r0, (int) r1)
            r0.show()
        L_0x3900:
            return r2
        L_0x3901:
            r2 = 1
            eb0.c r0 = eb0.C97625j3.m125812b()
            r0.mo105888c()
            return r2
        L_0x390a:
            r1 = 0
            r2 = 1
            java.lang.String r0 = "test errlog"
            junit.framework.Assert.assertTrue(r0, r1)
            return r2
        L_0x3913:
            r2 = 1
            s72.b r0 = s72.C90149c.m112806a()
            java.lang.String r3 = "//checkUpdate1"
            boolean r1 = r1.equals(r3)
            com.tencent.mm.plugin.sandbox.SubCoreSandBox r0 = (com.tencent.p014mm.plugin.sandbox.SubCoreSandBox) r0
            r0.mo118742a(r1)
            return r2
        L_0x3924:
            r1 = 0
            throw r1
        L_0x3926:
            r10 = r6
            java.lang.String r0 = "testcrash"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "test exception."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.console.C92618a.m116695e(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: f */
    public static void m116696f(int i) {
        SharedPreferences sharedPreferences = MultiProcSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "sp_sns_dynswitch_stg", 4, false);
        if (i == -1) {
            sharedPreferences.edit().remove("st_sw_use_vcodec_img").commit();
        } else if (i == 0) {
            sharedPreferences.edit().putBoolean("st_sw_use_vcodec_img", false).commit();
        } else if (i == 1) {
            sharedPreferences.edit().putBoolean("st_sw_use_vcodec_img", true).commit();
        } else {
            throw new IllegalArgumentException("Bad op parameter: " + i);
        }
    }

    /* renamed from: g */
    public static void m116697g(int i) {
        SharedPreferences sharedPreferences = MultiProcSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "sp_sns_dynswitch_stg", 4, false);
        if (i == -1) {
            sharedPreferences.edit().remove("st_sw_use_wxpc_img").commit();
        } else if (i == 0) {
            sharedPreferences.edit().putBoolean("st_sw_use_wxpc_img", false).commit();
        } else if (i == 1) {
            sharedPreferences.edit().putBoolean("st_sw_use_wxpc_img", true).commit();
        } else {
            throw new IllegalArgumentException("Bad op parameter: " + i);
        }
    }

    /* renamed from: h */
    public static int m116698h(String str) {
        if (str.startsWith("//") && str.length() > 2) {
            int indexOf = str.indexOf(" ");
            if (indexOf == -1) {
                indexOf = str.length();
            }
            try {
                int i = Util.getInt(str.substring(2, indexOf), 0);
                int i2 = C89625d.f257841g % 256;
                if (i2 != 0 && i >= i2 && i % i2 == 0) {
                    return i / i2;
                }
            } catch (Exception unused) {
            }
        }
        return 0;
    }
}
