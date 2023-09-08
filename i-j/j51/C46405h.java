package j51;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C40319a0;
import com.tencent.p014mm.plugin.downloader_app.model.C29855f0;
import com.tencent.p014mm.plugin.downloader_app.model.C40983c;
import com.tencent.p014mm.plugin.downloader_app.model.C40984c0;
import com.tencent.p014mm.plugin.downloader_app.model.C40986d0;
import com.tencent.p014mm.plugin.downloader_app.model.C40990e0;
import com.tencent.p014mm.plugin.downloader_app.p039ui.DownloadMainUI;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;

/* renamed from: j51.h */
public class C46405h implements C40986d0.C40988b {

    /* renamed from: a */
    public final /* synthetic */ String f125010a;

    /* renamed from: b */
    public final /* synthetic */ DownloadMainUI f125011b;

    /* renamed from: j51.h$a */
    public class C46406a implements Runnable {
        public C46406a() {
        }

        public void run() {
            View view = C46405h.this.f125011b.f110438p;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: j51.h$b */
    public class C46407b implements Runnable {

        /* renamed from: j51.h$b$a */
        public class C46408a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C40990e0 f125014d;

            public C46408a(C40990e0 e0Var) {
                this.f125014d = e0Var;
            }

            public void run() {
                C40983c.m44420b(C46405h.this.f125011b, this.f125014d, true);
            }
        }

        public C46407b() {
        }

        public void run() {
            if (!Util.isNullOrNil(C46405h.this.f125010a)) {
                C46405h hVar = C46405h.this;
                C40984c0 c0Var = hVar.f125011b.f110434i;
                C40990e0 e0Var = (C40990e0) ((HashMap) c0Var.f110321b).get(hVar.f125010a);
                if (e0Var != null) {
                    C29855f0.m38890a(C46405h.this.f125010a);
                    C40319a0.m43496d(new C46408a(e0Var), 200);
                } else {
                    DownloadMainUI downloadMainUI = C46405h.this.f125011b;
                    C76879j.m92748s(downloadMainUI, "", downloadMainUI.getResources().getString(C0966R.string.h9o));
                }
            }
            DownloadMainUI downloadMainUI2 = C46405h.this.f125011b;
            downloadMainUI2.mo64056I7(downloadMainUI2.f110434i, true);
        }
    }

    public C46405h(DownloadMainUI downloadMainUI, String str) {
        this.f125011b = downloadMainUI;
        this.f125010a = str;
    }

    /* renamed from: a */
    public void mo64008a(boolean z) {
        C40319a0.m43495c(true, new C46406a());
        if (z) {
            this.f125011b.f110434i = C40986d0.m44429a();
            MMHandlerThread.postToMainThread(new C46407b());
        } else if (!Util.isNullOrNil(this.f125010a)) {
            DownloadMainUI downloadMainUI = this.f125011b;
            C76879j.m92748s(downloadMainUI, "", downloadMainUI.getResources().getString(C0966R.string.f360235b30));
        }
    }
}
