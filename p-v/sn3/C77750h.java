package sn3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.transmit.RetransmitPreviewUI;
import j20.C117292a;
import k20.C9556a;
import nj3.C88990b;
import qo3.C77398g;

/* renamed from: sn3.h */
public final class C77750h implements C77398g.C77402i.C77404b {

    /* renamed from: a */
    public final /* synthetic */ C77745g f226570a;

    /* renamed from: b */
    public final /* synthetic */ String f226571b;

    public C77750h(C77745g gVar, String str) {
        this.f226570a = gVar;
        this.f226571b = str;
    }

    /* renamed from: a */
    public final void mo25a() {
        Intent intent = new Intent(this.f226570a.getContext(), RetransmitPreviewUI.class);
        intent.putExtra("Retr_Msg_content", this.f226571b);
        AppCompatActivity activity = this.f226570a.getActivity();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        AppCompatActivity appCompatActivity = activity;
        C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/ui/transmit/uic/ForwardVideoUIC$initContentClick$1", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(appCompatActivity, "com/tencent/mm/ui/transmit/uic/ForwardVideoUIC$initContentClick$1", "onContentClick", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C88990b.m111199h(this.f226570a.getContext());
    }
}
