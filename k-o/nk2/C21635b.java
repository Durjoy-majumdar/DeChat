package nk2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.RtosCancelLoginEvent;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.rtos.service.RtosWatchServiceGuard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import hk2.C20958c;
import hk2.C32939b;
import hk2.C87542d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import jk2.C21251j;
import jk2.C21257q;
import jk2.C21258r;
import jk2.C21260w;
import jk2.C21261y;
import kk2.C33929c;
import lk2.C21439b;
import mk2.C88744i;
import nk2.C21653g;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: nk2.b */
public final class C21635b extends C86301e implements C32939b {

    /* renamed from: d */
    public SharedPreferences f61242d;

    /* renamed from: e */
    public String f61243e;

    /* renamed from: f */
    public String f61244f;

    /* renamed from: g */
    public C21439b f61245g = new C21439b();

    /* renamed from: h */
    public ReentrantLock f61246h = new ReentrantLock();

    /* renamed from: i */
    public Intent f61247i = new Intent(MMApplicationContext.getContext(), RtosWatchServiceGuard.class);

    /* renamed from: j */
    public ArrayList<C20958c> f61248j = new ArrayList<>();

    /* renamed from: n */
    public C88744i f61249n = new C88744i();

    /* renamed from: o */
    public boolean f61250o;

    /* renamed from: p */
    public boolean f61251p;

    /* renamed from: q */
    public C21653g f61252q = new C21653g(new C21637b(this));

    /* renamed from: r */
    public C20958c f61253r = new C21638c(this);

    /* renamed from: nk2.b$a */
    public static final class C21636a implements C87542d {

        /* renamed from: a */
        public final /* synthetic */ C21635b f61254a;

        public C21636a(C21635b bVar) {
            this.f61254a = bVar;
        }

        /* renamed from: a */
        public void mo33903a(int i) {
            Log.m105924i("MicroMsg.Rtos.RtosWatchLoginUI", "so download progress " + i);
        }

        /* renamed from: b */
        public void mo33904b(int i) {
            if (i == 0) {
                C21635b bVar = this.f61254a;
                bVar.mo33897hM(bVar.f61253r);
            } else {
                Log.m105920e("MicroMsg.Rtos.RtosServiceImpl", "onSoResCheck Fail");
            }
            Log.m105924i("MicroMsg.Rtos.RtosServiceImpl", "checkNeedStartUp finish");
            this.f61254a.f61250o = false;
        }
    }

    /* renamed from: nk2.b$b */
    public static final class C21637b implements C21653g.C21654a {

        /* renamed from: a */
        public final /* synthetic */ C21635b f61255a;

        public C21637b(C21635b bVar) {
            this.f61255a = bVar;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.m105925i("MicroMsg.Rtos.RtosServiceImpl", "innerServiceConnection onServiceConnected %s", componentName);
            C21635b bVar = this.f61255a;
            bVar.f61246h.lock();
            if (!bVar.f61248j.isEmpty()) {
                Iterator<C20958c> it = bVar.f61248j.iterator();
                while (it.hasNext()) {
                    it.next().mo24214a();
                }
                bVar.f61248j.clear();
            }
            C21439b bVar2 = bVar.f61245g;
            long currentTimeMillis = System.currentTimeMillis();
            C21439b bVar3 = bVar.f61245g;
            bVar2.f60675c = currentTimeMillis - bVar3.f60674b;
            bVar3.f60674b = 0;
            bVar.f61246h.unlock();
            this.f61255a.f61251p = true;
        }

        public void onServiceDisconnected(ComponentName componentName) {
            Log.m105925i("MicroMsg.Rtos.RtosServiceImpl", "innerServiceConnection onServiceDisconnected %s", componentName);
            this.f61255a.mo33889DQ();
            this.f61255a.f61251p = false;
        }
    }

    /* renamed from: nk2.b$c */
    public static final class C21638c implements C20958c {

        /* renamed from: a */
        public final /* synthetic */ C21635b f61256a;

        public C21638c(C21635b bVar) {
            this.f61256a = bVar;
        }

        /* renamed from: a */
        public final void mo24214a() {
            Log.m105924i("MicroMsg.Rtos.RtosServiceImpl", "serviceConnectionCallback onServiceConnected");
            C21635b bVar = this.f61256a;
            bVar.getClass();
            Log.m105924i("MicroMsg.Rtos.RtosServiceImpl", "startRtosService init");
            bVar.f61245g.f60673a = 61;
            C115669n.INSTANCE.mo175911u(1904, 61);
            C80907o.m98781d(WeChatProcess.PROCESS_EXDEVICE, new IPCInteger(0), C21251j.class, new C21640d(bVar));
        }
    }

