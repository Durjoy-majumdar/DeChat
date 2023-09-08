package ud3;

import a70.C112760b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C85802w1;
import com.tencent.p014mm.vfs.VFSStrategy;
import di3.C86312j;
import f12.C7970a;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import jr2.C99015i;
import kd0.C76552z;
import ob0.C77002r;

/* renamed from: ud3.b */
public class C90644b implements Runnable {
    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        boolean[] zArr = C90645c.f260410a;
        if (!zArr[5] && !C90645c.m113611a(C112760b.m154253y())) {
            C115669n.INSTANCE.mo175911u(951, 5);
            zArr[5] = true;
        }
        if (!zArr[7] && !C90645c.m113611a(C112760b.m154239k())) {
            C115669n.INSTANCE.mo175911u(951, 7);
            zArr[7] = true;
        }
        if (!zArr[8] && !C90645c.m113611a(C112760b.m154234h0())) {
            C115669n.INSTANCE.mo175911u(951, 8);
            zArr[8] = true;
        }
        if (!zArr[9]) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107528h();
            sb.append(C86709a0.m107535s().f251806d);
            sb.append("emoji/");
            if (!C90645c.m113611a(sb.toString())) {
                C115669n.INSTANCE.mo175911u(951, 9);
                zArr[9] = true;
            }
        }
        if (!zArr[10]) {
            StringBuilder sb4 = new StringBuilder();
            C86709a0.m107528h();
            sb4.append(C86709a0.m107535s().f251806d);
            sb4.append("record/");
            if (!C90645c.m113611a(sb4.toString())) {
                C115669n.INSTANCE.mo175911u(951, 10);
                zArr[10] = true;
            }
        }
        if (!zArr[11] && !C90645c.m113611a(((C99015i) C86312j.m106911c(C99015i.class)).mo61935YO())) {
            C115669n.INSTANCE.mo175911u(951, 11);
            zArr[11] = true;
        }
        if (!zArr[12] && !C90645c.m113611a(C85802w1.m106019a())) {
            C115669n.INSTANCE.mo175911u(951, 12);
            zArr[12] = true;
        }
        if (!zArr[13] && !C90645c.m113611a(C7970a.m8127a())) {
            C115669n.INSTANCE.mo175911u(951, 13);
            zArr[13] = true;
        }
        if (!zArr[14] && !C90645c.m113611a(C7970a.m8128b())) {
            C115669n.INSTANCE.mo175911u(951, 14);
            zArr[14] = true;
        }
        if (!zArr[15]) {
            StringBuilder sb5 = new StringBuilder();
            C86709a0.m107528h();
            sb5.append(C86709a0.m107535s().f251806d);
            sb5.append("video/");
            if (!C90645c.m113611a(sb5.toString())) {
                C115669n.INSTANCE.mo175911u(951, 15);
                zArr[15] = true;
            }
        }
        if (!zArr[16]) {
            HashMap<String, WeakReference<C77002r>> hashMap = C76552z.f224074a;
            if (!C90645c.m113611a(VFSStrategy.m163776d("voice") + "/")) {
                C115669n.INSTANCE.mo175911u(951, 16);
                zArr[16] = true;
            }
        }
        if (!zArr[17]) {
            HashMap<String, WeakReference<C77002r>> hashMap2 = C76552z.f224074a;
            if (!C90645c.m113611a(VFSStrategy.m163776d("voice2") + "/")) {
                C115669n.INSTANCE.mo175911u(951, 17);
                zArr[17] = true;
            }
        }
        if (!zArr[18]) {
            StringBuilder sb6 = new StringBuilder();
            C86709a0.m107528h();
            sb6.append(C86709a0.m107535s().f251806d);
            sb6.append("dbback/");
            if (!C90645c.m113611a(sb6.toString())) {
                C115669n.INSTANCE.mo175911u(951, 18);
                zArr[18] = true;
            }
        }
        if (!zArr[19]) {
            StringBuilder sb7 = new StringBuilder();
            C86709a0.m107528h();
            sb7.append(C86709a0.m107535s().f251806d);
            sb7.append("mailapp/");
            if (!C90645c.m113611a(sb7.toString())) {
                C115669n.INSTANCE.mo175911u(951, 19);
                zArr[19] = true;
            }
        }
        if (!zArr[20]) {
            StringBuilder sb8 = new StringBuilder();
            C86709a0.m107528h();
            sb8.append(C86709a0.m107535s().f251806d);
            sb8.append("openim/");
            if (!C90645c.m113611a(sb8.toString())) {
                C115669n.INSTANCE.mo175911u(951, 20);
                zArr[20] = true;
            }
        }
        Log.m105918d("MicroMsg.SdcardCheckUtil", "check time:" + (System.currentTimeMillis() - currentTimeMillis) + "");
    }
}
