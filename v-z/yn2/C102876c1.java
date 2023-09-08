package yn2;

import ad0.C91999u;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.storage.C96983o3;
import di3.C86301e;
import ei3.C86522b;
import jr2.C99018v;
import te3.C101804kv2;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: yn2.c1 */
public class C102876c1 extends C86301e implements C99018v {
    public TimeLineObject It0(String str) {
        SnsMethodCalculate.markStartTimeMs("parserFromXml", "com.tencent.mm.plugin.sns.TimeLineHelperService");
        TimeLineObject q = C91999u.m115571q(str);
        SnsMethodCalculate.markEndTimeMs("parserFromXml", "com.tencent.mm.plugin.sns.TimeLineHelperService");
        return q;
    }

    /* renamed from: bU */
    public void mo138363bU(long j, ImageView imageView, int i) {
        SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.TimeLineHelperService");
        SnsInfo SE = C94866e1.Yx0().mo139806SE(j);
        if (SE == null) {
            SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.TimeLineHelperService");
            return;
        }
        TimeLineObject timeLine = SE.getTimeLine();
        if (timeLine.ContentObj.f298427h.size() > 0) {
            C101804kv2 kv22 = timeLine.ContentObj.f298427h.get(0);
            Bitmap n = C94866e1.Fx0().mo131130n(kv22);
            if (n != null) {
                imageView.setImageBitmap(n);
            } else {
                C94866e1.Fx0().mo131101U(SE.getSnsId(), kv22, imageView, i, C96983o3.f284139k);
            }
        }
        SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.TimeLineHelperService");
    }

    public boolean ej0(long j) {
        SnsMethodCalculate.markStartTimeMs("hasMedia", "com.tencent.mm.plugin.sns.TimeLineHelperService");
        SnsInfo SE = C94866e1.Yx0().mo139806SE(j);
        if (SE == null) {
            SnsMethodCalculate.markEndTimeMs("hasMedia", "com.tencent.mm.plugin.sns.TimeLineHelperService");
            return false;
        } else if (SE.getTimeLine().ContentObj.f298427h.size() > 0) {
            SnsMethodCalculate.markEndTimeMs("hasMedia", "com.tencent.mm.plugin.sns.TimeLineHelperService");
            return true;
        } else {
            SnsMethodCalculate.markEndTimeMs("hasMedia", "com.tencent.mm.plugin.sns.TimeLineHelperService");
            return false;
        }
    }
}
