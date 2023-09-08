package com.tencent.p014mm.p136ui.chatting.gallery;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.p136ui.anim.transition.MMTransitionHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gj3.C59469a;
import gj3.C59474h;
import gy3.C87412m;
import ij3.C60331a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$s */
public class ImageGalleryUI$$s extends C59469a {

    /* renamed from: b */
    public final /* synthetic */ ImageGalleryUI f165092b;

    public ImageGalleryUI$$s(ImageGalleryUI imageGalleryUI) {
        this.f165092b = imageGalleryUI;
    }

    /* renamed from: b */
    public final void mo82039b(List<String> list, List<View> list2, List<View> list3) {
        if (list2 != null && list3 != null && list2.size() == list3.size()) {
            for (int i = 0; i < list2.size(); i++) {
                View view = list2.get(i);
                View view2 = list3.get(i);
                if ((view instanceof ImageView) && (view2 instanceof ImageView)) {
                    ImageView imageView = (ImageView) view;
                    ImageView imageView2 = (ImageView) view2;
                    if (imageView2.getDrawable() != null) {
                        imageView.setImageDrawable(imageView2.getDrawable());
                    }
                }
            }
        }
    }

    public void onMapSharedElements(List<String> list, Map<String, View> map) {
        C39623j lifecycle;
        Class cls = C59474h.class;
        if (!(list == null || map == null)) {
            list.clear();
            map.clear();
            ImageGalleryUI imageGalleryUI = this.f165092b;
            if (imageGalleryUI.f284397T0) {
                C59474h hVar = (C59474h) imageGalleryUI.component(cls);
                C59474h.f169945h.mo84575a(list, map, this.f165092b.f284450n.getSelectedView(), 9);
            }
        }
        String str = this.f169941a;
        Log.m105918d(str, "onMapSharedElements() begin filterExitNames called with: names = [" + list + "");
        if (((C59474h) this.f165092b.component(cls)).f169949g) {
            C59474h hVar2 = (C59474h) this.f165092b.component(cls);
            hVar2.getClass();
            MMTransitionHelper mMTransitionHelper = MMTransitionHelper.f165034a;
            AppCompatActivity activity = hVar2.getActivity();
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            int intExtra = activity.getIntent().getIntExtra("KEY_EXIT_ACTIVITY", 0);
            C59469a aVar = null;
            if (intExtra != 0) {
                Set<Map.Entry<Activity, MMTransitionHelper.C57657a>> entrySet = MMTransitionHelper.f165035b.entrySet();
                C87412m.m108593f(entrySet, "activityObserverMap.entries");
                Iterator<T> it = entrySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Activity) entry.getKey()).hashCode() == intExtra) {
                        Object key = entry.getKey();
                        AppCompatActivity appCompatActivity = key instanceof AppCompatActivity ? (AppCompatActivity) key : null;
                        C39623j.C39626c currentState = (appCompatActivity == null || (lifecycle = appCompatActivity.getLifecycle()) == null) ? null : lifecycle.getCurrentState();
                        C39623j lifecycle2 = activity.getLifecycle();
                        C39623j.C39626c currentState2 = lifecycle2 != null ? lifecycle2.getCurrentState() : null;
                        Log.m105918d("MM.Transition", "getExitActivityCallback() called " + entry.getKey().getClass().getSimpleName() + ' ' + currentState + ' ' + activity.getClass().getSimpleName() + ' ' + currentState2);
                        WeakReference<C59469a> weakReference = ((MMTransitionHelper.C57657a) entry.getValue()).f165040d;
                        if (weakReference != null) {
                            aVar = weakReference.get();
                        }
                    }
                }
            }
            if (aVar != null) {
                aVar.mo75852a(list, map);
            }
            for (Map.Entry next : map.entrySet()) {
                if (next.getValue() instanceof C60331a) {
                    ((C60331a) next.getValue()).mo82001j();
                }
            }
        }
        String str2 = this.f169941a;
        Log.m105918d(str2, "onMapSharedElements() after filterExitNames called with: names = [" + list + "");
        super.onMapSharedElements(list, map);
    }

    public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
        mo82039b(list, list2, list3);
        super.onSharedElementEnd(list, list2, list3);
    }

    public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
        mo82039b(list, list2, list3);
        super.onSharedElementStart(list, list2, list3);
    }
}
