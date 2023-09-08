package ve1;

import android.view.View;
import cm1.C55032t1;
import com.tencent.p014mm.autogen.events.FeedDeleteEvent;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import wp1.C15585f;

/* renamed from: ve1.g7 */
public final class C65598g7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C55032t1 f188760d;

    public C65598g7(C55032t1 t1Var) {
        this.f188760d = t1Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderProfileMusicConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderItem finderItem = this.f188760d.f154491d;
        C15585f.C15586a aVar = C15585f.f42211a;
        aVar.mo14341d(finderItem.getLocalId());
        aVar.mo14340c(finderItem.getLocalId());
        FeedDeleteEvent feedDeleteEvent = new FeedDeleteEvent();
        feedDeleteEvent.f9154d.f9156b = finderItem.getLocalId();
        feedDeleteEvent.publish();
        Log.m105924i("Finder.ProfileMusicConvert", "deleteItem by localId " + finderItem.getLocalId());
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderProfileMusicConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
