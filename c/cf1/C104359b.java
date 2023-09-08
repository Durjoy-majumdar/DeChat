package cf1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: cf1.b */
public final class C104359b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveFixRatioPhoneEditPluginLayout f309006d;

    public C104359b(FinderLiveFixRatioPhoneEditPluginLayout finderLiveFixRatioPhoneEditPluginLayout) {
        this.f309006d = finderLiveFixRatioPhoneEditPluginLayout;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderLiveFixRatioPhoneEditPluginLayout finderLiveFixRatioPhoneEditPluginLayout = this.f309006d;
        FinderLiveFixRatioPhoneEditPluginLayout.C105252a aVar = FinderLiveFixRatioPhoneEditPluginLayout.f312705x;
        finderLiveFixRatioPhoneEditPluginLayout.getPhotoControlUI().f327432h.performClick();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
