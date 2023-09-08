package com.tencent.p014mm.plugin.setting.p102ui.setting.repairer;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import fn2.C8172a;
import fn2.C8173b;
import fn2.C8174c;
import fn2.C8175d;
import gy3.C87412m;
import in2.C9205a;
import in2.C9208d;
import in2.C9212e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Metadata;
import p200lx.C10660k0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/repairer/RepairerQrCodeDemoUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-setting_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.repairer.RepairerQrCodeDemoUI */
public final class RepairerQrCodeDemoUI extends MMSecDataActivity {

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.repairer.RepairerQrCodeDemoUI$a */
    public static final class C5399a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerQrCodeDemoUI f21086d;

        public C5399a(RepairerQrCodeDemoUI repairerQrCodeDemoUI) {
            this.f21086d = repairerQrCodeDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/repairer/RepairerQrCodeDemoUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String obj = ((EditText) this.f21086d.findViewById(C0966R.C0970id.o5u)).getText().toString();
            long currentTimeMillis = System.currentTimeMillis();
            Bitmap yp = ((C10660k0) C86312j.m106911c(C10660k0.class)).mo10927yp(obj, 2);
            if (yp == null) {
                Toast.makeText(this.f21086d.getContext(), "bitmap null", 0).show();
                C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/repairer/RepairerQrCodeDemoUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            AppCompatActivity context = this.f21086d.getContext();
            Toast.makeText(context, "success cost time " + (System.currentTimeMillis() - currentTimeMillis), 0).show();
            ((ImageView) this.f21086d.findViewById(C0966R.C0970id.o5n)).setImageBitmap(yp);
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/repairer/RepairerQrCodeDemoUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.repairer.RepairerQrCodeDemoUI$b */
    public static final class C5400b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerQrCodeDemoUI f21087d;

        public C5400b(RepairerQrCodeDemoUI repairerQrCodeDemoUI) {
            this.f21087d = repairerQrCodeDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/repairer/RepairerQrCodeDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int[] o002 = ((C10660k0) C86312j.m106911c(C10660k0.class)).o00(BitmapUtil.createColorBitmap(MMApplicationContext.getColor(C0966R.color.f2955ab), 200, 200));
            int i = -16777216;
            ((TextView) this.f21087d.findViewById(C0966R.C0970id.o5o)).setTextColor(o002 != null ? o002[0] : -16777216);
            TextView textView = (TextView) this.f21087d.findViewById(C0966R.C0970id.o5p);
            if (o002 != null) {
                i = o002[1];
            }
            textView.setTextColor(i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/repairer/RepairerQrCodeDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d8i;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        findViewById(C0966R.C0970id.nsv).setOnClickListener(new C5399a(this));
        findViewById(C0966R.C0970id.o8e).setOnClickListener(new C5400b(this));
        C39622i0 a = C39818r.f106831a.mo62444c(this).mo75002a(C9208d.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…stControlUIC::class.java)");
        C9208d dVar = (C9208d) a;
        C9205a aVar = new C9205a("a");
        C8175d dVar2 = new C8175d("s1");
        dVar2.mo9231d("Switch 1");
        aVar.mo10010b(dVar2);
        C8175d dVar3 = new C8175d("s2");
        dVar3.mo9231d("Switch 2");
        aVar.mo10010b(dVar3);
        dVar.mo10014g3(aVar);
        C9205a aVar2 = new C9205a("b");
        C8175d dVar4 = new C8175d("s3");
        dVar4.mo9231d("Switch 3");
        aVar2.mo10010b(dVar4);
        dVar.mo10014g3(aVar2);
        C9205a aVar3 = new C9205a("c");
        C8175d dVar5 = new C8175d("s4");
        dVar5.mo9231d("Switch 4");
        aVar3.mo10010b(dVar5);
        dVar.mo10014g3(aVar3);
        C9212e i3 = dVar.mo10015i3("s1");
        C87412m.m108592e(i3, "null cannot be cast to non-null type com.tencent.mm.plugin.setting.ui.setting.repairer.SwitchItem");
        C8175d dVar6 = (C8175d) i3;
        dVar6.f27070h = new C8172a(dVar);
        dVar6.mo9232e();
        C9212e i35 = dVar.mo10015i3("s2");
        C87412m.m108592e(i35, "null cannot be cast to non-null type com.tencent.mm.plugin.setting.ui.setting.repairer.SwitchItem");
        C8175d dVar7 = (C8175d) i35;
        dVar7.f27070h = new C8173b(dVar);
        dVar7.mo9232e();
        C9212e i36 = dVar.mo10015i3("s3");
        C87412m.m108592e(i36, "null cannot be cast to non-null type com.tencent.mm.plugin.setting.ui.setting.repairer.SwitchItem");
        C8175d dVar8 = (C8175d) i36;
        dVar8.f27070h = new C8174c(dVar);
        dVar8.mo9232e();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C9208d.class);
    }
}
