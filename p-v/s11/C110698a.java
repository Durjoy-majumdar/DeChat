package s11;

import a14.C0000n0;
import a14.C53895h;
import android.util.Size;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import p11.C110103c;
import p80.C110194c;
import rx3.C13598b0;
import s11.C110708b;
import t11.C110892b;
import u11.C111099b;
import v11.C111307a;
import v11.C111311b;
import v11.C111312c;
import w11.C111706a;
import wx3.C15601d;
import wx3.C66212f;
import x11.C112013b;
import x11.C112016c;
import x11.C112017d;
import x11.C112018e;
import xx3.C15911a;
import y11.C112360b;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import z11.C112566a;
import z11.C112568c;

/* renamed from: s11.a */
public final class C110698a implements C110103c<C110708b, C110714c> {

    /* renamed from: a */
    public final C66212f f331122a;

    /* renamed from: b */
    public final C111099b f331123b;

    /* renamed from: c */
    public final C112360b f331124c;

    /* renamed from: d */
    public final List<C110103c<?, ?>> f331125d;

    /* renamed from: e */
    public final C112566a f331126e;

    /* renamed from: f */
    public final C112013b f331127f;

    /* renamed from: g */
    public final C111307a f331128g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.cloudvoip.cloudvoice.mt_render.mt_render_impl.dispatcher.GLDispatchMTRTask$renderScope$2$1", mo125469f = "GLDispatchMTRTask.kt", mo125470l = {168}, mo125471m = "invokeSuspend")
    /* renamed from: s11.a$j */
    public static final class C63691j extends C91594j implements C32227p<C0000n0, C15601d<? super T>, Object> {

        /* renamed from: d */
        public int f180548d;

        /* renamed from: e */
        public final /* synthetic */ C32227p<C111099b.C111100a, C15601d<? super T>, Object> f180549e;

