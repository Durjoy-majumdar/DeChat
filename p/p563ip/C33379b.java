package p563ip;

import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C29810b1;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.OpenVoiceVoIPInterruptListener;
import di3.C86301e;
import ei3.C86522b;
import p576jp.C33610c;
import p576jp.C33612d;
import p576jp.C88007b;

@C86522b
/* renamed from: ip.b */
public class C33379b extends C86301e implements C88007b {
    /* renamed from: Bp */
    public C33610c mo59116Bp() {
        return C105181w.INSTANCE;
    }

    public boolean Ym0() {
        boolean z;
        C29810b1 b1Var = C29810b1.INSTANCE;
        synchronized (b1Var) {
            z = b1Var.f80822d;
        }
        return z;
    }

    public C33612d z50() {
        return new OpenVoiceVoIPInterruptListener();
    }
}
