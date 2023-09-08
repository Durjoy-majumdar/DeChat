package er1;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C7888v2;
import fy3.C32226l;
import gy3.C87413o;
import java.util.List;
import kr0.C76629w0;
import o40.C61926c;
import p565ir.C60613r;
import rx3.C13598b0;
import te3.C50858pp0;
import te3.C64287ci1;

/* renamed from: er1.a3 */
public final class C58681a3 implements C76629w0.C61144a {

    /* renamed from: a */
    public final /* synthetic */ C64287ci1 f167973a;

    /* renamed from: b */
    public final /* synthetic */ Context f167974b;

    /* renamed from: c */
    public final /* synthetic */ C32226l<List<String>, C13598b0> f167975c;

    /* renamed from: er1.a3$a */
    public static final class C58682a extends C87413o implements C32226l<C50858pp0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Context f167976d;

        /* renamed from: e */
        public final /* synthetic */ C64287ci1 f167977e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<List<String>, C13598b0> f167978f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58682a(Context context, C64287ci1 ci12, C32226l<? super List<String>, C13598b0> lVar) {
            super(1);
            this.f167976d = context;
            this.f167977e = ci12;
            this.f167978f = lVar;
        }

        public Object invoke(Object obj) {
            C50858pp0 pp02 = (C50858pp0) obj;
            C61926c.m72668M(new C58798z2(this.f167976d, this.f167977e, this.f167978f));
            return C13598b0.f38549a;
        }
    }

    public C58681a3(C64287ci1 ci12, Context context, C32226l<? super List<String>, C13598b0> lVar) {
        this.f167973a = ci12;
        this.f167974b = context;
        this.f167975c = lVar;
    }

    /* renamed from: a */
    public final void mo21208a(WxaAttributes wxaAttributes) {
        String str;
        String str2;
        C64287ci1 ci12 = this.f167973a;
        String str3 = "";
        if (wxaAttributes == null || (str = wxaAttributes.field_bigHeadURL) == null) {
            str = str3;
        }
        ci12.f182507s = str;
        if (!(wxaAttributes == null || (str2 = wxaAttributes.field_nickname) == null)) {
            str3 = str2;
        }
        ci12.f182508t = str3;
        C7888v2.C7889a.f26514a.getClass();
        String str4 = C7888v2.C7889a.f26515b;
        Log.m105924i(str4, "fix shareObject, after: " + this.f167973a.f182508t + ", " + this.f167973a.f182507s);
        Context context = this.f167974b;
        C64287ci1 ci13 = this.f167973a;
        ((C60613r) C86312j.m106911c(C60613r.class)).Se0(context, ci13, new C58682a(context, ci13, this.f167975c));
    }
}
