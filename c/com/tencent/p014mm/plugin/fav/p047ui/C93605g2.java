package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.fts.C93836i;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import jc1.C98935b;
import jc1.C98936d;
import kv1.C99260q;
import lv1.C99664b;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.fav.ui.g2 */
public class C93605g2 extends C86301e {

    /* renamed from: com.tencent.mm.plugin.fav.ui.g2$a */
    public class C93606a extends C99664b {
        public C93606a(C93605g2 g2Var) {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            Class cls = C99260q.class;
            ((C99260q) C86312j.m106911c(cls)).Xt0(new C98936d());
            ((C99260q) C86312j.m106911c(cls)).Xt0(new C98935b());
            return true;
        }

        public String getName() {
            return "InitFTSFavUIPluginTask";
        }
    }

    public void onAccountInitialized(Context context) {
        ((C93836i) ((C99260q) C86312j.m106911c(C99260q.class)).mo128743Jd()).mo128803c(-86016, new C93606a(this));
    }
}
