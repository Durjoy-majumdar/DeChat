package ml3;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75045z;
import com.tencent.p014mm.p136ui.conversation.BaseConversationUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44660i2;
import di3.C86312j;
import eb0.C45618p;
import eb0.C97625j3;
import ml3.C47058a;
import nj3.C11184p0;
import nj3.C76879j;
import p680ru.C77569h;
import rb0.C48009v0;
import sb0.C48327a;
import sb0.C48329b;

/* renamed from: ml3.c */
public class C47063c implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C47058a.C47060b f126483d;

    /* renamed from: ml3.c$a */
    public class C47064a implements Runnable {
        public C47064a() {
        }

        public void run() {
            C48009v0.Dx0().mo73031qq(C47063c.this.f126483d.f126480j);
            if (C48009v0.Dx0().mo73025bD(C47063c.this.f126483d.f126479i) <= 0) {
                ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f(C47063c.this.f126483d.f126479i);
            }
        }
    }

    public C47063c(C47058a.C47060b bVar) {
        this.f126483d = bVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = C77569h.class;
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            C47058a.C47060b bVar = this.f126483d;
            long j = bVar.f126480j;
            Log.m105924i("BizChatConversationPresenter", "deleteChatroom");
            C48009v0.Ax0().mo73042a0(j);
            bVar.f126476f = false;
            BaseConversationUI baseConversationUI = C47058a.this.f126470d;
            bVar.f126477g = C76879j.m92723Q(baseConversationUI, baseConversationUI.getString(C0966R.string.a3h), C47058a.this.f126470d.getString(C0966R.string.a4d), true, true, new C47065d(bVar));
            C45618p.m50717a(bVar.f126479i, j, new C47066e(bVar, j));
        } else if (itemId == 1) {
            C48327a Yt = C48009v0.Dx0().mo73024Yt(this.f126483d.f126480j);
            Yt.field_unReadCount = 1;
            Yt.field_atCount = 0;
            Yt.field_atAll = 0;
            C48009v0.Dx0().mo73020LL(Yt);
            ((C77569h) C86312j.m106911c(cls)).mo35236XG(true, Yt.field_brandUserName, true);
        } else if (itemId == 2) {
            C48009v0.Dx0().mo73019DN(this.f126483d.f126480j);
            ((C77569h) C86312j.m106911c(cls)).mo35236XG(true, C48009v0.Dx0().mo73024Yt(this.f126483d.f126480j).field_brandUserName, false);
        } else if (itemId == 3) {
            C48327a Yt2 = C48009v0.Dx0().mo73024Yt(this.f126483d.f126480j);
            C48329b Dx0 = C48009v0.Dx0();
            if (Dx0.mo73026bF(Dx0.mo73024Yt(this.f126483d.f126480j))) {
                C47058a.C47060b.m52376a(this.f126483d, false, 16);
                C48009v0.Dx0().mo73030mL(this.f126483d.f126480j);
                ((C77569h) C86312j.m106911c(cls)).mo35230Fx(true, Yt2.field_brandUserName, false);
                return;
            }
            C47058a.C47060b.m52376a(this.f126483d, true, 16);
            C48009v0.Dx0().mo73029mI(this.f126483d.f126480j);
            ((C77569h) C86312j.m106911c(cls)).mo35230Fx(true, Yt2.field_brandUserName, true);
        } else if (itemId == 4) {
            C75045z.m90001b(C47058a.this.f126470d, new C47064a());
        }
    }
}
