package p570iy;

import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C117747y;
import ob0.C35142u;

/* renamed from: iy.i */
public class C33440i implements C35142u {
    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.feature.sns.extension.SnsCommentSceneEnd");
        if (yVar.getType() == 213) {
            Log.m105925i("MicroMsg.SnsCommentSceneEnd", "snsUploadSceneEnd, errType:%s, errCode:%s, errMsg:%s, hashCode:%s", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(hashCode()));
            if (!(i == 0 && i2 == 0)) {
                C94866e1.gy0().mo131199j(0, false);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.feature.sns.extension.SnsCommentSceneEnd");
    }
}
