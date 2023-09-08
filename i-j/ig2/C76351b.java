package ig2;

import ad3.C67027a;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.plugin.readerapp.p092ui.ReaderAppSubscribeUI;
import com.tencent.p014mm.plugin.readerapp.p092ui.ReaderAppUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.preference.HelperHeaderPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import hg2.C76193l;
import j20.C117292a;
import junit.framework.Assert;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import p214om.C11502f;
import pj3.C47511g;
import tc0.C37006i;
import tc0.C77885p;
import te3.C48993ce3;
import te3.C64266br1;
import zt3.C119157j;

/* renamed from: ig2.b */
public class C76351b implements C67027a, MStorageEx.IOnStorageChange {

    /* renamed from: d */
    public C47511g f223611d;

    /* renamed from: e */
    public Context f223612e;

    /* renamed from: f */
    public C72996z1 f223613f;

    /* renamed from: g */
    public boolean f223614g;

    /* renamed from: h */
    public boolean f223615h;

    /* renamed from: i */
    public long f223616i;

    /* renamed from: ig2.b$a */
    public class C76352a implements DialogInterface.OnClickListener {

        /* renamed from: ig2.b$a$a */
        public class C76353a implements C76193l.C76196c {

            /* renamed from: a */
            public final /* synthetic */ ProgressDialog f223618a;

            public C76353a(C76352a aVar, ProgressDialog progressDialog) {
                this.f223618a = progressDialog;
            }

            /* renamed from: a */
            public void mo106457a() {
                this.f223618a.dismiss();
            }

            /* renamed from: b */
            public boolean mo106458b() {
                return false;
            }
        }

