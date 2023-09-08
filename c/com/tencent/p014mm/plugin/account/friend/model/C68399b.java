package com.tencent.p014mm.plugin.account.friend.model;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.autogen.mmdata.rpt.import_old_account_contactsStruct;
import com.tencent.p014mm.plugin.account.friend.model.C68397a;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import hg0.C76188z;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.account.friend.model.b */
public class C68399b implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ RecoverFriendPresenter f196540d;

    public C68399b(RecoverFriendPresenter recoverFriendPresenter) {
        this.f196540d = recoverFriendPresenter;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/friend/model/RecoverFriendPresenter$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C76188z zVar = ((C68397a.C68398a) this.f196540d.f196531i.get(i).f128466b).f196538a;
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(zVar.field_encryptUsername);
        Intent intent = new Intent();
        intent.putExtra("Contact_ShowUserName", false);
        intent.putExtra("Contact_ShowFMessageList", true);
        intent.putExtra("AntispamTicket", zVar.field_ticket);
        intent.putExtra("User_From_Fmessage", true);
        intent.putExtra("Contact_ShowFMessageList", true);
        intent.putExtra("Contact_Nick", zVar.field_nickname);
        intent.putExtra("Contact_Scene", 17);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 7);
        if (((int) z1Var.f108320R1) <= 0 || !z1Var.mo62927s3()) {
            intent.putExtra("Contact_User", zVar.field_encryptUsername);
        } else {
            intent.putExtra("Contact_User", z1Var.getUsername());
            intent.putExtra("force_get_contact", true);
        }
        C88144b.m109791i(this.f196540d.f196526d, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        import_old_account_contactsStruct import_old_account_contactsstruct = new import_old_account_contactsStruct();
        import_old_account_contactsstruct.f108034d = 5;
        import_old_account_contactsstruct.f108036f = import_old_account_contactsstruct.mo86045b("newaccountusername", C75592q0.m90772b(), true);
        import_old_account_contactsstruct.f108035e = import_old_account_contactsstruct.mo86045b("oldaccountusername", this.f196540d.f196529g, true);
        import_old_account_contactsstruct.f108037g = import_old_account_contactsstruct.mo86045b("friendusername", zVar.field_encryptUsername, true);
        import_old_account_contactsstruct.mo86054n();
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/friend/model/RecoverFriendPresenter$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
