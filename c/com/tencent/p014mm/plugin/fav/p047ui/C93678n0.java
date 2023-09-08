package com.tencent.p014mm.plugin.fav.p047ui;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.autogen.events.DealQBarStrEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.plugin.fav.p047ui.FavImgGalleryUI;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93624e;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import pb1.C100705f0;
import pb1.C100755z;
import te3.C101801kd0;
import te3.C101835rd0;

/* renamed from: com.tencent.mm.plugin.fav.ui.n0 */
public class C93678n0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RecogQBarOfImageFileResultEvent f270461d;

    /* renamed from: e */
    public final /* synthetic */ ImageQBarDataBean f270462e;

    /* renamed from: f */
    public final /* synthetic */ FavImgGalleryUI f270463f;

    public C93678n0(FavImgGalleryUI favImgGalleryUI, RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent, ImageQBarDataBean imageQBarDataBean) {
        this.f270463f = favImgGalleryUI;
        this.f270461d = recogQBarOfImageFileResultEvent;
        this.f270462e = imageQBarDataBean;
    }

    public void onClick(View view) {
        C101801kd0 kd02;
        C101835rd0 rd02;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.FavImgGalleryUI", "request deal QBAR string");
        if (this.f270463f.f269724h.mo107563h()) {
            this.f270463f.f269724h.mo107572p();
        }
        if (this.f270461d == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        FavImgGalleryUI favImgGalleryUI = this.f270463f;
        C93624e b = favImgGalleryUI.f269722f.getItem(favImgGalleryUI.f269720d);
        FavImgGalleryUI.C93435k kVar = (FavImgGalleryUI.C93435k) ((HashMap) this.f270463f.f269727n).get(b.mo128524j());
        if (!(kVar == null || kVar.f269752a == null)) {
            DealQBarStrEvent dealQBarStrEvent = new DealQBarStrEvent();
            DealQBarStrEvent.C92468a aVar = dealQBarStrEvent.f264648d;
            aVar.f264650b = this.f270463f;
            ImageQBarDataBean imageQBarDataBean = this.f270462e;
            aVar.f264649a = imageQBarDataBean.f273113d;
            aVar.f264651c = imageQBarDataBean.f273114e;
            aVar.f264653e = 7;
            aVar.f264657i = 39;
            aVar.f264658j = b.mo128520f();
            dealQBarStrEvent.f264648d.f264659k = b.mo128519e();
            dealQBarStrEvent.f264648d.f264652d = this.f270462e.f273115f;
            Bundle bundle = new Bundle(1);
            bundle.putInt("stat_scene", 5);
            FavImgGalleryUI favImgGalleryUI2 = this.f270463f;
            C100755z p = b.mo128530p();
            favImgGalleryUI2.getClass();
            Log.m105924i("MicroMsg.FavImgGalleryUI", "addStatInfo4AppBrand, from fav");
            bundle.putInt("LaunchCodeScene_ScanScene", 4);
            if (!(p == null || (kd02 = p.field_favProto) == null || (rd02 = kd02.f298616d) == null)) {
                if (Util.isNullOrNil(rd02.f299354o)) {
                    C75592q0.m90789s().equals(rd02.f299348f);
                }
                bundle.putString("stat_chat_talker_username", C100705f0.m131751b(rd02));
                bundle.putString("stat_send_msg_user", rd02.f299348f);
                bundle.putString("stat_msg_id", rd02.f299358s);
            }
            dealQBarStrEvent.f264648d.f264660l = bundle;
            dealQBarStrEvent.publish();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
