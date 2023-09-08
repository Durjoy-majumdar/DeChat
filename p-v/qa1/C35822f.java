package qa1;

import android.os.Build;
import com.tencent.p014mm.booter.C28862c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.vendor.Huawei;
import di3.C86312j;
import h81.C32735h;
import p156gj.C87203t;
import p206nj.C11171e;

/* renamed from: qa1.f */
public class C35822f implements C35819c {
    /* renamed from: a */
    public void mo60432a() {
        boolean z;
        boolean z2;
        boolean z3;
        Class cls = C32735h.class;
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_target26_start_service_switch, -1);
        if (Util.isEqual(Qe, 0)) {
            C28862c.m38405f(false);
        } else if (Util.isEqual(Qe, 2)) {
            String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_target26_start_service_manu_exclusive, "");
            Log.m105925i("MicroMsg.TargetStartServiceSingleton", "manufacturers:%s", Util.nullAs(Y60, "null"));
            if (Util.isNullOrNil(Y60)) {
                C28862c.m38405f(true);
            } else {
                String[] split = Y60.split(",");
                int i = 0;
                while (true) {
                    if (i >= split.length) {
                        z3 = false;
                        break;
                    }
                    String str = split[i];
                    if (("" + str).equalsIgnoreCase(Build.MANUFACTURER)) {
                        C28862c.m38405f(false);
                        z3 = true;
                        break;
                    }
                    i++;
                }
                if (!z3) {
                    C28862c.m38405f(true);
                }
            }
        } else if (Util.isEqual(Qe, 1)) {
            String Y602 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_target26_start_service_manufacturer, "");
            Log.m105925i("MicroMsg.TargetStartServiceSingleton", "manufacturers:%s", Util.nullAs(Y602, "null"));
            if (!Util.isNullOrNil(Y602)) {
                String[] split2 = Y602.split(",");
                int i2 = 0;
                while (true) {
                    if (i2 >= split2.length) {
                        z2 = false;
                        break;
                    }
                    String str2 = split2[i2];
                    if (("" + str2).equalsIgnoreCase(Build.MANUFACTURER)) {
                        C28862c.m38405f(true);
                        z2 = true;
                        break;
                    }
                    i2++;
                }
                if (!z2) {
                    C28862c.m38405f(false);
                }
            } else {
                C28862c.m38405f(false);
            }
        }
        if (!C11171e.m11046c(26) || !Huawei.ifOnlyHUAWEI()) {
            C28862c.m38406g(1);
            return;
        }
        String lowerCase = C87203t.m108275k().toLowerCase();
        Log.m105925i("MicroMsg.TargetStartServiceSingleton", "model:%s startServiceHuaweiInfo:%s", lowerCase, Util.nullAs("ELE,VOG,HMA,LYA,EVR,MRD,JAT,AMN,KSA,AMZ,NLE,STK,HLK,LRA,ART,AQM,ASK,TAS,LIO,WLZ,OXF,WIN,ORE,JNY,RIS,MOA,MED,FRO,NEY,YSL,PCT,TNY,YAL,ALP,BLA,VCE,EML,CLT,COL,BKL,COR,PAR,RVL,NEO,POT,HRY,MAR,SNE,JSN,TEL,FRL,AKA,MXW,DVC,NNJ,NNR,HNB,HUS,JEF,JER,BMH,CDY,ANA,ELS,HNB,BMH,EBG,FIN,TAH,DRA,OTX,KKG,MWXM,DVCM,TNNH", "null"));
        try {
            if (!Util.isNullOrNil("ELE,VOG,HMA,LYA,EVR,MRD,JAT,AMN,KSA,AMZ,NLE,STK,HLK,LRA,ART,AQM,ASK,TAS,LIO,WLZ,OXF,WIN,ORE,JNY,RIS,MOA,MED,FRO,NEY,YSL,PCT,TNY,YAL,ALP,BLA,VCE,EML,CLT,COL,BKL,COR,PAR,RVL,NEO,POT,HRY,MAR,SNE,JSN,TEL,FRL,AKA,MXW,DVC,NNJ,NNR,HNB,HUS,JEF,JER,BMH,CDY,ANA,ELS,HNB,BMH,EBG,FIN,TAH,DRA,OTX,KKG,MWXM,DVCM,TNNH")) {
                String[] split3 = "ELE,VOG,HMA,LYA,EVR,MRD,JAT,AMN,KSA,AMZ,NLE,STK,HLK,LRA,ART,AQM,ASK,TAS,LIO,WLZ,OXF,WIN,ORE,JNY,RIS,MOA,MED,FRO,NEY,YSL,PCT,TNY,YAL,ALP,BLA,VCE,EML,CLT,COL,BKL,COR,PAR,RVL,NEO,POT,HRY,MAR,SNE,JSN,TEL,FRL,AKA,MXW,DVC,NNJ,NNR,HNB,HUS,JEF,JER,BMH,CDY,ANA,ELS,HNB,BMH,EBG,FIN,TAH,DRA,OTX,KKG,MWXM,DVCM,TNNH".split(",");
                int i3 = 0;
                while (true) {
                    if (i3 >= split3.length) {
                        z = false;
                        break;
                    } else if (lowerCase.startsWith(split3[i3].toLowerCase())) {
                        C28862c.m38406g(1);
                        z = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (!z) {
                    C28862c.m38406g(0);
                    return;
                }
                return;
            }
            C28862c.m38406g(0);
        } catch (Exception e) {
            Log.m105925i("MicroMsg.TargetStartServiceSingleton", "startServiceHuaweiInfo Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            C28862c.m38406g(0);
        }
    }
}
