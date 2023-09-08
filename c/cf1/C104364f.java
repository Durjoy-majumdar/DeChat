package cf1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: cf1.f */
public final class C104364f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveFixRatioPhoneEditPluginLayout f309012d;

    public C104364f(FinderLiveFixRatioPhoneEditPluginLayout finderLiveFixRatioPhoneEditPluginLayout) {
        this.f309012d = finderLiveFixRatioPhoneEditPluginLayout;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderLiveFixRatioPhoneEditPluginLayout finderLiveFixRatioPhoneEditPluginLayout = this.f309012d;
        FinderLiveFixRatioPhoneEditPluginLayout.C105252a aVar = FinderLiveFixRatioPhoneEditPluginLayout.f312705x;
        finderLiveFixRatioPhoneEditPluginLayout.getPhotoControlUI().f327433i.performClick();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
