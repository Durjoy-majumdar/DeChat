package com.tencent.p014mm.permission;

import al3.C0086a;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import nj3.C34861g1;
import qo3.C47883u;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C77426q;

/* renamed from: com.tencent.mm.permission.PermissionWarningDialog */
public class PermissionWarningDialog extends MMBaseActivity {

    /* renamed from: g */
    public static final /* synthetic */ int f267548g = 0;

    /* renamed from: e */
    public DialogInterface.OnCancelListener f267549e = new C92875a();

    /* renamed from: f */
    public C77398g f267550f = null;

    /* renamed from: com.tencent.mm.permission.PermissionWarningDialog$a */
    public class C92875a implements DialogInterface.OnCancelListener {
        public C92875a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            PermissionWarningDialog.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.permission.PermissionWarningDialog$b */
    public class C92876b implements DialogInterface.OnClickListener {
        public C92876b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            PermissionWarningDialog.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.permission.PermissionWarningDialog$c */
    public class C92877c implements DialogInterface.OnClickListener {
        public C92877c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            PermissionWarningDialog.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.permission.PermissionWarningDialog$d */
    public class C92878d implements C47883u {
        public C92878d() {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            if (z) {
                Log.m105924i("MicroMsg.PermissionWarningDialog", "set MicroPhone unmute.");
                ((AudioManager) MMApplicationContext.getContext().getSystemService("audio")).setMicrophoneMute(false);
            }
            PermissionWarningDialog.this.finish();
        }
    }

    /* renamed from: E7 */
    public final boolean mo127266E7() {
        if (getIntent() == null) {
            Log.m105920e("MicroMsg.PermissionWarningDialog", "Intent is null");
            return false;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.m105920e("MicroMsg.PermissionWarningDialog", "invalid params");
            return false;
        }
        int i = extras.getInt("warning_type", 0);
        if (1 == i) {
            C77389a aVar = new C77389a();
            aVar.f225644a = extras.getString("warning_title");
            aVar.f225660q = extras.getString("warning_content");
            aVar.f225663t = C0086a.m38a(this).getString(C0966R.string.f8029zr);
            aVar.f225620C = new C92876b();
            aVar.f225622E = this.f267549e;
            C77398g gVar = new C77398g(this, C0966R.style.a66);
            gVar.mo107525e(aVar);
            this.f267550f = gVar;
            gVar.setCanceledOnTouchOutside(false);
            this.f267550f.show();
        } else if (2 == i) {
            C77389a aVar2 = new C77389a();
            extras.getBoolean("warning_filter", false);
            extras.getBoolean("warning_due2Exception", false);
            aVar2.f225644a = C0086a.m38a(this).getString(C0966R.string.a1o);
            aVar2.f225660q = getString(C0966R.string.a1j);
            aVar2.f225663t = C0086a.m38a(this).getString(C0966R.string.a1d);
            aVar2.f225620C = new C92877c();
            aVar2.f225622E = this.f267549e;
            C77398g gVar2 = new C77398g(this, C0966R.style.a66);
            gVar2.mo107525e(aVar2);
            this.f267550f = gVar2;
            gVar2.setCanceledOnTouchOutside(false);
            this.f267550f.show();
        } else if (3 != i) {
            return false;
        } else {
            C77426q qVar = new C77426q(this);
            qVar.mo107589a(false);
            qVar.mo107595g(getString(C0966R.string.a0c));
            qVar.mo107598j(getString(C0966R.string.f8031zt));
            qVar.mo107602n(getString(C0966R.string.a0d));
            qVar.mo107590b(new C92878d());
            qVar.mo107603o();
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (!mo127266E7()) {
            finish();
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        C77398g gVar = this.f267550f;
        if (gVar != null) {
            gVar.dismiss();
            this.f267550f = null;
        }
        if (!mo127266E7()) {
            finish();
        }
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
