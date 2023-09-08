package bz1;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75597w2;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import java.util.Map;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C110818d0;
import xy1.C15912f;
import xy1.C15913g;

/* renamed from: bz1.l */
public final class C28443l implements C15913g.C15916c {

    /* renamed from: a */
    public final /* synthetic */ String f78198a;

    /* renamed from: b */
    public final /* synthetic */ C8479f0<String> f78199b;

    /* renamed from: c */
    public final /* synthetic */ C75597w2.C31525a f78200c;

    /* renamed from: bz1.l$a */
    public static final class C28444a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Map<String, C15912f> f78201d;

        /* renamed from: e */
        public final /* synthetic */ String f78202e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<String> f78203f;

        /* renamed from: g */
        public final /* synthetic */ C75597w2.C31525a f78204g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C28444a(Map<String, C15912f> map, String str, C8479f0<String> f0Var, C75597w2.C31525a aVar) {
            super(0);
            this.f78201d = map;
            this.f78202e = str;
            this.f78203f = f0Var;
            this.f78204g = aVar;
        }

        public Object invoke() {
            C15912f fVar = (C15912f) C110818d0.m150915M(this.f78201d.values());
            boolean isValid = fVar != null ? fVar.isValid() : false;
            Log.m105924i("GameLife.GetContactInterceptor", "[getContact] callback! succ=" + isValid + ", username=" + this.f78202e + " talker=" + ((String) this.f78203f.f27484d));
            C75597w2.C31525a aVar = this.f78204g;
            if (aVar != null) {
                aVar.mo1109a(this.f78202e, isValid);
            }
            return C13598b0.f38549a;
        }
    }

    public C28443l(String str, C8479f0<String> f0Var, C75597w2.C31525a aVar) {
        this.f78198a = str;
        this.f78199b = f0Var;
        this.f78200c = aVar;
    }

    /* renamed from: a */
    public final void mo445a(Map<String, C15912f> map) {
        C61926c.m72668M(new C28444a(map, this.f78198a, this.f78199b, this.f78200c));
    }
}
