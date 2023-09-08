package eb0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;

/* renamed from: eb0.f2 */
public class C45609f2 {
    /* renamed from: a */
    public static void m50669a(C72996z1 z1Var) {
        Class cls = C75700k0.class;
        if (z1Var == null) {
            z1Var = new C72996z1();
        }
        if (((int) z1Var.f108320R1) == 0) {
            z1Var.setUsername("filehelper");
            if (((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j(z1Var.getUsername()) == null) {
                z1Var.mo62935u4();
            } else {
                z1Var.mo62868O3();
            }
            z1Var.mo62879U3(3);
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69668Q3(z1Var);
        }
    }

    /* renamed from: c */
    public static void m50670c(C72996z1 z1Var) {
        String username = z1Var.getUsername();
        Context context = MMApplicationContext.getContext();
        if (username.equals("qqsync")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fin));
            z1Var.mo62882W2(context.getString(C0966R.string.fio));
            z1Var.mo62884X2(context.getString(C0966R.string.fip));
        }
        if (username.equals("floatbottle")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fgz));
            z1Var.mo62882W2(context.getString(C0966R.string.f360867fh0));
            z1Var.mo62884X2(context.getString(C0966R.string.f360868fh1));
        }
        if (username.equals("shakeapp")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fiu));
            z1Var.mo62882W2(context.getString(C0966R.string.fiv));
            z1Var.mo62884X2(context.getString(C0966R.string.fiw));
        }
        if (username.equals("lbsapp")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fho));
            z1Var.mo62882W2(context.getString(C0966R.string.fhp));
            z1Var.mo62884X2(context.getString(C0966R.string.fhq));
        }
        if (username.equals("medianote")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fhx));
            z1Var.mo62882W2(context.getString(C0966R.string.fhy));
            z1Var.mo62884X2(context.getString(C0966R.string.fhz));
        }
        if (username.equals("newsapp")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fiq));
            z1Var.mo62882W2(context.getString(C0966R.string.fir));
            z1Var.mo62884X2(context.getString(C0966R.string.fis));
        }
        if (username.equals("facebookapp")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fha));
            z1Var.mo62882W2(context.getString(C0966R.string.fhb));
            z1Var.mo62884X2(context.getString(C0966R.string.fhc));
        }
        if (username.equals("qqfriend")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fif));
            z1Var.mo62882W2(context.getString(C0966R.string.fig));
            z1Var.mo62884X2(context.getString(C0966R.string.fih));
        }
        if (username.equals("masssendapp")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fhu));
            z1Var.mo62882W2(context.getString(C0966R.string.fhv));
            z1Var.mo62884X2(context.getString(C0966R.string.fhw));
        }
        if (username.equals("feedsapp")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fhd));
            z1Var.mo62882W2(context.getString(C0966R.string.fhe));
            z1Var.mo62884X2(context.getString(C0966R.string.fhf));
        }
        if (username.equals("fmessage")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fhg));
            z1Var.mo62882W2(context.getString(C0966R.string.fhh));
            z1Var.mo62884X2(context.getString(C0966R.string.fhi));
        }
        if (username.equals("voipapp")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fj4));
            z1Var.mo62882W2(context.getString(C0966R.string.fj5));
            z1Var.mo62884X2(context.getString(C0966R.string.fj6));
        }
        if (username.equals("officialaccounts")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fi5));
            z1Var.mo62882W2(context.getString(C0966R.string.fi6));
            z1Var.mo62884X2(context.getString(C0966R.string.fi7));
        }
        if (username.equals("findersayhisessionholder")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fi8));
            z1Var.mo62882W2(context.getString(C0966R.string.fi9));
            z1Var.mo62884X2(context.getString(C0966R.string.fi_));
        }
        if (username.equals("helper_entry")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fhl));
            z1Var.mo62882W2(context.getString(C0966R.string.fhm));
            z1Var.mo62884X2(context.getString(C0966R.string.fhn));
        }
        if (username.equals("cardpackage")) {
            z1Var.mo62878U2(context.getString(C0966R.string.f360869fh2));
            z1Var.mo62882W2(context.getString(C0966R.string.f360870fh3));
            z1Var.mo62884X2(context.getString(C0966R.string.fh4));
        }
        if (username.equals("voicevoipapp")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fj7));
            z1Var.mo62882W2(context.getString(C0966R.string.fj8));
            z1Var.mo62884X2(context.getString(C0966R.string.fj9));
        }
        if (username.equals("voiceinputapp")) {
            z1Var.mo62878U2(context.getString(C0966R.string.f360875fj1));
            z1Var.mo62882W2(context.getString(C0966R.string.f360876fj2));
            z1Var.mo62884X2(context.getString(C0966R.string.f360877fj3));
        }
        if (username.equals("qqmail")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fii));
            z1Var.mo62882W2(context.getString(C0966R.string.fij));
            z1Var.mo62884X2(context.getString(C0966R.string.fik));
        }
        if (username.equals("linkedinplugin")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fhr));
            z1Var.mo62882W2(context.getString(C0966R.string.fhs));
            z1Var.mo62884X2(context.getString(C0966R.string.fht));
        }
        if (username.equals("notifymessage")) {
            z1Var.mo62878U2(context.getString(C0966R.string.f360873fi2));
            z1Var.mo62882W2(context.getString(C0966R.string.f360874fi3));
            z1Var.mo62884X2(context.getString(C0966R.string.fi4));
        }
        if (username.equals("appbrandcustomerservicemsg")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fgt));
            z1Var.mo62882W2(context.getString(C0966R.string.fgu));
            z1Var.mo62884X2(context.getString(C0966R.string.fgv));
        }
        if (username.equals("conversationboxservice")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fh5));
            z1Var.mo62882W2(context.getString(C0966R.string.fh6));
            z1Var.mo62884X2(context.getString(C0966R.string.fh7));
        }
        if (username.equals("downloaderapp")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fh8));
            z1Var.mo62882W2(context.getString(C0966R.string.fh9));
            z1Var.mo62884X2(context.getString(C0966R.string.fh_));
        }
        if (username.equals("appbrand_notify_message")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fgw));
            z1Var.mo62882W2(context.getString(C0966R.string.fgx));
            z1Var.mo62884X2(context.getString(C0966R.string.fgy));
        }
        if (username.equals("opencustomerservicemsg")) {
            z1Var.mo62878U2(context.getString(C0966R.string.fia));
            z1Var.mo62882W2(context.getString(C0966R.string.fib));
            z1Var.mo62884X2(context.getString(C0966R.string.fic));
        }
    }

    /* renamed from: b */
    public final int mo71123b(boolean z, String str, boolean z2) {
        Class cls = C75700k0.class;
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str);
        if (z1Var == null) {
            z1Var = new C72996z1();
        }
        int i = 3;
        if (((int) z1Var.f108320R1) == 0) {
            z1Var.setUsername(str);
            z1Var.mo62868O3();
            m50670c(z1Var);
            if (z2) {
                i = 4;
            }
            z1Var.mo62879U3(i);
            z1Var.mo62877T3();
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69667P3(z1Var);
            return 1;
        } else if (!z) {
            return 3;
        } else {
            z1Var.mo62877T3();
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3(str, z1Var);
            return 2;
        }
    }
}
