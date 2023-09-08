package com.tencent.p014mm.contact;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.LinkedList;
import java.util.Set;

/* renamed from: com.tencent.mm.contact.c */
public class C1235c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ContactUpgradeHelper f10286d;

    public C1235c(ContactUpgradeHelper contactUpgradeHelper) {
        this.f10286d = contactUpgradeHelper;
    }

    public void run() {
        Class cls = C75700k0.class;
        Set<String> set = C45628s0.f123410p;
        LinkedList<C72996z1> linkedList = new LinkedList<>();
        Cursor Z3 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69681Z3();
        if (Z3.getCount() == 0) {
            Z3.close();
        } else {
            Z3.moveToFirst();
            do {
                C72996z1 z1Var = new C72996z1();
                z1Var.convertFrom(Z3);
                linkedList.add(z1Var);
            } while (Z3.moveToNext());
            Z3.close();
            Log.m105918d("MicroMsg.ContactStorageLogic", "getTotalList size:  " + linkedList.size());
        }
        for (C72996z1 z1Var2 : linkedList) {
            z1Var2.mo62923p4(z1Var2.mo62905h3());
            C86709a0.m107528h();
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3(z1Var2.getUsername(), z1Var2);
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CONTACT_UPDATE_USERNAME_BOOLEAN_SYNC, Boolean.TRUE);
        this.f10286d.f10282e = true;
        Log.m105924i("MicroMsg.ContactUpgradeHelper", "refreshUserName, updateUserNameFlag done!");
    }
}
