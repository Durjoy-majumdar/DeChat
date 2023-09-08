package p1105d5;

import a14.C0000n0;
import a14.C0002w;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53896h0;
import a14.C53901i0;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import d24.C106982e;
import d24.C20421s;
import f14.C58901s;
import fy3.C32227p;
import gy3.C87412m;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import p1105d5.C106989b;
import p1105d5.C106991c;
import p1106e5.C107228a;
import p1126j5.C108570a;
import p1126j5.C108571b;
import p1126j5.C108572c;
import p1126j5.C108573d;
import p1126j5.C108577h;
import p1126j5.C108580j;
import p1126j5.C108581k;
import p1126j5.C108582l;
import p1128k5.C108891a;
import p1128k5.C108894b;
import p1132m5.C109501a;
import p1132m5.C109514l;
import p1132m5.C109518n;
import p1132m5.C109526q;
import p1132m5.C109529t;
import p1144q5.C110366b;
import p1144q5.C110367c;
import p593l5.C109268a;
import p593l5.C34178c;
import p593l5.C34179e;
import p593l5.C46832d;
import p632o5.C109949a;
import p632o5.C109951c;
import p632o5.C109953e;
import p632o5.C109954f;
import p632o5.C109956h;
import p632o5.C109959i;
import p632o5.C109964n;
import p864t5.C110905d;
import p864t5.C110908h;
import p864t5.C110909i;
import p864t5.C64203g;
import p972h5.C108134a;
import p972h5.C108140f;
import rx3.C13598b0;
import sx3.C110818d0;
import wx3.C15601d;
import wx3.C66206a;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: d5.h */
public final class C106997h implements C106994f {

    /* renamed from: a */
    public final Context f320271a;

    /* renamed from: b */
    public final C109951c f320272b;

    /* renamed from: c */
    public final C107228a f320273c;

    /* renamed from: d */
    public final C109518n f320274d;

    /* renamed from: e */
    public final C106982e.C106983a f320275e;

    /* renamed from: f */
    public final C106991c.C106993b f320276f;

    /* renamed from: g */
    public final C64203g f320277g;

    /* renamed from: h */
    public final C0000n0 f320278h;

    /* renamed from: i */
    public final C109501a f320279i;

    /* renamed from: j */
    public final C109514l f320280j;

    /* renamed from: k */
    public final C109526q f320281k;

    /* renamed from: l */
    public final List<C108894b> f320282l;

    /* renamed from: m */
    public final AtomicBoolean f320283m = new AtomicBoolean(false);

    @C91590f(mo125468c = "coil.RealImageLoader$enqueue$job$1", mo125469f = "RealImageLoader.kt", mo125470l = {113}, mo125471m = "invokeSuspend")
    /* renamed from: d5.h$a */
    public static final class C106998a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f320284d;

        /* renamed from: e */
        public final /* synthetic */ C106997h f320285e;

