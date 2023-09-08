package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Context;
import android.view.MenuItem;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C55268k;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C31543z5;
import h81.C32735h;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89132b;
import p270xi.C91212b;
import p287zz.C79442f;
import qo3.C77407n;
import zj3.C79378q0;

@C91212b(exportInterface = C79378q0.class)
/* renamed from: com.tencent.mm.ui.chatting.component.c4 */
public class C73452c4 extends C73412a implements C79378q0, C11385n {

    /* renamed from: com.tencent.mm.ui.chatting.component.c4$a */
    public class C73453a implements C11182m0 {
        public C73453a() {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107142f(1, C73452c4.this.f215752d.mo91565f().getString(C0966R.string.a18));
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.c4$b */
    public class C73454b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f215837d;

        public C73454b(C72963f4 f4Var) {
            this.f215837d = f4Var;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            boolean z = true;
            if (menuItem.getItemId() == 1) {
                C73452c4 c4Var = C73452c4.this;
                C72963f4 f4Var = this.f215837d;
                c4Var.getClass();
                long createTime = f4Var.getCreateTime();
                if (C31543z5.m39453c() - createTime <= ((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_android_transfer_revoke_timelimit, 120000)) {
                    z = false;
                }
                if (z) {
                    C76879j.m92754y(c4Var.f215752d.mo91565f(), c4Var.f215752d.mo91565f().getString(C0966R.string.bb9), "", c4Var.f215752d.mo91572m().getString(C0966R.string.f8029zr), new C73463d4(c4Var));
                    return;
                }
                String content = f4Var.getContent();
                if (content == null) {
                    Log.m105924i("MicroMsg.RemittanceRevokeComponent", "xml is null");
                    return;
                }
                C68070l.C68072b u = C68070l.C68072b.m80422u(content, f4Var.mo108775z2());
                if (u == null) {
                    Log.m105924i("MicroMsg.RemittanceRevokeComponent", "content is null");
                    return;
                }
                C55268k kVar = (C55268k) u.mo93555w(C55268k.class);
                if (kVar == null) {
                    Log.m105924i("MicroMsg.RemittanceRevokeComponent", "piece is null");
                    return;
                }
                C89132b Cv = ((C79442f) C86312j.m106911c(C79442f.class)).mo109151Cv(kVar.f157427c, c4Var.f215752d.mo91577r(), u.f195501J0);
                C67391b bVar = c4Var.f215752d;
                bVar.mo91552M(bVar.mo91565f(), (String) null, c4Var.f215752d.mo91572m().getString(C0966R.string.bb7), true, true, new C44820e4(c4Var, f4Var, Cv));
                Cv.mo9225i().mo123064p(new C44822g4(c4Var, f4Var));
            }
        }
    }

    /* renamed from: j2 */
    public void mo102403j2(C72963f4 f4Var) {
        C77407n nVar = new C77407n((Context) this.f215752d.mo91565f(), 1, true);
        nVar.f225771i = new C73453a();
        nVar.f225782p = new C73454b(f4Var);
        long j = 120000;
        long He = ((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_android_transfer_revoke_timelimit, 120000);
        if (He > 0) {
            j = He;
        }
        int round = Math.round(((float) j) / 60000.0f);
        nVar.mo107568m(this.f215752d.mo91565f().getString(C0966R.string.bb_, new Object[]{Integer.valueOf(round)}), 17, 0);
        nVar.mo107573q();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
    }
}
