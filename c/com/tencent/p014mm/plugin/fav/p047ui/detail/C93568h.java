package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.autogen.events.DealQBarStrEvent;
import com.tencent.p014mm.plugin.fav.p047ui.detail.FavoriteImgDetailUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import pb1.C100705f0;
import pb1.C100755z;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101835rd0;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.h */
public class C93568h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FavoriteImgDetailUI.C93530h f270226d;

    /* renamed from: e */
    public final /* synthetic */ FavoriteImgDetailUI f270227e;

    public C93568h(FavoriteImgDetailUI favoriteImgDetailUI, FavoriteImgDetailUI.C93530h hVar) {
        this.f270227e = favoriteImgDetailUI;
        this.f270226d = hVar;
    }

    public void onClick(View view) {
        C101801kd0 kd02;
        C101835rd0 rd02;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/detail/FavoriteImgDetailUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.FavoriteImgDetailUI", "request deal QBAR string");
        if (this.f270226d.f270119c.mo107563h()) {
            this.f270226d.f270119c.mo107572p();
        }
        DealQBarStrEvent dealQBarStrEvent = new DealQBarStrEvent();
        DealQBarStrEvent.C92468a aVar = dealQBarStrEvent.f264648d;
        aVar.f264650b = this.f270227e;
        FavoriteImgDetailUI.C93530h hVar = this.f270226d;
        aVar.f264649a = hVar.f270121e;
        aVar.f264651c = hVar.f270122f;
        aVar.f264653e = 7;
        aVar.f264657i = 39;
        C101834rc0 rc02 = hVar.f270117a;
        if (rc02 != null) {
            aVar.f264658j = rc02.f299325s;
            aVar.f264659k = rc02.f299329u;
        }
        aVar.f264652d = hVar.f270123g;
        Bundle bundle = new Bundle(1);
        bundle.putInt("stat_scene", 5);
        FavoriteImgDetailUI favoriteImgDetailUI = this.f270227e;
        int i = FavoriteImgDetailUI.f270088w;
        favoriteImgDetailUI.getClass();
        Log.m105924i("MicroMsg.FavoriteImgDetailUI", "addStatInfo4AppBrand, from fav");
        bundle.putInt("LaunchCodeScene_ScanScene", 4);
        C100755z zVar = favoriteImgDetailUI.f270091o;
        if (!(zVar == null || (kd02 = zVar.field_favProto) == null || (rd02 = kd02.f298616d) == null)) {
            bundle.putString("stat_chat_talker_username", C100705f0.m131751b(rd02));
            bundle.putString("stat_send_msg_user", rd02.f299348f);
            bundle.putString("stat_msg_id", rd02.f299358s);
        }
        dealQBarStrEvent.f264648d.f264660l = bundle;
        dealQBarStrEvent.publish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteImgDetailUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
