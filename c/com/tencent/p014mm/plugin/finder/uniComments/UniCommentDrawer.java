package com.tencent.p014mm.plugin.finder.uniComments;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawer;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import lq1.C61355g;
import qq1.C63317a;
import sq1.C64147b;
import up1.C37521f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001mB\u001b\b\u0016\u0012\u0006\u0010f\u001a\u00020e\u0012\b\u0010h\u001a\u0004\u0018\u00010g¢\u0006\u0004\bi\u0010jB#\b\u0016\u0012\u0006\u0010f\u001a\u00020e\u0012\b\u0010h\u001a\u0004\u0018\u00010g\u0012\u0006\u0010k\u001a\u00020\u0012¢\u0006\u0004\bi\u0010lR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\"\u0010!\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010.\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\"\"\u0004\b/\u0010$R\"\u00103\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b0\u0010 \u001a\u0004\b1\u0010\"\"\u0004\b2\u0010$R\"\u00106\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010 \u001a\u0004\b4\u0010\"\"\u0004\b5\u0010$R\"\u00109\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010 \u001a\u0004\b7\u0010\"\"\u0004\b8\u0010$R\"\u0010=\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b:\u0010 \u001a\u0004\b;\u0010\"\"\u0004\b<\u0010$R$\u0010E\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010I\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bF\u0010 \u001a\u0004\bG\u0010\"\"\u0004\bH\u0010$R$\u0010Q\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010U\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bR\u0010 \u001a\u0004\bS\u0010\"\"\u0004\bT\u0010$R\"\u0010Y\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bV\u0010\u0014\u001a\u0004\bW\u0010\u0016\"\u0004\bX\u0010\u0018R\"\u0010[\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bZ\u0010 \u001a\u0004\b[\u0010\"\"\u0004\b\\\u0010$R*\u0010d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010]8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010c¨\u0006n"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/uniComments/UniCommentDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawer;", "Lqq1/a;", "A", "Lqq1/a;", "getFeedObj", "()Lqq1/a;", "setFeedObj", "(Lqq1/a;)V", "feedObj", "", "B", "J", "getRefCommentId", "()J", "setRefCommentId", "(J)V", "refCommentId", "", "C", "I", "getScene", "()I", "setScene", "(I)V", "scene", "D", "getSceneForReply", "setSceneForReply", "sceneForReply", "", "E", "Z", "isSelfProfile", "()Z", "setSelfProfile", "(Z)V", "Llq1/g;", "F", "Llq1/g;", "getOnCloseDrawerCallback", "()Llq1/g;", "setOnCloseDrawerCallback", "(Llq1/g;)V", "onCloseDrawerCallback", "G", "isSingleMode", "setSingleMode", "H", "getUseCache", "setUseCache", "useCache", "getShowFooter", "setShowFooter", "showFooter", "getCloseComment", "setCloseComment", "closeComment", "K", "getOldVersion", "setOldVersion", "oldVersion", "Lsq1/b;", "L", "Lsq1/b;", "getReplyCommentObj", "()Lsq1/b;", "setReplyCommentObj", "(Lsq1/b;)V", "replyCommentObj", "M", "getBlinkRefComment", "setBlinkRefComment", "blinkRefComment", "Lcom/tencent/mm/plugin/finder/uniComments/UniCommentFooter;", "N", "Lcom/tencent/mm/plugin/finder/uniComments/UniCommentFooter;", "getFooter", "()Lcom/tencent/mm/plugin/finder/uniComments/UniCommentFooter;", "setFooter", "(Lcom/tencent/mm/plugin/finder/uniComments/UniCommentFooter;)V", "footer", "P", "getBanSwitch", "setBanSwitch", "banSwitch", "Q", "getReason", "setReason", "reason", "R", "isOnlyShowDesc", "setOnlyShowDesc", "Lkotlin/Function0;", "S", "Lfy3/a;", "getInterceptClose", "()Lfy3/a;", "setInterceptClose", "(Lfy3/a;)V", "interceptClose", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer */
public final class UniCommentDrawer extends RecyclerViewDrawer {

    /* renamed from: T */
    public static final /* synthetic */ int f161350T = 0;

    /* renamed from: A */
    public C63317a f161351A;

    /* renamed from: B */
    public long f161352B;

    /* renamed from: C */
    public int f161353C = 2;

    /* renamed from: D */
    public int f161354D = C37521f.f99374d.mo61154H();

    /* renamed from: E */
    public boolean f161355E;

    /* renamed from: F */
    public C61355g f161356F;

    /* renamed from: G */
    public boolean f161357G;

    /* renamed from: H */
    public boolean f161358H;

    /* renamed from: I */
    public boolean f161359I = true;

    /* renamed from: J */
    public boolean f161360J;

    /* renamed from: K */
    public boolean f161361K = true;

    /* renamed from: L */
    public C64147b f161362L;

    /* renamed from: M */
    public boolean f161363M;

