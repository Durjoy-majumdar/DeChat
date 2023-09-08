package gd2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.offline.C30326g;
import com.tencent.p014mm.plugin.offline.C69963m;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import eb0.C86497v5;
import id2.C76313t;
import ie3.C76324c;
import java.util.ArrayList;
import java.util.Map;
import ob0.C35136m;
import sf0.C48374j0;

/* renamed from: gd2.h */
public class C32402h implements C86497v5.C31521b {

    /* renamed from: gd2.h$a */
    public class C32403a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f85959d;

        /* renamed from: e */
        public final /* synthetic */ C35136m.C35137a f85960e;

        public C32403a(C32402h hVar, String str, C35136m.C35137a aVar) {
            this.f85959d = str;
            this.f85960e = aVar;
        }

        public void run() {
            boolean z;
            String str;
            int i;
            C76313t Ax0 = C69963m.wx0().Ax0();
            String str2 = this.f85959d;
            long j = this.f85960e.f94242a.f227638r;
            Ax0.getClass();
            Class cls = C76324c.class;
            Log.m105924i("MicroMsg.WalletOfflineMsgManager", "onReceiveMsg msg id is :" + j);
            Log.m105924i("MicroMsg.WalletOfflineMsgManager", "onReceiveMsg msg content is :" + str2);
            if (!TextUtils.isEmpty(str2)) {
                ArrayList<Long> arrayList = Ax0.f223554c;
                if (arrayList != null && arrayList.size() != 0) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= Ax0.f223554c.size()) {
                            break;
                        } else if (Ax0.f223554c.get(i2).longValue() == j) {
                            z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    Log.m105920e("MicroMsg.WalletOfflineMsgManager", "mMsgIdList is null or size == 0");
                }
                z = false;
                if (z) {
                    Log.m105920e("MicroMsg.WalletOfflineMsgManager", "onReceiveMsg msg id is exist in list:" + j);
                    return;
                }
                Map<String, String> parseXml = XmlParser.parseXml(str2, "sysmsg", (String) null);
                if (parseXml != null) {
                    str = parseXml.get(".sysmsg.paymsg.ack_key");
                    i = Util.getInt(parseXml.get(".sysmsg.paymsg.PayMsgType"), -1);
                } else {
                    str = null;
                    i = -1;
                }
                if (i == 51) {
                    Log.m105924i("MicroMsg.WalletOfflineMsgManager", "receive hkoffline newxml msg");
                    ((C76324c) C86312j.m106911c(cls)).handleHKOfflineNewXmlMsg(str2);
                } else {
                    boolean isUseCaseAlive = ((C76324c) C86312j.m106911c(cls)).isUseCaseAlive("offline");
                    Log.m105925i("MicroMsg.WalletOfflineMsgManager", "pos is enabled. PayMsgType is %d", Integer.valueOf(i));
                    if (i == 7 || i == 10) {
                        Ax0.mo106553h(str2);
                        Ax0.mo106546a(str2, false);
                    } else if (isUseCaseAlive) {
                        C76313t.C76317e eVar = null;
                        Map<String, String> parseXml2 = XmlParser.parseXml(str2, "sysmsg", (String) null);
                        if (parseXml2 != null) {
                            int i3 = Util.getInt(parseXml2.get(".sysmsg.paymsg.PayMsgType"), -1);
                            if (i3 == 20) {
                                eVar = new C76313t.C76323k(Ax0, parseXml2);
                            } else if (i3 == 5) {
                                eVar = Ax0.mo106550e(parseXml2);
                            } else if (i3 == 6) {
                                eVar = Ax0.mo106551f(parseXml2);
                            } else if (i3 == 8) {
                                eVar = Ax0.mo106552g(parseXml2);
                            } else if (i3 == 4) {
                                eVar = Ax0.mo106548c(parseXml2);
                            } else if (i3 == 23) {
                                eVar = Ax0.mo106549d(parseXml2);
                            } else if (i3 == 24) {
                                eVar = Ax0.mo106554i(parseXml2);
                            } else if (i3 == 42) {
                                eVar = new C76313t.C76316d(Ax0, parseXml2);
                            }
                            if (eVar != null) {
                                eVar.f223559a = i3;
                                eVar.f223560b = parseXml2.get(".sysmsg.paymsg.req_key");
                                eVar.f223561c = parseXml2.get(".sysmsg.paymsg.ack_key");
                                Ax0.mo106547b(eVar);
                            }
                        }
                    } else if (C30326g.m39029d(str, str2)) {
                        Log.m105924i("MicroMsg.WalletOfflineMsgManager", "process msg from push");
                        C115669n.INSTANCE.idkeyStat(135, 70, 1, true);
                        Ax0.mo106553h(str2);
                        Ax0.mo106546a(str2, false);
                    }
                }
                if (Ax0.f223554c.size() > 10) {
                    ArrayList<Long> arrayList2 = Ax0.f223554c;
                    arrayList2.remove(arrayList2.size() - 1);
                    Ax0.f223554c.add(0, Long.valueOf(j));
                    return;
                }
                Ax0.f223554c.add(0, Long.valueOf(j));
            }
        }
    }

    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        String g = C48374j0.m53718g(aVar.f94242a.f227631h);
        Log.m105918d("OfflinePayMsgListener", "OfflinePayMsg:" + g);
        C69963m.wx0().f201794h.post(new C32403a(this, g, aVar));
    }
}
