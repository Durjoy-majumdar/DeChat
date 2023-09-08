package p1030s6;

import com.github.henryye.nativeiv.ImageDecodeConfig;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import java.io.BufferedInputStream;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import p1030s6.C90132b;
import p673r6.C89876b;

/* renamed from: s6.a */
public class C90131a implements C90132b {

    /* renamed from: a */
    public int f258826a = CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;

    /* renamed from: b */
    public int f258827b = CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;

    /* renamed from: a */
    public String mo109801a() {
        return "http";
    }

    public boolean accept(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        return str.startsWith(HttpWrapperBase.PROTOCAL_HTTP) || str.startsWith(HttpWrapperBase.PROTOCAL_HTTPS);
    }

    /* renamed from: b */
    public C90132b.C90133a mo109803b(Object obj, ImageDecodeConfig imageDecodeConfig) {
        C90132b.C90133a aVar = new C90132b.C90133a();
        try {
            URLConnection openConnection = new URL((String) obj).openConnection();
            openConnection.setReadTimeout(this.f258827b);
            openConnection.setConnectTimeout(this.f258826a);
            aVar.f258828a = new BufferedInputStream(openConnection.getInputStream());
        } catch (SocketTimeoutException e) {
            aVar.f258829b = "http请求超时";
            C89876b.m112384a("NativeImageHttpFetcher", "ImageFetch Timeout! path[%s] connectionTimeout[%d] readTimeout[%d] error[%s]", obj, Integer.valueOf(this.f258826a), Integer.valueOf(this.f258827b), e.toString());
        } catch (Exception e2) {
            aVar.f258829b = "http请求出现错误";
            C89876b.m112384a("NativeImageHttpFetcher", "fetch error. path = [%s], error = [%s]", obj, e2.toString());
        }
        return aVar;
    }
}
