package rs1;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dp1.C7435f2;
import gy3.C87412m;
import org.json.JSONObject;
import p92.C117994a;
import p92.C117997g;
import rx3.C13598b0;
import te3.C110959d13;
import te3.C49712hj1;
import yl1.C66663a;

/* renamed from: rs1.t6 */
public final class C63638t6 extends C117997g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63638t6(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: L1 */
    public void mo36001L1(View view, MultiTaskInfo multiTaskInfo, C110959d13 d132, Object obj) {
        C87412m.m108594g(multiTaskInfo, "info");
        C87412m.m108594g(d132, "animateData");
        C66663a.C66665b bVar = C66663a.f191683x;
        Activity activity = null;
        Context context = view != null ? view.getContext() : null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
        bVar.mo90715a(multiTaskInfo, d132, true, activity);
    }

    /* renamed from: e3 */
    public void mo62144e3(MultiTaskInfo multiTaskInfo, int i) {
        C87412m.m108594g(multiTaskInfo, "obj");
        C7435f2 f2Var = C7435f2.f25626a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("feedid", multiTaskInfo.field_id);
        jSONObject.put("feed_index", i + 1);
        jSONObject.put("import_time", multiTaskInfo.field_createTime);
        C13598b0 b0Var = C13598b0.f38549a;
        f2Var.mo8577a((C49712hj1) null, "float_feed_delete", 1, jSONObject);
    }

    /* renamed from: g3 */
    public void mo62145g3() {
    }

    /* renamed from: i3 */
    public void mo62146i3() {
    }

    /* renamed from: j3 */
    public void mo62155j3(MultiTaskInfo multiTaskInfo, int i) {
        C87412m.m108594g(multiTaskInfo, "info");
        C7435f2 f2Var = C7435f2.f25626a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("feedid", multiTaskInfo.field_id);
        jSONObject.put("feed_index", i + 1);
        jSONObject.put("import_time", multiTaskInfo.field_createTime);
        C13598b0 b0Var = C13598b0.f38549a;
        f2Var.mo8577a((C49712hj1) null, "float_feed", 0, jSONObject);
    }

    /* renamed from: k3 */
    public boolean mo62147k3(int i) {
        return i == 22;
    }

    /* renamed from: z */
    public C117994a.C117996b mo36002z() {
        return C117994a.C117996b.MODE_SHOW_MULTI_SCENE;
    }
}
