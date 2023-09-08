package com.tencent.p014mm.plugin.game.chatroom.view;

import android.graphics.Color;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d62.C7240a;
import wd3.C53155r0;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.t */
public abstract class C4442t extends C7240a {

    /* renamed from: e */
    public Object f19177e;

    public C4442t(int i, Object obj) {
        super(i, (C53155r0) null);
        this.f19177e = obj;
    }

    public void setColorConfig(int i) {
        setColor(Color.parseColor("#7D90A9"), MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_0_5));
    }
}
