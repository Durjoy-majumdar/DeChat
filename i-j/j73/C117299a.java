package j73;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.Wearable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: j73.a */
public class C117299a implements C117300b {

    /* renamed from: a */
    public GoogleApiClient f351169a = new GoogleApiClient.Builder(MMApplicationContext.getContext()).addApi(Wearable.API).build();

    /* renamed from: a */
    public HashSet<String> mo181968a() {
        HashSet<String> hashSet = new HashSet<>();
        NodeApi.GetConnectedNodesResult await = Wearable.NodeApi.getConnectedNodes(mo181969b()).await();
        if (await != null) {
            for (Node id : await.getNodes()) {
                hashSet.add(id.getId());
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public GoogleApiClient mo181969b() {
        if (!this.f351169a.isConnected()) {
            Log.m105924i("MicroMsg.Wear.GlobalConnection", "connect to google api client");
            ConnectionResult blockingConnect = this.f351169a.blockingConnect(30, TimeUnit.SECONDS);
            if (!blockingConnect.isSuccess()) {
                Log.m105921e("MicroMsg.Wear.GlobalConnection", "google api client connect error, code=%d, ", Integer.valueOf(blockingConnect.getErrorCode()));
            }
        }
        return this.f351169a;
    }
}
