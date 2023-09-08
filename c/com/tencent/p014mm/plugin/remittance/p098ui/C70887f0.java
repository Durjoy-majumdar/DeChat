package com.tencent.p014mm.plugin.remittance.p098ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import java.lang.ref.WeakReference;
import nj3.C76879j;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.remittance.ui.f0 */
public class C70887f0 {

    /* renamed from: a */
    public WeakReference<Context> f205299a;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.f0$a */
    public static class C70888a {

        /* renamed from: a */
        public static C70887f0 f205300a = new C70887f0();
    }

    /* renamed from: d */
    public static synchronized C70887f0 m83406d() {
        C70887f0 f0Var;
        synchronized (C70887f0.class) {
            f0Var = C70888a.f205300a;
        }
        return f0Var;
    }

    /* renamed from: a */
    public void mo97555a(Context context) {
        Object[] objArr = new Object[1];
        objArr[0] = context != null ? context.getClass().getSimpleName() : "null";
        Log.m105925i("MicroMsg.RemittanceBusiDialogMgr", "attach() %s", objArr);
        this.f205299a = new WeakReference<>(context);
    }

    /* renamed from: b */
    public boolean mo97556b() {
        Log.m105924i("MicroMsg.RemittanceBusiDialogMgr", "finishRemitF2fDCodeAndLMRemindUI()");
        Context context = this.f205299a.get();
        if (context == null) {
            Log.m105924i("MicroMsg.RemittanceBusiDialogMgr", "getContext() == null");
            return false;
        } else if (context instanceof RemittanceF2fDynamicCodeUI) {
            Log.m105928w("MicroMsg.RemittanceBusiDialogMgr", "check() is RemittanceF2fDynamicCodeUI");
            ((Activity) context).finish();
            return true;
        } else if (!(context instanceof RemittanceF2fLargeMoneyUI)) {
            return false;
        } else {
            Log.m105928w("MicroMsg.RemittanceBusiDialogMgr", "check() is RemittanceF2fLargeMoneyUI");
            ((Activity) context).finish();
            return true;
        }
    }

    /* renamed from: c */
    public Context mo97557c() {
        Context context = this.f205299a.get();
        if (context != null) {
            return context;
        }
        Log.m105924i("MicroMsg.RemittanceBusiDialogMgr", "getContext() == null");
        return null;
    }

    /* renamed from: e */
    public C77398g mo97558e(String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        Log.m105929w("MicroMsg.RemittanceBusiDialogMgr", "showAlert1() msg:%s, title:%s, yes:%s, no:%s", Util.nullAsNil(str), Util.nullAsNil(str2), Util.nullAsNil(str3), Util.nullAsNil(str4));
        Context context = this.f205299a.get();
        if (context != null) {
            return C76879j.m92707A(context, str, str2, str3, str4, onClickListener, onClickListener2);
        }
        Log.m105924i("MicroMsg.RemittanceBusiDialogMgr", "getContext() == null");
        return null;
    }

    /* renamed from: f */
    public C77398g mo97559f(String str, String str2, boolean z, DialogInterface.OnClickListener onClickListener) {
        Log.m105929w("MicroMsg.RemittanceBusiDialogMgr", "showAlert2() msg:%s, title:%s", Util.nullAsNil(str), Util.nullAsNil(str2));
        Context context = this.f205299a.get();
        if (context != null) {
            return C76879j.m92713G(context, str, str2, z, onClickListener);
        }
        Log.m105924i("MicroMsg.RemittanceBusiDialogMgr", "getContext() == null");
        return null;
    }

    /* renamed from: g */
    public boolean mo97560g() {
        Log.m105928w("MicroMsg.RemittanceBusiDialogMgr", "showSafeProgress()");
        Context context = this.f205299a.get();
        if (context == null) {
            Log.m105924i("MicroMsg.RemittanceBusiDialogMgr", "getContext() == null");
            return false;
        } else if ((context instanceof RemittanceBusiUI) || !(context instanceof WalletBaseUI)) {
            return false;
        } else {
            ((WalletBaseUI) context).showSafeProgress();
            return true;
        }
    }
}
