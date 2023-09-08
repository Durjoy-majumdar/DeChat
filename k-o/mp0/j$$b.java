package mp0;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import p910lj.C76701a;

public final /* synthetic */ class j$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f32846d;

    /* renamed from: e */
    public final /* synthetic */ String f32847e;

    public /* synthetic */ j$$b(Context context, String str) {
        this.f32846d = context;
        this.f32847e = str;
    }

    public final void run() {
        Context context = this.f32846d;
        String str = this.f32847e;
        C76701a.makeText(context, (CharSequence) str + " exported.", 1).show();
        Log.m105924i("MiroMsg.GameCpuProfile", str + " exported.");
    }
}
