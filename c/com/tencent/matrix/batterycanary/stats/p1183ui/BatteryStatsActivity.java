package com.tencent.matrix.batterycanary.stats.p1183ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.matrix.batterycanary.stats.C114559a;
import com.tencent.matrix.batterycanary.stats.C114572i;
import com.tencent.matrix.batterycanary.stats.p1183ui.BatteryStatsAdapter;
import com.tencent.p014mm.C0966R;
import com.tencent.xweb.file.XVFSFile;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p1196he.C117080b;
import p933be.C79691a;
import p981ie.C87705i;

/* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsActivity */
public class BatteryStatsActivity extends AppCompatActivity {

    /* renamed from: d */
    public C114595c f343373d;

    /* renamed from: e */
    public BatteryStatsAdapter.Item.C114579a f343374e;

    /* renamed from: f */
    public boolean f343375f;

    /* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsActivity$a */
    public class C114576a implements C87705i<C114572i> {

        /* renamed from: a */
        public final /* synthetic */ TextView f343376a;

        public C114576a(TextView textView) {
            this.f343376a = textView;
        }

        public void accept(Object obj) {
            this.f343376a.setOnClickListener(new C114592a(this, (C114572i) obj));
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsActivity$b */
    public class C114577b extends RecyclerView.C16615g {

        /* renamed from: a */
        public final /* synthetic */ LinearLayoutManager f343378a;

        public C114577b(LinearLayoutManager linearLayoutManager) {
            this.f343378a = linearLayoutManager;
        }

        /* renamed from: b */
        public void mo2556b() {
            BatteryStatsActivity.m161185G7(BatteryStatsActivity.this, this.f343378a.mo16957C());
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.stats.ui.BatteryStatsActivity$c */
    public class C114578c extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ LinearLayoutManager f343380d;

        public C114578c(LinearLayoutManager linearLayoutManager) {
            this.f343380d = linearLayoutManager;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            boolean z;
            super.onScrolled(recyclerView, i, i2);
            BatteryStatsActivity.m161185G7(BatteryStatsActivity.this, this.f343380d.mo16957C());
            if (this.f343380d.mo16959E() == ((ArrayList) BatteryStatsActivity.this.f343373d.f343428a.f343382d).size() - 1) {
                C114595c cVar = BatteryStatsActivity.this.f343373d;
                if (Math.abs(cVar.f343431d) >= cVar.f343429b) {
                    z = false;
                } else {
                    int i3 = cVar.f343431d - 1;
                    cVar.f343431d = i3;
                    C79691a.m96805b(C114572i.class, new C114594b(cVar, i3));
                    z = true;
                }
                if (!z) {
                    BatteryStatsActivity batteryStatsActivity = BatteryStatsActivity.this;
                    if (!batteryStatsActivity.f343375f) {
                        batteryStatsActivity.f343375f = true;
                    }
                }
            }
        }
    }

    /* renamed from: G7 */
    public static void m161185G7(BatteryStatsActivity batteryStatsActivity, int i) {
        BatteryStatsAdapter.Item.C114579a a = batteryStatsActivity.f343373d.mo173754a(i);
        if (a != null) {
            BatteryStatsAdapter.Item.C114579a aVar = batteryStatsActivity.f343374e;
            if (aVar == null || aVar != a) {
                batteryStatsActivity.f343374e = a;
                View findViewById = batteryStatsActivity.findViewById(C0966R.C0970id.mdl);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsActivity", "updateHeader", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/matrix/batterycanary/stats/ui/BatteryStatsActivity", "updateHeader", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((TextView) findViewById.findViewById(C0966R.C0970id.kyn)).setText(a.f343389d);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0966R.C0971layout.ci9);
        Toolbar toolbar = (Toolbar) findViewById(C0966R.C0970id.kqs);
        toolbar.setTitle((CharSequence) "电量统计报告");
        setSupportActionBar(toolbar);
        TextView textView = (TextView) findViewById(C0966R.C0970id.mi7);
        String b = C114559a.C114560a.f343346d.mo181110b();
        textView.setText(XVFSFile.PATH_SEPARATOR + b);
        C79691a.m96805b(C114572i.class, new C114576a(textView));
        RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.mhb);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        BatteryStatsAdapter batteryStatsAdapter = new BatteryStatsAdapter();
        recyclerView.setAdapter(batteryStatsAdapter);
        batteryStatsAdapter.registerAdapterDataObserver(new C114577b(linearLayoutManager));
        this.f343373d = new C114595c(batteryStatsAdapter);
        recyclerView.mo17043c(new C114578c(linearLayoutManager));
        C114595c cVar = this.f343373d;
        cVar.f343432e = b;
        cVar.f343431d = 0;
        cVar.f343430c.post(new C117080b(cVar));
        this.f343373d.mo173755b();
    }
}
