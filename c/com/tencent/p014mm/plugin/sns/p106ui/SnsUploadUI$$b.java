package com.tencent.p014mm.plugin.sns.p106ui;

import a22.C67001a;
import android.view.View;
import b22.C28250a;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import ms2.C61578o;
import ms2.C61579p;
import mt2.C47101a;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadUI$$b */
public final /* synthetic */ class SnsUploadUI$$b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsUploadUI f278978d;

    public /* synthetic */ SnsUploadUI$$b(SnsUploadUI snsUploadUI) {
        this.f278978d = snsUploadUI;
    }

    public final void onClick(View view) {
        Iterator<C61579p> it;
        boolean z;
        boolean z2;
        SnsUploadUI snsUploadUI = this.f278978d;
        int i = SnsUploadUI.f278903Q0;
        snsUploadUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsUploadUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", snsUploadUI, array);
        SnsMethodCalculate.markStartTimeMs("lambda$initView$1", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        Log.m105924i("MicroMsg.SnsUploadUI", "restoreLastRangeInfo");
        SnsMethodCalculate.markStartTimeMs("restoreLastRangeInfo", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        C61578o f = C94866e1.gy0().mo131195f();
        Iterator<C61579p> it4 = f.f175147d.iterator();
        int i2 = 1;
        boolean z3 = true;
        while (it4.hasNext()) {
            C61579p next = it4.next();
            int i3 = next.f175151e;
            if (i3 == 2) {
                C86709a0.m107528h();
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(next.f175150d);
                if (!(z1Var == null || ((int) z1Var.f108320R1) == 0)) {
                    arrayList2.add(next.f175150d);
                }
                it = it4;
            } else if (i3 == i2) {
                if (z3) {
                    snsUploadUI.f278951z.clear();
                    z3 = false;
                }
                snsUploadUI.f278951z.add(next.f175150d);
                String h = ((C67001a) C28250a.m38138a()).mo90970h(next.f175150d);
                if (h != null) {
                    SnsMethodCalculate.markStartTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                    it = it4;
                    z = z3;
                    int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_GROUP_INT_SYNC, 0);
                    if (j == 0) {
                        boolean z4 = C47101a.f126572a;
                        SnsMethodCalculate.markEndTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                        z2 = z4;
                    } else if (j != 2) {
                        if (C47101a.f126572a) {
                            Log.m105924i("MicroMsg.SnsLabelRangeConfig", "enableNewLabelRangeControl false");
                            C47101a.f126572a = false;
                        }
                        SnsMethodCalculate.markEndTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                        z2 = false;
                    } else {
                        if (!C47101a.f126572a) {
                            Log.m105924i("MicroMsg.SnsLabelRangeConfig", "enableNewLabelRangeControl true");
                            C47101a.f126572a = true;
                        }
                        SnsMethodCalculate.markEndTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                        z2 = true;
                    }
                    if (z2) {
                        if (!Util.isNullOrNil(((C67001a) C28250a.m38138a()).mo90973k(next.f175150d))) {
                            arrayList3.add(h);
                        }
                    } else {
                        arrayList3.add(h);
                    }
                } else {
                    it = it4;
                    z = z3;
                }
                z3 = z;
            } else {
                it = it4;
                if (i3 == 0) {
                    arrayList4.add(next.f175150d);
                }
            }
            it4 = it;
            i2 = 1;
        }
        Log.m105925i("MicroMsg.SnsUploadUI", "[restoreLastRangeInfo] mLabelIdList:%s", snsUploadUI.f278951z);
        snsUploadUI.f278949y = Util.listToString(arrayList2, ",");
        snsUploadUI.f278945v = Util.listToString(arrayList3, ",");
        snsUploadUI.f278947x = Util.listToString(arrayList4, ",");
        snsUploadUI.getIntent().putStringArrayListExtra("label_id", snsUploadUI.f278951z);
        snsUploadUI.getIntent().putExtra("Kother_user_name_list", snsUploadUI.f278947x);
        snsUploadUI.getIntent().putExtra("Klabel_name_list", snsUploadUI.f278945v);
        snsUploadUI.getIntent().putExtra("Kchat_room_name_list", snsUploadUI.f278949y);
        Log.m105925i("MicroMsg.SnsUploadUI", "[restoreLastRangeInfo] mLabelNameList size:%d", Integer.valueOf(arrayList3.size()));
        if (f.f175149f) {
            snsUploadUI.getIntent().putExtra("Ktag_range_index", 3);
        } else {
            snsUploadUI.getIntent().putExtra("Ktag_range_index", 2);
        }
        snsUploadUI.mo133086Y7(snsUploadUI.getIntent());
        SnsMethodCalculate.markEndTimeMs("restoreLastRangeInfo", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        SnsMethodCalculate.markEndTimeMs("lambda$initView$1", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
        C117292a.m165361g(snsUploadUI, "com/tencent/mm/plugin/sns/ui/SnsUploadUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
