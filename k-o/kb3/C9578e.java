package kb3;

import android.os.Bundle;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: kb3.e */
public class C9578e implements C80916r<Bundle, Bundle> {
    public Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        Log.m105925i("IPCSyncInvokeTask_AddOfflineCallback", "cpan offline getProcessName:%s", MMApplicationContext.getProcessName());
        Bundle bundle2 = new Bundle();
        bundle2.putString("result", APMidasPayAPI.ENV_TEST);
        return bundle2;
    }
}
