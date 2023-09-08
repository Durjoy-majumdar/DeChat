package com.tencent.p014mm.plugin.forcenotify.p058ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import ke3.C88144b;
import kotlin.Metadata;
import nj3.C34861g1;
import p206nj.C11171e;
import p447aw.C103918d;
import qo3.C101218e0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/forcenotify/ui/ForceNotifyAcceptUI;", "Lcom/tencent/mm/ui/MMBaseActivity;", "<init>", "()V", "a", "plugin-force-notify_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUI */
public final class ForceNotifyAcceptUI extends MMBaseActivity {

    /* renamed from: f */
    public static C93814a f270753f;

    /* renamed from: g */
    public static C101218e0 f270754g;

    /* renamed from: e */
    public final int f270755e = 1234;

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUI$c */
    public static final class C85192c implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ ForceNotifyAcceptUI f248202a;

        public C85192c(ForceNotifyAcceptUI forceNotifyAcceptUI) {
            this.f248202a = forceNotifyAcceptUI;
        }

        /* renamed from: a */
        public final void mo2001a() {
            if (C11171e.m11046c(23)) {
                try {
                    Object obj = Settings.class.getField("ACTION_MANAGE_OVERLAY_PERMISSION").get(Settings.class);
                    C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.String");
                    if (!Util.isNullOrNil((String) obj)) {
                        ForceNotifyAcceptUI forceNotifyAcceptUI = this.f248202a;
                        forceNotifyAcceptUI.startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + MMApplicationContext.getPackageName())), this.f248202a.f270755e);
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            String string = this.f248202a.getString(C0966R.string.evx);
            C87412m.m108593f(string, "getString(com.tencent.mm…ng_window_permission_url)");
            Intent intent = new Intent();
            intent.putExtra("rawUrl", string);
            intent.putExtra("useJs", true);
            intent.putExtra("vertical_scroll", true);
            C88144b.m109791i(this.f248202a, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            this.f248202a.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUI$a */
    public interface C93814a {
        /* renamed from: a */
        void mo85588a(ForceNotifyAcceptUI forceNotifyAcceptUI);

        /* renamed from: b */
        void mo85589b(ForceNotifyAcceptUI forceNotifyAcceptUI);

        /* renamed from: c */
        void mo85590c(ForceNotifyAcceptUI forceNotifyAcceptUI);
    }

    /* renamed from: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyAcceptUI$b */
    public static final class C93815b implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ ForceNotifyAcceptUI f270756a;

        public C93815b(ForceNotifyAcceptUI forceNotifyAcceptUI) {
            this.f270756a = forceNotifyAcceptUI;
        }

        /* renamed from: a */
        public final void mo2001a() {
            C93814a aVar = ForceNotifyAcceptUI.f270753f;
            if (aVar != null) {
                aVar.mo85589b(this.f270756a);
            }
            ForceNotifyAcceptUI.f270753f = null;
            this.f270756a.finish();
        }
    }

    /* renamed from: E7 */
    public final void mo128736E7() {
        Bundle extras;
        if (getIntent() != null && (extras = getIntent().getExtras()) != null) {
            C101218e0 e0Var = new C101218e0(this, 1, 2, false);
            e0Var.mo140671q(extras.getString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, getString(C0966R.string.f1w)));
            View inflate = C85868k2.m106137b(this).inflate(C0966R.C0971layout.asg, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.edy);
            if (textView != null) {
                textView.setText(extras.getString("warning_content"));
            }
            e0Var.mo140663j(inflate);
            String string = getString(C11171e.m11046c(23) ? C0966R.string.f1f : C0966R.string.f1s);
            C87412m.m108593f(string, "getString(if (CApiLevel.…_notify_view_open_method)");
            e0Var.mo140667n(getString(C0966R.string.f1c), string);
            e0Var.mo140668o(0);
            C93815b bVar = new C93815b(this);
            C85192c cVar = new C85192c(this);
            e0Var.f296373D = bVar;
            e0Var.f296374E = cVar;
            f270754g = e0Var;
            e0Var.mo140655A();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C93814a aVar = f270753f;
        if (aVar == null) {
            finish();
            return;
        }
        if (i == this.f270755e) {
            if (((C103918d) C86312j.m106911c(C103918d.class)).mo125772Jn(MMApplicationContext.getContext())) {
                C93814a aVar2 = f270753f;
                if (aVar2 != null) {
                    aVar2.mo85588a(this);
                }
            } else {
                C93814a aVar3 = f270753f;
                if (aVar3 != null) {
                    aVar3.mo85590c(this);
                }
            }
        } else if (aVar != null) {
            aVar.mo85590c(this);
        }
        f270753f = null;
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setTheme(C0966R.style.f8648pu);
        mo128736E7();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        C101218e0 e0Var = f270754g;
        if (e0Var != null) {
            if (e0Var != null) {
                e0Var.mo140680z();
            }
            f270754g = null;
        }
        mo128736E7();
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
