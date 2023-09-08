package com.tencent.p014mm.plugin.emoji.p040ui.p319v3.model;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103757e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import jp3.C46566c;
import jp3.C9486a;
import kotlin.Metadata;
import p61.C35378f;
import rx3.C13598b0;
import te3.C101800k70;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BK\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012 \u0010\u000e\u001a\u001c\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/model/EmojiDesignerSinglePageSource;", "Landroidx/lifecycle/e;", "Ljp3/c;", "Ljp3/a;", "lifecycle", "", "designerUIN", "Lp61/f;", "lastData", "Lkotlin/Function2;", "", "Lte3/k70;", "", "Lrx3/b0;", "dataCallback", "<init>", "(Ljp3/c;ILp61/f;Lfy3/p;)V", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerSinglePageSource */
public final class EmojiDesignerSinglePageSource implements C103757e {

    /* renamed from: d */
    public int f80937d;

    /* renamed from: e */
    public final C35378f f80938e;

    /* renamed from: f */
    public final C32227p<List<? extends C101800k70>, Boolean, C13598b0> f80939f;

    /* renamed from: g */
    public final String f80940g;

    /* renamed from: h */
    public boolean f80941h;

    /* renamed from: i */
    public byte[] f80942i;

    /* renamed from: j */
    public boolean f80943j;

    /* renamed from: n */
    public boolean f80944n;

    /* renamed from: o */
    public boolean f80945o;

    /* renamed from: p */
    public final C0000n0 f80946p;

