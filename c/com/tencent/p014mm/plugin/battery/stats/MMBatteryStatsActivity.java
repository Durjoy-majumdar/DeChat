package com.tencent.p014mm.plugin.battery.stats;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.matrix.batterycanary.stats.C114559a;
import com.tencent.matrix.batterycanary.stats.p1183ui.BatteryStatsAdapter;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.battery.stats.chart.SimpleLineChart;
import com.tencent.xweb.file.XVFSFile;
import ew0.C116787b;
import ew0.C116788c;
import ew0.C116789d;
import ew0.C116790e;
import ew0.a$$a;
import ew0.a$$b;
import ew0.a$$c;
import ew0.a$$d;
import ew0.a$$e;
import p1196he.C117080b;

/* renamed from: com.tencent.mm.plugin.battery.stats.MMBatteryStatsActivity */
public class MMBatteryStatsActivity extends MMActivity {

    /* renamed from: j */
    public static final /* synthetic */ int f345515j = 0;

    /* renamed from: d */
    public C116790e f345516d;

    /* renamed from: e */
    public SimpleLineChart f345517e;

    /* renamed from: f */
    public CheckBox f345518f;

    /* renamed from: g */
    public CheckBox f345519g;

    /* renamed from: h */
    public BatteryStatsAdapter.Item.C114579a f345520h;

    /* renamed from: i */
    public boolean f345521i;

    /* renamed from: H7 */
    public final void mo175078H7() {
        if (this.f345518f.isChecked()) {
            this.f345516d.f343433f = new a$$d();
        } else if (this.f345519g.isChecked()) {
            this.f345516d.f343433f = new a$$e();
        } else {
            this.f345516d.f343433f = null;
        }
        C116790e eVar = this.f345516d;
        eVar.f343431d = 0;
        eVar.f343430c.post(new C117080b(eVar));
        this.f345516d.mo173755b();
        mo175079I7(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e7, code lost:
        if (r2.isEmpty() == false) goto L_0x0101;
     */
    /* renamed from: I7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo175079I7(int r12) {
        /*
            r11 = this;
            ew0.e r0 = r11.f345516d
            com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$a r12 = r0.mo173754a(r12)
            if (r12 == 0) goto L_0x0106
            com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$a r0 = r11.f345520h
            if (r0 == 0) goto L_0x000e
            if (r0 == r12) goto L_0x0106
        L_0x000e:
            r11.f345520h = r12
            r0 = 2131305924(0x7f0925c4, float:1.8230033E38)
            android.view.View r0 = r11.findViewById(r0)
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            r10 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r9.mo10233c(r1)
            java.lang.Object[] r2 = r9.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/battery/stats/MMBatteryStatsActivity"
            java.lang.String r4 = "updateHeader"
            java.lang.String r5 = "(I)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r0
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r9.mo10231a(r10)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/battery/stats/MMBatteryStatsActivity"
            java.lang.String r3 = "updateHeader"
            java.lang.String r4 = "(I)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r0
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            r1 = 2131315857(0x7f094c91, float:1.825018E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = r12.f343389d
            r0.setText(r1)
            ew0.e r0 = r11.f345516d
            android.content.Context r1 = r11.getApplicationContext()
            java.lang.String r12 = r12.f343389d
            r0.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Class<com.tencent.matrix.batterycanary.stats.i> r3 = com.tencent.matrix.batterycanary.stats.C114572i.class
            com.tencent.matrix.batterycanary.monitor.feature.k0 r3 = p933be.C79691a.m96804a(r3)
            com.tencent.matrix.batterycanary.stats.i r3 = (com.tencent.matrix.batterycanary.stats.C114572i) r3
            r4 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x00ea
            java.lang.String r0 = r0.f343432e
            com.tencent.matrix.batterycanary.stats.a r3 = r3.f343366d
            if (r3 == 0) goto L_0x0094
            com.tencent.matrix.batterycanary.stats.a$a r3 = (com.tencent.matrix.batterycanary.stats.C114559a.C114560a) r3
            java.util.List r12 = r3.mo173738c(r12, r0)
            goto L_0x0098
        L_0x0094:
            java.util.List r12 = java.util.Collections.emptyList()
        L_0x0098:
            java.util.Iterator r12 = r12.iterator()
        L_0x009c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r0 = r12.next()
            com.tencent.matrix.batterycanary.stats.BatteryRecord r0 = (com.tencent.matrix.batterycanary.stats.BatteryRecord) r0
            boolean r3 = r0 instanceof com.tencent.matrix.batterycanary.stats.BatteryRecord.EventStatRecord
            if (r3 == 0) goto L_0x009c
            r3 = r0
            com.tencent.matrix.batterycanary.stats.BatteryRecord$EventStatRecord r3 = (com.tencent.matrix.batterycanary.stats.BatteryRecord.EventStatRecord) r3
            java.lang.String r7 = r3.f343329g
            java.lang.String r8 = "BATTERY_STAT"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x009c
            java.lang.String r7 = "battery-change"
            boolean r7 = r3.mo173719d(r7, r10)
            if (r7 == 0) goto L_0x009c
            r7 = -1
            java.lang.String r9 = "battery-pct"
            long r7 = r3.mo173720e(r9, r7)
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x009c
            d3.c r3 = new d3.c
            float r7 = (float) r7
            float r7 = r7 * r6
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            long r8 = r0.f343325e
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r3.<init>(r7, r0)
            r2.add(r3)
            goto L_0x009c
        L_0x00e3:
            boolean r12 = r2.isEmpty()
            if (r12 != 0) goto L_0x00ea
            goto L_0x0101
        L_0x00ea:
            d3.c r12 = new d3.c
            int r0 = p981ie.C117159b.m165205f(r1)
            float r0 = (float) r0
            float r0 = r0 * r6
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r12.<init>(r0, r1)
            r2.add(r12)
        L_0x0101:
            com.tencent.mm.plugin.battery.stats.chart.SimpleLineChart r12 = r11.f345517e
            r12.setData(r2)
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.battery.stats.MMBatteryStatsActivity.mo175079I7(int):void");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cmi;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String b = C114559a.C114560a.f343346d.mo181110b();
        setMMTitle("电量统计报告");
        removeAllOptionMenu();
        addTextOptionMenu(1, XVFSFile.PATH_SEPARATOR + b, new a$$a(this), (View.OnLongClickListener) null, MMActivityController.C73075r.NORMAL);
        this.f345517e = (SimpleLineChart) findViewById(C0966R.C0970id.f357646b01);
        this.f345518f = (CheckBox) findViewById(C0966R.C0970id.max);
        this.f345519g = (CheckBox) findViewById(C0966R.C0970id.maz);
        this.f345518f.setOnCheckedChangeListener(new a$$b(this));
        this.f345519g.setOnCheckedChangeListener(new a$$c(this));
        RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.mhb);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        C116789d dVar = new C116789d();
        recyclerView.setAdapter(dVar);
        dVar.registerAdapterDataObserver(new C116787b(this, linearLayoutManager));
        this.f345516d = new C116790e(dVar);
        recyclerView.mo17043c(new C116788c(this, linearLayoutManager));
        C116790e eVar = this.f345516d;
        eVar.f343432e = b;
        eVar.f343431d = 0;
        eVar.f343430c.post(new C117080b(eVar));
        this.f345516d.mo173755b();
    }
}
