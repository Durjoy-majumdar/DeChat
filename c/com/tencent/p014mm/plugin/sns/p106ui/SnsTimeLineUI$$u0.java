package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.os.Vibrator;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.model.C94850d0;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94970y;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import de3.C75369r;
import di3.C86312j;
import java.util.LinkedList;
import java.util.regex.Matcher;
import ob0.C117747y;
import p255vr.C65873e;
import te3.m64;
import te3.n64;
import te3.w64;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$u0 */
public class SnsTimeLineUI$$u0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117747y f278787d;

    /* renamed from: e */
    public final /* synthetic */ Context f278788e;

    /* renamed from: f */
    public final /* synthetic */ long f278789f;

    public SnsTimeLineUI$$u0(C117747y yVar, Context context, long j) {
        this.f278787d = yVar;
        this.f278788e = context;
        this.f278789f = j;
    }

    public void run() {
        SnsObject snsObject;
        SnsInfo snsInfo;
        m64 m64;
        SnsInfo snsInfo2;
        SnsInfo snsInfo3;
        AdSnsInfo jo;
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$75");
        C117747y yVar = this.f278787d;
        w64 w64 = null;
        if (yVar instanceof C94850d0) {
            C94850d0 d0Var = (C94850d0) yVar;
            d0Var.getClass();
            SnsMethodCalculate.markStartTimeMs("getSnsAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
            n64 n64 = d0Var.f274806g;
            m64 = n64 != null ? n64.f298899f : null;
            SnsMethodCalculate.markEndTimeMs("getSnsAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
            C94850d0 d0Var2 = (C94850d0) this.f278787d;
            d0Var2.getClass();
            SnsMethodCalculate.markStartTimeMs("getSnsRspObject", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
            snsObject = d0Var2.f274809j;
            SnsMethodCalculate.markEndTimeMs("getSnsRspObject", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
            C94850d0 d0Var3 = (C94850d0) this.f278787d;
            d0Var3.getClass();
            SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
            snsInfo2 = d0Var3.f274808i;
            SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        } else if (yVar instanceof C94970y) {
            C94970y yVar2 = (C94970y) yVar;
            yVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("getSnsAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
            n64 n642 = yVar2.f275319g;
            m64 = n642 != null ? n642.f298899f : null;
            SnsMethodCalculate.markEndTimeMs("getSnsAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
            C94970y yVar3 = (C94970y) this.f278787d;
            yVar3.getClass();
            SnsMethodCalculate.markStartTimeMs("getSnsObject", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
            snsObject = yVar3.f275322j;
            SnsMethodCalculate.markEndTimeMs("getSnsObject", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
            C94970y yVar4 = (C94970y) this.f278787d;
            yVar4.getClass();
            SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
            if (yVar4.f275321i == null) {
                SnsMethodCalculate.markStartTimeMs("getSnsInfoInner", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
                try {
                    snsInfo3 = C94866e1.Yx0().mo139806SE(yVar4.f275319g.f298897d);
                    if (snsInfo3 == null && (jo = C94866e1.zx0().mo139864jo(yVar4.f275319g.f298897d)) != null) {
                        snsInfo3 = jo.convertToSnsInfo();
                    }
                    SnsMethodCalculate.markEndTimeMs("getSnsInfoInner", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
                } catch (Throwable unused) {
                    SnsMethodCalculate.markEndTimeMs("getSnsInfoInner", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
                    snsInfo3 = null;
                }
                yVar4.f275321i = snsInfo3;
            }
            snsInfo2 = yVar4.f275321i;
            SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
        } else {
            m64 = null;
            snsInfo = null;
            snsObject = null;
            if (m64 != null || snsObject == null || snsInfo == null) {
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$75");
            }
            Vibrator vibrator = C102236a0.f301037a;
            SnsMethodCalculate.markStartTimeMs("getCommentSended", "com.tencent.mm.plugin.sns.data.SnsUtil");
            String str = m64.f298780n;
            if (TextUtils.isEmpty(str)) {
                SnsMethodCalculate.markEndTimeMs("getCommentSended", "com.tencent.mm.plugin.sns.data.SnsUtil");
            } else {
                String str2 = m64.f298773d;
                LinkedList<w64> linkedList = snsObject.CommentUserList;
                if (linkedList != null) {
                    int size = linkedList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        w64 w642 = linkedList.get(size);
                        if (w642 != null && TextUtils.equals(str2, w642.f299703d) && TextUtils.equals(w642.f299707h, str)) {
                            SnsMethodCalculate.markEndTimeMs("getCommentSended", "com.tencent.mm.plugin.sns.data.SnsUtil");
                            w64 = w642;
                            break;
                        }
                    }
                }
                SnsMethodCalculate.markEndTimeMs("getCommentSended", "com.tencent.mm.plugin.sns.data.SnsUtil");
            }
            if (w64 == null) {
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$75");
                return;
            }
            Matcher matcher = C75369r.f221604t.matcher(m64.f298780n);
            while (matcher.find()) {
                StringBuilder sb = new StringBuilder();
                int i = w64.f299709j;
                sb.append(i != 0 ? (long) i : w64.f299714r);
                sb.append("");
                SnsCommentFooter.m122051y(this.f278788e, snsInfo, C102236a0.m134753k0(w64), sb.toString(), 3, matcher.group(), this.f278789f);
            }
            SnsCommentFooter.f278037M = ((C65873e) C86312j.m106911c(C65873e.class)).ep0(79);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$75");
            return;
        }
        snsInfo = snsInfo2;
        if (m64 != null) {
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$75");
    }
}
