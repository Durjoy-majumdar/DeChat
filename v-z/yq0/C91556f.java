package yq0;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import te3.C49158dk2;
import yq0.C91548e;

/* renamed from: yq0.f */
public class C91556f implements C87581a<Void, C49158dk2> {

    /* renamed from: a */
    public final /* synthetic */ int f262384a;

    /* renamed from: b */
    public final /* synthetic */ String f262385b;

    /* renamed from: c */
    public final /* synthetic */ String f262386c;

    /* renamed from: d */
    public final /* synthetic */ String f262387d;

    /* renamed from: e */
    public final /* synthetic */ boolean f262388e;

    /* renamed from: f */
    public final /* synthetic */ C91548e.C91555f f262389f;

    public C91556f(C91548e eVar, int i, String str, String str2, String str3, boolean z, C91548e.C91555f fVar) {
        this.f262384a = i;
        this.f262385b = str;
        this.f262386c = str2;
        this.f262387d = str3;
        this.f262388e = z;
        this.f262389f = fVar;
    }

    public Object call(Object obj) {
        if (((C49158dk2) obj).f132382d.f134688d == 0 && 1 == this.f262384a) {
            Log.m105925i("MicroMsg.AppBrandJsApiUserAuth", "setAuth, add allow cache appId = %s, api = %s  scope=%s", this.f262385b, this.f262386c, this.f262387d);
            if (this.f262388e) {
                C91548e.f262377e.mo122464e(this.f262385b, this.f262386c);
            }
        }
        this.f262389f.callback();
        return null;
    }
}
