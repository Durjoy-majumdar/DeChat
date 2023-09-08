package com.tencent.p014mm.p136ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C114663g0;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75576f4;
import eb0.C97625j3;
import f40.C86709a0;
import nj3.C76879j;
import qo3.C77398g;

/* renamed from: com.tencent.mm.ui.x0 */
public class C116179x0 implements C75576f4.C75578b {

    /* renamed from: a */
    public final /* synthetic */ int f348679a;

    /* renamed from: b */
    public final /* synthetic */ ProgressDialog f348680b;

    /* renamed from: c */
    public final /* synthetic */ JSAPIUploadLogHelperUI f348681c;

    /* renamed from: com.tencent.mm.ui.x0$a */
    public class C116180a implements DialogInterface.OnDismissListener {
        public C116180a() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (!C116179x0.this.f348681c.isFinishing()) {
                C116179x0.this.f348681c.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.x0$b */
    public class C116181b implements C114663g0.C114666c {

        /* renamed from: a */
        public final /* synthetic */ DialogInterface.OnDismissListener f348683a;

        public C116181b(DialogInterface.OnDismissListener onDismissListener) {
            this.f348683a = onDismissListener;
        }

        /* renamed from: a */
        public void mo105672a(String str) {
            Log.m105920e("MicroMsg.JSAPIUploadLogHelperUI", "uploadLog call by jsapi, error happened.");
            ProgressDialog progressDialog = C116179x0.this.f348680b;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            C77398g i = C76879j.m92738i(C116179x0.this.f348681c, C0966R.string.k7r, C0966R.string.a3h);
            if (i != null) {
                i.setOnDismissListener(this.f348683a);
            }
            synchronized (JSAPIUploadLogHelperUI.f121148f) {
                JSAPIUploadLogHelperUI.f121147e = false;
            }
        }

        /* renamed from: b */
        public void mo105673b(String str, int i, long j, long j2) {
            if (i == 100) {
                Log.m105924i("MicroMsg.JSAPIUploadLogHelperUI", "uploadLog call by jsapi done.");
                ProgressDialog progressDialog = C116179x0.this.f348680b;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                C77398g i2 = C76879j.m92738i(C116179x0.this.f348681c, C0966R.string.k7v, C0966R.string.a3h);
                if (i2 != null) {
                    i2.setOnDismissListener(this.f348683a);
                }
                C115669n.INSTANCE.mo160131h(12975, Long.valueOf(System.currentTimeMillis() / 1000));
                synchronized (JSAPIUploadLogHelperUI.f121148f) {
                    JSAPIUploadLogHelperUI.f121147e = false;
                }
                return;
            }
            Log.m105925i("MicroMsg.JSAPIUploadLogHelperUI", "uploadLog call by jsapi, ipxx progress:%d", Integer.valueOf(i));
            ProgressDialog progressDialog2 = C116179x0.this.f348680b;
            if (progressDialog2 != null) {
                progressDialog2.setMessage(C116179x0.this.f348681c.getString(C0966R.string.k7s) + i + "%");
            }
        }
    }

    public C116179x0(JSAPIUploadLogHelperUI jSAPIUploadLogHelperUI, int i, ProgressDialog progressDialog) {
        this.f348681c = jSAPIUploadLogHelperUI;
        this.f348679a = i;
        this.f348680b = progressDialog;
    }

    /* renamed from: a */
    public void mo57753a(C114770g gVar) {
        synchronized (JSAPIUploadLogHelperUI.f121148f) {
            JSAPIUploadLogHelperUI.f121147e = true;
        }
        C116180a aVar = new C116180a();
        C97625j3.m125815e().mo123463i();
        Log.appenderFlush();
        C114663g0.m161244d(new int[]{this.f348679a}, C97625j3.m125811a(), (long) (C97625j3.m125811a() ? C86709a0.m107523b().mo121110g() : 0), 0, 24, (String) null, new C116181b(aVar));
    }
}
