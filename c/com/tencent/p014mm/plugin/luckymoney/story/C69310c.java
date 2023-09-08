package com.tencent.p014mm.plugin.luckymoney.story;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f32.C75675d;
import f32.C75676e;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.c */
public class C69310c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EnvelopeAppBarLayout f199580d;

    public C69310c(EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f199580d = envelopeAppBarLayout;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105918d("MicroMsg.EnvelopeAppBarLayout", "go to profile");
        if (this.f199580d.f199502g1) {
            Intent intent = new Intent();
            intent.putExtra("Contact_User", this.f199580d.f199493X0.f228184o);
            intent.putExtra("Contact_Scene", 240);
            if (!Util.isNullOrNil(this.f199580d.f199493X0.f228193x)) {
                String uri = Uri.parse(this.f199580d.f199493X0.f228193x).buildUpon().appendQueryParameter("fromscene", "2").appendQueryParameter("type", "1").build().toString();
                intent.putExtra("biz_profile_enter_from_luck_money_spring_event_url", uri);
                C75675d.f222283i = uri;
            }
            intent.putExtra("force_get_contact", true);
            C88144b.m109795m(this.f199580d.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, 2);
            C75676e.m90932a(7);
            C75675d.m90931a(13, this.f199580d.f199495Z0);
            C69315e0.f199604n++;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
