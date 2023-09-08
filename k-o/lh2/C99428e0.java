package lh2;

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

/* renamed from: lh2.e0 */
public final class C99428e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C109339f0 f291520d;

    /* renamed from: e */
    public final /* synthetic */ TextView f291521e;

    /* renamed from: lh2.e0$a */
    public static final class C61279a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<String> f174391d;

        /* renamed from: e */
        public final /* synthetic */ TextView f174392e;

        public C61279a(C8479f0<String> f0Var, TextView textView) {
            this.f174391d = f0Var;
            this.f174392e = textView;
        }

        public final void run() {
            Log.m105925i("MicroMsg.EditVideoPlayPlugin", "DEBUG showVideoDebugInfoIfNeed %s", this.f174391d.f27484d);
            this.f174392e.setVisibility(0);
            this.f174392e.setText((CharSequence) this.f174391d.f27484d);
        }
    }

    public C99428e0(C109339f0 f0Var, TextView textView) {
        this.f291520d = f0Var;
        this.f291521e = textView;
    }

    public final void run() {
        C8479f0 f0Var = new C8479f0();
        C98324b bVar = this.f291520d.f327327i;
        f0Var.f27484d = C97842b.m126293j(bVar != null ? bVar.f288180a : null);
        f0Var.f27484d = ((String) f0Var.f27484d) + "\n针对拍摄视频：\n";
        f0Var.f27484d = ((String) f0Var.f27484d) + "是否使用CPU预览裁剪方式：" + C98452d.f288771a + 10;
        f0Var.f27484d = ((String) f0Var.f27484d) + "是否使用两路流录制：" + C98452d.f288772b + 10;
        T t = ((String) f0Var.f27484d) + "预览页视频个数：" + C98452d.f288773c + 10;
        f0Var.f27484d = t;
        if (!Util.isNullOrNil((String) t)) {
            if (!MMApplicationContext.isMainProcess() || C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_LOCAL_SIGHT_DEBUGINFO_INT_SYNC, 0) == 1) {
                MMHandlerThread.postToMainThread(new C61279a(f0Var, this.f291521e));
            }
        }
    }
}
