package xh1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C64197v;
import te3.C48928bz0;
import te3.C48958c51;
import te3.C49068cz0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: xh1.d */
public final class C15685d {

    /* renamed from: a */
    public static final C15685d f42379a = new C15685d();

    /* renamed from: b */
    public static final C13601g f42380b = C36568h.m40985a(C15686a.f42382d);

    /* renamed from: c */
    public static final List<C48928bz0> f42381c = new ArrayList();

    /* renamed from: xh1.d$a */
    public static final class C15686a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C15686a f42382d = new C15686a();

        public C15686a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("GesturesResManager");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.gestureeffect.GesturesResManager$updateGesturesRes$2", mo125469f = "GesturesResManager.kt", mo125470l = {82}, mo125471m = "invokeSuspend")
    /* renamed from: xh1.d$b */
    public static final class C15687b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f42383d;

        /* renamed from: e */
        public final /* synthetic */ boolean f42384e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15687b(boolean z, C15601d<? super C15687b> dVar) {
            super(2, dVar);
            this.f42384e = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C15687b(this.f42384e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C15687b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f42383d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C23087a aVar2 = C23087a.f66318a;
                List<C48928bz0> list = C15685d.f42381c;
                boolean z = this.f42384e;
                this.f42383d = 1;
                if (aVar2.mo36502i(list, z, this) == aVar) {
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

    /* renamed from: a */
    public final C48928bz0 mo14430a(int i) {
        T t;
        boolean z;
        Iterator<T> it = f42381c.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C48928bz0) t).f131399d == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (C48928bz0) t;
    }

    /* renamed from: b */
    public final void mo14431b(List<? extends C48928bz0> list, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("#update newGestures.size=");
        sb.append(list != null ? Integer.valueOf(list.size()) : null);
        Log.m105924i("FinderGesturesResManager", sb.toString());
        ((ArrayList) f42381c).clear();
        if (list != null) {
            int i = 0;
            for (T next : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    C48928bz0 bz02 = (C48928bz0) next;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("#update index=");
                    sb4.append(i);
                    sb4.append(" gid=");
                    sb4.append(bz02.f131399d);
                    sb4.append(" name=");
                    sb4.append(bz02.f131400e);
                    sb4.append(" gestureIconUrl=");
                    sb4.append(bz02.f131401f);
                    sb4.append(" anchorUrl=");
                    sb4.append(bz02.f131402g);
                    sb4.append(" tipsName=");
                    sb4.append(bz02.f131403h);
                    sb4.append(" tipsIconUrl=");
                    sb4.append(bz02.f131404i);
                    sb4.append(" resourceUrl=");
                    sb4.append(bz02.f131405j);
                    sb4.append(" delete_flag=");
                    sb4.append(bz02.f131409q);
                    sb4.append(" support_sdk_min_version=");
                    sb4.append(bz02.f131410r);
                    sb4.append(" support_sdk_max_version=");
                    sb4.append(bz02.f131411s);
                    sb4.append(" rc=");
                    C49068cz0 cz02 = bz02.f131406n;
                    sb4.append(cz02 != null ? Integer.valueOf(cz02.f132035d) : null);
                    sb4.append(',');
                    C49068cz0 cz03 = bz02.f131406n;
                    sb4.append(cz03 != null ? Float.valueOf(cz03.f132036e) : null);
                    sb4.append(',');
                    C49068cz0 cz04 = bz02.f131406n;
                    sb4.append(cz04 != null ? Float.valueOf(cz04.f132037f) : null);
                    sb4.append(" nrc=");
                    C48958c51 c512 = bz02.f131407o;
                    sb4.append(c512 != null ? Integer.valueOf(c512.f131519d) : null);
                    sb4.append(',');
                    C48958c51 c513 = bz02.f131407o;
                    sb4.append(c513 != null ? c513.f131520e : null);
                    sb4.append(',');
                    C48958c51 c514 = bz02.f131407o;
                    sb4.append(c514 != null ? Float.valueOf(c514.f131521f) : null);
                    sb4.append(',');
                    C48958c51 c515 = bz02.f131407o;
                    sb4.append(c515 != null ? Float.valueOf(c515.f131522g) : null);
                    sb4.append(',');
                    C48958c51 c516 = bz02.f131407o;
                    sb4.append(c516 != null ? Float.valueOf(c516.f131523h) : null);
                    sb4.append(',');
                    C48958c51 c517 = bz02.f131407o;
                    sb4.append(c517 != null ? Float.valueOf(c517.f131524i) : null);
                    sb4.append(',');
                    C48958c51 c518 = bz02.f131407o;
                    sb4.append(c518 != null ? c518.f131525j : null);
                    Log.m105924i("FinderGesturesResManager", sb4.toString());
                    if (bz02.f131409q != 1) {
                        ((ArrayList) f42381c).add(bz02);
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C15687b(z, (C15601d<? super C15687b>) null), 3, (Object) null);
        }
    }
}
