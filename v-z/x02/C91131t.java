package x02;

import com.tencent.p014mm.plugin.p064hp.net.SimpleHttpLogic;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C90430p93;
import te3.C90432q93;
import te3.C90435r93;

/* renamed from: x02.t */
public class C91131t implements Runnable {

    /* renamed from: x02.t$a */
    public class C91132a implements SimpleHttpLogic.TaskCallback {
        public C91132a(C91131t tVar) {
        }

        public void onCompleted(int i, int i2, byte[] bArr) {
            Log.m105925i("simple", "errorType: %d, errorCode:%d, result is %s , length %d ", Integer.valueOf(i), Integer.valueOf(i2), bArr, Integer.valueOf(bArr.length));
            try {
                PByteArray pByteArray = new PByteArray();
                boolean unpackResponse = SimpleHttpLogic.unpackResponse(bArr, pByteArray);
                Log.m105920e("simple", "unpack result " + unpackResponse);
                if (unpackResponse) {
                    C90435r93 r932 = new C90435r93();
                    r932.parseFrom(pByteArray.value);
                    if (r932.BaseResponse != null && r932.f259790e != null && r932.f259791f != null) {
                        Log.m105920e("simple", "response is " + r932.BaseResponse.f135955d + " error msg " + r932.BaseResponse.f135956e);
                        Log.m105920e("simple", "response base id is " + r932.f259790e + " error msg " + r932.f259791f);
                    }
                }
            } catch (Exception e) {
                Log.m105920e("simple", "unpack failed. " + e.getLocalizedMessage());
            }
        }
    }

    public void run() {
        SimpleHttpLogic.Request request = new SimpleHttpLogic.Request();
        request.cgi = "/cgi-bin/micromsg-bin/mmtlsprconfig";
        request.host = "short.weixin.qq.com";
        C90432q93 q932 = new C90432q93();
        q932.f259754d = "tinker_id_834582c31727099da72312e81eb61c550d05bdfa_arm64-v8a-Test";
        C90430p93 p932 = new C90430p93();
        p932.f259737d = "";
        p932.f259738e = "";
        q932.f259756f.add(p932);
        q932.f259755e = "";
        PByteArray pByteArray = new PByteArray();
        try {
            boolean packRequest = SimpleHttpLogic.packRequest(q932.toByteArray(), pByteArray);
            Log.m105924i("simple", "pack result " + packRequest);
        } catch (Exception e) {
            Log.m105920e("simple", "pack failed " + e.getLocalizedMessage());
        }
        try {
            request.body = pByteArray.value;
        } catch (Exception e2) {
            Log.m105920e("simple", e2.getLocalizedMessage());
        }
        SimpleHttpLogic.startRequest(request, new C91132a(this), "101.227.131.113");
    }
}
