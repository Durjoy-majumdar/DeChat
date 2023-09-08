package rw0;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.sight.base.C85457c;
import com.tencent.p014mm.plugin.sight.base.C85458f;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import p156gj.C107842p;
import p206nj.C88957l;
import p734vz.C102301h;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: rw0.s */
public class C101478s extends C86301e implements C101477j {

    /* renamed from: d */
    public static volatile boolean f297184d;

    public static void vx0() {
        Class<C101478s> cls = C101478s.class;
        if (!f297184d) {
            C85458f.m105455a();
            if (!C102301h.f301316a) {
                C88957l.m111079o("voipVideoCodec", C102301h.class.getClassLoader());
                C102301h.f301316a = true;
            }
            C88957l.m111079o("wechatsight_v7a", cls.getClassLoader());
            C88957l.m111079o("wechatpack", cls.getClassLoader());
            f297184d = true;
        }
    }

    public void Mf0() {
        vx0();
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        int a = C107842p.m146108a() >> 12;
        Log.m105925i("MicroMsg.SightInitTask", "load wechatsight_v7a, core number[%d]", Integer.valueOf(a));
        if (a >= 4) {
            C85457c.f249056a = 3;
            C85457c.f249057b = 3;
            C85457c.f249058c = 544000;
            return;
        }
        C85457c.f249056a = 1;
        C85457c.f249057b = 1;
        C85457c.f249058c = 640000;
    }
}
