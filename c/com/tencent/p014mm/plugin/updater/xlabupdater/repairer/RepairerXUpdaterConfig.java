package com.tencent.p014mm.plugin.updater.xlabupdater.repairer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import b12.C79645d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86013q1;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import o13.C11329e;
import o13.C11342g;
import org.json.JSONArray;
import te3.rg4;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/updater/xlabupdater/repairer/RepairerXUpdaterConfig;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-updater_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.updater.xlabupdater.repairer.RepairerXUpdaterConfig */
public final class RepairerXUpdaterConfig extends MMSecDataActivity {

    /* renamed from: com.tencent.mm.plugin.updater.xlabupdater.repairer.RepairerXUpdaterConfig$a */
    public static final class C5677a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerXUpdaterConfig f21660d;

        public C5677a(RepairerXUpdaterConfig repairerXUpdaterConfig) {
            this.f21660d = repairerXUpdaterConfig;
        }

        public final void onClick(View view) {
            int i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/updater/xlabupdater/repairer/RepairerXUpdaterConfig$onCreate$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            try {
                i = Integer.parseInt(((EditText) this.f21660d.findViewById(C0966R.C0970id.o1o)).getText().toString());
            } catch (NumberFormatException unused) {
                i = 0;
            }
            MultiProcessMMKV.getMMKV("xupdate_repairer").putInt("REPAIRER_KEY_MOCK_ShowDialogIntervalTime", i);
            AppCompatActivity context = this.f21660d.getContext();
            Toast.makeText(context, "mock Success:" + i, 0).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/updater/xlabupdater/repairer/RepairerXUpdaterConfig$onCreate$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.updater.xlabupdater.repairer.RepairerXUpdaterConfig$b */
    public static final class C5678b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerXUpdaterConfig f21661d;

        public C5678b(RepairerXUpdaterConfig repairerXUpdaterConfig) {
            this.f21661d = repairerXUpdaterConfig;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/updater/xlabupdater/repairer/RepairerXUpdaterConfig$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C11329e.f33285a.getClass();
            C86013q1.m106447h(C79645d.m96736l(C11342g.f33303d.mo11368q().f259799g));
            MultiProcessMMKV.getMMKV("MMKV_NAME_FILE_NAME").clearAll();
            MultiProcessMMKV.getMMKV("MMKV_NAME_MEDIA_ID").clearAll();
            MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_STATUS").clearAll();
            MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_DOWNLOAD_PROGRESS").clearAll();
            MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_DIALOGINFO").clearAll();
            MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_MERGE_TRYTIME").clearAll();
            MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_LAST_SHOW_RED_DOT_TIME").clearAll();
            MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_HAS_SHOW_RED_DOT_TIMES").clearAll();
            MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_LAST_SHOW_DIALOG_TIME").clearAll();
            MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_HAS_SHOW_DIALOG_TIMES").clearAll();
            MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_IGNORE_NEWAPKMD5").clearAll();
            MultiProcessMMKV.getMMKV("MMKV_NAME_XUPDATE_COMM_KV").clearAll();
            C11342g.f33304e = "";
            C11342g.f33307h = new JSONArray();
            C11342g.f33310n = new rg4();
            Toast.makeText(this.f21661d.getContext(), "clear success", 0).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/updater/xlabupdater/repairer/RepairerXUpdaterConfig$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.updater.xlabupdater.repairer.RepairerXUpdaterConfig$c */
    public static final class C5679c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerXUpdaterConfig f21662d;

        public C5679c(RepairerXUpdaterConfig repairerXUpdaterConfig) {
            this.f21662d = repairerXUpdaterConfig;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/updater/xlabupdater/repairer/RepairerXUpdaterConfig$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MultiProcessMMKV.getMMKV("xupdate_repairer").putString("x_repairer_mockapkpath", "/data/local/tmp/xbase.apk");
            Toast.makeText(this.f21662d.getContext(), "mock path:/data/local/tmp/xbase.apk", 0).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/updater/xlabupdater/repairer/RepairerXUpdaterConfig$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.updater.xlabupdater.repairer.RepairerXUpdaterConfig$d */
    public static final class C5680d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerXUpdaterConfig f21663d;

        public C5680d(RepairerXUpdaterConfig repairerXUpdaterConfig) {
            this.f21663d = repairerXUpdaterConfig;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/updater/xlabupdater/repairer/RepairerXUpdaterConfig$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MultiProcessMMKV.getMMKV("xupdate_repairer").remove("x_repairer_mockapkpath");
            Toast.makeText(this.f21663d.getContext(), "disable success", 0).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/updater/xlabupdater/repairer/RepairerXUpdaterConfig$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.updater.xlabupdater.repairer.RepairerXUpdaterConfig$e */
    public static final class C5681e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerXUpdaterConfig f21664d;

        /* renamed from: com.tencent.mm.plugin.updater.xlabupdater.repairer.RepairerXUpdaterConfig$e$a */
        public static final class C5682a implements Runnable {

            /* renamed from: d */
            public static final C5682a f21665d = new C5682a();

            public final void run() {
                C11342g gVar = C11342g.f33303d;
                gVar.mo11366O(true, "Mock");
                gVar.mo11367d();
            }
        }

        public C5681e(RepairerXUpdaterConfig repairerXUpdaterConfig) {
            this.f21664d = repairerXUpdaterConfig;
        }

        public final void onClick(View view) {
            int i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/updater/xlabupdater/repairer/RepairerXUpdaterConfig$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            try {
                i = Integer.parseInt(((EditText) this.f21664d.findViewById(C0966R.C0970id.o1m)).getText().toString());
            } catch (NumberFormatException unused) {
                i = 0;
            }
            view.postDelayed(C5682a.f21665d, (long) i);
            Toast.makeText(this.f21664d.getContext(), "notify success", 0).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/updater/xlabupdater/repairer/RepairerXUpdaterConfig$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.updater.xlabupdater.repairer.RepairerXUpdaterConfig$f */
    public static final class C5683f implements MMSwitchBtn.C7041b {

        /* renamed from: a */
        public final /* synthetic */ RepairerXUpdaterConfig f21666a;

        public C5683f(RepairerXUpdaterConfig repairerXUpdaterConfig) {
            this.f21666a = repairerXUpdaterConfig;
        }

        public final void onStatusChange(boolean z) {
            MultiProcessMMKV.getMMKV("xupdate_repairer").putBoolean("REPAIRER_KEY_MOCK_DialogEnable", z);
            AppCompatActivity context = this.f21666a.getContext();
            StringBuilder sb = new StringBuilder();
            sb.append("mock ");
            sb.append(z ? "enable" : "disable");
            Toast.makeText(context, sb.toString(), 0).show();
        }
    }

    /* renamed from: com.tencent.mm.plugin.updater.xlabupdater.repairer.RepairerXUpdaterConfig$g */
    public static final class C5684g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerXUpdaterConfig f21667d;

        public C5684g(RepairerXUpdaterConfig repairerXUpdaterConfig) {
            this.f21667d = repairerXUpdaterConfig;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/updater/xlabupdater/repairer/RepairerXUpdaterConfig$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String obj = ((EditText) this.f21667d.findViewById(C0966R.C0970id.o1k)).getText().toString();
            MultiProcessMMKV.getMMKV("xupdate_repairer").putString("REPAIRER_KEY_MOCK_Json", obj);
            AppCompatActivity context = this.f21667d.getContext();
            Toast.makeText(context, "mock Success:" + obj, 0).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/updater/xlabupdater/repairer/RepairerXUpdaterConfig$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.updater.xlabupdater.repairer.RepairerXUpdaterConfig$h */
    public static final class C5685h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerXUpdaterConfig f21668d;

        public C5685h(RepairerXUpdaterConfig repairerXUpdaterConfig) {
            this.f21668d = repairerXUpdaterConfig;
        }

        public final void onClick(View view) {
            int i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/updater/xlabupdater/repairer/RepairerXUpdaterConfig$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            try {
                i = Integer.parseInt(((EditText) this.f21668d.findViewById(C0966R.C0970id.o1i)).getText().toString());
            } catch (NumberFormatException unused) {
                i = 0;
            }
            MultiProcessMMKV.getMMKV("xupdate_repairer").putInt("REPAIRER_KEY_MOCK_IsShowRedot", i);
            AppCompatActivity context = this.f21668d.getContext();
            Toast.makeText(context, "mock Success:" + i, 0).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/updater/xlabupdater/repairer/RepairerXUpdaterConfig$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.updater.xlabupdater.repairer.RepairerXUpdaterConfig$i */
    public static final class C5686i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerXUpdaterConfig f21669d;

        public C5686i(RepairerXUpdaterConfig repairerXUpdaterConfig) {
            this.f21669d = repairerXUpdaterConfig;
        }

        public final void onClick(View view) {
            int i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/updater/xlabupdater/repairer/RepairerXUpdaterConfig$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            try {
                i = Integer.parseInt(((EditText) this.f21669d.findViewById(C0966R.C0970id.o1g)).getText().toString());
            } catch (NumberFormatException unused) {
                i = 0;
            }
            MultiProcessMMKV.getMMKV("xupdate_repairer").putInt("REPAIRER_KEY_MOCK_IsShowDialog", i);
            AppCompatActivity context = this.f21669d.getContext();
            Toast.makeText(context, "mock Success:" + i, 0).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/updater/xlabupdater/repairer/RepairerXUpdaterConfig$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.updater.xlabupdater.repairer.RepairerXUpdaterConfig$j */
    public static final class C5687j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerXUpdaterConfig f21670d;

        public C5687j(RepairerXUpdaterConfig repairerXUpdaterConfig) {
            this.f21670d = repairerXUpdaterConfig;
        }

        public final void onClick(View view) {
            int i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/updater/xlabupdater/repairer/RepairerXUpdaterConfig$onCreate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            try {
                i = Integer.parseInt(((EditText) this.f21670d.findViewById(C0966R.C0970id.o1q)).getText().toString());
            } catch (NumberFormatException unused) {
                i = 0;
            }
            MultiProcessMMKV.getMMKV("xupdate_repairer").putInt("REPAIRER_KEY_MOCK_ShowDialogMaxTimes", i);
            AppCompatActivity context = this.f21670d.getContext();
            Toast.makeText(context, "mock Success:" + i, 0).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/updater/xlabupdater/repairer/RepairerXUpdaterConfig$onCreate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d6y;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("XUpdate Mock");
        ((Button) findViewById(C0966R.C0970id.apo)).setOnClickListener(new C5678b(this));
        ((Button) findViewById(C0966R.C0970id.dlc)).setOnClickListener(new C5679c(this));
        ((Button) findViewById(C0966R.C0970id.bm7)).setOnClickListener(new C5680d(this));
        ((Button) findViewById(C0966R.C0970id.o1l)).setOnClickListener(new C5681e(this));
        ((MMSwitchBtn) findViewById(C0966R.C0970id.o1e)).setCheck(MultiProcessMMKV.getMMKV("xupdate_repairer").getBoolean("REPAIRER_KEY_MOCK_DialogEnable", false));
        ((MMSwitchBtn) findViewById(C0966R.C0970id.o1e)).setSwitchListener(new C5683f(this));
        ((EditText) findViewById(C0966R.C0970id.o1k)).setText(MultiProcessMMKV.getMMKV("xupdate_repairer").getString("REPAIRER_KEY_MOCK_Json", ""));
        ((Button) findViewById(C0966R.C0970id.o1j)).setOnClickListener(new C5684g(this));
        ((EditText) findViewById(C0966R.C0970id.o1i)).setText(String.valueOf(MultiProcessMMKV.getMMKV("xupdate_repairer").getInt("REPAIRER_KEY_MOCK_IsShowRedot", 0)));
        ((Button) findViewById(C0966R.C0970id.o1h)).setOnClickListener(new C5685h(this));
        ((EditText) findViewById(C0966R.C0970id.o1g)).setText(String.valueOf(MultiProcessMMKV.getMMKV("xupdate_repairer").getInt("REPAIRER_KEY_MOCK_IsShowDialog", 0)));
        ((Button) findViewById(C0966R.C0970id.o1f)).setOnClickListener(new C5686i(this));
        ((EditText) findViewById(C0966R.C0970id.o1q)).setText(String.valueOf(MultiProcessMMKV.getMMKV("xupdate_repairer").getInt("REPAIRER_KEY_MOCK_ShowDialogMaxTimes", 0)));
        ((Button) findViewById(C0966R.C0970id.o1p)).setOnClickListener(new C5687j(this));
        ((EditText) findViewById(C0966R.C0970id.o1o)).setText(String.valueOf(MultiProcessMMKV.getMMKV("xupdate_repairer").getInt("REPAIRER_KEY_MOCK_ShowDialogIntervalTime", 0)));
        ((Button) findViewById(C0966R.C0970id.o1n)).setOnClickListener(new C5677a(this));
    }
}
