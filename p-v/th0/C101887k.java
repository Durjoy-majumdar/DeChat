package th0;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import d62.C7250m;
import gy3.C87412m;
import p434ig.C98672d;
import ph0.C100792a;
import te3.tc4;

/* renamed from: th0.k */
public final class C101887k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C98672d f300024d;

    /* renamed from: e */
    public final /* synthetic */ Context f300025e;

    /* renamed from: f */
    public final /* synthetic */ String f300026f;

    /* renamed from: g */
    public final /* synthetic */ C72963f4 f300027g;

    /* renamed from: h */
    public final /* synthetic */ Runnable f300028h;

    public C101887k(C98672d dVar, Context context, String str, C72963f4 f4Var, Runnable runnable) {
        this.f300024d = dVar;
        this.f300025e = context;
        this.f300026f = str;
        this.f300027g = f4Var;
        this.f300028h = runnable;
    }

    public void run() {
        if (this.f300024d.mo55274P() == 4) {
            Context context = this.f300025e;
            String str = this.f300026f;
            C72963f4 f4Var = this.f300027g;
            C98672d dVar = this.f300024d;
            C100792a aVar = C100792a.f295260a;
            String str2 = null;
            String t = f4Var != null ? f4Var.mo108768t() : null;
            String str3 = "";
            if (t == null) {
                t = str3;
            }
            long j = 0;
            C86009m1 m1Var = new C86009m1(aVar.mo140234e(dVar, t, f4Var != null ? f4Var.getMsgId() : 0));
            if (m1Var.mo119967g()) {
                if (f4Var != null) {
                    str2 = f4Var.mo108768t();
                }
                if (str2 != null) {
                    str3 = str2;
                }
                if (f4Var != null) {
                    j = f4Var.getMsgId();
                }
                String i = new C86009m1(aVar.mo140251w(dVar, str3, j)).mo119971i();
                C87412m.m108593f(i, "thumbFile.absolutePath");
                Log.m105918d("MicroMsg.AlbumUtil", "sendVideo::data path[" + m1Var.mo119971i() + "] thumb path[" + i + "], exist: [" + C86013q1.m106450k(i) + ']');
                C7250m.m7431a().mo136262bz(context, str, m1Var.mo119971i(), i, 1, (int) dVar.mo55278R(), (tc4) null, false, false, "", "", dVar.mo55284U());
            }
        }
        MMHandlerThread.postToMainThread(this.f300028h);
    }

    public String toString() {
        return super.toString() + "|sendAlbumVideo";
    }
}
