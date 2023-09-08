package mk2;

import android.net.Uri;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.C40939n;
import com.tencent.p014mm.plugin.downloader.model.C40952u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import com.tencent.xweb.file.XVFSFile;
import cy3.C86151h;
import di3.C86312j;
import f40.C86709a0;
import gy3.C8479f0;
import gy3.C87412m;
import hk2.C32939b;
import hk2.C87542d;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import lk2.C88569a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import org.json.JSONObject;
import org.xwalk.core.XWalkEnvironment;
import p237sp.C13754y;
import p271xn.C91294h;
import p823sg.C90193h;
import te3.C90435r93;
import te3.C90441u93;
import te3.C90448yt3;
import z04.C112551y;
import z04.C119027c;
import zt3.C119157j;

/* renamed from: mk2.g */
public final class C88741g implements C11385n, C40952u {

    /* renamed from: n */
    public static String f256138n = "wechat_rtos_service";

    /* renamed from: o */
    public static String f256139o = C34582d.f92998a;

    /* renamed from: d */
    public final boolean f256140d;

    /* renamed from: e */
    public String f256141e = "";

    /* renamed from: f */
    public Long f256142f;

    /* renamed from: g */
    public C88569a f256143g = new C88569a();

    /* renamed from: h */
    public ArrayList<C87542d> f256144h = new ArrayList<>();

    /* renamed from: i */
    public final ReentrantLock f256145i = new ReentrantLock();

    /* renamed from: j */
    public boolean f256146j;

    /* renamed from: mk2.g$a */
    public static final class C88742a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<String> f256147d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<String> f256148e;

        /* renamed from: f */
        public final /* synthetic */ C88741g f256149f;

        public C88742a(C8479f0<String> f0Var, C8479f0<String> f0Var2, C88741g gVar) {
            this.f256147d = f0Var;
            this.f256148e = f0Var2;
            this.f256149f = gVar;
        }

