package a33;

import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import f72.C97842b;
import gy3.C8479f0;
import h90.C98324b;
import hi2.C98452d;

/* renamed from: a33.c */
public final class C91949c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91950d f263234d;

    /* renamed from: e */
    public final /* synthetic */ TextView f263235e;

    /* renamed from: a33.c$a */
    public static final class C53977a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<String> f151224d;

        /* renamed from: e */
        public final /* synthetic */ TextView f151225e;

        public C53977a(C8479f0<String> f0Var, TextView textView) {
            this.f151224d = f0Var;
            this.f151225e = textView;
        }

        public final void run() {
            Log.m105925i("MicroMsg.EditVideoPreviewPlugin", "DEBUG showVideoDebugInfoIfNeed %s", this.f151224d.f27484d);
            this.f151225e.setVisibility(0);
            this.f151225e.setText((CharSequence) this.f151224d.f27484d);
        }
    }

    public C91949c(C91950d dVar, TextView textView) {
        this.f263234d = dVar;
        this.f263235e = textView;
    }

    public final void run() {
        C8479f0 f0Var = new C8479f0();
        C98324b bVar = this.f263234d.f263241i;
        f0Var.f27484d = C97842b.m126293j(bVar != null ? bVar.f288180a : null);
        f0Var.f27484d = ((String) f0Var.f27484d) + "\n针对拍摄视频：\n";
        f0Var.f27484d = ((String) f0Var.f27484d) + "是否使用CPU预览裁剪方式：" + C98452d.f288771a + 10;
        f0Var.f27484d = ((String) f0Var.f27484d) + "是否使用两路流录制：" + C98452d.f288772b + 10;
        T t = ((String) f0Var.f27484d) + "预览页视频个数：" + C98452d.f288773c + 10;
        f0Var.f27484d = t;
        if (!Util.isNullOrNil((String) t)) {
            if (!MMApplicationContext.isMainProcess() || C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, 0) == 1) {
                MMHandlerThread.postToMainThread(new C53977a(f0Var, this.f263235e));
            }
        }
    }
}
