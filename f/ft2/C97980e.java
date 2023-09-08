package ft2;

import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;
import java.util.HashSet;

/* renamed from: ft2.e */
public class C97980e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsInfo f287371d;

    public C97980e(SnsInfo snsInfo) {
        this.f287371d = snsInfo;
    }

    public void run() {
        Class cls = C75700k0.class;
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$4");
        SnsInfo snsInfo = this.f287371d;
        if (snsInfo != null) {
            long j = snsInfo.field_snsId;
            if (!C97979c.m126543b().containsKey(Long.valueOf(j))) {
                c$$e c__e = new c$$e();
                if (!(this.f287371d.getTimeLine() == null || this.f287371d.getTimeLine().ContentObj == null || this.f287371d.getTimeLine().ContentObj.f298424e != 1 || this.f287371d.getTimeLine().ContentObj.f298427h == null || this.f287371d.getTimeLine().ContentObj.f298427h.size() <= 0)) {
                    c__e.f287358a = this.f287371d.getTimeLine().ContentObj.f298427h.size();
                    c__e.f287359b = new HashSet<>();
                    c__e.f287360c = new HashSet<>();
                    c__e.f287361d = new HashSet<>();
                    c__e.f287362e = new HashSet<>();
                    c__e.f287365h = this.f287371d.getTimeLine().f283893Id;
                    c__e.f287370m = this.f287371d.getTimeLine().showFlag;
                    try {
                        SnsObject e = C94897n1.m120367e(this.f287371d);
                        c__e.f287368k = e.LikeCount;
                        c__e.f287369l = e.CommentCount;
                    } catch (Exception unused) {
                        c__e.f287368k = 0;
                        c__e.f287369l = 0;
                    }
                    try {
                        C86709a0.m107528h();
                        c__e.f287367j = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Vx0(this.f287371d.getUserName());
                        long currentTimeMillis = System.currentTimeMillis();
                        C86709a0.m107528h();
                        c__e.f287366i = (currentTimeMillis - ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Dx0(this.f287371d.getUserName())) / 1000;
                    } catch (Exception unused2) {
                        c__e.f287367j = 0;
                        c__e.f287366i = 0;
                    }
                    C97979c.m126543b().put(Long.valueOf(j), c__e);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$4");
    }
}
