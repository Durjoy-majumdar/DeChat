package com.tencent.p014mm.chatroom.p015ui;

import android.app.ProgressDialog;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatroom.p015ui.DelChatroomMemberUI;
import com.tencent.p014mm.storage.C72996z1;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import nj3.C76879j;
import pg3.C35488c;
import pg3.C77084b;

/* renamed from: com.tencent.mm.chatroom.ui.h0 */
public class C67962h0 implements C35488c {

    /* renamed from: a */
    public final /* synthetic */ String f195082a;

    /* renamed from: b */
    public final /* synthetic */ boolean f195083b;

    /* renamed from: c */
    public final /* synthetic */ List f195084c;

    /* renamed from: d */
    public final /* synthetic */ DelChatroomMemberUI f195085d;

    public C67962h0(DelChatroomMemberUI delChatroomMemberUI, String str, boolean z, List list) {
        this.f195085d = delChatroomMemberUI;
        this.f195082a = str;
        this.f195083b = z;
        this.f195084c = list;
    }

    /* renamed from: a */
    public void mo10150a(int i, int i2, String str, C77084b bVar) {
        C35488c cVar = (C35488c) bVar;
        DelChatroomMemberUI delChatroomMemberUI = this.f195085d;
        if (delChatroomMemberUI.f194839n == 1) {
            DelChatroomMemberUI.m80263I7(delChatroomMemberUI, delChatroomMemberUI.f194844s, delChatroomMemberUI.f194840o, delChatroomMemberUI.f194836h, delChatroomMemberUI.f194833e.getCount(), 1, 2, this.f195082a);
        }
        ProgressDialog progressDialog = this.f195085d.f194843r;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        C76879j.m92726T(this.f195085d, this.f195083b ? this.f195085d.getString(C0966R.string.ijt) : this.f195085d.getString(C0966R.string.i6j));
        DelChatroomMemberUI.C67875b bVar2 = this.f195085d.f194833e;
        List<String> list = this.f195084c;
        bVar2.getClass();
        boolean z = false;
        for (String str2 : list) {
            C72996z1 z1Var = null;
            Iterator<C72996z1> it = bVar2.f194846d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C72996z1 next = it.next();
                if (next.getUsername().equals(str2)) {
                    z1Var = next;
                    break;
                }
            }
            if (z1Var != null) {
                ((LinkedList) bVar2.f194846d).remove(z1Var);
                z = true;
            }
        }
        if (z) {
            bVar2.notifyDataSetChanged();
        }
        this.f195085d.f194832d.post(new C67959g0(this));
    }
}
