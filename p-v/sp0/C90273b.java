package sp0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import org.json.JSONObject;
import sp0.C90280d;
import tp0.C90563a;

/* renamed from: sp0.b */
public class C90273b implements C90563a {

    /* renamed from: a */
    public final /* synthetic */ String f259147a;

    /* renamed from: b */
    public final /* synthetic */ C90280d.C90281a f259148b;

    /* renamed from: c */
    public final /* synthetic */ C90280d f259149c;

    public C90273b(C90280d dVar, String str, C90280d.C90281a aVar) {
        this.f259149c = dVar;
        this.f259147a = str;
        this.f259148b = aVar;
    }

    /* renamed from: a */
    public void mo124491a(JSONObject jSONObject) {
        this.f259148b.mo114287a(jSONObject);
    }

    /* renamed from: b */
    public void mo124492b(String str, String str2, String str3, int i, long j, Map map) {
        this.f259149c.mo124501a(this.f259147a);
        this.f259148b.mo114290d(0, str2, str, i, j, map);
        Log.m105925i("MicroMsg.AppBrandNetworkDownload", "download success! filename %s, url %s", str, str3);
    }

    /* renamed from: c */
    public void mo124493c(String str, String str2) {
        Log.m105925i("MicroMsg.AppBrandNetworkDownload", "download start! filename %s, url %s", str, str2);
    }

    /* renamed from: d */
    public void mo124494d(String str, String str2, String str3, int i) {
        Log.m105921e("MicroMsg.AppBrandNetworkDownload", "download error! errorMessage:%s, filename %s, url %s", str3, str, str2);
        this.f259149c.mo124501a(this.f259147a);
        this.f259148b.mo114288b(-1, str3, i);
    }

    /* renamed from: e */
    public void mo124495e(String str) {
        this.f259149c.f259170f.remove(str);
    }

    /* renamed from: f */
    public void mo124496f(String str, String str2, int i, long j, long j2) {
        this.f259148b.mo114289c(i, j, j2);
    }
}
