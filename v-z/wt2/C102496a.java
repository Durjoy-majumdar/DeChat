package wt2;

import ad0.C91998s;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pointers.PLong;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import l31.C99333f;
import pe3.C47465a;
import te3.C101808lv2;
import z04.C112551y;

/* renamed from: wt2.a */
public final class C102496a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C102497b f301795d;

    public C102496a(C102497b bVar, int i, int i2) {
        this.f301795d = bVar;
    }

    public final void onClick(View view) {
        SnsInfo snsInfo;
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/component/header/HeaderErrorPostHandle$getNotifyView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$getNotifyView$1");
        if (view.getTag() instanceof String) {
            C102497b bVar = this.f301795d;
            SnsMethodCalculate.markStartTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
            Context context = bVar.f301799d;
            SnsMethodCalculate.markEndTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
            if (context != null) {
                Object tag = view.getTag();
                C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) tag;
                Log.m105924i("MicroMsg.Improve.ErrorPost", "sns Header tag:" + str2);
                Intent intent = new Intent();
                PLong pLong = new PLong();
                if (C112551y.m153819s(str2, "feed_", false)) {
                    str = str2.substring(5);
                    C87412m.m108593f(str, "this as java.lang.String).substring(startIndex)");
                    snsInfo = C94866e1.Yx0().mo139798DN(str);
                } else {
                    if (C112551y.m153819s(str2, "comment_", false)) {
                        String substring = str2.substring(8);
                        C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
                        int i = Util.getInt(substring, -1);
                        intent.putExtra("INTENT_ERROR_OPTIME", i);
                        if (C94866e1.Rx0().mo130952j(i, pLong)) {
                            snsInfo = C94866e1.Yx0().mo139806SE(pLong.value);
                            intent.putExtra("INTENT_SNSID", pLong.value);
                            str = "";
                        }
                    }
                    snsInfo = null;
                    str = "";
                }
                C102497b bVar2 = this.f301795d;
                SnsMethodCalculate.markStartTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                Context context2 = bVar2.f301799d;
                SnsMethodCalculate.markEndTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                intent.setClass(context2, SnsCommentDetailUI.class);
                if (snsInfo == null || snsInfo.getUserName() == null || C87412m.m108589b(snsInfo.getUserName(), "")) {
                    if (C112551y.m153819s(str2, "comment_", false)) {
                        C94866e1.Rx0().mo130959r();
                        this.f301795d.mo142115a();
                    }
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$getNotifyView$1");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/component/header/HeaderErrorPostHandle$getNotifyView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                intent.putExtra("INTENT_TALKER", snsInfo.getUserName());
                intent.putExtra("INTENT_SNS_LOCAL_ID", str);
                intent.putExtra("INTENT_FROMGALLERY", true);
                C91998s.m115550d(726);
                snsInfo.getCreateTime();
                C102497b bVar3 = this.f301795d;
                SnsMethodCalculate.markStartTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                Context context3 = bVar3.f301799d;
                SnsMethodCalculate.markEndTimeMs("access$getContext$p", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context4 = context3;
                C117292a.m165358d(context4, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/component/header/HeaderErrorPostHandle$getNotifyView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context3.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context4, "com/tencent/mm/plugin/sns/ui/improve/component/header/HeaderErrorPostHandle$getNotifyView$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                try {
                    C47465a parseFrom = new C101808lv2().parseFrom(snsInfo.field_postBuf);
                    C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MediaPostInfo");
                    C101808lv2 lv22 = (C101808lv2) parseFrom;
                    int i2 = lv22.f298755s;
                    if (i2 == 201 || i2 == 210 || i2 != 211) {
                        lv22.f298733G = true;
                        snsInfo.setPostBuf(lv22.toByteArray());
                        C94866e1.Yx0().Rv0(snsInfo.localid, snsInfo);
                        this.f301795d.mo142115a();
                    }
                } catch (Exception unused) {
                }
                ((C99333f) C86312j.m106911c(C99333f.class)).um0(12076, "BrowseMessageListTime");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle$getNotifyView$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/component/header/HeaderErrorPostHandle$getNotifyView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
