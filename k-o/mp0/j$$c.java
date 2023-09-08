package mp0;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import p910lj.C76701a;

public final /* synthetic */ class j$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f32848d;

    /* renamed from: e */
    public final /* synthetic */ String f32849e;

    public /* synthetic */ j$$c(Context context, String str) {
        this.f32848d = context;
        this.f32849e = str;
    }

    public final void run() {
        Context context = this.f32848d;
        String str = this.f32849e;
        C76701a.makeText(context, (CharSequence) str + " export failed!", 1).show();
        Log.m105920e("MiroMsg.GameCpuProfile", str + " export failed!");
    }
}
