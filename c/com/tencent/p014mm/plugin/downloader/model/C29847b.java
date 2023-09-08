package com.tencent.p014mm.plugin.downloader.model;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCLong;
import com.tencent.p014mm.ipcinvoker.wx_extension.service.MainProcessIPCService;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.downloader.model.DownloadChecker;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.xweb.WebView;
import j20.C117292a;
import java.lang.ref.WeakReference;
import k20.C9556a;
import nj3.C76879j;
import p910lj.C76701a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.downloader.model.b */
public class C29847b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ DownloadChecker.DownloadInterceptBean f80892d;

    /* renamed from: e */
    public final /* synthetic */ DownloadChecker.C29843a f80893e;

    /* renamed from: com.tencent.mm.plugin.downloader.model.b$a */
    public class C29848a implements C1256g<IPCLong> {
        public C29848a(C29847b bVar) {
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCLong iPCLong = (IPCLong) obj;
            if (iPCLong != null && iPCLong.f10314d > 0) {
                ((C119157j) C119157j.f356862d).mo183895z(new C29846a(this));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.b$b */
    public class C29849b implements DialogInterface.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.downloader.model.b$b$a */
        public class C29850a implements C1256g<IPCLong> {
            public C29850a(C29849b bVar) {
            }

            /* renamed from: a */
            public void mo894a(Object obj) {
                IPCLong iPCLong = (IPCLong) obj;
                if (iPCLong != null && iPCLong.f10314d > 0) {
                    ((C119157j) C119157j.f356862d).mo183895z(new C29852c(this));
                }
            }
        }

        public C29849b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C80907o.m98781d(MainProcessIPCService.f108404e, C29847b.this.f80892d, DownloadChecker.C29845b.class, new C29850a(this));
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.model.b$c */
    public class C29851c implements DialogInterface.OnClickListener {
        public C29851c(C29847b bVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public C29847b(DownloadChecker.C29843a aVar, DownloadChecker.DownloadInterceptBean downloadInterceptBean) {
        this.f80893e = aVar;
        this.f80892d = downloadInterceptBean;
    }

    public void run() {
        WebView webView;
        WeakReference weakReference = this.f80893e.f80890d;
        Context context = null;
        if (weakReference == null || weakReference.get() == null) {
            webView = null;
        } else {
            webView = (WebView) this.f80893e.f80890d.get();
            if (webView != null) {
                context = webView.getContext();
            }
        }
        DownloadChecker.DownloadInterceptBean downloadInterceptBean = this.f80892d;
        if (downloadInterceptBean != null && downloadInterceptBean.f80875d) {
            Log.m105925i("MicroMsg.DownloadChecker", "confirm type: %d", Integer.valueOf(downloadInterceptBean.f80876e));
            if (context == null) {
                context = MMApplicationContext.getContext();
            }
            Context context2 = context;
            DownloadChecker.DownloadInterceptBean downloadInterceptBean2 = this.f80892d;
            int i = downloadInterceptBean2.f80876e;
            if (i != 0) {
                if (i == 1) {
                    Intent intent = new Intent();
                    intent.setClassName(context2, "com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI");
                    intent.putExtra("task_name", this.f80892d.f80879h);
                    intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f80892d.f80879h);
                    intent.putExtra("thumb_url", this.f80892d.f80880i);
                    intent.putExtra("task_url", this.f80892d.f80881j);
                    intent.putExtra("alternative_url", this.f80892d.f80882n);
                    intent.putExtra("task_size", this.f80892d.f80883o);
                    intent.putExtra("file_md5", this.f80892d.f80885q);
                    intent.putExtra("fileType", 1);
                    intent.putExtra("appid", this.f80892d.f80878g);
                    intent.putExtra("package_name", this.f80892d.f80884p);
                    if (webView != null) {
                        intent.putExtra("page_url", webView.getUrl());
                    }
                    intent.putExtra("page_scene", -1);
                    intent.putExtra("task_scene", 8070);
                    intent.addFlags(268435456);
                    Context context3 = MMApplicationContext.getContext();
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    Context context4 = context3;
                    C117292a.m165358d(context4, aVar.mo10232b(), "com/tencent/mm/plugin/downloader/model/DownloadChecker$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context3.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context4, "com/tencent/mm/plugin/downloader/model/DownloadChecker$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (i == 2) {
                    Log.m105925i("MicroMsg.DownloadChecker", "coonfirm url: %s", downloadInterceptBean2.f80877f);
                }
            } else if (!NetStatusUtil.isNetworkConnected(MMApplicationContext.getContext())) {
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.f8t), 0).show();
                Log.m105924i("MicroMsg.DownloadChecker", "startDownload fail, network not ready");
            } else if (NetStatusUtil.isWifi(MMApplicationContext.getContext()) || !(context2 instanceof MMActivity) || ((MMActivity) context2).isFinishing()) {
                C80907o.m98781d(MainProcessIPCService.f108404e, this.f80892d, DownloadChecker.C29845b.class, new C29848a(this));
            } else {
                C76879j.m92710D(context2, MMApplicationContext.getResources().getString(C0966R.string.lfa), MMApplicationContext.getResources().getString(C0966R.string.lfb), MMApplicationContext.getResources().getString(C0966R.string.lf6), MMApplicationContext.getResources().getString(C0966R.string.f7926wf), false, new C29849b(), new C29851c(this), C0966R.color.akw);
            }
        } else if (webView != null) {
            webView.loadUrl(this.f80893e.f80891e);
            Log.m105924i("MicroMsg.DownloadChecker", "reload apk");
        }
    }
}
