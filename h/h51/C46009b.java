package h51;

import android.os.Bundle;
import android.view.View;
import di3.C86312j;
import e51.C45547h;
import h51.C46004a;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: h51.b */
public class C46009b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C46012e f124075d;

    /* renamed from: e */
    public final /* synthetic */ C46004a.C46005a f124076e;

    public C46009b(C46004a.C46005a aVar, C46012e eVar) {
        this.f124076e = aVar;
        this.f124075d = eVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Bundle bundle = new Bundle();
        bundle.putString("rawUrl", this.f124075d.f124094n);
        ((C45547h) C86312j.m106911c(C45547h.class)).mo70790RH(C46004a.this.f124052d, bundle);
        C117292a.m165361g(this, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
