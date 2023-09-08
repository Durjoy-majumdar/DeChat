package cf1;

import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: cf1.e */
public final class C104363e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveFixRatioPhoneEditPluginLayout f309010d;

    /* renamed from: e */
    public final /* synthetic */ Button f309011e;

    public C104363e(FinderLiveFixRatioPhoneEditPluginLayout finderLiveFixRatioPhoneEditPluginLayout, Button button) {
        this.f309010d = finderLiveFixRatioPhoneEditPluginLayout;
        this.f309011e = button;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderLiveFixRatioPhoneEditPluginLayout finderLiveFixRatioPhoneEditPluginLayout = this.f309010d;
        FinderLiveFixRatioPhoneEditPluginLayout.C105252a aVar = FinderLiveFixRatioPhoneEditPluginLayout.f312705x;
        finderLiveFixRatioPhoneEditPluginLayout.getPhotoControlUI().f327434j.performClick();
        this.f309011e.setVisibility(4);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
