package com.tencent.p014mm.plugin.sns.model;

import android.text.format.DateFormat;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;

/* renamed from: com.tencent.mm.plugin.sns.model.f1 */
public class C30402f1 implements Runnable {
    public void run() {
        String str;
        String str2;
        String str3;
        String str4;
        C86009m1[] m1VarArr;
        C86009m1[] u;
        String str5 = "run";
        String str6 = "com.tencent.mm.plugin.sns.model.SnsCore$20";
        SnsMethodCalculate.markStartTimeMs(str5, str6);
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsCore");
        SnsMethodCalculate.markStartTimeMs("dumpSnsFileImp", "com.tencent.mm.plugin.sns.model.SnsCore");
        if (C94866e1.f274872x0) {
            SnsMethodCalculate.markEndTimeMs("dumpSnsFileImp", "com.tencent.mm.plugin.sns.model.SnsCore");
            str2 = str5;
            str = str6;
        } else {
            C94866e1.f274872x0 = true;
            C86009m1[] u2 = new C86009m1(C94866e1.m120262YO()).mo119984u();
            Log.m105924i("MicroMsg.SnsCore", "snscheckfile start");
            long j = 0;
            int i = 0;
            while (i < u2.length) {
                C86009m1[] u3 = u2[i].mo119984u();
                if (u3 != null) {
                    int i2 = 0;
                    while (i2 < u3.length) {
                        String[] s = u3[i2].mo119981s();
                        if (s == null || (u = u3[i2].mo119984u()) == null) {
                            str4 = str5;
                            str3 = str6;
                            m1VarArr = u2;
                        } else {
                            StringBuffer stringBuffer = new StringBuffer();
                            m1VarArr = u2;
                            int i3 = 0;
                            while (i3 < u.length) {
                                C86009m1 m1Var = u[i3];
                                long r = j + m1Var.mo119980r();
                                StringBuilder sb = new StringBuilder();
                                sb.append(m1Var.mo119971i());
                                sb.append(" ");
                                String str7 = str5;
                                String str8 = str6;
                                sb.append(m1Var.mo119980r());
                                sb.append(" ");
                                sb.append(m1Var.mo119979q());
                                sb.append(" ");
                                sb.append((String) DateFormat.format("yyyy-M-d kk:mm", m1Var.mo119979q()));
                                String sb4 = sb.toString();
                                stringBuffer.append(sb4 + APLogFileUtil.SEPARATOR_LINE);
                                Log.m105924i("MicroMsg.SnsCore", sb4);
                                i3++;
                                j = r;
                                u = u;
                                str5 = str7;
                                str6 = str8;
                            }
                            str4 = str5;
                            str3 = str6;
                            Log.m105925i("MicroMsg.SnsCore", "filepath %s %d", u3[i2].mo119971i(), Integer.valueOf(s.length));
                        }
                        i2++;
                        u2 = m1VarArr;
                        str5 = str4;
                        str6 = str3;
                    }
                }
                i++;
                u2 = u2;
                str5 = str5;
                str6 = str6;
            }
            str2 = str5;
            str = str6;
            Log.m105924i("MicroMsg.SnsCore", "snscheckfile end " + j);
            C94866e1.f274872x0 = false;
            SnsMethodCalculate.markEndTimeMs("dumpSnsFileImp", "com.tencent.mm.plugin.sns.model.SnsCore");
        }
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsCore");
        SnsMethodCalculate.markEndTimeMs(str2, str);
    }
}
