package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import di3.C86312j;
import p196ln.C76708i;
import xd3.C78802b;

/* renamed from: com.tencent.mm.ui.conversation.banner.j */
public class C74669j extends C78802b {

    /* renamed from: h */
    public String f219530h;

    /* renamed from: i */
    public String f219531i;

    public C74669j(Context context, String str, String str2) {
        super(context);
        this.f219530h = str;
        this.f219531i = str2;
        View view = this.f230569f;
        if (view != null) {
            this.f230569f.setOnClickListener(new C74668i(this));
            ((ImageView) view.findViewById(C0966R.C0970id.f357665b40)).setImageBitmap(((C76708i) C86312j.m106911c(C76708i.class)).mo106820Fj(this.f219530h, true));
        }
    }

    /* renamed from: a */
    public void mo7968a() {
    }

    /* renamed from: b */
    public int mo7969b() {
        return C0966R.C0971layout.f6982u1;
    }
}
