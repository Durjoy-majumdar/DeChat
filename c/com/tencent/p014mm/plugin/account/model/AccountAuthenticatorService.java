package com.tencent.p014mm.plugin.account.model;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.tencent.p014mm.plugin.account.p024ui.ContactsSyncUI;
import com.tencent.p014mm.sdk.platformtools.Log;

@Deprecated
/* renamed from: com.tencent.mm.plugin.account.model.AccountAuthenticatorService */
public class AccountAuthenticatorService extends Service {

    /* renamed from: d */
    public static C1384a f10589d;

    /* renamed from: com.tencent.mm.plugin.account.model.AccountAuthenticatorService$a */
    public static class C1384a extends AbstractAccountAuthenticator {

        /* renamed from: a */
        public Context f10590a;

        public C1384a(Context context) {
            super(context);
            this.f10590a = context;
        }

        public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            Intent intent = new Intent(this.f10590a, ContactsSyncUI.class);
            intent.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
            intent.putExtra("contact_sync_scene", 1);
            bundle2.putParcelable("intent", intent);
            return bundle2;
        }

        public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
            Log.m105924i("MicroMsg.AccountAuthenticatorService", "confirmCredentials");
            return null;
        }

        public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
            Log.m105924i("MicroMsg.AccountAuthenticatorService", "editProperties");
            return null;
        }

        public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
            Log.m105924i("MicroMsg.AccountAuthenticatorService", "getAuthToken");
            return null;
        }

        public String getAuthTokenLabel(String str) {
            Log.m105924i("MicroMsg.AccountAuthenticatorService", "getAuthTokenLabel");
            return null;
        }

        public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
            Log.m105924i("MicroMsg.AccountAuthenticatorService", "hasFeatures: " + strArr);
            return null;
        }

        public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
            Log.m105924i("MicroMsg.AccountAuthenticatorService", "updateCredentials");
            return null;
        }
    }

    public IBinder onBind(Intent intent) {
        if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.accounts.AccountAuthenticator")) {
            return null;
        }
        if (f10589d == null) {
            f10589d = new C1384a(this);
        }
        return f10589d.getIBinder();
    }
}