        /* renamed from: f */
        public final /* synthetic */ C111099b.C111100a f180550f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63691j(C32227p<? super C111099b.C111100a, ? super C15601d<? super T>, ? extends Object> pVar, C111099b.C111100a aVar, C15601d<? super C63691j> dVar) {
            super(2, dVar);
            this.f180549e = pVar;
            this.f180550f = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63691j(this.f180549e, this.f180550f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63691j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f180548d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C32227p<C111099b.C111100a, C15601d<? super T>, Object> pVar = this.f180549e;
                C111099b.C111100a aVar2 = this.f180550f;
                this.f180548d = 1;
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

    @C91590f(mo125468c = "com.tencent.mm.plugin.cloudvoip.cloudvoice.mt_render.mt_render_impl.dispatcher.GLDispatchMTRTask", mo125469f = "GLDispatchMTRTask.kt", mo125470l = {59, 64, 81, 101, 103, 116, 128, 141}, mo125471m = "execute")
    /* renamed from: s11.a$a */
    public static final class C110699a extends C66704d {

        /* renamed from: d */
        public Object f331129d;

        /* renamed from: e */
        public Object f331130e;

        /* renamed from: f */
        public /* synthetic */ Object f331131f;

        /* renamed from: g */
        public final /* synthetic */ C110698a f331132g;

        /* renamed from: h */
        public int f331133h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110699a(C110698a aVar, C15601d<? super C110699a> dVar) {
            super(dVar);
            this.f331132g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f331131f = obj;
            this.f331133h |= Integer.MIN_VALUE;
            return this.f331132g.mo161502c((C110708b) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.cloudvoip.cloudvoice.mt_render.mt_render_impl.dispatcher.GLDispatchMTRTask$execute$2$1", mo125469f = "GLDispatchMTRTask.kt", mo125470l = {61, 60}, mo125471m = "invokeSuspend")
    /* renamed from: s11.a$b */
    public static final class C110700b extends C91594j implements C32227p<C0000n0, C15601d<? super C112568c>, Object> {

        /* renamed from: d */
        public Object f331134d;

        /* renamed from: e */
        public Object f331135e;

        /* renamed from: f */
        public int f331136f;

        /* renamed from: g */
        public final /* synthetic */ C110698a f331137g;

        /* renamed from: h */
        public final /* synthetic */ C110708b f331138h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110700b(C110698a aVar, C110708b bVar, C15601d<? super C110700b> dVar) {
            super(2, dVar);
            this.f331137g = aVar;
            this.f331138h = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C110700b(this.f331137g, this.f331138h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C110700b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: type inference failed for: r4v3, types: [s11.b] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r6.f331136f
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
                java.lang.Object r1 = r6.f331135e
                s11.b$e r1 = (s11.C110708b.C110713e) r1
                java.lang.Object r3 = r6.f331134d
                z11.a r3 = (z11.C112566a) r3
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x0045
            L_0x0024:
                kotlin.ResultKt.throwOnFailure(r7)
                s11.a r7 = r6.f331137g
                z11.a r1 = r7.f331126e
                s11.b r4 = r6.f331138h
                r5 = r4
                s11.b$e r5 = (s11.C110708b.C110713e) r5
                y11.b r7 = r7.f331124c
                s11.b$e r4 = (s11.C110708b.C110713e) r4
                java.lang.String r4 = r4.f331169a
                r6.f331134d = r1
                r6.f331135e = r5
                r6.f331136f = r3
                java.lang.Object r7 = r7.mo164084c(r4, r6)
                if (r7 != r0) goto L_0x0043
                return r0
            L_0x0043:
                r3 = r1
                r1 = r5
            L_0x0045:
                y11.b$c r7 = (y11.C112360b.C112363c) r7
                java.lang.String r4 = "<this>"
                gy3.C87412m.m108594g(r1, r4)
                java.lang.String r4 = "yuvTextureGroupWrapper"
                gy3.C87412m.m108594g(r7, r4)
                z11.b r4 = new z11.b
                y11.a$a r5 = r1.f331172c
                x11.e r1 = r1.f331170b
                r4.<init>(r5, r1, r7)
                r7 = 0
                r6.f331134d = r7
                r6.f331135e = r7
                r6.f331136f = r2
                java.lang.Object r7 = r3.mo161502c(r4, r6)
                if (r7 != r0) goto L_0x0069
                return r0
            L_0x0069:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: s11.C110698a.C110700b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.cloudvoip.cloudvoice.mt_render.mt_render_impl.dispatcher.GLDispatchMTRTask$execute$2$3$1", mo125469f = "GLDispatchMTRTask.kt", mo125470l = {70}, mo125471m = "invokeSuspend")
    /* renamed from: s11.a$c */
    public static final class C110701c extends C91594j implements C32227p<C0000n0, C15601d<? super C112017d>, Object> {

        /* renamed from: d */
        public int f331139d;

        /* renamed from: e */
        public final /* synthetic */ C111099b.C111100a f331140e;

        /* renamed from: f */
        public final /* synthetic */ C110698a f331141f;

        /* renamed from: g */
        public final /* synthetic */ C112568c f331142g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110701c(C111099b.C111100a aVar, C110698a aVar2, C112568c cVar, C15601d<? super C110701c> dVar) {
            super(2, dVar);
            this.f331140e = aVar;
            this.f331141f = aVar2;
            this.f331142g = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C110701c(this.f331140e, this.f331141f, this.f331142g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C110701c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f331139d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C111099b.C111101b a = this.f331140e.mo162848a();
                if (a == null) {
                    return null;
                }
                C110698a aVar2 = this.f331141f;
                C112568c cVar = this.f331142g;
                C112013b bVar = aVar2.f331127f;
                Size renderSize = a.getRenderSize();
                int scaleType = a.getScaleType();
                C87412m.m108594g(cVar, "<this>");
                C87412m.m108594g(renderSize, "drawSize");
                C112016c cVar2 = new C112016c(C112018e.m152742a(cVar.f337030b, 0, 0, 0, false, scaleType, 15, (Object) null), renderSize, cVar.f337031c);
                this.f331139d = 1;
                obj = bVar.mo161502c(cVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (C112017d) obj;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.cloudvoip.cloudvoice.mt_render.mt_render_impl.dispatcher.GLDispatchMTRTask$execute$5", mo125469f = "GLDispatchMTRTask.kt", mo125470l = {83}, mo125471m = "invokeSuspend")
    /* renamed from: s11.a$d */
    public static final class C110702d extends C91594j implements C32227p<C111099b.C111100a, C15601d<? super C111312c>, Object> {

        /* renamed from: d */
        public int f331143d;

        /* renamed from: e */
        public /* synthetic */ Object f331144e;

        /* renamed from: f */
        public final /* synthetic */ C110698a f331145f;

        /* renamed from: g */
        public final /* synthetic */ C110708b f331146g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110702d(C110698a aVar, C110708b bVar, C15601d<? super C110702d> dVar) {
            super(2, dVar);
            this.f331145f = aVar;
            this.f331146g = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C110702d dVar2 = new C110702d(this.f331145f, this.f331146g, dVar);
            dVar2.f331144e = obj;
            return dVar2;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C110702d) create((C111099b.C111100a) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f331143d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C111099b.C111101b a = ((C111099b.C111100a) this.f331144e).mo162848a();
                if (a == null) {
                    return null;
                }
                C110698a aVar2 = this.f331145f;
                C110708b bVar = this.f331146g;
                C111307a aVar3 = aVar2.f331128g;
                C110708b.C110712d dVar = (C110708b.C110712d) bVar;
                Size renderSize = a.getRenderSize();
                C112018e a2 = C112018e.m152742a(dVar.f331170b, 0, 0, 0, false, a.getScaleType(), 15, (Object) null);
                C87412m.m108594g(dVar, "<this>");
                C87412m.m108594g(renderSize, "drawSize");
                C111311b bVar2 = new C111311b(a2, renderSize, dVar.f331171c.f329652e, true);
                this.f331143d = 1;
                obj = aVar3.mo161502c(bVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (C111312c) obj;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.cloudvoip.cloudvoice.mt_render.mt_render_impl.dispatcher.GLDispatchMTRTask$execute$6$1", mo125469f = "GLDispatchMTRTask.kt", mo125470l = {105}, mo125471m = "invokeSuspend")
    /* renamed from: s11.a$e */
    public static final class C110703e extends C91594j implements C32227p<C111099b.C111100a, C15601d<? super C111312c>, Object> {

        /* renamed from: d */
        public int f331147d;

        /* renamed from: e */
        public /* synthetic */ Object f331148e;

        /* renamed from: f */
        public final /* synthetic */ C110698a f331149f;

        /* renamed from: g */
        public final /* synthetic */ C112360b.C112364d f331150g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110703e(C110698a aVar, C112360b.C112364d dVar, C15601d<? super C110703e> dVar2) {
            super(2, dVar2);
            this.f331149f = aVar;
            this.f331150g = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C110703e eVar = new C110703e(this.f331149f, this.f331150g, dVar);
            eVar.f331148e = obj;
            return eVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C110703e) create((C111099b.C111100a) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C110194c cVar;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f331147d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C111099b.C111101b a = ((C111099b.C111100a) this.f331148e).mo162848a();
                if (a == null) {
                    return null;
                }
                C110698a aVar2 = this.f331149f;
                C112360b.C112364d dVar = this.f331150g;
                C111307a aVar3 = aVar2.f331128g;
                Size renderSize = a.getRenderSize();
                C87412m.m108594g(dVar, "<this>");
                C87412m.m108594g(renderSize, "drawSize");
                C112018e eVar = r8;
                C112018e eVar2 = new C112018e(0, 0, 0, false, 0, 24, (C8480h) null);
                if (dVar.f336414c) {
                    C112360b.C112362b bVar = dVar.f336413b;
                    cVar = bVar.f336404b ? bVar.f336403a : null;
                } else {
                    cVar = null;
                }
                C111311b bVar2 = new C111311b(eVar, renderSize, cVar != null ? cVar.f329652e : 0, false);
                this.f331147d = 1;
                obj2 = aVar3.mo161502c(bVar2, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (C111312c) obj2;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.cloudvoip.cloudvoice.mt_render.mt_render_impl.dispatcher.GLDispatchMTRTask$execute$7$1", mo125469f = "GLDispatchMTRTask.kt", mo125470l = {118}, mo125471m = "invokeSuspend")
    /* renamed from: s11.a$f */
    public static final class C110704f extends C91594j implements C32227p<C111099b.C111100a, C15601d<? super C111312c>, Object> {

        /* renamed from: d */
        public int f331151d;

        /* renamed from: e */
        public /* synthetic */ Object f331152e;

        /* renamed from: f */
        public final /* synthetic */ C110698a f331153f;

        /* renamed from: g */
        public final /* synthetic */ C112360b.C112361a f331154g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110704f(C110698a aVar, C112360b.C112361a aVar2, C15601d<? super C110704f> dVar) {
            super(2, dVar);
            this.f331153f = aVar;
            this.f331154g = aVar2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C110704f fVar = new C110704f(this.f331153f, this.f331154g, dVar);
            fVar.f331152e = obj;
            return fVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C110704f) create((C111099b.C111100a) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f331151d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C111099b.C111101b a = ((C111099b.C111100a) this.f331152e).mo162848a();
                if (a == null) {
                    return null;
                }
                C110698a aVar2 = this.f331153f;
                C112360b.C112361a aVar3 = this.f331154g;
                C111307a aVar4 = aVar2.f331128g;
                Size renderSize = a.getRenderSize();
                C87412m.m108594g(aVar3, "<this>");
                C87412m.m108594g(renderSize, "drawSize");
                C112018e eVar = aVar3.f336402c;
                if (eVar == null) {
                    eVar = new C112018e(0, 0, 0, false, 0, 24, (C8480h) null);
                }
                C111311b bVar = new C111311b(eVar, renderSize, aVar3.f336401b.f329652e, true);
                this.f331151d = 1;
                obj = aVar4.mo161502c(bVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (C111312c) obj;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.cloudvoip.cloudvoice.mt_render.mt_render_impl.dispatcher.GLDispatchMTRTask$execute$8", mo125469f = "GLDispatchMTRTask.kt", mo125470l = {133, 130}, mo125471m = "invokeSuspend")
    /* renamed from: s11.a$g */
    public static final class C110705g extends C91594j implements C32227p<C111099b.C111100a, C15601d<? super C112017d>, Object> {

        /* renamed from: d */
        public Object f331155d;

        /* renamed from: e */
        public Object f331156e;

        /* renamed from: f */
        public int f331157f;

        /* renamed from: g */
        public /* synthetic */ Object f331158g;

        /* renamed from: h */
        public final /* synthetic */ C110698a f331159h;

        /* renamed from: i */
        public final /* synthetic */ C110708b f331160i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110705g(C110698a aVar, C110708b bVar, C15601d<? super C110705g> dVar) {
            super(2, dVar);
            this.f331159h = aVar;
            this.f331160i = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C110705g gVar = new C110705g(this.f331159h, this.f331160i, dVar);
            gVar.f331158g = obj;
            return gVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C110705g) create((C111099b.C111100a) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C110708b bVar;
            Size size;
            Object obj3;
            C112013b bVar2;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f331157f;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C111099b.C111101b a = ((C111099b.C111100a) this.f331158g).mo162848a();
                if (a == null) {
                    return null;
                }
                C110698a aVar2 = this.f331159h;
                bVar = this.f331160i;
                C112013b bVar3 = aVar2.f331127f;
                Size renderSize = a.getRenderSize();
                C112360b bVar4 = aVar2.f331124c;
                String str = ((C110708b.C110709a) bVar).f331169a;
                this.f331158g = renderSize;
                this.f331155d = bVar;
                this.f331156e = bVar3;
                this.f331157f = 1;
                obj3 = bVar4.mo164084c(str, this);
                if (obj3 == aVar) {
                    return aVar;
                }
                size = renderSize;
                bVar2 = bVar3;
            } else if (i == 1) {
                bVar2 = (C112013b) this.f331156e;
                size = (Size) this.f331158g;
                ResultKt.throwOnFailure(obj);
                bVar = (C110708b) this.f331155d;
                obj3 = obj;
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
                return (C112017d) obj2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C112360b.C112363c cVar = (C112360b.C112363c) obj3;
            C87412m.m108594g(bVar, "<this>");
            C87412m.m108594g(size, "drawSize");
            C87412m.m108594g(cVar, "yuvTextureGroupWrapper");
            C112018e eVar = cVar.f336411f;
            if (eVar == null) {
                eVar = new C112018e(0, 0, 0, false, 0, 24, (C8480h) null);
            }
            C112016c cVar2 = new C112016c(eVar, size, cVar);
            this.f331158g = null;
            this.f331155d = null;
            this.f331156e = null;
            this.f331157f = 2;
            obj2 = bVar2.mo161502c(cVar2, this);
            if (obj2 == aVar) {
                return aVar;
            }
            return (C112017d) obj2;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.cloudvoip.cloudvoice.mt_render.mt_render_impl.dispatcher.GLDispatchMTRTask", mo125469f = "GLDispatchMTRTask.kt", mo125470l = {148, 149}, mo125471m = "init")
    /* renamed from: s11.a$h */
    public static final class C110706h extends C66704d {

        /* renamed from: d */
        public Object f331161d;

        /* renamed from: e */
        public /* synthetic */ Object f331162e;

        /* renamed from: f */
        public final /* synthetic */ C110698a f331163f;

        /* renamed from: g */
        public int f331164g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110706h(C110698a aVar, C15601d<? super C110706h> dVar) {
            super(dVar);
            this.f331163f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f331162e = obj;
            this.f331164g |= Integer.MIN_VALUE;
            return this.f331163f.mo161501b(this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.cloudvoip.cloudvoice.mt_render.mt_render_impl.dispatcher.GLDispatchMTRTask", mo125469f = "GLDispatchMTRTask.kt", mo125470l = {154, 155}, mo125471m = "release")
    /* renamed from: s11.a$i */
    public static final class C110707i extends C66704d {

        /* renamed from: d */
        public Object f331165d;

        /* renamed from: e */
        public /* synthetic */ Object f331166e;

        /* renamed from: f */
        public final /* synthetic */ C110698a f331167f;

        /* renamed from: g */
        public int f331168g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110707i(C110698a aVar, C15601d<? super C110707i> dVar) {
            super(dVar);
            this.f331167f = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f331166e = obj;
            this.f331168g |= Integer.MIN_VALUE;
            return this.f331167f.mo161500a(this);
        }
    }

    public C110698a(C66212f fVar, C111099b bVar, C112360b bVar2) {
        C87412m.m108594g(fVar, "glCoroutineContext");
        C87412m.m108594g(bVar, "renderTargetHolder");
        C87412m.m108594g(bVar2, "textureManager");
        this.f331122a = fVar;
        this.f331123b = bVar;
        this.f331124c = bVar2;
        ArrayList arrayList = new ArrayList();
        this.f331125d = arrayList;
        C112566a aVar = new C112566a();
        arrayList.add(aVar);
        this.f331126e = aVar;
        C112013b bVar3 = new C112013b();
        arrayList.add(bVar3);
        this.f331127f = bVar3;
        C111307a aVar2 = new C111307a();
        arrayList.add(aVar2);
        this.f331128g = aVar2;
        arrayList.add(new C111706a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo161500a(wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof s11.C110698a.C110707i
            if (r0 == 0) goto L_0x0013
            r0 = r6
            s11.a$i r0 = (s11.C110698a.C110707i) r0
            int r1 = r0.f331168g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f331168g = r1
            goto L_0x0018
        L_0x0013:
            s11.a$i r0 = new s11.a$i
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f331166e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f331168g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r2 = r0.f331165d
            java.util.Iterator r2 = (java.util.Iterator) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x005a
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0036:
            java.lang.Object r2 = r0.f331165d
            s11.a r2 = (s11.C110698a) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0053
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.String r6 = "MicroMsg.MTR.GLDispatchMTRTask"
            java.lang.String r2 = "release: "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            r0.f331165d = r5
            r0.f331168g = r4
            rx3.b0 r6 = rx3.C13598b0.f38549a
            if (r6 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r2 = r5
        L_0x0053:
            java.util.List<p11.c<?, ?>> r6 = r2.f331125d
            java.util.Iterator r6 = r6.iterator()
            r2 = r6
        L_0x005a:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0071
            java.lang.Object r6 = r2.next()
            p11.c r6 = (p11.C110103c) r6
            r0.f331165d = r2
            r0.f331168g = r3
            java.lang.Object r6 = r6.mo161500a(r0)
            if (r6 != r1) goto L_0x005a
            return r1
        L_0x0071:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s11.C110698a.mo161500a(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo161501b(wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof s11.C110698a.C110706h
            if (r0 == 0) goto L_0x0013
            r0 = r6
            s11.a$h r0 = (s11.C110698a.C110706h) r0
            int r1 = r0.f331164g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f331164g = r1
            goto L_0x0018
        L_0x0013:
            s11.a$h r0 = new s11.a$h
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f331162e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f331164g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r2 = r0.f331161d
            java.util.Iterator r2 = (java.util.Iterator) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0059
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0036:
            java.lang.Object r2 = r0.f331161d
            s11.a r2 = (s11.C110698a) r2
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0052
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.String r6 = "MicroMsg.MTR.GLDispatchMTRTask"
            java.lang.String r2 = "init: "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            r0.f331161d = r5
            r0.f331164g = r4
            rx3.b0 r6 = rx3.C13598b0.f38549a
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            r2 = r5
        L_0x0052:
            java.util.List<p11.c<?, ?>> r6 = r2.f331125d
            java.util.Iterator r6 = r6.iterator()
            r2 = r6
        L_0x0059:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0070
            java.lang.Object r6 = r2.next()
            p11.c r6 = (p11.C110103c) r6
            r0.f331161d = r2
            r0.f331164g = r3
            java.lang.Object r6 = r6.mo161501b(r0)
            if (r6 != r1) goto L_0x0059
            return r1
        L_0x0070:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s11.C110698a.mo161501b(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0220, code lost:
        return new s11.C110714c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        if (((z11.C112568c) r10).f329411a == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b8, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b9, code lost:
        r10 = (z11.C112568c) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bb, code lost:
        if (r10 == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bd, code lost:
        r3 = r2.f331122a;
        r5 = t11.C110892b.f331701e;
        gy3.C87412m.m108594g(r9, "renderTarget");
        r3 = r3.plus(new t11.C110892b(new t11.C110892b.C110893a.C110896c(r9)));
        r5 = new s11.C110698a.C110701c(r9, r2, r10, (wx3.C15601d<? super s11.C110698a.C110701c>) null);
        r0.f331129d = null;
        r0.f331130e = null;
        r0.f331133h = 2;
        r10 = a14.C53895h.m60469g(r3, r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e5, code lost:
        if (r10 != r1) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e7, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e8, code lost:
        r10 = (x11.C112017d) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00eb, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ec, code lost:
        if (r10 == null) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f0, code lost:
        if (r10.f329411a == false) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f2, code lost:
        r4 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014c, code lost:
        r10 = (y11.C112360b.C112364d) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x014e, code lost:
        if (r10 == null) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0150, code lost:
        r5 = ((s11.C110708b.C110709a) r9).f331169a;
        r6 = new s11.C110698a.C110703e(r2, r10, (wx3.C15601d<? super s11.C110698a.C110703e>) null);
        r0.f331129d = r9;
        r0.f331130e = null;
        r0.f331133h = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0165, code lost:
        if (r2.mo162252e(r5, r6, r0) != r1) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0167, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0168, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.MTR.GLDispatchMTRTask", "refresh with vb " + ((s11.C110708b.C110709a) r9).f331169a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0186, code lost:
        return new s11.C110714c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0187, code lost:
        r10 = r2.f331124c;
        r5 = (s11.C110708b.C110709a) r9;
        r6 = r5.f331169a;
        r10.getClass();
        gy3.C87412m.m108594g(r6, "username");
        r10 = r10.f336398h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0199, code lost:
        if (r10 == null) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a1, code lost:
        if (gy3.C87412m.m108589b(r10.f336400a, r6) == false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a4, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a5, code lost:
        if (r10 == null) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a7, code lost:
        r5 = r5.f331169a;
        r6 = new s11.C110698a.C110704f(r2, r10, (wx3.C15601d<? super s11.C110698a.C110704f>) null);
        r0.f331129d = r9;
        r0.f331130e = null;
        r0.f331133h = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b9, code lost:
        if (r2.mo162252e(r5, r6, r0) != r1) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01bb, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01bc, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.MTR.GLDispatchMTRTask", "refresh with camTex " + ((s11.C110708b.C110709a) r9).f331169a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01da, code lost:
        return new s11.C110714c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01db, code lost:
        r10 = r5.f331169a;
        r5 = new s11.C110698a.C110705g(r2, r9, (wx3.C15601d<? super s11.C110698a.C110705g>) null);
        r0.f331129d = r9;
        r0.f331130e = null;
        r0.f331133h = 7;
        r10 = r2.mo162252e(r10, r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ed, code lost:
        if (r10 != r1) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01ef, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01f0, code lost:
        r10 = (x11.C112017d) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01f2, code lost:
        if (r10 == null) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01f6, code lost:
        if (r10.f329411a == false) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f8, code lost:
        r4 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01f9, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.MTR.GLDispatchMTRTask", "refresh with tex " + ((s11.C110708b.C110709a) r9).f331169a);
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo161502c(s11.C110708b r9, wx3.C15601d<? super s11.C110714c> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof s11.C110698a.C110699a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            s11.a$a r0 = (s11.C110698a.C110699a) r0
            int r1 = r0.f331133h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f331133h = r1
            goto L_0x0018
        L_0x0013:
            s11.a$a r0 = new s11.a$a
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f331131f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f331133h
            java.lang.String r3 = "MicroMsg.MTR.GLDispatchMTRTask"
            r4 = 0
            switch(r2) {
                case 0: goto L_0x006a;
                case 1: goto L_0x005e;
                case 2: goto L_0x0059;
                case 3: goto L_0x0054;
                case 4: goto L_0x0047;
                case 5: goto L_0x003e;
                case 6: goto L_0x0035;
                case 7: goto L_0x002c;
                case 8: goto L_0x0054;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x002c:
            java.lang.Object r9 = r0.f331129d
            s11.b r9 = (s11.C110708b) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x01f0
        L_0x0035:
            java.lang.Object r9 = r0.f331129d
            s11.b r9 = (s11.C110708b) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x01bc
        L_0x003e:
            java.lang.Object r9 = r0.f331129d
            s11.b r9 = (s11.C110708b) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0168
        L_0x0047:
            java.lang.Object r9 = r0.f331130e
            s11.b r9 = (s11.C110708b) r9
            java.lang.Object r2 = r0.f331129d
            s11.a r2 = (s11.C110698a) r2
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x014c
        L_0x0054:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x021b
        L_0x0059:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00e8
        L_0x005e:
            java.lang.Object r9 = r0.f331130e
            u11.b$a r9 = (u11.C111099b.C111100a) r9
            java.lang.Object r2 = r0.f331129d
            s11.a r2 = (s11.C110698a) r2
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00b0
        L_0x006a:
            kotlin.ResultKt.throwOnFailure(r10)
            boolean r10 = r9 instanceof s11.C110708b.C110713e
            if (r10 == 0) goto L_0x00f8
            u11.b r10 = r8.f331123b
            r2 = r9
            s11.b$e r2 = (s11.C110708b.C110713e) r2
            java.lang.String r3 = r2.f331169a
            monitor-enter(r10)
            java.lang.String r5 = "key"
            gy3.C87412m.m108594g(r3, r5)     // Catch:{ all -> 0x00f5 }
            android.util.ArrayMap<java.lang.String, u11.b$a> r5 = r10.f332688e     // Catch:{ all -> 0x00f5 }
            java.lang.Object r3 = r5.get(r3)     // Catch:{ all -> 0x00f5 }
            u11.b$a r3 = (u11.C111099b.C111100a) r3     // Catch:{ all -> 0x00f5 }
            monitor-exit(r10)
            if (r3 == 0) goto L_0x021b
            int r10 = r2.f331173d
            r5 = -1
            if (r10 == r5) goto L_0x0099
            u11.b$b r10 = r3.mo162848a()
            if (r10 == 0) goto L_0x0099
            int r2 = r2.f331173d
            r10.setScreenOri(r2)
        L_0x0099:
            wx3.f r10 = r8.f331122a
            s11.a$b r2 = new s11.a$b
            r2.<init>(r8, r9, r4)
            r0.f331129d = r8
            r0.f331130e = r3
            r9 = 1
            r0.f331133h = r9
            java.lang.Object r10 = a14.C53895h.m60469g(r10, r2, r0)
            if (r10 != r1) goto L_0x00ae
            return r1
        L_0x00ae:
            r2 = r8
            r9 = r3
        L_0x00b0:
            r3 = r10
            z11.c r3 = (z11.C112568c) r3
            boolean r3 = r3.f329411a
            if (r3 == 0) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            r10 = r4
        L_0x00b9:
            z11.c r10 = (z11.C112568c) r10
            if (r10 == 0) goto L_0x00eb
            wx3.f r3 = r2.f331122a
            t11.b$b r5 = t11.C110892b.f331701e
            java.lang.String r5 = "renderTarget"
            gy3.C87412m.m108594g(r9, r5)
            t11.b r5 = new t11.b
            t11.b$a$c r6 = new t11.b$a$c
            r6.<init>(r9)
            r5.<init>(r6)
            wx3.f r3 = r3.plus(r5)
            s11.a$c r5 = new s11.a$c
            r5.<init>(r9, r2, r10, r4)
            r0.f331129d = r4
            r0.f331130e = r4
            r9 = 2
            r0.f331133h = r9
            java.lang.Object r10 = a14.C53895h.m60469g(r3, r5, r0)
            if (r10 != r1) goto L_0x00e8
            return r1
        L_0x00e8:
            x11.d r10 = (x11.C112017d) r10
            goto L_0x00ec
        L_0x00eb:
            r10 = r4
        L_0x00ec:
            if (r10 == 0) goto L_0x021b
            boolean r9 = r10.f329411a
            if (r9 == 0) goto L_0x021b
            r4 = r10
            goto L_0x021b
        L_0x00f5:
            r9 = move-exception
            monitor-exit(r10)
            throw r9
        L_0x00f8:
            boolean r10 = r9 instanceof s11.C110708b.C110712d
            if (r10 == 0) goto L_0x0131
            y11.b r10 = r8.f331124c
            r2 = r9
            s11.b$d r2 = (s11.C110708b.C110712d) r2
            java.lang.String r3 = r2.f331169a
            r10.getClass()
            java.lang.String r5 = "username"
            gy3.C87412m.m108594g(r3, r5)
            y11.b$a r10 = r10.f336398h
            if (r10 == 0) goto L_0x0119
            java.lang.String r5 = r10.f336400a
            boolean r3 = gy3.C87412m.m108589b(r5, r3)
            if (r3 == 0) goto L_0x0119
            goto L_0x011a
        L_0x0119:
            r10 = r4
        L_0x011a:
            if (r10 == 0) goto L_0x0120
            x11.e r3 = r2.f331170b
            r10.f336402c = r3
        L_0x0120:
            java.lang.String r10 = r2.f331169a
            s11.a$d r2 = new s11.a$d
            r2.<init>(r8, r9, r4)
            r9 = 3
            r0.f331133h = r9
            java.lang.Object r9 = r8.mo162252e(r10, r2, r0)
            if (r9 != r1) goto L_0x021b
            return r1
        L_0x0131:
            boolean r10 = r9 instanceof s11.C110708b.C110709a
            if (r10 == 0) goto L_0x0213
            y11.b r10 = r8.f331124c
            r2 = r9
            s11.b$a r2 = (s11.C110708b.C110709a) r2
            java.lang.String r2 = r2.f331169a
            r5 = 0
            r0.f331129d = r8
            r0.f331130e = r9
            r6 = 4
            r0.f331133h = r6
            java.lang.Object r10 = r10.mo164083b(r2, r5, r0)
            if (r10 != r1) goto L_0x014b
            return r1
        L_0x014b:
            r2 = r8
        L_0x014c:
            y11.b$d r10 = (y11.C112360b.C112364d) r10
            if (r10 == 0) goto L_0x0187
            r5 = r9
            s11.b$a r5 = (s11.C110708b.C110709a) r5
            java.lang.String r5 = r5.f331169a
            s11.a$e r6 = new s11.a$e
            r6.<init>(r2, r10, r4)
            r0.f331129d = r9
            r0.f331130e = r4
            r10 = 5
            r0.f331133h = r10
            java.lang.Object r10 = r2.mo162252e(r5, r6, r0)
            if (r10 != r1) goto L_0x0168
            return r1
        L_0x0168:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "refresh with vb "
            r10.append(r0)
            s11.b$a r9 = (s11.C110708b.C110709a) r9
            java.lang.String r9 = r9.f331169a
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            s11.c r9 = new s11.c
            r9.<init>()
            return r9
        L_0x0187:
            y11.b r10 = r2.f331124c
            r5 = r9
            s11.b$a r5 = (s11.C110708b.C110709a) r5
            java.lang.String r6 = r5.f331169a
            r10.getClass()
            java.lang.String r7 = "username"
            gy3.C87412m.m108594g(r6, r7)
            y11.b$a r10 = r10.f336398h
            if (r10 == 0) goto L_0x01a4
            java.lang.String r7 = r10.f336400a
            boolean r6 = gy3.C87412m.m108589b(r7, r6)
            if (r6 == 0) goto L_0x01a4
            goto L_0x01a5
        L_0x01a4:
            r10 = r4
        L_0x01a5:
            if (r10 == 0) goto L_0x01db
            java.lang.String r5 = r5.f331169a
            s11.a$f r6 = new s11.a$f
            r6.<init>(r2, r10, r4)
            r0.f331129d = r9
            r0.f331130e = r4
            r10 = 6
            r0.f331133h = r10
            java.lang.Object r10 = r2.mo162252e(r5, r6, r0)
            if (r10 != r1) goto L_0x01bc
            return r1
        L_0x01bc:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "refresh with camTex "
            r10.append(r0)
            s11.b$a r9 = (s11.C110708b.C110709a) r9
            java.lang.String r9 = r9.f331169a
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            s11.c r9 = new s11.c
            r9.<init>()
            return r9
        L_0x01db:
            java.lang.String r10 = r5.f331169a
            s11.a$g r5 = new s11.a$g
            r5.<init>(r2, r9, r4)
            r0.f331129d = r9
            r0.f331130e = r4
            r6 = 7
            r0.f331133h = r6
            java.lang.Object r10 = r2.mo162252e(r10, r5, r0)
            if (r10 != r1) goto L_0x01f0
            return r1
        L_0x01f0:
            x11.d r10 = (x11.C112017d) r10
            if (r10 == 0) goto L_0x01f9
            boolean r0 = r10.f329411a
            if (r0 == 0) goto L_0x01f9
            r4 = r10
        L_0x01f9:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "refresh with tex "
            r10.append(r0)
            s11.b$a r9 = (s11.C110708b.C110709a) r9
            java.lang.String r9 = r9.f331169a
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r9)
            goto L_0x021b
        L_0x0213:
            boolean r10 = r9 instanceof s11.C110708b.C110710b
            if (r10 != 0) goto L_0x022b
            boolean r10 = r9 instanceof s11.C110708b.C110711c
            if (r10 != 0) goto L_0x0221
        L_0x021b:
            s11.c r9 = new s11.c
            r9.<init>()
            return r9
        L_0x0221:
            s11.b$c r9 = (s11.C110708b.C110711c) r9
            r9.getClass()
            r9 = 8
            r0.f331133h = r9
            throw r4
        L_0x022b:
            s11.b$b r9 = (s11.C110708b.C110710b) r9
            r9.getClass()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s11.C110698a.mo161502c(s11.b, wx3.d):java.lang.Object");
    }

    /* renamed from: e */
    public final <T> Object mo162252e(String str, C32227p<? super C111099b.C111100a, ? super C15601d<? super T>, ? extends Object> pVar, C15601d<? super T> dVar) {
        C111099b.C111100a aVar;
        C111099b bVar = this.f331123b;
        synchronized (bVar) {
            C87412m.m108594g(str, "key");
            aVar = bVar.f332688e.get(str);
        }
        if (aVar == null) {
            return null;
        }
        C66212f fVar = this.f331122a;
        C110892b.C110898b bVar2 = C110892b.f331701e;
        return C53895h.m60469g(fVar.plus(new C110892b(new C110892b.C110893a.C110896c(aVar))), new C63691j(pVar, aVar, (C15601d<? super C63691j>) null), dVar);
    }
}
