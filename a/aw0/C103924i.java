package aw0;

import com.tencent.p014mm.plugin.ball.model.BallInfo;
import java.util.Comparator;

/* renamed from: aw0.i */
public class C103924i implements Comparator<BallInfo> {
    public int compare(Object obj, Object obj2) {
        int i;
        BallInfo ballInfo = (BallInfo) obj;
        BallInfo ballInfo2 = (BallInfo) obj2;
        boolean z = ballInfo.f311680E;
        if (z && !ballInfo2.f311680E) {
            return 1;
        }
        if ((z || !ballInfo2.f311680E) && ballInfo.f311704y <= ballInfo2.f311704y) {
            return i < 0 ? 1 : 0;
        }
        return -1;
    }
}
