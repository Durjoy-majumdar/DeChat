package com.tencent.p014mm.plugin.setting.p102ui.fixtools;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import bn2.C67297i;
import bn2.C67298j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.widget.picker.C19877i;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.p136ui.widget.picker.CustomOptionPickNew;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import nj3.C88989a;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI */
public class FixToolsUplogUI extends MMWizardActivity {

    /* renamed from: s */
    public static String f205602s = null;

    /* renamed from: t */
    public static String f205603t = "00:00";

    /* renamed from: u */
    public static String f205604u = "24:00";

    /* renamed from: e */
    public Button f205605e;

    /* renamed from: f */
    public LinearLayout f205606f;

    /* renamed from: g */
    public LinearLayout f205607g;

    /* renamed from: h */
    public LinearLayout f205608h;

    /* renamed from: i */
    public TextView f205609i;

    /* renamed from: j */
    public TextView f205610j;

    /* renamed from: n */
    public TextView f205611n;

    /* renamed from: o */
    public SimpleDateFormat f205612o = new SimpleDateFormat("yyyy.MM.dd");

    /* renamed from: p */
    public SimpleDateFormat f205613p = new SimpleDateFormat("yyyyMMdd");

    /* renamed from: q */
    public final ArrayList<String> f205614q = new ArrayList<>();

    /* renamed from: r */
    public final ArrayList<String> f205615r = new ArrayList<>();

    /* renamed from: com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI$a */
    public class C71037a implements View.OnClickListener {
        public C71037a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUplogUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C115669n.INSTANCE.idkeyStat(873, 16, 1, false);
            Intent intent = new Intent(FixToolsUplogUI.this.getContext(), FixToolsUpLogUploadingUI.class);
            intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_DATE, FixToolsUplogUI.f205602s);
            intent.putExtra("begin_hour", FixToolsUplogUI.f205603t);
            intent.putExtra("end_hour", FixToolsUplogUI.f205604u);
            MMWizardActivity.m7017L7(FixToolsUplogUI.this, intent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUplogUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI$b */
    public class C71038b implements View.OnClickListener {
        public C71038b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUplogUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FixToolsUplogUI fixToolsUplogUI = FixToolsUplogUI.this;
            String str = FixToolsUplogUI.f205602s;
            fixToolsUplogUI.getClass();
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            long nowMilliSecond = ((Util.nowMilliSecond() / 86400000) * 86400000) + 57600000;
            long j = nowMilliSecond - 1;
            long j2 = nowMilliSecond - 691200000;
            if (j2 <= 0) {
                j2 = 0;
            }
            instance.setTimeInMillis(j2);
            instance2.setTimeInMillis(j);
            C19877i iVar = new C19877i(fixToolsUplogUI.getContext());
            iVar.f56638o = new C67297i(fixToolsUplogUI, j);
            iVar.mo26533c(instance2.get(1), instance2.get(2) + 1, instance2.get(5));
            iVar.mo26535e(instance.get(1), instance.get(2) + 1, instance.get(5));
            iVar.mo26534d(instance2.get(1), instance2.get(2) + 1, instance2.get(5));
            iVar.mo26536f();
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUplogUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI$c */
    public class C71039c implements View.OnClickListener {
        public C71039c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUplogUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FixToolsUplogUI.m83512N7(FixToolsUplogUI.this, true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUplogUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI$d */
    public class C71040d implements View.OnClickListener {
        public C71040d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUplogUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FixToolsUplogUI.m83512N7(FixToolsUplogUI.this, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUplogUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI$e */
    public class C71041e implements MenuItem.OnMenuItemClickListener {
        public C71041e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            FixToolsUplogUI.this.finish();
            return true;
        }
    }

    public FixToolsUplogUI() {
        for (int i = 0; i <= 24; i++) {
            String format = String.format("%02d:00", new Object[]{Integer.valueOf(i)});
            this.f205614q.add(format);
            this.f205615r.add(format);
        }
        this.f205614q.remove(24);
        this.f205615r.remove(0);
    }

    /* renamed from: N7 */
    public static void m83512N7(FixToolsUplogUI fixToolsUplogUI, boolean z) {
        C7045j jVar = new C7045j((Context) fixToolsUplogUI.getContext(), z ? fixToolsUplogUI.f205614q : fixToolsUplogUI.f205615r);
        jVar.f24869t = new C67298j(fixToolsUplogUI, z, jVar);
        if (z) {
            int indexOf = fixToolsUplogUI.f205614q.indexOf(f205603t);
            CustomOptionPickNew customOptionPickNew = jVar.f24866q;
            if (customOptionPickNew != null) {
                customOptionPickNew.setValue(indexOf);
                jVar.f24866q.mo26473c(indexOf);
            }
        } else {
            int indexOf2 = fixToolsUplogUI.f205615r.indexOf(f205604u);
            CustomOptionPickNew customOptionPickNew2 = jVar.f24866q;
            if (customOptionPickNew2 != null) {
                customOptionPickNew2.setValue(indexOf2);
                jVar.f24866q.mo26473c(indexOf2);
            }
        }
        jVar.mo8109l();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.arn;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.f360803ev2);
        this.f205605e = (Button) findViewById(C0966R.C0970id.e_h);
        this.f205606f = (LinearLayout) findViewById(C0966R.C0970id.bb6);
        this.f205607g = (LinearLayout) findViewById(C0966R.C0970id.l6l);
        this.f205608h = (LinearLayout) findViewById(C0966R.C0970id.ma6);
        this.f205609i = (TextView) findViewById(C0966R.C0970id.e_c);
        this.f205610j = (TextView) findViewById(C0966R.C0970id.nfg);
        this.f205611n = (TextView) findViewById(C0966R.C0970id.nfh);
        this.f205609i.setText(this.f205612o.format(new Date()));
        this.f205610j.setText(f205603t);
        this.f205611n.setText(f205604u);
        f205602s = this.f205613p.format(new Date());
        this.f205605e.setOnClickListener(new C71037a());
        this.f205606f.setOnClickListener(new C71038b());
        this.f205607g.setOnClickListener(new C71039c());
        this.f205608h.setOnClickListener(new C71040d());
        setBackBtn(new C71041e());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().getExtras().getBoolean("MMWizardActivity.WIZARD_ROOT_KILLSELF", false)) {
            int intExtra = getIntent().getIntExtra("entry_fix_tools_uplog", 5);
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(873, (long) intExtra, 1, false);
            nVar.idkeyStat(873, 8, 1, false);
            initView();
        }
    }
}
