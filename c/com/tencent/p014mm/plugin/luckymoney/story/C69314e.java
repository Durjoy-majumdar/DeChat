package com.tencent.p014mm.plugin.luckymoney.story;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f32.C75675d;
import f32.C75676e;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import org.json.JSONObject;
import te3.C49712hj1;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.e */
public class C69314e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ EnvelopeAppBarLayout f199590d;

    public C69314e(EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f199590d = envelopeAppBarLayout;
    }

    public void onClick(View view) {
        Class cls = C60200t1.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105918d("MicroMsg.EnvelopeAppBarLayout", "go to mini app");
        if (this.f199590d.f199502g1) {
            Intent intent = new Intent();
            ((C60200t1) C86312j.m106911c(cls)).mo76842e7(10, 2, 32, intent);
            intent.putExtra("finder_username", this.f199590d.f199493X0.f228184o);
            if (!Util.isNullOrNil(this.f199590d.f199493X0.f228193x)) {
                String uri = Uri.parse(this.f199590d.f199493X0.f228193x).buildUpon().appendQueryParameter("fromscene", "2").appendQueryParameter("type", "2").build().toString();
                intent.putExtra("key_same_receive_link", uri);
                C75675d.f222283i = uri;
                Log.m105925i("MicroMsg.EnvelopeAppBarLayout", "same_receive_link is %s", uri);
            } else {
                Log.m105924i("MicroMsg.EnvelopeAppBarLayout", "same_receive_link is null");
            }
            intent.putExtra("key_packet_id", this.f199590d.f199493X0.f228186q);
            intent.putExtra("key_enter_from_story", true);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("redbag_scene", 1);
                jSONObject.put("coverid", this.f199590d.f199493X0.f228186q);
            } catch (Throwable th) {
                Log.m105921e("MicroMsg.EnvelopeAppBarLayout", "jump finder error, ", th);
            }
            intent.putExtra("key_extra_info", jSONObject.toString());
            ((C60200t1) C86312j.m106911c(cls)).mo76819V1(this.f199590d.f199485T, intent);
            this.f199590d.f199485T.overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
            C75676e.m90932a(7);
            C75675d.m90931a(20, this.f199590d.f199495Z0);
            C69315e0.f199604n++;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("red_cover_id", this.f199590d.f199493X0.f228186q);
                jSONObject2.put("finderusername", this.f199590d.f199493X0.f228184o);
                jSONObject2.put("red_cover_type", 1);
            } catch (Throwable th4) {
                Log.m105921e("MicroMsg.EnvelopeAppBarLayout", "jump finder error, ", th4);
            }
            ((C60200t1) C86312j.m106911c(cls)).mo76861l7().mo83788g6("red_cover_link_unfold", 1, jSONObject2, (C49712hj1) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
