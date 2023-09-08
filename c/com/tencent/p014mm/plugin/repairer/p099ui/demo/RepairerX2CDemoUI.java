package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.repairer.p099ui.BaseRepairerUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import wq3.C111849j;
import wq3.C111855q;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerX2CDemoUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerX2CDemoUI */
public final class RepairerX2CDemoUI extends BaseRepairerUI {

    /* renamed from: d */
    public final C111849j f20508d = C111855q.f334885a.mo163608b().mo163575c(C0966R.C0971layout.cpx);

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerX2CDemoUI$a */
    public static final class C5126a implements View.OnClickListener {

        /* renamed from: d */
        public static final C5126a f20509d = new C5126a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerX2CDemoUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            long c = C31543z5.m39453c();
            long c2 = C31543z5.m39453c();
            Log.m105924i("MicroMsg.Repairer.RepairerX2CDemoUI", "preload x2c resource cost: " + (c2 - c));
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerX2CDemoUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerX2CDemoUI$b */
    public static final class C5127b implements View.OnClickListener {

        /* renamed from: d */
        public static final C5127b f20510d = new C5127b();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerX2CDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            long c = C31543z5.m39453c();
            long c2 = C31543z5.m39453c();
            Log.m105924i("MicroMsg.Repairer.RepairerX2CDemoUI", "normal x2c resource cost: " + (c2 - c));
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerX2CDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerX2CDemoUI$c */
    public static final class C5128c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerX2CDemoUI f20511d;

        public C5128c(RepairerX2CDemoUI repairerX2CDemoUI) {
            this.f20511d = repairerX2CDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerX2CDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            long c = C31543z5.m39453c();
            LayoutInflater.from(this.f20511d.getContext()).inflate(C0966R.C0971layout.cpx, (ViewGroup) null);
            long c2 = C31543z5.m39453c();
            Log.m105924i("MicroMsg.Repairer.RepairerX2CDemoUI", "normal x2c resource cost: " + (c2 - c));
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerX2CDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerX2CDemoUI$d */
    public static final class C5129d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerX2CDemoUI f20512d;

        public C5129d(RepairerX2CDemoUI repairerX2CDemoUI) {
            this.f20512d = repairerX2CDemoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f20512d.finish();
            return false;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cpz;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((Button) findViewById(C0966R.C0970id.mgq)).setOnClickListener(C5126a.f20509d);
        ((Button) findViewById(C0966R.C0970id.me7)).setOnClickListener(C5127b.f20510d);
        ((Button) findViewById(C0966R.C0970id.mge)).setOnClickListener(new C5128c(this));
        setBackBtn(new C5129d(this));
    }
}
