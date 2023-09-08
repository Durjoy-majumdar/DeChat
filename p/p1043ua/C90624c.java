package p1043ua;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import zi0.C91755a;

/* renamed from: ua.c */
public class C90624c extends C90622a {
    /* renamed from: Om */
    public void mo115832Om(String str, C91755a.C91758c cVar) {
    }

    /* renamed from: P0 */
    public Bitmap mo115833P0(String str, Rect rect, C91755a.C91757b bVar) {
        return null;
    }

    /* renamed from: Q0 */
    public boolean mo115834Q0(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.startsWith(HttpWrapperBase.PROTOCAL_HTTP) || lowerCase.startsWith(HttpWrapperBase.PROTOCAL_HTTPS);
    }

    public String key() {
        return "NetworkImageReader";
    }
}
