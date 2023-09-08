package fa2;

import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1828u;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import p213oh.C11412b;

/* renamed from: fa2.a */
public class C58934a {
    /* renamed from: a */
    public static int m68807a(int i) {
        Log.m105924i("MicroMsg.Audio.AudioPlayIdKeyReport", "getQQAudioPlayerErrIdKey, errCode:" + i);
        switch (i) {
            case 702:
                return 98;
            case 703:
                return 99;
            case 704:
                return 100;
            case 705:
                return 101;
            case 706:
                return 102;
            case 707:
                return 103;
            case 708:
                return 104;
            case 709:
                return 105;
            case 710:
                return 106;
            case 711:
                return 107;
            case 712:
                return 108;
            case 713:
                return 119;
            case C1828u.CTRL_INDEX:
                return 120;
            case 715:
                return 109;
            case 716:
                return 110;
            default:
                return 115;
        }
    }

    /* renamed from: b */
    public static void m68808b(ArrayList<IDKey> arrayList) {
        StringBuilder sb = new StringBuilder();
        sb.append("idkeyGroupStat:  id:688");
        Iterator<IDKey> it = arrayList.iterator();
        while (it.hasNext()) {
            IDKey next = it.next();
            sb.append(", key:" + next.GetKey() + " value:" + next.GetValue());
        }
        String sb4 = sb.toString();
        int i = C11412b.f33577a;
        Log.m105919d("MicroMsg.Audio.AudioPlayIdKeyReport", sb4, (Object[]) null);
    }
}
