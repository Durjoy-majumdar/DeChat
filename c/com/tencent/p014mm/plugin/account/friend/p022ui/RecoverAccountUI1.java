package com.tencent.p014mm.plugin.account.friend.p022ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.import_old_account_contactsStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import hg0.C46056i0;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import qo3.C89779i0;
import te3.C49265ed;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.account.friend.ui.RecoverAccountUI1 */
public class RecoverAccountUI1 extends MMActivity implements C11385n {

    /* renamed from: d */
    public C89779i0 f108635d;

    /* renamed from: e */
    public String f108636e;

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.RecoverAccountUI1$a */
    public class C40417a implements MenuItem.OnMenuItemClickListener {
        public C40417a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RecoverAccountUI1.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.RecoverAccountUI1$b */
    public class C40418b implements View.OnClickListener {
        public C40418b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/friend/ui/RecoverAccountUI1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            import_old_account_contactsStruct import_old_account_contactsstruct = new import_old_account_contactsStruct();
            import_old_account_contactsstruct.f108034d = 3;
            import_old_account_contactsstruct.mo86054n();
            C86709a0.m107524d().mo123460f(new C46056i0(RecoverAccountUI1.this.f108636e));
            RecoverAccountUI1 recoverAccountUI1 = RecoverAccountUI1.this;
            recoverAccountUI1.f108635d = C76879j.m92723Q(recoverAccountUI1, (String) null, recoverAccountUI1.getString(C0966R.string.f360085a04), false, false, (DialogInterface.OnCancelListener) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/friend/ui/RecoverAccountUI1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.ui.RecoverAccountUI1$c */
    public class C40419c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f108639d;

        /* renamed from: e */
        public final /* synthetic */ int f108640e;

        public C40419c(int i, int i2) {
            this.f108639d = i;
            this.f108640e = i2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f108639d == 4) {
                import_old_account_contactsStruct import_old_account_contactsstruct = new import_old_account_contactsStruct();
                import_old_account_contactsstruct.f108034d = 2;
                import_old_account_contactsstruct.f108038h = this.f108640e;
                import_old_account_contactsstruct.mo86054n();
                RecoverAccountUI1.this.finish();
                return;
            }
            import_old_account_contactsStruct import_old_account_contactsstruct2 = new import_old_account_contactsStruct();
            import_old_account_contactsstruct2.f108034d = 2;
            import_old_account_contactsstruct2.f108038h = 1;
            import_old_account_contactsstruct2.mo86054n();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bqt;
    }

    public void initView() {
        setMMTitle("");
        setActionbarColor(getResources().getColor(C0966R.color.f2929c));
        setBackBtn(new C40417a(), C0966R.raw.icons_filled_close);
        ((Button) findViewById(C0966R.C0970id.hfe)).setOnClickListener(new C40418b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f108636e = getIntent().getStringExtra("key_qrcode_string");
        initView();
        C86709a0.m107524d().mo123455a(870, this);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(870, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.RecoverAccountUI1", "errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C89779i0 i0Var = this.f108635d;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (i == 0 && i2 == 0) {
            Intent intent = new Intent();
            C46056i0 i0Var2 = (C46056i0) yVar;
            intent.putExtra("key_session_id", ((C49265ed) i0Var2.f124178d.f127056b.f127083a).f132868d);
            intent.putExtra("key_old_username", ((C49265ed) i0Var2.f124178d.f127056b.f127083a).f132869e);
            startActivity(RecoverFriendUI.class, intent);
            finish();
            return;
        }
        if (Util.isNullOrNil(str)) {
            str = getString(C0966R.string.f7966xq);
        }
        C76879j.m92711E(this, str, "", getString(C0966R.string.f8028zq), false, new C40419c(i, i2));
    }
}
