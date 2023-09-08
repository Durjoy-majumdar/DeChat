package com.tencent.p014mm.plugin.account.p024ui;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.ContactsContract;
import com.google.android.gms.common.internal.Constants;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactIntroUI;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import hg0.C76186t;
import jg0.C9392a;
import jg0.C9393b;
import nj3.C76879j;
import p447aw.C103918d;
import p910lj.C76701a;
import sf0.C13663b0;

@Deprecated
/* renamed from: com.tencent.mm.plugin.account.ui.ContactsSyncUI */
public final class ContactsSyncUI extends MMActivity {

    /* renamed from: d */
    public AccountAuthenticatorResponse f10634d = null;

    /* renamed from: e */
    public Bundle f10635e = null;

    /* renamed from: com.tencent.mm.plugin.account.ui.ContactsSyncUI$a */
    public class C1407a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f10636d;

        public C1407a(String str) {
            this.f10636d = str;
        }

        public void run() {
            Log.m105925i("MicroMsg.ContactsSyncUI", "summerper checkPermission checkContacts [%b], oldPermission[%s], stack[%s]", Boolean.TRUE, this.f10636d, Util.getStack());
            ContactsSyncUI.this.initView();
        }

        public String toString() {
            return super.toString() + "|checkContacts";
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.ContactsSyncUI$b */
    public class C1408b implements DialogInterface.OnClickListener {
        public C1408b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(ContactsSyncUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.ContactsSyncUI$c */
    public class C1409c implements DialogInterface.OnClickListener {
        public C1409c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ContactsSyncUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.ContactsSyncUI$d */
    public final class C1410d implements C9392a {

        /* renamed from: a */
        public boolean f10640a;

        /* renamed from: b */
        public C13663b0.C13664a f10641b = new C1411a();

        /* renamed from: com.tencent.mm.plugin.account.ui.ContactsSyncUI$d$a */
        public class C1411a implements C13663b0.C13664a {
            public C1411a() {
            }
        }

        /* renamed from: com.tencent.mm.plugin.account.ui.ContactsSyncUI$d$b */
        public class C1412b implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ Context f10644d;

            /* renamed from: e */
            public final /* synthetic */ String f10645e;

            public C1412b(Context context, String str) {
                this.f10644d = context;
                this.f10645e = str;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C76186t.m91542j(true);
                ContactsSyncUI.this.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit().putBoolean("upload_contacts_already_displayed", true).commit();
                C1410d.this.mo1377b(this.f10644d, this.f10645e);
                Context context = this.f10644d;
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.account.ui.ContactsSyncUI$d$c */
        public class C1413c implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ Context f10647d;

            public C1413c(Context context) {
                this.f10647d = context;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C76186t.m91542j(false);
                ContactsSyncUI.this.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit().putBoolean("upload_contacts_already_displayed", true).commit();
                Context context = this.f10647d;
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                }
            }
        }

        public C1410d(boolean z) {
            this.f10640a = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.String} */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0054, code lost:
            if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r6) == false) goto L_0x0056;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo1376a(android.content.Context r10) {
            /*
                r9 = this;
                f40.e r0 = f40.C86709a0.m107523b()
                boolean r0 = r0.mo121115m()
                if (r0 == 0) goto L_0x0110
                boolean r0 = f40.C86718e.m107551r()
                if (r0 == 0) goto L_0x0012
                goto L_0x0110
            L_0x0012:
                boolean r0 = r9.f10640a
                java.lang.String r1 = "MicroMsg.ProcessorAddAccount"
                java.lang.String r2 = ""
                r3 = 6
                if (r0 != 0) goto L_0x00ce
                java.lang.String r10 = "no need to bind mobile"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r10)
                com.tencent.mm.plugin.account.ui.ContactsSyncUI r10 = com.tencent.p014mm.plugin.account.p024ui.ContactsSyncUI.this
                sf0.b0$a r0 = r9.f10641b
                java.lang.String r1 = "com.tencent.mm.account"
                java.lang.String r4 = "MicroMsg.MMAccountManager"
                r5 = 0
                if (r10 != 0) goto L_0x0032
                java.lang.String r10 = "context is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r10)
                goto L_0x00cd
            L_0x0032:
                java.lang.String r6 = sf0.C13663b0.m12966c(r10)
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r7 == 0) goto L_0x0056
                java.lang.String r6 = "account username is null or nil"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r6)
                f40.o r6 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r6 = r6.mo121142i()
                java.lang.Object r3 = r6.mo119684e(r3, r2)
                r6 = r3
                java.lang.String r6 = (java.lang.String) r6
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
                if (r3 != 0) goto L_0x00cd
            L_0x0056:
                boolean r3 = sf0.C13663b0.m12964a(r10, r6)
                if (r3 == 0) goto L_0x005d
                goto L_0x00cd
            L_0x005d:
                java.lang.Class<aw.d> r3 = p447aw.C103918d.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                aw.d r3 = (p447aw.C103918d) r3
                java.lang.String r7 = "android.permission.READ_CONTACTS"
                boolean r3 = r3.Lb0(r10, r7)
                if (r3 != 0) goto L_0x006e
                goto L_0x00cd
            L_0x006e:
                r3 = 0
                android.accounts.AccountManager r10 = android.accounts.AccountManager.get(r10)     // Catch:{ Exception -> 0x00a2 }
                android.accounts.Account r7 = new android.accounts.Account     // Catch:{ Exception -> 0x00a2 }
                r7.<init>(r6, r1)     // Catch:{ Exception -> 0x00a2 }
                boolean r10 = r10.addAccountExplicitly(r7, r2, r3)     // Catch:{ Exception -> 0x00a2 }
                if (r10 == 0) goto L_0x00c0
                java.lang.String r10 = "com.android.contacts"
                r8 = 1
                android.content.ContentResolver.setSyncAutomatically(r7, r10, r8)     // Catch:{ Exception -> 0x00a2 }
                android.os.Bundle r10 = new android.os.Bundle     // Catch:{ Exception -> 0x00a2 }
                r10.<init>()     // Catch:{ Exception -> 0x00a2 }
                java.lang.String r7 = "authAccount"
                r10.putString(r7, r6)     // Catch:{ Exception -> 0x00a2 }
                java.lang.String r6 = "accountType"
                r10.putString(r6, r1)     // Catch:{ Exception -> 0x00a2 }
                if (r0 == 0) goto L_0x00cd
                r1 = r0
                com.tencent.mm.plugin.account.ui.ContactsSyncUI$d$a r1 = (com.tencent.p014mm.plugin.account.p024ui.ContactsSyncUI.C1410d.C1411a) r1     // Catch:{ Exception -> 0x00a2 }
                com.tencent.mm.plugin.account.ui.ContactsSyncUI$d r1 = com.tencent.p014mm.plugin.account.p024ui.ContactsSyncUI.C1410d.this     // Catch:{ Exception -> 0x00a2 }
                com.tencent.mm.plugin.account.ui.ContactsSyncUI r1 = com.tencent.p014mm.plugin.account.p024ui.ContactsSyncUI.this     // Catch:{ Exception -> 0x00a2 }
                r1.f10635e = r10     // Catch:{ Exception -> 0x00a2 }
                r1.finish()     // Catch:{ Exception -> 0x00a2 }
                goto L_0x00cd
            L_0x00a2:
                r10 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r5]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r10, r2, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "exception in addAccountNoNeedBindMobile() "
                r1.append(r2)
                java.lang.String r10 = r10.getMessage()
                r1.append(r10)
                java.lang.String r10 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r10)
            L_0x00c0:
                if (r0 == 0) goto L_0x00cd
                com.tencent.mm.plugin.account.ui.ContactsSyncUI$d$a r0 = (com.tencent.p014mm.plugin.account.p024ui.ContactsSyncUI.C1410d.C1411a) r0
                com.tencent.mm.plugin.account.ui.ContactsSyncUI$d r10 = com.tencent.p014mm.plugin.account.p024ui.ContactsSyncUI.C1410d.this
                com.tencent.mm.plugin.account.ui.ContactsSyncUI r10 = com.tencent.p014mm.plugin.account.p024ui.ContactsSyncUI.this
                r10.f10635e = r3
                r10.finish()
            L_0x00cd:
                return r5
            L_0x00ce:
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                java.lang.Object r0 = r0.mo119684e(r3, r2)
                java.lang.String r0 = (java.lang.String) r0
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r2 == 0) goto L_0x00e9
                java.lang.String r10 = "not bind mobile phone"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r10)
                r10 = 2
                return r10
            L_0x00e9:
                boolean r1 = hg0.C76186t.m91539g()
                if (r1 == 0) goto L_0x010b
                r3 = 2131824443(0x7f110f3b, float:1.9281714E38)
                r4 = 2131821704(0x7f110488, float:1.9276159E38)
                r5 = 2131821617(0x7f110431, float:1.9275982E38)
                r6 = 2131821426(0x7f110372, float:1.9275595E38)
                com.tencent.mm.plugin.account.ui.ContactsSyncUI$d$b r7 = new com.tencent.mm.plugin.account.ui.ContactsSyncUI$d$b
                r7.<init>(r10, r0)
                com.tencent.mm.plugin.account.ui.ContactsSyncUI$d$c r8 = new com.tencent.mm.plugin.account.ui.ContactsSyncUI$d$c
                r8.<init>(r10)
                r2 = r10
                nj3.C76879j.m92739j(r2, r3, r4, r5, r6, r7, r8)
                r10 = 5
                return r10
            L_0x010b:
                int r10 = r9.mo1377b(r10, r0)
                return r10
            L_0x0110:
                r10 = 4
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.p024ui.ContactsSyncUI.C1410d.mo1376a(android.content.Context):int");
        }

        /* renamed from: b */
        public final int mo1377b(Context context, String str) {
            char c;
            Context context2 = context;
            if (context2 == null) {
                return 1;
            }
            C13663b0.C13664a aVar = this.f10641b;
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.MMAccountManager", "account username is null or nil");
                c = 0;
            } else {
                String c2 = C13663b0.m12966c(context);
                if (Util.isNullOrNil(c2)) {
                    c2 = str;
                }
                try {
                    AccountManager accountManager = AccountManager.get(context);
                    Account account = new Account(c2, "com.tencent.mm.account");
                    if (!((C103918d) C86312j.m106911c(C103918d.class)).Lb0(context2, "android.permission.READ_CONTACTS")) {
                        c = 2;
                    } else if (C13663b0.m12964a(context2, c2)) {
                        ContentResolver.setSyncAutomatically(account, "com.android.contacts", true);
                        c = 3;
                    } else {
                        C13663b0.m12967d(context);
                        if (accountManager.addAccountExplicitly(account, "", (Bundle) null)) {
                            ContentResolver.setSyncAutomatically(account, "com.android.contacts", true);
                            Bundle bundle = new Bundle();
                            bundle.putString("authAccount", c2);
                            bundle.putString("accountType", "com.tencent.mm.account");
                            if (aVar != null) {
                                ContactsSyncUI contactsSyncUI = ContactsSyncUI.this;
                                contactsSyncUI.f10635e = bundle;
                                contactsSyncUI.finish();
                            }
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(Constants.KEY_ACCOUNT_NAME, c2);
                            contentValues.put("account_type", "com.tencent.mm.account");
                            contentValues.put("should_sync", 1);
                            contentValues.put("ungrouped_visible", 1);
                            context.getContentResolver().insert(ContactsContract.Settings.CONTENT_URI, contentValues);
                            c = 1;
                        }
                        if (aVar != null) {
                            ContactsSyncUI contactsSyncUI2 = ContactsSyncUI.this;
                            contactsSyncUI2.f10635e = null;
                            contactsSyncUI2.finish();
                        }
                        c = 2;
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.MMAccountManager", e, "", new Object[0]);
                    Log.m105920e("MicroMsg.MMAccountManager", "exception in addAccount() " + e.getMessage());
                }
            }
            if (c == 2) {
                C76701a.makeText(context2, (CharSequence) ContactsSyncUI.this.getString(C0966R.string.bur), 1).show();
                return 1;
            } else if (c != 3) {
                return 0;
            } else {
                C76701a.makeText(context2, (CharSequence) ContactsSyncUI.this.getString(C0966R.string.buq), 1).show();
                return 1;
            }
        }
    }

    public void finish() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f10634d;
        if (accountAuthenticatorResponse != null) {
            Bundle bundle = this.f10635e;
            if (bundle != null) {
                accountAuthenticatorResponse.onResult(bundle);
            } else {
                accountAuthenticatorResponse.onError(4, "canceled");
            }
            this.f10634d = null;
        }
        super.finish();
    }

    public int getLayoutId() {
        return -1;
    }

    public void initView() {
        Class<ContactsSyncUI> cls = ContactsSyncUI.class;
        Class<SimpleLoginUI> cls2 = SimpleLoginUI.class;
        if (!C86709a0.m107523b().mo121115m() || C86718e.m107551r()) {
            MMWizardActivity.m7018M7(this, new Intent(this, cls2), getIntent());
            finish();
        } else if (getIntent() == null) {
            Log.m105920e("MicroMsg.ContactsSyncUI", "initView fail, intent is null");
            finish();
        } else {
            int intExtra = IntentUtil.getIntExtra(getIntent(), "contact_sync_scene", -1);
            if (getIntent().getAction() == null || !getIntent().getAction().equalsIgnoreCase("com.tencent.mm.login.ACTION_LOGIN")) {
                String resolveType = getIntent().resolveType(this);
                Log.m105924i("MicroMsg.ContactsSyncUI", "scheme = " + resolveType + ", action = " + getIntent().getAction());
                if (!Util.isNullOrNil(resolveType)) {
                    intExtra = resolveType.equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.profile") ? 2 : resolveType.equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip") ? 12 : resolveType.equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip.video") ? 13 : resolveType.equals("vnd.android.cursor.item/vnd.com.tencent.mm.plugin.sns.timeline") ? 3 : resolveType.equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.phonenum") ? 6 : -1;
                }
            } else {
                intExtra = 4;
            }
            if (intExtra == -1) {
                Log.m105920e("MicroMsg.ContactsSyncUI", "unkown scene, finish");
                finish();
                return;
            }
            C9392a aVar = null;
            if (intExtra != 1) {
                if (intExtra != 2) {
                    if (intExtra == 3) {
                        aVar = new C9393b(2, IntentUtil.getStringExtra(getIntent(), "k_phone_num"), getIntent().getData());
                    } else if (intExtra == 4) {
                        Parcelable parcelableExtra = getIntent().getParcelableExtra("accountAuthenticatorResponse");
                        this.f10634d = null;
                        if (parcelableExtra != null && (parcelableExtra instanceof AccountAuthenticatorResponse)) {
                            this.f10634d = (AccountAuthenticatorResponse) parcelableExtra;
                        }
                        AccountAuthenticatorResponse accountAuthenticatorResponse = this.f10634d;
                        if (accountAuthenticatorResponse != null) {
                            accountAuthenticatorResponse.onRequestContinued();
                        }
                        if (!getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getBoolean("upload_contacts_already_displayed", false)) {
                            aVar = new C1410d(!IntentUtil.getBooleanExtra(getIntent(), "k_login_without_bind_mobile", false));
                        }
                    } else if (intExtra != 6) {
                        if (intExtra == 12) {
                            aVar = new C9393b(3, IntentUtil.getStringExtra(getIntent(), "k_phone_num"), getIntent().getData());
                        } else if (intExtra == 13) {
                            aVar = new C9393b(4, IntentUtil.getStringExtra(getIntent(), "k_phone_num"), getIntent().getData());
                        }
                    }
                }
                aVar = new C9393b(1, IntentUtil.getStringExtra(getIntent(), "k_phone_num"), getIntent().getData());
            } else {
                Parcelable parcelableExtra2 = getIntent().getParcelableExtra("accountAuthenticatorResponse");
                this.f10634d = null;
                if (parcelableExtra2 != null && (parcelableExtra2 instanceof AccountAuthenticatorResponse)) {
                    this.f10634d = (AccountAuthenticatorResponse) parcelableExtra2;
                }
                AccountAuthenticatorResponse accountAuthenticatorResponse2 = this.f10634d;
                if (accountAuthenticatorResponse2 != null) {
                    accountAuthenticatorResponse2.onRequestContinued();
                }
                aVar = new C1410d(!IntentUtil.getBooleanExtra(getIntent(), "k_login_without_bind_mobile", false));
            }
            if (aVar != null) {
                int a = aVar.mo1376a(this);
                if (a == 2) {
                    Intent intent = getIntent();
                    intent.setClass(this, cls);
                    Intent intent2 = new Intent();
                    intent2.setClass(this, BindMContactIntroUI.class);
                    intent2.putExtra("key_upload_scene", 2);
                    intent2.putExtra("bind_scene", 2);
                    MMWizardActivity.m7018M7(this, intent2, intent);
                    finish();
                } else if (a == 3) {
                    Intent intent3 = getIntent();
                    intent3.setClass(this, cls);
                    Intent intent4 = new Intent();
                    intent4.setClass(this, cls2);
                    MMWizardActivity.m7018M7(this, intent4, intent3);
                    finish();
                } else if (a == 4) {
                    Intent intent5 = getIntent();
                    intent5.setClass(this, cls);
                    Intent intent6 = new Intent();
                    intent6.setClass(this, cls2);
                    intent6.putExtra("accountAuthenticatorResponse", this.f10634d);
                    MMWizardActivity.m7018M7(this, intent6, intent5);
                    finish();
                } else if (a == 5) {
                    return;
                }
            } else {
                Log.m105920e("MicroMsg.ContactsSyncUI", "unkown scene, finish");
            }
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        int intExtra = IntentUtil.getIntExtra(getIntent(), "wizard_activity_result_code", 0);
        Log.m105925i("MicroMsg.ContactsSyncUI", "onCreate() resultCode[%d]", Integer.valueOf(intExtra));
        if (intExtra == -1 || intExtra == 0) {
            boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(this, "android.permission.READ_CONTACTS", 48, (String) null, (String) null);
            Log.m105925i("MicroMsg.ContactsSyncUI", "summerper checkPermission checkContacts read[%b],stack[%s]", Boolean.valueOf(z1), Util.getStack());
            if (z1) {
                Log.m105925i("MicroMsg.ContactsSyncUI", "summerper checkPermission checkContacts write[%b],stack[%s]", Boolean.TRUE, Util.getStack());
                initView();
            }
        } else if (intExtra != 1) {
            Log.m105920e("MicroMsg.ContactsSyncUI", "onCreate, should not reach here, resultCode = " + intExtra);
            finish();
        } else {
            finish();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.ContactsSyncUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.ContactsSyncUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 48) {
            if (iArr[0] == 0) {
                new MMHandler().post(new C1407a(strArr[0]));
                return;
            }
            C76879j.m92709C(this, getString(C0966R.string.hhs), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C1408b(), new C1409c());
        }
    }
}
