package com.tencent.p014mm.plugin.profile.p088ui;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.profile.C42599h;
import com.tencent.p014mm.plugin.profile.p088ui.NormalUserFooterPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p214om.C11502f;

/* renamed from: com.tencent.mm.plugin.profile.ui.e2 */
public class C70265e2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NormalUserFooterPreference.C70154c f203019d;

    public C70265e2(NormalUserFooterPreference.C70154c cVar) {
        this.f203019d = cVar;
    }

    public void onClick(View view) {
        Class cls = C11502f.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$BaseHandler$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105925i("MicroMsg.NormalUserFooterPreference", "sendButton onClick %s", NormalUserFooterPreference.this.f202624J.getUsername());
        NormalUserFooterPreference.C70154c cVar = this.f203019d;
        NormalUserFooterPreference normalUserFooterPreference = NormalUserFooterPreference.this;
        if (normalUserFooterPreference.f202638U) {
            String username = normalUserFooterPreference.f202624J.getUsername();
            Intent intent = new Intent();
            intent.addFlags(67108864);
            if (NormalUserFooterPreference.this.f202625K) {
                intent.putExtra("Chat_User", username);
                intent.putExtra("Chat_Mode", 1);
                ((Activity) NormalUserFooterPreference.this.f121274d).setResult(-1, intent);
            } else {
                intent.putExtra("Chat_User", username);
                intent.putExtra("Chat_Mode", 1);
                ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93173f(intent, NormalUserFooterPreference.this.f121274d);
            }
        } else {
            cVar.getClass();
            Intent intent2 = new Intent();
            intent2.addFlags(67108864);
            NormalUserFooterPreference normalUserFooterPreference2 = NormalUserFooterPreference.this;
            if (normalUserFooterPreference2.f202625K) {
                intent2.putExtra("Chat_User", normalUserFooterPreference2.f202624J.getUsername());
                intent2.putExtra("Chat_Mode", 1);
                ((Activity) NormalUserFooterPreference.this.f121274d).setResult(-1, intent2);
            } else {
                intent2.putExtra("Chat_User", normalUserFooterPreference2.f202624J.getUsername());
                intent2.putExtra("Chat_Mode", 1);
                ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93173f(intent2, NormalUserFooterPreference.this.f121274d);
            }
        }
        C42599h.xx0(NormalUserFooterPreference.this.f202653d1.getIntent(), 4, 1, NormalUserFooterPreference.this.f202624J.getUsername());
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$BaseHandler$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