    public C21635b() {
        Log.m105924i("MicroMsg.Rtos.RtosServiceImpl", "RtosServiceImpl init");
    }

    /* renamed from: Cl */
    public void mo33887Cl() {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor remove;
        Log.m105924i("MicroMsg.Rtos.RtosServiceImpl", "clearRtosBindInfo");
        SharedPreferences sharedPreferences = this.f61242d;
        if (!(sharedPreferences == null || (edit = sharedPreferences.edit()) == null || (remove = edit.remove("username")) == null)) {
            remove.commit();
        }
        this.f61244f = null;
    }

    /* renamed from: DL */
    public void mo33888DL() {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor remove;
        SharedPreferences.Editor remove2;
        Log.m105924i("MicroMsg.Rtos.RtosServiceImpl", "clearRtosBindInfo");
        SharedPreferences sharedPreferences = this.f61242d;
        if (!(sharedPreferences == null || (edit = sharedPreferences.edit()) == null || (remove = edit.remove(TPDownloadProxyEnum.USER_MAC)) == null || (remove2 = remove.remove("username")) == null)) {
            remove2.commit();
        }
        this.f61243e = null;
        this.f61244f = null;
    }

    /* renamed from: DQ */
    public void mo33889DQ() {
        if (this.f61250o) {
            Log.m105924i("MicroMsg.Rtos.RtosServiceImpl", "checkNeedStartUp has checking");
            return;
        }
        Log.m105924i("MicroMsg.Rtos.RtosServiceImpl", "checkNeedStartUp");
        this.f61250o = true;
        C21439b bVar = this.f61245g;
        bVar.f60673a = 0;
        bVar.f60674b = 0;
        bVar.f60675c = 0;
        bVar.f60676d = 0;
        bVar.f60677e = 0;
        Context context = MMApplicationContext.getContext();
        SharedPreferences sharedPreferences = context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + "_rtos_account", 0);
        this.f61242d = sharedPreferences;
        String str = null;
        this.f61243e = sharedPreferences != null ? sharedPreferences.getString(TPDownloadProxyEnum.USER_MAC, "") : null;
        SharedPreferences sharedPreferences2 = this.f61242d;
        if (sharedPreferences2 != null) {
            str = sharedPreferences2.getString("username", "");
        }
        this.f61244f = str;
        Log.m105924i("MicroMsg.Rtos.RtosServiceImpl", "mac:" + this.f61243e + ", username:" + this.f61244f);
        if (!Util.isNullOrNil(this.f61244f) || !Util.isNullOrNil(this.f61243e)) {
            C88744i iVar = this.f61249n;
            C21636a aVar = new C21636a(this);
            iVar.getClass();
            Log.m105924i("MicroMsg.Rtos.SoResMgr", "manualCheckSoRes");
            iVar.f256153b.mo123185f(aVar);
            return;
        }
        Ul0();
        this.f61250o = false;
        Log.m105924i("MicroMsg.Rtos.RtosServiceImpl", "checkNeedStartUp finish");
    }

    /* renamed from: Hf */
    public void mo33890Hf() {
        C88744i iVar = this.f61249n;
        iVar.getClass();
        Log.m105924i("MicroMsg.Rtos.SoResMgr", "autoCheckSoRes");
        iVar.f256152a.mo123185f((C87542d) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        if (r11 == null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        if (r1.isEmpty() == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105928w("MicroMsg.Rtos.RtosServiceImpl", "syncQuickReplyList ignore. empty list.");
        r1 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.Rtos.RtosServiceImpl", "syncQuickReplyList " + r1.size());
        r0 = new com.tencent.p014mm.plugin.rtos.model.RtosQuickReplyList(r1);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.Rtos.RtosServiceImpl", "syncQuickReplyList list " + r0.f81933d.size() + " username " + r12.f61244f + ", mac:" + r12.f61243e + " code " + r12.f61245g.f60676d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d7, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r12.f61244f) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00df, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r12.f61243e) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e1, code lost:
        r1 = r12.f61245g.f60676d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e6, code lost:
        if (r1 == 1) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ea, code lost:
        if (r1 != 10) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ec, code lost:
        com.tencent.p014mm.ipcinvoker.C80907o.m98783f(com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_EXDEVICE, r0, jk2.C21262z.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0050, code lost:
        if (r11 == null) goto L_0x0065;
     */
    /* renamed from: Ir */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33891Ir() {
        /*
            r12 = this;
            ok2.b r0 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Jx0()
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r5 = ""
            java.lang.String r9 = "orderIndex ASC"
            r11 = 0
            zh3.f r2 = r0.f94340d     // Catch:{ Exception -> 0x0056 }
            java.lang.String r3 = "RtosQuickReplyInfo"
            r4 = 0
            r7 = 0
            r8 = 0
            r10 = 2
            r6 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0056 }
            if (r11 == 0) goto L_0x0050
            boolean r0 = r11.moveToFirst()     // Catch:{ Exception -> 0x0056 }
            if (r0 == 0) goto L_0x0050
        L_0x0027:
            com.tencent.mm.plugin.rtos.model.RtosQuickReply r0 = new com.tencent.mm.plugin.rtos.model.RtosQuickReply     // Catch:{ Exception -> 0x0056 }
            java.lang.String r2 = "orderIndex"
            int r2 = r11.getColumnIndex(r2)     // Catch:{ Exception -> 0x0056 }
            int r2 = r11.getInt(r2)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r3 = "quickMsg"
            int r3 = r11.getColumnIndex(r3)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r3 = r11.getString(r3)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r4 = "cursor.getString(cursor.…kReplyInfo.COL_QUICKMSG))"
            gy3.C87412m.m108593f(r3, r4)     // Catch:{ Exception -> 0x0056 }
            r0.<init>(r2, r3)     // Catch:{ Exception -> 0x0056 }
            r1.add(r0)     // Catch:{ Exception -> 0x0056 }
            boolean r0 = r11.moveToNext()     // Catch:{ Exception -> 0x0056 }
            if (r0 != 0) goto L_0x0027
        L_0x0050:
            if (r11 == 0) goto L_0x0065
            goto L_0x0062
        L_0x0053:
            r0 = move-exception
            goto L_0x00f4
        L_0x0056:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.Rtos.RtosQuickReplyInfoStorage"
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x0053 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)     // Catch:{ all -> 0x0053 }
            if (r11 == 0) goto L_0x0065
        L_0x0062:
            r11.close()
        L_0x0065:
            boolean r0 = r1.isEmpty()
            java.lang.String r2 = "MicroMsg.Rtos.RtosServiceImpl"
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = "syncQuickReplyList ignore. empty list."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0078:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "syncQuickReplyList "
            r0.append(r3)
            int r3 = r1.size()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.plugin.rtos.model.RtosQuickReplyList r0 = new com.tencent.mm.plugin.rtos.model.RtosQuickReplyList
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "syncQuickReplyList list "
            r1.append(r3)
            java.util.ArrayList<com.tencent.mm.plugin.rtos.model.RtosQuickReply> r3 = r0.f81933d
            int r3 = r3.size()
            r1.append(r3)
            java.lang.String r3 = " username "
            r1.append(r3)
            java.lang.String r3 = r12.f61244f
            r1.append(r3)
            java.lang.String r3 = ", mac:"
            r1.append(r3)
            java.lang.String r3 = r12.f61243e
            r1.append(r3)
            java.lang.String r3 = " code "
            r1.append(r3)
            lk2.b r3 = r12.f61245g
            int r3 = r3.f60676d
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            java.lang.String r1 = r12.f61244f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x00f3
            java.lang.String r1 = r12.f61243e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x00f3
            lk2.b r1 = r12.f61245g
            int r1 = r1.f60676d
            r2 = 1
            if (r1 == r2) goto L_0x00ec
            r2 = 10
            if (r1 != r2) goto L_0x00f3
        L_0x00ec:
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_EXDEVICE
            java.lang.Class<jk2.z> r2 = jk2.C21262z.class
            com.tencent.p014mm.ipcinvoker.C80907o.m98783f(r1, r0, r2)
        L_0x00f3:
            return
        L_0x00f4:
            if (r11 == 0) goto L_0x00f9
            r11.close()
        L_0x00f9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nk2.C21635b.mo33891Ir():void");
    }

    public void M40() {
        Log.m105924i("MicroMsg.Rtos.RtosServiceImpl", "onNetworkChange");
        if (!Util.isNullOrNil(this.f61244f) && !Util.isNullOrNil(this.f61243e)) {
            int i = this.f61245g.f60676d;
            if (i == 1 || i == 10) {
                C80907o.m98783f(WeChatProcess.PROCESS_EXDEVICE, new IPCVoid(), C21260w.class);
            }
        }
    }

    /* renamed from: TQ */
    public void mo33893TQ(String str, String str2) {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        SharedPreferences.Editor putString2;
        Log.m105925i("MicroMsg.Rtos.RtosServiceImpl", "saveRtosBindInfo mac:%s username:%s", str, str2);
        SharedPreferences sharedPreferences = this.f61242d;
        if (!(sharedPreferences == null || (edit = sharedPreferences.edit()) == null || (putString = edit.putString(TPDownloadProxyEnum.USER_MAC, str)) == null || (putString2 = putString.putString("username", str2)) == null)) {
            putString2.commit();
        }
        this.f61243e = str;
        this.f61244f = str2;
    }

    public void Ul0() {
        Log.m105924i("MicroMsg.Rtos.RtosServiceImpl", "tryStopService");
        if (this.f61252q.f61281e) {
            MMApplicationContext.getContext().stopService(this.f61247i);
            if (this.f61251p) {
                this.f61251p = false;
                MMApplicationContext.getContext().unbindService(this.f61252q);
            }
        }
    }

    /* renamed from: aC */
    public C33929c mo33895aC() {
        String str;
        String string;
        SharedPreferences sharedPreferences = this.f61242d;
        String str2 = "";
        if (sharedPreferences == null || (str = sharedPreferences.getString(TPDownloadProxyEnum.USER_MAC, str2)) == null) {
            str = str2;
        }
        SharedPreferences sharedPreferences2 = this.f61242d;
        if (!(sharedPreferences2 == null || (string = sharedPreferences2.getString("username", str2)) == null)) {
            str2 = string;
        }
        return new C33929c(str, str2);
    }

    public void ev0(C21439b bVar) {
        C87412m.m108594g(bVar, "p");
        this.f61245g = bVar;
        C115669n.INSTANCE.mo160131h(26126, Integer.valueOf(bVar.f60673a), Long.valueOf(bVar.f60675c), Integer.valueOf(bVar.f60676d), Integer.valueOf(bVar.f60677e));
    }

    /* renamed from: hM */
    public void mo33897hM(C20958c cVar) {
        C87412m.m108594g(cVar, "callback");
        Log.m105924i("MicroMsg.Rtos.RtosServiceImpl", "startAndBindService");
        this.f61246h.lock();
        try {
            if (this.f61252q.f61281e) {
                cVar.mo24214a();
            } else {
                MMApplicationContext.getContext().startService(this.f61247i);
                MMApplicationContext.getContext().bindService(this.f61247i, this.f61252q, 1);
                this.f61248j.add(cVar);
            }
            C21439b bVar = this.f61245g;
            if (bVar.f60674b == 0) {
                bVar.f60674b = System.currentTimeMillis();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Rtos.RtosServiceImpl", e, "tryStartService fail.", new Object[0]);
        }
        this.f61246h.unlock();
    }

    public void mq0(String str) {
        Log.m105924i("MicroMsg.Rtos.RtosServiceImpl", "onXlogUpload");
        if (!Util.isNullOrNil(this.f61244f) && !Util.isNullOrNil(this.f61243e)) {
            C80907o.m98783f(WeChatProcess.PROCESS_EXDEVICE, new IPCString(str), C21258r.class);
        }
    }

    public void pl0() {
        Log.m105924i("MicroMsg.Rtos.RtosServiceImpl", "cancelLogin");
        new RtosCancelLoginEvent().publish();
    }

    /* renamed from: qX */
    public void mo33900qX(C87542d dVar) {
        C87412m.m108594g(dVar, "callback");
        C88744i iVar = this.f61249n;
        iVar.getClass();
        Log.m105924i("MicroMsg.Rtos.SoResMgr", "manualCheckSoRes");
        iVar.f256153b.mo123185f(dVar);
    }

    /* renamed from: s1 */
    public void mo33901s1() {
        if (!Util.isNullOrNil(this.f61244f) && !Util.isNullOrNil(this.f61243e)) {
            int i = this.f61245g.f60676d;
            if (i == 1 || i == 10) {
                Log.m105924i("MicroMsg.Rtos.RtosServiceImpl", "logout");
                C80907o.m98783f(WeChatProcess.PROCESS_EXDEVICE, new IPCVoid(), C21261y.class);
                Ul0();
                this.f61250o = false;
            }
        }
    }

    public void xv0(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        Log.m105925i("MicroMsg.Rtos.RtosServiceImpl", "onForegroundChange isForeground:%b errorcode:%d", Boolean.valueOf(booleanValue), Integer.valueOf(this.f61245g.f60676d));
        if (!Util.isNullOrNil(this.f61244f) && !Util.isNullOrNil(this.f61243e)) {
            int i = this.f61245g.f60676d;
            if (i == 1 || i == 10) {
                C80907o.m98783f(WeChatProcess.PROCESS_EXDEVICE, new IPCBoolean(booleanValue), C21257q.class);
            }
        }
    }
}
