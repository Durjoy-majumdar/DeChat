package ak3;

import a14.C0000n0;
import a14.C53869d;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53934p0;
import androidx.recyclerview.widget.C54248l;
import ck3.C39969i;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import fy3.C32227p;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jn3.C46564f;
import kotlin.ResultKt;
import ln3.C76709a;
import ln3.C76717k;
import mn3.C76787a;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C64197v;
import sx3.C77813z;
import sx3.C90363p0;
import sx3.C90364q0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zj3.C79382t;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.component.tipsbar.ChattingTipsBarComponent$prepareDataAndCommitV2$1", mo125469f = "ChattingTipsBarComponent.kt", mo125470l = {301, 351}, mo125471m = "invokeSuspend")
/* renamed from: ak3.b */
public final class C67059b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f192616d;

    /* renamed from: e */
    public /* synthetic */ Object f192617e;

    /* renamed from: f */
    public final /* synthetic */ C67056a f192618f;

    /* renamed from: g */
    public final /* synthetic */ C39969i f192619g;

    /* renamed from: h */
    public final /* synthetic */ long f192620h;

    /* renamed from: i */
    public final /* synthetic */ ChatTipsBarGroup.C74826e f192621i;

    /* renamed from: j */
    public final /* synthetic */ boolean f192622j;

    @C91590f(mo125468c = "com.tencent.mm.ui.chatting.component.tipsbar.ChattingTipsBarComponent$prepareDataAndCommitV2$1$1$asyncTask$1", mo125469f = "ChattingTipsBarComponent.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ak3.b$a */
    public static final class C67060a extends C91594j implements C32227p<C0000n0, C15601d<? super List<? extends C76709a<?>>>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C76787a<?> f192623d;

        /* renamed from: e */
        public final /* synthetic */ C67056a f192624e;

        /* renamed from: f */
        public final /* synthetic */ C39969i f192625f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67060a(C76787a<?> aVar, C67056a aVar2, C39969i iVar, C15601d<? super C67060a> dVar) {
            super(2, dVar);
            this.f192623d = aVar;
            this.f192624e = aVar2;
            this.f192625f = iVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C67060a(this.f192623d, this.f192624e, this.f192625f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C67060a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            try {
                C76787a<?> aVar = this.f192623d;
                C67391b bVar = this.f192624e.f215752d;
                C87412m.m108593f(bVar, "mChattingContext");
                C39969i iVar = this.f192625f;
                C87412m.m108593f(iVar, "talkerInfo");
                aVar.getClass();
                List<?> Z = aVar.mo86472Z(bVar, iVar);
                aVar.f224605e = Z;
                return Z;
            } catch (Throwable th) {
                Log.printErrStackTrace(this.f192624e.f192607e, th, "prepare tipsbar data err", new Object[0]);
                return null;
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.ui.chatting.component.tipsbar.ChattingTipsBarComponent$prepareDataAndCommitV2$1$3", mo125469f = "ChattingTipsBarComponent.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ak3.b$b */
    public static final class C67061b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ Runnable f192626d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67061b(Runnable runnable, C15601d<? super C67061b> dVar) {
            super(2, dVar);
            this.f192626d = runnable;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C67061b(this.f192626d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C67061b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f192626d.run();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ak3.b$c */
    public static final class C67062c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C67056a f192627d;

        /* renamed from: e */
        public final /* synthetic */ long f192628e;

        /* renamed from: f */
        public final /* synthetic */ LinkedList<C76709a<?>> f192629f;

        /* renamed from: g */
        public final /* synthetic */ ChatTipsBarGroup.C74826e f192630g;

        /* renamed from: h */
        public final /* synthetic */ C54248l.C54251c f192631h;

        /* renamed from: i */
        public final /* synthetic */ boolean f192632i;

        /* renamed from: ak3.b$c$a */
        public static final class C67063a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C67056a f192633d;

            public C67063a(C67056a aVar) {
                this.f192633d = aVar;
            }

            public final void run() {
                long currentTimeMillis = System.currentTimeMillis();
                C67056a aVar = this.f192633d;
                long j = currentTimeMillis - aVar.f192611i;
                Log.m105919d(aVar.f192607e, "updateChatTipsBarGroup() called55555 cost:%s", Long.valueOf(j));
                ((C79382t) this.f192633d.f215752d.f193278b.mo102812a(C79382t.class)).mo109369m3();
            }
        }

        public C67062c(C67056a aVar, long j, LinkedList<C76709a<?>> linkedList, ChatTipsBarGroup.C74826e eVar, C54248l.C54251c cVar, boolean z) {
            this.f192627d = aVar;
            this.f192628e = j;
            this.f192629f = linkedList;
            this.f192630g = eVar;
            this.f192631h = cVar;
            this.f192632i = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r12 = this;
                ak3.a r0 = r12.f192627d
                ck3.b r0 = r0.f215752d
                r0.mo91558S()
                ak3.a r0 = r12.f192627d
                java.lang.String r0 = r0.f192607e
                java.lang.String r1 = "prepareDataAndCommitV2() called"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
                ak3.a r0 = r12.f192627d
                long r1 = r12.f192628e
                r3 = 0
                r4 = 1
                r5 = 0
                int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r7 == 0) goto L_0x0024
                long r7 = r0.f192609g
                int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
                if (r0 != 0) goto L_0x0027
                r0 = 1
                goto L_0x0028
            L_0x0024:
                r0.getClass()
            L_0x0027:
                r0 = 0
            L_0x0028:
                if (r0 != 0) goto L_0x0034
                ak3.a r0 = r12.f192627d
                java.lang.String r0 = r0.f192607e
                java.lang.String r1 = "session invalid 4"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
                return
            L_0x0034:
                long r0 = java.lang.System.currentTimeMillis()
                ak3.a r2 = r12.f192627d
                long r7 = r2.f192611i
                long r0 = r0 - r7
                java.lang.String r2 = r2.f192607e
                java.lang.Object[] r7 = new java.lang.Object[r4]
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r7[r3] = r0
                java.lang.String r0 = "updateChatTipsBarGroup() called44444 cost:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r0, r7)
                java.util.LinkedList<ln3.a<?>> r0 = r12.f192629f
                int r0 = r0.size()
                if (r0 <= 0) goto L_0x01a8
                ak3.a r0 = r12.f192627d
                com.tencent.mm.ui.tipsbar.ChatTipsBarGroup r1 = r0.f192608f
                r2 = 0
                if (r1 != 0) goto L_0x007b
                ck3.b r0 = r0.f215752d
                com.tencent.mm.ui.chatting.BaseChattingUIFragment r0 = r0.f193286j
                r1 = 2131316297(0x7f094e49, float:1.8251072E38)
                com.tencent.p014mm.p136ui.chatting.component.C73521l0.m86927d(r0, r1)
                ak3.a r0 = r12.f192627d
                ck3.b r1 = r0.f215752d
                r7 = 2131299029(0x7f090ad5, float:1.8216048E38)
                android.view.View r1 = r1.mo91562c(r7)
                boolean r7 = r1 instanceof com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup
                if (r7 == 0) goto L_0x0078
                com.tencent.mm.ui.tipsbar.ChatTipsBarGroup r1 = (com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup) r1
                goto L_0x0079
            L_0x0078:
                r1 = r2
            L_0x0079:
                r0.f192608f = r1
            L_0x007b:
                ak3.a r0 = r12.f192627d
                com.tencent.mm.ui.tipsbar.ChatTipsBarGroup r1 = r0.f192608f
                java.lang.String r7 = "mChattingContext"
                if (r1 == 0) goto L_0x00c2
                ck3.b r0 = r0.f215752d
                gy3.C87412m.m108593f(r0, r7)
                ak3.a r8 = r12.f192627d
                java.util.LinkedList<mn3.a<?>> r8 = r8.f192610h
                java.lang.String r9 = "processors"
                gy3.C87412m.m108594g(r8, r9)
                com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView r9 = r1.f219953d
                androidx.recyclerview.widget.RecyclerView$e r9 = r9.getAdapter()
                if (r9 == 0) goto L_0x009a
                goto L_0x00c2
            L_0x009a:
                com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView r9 = r1.f219953d
                com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$d r10 = r1.f219962p
                com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$buildItemConverts$1 r11 = new com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$buildItemConverts$1
                r11.<init>(r8, r1, r0, r10)
                java.util.ArrayList<jq3.c> r0 = r1.f219963q
                jn3.d r8 = new jn3.d
                r8.<init>(r1, r11, r0)
                r9.setAdapter(r8)
                com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView r0 = r1.f219953d
                r0.setAnimation(r2)
                com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView r0 = r1.f219953d
                androidx.recyclerview.widget.RecyclerView$j r0 = r0.getItemAnimator()
                if (r0 != 0) goto L_0x00bb
                goto L_0x00bd
            L_0x00bb:
                r0.f44810f = r5
            L_0x00bd:
                com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView r0 = r1.f219953d
                r0.setItemAnimator(r2)
            L_0x00c2:
                ak3.a r0 = r12.f192627d
                com.tencent.mm.ui.tipsbar.ChatTipsBarGroup r1 = r0.f192608f
                if (r1 == 0) goto L_0x018f
                java.util.LinkedList<ln3.a<?>> r5 = r12.f192629f
                ck3.b r0 = r0.f215752d
                gy3.C87412m.m108593f(r0, r7)
                com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$e r6 = r12.f192630g
                androidx.recyclerview.widget.l$c r7 = r12.f192631h
                com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$c r8 = com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup.C74824c.MODE_FOLD
                java.lang.String r9 = "input"
                gy3.C87412m.m108594g(r5, r9)
                java.lang.String r9 = "updateScene"
                gy3.C87412m.m108594g(r6, r9)
                java.lang.String r9 = "diffResult"
                gy3.C87412m.m108594g(r7, r9)
                java.lang.String r9 = r0.mo91577r()
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r0)
                r1.f219964r = r10
                java.util.ArrayList<jq3.c> r10 = r1.f219963q
                r10.clear()
                java.util.ArrayList<jq3.c> r10 = r1.f219963q
                r10.addAll(r5)
                com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$d r5 = r1.f219962p
                r5.getClass()
                r5.f219974b = r6
                java.lang.String r5 = r1.f219966t
                boolean r5 = gy3.C87412m.m108589b(r9, r5)
                if (r5 != 0) goto L_0x0118
                com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$d r5 = r1.f219962p
                r5.getClass()
                r5.f219973a = r8
                java.lang.String r5 = "talkerName"
                gy3.C87412m.m108593f(r9, r5)
                r1.f219966t = r9
            L_0x0118:
                java.util.ArrayList<jq3.c> r5 = r1.f219963q
                int r5 = r5.size()
                if (r5 > r4) goto L_0x0127
                com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$d r5 = r1.f219962p
                r5.getClass()
                r5.f219973a = r8
            L_0x0127:
                com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$d r5 = r1.f219962p
                com.tencent.mm.ui.tipsbar.ChatTipsBarGroup$c r5 = r5.f219973a
                int r5 = r5.ordinal()
                if (r5 == 0) goto L_0x0138
                if (r5 == r4) goto L_0x0134
                goto L_0x013b
            L_0x0134:
                r1.mo103991c()
                goto L_0x013b
            L_0x0138:
                r1.mo103992d()
            L_0x013b:
                com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView r5 = r1.f219953d
                androidx.recyclerview.widget.RecyclerView$e r5 = r5.getAdapter()
                if (r5 == 0) goto L_0x0146
                r7.mo75046b(r5)
            L_0x0146:
                android.content.Context r5 = r1.getContext()
                boolean r6 = r5 instanceof android.app.Activity
                if (r6 == 0) goto L_0x0151
                android.app.Activity r5 = (android.app.Activity) r5
                goto L_0x0152
            L_0x0151:
                r5 = r2
            L_0x0152:
                if (r5 == 0) goto L_0x015b
                r2 = 2131299184(0x7f090b70, float:1.8216362E38)
                android.view.View r2 = r5.findViewById(r2)
            L_0x015b:
                if (r2 == 0) goto L_0x0162
                int r2 = r2.getHeight()
                goto L_0x016c
            L_0x0162:
                android.content.Context r2 = r1.getContext()
                com.tencent.mm.ui.i3$a r2 = com.tencent.p014mm.p136ui.C74783i3.m89537a(r2)
                int r2 = r2.f24705b
            L_0x016c:
                com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView r5 = r1.f219953d
                double r6 = (double) r2
                r8 = 4604930618986332160(0x3fe8000000000000, double:0.75)
                double r6 = r6 * r8
                int r2 = (int) r6
                android.content.Context r6 = r1.getContext()
                r7 = 2131165346(0x7f0700a2, float:1.7944907E38)
                int r6 = kg3.C76577a.m92157h(r6, r7)
                int r2 = r2 - r6
                r5.setMaxHeight(r2)
                ck3.i r0 = r0.mo91575p()
                jn3.e r2 = new jn3.e
                r2.<init>(r1, r0)
                r1.post(r2)
            L_0x018f:
                ak3.a r0 = r12.f192627d
                com.tencent.mm.ui.tipsbar.ChatTipsBarGroup r0 = r0.f192608f
                if (r0 != 0) goto L_0x0196
                goto L_0x0199
            L_0x0196:
                r0.setVisibility(r3)
            L_0x0199:
                ak3.a r0 = r12.f192627d
                com.tencent.mm.ui.tipsbar.ChatTipsBarGroup r1 = r0.f192608f
                if (r1 == 0) goto L_0x01be
                ak3.b$c$a r2 = new ak3.b$c$a
                r2.<init>(r0)
                r1.post(r2)
                goto L_0x01be
            L_0x01a8:
                ak3.a r0 = r12.f192627d
                r0.mo91070Y5()
                ak3.a r0 = r12.f192627d
                ck3.b r0 = r0.f215752d
                java.lang.Class<zj3.t> r1 = zj3.C79382t.class
                com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
                xi.d r0 = r0.mo102812a(r1)
                zj3.t r0 = (zj3.C79382t) r0
                r0.mo109369m3()
            L_0x01be:
                ak3.a r0 = r12.f192627d
                boolean r1 = r12.f192632i
                if (r1 == 0) goto L_0x01d4
                ck3.b r0 = r0.f215752d
                java.lang.Class<zj3.d0> r1 = zj3.C79346d0.class
                com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
                xi.d r0 = r0.mo102812a(r1)
                zj3.d0 r0 = (zj3.C79346d0) r0
                r0.mo102653n5(r4)
                goto L_0x01d7
            L_0x01d4:
                r0.getClass()
            L_0x01d7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ak3.C67059b.C67062c.run():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67059b(C67056a aVar, C39969i iVar, long j, ChatTipsBarGroup.C74826e eVar, boolean z, C15601d<? super C67059b> dVar) {
        super(2, dVar);
        this.f192618f = aVar;
        this.f192619g = iVar;
        this.f192620h = j;
        this.f192621i = eVar;
        this.f192622j = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C67059b bVar = new C67059b(this.f192618f, this.f192619g, this.f192620h, this.f192621i, this.f192622j, dVar);
        bVar.f192617e = obj;
        return bVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C67059b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        LinkedList linkedList;
        Object obj2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f192616d;
        int i2 = 0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f192617e;
            long currentTimeMillis = System.currentTimeMillis();
            C67056a aVar2 = this.f192618f;
            long j = currentTimeMillis - aVar2.f192611i;
            Log.m105919d(aVar2.f192607e, "updateChatTipsBarGroup() called333333 cost:%s", new Long(j));
            LinkedList linkedList2 = new LinkedList();
            LinkedList linkedList3 = new LinkedList();
            C67056a aVar3 = this.f192618f;
            LinkedList<C76787a<?>> linkedList4 = aVar3.f192610h;
            C39969i iVar = this.f192619g;
            int i3 = 0;
            for (T next : linkedList4) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    linkedList3.add(C53895h.m60464b(n0Var, (C66212f) null, (C53934p0) null, new C67060a((C76787a) next, aVar3, iVar, (C15601d<? super C67060a>) null), 3, (Object) null));
                    i3 = i4;
                    iVar = iVar;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            this.f192617e = linkedList2;
            this.f192616d = 1;
            obj2 = C53869d.m60385a(linkedList3, this);
            if (obj2 == aVar) {
                return aVar;
            }
            linkedList = linkedList2;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            linkedList = (LinkedList) this.f192617e;
            obj2 = obj;
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        for (List list : (List) obj2) {
            if (list != null && (!list.isEmpty())) {
                linkedList.addAll(list);
            }
        }
        this.f192618f.getClass();
        C87412m.m108594g(linkedList, "<this>");
        C77813z.m93909o(linkedList, C67065d.f192637d);
        C67056a aVar4 = this.f192618f;
        C39969i iVar2 = this.f192619g;
        C87412m.m108593f(iVar2, "talkerInfo");
        aVar4.getClass();
        Map<String, ? extends Object> h = C90364q0.m113149h(C90363p0.m113143b(new C13604l("group_bar_list_length", Integer.valueOf(linkedList.size()))), C46564f.m51893a(iVar2));
        for (Object next2 : linkedList) {
            int i5 = i2 + 1;
            if (i2 >= 0) {
                C76709a aVar5 = (C76709a) next2;
                aVar5.f224435d = i2;
                aVar5.f224437f = h;
                i2 = i5;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        C54248l.C54251c a = C54248l.m60949a(new C76717k(this.f192618f.f192612j, linkedList), true);
        C67056a aVar6 = this.f192618f;
        a.mo75045a(new C67064c(aVar6, linkedList, aVar6.f192612j));
        C67056a aVar7 = this.f192618f;
        Object clone = linkedList.clone();
        C87412m.m108592e(clone, "null cannot be cast to non-null type java.util.LinkedList<com.tencent.mm.ui.tipsbar.data.BaseTipsBarData<*>>");
        aVar7.getClass();
        aVar7.f192612j = (LinkedList) clone;
        C67062c cVar = new C67062c(this.f192618f, this.f192620h, linkedList, this.f192621i, a, this.f192622j);
        C53896h0 h0Var = C53872d1.f151117a;
        C53915k2 k2Var = C58901s.f168555a;
        C67061b bVar = new C67061b(cVar, (C15601d<? super C67061b>) null);
        this.f192617e = null;
        this.f192616d = 2;
        if (C53895h.m60469g(k2Var, bVar, this) == aVar) {
            return aVar;
        }
        return C13598b0.f38549a;
    }
}
