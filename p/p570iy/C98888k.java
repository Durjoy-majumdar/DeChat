package p570iy;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import de3.C75369r;
import java.util.regex.Matcher;
import vr2.C102236a0;

/* renamed from: iy.k */
public class C98888k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f289890d;

    /* renamed from: e */
    public final /* synthetic */ String f289891e;

    /* renamed from: f */
    public final /* synthetic */ C98889l f289892f;

    public C98888k(C98889l lVar, long j, String str) {
        this.f289892f = lVar;
        this.f289890d = j;
        this.f289891e = str;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1$1");
        SnsInfo LL = C94866e1.Yx0().mo139800LL(this.f289892f.f289893a);
        if (LL == null || LL.field_snsId == 0) {
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1$1");
            return;
        }
        TimeLineObject timeLine = LL.getTimeLine();
        if (timeLine == null) {
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1$1");
            return;
        }
        String str = timeLine.ContentDesc;
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1$1");
            return;
        }
        String q0 = C102236a0.m134765q0(LL.field_snsId);
        Matcher matcher = C75369r.f221604t.matcher(str);
        while (matcher.find()) {
            SnsUploadUI.m122436T7(3, matcher.group(), q0, this.f289890d, this.f289891e);
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener$1$1");
    }
}
