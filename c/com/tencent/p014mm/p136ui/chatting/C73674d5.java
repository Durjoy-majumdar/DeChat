package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.opensdk.modelmsg.ShowMessageFromWX;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.pluginsdk.model.app.C44550e0;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import di3.C86312j;
import java.util.HashMap;
import java.util.Map;
import ji3.C9457a;
import p763ym.C53543s;
import p763ym.C79138l;

/* renamed from: com.tencent.mm.ui.chatting.d5 */
public final class C73674d5 implements C73744l3 {

    /* renamed from: c */
    public static MStorageEvent<C73744l3, Bundle> f216319c = new C73675a();

    /* renamed from: a */
    public Context f216320a;

    /* renamed from: b */
    public final Map<String, ShowMessageFromWX.Req> f216321b = new HashMap();

    /* renamed from: com.tencent.mm.ui.chatting.d5$a */
    public class C73675a extends MStorageEvent<C73744l3, Bundle> {
        public void processEvent(Object obj, Object obj2) {
            ((C73744l3) obj).mo102141a((Bundle) obj2);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.d5$b */
    public class C73676b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f216322d;

        /* renamed from: e */
        public final /* synthetic */ String f216323e;

        /* renamed from: f */
        public final /* synthetic */ WXMediaMessage f216324f;

        /* renamed from: g */
        public final /* synthetic */ String f216325g;

        /* renamed from: h */
        public final /* synthetic */ C44580q1 f216326h;

        /* renamed from: com.tencent.mm.ui.chatting.d5$b$a */
        public class C73677a implements C44580q1 {

            /* renamed from: a */
            public final /* synthetic */ ShowMessageFromWX.Req f216328a;

            public C73677a(ShowMessageFromWX.Req req) {
                this.f216328a = req;
            }

            /* renamed from: a */
            public void mo1579a(boolean z, boolean z2) {
                if (z) {
                    Map<String, ShowMessageFromWX.Req> map = C73674d5.this.f216321b;
                    ShowMessageFromWX.Req req = this.f216328a;
                    ((HashMap) map).put(req.transaction, req);
                }
                C44580q1 q1Var = C73676b.this.f216326h;
                if (q1Var != null) {
                    q1Var.mo1579a(z, z2);
                }
            }
        }

        public C73676b(String str, String str2, WXMediaMessage wXMediaMessage, String str3, C44580q1 q1Var) {
            this.f216322d = str;
            this.f216323e = str2;
            this.f216324f = wXMediaMessage;
            this.f216325g = str3;
            this.f216326h = q1Var;
        }

        public void run() {
            Class cls = C79138l.class;
            String str = this.f216322d;
            if (Util.isNullOrNil(str)) {
                str = ((C44550e0) ((C53543s) C86312j.m106911c(C53543s.class)).mo74025px()).mo69342c(this.f216323e);
            }
            ShowMessageFromWX.Req Lw = ((C79138l) C86312j.m106911c(cls)).mo73995Lw(C73674d5.this.f216320a, this.f216324f, str);
            ((C79138l) C86312j.m106911c(cls)).Wo0(C73674d5.this.f216320a, this.f216325g, this.f216323e, Lw, new C73677a(Lw), (Bundle) null);
        }
    }

    public C73674d5(Context context) {
        this.f216320a = context;
    }

    /* renamed from: a */
    public void mo102141a(Bundle bundle) {
        String queryParameter = Uri.parse(bundle.getString(ConstantsAPI.CONTENT)).getQueryParameter("appid");
        Log.m105918d("MicroMsg.WXAppMessageShower", "handleResp, appid = " + queryParameter);
        ShowMessageFromWX.Resp resp = new ShowMessageFromWX.Resp(bundle);
        Log.m105924i("MicroMsg.WXAppMessageShower", "handleResp, errCode = " + resp.errCode + ", type = " + resp.getType());
        if (((ShowMessageFromWX.Req) ((HashMap) this.f216321b).get(resp.transaction)) == null) {
            Log.m105920e("MicroMsg.WXAppMessageShower", "invalid resp, check transaction failed, transaction=" + resp.transaction);
            return;
        }
        ((HashMap) this.f216321b).remove(resp.transaction);
    }

    /* renamed from: b */
    public void mo102719b(String str, WXMediaMessage wXMediaMessage, String str2, String str3, C44580q1 q1Var) {
        Log.m105919d("MicroMsg.WXAppMessageShower", "request pkg = %s, openId = %s", str, str3);
        C9457a.m9137a(new C73676b(str3, str2, wXMediaMessage, str, q1Var));
    }
}
