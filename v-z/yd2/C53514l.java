package yd2;

import android.content.DialogInterface;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import p640ox.C77049b;
import te3.C50107kb3;

/* renamed from: yd2.l */
public final class C53514l implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C79076g f150469d;

    public C53514l(C79076g gVar) {
        this.f150469d = gVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C79076g gVar = C79076g.f232207s;
        C79076g.f232207s = null;
        this.f150469d.f232217r.stopTimer();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).x90().E20(WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS, this.f150469d);
        C50107kb3 kb32 = (C50107kb3) ((C77049b) C86312j.m106911c(C77049b.class)).mo72351Ok(this.f150469d.f232208f, 4, C50107kb3.class);
        if (kb32 != null) {
            kb32.f136647d = 0;
        }
    }
}
