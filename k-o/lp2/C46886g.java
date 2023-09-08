package lp2;

import android.os.Looper;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import cq2.C45147e;
import f40.C86709a0;
import java.util.Collections;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import rq2.C101425k;
import te3.C101820nt3;
import te3.C49364f2;
import te3.C49501g2;
import te3.C49643h2;
import zt3.C119157j;

/* renamed from: lp2.g */
public class C46886g extends C46883a<C49501g2, C49643h2> implements C11385n {

    /* renamed from: f */
    public C45147e f126086f;

    /* renamed from: lp2.g$a */
    public class C46887a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C45147e f126087d;

        /* renamed from: e */
        public final /* synthetic */ int f126088e;

        /* renamed from: f */
        public final /* synthetic */ String f126089f;

        /* renamed from: g */
        public final /* synthetic */ List f126090g;

        public C46887a(C46886g gVar, C45147e eVar, int i, String str, List list) {
            this.f126087d = eVar;
            this.f126088e = i;
            this.f126089f = str;
            this.f126090g = list;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate$1");
            C45147e eVar = this.f126087d;
            if (eVar != null) {
                eVar.mo70652a(this.f126088e, this.f126089f, this.f126090g);
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate$1");
        }
    }

    public C46886g(String str, String str2, C49364f2[] f2VarArr) {
        mo72087l1(new C49501g2(), new C49643h2(), "/cgi-bin/mmoc-bin/adplayinfo/ad_dynamic_update", 5012, str, str2, f2VarArr);
    }

    /* renamed from: j1 */
    public void mo72085j1(C101820nt3 nt32, Object[] objArr) {
        SnsMethodCalculate.markStartTimeMs("fillRequestParam", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
        C49501g2 g2Var = (C49501g2) nt32;
        SnsMethodCalculate.markStartTimeMs("fillRequestParam", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
        try {
            String str = objArr[0];
            String str2 = objArr[1];
            C49364f2[] f2VarArr = objArr[2];
            if (g2Var != null) {
                g2Var.f133794d = str;
                g2Var.f133795e = str2;
                if (C101425k.m133102f(f2VarArr)) {
                    Collections.addAll(g2Var.f133796f, f2VarArr);
                }
                Log.m105918d("SnsAd.AdDynamicUpdate", "fillRequestParam::sns_id " + g2Var.f133794d + ", uxinfo " + g2Var.f133795e + ", req data size " + g2Var.f133796f.size());
            }
        } catch (Throwable unused) {
            Log.m105928w("SnsAd.AdDynamicUpdate", "fillRequestParam::convert to param throw wrong!!!");
        }
        SnsMethodCalculate.markEndTimeMs("fillRequestParam", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
        SnsMethodCalculate.markEndTimeMs("fillRequestParam", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
    }

    /* renamed from: m1 */
    public void mo72088m1(C45147e eVar) {
        SnsMethodCalculate.markStartTimeMs("doSend", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
        C86709a0.m107524d().mo123455a(5012, this);
        C86709a0.m107524d().mo123460f(this);
        this.f126086f = eVar;
        SnsMethodCalculate.markEndTimeMs("doSend", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
    }

    /* renamed from: n1 */
    public void mo72089n1(int i, String str, List<C49364f2> list) {
        SnsMethodCalculate.markStartTimeMs("onResponseFinish", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
        Log.m105918d("SnsAd.AdDynamicUpdate", "onResponseFinish::the error code is " + i + ", sns id " + str);
        C45147e eVar = this.f126086f;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            ((C119157j) C119157j.f356862d).mo183895z(new C46887a(this, eVar, i, str, list));
        } else if (eVar != null) {
            eVar.mo70652a(i, str, list);
        }
        SnsMethodCalculate.markEndTimeMs("onResponseFinish", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C49643h2 h2Var;
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
        C86709a0.m107524d().mo123470p(5012, this);
        Log.m105918d("SnsAd.AdDynamicUpdate", "onSceneEnd::the error type is " + i + ", error code is " + i2);
        if (i != 0 || i2 != 0 || !(yVar instanceof C46886g) || (h2Var = (C49643h2) ((C46886g) yVar).mo72086k1()) == null) {
            mo72089n1(-1, "", (List<C49364f2>) null);
            SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
            return;
        }
        mo72089n1(0, h2Var.f134410d, h2Var.f134411e);
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate");
    }
}
