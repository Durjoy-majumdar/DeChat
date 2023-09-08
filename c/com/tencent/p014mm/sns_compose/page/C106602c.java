package com.tencent.p014mm.sns_compose.page;

import a14.C0000n0;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.p002ui.platform.C103612c1;
import androidx.compose.p002ui.platform.C103618e1;
import androidx.compose.p002ui.platform.C103633i2;
import androidx.compose.p002ui.platform.C103645l0;
import androidx.compose.p002ui.platform.C103691v;
import androidx.lifecycle.C0125s;
import androidx.paging.compose.C54222c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.LVBuffer;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sns_compose.page.C57573j;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d14.C58052j1;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i21.C60242i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k21.C60960c;
import kg3.C76577a;
import kh3.C61095a;
import kotlin.ResultKt;
import lh3.C34280b;
import lh3.C99474g;
import m03.C99783d;
import my3.C34690i;
import my3.C61595o;
import nj3.C76912y0;
import oh3.C100356d;
import oh3.C110041b;
import oh3.C110042e;
import p004b0.C103953l0;
import p004b0.C54380k;
import p004b0.C54390x;
import p1104d1.C106969c;
import p175j0.C108494d2;
import p175j0.C108501g;
import p175j0.C108504h;
import p175j0.C108508o2;
import p175j0.C108515x;
import p175j0.C24665d;
import p175j0.C33487v1;
import p175j0.C33489x1;
import p175j0.C60647d0;
import p175j0.C60651e0;
import p175j0.C60655g0;
import p175j0.C60667k2;
import p175j0.C60686v;
import p175j0.C60690y0;
import p246u1.C111072h;
import p247u3.C65006a0;
import p267x.C111897d1;
import p267x.C111905e;
import p267x.C111929l;
import p267x.C111940o;
import p415q0.C110261c;
import p415q0.C35747b;
import p435a0.C103111a;
import p435a0.C103129b1;
import p435a0.C103138e;
import p435a0.C103140e1;
import p435a0.C103141f;
import p435a0.C103153h;
import p435a0.C103155i;
import p435a0.C103157j;
import p435a0.C103161k;
import p435a0.C103165l;
import p435a0.C103166l0;
import p435a0.C103199s0;
import p435a0.C103203t0;
import p435a0.C103206u0;
import p435a0.C103214y0;
import p436a1.C103229d0;
import p436a1.C103230e;
import p436a1.C103264s0;
import p436a1.C103266t0;
import p436a1.C103273w0;
import p436a1.C103274x;
import p451b2.C104014i;
import p451b2.C104020o;
import p451b2.C104021p;
import p451b2.C104022q;
import p486d2.C106974e;
import p502e0.C107073f;
import p502e0.C107074g;
import p532g5.C59349d;
import p543h0.C107927c0;
import p543h0.C107957i0;
import p543h0.C107960j0;
import p544h2.C108014f;
import p544h2.C32656a;
import p544h2.C32659e;
import p544h2.C32660g;
import p544h2.C32661i;
import p544h2.C32662j;
import p560i2.C108322d;
import p560i2.C33183o;
import p631o1.C109836f;
import p631o1.C109863q;
import p631o1.C109895y;
import p658q1.C110269a;
import p721v0.C111294a;
import p721v0.C111299g;
import p721v0.C65503j;
import p735w1.C111703v;
import p735w1.C111705z;
import p868x0.C111979d;
import qo3.C47883u;
import qo3.C77426q;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36904l0;
import ta0.C110954a;
import te3.C101804kv2;
import te3.C101829pp1;
import um0.C22657f;
import va0.C111504g;
import wx3.C15601d;
import wx3.C66217g;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.sns_compose.page.c */
public final class C106602c {

    /* renamed from: com.tencent.mm.sns_compose.page.c$a0 */
    public static final class C57558a0 extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C57589s f164807d;

        /* renamed from: e */
        public final /* synthetic */ C103953l0 f164808e;

        /* renamed from: f */
        public final /* synthetic */ int f164809f;

        /* renamed from: g */
        public final /* synthetic */ C99474g f164810g;

        /* renamed from: h */
        public final /* synthetic */ C54222c<C99474g> f164811h;

        /* renamed from: i */
        public final /* synthetic */ LifecycleScope f164812i;

