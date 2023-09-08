package com.tencent.p014mm.plugin.account.friend.model;

import com.tencent.p014mm.plugin.account.friend.model.RecoverFriendPresenter;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.account.friend.model.c */
public class C68400c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RecoverFriendPresenter.C68396a f196541d;

    public C68400c(RecoverFriendPresenter.C68396a aVar) {
        this.f196541d = aVar;
    }

    public void run() {
        RecoverFriendPresenter.this.mo93946f();
        C89779i0 i0Var = RecoverFriendPresenter.this.f196528f;
        if (i0Var != null) {
            i0Var.dismiss();
        }
    }
}
