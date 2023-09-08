package js2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: js2.c */
public class C60920c implements C11385n {
    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.newabtest.SnsAdABTestMgr");
    }
}
