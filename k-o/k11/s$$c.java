package k11;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

public final /* synthetic */ class s$$c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C99085s f290469d;

    /* renamed from: e */
    public final /* synthetic */ int f290470e;

    public /* synthetic */ s$$c(C99085s sVar, int i) {
        this.f290469d = sVar;
        this.f290470e = i;
    }

    public final void onClick(View view) {
        C99085s sVar = this.f290469d;
        int i = this.f290470e;
        sVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", sVar, array);
        Log.m105925i("MicroMsg.CleanChattingDetailAdapter", "select position=%d", Integer.valueOf(i));
        if (!sVar.f290454d.remove(Integer.valueOf(i))) {
            sVar.f290454d.add(Integer.valueOf(i));
        }
        sVar.mo138425a();
        sVar.notifyDataSetChanged();
        C117292a.m165361g(sVar, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
