package p441aq;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import i61.C98603i;
import p207nl.C89008j;
import p523fp.C32147e;
import p585kl.C99149g;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: aq.z */
public class C92061z extends C86301e {
    public void onAccountInitialized(Context context) {
        C30790w2 h = C30790w2.m39221h();
        synchronized (h.f82769a) {
            h.mo57717d().add(h.f82790v);
            h.mo57715b().add(h.f82788t);
            h.mo57714a().add(h.f82789u);
        }
        ((C92054g) C86312j.m106911c(C92054g.class)).wx0();
        if (!C86013q1.m106450k(C89008j.f256613a.mo123384c())) {
            String AD = ((C32147e) C86312j.m106911c(C32147e.class)).mo58507AD(37, 7);
            if (C86013q1.m106450k(AD)) {
                Log.m105924i("MicroMsg.EmojiResAnimPreInitService", "update emoji anim res from cache");
                C98603i d = C98603i.m128193d();
                C99149g e = d.mo138044e(C98603i.C98604a.EMOJI_ANIM);
                e.mo138519b(d.mo138042a(AD, "emoji_anim"));
                e.f290706a.mo86054n();
            }
        }
    }
}
