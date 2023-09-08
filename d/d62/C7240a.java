package d62;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import de3.C75359b0;
import j20.C117292a;
import java.util.ArrayList;
import wd3.C53155r0;

/* renamed from: d62.a */
public abstract class C7240a extends C75359b0 {

    /* renamed from: d */
    public long f25314d = -1;

    public C7240a() {
    }

    /* renamed from: a */
    public abstract void mo1118a(View view);

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/messenger/api/AvoidDuplicatedPressableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        if (Util.ticksToNow(this.f25314d) > 1000) {
            super.onClick(view);
            mo1118a(view);
        } else {
            Log.m105928w("MicroMsg.AvoidDuplicatedPressableSpan", "hy: too often click");
            setIsPressed(false);
        }
        this.f25314d = Util.currentTicks();
        C117292a.m165361g(this, "com/tencent/mm/plugin/messenger/api/AvoidDuplicatedPressableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }

    public C7240a(int i, C53155r0 r0Var) {
        super(i, r0Var);
    }
}
