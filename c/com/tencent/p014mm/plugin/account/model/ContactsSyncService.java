package com.tencent.p014mm.plugin.account.model;

import android.accounts.Account;
import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.IBinder;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import hg0.C59893x0;
import hg0.C76173n0;
import ob0.C11385n;
import ob0.C117747y;
import p447aw.C103918d;

/* renamed from: com.tencent.mm.plugin.account.model.ContactsSyncService */
public class ContactsSyncService extends Service implements C11385n {

    /* renamed from: d */
    public C1385a f10591d = null;

    /* renamed from: com.tencent.mm.plugin.account.model.ContactsSyncService$a */
    public class C1385a extends AbstractThreadedSyncAdapter {

        /* renamed from: a */
        public Context f10592a;

        public C1385a(ContactsSyncService contactsSyncService, Context context) {
            super(context, true);
            this.f10592a = context;
            Log.m105924i("MicroMsg.ContactsSyncService", "ContactsSyncService SyncAdapterImpl construction");
        }

        public void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
            Log.m105924i("MicroMsg.ContactsSyncService", "ContactsSyncService SyncAdapterImpl onPerformSync");
            if (!C86709a0.m107522a()) {
                Log.m105920e("MicroMsg.ContactsSyncService", "ContactsSyncService account not ready, ignore this sync");
            } else {
                Log.m105928w("MicroMsg.ContactsSyncService", "Don't auto sync contacts again from now on!!!");
            }
        }
    }

    public ContactsSyncService() {
        Log.m105924i("MicroMsg.ContactsSyncService", "ContactsSyncService construction");
    }

    public IBinder onBind(Intent intent) {
        IBinder iBinder;
        if (((C103918d) C86312j.m106911c(C103918d.class)).Lb0(this, "android.permission.READ_CONTACTS")) {
            if (this.f10591d == null) {
                this.f10591d = new C1385a(this, getApplicationContext());
            }
            iBinder = this.f10591d.getSyncAdapterBinder();
        } else {
            Log.m105924i("MicroMsg.ContactsSyncService", "ContactsSyncService onBind no permission");
            iBinder = null;
        }
        Log.m105925i("MicroMsg.ContactsSyncService", "ContactsSyncService onBind ret[%s]", iBinder);
        return iBinder;
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.ContactsSyncService", "contacts sync service destroy");
        super.onDestroy();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.ContactsSyncService", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str + " type = " + yVar.getType());
        if (yVar.getType() == 133) {
            C86709a0.m107524d().mo123470p(133, this);
            Log.m105924i("MicroMsg.ContactsSyncService", "uploadcontact onSceneEnd: errType = " + i + ", errCode = " + i2);
            long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119684e(327728, 0L)).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            Log.m105918d("MicroMsg.ContactsSyncService", "getMFriend : curTime=" + currentTimeMillis + ", lastTime=" + longValue);
            if (i2 == 0 || currentTimeMillis - longValue >= 86400000) {
                C86709a0.m107535s().mo121142i().mo119676J(327728, Long.valueOf(currentTimeMillis));
                C86709a0.m107524d().mo123455a(32, this);
                C59893x0 x0Var = (C59893x0) yVar;
                C86709a0.m107524d().mo123460f(new C76173n0(x0Var.f170971e, x0Var.f170972f));
            } else {
                Log.m105920e("MicroMsg.ContactsSyncService", "uploadmcontact list null, do not do getmfriend.");
                return;
            }
        }
        if (yVar.getType() == 32) {
            C86709a0.m107524d().mo123470p(32, this);
            Log.m105924i("MicroMsg.ContactsSyncService", "getmfriend onSceneEnd: errType = " + i + ", errCode = " + i2);
        }
    }
}