        /* renamed from: j */
        public final /* synthetic */ int f164813j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57558a0(C57589s sVar, C103953l0 l0Var, int i, C99474g gVar, C54222c<C99474g> cVar, LifecycleScope lifecycleScope, int i2) {
            super(2);
            this.f164807d = sVar;
            this.f164808e = l0Var;
            this.f164809f = i;
            this.f164810g = gVar;
            this.f164811h = cVar;
            this.f164812i = lifecycleScope;
            this.f164813j = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C106602c.m143958l(this.f164807d, this.f164808e, this.f164809f, this.f164810g, this.f164811h, this.f164812i, (C108504h) obj, this.f164813j | 1);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.sns_compose.page.ListItemsKt$BuildImage$2", mo125469f = "ListItems.kt", mo125470l = {506}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.sns_compose.page.c$b */
    public static final class C57559b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f164814d;

        /* renamed from: e */
        public final /* synthetic */ C101804kv2 f164815e;

        /* renamed from: f */
        public final /* synthetic */ boolean f164816f;

        /* renamed from: g */
        public final /* synthetic */ C60690y0<C103229d0> f164817g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57559b(C101804kv2 kv22, boolean z, C60690y0<C103229d0> y0Var, C15601d<? super C57559b> dVar) {
            super(2, dVar);
            this.f164815e = kv22;
            this.f164816f = z;
            this.f164817g = y0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C57559b(this.f164815e, this.f164816f, this.f164817g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C57559b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f164814d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C101804kv2 kv22 = this.f164815e;
                boolean z = this.f164816f;
                this.f164814d = 1;
                Log.m105924i("PlatformOp", "getSnsMediaBitmap() called with: mediaId = " + kv22.f298689d + ", thumb = " + z);
                obj = null;
                if (aVar == null) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                this.f164817g.setValue(C103230e.m136642b(bitmap));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$b0 */
    public static final class C57560b0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C99474g f164818d;

        /* renamed from: e */
        public final /* synthetic */ Context f164819e;

        /* renamed from: f */
        public final /* synthetic */ C57589s f164820f;

        /* renamed from: g */
        public final /* synthetic */ C0000n0 f164821g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57560b0(C99474g gVar, Context context, C57589s sVar, C0000n0 n0Var) {
            super(0);
            this.f164818d = gVar;
            this.f164819e = context;
            this.f164820f = sVar;
            this.f164821g = n0Var;
        }

        public Object invoke() {
            C99474g gVar = this.f164818d;
            if ((gVar.f291662k & 64) > 0) {
                C106602c.m143961o(this.f164819e, this.f164820f, this.f164821g, gVar);
            } else {
                Context context = this.f164819e;
                String str = gVar.f291655d;
                C87412m.m108594g(context, "context");
                C87412m.m108594g(str, "snsId");
                Log.m105924i("PlatformOp", "showDetailUI() called with: context = " + context + ", snsId = " + str);
                C60960c.f173618a.mo85927k("MomentsTogetherHistoryBrowsing", "withFriendDetailCount", str, C60242i.UNREPEAT);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$c */
    public static final class C57561c extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C101804kv2 f164822d;

        /* renamed from: e */
        public final /* synthetic */ C65503j f164823e;

        /* renamed from: f */
        public final /* synthetic */ boolean f164824f;

        /* renamed from: g */
        public final /* synthetic */ int f164825g;

        /* renamed from: h */
        public final /* synthetic */ int f164826h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57561c(C101804kv2 kv22, C65503j jVar, boolean z, int i, int i2) {
            super(2);
            this.f164822d = kv22;
            this.f164823e = jVar;
            this.f164824f = z;
            this.f164825g = i;
            this.f164826h = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C106602c.m143949c(this.f164822d, this.f164823e, this.f164824f, (C108504h) obj, this.f164825g | 1, this.f164826h);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$c0 */
    public static final class C57562c0 extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Context f164827d;

        /* renamed from: e */
        public final /* synthetic */ C57589s f164828e;

        /* renamed from: f */
        public final /* synthetic */ C0000n0 f164829f;

        /* renamed from: g */
        public final /* synthetic */ C99474g f164830g;

        /* renamed from: h */
        public final /* synthetic */ C54222c<C99474g> f164831h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57562c0(Context context, C57589s sVar, C0000n0 n0Var, C99474g gVar, C54222c<C99474g> cVar) {
            super(0);
            this.f164827d = context;
            this.f164828e = sVar;
            this.f164829f = n0Var;
            this.f164830g = gVar;
            this.f164831h = cVar;
        }

        public Object invoke() {
            Context context = this.f164827d;
            C57589s sVar = this.f164828e;
            C0000n0 n0Var = this.f164829f;
            C99474g gVar = this.f164830g;
            C57572i iVar = new C57572i(context, gVar, this.f164831h);
            C87412m.m108594g(context, "context");
            C87412m.m108594g(sVar, "withTaViewModel");
            C87412m.m108594g(n0Var, "rememberScope");
            C87412m.m108594g(gVar, "item");
            if ((gVar.f291662k & 64) > 0) {
                C106602c.m143961o(context, sVar, n0Var, gVar);
            } else {
                iVar.invoke();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$d0 */
    public static final class C57563d0 implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ Context f164832a;

        /* renamed from: b */
        public final /* synthetic */ C0000n0 f164833b;

        /* renamed from: c */
        public final /* synthetic */ C99474g f164834c;

        /* renamed from: d */
        public final /* synthetic */ C57589s f164835d;

        /* renamed from: com.tencent.mm.sns_compose.page.c$d0$a */
        public static final class C57564a extends C87413o implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C57589s f164836d;

            /* renamed from: e */
            public final /* synthetic */ C99474g f164837e;

            /* renamed from: f */
            public final /* synthetic */ Context f164838f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57564a(C57589s sVar, C99474g gVar, Context context) {
                super(1);
                this.f164836d = sVar;
                this.f164837e = gVar;
                this.f164838f = context;
            }

            public Object invoke(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    C57589s sVar = this.f164836d;
                    C57573j.C57574a aVar = new C57573j.C57574a(this.f164837e);
                    sVar.getClass();
                    C58052j1 j1Var = (C58052j1) sVar.f164905e;
                    j1Var.setValue(C110818d0.m150934f0((Collection) j1Var.getValue(), aVar));
                    C76912y0.m92768g(this.f164838f, MMApplicationContext.getString(C0966R.string.lzr));
                } else {
                    C76912y0.m92767f(this.f164838f, MMApplicationContext.getString(C0966R.string.lzs));
                }
                return C13598b0.f38549a;
            }
        }

        public C57563d0(Context context, C0000n0 n0Var, C99474g gVar, C57589s sVar) {
            this.f164832a = context;
            this.f164833b = n0Var;
            this.f164834c = gVar;
            this.f164835d = sVar;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            Context context = this.f164832a;
            C0000n0 n0Var = this.f164833b;
            C99474g gVar = this.f164834c;
            String str2 = gVar.f291657f;
            new C57564a(this.f164835d, gVar, context);
            C87412m.m108594g(context, "context");
            C87412m.m108594g(n0Var, "scope");
            C87412m.m108594g(str2, TPReportKeys.Common.COMMON_SEQ);
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$l */
    public static final class C57565l extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32228q<C103153h, C108504h, Integer, C13598b0> f164839d;

        /* renamed from: e */
        public final /* synthetic */ int f164840e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57565l(C32228q<? super C103153h, ? super C108504h, ? super Integer, C13598b0> qVar, int i) {
            super(2);
            this.f164839d = qVar;
            this.f164840e = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C106602c.m143953g(this.f164839d, (C108504h) obj, this.f164840e | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$t */
    public static final class C57566t extends C87413o implements C32226l<C60651e0, C60647d0> {

        /* renamed from: d */
        public final /* synthetic */ C0125s f164841d;

        /* renamed from: e */
        public final /* synthetic */ C100356d f164842e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57566t(C0125s sVar, C100356d dVar) {
            super(1);
            this.f164841d = sVar;
            this.f164842e = dVar;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C60651e0) obj, "$this$DisposableEffect");
            ListItemsKt$VideoContent$1$observer$1 listItemsKt$VideoContent$1$observer$1 = new ListItemsKt$VideoContent$1$observer$1(this.f164842e);
            this.f164841d.getLifecycle().addObserver(listItemsKt$VideoContent$1$observer$1);
            return new C57571h(this.f164841d, listItemsKt$VideoContent$1$observer$1);
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$w */
    public static final class C57567w extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C99474g.C99481g f164843d;

        /* renamed from: e */
        public final /* synthetic */ LifecycleScope f164844e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<Boolean> f164845f;

        /* renamed from: g */
        public final /* synthetic */ C32224a<C13598b0> f164846g;

        /* renamed from: h */
        public final /* synthetic */ int f164847h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57567w(C99474g.C99481g gVar, LifecycleScope lifecycleScope, C32224a<Boolean> aVar, C32224a<C13598b0> aVar2, int i) {
            super(2);
            this.f164843d = gVar;
            this.f164844e = lifecycleScope;
            this.f164845f = aVar;
            this.f164846g = aVar2;
            this.f164847h = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C106602c.m143957k(this.f164843d, this.f164844e, this.f164845f, this.f164846g, (C108504h) obj, this.f164847h | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$x */
    public static final class C57568x extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<Boolean> f164848d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57568x(C32224a<Boolean> aVar) {
            super(0);
            this.f164848d = aVar;
        }

        public Object invoke() {
            return this.f164848d.invoke();
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$y */
    public static final class C57569y extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C99474g f164849d;

        /* renamed from: e */
        public final /* synthetic */ Context f164850e;

        /* renamed from: f */
        public final /* synthetic */ C57589s f164851f;

        /* renamed from: g */
        public final /* synthetic */ C0000n0 f164852g;

        /* renamed from: h */
        public final /* synthetic */ C54222c<C99474g> f164853h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57569y(C99474g gVar, Context context, C57589s sVar, C0000n0 n0Var, C54222c<C99474g> cVar) {
            super(1);
            this.f164849d = gVar;
            this.f164850e = context;
            this.f164851f = sVar;
            this.f164852g = n0Var;
            this.f164853h = cVar;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            C99474g gVar = this.f164849d;
            if ((gVar.f291662k & 64) > 0) {
                C106602c.m143961o(this.f164850e, this.f164851f, this.f164852g, gVar);
            } else {
                C61095a aVar = C61095a.f173960a;
                aVar.mo86013d(this.f164850e, gVar.f291656e, aVar.mo86026o().equals(this.f164849d.f291652a), C106602c.m143959m(str, this.f164853h));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$z */
    public static final class C57570z extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ int f164854d;

        /* renamed from: e */
        public final /* synthetic */ int f164855e;

        /* renamed from: f */
        public final /* synthetic */ C103953l0 f164856f;

        /* renamed from: g */
        public final /* synthetic */ C54222c<C99474g> f164857g;

        /* renamed from: h */
        public final /* synthetic */ C99474g f164858h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57570z(int i, int i2, C103953l0 l0Var, C54222c<C99474g> cVar, C99474g gVar) {
            super(0);
            this.f164854d = i;
            this.f164855e = i2;
            this.f164856f = l0Var;
            this.f164857g = cVar;
            this.f164858h = gVar;
        }

        public Object invoke() {
            C99474g gVar;
            int i = this.f164854d;
            int i2 = this.f164855e;
            C103953l0 l0Var = this.f164856f;
            C54222c<C99474g> cVar = this.f164857g;
            C87412m.m108594g(l0Var, "listState");
            C87412m.m108594g(cVar, "items");
            C99474g gVar2 = null;
            if (!l0Var.mo90552a()) {
                C54390x g = l0Var.mo145573g();
                Iterator<T> it = g.mo55835f().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C54380k kVar = (C54380k) it.next();
                        int index = kVar.getIndex();
                        if (index <= 0 || index >= cVar.mo75006b()) {
                            gVar = null;
                        } else {
                            gVar = (C99474g) ((C65006a0) ((C108494d2) cVar.f152187b).getValue()).get(index - 1);
                        }
                        if (gVar != null && (gVar instanceof C99474g.C99481g)) {
                            if (g.mo55833c() - kVar.getOffset() < i2) {
                                break;
                            } else if (kVar.getOffset() > (-i)) {
                                gVar2 = gVar;
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                }
            }
            return Boolean.valueOf(C87412m.m108589b(gVar2, this.f164858h));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.sns_compose.page.ListItemsKt$VideoContent$2", mo125469f = "ListItems.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.sns_compose.page.c$u */
    public static final class C96977u extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C100356d f284098d;

        /* renamed from: e */
        public final /* synthetic */ C60667k2<Boolean> f284099e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96977u(C100356d dVar, C60667k2<Boolean> k2Var, C15601d<? super C96977u> dVar2) {
            super(2, dVar2);
            this.f284098d = dVar;
            this.f284099e = k2Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C96977u(this.f284098d, this.f284099e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C96977u) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C99783d dVar;
            C99783d dVar2;
            ResultKt.throwOnFailure(obj);
            C100356d dVar3 = this.f284098d;
            boolean booleanValue = this.f284099e.getValue().booleanValue();
            dVar3.getClass();
            Log.m105926v("MiscroMsg.PlayerState", "updatePlayState snsId:" + dVar3.f293944e + "  isPlay:play :" + booleanValue);
            dVar3.f293950n = booleanValue;
            C99783d dVar4 = dVar3.f293949j;
            if (dVar4 != null) {
                if (booleanValue) {
                    if (!dVar4.isPlaying() && (dVar2 = dVar3.f293949j) != null) {
                        dVar2.start();
                    }
                } else if (dVar4.isPlaying() && (dVar = dVar3.f293949j) != null) {
                    dVar.pause();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$a */
    public static final class C106603a extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f318536d;

        /* renamed from: e */
        public final /* synthetic */ String f318537e;

        /* renamed from: f */
        public final /* synthetic */ C65503j f318538f;

        /* renamed from: g */
        public final /* synthetic */ int f318539g;

        /* renamed from: h */
        public final /* synthetic */ int f318540h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106603a(String str, String str2, C65503j jVar, int i, int i2) {
            super(2);
            this.f318536d = str;
            this.f318537e = str2;
            this.f318538f = jVar;
            this.f318539g = i;
            this.f318540h = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C106602c.m143947a(this.f318536d, this.f318537e, this.f318538f, (C108504h) obj, this.f318539g | 1, this.f318540h);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$d */
    public static final class C106604d extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f318541d;

        /* renamed from: e */
        public final /* synthetic */ C65503j f318542e;

        /* renamed from: f */
        public final /* synthetic */ int f318543f;

        /* renamed from: g */
        public final /* synthetic */ int f318544g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106604d(String str, C65503j jVar, int i, int i2) {
            super(2);
            this.f318541d = str;
            this.f318542e = jVar;
            this.f318543f = i;
            this.f318544g = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C106602c.m143948b(this.f318541d, this.f318542e, (C108504h) obj, this.f318543f | 1, this.f318544g);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$e */
    public static final class C106605e extends C87413o implements C32228q<C103153h, C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f318545d;

        /* renamed from: e */
        public final /* synthetic */ int f318546e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f318547f;

        /* renamed from: g */
        public final /* synthetic */ boolean f318548g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106605e(String str, int i, C32224a<C13598b0> aVar, boolean z) {
            super(3);
            this.f318545d = str;
            this.f318546e = i;
            this.f318547f = aVar;
            this.f318548g = z;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C103153h hVar = (C103153h) obj;
            C108504h hVar2 = (C108504h) obj2;
            int intValue = ((Number) obj3).intValue();
            C87412m.m108594g(hVar, "$this$MediaContent");
            if ((intValue & 14) == 0) {
                intValue |= hVar2.mo51619x(hVar) ? 4 : 2;
            }
            if ((intValue & 91) != 18 || !hVar2.mo51575a()) {
                C59349d a = C110041b.m149550a(this.f318545d, hVar2, this.f318546e & 14);
                int i = C109836f.f328763a;
                C109836f fVar = C109836f.C109837a.f328764a;
                int i2 = C65503j.f188489K0;
                C65503j.C65504a aVar = C65503j.C65504a.f188490d;
                C111897d1.m152617a(a, "image", C111940o.m152651d(C103214y0.m136590f(aVar, 0.0f, 1, (Object) null), false, (String) null, (C111072h) null, this.f318547f, 7, (Object) null), (C111294a) null, fVar, 0.0f, (C103274x) null, hVar2, 24624, 104);
                if (this.f318548g) {
                    C106969c d = C110954a.m151256d(C0966R.raw.shortvideo_play_btn, hVar2, 0);
                    int i3 = C111294a.f333218a;
                    C111897d1.m152617a(d, "play button", hVar.mo142907a(aVar, C111294a.C111295a.f333222d), (C111294a) null, (C109836f) null, 0.0f, (C103274x) null, hVar2, 56, 120);
                }
            } else {
                hVar2.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$f */
    public static final class C106606f extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f318549d;

        /* renamed from: e */
        public final /* synthetic */ boolean f318550e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f318551f;

        /* renamed from: g */
        public final /* synthetic */ int f318552g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106606f(String str, boolean z, C32224a<C13598b0> aVar, int i) {
            super(2);
            this.f318549d = str;
            this.f318550e = z;
            this.f318551f = aVar;
            this.f318552g = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C106602c.m143950d(this.f318549d, this.f318550e, this.f318551f, (C108504h) obj, this.f318552g | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$g */
    public static final class C106607g extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C101804kv2 f318553d;

        /* renamed from: e */
        public final /* synthetic */ boolean f318554e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f318555f;

        /* renamed from: g */
        public final /* synthetic */ int f318556g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106607g(C101804kv2 kv22, boolean z, C32224a<C13598b0> aVar, int i) {
            super(2);
            this.f318553d = kv22;
            this.f318554e = z;
            this.f318555f = aVar;
            this.f318556g = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C106602c.m143951e(this.f318553d, this.f318554e, this.f318555f, (C108504h) obj, this.f318556g | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$h */
    public static final class C106608h extends C87413o implements C32228q<C103153h, C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f318557d;

        /* renamed from: e */
        public final /* synthetic */ C101804kv2 f318558e;

        /* renamed from: f */
        public final /* synthetic */ boolean f318559f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106608h(C32224a<C13598b0> aVar, C101804kv2 kv22, boolean z) {
            super(3);
            this.f318557d = aVar;
            this.f318558e = kv22;
            this.f318559f = z;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C103153h hVar = (C103153h) obj;
            C108504h hVar2 = (C108504h) obj2;
            int intValue = ((Number) obj3).intValue();
            C87412m.m108594g(hVar, "$this$MediaContent");
            if ((intValue & 14) == 0) {
                intValue |= hVar2.mo51619x(hVar) ? 4 : 2;
            }
            if ((intValue & 91) != 18 || !hVar2.mo51575a()) {
                int i = C65503j.f188489K0;
                C65503j.C65504a aVar = C65503j.C65504a.f188490d;
                C106602c.m143949c(this.f318558e, C111940o.m152651d(C103214y0.m136590f(aVar, 0.0f, 1, (Object) null), false, (String) null, (C111072h) null, this.f318557d, 7, (Object) null), true, hVar2, 392, 0);
                if (this.f318559f) {
                    C106969c d = C110954a.m151256d(C0966R.raw.shortvideo_play_btn, hVar2, 0);
                    int i2 = C111294a.f333218a;
                    C111897d1.m152617a(d, "play button", hVar.mo142907a(aVar, C111294a.C111295a.f333222d), (C111294a) null, (C109836f) null, 0.0f, (C103274x) null, hVar2, 56, 120);
                }
            } else {
                hVar2.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$i */
    public static final class C106609i extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C101804kv2 f318560d;

        /* renamed from: e */
        public final /* synthetic */ boolean f318561e;

        /* renamed from: f */
        public final /* synthetic */ C32224a<C13598b0> f318562f;

        /* renamed from: g */
        public final /* synthetic */ int f318563g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106609i(C101804kv2 kv22, boolean z, C32224a<C13598b0> aVar, int i) {
            super(2);
            this.f318560d = kv22;
            this.f318561e = z;
            this.f318562f = aVar;
            this.f318563g = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C106602c.m143951e(this.f318560d, this.f318561e, this.f318562f, (C108504h) obj, this.f318563g | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$j */
    public static final class C106610j extends C87413o implements C32228q<C103153h, C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<C101804kv2> f318564d;

        /* renamed from: e */
        public final /* synthetic */ String f318565e;

        /* renamed from: f */
        public final /* synthetic */ int f318566f;

        /* renamed from: g */
        public final /* synthetic */ C32226l<String, C13598b0> f318567g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106610j(List<? extends C101804kv2> list, String str, int i, C32226l<? super String, C13598b0> lVar) {
            super(3);
            this.f318564d = list;
            this.f318565e = str;
            this.f318566f = i;
            this.f318567g = lVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            int i;
            int i2;
            C65503j.C65504a aVar;
            C60686v vVar;
            C103153h hVar = (C103153h) obj;
            C108504h hVar2 = (C108504h) obj2;
            int intValue = ((Number) obj3).intValue();
            C87412m.m108594g(hVar, "$this$MediaContent");
            if ((intValue & 14) == 0) {
                intValue |= hVar2.mo51619x(hVar) ? 4 : 2;
            }
            if ((intValue & 91) == 18 && hVar2.mo51575a()) {
                hVar2.mo51581d();
            } else if (this.f318564d.isEmpty()) {
                Log.m105920e("WithFriendsPage.ListItems", "image content media list is empty");
            } else {
                int i3 = C65503j.f188489K0;
                C65503j.C65504a aVar2 = C65503j.C65504a.f188490d;
                C65503j g = C103214y0.m136591g(aVar2, 0.0f, 1, (Object) null);
                List<C101804kv2> list = this.f318564d;
                String str = this.f318565e;
                int i4 = this.f318566f;
                C32226l<String, C13598b0> lVar = this.f318567g;
                hVar2.mo51557H(693286680);
                C103111a.C103115d dVar = C103111a.f304235b;
                int i5 = C111294a.f333218a;
                C109895y a = C103199s0.m136579a(dVar, C111294a.C111295a.f333226h, hVar2, 0);
                hVar2.mo51557H(-1323940314);
                C60686v vVar2 = C103645l0.f306124e;
                C108322d dVar2 = (C108322d) hVar2.mo51598m(vVar2);
                C60686v vVar3 = C103645l0.f306130k;
                C33183o oVar = (C33183o) hVar2.mo51598m(vVar3);
                C60686v vVar4 = C103645l0.f306134o;
                C103633i2 i2Var = (C103633i2) hVar2.mo51598m(vVar4);
                C110269a.f329831D0.getClass();
                List<C101804kv2> list2 = list;
                C32224a<C110269a> aVar3 = C110269a.C110270a.f329833b;
                C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(g);
                C32226l<String, C13598b0> lVar2 = lVar;
                if (hVar2.mo51543A() instanceof C24665d) {
                    hVar2.mo51615v();
                    if (hVar2.mo51621y()) {
                        hVar2.mo51612t(aVar3);
                    } else {
                        hVar2.mo51579c();
                    }
                    hVar2.mo51561L();
                    C32227p<C110269a, C109895y, C13598b0> pVar = C110269a.C110270a.f329836e;
                    C108508o2.m147049a(hVar2, a, pVar);
                    C32227p<C110269a, C108322d, C13598b0> pVar2 = C110269a.C110270a.f329835d;
                    C108508o2.m147049a(hVar2, dVar2, pVar2);
                    C32227p<C110269a, C33183o, C13598b0> pVar3 = C110269a.C110270a.f329837f;
                    C108508o2.m147049a(hVar2, oVar, pVar3);
                    C32227p<C110269a, C103633i2, C13598b0> pVar4 = C110269a.C110270a.f329838g;
                    C108508o2.m147049a(hVar2, i2Var, pVar4);
                    hVar2.mo51590i();
                    ((C35747b) a2).invoke(new C33489x1(hVar2), hVar2, 0);
                    hVar2.mo51557H(2058660585);
                    hVar2.mo51557H(-678309503);
                    C103206u0 u0Var = C103206u0.f304394a;
                    C32227p<C110269a, C108322d, C13598b0> pVar5 = pVar2;
                    C32227p<C110269a, C33183o, C13598b0> pVar6 = pVar3;
                    C32227p<C110269a, C109895y, C13598b0> pVar7 = pVar;
                    C32226l<String, C13598b0> lVar3 = lVar2;
                    int i6 = i4;
                    String str2 = str;
                    C103153h hVar3 = hVar;
                    C32224a<C110269a> aVar4 = aVar3;
                    List<C101804kv2> list3 = list2;
                    C65503j a3 = C103203t0.C103204a.m136583a(u0Var, aVar2, 1.0f, false, 2, (Object) null);
                    hVar2.mo51557H(-483455358);
                    C103111a.C103123l lVar4 = C103111a.f304237d;
                    C111294a.C37633b bVar = C111294a.C111295a.f333228j;
                    C109895y a4 = C103157j.m136499a(lVar4, bVar, hVar2, 0);
                    hVar2.mo51557H(-1323940314);
                    C108322d dVar3 = (C108322d) hVar2.mo51598m(vVar2);
                    C33183o oVar2 = (C33183o) hVar2.mo51598m(vVar3);
                    C111294a.C37633b bVar2 = bVar;
                    C103633i2 i2Var2 = (C103633i2) hVar2.mo51598m(vVar4);
                    C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a5 = C109863q.m149330a(a3);
                    C103111a.C103123l lVar5 = lVar4;
                    if (hVar2.mo51543A() instanceof C24665d) {
                        hVar2.mo51615v();
                        if (hVar2.mo51621y()) {
                            hVar2.mo51612t(aVar4);
                        } else {
                            hVar2.mo51579c();
                        }
                        hVar2.mo51561L();
                        C32227p<C110269a, C109895y, C13598b0> pVar8 = pVar7;
                        C108508o2.m147049a(hVar2, a4, pVar8);
                        C108508o2.m147049a(hVar2, dVar3, pVar5);
                        C32227p<C110269a, C33183o, C13598b0> pVar9 = pVar6;
                        C108508o2.m147049a(hVar2, oVar2, pVar9);
                        C108508o2.m147049a(hVar2, i2Var2, pVar4);
                        hVar2.mo51590i();
                        ((C35747b) a5).invoke(new C33489x1(hVar2), hVar2, 0);
                        hVar2.mo51557H(2058660585);
                        hVar2.mo51557H(-1163856341);
                        C103165l lVar6 = C103165l.f304321a;
                        String str3 = list3.get(0).f298689d;
                        C87412m.m108593f(str3, "mediaList[0].Id");
                        C32226l<String, C13598b0> lVar7 = lVar3;
                        int i7 = i6 & 14;
                        C32227p<C110269a, C33183o, C13598b0> pVar10 = pVar9;
                        C111294a.C37633b bVar3 = bVar2;
                        C32227p<C110269a, C109895y, C13598b0> pVar11 = pVar8;
                        C103111a.C103123l lVar8 = lVar5;
                        C106602c.m143947a(str2, str3, C111940o.m152651d(C103161k.C103162a.m136505a(lVar6, C103214y0.m136591g(aVar2, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null), false, (String) null, (C111072h) null, new C6701d(lVar7, list3), 7, (Object) null), hVar2, i7, 0);
                        hVar2.mo51557H(-2079692802);
                        if (list3.size() > 3) {
                            C103129b1.m136432a(C103214y0.m136592h(aVar2, (float) 1), hVar2, 6);
                            String str4 = list3.get(2).f298689d;
                            C87412m.m108593f(str4, "mediaList[2].Id");
                            C106602c.m143947a(str2, str4, C111940o.m152651d(C103161k.C103162a.m136505a(lVar6, C103214y0.m136591g(aVar2, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null), false, (String) null, (C111072h) null, new C6702e(lVar7, list3), 7, (Object) null), hVar2, i7, 0);
                        }
                        hVar2.mo51565P();
                        hVar2.mo51565P();
                        hVar2.mo51565P();
                        hVar2.mo51610s();
                        hVar2.mo51565P();
                        hVar2.mo51565P();
                        hVar2.mo51557H(1103212074);
                        if (list3.size() > 1) {
                            float f = (float) 1;
                            float f2 = f;
                            C32226l<String, C13598b0> lVar9 = lVar7;
                            C32227p<C110269a, C103633i2, C13598b0> pVar12 = pVar4;
                            C65503j.C65504a aVar5 = aVar2;
                            List<C101804kv2> list4 = list3;
                            vVar = vVar2;
                            C107927c0.m146232a(C103214y0.m136596l(aVar2, f), (C103266t0) null, 0, 0, (C111929l) null, 0.0f, C57551a.f164797a, hVar2, 1572870, 62);
                            C65503j a6 = C103203t0.C103204a.m136583a(u0Var, aVar5, 1.0f, false, 2, (Object) null);
                            hVar2.mo51557H(-483455358);
                            C109895y a7 = C103157j.m136499a(lVar8, bVar3, hVar2, 0);
                            hVar2.mo51557H(-1323940314);
                            C108322d dVar4 = (C108322d) hVar2.mo51598m(vVar);
                            C33183o oVar3 = (C33183o) hVar2.mo51598m(vVar3);
                            C103633i2 i2Var3 = (C103633i2) hVar2.mo51598m(vVar4);
                            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a8 = C109863q.m149330a(a6);
                            if (hVar2.mo51543A() instanceof C24665d) {
                                hVar2.mo51615v();
                                if (hVar2.mo51621y()) {
                                    hVar2.mo51612t(aVar4);
                                } else {
                                    hVar2.mo51579c();
                                }
                                hVar2.mo51561L();
                                C108508o2.m147049a(hVar2, a7, pVar11);
                                C108508o2.m147049a(hVar2, dVar4, pVar5);
                                C108508o2.m147049a(hVar2, oVar3, pVar10);
                                C108508o2.m147049a(hVar2, i2Var3, pVar12);
                                hVar2.mo51590i();
                                ((C35747b) a8).invoke(new C33489x1(hVar2), hVar2, 0);
                                hVar2.mo51557H(2058660585);
                                hVar2.mo51557H(-1163856341);
                                List<C101804kv2> list5 = list4;
                                String str5 = list5.get(1).f298689d;
                                C87412m.m108593f(str5, "mediaList[1].Id");
                                aVar = aVar5;
                                C32226l<String, C13598b0> lVar10 = lVar9;
                                C106602c.m143947a(str2, str5, C111940o.m152651d(C103161k.C103162a.m136505a(lVar6, C103214y0.m136591g(aVar, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null), false, (String) null, (C111072h) null, new C6703f(lVar10, list5), 7, (Object) null), hVar2, i7, 0);
                                i2 = 2;
                                if (list5.size() > 2) {
                                    C103129b1.m136432a(C103214y0.m136592h(aVar, f2), hVar2, 6);
                                    i = 3;
                                    int i8 = list5.size() > 3 ? 3 : 2;
                                    String str6 = list5.get(i8).f298689d;
                                    C87412m.m108593f(str6, "mediaList[index].Id");
                                    C106602c.m143947a(str2, str6, C111940o.m152651d(C103161k.C103162a.m136505a(lVar6, C103214y0.m136591g(aVar, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null), false, (String) null, (C111072h) null, new C6704g(lVar10, list5, i8), 7, (Object) null), hVar2, i7, 0);
                                } else {
                                    i = 3;
                                }
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
                            aVar = aVar2;
                            vVar = vVar2;
                            i2 = 2;
                            i = 3;
                        }
                        hVar2.mo51565P();
                        hVar2.mo51565P();
                        hVar2.mo51565P();
                        hVar2.mo51610s();
                        hVar2.mo51565P();
                        hVar2.mo51565P();
                        if (this.f318564d.size() > 4) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(20849);
                            sb.append(this.f318564d.size());
                            sb.append(24352);
                            String sb4 = sb.toString();
                            float f3 = (float) 8;
                            long F = ((C108322d) hVar2.mo51598m(vVar)).mo143031F(((float) 1.75d) * f3);
                            Context context = MMApplicationContext.getContext();
                            C87412m.m108593f(context, "getContext()");
                            long b = C110954a.m151254b(C0966R.color.BW_100_Alpha_0_9, context);
                            C111705z zVar = ((C107957i0) hVar2.mo51598m(C107960j0.f323312a)).f323305i;
                            Context context2 = MMApplicationContext.getContext();
                            Context context3 = MMApplicationContext.getContext();
                            C87412m.m108593f(context3, "getContext()");
                            C103264s0 s0Var = r42;
                            C103264s0 s0Var2 = new C103264s0(C110954a.m151254b(C0966R.color.BW_100_Alpha_0_3, context3), 0, (float) C76577a.m92150a(context2, (float) i), 2, (C8480h) null);
                            C111504g.m152005a(sb4, C103166l0.m136523g(hVar3.mo142907a(aVar, C111294a.C111295a.f333225g), 0.0f, 0.0f, ((float) i2) * f3, ((float) 1.5d) * f3, 3, (Object) null), b, F, (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 0, false, 0, (C32226l<? super C111703v, C13598b0>) null, C111705z.m152270a(zVar, 0, 0, (C104022q) null, (C104020o) null, (C104021p) null, (C104014i) null, (String) null, 0, (C32656a) null, (C32661i) null, (C106974e) null, 0, (C108014f) null, s0Var, (C32659e) null, (C32660g) null, 0, (C32662j) null, 253951, (Object) null), hVar2, LVBuffer.MAX_STRING_LENGTH, 0, 32752);
                        }
                    } else {
                        C108501g.m147000a();
                        throw null;
                    }
                } else {
                    C108501g.m147000a();
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$k */
    public static final class C106611k extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f318568d;

        /* renamed from: e */
        public final /* synthetic */ List<C101804kv2> f318569e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<String, C13598b0> f318570f;

        /* renamed from: g */
        public final /* synthetic */ int f318571g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106611k(String str, List<? extends C101804kv2> list, C32226l<? super String, C13598b0> lVar, int i) {
            super(2);
            this.f318568d = str;
            this.f318569e = list;
            this.f318570f = lVar;
            this.f318571g = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C106602c.m143952f(this.f318568d, this.f318569e, this.f318570f, (C108504h) obj, this.f318571g | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$m */
    public static final class C106612m extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C101804kv2 f318572d;

        /* renamed from: e */
        public final /* synthetic */ String f318573e;

        /* renamed from: f */
        public final /* synthetic */ String f318574f;

        /* renamed from: g */
        public final /* synthetic */ C32224a<C13598b0> f318575g;

        /* renamed from: h */
        public final /* synthetic */ int f318576h;

        /* renamed from: i */
        public final /* synthetic */ int f318577i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106612m(C101804kv2 kv22, String str, String str2, C32224a<C13598b0> aVar, int i, int i2) {
            super(2);
            this.f318572d = kv22;
            this.f318573e = str;
            this.f318574f = str2;
            this.f318575g = aVar;
            this.f318576h = i;
            this.f318577i = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C106602c.m143954h(this.f318572d, this.f318573e, this.f318574f, this.f318575g, (C108504h) obj, this.f318576h | 1, this.f318577i);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$n */
    public static final class C106613n extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C101804kv2 f318578d;

        /* renamed from: e */
        public final /* synthetic */ String f318579e;

        /* renamed from: f */
        public final /* synthetic */ int f318580f;

        /* renamed from: g */
        public final /* synthetic */ String f318581g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106613n(C101804kv2 kv22, String str, int i, String str2) {
            super(2);
            this.f318578d = kv22;
            this.f318579e = str;
            this.f318580f = i;
            this.f318581g = str2;
        }

        public Object invoke(Object obj, Object obj2) {
            C60686v vVar;
            C60686v vVar2;
            C32227p<C110269a, C33183o, C13598b0> pVar;
            C32227p<C110269a, C108322d, C13598b0> pVar2;
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                int i = C65503j.f188489K0;
                C65503j.C65504a aVar = C65503j.C65504a.f188490d;
                float f = (float) 8;
                float f2 = ((float) 2) * f;
                C65503j c = C103166l0.m136519c(aVar, f2);
                C101804kv2 kv22 = this.f318578d;
                String str = this.f318579e;
                int i2 = this.f318580f;
                String str2 = this.f318581g;
                hVar.mo51557H(693286680);
                C103111a.C103115d dVar = C103111a.f304235b;
                int i3 = C111294a.f333218a;
                C109895y a = C103199s0.m136579a(dVar, C111294a.C111295a.f333226h, hVar, 0);
                hVar.mo51557H(-1323940314);
                C60686v vVar3 = C103645l0.f306124e;
                C108322d dVar2 = (C108322d) hVar.mo51598m(vVar3);
                C60686v vVar4 = C103645l0.f306130k;
                C33183o oVar = (C33183o) hVar.mo51598m(vVar4);
                int i4 = i2;
                C60686v vVar5 = C103645l0.f306134o;
                C103633i2 i2Var = (C103633i2) hVar.mo51598m(vVar5);
                C110269a.f329831D0.getClass();
                String str3 = str2;
                C32224a<C110269a> aVar2 = C110269a.C110270a.f329833b;
                C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(c);
                if (hVar.mo51543A() instanceof C24665d) {
                    hVar.mo51615v();
                    if (hVar.mo51621y()) {
                        hVar.mo51612t(aVar2);
                    } else {
                        hVar.mo51579c();
                    }
                    hVar.mo51561L();
                    C32227p<C110269a, C109895y, C13598b0> pVar3 = C110269a.C110270a.f329836e;
                    C108508o2.m147049a(hVar, a, pVar3);
                    C32227p<C110269a, C108322d, C13598b0> pVar4 = C110269a.C110270a.f329835d;
                    C108508o2.m147049a(hVar, dVar2, pVar4);
                    C32227p<C110269a, C33183o, C13598b0> pVar5 = C110269a.C110270a.f329837f;
                    C108508o2.m147049a(hVar, oVar, pVar5);
                    C32227p<C110269a, C103633i2, C13598b0> pVar6 = C110269a.C110270a.f329838g;
                    C108508o2.m147049a(hVar, i2Var, pVar6);
                    hVar.mo51590i();
                    String str4 = str;
                    ((C35747b) a2).invoke(new C33489x1(hVar), hVar, 0);
                    hVar.mo51557H(2058660585);
                    hVar.mo51557H(-678309503);
                    hVar.mo51557H(733328855);
                    C109895y c2 = C103141f.m136472c(C111294a.C111295a.f333219a, false, hVar, 0);
                    hVar.mo51557H(-1323940314);
                    C108322d dVar3 = (C108322d) hVar.mo51598m(vVar3);
                    C33183o oVar2 = (C33183o) hVar.mo51598m(vVar4);
                    C60686v vVar6 = vVar4;
                    C103633i2 i2Var2 = (C103633i2) hVar.mo51598m(vVar5);
                    C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a3 = C109863q.m149330a(aVar);
                    C60686v vVar7 = vVar3;
                    if (hVar.mo51543A() instanceof C24665d) {
                        hVar.mo51615v();
                        if (hVar.mo51621y()) {
                            hVar.mo51612t(aVar2);
                        } else {
                            hVar.mo51579c();
                        }
                        hVar.mo51561L();
                        C108508o2.m147049a(hVar, c2, pVar3);
                        C108508o2.m147049a(hVar, dVar3, pVar4);
                        C108508o2.m147049a(hVar, oVar2, pVar5);
                        C108508o2.m147049a(hVar, i2Var2, pVar6);
                        hVar.mo51590i();
                        ((C35747b) a3).invoke(new C33489x1(hVar), hVar, 0);
                        hVar.mo51557H(2058660585);
                        hVar.mo51557H(-2137368960);
                        if (kv22.f298694i != null) {
                            hVar.mo51557H(-2086819887);
                            String str5 = kv22.f298694i;
                            C87412m.m108593f(str5, "media.Thumb");
                            C106602c.m143948b(str5, C111979d.m152690a(C103214y0.m136594j(aVar, f * f), C107074g.m144958a(((float) 0.5d) * f)), hVar, 0, 0);
                            hVar.mo51565P();
                            pVar2 = pVar4;
                            pVar = pVar5;
                            vVar = vVar6;
                            vVar2 = vVar7;
                        } else {
                            hVar.mo51557H(-2086819638);
                            C101804kv2 kv23 = kv22;
                            C65503j a4 = C111979d.m152690a(C103214y0.m136594j(aVar, f * f), C107074g.m144958a(((float) 0.5d) * f));
                            pVar2 = pVar4;
                            pVar = pVar5;
                            vVar = vVar6;
                            vVar2 = vVar7;
                            C106602c.m143949c(kv23, a4, false, hVar, 8, 4);
                            hVar.mo51565P();
                        }
                        C106969c d = C110954a.m151256d(C0966R.raw.shortvideo_play_btn, hVar, 0);
                        C111294a aVar3 = C111294a.C111295a.f333222d;
                        C32226l<C103618e1, C13598b0> lVar = C103612c1.f306063a;
                        C103138e eVar = new C103138e(aVar3, false, lVar);
                        aVar.mo74972i0(eVar);
                        C32227p<C110269a, C103633i2, C13598b0> pVar7 = pVar6;
                        C32227p<C110269a, C108322d, C13598b0> pVar8 = pVar2;
                        C32224a<C110269a> aVar4 = aVar2;
                        String str6 = str3;
                        float f3 = f;
                        int i5 = i4;
                        C60686v vVar8 = vVar5;
                        C111897d1.m152617a(d, "play button", C103214y0.m136594j(eVar, ((float) 3.5d) * f), (C111294a) null, (C109836f) null, 0.0f, (C103274x) null, hVar, 56, 120);
                        hVar.mo51565P();
                        hVar.mo51565P();
                        hVar.mo51610s();
                        hVar.mo51565P();
                        hVar.mo51565P();
                        C65503j g = C103166l0.m136523g(aVar, f2, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                        C111294a.C37634c cVar = C111294a.C111295a.f333227i;
                        C87412m.m108594g(g, "<this>");
                        C65503j i0 = g.mo74972i0(new C103140e1(cVar, lVar));
                        hVar.mo51557H(-483455358);
                        C109895y a5 = C103157j.m136499a(C103111a.f304237d, C111294a.C111295a.f333228j, hVar, 0);
                        hVar.mo51557H(-1323940314);
                        C60686v vVar9 = vVar2;
                        C108322d dVar4 = (C108322d) hVar.mo51598m(vVar9);
                        C33183o oVar3 = (C33183o) hVar.mo51598m(vVar);
                        C103633i2 i2Var3 = (C103633i2) hVar.mo51598m(vVar8);
                        C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a6 = C109863q.m149330a(i0);
                        if (hVar.mo51543A() instanceof C24665d) {
                            hVar.mo51615v();
                            if (hVar.mo51621y()) {
                                hVar.mo51612t(aVar4);
                            } else {
                                hVar.mo51579c();
                            }
                            hVar.mo51561L();
                            C108508o2.m147049a(hVar, a5, pVar3);
                            C108508o2.m147049a(hVar, dVar4, pVar8);
                            C108508o2.m147049a(hVar, oVar3, pVar);
                            C108508o2.m147049a(hVar, i2Var3, pVar7);
                            hVar.mo51590i();
                            ((C35747b) a6).invoke(new C33489x1(hVar), hVar, 0);
                            hVar.mo51557H(2058660585);
                            hVar.mo51557H(-1163856341);
                            Context context = MMApplicationContext.getContext();
                            C87412m.m108593f(context, "getContext()");
                            C60686v vVar10 = vVar9;
                            float f4 = f3;
                            C65503j.C65504a aVar5 = aVar;
                            C108504h hVar2 = hVar;
                            String str7 = str4;
                            String str8 = "getContext()";
                            C108504h hVar3 = hVar2;
                            C111504g.m152005a(str7, aVar5, C110954a.m151254b(C0966R.color.BW_0_Alpha_0_9, context), ((C108322d) hVar.mo51598m(vVar9)).mo143031F(((float) 2.5d) * f3), (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 2, false, 2, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, hVar2, ((i5 >> 3) & 14) | 3120, 3120, 55280);
                            if (str6 != null) {
                                C65503j.C65504a aVar6 = aVar5;
                                C103129b1.m136432a(C103214y0.m136592h(aVar6, ((float) 0.5d) * f4), hVar3, 6);
                                Context context2 = MMApplicationContext.getContext();
                                C87412m.m108593f(context2, str8);
                                C111504g.m152005a(str6, aVar6, C110954a.m151254b(C0966R.color.BW_0_Alpha_0_5, context2), ((C108322d) hVar3.mo51598m(vVar10)).mo143031F(((float) 2.13d) * f4), (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 2, false, 2, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, hVar3, ((i5 >> 6) & 14) | 3120, 3120, 55280);
                            }
                            hVar3.mo51565P();
                            hVar3.mo51565P();
                            hVar3.mo51610s();
                            hVar3.mo51565P();
                            hVar3.mo51565P();
                            hVar3.mo51565P();
                            hVar3.mo51565P();
                            hVar3.mo51610s();
                            hVar3.mo51565P();
                            hVar3.mo51565P();
                        } else {
                            C108501g.m147000a();
                            throw null;
                        }
                    } else {
                        C108501g.m147000a();
                        throw null;
                    }
                } else {
                    C108501g.m147000a();
                    throw null;
                }
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$o */
    public static final class C106614o extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C101804kv2 f318582d;

        /* renamed from: e */
        public final /* synthetic */ String f318583e;

        /* renamed from: f */
        public final /* synthetic */ String f318584f;

        /* renamed from: g */
        public final /* synthetic */ C32224a<C13598b0> f318585g;

        /* renamed from: h */
        public final /* synthetic */ int f318586h;

        /* renamed from: i */
        public final /* synthetic */ int f318587i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106614o(C101804kv2 kv22, String str, String str2, C32224a<C13598b0> aVar, int i, int i2) {
            super(2);
            this.f318582d = kv22;
            this.f318583e = str;
            this.f318584f = str2;
            this.f318585g = aVar;
            this.f318586h = i;
            this.f318587i = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C106602c.m143954h(this.f318582d, this.f318583e, this.f318584f, this.f318585g, (C108504h) obj, this.f318586h | 1, this.f318587i);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$p */
    public static final class C106615p extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f318588d;

        /* renamed from: e */
        public final /* synthetic */ int f318589e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106615p(String str, int i) {
            super(2);
            this.f318588d = str;
            this.f318589e = i;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                long b = C110954a.m151254b(C0966R.color.BW_0_Alpha_0_9, context);
                float f = (float) 8;
                long F = ((C108322d) hVar.mo51598m(C103645l0.f306124e)).mo143031F(((float) 2.5d) * f);
                int i = C65503j.f188489K0;
                C111504g.m152005a(this.f318588d, C103166l0.m136520d(C65503j.C65504a.f188490d, ((float) 1.5d) * f, ((float) 3) * f), b, F, (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 2, false, 2, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, hVar, (this.f318589e & 14) | 3120, 3120, 55280);
            } else {
                hVar.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$q */
    public static final class C106616q extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f318590d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f318591e;

        /* renamed from: f */
        public final /* synthetic */ int f318592f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106616q(String str, C32224a<C13598b0> aVar, int i) {
            super(2);
            this.f318590d = str;
            this.f318591e = aVar;
            this.f318592f = i;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C106602c.m143955i(this.f318590d, this.f318591e, (C108504h) obj, this.f318592f | 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$r */
    public static final class C106617r extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f318593d;

        /* renamed from: e */
        public final /* synthetic */ String f318594e;

        /* renamed from: f */
        public final /* synthetic */ int f318595f;

        /* renamed from: g */
        public final /* synthetic */ String f318596g;

        /* renamed from: h */
        public final /* synthetic */ String f318597h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106617r(String str, String str2, int i, String str3, String str4) {
            super(2);
            this.f318593d = str;
            this.f318594e = str2;
            this.f318595f = i;
            this.f318596g = str3;
            this.f318597h = str4;
        }

        public Object invoke(Object obj, Object obj2) {
            C108504h hVar;
            C108504h hVar2 = (C108504h) obj;
            if ((((Number) obj2).intValue() & 11) != 2 || !hVar2.mo51575a()) {
                int i = C65503j.f188489K0;
                C65503j.C65504a aVar = C65503j.C65504a.f188490d;
                float f = (float) 8;
                float f2 = ((float) 2) * f;
                C65503j c = C103166l0.m136519c(aVar, f2);
                String str = this.f318593d;
                String str2 = this.f318594e;
                int i2 = this.f318595f;
                String str3 = this.f318596g;
                String str4 = this.f318597h;
                hVar2.mo51557H(693286680);
                C103111a.C103115d dVar = C103111a.f304235b;
                int i3 = C111294a.f333218a;
                C109895y a = C103199s0.m136579a(dVar, C111294a.C111295a.f333226h, hVar2, 0);
                hVar2.mo51557H(-1323940314);
                C60686v vVar = C103645l0.f306124e;
                C108322d dVar2 = (C108322d) hVar2.mo51598m(vVar);
                String str5 = str3;
                C60686v vVar2 = C103645l0.f306130k;
                C33183o oVar = (C33183o) hVar2.mo51598m(vVar2);
                C60686v vVar3 = vVar2;
                C60686v vVar4 = C103645l0.f306134o;
                C103633i2 i2Var = (C103633i2) hVar2.mo51598m(vVar4);
                C110269a.f329831D0.getClass();
                C60686v vVar5 = vVar4;
                C32224a<C110269a> aVar2 = C110269a.C110270a.f329833b;
                C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(c);
                if (hVar2.mo51543A() instanceof C24665d) {
                    hVar2.mo51615v();
                    if (hVar2.mo51621y()) {
                        hVar2.mo51612t(aVar2);
                    } else {
                        hVar2.mo51579c();
                    }
                    hVar2.mo51561L();
                    C32227p<C110269a, C109895y, C13598b0> pVar = C110269a.C110270a.f329836e;
                    C108508o2.m147049a(hVar2, a, pVar);
                    C32227p<C110269a, C108322d, C13598b0> pVar2 = C110269a.C110270a.f329835d;
                    C108508o2.m147049a(hVar2, dVar2, pVar2);
                    C32227p<C110269a, C33183o, C13598b0> pVar3 = C110269a.C110270a.f329837f;
                    C108508o2.m147049a(hVar2, oVar, pVar3);
                    C32227p<C110269a, C103633i2, C13598b0> pVar4 = C110269a.C110270a.f329838g;
                    C108508o2.m147049a(hVar2, i2Var, pVar4);
                    hVar2.mo51590i();
                    C32227p<C110269a, C108322d, C13598b0> pVar5 = pVar2;
                    ((C35747b) a2).invoke(new C33489x1(hVar2), hVar2, 0);
                    hVar2.mo51557H(2058660585);
                    hVar2.mo51557H(-678309503);
                    String str6 = str4;
                    float f3 = ((float) 0.5d) * f;
                    C32227p<C110269a, C108322d, C13598b0> pVar6 = pVar5;
                    C32227p<C110269a, C33183o, C13598b0> pVar7 = pVar3;
                    int i4 = (i2 & 112) | (i2 & 14);
                    C60686v vVar6 = vVar;
                    C106602c.m143947a(str, str2, C111979d.m152690a(C103214y0.m136594j(aVar, f * f), C107074g.m144958a(f3)), hVar2, i4, 0);
                    C32227p<C110269a, C103633i2, C13598b0> pVar8 = pVar4;
                    C65503j.C65504a aVar3 = aVar;
                    C65503j.C65504a aVar4 = aVar;
                    C60686v vVar7 = vVar6;
                    float f4 = f3;
                    String str7 = str6;
                    C32224a<C110269a> aVar5 = aVar2;
                    String str8 = str5;
                    int i5 = i2;
                    float f5 = f;
                    C65503j g = C103166l0.m136523g(aVar3, f2, 0.0f, 0.0f, 0.0f, 14, (Object) null);
                    C111294a.C37634c cVar = C111294a.C111295a.f333227i;
                    C87412m.m108594g(g, "<this>");
                    C65503j i0 = g.mo74972i0(new C103140e1(cVar, C103612c1.f306063a));
                    hVar2.mo51557H(-483455358);
                    C109895y a3 = C103157j.m136499a(C103111a.f304237d, C111294a.C111295a.f333228j, hVar2, 0);
                    hVar2.mo51557H(-1323940314);
                    C108322d dVar3 = (C108322d) hVar2.mo51598m(vVar7);
                    C33183o oVar2 = (C33183o) hVar2.mo51598m(vVar3);
                    C103633i2 i2Var2 = (C103633i2) hVar2.mo51598m(vVar5);
                    C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a4 = C109863q.m149330a(i0);
                    if (hVar2.mo51543A() instanceof C24665d) {
                        hVar2.mo51615v();
                        if (hVar2.mo51621y()) {
                            hVar2.mo51612t(aVar5);
                        } else {
                            hVar2.mo51579c();
                        }
                        hVar2.mo51561L();
                        C108508o2.m147049a(hVar2, a3, pVar);
                        C108508o2.m147049a(hVar2, dVar3, pVar6);
                        C108508o2.m147049a(hVar2, oVar2, pVar7);
                        C108508o2.m147049a(hVar2, i2Var2, pVar8);
                        hVar2.mo51590i();
                        ((C35747b) a4).invoke(new C33489x1(hVar2), hVar2, 0);
                        hVar2.mo51557H(2058660585);
                        hVar2.mo51557H(-1163856341);
                        Context context = MMApplicationContext.getContext();
                        C87412m.m108593f(context, "getContext()");
                        C65503j.C65504a aVar6 = aVar4;
                        String str9 = "getContext()";
                        C60686v vVar8 = vVar7;
                        C108504h hVar3 = hVar2;
                        float f6 = f4;
                        C111504g.m152005a(str8, aVar6, C110954a.m151254b(C0966R.color.BW_0_Alpha_0_9, context), ((C108322d) hVar2.mo51598m(vVar7)).mo143031F(((float) 2.5d) * f5), (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 2, false, 2, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, hVar3, ((i5 >> 6) & 14) | 3120, 3120, 55280);
                        if (str7 != null) {
                            C108504h hVar4 = hVar3;
                            C103129b1.m136432a(C103214y0.m136592h(aVar6, f6), hVar4, 6);
                            Context context2 = MMApplicationContext.getContext();
                            C87412m.m108593f(context2, str9);
                            hVar = hVar4;
                            C111504g.m152005a(str7, aVar6, C110954a.m151254b(C0966R.color.BW_0_Alpha_0_5, context2), ((C108322d) hVar4.mo51598m(vVar8)).mo143031F(((float) 2.13d) * f5), (C104020o) null, (C104022q) null, (C104014i) null, 0, (C108014f) null, (C32659e) null, 0, 2, false, 2, (C32226l<? super C111703v, C13598b0>) null, (C111705z) null, hVar, ((i5 >> 9) & 14) | 3120, 3120, 55280);
                        } else {
                            hVar = hVar3;
                        }
                        hVar.mo51565P();
                        hVar.mo51565P();
                        hVar.mo51610s();
                        hVar.mo51565P();
                        hVar.mo51565P();
                        hVar.mo51565P();
                        hVar.mo51565P();
                        hVar.mo51610s();
                        hVar.mo51565P();
                        hVar.mo51565P();
                    } else {
                        C108501g.m147000a();
                        throw null;
                    }
                } else {
                    C108501g.m147000a();
                    throw null;
                }
            } else {
                hVar2.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$s */
    public static final class C106618s extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f318598d;

        /* renamed from: e */
        public final /* synthetic */ String f318599e;

        /* renamed from: f */
        public final /* synthetic */ String f318600f;

        /* renamed from: g */
        public final /* synthetic */ String f318601g;

        /* renamed from: h */
        public final /* synthetic */ C32224a<C13598b0> f318602h;

        /* renamed from: i */
        public final /* synthetic */ int f318603i;

        /* renamed from: j */
        public final /* synthetic */ int f318604j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106618s(String str, String str2, String str3, String str4, C32224a<C13598b0> aVar, int i, int i2) {
            super(2);
            this.f318598d = str;
            this.f318599e = str2;
            this.f318600f = str3;
            this.f318601g = str4;
            this.f318602h = aVar;
            this.f318603i = i;
            this.f318604j = i2;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            C106602c.m143956j(this.f318598d, this.f318599e, this.f318600f, this.f318601g, this.f318602h, (C108504h) obj, this.f318603i | 1, this.f318604j);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.sns_compose.page.c$v */
    public static final class C106619v extends C87413o implements C32228q<C103153h, C108504h, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f318605d;

        /* renamed from: e */
        public final /* synthetic */ C100356d f318606e;

        /* renamed from: f */
        public final /* synthetic */ C60667k2<Boolean> f318607f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106619v(C32224a<C13598b0> aVar, C100356d dVar, C60667k2<Boolean> k2Var) {
            super(3);
            this.f318605d = aVar;
            this.f318606e = dVar;
            this.f318607f = k2Var;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C103153h hVar = (C103153h) obj;
            C108504h hVar2 = (C108504h) obj2;
            int intValue = ((Number) obj3).intValue();
            C87412m.m108594g(hVar, "$this$MediaContent");
            if ((intValue & 14) == 0) {
                intValue |= hVar2.mo51619x(hVar) ? 4 : 2;
            }
            if ((intValue & 91) != 18 || !hVar2.mo51575a()) {
                C65503j.C65504a aVar = C65503j.C65504a.f188490d;
                C110042e.m149551a(C111940o.m152651d(C103214y0.m136592h(aVar, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.aob))), false, (String) null, (C111072h) null, this.f318605d, 7, (Object) null), this.f318606e, hVar2, 64, 0);
                if (!this.f318607f.getValue().booleanValue()) {
                    C111897d1.m152617a(C110954a.m151256d(C0966R.raw.shortvideo_play_btn, hVar2, 0), "play video", hVar.mo142907a(aVar, C111294a.C111295a.f333222d), (C111294a) null, (C109836f) null, 0.0f, (C103274x) null, hVar2, 56, 120);
                }
            } else {
                hVar2.mo51581d();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m143947a(java.lang.String r16, java.lang.String r17, p721v0.C65503j r18, p175j0.C108504h r19, int r20, int r21) {
        /*
            r1 = r16
            r2 = r17
            r4 = r20
            java.lang.String r0 = "snsId"
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "mediaId"
            gy3.C87412m.m108594g(r2, r0)
            r0 = 812155450(0x3068823a, float:8.458617E-10)
            r3 = r19
            j0.h r0 = r3.mo51623z(r0)
            r3 = r21 & 1
            if (r3 == 0) goto L_0x0020
            r3 = r4 | 6
            goto L_0x0030
        L_0x0020:
            r3 = r4 & 14
            if (r3 != 0) goto L_0x002f
            boolean r3 = r0.mo51619x(r1)
            if (r3 == 0) goto L_0x002c
            r3 = 4
            goto L_0x002d
        L_0x002c:
            r3 = 2
        L_0x002d:
            r3 = r3 | r4
            goto L_0x0030
        L_0x002f:
            r3 = r4
        L_0x0030:
            r5 = r21 & 2
            if (r5 == 0) goto L_0x0037
            r3 = r3 | 48
            goto L_0x0047
        L_0x0037:
            r5 = r4 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0047
            boolean r5 = r0.mo51619x(r2)
            if (r5 == 0) goto L_0x0044
            r5 = 32
            goto L_0x0046
        L_0x0044:
            r5 = 16
        L_0x0046:
            r3 = r3 | r5
        L_0x0047:
            r5 = r21 & 4
            if (r5 == 0) goto L_0x004e
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x004e:
            r6 = r4 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0061
            r6 = r18
            boolean r7 = r0.mo51619x(r6)
            if (r7 == 0) goto L_0x005d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r3 = r3 | r7
            goto L_0x0063
        L_0x0061:
            r6 = r18
        L_0x0063:
            r7 = r3 & 731(0x2db, float:1.024E-42)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x0075
            boolean r7 = r0.mo51575a()
            if (r7 != 0) goto L_0x0070
            goto L_0x0075
        L_0x0070:
            r0.mo51581d()
            r3 = r6
            goto L_0x00ce
        L_0x0075:
            if (r5 == 0) goto L_0x007d
            int r5 = p721v0.C65503j.f188489K0
            v0.j$a r5 = p721v0.C65503j.C65504a.f188490d
            r15 = r5
            goto L_0x007e
        L_0x007d:
            r15 = r6
        L_0x007e:
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo51557H(r5)
            java.lang.Object r5 = r0.mo51606q()
            int r6 = p175j0.C108504h.f324828a
            java.lang.Object r6 = p175j0.C108504h.C60656a.f172772a
            if (r5 != r6) goto L_0x00af
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "sns://"
            r5.append(r6)
            r5.append(r1)
            r6 = 47
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = "/0/JPG"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.mo51553F(r5)
        L_0x00af:
            r0.mo51565P()
            java.lang.String r5 = (java.lang.String) r5
            r6 = 6
            g5.d r5 = oh3.C110041b.m149550a(r5, r0, r6)
            int r6 = p631o1.C109836f.f328763a
            o1.f r9 = p631o1.C109836f.C109837a.f328764a
            r8 = 0
            r10 = 0
            r11 = 0
            r3 = r3 & 896(0x380, float:1.256E-42)
            r13 = r3 | 24624(0x6030, float:3.4506E-41)
            r14 = 104(0x68, float:1.46E-43)
            java.lang.String r6 = "avatar"
            r7 = r15
            r12 = r0
            p267x.C111897d1.m152617a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r3 = r15
        L_0x00ce:
            j0.v1 r6 = r0.mo51596l()
            if (r6 != 0) goto L_0x00d5
            goto L_0x00e6
        L_0x00d5:
            com.tencent.mm.sns_compose.page.c$a r7 = new com.tencent.mm.sns_compose.page.c$a
            r0 = r7
            r1 = r16
            r2 = r17
            r4 = r20
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo51650a(r7)
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sns_compose.page.C106602c.m143947a(java.lang.String, java.lang.String, v0.j, j0.h, int, int):void");
    }

    /* renamed from: b */
    public static final void m143948b(String str, C65503j jVar, C108504h hVar, int i, int i2) {
        int i3;
        C87412m.m108594g(str, "url");
        C108504h z = hVar.mo51623z(335027097);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (z.mo51619x(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= z.mo51619x(jVar) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !z.mo51575a()) {
            if (i4 != 0) {
                int i5 = C65503j.f188489K0;
                jVar = C65503j.C65504a.f188490d;
            }
            C59349d a = C110041b.m149550a(str, z, i3 & 14);
            int i6 = C109836f.f328763a;
            C111897d1.m152617a(a, "avatar", jVar, (C111294a) null, C109836f.C109837a.f328764a, 0.0f, (C103274x) null, z, ((i3 << 3) & C22657f.CTRL_INDEX) | 24624, 104);
        } else {
            z.mo51581d();
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C106604d(str, jVar, i, i2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r3 == p175j0.C108504h.C60656a.f172772a) goto L_0x003b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m143949c(te3.C101804kv2 r15, p721v0.C65503j r16, boolean r17, p175j0.C108504h r18, int r19, int r20) {
        /*
            r1 = r15
            java.lang.String r0 = "media"
            gy3.C87412m.m108594g(r15, r0)
            r0 = -1535759137(0xffffffffa4762cdf, float:-5.3380754E-17)
            r2 = r18
            j0.h r0 = r2.mo51623z(r0)
            r2 = r20 & 2
            if (r2 == 0) goto L_0x0019
            int r2 = p721v0.C65503j.f188489K0
            v0.j$a r2 = p721v0.C65503j.C65504a.f188490d
            r13 = r2
            goto L_0x001b
        L_0x0019:
            r13 = r16
        L_0x001b:
            r2 = r20 & 4
            if (r2 == 0) goto L_0x0022
            r2 = 0
            r14 = 0
            goto L_0x0024
        L_0x0022:
            r14 = r17
        L_0x0024:
            r2 = 1157296644(0x44faf204, float:2007.563)
            r0.mo51557H(r2)
            boolean r2 = r0.mo51619x(r15)
            java.lang.Object r3 = r0.mo51606q()
            r4 = 0
            if (r2 != 0) goto L_0x003b
            int r2 = p175j0.C108504h.f324828a
            java.lang.Object r2 = p175j0.C108504h.C60656a.f172772a
            if (r3 != r2) goto L_0x004f
        L_0x003b:
            r5 = 1
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 28
            r11 = 0
            a1.d0 r2 = p436a1.C103231e0.m136644a(r5, r6, r7, r8, r9, r10, r11)
            r3 = 2
            j0.y0 r3 = p175j0.C108500f2.m146996c(r2, r4, r3, r4)
            r0.mo51553F(r3)
        L_0x004f:
            r0.mo51565P()
            j0.y0 r3 = (p175j0.C60690y0) r3
            com.tencent.mm.sns_compose.page.c$b r2 = new com.tencent.mm.sns_compose.page.c$b
            r2.<init>(r15, r14, r3, r4)
            r4 = 72
            p175j0.C60655g0.m70932c(r15, r2, r0, r4)
            java.lang.Object r2 = r3.getValue()
            a1.d0 r2 = (p436a1.C103229d0) r2
            int r3 = p631o1.C109836f.f328763a
            o1.f r6 = p631o1.C109836f.C109837a.f328764a
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            int r3 = r19 << 3
            r3 = r3 & 896(0x380, float:1.256E-42)
            r11 = r3 | 24632(0x6038, float:3.4517E-41)
            r12 = 232(0xe8, float:3.25E-43)
            java.lang.String r3 = "avatar"
            r4 = r13
            r10 = r0
            p267x.C111897d1.m152618b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            j0.v1 r6 = r0.mo51596l()
            if (r6 != 0) goto L_0x0082
            goto L_0x0092
        L_0x0082:
            com.tencent.mm.sns_compose.page.c$c r7 = new com.tencent.mm.sns_compose.page.c$c
            r0 = r7
            r1 = r15
            r2 = r13
            r3 = r14
            r4 = r19
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mo51650a(r7)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sns_compose.page.C106602c.m143949c(te3.kv2, v0.j, boolean, j0.h, int, int):void");
    }

    /* renamed from: d */
    public static final void m143950d(String str, boolean z, C32224a<C13598b0> aVar, C108504h hVar, int i) {
        int i2;
        C87412m.m108594g(str, "thumbUrl");
        C87412m.m108594g(aVar, "onClick");
        C108504h z2 = hVar.mo51623z(1881994434);
        if ((i & 14) == 0) {
            i2 = (z2.mo51619x(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= z2.mo51586g(z) ? 32 : 16;
        }
        if ((i & C22657f.CTRL_INDEX) == 0) {
            i2 |= z2.mo51619x(aVar) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !z2.mo51575a()) {
            m143953g(C110261c.m149878b(z2, -2128693989, true, new C106605e(str, i2, aVar, z)), z2, 6);
        } else {
            z2.mo51581d();
        }
        C33487v1 l = z2.mo51596l();
        if (l != null) {
            l.mo51650a(new C106606f(str, z, aVar, i));
        }
    }

    /* renamed from: e */
    public static final void m143951e(C101804kv2 kv22, boolean z, C32224a<C13598b0> aVar, C108504h hVar, int i) {
        C87412m.m108594g(aVar, "onClick");
        C108504h z2 = hVar.mo51623z(984927840);
        if (kv22 == null) {
            C33487v1 l = z2.mo51596l();
            if (l != null) {
                l.mo51650a(new C106607g(kv22, z, aVar, i));
                return;
            }
            return;
        }
        m143953g(C110261c.m149878b(z2, -700982151, true, new C106608h(aVar, kv22, z)), z2, 6);
        C33487v1 l2 = z2.mo51596l();
        if (l2 != null) {
            l2.mo51650a(new C106609i(kv22, z, aVar, i));
        }
    }

    /* renamed from: f */
    public static final void m143952f(String str, List<? extends C101804kv2> list, C32226l<? super String, C13598b0> lVar, C108504h hVar, int i) {
        C87412m.m108594g(str, "snsId");
        C87412m.m108594g(list, "mediaList");
        C87412m.m108594g(lVar, "imagePreviewCb");
        C108504h z = hVar.mo51623z(-2040483500);
        Context context = (Context) z.mo51598m(C103691v.f306268b);
        z.mo51557H(773894976);
        z.mo51557H(-492369756);
        Object q = z.mo51606q();
        int i2 = C108504h.f324828a;
        if (q == C108504h.C60656a.f172772a) {
            C108515x xVar = new C108515x(C60655g0.m70937h(C66217g.f190253d, z));
            z.mo51553F(xVar);
            q = xVar;
        }
        z.mo51565P();
        ((C108515x) q).getClass();
        z.mo51565P();
        m143953g(C110261c.m149878b(z, 208307757, true, new C106610j(list, str, i, lVar)), z, 6);
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C106611k(str, list, lVar, i));
        }
    }

    /* renamed from: g */
    public static final void m143953g(C32228q<? super C103153h, ? super C108504h, ? super Integer, C13598b0> qVar, C108504h hVar, int i) {
        int i2;
        C32228q<? super C103153h, ? super C108504h, ? super Integer, C13598b0> qVar2 = qVar;
        int i3 = i;
        C108504h z = hVar.mo51623z(917588970);
        if ((i3 & 14) == 0) {
            i2 = (z.mo51619x(qVar2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !z.mo51575a()) {
            C65503j.C65504a aVar = C65503j.C65504a.f188490d;
            float f = ((float) 1) * ((float) 8);
            C65503j a = C111979d.m152690a(C103214y0.m136592h(aVar, (float) C76577a.m92152c(MMApplicationContext.getContext(), C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.aob))), C107074g.m144958a(f));
            z.mo51557H(733328855);
            C109895y c = C103141f.m136472c(C111294a.C111295a.f333219a, false, z, 0);
            z.mo51557H(-1323940314);
            C108322d dVar = (C108322d) z.mo51598m(C103645l0.f306124e);
            C33183o oVar = (C33183o) z.mo51598m(C103645l0.f306130k);
            C103633i2 i2Var = (C103633i2) z.mo51598m(C103645l0.f306134o);
            C110269a.f329831D0.getClass();
            C32224a<C110269a> aVar2 = C110269a.C110270a.f329833b;
            C32228q<C33489x1<C110269a>, C108504h, Integer, C13598b0> a2 = C109863q.m149330a(a);
            if (z.mo51543A() instanceof C24665d) {
                z.mo51615v();
                if (z.mo51621y()) {
                    z.mo51612t(aVar2);
                } else {
                    z.mo51579c();
                }
                z.mo51561L();
                C108508o2.m147049a(z, c, C110269a.C110270a.f329836e);
                C108508o2.m147049a(z, dVar, C110269a.C110270a.f329835d);
                C108508o2.m147049a(z, oVar, C110269a.C110270a.f329837f);
                C108508o2.m147049a(z, i2Var, C110269a.C110270a.f329838g);
                z.mo51590i();
                ((C35747b) a2).invoke(new C33489x1(z), z, 0);
                z.mo51557H(2058660585);
                z.mo51557H(-2137368960);
                C103155i iVar = C103155i.f304309a;
                C65503j e = C103214y0.m136589e(C103214y0.m136591g(aVar, 0.0f, 1, (Object) null), 0.0f, 1, (Object) null);
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                long b = C110954a.m151254b(C0966R.color.FG_3, context);
                C107073f a3 = C107074g.m144958a(f);
                C87412m.m108594g(e, "$this$border");
                C107927c0.m146232a(C111299g.m151786a(e, C103612c1.f306063a, new C111905e((float) 0.5d, a3, new C103273w0(b, (C8480h) null))), (C103266t0) null, 0, 0, (C111929l) null, 0.0f, C57551a.f164798b, z, 1572864, 62);
                qVar2.invoke(iVar, z, Integer.valueOf(((i2 << 3) & 112) | 6));
                z.mo51565P();
                z.mo51565P();
                z.mo51610s();
                z.mo51565P();
                z.mo51565P();
            } else {
                C108501g.m147000a();
                throw null;
            }
        } else {
            z.mo51581d();
        }
        C33487v1 l = z.mo51596l();
        if (l != null) {
            l.mo51650a(new C57565l(qVar2, i3));
        }
    }

    /* renamed from: h */
    public static final void m143954h(C101804kv2 kv22, String str, String str2, C32224a<C13598b0> aVar, C108504h hVar, int i, int i2) {
        C101804kv2 kv23 = kv22;
        String str3 = str;
        C87412m.m108594g(str3, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(aVar, "onClick");
        C108504h z = hVar.mo51623z(1238230768);
        String str4 = (i2 & 4) != 0 ? null : str2;
        if (kv23 == null) {
            C33487v1 l = z.mo51596l();
            if (l != null) {
                l.mo51650a(new C106612m(kv22, str, str4, aVar, i, i2));
                return;
            }
            return;
        }
        int i3 = C65503j.f188489K0;
        C65503j d = C111940o.m152651d(C111979d.m152690a(C103214y0.m136591g(C65503j.C65504a.f188490d, 0.0f, 1, (Object) null), C107074g.m144958a(((float) 1) * ((float) 8))), false, (String) null, (C111072h) null, aVar, 7, (Object) null);
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        C65503j jVar = d;
        String str5 = str4;
        C107927c0.m146232a(jVar, (C103266t0) null, C110954a.m151254b(C0966R.color.f2927a, context), 0, (C111929l) null, 0.0f, C110261c.m149878b(z, -137931724, true, new C106613n(kv23, str3, i, str4)), z, 1572864, 58);
        C33487v1 l2 = z.mo51596l();
        if (l2 != null) {
            l2.mo51650a(new C106614o(kv22, str, str5, aVar, i, i2));
        }
    }

    /* renamed from: i */
    public static final void m143955i(String str, C32224a<C13598b0> aVar, C108504h hVar, int i) {
        int i2;
        C108504h hVar2;
        String str2 = str;
        C32224a<C13598b0> aVar2 = aVar;
        int i3 = i;
        C87412m.m108594g(str2, MimeTypes.BASE_TYPE_TEXT);
        C87412m.m108594g(aVar2, "onClick");
        C108504h z = hVar.mo51623z(1309967799);
        if ((i3 & 14) == 0) {
            i2 = (z.mo51619x(str2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 112) == 0) {
            i2 |= z.mo51619x(aVar2) ? 32 : 16;
        }
        int i4 = i2;
        if ((i4 & 91) != 18 || !z.mo51575a()) {
            int i5 = C65503j.f188489K0;
            C65503j d = C111940o.m152651d(C111979d.m152690a(C103214y0.m136591g(C65503j.C65504a.f188490d, 0.0f, 1, (Object) null), C107074g.m144958a(((float) 1) * ((float) 8))), false, (String) null, (C111072h) null, aVar, 7, (Object) null);
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            C65503j jVar = d;
            hVar2 = z;
            C107927c0.m146232a(jVar, (C103266t0) null, C110954a.m151254b(C0966R.color.f2927a, context), 0, (C111929l) null, 0.0f, C110261c.m149878b(z, 888256243, true, new C106615p(str2, i4)), hVar2, 1572864, 58);
        } else {
            z.mo51581d();
            hVar2 = z;
        }
        C33487v1 l = hVar2.mo51596l();
        if (l != null) {
            l.mo51650a(new C106616q(str2, aVar2, i3));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m143956j(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, fy3.C32224a<rx3.C13598b0> r26, p175j0.C108504h r27, int r28, int r29) {
        /*
            r6 = r22
            r7 = r23
            r8 = r24
            r5 = r26
            r4 = r28
            java.lang.String r0 = "snsId"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "mediaId"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "title"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "onClick"
            gy3.C87412m.m108594g(r5, r0)
            r0 = -359671466(0xffffffffea8fd956, float:-8.695137E25)
            r1 = r27
            j0.h r3 = r1.mo51623z(r0)
            r0 = r29 & 1
            if (r0 == 0) goto L_0x002e
            r0 = r4 | 6
            goto L_0x003e
        L_0x002e:
            r0 = r4 & 14
            if (r0 != 0) goto L_0x003d
            boolean r0 = r3.mo51619x(r6)
            if (r0 == 0) goto L_0x003a
            r0 = 4
            goto L_0x003b
        L_0x003a:
            r0 = 2
        L_0x003b:
            r0 = r0 | r4
            goto L_0x003e
        L_0x003d:
            r0 = r4
        L_0x003e:
            r1 = r29 & 2
            if (r1 == 0) goto L_0x0045
            r0 = r0 | 48
            goto L_0x0055
        L_0x0045:
            r1 = r4 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x0055
            boolean r1 = r3.mo51619x(r7)
            if (r1 == 0) goto L_0x0052
            r1 = 32
            goto L_0x0054
        L_0x0052:
            r1 = 16
        L_0x0054:
            r0 = r0 | r1
        L_0x0055:
            r1 = r29 & 4
            if (r1 == 0) goto L_0x005c
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L_0x006c
        L_0x005c:
            r1 = r4 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x006c
            boolean r1 = r3.mo51619x(r8)
            if (r1 == 0) goto L_0x0069
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r1 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r0 = r0 | r1
        L_0x006c:
            r1 = r29 & 8
            if (r1 == 0) goto L_0x0073
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0086
        L_0x0073:
            r2 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0086
            r2 = r25
            boolean r9 = r3.mo51619x(r2)
            if (r9 == 0) goto L_0x0082
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0084
        L_0x0082:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0084:
            r0 = r0 | r9
            goto L_0x0088
        L_0x0086:
            r2 = r25
        L_0x0088:
            r9 = r29 & 16
            if (r9 == 0) goto L_0x008f
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a1
        L_0x008f:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r4
            if (r9 != 0) goto L_0x00a1
            boolean r9 = r3.mo51619x(r5)
            if (r9 == 0) goto L_0x009e
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r0 = r0 | r9
        L_0x00a1:
            r16 = r0
            r0 = 46811(0xb6db, float:6.5596E-41)
            r0 = r16 & r0
            r9 = 9362(0x2492, float:1.3119E-41)
            if (r0 != r9) goto L_0x00ba
            boolean r0 = r3.mo51575a()
            if (r0 != 0) goto L_0x00b3
            goto L_0x00ba
        L_0x00b3:
            r3.mo51581d()
            r4 = r2
            r2 = r3
            goto L_0x012e
        L_0x00ba:
            r0 = 0
            if (r1 == 0) goto L_0x00c0
            r21 = r0
            goto L_0x00c2
        L_0x00c0:
            r21 = r2
        L_0x00c2:
            int r1 = p721v0.C65503j.f188489K0
            v0.j$a r1 = p721v0.C65503j.C65504a.f188490d
            r2 = 0
            r15 = 1
            v0.j r0 = p435a0.C103214y0.m136591g(r1, r2, r15, r0)
            float r1 = (float) r15
            r2 = 8
            float r2 = (float) r2
            float r1 = r1 * r2
            e0.f r1 = p502e0.C107074g.m144958a(r1)
            v0.j r9 = p868x0.C111979d.m152690a(r0, r1)
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 7
            r0 = 0
            r13 = r26
            r2 = 1
            r15 = r0
            v0.j r9 = p267x.C111940o.m152651d(r9, r10, r11, r12, r13, r14, r15)
            r10 = 0
            r0 = 2131099649(0x7f060001, float:1.7811657E38)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r11 = "getContext()"
            gy3.C87412m.m108593f(r1, r11)
            long r11 = ta0.C110954a.m151254b(r0, r1)
            r17 = 0
            r1 = -71035758(0xfffffffffbc41492, float:-2.0362148E36)
            com.tencent.mm.sns_compose.page.c$r r0 = new com.tencent.mm.sns_compose.page.c$r
            r25 = r0
            r15 = -71035758(0xfffffffffbc41492, float:-2.0362148E36)
            r1 = r22
            r13 = 1
            r2 = r23
            r14 = r3
            r3 = r16
            r4 = r24
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            q0.a r0 = p415q0.C110261c.m149878b(r14, r15, r13, r0)
            r1 = 1572864(0x180000, float:2.204052E-39)
            r20 = 58
            r2 = r14
            r3 = 0
            r13 = r3
            r3 = 0
            r15 = r3
            r16 = r17
            r17 = r0
            r18 = r2
            r19 = r1
            p543h0.C107927c0.m146232a(r9, r10, r11, r13, r15, r16, r17, r18, r19, r20)
            r4 = r21
        L_0x012e:
            j0.v1 r9 = r2.mo51596l()
            if (r9 != 0) goto L_0x0135
            goto L_0x014a
        L_0x0135:
            com.tencent.mm.sns_compose.page.c$s r10 = new com.tencent.mm.sns_compose.page.c$s
            r0 = r10
            r1 = r22
            r2 = r23
            r3 = r24
            r5 = r26
            r6 = r28
            r7 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.mo51650a(r10)
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sns_compose.page.C106602c.m143956j(java.lang.String, java.lang.String, java.lang.String, java.lang.String, fy3.a, j0.h, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0053, code lost:
        if (r3 == r1) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0055, code lost:
        r3 = new oh3.C100356d(r4, r10.f291655d, r10.f291656e, r10.f291672l, r10.f291654c, r11);
        r14.mo51553F(r3);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0067, code lost:
        r14.mo51565P();
        r3 = (oh3.C100356d) r3;
        r1 = (androidx.lifecycle.C0125s) r14.mo51598m(androidx.compose.p002ui.platform.C103691v.f306270d);
        p175j0.C60655g0.m70930a(r1, new com.tencent.p014mm.sns_compose.page.C106602c.C57566t(r1, r3), r14, 8);
        p175j0.C60655g0.m70932c(java.lang.Boolean.valueOf(((java.lang.Boolean) r0.getValue()).booleanValue()), new com.tencent.p014mm.sns_compose.page.C106602c.C96977u(r3, r0, (wx3.C15601d<? super com.tencent.p014mm.sns_compose.page.C106602c.C96977u>) null), r14, 64);
        m143953g(p415q0.C110261c.m149878b(r14, 1208155125, true, new com.tencent.p014mm.sns_compose.page.C106602c.C106619v(r13, r3, r0)), r14, 6);
        r14 = r14.mo51596l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x00ac, code lost:
        if (r14 != null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00af, code lost:
        r14.mo51650a(new com.tencent.p014mm.sns_compose.page.C106602c.C57567w(r10, r11, r12, r13, r15));
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m143957k(lh3.C99474g.C99481g r10, com.tencent.p014mm.sdk.coroutines.LifecycleScope r11, fy3.C32224a<java.lang.Boolean> r12, fy3.C32224a<rx3.C13598b0> r13, p175j0.C108504h r14, int r15) {
        /*
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "scope"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "isPlay"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "onClick"
            gy3.C87412m.m108594g(r13, r0)
            r0 = -1954122084(0xffffffff8b86769c, float:-5.1793386E-32)
            j0.h r14 = r14.mo51623z(r0)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.mo51557H(r0)
            java.lang.Object r0 = r14.mo51606q()
            java.lang.Object r1 = p175j0.C108504h.C60656a.f172772a
            if (r0 != r1) goto L_0x0035
            com.tencent.mm.sns_compose.page.c$x r0 = new com.tencent.mm.sns_compose.page.c$x
            r0.<init>(r12)
            j0.k2 r0 = p175j0.C108500f2.m146994a(r0)
            r14.mo51553F(r0)
        L_0x0035:
            r14.mo51565P()
            j0.k2 r0 = (p175j0.C60667k2) r0
            j0.f1<android.content.Context> r2 = androidx.compose.p002ui.platform.C103691v.f306268b
            java.lang.Object r2 = r14.mo51598m(r2)
            r4 = r2
            android.content.Context r4 = (android.content.Context) r4
            r2 = 1157296644(0x44faf204, float:2007.563)
            r14.mo51557H(r2)
            boolean r2 = r14.mo51619x(r10)
            java.lang.Object r3 = r14.mo51606q()
            if (r2 != 0) goto L_0x0055
            if (r3 != r1) goto L_0x0067
        L_0x0055:
            oh3.d r1 = new oh3.d
            java.lang.String r5 = r10.f291655d
            int r6 = r10.f291656e
            te3.kv2 r7 = r10.f291672l
            int r8 = r10.f291654c
            r3 = r1
            r9 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r14.mo51553F(r1)
        L_0x0067:
            r14.mo51565P()
            oh3.d r3 = (oh3.C100356d) r3
            j0.f1<androidx.lifecycle.s> r1 = androidx.compose.p002ui.platform.C103691v.f306270d
            java.lang.Object r1 = r14.mo51598m(r1)
            androidx.lifecycle.s r1 = (androidx.lifecycle.C0125s) r1
            com.tencent.mm.sns_compose.page.c$t r2 = new com.tencent.mm.sns_compose.page.c$t
            r2.<init>(r1, r3)
            r4 = 8
            p175j0.C60655g0.m70930a(r1, r2, r14, r4)
            java.lang.Object r1 = r0.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.tencent.mm.sns_compose.page.c$u r2 = new com.tencent.mm.sns_compose.page.c$u
            r4 = 0
            r2.<init>(r3, r0, r4)
            r4 = 64
            p175j0.C60655g0.m70932c(r1, r2, r14, r4)
            r1 = 1208155125(0x4802fbf5, float:134127.83)
            r2 = 1
            com.tencent.mm.sns_compose.page.c$v r4 = new com.tencent.mm.sns_compose.page.c$v
            r4.<init>(r13, r3, r0)
            q0.a r0 = p415q0.C110261c.m149878b(r14, r1, r2, r4)
            r1 = 6
            m143953g(r0, r14, r1)
            j0.v1 r14 = r14.mo51596l()
            if (r14 != 0) goto L_0x00af
            goto L_0x00bd
        L_0x00af:
            com.tencent.mm.sns_compose.page.c$w r6 = new com.tencent.mm.sns_compose.page.c$w
            r0 = r6
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r14.mo51650a(r6)
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sns_compose.page.C106602c.m143957k(lh3.g$g, com.tencent.mm.sdk.coroutines.LifecycleScope, fy3.a, fy3.a, j0.h, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m143958l(com.tencent.p014mm.sns_compose.page.C57589s r18, p004b0.C103953l0 r19, int r20, lh3.C99474g r21, androidx.paging.compose.C54222c<lh3.C99474g> r22, com.tencent.p014mm.sdk.coroutines.LifecycleScope r23, p175j0.C108504h r24, int r25) {
        /*
            r6 = r18
            r7 = r19
            r8 = r21
            r9 = r22
            java.lang.String r0 = "withTaViewModel"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "lazyListState"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "lazyDemoItem"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "scope"
            r15 = r23
            gy3.C87412m.m108594g(r15, r0)
            r0 = 1081315843(0x40739203, float:3.8057868)
            r1 = r24
            j0.h r14 = r1.mo51623z(r0)
            j0.f1<android.content.Context> r0 = androidx.compose.p002ui.platform.C103691v.f306268b
            java.lang.Object r0 = r14.mo51598m(r0)
            r2 = r0
            android.content.Context r2 = (android.content.Context) r2
            r0 = 773894976(0x2e20b340, float:3.6538994E-11)
            r14.mo51557H(r0)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r14.mo51557H(r0)
            java.lang.Object r0 = r14.mo51606q()
            java.lang.Object r1 = p175j0.C108504h.C60656a.f172772a
            if (r0 != r1) goto L_0x0058
            wx3.g r0 = wx3.C66217g.f190253d
            a14.n0 r0 = p175j0.C60655g0.m70937h(r0, r14)
            j0.x r3 = new j0.x
            r3.<init>(r0)
            r14.mo51553F(r3)
            r0 = r3
        L_0x0058:
            r14.mo51565P()
            j0.x r0 = (p175j0.C108515x) r0
            a14.n0 r4 = r0.f324838d
            r14.mo51565P()
            java.lang.String r0 = r8.f291655d
            r3 = 1157296644(0x44faf204, float:2007.563)
            r14.mo51557H(r3)
            boolean r0 = r14.mo51619x(r0)
            java.lang.Object r5 = r14.mo51606q()
            if (r0 != 0) goto L_0x0076
            if (r5 != r1) goto L_0x007e
        L_0x0076:
            com.tencent.mm.sns_compose.page.c$b0 r5 = new com.tencent.mm.sns_compose.page.c$b0
            r5.<init>(r8, r2, r6, r4)
            r14.mo51553F(r5)
        L_0x007e:
            r14.mo51565P()
            r0 = r5
            fy3.a r0 = (fy3.C32224a) r0
            r14.mo51557H(r3)
            boolean r5 = r14.mo51619x(r7)
            java.lang.Object r10 = r14.mo51606q()
            if (r5 != 0) goto L_0x0093
            if (r10 != r1) goto L_0x00a7
        L_0x0093:
            r5 = 100
            float r5 = (float) r5
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r5 = kg3.C76577a.m92150a(r10, r5)
            float r5 = (float) r5
            int r5 = (int) r5
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r14.mo51553F(r10)
        L_0x00a7:
            r14.mo51565P()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r14.mo51557H(r3)
            boolean r5 = r14.mo51619x(r7)
            java.lang.Object r11 = r14.mo51606q()
            if (r5 != 0) goto L_0x00bf
            if (r11 != r1) goto L_0x00d3
        L_0x00bf:
            r5 = 300(0x12c, float:4.2E-43)
            float r5 = (float) r5
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r5 = kg3.C76577a.m92150a(r11, r5)
            float r5 = (float) r5
            int r5 = (int) r5
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            r14.mo51553F(r11)
        L_0x00d3:
            r14.mo51565P()
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            boolean r5 = r8 instanceof lh3.C99474g.C99479e
            r12 = 0
            if (r5 == 0) goto L_0x00f0
            r1 = 717646890(0x2ac66c2a, float:3.524692E-13)
            r14.mo51557H(r1)
            java.lang.String r1 = r8.f291653b
            m143955i(r1, r0, r14, r12)
            r14.mo51565P()
            goto L_0x0115
        L_0x00f0:
            boolean r5 = r8 instanceof lh3.C99474g.C99477c
            if (r5 == 0) goto L_0x0118
            r0 = 717646979(0x2ac66c83, float:3.524716E-13)
            r14.mo51557H(r0)
            java.lang.String r10 = r8.f291655d
            r0 = r8
            lh3.g$c r0 = (lh3.C99474g.C99477c) r0
            java.util.List<te3.kv2> r11 = r0.f291665l
            com.tencent.mm.sns_compose.page.c$y r12 = new com.tencent.mm.sns_compose.page.c$y
            r0 = r12
            r1 = r21
            r3 = r18
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 64
            m143952f(r10, r11, r12, r14, r0)
            r14.mo51565P()
        L_0x0115:
            r1 = r14
            goto L_0x020e
        L_0x0118:
            boolean r5 = r8 instanceof lh3.C99474g.C99481g
            if (r5 == 0) goto L_0x0193
            r0 = 717647461(0x2ac66e65, float:3.5248467E-13)
            r14.mo51557H(r0)
            r14.mo51557H(r3)
            boolean r0 = r14.mo51619x(r9)
            java.lang.Object r3 = r14.mo51606q()
            if (r0 != 0) goto L_0x0131
            if (r3 != r1) goto L_0x0138
        L_0x0131:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r12)
            r14.mo51553F(r3)
        L_0x0138:
            r14.mo51565P()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r12 = r3.booleanValue()
            com.tencent.mm.sns_compose.page.c$c0 r13 = new com.tencent.mm.sns_compose.page.c$c0
            r0 = r13
            r1 = r2
            r2 = r18
            r3 = r4
            r4 = r21
            r5 = r22
            r0.<init>(r1, r2, r3, r4, r5)
            if (r12 == 0) goto L_0x0179
            r0 = 717647944(0x2ac67048, float:3.5249776E-13)
            r14.mo51557H(r0)
            r12 = r8
            lh3.g$g r12 = (lh3.C99474g.C99481g) r12
            com.tencent.mm.sns_compose.page.c$z r16 = new com.tencent.mm.sns_compose.page.c$z
            r0 = r16
            r1 = r10
            r2 = r11
            r3 = r19
            r4 = r22
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 72
            r10 = r12
            r11 = r23
            r12 = r16
            r1 = r14
            r15 = r0
            m143957k(r10, r11, r12, r13, r14, r15)
            r1.mo51565P()
            goto L_0x018e
        L_0x0179:
            r1 = r14
            r0 = 717648238(0x2ac6716e, float:3.5250573E-13)
            r1.mo51557H(r0)
            r0 = r8
            lh3.g$g r0 = (lh3.C99474g.C99481g) r0
            te3.kv2 r0 = r0.f291672l
            r2 = 1
            r3 = 56
            m143951e(r0, r2, r13, r1, r3)
            r1.mo51565P()
        L_0x018e:
            r1.mo51565P()
            goto L_0x020e
        L_0x0193:
            r1 = r14
            boolean r2 = r8 instanceof lh3.C99474g.C99476b
            if (r2 == 0) goto L_0x01ac
            r2 = 717648480(0x2ac67260, float:3.525123E-13)
            r1.mo51557H(r2)
            r2 = r8
            lh3.g$b r2 = (lh3.C99474g.C99476b) r2
            java.lang.String r3 = r2.f291663l
            boolean r2 = r2.f291664m
            m143950d(r3, r2, r0, r1, r12)
            r1.mo51565P()
            goto L_0x020e
        L_0x01ac:
            boolean r2 = r8 instanceof lh3.C99474g.C99478d
            if (r2 == 0) goto L_0x01cf
            r2 = 717648654(0x2ac6730e, float:3.52517E-13)
            r1.mo51557H(r2)
            r2 = r8
            lh3.g$d r2 = (lh3.C99474g.C99478d) r2
            te3.kv2 r10 = r2.f291666l
            java.lang.String r11 = r2.f291667m
            gy3.C87412m.m108591d(r11)
            java.lang.String r12 = r2.f291668n
            r15 = 8
            r16 = 0
            r13 = r0
            r14 = r1
            m143954h(r10, r11, r12, r13, r14, r15, r16)
            r1.mo51565P()
            goto L_0x020e
        L_0x01cf:
            boolean r2 = r8 instanceof lh3.C99474g.C99480f
            if (r2 == 0) goto L_0x0200
            r2 = 717648760(0x2ac67378, float:3.5251988E-13)
            r1.mo51557H(r2)
            r2 = r8
            lh3.g$f r2 = (lh3.C99474g.C99480f) r2
            te3.kv2 r3 = r2.f291669l
            if (r3 == 0) goto L_0x01fc
            java.lang.String r10 = r8.f291655d
            gy3.C87412m.m108591d(r3)
            java.lang.String r11 = r3.f298689d
            java.lang.String r3 = "item.media!!.Id"
            gy3.C87412m.m108593f(r11, r3)
            java.lang.String r12 = r2.f291670m
            gy3.C87412m.m108591d(r12)
            java.lang.String r13 = r2.f291671n
            r16 = 0
            r17 = 0
            r14 = r0
            r15 = r1
            m143956j(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x01fc:
            r1.mo51565P()
            goto L_0x020e
        L_0x0200:
            r2 = 717648934(0x2ac67426, float:3.525246E-13)
            r1.mo51557H(r2)
            java.lang.String r2 = r8.f291653b
            m143955i(r2, r0, r1, r12)
            r1.mo51565P()
        L_0x020e:
            j0.v1 r10 = r1.mo51596l()
            if (r10 != 0) goto L_0x0215
            goto L_0x022c
        L_0x0215:
            com.tencent.mm.sns_compose.page.c$a0 r11 = new com.tencent.mm.sns_compose.page.c$a0
            r0 = r11
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.mo51650a(r11)
        L_0x022c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sns_compose.page.C106602c.m143958l(com.tencent.mm.sns_compose.page.s, b0.l0, int, lh3.g, androidx.paging.compose.c, com.tencent.mm.sdk.coroutines.LifecycleScope, j0.h, int):void");
    }

    /* renamed from: m */
    public static final C34280b m143959m(String str, C54222c<C99474g> cVar) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(cVar, "lazyDemoItem");
        ArrayList arrayList = new ArrayList();
        C8478d0 d0Var = new C8478d0();
        C8478d0 d0Var2 = new C8478d0();
        C36904l0 i = C61595o.m72301i(0, cVar.mo75006b()).iterator();
        while (((C34690i) i).f93287f) {
            C99474g gVar = (C99474g) ((C65006a0) ((C108494d2) cVar.f152187b).getValue()).get(i.mo59695a());
            if (gVar instanceof C99474g.C99477c) {
                C99474g.C99477c cVar2 = (C99474g.C99477c) gVar;
                for (C101804kv2 n : cVar2.f291665l) {
                    m143960n(str, d0Var, d0Var2, arrayList, n, cVar2.f291656e, cVar2.f291654c);
                }
            } else if (gVar instanceof C99474g.C99481g) {
                C99474g.C99481g gVar2 = (C99474g.C99481g) gVar;
                m143960n(str, d0Var, d0Var2, arrayList, gVar2.f291672l, gVar2.f291656e, gVar2.f291654c);
            }
        }
        return new C34280b(arrayList, d0Var.f27483d);
    }

    /* renamed from: n */
    public static final void m143960n(String str, C8478d0 d0Var, C8478d0 d0Var2, ArrayList<C101829pp1> arrayList, C101804kv2 kv22, int i, int i2) {
        if (C87412m.m108589b(str, kv22.f298689d)) {
            d0Var.f27483d = d0Var2.f27483d;
        }
        C101829pp1 pp12 = new C101829pp1();
        pp12.f299180d = kv22;
        pp12.f299181e = "sns_table_" + i;
        pp12.f299182f = i2;
        int i3 = d0Var2.f27483d + 1;
        d0Var2.f27483d = i3;
        pp12.f299183g = i3;
        arrayList.add(pp12);
    }

    /* renamed from: o */
    public static final void m143961o(Context context, C57589s sVar, C0000n0 n0Var, C99474g gVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(sVar, "withTaViewModel");
        C87412m.m108594g(n0Var, "rememberScope");
        C87412m.m108594g(gVar, "item");
        C77426q qVar = new C77426q(context);
        qVar.mo107595g(context.getString(C0966R.string.jkf));
        qVar.mo107602n(MMApplicationContext.getString(C0966R.string.lzu));
        qVar.mo107600l(new C57563d0(context, n0Var, gVar, sVar));
        qVar.f225837a.f225714b.f225637T = MMApplicationContext.getColor(C0966R.color.f3154h3);
        qVar.mo107598j(MMApplicationContext.getString(C0966R.string.f8028zq));
        qVar.mo107603o();
    }
}
