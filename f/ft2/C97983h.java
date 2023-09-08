package ft2;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.BaseTimeLine;
import com.tencent.p014mm.plugin.sns.p106ui.C95747c1;
import com.tencent.p014mm.plugin.sns.p106ui.C95752c8;
import com.tencent.p014mm.plugin.sns.p106ui.C95761d8;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.SnsWsFoldDetailUI;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vending.base.Vending;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import os2.C100400e0;
import vr2.C102236a0;

/* renamed from: ft2.h */
public class C97983h extends BaseAdapter implements C95747c1 {

    /* renamed from: d */
    public SnsTimeLineBaseAdapter f287374d;

    /* renamed from: e */
    public List<C96275w6> f287375e = new ArrayList();

    /* renamed from: ft2.h$a */
    public class C97984a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ SnsWsFoldDetailUI f287376d;

        /* renamed from: ft2.h$a$a */
        public class C97985a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ List f287378d;

            public C97985a(List list) {
                this.f287378d = list;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1$1");
                SnsWsFoldDetailUI snsWsFoldDetailUI = C97984a.this.f287376d;
                snsWsFoldDetailUI.getClass();
                SnsMethodCalculate.markStartTimeMs("showList", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
                snsWsFoldDetailUI.f279034e.setVisibility(8);
                snsWsFoldDetailUI.f279033d.setVisibility(0);
                C95761d8 d8Var = snsWsFoldDetailUI.f279032B;
                ListView listView = snsWsFoldDetailUI.f279033d;
                d8Var.getClass();
                SnsMethodCalculate.markStartTimeMs("startAutoPlayWithDelay", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
                C87412m.m108594g(listView, "listView");
                listView.postDelayed(new C95752c8(d8Var, listView), 15);
                SnsMethodCalculate.markEndTimeMs("startAutoPlayWithDelay", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager");
                SnsMethodCalculate.markEndTimeMs("showList", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
                C97983h hVar = C97983h.this;
                List list = this.f287378d;
                hVar.getClass();
                SnsMethodCalculate.markStartTimeMs("updateData", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
                ((ArrayList) hVar.f287375e).clear();
                ((ArrayList) hVar.f287375e).addAll(list);
                SnsMethodCalculate.markEndTimeMs("updateData", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
                C97983h.this.notifyDataSetChanged();
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1$1");
            }
        }

        public C97984a(SnsWsFoldDetailUI snsWsFoldDetailUI) {
            this.f287376d = snsWsFoldDetailUI;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1");
            SnsWsFoldDetailUI snsWsFoldDetailUI = this.f287376d;
            if (snsWsFoldDetailUI.f279051y) {
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1");
                return;
            }
            if (snsWsFoldDetailUI.f279041o != null) {
                C100400e0 Yx0 = C94866e1.Yx0();
                SnsWsFoldDetailUI snsWsFoldDetailUI2 = this.f287376d;
                Cursor gY = Yx0.mo139821gY(snsWsFoldDetailUI2.f279041o, C102236a0.m134763p0(snsWsFoldDetailUI2.f279039j), C102236a0.m134763p0(this.f287376d.f279040n));
                ArrayList arrayList = new ArrayList();
                if (gY == null) {
                    Log.m105928w("MicroMsg.SnsWsFoldDetailAdapter", "cursor == null");
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1");
                    return;
                } else if (!gY.moveToFirst()) {
                    gY.close();
                    Log.m105928w("MicroMsg.SnsWsFoldDetailAdapter", "cursor.moveToFirst == false");
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1");
                    return;
                } else if (this.f287376d.f279051y) {
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1");
                    return;
                } else {
                    do {
                        try {
                            SnsInfo snsInfo = new SnsInfo();
                            snsInfo.convertFrom(gY);
                            arrayList.add(snsInfo);
                        } catch (Throwable th) {
                            gY.close();
                            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1");
                            throw th;
                        }
                    } while (gY.moveToNext());
                    int size = arrayList.size();
                    ArrayList arrayList2 = new ArrayList();
                    int i = 0;
                    for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
                        SnsInfo snsInfo2 = (SnsInfo) it.next();
                        SnsObject e = C94897n1.m120367e(snsInfo2);
                        SnsWsFoldDetailUI snsWsFoldDetailUI3 = this.f287376d;
                        SnsTimeLineBaseAdapter a = C97983h.this.mo137303a();
                        boolean z = i < size;
                        SnsWsFoldDetailUI snsWsFoldDetailUI4 = this.f287376d;
                        arrayList2.add(C102236a0.m134783z0(snsInfo2, e, snsWsFoldDetailUI3, a, z, snsWsFoldDetailUI4.f279036g, snsWsFoldDetailUI4.f279043q, snsWsFoldDetailUI4.f279045s, snsWsFoldDetailUI4.f279046t, snsWsFoldDetailUI4.f279047u));
                        i++;
                        size = size;
                    }
                    Log.m105925i("MicroMsg.SnsWsFoldDetailAdapter", "loadData finish, snsInfoList.size:%s, structlist.size:%s", Integer.valueOf(arrayList.size()), Integer.valueOf(arrayList2.size()));
                    C94866e1.ly0().post(new C97985a(arrayList2));
                    gY.close();
                }
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1");
        }
    }

    public C97983h(SnsWsFoldDetailUI snsWsFoldDetailUI, ListView listView, TimelineClickListener timelineClickListener, BaseTimeLine baseTimeLine, int i, String str, Vending.C97302l lVar) {
        this.f287374d = new SnsTimeLineBaseAdapter(snsWsFoldDetailUI, listView, timelineClickListener, baseTimeLine, i, this);
    }

    /* renamed from: F0 */
    public void mo133186F0(String str) {
        SnsMethodCalculate.markStartTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        this.f287374d.mo132925t();
        SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
    }

    /* renamed from: a */
    public SnsTimeLineBaseAdapter mo137303a() {
        SnsMethodCalculate.markStartTimeMs("getBaseAdapter", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = this.f287374d;
        SnsMethodCalculate.markEndTimeMs("getBaseAdapter", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return snsTimeLineBaseAdapter;
    }

    /* renamed from: b */
    public void mo137304b(SnsWsFoldDetailUI snsWsFoldDetailUI) {
        SnsMethodCalculate.markStartTimeMs("loadData", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        if (snsWsFoldDetailUI != null && !snsWsFoldDetailUI.f279051y) {
            C94866e1.my0().post(new C97984a(snsWsFoldDetailUI));
        }
        SnsMethodCalculate.markEndTimeMs("loadData", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
    }

    public int getCount() {
        SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        int size = ((ArrayList) this.f287375e).size();
        SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return size;
    }

    public long getItemId(int i) {
        SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        if (i >= 0 && i < ((ArrayList) this.f287375e).size()) {
            SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
            long j = ((C96275w6) ((ArrayList) this.f287375e).get(i)).f281383j;
            snsReportHelper.getClass();
            SnsMethodCalculate.markStartTimeMs("wsFoldExposeItem", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            if (!((ArrayList) snsReportHelper.f275538c0).contains(Long.valueOf(j))) {
                ((ArrayList) snsReportHelper.f275538c0).add(Long.valueOf(j));
            }
            SnsMethodCalculate.markEndTimeMs("wsFoldExposeItem", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        }
        View b = this.f287374d.mo132914b(i, view);
        SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return b;
    }

    /* renamed from: h0 */
    public C96275w6 mo133189h0(int i) {
        SnsMethodCalculate.markStartTimeMs("genStruct", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        C96275w6 w6Var = (C96275w6) ((ArrayList) this.f287375e).get(i);
        SnsMethodCalculate.markEndTimeMs("genStruct", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return w6Var;
    }

    /* renamed from: l0 */
    public Vending mo133190l0() {
        SnsMethodCalculate.markStartTimeMs("getVending", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        SnsMethodCalculate.markEndTimeMs("getVending", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return null;
    }

    public SnsInfo getItem(int i) {
        SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        SnsInfo snsInfo = ((C96275w6) ((ArrayList) this.f287375e).get(i)).f281367a;
        SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter");
        return snsInfo;
    }
}
