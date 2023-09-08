package com.tencent.kinda.framework.module.impl;

import android.util.Base64;
import com.tencent.kinda.gen.KReportService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import eb0.C31543z5;
import f40.C86709a0;
import org.json.JSONObject;
import zt3.C119157j;

public class ReportServiceImpl implements KReportService {
    private static final String ACF_REPORT_KEY = "acfReport_";
    private static final String LAST_REPORT_SESSION_KEY = "lastReportSession";
    private static final String TAG = "MicroMsg.ReportServiceImpl";

    public String getLastSessionInfo() {
        return C75228t.m90275x().getString(LAST_REPORT_SESSION_KEY, "");
    }

    public void idkeyStat(long j, long j2, long j3, boolean z) {
        C115669n.INSTANCE.idkeyStat(j, j2, j3, z);
    }

    public void kvStat(int i, String str) {
        C115669n.INSTANCE.kvStat(i, str);
    }

    public void setLastSessionInfo(final String str) {
        C75228t.m90275x().edit().putString(LAST_REPORT_SESSION_KEY, str).apply();
        ((C119157j) C119157j.f356862d).mo183876g(new Runnable() {
            public void run() {
                String str = ReportServiceImpl.ACF_REPORT_KEY + C86709a0.m107523b().mo121111i();
                if (!Util.isNullOrNil(str)) {
                    String string = C75228t.m90275x().getString(str, "");
                    String str2 = Util.isNullOrNil(string) ? "{}" : new String(Base64.decode(string, 2));
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        String optString = jSONObject.optString("sessionId");
                        String optString2 = jSONObject.optString("lastReportUrl");
                        String optString3 = jSONObject.optString("logType");
                        String optString4 = jSONObject.optString("logAction");
                        if (!optString2.equals("NetworkChange")) {
                            if (!optString2.equals("MemoryWarning")) {
                                JSONObject jSONObject2 = new JSONObject(str2);
                                String optString5 = jSONObject2.optString("sessionId");
                                String optString6 = jSONObject2.optString("acf");
                                String format = String.format("%s(%s:%s)", new Object[]{optString2, optString3, optString4});
                                String[] split = optString6.split("-");
                                int length = split.length;
                                if (length >= 2 && split[length - 1].equals(format) && split[length - 2].equals(format)) {
                                    Log.m105929w(ReportServiceImpl.TAG, "skip duplicate action node: %s", format);
                                    return;
                                } else if (Util.isNullOrNil(optString5)) {
                                    jSONObject2.put("sessionId", optString);
                                    jSONObject2.put("acf", format);
                                    Log.m105919d(ReportServiceImpl.TAG, "new acf: %s", jSONObject2.toString());
                                    C75228t.m90275x().putString(str, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                                    return;
                                } else if (optString5.equals(optString)) {
                                    jSONObject2.put("acf", optString6 + "-" + format);
                                    Log.m105919d(ReportServiceImpl.TAG, "append acf: %s", jSONObject2.toString());
                                    C75228t.m90275x().putString(str, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                                    return;
                                } else {
                                    Log.m105921e(ReportServiceImpl.TAG, "bad case: %s", optString);
                                    C115669n.INSTANCE.mo160131h(24087, optString6, optString5);
                                    jSONObject2.put("sessionId", optString);
                                    jSONObject2.put("acf", format);
                                    Log.m105919d(ReportServiceImpl.TAG, "new acf: %s", jSONObject2.toString());
                                    C75228t.m90275x().putString(str, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                                    return;
                                }
                            }
                        }
                        Log.m105919d(ReportServiceImpl.TAG, "ignore unused action: %s", optString2);
                    } catch (Exception e) {
                        Log.printErrStackTrace(ReportServiceImpl.TAG, e, "", new Object[0]);
                    }
                } else {
                    String string2 = C75228t.m90275x().getString(str, "");
                    if (!Util.isNullOrNil(string2)) {
                        try {
                            JSONObject jSONObject3 = new JSONObject(new String(Base64.decode(string2, 2)));
                            String optString7 = jSONObject3.optString("acf");
                            if (optString7.length() > 7000) {
                                Log.m105929w(ReportServiceImpl.TAG, "over length: %s", Integer.valueOf(optString7.length()));
                                optString7 = optString7.substring(0, 7000);
                            }
                            C115669n.INSTANCE.mo160131h(24087, optString7, jSONObject3.optString("sessionId"));
                        } catch (Exception e2) {
                            Log.printErrStackTrace(ReportServiceImpl.TAG, e2, "", new Object[0]);
                        } catch (Throwable th) {
                            C75228t.m90275x().remove(str);
                            throw th;
                        }
                        C75228t.m90275x().remove(str);
                    }
                }
            }
        }, "wcpay_acf_report");
    }

    public long svrTimeMs() {
        return C31543z5.m39451a();
    }
}
