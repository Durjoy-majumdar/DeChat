package k82;

import a14.C0000n0;
import a14.C53895h;
import android.util.Size;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import h82.C108174c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import k82.C108957b;
import kotlin.ResultKt;
import l82.C109284b;
import m82.C109548c;
import n82.C109719a;
import n82.C109723b;
import n82.C109724c;
import o82.C109994a;
import o82.C109996c;
import p80.C110194c;
import p82.C110196b;
import p82.C110199c;
import p82.C110200d;
import p82.C110201e;
import q82.C110376b;
import r82.C110551a;
import r82.C110553c;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: k82.a */
public final class C108945a implements C108174c<C108957b, C108963c> {

    /* renamed from: a */
    public final C66212f f326331a;

    /* renamed from: b */
    public final C109548c f326332b;

    /* renamed from: c */
    public final C110376b f326333c;

    /* renamed from: d */
    public final List<C108174c<?, ?>> f326334d;

    /* renamed from: e */
    public final C110551a f326335e;

    /* renamed from: f */
    public final C110196b f326336f;

    /* renamed from: g */
    public final C109719a f326337g;

    /* renamed from: h */
    public final C109994a f326338h;

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.dispatcher.GLDispatchMTRTask$renderScope$2$1", mo125469f = "GLDispatchMTRTask.kt", mo125470l = {220}, mo125471m = "invokeSuspend")
    /* renamed from: k82.a$l */
    public static final class C60984l extends C91594j implements C32227p<C0000n0, C15601d<? super T>, Object> {

        /* renamed from: d */
        public int f173688d;

        /* renamed from: e */
        public final /* synthetic */ C32227p<C109548c.C109549a, C15601d<? super T>, Object> f173689e;

