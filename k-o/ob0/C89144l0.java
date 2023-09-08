package ob0;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86723g;
import java.util.concurrent.Executor;
import jp3.C9487b;

/* renamed from: ob0.l0 */
public class C89144l0 {

    /* renamed from: a */
    public static l0$$f f256845a;

    /* renamed from: b */
    public static final Executor f256846b = new l0$$b();

    /* renamed from: c */
    public static final Executor f256847c = new l0$$c();

    /* renamed from: a */
    public static int m111425a(Executor executor, l0$$e l0__e, int i, int i2, String str, C47350c cVar, C117747y yVar) {
        if (l0__e == null) {
            return 0;
        }
        executor.execute(new l0$$a(l0__e, i, i2, str, cVar, yVar));
        return 0;
    }

    /* renamed from: b */
    public static void m111426b(C117747y yVar) {
        l0$$f l0__f = f256845a;
        if (l0__f == null) {
            Log.m105920e("MicroMsg.RunCgi", "ERROR: MMCore Not init interface IGetNetSceneQueue.");
        } else if (C86723g.this.f251779b == null) {
            Log.m105920e("MicroMsg.RunCgi", "ERROR: Get NetscneQueue is null.");
        } else if (yVar == null) {
            Log.m105920e("MicroMsg.RunCgi", "ERROR: Param scene  == null.");
        } else {
            C86723g.this.f251779b.mo123458d(yVar);
        }
    }

    /* renamed from: c */
    public static boolean m111427c() {
        l0$$f l0__f = f256845a;
        if (l0__f == null) {
            Log.m105920e("MicroMsg.RunCgi", "ERROR: MMCore Not init interface IGetNetSceneQueue.");
            return false;
        } else if (C86723g.this.f251779b != null) {
            return true;
        } else {
            Log.m105920e("MicroMsg.RunCgi", "ERROR: Get NetscneQueue is null.");
            return false;
        }
    }

    /* renamed from: d */
    public static C117747y m111428d(C47350c cVar, l0$$e l0__e, Executor executor, C9487b bVar) {
        l0$$g l0__g = new l0$$g(l0__e);
        if (l0__e == null) {
            l0__g = null;
        }
        if (!(bVar == null || l0__g == null)) {
            bVar.keep(l0__g);
        }
        return m111431g(cVar, l0__g, executor);
    }

    /* renamed from: e */
    public static C117747y m111429e(C47350c cVar, l0$$e l0__e, boolean z) {
        return m111430f(cVar, l0__e, z, (C9487b) null);
    }

    /* renamed from: f */
    public static C117747y m111430f(C47350c cVar, l0$$e l0__e, boolean z, C9487b bVar) {
        l0$$g l0__g = new l0$$g(l0__e);
        if (l0__e == null) {
            l0__g = null;
        }
        if (!(bVar == null || l0__g == null)) {
            bVar.keep(l0__g);
        }
        return m111431g(cVar, l0__g, z ? f256847c : f256846b);
    }

    /* renamed from: g */
    public static C117747y m111431g(C47350c cVar, l0$$e l0__e, Executor executor) {
        l0$$f l0__f = f256845a;
        if (l0__f == null) {
            Log.m105920e("MicroMsg.RunCgi", "ERROR: MMCore Not init interface IGetNetSceneQueue.");
            return null;
        } else if (C86723g.this.f251779b == null) {
            Log.m105920e("MicroMsg.RunCgi", "ERROR: Get NetscneQueue is null.");
            return null;
        } else if (cVar == null) {
            Log.m105920e("MicroMsg.RunCgi", "ERROR: Param CommReqResp is null");
            return null;
        } else {
            l0$$d l0__d = new l0$$d(cVar, executor, l0__e);
            if (C86723g.this.f251779b.mo123461g(l0__d, 0)) {
                return l0__d;
            }
            return null;
        }
    }
}
