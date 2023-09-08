package oh3;

import a14.C53934p0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C24565l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import m03.C99783d;
import p175j0.C108504h;
import p175j0.C33487v1;
import p435a0.C103214y0;
import p501dz.C58467i;
import p583k2.C108846c;
import p721v0.C65503j;
import rx3.C13598b0;
import sx3.C64175a0;
import wx3.C15601d;

/* renamed from: oh3.e */
public final class C110042e {

    /* renamed from: oh3.e$a */
    public /* synthetic */ class C100358a extends C24565l implements C32226l<Context, View> {
        public C100358a(Object obj) {
            super(1, obj, C100356d.class, "getPlayer", "getPlayer(Landroid/content/Context;)Landroid/view/View;", 0);
        }

        public Object invoke(Object obj) {
            Context context = (Context) obj;
            C87412m.m108594g(context, "p0");
            C100356d dVar = (C100356d) this.receiver;
            dVar.getClass();
            if (dVar.f293949j == null) {
                List<C99783d> list = C100356d.f293942p;
                if (list.size() > 0) {
                    dVar.f293949j = (C99783d) C64175a0.m75513u(list);
                    Log.m105926v("MiscroMsg.PlayerState", "videoView  snsId:" + dVar.f293944e + " playerRecycler ");
                }
                if (dVar.f293949j == null) {
                    C7335d c = C86312j.m106911c(C58467i.class);
                    C87412m.m108593f(c, "getService(IThumbPlayerUIService::class.java)");
                    dVar.f293949j = ((C58467i) c).mo82809TF(context, (AttributeSet) null, 0);
                    Log.m105926v("MiscroMsg.PlayerState", "new videoView  snsId:" + dVar.f293944e + " playerRecycler:" + list.size());
                }
            }
            LifecycleScope.launchDefault$default(dVar.f293948i, (C53934p0) null, new C100355c(dVar, (C15601d<? super C100355c>) null), 1, (Object) null);
            C99783d dVar2 = dVar.f293949j;
            C87412m.m108591d(dVar2);
            return (View) dVar2;
        }
    }

    /* renamed from: oh3.e$b */
    public static final class C100359b extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public static final C100359b f293953d = new C100359b();

        public C100359b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: oh3.e$c */
    public static final class C100360c extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65503j f293954d;

        /* renamed from: e */
        public final /* synthetic */ C100356d f293955e;

        /* renamed from: f */
        public final /* synthetic */ int f293956f;

        /* renamed from: g */
        public final /* synthetic */ int f293957g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100360c(C65503j jVar, C100356d dVar, int i, int i2) {
            super(2);
            this.f293954d = jVar;
            this.f293955e = dVar;
            this.f293956f = i;
            this.f293957g = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C110042e.m149551a(this.f293954d, this.f293955e, (C108504h) obj, this.f293956f | 1, this.f293957g);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m149551a(C65503j jVar, C100356d dVar, C108504h hVar, int i, int i2) {
        C87412m.m108594g(dVar, "playerState");
        C108504h z = hVar.mo51623z(1237187396);
        if ((i2 & 1) != 0) {
            int i3 = C65503j.f188489K0;
            jVar = C65503j.C65504a.f188490d;
        }
        C100358a aVar = new C100358a(dVar);
        int i4 = C65503j.f188489K0;
        C108846c.m147713a(aVar, C103214y0.m136590f(C65503j.C65504a.f188490d, 0.0f, 1, (Object) null).mo74972i0(jVar), C100359b.f293953d, z, 384, 0);
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C100360c(jVar, dVar, i, i2));
        }
    }
}
