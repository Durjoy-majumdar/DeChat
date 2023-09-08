package pc0;

import com.tencent.p014mm.plugin.zero.C72670r;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import f40.C86709a0;
import java.util.LinkedList;
import jc3.C76400h;
import kj2.C117407d;
import qe3.C101130q0;
import te3.C50886px;
import te3.C51024qx;

/* renamed from: pc0.v */
public class C118021v implements MTimerHandler.CallBack {

    /* renamed from: d */
    public int f352802d = 0;

    /* renamed from: e */
    public long f352803e = 0;

    /* renamed from: f */
    public int f352804f = 0;

    /* renamed from: g */
    public final /* synthetic */ C118018u f352805g;

    public C118021v(C118018u uVar) {
        this.f352805g = uVar;
    }

    public boolean onTimerExpired() {
        C51024qx qxVar;
        LinkedList<C50886px> linkedList;
        int i;
        C72670r rVar = new C72670r();
        int i2 = 1;
        if (!C86709a0.m107522a()) {
            C118018u uVar = this.f352805g;
            Log.m105921e(uVar.f352778d, "syncRespHandler acc is not ready STOP :%s", uVar.f352795x);
            this.f352805g.f352795x = null;
            return false;
        }
        C118018u uVar2 = this.f352805g;
        if (uVar2.f352793v) {
            C76400h hVar = rVar.f211433a;
            if (hVar != null) {
                hVar.mo96081b(uVar2);
            }
            this.f352805g.f352795x = null;
            return false;
        }
        C101130q0 q0Var = uVar2.f352795x;
        if (q0Var == null || (qxVar = q0Var.f296025a.f299846e) == null || (linkedList = qxVar.f140594e) == null) {
            Log.m105921e(uVar2.f352778d, "syncRespHandler CmdList is null! Stop Processing :%s", q0Var);
            C118018u uVar3 = this.f352805g;
            C76400h hVar2 = rVar.f211433a;
            if (hVar2 != null) {
                hVar2.mo96081b(uVar3);
            }
            this.f352805g.f352795x = null;
            return false;
        }
        rVar.mo100128b(uVar2);
        this.f352804f++;
        long nowMilliSecond = Util.nowMilliSecond();
        for (int i3 = 0; i3 < 5; i3++) {
            if (this.f352802d < linkedList.size()) {
                Log.m105927v(this.f352805g.f352778d, "syncRespHandler i:%d curidx:%d size:%d cmdid:%d cmdbuf:%d", Integer.valueOf(i3), Integer.valueOf(this.f352802d), Integer.valueOf(linkedList.size()), Integer.valueOf(linkedList.get(this.f352802d).f140037d), Integer.valueOf(linkedList.get(this.f352802d).f140038e.f140572d));
                i = 4;
                if (!rVar.mo100129c(this.f352805g, this.f352802d, linkedList.size(), linkedList.get(this.f352802d), false)) {
                    Log.m105929w(this.f352805g.f352778d, "DoCmd Failed index:%d", Integer.valueOf(this.f352802d));
                }
                this.f352802d++;
            } else {
                i = 4;
            }
            if (this.f352802d >= linkedList.size()) {
                this.f352803e += Util.milliSecondsToNow(nowMilliSecond);
                long milliSecondsToNow = Util.milliSecondsToNow(this.f352805g.f352796y);
                String str = this.f352805g.f352778d;
                Object[] objArr = new Object[6];
                objArr[0] = Integer.valueOf(this.f352802d);
                objArr[1] = Integer.valueOf(linkedList.size());
                objArr[2] = Long.valueOf(milliSecondsToNow);
                objArr[3] = Long.valueOf(this.f352803e);
                objArr[i] = Integer.valueOf(this.f352804f);
                objArr[5] = this.f352805g.f352795x;
                Log.m105925i(str, "syncRespHandler process DONE idx:%d size:%d time[%d,%d] count:%d %s", objArr);
                C118018u uVar4 = this.f352805g;
                uVar4.mo182790k1(uVar4.f352795x);
                rVar.mo100127a(this.f352805g);
                int i4 = (int) this.f352803e;
                int[] iArr = new int[i];
                // fill-array-data instruction
                iArr[0] = 100;
                iArr[1] = 300;
                iArr[2] = 1000;
                iArr[3] = 3000;
                Integer[] numArr = new Integer[5];
                numArr[0] = 240;
                numArr[1] = Integer.valueOf(WXWebReporter.WXXWEB_PRE_DOWN_ARM64_SUC);
                numArr[2] = Integer.valueOf(WXWebReporter.WXXWEB_PRE_DOWN_ARM32_SUC);
                numArr[3] = 237;
                numArr[i] = 236;
                int nullAsNil = Util.nullAsNil((Integer) C117407d.m165560t(i4, iArr, numArr));
                C117407d dVar = C117407d.INSTANCE;
                C117407d dVar2 = dVar;
                dVar2.idkeyStat(99, (long) nullAsNil, 1, false);
                Integer[] numArr2 = new Integer[7];
                numArr2[0] = 249;
                numArr2[1] = Integer.valueOf(WXWebReporter.KEY_TRY_FIX_DEX_FAILED);
                numArr2[2] = 247;
                numArr2[3] = Integer.valueOf(WXWebReporter.KEY_NEW_FAILED_CANT_FIX);
                numArr2[i] = Integer.valueOf(WXWebReporter.KEY_FREQ_NEW_FAILED_15_TIMES);
                numArr2[5] = 244;
                numArr2[6] = 243;
                dVar2.idkeyStat(99, (long) Util.nullAsNil((Integer) C117407d.m165560t(linkedList.size(), new int[]{0, 1, 2, 3, 5, 10}, numArr2)), 1, false);
                C117407d dVar3 = dVar;
                dVar3.idkeyStat(99, CrashReportFactory.foreground ? 241 : 242, 1, false);
                dVar3.idkeyStat(99, (long) this.f352805g.f352789r, 1, false);
                dVar3.idkeyStat(99, 0, 1, false);
                Object[] objArr2 = new Object[8];
                objArr2[0] = Integer.valueOf(linkedList.size());
                objArr2[1] = Long.valueOf(milliSecondsToNow);
                objArr2[2] = Integer.valueOf(this.f352805g.f352789r);
                objArr2[3] = Integer.valueOf(this.f352805g.f352795x.f296025a.f299847f);
                objArr2[i] = Long.valueOf(this.f352803e);
                objArr2[5] = Integer.valueOf(this.f352804f);
                objArr2[6] = this.f352805g.f352794w;
                if (!CrashReportFactory.foreground) {
                    i2 = 2;
                }
                objArr2[7] = Integer.valueOf(i2);
                dVar.mo160131h(12063, objArr2);
                this.f352805g.f352795x = null;
                return false;
            }
            long milliSecondsToNow2 = Util.milliSecondsToNow(nowMilliSecond);
            if (milliSecondsToNow2 > 500) {
                String str2 = this.f352805g.f352778d;
                Object[] objArr3 = new Object[i];
                objArr3[0] = Long.valueOf(milliSecondsToNow2);
                objArr3[1] = Integer.valueOf(i3);
                objArr3[2] = Integer.valueOf(this.f352802d);
                objArr3[3] = this.f352805g.f352795x;
                Log.m105919d(str2, "syncRespHandler PAUSE by 500ms  time:%d  processcount:%d sum:%d ,%s", objArr3);
                this.f352803e += Util.milliSecondsToNow(nowMilliSecond);
                return true;
            }
        }
        this.f352803e += Util.milliSecondsToNow(nowMilliSecond);
        return true;
    }
}
