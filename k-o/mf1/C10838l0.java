package mf1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import android.view.View;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import fy3.C32227p;
import kotlin.ResultKt;
import mf1.C10846o0;
import pf1.C11918p;
import pf1.C11920q;
import pf1.C11930y;
import rf1.C12982a;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.component.FinderFeedJumperBaseUIC$JumperInfoExListObserver$onChanged$1$2$1$6", mo125469f = "FinderFeedJumperBaseUIC.kt", mo125470l = {741}, mo125471m = "invokeSuspend")
/* renamed from: mf1.l0 */
public final class C10838l0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f32363d;

    /* renamed from: e */
    public final /* synthetic */ C12982a f32364e;

    /* renamed from: f */
    public final /* synthetic */ FinderJumpInfo f32365f;

    /* renamed from: g */
    public final /* synthetic */ C11920q f32366g;

    /* renamed from: h */
    public final /* synthetic */ String f32367h;

    /* renamed from: i */
    public final /* synthetic */ C10846o0.C10847a f32368i;

    /* renamed from: j */
    public final /* synthetic */ View f32369j;

    /* renamed from: n */
    public final /* synthetic */ C10846o0 f32370n;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.feed.component.FinderFeedJumperBaseUIC$JumperInfoExListObserver$onChanged$1$2$1$6$2", mo125469f = "FinderFeedJumperBaseUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: mf1.l0$a */
    public static final class C10839a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C12982a f32371d;

        /* renamed from: e */
        public final /* synthetic */ C10846o0.C10847a f32372e;

        /* renamed from: f */
        public final /* synthetic */ View f32373f;

        /* renamed from: g */
        public final /* synthetic */ C11920q f32374g;

        /* renamed from: h */
        public final /* synthetic */ C10846o0 f32375h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10839a(C12982a aVar, C10846o0.C10847a aVar2, View view, C11920q qVar, C10846o0 o0Var, C15601d<? super C10839a> dVar) {
            super(2, dVar);
            this.f32371d = aVar;
            this.f32372e = aVar2;
            this.f32373f = view;
            this.f32374g = qVar;
            this.f32375h = o0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C10839a(this.f32371d, this.f32372e, this.f32373f, this.f32374g, this.f32375h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10839a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:40:0x0119  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                kotlin.ResultKt.throwOnFailure(r14)
                rf1.a r0 = r13.f32371d
                mf1.o0$a r14 = r13.f32372e
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r14.f32403e
                jq3.o r2 = r14.f32402d
                android.view.View r3 = r13.f32373f
                java.lang.String r14 = "view"
                gy3.C87412m.m108593f(r3, r14)
                pf1.q r4 = r13.f32374g
                mf1.o0$a r14 = r13.f32372e
                java.lang.String r5 = r14.f32404f
                r0.mo11020b(r1, r2, r3, r4, r5)
                rf1.a r14 = r13.f32371d
                pf1.q r0 = r13.f32374g
                r14.getClass()
                java.lang.String r1 = "infoEx"
                gy3.C87412m.m108594g(r0, r1)
                pf1.o0 r14 = r14.f37020i
                if (r14 == 0) goto L_0x002f
                r14.mo11787i(r0)
            L_0x002f:
                mf1.o0 r1 = r13.f32375h
                mf1.o0$a r14 = r13.f32372e
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r14.f32403e
                jq3.o r3 = r14.f32402d
                android.view.View r4 = r13.f32373f
                pf1.q r5 = r13.f32374g
                java.lang.String r6 = r14.f32404f
                rf1.a r7 = r13.f32371d
                r1.mo11028m3(r2, r3, r4, r5, r6, r7)
                mf1.o0$a r14 = r13.f32372e
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r14 = r14.f32403e
                com.tencent.mm.plugin.finder.storage.FinderItem r14 = r14.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r14 = r14.getFeedObject()
                bl3.r r0 = bl3.C39818r.f106831a
                mf1.o0 r1 = r13.f32375h
                androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()
                bl3.r$a r0 = r0.mo62444c(r1)
                java.lang.Class<rs1.s8> r1 = rs1.C13442s8.class
                androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
                rs1.s8 r0 = (rs1.C13442s8) r0
                int r6 = r0.f38096i
                mf1.o0$a r0 = r13.f32372e
                long r0 = r0.f32405g
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x007f
                mf1.o0 r0 = r13.f32375h
                pf1.n r1 = r0.mo11063j3()
                long r2 = r14.f164794id
                mf1.o0$a r14 = r13.f32372e
                long r4 = r14.f32405g
                androidx.lifecycle.z r14 = r1.mo87340f3(r2, r4, r6)
                goto L_0x008b
            L_0x007f:
                mf1.o0 r0 = r13.f32375h
                pf1.n r0 = r0.mo11063j3()
                long r1 = r14.f164794id
                androidx.lifecycle.z r14 = r0.mo87341g3(r1, r6)
            L_0x008b:
                er1.o0 r0 = er1.C7847o0.f26422a
                mf1.o0$a r1 = r13.f32372e
                jq3.o r1 = r1.f32402d
                android.view.View r1 = r1.f44854d
                java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup"
                gy3.C87412m.m108592e(r1, r2)
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                rf1.a r2 = r13.f32371d
                pf1.q r2 = r2.f37015d
                java.lang.Object r14 = r14.getValue()
                java.util.Set r14 = (java.util.Set) r14
                gy3.d0 r3 = new gy3.d0
                r3.<init>()
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x00be
                if (r14 == 0) goto L_0x00b8
                boolean r6 = r14.isEmpty()
                if (r6 == 0) goto L_0x00b6
                goto L_0x00b8
            L_0x00b6:
                r6 = 0
                goto L_0x00b9
            L_0x00b8:
                r6 = 1
            L_0x00b9:
                if (r6 == 0) goto L_0x00be
                r3.f27483d = r4
                goto L_0x0115
            L_0x00be:
                if (r2 != 0) goto L_0x00d0
                if (r14 == 0) goto L_0x00ca
                boolean r6 = r14.isEmpty()
                if (r6 == 0) goto L_0x00c9
                goto L_0x00ca
            L_0x00c9:
                r4 = 0
            L_0x00ca:
                if (r4 != 0) goto L_0x00d0
                r14 = 2
                r3.f27483d = r14
                goto L_0x0115
            L_0x00d0:
                if (r2 == 0) goto L_0x0115
                if (r14 == 0) goto L_0x0115
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r14 = r14.iterator()
            L_0x00dd:
                boolean r6 = r14.hasNext()
                if (r6 == 0) goto L_0x00ef
                java.lang.Object r6 = r14.next()
                pf1.l r6 = (pf1.C11911l) r6
                java.util.List<com.tencent.mm.protocal.protobuf.FinderJumpInfo> r6 = r6.f34806d
                sx3.C64175a0.m75508p(r4, r6)
                goto L_0x00dd
            L_0x00ef:
                java.util.Iterator r14 = r4.iterator()
            L_0x00f3:
                boolean r4 = r14.hasNext()
                if (r4 == 0) goto L_0x010f
                java.lang.Object r4 = r14.next()
                com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = (com.tencent.p014mm.protocal.protobuf.FinderJumpInfo) r4
                java.lang.String r4 = r4.jump_id
                com.tencent.mm.protocal.protobuf.FinderJumpInfo r6 = r2.f34827a
                java.lang.String r6 = r6.jump_id
                boolean r4 = gy3.C87412m.m108589b(r4, r6)
                if (r4 == 0) goto L_0x010c
                goto L_0x0110
            L_0x010c:
                int r5 = r5 + 1
                goto L_0x00f3
            L_0x010f:
                r5 = -1
            L_0x0110:
                if (r5 >= 0) goto L_0x0115
                r14 = 3
                r3.f27483d = r14
            L_0x0115:
                int r14 = r3.f27483d
                if (r14 <= 0) goto L_0x012f
                ft1.a r4 = ft1.C59319a.f169618b
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                er1.n0 r10 = new er1.n0
                r10.<init>(r3)
                r11 = 28
                r12 = 0
                java.lang.String r5 = "FinderFeedMatcher.checkJumpInfo.1"
                o40.C11348f.C11349a.m11178b(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r0.mo8956a(r1)
            L_0x012f:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: mf1.C10838l0.C10839a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10838l0(C12982a aVar, FinderJumpInfo finderJumpInfo, C11920q qVar, String str, C10846o0.C10847a aVar2, View view, C10846o0 o0Var, C15601d<? super C10838l0> dVar) {
        super(2, dVar);
        this.f32364e = aVar;
        this.f32365f = finderJumpInfo;
        this.f32366g = qVar;
        this.f32367h = str;
        this.f32368i = aVar2;
        this.f32369j = view;
        this.f32370n = o0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C10838l0(this.f32364e, this.f32365f, this.f32366g, this.f32367h, this.f32368i, this.f32369j, this.f32370n, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C10838l0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C11918p a;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f32363d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C11930y yVar = this.f32364e.f37021j;
            boolean z = false;
            if (!(yVar == null || (a = yVar.mo11778a(this.f32365f)) == null)) {
                FinderJumpInfo finderJumpInfo = this.f32365f;
                C11920q qVar = this.f32366g;
                CharSequence charSequence = a.f34818a;
                if (charSequence == null || charSequence.length() == 0) {
                    CharSequence charSequence2 = a.f34819b;
                    if (charSequence2 == null || charSequence2.length() == 0) {
                        String str = finderJumpInfo.wording;
                        if (!(str == null || str.length() == 0)) {
                            a.f34818a = finderJumpInfo.wording;
                        }
                    }
                }
                String str2 = a.f34820c;
                if (str2 == null || str2.length() == 0) {
                    String str3 = finderJumpInfo.icon_url;
                    if (!(str3 == null || str3.length() == 0)) {
                        a.f34820c = finderJumpInfo.icon_url;
                    }
                }
                qVar.f34832f = a;
            }
            C11918p pVar = this.f32366g.f34832f;
            if (pVar != null && !pVar.mo11805a()) {
                z = true;
            }
            if (z || this.f32364e.mo11021i(this.f32366g)) {
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C10839a aVar2 = new C10839a(this.f32364e, this.f32368i, this.f32369j, this.f32366g, this.f32370n, (C15601d<? super C10839a>) null);
                this.f32363d = 1;
                if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid, feedId=");
                sb.append(this.f32367h);
                sb.append(" cache.iconUrl=");
                C11918p pVar2 = this.f32366g.f34832f;
                CharSequence charSequence3 = null;
                sb.append(pVar2 != null ? pVar2.f34820c : null);
                sb.append(" cache.title=");
                C11918p pVar3 = this.f32366g.f34832f;
                sb.append(pVar3 != null ? pVar3.f34818a : null);
                sb.append("cache.desc=");
                C11918p pVar4 = this.f32366g.f34832f;
                if (pVar4 != null) {
                    charSequence3 = pVar4.f34819b;
                }
                sb.append(charSequence3);
                sb.append(" info.wording=");
                sb.append(this.f32365f.wording);
                Log.m105924i("Finder.BaseAdFeedJumperUIC", sb.toString());
                return C13598b0.f38549a;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
