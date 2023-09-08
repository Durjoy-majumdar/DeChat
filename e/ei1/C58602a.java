package ei1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import ak1.C54108o;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32227p;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.ResultKt;
import p523fp.C59265h;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C64780vo2;
import te3.C64807wo2;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: ei1.a */
public final class C58602a {

    /* renamed from: a */
    public static final C58602a f167787a = new C58602a();

    /* renamed from: b */
    public static final List<C64807wo2> f167788b = new ArrayList();

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.liveelement.LiveElementManager$updateElements$2", mo125469f = "LiveElementManager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ei1.a$a */
    public static final class C58603a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f167789d;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.liveelement.LiveElementManager$updateElements$2$1$1", mo125469f = "LiveElementManager.kt", mo125470l = {50}, mo125471m = "invokeSuspend")
        /* renamed from: ei1.a$a$a */
        public static final class C58604a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f167790d;

            /* renamed from: e */
            public final /* synthetic */ C64807wo2 f167791e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C58604a(C64807wo2 wo22, C15601d<? super C58604a> dVar) {
                super(2, dVar);
                this.f167791e = wo22;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C58604a(this.f167791e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C58604a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C64780vo2 vo22;
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f167790d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    LinkedList<C64780vo2> linkedList = this.f167791e.f186149h;
                    if (!(linkedList == null || (vo22 = (C64780vo2) C110818d0.m150916N(linkedList)) == null)) {
                        String str = vo22.f185964e;
                        String str2 = vo22.f185965f;
                        this.f167790d = 1;
                        if (((C59265h) C86312j.m106911c(C59265h.class)).mo58904Xj(str, true, str2, this) == aVar) {
                            return aVar;
                        }
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13598b0.f38549a;
            }
        }

        public C58603a(C15601d<? super C58603a> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C58603a aVar = new C58603a(dVar);
            aVar.f167789d = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C58603a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f167789d;
            int i = 0;
            int i2 = 4;
            for (T next : C58602a.f167788b) {
                int i3 = i + 1;
                if (i >= 0) {
                    C64807wo2 wo22 = (C64807wo2) next;
                    if (i2 > 0) {
                        C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C58604a(wo22, (C15601d<? super C58604a>) null), 3, (Object) null);
                        i2--;
                    }
                    i = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo83493a(List<? extends C64807wo2> list) {
        C64780vo2 vo22;
        C64780vo2 vo23;
        C64780vo2 vo24;
        StringBuilder sb = new StringBuilder();
        sb.append("#updateElements size=");
        sb.append(list != null ? Integer.valueOf(list.size()) : null);
        Log.m105924i("FinderLiveElementManager", sb.toString());
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (C64807wo2 wo22 : list) {
                String str = wo22.f186145d;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        }
        ((C54108o) C86312j.m106911c(C54108o.class)).getClass();
        C54108o.f151869h.mo74751a("accessories_id_list", TextUtils.join("#", arrayList));
        List<C64807wo2> list2 = f167788b;
        ((ArrayList) list2).clear();
        if (list != null) {
            ((ArrayList) list2).addAll(list);
            int i = 0;
            for (T next : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    C64807wo2 wo23 = (C64807wo2) next;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("#updateElements index=");
                    sb4.append(i);
                    sb4.append(" id=");
                    sb4.append(wo23.f186145d);
                    sb4.append(" name=");
                    sb4.append(wo23.f186146e);
                    sb4.append(" media.type=");
                    LinkedList<C64780vo2> linkedList = wo23.f186149h;
                    sb4.append((linkedList == null || (vo24 = (C64780vo2) C110818d0.m150916N(linkedList)) == null) ? null : Integer.valueOf(vo24.f185963d));
                    sb4.append(" media.url=");
                    LinkedList<C64780vo2> linkedList2 = wo23.f186149h;
                    sb4.append((linkedList2 == null || (vo23 = (C64780vo2) C110818d0.m150916N(linkedList2)) == null) ? null : vo23.f185964e);
                    sb4.append(" media.md5=");
                    LinkedList<C64780vo2> linkedList3 = wo23.f186149h;
                    sb4.append((linkedList3 == null || (vo22 = (C64780vo2) C110818d0.m150916N(linkedList3)) == null) ? null : vo22.f185965f);
                    sb4.append(' ');
                    Log.m105924i("FinderLiveElementManager", sb4.toString());
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C58603a((C15601d<? super C58603a>) null), 3, (Object) null);
        }
    }
}
