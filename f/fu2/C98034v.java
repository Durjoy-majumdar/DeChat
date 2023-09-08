package fu2;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.storage.C72996z1;
import de3.C75360c0;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import l31.C99333f;
import p214om.C11502f;
import p773yy.C79168k;
import vr2.C102236a0;
import vr2.C102243e;
import z31.C102972b;

/* renamed from: fu2.v */
public final class C98034v implements C75360c0.C75361a {

    /* renamed from: a */
    public String f287446a = "";

    /* renamed from: a */
    public void mo67369a(View view, Object obj) {
        String str;
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveNameClick");
        if (view == null) {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveNameClick");
            return;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else if (obj instanceof C102243e) {
            str = ((C102243e) obj).f301104b;
            C87412m.m108593f(str, "{\n            tag.userName\n        }");
        } else {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveNameClick");
            return;
        }
        this.f287446a = str;
        Class cls = C99333f.class;
        Class cls2 = C79168k.class;
        SnsMethodCalculate.markStartTimeMs("safeJump", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveNameClick");
        Context context = view.getContext();
        Intent intent = new Intent();
        C72996z1 N2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69664N2(this.f287446a);
        intent.putExtra("Contact_User", this.f287446a);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 0);
        if (N2 != null && N2.mo62916m3()) {
            intent.putExtra("Contact_Scene", 37);
        }
        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent, context);
        SnsInfo snsInfo = new SnsInfo();
        snsInfo.setUserName(this.f287446a);
        ((C79168k) C86312j.m106911c(cls2)).mo74109HD(this.f287446a, 6);
        ((C79168k) C86312j.m106911c(cls2)).mo74109HD(this.f287446a, 6);
        ((C99333f) C86312j.m106911c(cls)).um0(12076, C87412m.m108589b(this.f287446a, C75592q0.m90789s()) ? "BrowseMyAlbumTime" : "BrowseOtherAlbumTime");
        String q0 = C102236a0.m134765q0(snsInfo.field_snsId);
        C87412m.m108593f(q0, "longToString(info.field_snsId)");
        ((C99333f) C86312j.m106911c(cls)).mo138726rL(12076, "NickNameFeedIdCount", q0);
        SnsMethodCalculate.markEndTimeMs("safeJump", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveNameClick");
        C102972b.f303874a.mo142713g(12076, "ClickAlbumCount", this.f287446a);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveNameClick");
    }
}