        public final void run() {
            boolean z;
            if (!C86013q1.m106450k((String) this.f256147d.f27484d) || !C86013q1.m106450k((String) this.f256148e.f27484d)) {
                MultiProcessMMKV.getDefault().putString("patch_id", "");
                Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "file sign invalid. reset patchId");
                this.f256149f.mo123184e(-6);
                return;
            }
            C88741g gVar = this.f256149f;
            gVar.getClass();
            C34585h hVar = C34585h.f93003a;
            String a = hVar.mo59645a(C88741g.f256138n, gVar.f256141e);
            File file = new File(hVar.mo59646b(C88741g.f256138n, gVar.f256141e) + "/config.json");
            Charset charset = C119027c.f356488a;
            boolean z2 = true;
            if (C112551y.m153809i(C90193h.m112876d(a), new JSONObject(C86151h.m106662a(file, charset)).getString("so_md5"), true)) {
                Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "check so md5 success");
                z = true;
            } else {
                Log.m105920e("MicroMsg.Rtos.SoResCheckProcessor", "check so md5 fail");
                z = false;
            }
            if (z) {
                C88741g gVar2 = this.f256149f;
                gVar2.getClass();
                hVar.mo59645a(C88741g.f256138n, gVar2.f256141e);
                String string = new JSONObject(C86151h.m106662a(new File(hVar.mo59646b(C88741g.f256138n, gVar2.f256141e) + "/config.json"), charset)).getString("abi");
                if (BuildInfo.IS_ARM64 && C112551y.m153809i(string, XWalkEnvironment.RUNTIME_ABI_ARM64_STR, true)) {
                    Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "check so abi success");
                } else if (BuildInfo.IS_ARM64 || !C112551y.m153809i(string, XWalkEnvironment.RUNTIME_ABI_ARM32_STR, true)) {
                    Log.m105920e("MicroMsg.Rtos.SoResCheckProcessor", "check so abi fail IS_ARM64:" + BuildInfo.IS_ARM64 + " SO abi:" + string);
                    z2 = false;
                } else {
                    Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "check so abi success");
                }
                if (z2) {
                    this.f256149f.mo123184e(0);
                    return;
                }
            }
            MultiProcessMMKV.getDefault().putString("patch_id", "");
            Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "file sign invalid. reset patchId");
            ((C32939b) C86312j.m106911c(C32939b.class)).mo33888DL();
            this.f256149f.mo123184e(-5);
        }
    }

    /* renamed from: mk2.g$b */
    public static final class C88743b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C88741g f256150d;

        /* renamed from: e */
        public final /* synthetic */ String f256151e;

        public C88743b(C88741g gVar, String str) {
            this.f256150d = gVar;
            this.f256151e = str;
        }

        public final void run() {
            boolean z;
            C88741g gVar = this.f256150d;
            String str = this.f256151e;
            gVar.getClass();
            Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "checkFileSign");
            try {
                z = new ShareSecurityCheck(MMApplicationContext.getContext()).verifyPatchMetaSignature(new File(str));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Rtos.SoResCheckProcessor", e, "verify patch signature failed.", new Object[0]);
                z = false;
            }
            if (z) {
                C88741g gVar2 = this.f256150d;
                String str2 = this.f256151e;
                gVar2.getClass();
                if (C86013q1.m106451l(str2) > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Log.m105925i("MicroMsg.Rtos.SoResCheckProcessor", "unZipFile start. zipPath:%s", str2);
                    C34585h hVar = C34585h.f93003a;
                    String str3 = C88741g.f256138n;
                    C87412m.m108594g(str3, "soName");
                    String str4 = C34585h.f93004b + XVFSFile.SEPARATOR_CHAR + str3 + "/temp/";
                    C86009m1 m1Var = new C86009m1(str4);
                    Uri n = C116299g2.m163858n(hVar.mo59647c(C88741g.f256138n));
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                    if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
                        C86013q1.m106445f(C116299g2.m163865u(n));
                        Log.m105918d("MicroMsg.Rtos.SoResCheckProcessor", "clean so dir");
                    }
                    m1Var.mo119987x();
                    if (C86013q1.m106436R(str2, str4) >= 0) {
                        try {
                            String string = new JSONObject(C86151h.m106662a(new File(m1Var + "/config.json"), C119027c.f356488a)).getString("patch_id");
                            String str5 = C88741g.f256138n;
                            C87412m.m108593f(string, "patchId");
                            String b = hVar.mo59646b(str5, string);
                            C86009m1 m1Var2 = new C86009m1(b);
                            m1Var2.mo119987x();
                            C86013q1.m106462w(str4, b);
                            Log.m105918d("MicroMsg.Rtos.SoResCheckProcessor", "moveDir form " + m1Var2 + " to " + b);
                            C86013q1.m106447h(str2);
                            StringBuilder sb = new StringBuilder();
                            sb.append("delete file ");
                            sb.append(str2);
                            Log.m105918d("MicroMsg.Rtos.SoResCheckProcessor", sb.toString());
                            MultiProcessMMKV.getDefault().putString("patch_id", string);
                            Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "unZipFile success patchId:" + string + " use:" + (System.currentTimeMillis() - currentTimeMillis));
                            Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "downloadSuccess. start check local resource");
                            gVar2.mo123181a();
                        } catch (Exception e2) {
                            Log.printErrStackTrace("MicroMsg.Rtos.SoResCheckProcessor", e2, "read json fail.", new Object[0]);
                            gVar2.mo123183c(-7);
                        }
                    } else {
                        Log.m105925i("MicroMsg.Rtos.SoResCheckProcessor", "unZipFile fail. zipPath:%s", str2);
                        gVar2.mo123183c(-7);
                    }
                } else {
                    Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "unZipFile fail file don't exist.");
                    gVar2.mo123183c(-7);
                }
            } else {
                Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "check sign fail.");
                this.f256150d.mo123183c(-5);
            }
        }
    }

    static {
        String str = C34582d.f92998a;
    }

    public C88741g(boolean z) {
        this.f256140d = z;
    }

    /* renamed from: B */
    public void mo1796B(long j, String str, long j2, long j3) {
        Long l = this.f256142f;
        if (l != null && l.longValue() == j) {
            Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskProgressChanged taskId:" + j + " recvLen:" + j2 + " totalLen:" + j3);
            int i = (int) ((j2 * ((long) 100)) / j3);
            Log.m105925i("MicroMsg.Rtos.SoResCheckProcessor", "onCheckCallback process:%d", Integer.valueOf(i));
            Iterator<C87542d> it = this.f256144h.iterator();
            while (it.hasNext()) {
                C87542d next = it.next();
                C87412m.m108593f(next, "checkCallbackList");
                next.mo33903a(i);
            }
        }
    }

    /* renamed from: D */
    public void mo1797D(long j) {
        Long l = this.f256142f;
        if (l != null && l.longValue() == j) {
            Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskRemoved taskId:" + j);
        }
    }

    /* renamed from: O */
    public void mo1798O(long j) {
        Long l = this.f256142f;
        if (l != null && l.longValue() == j) {
            Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskMd5Checking taskId:" + j);
        }
    }

    /* renamed from: Q */
    public void mo1799Q(long j, String str) {
        Long l = this.f256142f;
        if (l != null && l.longValue() == j) {
            Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskResumed taskId:" + j);
        }
    }

    /* renamed from: S */
    public void mo1800S(long j) {
        Long l = this.f256142f;
        if (l != null && l.longValue() == j) {
            Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskPaused taskId:" + j);
        }
    }

    /* renamed from: a */
    public final void mo123181a() {
        this.f256141e = String.valueOf(MultiProcessMMKV.getDefault().getString("patch_id", ""));
        C8479f0 f0Var = new C8479f0();
        C34585h hVar = C34585h.f93003a;
        f0Var.f27484d = hVar.mo59645a(f256138n, this.f256141e);
        C8479f0 f0Var2 = new C8479f0();
        f0Var2.f27484d = hVar.mo59646b(f256138n, this.f256141e) + "config.json";
        Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "checkLocalResource patchId:" + this.f256141e + ", so:" + ((String) f0Var.f27484d) + ", config:" + ((String) f0Var2.f27484d));
        ((C119157j) C119157j.f356862d).mo183875f(new C88742a(f0Var, f0Var2, this));
    }

    /* renamed from: b */
    public final void mo123182b() {
        Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "checkRemoteUpdateFail");
        if (this.f256140d) {
            mo123184e(-1);
        } else {
            mo123181a();
        }
    }

    /* renamed from: c */
    public final void mo123183c(int i) {
        Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "downloadFail. errorCode:" + i);
        if (this.f256140d) {
            mo123184e(i);
        } else {
            mo123181a();
        }
    }

    /* renamed from: d */
    public void mo1801d(long j, int i, boolean z) {
        Long l = this.f256142f;
        if (l != null && l.longValue() == j) {
            Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskFailed taskId:" + j + ", errCode" + i);
            mo123183c(-4);
        }
    }

    /* renamed from: e */
    public final void mo123184e(int i) {
        Log.m105925i("MicroMsg.Rtos.SoResCheckProcessor", "onCheckCallback errorCode:%d", Integer.valueOf(i));
        this.f256145i.lock();
        C86709a0.m107524d().mo123470p(3899, this);
        ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63969q(this);
        this.f256143g.f255811h = i;
        Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "report " + this.f256143g);
        C115669n nVar = C115669n.INSTANCE;
        C88569a aVar = this.f256143g;
        C88569a aVar2 = this.f256143g;
        nVar.mo160131h(26515, Integer.valueOf(this.f256143g.f255804a), aVar.f255805b, Integer.valueOf(aVar.f255806c), Integer.valueOf(this.f256143g.f255807d), Integer.valueOf(this.f256143g.f255808e), Integer.valueOf(this.f256143g.f255809f), aVar2.f255810g, Integer.valueOf(aVar2.f255811h), this.f256143g.f255812i);
        Iterator<C87542d> it = this.f256144h.iterator();
        while (it.hasNext()) {
            C87542d next = it.next();
            C87412m.m108593f(next, "checkCallbackList");
            next.mo33904b(i);
        }
        this.f256144h.clear();
        this.f256146j = false;
        this.f256145i.unlock();
    }

    /* renamed from: f */
    public final void mo123185f(C87542d dVar) {
        this.f256145i.lock();
        if (!this.f256146j) {
            ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63955a(this);
            C86709a0.m107524d().mo123455a(3899, this);
            boolean z = this.f256140d;
            this.f256141e = String.valueOf(MultiProcessMMKV.getDefault().getString("patch_id", ""));
            C88569a aVar = this.f256143g;
            String str = f256139o;
            aVar.getClass();
            C87412m.m108594g(str, "<set-?>");
            aVar.f255805b = str;
            C88569a aVar2 = this.f256143g;
            String str2 = this.f256141e;
            aVar2.getClass();
            C87412m.m108594g(str2, "<set-?>");
            aVar2.f255812i = str2;
            this.f256143g.f255804a = z ^ true ? 1 : 0;
            Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "checkRemoteUpdate baseId:" + f256139o + " patchId:" + this.f256141e + " scene:" + this.f256143g.f255804a);
            C88739b Lh0 = ((C91294h) C86312j.m106911c(C91294h.class)).Lh0(f256139o, this.f256141e, z);
            C89137b0 d = C86709a0.m107524d();
            C87412m.m108592e(Lh0, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            d.mo123460f((C117747y) Lh0);
            this.f256146j = true;
        } else {
            Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "isChecking ignore add listener and check remote update.");
        }
        if (dVar != null) {
            this.f256144h.add(dVar);
        }
        this.f256145i.unlock();
    }

    /* renamed from: f0 */
    public void mo1802f0(long j, String str) {
        Long l = this.f256142f;
        if (l != null && l.longValue() == j) {
            Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskStarted taskId:" + j + ", savedFilePath" + str);
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        if (yVar instanceof C88739b) {
            Log.m105925i("MicroMsg.Rtos.SoResCheckProcessor", "errType:%d errCode:%d errMsg:%s ", Integer.valueOf(i), Integer.valueOf(i2), str);
            C88569a aVar = this.f256143g;
            aVar.f255806c = i;
            aVar.f255807d = i2;
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "check success");
                C90435r93 response = ((C88739b) yVar).getResponse();
                C90441u93 u932 = response.f259789d;
                C88569a aVar2 = this.f256143g;
                aVar2.f255809f = response.f259794i;
                String str3 = str == null ? "" : str;
                aVar2.getClass();
                aVar2.f255810g = str3;
                if (u932 != null) {
                    C88569a aVar3 = this.f256143g;
                    int i3 = u932.f259853e;
                    aVar3.f255808e = i3;
                    if (i3 != 1) {
                        if (i3 == 2) {
                            C90448yt3 yt32 = u932.f259857i;
                            if (yt32 == null || (str2 = yt32.f259945f) == null) {
                                Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "node url is null.");
                                mo123182b();
                                return;
                            }
                            C87412m.m108593f(str2, "node.info.Url");
                            String str4 = u932.f259857i.f259943d;
                            C87412m.m108593f(str4, "node.info.MD5");
                            Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "checkRemoteUpdateSuccessAndStartDownload and start download:" + str2);
                            C40939n nVar = new C40939n((C40939n.C2206a) null);
                            nVar.f110176a = str2;
                            C34585h hVar = C34585h.f93003a;
                            String str5 = f256138n;
                            C87412m.m108594g(str5, "soName");
                            nVar.f110179d = "lib" + str5 + ".so";
                            nVar.f110180e = str4;
                            nVar.f110184i = false;
                            nVar.f110186k = true;
                            nVar.f110181f = 2;
                            nVar.f110185j = false;
                            this.f256142f = Long.valueOf(((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63956b(nVar));
                            return;
                        } else if (!(i3 == 3 || i3 == 4)) {
                            Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "unknown state: " + u932.f259853e);
                            mo123182b();
                            return;
                        }
                    }
                    Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "node state: " + u932.f259853e);
                    mo123182b();
                    return;
                }
                Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "check error code:" + response.f259794i + ", error msg:" + str);
                mo123182b();
                return;
            }
            Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "check fail");
            mo123182b();
            return;
        }
        Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "ignore other check scene");
    }

    /* renamed from: q */
    public void mo1803q(long j, String str, boolean z) {
        Long l = this.f256142f;
        if (l != null && l.longValue() == j) {
            Log.m105924i("MicroMsg.Rtos.SoResCheckProcessor", "onTaskFinished taskId:" + j + ", savedFilePath" + str);
            ((C119157j) C119157j.f356862d).mo183875f(new C88743b(this, str));
        }
    }
}
