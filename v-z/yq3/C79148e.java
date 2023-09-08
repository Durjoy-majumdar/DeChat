package yq3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75119h0;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import cr3.C75282g;
import cr3.C75296i;
import f40.C86709a0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;

/* renamed from: yq3.e */
public abstract class C79148e {

    /* renamed from: a */
    public WeakReference<C79149a> f232421a;

    /* renamed from: b */
    public WeakReference<Context> f232422b = new WeakReference<>((Object) null);

    /* renamed from: c */
    public Bundle f232423c = new Bundle();

    /* renamed from: yq3.e$a */
    public interface C79149a {
        Intent onProcessEnd(int i, Bundle bundle);
    }

    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        return this;
    }

    /* renamed from: B */
    public void mo109103B(Activity activity, Class<?> cls, Bundle bundle) {
        mo109107a("startActivity1", activity, cls, bundle);
        Intent intent = new Intent(activity, cls);
        intent.putExtra("process_id", getClass().hashCode());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Activity activity2 = activity;
        C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/wallet_core/WalletProcess", "startActivity", "(Landroid/app/Activity;Ljava/lang/Class;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity2, "com/tencent/mm/wallet_core/WalletProcess", "startActivity", "(Landroid/app/Activity;Ljava/lang/Class;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (bundle != null) {
            this.f232423c.putAll(bundle);
        }
        Log.m105918d("MicroMsg.ProcessManager", "bankcard tag :" + this.f232423c.getInt("key_support_bankcard", 1));
    }

    /* renamed from: C */
    public void mo109104C(Activity activity, Class<?> cls, Bundle bundle, Bundle bundle2) {
        mo109107a("startActivity1", activity, cls, bundle);
        Intent intent = new Intent(activity, cls);
        intent.putExtra("process_id", getClass().hashCode());
        if (bundle2 != null) {
            intent.putExtras(bundle2);
            Log.m105919d("MicroMsg.ProcessManager", "put bundle: %s", intent.getExtras().toString());
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Activity activity2 = activity;
        C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/wallet_core/WalletProcess", "startActivity", "(Landroid/app/Activity;Ljava/lang/Class;Landroid/os/Bundle;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity2, "com/tencent/mm/wallet_core/WalletProcess", "startActivity", "(Landroid/app/Activity;Ljava/lang/Class;Landroid/os/Bundle;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (bundle != null) {
            this.f232423c.putAll(bundle);
        }
        Log.m105918d("MicroMsg.ProcessManager", "bankcard tag :" + this.f232423c.getInt("key_support_bankcard", 1));
    }

    /* renamed from: D */
    public void mo109105D(Activity activity, String str, String str2, Bundle bundle) {
        String str3;
        Class<?> cls;
        mo109107a("startActivity3", activity, str, str2, bundle);
        List<C88144b.C9613e> list = C88144b.f254911a;
        synchronized (C88144b.class) {
            String str4 = MMApplicationContext.getSourcePackageName() + ".plugin." + str;
            if (str2.startsWith(".")) {
                str3 = str4 + str2;
            } else {
                str3 = str2;
            }
            try {
                cls = MMApplicationContext.getContext().getClassLoader().loadClass(str3);
            } catch (Exception unused) {
                Log.m105921e("MicroMsg.PluginHelper", "plugin load failed, plugin=%s", str);
                cls = null;
            }
        }
        if (cls != null) {
            mo109103B(activity, cls, bundle);
            return;
        }
        Log.m105920e("MicroMsg.ProcessManager", " Class Not Found! can't startActivity to " + str + str2);
    }

    /* renamed from: E */
    public void mo109106E(Activity activity, Class<?> cls, Bundle bundle, int i) {
        mo109107a("startActivityForResult1", activity, cls, bundle, Integer.valueOf(i));
        Intent intent = new Intent(activity, cls);
        intent.putExtra("process_id", getClass().hashCode());
        intent.addFlags(67108864);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/wallet_core/WalletProcess", "startActivityForResult", "(Landroid/app/Activity;Ljava/lang/Class;Landroid/os/Bundle;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        if (bundle != null) {
            this.f232423c.putAll(bundle);
        }
    }

    /* renamed from: a */
    public void mo109107a(Object... objArr) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("this %s, procname %s", new Object[]{this, mo91258e()}));
        if (objArr == null || objArr.length <= 0) {
            Log.m105928w("MicroMsg.ProcessManager", "vals is null, use '' as value");
            str = sb.toString();
        } else {
            int length = objArr.length - 1;
            for (int i = 0; i < length; i++) {
                sb.append(mo109118u(objArr[i]));
                sb.append(',');
            }
            sb.append(mo109118u(objArr[length]));
            str = sb.toString();
        }
        Log.m105925i("MicroMsg.ProcessManager", "__CURRENT__ %s", str);
    }

    /* renamed from: b */
    public void mo91263b(WalletBaseUI walletBaseUI) {
    }

    /* renamed from: c */
    public abstract void mo91257c(Activity activity, int i);

    /* renamed from: d */
    public void mo109108d(Activity activity, Class<?> cls, Bundle bundle, int i) {
        mo109107a("finishActivity", activity, cls, "errCode " + i);
        Intent intent = new Intent(activity, cls);
        intent.putExtra("process_id", getClass().hashCode());
        intent.addFlags(67108864);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/wallet_core/WalletProcess", "backActivity", "(Landroid/app/Activity;Ljava/lang/Class;Landroid/os/Bundle;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity, "com/tencent/mm/wallet_core/WalletProcess", "backActivity", "(Landroid/app/Activity;Ljava/lang/Class;Landroid/os/Bundle;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f232423c.putInt("key_err_code", i);
    }

    /* renamed from: e */
    public abstract String mo91258e();

    /* renamed from: f */
    public abstract void mo91259f(Activity activity, Bundle bundle);

    /* renamed from: g */
    public void mo109109g(Activity activity) {
        mo109107a("endProcess1", activity);
        if (!activity.isFinishing() && (activity instanceof MMActivity)) {
            ((MMActivity) activity).finish();
        }
        Bundle bundle = this.f232423c;
        if (bundle != null) {
            bundle.clear();
        }
        C79143a.m95770i(getClass().hashCode());
    }

    /* renamed from: h */
    public void mo109110h(Activity activity, Class<?> cls, int i, Intent intent, boolean z) {
        Intent intent2;
        Class<?> cls2 = cls;
        mo109107a("endProcess2", activity, cls2, Integer.valueOf(i), intent, Boolean.valueOf(z));
        WeakReference<C79149a> weakReference = this.f232421a;
        if (weakReference == null || weakReference.get() == null) {
            intent2 = intent;
        } else {
            int i2 = i;
            intent2 = this.f232421a.get().onProcessEnd(i, this.f232423c);
        }
        if (intent2 == null) {
            intent2 = new Intent(activity, cls);
            intent2.putExtra("key_process_is_stay", z);
        } else if (intent2.getExtras() != null && !intent2.getExtras().containsKey("key_process_is_stay")) {
            intent2.putExtra("key_process_is_stay", true);
        }
        if (cls2 != null) {
            intent2.setClass(activity, cls);
        }
        intent2.addFlags(67108864);
        intent2.putExtra("key_process_is_end", true);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent2);
        C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/wallet_core/WalletProcess", "endProcess", "(Landroid/app/Activity;Ljava/lang/Class;ILandroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(activity, "com/tencent/mm/wallet_core/WalletProcess", "endProcess", "(Landroid/app/Activity;Ljava/lang/Class;ILandroid/content/Intent;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        Bundle bundle = this.f232423c;
        if (bundle != null) {
            bundle.clear();
        }
        C79143a.m95770i(getClass().hashCode());
    }

    /* renamed from: i */
    public void mo109111i(Activity activity, Class<?> cls, int i, boolean z) {
        mo109110h(activity, cls, i, (Intent) null, z);
    }

    /* renamed from: j */
    public void mo109112j(Activity activity, String str, String str2) {
        mo109113k(activity, str, str2, -1, (Intent) null, true);
    }

    /* renamed from: k */
    public void mo109113k(Activity activity, String str, String str2, int i, Intent intent, boolean z) {
        mo109107a("endProcess3", activity, str, str2, Integer.valueOf(i), intent, Boolean.valueOf(z));
        Intent onProcessEnd = this.f232421a.get() != null ? this.f232421a.get().onProcessEnd(i, this.f232423c) : null;
        if (intent == null) {
            intent = new Intent();
            intent.putExtra("key_process_is_stay", z);
        } else if (intent.getExtras() != null && !intent.getExtras().containsKey("key_process_is_stay")) {
            intent.putExtra("key_process_is_stay", true);
        }
        if (onProcessEnd != null) {
            intent.putExtras(onProcessEnd);
        }
        intent.addFlags(67108864);
        intent.putExtra("key_process_is_end", true);
        C88144b.m109791i(activity, str, str2, intent, (Bundle) null);
        Bundle bundle = this.f232423c;
        if (bundle != null) {
            bundle.clear();
        }
        C79143a.m95770i(getClass().hashCode());
    }

    /* renamed from: l */
    public void mo109114l(Activity activity, int i, Bundle bundle) {
        mo109107a("endProcess1", activity);
        if (!activity.isFinishing() && (activity instanceof MMActivity)) {
            ((MMActivity) activity).finish();
        }
        if (this.f232421a.get() != null) {
            this.f232421a.get().onProcessEnd(i, bundle);
        }
        if (bundle != null) {
            bundle.clear();
        }
        C79143a.m95770i(getClass().hashCode());
    }

    /* renamed from: m */
    public void mo96262m(Activity activity) {
        mo109107a("finishActivity", activity);
        if (!activity.isFinishing() && (activity instanceof MMActivity)) {
            ((MMActivity) activity).finish();
        }
    }

    /* renamed from: n */
    public boolean mo109115n() {
        String string = this.f232423c.getString("key_bank_username");
        Log.m105924i("MicroMsg.ProcessManager", "follow bank account : isFollow " + this.f232423c.getBoolean("key_is_follow_bank_username", false) + ", username : " + string);
        if (!this.f232423c.getBoolean("key_is_follow_bank_username", false) || Util.isNullOrNil(string)) {
            return false;
        }
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(new C75119h0(string));
        return true;
    }

    /* renamed from: o */
    public abstract void mo91264o(Activity activity, int i, Bundle bundle);

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        return null;
    }

    /* renamed from: q */
    public int mo91266q(MMActivity mMActivity, int i) {
        return -1;
    }

    /* renamed from: r */
    public boolean mo109116r() {
        return this.f232423c.getBoolean("key_is_oversea", false);
    }

    /* renamed from: s */
    public boolean mo109117s() {
        return this.f232423c.getInt("key_pay_flag", 0) == 1;
    }

    /* renamed from: t */
    public abstract boolean mo91267t(Activity activity, Bundle bundle);

    /* renamed from: u */
    public final String mo109118u(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof Bundle) {
            return String.format("Bundle: %s, ", new Object[]{obj.toString()});
        } else if (obj instanceof Context) {
            return String.format("Context: %s, ", new Object[]{obj.toString()});
        } else if (obj instanceof Class) {
            return String.format("Class: %s, ", new Object[]{((Class) obj).getSimpleName()});
        } else {
            return String.format("Value: %s, ", new Object[]{obj.toString()});
        }
    }

    /* renamed from: v */
    public boolean mo106737v(Activity activity, Bundle bundle) {
        return false;
    }

    /* renamed from: w */
    public boolean mo91268w(WalletBaseUI walletBaseUI, int i, String str) {
        return false;
    }

    /* renamed from: x */
    public void mo91269x() {
    }

    /* renamed from: y */
    public void mo91270y(WalletBaseUI walletBaseUI) {
    }

    /* renamed from: z */
    public void mo109119z(Activity activity) {
        mo109107a("specEndProcess", activity);
        if (!activity.isFinishing() && (activity instanceof MMActivity)) {
            ((MMActivity) activity).finish();
        }
        Bundle bundle = this.f232423c;
        if (bundle != null) {
            bundle.clear();
        }
        C79143a.m95770i(getClass().hashCode());
        mo91269x();
    }
}
