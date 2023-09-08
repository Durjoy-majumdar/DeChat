package ld2;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.pluginsdk.model.app.C44550e0;
import com.tencent.p014mm.pluginsdk.model.app.C44552f;
import com.tencent.p014mm.pluginsdk.model.app.C44556h;
import com.tencent.p014mm.pluginsdk.model.app.C44557i;
import com.tencent.p014mm.pluginsdk.model.app.C44577o;
import com.tencent.p014mm.pluginsdk.model.app.C44579p;
import com.tencent.p014mm.pluginsdk.model.app.C72684e;
import com.tencent.p014mm.pluginsdk.model.app.C96776s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import java.util.ArrayList;
import q90.C101062d;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: ld2.g */
public class C46848g extends C86301e {

    /* renamed from: d */
    public C72684e f126010d;

    /* renamed from: e */
    public C44557i f126011e;

    /* renamed from: f */
    public C44577o f126012f;

    /* renamed from: g */
    public C44579p f126013g;

    /* renamed from: h */
    public C96776s f126014h;

    /* renamed from: i */
    public C44550e0 f126015i;

    /* renamed from: j */
    public C44552f f126016j;

    public static C44577o Ax0() {
        C86709a0.m107523b().mo121108c();
        if (Ex0().f126012f == null) {
            Ex0().f126012f = new C44577o();
        }
        return Ex0().f126012f;
    }

    public static C44579p Bx0() {
        C86709a0.m107523b().mo121108c();
        if (Ex0().f126013g == null) {
            Ex0().f126013g = new C44579p(C86709a0.m107535s().f251811i);
        }
        return Ex0().f126013g;
    }

    public static C44550e0 Cx0() {
        C86709a0.m107523b().mo121108c();
        if (Ex0().f126015i == null) {
            Ex0().f126015i = new C44550e0();
        }
        return Ex0().f126015i;
    }

    public static String Dx0() {
        return C86709a0.m107535s().f251806d + "share_img_tmp/";
    }

    public static C46848g Ex0() {
        return (C46848g) C86312j.m106911c(C46848g.class);
    }

    public static void vx0() {
        if (!C86013q1.m106450k(xx0()) && !C86013q1.m106461v(xx0())) {
            Log.m105920e("XPinOpenApi", "alvinluo checkAccOpenApiPath mkdirs failed");
        }
    }

    public static String wx0() {
        return xx0() + "thumb/";
    }

    public static String xx0() {
        return C86709a0.m107535s().f251806d + "openapi/";
    }

    public static C44552f yx0() {
        C86709a0.m107523b().mo121108c();
        if (Ex0().f126016j == null) {
            Ex0().f126016j = new C44552f();
        }
        return Ex0().f126016j;
    }

    public static C44557i zx0() {
        C86709a0.m107523b().mo121108c();
        if (Ex0().f126011e == null) {
            Ex0().f126011e = new C44557i();
        }
        return Ex0().f126011e;
    }

    public void onAccountReleased(Context context) {
        C44577o oVar = Ex0().f126012f;
        if (oVar != null) {
            yx0().mo69347a(7, oVar);
        }
        C44557i iVar = Ex0().f126011e;
        if (iVar != null) {
            ((ArrayList) iVar.f120834b).clear();
            ((ArrayList) iVar.f120835c).clear();
            iVar.f120836d.clear();
        }
        C44550e0 e0Var = Ex0().f126015i;
        if (e0Var != null) {
            Log.m105918d("MicroMsg.AppSettingService", "stop service");
            e0Var.f120810d.clear();
            yx0().mo69347a(1, e0Var);
        }
        C44552f fVar = this.f126016j;
        if (fVar != null) {
            fVar.getClass();
            C86709a0.m107529k().f251779b.mo123470p(452, fVar);
            MMHandlerThread.postToMainThread(new C44556h(fVar));
        }
        if (Ex0().f126013g != null) {
            ((C101062d) Ex0().f126013g.f120882d).clear();
        }
        this.f126010d = null;
        this.f126013g = null;
        Log.m105924i("XPinOpenApi", "onAccountRelease");
    }
}
