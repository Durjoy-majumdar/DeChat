package lu2;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.mj_template.api.MaasAlbumMultiTemplateRequestParams;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import da0.C58247e;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import os2.C100417r0;
import p599lr.C61381b;
import yn2.C102882s0;

public final /* synthetic */ class h$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsInfo f292053d;

    /* renamed from: e */
    public final /* synthetic */ SnsTimeLineBaseAdapter f292054e;

    public /* synthetic */ h$$a(SnsInfo snsInfo, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        this.f292053d = snsInfo;
        this.f292054e = snsTimeLineBaseAdapter;
    }

    public final void onClick(View view) {
        boolean z;
        MaasAlbumMultiTemplateRequestParams maasAlbumMultiTemplateRequestParams;
        View view2 = view;
        SnsInfo snsInfo = this.f292053d;
        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = this.f292054e;
        Object obj = new Object();
        ArrayList arrayList = new ArrayList();
        arrayList.add(snsInfo);
        arrayList.add(snsTimeLineBaseAdapter);
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/PhotoTimeLineItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
        SnsMethodCalculate.markStartTimeMs("lambda$fillItem$1", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        Log.m105924i("MiroMsg.PhotoTimeLineItem", "PhotoTimeLineItem click to post finder");
        TimeLineObject timeLine = snsInfo.getTimeLine();
        String j = C100417r0.m131421j("sns_table_", (long) snsInfo.localid);
        C102882s0 s0Var = C102882s0.f303681a;
        ArrayList<GalleryItem$MediaItem> f = s0Var.mo142594f(j);
        if (f == null || !((C61381b) C86312j.m106911c(C61381b.class)).mo78560xU()) {
            z = s0Var.mo142597i(snsTimeLineBaseAdapter.f278575i, timeLine.ContentDesc, snsInfo.field_snsId, (long) snsInfo.localid, j, false);
        } else {
            Intent intent = new Intent();
            intent.putExtra("key_maas_entrance", 9);
            MMActivity mMActivity = snsTimeLineBaseAdapter.f278575i;
            String str = timeLine.ContentDesc;
            long j2 = snsInfo.field_snsId;
            C58247e eVar = (C58247e) C86312j.m106911c(C58247e.class);
            long j3 = (long) snsInfo.localid;
            C58247e eVar2 = eVar;
            new MaasAlbumMultiTemplateRequestParams(f, true, true, true, s0Var.mo142593e(str, j2, j3, j));
            eVar2.q40(mMActivity, intent, maasAlbumMultiTemplateRequestParams);
            z = true;
        }
        if (z) {
            view2.post(new h$$b(view2));
        }
        SnsMethodCalculate.markEndTimeMs("lambda$fillItem$1", "com.tencent.mm.plugin.sns.ui.item.PhotoTimeLineItem");
        C117292a.m165361g(new Object(), "com/tencent/mm/plugin/sns/ui/item/PhotoTimeLineItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
