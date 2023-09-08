package ju2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.sns.model.C94851d1;
import com.tencent.p014mm.plugin.sns.p106ui.C96174r;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import p214om.C11502f;
import te3.w64;

/* renamed from: ju2.h */
public final class C99050h extends C96174r {

    /* renamed from: d */
    public final /* synthetic */ w64 f290356d;

    /* renamed from: e */
    public final /* synthetic */ Context f290357e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99050h(w64 w64, Context context) {
        super((Activity) null, 0, (C94851d1) null);
        this.f290356d = w64;
        this.f290357e = context;
    }

    /* renamed from: a */
    public void mo67369a(View view, Object obj) {
        Class cls = C11502f.class;
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$packageCommentContent$1");
        Intent intent = new Intent();
        String str = this.f290356d.f299703d;
        C72996z1 N2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69664N2(str);
        if (N2 == null || !N2.mo62916m3()) {
            intent.putExtra("Contact_User", str);
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 14);
            ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93174g(intent, this.f290357e);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$packageCommentContent$1");
            return;
        }
        intent.putExtra("Contact_User", str);
        intent.putExtra("Contact_Scene", 37);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 14);
        ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93174g(intent, this.f290357e);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$packageCommentContent$1");
    }
}
