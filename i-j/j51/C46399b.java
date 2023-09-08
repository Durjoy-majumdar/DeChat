package j51;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.downloader_app.p039ui.BottomEntranceView;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import e51.C45547h;
import g51.C45880a;
import j20.C117292a;
import java.util.ArrayList;
import u41.C52427g;

/* renamed from: j51.b */
public class C46399b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BottomEntranceView f125002d;

    public C46399b(BottomEntranceView bottomEntranceView) {
        this.f125002d = bottomEntranceView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/downloader_app/ui/BottomEntranceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C52427g gVar = this.f125002d.f110413d;
        if (gVar != null && !Util.isNullOrNil(gVar.f146518e)) {
            Bundle bundle = new Bundle();
            bundle.putString("rawUrl", this.f125002d.f110413d.f146518e);
            ((C45547h) C86312j.m106911c(C45547h.class)).mo70790RH(this.f125002d.getContext(), bundle);
            C45880a.m51163b(10, 1005, 1, 40, "", "", "");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/downloader_app/ui/BottomEntranceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
