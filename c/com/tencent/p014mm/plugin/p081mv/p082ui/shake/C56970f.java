package com.tencent.p014mm.plugin.p081mv.p082ui.shake;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.mv.ui.shake.f */
public class C56970f implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ MusicMainUINew f163175d;

    public C56970f(MusicMainUINew musicMainUINew) {
        this.f163175d = musicMainUINew;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        if (1 == i && i2 == -1) {
            C76701a.makeText((Context) this.f163175d.getContext(), (CharSequence) this.f163175d.getContext().getResources().getString(C0966R.string.j6i), 0).show();
        }
    }
}
