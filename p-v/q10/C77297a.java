package q10;

import android.content.Intent;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.VoidITransmitKvDataCallback;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: q10.a */
public final class C77297a implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ String f225411d;

    public C77297a(String str) {
        this.f225411d = str;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        Log.m105924i("MicroMsg.DCEPHandler", "mmSetOnActivityResultCallback: " + i + ", " + i2 + ", " + intent);
        VoidITransmitKvDataCallback remove = C77298b.f225412a.remove(this.f225411d);
        if (remove != null) {
            Log.m105924i("MicroMsg.DCEPHandler", "callback from activity result");
            ITransmitKvData create = ITransmitKvData.create();
            create.putString("procSts", "0001");
            create.putInt("ret_scene", 2);
            remove.call(create);
        }
    }
}
