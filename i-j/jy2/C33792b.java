package jy2;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.modelsimple.C68142q0;
import com.tencent.p014mm.sdk.event.MvvmEventCenter;
import ei3.C86522b;
import i40.C98598e;
import ky2.C34129h;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: jy2.b */
public class C33792b extends C98598e implements C34129h {
    public void onCreate(Context context) {
        super.onCreate(context);
        ((C68142q0) MvvmEventCenter.getEvent(C68142q0.class)).observe(this, new b$$a());
    }

    public String toString() {
        return "plugin-teenmode";
    }
}
