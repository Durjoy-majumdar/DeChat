package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bj2.C0297z;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.repairer.p099ui.BaseRepairerUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import j20.C117292a;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import m13.C88689b;
import p271xn.C15865p;
import p271xn.C91296j;
import p910lj.C76701a;
import qo3.C77398g;
import te3.rg4;
import tw0.C90585h;
import w02.C90879c;
import w02.C90882e;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerPatchDemoUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI */
public final class RepairerPatchDemoUI extends BaseRepairerUI {

    /* renamed from: d */
    public final String f20476d = "MicroMsg.RepairerPatchDemoUI";

    /* renamed from: e */
    public String f20477e = "/storage/emulated/0/Android/data/com.tencent.mm/MicroMsg/Download/1/old.apk";

    /* renamed from: f */
    public String f20478f = "/data/data/com.tencent.mm/MicroMsg/WebNetFile/12637862876476128361873";

    /* renamed from: g */
    public String f20479g = "/storage/emulated/0/Android/data/com.tencent.mm/MicroMsg/Download/hdiff/newapkmd5.apk";

    /* renamed from: h */
    public C77398g f20480h;

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI$a */
    public static final class C5108a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerPatchDemoUI f20481d;

        public C5108a(RepairerPatchDemoUI repairerPatchDemoUI) {
            this.f20481d = repairerPatchDemoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f20481d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI$b */
    public static final class C5109b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerPatchDemoUI f20482d;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI$b$a */
        public static final class C5110a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ RepairerPatchDemoUI f20483d;

            public C5110a(RepairerPatchDemoUI repairerPatchDemoUI) {
                this.f20483d = repairerPatchDemoUI;
            }

            public final void run() {
                Class cls = C91296j.class;
                Log.m105918d(this.f20483d.f20476d, "command checkout update.");
                C90585h me02 = ((C91296j) C86312j.m106911c(cls)).me0();
                me02.mo118344c(true);
                me02.mo118349g("12354");
                ((C90882e) ((C90879c) ((C91296j) C86312j.m106911c(cls)).mo125096SF(MMApplicationContext.getContext())).f260860b).mo124981a("/storage/emulated/0/Android/data/com.tencent.mm/MicroMsg/WebNetFile/tmp_test.patch", me02, false);
                String e = me02.mo118347e();
                Log.m105925i(this.f20483d.f20476d, "newApkMd5 = %s", e);
            }
        }

