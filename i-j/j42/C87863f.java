package j42;

import android.graphics.Typeface;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C86186n;
import gy3.C87412m;
import java.io.IOException;
import java.io.InputStream;
import p419td.C26296b;
import s24.C90125c;

/* renamed from: j42.f */
public final class C87863f implements C26296b {

    /* renamed from: a */
    public final /* synthetic */ C87830a f254354a;

    public C87863f(C87830a aVar) {
        this.f254354a = aVar;
    }

    /* renamed from: a */
    public String mo53170a(String str) {
        C87412m.m108594g(str, "path");
        return null;
    }

    /* renamed from: b */
    public byte[] mo53171b(String str) {
        C87412m.m108594g(str, "path");
        try {
            C86186n nVar = this.f254354a.f254284j;
            if (nVar != null) {
                InputStream readStream = nVar.mo109577a().readStream(str);
                if (readStream != null) {
                    return C90125c.m112776c(readStream);
                }
                String str2 = this.f254354a.f254274E;
                Log.m105920e(str2, "getFontData in path[" + str + "] failed, null stream");
                return null;
            }
            C87412m.m108603p("pkgManagement");
            throw null;
        } catch (IOException unused) {
            String str3 = this.f254354a.f254274E;
            Log.m105920e(str3, "getFontData in path[" + str + "] failed");
            return null;
        }
    }

    public Typeface loadFont(String str) {
        C87412m.m108594g(str, "path");
        return null;
    }
}
