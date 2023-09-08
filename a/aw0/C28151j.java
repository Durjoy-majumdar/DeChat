package aw0;

import com.tencent.p014mm.plugin.ball.model.BallInfo;
import java.util.Comparator;

/* renamed from: aw0.j */
public class C28151j implements Comparator<BallInfo> {
    public int compare(Object obj, Object obj2) {
        int i = (((BallInfo) obj).f311704y > ((BallInfo) obj2).f311704y ? 1 : (((BallInfo) obj).f311704y == ((BallInfo) obj2).f311704y ? 0 : -1));
        if (i > 0) {
            return -1;
        }
        return i < 0 ? 1 : 0;
    }
}
