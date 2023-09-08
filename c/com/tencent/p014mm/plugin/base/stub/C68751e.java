package com.tencent.p014mm.plugin.base.stub;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;
import com.tencent.p014mm.plugin.base.stub.C68748c;
import com.tencent.p014mm.pluginsdk.model.app.ReportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.base.stub.e */
public class C68751e implements C68748c.C68750b {

    /* renamed from: a */
    public final /* synthetic */ Bundle f197498a;

    /* renamed from: b */
    public final /* synthetic */ SendMessageToWX.Req f197499b;

    /* renamed from: c */
    public final /* synthetic */ UIEntryStub f197500c;

    /* renamed from: com.tencent.mm.plugin.base.stub.e$a */
    public class C68752a implements Runnable {
        public C68752a() {
        }

        public void run() {
            C68751e.this.f197500c.finish();
        }
    }

    public C68751e(UIEntryStub uIEntryStub, Bundle bundle, SendMessageToWX.Req req) {
        this.f197500c = uIEntryStub;
        this.f197498a = bundle;
        this.f197499b = req;
    }

    /* renamed from: a */
    public void mo94586a(boolean z) {
        boolean isFinishing = this.f197500c.isFinishing();
        Log.m105918d("MicroMsg.UIEntryStub", "onCheckEnd, isPass = " + z + ", isFinishing = " + isFinishing);
        if (!z || isFinishing) {
            ReportUtil.m84997c(this.f197500c, ReportUtil.m84995a(this.f197500c.getIntent().getExtras(), -3), true, false);
        } else {
            Intent intent = new Intent(this.f197500c, SendAppMessageWrapperUI.class);
            intent.putExtras(this.f197498a);
            intent.putExtra("Select_Conv_User", "weixinfile");
            intent.putExtra("SendAppMessageWrapper_Scene", this.f197499b.scene);
            UIEntryStub uIEntryStub = this.f197500c;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            UIEntryStub uIEntryStub2 = uIEntryStub;
            C117292a.m165358d(uIEntryStub2, aVar.mo10232b(), "com/tencent/mm/plugin/base/stub/UIEntryStub$2", "onCheckEnd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            uIEntryStub.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(uIEntryStub2, "com/tencent/mm/plugin/base/stub/UIEntryStub$2", "onCheckEnd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        new MMHandler().postDelayed(new C68752a(), 1000);
    }
}