    /* renamed from: N */
    public UniCommentFooter f161364N;

    /* renamed from: P */
    public boolean f161365P;

    /* renamed from: Q */
    public int f161366Q;

    /* renamed from: R */
    public boolean f161367R;

    /* renamed from: S */
    public C32224a<Boolean> f161368S;

    /* renamed from: z */
    public final Rect f161369z = new Rect();

    /* renamed from: com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer$a */
    public interface C56448a {
        /* renamed from: a */
        void mo79221a(Context context, FrameLayout frameLayout, boolean z);

        /* renamed from: b */
        void mo79222b(Context context, RefreshLoadMoreLayout refreshLoadMoreLayout);

        /* renamed from: c */
        void mo79223c(Context context, FrameLayout frameLayout, boolean z);

        /* renamed from: d */
        void mo79224d(Context context, FrameLayout frameLayout);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UniCommentDrawer(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        if (this.f161357G) {
            View findViewById = getFooterLayout().findViewById(C0966R.C0970id.bji);
            this.f161369z.setEmpty();
            findViewById.getGlobalVisibleRect(this.f161369z);
            if (((float) this.f161369z.top) > motionEvent.getY()) {
                if (motionEvent.getAction() == 2 || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    mo79202l();
                } else if (motionEvent.getAction() == 0) {
                    super.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        } else {
            View findViewById2 = getHeaderLayout().findViewById(C0966R.C0970id.d7u);
            this.f161369z.setEmpty();
            findViewById2.getGlobalVisibleRect(this.f161369z);
            Log.m105918d("MicroMsg.MusicUni.CommentDrawer", "event.action " + motionEvent.getActionMasked() + " event.y " + motionEvent.getY() + ", " + this.f161369z.top + ", " + this.f161369z.bottom);
            if (motionEvent.getY() < ((float) this.f161369z.top) || motionEvent.getY() > ((float) this.f161369z.bottom)) {
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
        return this.f161365P;
    }

    public final boolean getBlinkRefComment() {
        return this.f161363M;
    }

    public final boolean getCloseComment() {
        return this.f161360J;
    }

    public final C63317a getFeedObj() {
        return this.f161351A;
    }

    public final UniCommentFooter getFooter() {
        return this.f161364N;
    }

    public final C32224a<Boolean> getInterceptClose() {
        return this.f161368S;
    }

    public final boolean getOldVersion() {
        return this.f161361K;
    }

    public final C61355g getOnCloseDrawerCallback() {
        return this.f161356F;
    }

    public final int getReason() {
        return this.f161366Q;
    }

    public final long getRefCommentId() {
        return this.f161352B;
    }

    public final C64147b getReplyCommentObj() {
        return this.f161362L;
    }

    public final int getScene() {
        return this.f161353C;
    }

    public final int getSceneForReply() {
        return this.f161354D;
    }

    public final boolean getShowFooter() {
        return this.f161359I;
    }

    public final boolean getUseCache() {
        return this.f161358H;
    }

    /* renamed from: l */
    public final void mo79202l() {
        if (mo82541i()) {
            if (this.f161357G) {
                mo82540h(false);
            } else {
                mo82540h(true);
            }
            View findViewById = getHeaderLayout().findViewById(C0966R.C0970id.d7u);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawer", "closeDrawer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/uniComments/UniCommentDrawer", "closeDrawer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void setBanSwitch(boolean z) {
        this.f161365P = z;
    }

    public final void setBlinkRefComment(boolean z) {
        this.f161363M = z;
    }

    public final void setCloseComment(boolean z) {
        this.f161360J = z;
    }

    public final void setFeedObj(C63317a aVar) {
        this.f161351A = aVar;
    }

    public final void setFooter(UniCommentFooter uniCommentFooter) {
        this.f161364N = uniCommentFooter;
    }

    public final void setInterceptClose(C32224a<Boolean> aVar) {
        this.f161368S = aVar;
    }

    public final void setOldVersion(boolean z) {
        this.f161361K = z;
    }

    public final void setOnCloseDrawerCallback(C61355g gVar) {
        this.f161356F = gVar;
    }

    public final void setOnlyShowDesc(boolean z) {
        this.f161367R = z;
    }

    public final void setReason(int i) {
        this.f161366Q = i;
    }

    public final void setRefCommentId(long j) {
        this.f161352B = j;
    }

    public final void setReplyCommentObj(C64147b bVar) {
        this.f161362L = bVar;
    }

    public final void setScene(int i) {
        this.f161353C = i;
    }

    public final void setSceneForReply(int i) {
        this.f161354D = i;
    }

    public final void setSelfProfile(boolean z) {
        this.f161355E = z;
    }

    public final void setShowFooter(boolean z) {
        this.f161359I = z;
    }

    public final void setSingleMode(boolean z) {
        this.f161357G = z;
    }

    public final void setUseCache(boolean z) {
        this.f161358H = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UniCommentDrawer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UniCommentDrawer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
