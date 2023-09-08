package com.tencent.p014mm.plugin.setting.p102ui.fixtools;

import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.MenuItem;
import android.view.View;
import bn2.C0332d;
import bn2.C0334e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import kotlin.Metadata;
import nj3.C76879j;
import nj3.C88989a;
import qo3.C89779i0;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI;", "Lcom/tencent/mm/ui/MMWizardActivity;", "<init>", "()V", "plugin-setting_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
/* renamed from: com.tencent.mm.plugin.setting.ui.fixtools.FixToolsFileListUI */
public final class FixToolsFileListUI extends MMWizardActivity {

    /* renamed from: e */
    public static final /* synthetic */ int f20614e = 0;

    /* renamed from: com.tencent.mm.plugin.setting.ui.fixtools.FixToolsFileListUI$a */
    public static final class C5178a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FixToolsFileListUI f20615d;

        public C5178a(FixToolsFileListUI fixToolsFileListUI) {
            this.f20615d = fixToolsFileListUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C88144b.m109791i(this.f20615d, "clean", ".ui.CleanUI", new Intent().putExtra("verbose", true), (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.fixtools.FixToolsFileListUI$b */
    public static final class C5179b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FixToolsFileListUI f20616d;

        public C5179b(FixToolsFileListUI fixToolsFileListUI) {
            this.f20616d = fixToolsFileListUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(this.f20616d, FixToolsUplogUI.class);
            intent.putExtra("entry_fix_tools_uplog", 9);
            MMWizardActivity.m7017L7(this.f20616d, intent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.fixtools.FixToolsFileListUI$c */
    public static final class C5180c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FixToolsFileListUI f20617d;

        public C5180c(FixToolsFileListUI fixToolsFileListUI) {
            this.f20617d = fixToolsFileListUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FixToolsFileListUI fixToolsFileListUI = this.f20617d;
            int i = FixToolsFileListUI.f20614e;
            fixToolsFileListUI.getClass();
            CancellationSignal cancellationSignal = new CancellationSignal();
            C89779i0 Q = C76879j.m92723Q(fixToolsFileListUI, fixToolsFileListUI.getString(C0966R.string.a3h), fixToolsFileListUI.getString(C0966R.string.a4d), true, true, new C0334e(cancellationSignal));
            ((C119157j) C119157j.f356862d).mo183870a(new C0332d(cancellationSignal, Q, fixToolsFileListUI));
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsFileListUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.fixtools.FixToolsFileListUI$d */
    public static final class C5181d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FixToolsFileListUI f20618d;

        public C5181d(FixToolsFileListUI fixToolsFileListUI) {
            this.f20618d = fixToolsFileListUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f20618d.finish();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7197wk;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.f8166qk);
        View findViewById = findViewById(C0966R.C0970id.ols);
        View findViewById2 = findViewById(C0966R.C0970id.k0c);
        View findViewById3 = findViewById(C0966R.C0970id.olt);
        findViewById.setOnClickListener(new C5178a(this));
        findViewById3.setOnClickListener(new C5179b(this));
        findViewById2.setOnClickListener(new C5180c(this));
        setBackBtn(new C5181d(this));
    }
}
