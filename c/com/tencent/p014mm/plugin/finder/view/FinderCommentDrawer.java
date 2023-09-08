package com.tencent.p014mm.plugin.finder.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter;
import com.tencent.p014mm.plugin.finder.presenter.contract.CommentDrawerContract;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.emoji.FinderEmojiPickView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawer;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58784w3;
import er1.C7865r3;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C8808v4;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import kotlin.Metadata;
import rs1.C13442s8;
import up1.C37521f;
import up1.C65426w0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002yzB\u001b\b\u0016\u0012\u0006\u0010r\u001a\u00020q\u0012\b\u0010t\u001a\u0004\u0018\u00010s¢\u0006\u0004\bu\u0010vB#\b\u0016\u0012\u0006\u0010r\u001a\u00020q\u0012\b\u0010t\u001a\u0004\u0018\u00010s\u0012\u0006\u0010w\u001a\u00020\u0012¢\u0006\u0004\bu\u0010xR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\"\u0010!\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010.\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\"\"\u0004\b/\u0010$R\"\u00103\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u0010 \u001a\u0004\b1\u0010\"\"\u0004\b2\u0010$R\"\u00106\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010 \u001a\u0004\b4\u0010\"\"\u0004\b5\u0010$R\"\u00109\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010 \u001a\u0004\b7\u0010\"\"\u0004\b8\u0010$R\"\u0010=\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b:\u0010 \u001a\u0004\b;\u0010\"\"\u0004\b<\u0010$R$\u0010E\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010I\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bF\u0010 \u001a\u0004\bG\u0010\"\"\u0004\bH\u0010$R\"\u0010M\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bJ\u0010\f\u001a\u0004\bK\u0010\u000e\"\u0004\bL\u0010\u0010R$\u0010U\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010Y\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bV\u0010 \u001a\u0004\bW\u0010\"\"\u0004\bX\u0010$R\"\u0010]\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bZ\u0010\u0014\u001a\u0004\b[\u0010\u0016\"\u0004\b\\\u0010\u0018R\"\u0010_\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b^\u0010 \u001a\u0004\b_\u0010\"\"\u0004\b`\u0010$R$\u0010h\u001a\u0004\u0018\u00010a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR*\u0010p\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010i8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o¨\u0006{"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderCommentDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawer;", "Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "A", "Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "getFeedObj", "()Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "setFeedObj", "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "feedObj", "", "B", "J", "getRefCommentId", "()J", "setRefCommentId", "(J)V", "refCommentId", "", "C", "I", "getScene", "()I", "setScene", "(I)V", "scene", "D", "getSceneForReply", "setSceneForReply", "sceneForReply", "", "E", "Z", "isSelfProfile", "()Z", "setSelfProfile", "(Z)V", "Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract$CloseDrawerCallback;", "F", "Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract$CloseDrawerCallback;", "getOnCloseDrawerCallback", "()Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract$CloseDrawerCallback;", "setOnCloseDrawerCallback", "(Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract$CloseDrawerCallback;)V", "onCloseDrawerCallback", "G", "isSingleMode", "setSingleMode", "H", "getUseCache", "setUseCache", "useCache", "getShowFooter", "setShowFooter", "showFooter", "getCloseComment", "setCloseComment", "closeComment", "K", "getOldVersion", "setOldVersion", "oldVersion", "Lup1/w0;", "L", "Lup1/w0;", "getReplyCommentObj", "()Lup1/w0;", "setReplyCommentObj", "(Lup1/w0;)V", "replyCommentObj", "M", "getBlinkRefComment", "setBlinkRefComment", "blinkRefComment", "N", "getBlinkDuration", "setBlinkDuration", "blinkDuration", "Lcom/tencent/mm/plugin/finder/view/FinderCommentFooter;", "P", "Lcom/tencent/mm/plugin/finder/view/FinderCommentFooter;", "getFooter", "()Lcom/tencent/mm/plugin/finder/view/FinderCommentFooter;", "setFooter", "(Lcom/tencent/mm/plugin/finder/view/FinderCommentFooter;)V", "footer", "Q", "getBanSwitch", "setBanSwitch", "banSwitch", "R", "getReason", "setReason", "reason", "S", "isOnlyShowDesc", "setOnlyShowDesc", "Lcom/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter;", "T", "Lcom/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter;", "getPresenter", "()Lcom/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter;", "setPresenter", "(Lcom/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter;)V", "presenter", "Lkotlin/Function0;", "U", "Lfy3/a;", "getInterceptClose", "()Lfy3/a;", "setInterceptClose", "(Lfy3/a;)V", "interceptClose", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentDrawer */
public final class FinderCommentDrawer extends RecyclerViewDrawer {

