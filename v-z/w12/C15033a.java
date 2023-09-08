package w12;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import de3.C75359b0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import wd3.C53155r0;

/* renamed from: w12.a */
public abstract class C15033a extends C75359b0 {

    /* renamed from: d */
    public long f41168d = -1;

    public C15033a() {
    }

    /* renamed from: a */
    public abstract void mo5646a(View view);

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/kidswatch/model/KidsWatchAvoidDuplicatedPressableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "widget");
        if (Util.ticksToNow(this.f41168d) > 1000) {
            super.onClick(view);
            mo5646a(view);
        } else {
            Log.m105928w("MicroMsg.AvoidDuplicatedPressableSpan", "hy: too often click");
            setIsPressed(false);
        }
        this.f41168d = Util.currentTicks();
        C117292a.m165361g(this, "com/tencent/mm/plugin/kidswatch/model/KidsWatchAvoidDuplicatedPressableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }

    public C15033a(int i, C53155r0 r0Var) {
        super(i, r0Var);
    }
}
