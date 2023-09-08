package com.tencent.p014mm.modelgetchatroommsg;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72988o1;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.xweb.file.XVFSFile;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75871e;
import java.util.Iterator;
import java.util.LinkedList;
import kj2.C117407d;
import p788aj.C67053c;
import p788aj.C67054d;

/* renamed from: com.tencent.mm.modelgetchatroommsg.a */
public class C68109a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f195756d;

    /* renamed from: e */
    public final /* synthetic */ C68110b f195757e;

    public C68109a(C68110b bVar, String str) {
        this.f195757e = bVar;
        this.f195756d = str;
    }

    public void run() {
        C68110b bVar = this.f195757e;
        String str = this.f195756d;
        bVar.getClass();
        String str2 = "MicroMsg.GetChatroomMsgChecker";
        if (Util.isNullOrNil(str)) {
            Log.m105928w(str2, "[checkDirtyBlock] username is null!");
            return;
        }
        long a = C31543z5.m39451a();
        long j = a - 259200000;
        Log.m105924i(str2, "[checkDirtyBlock] serverTime:" + a + " beforeTime:" + j + " beforeTime format:" + C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, j / 1000) + "username:" + str);
        C75871e cU = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96101cU();
        C72988o1 v = cU.mo101216v(str);
        if (v != null && v.field_seqBlockInfo != null) {
            LinkedList<C67053c> linkedList = new LinkedList<>();
            C67054d dVar = v.field_seqBlockInfo;
            if (dVar != null) {
                Iterator<C67053c> it = dVar.f192605d.iterator();
                while (it.hasNext()) {
                    C67053c next = it.next();
                    if (next.f192604g <= j) {
                        linkedList.add(next);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("clear:");
            for (C67053c cVar : linkedList) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("[");
                String str3 = str;
                sb4.append(cVar.f192601d);
                sb.append(sb4.toString());
                sb.append(XVFSFile.PATH_SEPARATOR);
                sb.append(cVar.f192602e + "] time:");
                sb.append(C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, cVar.f192604g / 1000));
                sb.append(APLogFileUtil.SEPARATOR_LOG);
                v.field_seqBlockInfo.f192605d.remove(cVar);
                str2 = str2;
                str = str3;
            }
            String str4 = str;
            String str5 = str2;
            sb.append("\nafter:");
            Iterator<C67053c> it4 = v.field_seqBlockInfo.f192605d.iterator();
            while (it4.hasNext()) {
                C67053c next2 = it4.next();
                sb.append("[" + next2.f192601d);
                sb.append(XVFSFile.PATH_SEPARATOR);
                sb.append(next2.f192602e + "] time:");
                sb.append(C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, next2.f192604g / 1000));
                sb.append(APLogFileUtil.SEPARATOR_LOG);
                it4 = it4;
                cU = cU;
            }
            C75871e eVar = cU;
            if (linkedList.size() > 0) {
                long E = eVar.mo101203E(v);
                Log.m105924i(str5, "[checkDirtyBlock] ret:" + E + " result:" + sb.toString());
            }
            int size = linkedList.size();
            int size2 = v.field_seqBlockInfo.f192605d.size();
            Log.m105925i("MicroMsg.GetChatroomReporter", "[report] chatroomId:%s cleanCount:%s count:%s ", str4, Integer.valueOf(size), Integer.valueOf(size2));
            if (size > 0) {
                C117407d dVar2 = C117407d.INSTANCE;
                dVar2.idkeyStat(403, 67, 1, true);
                dVar2.idkeyStat(403, 68, (long) size, true);
            }
            C117407d dVar3 = C117407d.INSTANCE;
            dVar3.idkeyStat(403, 70, (long) size2, true);
            if (size2 <= 5) {
                dVar3.idkeyStat(403, 71, 1, true);
            } else if (size2 <= 10) {
                dVar3.idkeyStat(403, 72, 1, true);
            } else if (size2 <= 20) {
                dVar3.idkeyStat(403, 73, 1, true);
            } else if (size2 <= 30) {
                dVar3.idkeyStat(403, 74, 1, true);
            } else if (size2 <= 50) {
                dVar3.idkeyStat(403, 75, 1, true);
            } else {
                dVar3.idkeyStat(403, 76, 1, true);
            }
        }
    }
}
