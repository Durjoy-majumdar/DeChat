package cf1;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: cf1.a */
public final class C67357a implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ Button f193217d;

    /* renamed from: e */
    public final /* synthetic */ FinderLiveFixRatioPhoneEditPluginLayout f193218e;

    public C67357a(Button button, FinderLiveFixRatioPhoneEditPluginLayout finderLiveFixRatioPhoneEditPluginLayout) {
        this.f193217d = button;
        this.f193218e = finderLiveFixRatioPhoneEditPluginLayout;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        Log.m105924i("MicroMsg.EditPhotoPluginLayout", "action " + motionEvent.getAction());
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            this.f193217d.setVisibility(0);
        }
        FinderLiveFixRatioPhoneEditPluginLayout finderLiveFixRatioPhoneEditPluginLayout = this.f193218e;
        FinderLiveFixRatioPhoneEditPluginLayout.C105252a aVar = FinderLiveFixRatioPhoneEditPluginLayout.f312705x;
        boolean onTouchEvent = finderLiveFixRatioPhoneEditPluginLayout.onTouchEvent(motionEvent);
        C117292a.m165362h(onTouchEvent, this, "com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }
}
