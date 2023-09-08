package i13;

import android.view.View;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72788g0;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72825s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import i13.C76259g;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: i13.h */
public final class C76264h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76259g f223451d;

    public C76264h(C76259g gVar) {
        this.f223451d = gVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.TransVoiceDialog", "sendVoiceMsg onClick.");
        C76259g gVar = this.f223451d;
        C76259g.C76262c cVar = gVar.f223440y0;
        boolean z = false;
        if (cVar != null) {
            String str = gVar.f223399D;
            Long valueOf = Long.valueOf(gVar.f223398C);
            C72788g0 g0Var = (C72788g0) cVar;
            Log.m105925i("MicroMsg.ChatFooter", "onVoiceMsgSend, fileName: %s.", str);
            int intValue = valueOf != null ? valueOf.intValue() : 0;
            C72825s0 s0Var = g0Var.f212149a.f211780L;
            if (true == (s0Var != null ? s0Var.mo100651F(str, intValue) : false)) {
                z = true;
            }
        }
        if (z) {
            this.f223451d.f223400E = true;
        }
        this.f223451d.mo106510K(7);
        C117292a.m165361g(this, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$init$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
