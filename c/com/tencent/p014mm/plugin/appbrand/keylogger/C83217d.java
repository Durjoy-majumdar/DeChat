package com.tencent.p014mm.plugin.appbrand.keylogger;

import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.keylogger.KeyStepAnalyserActivity;
import java.util.List;
import uo0.C90711c;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.d */
public class C83217d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f243062d;

    /* renamed from: e */
    public final /* synthetic */ KeyStepAnalyserActivity.C83208b f243063e;

    public C83217d(KeyStepAnalyserActivity.C83208b bVar, List list) {
        this.f243063e = bVar;
        this.f243062d = list;
    }

    public void run() {
        KeyStepAnalyserActivity keyStepAnalyserActivity = KeyStepAnalyserActivity.this;
        List<C90711c> list = this.f243062d;
        int i = KeyStepAnalyserActivity.f243013p;
        ListView listView = (ListView) keyStepAnalyserActivity.findViewById(C0966R.C0970id.foz);
        if (listView == null) {
            keyStepAnalyserActivity.finish();
            return;
        }
        KeyStepAnalyserActivity.C83209c cVar = new KeyStepAnalyserActivity.C83209c(keyStepAnalyserActivity);
        listView.setAdapter(cVar);
        listView.setOnItemClickListener(new C83219f(keyStepAnalyserActivity, cVar));
        cVar.f243026e = list;
        cVar.notifyDataSetChanged();
    }
}
