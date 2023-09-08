package qc1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.pluginsdk.model.app.C72681a;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import p262wm.C22921c;
import p262wm.C22923f;
import pb1.C100702d1;
import pb1.C100755z;
import wd3.C65953v0;
import wd3.C78575u;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: qc1.f */
public class C89589f extends C86301e implements C100702d1 {
    /* renamed from: Bb */
    public int mo123896Bb(WXMediaMessage wXMediaMessage, String str, String str2, String str3, int i, String str4) {
        return C72695v.m85049B(wXMediaMessage, str, str2, str3, i, str4);
    }

    /* renamed from: Ri */
    public void mo123897Ri(Activity activity, int i, int i2, Intent intent, boolean z, int i3, int i4) {
        ((C22921c) C86312j.m106911c(C22921c.class)).mo35885Yc(activity, i, i2, intent, z, i3, i4, 2);
    }

    /* renamed from: aV */
    public void mo123898aV(Activity activity, String str, String str2) {
        ((C22921c) C86312j.m106911c(C22921c.class)).mo35876EU(activity, str, str2, 2);
    }

    /* renamed from: jh */
    public int mo123899jh(C68070l.C68072b bVar, WXMediaMessage wXMediaMessage, String str, String str2) {
        return C72695v.m85084z(bVar, wXMediaMessage, str, str2, 0, (C72681a) null);
    }

    /* renamed from: yk */
    public void mo123900yk(Context context, String str, C100755z zVar, int i, boolean z, C65953v0 v0Var) {
        C78575u.C78583h hVar = new C78575u.C78583h(context);
        hVar.mo108578p(str);
        C101110e.m132507j(hVar, context, zVar);
        C101110e.m132508k(hVar, context, zVar);
        hVar.mo108569g(Boolean.valueOf(z));
        hVar.mo108573k(i);
        hVar.mo108563a(v0Var);
        hVar.mo108574l();
    }

    public int z20(String str) {
        return ((C22923f) C86312j.m106911c(C22923f.class)).mo35908u8(str);
    }
}
