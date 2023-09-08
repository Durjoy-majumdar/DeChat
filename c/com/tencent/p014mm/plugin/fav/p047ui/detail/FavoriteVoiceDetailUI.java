package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fav.p047ui.C68924p1;
import com.tencent.p014mm.plugin.fav.p047ui.FavChatVoiceView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.SensorController;
import com.tencent.p014mm.sdk.platformtools.ShakeManager;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.Iterator;
import java.util.LinkedList;
import pb1.C100715i0;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100755z;
import te3.C101834rc0;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteVoiceDetailUI */
public class FavoriteVoiceDetailUI extends BaseFavDetailReportUI implements MStorage.IOnStorageChange {

    /* renamed from: j */
    public C100755z f270203j;

    /* renamed from: n */
    public long f270204n;

    /* renamed from: o */
    public C100715i0 f270205o;

    /* renamed from: p */
    public FavChatVoiceView f270206p;

    public int getLayoutId() {
        return C0966R.C0971layout.a7m;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C100718j1.class;
        super.onCreate(bundle);
        setMMTitle(getString(C0966R.string.cn9));
        this.f270204n = getIntent().getLongExtra("key_detail_info_id", -1);
        String stringExtra = getIntent().getStringExtra("key_detail_data_id");
        C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142266Yt(this.f270204n);
        this.f270203j = Yt;
        if (Yt == null) {
            Log.m105928w("MicroMsg.FavoriteDetailUI", "get fav item info error");
            finish();
        } else {
            if (!Util.isNullOrNil(stringExtra)) {
                Iterator<C101834rc0> it = this.f270203j.field_favProto.f298618f.iterator();
                while (it.hasNext()) {
                    if (!it.next().f299280T.equals(stringExtra)) {
                        it.remove();
                    }
                }
            }
            mo128399J7(this.f270203j);
            this.f270205o = new C100715i0();
            FavChatVoiceView favChatVoiceView = (FavChatVoiceView) findViewById(C0966R.C0970id.cuk);
            this.f270206p = favChatVoiceView;
            favChatVoiceView.setVoiceHelper(this.f270205o);
            C93575n.m118170a(this, this.f270203j);
            C101834rc0 D = C100734q.m131813D(this.f270203j);
            String w = C100734q.m131880w(D);
            int T = C100734q.m131829T(D.f299262K);
            if (!C86013q1.m106450k(w)) {
                C100734q.m131861m0(this.f270203j, true);
            }
            String str = ((String) C68924p1.m81172a(this, (int) C100734q.m131827R((long) D.f299338y))).toString();
            FavChatVoiceView favChatVoiceView2 = this.f270206p;
            favChatVoiceView2.getClass();
            favChatVoiceView2.f269652h = Util.nullAs(w, "");
            favChatVoiceView2.f269653i = T;
            favChatVoiceView2.setText(str);
            setBackBtn(new C93584u(this));
            addIconOptionMenu(0, (int) C0966R.string.k3h, (int) C0966R.raw.icons_outlined_more, (MenuItem.OnMenuItemClickListener) new C93585v(this));
        }
        ((C100718j1) C86312j.m106911c(cls)).mo128199Jq().add(this);
    }

    public void onDestroy() {
        super.onDestroy();
        FavChatVoiceView favChatVoiceView = this.f270206p;
        if (favChatVoiceView != null) {
            favChatVoiceView.mo128241d();
        }
        C100715i0 i0Var = this.f270205o;
        if (i0Var != null) {
            i0Var.mo140149d();
            SensorController sensorController = C100715i0.f295077p;
            if (sensorController != null) {
                sensorController.removeSensorCallBack();
            }
            ShakeManager shakeManager = i0Var.f295083i;
            if (shakeManager != null) {
                shakeManager.stopShake();
            }
            C100715i0.f295077p = null;
            ((LinkedList) i0Var.f295086o).clear();
        }
        ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq().remove(this);
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(this.f270204n);
        this.f270203j = Yt;
        if (Yt == null) {
            Log.m105928w("MicroMsg.FavoriteDetailUI", "on notify changed, get fav item info error");
            finish();
        } else if (Yt.field_itemStatus == 10 && mStorageEventData != null && mStorageEventData.stg != null && Yt.field_favProto.f298618f.size() > 0) {
            C101834rc0 D = C100734q.m131813D(this.f270203j);
            String w = C100734q.m131880w(D);
            int T = C100734q.m131829T(D.f299262K);
            Log.m105924i("MicroMsg.FavoriteDetailUI", "on notify changed, favVoiceView.updateInfo");
            String str2 = ((String) C68924p1.m81172a(this, (int) C100734q.m131827R((long) D.f299338y))).toString();
            FavChatVoiceView favChatVoiceView = this.f270206p;
            favChatVoiceView.getClass();
            favChatVoiceView.f269652h = Util.nullAs(w, "");
            favChatVoiceView.f269653i = T;
            favChatVoiceView.setText(str2);
        }
    }

    public void onPause() {
        super.onPause();
        this.f270205o.mo140149d();
    }

    public void onResume() {
        super.onResume();
    }
}
