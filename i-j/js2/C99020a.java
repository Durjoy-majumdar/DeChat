package js2;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94893m;
import com.tencent.p014mm.plugin.sns.p106ui.C96071m8;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import vr2.C102236a0;

/* renamed from: js2.a */
public class C99020a implements C94893m {

    /* renamed from: d */
    public Context f290291d;

    /* renamed from: e */
    public Animation f290292e;

    /* renamed from: f */
    public Animation f290293f;

    /* renamed from: g */
    public Map<Long, C33657a> f290294g = new HashMap();

    /* renamed from: h */
    public Map<Long, C33657a> f290295h = new HashMap();

    /* renamed from: i */
    public HashSet<Long> f290296i = new HashSet<>();

    /* renamed from: j */
    public HashMap<Long, Boolean> f290297j = new HashMap<>();

    /* renamed from: js2.a$a */
    public static class C33657a {

        /* renamed from: a */
        public long f91071a;

        /* renamed from: a */
        public void mo59245a() {
            SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.newabtest.AdNotLikeAbTestHelper$ReportInfo");
            this.f91071a = System.currentTimeMillis();
            Log.m105918d("MicroMsg.AdNotLikeAbTestHelper", "report abtestnotlike " + 0 + " uxinfo:" + null + " actionresult: " + null + " " + 0 + " " + this.f91071a);
            C115669n.INSTANCE.mo160131h(11988, null, null, "", "", C102236a0.m134765q0(0), null, null, Long.valueOf(0 / 1000), Long.valueOf(this.f91071a / 1000));
            SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.newabtest.AdNotLikeAbTestHelper$ReportInfo");
        }
    }

    public C99020a(Context context, TimelineClickListener timelineClickListener, FrameLayout frameLayout, View view) {
        Context context2 = context;
        C94866e1.Qx0().getClass();
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
        C94866e1.Qx0().getClass();
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
        this.f290291d = context2;
        this.f290292e = new ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f, 1, 1.0f, 1, 0.0f);
        this.f290292e = AnimationUtils.loadAnimation(context2, C0966R.C0968anim.f2368b5);
        this.f290293f = new ScaleAnimation(1.0f, 1.0f, 1.0f, 0.0f, 1, 1.0f, 1, 0.0f);
        this.f290293f = AnimationUtils.loadAnimation(context2, C0966R.C0968anim.f2369b6);
    }

    /* renamed from: a */
    public void mo131073a(int i, String str, long j, TimeLineObject timeLineObject, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onItemRemove", "com.tencent.mm.plugin.sns.newabtest.AdNotLikeAbTestHelper");
        if (z) {
            if (this.f290296i.contains(Long.valueOf(j))) {
                boolean z2 = false;
                if (this.f290297j.containsKey(Long.valueOf(j))) {
                    z2 = this.f290297j.get(Long.valueOf(j)).booleanValue();
                }
                if (z2) {
                    C33657a aVar = (C33657a) ((HashMap) this.f290295h).get(Long.valueOf(j));
                    if (aVar != null) {
                        aVar.mo59245a();
                    }
                }
            }
            ((HashMap) this.f290295h).remove(Long.valueOf(j));
            this.f290296i.remove(Long.valueOf(j));
        }
        SnsMethodCalculate.markEndTimeMs("onItemRemove", "com.tencent.mm.plugin.sns.newabtest.AdNotLikeAbTestHelper");
    }

    /* renamed from: b */
    public void mo131074b(int i, String str, long j, TimeLineObject timeLineObject, boolean z, C96071m8 m8Var) {
        SnsMethodCalculate.markStartTimeMs("onItemAdd", "com.tencent.mm.plugin.sns.newabtest.AdNotLikeAbTestHelper");
        SnsMethodCalculate.markEndTimeMs("onItemAdd", "com.tencent.mm.plugin.sns.newabtest.AdNotLikeAbTestHelper");
    }
}
