package af3;

import a70.C79471a;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import bf3.C79697a;
import bf3.C79700b;
import bf3.C79701c;
import bx3.C79852a;
import com.tencent.mars.Mars;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.plugin.expansions.C85178q;
import com.tencent.p014mm.plugin.p064hp.net.C85235a;
import com.tencent.p014mm.plugin.p064hp.net.SimpleHttpLogic;
import com.tencent.p014mm.plugin.p064hp.util.TinkerSyncResponse;
import com.tencent.p014mm.recoveryv2.C85671c;
import com.tencent.p014mm.recoveryv2.C85672d;
import com.tencent.p014mm.recoveryv2.C85692k;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.wechat.aff.ting.TingClientProto;
import com.tinkerboots.sdk.tinker.service.TinkerServerResultService;
import cv3.C86144a;
import fv3.C87102h;
import fx3.C87116a;
import fx3.C87118b;
import gv3.C87401b;
import java.io.File;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import p329d3.C86165a;
import qi3.C89670a;
import qi3.C89671b;
import qi3.C89673c;
import qi3.C89676f;
import ri3.C89966b;
import ri3.C89967c;
import te3.C90430p93;
import te3.C90432q93;
import y02.C91363f;
import zw3.C91941a;

/* renamed from: af3.e */
public class C79525e {

    /* renamed from: af3.e$a */
    public class C79526a extends C87401b {
        public C79526a(Context context) {
            super(context);
        }

        /* renamed from: b */
        public void mo109440b(File file, int i) {
            int i2 = i;
            super.mo109440b(file, i);
            C85671c.m105784b("MicroMsg.recovery.operator", "#onPatchPackageCheckFail, code = " + i2);
            int abs = i2 != 0 ? Math.abs(i) + 10 : 0;
            C85672d.C85674b bVar = new C85672d.C85674b(this.f253291a, "recovery_statistic");
            bVar.mo119256e();
            int i3 = bVar.getInt("crash_count", 0);
            boolean z = bVar.getBoolean("launch_recovery", false);
            boolean z2 = bVar.getBoolean("launch_recovery_real", false);
            boolean z3 = bVar.getBoolean("recover_from_crash", false);
            bVar.getInt("recovery_status", -1);
            int i4 = bVar.getInt("recovery_from", 0);
            long j = bVar.getLong("recover_running_time", 0);
            bVar.getBoolean("recover_is_discard", false);
            String string = bVar.getString("recover_app_ver", "");
            bVar.mo119258g("crash_count", (long) i3);
            bVar.putBoolean("launch_recovery", z);
            bVar.putBoolean("launch_recovery_real", z2);
            bVar.putBoolean("recover_from_crash", z3);
            bVar.putInt("recovery_status", abs);
            bVar.putInt("recovery_from", i4);
            bVar.putInt("recover_internal_status", bVar.getInt("recover_internal_status", 0));
            bVar.putInt("recover_launch_mode", bVar.getInt("recover_launch_mode", 0));
            bVar.putLong("recover_running_time", j);
            bVar.putBoolean("recover_is_discard", false);
            bVar.putString("recover_app_ver", string);
            bVar.mo119242c();
        }
    }

