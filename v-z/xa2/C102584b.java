package xa2;

import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: xa2.b */
public class C102584b implements IMediaHTTPService {

    /* renamed from: a */
    public final Map<String, String> f302068a = new ConcurrentHashMap();

    /* renamed from: a */
    public void mo142210a(String str, String str2) {
        Logger.m21786d("MicroMsg.MMMediaHTTPService", "setReferrer, originUrl: " + str + ", referrer: " + str2);
        if (str2 == null) {
            str2 = "";
        }
        ((ConcurrentHashMap) this.f302068a).put(str, str2);
    }

    public IMediaHTTPConnection makeHTTPConnection() {
        Logger.m21791i("MicroMsg.MMMediaHTTPService", "makeHTTPConnection");
        return new C102583a(Collections.unmodifiableMap(this.f302068a));
    }
}
