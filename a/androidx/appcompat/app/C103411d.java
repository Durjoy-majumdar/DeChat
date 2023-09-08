package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* renamed from: androidx.appcompat.app.d */
public class C103411d implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ AlertController f305068d;

    /* renamed from: e */
    public final /* synthetic */ AlertController.C103396b f305069e;

    public C103411d(AlertController.C103396b bVar, AlertController alertController) {
        this.f305069e = bVar;
        this.f305068d = alertController;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f305069e.f304986k.onClick(this.f305068d.f304948b, i);
        this.f305069e.getClass();
        this.f305068d.f304948b.dismiss();
    }
}