        /* renamed from: f */
        public final /* synthetic */ C109956h f320286f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106998a(C106997h hVar, C109956h hVar2, C15601d<? super C106998a> dVar) {
            super(2, dVar);
            this.f320285e = hVar;
            this.f320286f = hVar2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C106998a(this.f320285e, this.f320286f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C106998a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f320284d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C106997h hVar = this.f320285e;
                C109956h hVar2 = this.f320286f;
                this.f320284d = 1;
                obj = C106997h.m144801d(hVar, hVar2, 0, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C109959i iVar = (C109959i) obj;
            if (!(iVar instanceof C109954f)) {
                return C13598b0.f38549a;
            }
            throw ((C109954f) iVar).f328981c;
        }
    }

    @C91590f(mo125468c = "coil.RealImageLoader$execute$2", mo125469f = "RealImageLoader.kt", mo125470l = {134}, mo125471m = "invokeSuspend")
    /* renamed from: d5.h$b */
    public static final class C106999b extends C91594j implements C32227p<C0000n0, C15601d<? super C109959i>, Object> {

        /* renamed from: d */
        public int f320287d;

        /* renamed from: e */
        public final /* synthetic */ C106997h f320288e;

        /* renamed from: f */
        public final /* synthetic */ C109956h f320289f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106999b(C106997h hVar, C109956h hVar2, C15601d<? super C106999b> dVar) {
            super(2, dVar);
            this.f320288e = hVar;
            this.f320289f = hVar2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C106999b(this.f320288e, this.f320289f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C106999b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f320287d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C106997h hVar = this.f320288e;
                C109956h hVar2 = this.f320289f;
                this.f320287d = 1;
                obj = C106997h.m144801d(hVar, hVar2, 1, this);
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

    /* renamed from: d5.h$c */
    public static final class C107000c extends C66206a implements C53901i0 {

        /* renamed from: d */
        public final /* synthetic */ C106997h f320290d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107000c(C53901i0.C39480a aVar, C106997h hVar) {
            super(aVar);
            this.f320290d = hVar;
        }

        public void handleException(C66212f fVar, Throwable th) {
            this.f320290d.getClass();
        }
    }

    public C106997h(Context context, C109951c cVar, C107228a aVar, C109518n nVar, C106982e.C106983a aVar2, C106991c.C106993b bVar, C106989b bVar2, C64203g gVar, C110908h hVar) {
        Context context2 = context;
        C109951c cVar2 = cVar;
        C107228a aVar3 = aVar;
        C109518n nVar2 = nVar;
        C106982e.C106983a aVar4 = aVar2;
        C106991c.C106993b bVar3 = bVar;
        C106989b bVar4 = bVar2;
        C64203g gVar2 = gVar;
        C110908h hVar2 = hVar;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(cVar2, "defaults");
        C87412m.m108594g(aVar3, "bitmapPool");
        C87412m.m108594g(nVar2, "memoryCache");
        C87412m.m108594g(aVar4, "callFactory");
        C87412m.m108594g(bVar3, "eventListenerFactory");
        C87412m.m108594g(bVar4, "componentRegistry");
        C87412m.m108594g(gVar2, "options");
        this.f320271a = context2;
        this.f320272b = cVar2;
        this.f320273c = aVar3;
        this.f320274d = nVar2;
        this.f320275e = aVar4;
        this.f320276f = bVar3;
        this.f320277g = gVar2;
        C0002w a = C53959v2.m60598a((C53973z1) null, 1, (Object) null);
        C53896h0 h0Var = C53872d1.f151117a;
        this.f320278h = C53930o0.m60554a(((C53884f2) a).plus(C58901s.f168555a.mo74590i0()).plus(new C107000c(C53901i0.C39480a.f106019d, this)));
        this.f320279i = new C109501a(this, nVar2.f327788c, hVar2);
        C109514l lVar = new C109514l(nVar2.f327788c, nVar2.f327786a, nVar2.f327787b);
        this.f320280j = lVar;
        C109526q qVar = new C109526q(hVar2);
        this.f320281k = qVar;
        C108140f fVar = new C108140f(aVar3);
        C110909i iVar = new C110909i(this, context2, gVar2.f181931c);
        C106989b.C106990a aVar5 = new C106989b.C106990a(bVar4);
        aVar5.mo157425b(new C34179e(), String.class);
        aVar5.mo157425b(new C109268a(), Uri.class);
        aVar5.mo157425b(new C46832d(context2), Uri.class);
        aVar5.mo157425b(new C34178c(context2), Integer.class);
        aVar5.mo157424a(new C108580j(aVar4), Uri.class);
        aVar5.mo157424a(new C108581k(aVar4), C20421s.class);
        aVar5.mo157424a(new C108577h(gVar2.f181929a), File.class);
        aVar5.mo157424a(new C108570a(context2), Uri.class);
        aVar5.mo157424a(new C108572c(context2), Uri.class);
        aVar5.mo157424a(new C108582l(context2, fVar), Uri.class);
        aVar5.mo157424a(new C108573d(fVar), Drawable.class);
        aVar5.mo157424a(new C108571b(), Bitmap.class);
        ((ArrayList) aVar5.f320259d).add(new C108134a(context2));
        C106989b c = aVar5.mo157426c();
        this.f320282l = C110818d0.m150934f0(c.f320252a, new C108891a(c, aVar3, nVar2.f327788c, nVar2.f327786a, lVar, qVar, iVar, fVar, hVar2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: xx3.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: coil.memory.BaseRequestDelegate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: coil.memory.RequestDelegate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v70, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: m5.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v71, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: d5.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v72, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: o5.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v73, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: d5.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: xx3.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: xx3.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: xx3.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: xx3.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: xx3.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: xx3.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: xx3.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: o5.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: o5.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: coil.memory.BaseRequestDelegate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: coil.memory.BaseRequestDelegate} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: coil.memory.BaseRequestDelegate} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x029e, code lost:
        r9.mo157702b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02a1, code lost:
        r7.mo157431e(r8);
        r9 = r8.f329005n;
        r4.f320294d = r1;
        r4.f320295e = r8;
        r4.f320296f = r7;
        r4.f320297g = r6;
        r4.f320298h = r2;
        r4.f320299i = r3;
        r4.f320304q = r0;
        r4.f320307t = 2;
        r9 = r9.mo60229a(r4);
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02bb, code lost:
        if (r9 != r5) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02bf, code lost:
        r12 = r0;
        r17 = r3;
        r3 = r9;
        r9 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        r0 = (coil.size.Size) r3;
        r7.mo157437k(r8, r0);
        r10 = new p1128k5.C108896c(r8, r12, r9.f320282l, 0, r8, r0, r17, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02dd, code lost:
        if (r9.f320277g.f181930b == false) goto L_0x02f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02df, code lost:
        r4.f320294d = r9;
        r4.f320295e = r8;
        r4.f320296f = r7;
        r4.f320297g = r6;
        r4.f320298h = r2;
        r4.f320299i = null;
        r4.f320307t = 3;
        r0 = r10.mo160028c(r8, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02f3, code lost:
        if (r0 != r5) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02f5, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02f7, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02f9, code lost:
        r0 = r8.f329007p;
        r3 = new p1105d5.C107001i(r10, r8, (wx3.C15601d<? super p1105d5.C107001i>) null);
        r4.f320294d = r9;
        r4.f320295e = r8;
        r4.f320296f = r7;
        r4.f320297g = r6;
        r4.f320298h = r2;
        r4.f320299i = null;
        r4.f320307t = 4;
        r0 = a14.C53895h.m60469g(r0, r3, r4);
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0315, code lost:
        if (r0 != r5) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0319, code lost:
        r10 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
        r2 = (p632o5.C109959i) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0323, code lost:
        if ((r2 instanceof p632o5.C109963m) == false) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0325, code lost:
        r1 = (p632o5.C109963m) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:?, code lost:
        r0 = r1.f329060b;
        r3 = r1.f329061c;
        r11 = r3.f329056c;
        r10.getClass();
        p864t5.C110905d.m151208d(r7, r3);
        r4.f320294d = r10;
        r4.f320295e = r9;
        r4.f320296f = r8;
        r4.f320297g = r7;
        r4.f320298h = r6;
        r4.f320299i = r2;
        r4.f320300j = r10;
        r4.f320301n = r1;
        r4.f320302o = r0;
        r4.f320303p = r3;
        r4.f320307t = 5;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x034f, code lost:
        if (r7.mo160739e(r1, r4) != r5) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0353, code lost:
        r11 = r9;
        r12 = r10;
        r9 = r7;
        r7 = r2;
        r10 = r8;
        r2 = r1;
        r8 = r6;
        r6 = r12;
        r1 = r0;
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r10.mo157428b(r1, r0);
        r3 = r1.f328995d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0362, code lost:
        if (r3 != null) goto L_0x0365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0365, code lost:
        r3.mo157428b(r1, r0);
        r0 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r0 = r6.f320274d.f327788c;
        r1 = r2.f329059a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0370, code lost:
        if (r1 == null) goto L_0x0382;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0374, code lost:
        if ((r1 instanceof android.graphics.drawable.BitmapDrawable) == false) goto L_0x0382;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0376, code lost:
        r1 = ((android.graphics.drawable.BitmapDrawable) r1).getBitmap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x037c, code lost:
        if (r1 != null) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x037f, code lost:
        r0.mo157702b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0382, code lost:
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0385, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0386, code lost:
        r2 = r8;
        r8 = r9;
        r7 = r10;
        r3 = r11;
        r1 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0397, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0398, code lost:
        r3 = r9;
        r12 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        r2 = r10.f320274d.f327788c;
        r1 = r1.f329059a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03a6, code lost:
        r1 = ((android.graphics.drawable.BitmapDrawable) r1).getBitmap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03ac, code lost:
        if (r1 == null) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03af, code lost:
        r2.mo157702b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03b2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03b3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03b4, code lost:
        r2 = r6;
        r1 = r12;
        r19 = r8;
        r8 = r7;
        r7 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03c5, code lost:
        if ((r2 instanceof p632o5.C109954f) == false) goto L_0x03ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03c7, code lost:
        r1 = (p632o5.C109954f) r2;
        r0 = r1.f328980b;
        r10.getClass();
        p864t5.C110905d.m151208d(r7, (p632o5.C109959i.C109960a) null);
        r4.f320294d = r10;
        r4.f320295e = r9;
        r4.f320296f = r8;
        r4.f320297g = r7;
        r4.f320298h = r6;
        r4.f320299i = r2;
        r4.f320300j = r1;
        r4.f320301n = r0;
        r4.f320307t = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03ea, code lost:
        if (r7.mo160740b(r1, r4) != r5) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03ec, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03ee, code lost:
        r8.mo157427a(r0, r1.f328981c);
        r3 = r0.f328995d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03f5, code lost:
        if (r3 != null) goto L_0x03f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03f8, code lost:
        r3.mo157427a(r0, r1.f328981c);
        r0 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03ff, code lost:
        r5 = r2;
        r8 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0401, code lost:
        r8.mo146073a();
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0409, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x040a, code lost:
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x040c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        r9 = r1.f320274d.f327788c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0411, code lost:
        if (r3 != null) goto L_0x0413;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0413, code lost:
        r9.mo157702b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0416, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0417, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0248, code lost:
        if (coil.util.Lifecycles.m62167a(r0, r4) == r5) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r3 = r1.f320280j.mo160743a(r8.f328997f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0259, code lost:
        if (r3 != null) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x025b, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x025d, code lost:
        r3 = r3.getBitmap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        p864t5.C110905d.m151208d(r6, (p632o5.C109959i.C109960a) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0265, code lost:
        if (r3 != null) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0267, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0269, code lost:
        r9 = r8.f328992a.getResources();
        gy3.C87412m.m108593f(r9, "context.resources");
        r9 = new android.graphics.drawable.BitmapDrawable(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x027a, code lost:
        if (r9 != null) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x027c, code lost:
        r9 = p864t5.C110906e.m151212c(r8, r8.f328985B, r8.f328984A, r8.f328991H.f328961g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0288, code lost:
        r6.mo160742d(r9, r3);
        r7.mo157430d(r8);
        r9 = r8.f328995d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0290, code lost:
        if (r9 != null) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0293, code lost:
        r9.mo157430d(r8);
        r9 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        r9 = r1.f320274d.f327788c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x029c, code lost:
        if (r3 == null) goto L_0x02a1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x041b A[SYNTHETIC, Splitter:B:181:0x041b] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0428 A[Catch:{ all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0437 A[Catch:{ all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0225 A[Catch:{ all -> 0x0421 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m144801d(p1105d5.C106997h r20, p632o5.C109956h r21, int r22, wx3.C15601d r23) {
        /*
            r1 = r20
            r0 = r21
            r2 = r22
            r3 = r23
            r20.getClass()
            boolean r4 = r3 instanceof p1105d5.C107002j
            if (r4 == 0) goto L_0x001e
            r4 = r3
            d5.j r4 = (p1105d5.C107002j) r4
            int r5 = r4.f320307t
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001e
            int r5 = r5 - r6
            r4.f320307t = r5
            goto L_0x0023
        L_0x001e:
            d5.j r4 = new d5.j
            r4.<init>(r1, r3)
        L_0x0023:
            java.lang.Object r3 = r4.f320305r
            xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
            int r6 = r4.f320307t
            r7 = 1
            switch(r6) {
                case 0: goto L_0x011c;
                case 1: goto L_0x00ee;
                case 2: goto L_0x00c9;
                case 3: goto L_0x00a6;
                case 4: goto L_0x00a6;
                case 5: goto L_0x0076;
                case 6: goto L_0x004e;
                case 7: goto L_0x0035;
                default: goto L_0x002d;
            }
        L_0x002d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0035:
            java.lang.Object r0 = r4.f320297g
            o5.h r0 = (p632o5.C109956h) r0
            java.lang.Object r1 = r4.f320296f
            o5.f r1 = (p632o5.C109954f) r1
            java.lang.Object r2 = r4.f320295e
            coil.memory.RequestDelegate r2 = (coil.memory.RequestDelegate) r2
            java.lang.Object r4 = r4.f320294d
            d5.c r4 = (p1105d5.C106991c) r4
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ all -> 0x004b }
            r5 = r1
            goto L_0x0468
        L_0x004b:
            r0 = move-exception
            goto L_0x047d
        L_0x004e:
            java.lang.Object r0 = r4.f320301n
            o5.h r0 = (p632o5.C109956h) r0
            java.lang.Object r1 = r4.f320300j
            o5.f r1 = (p632o5.C109954f) r1
            java.lang.Object r2 = r4.f320299i
            o5.i r2 = (p632o5.C109959i) r2
            java.lang.Object r6 = r4.f320298h
            coil.memory.RequestDelegate r6 = (coil.memory.RequestDelegate) r6
            java.lang.Object r7 = r4.f320297g
            m5.s r7 = (p1132m5.C109528s) r7
            java.lang.Object r8 = r4.f320296f
            d5.c r8 = (p1105d5.C106991c) r8
            java.lang.Object r9 = r4.f320295e
            o5.h r9 = (p632o5.C109956h) r9
            java.lang.Object r10 = r4.f320294d
            d5.h r10 = (p1105d5.C106997h) r10
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ all -> 0x0073 }
            goto L_0x03ee
        L_0x0073:
            r0 = move-exception
            goto L_0x03bd
        L_0x0076:
            java.lang.Object r0 = r4.f320303p
            o5.i$a r0 = (p632o5.C109959i.C109960a) r0
            java.lang.Object r1 = r4.f320302o
            o5.h r1 = (p632o5.C109956h) r1
            java.lang.Object r2 = r4.f320301n
            o5.m r2 = (p632o5.C109963m) r2
            java.lang.Object r6 = r4.f320300j
            d5.h r6 = (p1105d5.C106997h) r6
            java.lang.Object r7 = r4.f320299i
            o5.i r7 = (p632o5.C109959i) r7
            java.lang.Object r8 = r4.f320298h
            coil.memory.RequestDelegate r8 = (coil.memory.RequestDelegate) r8
            java.lang.Object r9 = r4.f320297g
            m5.s r9 = (p1132m5.C109528s) r9
            java.lang.Object r10 = r4.f320296f
            d5.c r10 = (p1105d5.C106991c) r10
            java.lang.Object r11 = r4.f320295e
            o5.h r11 = (p632o5.C109956h) r11
            java.lang.Object r12 = r4.f320294d
            d5.h r12 = (p1105d5.C106997h) r12
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ all -> 0x00a3 }
            goto L_0x035d
        L_0x00a3:
            r0 = move-exception
            goto L_0x038d
        L_0x00a6:
            java.lang.Object r0 = r4.f320298h
            r1 = r0
            coil.memory.RequestDelegate r1 = (coil.memory.RequestDelegate) r1
            java.lang.Object r0 = r4.f320297g
            r2 = r0
            m5.s r2 = (p1132m5.C109528s) r2
            java.lang.Object r0 = r4.f320296f
            r6 = r0
            d5.c r6 = (p1105d5.C106991c) r6
            java.lang.Object r0 = r4.f320295e
            r7 = r0
            o5.h r7 = (p632o5.C109956h) r7
            java.lang.Object r0 = r4.f320294d
            r8 = r0
            d5.h r8 = (p1105d5.C106997h) r8
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ all -> 0x0111 }
            r9 = r7
            r10 = r8
            r7 = r2
            r8 = r6
            r6 = r1
            goto L_0x031e
        L_0x00c9:
            int r0 = r4.f320304q
            java.lang.Object r1 = r4.f320299i
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            java.lang.Object r2 = r4.f320298h
            coil.memory.RequestDelegate r2 = (coil.memory.RequestDelegate) r2
            java.lang.Object r6 = r4.f320297g
            m5.s r6 = (p1132m5.C109528s) r6
            java.lang.Object r7 = r4.f320296f
            d5.c r7 = (p1105d5.C106991c) r7
            java.lang.Object r8 = r4.f320295e
            o5.h r8 = (p632o5.C109956h) r8
            java.lang.Object r9 = r4.f320294d
            d5.h r9 = (p1105d5.C106997h) r9
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ all -> 0x00eb }
            r12 = r0
            r17 = r1
            goto L_0x02c4
        L_0x00eb:
            r0 = move-exception
            goto L_0x0406
        L_0x00ee:
            int r0 = r4.f320304q
            java.lang.Object r1 = r4.f320298h
            coil.memory.RequestDelegate r1 = (coil.memory.RequestDelegate) r1
            java.lang.Object r2 = r4.f320297g
            m5.s r2 = (p1132m5.C109528s) r2
            java.lang.Object r6 = r4.f320296f
            d5.c r6 = (p1105d5.C106991c) r6
            java.lang.Object r7 = r4.f320295e
            o5.h r7 = (p632o5.C109956h) r7
            java.lang.Object r8 = r4.f320294d
            d5.h r8 = (p1105d5.C106997h) r8
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ all -> 0x0111 }
            r19 = r2
            r2 = r1
            r1 = r8
            r8 = r7
            r7 = r6
            r6 = r19
            goto L_0x0251
        L_0x0111:
            r0 = move-exception
            r19 = r2
            r2 = r1
            r1 = r8
            r8 = r7
            r7 = r6
            r6 = r19
            goto L_0x0418
        L_0x011c:
            kotlin.ResultKt.throwOnFailure(r3)
            java.util.concurrent.atomic.AtomicBoolean r3 = r1.f320283m
            boolean r3 = r3.get()
            r3 = r3 ^ r7
            if (r3 == 0) goto L_0x0481
            android.content.Context r3 = r0.f328992a
            r21.getClass()
            java.lang.String r6 = "context"
            gy3.C87412m.m108594g(r3, r6)
            o5.h$a r6 = new o5.h$a
            r6.<init>(r0, r3)
            o5.c r0 = r1.f320272b
            java.lang.String r3 = "defaults"
            gy3.C87412m.m108594g(r0, r3)
            r6.f329029b = r0
            r0 = 0
            r6.f329027J = r0
            o5.h r3 = r6.mo161284a()
            d5.c$b r0 = r1.f320276f
            d5.d$$a r0 = (p1105d5.d$$a) r0
            d5.c r6 = r0.f320262b
            java.lang.String r0 = "$listener"
            gy3.C87412m.m108594g(r6, r0)
            m5.a r0 = r1.f320279i
            q5.b r8 = r3.f328994c
            r0.getClass()
            if (r2 == 0) goto L_0x017f
            if (r2 != r7) goto L_0x0173
            if (r8 != 0) goto L_0x0167
            m5.i r8 = new m5.i
            e5.c r0 = r0.f327742b
            r8.<init>(r0)
            goto L_0x01a2
        L_0x0167:
            m5.j r9 = new m5.j
            e5.c r10 = r0.f327742b
            r11 = 0
            r0.getClass()
            r9.<init>(r8, r10, r6, r11)
            goto L_0x01a1
        L_0x0173:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Invalid type."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x017f:
            if (r8 != 0) goto L_0x0184
            m5.c r8 = p1132m5.C109503c.f327744a
            goto L_0x01a2
        L_0x0184:
            boolean r9 = r8 instanceof p1144q5.C110365a
            if (r9 == 0) goto L_0x0196
            m5.m r9 = new m5.m
            q5.a r8 = (p1144q5.C110365a) r8
            e5.c r10 = r0.f327742b
            r11 = 0
            r0.getClass()
            r9.<init>(r8, r10, r6, r11)
            goto L_0x01a1
        L_0x0196:
            m5.j r9 = new m5.j
            e5.c r10 = r0.f327742b
            r11 = 0
            r0.getClass()
            r9.<init>(r8, r10, r6, r11)
        L_0x01a1:
            r8 = r9
        L_0x01a2:
            m5.a r0 = r1.f320279i
            wx3.f r9 = r4.getContext()
            a14.z1$b r10 = a14.C53973z1.C0004b.f3d
            wx3.f$b r9 = r9.get(r10)
            gy3.C87412m.m108591d(r9)
            a14.z1 r9 = (a14.C53973z1) r9
            r0.getClass()
            java.lang.String r10 = "targetDelegate"
            gy3.C87412m.m108594g(r8, r10)
            androidx.lifecycle.j r10 = r3.f329004m
            q5.b r11 = r3.f328994c
            boolean r12 = r11 instanceof p1144q5.C110367c
            if (r12 == 0) goto L_0x0213
            coil.memory.ViewTargetRequestDelegate r12 = new coil.memory.ViewTargetRequestDelegate
            d5.f r0 = r0.f327741a
            r12.<init>(r0, r3, r8, r9)
            r10.addObserver(r12)
            boolean r0 = r11 instanceof androidx.lifecycle.C0124r
            if (r0 == 0) goto L_0x01da
            r0 = r11
            androidx.lifecycle.r r0 = (androidx.lifecycle.C0124r) r0
            r10.removeObserver(r0)
            r10.addObserver(r0)
        L_0x01da:
            q5.c r11 = (p1144q5.C110367c) r11
            android.view.View r0 = r11.getView()
            m5.t r0 = p864t5.C110905d.m151206b(r0)
            boolean r9 = r0.f327811g
            if (r9 == 0) goto L_0x01eb
            r9 = 0
            r0.f327811g = r9
        L_0x01eb:
            coil.memory.ViewTargetRequestDelegate r9 = r0.f327808d
            if (r9 != 0) goto L_0x01f0
            goto L_0x01f3
        L_0x01f0:
            r9.mo146074b()
        L_0x01f3:
            r0.f327808d = r12
            r0.f327812h = r7
            android.view.View r0 = r11.getView()
            java.util.WeakHashMap<android.view.View, e3.a0> r9 = p849e3.C107207u.f320808a
            boolean r0 = p849e3.C107207u.C107211e.m145207b(r0)
            if (r0 != 0) goto L_0x021b
            android.view.View r0 = r11.getView()
            m5.t r0 = p864t5.C110905d.m151206b(r0)
            android.view.View r9 = r11.getView()
            r0.onViewDetachedFromWindow(r9)
            goto L_0x021b
        L_0x0213:
            coil.memory.BaseRequestDelegate r12 = new coil.memory.BaseRequestDelegate
            r12.<init>(r10, r9)
            r10.addObserver(r12)
        L_0x021b:
            java.lang.Object r0 = r3.f328993b     // Catch:{ all -> 0x0421 }
            o5.j r9 = p632o5.C109961j.f329058a     // Catch:{ all -> 0x0421 }
            boolean r0 = gy3.C87412m.m108589b(r0, r9)     // Catch:{ all -> 0x0421 }
            if (r0 != 0) goto L_0x041b
            if (r2 != 0) goto L_0x024c
            androidx.lifecycle.j r0 = r3.f329004m     // Catch:{ all -> 0x0421 }
            androidx.lifecycle.j$c r9 = r0.getCurrentState()     // Catch:{ all -> 0x0421 }
            androidx.lifecycle.j$c r10 = androidx.lifecycle.C39623j.C39626c.STARTED     // Catch:{ all -> 0x0421 }
            boolean r9 = r9.mo62187a(r10)     // Catch:{ all -> 0x0421 }
            if (r9 == 0) goto L_0x0236
            goto L_0x024c
        L_0x0236:
            r4.f320294d = r1     // Catch:{ all -> 0x0421 }
            r4.f320295e = r3     // Catch:{ all -> 0x0421 }
            r4.f320296f = r6     // Catch:{ all -> 0x0421 }
            r4.f320297g = r8     // Catch:{ all -> 0x0421 }
            r4.f320298h = r12     // Catch:{ all -> 0x0421 }
            r4.f320304q = r2     // Catch:{ all -> 0x0421 }
            r4.f320307t = r7     // Catch:{ all -> 0x0421 }
            java.lang.Object r0 = coil.util.Lifecycles.m62167a(r0, r4)     // Catch:{ all -> 0x0421 }
            if (r0 != r5) goto L_0x024c
            goto L_0x047c
        L_0x024c:
            r0 = r2
            r7 = r6
            r6 = r8
            r2 = r12
            r8 = r3
        L_0x0251:
            m5.l r3 = r1.f320280j     // Catch:{ all -> 0x0417 }
            coil.memory.MemoryCache$Key r9 = r8.f328997f     // Catch:{ all -> 0x0417 }
            m5.n$a r3 = r3.mo160743a(r9)     // Catch:{ all -> 0x0417 }
            if (r3 != 0) goto L_0x025d
            r3 = 0
            goto L_0x0261
        L_0x025d:
            android.graphics.Bitmap r3 = r3.getBitmap()     // Catch:{ all -> 0x0417 }
        L_0x0261:
            r9 = 0
            p864t5.C110905d.m151208d(r6, r9)     // Catch:{ all -> 0x040c }
            if (r3 != 0) goto L_0x0269
            r9 = 0
            goto L_0x027a
        L_0x0269:
            android.content.Context r9 = r8.f328992a     // Catch:{ all -> 0x040c }
            android.content.res.Resources r9 = r9.getResources()     // Catch:{ all -> 0x040c }
            java.lang.String r10 = "context.resources"
            gy3.C87412m.m108593f(r9, r10)     // Catch:{ all -> 0x040c }
            android.graphics.drawable.BitmapDrawable r10 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x040c }
            r10.<init>(r9, r3)     // Catch:{ all -> 0x040c }
            r9 = r10
        L_0x027a:
            if (r9 != 0) goto L_0x0288
            android.graphics.drawable.Drawable r9 = r8.f328985B     // Catch:{ all -> 0x040c }
            java.lang.Integer r10 = r8.f328984A     // Catch:{ all -> 0x040c }
            o5.c r11 = r8.f328991H     // Catch:{ all -> 0x040c }
            android.graphics.drawable.Drawable r11 = r11.f328961g     // Catch:{ all -> 0x040c }
            android.graphics.drawable.Drawable r9 = p864t5.C110906e.m151212c(r8, r9, r10, r11)     // Catch:{ all -> 0x040c }
        L_0x0288:
            r6.mo160742d(r9, r3)     // Catch:{ all -> 0x040c }
            r7.mo157430d(r8)     // Catch:{ all -> 0x040c }
            o5.h$b r9 = r8.f328995d     // Catch:{ all -> 0x040c }
            if (r9 != 0) goto L_0x0293
            goto L_0x0298
        L_0x0293:
            r9.mo157430d(r8)     // Catch:{ all -> 0x040c }
            rx3.b0 r9 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x040c }
        L_0x0298:
            m5.n r9 = r1.f320274d     // Catch:{ all -> 0x0417 }
            e5.c r9 = r9.f327788c     // Catch:{ all -> 0x0417 }
            if (r3 == 0) goto L_0x02a1
            r9.mo157702b(r3)     // Catch:{ all -> 0x0417 }
        L_0x02a1:
            r7.mo157431e(r8)     // Catch:{ all -> 0x0417 }
            p5.f r9 = r8.f329005n     // Catch:{ all -> 0x0417 }
            r4.f320294d = r1     // Catch:{ all -> 0x0417 }
            r4.f320295e = r8     // Catch:{ all -> 0x0417 }
            r4.f320296f = r7     // Catch:{ all -> 0x0417 }
            r4.f320297g = r6     // Catch:{ all -> 0x0417 }
            r4.f320298h = r2     // Catch:{ all -> 0x0417 }
            r4.f320299i = r3     // Catch:{ all -> 0x0417 }
            r4.f320304q = r0     // Catch:{ all -> 0x0417 }
            r10 = 2
            r4.f320307t = r10     // Catch:{ all -> 0x0417 }
            java.lang.Object r9 = r9.mo60229a(r4)     // Catch:{ all -> 0x0417 }
            if (r9 != r5) goto L_0x02bf
            goto L_0x047c
        L_0x02bf:
            r12 = r0
            r17 = r3
            r3 = r9
            r9 = r1
        L_0x02c4:
            r0 = r3
            coil.size.Size r0 = (coil.size.Size) r0     // Catch:{ all -> 0x0409 }
            r7.mo157437k(r8, r0)     // Catch:{ all -> 0x0409 }
            k5.c r1 = new k5.c     // Catch:{ all -> 0x0409 }
            java.util.List<k5.b> r13 = r9.f320282l     // Catch:{ all -> 0x0409 }
            r14 = 0
            r10 = r1
            r11 = r8
            r15 = r8
            r16 = r0
            r18 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0409 }
            t5.g r0 = r9.f320277g     // Catch:{ all -> 0x0409 }
            boolean r0 = r0.f181930b     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x02f9
            r4.f320294d = r9     // Catch:{ all -> 0x0409 }
            r4.f320295e = r8     // Catch:{ all -> 0x0409 }
            r4.f320296f = r7     // Catch:{ all -> 0x0409 }
            r4.f320297g = r6     // Catch:{ all -> 0x0409 }
            r4.f320298h = r2     // Catch:{ all -> 0x0409 }
            r0 = 0
            r4.f320299i = r0     // Catch:{ all -> 0x0409 }
            r0 = 3
            r4.f320307t = r0     // Catch:{ all -> 0x0409 }
            java.lang.Object r0 = r1.mo160028c(r8, r4)     // Catch:{ all -> 0x0409 }
            if (r0 != r5) goto L_0x02f7
            goto L_0x047c
        L_0x02f7:
            r3 = r0
            goto L_0x0319
        L_0x02f9:
            a14.h0 r0 = r8.f329007p     // Catch:{ all -> 0x0409 }
            d5.i r3 = new d5.i     // Catch:{ all -> 0x0409 }
            r10 = 0
            r3.<init>(r1, r8, r10)     // Catch:{ all -> 0x0409 }
            r4.f320294d = r9     // Catch:{ all -> 0x0409 }
            r4.f320295e = r8     // Catch:{ all -> 0x0409 }
            r4.f320296f = r7     // Catch:{ all -> 0x0409 }
            r4.f320297g = r6     // Catch:{ all -> 0x0409 }
            r4.f320298h = r2     // Catch:{ all -> 0x0409 }
            r1 = 0
            r4.f320299i = r1     // Catch:{ all -> 0x0409 }
            r1 = 4
            r4.f320307t = r1     // Catch:{ all -> 0x0409 }
            java.lang.Object r0 = a14.C53895h.m60469g(r0, r3, r4)     // Catch:{ all -> 0x0409 }
            if (r0 != r5) goto L_0x02f7
            goto L_0x047c
        L_0x0319:
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r2
        L_0x031e:
            r2 = r3
            o5.i r2 = (p632o5.C109959i) r2     // Catch:{ all -> 0x0073 }
            boolean r0 = r2 instanceof p632o5.C109963m     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x03c3
            r1 = r2
            o5.m r1 = (p632o5.C109963m) r1     // Catch:{ all -> 0x0073 }
            o5.h r0 = r1.f329060b     // Catch:{ all -> 0x0397 }
            o5.i$a r3 = r1.f329061c     // Catch:{ all -> 0x0397 }
            h5.b r11 = r3.f329056c     // Catch:{ all -> 0x0397 }
            r10.getClass()     // Catch:{ all -> 0x0397 }
            p864t5.C110905d.m151208d(r7, r3)     // Catch:{ all -> 0x0397 }
            r4.f320294d = r10     // Catch:{ all -> 0x0397 }
            r4.f320295e = r9     // Catch:{ all -> 0x0397 }
            r4.f320296f = r8     // Catch:{ all -> 0x0397 }
            r4.f320297g = r7     // Catch:{ all -> 0x0397 }
            r4.f320298h = r6     // Catch:{ all -> 0x0397 }
            r4.f320299i = r2     // Catch:{ all -> 0x0397 }
            r4.f320300j = r10     // Catch:{ all -> 0x0397 }
            r4.f320301n = r1     // Catch:{ all -> 0x0397 }
            r4.f320302o = r0     // Catch:{ all -> 0x0397 }
            r4.f320303p = r3     // Catch:{ all -> 0x0397 }
            r11 = 5
            r4.f320307t = r11     // Catch:{ all -> 0x0397 }
            java.lang.Object r11 = r7.mo160739e(r1, r4)     // Catch:{ all -> 0x0397 }
            if (r11 != r5) goto L_0x0353
            goto L_0x047c
        L_0x0353:
            r11 = r9
            r12 = r10
            r9 = r7
            r7 = r2
            r10 = r8
            r2 = r1
            r8 = r6
            r6 = r12
            r1 = r0
            r0 = r3
        L_0x035d:
            r10.mo157428b(r1, r0)     // Catch:{ all -> 0x00a3 }
            o5.h$b r3 = r1.f328995d     // Catch:{ all -> 0x00a3 }
            if (r3 != 0) goto L_0x0365
            goto L_0x036a
        L_0x0365:
            r3.mo157428b(r1, r0)     // Catch:{ all -> 0x00a3 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00a3 }
        L_0x036a:
            m5.n r0 = r6.f320274d     // Catch:{ all -> 0x0385 }
            e5.c r0 = r0.f327788c     // Catch:{ all -> 0x0385 }
            android.graphics.drawable.Drawable r1 = r2.f329059a     // Catch:{ all -> 0x0385 }
            if (r1 == 0) goto L_0x0382
            boolean r2 = r1 instanceof android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x0385 }
            if (r2 == 0) goto L_0x0382
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1     // Catch:{ all -> 0x0385 }
            android.graphics.Bitmap r1 = r1.getBitmap()     // Catch:{ all -> 0x0385 }
            if (r1 != 0) goto L_0x037f
            goto L_0x0382
        L_0x037f:
            r0.mo157702b(r1)     // Catch:{ all -> 0x0385 }
        L_0x0382:
            r5 = r7
            goto L_0x0401
        L_0x0385:
            r0 = move-exception
            r2 = r8
            r8 = r9
            r7 = r10
            r3 = r11
            r1 = r12
            goto L_0x0424
        L_0x038d:
            r1 = r2
            r7 = r9
            r3 = r11
            r19 = r10
            r10 = r6
            r6 = r8
            r8 = r19
            goto L_0x039a
        L_0x0397:
            r0 = move-exception
            r3 = r9
            r12 = r10
        L_0x039a:
            m5.n r2 = r10.f320274d     // Catch:{ all -> 0x03b3 }
            e5.c r2 = r2.f327788c     // Catch:{ all -> 0x03b3 }
            android.graphics.drawable.Drawable r1 = r1.f329059a     // Catch:{ all -> 0x03b3 }
            if (r1 == 0) goto L_0x03b2
            boolean r9 = r1 instanceof android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x03b3 }
            if (r9 == 0) goto L_0x03b2
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1     // Catch:{ all -> 0x03b3 }
            android.graphics.Bitmap r1 = r1.getBitmap()     // Catch:{ all -> 0x03b3 }
            if (r1 != 0) goto L_0x03af
            goto L_0x03b2
        L_0x03af:
            r2.mo157702b(r1)     // Catch:{ all -> 0x03b3 }
        L_0x03b2:
            throw r0     // Catch:{ all -> 0x03b3 }
        L_0x03b3:
            r0 = move-exception
            r2 = r6
            r1 = r12
            r19 = r8
            r8 = r7
            r7 = r19
            goto L_0x0424
        L_0x03bd:
            r2 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            goto L_0x0406
        L_0x03c3:
            boolean r0 = r2 instanceof p632o5.C109954f     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x03ff
            r1 = r2
            o5.f r1 = (p632o5.C109954f) r1     // Catch:{ all -> 0x0073 }
            o5.h r0 = r1.f328980b     // Catch:{ all -> 0x0073 }
            r10.getClass()     // Catch:{ all -> 0x0073 }
            r3 = 0
            p864t5.C110905d.m151208d(r7, r3)     // Catch:{ all -> 0x0073 }
            r4.f320294d = r10     // Catch:{ all -> 0x0073 }
            r4.f320295e = r9     // Catch:{ all -> 0x0073 }
            r4.f320296f = r8     // Catch:{ all -> 0x0073 }
            r4.f320297g = r7     // Catch:{ all -> 0x0073 }
            r4.f320298h = r6     // Catch:{ all -> 0x0073 }
            r4.f320299i = r2     // Catch:{ all -> 0x0073 }
            r4.f320300j = r1     // Catch:{ all -> 0x0073 }
            r4.f320301n = r0     // Catch:{ all -> 0x0073 }
            r3 = 6
            r4.f320307t = r3     // Catch:{ all -> 0x0073 }
            java.lang.Object r3 = r7.mo160740b(r1, r4)     // Catch:{ all -> 0x0073 }
            if (r3 != r5) goto L_0x03ee
            goto L_0x047c
        L_0x03ee:
            java.lang.Throwable r3 = r1.f328981c     // Catch:{ all -> 0x0073 }
            r8.mo157427a(r0, r3)     // Catch:{ all -> 0x0073 }
            o5.h$b r3 = r0.f328995d     // Catch:{ all -> 0x0073 }
            if (r3 != 0) goto L_0x03f8
            goto L_0x03ff
        L_0x03f8:
            java.lang.Throwable r1 = r1.f328981c     // Catch:{ all -> 0x0073 }
            r3.mo157427a(r0, r1)     // Catch:{ all -> 0x0073 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0073 }
        L_0x03ff:
            r5 = r2
            r8 = r6
        L_0x0401:
            r8.mo146073a()
            goto L_0x047c
        L_0x0406:
            r3 = r8
            r1 = r9
            goto L_0x0419
        L_0x0409:
            r0 = move-exception
            r1 = r9
            goto L_0x0418
        L_0x040c:
            r0 = move-exception
            m5.n r9 = r1.f320274d     // Catch:{ all -> 0x0417 }
            e5.c r9 = r9.f327788c     // Catch:{ all -> 0x0417 }
            if (r3 == 0) goto L_0x0416
            r9.mo157702b(r3)     // Catch:{ all -> 0x0417 }
        L_0x0416:
            throw r0     // Catch:{ all -> 0x0417 }
        L_0x0417:
            r0 = move-exception
        L_0x0418:
            r3 = r8
        L_0x0419:
            r8 = r6
            goto L_0x0424
        L_0x041b:
            o5.k r0 = new o5.k     // Catch:{ all -> 0x0421 }
            r0.<init>()     // Catch:{ all -> 0x0421 }
            throw r0     // Catch:{ all -> 0x0421 }
        L_0x0421:
            r0 = move-exception
            r7 = r6
            r2 = r12
        L_0x0424:
            boolean r6 = r0 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x004b }
            if (r6 == 0) goto L_0x0437
            r1.getClass()     // Catch:{ all -> 0x004b }
            r7.mo157429c(r3)     // Catch:{ all -> 0x004b }
            o5.h$b r1 = r3.f328995d     // Catch:{ all -> 0x004b }
            if (r1 != 0) goto L_0x0433
            goto L_0x0436
        L_0x0433:
            r1.mo157429c(r3)     // Catch:{ all -> 0x004b }
        L_0x0436:
            throw r0     // Catch:{ all -> 0x004b }
        L_0x0437:
            m5.q r6 = r1.f320281k     // Catch:{ all -> 0x004b }
            o5.f r0 = r6.mo160748a(r3, r0)     // Catch:{ all -> 0x004b }
            o5.h r3 = r0.f328980b     // Catch:{ all -> 0x004b }
            r1.getClass()     // Catch:{ all -> 0x004b }
            r1 = 0
            p864t5.C110905d.m151208d(r8, r1)     // Catch:{ all -> 0x004b }
            r4.f320294d = r7     // Catch:{ all -> 0x004b }
            r4.f320295e = r2     // Catch:{ all -> 0x004b }
            r4.f320296f = r0     // Catch:{ all -> 0x004b }
            r4.f320297g = r3     // Catch:{ all -> 0x004b }
            r1 = 0
            r4.f320298h = r1     // Catch:{ all -> 0x004b }
            r4.f320299i = r1     // Catch:{ all -> 0x004b }
            r4.f320300j = r1     // Catch:{ all -> 0x004b }
            r4.f320301n = r1     // Catch:{ all -> 0x004b }
            r4.f320302o = r1     // Catch:{ all -> 0x004b }
            r4.f320303p = r1     // Catch:{ all -> 0x004b }
            r1 = 7
            r4.f320307t = r1     // Catch:{ all -> 0x004b }
            java.lang.Object r1 = r8.mo160740b(r0, r4)     // Catch:{ all -> 0x004b }
            if (r1 != r5) goto L_0x0465
            goto L_0x047c
        L_0x0465:
            r5 = r0
            r0 = r3
            r4 = r7
        L_0x0468:
            java.lang.Throwable r1 = r5.f328981c     // Catch:{ all -> 0x004b }
            r4.mo157427a(r0, r1)     // Catch:{ all -> 0x004b }
            o5.h$b r1 = r0.f328995d     // Catch:{ all -> 0x004b }
            if (r1 != 0) goto L_0x0472
            goto L_0x0479
        L_0x0472:
            java.lang.Throwable r3 = r5.f328981c     // Catch:{ all -> 0x004b }
            r1.mo157427a(r0, r3)     // Catch:{ all -> 0x004b }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x004b }
        L_0x0479:
            r2.mo146073a()
        L_0x047c:
            return r5
        L_0x047d:
            r2.mo146073a()
            throw r0
        L_0x0481:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The image loader is shutdown."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1105d5.C106997h.m144801d(d5.h, o5.h, int, wx3.d):java.lang.Object");
    }

    /* renamed from: a */
    public Object mo157443a(C109956h hVar, C15601d<? super C109959i> dVar) {
        C110366b bVar = hVar.f328994c;
        if (bVar instanceof C110367c) {
            C109529t b = C110905d.m151206b(((C110367c) bVar).getView());
            C66212f context = dVar.getContext();
            int i = C53973z1.f151221b0;
            C66212f.C66215b bVar2 = context.get(C53973z1.C0004b.f3d);
            C87412m.m108591d(bVar2);
            b.mo160750a((C53973z1) bVar2);
        }
        C53896h0 h0Var = C53872d1.f151117a;
        return C53895h.m60469g(C58901s.f168555a.mo74590i0(), new C106999b(this, hVar, (C15601d<? super C106999b>) null), dVar);
    }

    /* renamed from: b */
    public C109953e mo157444b(C109956h hVar) {
        C87412m.m108594g(hVar, "request");
        C53973z1 d = C53895h.m60466d(this.f320278h, (C66212f) null, (C53934p0) null, new C106998a(this, hVar, (C15601d<? super C106998a>) null), 3, (Object) null);
        C110366b bVar = hVar.f328994c;
        return bVar instanceof C110367c ? new C109964n(C110905d.m151206b(((C110367c) bVar).getView()).mo160750a(d), (C110367c) hVar.f328994c) : new C109949a(d);
    }

    /* renamed from: c */
    public C109951c mo157445c() {
        return this.f320272b;
    }
}
