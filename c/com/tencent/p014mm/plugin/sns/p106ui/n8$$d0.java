package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94891k2;
import com.tencent.p014mm.plugin.sns.model.C94955u2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import eb0.C31543z5;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C9556a;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.n8$$d0 */
public class n8$$d0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C96085n8 f280615d;

    public n8$$d0(C96085n8 n8Var) {
        this.f280615d = n8Var;
    }

    public void onClick(View view) {
        String str;
        String str2;
        n8$$d0 n8__d0;
        C96277w8 w8Var;
        C96277w8 w8Var2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$7");
        if (view.getTag() == null || !(view.getTag() instanceof C96277w8) || (w8Var = (C96277w8) view.getTag()) == null) {
            str = "onClick";
            str2 = "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$7";
            n8__d0 = this;
        } else {
            C94891k2 k2Var = C94891k2.f274975a;
            k2Var.getClass();
            SnsMethodCalculate.markStartTimeMs("clickWsFriendFeed", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
            String str3 = w8Var.f281402a;
            long j = w8Var.f281403b;
            if (TextUtils.isEmpty(str3)) {
                Log.m105920e("MicroMsg.SnsWsFoldManager", "[clickWsFriendFeed] userName empty and return function");
                SnsMethodCalculate.markEndTimeMs("clickWsFriendFeed", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
                str = "onClick";
                str2 = "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$7";
                w8Var2 = w8Var;
            } else {
                C87412m.m108593f(str3, "userName");
                String d = k2Var.mo131071d(str3);
                MultiProcessMMKV multiProcessMMKV = C94891k2.f274976b;
                String string = multiProcessMMKV.getString(d, "");
                if (TextUtils.isEmpty(string)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Log.m105924i("MicroMsg.SnsWsFoldManager", "userName=" + str3 + ", first clickWsFriendFeed and record, now = " + currentTimeMillis);
                    SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    multiProcessMMKV.encode(d, str3 + ',' + -1 + ',' + currentTimeMillis + ',' + 1);
                    str = "onClick";
                    str2 = "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$7";
                    w8Var2 = w8Var;
                } else {
                    C94955u2 a = C94955u2.f275271e.mo131291a(string);
                    str2 = "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$7";
                    long currentTimeMillis2 = System.currentTimeMillis();
                    str = "onClick";
                    StringBuilder sb = new StringBuilder();
                    sb.append("userName=");
                    sb.append(str3);
                    sb.append(", second clickWsFriendFeed and record, now = ");
                    sb.append(currentTimeMillis2);
                    sb.append(", lastClickFeedTime = ");
                    SnsMethodCalculate.markStartTimeMs("getLastClickFeedTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    w8Var2 = w8Var;
                    String str4 = d;
                    long j2 = a.f275274c;
                    SnsMethodCalculate.markEndTimeMs("getLastClickFeedTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    sb.append(j2);
                    sb.append(" , secondClickWsFriendFeedTimeInterval = ");
                    sb.append(C94891k2.f274978d);
                    sb.append(" ,origin clickFeedCount = ");
                    sb.append(a.mo131286a());
                    sb.append(", lastUnFoldTime = ");
                    SnsMethodCalculate.markStartTimeMs("getLastUnFoldTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    String str5 = str3;
                    long j3 = a.f275273b;
                    SnsMethodCalculate.markEndTimeMs("getLastUnFoldTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    sb.append(j3);
                    Log.m105924i("MicroMsg.SnsWsFoldManager", sb.toString());
                    if (a.mo131286a() == C94891k2.f274977c) {
                        SnsMethodCalculate.markStartTimeMs("getLastClickFeedTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                        long j4 = a.f275274c;
                        SnsMethodCalculate.markEndTimeMs("getLastClickFeedTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                        if (currentTimeMillis2 - j4 < C94891k2.f274978d) {
                            SnsMethodCalculate.markEndTimeMs("clickWsFriendFeed", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
                        }
                    }
                    SnsMethodCalculate.markStartTimeMs("getLastClickFeedTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    long j5 = a.f275274c;
                    SnsMethodCalculate.markEndTimeMs("getLastClickFeedTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    if (currentTimeMillis2 - j5 > C94891k2.f274978d) {
                        Log.m105924i("MicroMsg.SnsWsFoldManager", "now - lastClickFeedTime timeout, reset clickFeedCount = 1");
                        SnsMethodCalculate.markStartTimeMs("setClickFeedCount", "com.tencent.mm.plugin.sns.model.WsFoldData");
                        a.f275275d = 1;
                        SnsMethodCalculate.markEndTimeMs("setClickFeedCount", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    } else {
                        Log.m105924i("MicroMsg.SnsWsFoldManager", "clickFeedCount++ and record, current clickFeedCount = " + a.mo131286a());
                        SnsMethodCalculate.markStartTimeMs("setClickFeedCount", "com.tencent.mm.plugin.sns.model.WsFoldData");
                        a.f275275d = a.mo131286a() + 1;
                        SnsMethodCalculate.markEndTimeMs("setClickFeedCount", "com.tencent.mm.plugin.sns.model.WsFoldData");
                        if (a.mo131286a() == C94891k2.f274977c) {
                            a.mo131287b(currentTimeMillis2);
                            String g = C102236a0.m134744g(C31543z5.m39453c());
                            Log.m105924i("MicroMsg.SnsWsFoldManager", "[clickWsFriendFeed] report27795 groupId = " + j + ", userName = " + str5 + ", session = " + g);
                            C115669n.INSTANCE.mo160131h(27795, 1, Long.valueOf(j), str5, g, 1);
                        }
                    }
                    SnsMethodCalculate.markStartTimeMs("setLastClickFeedTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    a.f275274c = currentTimeMillis2;
                    SnsMethodCalculate.markEndTimeMs("setLastClickFeedTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    multiProcessMMKV.encode(str4, a.toString());
                }
                SnsMethodCalculate.markEndTimeMs("clickWsFriendFeed", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
            }
            n8__d0 = this;
            Intent intent = new Intent(C96085n8.m123094b(n8__d0.f280615d), SnsWsFoldDetailUI.class);
            C96277w8 w8Var3 = w8Var2;
            intent.putExtra("key_ws_group_id", w8Var3.f281403b);
            intent.putExtra("key_ws_detail_max_id", w8Var3.f281404c);
            intent.putExtra("key_ws_detail_min_id", w8Var3.f281405d);
            intent.putExtra("key_ws_detail_username", w8Var3.f281402a);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((ArrayList) w8Var3.f281406e).iterator();
            while (it.hasNext()) {
                arrayList2.add(C102236a0.m134763p0(((Long) it.next()).longValue()));
            }
            intent.putStringArrayListExtra("key_ws_str_sns_id_list", arrayList2);
            Context b = C96085n8.m123094b(n8__d0.f280615d);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context = b;
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            b.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            SnsReportHelper.f275506m0.mo131379l(w8Var3.f281406e, w8Var3.f281403b, w8Var3.f281402a);
            SnsReportHelper.f275506m0.mo131367a0(w8Var3.f281403b, true);
        }
        String str6 = str;
        SnsMethodCalculate.markEndTimeMs(str6, str2);
        C117292a.m165361g(n8__d0, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$7", "android/view/View$OnClickListener", str6, "(Landroid/view/View;)V");
    }
}
