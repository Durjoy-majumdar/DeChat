package com.tencent.p014mm.plugin.p081mv.p082ui.shake;

import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import la2.C99364n;
import nj3.C76879j;
import qc0.C101106m;

/* renamed from: com.tencent.mm.plugin.mv.ui.shake.m */
public class C56977m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MusicMainUINew f163185d;

    public C56977m(MusicMainUINew musicMainUINew) {
        this.f163185d = musicMainUINew;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MusicMainUINew musicMainUINew = this.f163185d;
        int i = MusicMainUINew.f163137C;
        musicMainUINew.getClass();
        C101106m k = C99364n.m129616h().mo138832k();
        Log.m105925i("MusicMainUINew", "MusicType:%d, SongWebUrl ", Integer.valueOf(k.f295959d), k.f295968p);
        if (!TextUtils.isEmpty(k.f295968p)) {
            ArrayList arrayList2 = new ArrayList();
            String[] strArr = {musicMainUINew.getString(C0966R.string.f361082h43), musicMainUINew.getString(C0966R.string.h44)};
            arrayList2.add(0);
            arrayList2.add(1);
            C76879j.m92736g(musicMainUINew, "", strArr, "", new C56969e(musicMainUINew));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
