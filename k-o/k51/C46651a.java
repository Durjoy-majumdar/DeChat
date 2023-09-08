package k51;

import ad3.C67027a;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.pluginsdk.p133ui.preference.HelperHeaderPreference;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import e51.C45544c;
import e51.C45547h;
import eb0.C45628s0;
import eb0.C45629t0;
import eb0.C75592q0;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import ke3.C88144b;
import nj3.C76879j;
import pj3.C47511g;
import tc0.C77885p;
import te3.C48993ce3;

/* renamed from: k51.a */
public class C46651a implements C67027a {

    /* renamed from: d */
    public Context f125598d;

    /* renamed from: e */
    public C72996z1 f125599e;

    /* renamed from: f */
    public C47511g f125600f;

    /* renamed from: g */
    public boolean f125601g;

    /* renamed from: h */
    public CheckBoxPreference f125602h;

    /* renamed from: i */
    public CheckBoxPreference f125603i;

    /* renamed from: k51.a$a */
    public class C46652a implements DialogInterface.OnClickListener {
        public C46652a(C46651a aVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C75604z3.m90839k("downloaderapp");
        }
    }

    /* renamed from: k51.a$b */
    public class C46653b implements DialogInterface.OnClickListener {
        public C46653b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C45547h) C86312j.m106911c(C45547h.class)).mo70798pE();
            C46651a aVar = C46651a.this;
            aVar.mo71909a(aVar.f125598d, false);
        }
    }

    /* renamed from: k51.a$c */
    public class C46654c implements DialogInterface.OnClickListener {
        public C46654c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C45547h) C86312j.m106911c(C45547h.class)).p30(C46651a.this.f125598d, (Intent) null, (C45544c) null);
        }
    }

    /* renamed from: k51.a$d */
    public class C46655d implements DialogInterface.OnClickListener {
        public C46655d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C45547h) C86312j.m106911c(C45547h.class)).mo70798pE();
            C46651a aVar = C46651a.this;
            aVar.mo71909a(aVar.f125598d, false);
        }
    }

    /* renamed from: k51.a$e */
    public class C46656e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f125607d;

        /* renamed from: e */
        public final /* synthetic */ ProgressDialog f125608e;

        /* renamed from: f */
        public final /* synthetic */ Context f125609f;

        /* renamed from: k51.a$e$a */
        public class C46657a implements Runnable {
            public C46657a() {
            }

            public void run() {
                Class cls = C45547h.class;
                C46651a.this.mo71910b();
                C46656e.this.f125608e.dismiss();
                if (C46656e.this.f125607d) {
                    ((C45547h) C86312j.m106911c(cls)).mo70799uD();
                    Bundle bundleExtra = ((Activity) C46656e.this.f125609f).getIntent().getBundleExtra("download_params");
                    if (bundleExtra != null) {
                        ((C45547h) C86312j.m106911c(cls)).p30(C46656e.this.f125609f, new Intent().putExtras(bundleExtra), (C45544c) null);
                    }
                }
            }
        }

        public C46656e(boolean z, ProgressDialog progressDialog, Context context) {
            this.f125607d = z;
            this.f125608e = progressDialog;
            this.f125609f = context;
        }

        public void run() {
            Class cls = C75700k0.class;
            C46651a aVar = C46651a.this;
            boolean z = this.f125607d;
            aVar.getClass();
            int o = C75592q0.m90785o();
            C86709a0.m107535s().mo121142i().mo119676J(34, Integer.valueOf(z ? o & -134217729 : o | 134217728));
            C48993ce3 ce32 = new C48993ce3();
            ce32.f131680d = 134217728;
            ce32.f131681e = z ^ true ? 1 : 0;
            ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(new C32330n(39, ce32));
            if (!this.f125607d) {
                C75604z3.m90839k("downloaderapp");
                ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69763f("downloaderapp");
            }
            MMHandlerThread.postToMainThreadDelayed(new C46657a(), 1000);
        }
    }

    public C46651a(Context context) {
        this.f125598d = context;
    }

    /* renamed from: a */
    public final void mo71909a(Context context, boolean z) {
        C86709a0.m107525e().postToWorker(new C46656e(z, C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(z ? C0966R.string.iww : C0966R.string.f361324ix3), true, true, (DialogInterface.OnCancelListener) null), context));
    }

    /* renamed from: b */
    public final void mo71910b() {
        HelperHeaderPreference helperHeaderPreference = (HelperHeaderPreference) this.f125600f.mo72519a("contact_info_header_helper");
        helperHeaderPreference.mo7600I(this.f125599e.getUsername(), this.f125599e.mo62898f(), this.f125598d.getString(C0966R.string.c1w));
        boolean z = (C75592q0.m90785o() & 134217728) == 0;
        this.f125601g = z;
        helperHeaderPreference.mo7601J(z ? 1 : 0);
        this.f125600f.mo72529n("contact_info_downloader_install", this.f125601g);
        this.f125600f.mo72529n("contact_info_downloader_uninstall", !this.f125601g);
        this.f125600f.mo72529n("contact_info_go_to_downloader", !this.f125601g);
        this.f125600f.mo72529n("contact_info_downloader_manager", !this.f125601g);
        this.f125600f.mo72529n("contact_info_common_problem", true);
        this.f125600f.mo72529n("contact_info_top_downloader", !this.f125601g);
        this.f125600f.mo72529n("contact_info_not_disturb", !this.f125601g);
        this.f125600f.mo72529n("contact_info_clear_data", !this.f125601g);
        if (this.f125601g) {
            if (((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69755a0(this.f125599e.getUsername())) {
                this.f125602h.mo6805K(true);
            } else {
                this.f125602h.mo6805K(false);
            }
            if (C45628s0.m50746K(this.f125599e)) {
                this.f125603i.mo6805K(true);
            } else {
                this.f125603i.mo6805K(false);
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onDetach() {
        return true;
    }

    /* renamed from: x */
    public boolean mo5961x(C47511g gVar, C72996z1 z1Var, boolean z, int i) {
        this.f125600f = gVar;
        this.f125599e = z1Var;
        gVar.mo72520b(C0966R.xml.f8866s);
        this.f125602h = (CheckBoxPreference) gVar.mo72519a("contact_info_top_downloader");
        this.f125603i = (CheckBoxPreference) gVar.mo72519a("contact_info_not_disturb");
        mo71910b();
        return true;
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        String str2 = str;
        Class cls = C45547h.class;
        if ("contact_info_go_to_downloader".equals(str2)) {
            Intent intent = new Intent();
            intent.putExtra("Chat_User", this.f125599e.getUsername());
            intent.putExtra("finish_direct", true);
            C88144b.m109801s(this.f125598d, ".ui.chatting.ChattingUI", intent, (Bundle) null);
            return true;
        } else if ("contact_info_downloader_manager".equals(str2)) {
            ((C45547h) C86312j.m106911c(cls)).p30(this.f125598d, (Intent) null, (C45544c) null);
            return true;
        } else if ("contact_info_common_problem".equals(str2)) {
            Intent intent2 = new Intent();
            intent2.putExtra("KPublisherId", "custom_menu");
            intent2.putExtra("pre_username", this.f125599e.getUsername());
            intent2.putExtra("prePublishId", "custom_menu");
            intent2.putExtra("preUsername", this.f125599e.getUsername());
            intent2.putExtra("preChatName", this.f125599e.getUsername());
            intent2.putExtra("preChatTYPE", C45629t0.m50815b(this.f125599e.getUsername(), this.f125599e.getUsername()));
            intent2.putExtra("rawUrl", HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/readtemplate?t=wechat_movement_faq/index");
            intent2.putExtra("geta8key_username", this.f125599e.getUsername());
            intent2.putExtra("from_scence", 1);
            C88144b.m109791i(this.f125598d, "webview", ".ui.tools.WebViewUI", intent2, (Bundle) null);
            return true;
        } else if ("contact_info_top_downloader".equals(str2)) {
            if (this.f125602h.mo6804J()) {
                C45628s0.m50787m0(this.f125599e.getUsername(), true, true);
            } else {
                C45628s0.m50803u0(this.f125599e.getUsername(), true);
            }
            return true;
        } else if ("contact_info_not_disturb".equals(str2)) {
            if (this.f125603i.mo6804J()) {
                C45628s0.m50779i0(this.f125599e, true);
            } else {
                C45628s0.m50797r0(this.f125599e, true);
            }
            return true;
        } else if ("contact_info_clear_data".equals(str2)) {
            Context context = this.f125598d;
            C76879j.m92707A(context, context.getString(C0966R.string.blf), "", this.f125598d.getString(C0966R.string.f7930wk), this.f125598d.getString(C0966R.string.f7926wf), new C46652a(this), (DialogInterface.OnClickListener) null);
            return true;
        } else if ("contact_info_downloader_install".equals(str2)) {
            mo71909a(this.f125598d, true);
            return true;
        } else if (!"contact_info_downloader_uninstall".equals(str2)) {
            return false;
        } else {
            if (((C45547h) C86312j.m106911c(cls)).mo70787FP()) {
                Context context2 = this.f125598d;
                C76879j.m92707A(context2, context2.getString(C0966R.string.c2g), this.f125598d.getString(C0966R.string.c2h), this.f125598d.getString(C0966R.string.c2f), this.f125598d.getString(C0966R.string.f360352c22), new C46653b(), new C46654c());
            } else {
                Context context3 = this.f125598d;
                C76879j.m92707A(context3, context3.getString(C0966R.string.iwz), "", this.f125598d.getString(C0966R.string.f7930wk), this.f125598d.getString(C0966R.string.f7926wf), new C46655d(), (DialogInterface.OnClickListener) null);
            }
            return true;
        }
    }
}
