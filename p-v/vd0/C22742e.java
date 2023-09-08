package vd0;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.msgsubscription.presenter.SubscribeMsgSettingData;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Iterator;

/* renamed from: vd0.e */
public final class C22742e implements MMActivity.C6739d {

    /* renamed from: d */
    public final /* synthetic */ C22739d f65434d;

    /* renamed from: e */
    public final /* synthetic */ int f65435e;

    public C22742e(C22739d dVar, int i) {
        this.f65434d = dVar;
        this.f65435e = i;
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        if (i == this.f65434d.f65426b && i2 == -1) {
            SubscribeMsgTmpItem subscribeMsgTmpItem = (SubscribeMsgTmpItem) intent.getParcelableExtra("key_data");
            boolean booleanExtra = intent.getBooleanExtra("key_status_subscribed", false);
            if (subscribeMsgTmpItem != null) {
                C22739d dVar = this.f65434d;
                dVar.getClass();
                dVar.f65429e = true;
                SubscribeMsgSettingData subscribeMsgSettingData = dVar.f65428d;
                C87412m.m108591d(subscribeMsgSettingData);
                Iterator<SubscribeMsgTmpItem> it = subscribeMsgSettingData.f49052f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SubscribeMsgTmpItem next = it.next();
                    if (TextUtils.equals(subscribeMsgTmpItem.f49021f, next.f49021f)) {
                        next.f49025j = booleanExtra ? 1 : 0;
                        next.f49033u = subscribeMsgTmpItem.f49033u;
                        next.f49036x = subscribeMsgTmpItem.f49036x;
                        break;
                    }
                }
                C22738c cVar = this.f65434d.f65425a;
                if (cVar != null) {
                    cVar.mo21975z0(subscribeMsgTmpItem, this.f65435e);
                    Log.m105924i("MicroMsg.WxaSubscribeMsgSettingPagePresenter", "goDetailUI  mmSetOnActivityResultCallback");
                    return;
                }
                C87412m.m108603p("view");
                throw null;
            }
        }
    }
}
