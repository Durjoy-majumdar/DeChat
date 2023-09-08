package sj2;

import a14.C0000n0;
import a14.C53860b3;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45252f;
import d14.C45253g;
import d14.C58042h;
import d14.C58047i;
import d14.C58095x0;
import fy3.C32227p;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import pj2.C62318a;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.flow.ExclusiveRemoteDataSource$spiltDataSource$1", mo125469f = "ExclusiveRemoteDataSource.kt", mo125470l = {23}, mo125471m = "invokeSuspend")
/* renamed from: sj2.b */
public final class C63918b extends C91594j implements C32227p<C45253g<? super ArrayList<C62318a>>, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f181181d;

    /* renamed from: e */
    public /* synthetic */ Object f181182e;

    /* renamed from: f */
    public final /* synthetic */ List<C62318a> f181183f;

    /* renamed from: g */
    public final /* synthetic */ C63922c f181184g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.flow.ExclusiveRemoteDataSource$spiltDataSource$1$1", mo125469f = "ExclusiveRemoteDataSource.kt", mo125470l = {26, 41}, mo125471m = "invokeSuspend")
    /* renamed from: sj2.b$a */
    public static final class C63919a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f181185d;

        /* renamed from: e */
        public final /* synthetic */ List<C62318a> f181186e;

        /* renamed from: f */
        public final /* synthetic */ C45253g<ArrayList<C62318a>> f181187f;

        /* renamed from: g */
        public final /* synthetic */ C63922c f181188g;

        /* renamed from: h */
        public final /* synthetic */ ArrayList<C62318a> f181189h;

        @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.flow.ExclusiveRemoteDataSource$spiltDataSource$1$1$1", mo125469f = "ExclusiveRemoteDataSource.kt", mo125470l = {25}, mo125471m = "invokeSuspend")
        /* renamed from: sj2.b$a$a */
        public static final class C63920a extends C91594j implements C32227p<C62318a, C15601d<? super C45252f<? extends C62318a>>, Object> {

            /* renamed from: d */
            public int f181190d;

            /* renamed from: e */
            public /* synthetic */ Object f181191e;

            /* renamed from: f */
            public final /* synthetic */ C63922c f181192f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63920a(C63922c cVar, C15601d<? super C63920a> dVar) {
                super(2, dVar);
                this.f181192f = cVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                C63920a aVar = new C63920a(this.f181192f, dVar);
                aVar.f181191e = obj;
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C63920a) create((C62318a) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f181190d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C63922c cVar = this.f181192f;
                    this.f181190d = 1;
                    cVar.getClass();
                    obj = new C58095x0(new C63915a((C62318a) this.f181191e, cVar, (C15601d<? super C63915a>) null));
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* renamed from: sj2.b$a$b */
        public static final class C63921b<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ ArrayList<C62318a> f181193d;

            public C63921b(ArrayList<C62318a> arrayList) {
                this.f181193d = arrayList;
            }

            public Object emit(Object obj, C15601d dVar) {
                C62318a aVar = (C62318a) obj;
                if (aVar != null) {
                    Log.m105924i("MicroMsg.ExclusiveRemoteDataSource", "avail data receive " + aVar.f177144d.f147588d);
                    this.f181193d.add(aVar);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63919a(List<C62318a> list, C45253g<? super ArrayList<C62318a>> gVar, C63922c cVar, ArrayList<C62318a> arrayList, C15601d<? super C63919a> dVar) {
            super(2, dVar);
            this.f181186e = list;
            this.f181187f = gVar;
            this.f181188g = cVar;
            this.f181189h = arrayList;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63919a(this.f181186e, this.f181187f, this.f181188g, this.f181189h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63919a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f181185d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C45252f i2 = C58042h.m67200i(new C58047i(this.f181186e), 0, new C63920a(this.f181188g, (C15601d<? super C63920a>) null), 1, (Object) null);
                C63921b bVar = new C63921b(this.f181189h);
                this.f181185d = 1;
                if (i2.mo31880a(bVar, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ArrayList arrayList = new ArrayList();
            List<C62318a> list = this.f181186e;
            ArrayList<C62318a> arrayList2 = this.f181189h;
            for (C62318a aVar2 : list) {
                if (arrayList2.contains(aVar2)) {
                    arrayList.add(aVar2);
                    Log.m105924i("MicroMsg.ExclusiveRemoteDataSource", "avail data receive " + aVar2.f177144d.f147588d);
                } else {
                    Log.m105920e("MicroMsg.ExclusiveRemoteDataSource", "no avail data receive");
                }
            }
            C45253g<ArrayList<C62318a>> gVar = this.f181187f;
            this.f181185d = 2;
            if (gVar.emit(arrayList, this) == aVar) {
                return aVar;
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63918b(List<C62318a> list, C63922c cVar, C15601d<? super C63918b> dVar) {
        super(2, dVar);
        this.f181183f = list;
        this.f181184g = cVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C63918b bVar = new C63918b(this.f181183f, this.f181184g, dVar);
        bVar.f181182e = obj;
        return bVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63918b) create((C45253g) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f181181d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            C63919a aVar2 = new C63919a(this.f181183f, (C45253g) this.f181182e, this.f181184g, arrayList, (C15601d<? super C63919a>) null);
            this.f181181d = 1;
            if (C53860b3.m60375c(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, aVar2, this) == aVar) {
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
