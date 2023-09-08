package com.tencent.p014mm.p136ui.chatting.gallery;

import android.content.Context;
import com.tencent.p014mm.storage.C72963f4;
import java.util.concurrent.Callable;

/* renamed from: com.tencent.mm.ui.chatting.gallery.i */
public class C97071i implements Callable<String> {

    /* renamed from: d */
    public final /* synthetic */ Context f284772d;

    /* renamed from: e */
    public final /* synthetic */ C72963f4 f284773e;

    /* renamed from: f */
    public final /* synthetic */ boolean f284774f;

    public C97071i(Context context, C72963f4 f4Var, boolean z) {
        this.f284772d = context;
        this.f284773e = f4Var;
        this.f284774f = z;
    }

    public Object call() {
        return C97056h.m124959m(this.f284772d, this.f284773e, this.f284774f) ? "Success" : "Fail";
    }
}
