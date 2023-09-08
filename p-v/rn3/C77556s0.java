package rn3;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.transmit.SendAppMessageWrapperUI;
import ke3.C88144b;
import qo3.C77398g;

/* renamed from: rn3.s0 */
public class C77556s0 implements C77398g.C77402i.C77404b {

    /* renamed from: a */
    public final /* synthetic */ C68070l.C68072b f226107a;

    /* renamed from: b */
    public final /* synthetic */ SendAppMessageWrapperUI f226108b;

    public C77556s0(SendAppMessageWrapperUI sendAppMessageWrapperUI, C68070l.C68072b bVar) {
        this.f226108b = sendAppMessageWrapperUI;
        this.f226107a = bVar;
    }

    /* renamed from: a */
    public void mo25a() {
        Intent intent = new Intent();
        intent.putExtra("record_xml", this.f226107a.f195571f0);
        intent.putExtra("record_show_share", false);
        intent.putExtra("record_app_id", this.f226108b.f250363e.field_appId);
        C88144b.m109791i(this.f226108b.getContext(), "record", ".ui.RecordMsgDetailUI", intent, (Bundle) null);
    }
}
