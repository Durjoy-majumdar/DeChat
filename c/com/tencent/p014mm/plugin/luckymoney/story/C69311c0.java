package com.tencent.p014mm.plugin.luckymoney.story;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.luckymoney.story.EnvelopeStoryVideoManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.c0 */
public class C69311c0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ EnvelopeStoryVideoManager f199581d;

    public C69311c0(EnvelopeStoryVideoManager envelopeStoryVideoManager) {
        this.f199581d = envelopeStoryVideoManager;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/luckymoney/story/EnvelopeStoryVideoManager$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        EnvelopeStoryVideoManager envelopeStoryVideoManager = this.f199581d;
        EnvelopeStoryVideoManager.C94180e eVar = (EnvelopeStoryVideoManager.C94180e) ((HashMap) envelopeStoryVideoManager.f272055i).get(Integer.valueOf(envelopeStoryVideoManager.f272051e));
        if (motionEvent.getActionMasked() != 0 || eVar == null) {
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeStoryVideoManager$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        Rect rect = new Rect();
        eVar.f272081m.getGlobalVisibleRect(rect);
        if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            Log.m105924i("MicroMsg.EnvelopeStoryVideoManager", "the videoview are under actionbar ");
            eVar.f272082n.callOnClick();
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeStoryVideoManager$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
