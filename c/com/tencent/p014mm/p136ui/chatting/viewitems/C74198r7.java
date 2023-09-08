package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.DialogInterface;
import com.tencent.p014mm.storage.C72963f4;
import kd0.C76552z;
import zj3.C79347d1;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.r7 */
public class C74198r7 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f217816d;

    /* renamed from: e */
    public final /* synthetic */ C72963f4 f217817e;

    /* renamed from: f */
    public final /* synthetic */ C79347d1 f217818f;

    /* renamed from: g */
    public final /* synthetic */ int f217819g;

    public C74198r7(boolean z, C72963f4 f4Var, C79347d1 d1Var, int i) {
        this.f217816d = z;
        this.f217817e = f4Var;
        this.f217818f = d1Var;
        this.f217819g = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f217816d) {
            C76552z.m92082t(this.f217817e);
        }
        this.f217818f.mo102301z2();
        this.f217818f.mo102287Y4(this.f217817e, true, this.f217819g, 0);
    }
}
