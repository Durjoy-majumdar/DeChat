package fu2;

import android.content.Context;
import android.view.ContextMenu;
import android.view.View;
import au2.C92093b;
import c00.C0405n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SnsReplyEvent;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.sns.model.C94965w1;
import com.tencent.p014mm.plugin.sns.p106ui.C96230u;
import com.tencent.p014mm.plugin.sns.p106ui.SnsLikesTextView;
import com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveInteractionLayout;
import com.tencent.p014mm.plugin.sns.p106ui.listener.C96049p0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import fy3.C32227p;
import gu2.C98214b;
import gv2.C98242p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.w64;
import uo3.C78253a;

/* renamed from: fu2.g */
public final class C98005g extends C97987a {

    /* renamed from: h */
    public final C98006a f287415h;

    /* renamed from: fu2.g$a */
    public static final class C98006a extends C96049p0 {

        /* renamed from: d */
        public final /* synthetic */ Context f287416d;

        /* renamed from: e */
        public final /* synthetic */ C98005g f287417e;

        public C98006a(Context context, C98005g gVar) {
            this.f287416d = context;
            this.f287417e = gVar;
        }

        /* renamed from: a */
        public void mo133570a(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            String str;
            SnsMethodCalculate.markStartTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$commentMenuListener$1");
            C87412m.m108594g(contextMenu, "menu");
            C87412m.m108594g(view, "v");
            if (view.getTag() instanceof C96230u) {
                Object tag = view.getTag();
                C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.CommentClickInfo");
                C96230u uVar = (C96230u) tag;
                if (!C98242p.m126942d(uVar.f281195e.f299716t, 64) && (!C98242p.m126942d(uVar.f281195e.f299716t, 16) || uVar.f281199i == 2)) {
                    contextMenu.add(0, 11, 0, this.f287416d.getString(C0966R.string.f7936wt));
                }
                if ((!Util.isNullOrNil(uVar.f281198h) && C87412m.m108589b(uVar.f281198h, C75592q0.m90789s())) || ((str = uVar.f281194d) != null && C87412m.m108589b(str, C75592q0.m90789s()))) {
                    contextMenu.add(0, 7, 0, this.f287416d.getString(C0966R.string.f7944x1));
                }
                if (!C98242p.m126942d(uVar.f281195e.f299716t, 16)) {
                    if (!uVar.mo133895b()) {
                        C94965w1.m120621b(contextMenu, false);
                    } else {
                        C94965w1.m120622c(contextMenu, false);
                    }
                }
                if (!((C0405n) C86312j.m106911c(C0405n.class)).mo279e()) {
                    contextMenu.add(0, 29, 0, this.f287416d.getString(C0966R.string.cwg));
                }
            }
            SnsMethodCalculate.markEndTimeMs("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$commentMenuListener$1");
        }

        /* renamed from: b */
        public boolean mo133571b(View view) {
            SnsMethodCalculate.markStartTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$commentMenuListener$1");
            C87412m.m108594g(view, "view");
            C98214b c = this.f287417e.mo137310c();
            if (c == null) {
                SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$commentMenuListener$1");
                return false;
            }
            this.f287417e.mo137312e().mo133554b(view, c.mo137503A2(), c.mo137509G2());
            SnsMethodCalculate.markEndTimeMs("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$commentMenuListener$1");
            return true;
        }
    }

