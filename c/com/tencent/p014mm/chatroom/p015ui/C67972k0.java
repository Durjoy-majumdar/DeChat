package com.tencent.p014mm.chatroom.p015ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72963f4;
import nj3.C76879j;
import p148ei.C7660a;
import pg3.C35488c;
import pg3.C77084b;

/* renamed from: com.tencent.mm.chatroom.ui.k0 */
public class C67972k0 implements C35488c {

    /* renamed from: a */
    public final /* synthetic */ String f195100a;

    /* renamed from: b */
    public final /* synthetic */ DelChatroomMemberUI f195101b;

    public C67972k0(DelChatroomMemberUI delChatroomMemberUI, String str) {
        this.f195101b = delChatroomMemberUI;
        this.f195100a = str;
    }

    /* renamed from: a */
    public void mo10150a(int i, int i2, String str, C77084b bVar) {
        int i3 = i2;
        C35488c cVar = (C35488c) bVar;
        ProgressDialog progressDialog = this.f195101b.f194843r;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (i != 0 || i3 != 0) {
            if (i3 == -2024) {
                C7660a a = C7660a.m7782a(str);
                if (a != null) {
                    a.mo8792b(this.f195101b, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                    return;
                }
                C76879j.m92711E(this.f195101b.getContext(), this.f195101b.getString(C0966R.string.i6f), (String) null, this.f195101b.getString(C0966R.string.i6g), false, new C67966i0(this));
            } else {
                DelChatroomMemberUI delChatroomMemberUI = this.f195101b;
                C76879j.m92711E(delChatroomMemberUI, delChatroomMemberUI.getString(C0966R.string.i6p), (String) null, this.f195101b.getString(C0966R.string.a18), false, new C67969j0(this));
            }
            DelChatroomMemberUI delChatroomMemberUI2 = this.f195101b;
            if (delChatroomMemberUI2.f194839n == 1) {
                C72963f4 f4Var = delChatroomMemberUI2.f194844s;
                int i4 = delChatroomMemberUI2.f194840o;
                DelChatroomMemberUI.m80263I7(delChatroomMemberUI2, f4Var, i4, delChatroomMemberUI2.f194836h, delChatroomMemberUI2.f194833e.getCount(), 1, 3, this.f195100a);
            }
        }
    }
}
