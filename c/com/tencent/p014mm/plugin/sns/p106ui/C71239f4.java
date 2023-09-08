package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C75592q0;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import lc3.C10485b;

/* renamed from: com.tencent.mm.plugin.sns.ui.f4 */
public class C71239f4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsCommentFooter f206182d;

    public C71239f4(SnsCommentFooter snsCommentFooter) {
        this.f206182d = snsCommentFooter;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsCommentFooter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$6");
        if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("SnsAdAtFriendRedDot", 0) == 1) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.NEW_BANDAGE_SNS_AD_COMMENT_AT_RED_DOT_BOOLEAN_SYNC, Boolean.FALSE);
        }
        SnsCommentFooter snsCommentFooter = this.f206182d;
        String str = SnsCommentFooter.f278037M;
        SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        ImageView imageView = snsCommentFooter.f278054j;
        SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        imageView.setVisibility(8);
        Intent intent = new Intent();
        intent.putExtra("list_attr", 16391);
        intent.putExtra("block_contact", C75592q0.m90789s());
        intent.putExtra("max_limit_num", 1);
        intent.putExtra("titile", SnsCommentFooter.m122042c(this.f206182d).getString(C0966R.string.j9p));
        C88144b.m109802t(SnsCommentFooter.m122042c(this.f206182d), ".ui.contact.SelectContactUI", intent, 2333);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$6");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
