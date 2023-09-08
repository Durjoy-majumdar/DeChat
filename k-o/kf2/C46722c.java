package kf2;

import android.content.Intent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19636w0;
import java.util.Iterator;
import java.util.LinkedList;
import te3.C49699hg;
import te3.C49841ig;
import te3.C49913iy;
import te3.C50249le;
import te3.C50387me;
import te3.C51973xh;
import te3.C52116yh;
import te3.C52262zh;

/* renamed from: kf2.c */
public class C46722c {
    /* renamed from: a */
    public static String m52016a(C51973xh xhVar) {
        C52116yh yhVar;
        if (xhVar == null || (yhVar = xhVar.f144646d) == null || yhVar.f145298g == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<C52262zh> it = xhVar.f144646d.f145298g.iterator();
        while (it.hasNext()) {
            C52262zh next = it.next();
            sb.append(next.f145948d + "#" + next.f145951g + ";");
            LinkedList<C52262zh> linkedList = next.f145953i;
            if (linkedList != null) {
                Iterator<C52262zh> it4 = linkedList.iterator();
                while (it4.hasNext()) {
                    C52262zh next2 = it4.next();
                    sb.append(next2.f145948d + "#" + next2.f145951g + ";");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    public static String m52017b(C49841ig igVar) {
        if (igVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<C49699hg> it = igVar.f135306d.iterator();
        while (it.hasNext()) {
            C49699hg next = it.next();
            C49913iy iyVar = next.f134602d;
            if (iyVar != null) {
                long j = (long) iyVar.f135739d;
                C50387me meVar = next.f134607i;
                if (meVar == null) {
                    sb.append(j);
                    sb.append(";");
                } else {
                    LinkedList<C50249le> linkedList = meVar.f137969e;
                    if (linkedList != null) {
                        Iterator<C50249le> it4 = linkedList.iterator();
                        while (it4.hasNext()) {
                            sb.append(j);
                            sb.append("#");
                            sb.append(it4.next().f137339g);
                            sb.append(";");
                        }
                    }
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: c */
    public static void m52018c(String str, int i, int i2, int i3, long j, long j2, int i4, int i5, int i6, int i7, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, int i8) {
        Intent intent2 = intent;
        int intExtra = intent2 != null ? intent2.getIntExtra("Contact_Sub_Scene", 0) : 0;
        Log.m105919d("MicroMsg.Kv10298", "brandUsername:%s, scene:%s, subScene=%d, brandType:%d, dataType:%d, enterTimestamp:%d, exitTimestamp:%d isAttention:%d, originalCount:%d, fansCount:%d, bindWeappCount:%d, showArticleList:%s, showFuwuList:%s decryptUserName:%s, searchId:%s searchClickId:%s", str, Integer.valueOf(i), Integer.valueOf(intExtra), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) (j / 1000)), Integer.valueOf((int) (j2 / 1000)), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), str2, str3, str4, str6, str7);
        C115669n.INSTANCE.mo160131h(10298, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), str2, str3, str4, Integer.valueOf(C19636w0.f55626c), str5, str6, str7, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(intExtra), Integer.valueOf(i8));
    }
}
