package y52;

import ad3.C67027a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Message;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.plugin.masssend.p076ui.MassSendHistoryUI;
import com.tencent.p014mm.pluginsdk.p133ui.preference.HelperHeaderPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C97625j3;
import g62.C8233m;
import j20.C117292a;
import java.util.HashMap;
import junit.framework.Assert;
import k20.C9556a;
import nj3.C76879j;
import p214om.C11502f;
import pj3.C47511g;
import qo3.C89779i0;
import tc0.C77884m;
import tc0.C77885p;
import w52.C38023l;
import w52.C78518e;
import zt3.C119157j;

/* renamed from: y52.a */
public class C79038a implements C67027a, MStorageEx.IOnStorageChange {

    /* renamed from: d */
    public C47511g f232116d;

    /* renamed from: e */
    public Context f232117e;

    /* renamed from: f */
    public C72996z1 f232118f;

    /* renamed from: y52.a$a */
    public class C79039a implements DialogInterface.OnClickListener {
        public C79039a(C79038a aVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C79038a.m95600a();
        }
    }

    /* renamed from: y52.a$b */
    public class C79040b implements DialogInterface.OnClickListener {
        public C79040b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C79038a.m95601b(C79038a.this.f232117e, false, (C6975i1<C72996z1>) null);
        }
    }

    /* renamed from: y52.a$c */
    public class C79041c extends MMHandler {

        /* renamed from: a */
        public final /* synthetic */ boolean f232120a;

        /* renamed from: b */
        public final /* synthetic */ C6975i1 f232121b;

        public C79041c(boolean z, C6975i1 i1Var) {
            this.f232120a = z;
            this.f232121b = i1Var;
        }

        public void handleMessage(Message message) {
            int o = C75592q0.m90785o();
            int i = this.f232120a ? o & -65537 : o | 65536;
            C97625j3.m125812b().mo105906u().mo119676J(34, Integer.valueOf(i));
            C8233m B = C97625j3.m125812b().mo105876B();
            C77884m mVar = r2;
            C77884m mVar2 = new C77884m(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i, "", 0, "", 0);
            ((C77885p) B).mo107993q(mVar);
            if (!this.f232120a) {
                C79038a.m95600a();
            }
            C6975i1 i1Var = this.f232121b;
            if (i1Var != null) {
                i1Var.onNotifyChange((String) null, (MStorageEventData) null);
            }
        }
    }

    /* renamed from: y52.a$d */
    public class C79042d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C89779i0 f232122d;

        /* renamed from: e */
        public final /* synthetic */ MMHandler f232123e;

        public C79042d(C89779i0 i0Var, MMHandler mMHandler) {
            this.f232122d = i0Var;
            this.f232123e = mMHandler;
        }

        public void run() {
            C89779i0 i0Var = this.f232122d;
            if (i0Var != null) {
                i0Var.dismiss();
                this.f232123e.sendEmptyMessage(0);
            }
        }
    }

    public C79038a(Context context) {
        new HashMap();
        this.f232117e = context;
    }

    /* renamed from: a */
    public static void m95600a() {
        C78518e wx02 = C38023l.wx0();
        if (wx02.f229995d.execSQL("massendinfo", "delete from massendinfo")) {
            wx02.doNotify();
        }
        ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f("masssendapp");
    }

    /* renamed from: b */
    public static void m95601b(Context context, boolean z, C6975i1<C72996z1> i1Var) {
        ((C119157j) C119157j.f356862d).mo183878i(new C79042d(C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(z ? C0966R.string.iww : C0966R.string.f361324ix3), true, true, (DialogInterface.OnCancelListener) null), new C79041c(z, i1Var)), 1500);
    }

    /* renamed from: c */
    public final void mo108990c() {
        boolean z = (C75592q0.m90785o() & 65536) == 0;
        HelperHeaderPreference helperHeaderPreference = (HelperHeaderPreference) this.f232116d.mo72519a("contact_info_masssend_header_helper");
        helperHeaderPreference.mo7600I(this.f232118f.getUsername(), this.f232118f.mo62898f(), this.f232117e.getString(C0966R.string.bnz));
        helperHeaderPreference.mo7601J(z ? 1 : 0);
        this.f232116d.mo72529n("contact_info_masssend_install", z);
        this.f232116d.mo72529n("contact_info_masssend_view", !z);
        this.f232116d.mo72529n("contact_info_masssend_clear_data", !z);
        this.f232116d.mo72529n("contact_info_masssend_uninstall", !z);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onDetach() {
        C97625j3.m125812b().mo105906u().remove(this);
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93136Bk();
        return true;
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        int nullAsInt = Util.nullAsInt(obj, 0);
        Log.m105919d("MicroMsg.ContactWidgetMassSend", "onNotifyChange event:%d obj:%d stg:%s", Integer.valueOf(i), Integer.valueOf(nullAsInt), mStorageEx);
        if (mStorageEx != C97625j3.m125812b().mo105906u() || nullAsInt <= 0) {
            Log.m105921e("MicroMsg.ContactWidgetMassSend", "onNotifyChange error obj:%d stg:%s", Integer.valueOf(nullAsInt), mStorageEx);
        } else if (nullAsInt == 40 || nullAsInt == 34 || nullAsInt == 7) {
            mo108990c();
        }
    }

    /* renamed from: x */
    public boolean mo5961x(C47511g gVar, C72996z1 z1Var, boolean z, int i) {
        boolean z2 = false;
        Assert.assertTrue(gVar != null);
        if (z1Var != null) {
            z2 = true;
        }
        Assert.assertTrue(z2);
        Assert.assertTrue(C72996z1.m85836g5(z1Var.getUsername()));
        C97625j3.m125812b().mo105906u().add(this);
        this.f232118f = z1Var;
        this.f232116d = gVar;
        gVar.mo72520b(C0966R.xml.f8872y);
        mo108990c();
        return true;
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        Log.m105918d("MicroMsg.ContactWidgetMassSend", "handleEvent : key = " + str);
        if (Util.nullAsNil(str).length() <= 0) {
            return false;
        }
        if (str.equals("contact_info_masssend_view")) {
            Intent intent = new Intent(this.f232117e, MassSendHistoryUI.class);
            Context context = this.f232117e;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/masssend/ui/ContactWidgetMassSend", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/masssend/ui/ContactWidgetMassSend", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (str.equals("contact_info_masssend_clear_data")) {
            Context context3 = this.f232117e;
            C76879j.m92707A(context3, context3.getString(C0966R.string.blf), "", this.f232117e.getString(C0966R.string.f7930wk), this.f232117e.getString(C0966R.string.f7926wf), new C79039a(this), (DialogInterface.OnClickListener) null);
            return true;
        } else if (str.equals("contact_info_masssend_install")) {
            m95601b(this.f232117e, true, (C6975i1<C72996z1>) null);
            return true;
        } else if (str.equals("contact_info_masssend_uninstall")) {
            Context context4 = this.f232117e;
            C76879j.m92707A(context4, context4.getString(C0966R.string.iwz), "", this.f232117e.getString(C0966R.string.f7930wk), this.f232117e.getString(C0966R.string.f7926wf), new C79040b(), (DialogInterface.OnClickListener) null);
            return true;
        } else {
            Log.m105920e("MicroMsg.ContactWidgetMassSend", "handleEvent : unExpected key = " + str);
            return false;
        }
    }
}
