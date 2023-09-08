package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pointers.PLong;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import te3.C101808lv2;

/* renamed from: com.tencent.mm.plugin.sns.ui.p4 */
public class C96112p4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsHeader f280718d;

    public C96112p4(SnsHeader snsHeader, int i, int i2) {
        this.f280718d = snsHeader;
    }

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        SnsInfo snsInfo;
        String str4;
        SnsInfo snsInfo2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsHeader$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeader$11");
        if (!(view.getTag() instanceof String) || SnsHeader.m122095a(this.f280718d) == null) {
            str = "(Landroid/view/View;)V";
            str2 = "android/view/View$OnClickListener";
        } else {
            String str5 = (String) view.getTag();
            Log.m105924i("MicroMsg.SnsHeader", "sns Header tag:" + str5);
            Intent intent = new Intent();
            PLong pLong = new PLong();
            SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            if (str5.startsWith("feed_")) {
                SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                str4 = str5.substring(5);
                snsInfo = C94866e1.Yx0().mo139798DN(str4);
                str = "(Landroid/view/View;)V";
                str3 = "android/view/View$OnClickListener";
            } else {
                SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                if (str5.startsWith("comment_")) {
                    SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                    SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                    int i = Util.getInt(str5.substring(8), -1);
                    intent.putExtra("INTENT_ERROR_OPTIME", i);
                    if (C94866e1.Rx0().mo130952j(i, pLong)) {
                        str = "(Landroid/view/View;)V";
                        str3 = "android/view/View$OnClickListener";
                        SnsInfo SE = C94866e1.Yx0().mo139806SE(pLong.value);
                        intent.putExtra("INTENT_SNSID", pLong.value);
                        snsInfo2 = SE;
                        snsInfo = snsInfo2;
                        str4 = "";
                    }
                }
                str = "(Landroid/view/View;)V";
                str3 = "android/view/View$OnClickListener";
                snsInfo2 = null;
                snsInfo = snsInfo2;
                str4 = "";
            }
            intent.setClass(SnsHeader.m122095a(this.f280718d), SnsCommentDetailUI.class);
            if (snsInfo == null || snsInfo.getUserName() == null || snsInfo.getUserName().equals("")) {
                SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                if (str5.startsWith("comment_")) {
                    C94866e1.Rx0().mo130959r();
                    this.f280718d.mo132748l();
                }
                if (snsInfo == null) {
                    Log.m105920e("MicroMsg.SnsHeader", "error snsInfo  is null");
                } else {
                    Object[] objArr = new Object[1];
                    String str6 = this.f280718d.f278101f;
                    if (str6 == null) {
                        str6 = "null";
                    }
                    objArr[0] = str6;
                    Log.m105921e("MicroMsg.SnsHeader", "error username:%s", objArr);
                }
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeader$11");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsHeader$11", str3, "onClick", str);
                return;
            }
            intent.putExtra("INTENT_TALKER", snsInfo.getUserName());
            intent.putExtra("INTENT_SNS_LOCAL_ID", str4);
            intent.putExtra("INTENT_FROMGALLERY", true);
            C91998s.m115550d(726);
            snsInfo.getCreateTime();
            Context a = SnsHeader.m122095a(this.f280718d);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context = a;
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsHeader$11", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            a.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/sns/ui/SnsHeader$11", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            try {
                C101808lv2 lv22 = (C101808lv2) new C101808lv2().parseFrom(snsInfo.field_postBuf);
                int i2 = lv22.f298755s;
                if (i2 == 201 || i2 == 210 || i2 != 211) {
                    lv22.f298733G = true;
                    snsInfo.setPostBuf(lv22.toByteArray());
                    C94866e1.Yx0().Rv0(snsInfo.localid, snsInfo);
                }
            } catch (Exception unused) {
            }
            str2 = str3;
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeader$11");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsHeader$11", str2, "onClick", str);
    }
}