    @C91590f(mo125468c = "com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerSinglePageSource$load$1", mo125469f = "EmojiDesignerSinglePageSource.kt", mo125470l = {66}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerSinglePageSource$a */
    public static final class C29875a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f80947d;

        /* renamed from: e */
        public int f80948e;

        /* renamed from: f */
        public final /* synthetic */ EmojiDesignerSinglePageSource f80949f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29875a(EmojiDesignerSinglePageSource emojiDesignerSinglePageSource, C15601d<? super C29875a> dVar) {
            super(2, dVar);
            this.f80949f = emojiDesignerSinglePageSource;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C29875a(this.f80949f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C29875a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00a4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r12.f80948e
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x001c
                if (r1 != r3) goto L_0x0014
                java.lang.Object r0 = r12.f80947d
                j61.k r0 = (j61.C33520k) r0
                kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ c0 -> 0x0012 }
                goto L_0x003c
            L_0x0012:
                r13 = move-exception
                goto L_0x0045
            L_0x0014:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x001c:
                kotlin.ResultKt.throwOnFailure(r13)
                j61.k r13 = new j61.k
                r5 = 2
                com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerSinglePageSource r1 = r12.f80949f
                int r6 = r1.f80937d
                r7 = 0
                r9 = 0
                byte[] r10 = r1.f80942i
                java.lang.String r8 = ""
                r4 = r13
                r4.<init>(r5, r6, r7, r8, r9, r10)
                r12.f80947d = r13     // Catch:{ c0 -> 0x0041 }
                r12.f80948e = r3     // Catch:{ c0 -> 0x0041 }
                java.lang.Object r1 = p61.C35375d0.m40668a(r13, r12)     // Catch:{ c0 -> 0x0041 }
                if (r1 != r0) goto L_0x003b
                return r0
            L_0x003b:
                r0 = r13
            L_0x003c:
                com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerSinglePageSource r13 = r12.f80949f     // Catch:{ c0 -> 0x0012 }
                r13.f80944n = r3     // Catch:{ c0 -> 0x0012 }
                goto L_0x005a
            L_0x0041:
                r0 = move-exception
                r11 = r0
                r0 = r13
                r13 = r11
            L_0x0045:
                com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerSinglePageSource r1 = r12.f80949f
                r1.f80944n = r3
                int r4 = r13.f94713d
                if (r4 == 0) goto L_0x0050
                r5 = 4
                if (r4 != r5) goto L_0x005a
            L_0x0050:
                int r13 = r13.f94714e
                r4 = 2
                if (r13 == r4) goto L_0x0058
                r4 = 3
                if (r13 != r4) goto L_0x005a
            L_0x0058:
                r1.f80944n = r2
            L_0x005a:
                te3.vy1 r13 = r0.mo59184j1()
                com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerSinglePageSource r0 = r12.f80949f
                te3.qv3 r1 = r13.f143768e
                byte[] r1 = sf0.C48374j0.m53715d(r1)
                r0.f80942i = r1
                com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerSinglePageSource r0 = r12.f80949f
                java.lang.String r0 = r0.f80940g
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "load: size:"
                r1.append(r4)
                java.util.LinkedList<te3.k70> r4 = r13.f143767d
                int r4 = r4.size()
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerSinglePageSource r0 = r12.f80949f
                r0.f80943j = r2
                fy3.p<java.util.List<? extends te3.k70>, java.lang.Boolean, rx3.b0> r1 = r0.f80939f
                java.util.LinkedList<te3.k70> r13 = r13.f143767d
                boolean r0 = r0.f80941h
                r0 = r0 ^ r3
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r1.invoke(r13, r0)
                com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerSinglePageSource r13 = r12.f80949f
                boolean r0 = r13.f80941h
                if (r0 != 0) goto L_0x00a0
                r13.f80941h = r3
            L_0x00a0:
                boolean r0 = r13.f80945o
                if (r0 == 0) goto L_0x00a9
                r13.f80945o = r2
                r13.mo56963a()
            L_0x00a9:
                rx3.b0 r13 = rx3.C13598b0.f38549a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.p319v3.model.EmojiDesignerSinglePageSource.C29875a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public EmojiDesignerSinglePageSource(C46566c<C9486a> cVar, int i, C35378f fVar, C32227p<? super List<? extends C101800k70>, ? super Boolean, C13598b0> pVar) {
        List<C101800k70> list;
        C87412m.m108594g(cVar, "lifecycle");
        C87412m.m108594g(pVar, "dataCallback");
        this.f80937d = i;
        this.f80938e = fVar;
        this.f80939f = pVar;
        this.f80940g = "MicroMsg.EmojiDesignerSinglePageSource";
        this.f80946p = C53930o0.m60555b();
        Log.m105924i("MicroMsg.EmojiDesignerSinglePageSource", "create: " + fVar + ", " + Util.getStack());
        boolean z = false;
        if (!(fVar == null || (list = fVar.f94720a) == null || !(!list.isEmpty()))) {
            z = true;
        }
        if (z) {
            pVar.invoke(fVar.f94720a, Boolean.TRUE);
        }
    }

    /* renamed from: a */
    public final void mo56963a() {
        C35378f fVar = this.f80938e;
        if (fVar != null && !fVar.f94721b) {
            List<C101800k70> list = fVar.f94720a;
            if (list == null || list.isEmpty()) {
                this.f80942i = null;
                this.f80944n = true;
                this.f80939f.invoke(null, Boolean.FALSE);
            }
            String str = this.f80940g;
            Log.m105924i(str, "load: " + this.f80944n + ", " + this.f80943j);
            if (!this.f80944n && !this.f80943j) {
                this.f80943j = true;
                C53895h.m60466d(this.f80946p, (C66212f) null, (C53934p0) null, new C29875a(this, (C15601d<? super C29875a>) null), 3, (Object) null);
            }
        }
    }

    public /* synthetic */ void onCreate(C0125s sVar) {
    }

    public /* synthetic */ void onDestroy(C0125s sVar) {
    }

    public /* synthetic */ void onPause(C0125s sVar) {
    }

    public /* synthetic */ void onResume(C0125s sVar) {
    }

    public /* synthetic */ void onStart(C0125s sVar) {
    }

    public /* synthetic */ void onStop(C0125s sVar) {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EmojiDesignerSinglePageSource(C46566c cVar, int i, C35378f fVar, C32227p pVar, int i2, C8480h hVar) {
        this(cVar, i, (i2 & 4) != 0 ? null : fVar, pVar);
    }
}