    /* renamed from: fu2.g$b */
    public static final class C98007b extends C87413o implements C32227p<View, w64, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98005g f287418d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98007b(C98005g gVar) {
            super(2);
            this.f287418d = gVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$1");
            View view = (View) obj;
            w64 w64 = (w64) obj2;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$1");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(w64, FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
            String nullAsNil = Util.nullAsNil(w64.f299707h);
            if (C87412m.m108589b(w64.f299703d, C92093b.f263643a.mo126084a())) {
                C98005g gVar = this.f287418d;
                C87412m.m108593f(nullAsNil, "content");
                SnsMethodCalculate.markStartTimeMs("access$clickSelfComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
                gVar.getClass();
                SnsMethodCalculate.markStartTimeMs("clickSelfComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
                C98214b c = gVar.mo137310c();
                if (c == null) {
                    SnsMethodCalculate.markEndTimeMs("clickSelfComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
                } else {
                    C78253a aVar = new C78253a(gVar.mo137309b());
                    C98004f fVar = new C98004f(w64, gVar);
                    C98002e eVar = new C98002e(nullAsNil, gVar, c, w64, view);
                    int[] iArr = new int[2];
                    if (view.getTag(C0966R.C0970id.f359414kt0) instanceof int[]) {
                        Object tag = view.getTag(C0966R.C0970id.f359414kt0);
                        C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.IntArray");
                        iArr = (int[]) tag;
                    }
                    aVar.mo108273h(view, fVar, eVar, iArr[0], iArr[1]);
                    SnsMethodCalculate.markEndTimeMs("clickSelfComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
                }
                SnsMethodCalculate.markEndTimeMs("access$clickSelfComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
            } else {
                C98005g gVar2 = this.f287418d;
                SnsMethodCalculate.markStartTimeMs("access$clickOtherComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
                gVar2.getClass();
                SnsMethodCalculate.markStartTimeMs("clickOtherComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
                C98214b c2 = gVar2.mo137310c();
                if (c2 == null) {
                    SnsMethodCalculate.markEndTimeMs("clickOtherComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
                } else {
                    SnsReplyEvent snsReplyEvent = new SnsReplyEvent();
                    SnsReplyEvent.C92590a aVar2 = snsReplyEvent.f265189d;
                    aVar2.f265190a = c2;
                    aVar2.f265191b = w64;
                    aVar2.f265192c = view;
                    snsReplyEvent.publish();
                    SnsMethodCalculate.markEndTimeMs("clickOtherComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
                }
                SnsMethodCalculate.markEndTimeMs("access$clickOtherComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$1");
            return b0Var;
        }
    }

    /* renamed from: fu2.g$c */
    public static final class C98008c extends C87413o implements C32227p<View, w64, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98005g f287419d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98008c(C98005g gVar) {
            super(2);
            this.f287419d = gVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$2");
            View view = (View) obj;
            w64 w64 = (w64) obj2;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$2");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(w64, FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
            int[] iArr = new int[2];
            if (view.getTag(C0966R.C0970id.f359414kt0) instanceof int[]) {
                Object tag = view.getTag(C0966R.C0970id.f359414kt0);
                C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.IntArray");
                iArr = (int[]) tag;
            }
            C98214b c = this.f287419d.mo137310c();
            C87412m.m108591d(c);
            view.setTag(new C96230u(c.mo137503A2(), c.mo137504B2(), w64, w64.f299703d, w64.f299707h, (View) null, 1, c.getUserName(), c.mo137509G2().f283893Id));
            C78253a f = this.f287419d.mo137313f();
            C98005g gVar = this.f287419d;
            SnsMethodCalculate.markStartTimeMs("access$getCommentMenuListener$p", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
            C98006a aVar = gVar.f287415h;
            SnsMethodCalculate.markEndTimeMs("access$getCommentMenuListener$p", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
            f.mo108273h(view, aVar, this.f287419d.mo137312e(), iArr[0], iArr[1]);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$2");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$2");
            return b0Var;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98005g(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f287415h = new C98006a(context, this);
    }

    /* renamed from: k */
    public void mo137317k(View view, boolean z, boolean z2, boolean z3) {
        SnsMethodCalculate.markStartTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
        if (view instanceof ImproveInteractionLayout) {
            ImproveInteractionLayout improveInteractionLayout = (ImproveInteractionLayout) view;
            SnsLikesTextView likeLayout = improveInteractionLayout.getLikeLayout();
            C98214b c = mo137310c();
            likeLayout.setLikeTvTag(c != null ? c.mo137507E2() : null);
            improveInteractionLayout.setCommentClickListener(new C98007b(this));
            improveInteractionLayout.setCommentLongClickListener(new C98008c(this));
        }
        SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
    }
}
