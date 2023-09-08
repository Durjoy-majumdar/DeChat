package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18412m3;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75604z3;
import eb0.C86493v0;
import ex0.C20642c;
import f40.C86709a0;
import f62.C75700k0;
import java.util.List;
import jm2.C46562a;
import ke3.C88144b;
import nj3.C11184p0;
import nj3.C76879j;
import rb0.C48009v0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.v3 */
public class C18372v3 implements C11184p0 {

    /* renamed from: d */
    public C18508z2 f50903d;

    /* renamed from: e */
    public Context f50904e;

    /* renamed from: f */
    public long f50905f;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.v3$a */
    public class C18373a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C19623o0 f50906d;

        public C18373a(C19623o0 o0Var) {
            this.f50906d = o0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f50906d.mo25758F2()) {
                C48009v0.Jx0().mo25785Lo(this.f50906d.field_msgId);
                C18355t.m18922a(3, 3, this.f50906d.mo25774x2(), (List<String>) null, (List<String>) null, this.f50906d);
            } else {
                C75604z3.m90834f(this.f50906d.field_msgId);
            }
            C18372v3.this.f50903d.f51443n.mo22978e(this.f50906d);
            C18372v3.this.f50903d.f51444o.mo23032d(this.f50906d);
        }
    }

    public C18372v3(C18508z2 z2Var, Context context) {
        this.f50903d = z2Var;
        this.f50904e = context;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = C20642c.class;
        Class cls2 = C75700k0.class;
        C19623o0 o0Var = this.f50903d.f51442j;
        if (o0Var == null) {
            Log.m105928w("MicroMsg.BizTimeLineMMMenuItemListener", "onMMMenuItemSelected mInfo == null");
            return;
        }
        this.f50905f = Util.nowSecond();
        switch (menuItem.getItemId()) {
            case 1:
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().get(o0Var.field_talker);
                if (z1Var == null) {
                    Log.m105920e("MicroMsg.BizTimeLineMMMenuItemListener", "changed biz stick status failed, contact is null, talker = " + o0Var.field_talker);
                    return;
                } else if (z1Var.mo62940x3()) {
                    C115669n.INSTANCE.mo160131h(13307, z1Var.getUsername(), 1, 2, 3);
                    C45628s0.m50803u0(o0Var.field_talker, true);
                    Context context = this.f50904e;
                    C76879j.m92726T(context, context.getString(C0966R.string.apt));
                    C18412m3.C18414b bVar = this.f50903d.f51443n.f51081o.get(o0Var.mo25768r2());
                    if (bVar != null) {
                        bVar.f63872q = 2;
                        return;
                    }
                    return;
                } else {
                    C115669n.INSTANCE.mo160131h(13307, z1Var.getUsername(), 1, 1, 3);
                    C45628s0.m50787m0(o0Var.field_talker, true, true);
                    Context context2 = this.f50904e;
                    C76879j.m92726T(context2, context2.getString(C0966R.string.apl));
                    C18412m3.C18414b bVar2 = this.f50903d.f51443n.f51081o.get(o0Var.mo25768r2());
                    if (bVar2 != null) {
                        bVar2.f63872q = 1;
                        return;
                    }
                    return;
                }
            case 2:
                ((C20642c) C86312j.m106911c(cls)).mo32318lA(C48009v0.Fx0().mo72757SE(o0Var.field_talker), (Activity) this.f50904e, ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().get(o0Var.field_talker), false, 3);
                this.f50903d.f51443n.mo22984k(o0Var, 2);
                return;
            case 3:
                Intent intent = new Intent();
                intent.putExtra("Contact_User", o0Var.field_talker);
                intent.putExtra("Contact_Scene", 90);
                C88144b.m109791i(this.f50904e, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
                this.f50903d.f51443n.mo22984k(o0Var, 1);
                return;
            case 4:
                Context context3 = this.f50904e;
                this.f50903d.getClass();
                String i2 = C92721n.m116881i(context3, 0, o0Var.field_content, o0Var.field_talker, o0Var.field_msgId);
                if (!Util.isNullOrNil(i2)) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("Retr_Msg_content", i2);
                    intent2.putExtra("Retr_Msg_Type", 2);
                    this.f50903d.getClass();
                    intent2.putExtra("Retr_Biz_Msg_Selected_Msg_Index", 0);
                    intent2.putExtra("Retr_Msg_Id", o0Var.field_msgId);
                    intent2.putExtra("Retr_MsgFromScene", 1);
                    String str = o0Var.field_talker;
                    String a = C86493v0.m107223a("" + o0Var.field_msgSvrId);
                    intent2.putExtra("reportSessionId", a);
                    C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a, true);
                    c.mo120962i("prePublishId", "msg_" + o0Var.field_msgSvrId);
                    c.mo120962i("preUsername", str);
                    c.mo120962i("preChatName", str);
                    this.f50903d.getClass();
                    c.mo120962i("preMsgIndex", 0);
                    c.mo120962i("sendAppMsgScene", 1);
                    C88144b.m109801s(this.f50904e, ".ui.transmit.MsgRetransmitUI", intent2, (Bundle) null);
                    return;
                }
                return;
            case 5:
                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).b00(o0Var.field_msgId);
                if (b002.getMsgId() == 0) {
                    Log.m105928w("MicroMsg.BizTimeLineMMMenuItemListener", "favAppBrandMsg msg is null");
                    return;
                }
                long j = this.f50905f;
                this.f50903d.getClass();
                Context context4 = this.f50904e;
                ((C20642c) C86312j.m106911c(cls)).ue0(j, 0, context4, (Fragment) null, (Activity) context4, b002);
                return;
            case 6:
                C72963f4 b003 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).b00(o0Var.field_msgId);
                if (b003.getMsgId() == 0) {
                    Log.m105928w("MicroMsg.BizTimeLineMMMenuItemListener", "favAppBrandMsg msg is null");
                    return;
                } else {
                    ((C20642c) C86312j.m106911c(cls)).mo32316Gz(b003, this.f50904e);
                    return;
                }
            case 7:
                C72963f4 b004 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).b00(o0Var.field_msgId);
                if (b004.getMsgId() == 0) {
                    Log.m105928w("MicroMsg.BizTimeLineMMMenuItemListener", "favAppBrandMsg msg is null");
                    return;
                } else {
                    ((C20642c) C86312j.m106911c(cls)).mo32320qA(b004, (Activity) this.f50904e);
                    return;
                }
            case 8:
                Intent intent3 = new Intent();
                intent3.putExtra("Retr_Msg_content", o0Var.field_content);
                intent3.putExtra("Retr_Msg_Type", 4);
                C88144b.m109801s(this.f50904e, ".ui.transmit.MsgRetransmitUI", intent3, (Bundle) null);
                return;
            case 9:
                ClipboardHelper.setText(MMApplicationContext.getContext(), o0Var.field_content);
                Context context5 = this.f50904e;
                C76879j.m92726T(context5, context5.getString(C0966R.string.f7938wv));
                C46562a aVar = C46562a.INSTANCE;
                aVar.F80(1, o0Var.field_msgSvrId + "", Util.getUTF8ByteLength(o0Var.field_content));
                return;
            case 10:
                String string = o0Var.mo25758F2() ? this.f50904e.getString(C0966R.string.aps) : this.f50904e.getString(C0966R.string.apr);
                Context context6 = this.f50904e;
                C76879j.m92710D(context6, string, "", context6.getString(C0966R.string.a18), this.f50904e.getString(C0966R.string.f7926wf), true, new C18373a(o0Var), (DialogInterface.OnClickListener) null, C0966R.color.a_0);
                return;
            default:
                return;
        }
    }
}
