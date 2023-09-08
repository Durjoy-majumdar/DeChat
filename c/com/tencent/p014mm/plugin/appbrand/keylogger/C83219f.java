package com.tencent.p014mm.plugin.appbrand.keylogger;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import uo0.C90711c;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.f */
public class C83219f implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ KeyStepAnalyserActivity.C83209c f243065d;

    /* renamed from: e */
    public final /* synthetic */ KeyStepAnalyserActivity f243066e;

    public C83219f(KeyStepAnalyserActivity keyStepAnalyserActivity, KeyStepAnalyserActivity.C83209c cVar) {
        this.f243066e = keyStepAnalyserActivity;
        this.f243065d = cVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserActivity$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        KeyStepAnalyserActivity keyStepAnalyserActivity = this.f243066e;
        C90711c cVar = this.f243065d.f243026e.get(i);
        int i2 = KeyStepAnalyserActivity.f243013p;
        keyStepAnalyserActivity.getClass();
        Intent intent = new Intent();
        intent.setClass(keyStepAnalyserActivity, KeyStepAnalyserDetailActivity.class);
        intent.putExtra("steps", cVar.f260540a);
        intent.putExtra("key_info", cVar.f260541b.toString());
        intent.putExtra("key_process_class", keyStepAnalyserActivity.f243017h);
        intent.putExtra("key_process_category", keyStepAnalyserActivity.f243018i);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        KeyStepAnalyserActivity keyStepAnalyserActivity2 = keyStepAnalyserActivity;
        C117292a.m165358d(keyStepAnalyserActivity2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserActivity", "goToDetail", "(Lcom/tencent/mm/plugin/appbrand/keylogger/base/IKeyStepAnalyser$ProcessLogInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        keyStepAnalyserActivity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(keyStepAnalyserActivity2, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserActivity", "goToDetail", "(Lcom/tencent/mm/plugin/appbrand/keylogger/base/IKeyStepAnalyser$ProcessLogInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserActivity$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
