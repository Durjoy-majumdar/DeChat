package cv0;

import android.view.View;
import com.tencent.p014mm.plugin.backup.backupmoveui.BackupMoveChooseUI;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;

public final /* synthetic */ class d$$e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12925w f57062d;

    public /* synthetic */ d$$e(C12925w wVar) {
        this.f57062d = wVar;
    }

    public final void onClick(View view) {
        C12925w wVar = this.f57062d;
        int i = BackupMoveChooseUI.f49974H;
        Object obj = new Object();
        ArrayList arrayList = new ArrayList();
        arrayList.add(wVar);
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
        wVar.mo5085n();
        C117292a.m165361g(new Object(), "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
