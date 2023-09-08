package vd3;

import android.view.View;
import com.tencent.p014mm.pluginsdk.model.C19441d1;
import com.tencent.p014mm.pluginsdk.model.C19444f1;
import gy3.C8480h;
import j20.C117292a;
import java.util.ArrayList;
import p407zo.C23547h;

/* renamed from: vd3.k */
public final class C78403k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ View f229732d;

    /* renamed from: e */
    public final /* synthetic */ C78401j f229733e;

    public C78403k(View view, C78401j jVar) {
        this.f229732d = view;
        this.f229733e = jVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/BottomBar$initView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C19444f1.m20778r(this.f229732d.getContext(), this.f229733e.getFilePath(), this.f229733e.getFileName(), this.f229733e.getFileExt(), this.f229733e.getContextId(), "FROM_SCENE_BOTTOM_BAR", this.f229733e.getFileMd5());
        C19441d1.m20769a(this.f229733e.getContextId(), this.f229733e.getFileExt(), this.f229733e.getFileMd5(), 52, new C23547h.C23548a(true, (String) null, (String) null, (String) null, false, false, 62, (C8480h) null).mo37002a());
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/BottomBar$initView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
