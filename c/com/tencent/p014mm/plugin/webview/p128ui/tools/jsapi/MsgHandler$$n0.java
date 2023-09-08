package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.Map;
import lg3.C76697h;
import nj3.C76879j;
import p158gt.C8451i;
import rb0.C48009v0;
import sb0.C48334c;
import sb0.C48340e;
import t83.C13851h1;
import wd3.C65953v0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$n0 */
public class MsgHandler$$n0 implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ String f22823a;

    /* renamed from: b */
    public final /* synthetic */ long f22824b;

    /* renamed from: c */
    public final /* synthetic */ C44561j f22825c;

    /* renamed from: d */
    public final /* synthetic */ String f22826d;

    /* renamed from: e */
    public final /* synthetic */ String f22827e;

    /* renamed from: f */
    public final /* synthetic */ C13851h1 f22828f;

    /* renamed from: g */
    public final /* synthetic */ MsgHandler f22829g;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$n0$a */
    public class C6192a implements C8451i.C8452a {

        /* renamed from: a */
        public final /* synthetic */ String f22830a;

        public C6192a(String str) {
            this.f22830a = str;
        }

        /* renamed from: a */
        public void mo24a(Bitmap bitmap, byte[] bArr) {
            MsgHandler msgHandler = MsgHandler$$n0.this.f22829g;
            char[] cArr = MsgHandler.f22653Q0;
            msgHandler.getClass();
            C48334c a0 = C48009v0.Ax0().mo73042a0(MsgHandler$$n0.this.f22824b);
            synchronized (C48340e.f129429d) {
                String j = C48340e.m53669j();
                C48340e.m53670k(a0);
                MsgHandler$$n0 msgHandler$$n0 = MsgHandler$$n0.this;
                msgHandler$$n0.f22829g.mo7178T5(msgHandler$$n0.f22825c, msgHandler$$n0.f22826d, msgHandler$$n0.f22827e, msgHandler$$n0.f22823a, (String) null, (String) null, this.f22830a, (String) null);
                C48340e.m53662c(j);
            }
            MsgHandler$$n0 msgHandler$$n02 = MsgHandler$$n0.this;
            msgHandler$$n02.f22829g.mo7210k5(msgHandler$$n02.f22828f, "sendEnterpriseChat:ok", (Map<String, Object>) null);
            Context context = MsgHandler$$n0.this.f22829g.f22697d;
            if (context != null) {
                C76879j.m92726T(context, C76697h.m92348a(context).getString(C0966R.string.f360099a34));
            }
        }
    }

    public MsgHandler$$n0(MsgHandler msgHandler, String str, long j, C44561j jVar, String str2, String str3, C13851h1 h1Var) {
        this.f22829g = msgHandler;
        this.f22823a = str;
        this.f22824b = j;
        this.f22825c = jVar;
        this.f22826d = str2;
        this.f22827e = str3;
        this.f22828f = h1Var;
    }

    /* renamed from: a */
    public void mo23a(boolean z, String str, int i) {
        if (!z) {
            this.f22829g.mo7210k5(this.f22828f, "sendEnterpriseChat:cancel", (Map<String, Object>) null);
        } else if (Util.isNullOrNil(this.f22823a)) {
            C48334c a0 = C48009v0.Ax0().mo73042a0(this.f22824b);
            synchronized (C48340e.f129429d) {
                String j = C48340e.m53669j();
                C48340e.m53670k(a0);
                this.f22829g.mo7178T5(this.f22825c, this.f22826d, this.f22827e, this.f22823a, (String) null, (String) null, str, (String) null);
                C48340e.m53662c(j);
            }
            this.f22829g.mo7210k5(this.f22828f, "sendEnterpriseChat:ok", (Map<String, Object>) null);
            Context context = this.f22829g.f22697d;
            if (context != null) {
                C76879j.m92726T(context, C76697h.m92348a(context).getString(C0966R.string.f360099a34));
            }
        } else {
            ((C8451i) C86312j.m106911c(C8451i.class)).mo9375mT(this.f22823a, new C6192a(str));
        }
    }
}
