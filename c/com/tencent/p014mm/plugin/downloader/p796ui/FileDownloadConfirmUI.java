package com.tencent.p014mm.plugin.downloader.p796ui;

import al3.C0086a;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C88989a;
import p206nj.C11171e;
import qo3.C77389a;
import qo3.C77398g;
import y41.C53491a;
import y41.C53493b;
import z41.C53736a;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.downloader.ui.FileDownloadConfirmUI */
public class FileDownloadConfirmUI extends MMBaseActivity {

    /* renamed from: e */
    public C77398g f110276e = null;

    /* renamed from: com.tencent.mm.plugin.downloader.ui.FileDownloadConfirmUI$a */
    public class C40975a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ long f110277d;

        public C40975a(FileDownloadConfirmUI fileDownloadConfirmUI, long j) {
            this.f110277d = j;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C40935l.m44326g().mo63970r(this.f110277d);
            Log.m105925i("MicroMsg.FileDownloadConfirmUI", "Remove task: %d", Long.valueOf(this.f110277d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.ui.FileDownloadConfirmUI$b */
    public class C40976b implements DialogInterface.OnClickListener {
        public C40976b(FileDownloadConfirmUI fileDownloadConfirmUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader.ui.FileDownloadConfirmUI$c */
    public class C40977c implements DialogInterface.OnDismissListener {
        public C40977c() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            FileDownloadConfirmUI.this.finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0966R.C0971layout.a3c);
        if (C11171e.m11046c(21)) {
            getWindow().setStatusBarColor(0);
        }
        long longExtra = getIntent().getLongExtra("extra_download_id", -1);
        C40975a aVar = new C40975a(this, longExtra);
        C40976b bVar = new C40976b(this);
        C40977c cVar = new C40977c();
        C77389a aVar2 = new C77389a();
        aVar2.f225644a = "";
        aVar2.f225660q = C0086a.m38a(this).getString(C0966R.string.cue);
        aVar2.f225663t = C0086a.m38a(this).getString(C0966R.string.a4h);
        aVar2.f225620C = aVar;
        aVar2.f225664u = C0086a.m38a(this).getString(C0966R.string.f360090a14);
        aVar2.f225621D = bVar;
        aVar2.f225623F = cVar;
        C77398g gVar = new C77398g(this, C0966R.style.a66);
        gVar.mo107525e(aVar2);
        this.f110276e = gVar;
        gVar.show();
        C53736a c = C40933j.m44314c(longExtra);
        if (c != null) {
            C53493b bVar2 = new C53493b();
            bVar2.mo74165a(c);
            C53491a.m60013c(19, bVar2);
        }
        Log.m105924i("MicroMsg.FileDownloadConfirmUI", "Confirm Dialog");
    }

    public void onNewIntent(Intent intent) {
        Log.m105924i("MicroMsg.FileDownloadConfirmUI", "onNewIntent");
    }

    public void onStop() {
        super.onStop();
        this.f110276e.dismiss();
    }
}