        public C76352a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Context context = C76351b.this.f223612e;
            C76193l.vx0(new C76353a(this, C76879j.m92723Q(context, "", context.getString(C0966R.string.hrj), false, false, (DialogInterface.OnCancelListener) null)));
        }
    }

    /* renamed from: ig2.b$b */
    public class C76354b implements DialogInterface.OnClickListener {
        public C76354b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115669n.INSTANCE.mo160131h(15413, 4, "", "");
            C76351b bVar = C76351b.this;
            bVar.mo106579b(bVar.f223612e, false, (C6975i1<C72996z1>) null);
        }
    }

    /* renamed from: ig2.b$c */
    public class C76355c extends MMHandler {

        /* renamed from: a */
        public final /* synthetic */ boolean f223620a;

        /* renamed from: b */
        public final /* synthetic */ Context f223621b;

        /* renamed from: c */
        public final /* synthetic */ C6975i1 f223622c;

        /* renamed from: ig2.b$c$a */
        public class C76356a implements C76193l.C76196c {

            /* renamed from: a */
            public final /* synthetic */ ProgressDialog f223624a;

            public C76356a(C76355c cVar, ProgressDialog progressDialog) {
                this.f223624a = progressDialog;
            }

            /* renamed from: a */
            public void mo106457a() {
                ProgressDialog progressDialog = this.f223624a;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
            }

            /* renamed from: b */
            public boolean mo106458b() {
                return false;
            }
        }

        public C76355c(boolean z, Context context, C6975i1 i1Var) {
            this.f223620a = z;
            this.f223621b = context;
            this.f223622c = i1Var;
        }

        public void handleMessage(Message message) {
            int o = C75592q0.m90785o();
            C86709a0.m107535s().mo121142i().mo119676J(34, Integer.valueOf(this.f223620a ? o & -524289 : o | 524288));
            C48993ce3 ce32 = new C48993ce3();
            ce32.f131680d = 524288;
            ce32.f131681e = this.f223620a ^ true ? 1 : 0;
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(39, ce32));
            if (!this.f223620a) {
                Context context = this.f223621b;
                C76193l.vx0(new C76356a(this, C76879j.m92723Q(context, "", context.getString(C0966R.string.hrj), false, false, (DialogInterface.OnCancelListener) null)));
                C76351b.m91774a(false);
            } else {
                C76351b.m91774a(true);
                C45628s0.m50797r0(C76351b.this.f223613f, true);
            }
            C6975i1 i1Var = this.f223622c;
            if (i1Var != null) {
                i1Var.onNotifyChange((String) null, (MStorageEventData) null);
            }
        }
    }

    /* renamed from: ig2.b$d */
    public class C76357d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ProgressDialog f223625d;

        /* renamed from: e */
        public final /* synthetic */ MMHandler f223626e;

        public C76357d(C76351b bVar, ProgressDialog progressDialog, MMHandler mMHandler) {
            this.f223625d = progressDialog;
            this.f223626e = mMHandler;
        }

        public void run() {
            ProgressDialog progressDialog = this.f223625d;
            if (progressDialog != null) {
                progressDialog.dismiss();
                this.f223626e.sendEmptyMessage(0);
            }
        }
    }

    public C76351b(Context context) {
        this.f223612e = context;
    }

    /* renamed from: a */
    public static void m91774a(boolean z) {
        int p = C75592q0.m90786p();
        C86709a0.m107535s().mo121142i().mo119676J(40, Integer.valueOf(z ? p & -1025 : p | 1024));
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C37006i(26, z ? 2 : 1));
    }

    /* renamed from: b */
    public void mo106579b(Context context, boolean z, C6975i1<C72996z1> i1Var) {
        ((C119157j) C119157j.f356862d).mo183878i(new C76357d(this, C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(z ? C0966R.string.iww : C0966R.string.f361324ix3), true, true, (DialogInterface.OnCancelListener) null), new C76355c(z, context, i1Var)), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
    }

    /* renamed from: c */
    public final void mo106580c() {
        boolean z = true;
        int i = (C75592q0.m90785o() & 524288) == 0 ? 1 : 0;
        this.f223611d.removeAll();
        this.f223611d.mo72520b(C0966R.xml.f8877a6);
        HelperHeaderPreference helperHeaderPreference = (HelperHeaderPreference) this.f223611d.mo72519a("contact_info_header_helper");
        helperHeaderPreference.mo7600I(this.f223613f.getUsername(), this.f223613f.mo62898f(), this.f223612e.getString(C0966R.string.bpv));
        helperHeaderPreference.mo7601J(i);
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f223611d.mo72519a("contact_info_readerappnews_recv_remind");
        if ((C75592q0.m90786p() & 1024) != 0) {
            z = false;
        }
        Log.m105918d("MicroMsg.ContactWidgetReaderAppNews", "wantToReceiveNews = " + z);
        if (checkBoxPreference != null) {
            checkBoxPreference.mo6805K(z);
        }
        ((CheckBoxPreference) this.f223611d.mo72519a("contact_info_readerappnews_mute")).mo6805K(C45628s0.m50746K(this.f223613f));
        ((CheckBoxPreference) this.f223611d.mo72519a("contact_info_readerappnews_top")).mo6805K(this.f223613f.mo62940x3());
        if (i != 0) {
            this.f223611d.mo72531o("contact_info_readerappnews_install");
            return;
        }
        this.f223611d.mo72531o("contact_info_readerappnews_subscribe");
        this.f223611d.mo72531o("contact_info_readerappnews_view");
        this.f223611d.mo72531o("contact_info_readerappnews_help");
        this.f223611d.mo72531o("contact_info_readerappnews_clear_data");
        this.f223611d.mo72531o("contact_info_readerappnews_uninstall");
        this.f223611d.mo72531o("contact_info_readerappnews_recv_remind");
        this.f223611d.mo72531o("contact_info_readerappnews_mute");
        this.f223611d.mo72531o("contact_info_readerappnews_top");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onDetach() {
        C86709a0.m107535s().mo121142i().remove(this);
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93136Bk();
        return true;
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        int nullAsInt = Util.nullAsInt(obj, 0);
        Log.m105919d("MicroMsg.ContactWidgetReaderAppNews", "onNotifyChange event:%d obj:%d stg:%s", Integer.valueOf(i), Integer.valueOf(nullAsInt), mStorageEx);
        if (mStorageEx != C86709a0.m107535s().mo121142i() || nullAsInt <= 0) {
            Log.m105921e("MicroMsg.ContactWidgetReaderAppNews", "onNotifyChange error obj:%d stg:%s", Integer.valueOf(nullAsInt), mStorageEx);
        } else if (nullAsInt == 40 || nullAsInt == 34 || nullAsInt == 7) {
            mo106580c();
        }
    }

    /* renamed from: x */
    public boolean mo5961x(C47511g gVar, C72996z1 z1Var, boolean z, int i) {
        Assert.assertTrue(gVar != null);
        Assert.assertTrue(z1Var != null);
        Assert.assertTrue(C72996z1.m85853x5(z1Var.getUsername()));
        C86709a0.m107535s().mo121142i().add(this);
        this.f223613f = z1Var;
        this.f223611d = gVar;
        this.f223616i = C75592q0.m90780j();
        Context context = this.f223612e;
        if (context instanceof Activity) {
            C115669n.INSTANCE.mo160131h(15413, 16, "", "", "", "", "", 0, 0, ((Activity) context).getIntent().getStringExtra("reportSessionId"));
        }
        mo106580c();
        return true;
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        String str2 = str;
        Class cls = C75700k0.class;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_EXT_STATUS2_LONG_SYNC;
        Log.m105918d("MicroMsg.ContactWidgetReaderAppNews", "handleEvent : key = " + str2);
        if (Util.nullAsNil(str).length() <= 0) {
            return false;
        }
        if (str2.equals("contact_info_readerappnews_view")) {
            Intent intent = new Intent(this.f223612e, ReaderAppUI.class);
            intent.putExtra("type", 20);
            intent.setFlags(67108864);
            Context context = this.f223612e;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/readerapp/ui/ContactWidgetReaderAppNews", "gotoViewReaderapp", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/readerapp/ui/ContactWidgetReaderAppNews", "gotoViewReaderapp", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93136Bk();
            return true;
        } else if (str2.equals("contact_info_readerappnews_subscribe")) {
            Intent intent2 = new Intent(this.f223612e, ReaderAppSubscribeUI.class);
            Context context3 = this.f223612e;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(intent2);
            Context context4 = context3;
            C117292a.m165358d(context4, aVar3.mo10232b(), "com/tencent/mm/plugin/readerapp/ui/ContactWidgetReaderAppNews", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context3.startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(context4, "com/tencent/mm/plugin/readerapp/ui/ContactWidgetReaderAppNews", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else {
            if (str2.equals("contact_info_readerappnews_help")) {
                Intent intent3 = new Intent();
                intent3.putExtra("rawUrl", "https://ifeedback.qq.com/platform/feedback?app_id=1078&uin=test");
                intent3.putExtra("geta8key_scene", 79);
                C88144b.m109791i(this.f223612e, "webview", ".ui.tools.WebViewUI", intent3, (Bundle) null);
            }
            if (str2.equals("contact_info_readerappnews_clear_data")) {
                Context context5 = this.f223612e;
                C76879j.m92707A(context5, context5.getString(C0966R.string.blg), "", this.f223612e.getString(C0966R.string.f7930wk), this.f223612e.getString(C0966R.string.f7926wf), new C76352a(), (DialogInterface.OnClickListener) null);
                return true;
            }
            int i = 2;
            if (str2.equals("contact_info_readerappnews_recv_remind")) {
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f223611d.mo72519a(str2);
                boolean z = (C75592q0.m90786p() & 1024) == 0;
                if (!z) {
                    C115669n.INSTANCE.mo160131h(15413, 7, "", "");
                } else {
                    C115669n.INSTANCE.mo160131h(15413, 6, "", "");
                }
                if (checkBoxPreference != null) {
                    checkBoxPreference.mo6805K(!z);
                }
                m91774a(!z);
                return true;
            } else if (str2.equals("contact_info_readerappnews_top")) {
                boolean J = ((CheckBoxPreference) this.f223611d.mo72519a(str2)).mo6804J();
                Log.m105918d("MicroMsg.ContactWidgetReaderAppNews", "placed appnews to the top");
                if (J) {
                    C115669n.INSTANCE.mo160131h(15413, 13);
                    C45628s0.m50787m0("newsapp", true, true);
                    this.f223615h = true;
                } else {
                    C115669n.INSTANCE.mo160131h(15413, 14);
                    C45628s0.m50803u0("newsapp", true);
                    this.f223615h = false;
                }
                if (this.f223615h) {
                    this.f223616i |= 8192;
                } else {
                    this.f223616i &= -8193;
                }
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(this.f223616i));
                if (this.f223615h) {
                    i = 1;
                }
                C64266br1 br12 = new C64266br1();
                br12.f182324d = 82;
                br12.f182325e = i;
                ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(new C32330n(23, br12));
                Log.m105924i("MicroMsg.ContactWidgetReaderAppNews", "switch ext change : isTop open = " + this.f223615h + " item value = " + br12.f182325e + " functionId = " + br12.f182324d);
                return true;
            } else if (str2.equals("contact_info_readerappnews_mute")) {
                CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) this.f223611d.mo72519a(str2);
                if (C45628s0.m50746K(this.f223613f)) {
                    C115669n.INSTANCE.mo160131h(15413, 11);
                    C45628s0.m50797r0(this.f223613f, true);
                    this.f223614g = false;
                } else {
                    C115669n.INSTANCE.mo160131h(15413, 12);
                    C45628s0.m50779i0(this.f223613f, true);
                    this.f223614g = true;
                }
                if (this.f223614g) {
                    this.f223616i |= 4096;
                } else {
                    this.f223616i &= -4097;
                }
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(this.f223616i));
                if (this.f223614g) {
                    i = 1;
                }
                C64266br1 br13 = new C64266br1();
                br13.f182324d = 81;
                br13.f182325e = i;
                ((C77885p) ((C75700k0) C86709a0.m107533q(cls)).mo96100XW()).mo107993q(new C32330n(23, br13));
                Log.m105924i("MicroMsg.ContactWidgetReaderAppNews", "switch ext change : isMute open = " + this.f223614g + " item value = " + br13.f182325e + " functionId = " + br13.f182324d);
                return true;
            } else if (str2.equals("contact_info_readerappnews_install")) {
                C115669n.INSTANCE.mo160131h(15413, 5, "", "");
                mo106579b(this.f223612e, true, (C6975i1<C72996z1>) null);
                return true;
            } else if (str2.equals("contact_info_readerappnews_uninstall")) {
                Context context6 = this.f223612e;
                C76879j.m92707A(context6, context6.getString(C0966R.string.iwz), "", this.f223612e.getString(C0966R.string.f7930wk), this.f223612e.getString(C0966R.string.f7926wf), new C76354b(), (DialogInterface.OnClickListener) null);
                return true;
            } else {
                Log.m105920e("MicroMsg.ContactWidgetReaderAppNews", "handleEvent : unExpected key = " + str2);
                return false;
            }
        }
    }
}