        /* renamed from: f */
        public final /* synthetic */ C109548c.C109549a f173690f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60984l(C32227p<? super C109548c.C109549a, ? super C15601d<? super T>, ? extends Object> pVar, C109548c.C109549a aVar, C15601d<? super C60984l> dVar) {
            super(2, dVar);
            this.f173689e = pVar;
            this.f173690f = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C60984l(this.f173689e, this.f173690f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C60984l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f173688d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C32227p<C109548c.C109549a, C15601d<? super T>, Object> pVar = this.f173689e;
                C109548c.C109549a aVar2 = this.f173690f;
                this.f173688d = 1;
                obj = pVar.invoke(aVar2, this);
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

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.dispatcher.GLDispatchMTRTask", mo125469f = "GLDispatchMTRTask.kt", mo125470l = {59, 64, 84, 108, 121, 153, 155, 168, 180, 193}, mo125471m = "execute")
    /* renamed from: k82.a$a */
    public static final class C108946a extends C66704d {

        /* renamed from: d */
        public Object f326339d;

        /* renamed from: e */
        public Object f326340e;

        /* renamed from: f */
        public Object f326341f;

        /* renamed from: g */
        public /* synthetic */ Object f326342g;

        /* renamed from: h */
        public final /* synthetic */ C108945a f326343h;

        /* renamed from: i */
        public int f326344i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108946a(C108945a aVar, C15601d<? super C108946a> dVar) {
            super(dVar);
            this.f326343h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f326342g = obj;
            this.f326344i |= Integer.MIN_VALUE;
            return this.f326343h.mo158582c((C108957b) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.dispatcher.GLDispatchMTRTask$execute$2$1", mo125469f = "GLDispatchMTRTask.kt", mo125470l = {61, 60}, mo125471m = "invokeSuspend")
    /* renamed from: k82.a$b */
    public static final class C108947b extends C91594j implements C32227p<C0000n0, C15601d<? super C110553c>, Object> {

        /* renamed from: d */
        public Object f326345d;

        /* renamed from: e */
        public Object f326346e;

        /* renamed from: f */
        public int f326347f;

        /* renamed from: g */
        public final /* synthetic */ C108945a f326348g;

        /* renamed from: h */
        public final /* synthetic */ C108957b f326349h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108947b(C108945a aVar, C108957b bVar, C15601d<? super C108947b> dVar) {
            super(2, dVar);
            this.f326348g = aVar;
            this.f326349h = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C108947b(this.f326348g, this.f326349h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C108947b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: type inference failed for: r4v3, types: [k82.b] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r6.f326347f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0024
                if (r1 == r3) goto L_0x0018
                if (r1 != r2) goto L_0x0010
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x0069
            L_0x0010:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0018:
                java.lang.Object r1 = r6.f326346e
                k82.b$e r1 = (k82.C108957b.C108962e) r1
                java.lang.Object r3 = r6.f326345d
                r82.a r3 = (r82.C110551a) r3
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x0045
            L_0x0024:
                kotlin.ResultKt.throwOnFailure(r7)
                k82.a r7 = r6.f326348g
                r82.a r1 = r7.f326335e
                k82.b r4 = r6.f326349h
                r5 = r4
                k82.b$e r5 = (k82.C108957b.C108962e) r5
                q82.b r7 = r7.f326333c
                k82.b$e r4 = (k82.C108957b.C108962e) r4
                java.lang.String r4 = r4.f326390a
                r6.f326345d = r1
                r6.f326346e = r5
                r6.f326347f = r3
                java.lang.Object r7 = r7.mo161893c(r4, r6)
                if (r7 != r0) goto L_0x0043
                return r0
            L_0x0043:
                r3 = r1
                r1 = r5
            L_0x0045:
                q82.b$c r7 = (q82.C110376b.C110379c) r7
                java.lang.String r4 = "<this>"
                gy3.C87412m.m108594g(r1, r4)
                java.lang.String r4 = "yuvTextureGroupWrapper"
                gy3.C87412m.m108594g(r7, r4)
                r82.b r4 = new r82.b
                q82.a$a r5 = r1.f326396c
                p82.e r1 = r1.f326391b
                r4.<init>(r5, r1, r7)
                r7 = 0
                r6.f326345d = r7
                r6.f326346e = r7
                r6.f326347f = r2
                java.lang.Object r7 = r3.mo158582c(r4, r6)
                if (r7 != r0) goto L_0x0069
                return r0
            L_0x0069:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: k82.C108945a.C108947b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.dispatcher.GLDispatchMTRTask$execute$2$3$1", mo125469f = "GLDispatchMTRTask.kt", mo125470l = {70}, mo125471m = "invokeSuspend")
    /* renamed from: k82.a$c */
    public static final class C108948c extends C91594j implements C32227p<C0000n0, C15601d<? super C110200d>, Object> {

        /* renamed from: d */
        public int f326350d;

        /* renamed from: e */
        public final /* synthetic */ C109548c.C109549a f326351e;

        /* renamed from: f */
        public final /* synthetic */ C108945a f326352f;

        /* renamed from: g */
        public final /* synthetic */ C110553c f326353g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108948c(C109548c.C109549a aVar, C108945a aVar2, C110553c cVar, C15601d<? super C108948c> dVar) {
            super(2, dVar);
            this.f326351e = aVar;
            this.f326352f = aVar2;
            this.f326353g = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C108948c(this.f326351e, this.f326352f, this.f326353g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C108948c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f326350d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C109548c.C109550b a = this.f326351e.mo160777a();
                if (a == null) {
                    return null;
                }
                C108945a aVar2 = this.f326352f;
                C110553c cVar = this.f326353g;
                C110196b bVar = aVar2.f326336f;
                Size renderSize = a.getRenderSize();
                C87412m.m108594g(cVar, "<this>");
                C87412m.m108594g(renderSize, "drawSize");
                C110199c cVar2 = new C110199c(cVar.f330645b, renderSize, cVar.f330646c);
                this.f326350d = 1;
                obj = bVar.mo158582c(cVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (C110200d) obj;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.dispatcher.GLDispatchMTRTask$execute$5", mo125469f = "GLDispatchMTRTask.kt", mo125470l = {111, 114}, mo125471m = "invokeSuspend")
    /* renamed from: k82.a$d */
    public static final class C108949d extends C91594j implements C32227p<C109548c.C109549a, C15601d<? super C109724c>, Object> {

        /* renamed from: d */
        public int f326354d;

        /* renamed from: e */
        public /* synthetic */ Object f326355e;

        /* renamed from: f */
        public final /* synthetic */ C109996c f326356f;

        /* renamed from: g */
        public final /* synthetic */ C108945a f326357g;

        /* renamed from: h */
        public final /* synthetic */ C108957b f326358h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108949d(C109996c cVar, C108945a aVar, C108957b bVar, C15601d<? super C108949d> dVar) {
            super(2, dVar);
            this.f326356f = cVar;
            this.f326357g = aVar;
            this.f326358h = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C108949d dVar2 = new C108949d(this.f326356f, this.f326357g, this.f326358h, dVar);
            dVar2.f326355e = obj;
            return dVar2;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C108949d) create((C109548c.C109549a) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f326354d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C109548c.C109550b a = ((C109548c.C109549a) this.f326355e).mo160777a();
                if (a != null) {
                    C109996c cVar = this.f326356f;
                    C108945a aVar2 = this.f326357g;
                    C108957b bVar = this.f326358h;
                    if (cVar == null) {
                        C109719a aVar3 = aVar2.f326337g;
                        C108957b.C108961d dVar = (C108957b.C108961d) bVar;
                        Size renderSize = a.getRenderSize();
                        C110201e eVar = dVar.f326391b;
                        C87412m.m108594g(renderSize, "drawSize");
                        C87412m.m108594g(eVar, "renderInfo");
                        C109723b bVar2 = new C109723b(eVar, renderSize, dVar.f326393c.f329652e, true);
                        this.f326354d = 1;
                        obj = aVar3.mo158582c(bVar2, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        C109719a aVar4 = aVar2.f326337g;
                        Size renderSize2 = a.getRenderSize();
                        C110201e eVar2 = cVar.f329170b;
                        C87412m.m108594g(renderSize2, "drawSize");
                        C87412m.m108594g(eVar2, "renderInfo");
                        C109723b bVar3 = new C109723b(eVar2, renderSize2, cVar.f329171c, false);
                        this.f326354d = 2;
                        if (aVar4.mo158582c(bVar3, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                return null;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return null;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (C109724c) obj;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.dispatcher.GLDispatchMTRTask$execute$6", mo125469f = "GLDispatchMTRTask.kt", mo125470l = {124, 136}, mo125471m = "invokeSuspend")
    /* renamed from: k82.a$e */
    public static final class C108950e extends C91594j implements C32227p<C109548c.C109549a, C15601d<? super C109724c>, Object> {

        /* renamed from: d */
        public int f326359d;

        /* renamed from: e */
        public /* synthetic */ Object f326360e;

        /* renamed from: f */
        public final /* synthetic */ C109996c f326361f;

        /* renamed from: g */
        public final /* synthetic */ C108945a f326362g;

        /* renamed from: h */
        public final /* synthetic */ C108957b f326363h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108950e(C109996c cVar, C108945a aVar, C108957b bVar, C15601d<? super C108950e> dVar) {
            super(2, dVar);
            this.f326361f = cVar;
            this.f326362g = aVar;
            this.f326363h = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C108950e eVar = new C108950e(this.f326361f, this.f326362g, this.f326363h, dVar);
            eVar.f326360e = obj;
            return eVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C108950e) create((C109548c.C109549a) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object obj3;
            C110201e eVar;
            C110201e eVar2;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f326359d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C109548c.C109549a aVar2 = (C109548c.C109549a) this.f326360e;
                if (this.f326361f == null) {
                    C109548c.C109550b a = aVar2.mo160777a();
                    if (a != null) {
                        C108945a aVar3 = this.f326362g;
                        C108957b bVar = this.f326363h;
                        C109719a aVar4 = aVar3.f326337g;
                        C108957b.C108961d dVar = (C108957b.C108961d) bVar;
                        Size renderSize = a.getRenderSize();
                        if (!dVar.f326394d) {
                            eVar2 = dVar.f326391b;
                        } else {
                            C110201e eVar3 = dVar.f326391b;
                            eVar2 = C110201e.m149794a(eVar3, 0, 0, 0, !eVar3.f329681d, false, 23, (Object) null);
                        }
                        C87412m.m108594g(renderSize, "drawSize");
                        C87412m.m108594g(eVar2, "renderInfo");
                        C109723b bVar2 = new C109723b(eVar2, renderSize, dVar.f326393c.f329652e, true);
                        this.f326359d = 1;
                        obj3 = aVar4.mo158582c(bVar2, this);
                        if (obj3 == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    C109548c.C109550b a2 = aVar2.mo160777a();
                    if (a2 != null) {
                        C108945a aVar5 = this.f326362g;
                        C109996c cVar = this.f326361f;
                        C108957b bVar3 = this.f326363h;
                        C109719a aVar6 = aVar5.f326337g;
                        Size renderSize2 = a2.getRenderSize();
                        C108957b.C108961d dVar2 = (C108957b.C108961d) bVar3;
                        if (!dVar2.f326394d) {
                            eVar = dVar2.f326391b;
                        } else {
                            C110201e eVar4 = dVar2.f326391b;
                            eVar = C110201e.m149794a(eVar4, 0, 0, 0, !eVar4.f329681d, false, 23, (Object) null);
                        }
                        C87412m.m108594g(cVar, "<this>");
                        C87412m.m108594g(renderSize2, "drawSize");
                        C87412m.m108594g(eVar, "renderInfo");
                        C109723b bVar4 = new C109723b(eVar, renderSize2, cVar.f329171c, false);
                        this.f326359d = 2;
                        obj2 = aVar6.mo158582c(bVar4, this);
                        if (obj2 == aVar) {
                            return aVar;
                        }
                        C109724c cVar2 = (C109724c) obj2;
                    }
                }
                return null;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj3 = obj;
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
                C109724c cVar22 = (C109724c) obj2;
                return null;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (C109724c) obj3;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.dispatcher.GLDispatchMTRTask$execute$7$1", mo125469f = "GLDispatchMTRTask.kt", mo125470l = {157}, mo125471m = "invokeSuspend")
    /* renamed from: k82.a$f */
    public static final class C108951f extends C91594j implements C32227p<C109548c.C109549a, C15601d<? super C109724c>, Object> {

        /* renamed from: d */
        public int f326364d;

        /* renamed from: e */
        public /* synthetic */ Object f326365e;

        /* renamed from: f */
        public final /* synthetic */ C108945a f326366f;

        /* renamed from: g */
        public final /* synthetic */ C110376b.C110380d f326367g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108951f(C108945a aVar, C110376b.C110380d dVar, C15601d<? super C108951f> dVar2) {
            super(2, dVar2);
            this.f326366f = aVar;
            this.f326367g = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C108951f fVar = new C108951f(this.f326366f, this.f326367g, dVar);
            fVar.f326365e = obj;
            return fVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C108951f) create((C109548c.C109549a) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f326364d;
            C110194c cVar = null;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C109548c.C109550b a = ((C109548c.C109549a) this.f326365e).mo160777a();
                if (a == null) {
                    return null;
                }
                C108945a aVar2 = this.f326366f;
                C110376b.C110380d dVar = this.f326367g;
                C109719a aVar3 = aVar2.f326337g;
                Size renderSize = a.getRenderSize();
                C87412m.m108594g(dVar, "<this>");
                C87412m.m108594g(renderSize, "drawSize");
                C110201e eVar = dVar.f330196e;
                if (eVar == null) {
                    eVar = new C110201e(0, 0, 0, false, false, 24, (C8480h) null);
                }
                if (dVar.f330194c) {
                    C110376b.C110378b bVar = dVar.f330193b;
                    if (bVar.f330184b) {
                        cVar = bVar.f330183a;
                    }
                }
                C109723b bVar2 = new C109723b(eVar, renderSize, cVar != null ? cVar.f329652e : 0, false);
                this.f326364d = 1;
                obj2 = aVar3.mo158582c(bVar2, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (C109724c) obj2;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.dispatcher.GLDispatchMTRTask$execute$8$1", mo125469f = "GLDispatchMTRTask.kt", mo125470l = {170}, mo125471m = "invokeSuspend")
    /* renamed from: k82.a$g */
    public static final class C108952g extends C91594j implements C32227p<C109548c.C109549a, C15601d<? super C109724c>, Object> {

        /* renamed from: d */
        public int f326368d;

        /* renamed from: e */
        public /* synthetic */ Object f326369e;

        /* renamed from: f */
        public final /* synthetic */ C108945a f326370f;

        /* renamed from: g */
        public final /* synthetic */ C110376b.C110377a f326371g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108952g(C108945a aVar, C110376b.C110377a aVar2, C15601d<? super C108952g> dVar) {
            super(2, dVar);
            this.f326370f = aVar;
            this.f326371g = aVar2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C108952g gVar = new C108952g(this.f326370f, this.f326371g, dVar);
            gVar.f326369e = obj;
            return gVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C108952g) create((C109548c.C109549a) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f326368d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C109548c.C109550b a = ((C109548c.C109549a) this.f326369e).mo160777a();
                if (a == null) {
                    return null;
                }
                C108945a aVar2 = this.f326370f;
                C110376b.C110377a aVar3 = this.f326371g;
                C109719a aVar4 = aVar2.f326337g;
                Size renderSize = a.getRenderSize();
                C87412m.m108594g(aVar3, "<this>");
                C87412m.m108594g(renderSize, "drawSize");
                C110201e eVar = aVar3.f330182c;
                if (eVar == null) {
                    eVar = new C110201e(0, 0, 0, false, false, 24, (C8480h) null);
                }
                C109723b bVar = new C109723b(eVar, renderSize, aVar3.f330181b.f329652e, true);
                this.f326368d = 1;
                obj = aVar4.mo158582c(bVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (C109724c) obj;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.dispatcher.GLDispatchMTRTask$execute$9", mo125469f = "GLDispatchMTRTask.kt", mo125470l = {185, 182}, mo125471m = "invokeSuspend")
    /* renamed from: k82.a$h */
    public static final class C108953h extends C91594j implements C32227p<C109548c.C109549a, C15601d<? super C110200d>, Object> {

        /* renamed from: d */
        public Object f326372d;

        /* renamed from: e */
        public Object f326373e;

        /* renamed from: f */
        public int f326374f;

        /* renamed from: g */
        public /* synthetic */ Object f326375g;

        /* renamed from: h */
        public final /* synthetic */ C108945a f326376h;

        /* renamed from: i */
        public final /* synthetic */ C108957b f326377i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108953h(C108945a aVar, C108957b bVar, C15601d<? super C108953h> dVar) {
            super(2, dVar);
            this.f326376h = aVar;
            this.f326377i = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C108953h hVar = new C108953h(this.f326376h, this.f326377i, dVar);
            hVar.f326375g = obj;
            return hVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C108953h) create((C109548c.C109549a) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C108957b bVar;
            Size size;
            Object obj3;
            C110196b bVar2;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f326374f;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C109548c.C109550b a = ((C109548c.C109549a) this.f326375g).mo160777a();
                if (a == null) {
                    return null;
                }
                C108945a aVar2 = this.f326376h;
                bVar = this.f326377i;
                C110196b bVar3 = aVar2.f326336f;
                Size renderSize = a.getRenderSize();
                C110376b bVar4 = aVar2.f326333c;
                String str = ((C108957b.C108958a) bVar).f326390a;
                this.f326375g = renderSize;
                this.f326372d = bVar;
                this.f326373e = bVar3;
                this.f326374f = 1;
                obj3 = bVar4.mo161893c(str, this);
                if (obj3 == aVar) {
                    return aVar;
                }
                size = renderSize;
                bVar2 = bVar3;
            } else if (i == 1) {
                bVar2 = (C110196b) this.f326373e;
                size = (Size) this.f326375g;
                ResultKt.throwOnFailure(obj);
                bVar = (C108957b) this.f326372d;
                obj3 = obj;
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
                return (C110200d) obj2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C110376b.C110379c cVar = (C110376b.C110379c) obj3;
            C87412m.m108594g(bVar, "<this>");
            C87412m.m108594g(size, "drawSize");
            C87412m.m108594g(cVar, "yuvTextureGroupWrapper");
            C110201e eVar = cVar.f330191f;
            if (eVar == null) {
                eVar = new C110201e(0, 0, 0, false, false, 24, (C8480h) null);
            }
            C110199c cVar2 = new C110199c(eVar, size, cVar);
            this.f326375g = null;
            this.f326372d = null;
            this.f326373e = null;
            this.f326374f = 2;
            obj2 = bVar2.mo158582c(cVar2, this);
            if (obj2 == aVar) {
                return aVar;
            }
            return (C110200d) obj2;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.dispatcher.GLDispatchMTRTask$execute$vbRet$1", mo125469f = "GLDispatchMTRTask.kt", mo125470l = {85, 97}, mo125471m = "invokeSuspend")
    /* renamed from: k82.a$i */
    public static final class C108954i extends C91594j implements C32227p<C0000n0, C15601d<? super C109996c>, Object> {

        /* renamed from: d */
        public int f326378d;

        /* renamed from: e */
        public final /* synthetic */ C108945a f326379e;

        /* renamed from: f */
        public final /* synthetic */ C108957b f326380f;

        /* renamed from: g */
        public final /* synthetic */ C8479f0<ReadWriteLock> f326381g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108954i(C108945a aVar, C108957b bVar, C8479f0<ReadWriteLock> f0Var, C15601d<? super C108954i> dVar) {
            super(2, dVar);
            this.f326379e = aVar;
            this.f326380f = bVar;
            this.f326381g = f0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C108954i(this.f326379e, this.f326380f, this.f326381g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C108954i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0073  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x007f  */
        /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f326378d
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0024
                if (r2 == r5) goto L_0x001e
                if (r2 != r4) goto L_0x0016
                kotlin.ResultKt.throwOnFailure(r20)
                r2 = r20
                goto L_0x0093
            L_0x0016:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x001e:
                kotlin.ResultKt.throwOnFailure(r20)
                r2 = r20
                goto L_0x003a
            L_0x0024:
                kotlin.ResultKt.throwOnFailure(r20)
                k82.a r2 = r0.f326379e
                q82.b r2 = r2.f326333c
                k82.b r6 = r0.f326380f
                k82.b$d r6 = (k82.C108957b.C108961d) r6
                java.lang.String r6 = r6.f326390a
                r0.f326378d = r5
                java.lang.Object r2 = r2.mo161892b(r6, r5, r0)
                if (r2 != r1) goto L_0x003a
                return r1
            L_0x003a:
                q82.b$d r2 = (q82.C110376b.C110380d) r2
                if (r2 == 0) goto L_0x0096
                k82.b r5 = r0.f326380f
                gy3.f0<java.util.concurrent.locks.ReadWriteLock> r6 = r0.f326381g
                k82.a r7 = r0.f326379e
                k82.b$d r5 = (k82.C108957b.C108961d) r5
                p82.e r8 = r5.f326391b
                boolean r9 = r2.f330194c
                if (r9 == 0) goto L_0x0056
                q82.b$b r9 = r2.f330193b
                boolean r10 = r9.f330184b
                if (r10 == 0) goto L_0x0056
                p80.c r9 = r9.f330183a
                r10 = r9
                goto L_0x0057
            L_0x0056:
                r10 = r3
            L_0x0057:
                if (r10 == 0) goto L_0x0069
                int r11 = r8.f329678a
                int r12 = r8.f329679b
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 60
                r18 = 0
                p80.C110194c.m149779b(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            L_0x0069:
                r2.f330196e = r8
                java.util.concurrent.locks.ReadWriteLock r8 = r2.f330195d
                r6.f27484d = r8
                boolean r6 = r2.f330194c
                if (r6 == 0) goto L_0x007c
                q82.b$b r2 = r2.f330193b
                boolean r6 = r2.f330184b
                if (r6 == 0) goto L_0x007c
                p80.c r2 = r2.f330183a
                goto L_0x007d
            L_0x007c:
                r2 = r3
            L_0x007d:
                if (r2 == 0) goto L_0x0096
                o82.a r3 = r7.f326338h
                o82.b r6 = new o82.b
                p82.e r7 = r5.f326391b
                p80.c r5 = r5.f326393c
                r6.<init>(r7, r5, r2)
                r0.f326378d = r4
                java.lang.Object r2 = r3.mo158582c(r6, r0)
                if (r2 != r1) goto L_0x0093
                return r1
            L_0x0093:
                r3 = r2
                o82.c r3 = (o82.C109996c) r3
            L_0x0096:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: k82.C108945a.C108954i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.dispatcher.GLDispatchMTRTask", mo125469f = "GLDispatchMTRTask.kt", mo125470l = {200, 201}, mo125471m = "init")
    /* renamed from: k82.a$j */
    public static final class C108955j extends C66704d {

        /* renamed from: d */
        public Object f326382d;

        /* renamed from: e */
        public /* synthetic */ Object f326383e;

        /* renamed from: f */
        public final /* synthetic */ C108945a f326384f;

        /* renamed from: g */
        public int f326385g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108955j(C108945a aVar, C15601d<? super C108955j> dVar) {
            super(dVar);
            this.f326384f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f326383e = obj;
            this.f326385g |= Integer.MIN_VALUE;
            return this.f326384f.mo158581b(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.dispatcher.GLDispatchMTRTask", mo125469f = "GLDispatchMTRTask.kt", mo125470l = {206, 207}, mo125471m = "release")
    /* renamed from: k82.a$k */
    public static final class C108956k extends C66704d {

        /* renamed from: d */
        public Object f326386d;

        /* renamed from: e */
        public /* synthetic */ Object f326387e;

        /* renamed from: f */
        public final /* synthetic */ C108945a f326388f;

        /* renamed from: g */
        public int f326389g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108956k(C108945a aVar, C15601d<? super C108956k> dVar) {
            super(dVar);
            this.f326388f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f326387e = obj;
            this.f326389g |= Integer.MIN_VALUE;
            return this.f326388f.mo158580a(this);
        }
    }

    public C108945a(C66212f fVar, C109548c cVar, C110376b bVar) {
        C87412m.m108594g(fVar, "glCoroutineContext");
        C87412m.m108594g(cVar, "renderTargetHolder");
        C87412m.m108594g(bVar, "textureManager");
        this.f326331a = fVar;
        this.f326332b = cVar;
        this.f326333c = bVar;
        ArrayList arrayList = new ArrayList();
        this.f326334d = arrayList;
        C110551a aVar = new C110551a();
        arrayList.add(aVar);
        this.f326335e = aVar;
        C110196b bVar2 = new C110196b();
        arrayList.add(bVar2);
        this.f326336f = bVar2;
        C109719a aVar2 = new C109719a();
        arrayList.add(aVar2);
        this.f326337g = aVar2;
        C109994a aVar3 = new C109994a();
        arrayList.add(aVar3);
        this.f326338h = aVar3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo158580a(wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof k82.C108945a.C108956k
            if (r0 == 0) goto L_0x0013
            r0 = r6
            k82.a$k r0 = (k82.C108945a.C108956k) r0
            int r1 = r0.f326389g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f326389g = r1
            goto L_0x0018
        L_0x0013:
            k82.a$k r0 = new k82.a$k
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f326387e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f326389g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r2 = r0.f326386d
            java.util.Iterator r2 = (java.util.Iterator) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0059
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0036:
            java.lang.Object r2 = r0.f326386d
            k82.a r2 = (k82.C108945a) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0052
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.String r6 = "MicroMsg.MTR.GLDispatchMTRTask"
            java.lang.String r2 = "release: "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            r0.f326386d = r5
            r0.f326389g = r4
            rx3.b0 r6 = rx3.C13598b0.f38549a
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r2 = r5
        L_0x0052:
            java.util.List<h82.c<?, ?>> r6 = r2.f326334d
            java.util.Iterator r6 = r6.iterator()
            r2 = r6
        L_0x0059:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0070
            java.lang.Object r6 = r2.next()
            h82.c r6 = (h82.C108174c) r6
            r0.f326386d = r2
            r0.f326389g = r3
            java.lang.Object r6 = r6.mo158580a(r0)
            if (r6 != r1) goto L_0x0059
            return r1
        L_0x0070:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k82.C108945a.mo158580a(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo158581b(wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof k82.C108945a.C108955j
            if (r0 == 0) goto L_0x0013
            r0 = r6
            k82.a$j r0 = (k82.C108945a.C108955j) r0
            int r1 = r0.f326385g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f326385g = r1
            goto L_0x0018
        L_0x0013:
            k82.a$j r0 = new k82.a$j
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f326383e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f326385g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r2 = r0.f326382d
            java.util.Iterator r2 = (java.util.Iterator) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0059
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0036:
            java.lang.Object r2 = r0.f326382d
            k82.a r2 = (k82.C108945a) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0052
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.String r6 = "MicroMsg.MTR.GLDispatchMTRTask"
            java.lang.String r2 = "init: "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            r0.f326382d = r5
            r0.f326385g = r4
            rx3.b0 r6 = rx3.C13598b0.f38549a
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r2 = r5
        L_0x0052:
            java.util.List<h82.c<?, ?>> r6 = r2.f326334d
            java.util.Iterator r6 = r6.iterator()
            r2 = r6
        L_0x0059:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0070
            java.lang.Object r6 = r2.next()
            h82.c r6 = (h82.C108174c) r6
            r0.f326382d = r2
            r0.f326385g = r3
            java.lang.Object r6 = r6.mo158581b(r0)
            if (r6 != r1) goto L_0x0059
            return r1
        L_0x0070:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k82.C108945a.mo158581b(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0237, code lost:
        if (r11 == null) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0239, code lost:
        r5 = r5.f326390a;
        r6 = new k82.C108945a.C108952g(r2, r11, (wx3.C15601d<? super k82.C108945a.C108952g>) null);
        r0.f326339d = r10;
        r0.f326340e = null;
        r0.f326344i = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x024c, code lost:
        if (r2.mo160062e(r5, r6, r0) != r1) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x024e, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x024f, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.MTR.GLDispatchMTRTask", "refresh with camTex " + ((k82.C108957b.C108958a) r10).f326390a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x026c, code lost:
        return new k82.C108963c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x026d, code lost:
        r11 = r5.f326390a;
        r5 = new k82.C108945a.C108953h(r2, r10, (wx3.C15601d<? super k82.C108945a.C108953h>) null);
        r0.f326339d = r10;
        r0.f326340e = null;
        r0.f326344i = 9;
        r11 = r2.mo160062e(r11, r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0280, code lost:
        if (r11 != r1) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0282, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0283, code lost:
        r11 = (p82.C110200d) r11;
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.MTR.GLDispatchMTRTask", "refresh with tex " + ((k82.C108957b.C108958a) r10).f326390a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02ba, code lost:
        return new k82.C108963c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e4, code lost:
        if (((r82.C110553c) r11).f323905a == false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e7, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e8, code lost:
        r11 = (r82.C110553c) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ea, code lost:
        if (r11 == null) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ec, code lost:
        r5 = r2.f326331a;
        r6 = l82.C109284b.f327183e;
        gy3.C87412m.m108594g(r3, "renderTarget");
        r5 = r5.plus(new l82.C109284b(new l82.C109284b.C109285a.C109288c(r3)));
        r6 = new k82.C108945a.C108948c(r3, r2, r11, (wx3.C15601d<? super k82.C108945a.C108948c>) null);
        r0.f326339d = r2;
        r0.f326340e = r10;
        r0.f326341f = null;
        r0.f326344i = 2;
        r11 = a14.C53895h.m60469g(r5, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0115, code lost:
        if (r11 != r1) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0117, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0118, code lost:
        r4 = (p82.C110200d) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011b, code lost:
        if (r4 != null) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011d, code lost:
        ((k82.C108957b.C108962e) r10).f326396c.mo161890b();
        r10 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0177, code lost:
        r11 = (o82.C109996c) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0179, code lost:
        if (r11 != null) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0180, code lost:
        return new k82.C108963c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0181, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0192, code lost:
        r2 = ((k82.C108957b.C108961d) r10).f326390a;
        r5 = new k82.C108945a.C108949d(r11, r3, r10, (wx3.C15601d<? super k82.C108945a.C108949d>) null);
        r0.f326339d = r3;
        r0.f326340e = r10;
        r0.f326341f = r11;
        r0.f326344i = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a9, code lost:
        if (r3.mo160062e(r2, r5, r0) != r1) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ab, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ac, code lost:
        r2 = r10;
        r10 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ae, code lost:
        r11 = new k82.C108945a.C108950e(r10, r3, r2, (wx3.C15601d<? super k82.C108945a.C108950e>) null);
        r0.f326339d = null;
        r0.f326340e = null;
        r0.f326341f = null;
        r0.f326344i = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01c2, code lost:
        if (r3.mo160062e("MTR_ENCODER_TARGET", r11, r0) != r1) goto L_0x02b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c4, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e0, code lost:
        r11 = (q82.C110376b.C110380d) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01e2, code lost:
        if (r11 == null) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e4, code lost:
        r5 = ((k82.C108957b.C108958a) r10).f326390a;
        r6 = new k82.C108945a.C108951f(r2, r11, (wx3.C15601d<? super k82.C108945a.C108951f>) null);
        r0.f326339d = r10;
        r0.f326340e = null;
        r0.f326344i = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01f9, code lost:
        if (r2.mo160062e(r5, r6, r0) != r1) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01fb, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01fc, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.MTR.GLDispatchMTRTask", "refresh with vb " + ((k82.C108957b.C108958a) r10).f326390a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0219, code lost:
        return new k82.C108963c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x021a, code lost:
        r11 = r2.f326333c;
        r5 = (k82.C108957b.C108958a) r10;
        r6 = r5.f326390a;
        r11.getClass();
        gy3.C87412m.m108594g(r6, "username");
        r11 = r11.f330178h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x022b, code lost:
        if (r11 == null) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0233, code lost:
        if (gy3.C87412m.m108589b(r11.f330180a, r6) == false) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0236, code lost:
        r11 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo158582c(k82.C108957b r10, wx3.C15601d<? super k82.C108963c> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof k82.C108945a.C108946a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            k82.a$a r0 = (k82.C108945a.C108946a) r0
            int r1 = r0.f326344i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f326344i = r1
            goto L_0x0018
        L_0x0013:
            k82.a$a r0 = new k82.a$a
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f326342g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f326344i
            java.lang.String r3 = "MicroMsg.MTR.GLDispatchMTRTask"
            r4 = 0
            switch(r2) {
                case 0: goto L_0x0098;
                case 1: goto L_0x0084;
                case 2: goto L_0x0077;
                case 3: goto L_0x006a;
                case 4: goto L_0x0059;
                case 5: goto L_0x0054;
                case 6: goto L_0x0047;
                case 7: goto L_0x003e;
                case 8: goto L_0x0035;
                case 9: goto L_0x002c;
                case 10: goto L_0x0054;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x002c:
            java.lang.Object r10 = r0.f326339d
            k82.b r10 = (k82.C108957b) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0283
        L_0x0035:
            java.lang.Object r10 = r0.f326339d
            k82.b r10 = (k82.C108957b) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x024f
        L_0x003e:
            java.lang.Object r10 = r0.f326339d
            k82.b r10 = (k82.C108957b) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x01fc
        L_0x0047:
            java.lang.Object r10 = r0.f326340e
            k82.b r10 = (k82.C108957b) r10
            java.lang.Object r2 = r0.f326339d
            k82.a r2 = (k82.C108945a) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x01e0
        L_0x0054:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x02b5
        L_0x0059:
            java.lang.Object r10 = r0.f326341f
            o82.c r10 = (o82.C109996c) r10
            java.lang.Object r2 = r0.f326340e
            k82.b r2 = (k82.C108957b) r2
            java.lang.Object r3 = r0.f326339d
            k82.a r3 = (k82.C108945a) r3
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x01ae
        L_0x006a:
            java.lang.Object r10 = r0.f326340e
            k82.b r10 = (k82.C108957b) r10
            java.lang.Object r2 = r0.f326339d
            k82.a r2 = (k82.C108945a) r2
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0177
        L_0x0077:
            java.lang.Object r10 = r0.f326340e
            k82.b r10 = (k82.C108957b) r10
            java.lang.Object r0 = r0.f326339d
            k82.a r0 = (k82.C108945a) r0
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0118
        L_0x0084:
            java.lang.Object r10 = r0.f326341f
            m82.c$a r10 = (m82.C109548c.C109549a) r10
            java.lang.Object r2 = r0.f326340e
            k82.b r2 = (k82.C108957b) r2
            java.lang.Object r3 = r0.f326339d
            k82.a r3 = (k82.C108945a) r3
            kotlin.ResultKt.throwOnFailure(r11)
            r8 = r3
            r3 = r10
            r10 = r2
            r2 = r8
            goto L_0x00df
        L_0x0098:
            kotlin.ResultKt.throwOnFailure(r11)
            boolean r11 = r10 instanceof k82.C108957b.C108962e
            if (r11 == 0) goto L_0x012b
            m82.c r11 = r9.f326332b
            r2 = r10
            k82.b$e r2 = (k82.C108957b.C108962e) r2
            java.lang.String r3 = r2.f326390a
            monitor-enter(r11)
            java.lang.String r5 = "key"
            gy3.C87412m.m108594g(r3, r5)     // Catch:{ all -> 0x0128 }
            android.util.ArrayMap<java.lang.String, m82.c$a> r5 = r11.f327915e     // Catch:{ all -> 0x0128 }
            java.lang.Object r3 = r5.get(r3)     // Catch:{ all -> 0x0128 }
            m82.c$a r3 = (m82.C109548c.C109549a) r3     // Catch:{ all -> 0x0128 }
            monitor-exit(r11)
            if (r3 == 0) goto L_0x011d
            int r11 = r2.f326397d
            r5 = -1
            if (r11 == r5) goto L_0x00c7
            m82.c$b r11 = r3.mo160777a()
            if (r11 == 0) goto L_0x00c7
            int r2 = r2.f326397d
            r11.setScreenOri(r2)
        L_0x00c7:
            wx3.f r11 = r9.f326331a
            k82.a$b r2 = new k82.a$b
            r2.<init>(r9, r10, r4)
            r0.f326339d = r9
            r0.f326340e = r10
            r0.f326341f = r3
            r5 = 1
            r0.f326344i = r5
            java.lang.Object r11 = a14.C53895h.m60469g(r11, r2, r0)
            if (r11 != r1) goto L_0x00de
            return r1
        L_0x00de:
            r2 = r9
        L_0x00df:
            r5 = r11
            r82.c r5 = (r82.C110553c) r5
            boolean r5 = r5.f323905a
            if (r5 == 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r11 = r4
        L_0x00e8:
            r82.c r11 = (r82.C110553c) r11
            if (r11 == 0) goto L_0x011b
            wx3.f r5 = r2.f326331a
            l82.b$b r6 = l82.C109284b.f327183e
            java.lang.String r6 = "renderTarget"
            gy3.C87412m.m108594g(r3, r6)
            l82.b r6 = new l82.b
            l82.b$a$c r7 = new l82.b$a$c
            r7.<init>(r3)
            r6.<init>(r7)
            wx3.f r5 = r5.plus(r6)
            k82.a$c r6 = new k82.a$c
            r6.<init>(r3, r2, r11, r4)
            r0.f326339d = r2
            r0.f326340e = r10
            r0.f326341f = r4
            r11 = 2
            r0.f326344i = r11
            java.lang.Object r11 = a14.C53895h.m60469g(r5, r6, r0)
            if (r11 != r1) goto L_0x0118
            return r1
        L_0x0118:
            r4 = r11
            p82.d r4 = (p82.C110200d) r4
        L_0x011b:
            if (r4 != 0) goto L_0x02b5
        L_0x011d:
            k82.b$e r10 = (k82.C108957b.C108962e) r10
            q82.a$a r10 = r10.f326396c
            r10.mo161890b()
            rx3.b0 r10 = rx3.C13598b0.f38549a
            goto L_0x02b5
        L_0x0128:
            r10 = move-exception
            monitor-exit(r11)
            throw r10
        L_0x012b:
            boolean r11 = r10 instanceof k82.C108957b.C108961d
            if (r11 == 0) goto L_0x01c5
            q82.b r11 = r9.f326333c
            r2 = r10
            k82.b$d r2 = (k82.C108957b.C108961d) r2
            java.lang.String r3 = r2.f326390a
            r11.getClass()
            java.lang.String r5 = "username"
            gy3.C87412m.m108594g(r3, r5)
            q82.b$a r11 = r11.f330178h
            if (r11 == 0) goto L_0x014b
            java.lang.String r5 = r11.f330180a
            boolean r3 = gy3.C87412m.m108589b(r5, r3)
            if (r3 == 0) goto L_0x014b
            goto L_0x014c
        L_0x014b:
            r11 = r4
        L_0x014c:
            if (r11 == 0) goto L_0x0152
            p82.e r3 = r2.f326391b
            r11.f330182c = r3
        L_0x0152:
            gy3.f0 r11 = new gy3.f0
            r11.<init>()
            boolean r2 = r2.f326395e
            if (r2 == 0) goto L_0x0183
            wx3.f r2 = r9.f326331a
            l82.b r3 = l82.C109284b.f327185g
            wx3.f r2 = r2.plus(r3)
            k82.a$i r3 = new k82.a$i
            r3.<init>(r9, r10, r11, r4)
            r0.f326339d = r9
            r0.f326340e = r10
            r11 = 3
            r0.f326344i = r11
            java.lang.Object r11 = a14.C53895h.m60469g(r2, r3, r0)
            if (r11 != r1) goto L_0x0176
            return r1
        L_0x0176:
            r2 = r9
        L_0x0177:
            o82.c r11 = (o82.C109996c) r11
            if (r11 != 0) goto L_0x0181
            k82.c r10 = new k82.c
            r10.<init>()
            return r10
        L_0x0181:
            r3 = r2
            goto L_0x0192
        L_0x0183:
            q82.b r11 = r9.f326333c
            q82.b$d r2 = r11.f330179i
            if (r2 == 0) goto L_0x018e
            q82.b$b r2 = r2.f330193b
            r2.mo161895a()
        L_0x018e:
            r11.f330179i = r4
            r3 = r9
            r11 = r4
        L_0x0192:
            r2 = r10
            k82.b$d r2 = (k82.C108957b.C108961d) r2
            java.lang.String r2 = r2.f326390a
            k82.a$d r5 = new k82.a$d
            r5.<init>(r11, r3, r10, r4)
            r0.f326339d = r3
            r0.f326340e = r10
            r0.f326341f = r11
            r6 = 4
            r0.f326344i = r6
            java.lang.Object r2 = r3.mo160062e(r2, r5, r0)
            if (r2 != r1) goto L_0x01ac
            return r1
        L_0x01ac:
            r2 = r10
            r10 = r11
        L_0x01ae:
            k82.a$e r11 = new k82.a$e
            r11.<init>(r10, r3, r2, r4)
            r0.f326339d = r4
            r0.f326340e = r4
            r0.f326341f = r4
            r10 = 5
            r0.f326344i = r10
            java.lang.String r10 = "MTR_ENCODER_TARGET"
            java.lang.Object r10 = r3.mo160062e(r10, r11, r0)
            if (r10 != r1) goto L_0x02b5
            return r1
        L_0x01c5:
            boolean r11 = r10 instanceof k82.C108957b.C108958a
            if (r11 == 0) goto L_0x029e
            q82.b r11 = r9.f326333c
            r2 = r10
            k82.b$a r2 = (k82.C108957b.C108958a) r2
            java.lang.String r2 = r2.f326390a
            r5 = 0
            r0.f326339d = r9
            r0.f326340e = r10
            r6 = 6
            r0.f326344i = r6
            java.lang.Object r11 = r11.mo161892b(r2, r5, r0)
            if (r11 != r1) goto L_0x01df
            return r1
        L_0x01df:
            r2 = r9
        L_0x01e0:
            q82.b$d r11 = (q82.C110376b.C110380d) r11
            if (r11 == 0) goto L_0x021a
            r5 = r10
            k82.b$a r5 = (k82.C108957b.C108958a) r5
            java.lang.String r5 = r5.f326390a
            k82.a$f r6 = new k82.a$f
            r6.<init>(r2, r11, r4)
            r0.f326339d = r10
            r0.f326340e = r4
            r11 = 7
            r0.f326344i = r11
            java.lang.Object r11 = r2.mo160062e(r5, r6, r0)
            if (r11 != r1) goto L_0x01fc
            return r1
        L_0x01fc:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "refresh with vb "
            r11.append(r0)
            k82.b$a r10 = (k82.C108957b.C108958a) r10
            java.lang.String r10 = r10.f326390a
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
            k82.c r10 = new k82.c
            r10.<init>()
            return r10
        L_0x021a:
            q82.b r11 = r2.f326333c
            r5 = r10
            k82.b$a r5 = (k82.C108957b.C108958a) r5
            java.lang.String r6 = r5.f326390a
            r11.getClass()
            java.lang.String r7 = "username"
            gy3.C87412m.m108594g(r6, r7)
            q82.b$a r11 = r11.f330178h
            if (r11 == 0) goto L_0x0236
            java.lang.String r7 = r11.f330180a
            boolean r6 = gy3.C87412m.m108589b(r7, r6)
            if (r6 == 0) goto L_0x0236
            goto L_0x0237
        L_0x0236:
            r11 = r4
        L_0x0237:
            if (r11 == 0) goto L_0x026d
            java.lang.String r5 = r5.f326390a
            k82.a$g r6 = new k82.a$g
            r6.<init>(r2, r11, r4)
            r0.f326339d = r10
            r0.f326340e = r4
            r11 = 8
            r0.f326344i = r11
            java.lang.Object r11 = r2.mo160062e(r5, r6, r0)
            if (r11 != r1) goto L_0x024f
            return r1
        L_0x024f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "refresh with camTex "
            r11.append(r0)
            k82.b$a r10 = (k82.C108957b.C108958a) r10
            java.lang.String r10 = r10.f326390a
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
            k82.c r10 = new k82.c
            r10.<init>()
            return r10
        L_0x026d:
            java.lang.String r11 = r5.f326390a
            k82.a$h r5 = new k82.a$h
            r5.<init>(r2, r10, r4)
            r0.f326339d = r10
            r0.f326340e = r4
            r4 = 9
            r0.f326344i = r4
            java.lang.Object r11 = r2.mo160062e(r11, r5, r0)
            if (r11 != r1) goto L_0x0283
            return r1
        L_0x0283:
            p82.d r11 = (p82.C110200d) r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "refresh with tex "
            r11.append(r0)
            k82.b$a r10 = (k82.C108957b.C108958a) r10
            java.lang.String r10 = r10.f326390a
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
            goto L_0x02b5
        L_0x029e:
            boolean r11 = r10 instanceof k82.C108957b.C108959b
            if (r11 != 0) goto L_0x02bb
            boolean r11 = r10 instanceof k82.C108957b.C108960c
            if (r11 == 0) goto L_0x02b5
            k82.b$c r10 = (k82.C108957b.C108960c) r10
            fy3.l<wx3.d<? super rx3.b0>, java.lang.Object> r10 = r10.f326392a
            r11 = 10
            r0.f326344i = r11
            java.lang.Object r10 = r10.invoke(r0)
            if (r10 != r1) goto L_0x02b5
            return r1
        L_0x02b5:
            k82.c r10 = new k82.c
            r10.<init>()
            return r10
        L_0x02bb:
            k82.b$b r10 = (k82.C108957b.C108959b) r10
            r10.getClass()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k82.C108945a.mo158582c(k82.b, wx3.d):java.lang.Object");
    }

    /* renamed from: e */
    public final <T> Object mo160062e(String str, C32227p<? super C109548c.C109549a, ? super C15601d<? super T>, ? extends Object> pVar, C15601d<? super T> dVar) {
        C109548c.C109549a aVar;
        C109548c cVar = this.f326332b;
        synchronized (cVar) {
            C87412m.m108594g(str, "key");
            aVar = cVar.f327915e.get(str);
        }
        if (aVar == null) {
            return null;
        }
        C66212f fVar = this.f326331a;
        C109284b.C109290b bVar = C109284b.f327183e;
        return C53895h.m60469g(fVar.plus(new C109284b(new C109284b.C109285a.C109288c(aVar))), new C60984l(pVar, aVar, (C15601d<? super C60984l>) null), dVar);
    }
}
