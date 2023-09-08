package ca0;

import a14.C0000n0;
import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import com.tencent.maas.model.MJMusicInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fm0.C86980s1;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import p004b0.C103953l0;
import p004b0.C103960n0;
import p004b0.C54380k;
import p175j0.C108497e2;
import p175j0.C108499f1;
import p175j0.C108500f2;
import p175j0.C108501g;
import p175j0.C108502g1;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C108513w;
import p175j0.C24665d;
import p175j0.C33487v1;
import p175j0.C33489x1;
import p175j0.C60655g0;
import p175j0.C60667k2;
import p175j0.C60686v;
import p175j0.C60690y0;
import p246u1.C111072h;
import p267x.C111929l;
import p267x.C111940o;
import p415q0.C110261c;
import p415q0.C35747b;
import p435a0.C103111a;
import p435a0.C103129b1;
import p435a0.C103141f;
import p435a0.C103157j;
import p435a0.C103161k;
import p435a0.C103165l;
import p435a0.C103166l0;
import p435a0.C103199s0;
import p435a0.C103214y0;
import p451b2.C104014i;
import p451b2.C104020o;
import p451b2.C104022q;
import p502e0.C107073f;
import p502e0.C107074g;
import p543h0.C107927c0;
import p543h0.C107944f0;
import p544h2.C108014f;
import p544h2.C32659e;
import p560i2.C108319b;
import p560i2.C108322d;
import p560i2.C108325f;
import p560i2.C33183o;
import p631o1.C109827a0;
import p631o1.C109854n0;
import p631o1.C109863q;
import p631o1.C109880u0;
import p631o1.C109893x;
import p631o1.C109894x0;
import p631o1.C109895y;
import p631o1.C109899z;
import p658q1.C110269a;
import p721v0.C111294a;
import p721v0.C65503j;
import p735w1.C111703v;
import p735w1.C111705z;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36907w;
import um0.C22657f;
import wx3.C15601d;
import xa0.C66237a;
import xa0.C66239c;
import xa0.C66244k;
import xa0.C66245l;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ca0.p */
public final class C104353p {

    /* renamed from: a */
    public static final C108499f1<C104344e0> f308980a = C108513w.m147058c(C54695c.f153287d);

    /* renamed from: ca0.p$a */
    public static final class C54693a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f153278d;

        /* renamed from: e */
        public final /* synthetic */ C60667k2<Boolean> f153279e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f153280f;

