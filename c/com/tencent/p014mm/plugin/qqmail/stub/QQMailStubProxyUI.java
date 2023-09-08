package com.tencent.p014mm.plugin.qqmail.stub;

import android.os.Bundle;
import android.os.Looper;
import com.tencent.p014mm.autogen.events.NeedVerifyQQEvent;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import com.tencent.p014mm.plugin.qqmail.p090ui.C85396g;
import com.tencent.p014mm.plugin.qqmail.p090ui.C85397h;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C88989a;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.qqmail.stub.QQMailStubProxyUI */
public class QQMailStubProxyUI extends HellActivity {

    /* renamed from: com.tencent.mm.plugin.qqmail.stub.QQMailStubProxyUI$a */
    public class C85362a extends C85397h.C85398a {

        /* renamed from: a */
        public final /* synthetic */ C85397h f248726a;

        public C85362a(C85397h hVar) {
            this.f248726a = hVar;
        }

        /* renamed from: a */
        public void mo118649a() {
            Log.m105918d("MicroMsg.QQMail.QQMailStubProxyUI", "onAfterVerify");
            this.f248726a.mo118714a();
            QQMailStubProxyUI.this.setResult(-1);
            QQMailStubProxyUI.this.finish();
        }

        /* renamed from: b */
        public void mo118650b() {
            Log.m105920e("MicroMsg.QQMail.QQMailStubProxyUI", "onVerifyFail, finish self");
            this.f248726a.mo118714a();
            QQMailStubProxyUI.this.setResult(0);
            QQMailStubProxyUI.this.finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105918d("MicroMsg.QQMail.QQMailStubProxyUI", "onCreate");
        C85397h hVar = new C85397h(this);
        hVar.f248854d = new C85362a(hVar);
        NeedVerifyQQEvent needVerifyQQEvent = new NeedVerifyQQEvent();
        NeedVerifyQQEvent.C80730a aVar = needVerifyQQEvent.f236243d;
        aVar.f236245a = hVar.f248855e;
        aVar.f236246b = new C85396g(hVar, needVerifyQQEvent);
        needVerifyQQEvent.asyncPublish(Looper.myLooper());
    }
}
