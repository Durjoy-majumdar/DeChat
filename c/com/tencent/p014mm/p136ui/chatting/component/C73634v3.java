package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Intent;
import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;
import com.tencent.p014mm.pluginsdk.model.app.ReportUtil;
import ke3.C88144b;
import p270xi.C53356d;

/* renamed from: com.tencent.mm.ui.chatting.component.v3 */
public class C73634v3 extends C73412a implements C53356d {

    /* renamed from: com.tencent.mm.ui.chatting.component.v3$a */
    public class C73635a implements C88144b.C76564c {

        /* renamed from: a */
        public final /* synthetic */ Intent f216210a;

        public C73635a(Intent intent) {
            this.f216210a = intent;
        }

        public void onActivityResult(int i, int i2, Intent intent) {
            this.f216210a.removeExtra("SendAppMessageWrapper_Scene");
            if (i != 228) {
                return;
            }
            if (i2 != -1) {
                ReportUtil.m84997c(C73634v3.this.f215752d.mo91565f(), ReportUtil.m84995a(this.f216210a.getExtras(), 0), true, true);
                if (!C73634v3.this.f215752d.mo91565f().isFinishing()) {
                    C73634v3.this.f215752d.mo91565f().finish();
                }
            } else if (intent != null && intent.getBooleanExtra("Select_stay_in_wx", false)) {
                ReportUtil.m84998d(false, 0);
            } else if (!C73634v3.this.f215752d.mo91565f().isFinishing()) {
                C73634v3.this.f215752d.mo91565f().finish();
            }
        }
    }

    /* renamed from: N5 */
    public void mo70052N5(int i, int i2, Intent intent) {
    }

    /* renamed from: e */
    public void mo70065e() {
        Intent intent = this.f215752d.mo91565f().getIntent();
        if (intent.getIntExtra("SendAppMessageWrapper_Scene", 0) == 3) {
            intent.setClass(this.f215752d.mo91565f(), SendAppMessageWrapperUI.class);
            intent.putExtra("Select_Conv_User", this.f215752d.mo91577r());
            this.f215752d.mo91557R(intent, 228, new C73635a(intent));
        }
    }
}
