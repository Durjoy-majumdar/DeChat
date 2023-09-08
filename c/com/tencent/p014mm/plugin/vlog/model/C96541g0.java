package com.tencent.p014mm.plugin.vlog.model;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87413o;
import i33.C98595b;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.ResultKt;
import rx3.C13598b0;
import sp3.C110794b;
import sx3.C110818d0;
import sx3.C26236u;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.vlog.model.MultiMediaModel$setup$2", mo125469f = "MultiMediaModel.kt", mo125470l = {80}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.vlog.model.g0 */
public final class C96541g0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f282541d;

    /* renamed from: e */
    public int f282542e;

    /* renamed from: f */
    public final /* synthetic */ C106195f0 f282543f;

    /* renamed from: g */
    public final /* synthetic */ List<String> f282544g;

    /* renamed from: h */
    public final /* synthetic */ List<Integer> f282545h;

    /* renamed from: i */
    public final /* synthetic */ List<Integer> f282546i;

    /* renamed from: com.tencent.mm.plugin.vlog.model.g0$a */
    public static final class C96542a extends C87413o implements C32227p<Long, Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C106195f0 f282547d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96542a(C106195f0 f0Var) {
            super(2);
            this.f282547d = f0Var;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj).longValue();
            Bitmap bitmap = (Bitmap) obj2;
            this.f282547d.getClass();
            Log.m105924i("MicroMsg.MultiMediaModel", "setup: get first frame");
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C96541g0(C106195f0 f0Var, List<String> list, List<Integer> list2, List<Integer> list3, C15601d<? super C96541g0> dVar) {
        super(2, dVar);
        this.f282543f = f0Var;
        this.f282544g = list;
        this.f282545h = list2;
        this.f282546i = list3;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C96541g0(this.f282543f, this.f282544g, this.f282545h, this.f282546i, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C96541g0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        LinkedList<C106205q0> linkedList;
        boolean z;
        boolean z2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f282542e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f282543f.f316425d.clear();
            this.f282543f.f316426e.clear();
            this.f282543f.f316427f.clear();
            this.f282543f.f316428g.clear();
            this.f282543f.f316425d.addAll(this.f282544g);
            this.f282543f.f316426e.addAll(this.f282545h);
            this.f282543f.f316427f.addAll(C96549l0.f282563d.mo134607a(this.f282544g, this.f282545h, this.f282546i));
            C106195f0 f0Var = this.f282543f;
            LinkedList<C96549l0> linkedList2 = f0Var.f316427f;
            if (!(linkedList2 instanceof Collection) || !linkedList2.isEmpty()) {
                Iterator<T> it = linkedList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!(((C96549l0) it.next()) instanceof C96531b0)) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            f0Var.f316429h = z;
            C106195f0 f0Var2 = this.f282543f;
            LinkedList<C96549l0> linkedList3 = f0Var2.f316427f;
            if (!(linkedList3 instanceof Collection) || !linkedList3.isEmpty()) {
                Iterator<T> it4 = linkedList3.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        if (!(((C96549l0) it4.next()) instanceof C96560z0)) {
                            z2 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z2 = true;
            f0Var2.f316430i = z2;
            C106195f0 f0Var3 = this.f282543f;
            C98595b bVar = C98595b.f289089a;
            float f = (((float) this.f282543f.f316427f.get(0).f282565b) * 1.0f) / ((float) f0Var3.f316427f.get(0).f282564a);
            if (f > bVar.mo137985c()) {
                f = bVar.mo137985c();
            } else if (f < 0.5625f) {
                f = 0.5625f;
            }
            f0Var3.f316433o = f;
            C106195f0 f0Var4 = this.f282543f;
            LinkedList<C106205q0> linkedList4 = f0Var4.f316428g;
            LinkedList<C96549l0> linkedList5 = f0Var4.f316427f;
            this.f282541d = linkedList4;
            this.f282542e = 1;
            obj = C53895h.m60469g(C53872d1.f151119c, new C96547k0(linkedList5, (C15601d<? super C96547k0>) null), this);
            if (obj == aVar) {
                return aVar;
            }
            linkedList = linkedList4;
        } else if (i == 1) {
            linkedList = (LinkedList) this.f282541d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        linkedList.addAll((Collection) obj);
        C106205q0 q0Var = (C106205q0) C110818d0.m150917O(this.f282543f.f316428g, 0);
        if (q0Var == null) {
            return null;
        }
        C106195f0 f0Var5 = this.f282543f;
        C110794b a = C110794b.f331445i.mo162358a(q0Var.f316501l);
        a.mo58663C(63, 112);
        a.mo58665b(C26236u.m33719b(new Long(0)), new C96542a(f0Var5));
        return C13598b0.f38549a;
    }
}
