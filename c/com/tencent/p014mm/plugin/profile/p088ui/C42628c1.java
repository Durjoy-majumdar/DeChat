package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GetSnsTagListEvent;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C97625j3;
import ke3.C88144b;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.profile.ui.c1 */
public class C42628c1 extends C42671p1 {

    /* renamed from: com.tencent.mm.plugin.profile.ui.c1$a */
    public class C42629a implements DialogInterface.OnClickListener {
        public C42629a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C42628c1.this.mo66761a(false);
        }
    }

    public C42628c1(Context context) {
        super(context, new C42780v1(context));
        new GetSnsTagListEvent().publish();
    }

    /* renamed from: c */
    public static void m46308c() {
        ((C72972g4) C97625j3.m125812b().mo105911z()).mo101089TE("feedsapp");
        ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f("feedsapp");
    }

    /* renamed from: a */
    public void mo66761a(boolean z) {
        Context context = this.f115521d;
        new MTimerHandler(new C42627b1(z, (C6975i1) null, C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(z ? C0966R.string.iww : C0966R.string.f361324ix3), true, true, (DialogInterface.OnCancelListener) null)), false).startTimer(1500);
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        if ("contact_info_plugin_view".equals(str)) {
            Intent intent = new Intent();
            intent.putExtra("sns_timeline_NeedFirstLoadint", true);
            C88144b.m109791i(this.f115521d, "sns", ".ui.SnsTimeLineUI", intent, (Bundle) null);
            return true;
        }
        if ("contact_info_plugin_outsize".equals(str)) {
            Intent intent2 = new Intent();
            intent2.putExtra("k_sns_tag_id", 4);
            C88144b.m109791i(this.f115521d, "sns", ".ui.SnsBlackDetailUI", intent2, (Bundle) null);
        }
        if ("contact_info_plugin_black".equals(str)) {
            Intent intent3 = new Intent();
            intent3.putExtra("k_sns_tag_id", 5);
            C88144b.m109791i(this.f115521d, "sns", ".ui.SnsTagDetailUI", intent3, (Bundle) null);
        }
        if (str.equals("contact_info_plugin_uninstall")) {
            Context context = this.f115521d;
            C76879j.m92707A(context, context.getString(C0966R.string.f361321ix0), "", this.f115521d.getString(C0966R.string.a3c), this.f115521d.getString(C0966R.string.f7926wf), new C42629a(), (DialogInterface.OnClickListener) null);
            return true;
        } else if ("contact_info_plugin_clear_data".equals(str)) {
            Context context2 = this.f115521d;
            C76879j.m92707A(context2, context2.getString(C0966R.string.blf), "", this.f115521d.getString(C0966R.string.f7930wk), this.f115521d.getString(C0966R.string.f7926wf), new C42646n1(this), (DialogInterface.OnClickListener) null);
            return true;
        } else if (str.equals("contact_info_plugin_install")) {
            mo66761a(true);
            return true;
        } else if (str.equals("contact_info_plugin_uninstall")) {
            Context context3 = this.f115521d;
            C76879j.m92707A(context3, context3.getString(C0966R.string.iwz), "", this.f115521d.getString(C0966R.string.f7930wk), this.f115521d.getString(C0966R.string.f7926wf), new C42670o1(this), (DialogInterface.OnClickListener) null);
            return true;
        } else {
            Log.m105920e("MicroMsg.ContactWidgetPlugin", "handleEvent : unexpected key = " + str);
            return false;
        }
    }
}