    /* renamed from: af3.e$b */
    public class C79527b implements C86165a<Integer> {
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            Integer num = (Integer) obj;
        }
    }

    /* renamed from: af3.e$c */
    public class C79528c implements C86165a<Integer> {

        /* renamed from: a */
        public final /* synthetic */ Context f233171a;

        /* renamed from: b */
        public final /* synthetic */ C86165a f233172b;

        public C79528c(Context context, C86165a aVar) {
            this.f233171a = context;
            this.f233172b = aVar;
        }

        public void accept(Object obj) {
            Integer num = (Integer) obj;
            if (num.intValue() > 20) {
                Context context = this.f233171a;
                C86165a aVar = this.f233172b;
                C85671c.m105784b("MicroMsg.recovery.operatorFallback", "#fetchTinkerPatch");
                String str = C79471a.f233023k;
                Log.m105924i("MicroMsg.recovery.operatorFallback", "baseTinkerId = " + str);
                C90432q93 q932 = new C90432q93();
                q932.f259754d = str;
                q932.f259755e = C79471a.m96436a();
                LinkedList<C90430p93> b = C91363f.m114614b();
                q932.f259756f = b;
                b.add(C91363f.m114613a("biz-scene", "recovery"));
                q932.f259761n = 1;
                C79701c.m96819a(context, q932, aVar, true);
                return;
            }
            this.f233172b.accept(num);
        }
    }

    /* renamed from: af3.e$d */
    public class C79529d implements C85235a.C85238c {

        /* renamed from: a */
        public final /* synthetic */ AtomicInteger f233173a;

        /* renamed from: b */
        public final /* synthetic */ C86165a f233174b;

        /* renamed from: c */
        public final /* synthetic */ Context f233175c;

        /* renamed from: d */
        public final /* synthetic */ boolean f233176d;

        public C79529d(AtomicInteger atomicInteger, C86165a aVar, Context context, boolean z) {
            this.f233173a = atomicInteger;
            this.f233174b = aVar;
            this.f233175c = context;
            this.f233176d = z;
        }

        /* renamed from: a */
        public void mo109572a(int i, TinkerSyncResponse tinkerSyncResponse) {
            C85671c.m105784b("MicroMsg.recovery.operator", "onCheckEnd, error = " + i + ", response = " + tinkerSyncResponse);
            if (i == 0 || i == -5) {
                C85671c.m105784b("MicroMsg.recovery.operator", "fetchTinkerPatch cgi rsp successful");
                if (i == -5 || tinkerSyncResponse == null || TextUtils.isEmpty(tinkerSyncResponse.f248342h)) {
                    this.f233173a.set(1);
                    this.f233174b.accept(Integer.valueOf(this.f233173a.get()));
                    return;
                }
                String str = tinkerSyncResponse.f248343i;
                C79525e.m96547b(this.f233175c, tinkerSyncResponse.f248342h, (long) Math.max(tinkerSyncResponse.f248345n, 0), str, this.f233174b, this.f233176d);
                return;
            }
            Log.m105928w("MicroMsg.recovery.operator", "fetchTinkerPatch cgi rsp error, abort");
            C85692k.C85693a.m105840a(5, "MicroMsg.recovery.operator", "fetchTinkerPatch cgi rsp error, abort");
            this.f233173a.set(Math.abs(i) + 20);
            this.f233174b.accept(Integer.valueOf(this.f233173a.get()));
        }
    }

    /* renamed from: af3.e$e */
    public class C79530e implements C89966b {

        /* renamed from: a */
        public final /* synthetic */ AtomicInteger f233177a;

        /* renamed from: b */
        public final /* synthetic */ boolean f233178b;

        /* renamed from: c */
        public final /* synthetic */ Context f233179c;

        /* renamed from: d */
        public final /* synthetic */ C86165a f233180d;

        public C79530e(AtomicInteger atomicInteger, boolean z, Context context, C86165a aVar) {
            this.f233177a = atomicInteger;
            this.f233178b = z;
            this.f233179c = context;
            this.f233180d = aVar;
        }
    }

    /* renamed from: a */
    public static void m96546a(Context context, C90432q93 q932, C86165a<Integer> aVar, boolean z) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        C79697a aVar2 = new C79697a(q932);
        C85671c.m105784b("MicroMsg.recovery.operator", "NetSceneBaseMMTLSCheckCopycat#doSceneSync()");
        aVar2.f233604c = new C79529d(atomicInteger, aVar, context, z);
        if (aVar2.f233602a == null) {
            Log.m105924i("MicroMsg.Tinker.NetSceneBaseMMTLSCheckCopycat", "doScene failed. request is null.");
            aVar2.f233604c.mo109572a(-3, (TinkerSyncResponse) null);
            return;
        }
        Log.m105924i("MicroMsg.Tinker.NetSceneBaseMMTLSCheckCopycat", "start check");
        SimpleHttpLogic.startRequest(aVar2.f233602a, aVar2.f233603b, BuildInfo.DEBUG ? "101.227.131.113" : "");
    }

    /* renamed from: b */
    public static void m96547b(Context context, String str, long j, String str2, C86165a<Integer> aVar, boolean z) {
        C85671c.m105784b("MicroMsg.recovery.operator", "#downloadTinkerPatch, file size = " + j + ", url = " + str);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        C89673c cVar = new C89673c(str);
        File cacheDir = context.getCacheDir();
        File file = new File(cacheDir, "recovery/tinker_path_file_" + System.currentTimeMillis());
        cVar.f257910g = file;
        cVar.f257909f = new File(file.getAbsolutePath() + ".tmp");
        cVar.f257918r = new C79530e(atomicInteger, z, context, aVar);
        if (j > 0) {
            cVar.f257914n = j;
        }
        if (!TextUtils.isEmpty(str2)) {
            cVar.f257916p = new C89676f(str2);
        }
        C85671c.m105784b("MicroMsg.recovery.operator", "#downloadTinkerPatch start sync downloading");
        C89670a aVar2 = new C89670a();
        C89671b bVar = new C89671b(aVar2);
        bVar.f257903a = context;
        bVar.mo123999b(cVar);
        while (cVar.f257907d == 2030) {
            try {
                Thread.sleep((long) ((C89967c.C89968a) cVar.mo124004a()).f258531a);
                bVar.mo123999b(cVar);
            } catch (InterruptedException e) {
                cVar.f257907d = 2040;
                aVar2.mo123997b(cVar, TingClientProto.TingScene.TingScene_ChatHistory_VALUE, e.getLocalizedMessage());
            }
        }
    }

    /* renamed from: c */
    public static void m96548c(Context context, C86165a<Integer> aVar) {
        if (aVar == null) {
            aVar = new C79527b();
        }
        C85671c.m105784b("MicroMsg.recovery.operator", "#fetchTinkerPatch");
        C85178q.m105045i(Mars.libMarsHttp);
        C79528c cVar = new C79528c(context, aVar);
        String str = C79471a.f233023k;
        Log.m105924i("MicroMsg.recovery.operator", "baseTinkerId = " + str);
        C90432q93 q932 = new C90432q93();
        q932.f259754d = str;
        q932.f259755e = C79471a.m96436a();
        LinkedList<C90430p93> b = C79700b.m96818b();
        q932.f259756f = b;
        b.add(C79700b.m96817a("biz-scene", "recovery"));
        q932.f259761n = 1;
        m96546a(context, q932, cVar, true);
    }

    /* renamed from: d */
    public static void m96549d(Context context) {
        ApplicationLike applicationLike = C80589e.f235760a;
        if (applicationLike != null) {
            Application application = applicationLike.getApplication();
            C91941a aVar = new C91941a(application, applicationLike, new C87116a(application), new C79526a(context), new C87118b(application), new C87102h(), (C86144a) null, TinkerServerResultService.class, new C79852a());
            if (C91941a.f263210c == null) {
                C91941a.f263210c = aVar;
                return;
            }
            throw new TinkerRuntimeException("TinkerClient instance is already set.");
        }
        throw new TinkerRuntimeException("applicationLike must not be null.");
    }
}