        public C5109b(RepairerPatchDemoUI repairerPatchDemoUI) {
            this.f20482d = repairerPatchDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerPatchDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C119157j) C119157j.f356862d).mo183876g(new C5110a(this.f20482d), "Updater");
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerPatchDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI$c */
    public static final class C5111c implements View.OnClickListener {

        /* renamed from: d */
        public static final C5111c f20484d = new C5111c();

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI$c$a */
        public static final class C5112a implements Runnable {

            /* renamed from: d */
            public static final C5112a f20485d = new C5112a();

            public final void run() {
                ((C91296j) C86312j.m106911c(C91296j.class)).ox0();
            }
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerPatchDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C86709a0.m107525e().postToWorker(C5112a.f20485d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerPatchDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI$d */
    public static final class C5113d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerPatchDemoUI f20486d;

        public C5113d(RepairerPatchDemoUI repairerPatchDemoUI) {
            this.f20486d = repairerPatchDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerPatchDemoUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76701a.makeText((Context) this.f20486d, (CharSequence) "触发自动更新的逻辑", 1).show();
            ((C91296j) C86312j.m106911c(C91296j.class)).mo125100qJ(new String[3]);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerPatchDemoUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI$e */
    public static final class C5114e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerPatchDemoUI f20487d;

        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI$e$a */
        public static final class C5115a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ RepairerPatchDemoUI f20488d;

            public C5115a(RepairerPatchDemoUI repairerPatchDemoUI) {
                this.f20488d = repairerPatchDemoUI;
            }

            public final void run() {
                Class cls = C15865p.class;
                rg4 x602 = ((C15865p) C86312j.m106911c(cls)).x60();
                if (x602 == null) {
                    this.f20488d.getClass();
                    C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "更新数据为空，dialog = null", 1).show();
                    Log.m105924i(this.f20488d.f20476d, "have tinker update dialogInfo is null.");
                } else if (((C15865p) C86312j.m106911c(cls)).Rs0()) {
                    RepairerPatchDemoUI repairerPatchDemoUI = this.f20488d;
                    repairerPatchDemoUI.getClass();
                    ((C119157j) C119157j.f356862d).mo183875f(new C0297z(repairerPatchDemoUI, x602));
                    Log.m105924i(this.f20488d.f20476d, "have tinker update.");
                } else {
                    String str = this.f20488d.f20476d;
                    Log.m105924i(str, "have tinker UpdateUtil.isNeedShowTinkerDialog() = " + ((C15865p) C86312j.m106911c(cls)).Rs0());
                }
            }
        }

        public C5114e(RepairerPatchDemoUI repairerPatchDemoUI) {
            this.f20487d = repairerPatchDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerPatchDemoUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76701a.makeText((Context) this.f20487d, (CharSequence) "触发手动安装弹窗", 1).show();
            MMHandlerThread.postToMainThreadDelayed(new C5115a(this.f20487d), 100);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerPatchDemoUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI$f */
    public static final class C5116f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerPatchDemoUI f20489d;

        public C5116f(RepairerPatchDemoUI repairerPatchDemoUI) {
            this.f20489d = repairerPatchDemoUI;
        }

        public final void onClick(View view) {
            Class cls = C88689b.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerPatchDemoUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76701a.makeText((Context) this.f20489d, (CharSequence) "触发手动更新", 1).show();
            if (((C88689b) C86312j.m106911c(cls)).mo122748eJ()) {
                ((C88689b) C86312j.m106911c(cls)).mo122753gD(2, this.f20489d);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerPatchDemoUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI$g */
    public static final class C5117g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerPatchDemoUI f20490d;

        public C5117g(RepairerPatchDemoUI repairerPatchDemoUI) {
            this.f20490d = repairerPatchDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerPatchDemoUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76701a.makeText((Context) this.f20490d, (CharSequence) (!SharePatchFileUtil.deleteDir(new File(((C15865p) C86312j.m106911c(C15865p.class)).mo14312BF())) || !SharePatchFileUtil.deleteDir(new File("/data/data/com.tencent.mm/MicroMsg/WebNetFile/"))) ? "删除失败" : "删除成功", 1).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerPatchDemoUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bsa;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C32735h.class;
        super.onCreate(bundle);
        setMMTitle("MMDiff-Demo");
        setBackBtn(new C5108a(this));
        ((TextView) findViewById(C0966R.C0970id.hlp)).setText(this.f20477e);
        ((TextView) findViewById(C0966R.C0970id.hrp)).setText(this.f20478f);
        ((TextView) findViewById(C0966R.C0970id.hf9)).setText(this.f20479g);
        ((Button) findViewById(C0966R.C0970id.hll)).setOnClickListener(new C5109b(this));
        ((Button) findViewById(C0966R.C0970id.idc)).setOnClickListener(C5111c.f20484d);
        ((TextView) findViewById(C0966R.C0970id.mwp)).setText("x 实验，mmdiff patch： " + ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_mmdiff_patch_pkg_update_params, "") + "\n\nx 实验， 红点数据： " + ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_full_pkg_update_default_params, "") + "\n\n集成测试，维修厂数据: " + C79758p.f233760a.mo109884g(C104160f.RepairerConfig_Updater_MMdiffCgi_String, ""));
        ((Button) findViewById(C0966R.C0970id.a19)).setOnClickListener(new C5113d(this));
        ((Button) findViewById(C0966R.C0970id.a1_)).setOnClickListener(new C5114e(this));
        ((Button) findViewById(C0966R.C0970id.c8p)).setOnClickListener(new C5116f(this));
        ((Button) findViewById(C0966R.C0970id.bde)).setOnClickListener(new C5117g(this));
    }
}
