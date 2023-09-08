package cj1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ig1.C8916d;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.ResultKt;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import rx3.C13598b0;
import te3.C51765w03;
import te3.C51905x03;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.model.FinderLiveGiftLoader$syncGiftResourceFromMsg$2", mo125469f = "FinderLiveGiftLoader.kt", mo125470l = {688}, mo125471m = "invokeSuspend")
/* renamed from: cj1.a2 */
public final class C0508a2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f1233d;

    /* renamed from: e */
    public Object f1234e;

    /* renamed from: f */
    public int f1235f;

    /* renamed from: g */
    public /* synthetic */ Object f1236g;

    /* renamed from: h */
    public final /* synthetic */ C8916d f1237h;

    /* renamed from: i */
    public final /* synthetic */ String f1238i;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.model.FinderLiveGiftLoader$syncGiftResourceFromMsg$2$1", mo125469f = "FinderLiveGiftLoader.kt", mo125470l = {658}, mo125471m = "invokeSuspend")
    /* renamed from: cj1.a2$a */
    public static final class C0509a extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public int f1239d;

        /* renamed from: e */
        public final /* synthetic */ C8916d f1240e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0509a(C8916d dVar, C15601d<? super C0509a> dVar2) {
            super(2, dVar2);
            this.f1240e = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C0509a(this.f1240e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0509a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f1239d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f1240e.field_previewPagUrl;
                C87412m.m108593f(str, "giftInfo.field_previewPagUrl");
                this.f1239d = 1;
                obj = C0508a2.m438f(str, (C32226l<? super PAGFile, C13598b0>) null, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Boolean.valueOf(((Boolean) obj).booleanValue());
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.model.FinderLiveGiftLoader$syncGiftResourceFromMsg$2$2", mo125469f = "FinderLiveGiftLoader.kt", mo125470l = {662}, mo125471m = "invokeSuspend")
    /* renamed from: cj1.a2$b */
    public static final class C0510b extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public int f1241d;

        /* renamed from: e */
        public final /* synthetic */ C8916d f1242e;

        /* renamed from: f */
        public final /* synthetic */ String f1243f;

        /* renamed from: cj1.a2$b$a */
        public static final class C0511a extends C87413o implements C32226l<PAGFile, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ String f1244d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0511a(String str) {
                super(1);
                this.f1244d = str;
            }

            public Object invoke(Object obj) {
                PAGFile pAGFile = (PAGFile) obj;
                C87412m.m108594g(pAGFile, "pagFile");
                HashMap<String, Long> hashMap = C0639y1.f1521l;
                Long l = hashMap.get(this.f1244d);
                if (l == null) {
                    l = 0L;
                }
                if (0 == l.longValue()) {
                    PAGView pAGView = new PAGView(MMApplicationContext.getContext());
                    pAGView.setComposition(pAGFile);
                    hashMap.put(this.f1244d, Long.valueOf(pAGView.duration()));
                    Log.m105924i("Finder.FinderLiveGiftLoader", "[syncPagFromLiveMsg] giftFullPagDurationMap: giftId = " + this.f1244d + ", duration = " + hashMap.get(this.f1244d));
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0510b(C8916d dVar, String str, C15601d<? super C0510b> dVar2) {
            super(2, dVar2);
            this.f1242e = dVar;
            this.f1243f = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C0510b(this.f1242e, this.f1243f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0510b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f1241d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f1242e.field_animationPagUrl;
                C87412m.m108593f(str, "giftInfo.field_animationPagUrl");
                C0511a aVar2 = new C0511a(this.f1243f);
                this.f1241d = 1;
                obj = C0508a2.m438f(str, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Boolean.valueOf(((Boolean) obj).booleanValue());
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.model.FinderLiveGiftLoader$syncGiftResourceFromMsg$2$3", mo125469f = "FinderLiveGiftLoader.kt", mo125470l = {673}, mo125471m = "invokeSuspend")
    /* renamed from: cj1.a2$c */
    public static final class C0512c extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public int f1245d;

        /* renamed from: e */
        public final /* synthetic */ C8916d f1246e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0512c(C8916d dVar, C15601d<? super C0512c> dVar2) {
            super(2, dVar2);
            this.f1246e = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C0512c(this.f1246e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0512c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f1245d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f1246e.field_landscapePagUrl;
                C87412m.m108593f(str, "giftInfo.field_landscapePagUrl");
                this.f1245d = 1;
                obj = C0508a2.m438f(str, (C32226l<? super PAGFile, C13598b0>) null, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Boolean.valueOf(((Boolean) obj).booleanValue());
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.model.FinderLiveGiftLoader$syncGiftResourceFromMsg$2$4", mo125469f = "FinderLiveGiftLoader.kt", mo125470l = {679}, mo125471m = "invokeSuspend")
    /* renamed from: cj1.a2$d */
    public static final class C0513d extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public int f1247d;

        /* renamed from: e */
        public final /* synthetic */ C8916d f1248e;

        /* renamed from: f */
        public final /* synthetic */ String f1249f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0513d(C8916d dVar, String str, C15601d<? super C0513d> dVar2) {
            super(2, dVar2);
            this.f1248e = dVar;
            this.f1249f = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C0513d(this.f1248e, this.f1249f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0513d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f1247d;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C51905x03 x032 = this.f1248e.field_multiAnimationList;
                LinkedList<C51765w03> linkedList = x032 != null ? x032.f144381d : null;
                if (linkedList != null) {
                    if ((linkedList.isEmpty() ? linkedList : null) != null) {
                        String str = this.f1249f;
                        C8916d dVar = this.f1248e;
                        C0639y1 y1Var = C0639y1.f1510a;
                        this.f1247d = 1;
                        obj = C53895h.m60469g(C53872d1.f151119c, new C0519b2(linkedList, str, dVar, (C15601d<? super C0519b2>) null), this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                }
                return Boolean.valueOf(z);
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = ((Boolean) obj).booleanValue();
            return Boolean.valueOf(z);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.model.FinderLiveGiftLoader$syncGiftResourceFromMsg$2", mo125469f = "FinderLiveGiftLoader.kt", mo125470l = {649}, mo125471m = "invokeSuspend$download")
    /* renamed from: cj1.a2$e */
    public static final class C0514e extends C66704d {

        /* renamed from: d */
        public Object f1250d;

        /* renamed from: e */
        public /* synthetic */ Object f1251e;

        /* renamed from: f */
        public int f1252f;

        public C0514e(C15601d<? super C0514e> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f1251e = obj;
            this.f1252f |= Integer.MIN_VALUE;
            return C0508a2.m438f((String) null, (C32226l<? super PAGFile, C13598b0>) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0508a2(C8916d dVar, String str, C15601d<? super C0508a2> dVar2) {
        super(2, dVar2);
        this.f1237h = dVar;
        this.f1238i = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: fy3.l<? super org.libpag.PAGFile, rx3.b0>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m438f(java.lang.String r9, fy3.C32226l<? super org.libpag.PAGFile, rx3.C13598b0> r10, wx3.C15601d<? super java.lang.Boolean> r11) {
        /*
            boolean r0 = r11 instanceof cj1.C0508a2.C0514e
            if (r0 == 0) goto L_0x0013
            r0 = r11
            cj1.a2$e r0 = (cj1.C0508a2.C0514e) r0
            int r1 = r0.f1252f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f1252f = r1
            goto L_0x0018
        L_0x0013:
            cj1.a2$e r0 = new cj1.a2$e
            r0.<init>(r11)
        L_0x0018:
            r4 = r0
            java.lang.Object r11 = r4.f1251e
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r4.f1252f
            r7 = 0
            r8 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r8) goto L_0x002e
            java.lang.Object r9 = r4.f1250d
            r10 = r9
            fy3.l r10 = (fy3.C32226l) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0078
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r11)
            cj1.y1 r11 = cj1.C0639y1.f1510a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "syncGiftResourceFromMsg download "
            r11.append(r1)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            java.lang.String r1 = "Finder.FinderLiveGiftLoader"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r11)
            if (r9 == 0) goto L_0x005d
            int r11 = r9.length()
            if (r11 != 0) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            r11 = 0
            goto L_0x005e
        L_0x005d:
            r11 = 1
        L_0x005e:
            if (r11 == 0) goto L_0x0063
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L_0x0063:
            ql1.a r11 = ql1.C12874a.f36849a
            yf.c r1 = r11.mo12389a()
            r3 = 0
            r5 = 2
            r6 = 0
            r4.f1250d = r10
            r4.f1252f = r8
            r2 = r9
            java.lang.Object r11 = p277yf.C15996c.C15997a.m14901a(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto L_0x0078
            return r0
        L_0x0078:
            org.libpag.PAGFile r11 = (org.libpag.PAGFile) r11
            if (r11 == 0) goto L_0x0081
            if (r10 == 0) goto L_0x0081
            r10.invoke(r11)
        L_0x0081:
            if (r11 == 0) goto L_0x0084
            r7 = 1
        L_0x0084:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C0508a2.m438f(java.lang.String, fy3.l, wx3.d):java.lang.Object");
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C0508a2 a2Var = new C0508a2(this.f1237h, this.f1238i, dVar);
        a2Var.f1236g = obj;
        return a2Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C0508a2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r13.f1235f
            java.lang.String r2 = "Finder.FinderLiveGiftLoader"
            r3 = 1
            if (r1 == 0) goto L_0x0029
            if (r1 != r3) goto L_0x0021
            java.lang.Object r1 = r13.f1234e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r4 = r13.f1233d
            java.lang.StringBuilder r4 = (java.lang.StringBuilder) r4
            java.lang.Object r5 = r13.f1236g
            java.util.Iterator r5 = (java.util.Iterator) r5
            kotlin.ResultKt.throwOnFailure(r14)
            r6 = r5
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r13
            goto L_0x00c3
        L_0x0021:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0029:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Object r14 = r13.f1236g
            a14.n0 r14 = (a14.C0000n0) r14
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            a14.h0 r10 = a14.C53872d1.f151119c
            r6 = 0
            cj1.a2$a r7 = new cj1.a2$a
            ig1.d r4 = r13.f1237h
            r11 = 0
            r7.<init>(r4, r11)
            r8 = 2
            r9 = 0
            r4 = r14
            r5 = r10
            a14.u0 r4 = a14.C53895h.m60464b(r4, r5, r6, r7, r8, r9)
            r1.add(r4)
            r6 = 0
            cj1.a2$b r7 = new cj1.a2$b
            ig1.d r4 = r13.f1237h
            java.lang.String r5 = r13.f1238i
            r7.<init>(r4, r5, r11)
            r8 = 2
            r9 = 0
            r4 = r14
            r5 = r10
            a14.u0 r4 = a14.C53895h.m60464b(r4, r5, r6, r7, r8, r9)
            r1.add(r4)
            r6 = 0
            cj1.a2$c r7 = new cj1.a2$c
            ig1.d r4 = r13.f1237h
            r7.<init>(r4, r11)
            r8 = 2
            r9 = 0
            r4 = r14
            r5 = r10
            a14.u0 r4 = a14.C53895h.m60464b(r4, r5, r6, r7, r8, r9)
            r1.add(r4)
            r6 = 0
            cj1.a2$d r7 = new cj1.a2$d
            ig1.d r4 = r13.f1237h
            java.lang.String r5 = r13.f1238i
            r7.<init>(r4, r5, r11)
            r8 = 2
            r9 = 0
            r4 = r14
            r5 = r10
            a14.u0 r14 = a14.C53895h.m60464b(r4, r5, r6, r7, r8, r9)
            r1.add(r14)
            int r14 = r1.size()
            if (r14 <= 0) goto L_0x0111
            java.util.Iterator r14 = r1.iterator()
            r5 = r14
            r14 = r13
        L_0x0094:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x00d7
            java.lang.Object r1 = r5.next()
            a14.u0 r1 = (a14.C53953u0) r1
            cj1.y1 r4 = cj1.C0639y1.f1510a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "syncGiftResourceFromMsg await "
            r4.append(r6)
            r14.f1236g = r5
            r14.f1233d = r4
            r14.f1234e = r2
            r14.f1235f = r3
            java.lang.Object r1 = r1.mo74634A(r14)
            if (r1 != r0) goto L_0x00bc
            return r0
        L_0x00bc:
            r6 = r5
            r5 = r4
            r4 = r2
            r12 = r0
            r0 = r14
            r14 = r1
            r1 = r12
        L_0x00c3:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            r5.append(r14)
            java.lang.String r14 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r14)
            r14 = r0
            r0 = r1
            r5 = r6
            goto L_0x0094
        L_0x00d7:
            cj1.y1 r0 = cj1.C0639y1.f1510a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "syncGiftResourceFromMsg download finish, update giftInfo:"
            r0.append(r1)
            ig1.d r1 = r14.f1237h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            cj1.y1 r0 = cj1.C0639y1.f1510a
            java.util.Map<java.lang.String, ig1.d> r0 = cj1.C0639y1.f1513d
            java.lang.String r1 = "giftCache"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.String r1 = r14.f1238i
            ig1.d r2 = r14.f1237h
            r0.put(r1, r2)
            java.lang.Class<hr.t> r0 = p165hr.C60106t.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            hr.t r0 = (p165hr.C60106t) r0
            ik1.e r0 = r0.zx0()
            ig1.d r14 = r14.f1237h
            r0.mo9741qq(r14)
        L_0x0111:
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C0508a2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
