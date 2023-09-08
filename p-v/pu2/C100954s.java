package pu2;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SnsJumpProfileEvent;
import com.tencent.p014mm.kiss.widget.textview.PLSysTextView;
import com.tencent.p014mm.plugin.sns.p106ui.C71253l1;
import com.tencent.p014mm.plugin.sns.p106ui.C96113p5;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsLikesTextView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTranslateResultView;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.item.improve.recycle.TimelineCommentView;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsPostDescPreloadTextView;
import gy3.C87412m;
import java.util.LinkedList;
import kg3.C76577a;
import nj3.C76879j;
import te3.C101789j00;
import te3.C101804kv2;
import uo3.C78253a;
import vr2.C102236a0;

/* renamed from: pu2.s */
public abstract class C100954s extends C100957s0 {

    /* renamed from: S0 */
    public static final /* synthetic */ int f295624S0 = 0;

    /* renamed from: pu2.s$b */
    public static final class C62550b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public static final C62550b f177652d = new C62550b();

        public final void onCancel(DialogInterface dialogInterface) {
            SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$showFeedDetailDialog$2");
            SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$showFeedDetailDialog$2");
        }
    }

    /* renamed from: pu2.s$a */
    public static final class C100955a extends BaseTimeLineItem.BaseViewHolder {
    }

    /* renamed from: pu2.s$c */
    public static final class C100956c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C100954s f295625d;

        /* renamed from: e */
        public final /* synthetic */ StringBuilder f295626e;

        public C100956c(C100954s sVar, StringBuilder sb) {
            this.f295625d = sVar;
            this.f295626e = sb;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$showFeedDetailDialog$3");
            Object systemService = this.f295625d.getContext().getSystemService("clipboard");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText((CharSequence) null, this.f295626e.toString()));
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$showFeedDetailDialog$3");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100954s(Context context, C96275w6 w6Var, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        super(context, w6Var, snsTimeLineBaseAdapter);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(w6Var, "newStruct");
        C87412m.m108594g(snsTimeLineBaseAdapter, "adapter");
    }

    /* renamed from: E */
    public static final void m132351E(C100954s sVar) {
        SnsMethodCalculate.markStartTimeMs("access$jumpProfile", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick");
        sVar.getClass();
        SnsMethodCalculate.markStartTimeMs("jumpProfile", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick");
        SnsJumpProfileEvent snsJumpProfileEvent = new SnsJumpProfileEvent();
        snsJumpProfileEvent.f265167d.f265168a = sVar.getStruct().f281398y;
        snsJumpProfileEvent.publish();
        SnsMethodCalculate.markEndTimeMs("jumpProfile", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick");
        SnsMethodCalculate.markEndTimeMs("access$jumpProfile", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick");
    }

    /* renamed from: C */
    public void mo87548C(C96275w6 w6Var, boolean z) {
        SnsLikesTextView likeLayout;
        SnsMethodCalculate.markStartTimeMs("updateStruct", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick");
        C87412m.m108594g(w6Var, "struct");
        super.mo87548C(w6Var, z);
        SnsMethodCalculate.markStartTimeMs("updateClickListener", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick");
        getAvatarImage().setOnClickListener(new C62509a0(this));
        getAvatarImage().setOnLongClickListener(new C62520b0(this));
        getNickNameText().setOnClickListener(new C62524c0(this));
        ImageView commentImage = getCommentImage();
        if (commentImage != null) {
            commentImage.setOnClickListener(new C100911d0(this));
        }
        SnsTimeLineBaseAdapter adapter = getAdapter();
        TimelineCommentView commentView = getCommentView();
        if (!(commentView == null || (likeLayout = commentView.getLikeLayout()) == null)) {
            likeLayout.setClickableCallBack(adapter.f278588v);
            likeLayout.setCollapseibleLikeMap(adapter.f278585s);
            likeLayout.setLikedTextTouchListener(new C71253l1());
            likeLayout.setOpClickListener(adapter.f278560L);
            likeLayout.setLikeTvTag(getStruct().f281382i);
        }
        getContentText().setOpClickListener(new C100912e0(this, adapter));
        getContentText().setShrinkOrSpreadListener(new C100913f0(this));
        adapter.mo132921k().mo108276k(getMenuRegisterView(), adapter.f278572f.f280384n, new C100915g0(this, adapter));
        SnsTranslateResultView contentTranslateResultText = getContentTranslateResultText();
        if (contentTranslateResultText != null) {
            contentTranslateResultText.getResultTextView().setTag(new C96113p5(getStruct().f281382i, getStruct().f281381h, false, true, 1));
            C78253a k = adapter.mo132921k();
            TextView resultTextView = contentTranslateResultText.getResultTextView();
            TimelineClickListener timelineClickListener = adapter.f278572f;
            k.mo108276k(resultTextView, timelineClickListener.f280384n, timelineClickListener.f280381k);
        }
        getWeComTagImage().setOnClickListener(new C100961v(this, adapter));
        getGroupImageStub().setOnClickListener(new C100962w(this, adapter));
        getDelTextStub().setOnClickListener(new C62553x(this, adapter));
        if ((getAddressStub() instanceof PLSysTextView) && getStruct().f281347G) {
            getAddressStub().setOnClickListener(new C62554y(this, adapter));
        }
        getGameAboutStub().setOnClickListener(new C62555z(this, adapter));
        SnsMethodCalculate.markEndTimeMs("updateClickListener", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick");
        SnsMethodCalculate.markEndTimeMs("updateStruct", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick");
    }

    /* renamed from: F */
    public final void mo140473F() {
        SnsMethodCalculate.markStartTimeMs("showFeedDetailDialog", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick");
        StringBuilder sb = new StringBuilder();
        sb.append("hash:" + hashCode() + 10);
        sb.append("db_id:" + getStruct().f281382i + 10);
        sb.append("sns_id:" + C102236a0.m134765q0(getStruct().f281383j) + 10);
        sb.append("local_id:" + getStruct().f281381h + 10);
        sb.append("username:" + getStruct().f281398y + 10);
        C101789j00 j002 = getStruct().f281367a.getTimeLine().ContentObj;
        LinkedList<C101804kv2> linkedList = j002 != null ? j002.f298427h : null;
        StringBuilder sb4 = new StringBuilder();
        if (linkedList != null) {
            for (C101804kv2 kv22 : linkedList) {
                sb4.append(kv22.f298689d);
                sb4.append("|");
            }
        }
        sb.append("medis_list:\n" + sb4 + 10);
        TextView textView = new TextView(getContext());
        textView.setText(sb);
        textView.setGravity(19);
        textView.setTextSize(1, 13.0f);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(C76577a.m92153d(getContext(), C0966R.color.FG_0));
        textView.setTypeface(Typeface.MONOSPACE);
        int h = C76577a.m92157h(getContext(), C0966R.dimen.f3895i6);
        textView.setPadding(h, h, h, h);
        C76879j.m92745p(getContext(), (String) null, textView, C62550b.f177652d).mo107542x("复制", true, new C100956c(this, sb));
        SnsMethodCalculate.markEndTimeMs("showFeedDetailDialog", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick");
    }

    public final View getMenuRegisterView() {
        SnsMethodCalculate.markStartTimeMs("getMenuRegisterView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick");
        SnsPostDescPreloadTextView snsPostDescPreloadTextView = getContentText().f276740f;
        C87412m.m108593f(snsPostDescPreloadTextView, "contentText.contentTv");
        SnsMethodCalculate.markEndTimeMs("getMenuRegisterView", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick");
        return snsPostDescPreloadTextView;
    }

    /* renamed from: p */
    public BaseTimeLineItem.BaseViewHolder mo140400p() {
        SnsMethodCalculate.markStartTimeMs("buildHolder", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick");
        C100955a aVar = new C100955a();
        aVar.f279956g = getStruct().f281381h;
        aVar.f279958h = getStruct().f281387n;
        aVar.f279946b = getViewType();
        aVar.f279950d = getStruct().f281382i;
        aVar.f279948c = getStruct().f281376e0;
        TimelineCommentView commentView = getCommentView();
        aVar.f279933P = commentView != null ? commentView.getCommentLayout() : null;
        aVar.f279960i = this;
        aVar.isAd = getStruct().f281391r;
        StringBuilder sb = new StringBuilder();
        sb.append("commentView is null?");
        boolean z = true;
        sb.append(getCommentView() == null);
        sb.append(" holder.commentLinear is null:");
        if (aVar.f279933P != null) {
            z = false;
        }
        sb.append(z);
        mo140441m("MicroMsg.Improve.TimelineItemClick", sb.toString());
        SnsMethodCalculate.markEndTimeMs("buildHolder", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick");
        return aVar;
    }
}
