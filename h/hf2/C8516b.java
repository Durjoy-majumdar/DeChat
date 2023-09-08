package hf2;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.profile.p088ui.IconWidgetPreference;
import com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.NewBizInfoMoreInofUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p196ln.C76708i;
import pj3.C47511g;

/* renamed from: hf2.b */
public class C8516b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f27552d;

    /* renamed from: e */
    public final /* synthetic */ NewBizInfoMoreInofUI f27553e;

    public C8516b(NewBizInfoMoreInofUI newBizInfoMoreInofUI, String str) {
        this.f27553e = newBizInfoMoreInofUI;
        this.f27552d = str;
    }

    public void run() {
        Bitmap N50;
        C47511g gVar = this.f27553e.f115432d;
        if (gVar == null) {
            Log.m105928w("MicroMsg.NewBizInfoMoreInofUI", "LazyGetAvatar screen is null");
            return;
        }
        IconWidgetPreference iconWidgetPreference = (IconWidgetPreference) gVar.mo72519a("contact_info_kf_worker");
        if (iconWidgetPreference != null && this.f27553e.f115432d != null && (N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(this.f27552d)) != null) {
            Log.m105919d("MicroMsg.NewBizInfoMoreInofUI", "LazyGetAvatar success %s, update screen", this.f27552d);
            iconWidgetPreference.mo5914I(N50);
            this.f27553e.f115432d.notifyDataSetChanged();
        }
    }
}
