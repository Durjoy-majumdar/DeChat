package ju2;

import android.content.Context;
import android.os.StrictMode;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gu2.C98214b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import l31.C99333f;
import o40.C61926c;
import os2.C100416r;

/* renamed from: ju2.g */
public final class C99049g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C98214b f290355d;

    public C99049g(C98214b bVar) {
        this.f290355d = bVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/util/ImproveInteractionUtil$loadContentLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$loadContentLayout$3");
        C99045e eVar = C99045e.f290344a;
        C98214b bVar = this.f290355d;
        SnsMethodCalculate.markStartTimeMs("access$changeLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        Class cls = C99333f.class;
        SnsMethodCalculate.markStartTimeMs("changeLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        try {
            PopupWindow popupWindow = C99045e.f290347d;
            View contentView = popupWindow != null ? popupWindow.getContentView() : null;
            if (contentView == null) {
                SnsMethodCalculate.markEndTimeMs("changeLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
                SnsMethodCalculate.markEndTimeMs("access$changeLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$loadContentLayout$3");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/util/ImproveInteractionUtil$loadContentLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
            Context context = contentView.getContext();
            TextView textView = (TextView) contentView.findViewById(C0966R.C0970id.f5732n4);
            WeImageView weImageView = (WeImageView) contentView.findViewById(C0966R.C0970id.f5730n2);
            if (bVar.getLikeFlag() == 0) {
                StrictMode.allowThreadDiskReads();
                bVar.setLikeFlag(1);
                bVar.mo137505C2().setLikeFlag(1);
                C100416r.m131411d(bVar.mo137507E2(), bVar.mo137505C2());
                weImageView.setImageResource(C0966R.raw.icons_filled_like);
                weImageView.setIconColor(context.getResources().getColor(C0966R.color.f2966ao));
                textView.setImportantForAccessibility(2);
                textView.setText(C0966R.string.jcy);
                textView.announceForAccessibility(context.getResources().getString(C0966R.string.f361363j93));
                textView.setImportantForAccessibility(1);
                C5431p1.C5432a.m5340k(bVar.mo137505C2(), 1, "", 0);
                View findViewById = contentView.findViewById(C0966R.C0970id.f5731n3);
                C87412m.m108593f(findViewById, "layout.findViewById(R.id.album_like_img)");
                eVar.mo138387a((LinearLayout) findViewById);
                ((C99333f) C86312j.m106911c(cls)).mo138726rL(12076, "like_feed_count", bVar.mo137504B2());
                ((C99333f) C86312j.m106911c(cls)).mo138726rL(12076, "CommentOrLikeFeedCount", bVar.mo137504B2());
            } else {
                bVar.setLikeFlag(0);
                bVar.mo137505C2().setLikeFlag(0);
                C100416r.m131411d(bVar.mo137507E2(), bVar.mo137505C2());
                weImageView.setImageResource(C0966R.raw.icons_outlined_like);
                weImageView.setIconColor(context.getResources().getColor(C0966R.color.f2975b6));
                textView.setImportantForAccessibility(2);
                textView.setText(C0966R.string.je7);
                textView.announceForAccessibility(context.getResources().getString(C0966R.string.j95));
                textView.setImportantForAccessibility(1);
                C5431p1.C5432a.m5338a(bVar.mo137507E2());
                SnsMethodCalculate.markStartTimeMs("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
                C61926c.m72668M(new C99044d(true));
                SnsMethodCalculate.markEndTimeMs("dismissCommentWindow", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            }
            SnsMethodCalculate.markEndTimeMs("changeLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            SnsMethodCalculate.markEndTimeMs("access$changeLikeStatus", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$loadContentLayout$3");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/util/ImproveInteractionUtil$loadContentLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.TimelineClickListener", "In BaseTimeLine, do onLikeClick and exp is " + th);
        }
    }
}
