package cv0;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

public final /* synthetic */ class c$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C20365c f57048d;

    /* renamed from: e */
    public final /* synthetic */ int f57049e;

    public /* synthetic */ c$$a(C20365c cVar, int i) {
        this.f57048d = cVar;
        this.f57049e = i;
    }

    public final void onClick(View view) {
        C20365c cVar = this.f57048d;
        int i = this.f57049e;
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cVar, array);
        if (cVar.f57045e.contains(Integer.valueOf(i))) {
            cVar.f57045e.remove(Integer.valueOf(i));
        } else {
            cVar.f57045e.add(Integer.valueOf(i));
        }
        cVar.notifyDataSetChanged();
        cVar.f57044d.mo22642R7(cVar.f57045e);
        C117292a.m165361g(cVar, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
