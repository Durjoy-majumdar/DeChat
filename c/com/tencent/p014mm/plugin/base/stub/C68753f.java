package com.tencent.p014mm.plugin.base.stub;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.plugin.base.stub.C68748c;
import com.tencent.p014mm.pluginsdk.model.app.ReportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.base.stub.f */
public class C68753f implements C68748c.C68750b {

    /* renamed from: a */
    public final /* synthetic */ Bundle f197502a;

    /* renamed from: b */
    public final /* synthetic */ SendMessageToWX.Req f197503b;

    /* renamed from: c */
    public final /* synthetic */ UIEntryStub f197504c;

    /* renamed from: com.tencent.mm.plugin.base.stub.f$a */
    public class C68754a implements Runnable {
        public C68754a() {
        }

        public void run() {
            C68753f.this.f197504c.finish();
        }
    }

    public C68753f(UIEntryStub uIEntryStub, Bundle bundle, SendMessageToWX.Req req) {
        this.f197504c = uIEntryStub;
        this.f197502a = bundle;
        this.f197503b = req;
    }

    /* renamed from: a */
    public void mo94586a(boolean z) {
        boolean isFinishing = this.f197504c.isFinishing();
        String string = this.f197502a.getString("SendAppMessageWrapper_UserName", "");
        Log.m105924i("MicroMsg.UIEntryStub", "onCheckEnd, isPass = " + z + ", isFinishing = " + isFinishing + ", username = " + string);
        if (!z || isFinishing || Util.isNullOrNil(string)) {
            ReportUtil.m84997c(this.f197504c, ReportUtil.m84995a(this.f197504c.getIntent().getExtras(), -3), true, false);
        } else {
            Intent intent = new Intent(this.f197504c, ChattingUI.class);
            intent.putExtras(this.f197502a);
            intent.putExtra("finish_direct", false);
            intent.putExtra("Chat_User", string);
            intent.putExtra("SendAppMessageWrapper_Scene", this.f197503b.scene);
            if (this.f197503b.message.getType() == 45) {
                intent.putExtra("Select_Send_Card", true);
            }
            UIEntryStub uIEntryStub = this.f197504c;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            UIEntryStub uIEntryStub2 = uIEntryStub;
            C117292a.m165358d(uIEntryStub2, aVar.mo10232b(), "com/tencent/mm/plugin/base/stub/UIEntryStub$3", "onCheckEnd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            uIEntryStub.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(uIEntryStub2, "com/tencent/mm/plugin/base/stub/UIEntryStub$3", "onCheckEnd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        new MMHandler().postDelayed(new C68754a(), 1000);
    }
}
