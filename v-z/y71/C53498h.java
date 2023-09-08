package y71;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.exdevice.service.ExDeviceService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.service.C116024c;
import f40.C75681p0;
import ke3.C88144b;

/* renamed from: y71.h */
public class C53498h {
    /* renamed from: a */
    public static boolean m60027a(Context context) {
        if (C75681p0.m90936c(context)) {
            Log.m105924i("MicroMsg.exdevice.ExDeviceServiceHelper", "fully exited, no need to start service");
            return false;
        }
        Intent intent = new Intent(context, ExDeviceService.class);
        intent.setFlags(268435456);
        C116024c.m163164d(intent, "exdevice", true, C88144b.m109786e("exdevice"));
        return true;
    }
}
