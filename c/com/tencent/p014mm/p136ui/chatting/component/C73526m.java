package com.tencent.p014mm.p136ui.chatting.component;

import android.app.ProgressDialog;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72963f4;
import java.util.LinkedList;
import nj3.C76879j;
import pg3.C35488c;
import pg3.C77084b;

/* renamed from: com.tencent.mm.ui.chatting.component.m */
public class C73526m implements C35488c {

    /* renamed from: a */
    public final /* synthetic */ boolean f215976a;

    /* renamed from: b */
    public final /* synthetic */ int f215977b;

    /* renamed from: c */
    public final /* synthetic */ C72963f4 f215978c;

    /* renamed from: d */
    public final /* synthetic */ LinkedList f215979d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList f215980e;

    /* renamed from: f */
    public final /* synthetic */ ChatroomComponent f215981f;

    public C73526m(ChatroomComponent chatroomComponent, boolean z, int i, C72963f4 f4Var, LinkedList linkedList, LinkedList linkedList2) {
        this.f215981f = chatroomComponent;
        this.f215976a = z;
        this.f215977b = i;
        this.f215978c = f4Var;
        this.f215979d = linkedList;
        this.f215980e = linkedList2;
    }

    /* renamed from: a */
    public void mo10150a(int i, int i2, String str, C77084b bVar) {
        C35488c cVar = (C35488c) bVar;
        ProgressDialog progressDialog = this.f215981f.f215458h;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        C76879j.m92726T(this.f215981f.f215752d.mo91565f(), this.f215976a ? this.f215981f.f215752d.mo91572m().getString(C0966R.string.ijt) : this.f215981f.f215752d.mo91572m().getString(C0966R.string.i6j));
        if (this.f215977b == 1) {
            ChatroomComponent chatroomComponent = this.f215981f;
            chatroomComponent.mo102158e6(this.f215978c, chatroomComponent.f215463p.intValue(), this.f215979d, this.f215980e.size(), 1, 2, (String) this.f215979d.get(0));
        }
    }
}
