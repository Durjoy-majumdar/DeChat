package w03;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import java.io.IOException;
import ky2.C10432i;
import p92.C117994a;
import p92.C117997g;
import te3.C110959d13;
import te3.C51173ry;
import te3.uh4;
import te3.wh4;
import te3.xh4;

/* renamed from: w03.a */
public final class C22842a extends C117997g {

    /* renamed from: d */
    public final String f65670d = "MicroMsg.TopStory.TopStoryMultiTaskUIC";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22842a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: L1 */
    public void mo36001L1(View view, MultiTaskInfo multiTaskInfo, C110959d13 d132, Object obj) {
        C87412m.m108594g(multiTaskInfo, "info");
        C87412m.m108594g(d132, "animateData");
        byte[] bArr = multiTaskInfo.field_data;
        wh4 wh4 = new wh4();
        boolean z = true;
        try {
            wh4.parseFrom(bArr);
        } catch (Exception e) {
            Log.printErrStackTrace(this.f65670d, e, "handleBallInfoClicked exception:%s", e);
        }
        if (wh4.f64687r.size() > 0) {
            uh4 uh4 = new uh4();
            uh4.f64642i = wh4.f64685p;
            uh4.f64646p = wh4.f64680h;
            xh4 xh4 = wh4.f64687r.get(0);
            uh4.f64645o = xh4;
            String str = null;
            uh4.f64637d = xh4 != null ? xh4.f64729h : null;
            uh4.f64639f = wh4.f64678f;
            uh4.f64638e = wh4.f64677e;
            uh4.f64640g = wh4.f64679g;
            uh4.f64641h = wh4.f64681i;
            String str2 = wh4.f64682j;
            uh4.f64648r = str2;
            uh4.f64636A = wh4.f64684o;
            uh4.f64649s = wh4.f64683n;
            uh4.f64644n = wh4.f64686q;
            uh4.f64647q = wh4.f64688s;
            String str3 = this.f65670d;
            Object[] objArr = new Object[2];
            objArr[0] = str2;
            if (xh4 != null) {
                str = xh4.f64729h;
            }
            objArr[1] = str;
            Log.m105925i(str3, "handleBallInfoClicked, contextId:%s videoId:%s", objArr);
            AppCompatActivity activity = getActivity();
            Class cls = C10432i.class;
            if (((C10432i) C86312j.m106911c(cls)).mo10750e()) {
                ((C10432i) C86312j.m106911c(cls)).mo10755m4(activity);
            } else {
                Intent intent = new Intent();
                try {
                    intent.putExtra("key_context", uh4.toByteArray());
                    C51173ry ryVar = new C51173ry();
                    ryVar.f141210d = d132;
                    intent.putExtra("key_multi_task_common_info", ryVar.toByteArray());
                } catch (IOException unused) {
                }
                if (uh4.f64641h != 100203) {
                    z = false;
                }
                if (z) {
                    C43471q.m46985i(activity, ".ui.video.fs.TopStoryMultiTaskFSVideoUI", intent);
                } else {
                    C43471q.m46985i(activity, ".ui.video.list.TopStoryMultiTaskListVideoUI", intent);
                }
            }
            getActivity().overridePendingTransition(0, 0);
            return;
        }
        Log.m105920e(this.f65670d, "handleBallInfoClicked, cache video list size == 0");
    }

    /* renamed from: z */
    public C117994a.C117996b mo36002z() {
        return C117994a.C117996b.MODE_SHOW_MULTI_SCENE;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22842a(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
