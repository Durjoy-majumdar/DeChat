package p176jc;

import com.tencent.skyline.IRouteBackCallback;
import java.util.LinkedList;

/* renamed from: jc.w */
public final class C87942w implements IRouteBackCallback {

    /* renamed from: a */
    public final /* synthetic */ C87943x f254510a;

    public C87942w(C87943x xVar) {
        this.f254510a = xVar;
    }

    public void onBack(int i, int i2) {
        for (IRouteBackCallback onBack : new LinkedList(this.f254510a.f254515d)) {
            onBack.onBack(i, i2);
        }
    }

    public void onBackDone(int i, int i2) {
        for (IRouteBackCallback onBackDone : new LinkedList(this.f254510a.f254515d)) {
            onBackDone.onBackDone(i, i2);
        }
    }
}
