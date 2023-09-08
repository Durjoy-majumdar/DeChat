package com.tencent.p014mm.pluginsdk.permission;

import al3.C0086a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import bh3.C113177k;
import bp3.C79750c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.PageActivityEvent;
import com.tencent.p014mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import h81.C32735h;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import ke3.C88144b;
import nj3.C34861g1;
import p206nj.C11171e;
import p447aw.C103918d;
import qo3.C77389a;
import qo3.C77398g;

/* renamed from: com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog */
public class RequestFloatWindowPermissionDialog extends AbsRequestFloatWindowPermissionDialog {

    /* renamed from: g */
    public static C85622e f249559g;

    /* renamed from: h */
    public static CopyOnWriteArrayList<AbsRequestFloatWindowPermissionDialog.C85613a> f249560h = new CopyOnWriteArrayList<>();

    /* renamed from: e */
    public C77398g f249561e = null;

    /* renamed from: f */
    public boolean f249562f = false;

    /* renamed from: com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog$a */
    public class C85618a implements DialogInterface.OnClickListener {
        public C85618a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            RequestFloatWindowPermissionDialog requestFloatWindowPermissionDialog = RequestFloatWindowPermissionDialog.this;
            requestFloatWindowPermissionDialog.f249562f = true;
            C85622e eVar = RequestFloatWindowPermissionDialog.f249559g;
            if (eVar != null) {
                eVar.mo248b(requestFloatWindowPermissionDialog);
                RequestFloatWindowPermissionDialog.f249559g.mo119159d();
            }
            RequestFloatWindowPermissionDialog.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog$b */
    public class C85619b implements DialogInterface.OnDismissListener {
        public C85619b() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            RequestFloatWindowPermissionDialog requestFloatWindowPermissionDialog = RequestFloatWindowPermissionDialog.this;
            if (!requestFloatWindowPermissionDialog.f249562f) {
                C85622e eVar = RequestFloatWindowPermissionDialog.f249559g;
                if (eVar != null) {
                    eVar.mo248b(requestFloatWindowPermissionDialog);
                    RequestFloatWindowPermissionDialog.f249559g.mo119159d();
                }
                RequestFloatWindowPermissionDialog.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog$c */
    public class C85620c implements DialogInterface.OnClickListener {
        public C85620c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            RequestFloatWindowPermissionDialog.this.f249562f = true;
            if (C11171e.m11046c(23)) {
                try {
                    if (!Util.isNullOrNil((String) Settings.class.getField("ACTION_MANAGE_OVERLAY_PERMISSION").get(Settings.class))) {
                        RequestFloatWindowPermissionDialog requestFloatWindowPermissionDialog = RequestFloatWindowPermissionDialog.this;
                        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + MMApplicationContext.getPackageName()));
                        C85622e eVar = RequestFloatWindowPermissionDialog.f249559g;
                        requestFloatWindowPermissionDialog.startActivityForResult(intent, 1234);
                        return;
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.RequestFloatWindowPermissionDialog", "getField:ACTION_MANAGE_OVERLAY_PERMISSION! Error:%s, etype:%s", e.getMessage(), e.getClass().getCanonicalName());
                }
            }
            String string = RequestFloatWindowPermissionDialog.this.getString(C0966R.string.evx);
            Intent intent2 = new Intent();
            intent2.putExtra("rawUrl", string);
            intent2.putExtra("useJs", true);
            intent2.putExtra("vertical_scroll", true);
            C88144b.m109791i(RequestFloatWindowPermissionDialog.this, "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
            RequestFloatWindowPermissionDialog.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog$d */
    public class C85621d implements C113177k.C113181e {

        /* renamed from: a */
        public final /* synthetic */ AbsRequestFloatWindowPermissionDialog.C85613a f249566a;

        public C85621d(AbsRequestFloatWindowPermissionDialog.C85613a aVar) {
            this.f249566a = aVar;
        }

        public void onOp(Boolean bool) {
            if (bool.booleanValue()) {
                this.f249566a.mo247a((AbsRequestFloatWindowPermissionDialog) null);
            } else {
                this.f249566a.mo249c((AbsRequestFloatWindowPermissionDialog) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.permission.RequestFloatWindowPermissionDialog$e */
    public static class C85622e implements AbsRequestFloatWindowPermissionDialog.C85613a {

        /* renamed from: a */
        public AbsRequestFloatWindowPermissionDialog.C85613a f249567a;

        public C85622e(AbsRequestFloatWindowPermissionDialog.C85613a aVar) {
            this.f249567a = aVar;
        }

        /* renamed from: a */
        public void mo247a(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            RequestFloatWindowPermissionDialog.m105695E7(absRequestFloatWindowPermissionDialog);
            AbsRequestFloatWindowPermissionDialog.C85613a aVar = this.f249567a;
            if (aVar != null) {
                aVar.mo247a(absRequestFloatWindowPermissionDialog);
            }
        }

        /* renamed from: b */
        public void mo248b(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            RequestFloatWindowPermissionDialog.m105695E7(absRequestFloatWindowPermissionDialog);
            AbsRequestFloatWindowPermissionDialog.C85613a aVar = this.f249567a;
            if (aVar != null) {
                aVar.mo248b(absRequestFloatWindowPermissionDialog);
            }
        }

        /* renamed from: c */
        public void mo249c(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            RequestFloatWindowPermissionDialog.m105695E7(absRequestFloatWindowPermissionDialog);
            AbsRequestFloatWindowPermissionDialog.C85613a aVar = this.f249567a;
            if (aVar != null) {
                aVar.mo249c(absRequestFloatWindowPermissionDialog);
            }
        }

        /* renamed from: d */
        public void mo119159d() {
            this.f249567a = null;
            RequestFloatWindowPermissionDialog.f249560h.clear();
            RequestFloatWindowPermissionDialog.f249559g = null;
        }
    }

    /* renamed from: E7 */
    public static void m105695E7(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        Iterator<AbsRequestFloatWindowPermissionDialog.C85613a> it = f249560h.iterator();
        while (it.hasNext()) {
            it.next().mo247a(absRequestFloatWindowPermissionDialog);
        }
    }

    /* renamed from: H7 */
    public static void m105696H7(Context context, int i, String str, AbsRequestFloatWindowPermissionDialog.C85613a aVar, boolean z, boolean z2, String str2) {
        Class<RequestFloatWindowPermissionDialog> cls = RequestFloatWindowPermissionDialog.class;
        boolean z3 = false;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_overlay_business_permission_ignore, 0) == 1) {
            z3 = true;
        }
        if (z3 || i == -1 || !((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(MMApplicationContext.getContext())) {
            f249559g = new C85622e(aVar);
            Intent intent = new Intent(context, cls);
            intent.putExtra("warning_content", str);
            if (z) {
                intent.addFlags(805306368);
            }
            C79750c.m96888a(context, intent, str, cls.getCanonicalName(), z2, str2, false);
            return;
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_PERMISSION_DIALOG_SHOWTIME_LONG_SYNC, Long.valueOf(C31543z5.m39453c()));
        ((C113177k) C86312j.m106911c(C113177k.class)).Dn0(i, new C85621d(aVar));
    }

    /* renamed from: F7 */
    public final void mo119153F7(String str) {
        PageActivityEvent pageActivityEvent = new PageActivityEvent();
        pageActivityEvent.f236261d.f236263b = getClass().getSimpleName();
        pageActivityEvent.f236261d.f236264c = hashCode();
        pageActivityEvent.f236261d.f236262a = str;
        pageActivityEvent.publish();
    }

    /* renamed from: G7 */
    public final void mo119154G7() {
        if (getIntent() == null) {
            Log.m105920e("MicroMsg.RequestFloatWindowPermissionDialog", "Intent is null");
            return;
        }
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.m105920e("MicroMsg.RequestFloatWindowPermissionDialog", "invalid params");
            return;
        }
        C77389a aVar = new C77389a();
        aVar.f225644a = C0086a.m38a(this).getString(C0966R.string.evw);
        aVar.f225660q = extras.getString("warning_content");
        aVar.f225664u = C0086a.m38a(this).getString(C0966R.string.m4k);
        aVar.f225621D = new C85618a();
        aVar.f225623F = new C85619b();
        aVar.f225663t = C0086a.m38a(this).getString(C11171e.m11046c(23) ? C0966R.string.evv : C0966R.string.evu);
        aVar.f225620C = new C85620c();
        C77398g gVar = new C77398g(this, C0966R.style.a66);
        gVar.mo107525e(aVar);
        this.f249561e = gVar;
        gVar.setCanceledOnTouchOutside(false);
        this.f249561e.show();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_PERMISSION_DIALOG_SHOWTIME_LONG_SYNC, Long.valueOf(C31543z5.m39453c()));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C85622e eVar = f249559g;
        if (eVar == null) {
            finish();
            return;
        }
        if (i != 1234) {
            eVar.mo249c(this);
        } else if (((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(MMApplicationContext.getContext())) {
            f249559g.mo247a(this);
        } else {
            f249559g.mo249c(this);
        }
        f249559g.mo119159d();
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo119154G7();
        mo119153F7("onCreate");
    }

    public void onDestroy() {
        C85622e eVar = f249559g;
        if (!(eVar == null || eVar.f249567a == null)) {
            if (((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(MMApplicationContext.getContext())) {
                Log.m105924i("MicroMsg.RequestFloatWindowPermissionDialog", "checkCallback allow");
                f249559g.mo247a(this);
            } else {
                Log.m105924i("MicroMsg.RequestFloatWindowPermissionDialog", "checkCallback cancel");
                f249559g.mo248b(this);
            }
            f249559g.mo119159d();
        }
        super.onDestroy();
        mo119153F7("onDestroy");
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        C77398g gVar = this.f249561e;
        if (gVar != null) {
            gVar.dismiss();
            this.f249561e = null;
        }
        mo119154G7();
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
