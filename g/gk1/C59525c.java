package gk1;

import android.graphics.Bitmap;
import com.tencent.p014mm.p136ui.C85864g1;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashMap;
import o40.C61926c;
import p646pn.C100824i;
import rx3.C13598b0;
import wd3.C22910y0;

/* renamed from: gk1.c */
public final class C59525c implements C22910y0 {

    /* renamed from: a */
    public final /* synthetic */ String f170143a;

    /* renamed from: b */
    public final /* synthetic */ C59522a f170144b;

    /* renamed from: gk1.c$a */
    public static final class C59526a implements C100824i.C100825a {

        /* renamed from: a */
        public final /* synthetic */ String f170145a;

        /* renamed from: b */
        public final /* synthetic */ C59522a f170146b;

        /* renamed from: gk1.c$a$a */
        public static final class C59527a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C59522a f170147d;

            /* renamed from: e */
            public final /* synthetic */ int f170148e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C59527a(C59522a aVar, int i) {
                super(0);
                this.f170147d = aVar;
                this.f170148e = i;
            }

            public Object invoke() {
                this.f170147d.mo84598f(this.f170148e);
                return C13598b0.f38549a;
            }
        }

        public C59526a(String str, C59522a aVar) {
            this.f170145a = str;
            this.f170146b = aVar;
        }

        /* renamed from: a */
        public final void mo23027a(int i) {
            Log.m105924i("LiveScrollPanelWidget", "#bind coverUrl=" + this.f170145a + " load with url onProcessBitmap: color=" + i);
            C59522a aVar = this.f170146b;
            int i2 = C59522a.f170111E;
            aVar.getClass();
            int e = C85864g1.m106130e(C59522a.f170113G, C85864g1.m106130e(C59522a.f170112F, i, 0.5f), 0.5f);
            Integer valueOf = Integer.valueOf(e);
            ((HashMap) C59522a.f170114H).put(this.f170146b.mo84594b(this.f170145a), valueOf);
            C61926c.m72668M(new C59527a(this.f170146b, e));
        }
    }

    public C59525c(String str, C59522a aVar) {
        this.f170143a = str;
        this.f170144b = aVar;
    }

    /* renamed from: a */
    public boolean mo23026a(Bitmap bitmap) {
        ((C100824i) C86312j.m106911c(C100824i.class)).mo139641DS(bitmap, 0, new C59526a(this.f170143a, this.f170144b));
        return true;
    }

    public void onFinish() {
    }

    public void onStart() {
    }
}
