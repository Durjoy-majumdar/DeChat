package com.tencent.p014mm.p136ui.chatting.component;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72963f4;
import java.util.LinkedList;
import nj3.C76879j;
import p148ei.C7660a;
import pg3.C35488c;
import pg3.C77084b;

/* renamed from: com.tencent.mm.ui.chatting.component.p */
public class C73564p implements C35488c {

    /* renamed from: a */
    public final /* synthetic */ boolean f216066a;

    /* renamed from: b */
    public final /* synthetic */ int f216067b;

    /* renamed from: c */
    public final /* synthetic */ C72963f4 f216068c;

    /* renamed from: d */
    public final /* synthetic */ LinkedList f216069d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList f216070e;

    /* renamed from: f */
    public final /* synthetic */ ChatroomComponent f216071f;

    public C73564p(ChatroomComponent chatroomComponent, boolean z, int i, C72963f4 f4Var, LinkedList linkedList, LinkedList linkedList2) {
        this.f216071f = chatroomComponent;
        this.f216066a = z;
        this.f216067b = i;
        this.f216068c = f4Var;
        this.f216069d = linkedList;
        this.f216070e = linkedList2;
    }

    /* renamed from: a */
    public void mo10150a(int i, int i2, String str, C77084b bVar) {
        C35488c cVar = (C35488c) bVar;
        ProgressDialog progressDialog = this.f216071f.f215458h;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (i != 0 || i2 != 0) {
            if (i2 == -2024) {
                C7660a a = C7660a.m7782a(str);
                if (a != null) {
                    a.mo8792b(this.f216071f.f215752d.f193286j.getContext(), (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                    return;
                }
                C76879j.m92711E(this.f216071f.f215752d.f193286j.getContext(), this.f216071f.f215752d.mo91572m().getString(C0966R.string.i6f), (String) null, this.f216071f.f215752d.mo91572m().getString(C0966R.string.i6g), false, new C73549n(this));
            } else {
                C76879j.m92711E(this.f216071f.f215752d.f193286j.getContext(), this.f216066a ? this.f216071f.f215752d.mo91572m().getString(C0966R.string.ijv) : this.f216071f.f215752d.mo91572m().getString(C0966R.string.i6p), (String) null, this.f216071f.f215752d.mo91572m().getString(C0966R.string.a18), false, new C73558o(this));
            }
            if (this.f216067b == 1) {
                ChatroomComponent chatroomComponent = this.f216071f;
                chatroomComponent.mo102158e6(this.f216068c, chatroomComponent.f215463p.intValue(), this.f216069d, this.f216070e.size(), 1, 3, (String) this.f216069d.get(0));
            }
        }
    }
}