        /* renamed from: g */
        public final /* synthetic */ int f153281g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54693a(String str, C60667k2<Boolean> k2Var, C32224a<C13598b0> aVar, int i) {
            super(2);
            this.f153278d = str;
            this.f153279e = k2Var;
            this.f153280f = aVar;
            this.f153281g = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C104353p.m139322a(this.f153278d, this.f153279e, this.f153280f, (C108504h) obj, this.f153281g | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ca0.p$b */
    public static final class C54694b extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f153282d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f153283e;

        /* renamed from: f */
        public final /* synthetic */ C65503j f153284f;

        /* renamed from: g */
        public final /* synthetic */ int f153285g;

        /* renamed from: h */
        public final /* synthetic */ int f153286h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54694b(boolean z, C32224a<C13598b0> aVar, C65503j jVar, int i, int i2) {
            super(2);
            this.f153282d = z;
            this.f153283e = aVar;
            this.f153284f = jVar;
            this.f153285g = i;
            this.f153286h = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C104353p.m139323b(this.f153282d, this.f153283e, this.f153284f, (C108504h) obj, this.f153285g | 1, this.f153286h);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ca0.p$c */
    public static final class C54695c extends C87413o implements C32224a<C104344e0> {

        /* renamed from: d */
        public static final C54695c f153287d = new C54695c();

        public C54695c() {
            super(0);
        }

        public Object invoke() {
            return C104344e0.f308940k;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.widget.MusicSelectorKt$MusicCardList$1$1", mo125469f = "MusicSelector.kt", mo125470l = {276}, mo125471m = "invokeSuspend")
    /* renamed from: ca0.p$d */
    public static final class C54696d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f153288d;

        /* renamed from: e */
        public final /* synthetic */ C103953l0 f153289e;

        /* renamed from: f */
        public final /* synthetic */ C60667k2<List<MJMusicInfo>> f153290f;

        /* renamed from: g */
        public final /* synthetic */ C60667k2<String> f153291g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54696d(C103953l0 l0Var, C60667k2<? extends List<? extends MJMusicInfo>> k2Var, C60667k2<String> k2Var2, C15601d<? super C54696d> dVar) {
            super(2, dVar);
            this.f153289e = l0Var;
            this.f153290f = k2Var;
            this.f153291g = k2Var2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54696d(this.f153289e, this.f153290f, this.f153291g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54696d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f153288d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List h = C104353p.m139329h(this.f153290f);
                C60667k2<String> k2Var = this.f153291g;
                Iterator it = h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (C87412m.m108589b(((MJMusicInfo) obj2).getMusicID(), k2Var.getValue())) {
                        break;
                    }
                }
                MJMusicInfo mJMusicInfo = (MJMusicInfo) obj2;
                int indexOf = mJMusicInfo != null ? C104353p.m139329h(this.f153290f).indexOf(mJMusicInfo) : 0;
                C103953l0 l0Var = this.f153289e;
                this.f153288d = 1;
                if (C103953l0.m138679h(l0Var, indexOf, 0, this, 2, (Object) null) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.widget.MusicSelectorKt$MusicCardList$2", mo125469f = "MusicSelector.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ca0.p$e */
    public static final class C54697e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C103953l0 f153292d;

        /* renamed from: e */
        public final /* synthetic */ C60667k2<List<MJMusicInfo>> f153293e;

        /* renamed from: f */
        public final /* synthetic */ C54683f0 f153294f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54697e(C103953l0 l0Var, C60667k2<? extends List<? extends MJMusicInfo>> k2Var, C54683f0 f0Var, C15601d<? super C54697e> dVar) {
            super(2, dVar);
            this.f153292d = l0Var;
            this.f153293e = k2Var;
            this.f153294f = f0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54697e(this.f153292d, this.f153293e, this.f153294f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54697e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C54679b bVar;
            ResultKt.throwOnFailure(obj);
            C103953l0 l0Var = this.f153292d;
            C108499f1<C104344e0> f1Var = C104353p.f308980a;
            List<C54380k> f = l0Var.mo145573g().mo55835f();
            ArrayList<C54380k> arrayList = new ArrayList<>();
            for (T next : f) {
                C54380k kVar = (C54380k) next;
                boolean z = false;
                if (Math.max(0.0f, 100.0f - ((((float) (Math.max(0, l0Var.mo145573g().mo55832a() - kVar.getOffset()) + Math.max(0, (kVar.getOffset() + kVar.getSize()) - l0Var.mo145573g().mo55833c()))) * 100.0f) / ((float) kVar.getSize()))) >= 30.0f) {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            C60667k2<List<MJMusicInfo>> k2Var = this.f153293e;
            ArrayList<MJMusicInfo> arrayList2 = new ArrayList<>(C36907w.m41090l(arrayList, 10));
            for (C54380k index : arrayList) {
                arrayList2.add((MJMusicInfo) C110818d0.m150917O(C104353p.m139329h(k2Var), index.getIndex()));
            }
            C54683f0 f0Var = this.f153294f;
            for (MJMusicInfo mJMusicInfo : arrayList2) {
                if (!(mJMusicInfo == null || (bVar = f0Var.f153258j) == null)) {
                    String musicID = mJMusicInfo.getMusicID();
                    C87412m.m108593f(musicID, "it.musicID");
                    bVar.mo75602a(musicID);
                }
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.widget.MusicSelectorKt$MusicCardList$3", mo125469f = "MusicSelector.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ca0.p$f */
    public static final class C54698f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C103953l0 f153295d;

        /* renamed from: e */
        public final /* synthetic */ C66239c f153296e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<String, C13598b0> f153297f;

        /* renamed from: g */
        public final /* synthetic */ C60667k2<List<MJMusicInfo>> f153298g;

        /* renamed from: h */
        public final /* synthetic */ C60667k2<String> f153299h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54698f(C103953l0 l0Var, C66239c cVar, C32226l<? super String, C13598b0> lVar, C60667k2<? extends List<? extends MJMusicInfo>> k2Var, C60667k2<String> k2Var2, C15601d<? super C54698f> dVar) {
            super(2, dVar);
            this.f153295d = l0Var;
            this.f153296e = cVar;
            this.f153297f = lVar;
            this.f153298g = k2Var;
            this.f153299h = k2Var2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54698f(this.f153295d, this.f153296e, this.f153297f, this.f153298g, this.f153299h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54698f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C66245l e;
            ResultKt.throwOnFailure(obj);
            if (!this.f153295d.mo90552a() && (e = this.f153296e.mo90334e()) != null) {
                C32226l<String, C13598b0> lVar = this.f153297f;
                C60667k2<List<MJMusicInfo>> k2Var = this.f153298g;
                C60667k2<String> k2Var2 = this.f153299h;
                String musicID = ((MJMusicInfo) C104353p.m139329h(k2Var).get(e.mo90338a())).getMusicID();
                C87412m.m108593f(musicID, "musicInfos[it.index].musicID");
                lVar.invoke(musicID);
                Log.m105924i("MusicSelectorExpand", "select to " + k2Var2.getValue());
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ca0.p$h */
    public static final class C54699h extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54683f0 f153300d;

        /* renamed from: e */
        public final /* synthetic */ C60667k2<String> f153301e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<String, C13598b0> f153302f;

        /* renamed from: g */
        public final /* synthetic */ int f153303g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54699h(C54683f0 f0Var, C60667k2<String> k2Var, C32226l<? super String, C13598b0> lVar, int i) {
            super(2);
            this.f153300d = f0Var;
            this.f153301e = k2Var;
            this.f153302f = lVar;
            this.f153303g = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C104353p.m139324c(this.f153300d, this.f153301e, this.f153302f, (C108504h) obj, this.f153303g | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ca0.p$i */
    public static final class C54700i extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60667k2<Boolean> f153304d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f153305e;

        /* renamed from: f */
        public final /* synthetic */ C60667k2<Boolean> f153306f;

        /* renamed from: g */
        public final /* synthetic */ C32224a<C13598b0> f153307g;

        /* renamed from: h */
        public final /* synthetic */ boolean f153308h;

        /* renamed from: i */
        public final /* synthetic */ int f153309i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54700i(C60667k2<Boolean> k2Var, C32224a<C13598b0> aVar, C60667k2<Boolean> k2Var2, C32224a<C13598b0> aVar2, boolean z, int i) {
            super(2);
            this.f153304d = k2Var;
            this.f153305e = aVar;
            this.f153306f = k2Var2;
            this.f153307g = aVar2;
            this.f153308h = z;
            this.f153309i = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C104353p.m139325d(this.f153304d, this.f153305e, this.f153306f, this.f153307g, this.f153308h, (C108504h) obj, this.f153309i | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ca0.p$j */
    public static final class C54701j extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32228q<C103161k, C108504h, Integer, C13598b0> f153310d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f153311e;

        /* renamed from: f */
        public final /* synthetic */ C54683f0 f153312f;

        /* renamed from: g */
        public final /* synthetic */ int f153313g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54701j(C32228q<? super C103161k, ? super C108504h, ? super Integer, C13598b0> qVar, C32224a<C13598b0> aVar, C54683f0 f0Var, int i) {
            super(2);
            this.f153310d = qVar;
            this.f153311e = aVar;
            this.f153312f = f0Var;
            this.f153313g = i;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                C32228q<C103161k, C108504h, Integer, C13598b0> qVar = this.f153310d;
                C32224a<C13598b0> aVar = this.f153311e;
                C54683f0 f0Var = this.f153312f;
                int i = this.f153313g;
                C104353p.m139330i(qVar, aVar, f0Var, hVar, ((i << 3) & 112) | ((i >> 9) & 14) | 512);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ca0.p$k */
    public static final class C54702k extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f153314d;

        /* renamed from: e */
        public final /* synthetic */ C54683f0 f153315e;

        /* renamed from: f */
        public final /* synthetic */ C104344e0 f153316f;

        /* renamed from: g */
        public final /* synthetic */ C32228q<C103161k, C108504h, Integer, C13598b0> f153317g;

        /* renamed from: h */
        public final /* synthetic */ int f153318h;

        /* renamed from: i */
        public final /* synthetic */ int f153319i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54702k(C32224a<C13598b0> aVar, C54683f0 f0Var, C104344e0 e0Var, C32228q<? super C103161k, ? super C108504h, ? super Integer, C13598b0> qVar, int i, int i2) {
            super(2);
            this.f153314d = aVar;
            this.f153315e = f0Var;
            this.f153316f = e0Var;
            this.f153317g = qVar;
            this.f153318h = i;
            this.f153319i = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C104353p.m139326e(this.f153314d, this.f153315e, this.f153316f, this.f153317g, (C108504h) obj, this.f153318h | 1, this.f153319i);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ca0.p$l */
    public static final class C54703l extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MJMusicInfo f153320d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f153321e;

        /* renamed from: f */
        public final /* synthetic */ int f153322f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54703l(MJMusicInfo mJMusicInfo, C32224a<C13598b0> aVar, int i) {
            super(2);
            this.f153320d = mJMusicInfo;
            this.f153321e = aVar;
            this.f153322f = i;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                C104353p.m139331j(this.f153320d, this.f153321e, hVar, ((this.f153322f >> 3) & 112) | 8);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ca0.p$m */
    public static final class C54704m extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MJMusicInfo f153323d;

        /* renamed from: e */
        public final /* synthetic */ C104344e0 f153324e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f153325f;

        /* renamed from: g */
        public final /* synthetic */ int f153326g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54704m(MJMusicInfo mJMusicInfo, C104344e0 e0Var, C32224a<C13598b0> aVar, int i) {
            super(2);
            this.f153323d = mJMusicInfo;
            this.f153324e = e0Var;
            this.f153325f = aVar;
            this.f153326g = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C104353p.m139327f(this.f153323d, this.f153324e, this.f153325f, (C108504h) obj, this.f153326g | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ca0.p$g */
    public static final class C104354g extends C87413o implements C32227p<C109894x0, C108319b, C109899z> {

        /* renamed from: d */
        public final /* synthetic */ C104344e0 f308981d;

        /* renamed from: e */
        public final /* synthetic */ C66239c f308982e;

        /* renamed from: f */
        public final /* synthetic */ C103953l0 f308983f;

        /* renamed from: g */
        public final /* synthetic */ float f308984g;

        /* renamed from: h */
        public final /* synthetic */ C60690y0<C108325f> f308985h;

        /* renamed from: i */
        public final /* synthetic */ C60667k2<List<MJMusicInfo>> f308986i;

        /* renamed from: j */
        public final /* synthetic */ C54683f0 f308987j;

        /* renamed from: n */
        public final /* synthetic */ C60667k2<String> f308988n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104354g(C104344e0 e0Var, C66239c cVar, C103953l0 l0Var, float f, C60690y0<C108325f> y0Var, C60667k2<? extends List<? extends MJMusicInfo>> k2Var, C54683f0 f0Var, C60667k2<String> k2Var2) {
            super(2);
            this.f308981d = e0Var;
            this.f308982e = cVar;
            this.f308983f = l0Var;
            this.f308984g = f;
            this.f308985h = y0Var;
            this.f308986i = k2Var;
            this.f308987j = f0Var;
            this.f308988n = k2Var2;
        }

        public Object invoke(Object obj, Object obj2) {
            C109894x0 x0Var = (C109894x0) obj;
            long j = ((C108319b) obj2).f324343a;
            C87412m.m108594g(x0Var, "$this$SubcomposeLayout");
            C104344e0 e0Var = this.f308981d;
            C66239c cVar = this.f308982e;
            C103953l0 l0Var = this.f308983f;
            float f = this.f308984g;
            C60690y0<C108325f> y0Var = this.f308985h;
            C60667k2<List<MJMusicInfo>> k2Var = this.f308986i;
            C54683f0 f0Var = this.f308987j;
            C60667k2<String> k2Var2 = this.f308988n;
            C104357x xVar = r3;
            C104357x xVar2 = new C104357x(j, e0Var, cVar, l0Var, f, y0Var, k2Var, f0Var, k2Var2);
            C109854n0 K = ((C109893x) C110818d0.m150914L(x0Var.mo161192q0(0, C110261c.m149879c(889817540, true, xVar)))).mo161155K(j);
            return C109827a0.C109828a.m149247b(x0Var, C108319b.m146697h(j), K.f328780e, (Map) null, new C104356s(K), 4, (Object) null);
        }
    }

    /* renamed from: a */
    public static final void m139322a(String str, C60667k2<Boolean> k2Var, C32224a<C13598b0> aVar, C108504h hVar, int i) {
        int i2;
        C108504h hVar2;
        String str2 = str;
        C60667k2<Boolean> k2Var2 = k2Var;
        C32224a<C13598b0> aVar2 = aVar;
        int i3 = i;
        C108504h z = hVar.mo51623z(1516447836);
        if ((i3 & 14) == 0) {
            i2 = (z.mo51619x(str2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= z.mo51619x(k2Var2) ? 32 : 16;
        }
        if ((i3 & C22657f.CTRL_INDEX) == 0) {
            i2 |= z.mo51619x(aVar2) ? 256 : 128;
        }
        int i4 = i2;
        if ((i4 & 731) != 146 || !z.mo51575a()) {
            int i5 = C111294a.f333218a;
            C111294a.C37634c cVar = C111294a.C111295a.f333227i;
            int i6 = C65503j.f188489K0;
            C65503j.C65504a aVar3 = C65503j.C65504a.f188490d;
            C65503j d = C111940o.m152651d(aVar3, false, (String) null, (C111072h) null, aVar, 7, (Object) null);
            z.mo51557H(693286680);
            C103111a aVar4 = C103111a.f304234a;
            C109895y a = C103199s0.m136579a(C103111a.f304235b, cVar, z, 48);
            z.mo51557H(-1323940314);
            C60686v vVar = C103645l0.f306124e;
            C108322d dVar = (C108322d) z.mo51598m(vVar);
            C33183o oVar = (C33183o) z.mo51598m(C103645l0.f306130k);
            C103633i2 i2Var = (C103633i2) z.mo51598m(C103645l0.f306134o);
            C110269a.C110270a aVar5 = C110269a.f329831D0;
            aVar5.getClass();
            C32224a<C110269a> aVar6 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(d);
            if (z.mo51543A() instanceof C24665d) {
                z.mo51615v();
                if (z.mo51621y()) {
                    z.mo51612t(aVar6);
                } else {
                    z.mo51579c();
                }
                z.mo51561L();
                aVar5.getClass();
                C108508o2.m147049a(z, a, C110269a.C110270a.f329836e);
                aVar5.getClass();
                C108508o2.m147049a(z, dVar, C110269a.C110270a.f329835d);
                aVar5.getClass();
                C108508o2.m147049a(z, oVar, C110269a.C110270a.f329837f);
                aVar5.getClass();
                C108508o2.m147049a(z, i2Var, C110269a.C110270a.f329838g);
                z.mo51590i();
                ((C35747b) a2).invoke(new C33489x1(z), z, 0);
                z.mo51557H(2058660585);
                z.mo51557H(-678309503);
                float f = (float) 8;
                m139323b(!k2Var.getValue().booleanValue(), aVar, C103214y0.m136594j(aVar3, ((float) 2) * f), z, ((i4 >> 3) & 112) | 384, 0);
                hVar2 = z;
                C32224a<C13598b0> aVar7 = aVar2;
                C107944f0.m146242c(str, C103166l0.m136523g(aVar3, ((float) 0.5d) * f, 0.0f, 0.0f, 0.0f, 14, (Object) null), ((C104344e0) z.mo51598m(f308980a)).f308947f, ((C108322d) z.mo51598m(vVar)).mo143031F((float) 17), (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 0, false, 0, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, hVar2, (i4 & 14) | 3120, 0, 65520);
                hVar2.mo51565P();
                hVar2.mo51565P();
                hVar2.mo51610s();
                hVar2.mo51565P();
                hVar2.mo51565P();
            } else {
                C108501g.m147000a();
                throw null;
            }
        } else {
            z.mo51581d();
            hVar2 = z;
        }
        C33487v1 l = hVar2.mo51596l();
        if (l != null) {
            l.mo51650a(new C54693a(str, k2Var, aVar, i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m139323b(boolean r15, fy3.C32224a<rx3.C13598b0> r16, p721v0.C65503j r17, p175j0.C108504h r18, int r19, int r20) {
        /*
            r1 = r15
            r4 = r19
            r0 = 1090639297(0x4101d5c1, float:8.114686)
            r2 = r18
            j0.h r0 = r2.mo51623z(r0)
            r2 = r20 & 1
            if (r2 == 0) goto L_0x0013
            r2 = r4 | 6
            goto L_0x0023
        L_0x0013:
            r2 = r4 & 14
            if (r2 != 0) goto L_0x0022
            boolean r2 = r0.mo51586g(r15)
            if (r2 == 0) goto L_0x001f
            r2 = 4
            goto L_0x0020
        L_0x001f:
            r2 = 2
        L_0x0020:
            r2 = r2 | r4
            goto L_0x0023
        L_0x0022:
            r2 = r4
        L_0x0023:
            r3 = r20 & 2
            if (r3 == 0) goto L_0x002a
            r2 = r2 | 48
            goto L_0x003d
        L_0x002a:
            r3 = r4 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x003d
            r3 = r16
            boolean r5 = r0.mo51619x(r3)
            if (r5 == 0) goto L_0x0039
            r5 = 32
            goto L_0x003b
        L_0x0039:
            r5 = 16
        L_0x003b:
            r2 = r2 | r5
            goto L_0x003f
        L_0x003d:
            r3 = r16
        L_0x003f:
            r5 = r20 & 4
            if (r5 == 0) goto L_0x0046
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0059
        L_0x0046:
            r6 = r4 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0059
            r6 = r17
            boolean r7 = r0.mo51619x(r6)
            if (r7 == 0) goto L_0x0055
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0055:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r2 = r2 | r7
            goto L_0x005b
        L_0x0059:
            r6 = r17
        L_0x005b:
            r2 = r2 & 731(0x2db, float:1.024E-42)
            r7 = 146(0x92, float:2.05E-43)
            if (r2 != r7) goto L_0x006d
            boolean r2 = r0.mo51575a()
            if (r2 != 0) goto L_0x0068
            goto L_0x006d
        L_0x0068:
            r0.mo51581d()
            goto L_0x00e0
        L_0x006d:
            if (r5 == 0) goto L_0x0074
            int r2 = p721v0.C65503j.f188489K0
            v0.j$a r2 = p721v0.C65503j.C65504a.f188490d
            goto L_0x0075
        L_0x0074:
            r2 = r6
        L_0x0075:
            r5 = 0
            if (r1 == 0) goto L_0x00ac
            r6 = -1560793519(0xffffffffa2f82e51, float:-6.7269574E-18)
            r0.mo51557H(r6)
            r6 = 2131757087(0x7f10081f, float:1.91451E38)
            j0.f1<ca0.e0> r7 = f308980a
            java.lang.Object r7 = r0.mo51598m(r7)
            ca0.e0 r7 = (ca0.C104344e0) r7
            long r7 = r7.f308947f
            d1.c r12 = ta0.C110954a.m151253a(r6, r7, r0, r5)
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 7
            r11 = 0
            r5 = r2
            r9 = r16
            v0.j r7 = p267x.C111940o.m152651d(r5, r6, r7, r8, r9, r10, r11)
            r9 = 0
            r10 = 0
            r13 = 56
            r14 = 120(0x78, float:1.68E-43)
            java.lang.String r6 = ""
            r5 = r12
            r12 = r0
            p267x.C111897d1.m152617a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.mo51565P()
            goto L_0x00df
        L_0x00ac:
            r6 = -1560793183(0xffffffffa2f82fa1, float:-6.7270964E-18)
            r0.mo51557H(r6)
            r6 = 2131757088(0x7f100820, float:1.9145102E38)
            j0.f1<ca0.e0> r7 = f308980a
            java.lang.Object r7 = r0.mo51598m(r7)
            ca0.e0 r7 = (ca0.C104344e0) r7
            long r7 = r7.f308947f
            d1.c r12 = ta0.C110954a.m151253a(r6, r7, r0, r5)
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 7
            r11 = 0
            r5 = r2
            r9 = r16
            v0.j r7 = p267x.C111940o.m152651d(r5, r6, r7, r8, r9, r10, r11)
            r9 = 0
            r10 = 0
            r13 = 56
            r14 = 120(0x78, float:1.68E-43)
            java.lang.String r6 = ""
            r5 = r12
            r12 = r0
            p267x.C111897d1.m152617a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.mo51565P()
        L_0x00df:
            r6 = r2
        L_0x00e0:
            j0.v1 r7 = r0.mo51596l()
            if (r7 != 0) goto L_0x00e7
            goto L_0x00f8
        L_0x00e7:
            ca0.p$b r8 = new ca0.p$b
            r0 = r8
            r1 = r15
            r2 = r16
            r3 = r6
            r4 = r19
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5)
            r7.mo51650a(r8)
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca0.C104353p.m139323b(boolean, fy3.a, v0.j, j0.h, int, int):void");
    }

    /* renamed from: c */
    public static final void m139324c(C54683f0 f0Var, C60667k2<String> k2Var, C32226l<? super String, C13598b0> lVar, C108504h hVar, int i) {
        C54683f0 f0Var2 = f0Var;
        C60667k2<String> k2Var2 = k2Var;
        C108504h z = hVar.mo51623z(1846646903);
        float density = ((C108322d) z.mo51598m(C103645l0.f306124e)).getDensity();
        C60667k2<List<MJMusicInfo>> k2Var3 = f0Var2.f153249a;
        C60667k2<MJMusicInfo> k2Var4 = f0Var2.f153250b;
        z.mo51557H(-492369756);
        Object q = z.mo51606q();
        Object obj = C108504h.C60656a.f172772a;
        if (q == obj) {
            q = C108500f2.m146996c(new C108325f((float) 0), (C108497e2) null, 2, (Object) null);
            z.mo51553F(q);
        }
        z.mo51565P();
        C60690y0 y0Var = (C60690y0) q;
        C104344e0 e0Var = (C104344e0) z.mo51598m(f308980a);
        C103953l0 a = C103960n0.m138697a(0, 0, z, 0, 3);
        C103953l0 l0Var = a;
        C104344e0 e0Var2 = e0Var;
        C66239c a2 = C66237a.m78164a(a, (C32227p<? super C66244k, ? super C66245l, Integer>) null, e0Var.f308949h, z, 0, 2);
        MJMusicInfo value = k2Var4.getValue();
        List value2 = k2Var3.getValue();
        z.mo51557H(1618982084);
        boolean x = z.mo51619x(k2Var3) | z.mo51619x(k2Var2) | z.mo51619x(l0Var);
        Object q2 = z.mo51606q();
        if (x || q2 == obj) {
            q2 = new C54696d(l0Var, k2Var3, k2Var2, (C15601d<? super C54696d>) null);
            z.mo51553F(q2);
        }
        z.mo51565P();
        C60655g0.m70933d(value, value2, (C32227p) q2, z, C86980s1.CTRL_INDEX);
        C60655g0.m70932c(Integer.valueOf(l0Var.mo145571e()), new C54697e(l0Var, k2Var3, f0Var2, (C15601d<? super C54697e>) null), z, 64);
        C54698f fVar = r0;
        C54698f fVar2 = new C54698f(l0Var, a2, lVar, k2Var3, k2Var, (C15601d<? super C54698f>) null);
        C60655g0.m70932c(Boolean.valueOf(l0Var.mo90552a()), fVar, z, 64);
        C109880u0.m149371b(C103214y0.m136591g(C65503j.C65504a.f188490d, 0.0f, 1, (Object) null), new C104354g(e0Var2, a2, l0Var, density, y0Var, k2Var3, f0Var, k2Var), z, 6, 0);
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C54699h(f0Var, k2Var2, lVar, i));
        }
    }

    /* renamed from: d */
    public static final void m139325d(C60667k2<Boolean> k2Var, C32224a<C13598b0> aVar, C60667k2<Boolean> k2Var2, C32224a<C13598b0> aVar2, boolean z, C108504h hVar, int i) {
        int i2;
        C60667k2<Boolean> k2Var3 = k2Var;
        C32224a<C13598b0> aVar3 = aVar;
        C60667k2<Boolean> k2Var4 = k2Var2;
        C32224a<C13598b0> aVar4 = aVar2;
        boolean z2 = z;
        int i3 = i;
        C87412m.m108594g(k2Var3, "musicState");
        C87412m.m108594g(aVar3, "onMusicClick");
        C87412m.m108594g(k2Var4, "originState");
        C87412m.m108594g(aVar4, "onOriginClick");
        C108504h z3 = hVar.mo51623z(-531731082);
        if ((i3 & 14) == 0) {
            i2 = (z3.mo51619x(k2Var3) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= z3.mo51619x(aVar3) ? 32 : 16;
        }
        if ((i3 & C22657f.CTRL_INDEX) == 0) {
            i2 |= z3.mo51619x(k2Var4) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i2 |= z3.mo51619x(aVar4) ? 2048 : 1024;
        }
        if ((57344 & i3) == 0) {
            i2 |= z3.mo51586g(z2) ? 16384 : 8192;
        }
        if ((46811 & i2) != 9362 || !z3.mo51575a()) {
            C103111a aVar5 = C103111a.f304234a;
            C103111a.C103116e eVar = C103111a.f304241h;
            int i4 = C65503j.f188489K0;
            C65503j.C65504a aVar6 = C65503j.C65504a.f188490d;
            C65503j d = C103166l0.m136520d(C103214y0.m136591g(aVar6, 0.0f, 1, (Object) null), ((C104344e0) z3.mo51598m(f308980a)).f308949h, ((float) 2) * ((float) 8));
            z3.mo51557H(693286680);
            int i5 = C111294a.f333218a;
            C109895y a = C103199s0.m136579a(eVar, C111294a.C111295a.f333226h, z3, 6);
            z3.mo51557H(-1323940314);
            C60686v vVar = C103645l0.f306124e;
            C108322d dVar = (C108322d) z3.mo51598m(vVar);
            C60686v vVar2 = C103645l0.f306130k;
            C33183o oVar = (C33183o) z3.mo51598m(vVar2);
            C60686v vVar3 = C103645l0.f306134o;
            C103633i2 i2Var = (C103633i2) z3.mo51598m(vVar3);
            C110269a.C110270a aVar7 = C110269a.f329831D0;
            aVar7.getClass();
            C65503j.C65504a aVar8 = aVar6;
            C32224a<C110269a> aVar9 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(d);
            C60686v vVar4 = vVar3;
            if (z3.mo51543A() instanceof C24665d) {
                z3.mo51615v();
                if (z3.mo51621y()) {
                    z3.mo51612t(aVar9);
                } else {
                    z3.mo51579c();
                }
                z3.mo51561L();
                aVar7.getClass();
                C32227p<C110269a, C109895y, C13598b0> pVar = C110269a.C110270a.f329836e;
                C108508o2.m147049a(z3, a, pVar);
                aVar7.getClass();
                C32227p<C110269a, C108322d, C13598b0> pVar2 = C110269a.C110270a.f329835d;
                C108508o2.m147049a(z3, dVar, pVar2);
                aVar7.getClass();
                C32227p<C110269a, C33183o, C13598b0> pVar3 = C110269a.C110270a.f329837f;
                C108508o2.m147049a(z3, oVar, pVar3);
                aVar7.getClass();
                C32227p<C110269a, C103633i2, C13598b0> pVar4 = C110269a.C110270a.f329838g;
                C108508o2.m147049a(z3, i2Var, pVar4);
                z3.mo51590i();
                C32227p<C110269a, C103633i2, C13598b0> pVar5 = pVar4;
                C32227p<C110269a, C33183o, C13598b0> pVar6 = pVar3;
                ((C35747b) a2).invoke(new C33489x1(z3), z3, 0);
                z3.mo51557H(2058660585);
                z3.mo51557H(-678309503);
                String string = MMApplicationContext.getString(C0966R.string.gsz);
                C87412m.m108593f(string, "mj_template_template_music.str");
                int i6 = i2 << 3;
                m139322a(string, k2Var3, aVar3, z3, (i6 & 112) | (i6 & C22657f.CTRL_INDEX));
                if (z2) {
                    z3.mo51557H(1733174575);
                    String string2 = MMApplicationContext.getString(C0966R.string.gsu);
                    C87412m.m108593f(string2, "mj_template_origin_music.str");
                    int i7 = i2 >> 3;
                    m139322a(string2, k2Var4, aVar4, z3, (i7 & C22657f.CTRL_INDEX) | (i7 & 112));
                    z3.mo51565P();
                } else {
                    z3.mo51557H(1733174772);
                    z3.mo51557H(733328855);
                    C109895y c = C103141f.m136472c(C111294a.C111295a.f333219a, false, z3, 0);
                    z3.mo51557H(-1323940314);
                    C108322d dVar2 = (C108322d) z3.mo51598m(vVar);
                    C33183o oVar2 = (C33183o) z3.mo51598m(vVar2);
                    C103633i2 i2Var2 = (C103633i2) z3.mo51598m(vVar4);
                    aVar7.getClass();
                    C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a3 = C109863q.m149330a(aVar8);
                    if (z3.mo51543A() instanceof C24665d) {
                        z3.mo51615v();
                        if (z3.mo51621y()) {
                            z3.mo51612t(aVar9);
                        } else {
                            z3.mo51579c();
                        }
                        z3.mo51561L();
                        aVar7.getClass();
                        C108508o2.m147049a(z3, c, pVar);
                        aVar7.getClass();
                        C108508o2.m147049a(z3, dVar2, pVar2);
                        aVar7.getClass();
                        C108508o2.m147049a(z3, oVar2, pVar6);
                        aVar7.getClass();
                        C108508o2.m147049a(z3, i2Var2, pVar5);
                        z3.mo51590i();
                        ((C35747b) a3).invoke(new C33489x1(z3), z3, 0);
                        z3.mo51557H(2058660585);
                        z3.mo51557H(-2137368960);
                        z3.mo51565P();
                        z3.mo51565P();
                        z3.mo51610s();
                        z3.mo51565P();
                        z3.mo51565P();
                        z3.mo51565P();
                    } else {
                        C108501g.m147000a();
                        throw null;
                    }
                }
                z3.mo51565P();
                z3.mo51565P();
                z3.mo51610s();
                z3.mo51565P();
                z3.mo51565P();
            } else {
                C108501g.m147000a();
                throw null;
            }
        } else {
            z3.mo51581d();
        }
        C33487v1 l = z3.mo51596l();
        if (l != null) {
            l.mo51650a(new C54700i(k2Var, aVar, k2Var2, aVar2, z, i));
        }
    }

    /* renamed from: e */
    public static final void m139326e(C32224a<C13598b0> aVar, C54683f0 f0Var, C104344e0 e0Var, C32228q<? super C103161k, ? super C108504h, ? super Integer, C13598b0> qVar, C108504h hVar, int i, int i2) {
        C87412m.m108594g(aVar, "onClick");
        C87412m.m108594g(f0Var, "musicState");
        C87412m.m108594g(e0Var, "musicSelectorTheme");
        C108504h z = hVar.mo51623z(-1030245284);
        C32228q<C103161k, C108504h, Integer, C13598b0> qVar2 = qVar;
        if ((i2 & 8) != 0) {
            C32228q<C103161k, C108504h, Integer, C13598b0> qVar3 = C54676a.f153238a;
            qVar2 = C54676a.f153238a;
        }
        C32228q<? super C103161k, ? super C108504h, ? super Integer, C13598b0> qVar4 = qVar2;
        C108513w.m147056a(new C108502g1[]{f308980a.mo159370b(e0Var)}, C110261c.m149878b(z, 549824796, true, new C54701j(qVar4, aVar, f0Var, i)), z, 56);
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C54702k(aVar, f0Var, e0Var, qVar4, i, i2));
        }
    }

    /* renamed from: f */
    public static final void m139327f(MJMusicInfo mJMusicInfo, C104344e0 e0Var, C32224a<C13598b0> aVar, C108504h hVar, int i) {
        C87412m.m108594g(mJMusicInfo, "mjMusicInfo");
        C87412m.m108594g(e0Var, "musicSelectorTheme");
        C87412m.m108594g(aVar, "onClick");
        C108504h z = hVar.mo51623z(-282212178);
        C108513w.m147056a(new C108502g1[]{f308980a.mo159370b(e0Var)}, C110261c.m149878b(z, 1244220398, true, new C54703l(mJMusicInfo, aVar, i)), z, 56);
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C54704m(mJMusicInfo, e0Var, aVar, i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x010d, code lost:
        if (r12 == p175j0.C108504h.C60656a.f172772a) goto L_0x010f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m139328g(float r25, java.lang.String r26, java.lang.String r27, fy3.C32224a r28, boolean r29, fy3.C32224a r30, p175j0.C108504h r31, int r32, int r33) {
        /*
            r1 = r25
            r10 = r29
            r11 = r32
            r0 = 214896708(0xccf1044, float:3.190319E-31)
            r2 = r31
            j0.h r0 = r2.mo51623z(r0)
            r2 = r33 & 1
            r3 = 2
            if (r2 == 0) goto L_0x0017
            r2 = r11 | 6
            goto L_0x0027
        L_0x0017:
            r2 = r11 & 14
            if (r2 != 0) goto L_0x0026
            boolean r2 = r0.mo51588h(r1)
            if (r2 == 0) goto L_0x0023
            r2 = 4
            goto L_0x0024
        L_0x0023:
            r2 = 2
        L_0x0024:
            r2 = r2 | r11
            goto L_0x0027
        L_0x0026:
            r2 = r11
        L_0x0027:
            r4 = r33 & 2
            if (r4 == 0) goto L_0x0030
            r2 = r2 | 48
            r9 = r26
            goto L_0x0042
        L_0x0030:
            r4 = r11 & 112(0x70, float:1.57E-43)
            r9 = r26
            if (r4 != 0) goto L_0x0042
            boolean r4 = r0.mo51619x(r9)
            if (r4 == 0) goto L_0x003f
            r4 = 32
            goto L_0x0041
        L_0x003f:
            r4 = 16
        L_0x0041:
            r2 = r2 | r4
        L_0x0042:
            r4 = r33 & 4
            if (r4 == 0) goto L_0x004b
            r2 = r2 | 384(0x180, float:5.38E-43)
            r7 = r27
            goto L_0x005d
        L_0x004b:
            r4 = r11 & 896(0x380, float:1.256E-42)
            r7 = r27
            if (r4 != 0) goto L_0x005d
            boolean r4 = r0.mo51619x(r7)
            if (r4 == 0) goto L_0x005a
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005c
        L_0x005a:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005c:
            r2 = r2 | r4
        L_0x005d:
            r4 = r33 & 8
            if (r4 == 0) goto L_0x0066
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r8 = r28
            goto L_0x0078
        L_0x0066:
            r4 = r11 & 7168(0x1c00, float:1.0045E-41)
            r8 = r28
            if (r4 != 0) goto L_0x0078
            boolean r4 = r0.mo51619x(r8)
            if (r4 == 0) goto L_0x0075
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r2 = r2 | r4
        L_0x0078:
            r4 = r33 & 16
            if (r4 == 0) goto L_0x007f
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0091
        L_0x007f:
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r11
            if (r4 != 0) goto L_0x0091
            boolean r4 = r0.mo51586g(r10)
            if (r4 == 0) goto L_0x008e
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0090
        L_0x008e:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x0090:
            r2 = r2 | r4
        L_0x0091:
            r4 = r33 & 32
            if (r4 == 0) goto L_0x0099
            r5 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r5
            goto L_0x00ad
        L_0x0099:
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r11
            if (r5 != 0) goto L_0x00ad
            r5 = r30
            boolean r6 = r0.mo51619x(r5)
            if (r6 == 0) goto L_0x00a9
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ab
        L_0x00a9:
            r6 = 65536(0x10000, float:9.18355E-41)
        L_0x00ab:
            r2 = r2 | r6
            goto L_0x00af
        L_0x00ad:
            r5 = r30
        L_0x00af:
            r6 = r2
            r2 = 374491(0x5b6db, float:5.24774E-40)
            r2 = r2 & r6
            r12 = 74898(0x12492, float:1.04954E-40)
            if (r2 != r12) goto L_0x00c6
            boolean r2 = r0.mo51575a()
            if (r2 != 0) goto L_0x00c0
            goto L_0x00c6
        L_0x00c0:
            r0.mo51581d()
            r6 = r5
            goto L_0x01a0
        L_0x00c6:
            if (r4 == 0) goto L_0x00cc
            r2 = 0
            r24 = r2
            goto L_0x00ce
        L_0x00cc:
            r24 = r5
        L_0x00ce:
            if (r10 == 0) goto L_0x00e1
            r2 = -363401620(0xffffffffea56ee6c, float:-6.495901E25)
            r0.mo51557H(r2)
            j0.f1<ca0.e0> r2 = f308980a
            java.lang.Object r2 = r0.mo51598m(r2)
            ca0.e0 r2 = (ca0.C104344e0) r2
            long r4 = r2.f308944c
            goto L_0x00f1
        L_0x00e1:
            r2 = -363401555(0xffffffffea56eead, float:-6.495931E25)
            r0.mo51557H(r2)
            j0.f1<ca0.e0> r2 = f308980a
            java.lang.Object r2 = r0.mo51598m(r2)
            ca0.e0 r2 = (ca0.C104344e0) r2
            long r4 = r2.f308943b
        L_0x00f1:
            r0.mo51565P()
            a1.w r2 = new a1.w
            r2.<init>(r4)
            r12 = 1157296644(0x44faf204, float:2007.563)
            r0.mo51557H(r12)
            boolean r2 = r0.mo51619x(r2)
            java.lang.Object r12 = r0.mo51606q()
            if (r2 != 0) goto L_0x010f
            int r2 = p175j0.C108504h.f324828a
            java.lang.Object r2 = p175j0.C108504h.C60656a.f172772a
            if (r12 != r2) goto L_0x0128
        L_0x010f:
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 14
            r19 = 0
            r12 = r4
            long r12 = p436a1.C103272w.m136780b(r12, r14, r15, r16, r17, r18, r19)
            a1.w r2 = new a1.w
            r2.<init>(r12)
            r0.mo51553F(r2)
            r12 = r2
        L_0x0128:
            r0.mo51565P()
            a1.w r12 = (p436a1.C103272w) r12
            long r14 = r12.f304517a
            float r2 = (float) r3
            r3 = 8
            float r3 = (float) r3
            float r2 = r2 * r3
            e0.f r19 = p502e0.C107074g.m144958a(r2)
            if (r24 == 0) goto L_0x0151
            int r2 = p721v0.C65503j.f188489K0
            v0.j$a r12 = p721v0.C65503j.C65504a.f188490d
            r13 = 0
            r2 = 0
            r17 = 5
            r18 = 0
            r20 = r14
            r14 = r26
            r15 = r2
            r16 = r24
            v0.j r2 = p267x.C111940o.m152651d(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x016c
        L_0x0151:
            r20 = r14
            int r2 = p721v0.C65503j.f188489K0
            v0.j$a r2 = p721v0.C65503j.C65504a.f188490d
            r12 = 11
            float r12 = (float) r12
            float r12 = r12 * r3
            v0.j r2 = p435a0.C103214y0.m136592h(r2, r12)
            v0.j r2 = p435a0.C103214y0.m136596l(r2, r1)
            float r3 = p436a1.C103272w.m136782d(r4)
            v0.j r2 = p868x0.C111976a.m152678a(r2, r3)
        L_0x016c:
            r12 = r2
            r16 = 0
            r18 = 0
            r22 = 0
            r13 = -551391864(0xffffffffdf226d88, float:-1.170416E19)
            ca0.q r14 = new ca0.q
            r2 = r14
            r3 = r26
            r4 = r27
            r5 = r29
            r7 = r20
            r9 = r28
            r2.<init>(r3, r4, r5, r6, r7, r9)
            r2 = 1
            q0.a r2 = p415q0.C110261c.m149878b(r0, r13, r2, r14)
            r3 = 1572864(0x180000, float:2.204052E-39)
            r23 = 56
            r13 = r19
            r14 = r20
            r19 = r22
            r20 = r2
            r21 = r0
            r22 = r3
            p543h0.C107927c0.m146232a(r12, r13, r14, r16, r18, r19, r20, r21, r22, r23)
            r6 = r24
        L_0x01a0:
            j0.v1 r9 = r0.mo51596l()
            if (r9 != 0) goto L_0x01a7
            goto L_0x01be
        L_0x01a7:
            ca0.r r12 = new ca0.r
            r0 = r12
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r29
            r7 = r32
            r8 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.mo51650a(r12)
        L_0x01be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca0.C104353p.m139328g(float, java.lang.String, java.lang.String, fy3.a, boolean, fy3.a, j0.h, int, int):void");
    }

    /* renamed from: h */
    public static final List m139329h(C60667k2 k2Var) {
        return (List) k2Var.getValue();
    }

    /* renamed from: i */
    public static final void m139330i(C32228q qVar, C32224a aVar, C54683f0 f0Var, C108504h hVar, int i) {
        C32228q qVar2 = qVar;
        C54683f0 f0Var2 = f0Var;
        int i2 = i;
        C108504h z = hVar.mo51623z(-1934922111);
        C104344e0 e0Var = (C104344e0) z.mo51598m(f308980a);
        int i3 = C111294a.f333218a;
        C111294a.C37633b bVar = C111294a.C111295a.f333229k;
        int i4 = C65503j.f188489K0;
        C65503j.C65504a aVar2 = C65503j.C65504a.f188490d;
        C65503j g = C103214y0.m136591g(aVar2, 0.0f, 1, (Object) null);
        z.mo51557H(-483455358);
        C109895y a = C103157j.m136499a(C103111a.f304237d, bVar, z, 48);
        z.mo51557H(-1323940314);
        C108322d dVar = (C108322d) z.mo51598m(C103645l0.f306124e);
        C33183o oVar = (C33183o) z.mo51598m(C103645l0.f306130k);
        C103633i2 i2Var = (C103633i2) z.mo51598m(C103645l0.f306134o);
        C110269a.f329831D0.getClass();
        C32224a<C110269a> aVar3 = C110269a.C110270a.f329833b;
        C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(g);
        if (z.mo51543A() instanceof C24665d) {
            z.mo51615v();
            if (z.mo51621y()) {
                z.mo51612t(aVar3);
            } else {
                z.mo51579c();
            }
            z.mo51561L();
            C108508o2.m147049a(z, a, C110269a.C110270a.f329836e);
            C108508o2.m147049a(z, dVar, C110269a.C110270a.f329835d);
            C108508o2.m147049a(z, oVar, C110269a.C110270a.f329837f);
            C108508o2.m147049a(z, i2Var, C110269a.C110270a.f329838g);
            z.mo51590i();
            ((C35747b) a2).invoke(new C33489x1(z), z, 0);
            z.mo51557H(2058660585);
            z.mo51557H(-1163856341);
            C103165l lVar = C103165l.f304321a;
            float f = (float) 8;
            C107073f a3 = C107074g.m144958a(((float) 1.5d) * f);
            float f2 = f;
            C103165l lVar2 = lVar;
            C65503j.C65504a aVar4 = aVar2;
            C107927c0.m146232a(C111940o.m152651d(C103214y0.m136595k(aVar2, ((float) 6) * f, ((float) 2.5d) * f), false, (String) null, (C111072h) null, aVar, 7, (Object) null), a3, e0Var.f308942a, 0, (C111929l) null, 0.0f, C110261c.m149878b(z, -1656103665, true, new C104358y(e0Var)), z, 1572864, 56);
            z.mo51557H(-492369756);
            Object q = z.mo51606q();
            int i5 = C108504h.f324828a;
            if (q == C108504h.C60656a.f172772a) {
                q = C108500f2.m146996c("", (C108497e2) null, 2, (Object) null);
                z.mo51553F(q);
            }
            z.mo51565P();
            C60690y0 y0Var = (C60690y0) q;
            String musicID = f0Var2.f153250b.getValue().getMusicID();
            C87412m.m108593f(musicID, "musicState.musicInfoState.value.musicID");
            y0Var.setValue(musicID);
            qVar2.invoke(lVar2, z, Integer.valueOf(((i2 << 3) & 112) | 6));
            m139324c(f0Var2, y0Var, f0Var2.f153251c, z, 56);
            m139325d(f0Var2.f153252d, new C54710z(f0Var2), f0Var2.f153253e, new C54678a0(f0Var2), f0Var2.f153257i, z, 0);
            C103129b1.m136432a(C103214y0.m136592h(aVar4, ((float) 3) * f2), z, 6);
            z.mo51565P();
            z.mo51565P();
            z.mo51610s();
            z.mo51565P();
            z.mo51565P();
            C33487v1 l = z.mo51596l();
            if (l != null) {
                l.mo51650a(new C54680b0(qVar2, aVar, f0Var2, i2));
                return;
            }
            return;
        }
        C108501g.m147000a();
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002d, code lost:
        if (r4 == p175j0.C108504h.C60656a.f172772a) goto L_0x002f;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m139331j(com.tencent.maas.model.MJMusicInfo r14, fy3.C32224a r15, p175j0.C108504h r16, int r17) {
        /*
            r0 = r14
            r1 = -842177017(0xffffffffcdcd6607, float:-4.30751968E8)
            r2 = r16
            j0.h r1 = r2.mo51623z(r1)
            j0.f1<ca0.e0> r2 = f308980a
            java.lang.Object r2 = r1.mo51598m(r2)
            ca0.e0 r2 = (ca0.C104344e0) r2
            long r3 = r2.f308943b
            a1.w r5 = new a1.w
            r5.<init>(r3)
            r3 = 1157296644(0x44faf204, float:2007.563)
            r1.mo51557H(r3)
            boolean r3 = r1.mo51619x(r5)
            java.lang.Object r4 = r1.mo51606q()
            if (r3 != 0) goto L_0x002f
            int r3 = p175j0.C108504h.f324828a
            java.lang.Object r3 = p175j0.C108504h.C60656a.f172772a
            if (r4 != r3) goto L_0x0046
        L_0x002f:
            long r5 = r2.f308943b
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 14
            r12 = 0
            long r3 = p436a1.C103272w.m136780b(r5, r7, r8, r9, r10, r11, r12)
            a1.w r5 = new a1.w
            r5.<init>(r3)
            r1.mo51553F(r5)
            r4 = r5
        L_0x0046:
            r1.mo51565P()
            a1.w r4 = (p436a1.C103272w) r4
            long r4 = r4.f304517a
            j0.f1<android.content.res.Configuration> r3 = androidx.compose.p002ui.platform.C103691v.f306267a
            r3 = 2
            float r3 = (float) r3
            r6 = 8
            float r6 = (float) r6
            float r3 = r3 * r6
            e0.f r3 = p502e0.C107074g.m144958a(r3)
            int r7 = p721v0.C65503j.f188489K0
            v0.j$a r7 = p721v0.C65503j.C65504a.f188490d
            r8 = 4
            float r8 = (float) r8
            float r8 = r8 * r6
            v0.j r7 = p435a0.C103214y0.m136592h(r7, r8)
            r8 = 21
            float r8 = (float) r8
            float r8 = r8 * r6
            v0.j r6 = p435a0.C103214y0.m136596l(r7, r8)
            long r7 = r2.f308943b
            float r2 = p436a1.C103272w.m136782d(r7)
            v0.j r7 = p868x0.C111976a.m152678a(r6, r2)
            java.lang.String r9 = r14.getSongName()
            r8 = 0
            r10 = 0
            r12 = 5
            r13 = 0
            r11 = r15
            v0.j r2 = p267x.C111940o.m152651d(r7, r8, r9, r10, r11, r12, r13)
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 83601731(0x4fba943, float:5.916526E-36)
            r11 = 1
            ca0.c0 r12 = new ca0.c0
            r12.<init>(r14, r4)
            q0.a r10 = p415q0.C110261c.m149878b(r1, r10, r11, r12)
            r12 = 1572864(0x180000, float:2.204052E-39)
            r13 = 56
            r11 = r1
            p543h0.C107927c0.m146232a(r2, r3, r4, r6, r8, r9, r10, r11, r12, r13)
            j0.v1 r1 = r1.mo51596l()
            if (r1 != 0) goto L_0x00a6
            goto L_0x00b1
        L_0x00a6:
            ca0.d0 r2 = new ca0.d0
            r3 = r15
            r4 = r17
            r2.<init>(r14, r15, r4)
            r1.mo51650a(r2)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca0.C104353p.m139331j(com.tencent.maas.model.MJMusicInfo, fy3.a, j0.h, int):void");
    }
}
