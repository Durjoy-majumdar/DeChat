package com.tencent.p014mm.p136ui.chatting.gallery;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import p329d3.C86165a;

/* renamed from: com.tencent.mm.ui.chatting.gallery.j */
public class C97074j implements C86165a<String> {

    /* renamed from: a */
    public final /* synthetic */ boolean f284780a;

    /* renamed from: b */
    public final /* synthetic */ Context f284781b;

    public C97074j(boolean z, Context context) {
        this.f284780a = z;
        this.f284781b = context;
    }

    public void accept(Object obj) {
        String str = (String) obj;
        if (this.f284780a && str == null) {
            Context context = this.f284781b;
            context.getString(C0966R.string.cgo, new Object[]{context.getString(C0966R.string.kag)});
        }
    }
}
