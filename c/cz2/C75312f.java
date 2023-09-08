package cz2;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: cz2.f */
public final class C75312f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C75314h f221466d;

    public C75312f(C75314h hVar) {
        this.f221466d = hVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C75314h hVar = this.f221466d;
        hVar.getClass();
        Log.m105924i("MicroMsg.TextStatus.DoWhatCustomStatusConvert", "cancel: ");
        hVar.f221468f.mo98436a("ACTION_ENTER");
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
