package cv0;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

public class c$$b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f57050d;

    /* renamed from: e */
    public final /* synthetic */ C20365c f57051e;

    public c$$b(C20365c cVar, int i) {
        this.f57051e = cVar;
        this.f57050d = i;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f57051e.f57045e.contains(Integer.valueOf(this.f57050d))) {
            this.f57051e.f57045e.remove(Integer.valueOf(this.f57050d));
        } else {
            this.f57051e.f57045e.add(Integer.valueOf(this.f57050d));
        }
        this.f57051e.notifyDataSetChanged();
        C20365c cVar = this.f57051e;
        cVar.f57044d.mo22642R7(cVar.f57045e);
        C117292a.m165361g(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
