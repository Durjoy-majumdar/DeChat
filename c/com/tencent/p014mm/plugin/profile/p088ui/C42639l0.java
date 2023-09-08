package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.transmit.SelectConversationUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import cw0.C116541b;
import di3.C86312j;
import eb0.C75604z3;
import eb0.C97625j3;
import nj3.C11184p0;
import nj3.C76879j;
import p154fy.C87121j;
import p214om.C11502f;
import p248ug.C37468y;
import tc0.C48628g;
import tc0.C77885p;
import wc3.C15141z;

/* renamed from: com.tencent.mm.plugin.profile.ui.l0 */
public class C42639l0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C42660o0 f115418d;

    /* renamed from: com.tencent.mm.plugin.profile.ui.l0$a */
    public class C42640a implements DialogInterface.OnClickListener {
        public C42640a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C42660o0 o0Var = C42639l0.this.f115418d;
            String username = o0Var.f115489f.getUsername();
            C72963f4 Rx0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Rx0(username);
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C48628g(username, Rx0.mo108774y2()));
            o0Var.f115486H = false;
            MMActivity mMActivity = o0Var.f115487d;
            o0Var.f115485G = C76879j.m92723Q(mMActivity, mMActivity.getString(C0966R.string.a3h), o0Var.f115487d.getString(C0966R.string.a4d), true, true, new C42673r0(o0Var));
            C75604z3.m90836h(username, new C42674s0(o0Var));
            ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot(username, 15);
        }
    }

    public C42639l0(C42660o0 o0Var) {
        this.f115418d = o0Var;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            C42660o0 o0Var = this.f115418d;
            o0Var.getClass();
            Intent intent = new Intent();
            intent.putExtra("Select_Talker_Name", o0Var.f115489f.getUsername());
            intent.putExtra("Select_block_List", o0Var.f115489f.getUsername());
            intent.putExtra("Select_Send_Card", true);
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("mutil_select_is_ret", true);
            C15141z yM = ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM();
            MMActivity mMActivity = o0Var.f115487d;
            ((C67654r1) yM).getClass();
            intent.setClass(mMActivity, SelectConversationUI.class);
            mMActivity.startActivityForResult(intent, 1);
        } else if (itemId == 2) {
            C42660o0 o0Var2 = this.f115418d;
            o0Var2.f115487d.getString(C0966R.string.eym, new Object[]{o0Var2.f115489f.mo62898f()});
            MMActivity mMActivity2 = this.f115418d.f115487d;
            C76879j.m92707A(mMActivity2, mMActivity2.getString(C0966R.string.bk6), "", this.f115418d.f115487d.getString(C0966R.string.bk5), this.f115418d.f115487d.getString(C0966R.string.f7926wf), new C42640a(), (DialogInterface.OnClickListener) null);
        } else if (itemId == 3) {
            this.f115418d.mo66795d();
        } else if (itemId == 4) {
            C42660o0 o0Var3 = this.f115418d;
            o0Var3.getClass();
            ((C37468y) C86312j.m106911c(C37468y.class)).mo61114bs(o0Var3.f115490g, o0Var3.f115487d, o0Var3.f115489f, true, new C42642m0(o0Var3));
        } else if (itemId == 5) {
            C42660o0 o0Var4 = this.f115418d;
            o0Var4.getClass();
            Log.m105918d("MicroMsg.ContactWidgetBizInfo", "dealAddShortcut, username = " + o0Var4.f115489f.getUsername());
            C116541b.m164359i(o0Var4.f115487d, o0Var4.f115489f.getUsername());
            MMHandlerThread.postToMainThreadDelayed(new C42672q0(o0Var4), 1000);
        }
    }
}