    /* renamed from: V */
    public static final C56551b f162026V = new C56551b((C8480h) null);

    /* renamed from: A */
    public FinderItem f162027A;

    /* renamed from: B */
    public long f162028B;

    /* renamed from: C */
    public int f162029C = 2;

    /* renamed from: D */
    public int f162030D = C37521f.f99374d.mo61154H();

    /* renamed from: E */
    public boolean f162031E;

    /* renamed from: F */
    public CommentDrawerContract.CloseDrawerCallback f162032F;

    /* renamed from: G */
    public boolean f162033G;

    /* renamed from: H */
    public boolean f162034H = (!((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e());

    /* renamed from: I */
    public boolean f162035I = true;

    /* renamed from: J */
    public boolean f162036J;

    /* renamed from: K */
    public boolean f162037K = true;

    /* renamed from: L */
    public C65426w0 f162038L;

    /* renamed from: M */
    public boolean f162039M;

    /* renamed from: N */
    public long f162040N = 1000;

    /* renamed from: P */
    public FinderCommentFooter f162041P;

    /* renamed from: Q */
    public boolean f162042Q;

    /* renamed from: R */
    public int f162043R;

    /* renamed from: S */
    public boolean f162044S;

    /* renamed from: T */
    public FinderCommentDrawerPresenter f162045T;

    /* renamed from: U */
    public C32224a<Boolean> f162046U;

    /* renamed from: z */
    public final Rect f162047z = new Rect();

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentDrawer$a */
    public interface C56550a {
        /* renamed from: a */
        void mo79737a(Context context, FrameLayout frameLayout, boolean z);

        /* renamed from: b */
        void mo79738b(Context context, RefreshLoadMoreLayout refreshLoadMoreLayout);

        /* renamed from: c */
        void mo79739c(Context context, FrameLayout frameLayout, boolean z);

        /* renamed from: d */
        void mo79740d(Context context, FrameLayout frameLayout);

        /* renamed from: h */
        void mo79741h(RecyclerViewDrawer recyclerViewDrawer, int i);
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderCommentDrawer$b */
    public static final class C56551b {
        public C56551b(C8480h hVar) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: ur1.g} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.tencent.p014mm.plugin.finder.view.FinderCommentDrawer m65197a(com.tencent.p014mm.plugin.finder.view.FinderCommentDrawer.C56551b r10, com.tencent.p014mm.p136ui.MMFragmentActivity r11, android.view.View r12, int r13, com.tencent.p014mm.plugin.finder.view.FinderCommentDrawer.C56550a r14, boolean r15, boolean r16, int r17, int r18, java.lang.Object r19) {
            /*
                r1 = r11
                r7 = r12
                r0 = r18 & 8
                if (r0 == 0) goto L_0x0012
                ur1.g r0 = new ur1.g
                com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r2 = new com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter
                r2.<init>(r11)
                r0.<init>(r2)
                r5 = r0
                goto L_0x0013
            L_0x0012:
                r5 = r14
            L_0x0013:
                r0 = r18 & 16
                r2 = 0
                if (r0 == 0) goto L_0x001a
                r0 = 0
                goto L_0x001b
            L_0x001a:
                r0 = r15
            L_0x001b:
                r3 = r18 & 64
                if (r3 == 0) goto L_0x0022
                r3 = 58
                goto L_0x0024
            L_0x0022:
                r3 = r17
            L_0x0024:
                r10.getClass()
                java.lang.String r4 = "context"
                gy3.C87412m.m108594g(r11, r4)
                java.lang.String r4 = "parent"
                gy3.C87412m.m108594g(r12, r4)
                java.lang.String r4 = "builder"
                gy3.C87412m.m108594g(r5, r4)
                com.tencent.mm.plugin.finder.view.FinderCommentDrawer r8 = new com.tencent.mm.plugin.finder.view.FinderCommentDrawer
                r8.<init>(r11)
                r4 = 2131101688(0x7f0607f8, float:1.7815793E38)
                if (r16 == 0) goto L_0x004a
                int r6 = com.tencent.p014mm.p136ui.C85875k4.m106200p(r11)
                r8.setTopOffset(r6)
                r8.setBackgroundColorRes(r4)
            L_0x004a:
                up1.f r6 = up1.C37521f.f99374d
                r6.getClass()
                pe1.c<java.lang.Integer> r6 = up1.C37521f.f99579z7
                java.lang.Object r6 = r6.mo60266n()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                r9 = 1
                if (r6 != r9) goto L_0x0060
                r6 = 1
                goto L_0x0061
            L_0x0060:
                r6 = 0
            L_0x0061:
                if (r6 == 0) goto L_0x0069
                r8.setChangeBackgroundAlpha(r2)
                r8.setBackgroundColorRes(r4)
            L_0x0069:
                float r2 = (float) r9
                ds1.a r4 = ds1.C7515a.f25777a
                float r4 = r4.mo8637a(r11)
                float r2 = r2 - r4
                er1.r3 r4 = er1.C7865r3.f26468a
                int r4 = r4.mo8969b(r11)
                float r4 = (float) r4
                float r4 = r4 * r2
                int r2 = (int) r4
                r8.setTopOffset(r2)
                r2 = r13
                r5.mo79741h(r8, r13)
                boolean r2 = r5 instanceof ur1.C65468g
                r4 = 0
                if (r2 == 0) goto L_0x008b
                r2 = r5
                ur1.g r2 = (ur1.C65468g) r2
                goto L_0x008c
            L_0x008b:
                r2 = r4
            L_0x008c:
                if (r2 == 0) goto L_0x0091
                com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r2 = r2.f188399d
                goto L_0x0092
            L_0x0091:
                r2 = r4
            L_0x0092:
                boolean r6 = r2 instanceof com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter
                if (r6 == 0) goto L_0x0099
                r4 = r2
                com.tencent.mm.plugin.finder.feed.FinderCommentDrawerPresenter r4 = (com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter) r4
            L_0x0099:
                if (r4 == 0) goto L_0x00a2
                r4.f158616e = r3
                r4.f158598A = r0
                r8.setPresenter(r4)
            L_0x00a2:
                android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
                r0 = -1
                r4.<init>(r0, r0)
                com.tencent.mm.plugin.finder.view.f1 r9 = new com.tencent.mm.plugin.finder.view.f1
                r0 = r9
                r1 = r11
                r2 = r12
                r3 = r8
                r6 = r16
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r12.post(r9)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.FinderCommentDrawer.C56551b.m65197a(com.tencent.mm.plugin.finder.view.FinderCommentDrawer$b, com.tencent.mm.ui.MMFragmentActivity, android.view.View, int, com.tencent.mm.plugin.finder.view.FinderCommentDrawer$a, boolean, boolean, int, int, java.lang.Object):com.tencent.mm.plugin.finder.view.FinderCommentDrawer");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderCommentDrawer(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: m */
    public static void m65189m(FinderCommentDrawer finderCommentDrawer, FinderItem finderItem, boolean z, long j, boolean z2, boolean z3, C65426w0 w0Var, boolean z4, boolean z5, int i, boolean z6, long j2, int i2, int i3, int i4, Object obj) {
        boolean z7;
        int i5;
        boolean z8;
        FinderCommentDrawer finderCommentDrawer2 = finderCommentDrawer;
        FinderItem finderItem2 = finderItem;
        int i6 = i4;
        boolean z9 = (i6 & 2) != 0 ? false : z;
        long j3 = (i6 & 4) != 0 ? 0 : j;
        boolean z15 = (i6 & 8) != 0 ? false : z2;
        boolean z16 = (i6 & 16) != 0 ? true : z3;
        C65426w0 w0Var2 = (i6 & 32) != 0 ? null : w0Var;
        boolean z17 = (i6 & 128) != 0 ? false : z5;
        int i7 = (i6 & 256) != 0 ? 0 : i;
        boolean z18 = (i6 & 512) != 0 ? false : z6;
        long j4 = (i6 & 1024) != 0 ? 1000 : j2;
        int i8 = (i6 & 2048) != 0 ? 0 : i2;
        int i9 = (i6 & 4096) != 0 ? 0 : i3;
        finderCommentDrawer.getClass();
        C87412m.m108594g(finderItem2, "feedObj");
        C117407d.INSTANCE.idkeyStat(1278, 6, 1, false);
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context = finderCommentDrawer.getContext();
        C87412m.m108593f(context, "context");
        C13442s8 f = aVar.mo12873f(context);
        if (f != null) {
            int i15 = 4;
            if (i7 != 4) {
                i15 = j3 == 0 ? 1 : 2;
            }
            i5 = i9;
            z7 = z15;
            ((C58417y0) C86312j.m106911c(C58417y0.class)).Xx0(f.f38096i, f.f38098n, f.f38100p, finderItem.getId(), i15);
        } else {
            i5 = i9;
            z7 = z15;
        }
        finderCommentDrawer2.f162044S = z18;
        if (z18) {
            finderCommentDrawer2.f162035I = false;
            finderCommentDrawer2.setTopOffset((int) (((double) finderCommentDrawer.getContext().getResources().getDisplayMetrics().heightPixels) * 0.5d));
        } else {
            finderCommentDrawer2.f162035I = z16;
        }
        Log.m105924i("Finder.CommentDrawer", "CommentInvisibleDebug isOnlyShowDesc=" + z18 + " showFooter=" + finderCommentDrawer2.f162035I);
        if (i8 > 0) {
            int f2 = C75044y4.m89994f(finderCommentDrawer.getContext());
            int e = C75044y4.m89993e(finderCommentDrawer.getContext());
            C7865r3 r3Var = C7865r3.f26468a;
            int a = (r3Var.mo8968a() - f2) - e;
            Context context2 = finderCommentDrawer.getContext();
            C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
            View decorView = ((Activity) context2).getWindow().getDecorView();
            C87412m.m108593f(decorView, "context as Activity).window.decorView");
            finderCommentDrawer2.setTopOffset((decorView.getSystemUiVisibility() & 1024) > 0 ? r3Var.mo8969b(finderCommentDrawer.getContext()) - i8 : Math.min((int) (((float) r3Var.mo8968a()) * 0.4f), (a - i8) + f2));
        }
        finderCommentDrawer2.f162036J = false;
        finderCommentDrawer2.f162037K = finderItem.isOldVersion();
        finderCommentDrawer2.f162042Q = z17;
        finderCommentDrawer2.f162043R = i7;
        FinderCommentFooter finderCommentFooter = finderCommentDrawer2.f162041P;
        if (finderCommentFooter != null) {
            finderCommentFooter.setBanSwitchScene(z17);
        }
        FinderCommentFooter finderCommentFooter2 = finderCommentDrawer2.f162041P;
        FinderEmojiPickView quickPickEmoji = finderCommentFooter2 != null ? finderCommentFooter2.getQuickPickEmoji() : null;
        if (quickPickEmoji != null) {
            quickPickEmoji.setPickEmojiStr("");
        }
        FinderCommentFooter finderCommentFooter3 = finderCommentDrawer2.f162041P;
        if (finderCommentFooter3 != null) {
            int i16 = FinderCommentFooter.f162048Q;
            finderCommentFooter3.mo79778l(true);
        }
        if (finderItem.isCommentClose()) {
            StringBuilder sb = new StringBuilder();
            sb.append("CommentInvisibleDebug isCommentClose=");
            sb.append(finderItem.isCommentClose());
            sb.append(" isSelf=");
            C58784w3 w3Var = C58784w3.f168295a;
            sb.append(w3Var.mo83899R0(finderItem2.field_username));
            sb.append(" isSingleMode=");
            sb.append(z9);
            sb.append(" showFooter=false");
            Log.m105924i("Finder.CommentDrawer", sb.toString());
            if (!w3Var.mo83899R0(finderItem2.field_username) || z9) {
                z8 = true;
                finderCommentDrawer2.f162036J = true;
                finderCommentDrawer2.f162035I = false;
            } else {
                z8 = true;
                finderCommentDrawer2.f162036J = true;
                finderCommentDrawer2.f162035I = false;
            }
        } else {
            z8 = true;
        }
        C37521f fVar = C37521f.f99374d;
        if (fVar.mo61156J() > 0) {
            fVar.mo61178d0(fVar.mo61156J() - (z8 ? 1 : 0));
        }
        finderCommentDrawer2.mo79716n(z8);
        if (!finderCommentDrawer.mo82541i()) {
            finderCommentDrawer2.f162027A = finderItem2;
            finderCommentDrawer2.f162028B = j3;
            finderCommentDrawer2.f162033G = z9;
            finderCommentDrawer2.f162038L = w0Var2;
            finderCommentDrawer2.f162039M = z7;
            finderCommentDrawer2.f162040N = j4;
            if (z9) {
                finderCommentDrawer2.mo82542j(false, z8, i5);
                return;
            }
            int i17 = i5;
            boolean z19 = false;
            if (j3 == 0) {
                z19 = true;
            }
            finderCommentDrawer2.mo82542j(z8, z19, i17);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        if (this.f162033G) {
            View findViewById = getFooterLayout().findViewById(C0966R.C0970id.bji);
            this.f162047z.setEmpty();
            findViewById.getGlobalVisibleRect(this.f162047z);
            if (((float) this.f162047z.top) > motionEvent.getY()) {
                if (motionEvent.getAction() == 2 || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    mo79715l();
                } else if (motionEvent.getAction() == 0) {
                    super.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        } else {
            View findViewById2 = getHeaderLayout().findViewById(C0966R.C0970id.d7u);
            this.f162047z.setEmpty();
            findViewById2.getGlobalVisibleRect(this.f162047z);
            Log.m105918d("Finder.CommentDrawer", "event.action " + motionEvent.getActionMasked() + " event.y " + motionEvent.getY() + ", " + this.f162047z.top + ", " + this.f162047z.bottom);
            if (motionEvent.getY() < ((float) this.f162047z.top) || motionEvent.getY() > ((float) this.f162047z.bottom)) {
                findViewById2.setPressed(false);
            } else if (motionEvent.getActionMasked() != 2) {
                return findViewById2.dispatchTouchEvent(motionEvent);
            }
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (this.f165681u && motionEvent.getAction() == 0) {
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            ((MMFragmentActivity) context).hideVKB();
        }
        return dispatchTouchEvent;
    }

    public final boolean getBanSwitch() {
        return this.f162042Q;
    }

    public final long getBlinkDuration() {
        return this.f162040N;
    }

    public final boolean getBlinkRefComment() {
        return this.f162039M;
    }

    public final boolean getCloseComment() {
        return this.f162036J;
    }

    public final FinderItem getFeedObj() {
        return this.f162027A;
    }

    public final FinderCommentFooter getFooter() {
        return this.f162041P;
    }

    public final C32224a<Boolean> getInterceptClose() {
        return this.f162046U;
    }

    public final boolean getOldVersion() {
        return this.f162037K;
    }

    public final CommentDrawerContract.CloseDrawerCallback getOnCloseDrawerCallback() {
        return this.f162032F;
    }

    public final FinderCommentDrawerPresenter getPresenter() {
        return this.f162045T;
    }

    public final int getReason() {
        return this.f162043R;
    }

    public final long getRefCommentId() {
        return this.f162028B;
    }

    public final C65426w0 getReplyCommentObj() {
        return this.f162038L;
    }

    public final int getScene() {
        return this.f162029C;
    }

    public final int getSceneForReply() {
        return this.f162030D;
    }

    public final boolean getShowFooter() {
        return this.f162035I;
    }

    public final boolean getUseCache() {
        return this.f162034H;
    }

    /* renamed from: l */
    public final void mo79715l() {
        if (mo82541i()) {
            if (this.f162033G) {
                mo82540h(false);
            } else {
                mo82540h(true);
            }
            View findViewById = getHeaderLayout().findViewById(C0966R.C0970id.d7u);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderCommentDrawer", "closeDrawer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/view/FinderCommentDrawer", "closeDrawer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
            Context context = getContext();
            C87412m.m108593f(context, "context");
            C13442s8 f = aVar2.mo12873f(context);
            if (f != null) {
                C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
                int i = f.f38096i;
                String str = f.f38098n;
                String str2 = f.f38100p;
                FinderItem finderItem = this.f162027A;
                y0Var.Xx0(i, str, str2, finderItem != null ? finderItem.getId() : 0, 3);
            }
        }
    }

    /* renamed from: n */
    public final void mo79716n(boolean z) {
        if (this.f162031E) {
            this.f162030D = this.f162029C;
            Log.m105924i("Finder.CommentDrawer", "refreshSceneForReply isSelfProfile " + this.f162029C);
        } else {
            C37521f fVar = C37521f.f99374d;
            int H = fVar.mo61154H();
            this.f162030D = H;
            boolean z2 = false;
            boolean z3 = H == 2;
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_HAS_COMMENT_CHANGE_SCENE_BOOLEAN_SYNC;
            boolean g = i.mo119686g(aVar, false);
            boolean U0 = C58784w3.f168295a.mo83904U0();
            fVar.getClass();
            boolean z4 = C37521f.f99469n8.mo60266n().intValue() == 1;
            Log.m105924i("Finder.CommentDrawer", "needForceChangeScene isWxScene:" + z3 + ", hasChange:" + g + ", showAtWxProfile:" + U0 + ", open:" + z4);
            if (!g && z3 && U0 && z4) {
                z2 = true;
            }
            if (z2) {
                this.f162030D = 1;
                fVar.mo61176c0(1);
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
            }
        }
        FinderCommentFooter finderCommentFooter = this.f162041P;
        if (finderCommentFooter != null) {
            finderCommentFooter.setScene(this.f162030D);
        }
        FinderCommentFooter finderCommentFooter2 = this.f162041P;
        if (finderCommentFooter2 != null) {
            finderCommentFooter2.mo79777k(z);
        }
    }

    public final void setBanSwitch(boolean z) {
        this.f162042Q = z;
    }

    public final void setBlinkDuration(long j) {
        this.f162040N = j;
    }

    public final void setBlinkRefComment(boolean z) {
        this.f162039M = z;
    }

    public final void setCloseComment(boolean z) {
        this.f162036J = z;
    }

    public final void setFeedObj(FinderItem finderItem) {
        this.f162027A = finderItem;
    }

    public final void setFooter(FinderCommentFooter finderCommentFooter) {
        this.f162041P = finderCommentFooter;
    }

    public final void setInterceptClose(C32224a<Boolean> aVar) {
        this.f162046U = aVar;
    }

    public final void setOldVersion(boolean z) {
        this.f162037K = z;
    }

    public final void setOnCloseDrawerCallback(CommentDrawerContract.CloseDrawerCallback closeDrawerCallback) {
        this.f162032F = closeDrawerCallback;
    }

    public final void setOnlyShowDesc(boolean z) {
        this.f162044S = z;
    }

    public final void setPresenter(FinderCommentDrawerPresenter finderCommentDrawerPresenter) {
        this.f162045T = finderCommentDrawerPresenter;
    }

    public final void setReason(int i) {
        this.f162043R = i;
    }

    public final void setRefCommentId(long j) {
        this.f162028B = j;
    }

    public final void setReplyCommentObj(C65426w0 w0Var) {
        this.f162038L = w0Var;
    }

    public final void setScene(int i) {
        this.f162029C = i;
    }

    public final void setSceneForReply(int i) {
        this.f162030D = i;
    }

    public final void setSelfProfile(boolean z) {
        this.f162031E = z;
    }

    public final void setShowFooter(boolean z) {
        this.f162035I = z;
    }

    public final void setSingleMode(boolean z) {
        this.f162033G = z;
    }

    public final void setUseCache(boolean z) {
        this.f162034H = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderCommentDrawer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderCommentDrawer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
