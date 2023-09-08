package p92;

import android.view.View;
import bl3.C16795g;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import te3.C110959d13;

/* renamed from: p92.a */
public interface C117994a extends C16795g {

    /* renamed from: p92.a$a */
    public static final class C117995a {
        /* renamed from: a */
        public static /* synthetic */ void m166409a(C117994a aVar, View view, MultiTaskInfo multiTaskInfo, C110959d13 d132, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 8) != 0) {
                    obj = null;
                }
                aVar.mo36001L1(view, multiTaskInfo, d132, obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onMultiTaskItemClick");
        }
    }

    /* renamed from: p92.a$b */
    public enum C117996b {
        MODE_SHOW_SINGLE_SCENE,
        MODE_SHOW_MULTI_SCENE,
        MODE_SHOW_SNAPSHOT_SCENE,
        MODE_NONE
    }

    /* renamed from: L1 */
    void mo36001L1(View view, MultiTaskInfo multiTaskInfo, C110959d13 d132, Object obj);

    /* renamed from: z */
    C117996b mo36002z();
}
