package com.tencent.p014mm.plugin.appbrand.utils;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.utils.C55552j;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.k */
public final class C55557k implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C55552j.C55553a f158189d;

    /* renamed from: e */
    public final /* synthetic */ View f158190e;

    public C55557k(C55552j.C55553a aVar, View view) {
        this.f158189d = aVar;
        this.f158190e = view;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/utils/AnyProcessAvatarAttacher$AvatarBitmapDrawable$attachToView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int actionMasked = motionEvent.getActionMasked();
        String str = this.f158189d.f158179a;
        Log.m105918d(str, "onTouch, view: " + this.f158190e + ", action: " + actionMasked);
        if (actionMasked == 0) {
            C55552j.C55553a aVar = this.f158189d;
            aVar.f158182d = true;
            aVar.invalidateSelf();
        } else if (actionMasked == 1 || actionMasked == 3) {
            C55552j.C55553a aVar2 = this.f158189d;
            aVar2.f158182d = false;
            aVar2.invalidateSelf();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/appbrand/utils/AnyProcessAvatarAttacher$AvatarBitmapDrawable$attachToView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
