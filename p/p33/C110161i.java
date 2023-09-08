package p33;

import android.content.Intent;
import android.view.View;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import l31.C61212e;
import lu3.C34379c;
import p270xi.C15688f;
import p407zo.C53801g;

/* renamed from: p33.i */
public final class C110161i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C110152e f329570d;

    /* renamed from: e */
    public final /* synthetic */ String f329571e;

    public C110161i(C110152e eVar, String str) {
        this.f329570d = eVar;
        this.f329571e = str;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$showFinishCard$3$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C110152e eVar = this.f329570d;
        int i = eVar.f329512h;
        long j = eVar.f329511g;
        HashMap hashMap = new HashMap();
        hashMap.put("view_id", "voip_banner_after_reject");
        hashMap.put("voip_roomid", Integer.valueOf(i));
        hashMap.put("voip_roomKey", Long.valueOf(j));
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86168ix("view_clk", hashMap, 26804);
        Intent intent = new Intent();
        intent.putExtra("roomId", this.f329570d.f329512h);
        intent.putExtra("roomKey", this.f329570d.f329511g);
        C15688f.m14685a(intent, C77056a.class);
        ((C53801g) C86312j.m106911c(C53801g.class)).mo61948vA(this.f329571e, 9, intent);
        C34379c<?> cVar = this.f329570d.f329557z;
        if (cVar != null) {
            cVar.cancel(true);
        }
        C110152e eVar2 = this.f329570d;
        eVar2.f329557z = null;
        C110140b.m149726c(eVar2, true, false, false, 6, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/voip/floatcard/VoipFloatCardManager$showFinishCard$3$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
