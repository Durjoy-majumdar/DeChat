package p61;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8479f0;
import gy3.C87412m;
import hp3.C87581a;
import java.util.LinkedList;
import kotlin.Result;
import ob0.C89132b;
import p247u3.C65145q1;
import p247u3.C65164r1;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C101787i40;
import te3.C49103d62;
import te3.C52038xy1;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: p61.d */
public final class C47432d extends C65145q1<C89349b, C101787i40> {

    /* renamed from: c */
    public int f127235c;

    /* renamed from: d */
    public final C49103d62 f127236d;

    /* renamed from: e */
    public final String f127237e = "MicroMsg.EmojiDesignerIPSetPageSource";

    /* renamed from: f */
    public boolean f127238f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerIPSetPageSource", mo125469f = "EmojiDesignerIPSetPageSource.kt", mo125470l = {49}, mo125471m = "load")
    /* renamed from: p61.d$a */
    public static final class C47433a extends C66704d {

        /* renamed from: d */
        public Object f127239d;

        /* renamed from: e */
        public Object f127240e;

        /* renamed from: f */
        public Object f127241f;

        /* renamed from: g */
        public /* synthetic */ Object f127242g;

        /* renamed from: h */
        public final /* synthetic */ C47432d f127243h;

        /* renamed from: i */
        public int f127244i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47433a(C47432d dVar, C15601d<? super C47433a> dVar2) {
            super(dVar2);
            this.f127243h = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f127242g = obj;
            this.f127244i |= Integer.MIN_VALUE;
            return this.f127243h.mo72456d((C65145q1.C65146a<C89349b>) null, this);
        }
    }

    /* renamed from: p61.d$b */
    public static final class C47434b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C47432d f127245a;

        /* renamed from: b */
        public final /* synthetic */ C8479f0<C89349b> f127246b;

        /* renamed from: c */
        public final /* synthetic */ C15601d<C52038xy1> f127247c;

        public C47434b(C47432d dVar, C8479f0<C89349b> f0Var, C15601d<? super C52038xy1> dVar2) {
            this.f127245a = dVar;
            this.f127246b = f0Var;
            this.f127247c = dVar2;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            String str = this.f127245a.f127237e;
            StringBuilder sb = new StringBuilder();
            sb.append("load: ");
            sb.append(cVar.f256793a);
            sb.append(", ");
            sb.append(cVar.f256794b);
            sb.append(", ");
            LinkedList<C101787i40> linkedList = ((C52038xy1) cVar.f256796d).f145020e;
            sb.append(linkedList != null ? Integer.valueOf(linkedList.size()) : null);
            Log.m105924i(str, sb.toString());
            int i = cVar.f256793a;
            if (i == 0 || i == 4) {
                C52038xy1 xy12 = (C52038xy1) cVar.f256796d;
                if (xy12.f145021f == 1) {
                    this.f127246b.f27484d = xy12.f145019d;
                }
            }
            C15601d<C52038xy1> dVar = this.f127247c;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(cVar.f256796d));
            return C13598b0.f38549a;
        }
    }

    public C47432d(int i, C49103d62 d622) {
        this.f127235c = i;
        this.f127236d = d622;
    }

    /* renamed from: b */
    public Object mo72455b(C65164r1 r1Var) {
        C87412m.m108594g(r1Var, "state");
        C49103d62 d622 = this.f127236d;
        if (d622 != null) {
            return d622.f132154q;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo72456d(p247u3.C65145q1.C65146a<pe3.C89349b> r7, wx3.C15601d<? super p247u3.C65145q1.C65150b<pe3.C89349b, te3.C101787i40>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p61.C47432d.C47433a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            p61.d$a r0 = (p61.C47432d.C47433a) r0
            int r1 = r0.f127244i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f127244i = r1
            goto L_0x0018
        L_0x0013:
            p61.d$a r0 = new p61.d$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f127242g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f127244i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r7 = r0.f127241f
            gy3.f0 r7 = (gy3.C8479f0) r7
            java.lang.Object r1 = r0.f127240e
            u3.q1$a r1 = (p247u3.C65145q1.C65146a) r1
            java.lang.Object r0 = r0.f127239d
            p61.d r0 = (p61.C47432d) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x009c
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r8)
            boolean r8 = r6.f127238f
            if (r8 != 0) goto L_0x0063
            te3.d62 r8 = r6.f127236d
            if (r8 == 0) goto L_0x0063
            r6.f127238f = r4
            java.lang.String r7 = r6.f127237e
            java.lang.String r8 = "load: first page"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            u3.q1$b$b r7 = new u3.q1$b$b
            te3.d62 r8 = r6.f127236d
            java.util.LinkedList<te3.i40> r8 = r8.f132153p
            java.lang.String r0 = "lastData.IPSetList"
            gy3.C87412m.m108593f(r8, r0)
            te3.d62 r0 = r6.f127236d
            pe3.b r0 = r0.f132154q
            r7.<init>(r8, r3, r0)
            return r7
        L_0x0063:
            gy3.f0 r8 = new gy3.f0
            r8.<init>()
            r0.f127239d = r6
            r0.f127240e = r7
            r0.f127241f = r8
            r0.f127244i = r4
            wx3.h r2 = new wx3.h
            wx3.d r0 = xx3.C66447b.m78392b(r0)
            r2.<init>(r0)
            dl.c r0 = new dl.c
            int r4 = r6.f127235c
            java.lang.Object r7 = r7.mo89309a()
            pe3.b r7 = (pe3.C89349b) r7
            r0.<init>(r4, r7)
            nr3.e r7 = r0.mo9225i()
            p61.d$b r0 = new p61.d$b
            r0.<init>(r6, r8, r2)
            r7.mo123420E(r0)
            java.lang.Object r7 = r2.mo90314b()
            if (r7 != r1) goto L_0x0099
            return r1
        L_0x0099:
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x009c:
            te3.xy1 r8 = (te3.C52038xy1) r8
            u3.q1$b$b r0 = new u3.q1$b$b
            java.util.LinkedList<te3.i40> r8 = r8.f145020e
            if (r8 != 0) goto L_0x00a6
            sx3.f0 r8 = sx3.C64186f0.f181907d
        L_0x00a6:
            T r7 = r7.f27484d
            r0.<init>(r8, r3, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p61.C47432d.mo72456d(u3.q1$a, wx3.d):java.lang.Object");
    }
}
