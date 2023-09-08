package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import p159gw.C98250h;
import p159gw.C98252k;
import p910lj.C76701a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.s */
public class C93580s implements C98250h.C98251a {

    /* renamed from: a */
    public final /* synthetic */ String f270248a;

    /* renamed from: b */
    public final /* synthetic */ Context f270249b;

    /* renamed from: c */
    public final /* synthetic */ FavoriteVideoPlayUI f270250c;

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.s$a */
    public class C93581a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f270251d;

        public C93581a(String str) {
            this.f270251d = str;
        }

        public void run() {
            ((C98252k) C86312j.m106911c(C98252k.class)).Aq0(C86013q1.m106456q(this.f270251d), C93580s.this.f270250c.f270176E);
        }
    }

    public C93580s(FavoriteVideoPlayUI favoriteVideoPlayUI, String str, Context context) {
        this.f270250c = favoriteVideoPlayUI;
        this.f270248a = str;
        this.f270249b = context;
    }

    /* renamed from: a */
    public void mo2055a(String str, String str2) {
        Log.m105925i("MicroMsg.FavoriteVideoPlayUI", "save video now video path %s out path %s", this.f270248a, str2);
        C76701a.makeText((Context) this.f270250c.getContext(), (CharSequence) this.f270249b.getString(C0966R.string.kah, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(str2)}), 1).show();
        AndroidMediaUtil.refreshMediaScanner(str2, this.f270250c.getContext());
        ((C119157j) C119157j.f356862d).mo183875f(new C93581a(str2));
    }

    /* renamed from: b */
    public void mo2056b(String str, String str2) {
        Log.m105925i("MicroMsg.FavoriteVideoPlayUI", "save video now video path %s out path %s", this.f270248a, str2);
        Context context = this.f270249b;
        C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.kag), 1).show();
    }
}
