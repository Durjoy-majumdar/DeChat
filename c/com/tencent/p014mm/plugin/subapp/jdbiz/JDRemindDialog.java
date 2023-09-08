package com.tencent.p014mm.plugin.subapp.jdbiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import ke3.C88144b;
import nj3.C34861g1;
import qo3.C77389a;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.subapp.jdbiz.JDRemindDialog */
public class JDRemindDialog extends MMBaseActivity {

    /* renamed from: f */
    public static final /* synthetic */ int f282204f = 0;

    /* renamed from: e */
    public C77398g f282205e = null;

    /* renamed from: com.tencent.mm.plugin.subapp.jdbiz.JDRemindDialog$a */
    public class C96456a implements DialogInterface.OnClickListener {
        public C96456a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String str;
            String str2;
            if (JDRemindDialog.this.getIntent() == null || JDRemindDialog.this.getIntent().getExtras() == null) {
                str2 = "";
                str = null;
            } else {
                str = JDRemindDialog.this.getIntent().getExtras().getString("alertjumpurl");
                str2 = JDRemindDialog.this.getIntent().getExtras().getString("alert_activityid");
            }
            if (str2.equals(C96463h.yx0().Dx0().f282216b) && C96463h.yx0().Ex0()) {
                C96463h.yx0().vx0();
                C96463h.yx0().wx0();
            }
            if (!Util.isNullOrNil(str)) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", str);
                intent.putExtra("useJs", true);
                intent.putExtra("vertical_scroll", true);
                C88144b.m109791i(JDRemindDialog.this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                C115669n.INSTANCE.mo160131h(11179, str, C96463h.yx0().Dx0().f282216b, 5);
            }
            JDRemindDialog.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.jdbiz.JDRemindDialog$b */
    public class C96457b implements DialogInterface.OnClickListener {
        public C96457b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            JDRemindDialog.this.finish();
        }
    }

    /* renamed from: E7 */
    public final void mo134429E7() {
        Bundle extras;
        if (getIntent() != null && (extras = getIntent().getExtras()) != null) {
            C77389a aVar = new C77389a();
            aVar.f225644a = "";
            aVar.f225660q = extras.getString("alertcontent");
            aVar.f225663t = extras.getString("alertconfirm");
            aVar.f225620C = new C96456a();
            aVar.f225664u = extras.getString("alert_cancel");
            aVar.f225621D = new C96457b();
            C77398g gVar = new C77398g(this, C0966R.style.a66);
            gVar.mo107525e(aVar);
            this.f282205e = gVar;
            gVar.setCanceledOnTouchOutside(false);
            this.f282205e.show();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        mo134429E7();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        C77398g gVar = this.f282205e;
        if (gVar != null) {
            gVar.dismiss();
            this.f282205e = null;
        }
        mo134429E7();
    }

    public void onPause() {
        super.onPause();
        C34861g1.m40517a(false, (Intent) null);
    }

    public void onResume() {
        super.onResume();
        C34861g1.m40517a(true, (Intent) null);
    }
}
