package kf1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import t60.C64205a;

/* renamed from: kf1.r1 */
public final class C61059r1 implements C64205a {

    /* renamed from: a */
    public final /* synthetic */ String f173893a;

    /* renamed from: b */
    public final /* synthetic */ C61028h1 f173894b;

    /* renamed from: c */
    public final /* synthetic */ String f173895c;

    /* renamed from: kf1.r1$a */
    public static final class C61060a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f173896d;

        /* renamed from: e */
        public final /* synthetic */ C61028h1 f173897e;

        /* renamed from: f */
        public final /* synthetic */ String f173898f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61060a(boolean z, C61028h1 h1Var, String str) {
            super(0);
            this.f173896d = z;
            this.f173897e = h1Var;
            this.f173898f = str;
        }

        public Object invoke() {
            if (!this.f173896d) {
                this.f173897e.mo85987j(this.f173898f);
            }
            return C13598b0.f38549a;
        }
    }

    public C61059r1(String str, C61028h1 h1Var, String str2) {
        this.f173893a = str;
        this.f173894b = h1Var;
        this.f173895c = str2;
    }

    /* renamed from: a */
    public final void mo729a(boolean z, Object[] objArr) {
        Log.m105924i("Finder.FavListDrawerPresenter", "setImageDownloadListener iconUrl:" + this.f173893a + " success：" + z);
        C61926c.m72668M(new C61060a(z, this.f173894b, this.f173895c));
    }
}
