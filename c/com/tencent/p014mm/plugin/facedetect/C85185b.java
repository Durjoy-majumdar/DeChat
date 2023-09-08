package com.tencent.p014mm.plugin.facedetect;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import lp3.C88631d;
import lp3.C88633e;
import lp3.C88643g;
import op3.C117877b;
import p564iq.C87790d;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.facedetect.b */
public class C85185b extends C86301e {

    /* renamed from: com.tencent.mm.plugin.facedetect.b$a */
    public class C29910a implements C88631d.C76721a<C117877b<Integer, String>> {
        public C29910a(C85185b bVar) {
        }

        /* renamed from: a */
        public void mo1720a(Object obj) {
            C117877b bVar = (C117877b) obj;
            if (bVar != null) {
                int nullAs = Util.nullAs((Integer) bVar.mo182596a(0), -1);
                Log.m105921e("MicroMsg.PluginFace", "hy: onInterrupt errCode: %d, errMsg: %s", Integer.valueOf(nullAs), Util.nullAs((String) bVar.mo182596a(1), "unknown"));
                return;
            }
            Log.m105920e("MicroMsg.PluginFace", "hy: null in on interrupt");
        }
    }

    public static boolean vx0() {
        return ((C87790d) C86312j.m106911c(C87790d.class)).W90();
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        Log.m105924i("MicroMsg.PluginFace", "hy: starting execute.");
        ((C88633e) C88643g.m110546d()).mo123064p(new C85187e()).mo123065b(new C29910a(this));
    }
}
