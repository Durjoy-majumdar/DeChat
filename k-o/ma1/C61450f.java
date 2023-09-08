package ma1;

import android.os.Build;
import com.tencent.p014mm.autogen.mmdata.rpt.ExptAppReportStruct;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kj2.C117407d;
import oa1.C61982a;
import oa1.C61983b;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p156gj.C87203t;
import te3.C64304d02;
import te3.C64335e02;
import te3.C64361fa0;
import te3.C64673r40;

/* renamed from: ma1.f */
public class C61450f extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f174755d;

    /* renamed from: e */
    public int f174756e;

    /* renamed from: f */
    public int f174757f = 1;

    public C61450f(int i) {
        int i2 = 1;
        this.f174756e = i;
        this.f174757f = i == 3 ? 0 : i2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f174755d = nVar;
        long currentTicks = Util.currentTicks();
        try {
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new C64304d02();
            bVar.f127067b = new C64335e02();
            bVar.f127068c = "/cgi-bin/mmfddataappsvr/getexptappconfig";
            bVar.f127069d = 1110;
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            C47350c a = bVar.mo72403a();
            C64304d02 d022 = (C64304d02) a.f127055a.f127080a;
            d022.f182624e = this.f174756e;
            d022.f182623d = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GET_EXPT_APP_LAST_TIME_SEC_INT, 0)).intValue();
            d022.f182625f = mo86421k1();
            d022.f182628i = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GET_EXPT_APP_GLOBAL_SEQ_STRING, "");
            if (!C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_NEXT_GET_EXPT_APP_IS_INCREMENT_BOOLEAN, true)) {
                this.f174757f = 0;
            }
            d022.f182627h = this.f174757f;
            LinkedList<C64361fa0> j1 = mo86420j1();
            int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GET_EXPT_APP_NEED_LOCAL_LIST_INT, 1)).intValue();
            if (intValue == 1 || d022.f182627h == 0) {
                d022.f182626g = j1;
            }
            C117407d dVar = C117407d.INSTANCE;
            dVar.idkeyStat(863, 155, 1, false);
            if (this.f174757f == 0) {
                dVar.idkeyStat(863, 166, 1, false);
            } else {
                dVar.idkeyStat(863, 167, 1, false);
            }
            Object[] objArr = new Object[8];
            objArr[0] = Integer.valueOf(d022.f182624e);
            objArr[1] = Integer.valueOf(d022.f182623d);
            objArr[2] = Integer.valueOf(d022.f182627h);
            objArr[3] = d022.f182628i;
            objArr[4] = Integer.valueOf(intValue);
            objArr[5] = Integer.valueOf(j1.size());
            LinkedList<C64361fa0> linkedList = d022.f182626g;
            objArr[6] = Integer.valueOf(linkedList != null ? linkedList.size() : 0);
            objArr[7] = Long.valueOf(Util.ticksToNow(currentTicks));
            Log.m105925i("MicroMsg.NetSceneGetExptApp", "get expt app scene[%d] lastGetSvrSec[%d] IsIncrement[%d] GlobalSequence[%s] nextReqNeedLocalList[%d] localExptList[%d %d] cost[%d]", objArr);
            return dispatch(gVar, a, this);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.NetSceneGetExptApp", e, "", new Object[0]);
            return -1;
        }
    }

    public int getType() {
        return 1110;
    }

    /* renamed from: j1 */
    public final LinkedList<C64361fa0> mo86420j1() {
        long currentTicks = Util.currentTicks();
        LinkedList<C64361fa0> linkedList = new LinkedList<>();
        List<C61982a> a = C61983b.m72724e().mo86866a();
        StringBuilder sb = new StringBuilder(4096);
        ArrayList arrayList = (ArrayList) a;
        if (arrayList.size() > 0) {
            ExptAppReportStruct exptAppReportStruct = new ExptAppReportStruct();
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                C61982a aVar = (C61982a) it.next();
                if (aVar != null) {
                    C64361fa0 fa02 = new C64361fa0();
                    int i2 = aVar.f176193a;
                    fa02.f183095d = i2;
                    fa02.f183096e = aVar.f176194b;
                    int i3 = aVar.f176195c;
                    fa02.f183097f = i3;
                    fa02.f183100i = aVar.f176201i;
                    exptAppReportStruct.f155010d = i2;
                    exptAppReportStruct.f155011e = i3;
                    exptAppReportStruct.f155012f = 1;
                    exptAppReportStruct.mo86055o();
                    linkedList.add(fa02);
                    if (i >= 100) {
                        Log.m105925i("MicroMsg.NetSceneGetExptApp", "req local expt app List [%s]", sb);
                        sb.setLength(0);
                        i = 0;
                    }
                    sb.append("{Id: " + aVar.f176193a + " group: " + aVar.f176194b + " seq: " + aVar.f176195c + "}");
                    sb.append(";");
                    i++;
                }
            }
        }
        Log.m105925i("MicroMsg.NetSceneGetExptApp", "req local expt app List [%s] cost[%d]", sb, Long.valueOf(Util.ticksToNow(currentTicks)));
        return linkedList;
    }

    /* renamed from: k1 */
    public final C64673r40 mo86421k1() {
        C64673r40 r402 = new C64673r40();
        r402.f185120d = Build.MANUFACTURER;
        r402.f185121e = C87203t.m108275k();
        String str = Build.VERSION.SDK_INT + "";
        r402.f185122f = str;
        String str2 = Build.CPU_ABI;
        r402.f185123g = str2;
        Log.m105925i("MicroMsg.NetSceneGetExptApp", "create Device type manufacturer[%s] model[%s] os_api[%s] cpu[%s]", r402.f185120d, r402.f185121e, str, str2);
        return r402;
    }

    /* renamed from: l1 */
    public final void mo86422l1(int i) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_GET_EXPT_APP_LAST_TIME_SEC_INT;
        int nowSecond = (int) Util.nowSecond();
        if (nowSecond > i) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(nowSecond));
        } else {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(i));
        }
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (i2 == 0 && i3 == 0) {
            C64335e02 e022 = (C64335e02) ((C47350c) uVar).f127056b.f127083a;
            int i4 = 0;
            if (e022 != null && e022.BaseResponse.f135955d == 0) {
                ArrayList arrayList = new ArrayList();
                LinkedList<C64361fa0> linkedList = e022.f182910h;
                if (linkedList != null && linkedList.size() > 0) {
                    Iterator<C64361fa0> it = e022.f182910h.iterator();
                    while (it.hasNext()) {
                        C61982a aVar = new C61982a();
                        aVar.mo86862a(it.next().f183098g);
                        arrayList.add(aVar);
                    }
                }
                C117543a.Cx0().Ox0(e022.f182908f, e022.f182909g, arrayList);
                mo86422l1(e022.f182906d);
                int i5 = e022.f182907e;
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GET_EXPT_APP_INTERVAL_SEC_INT, Integer.valueOf(i5));
                int i6 = e022.f182911i;
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GET_EXPT_APP_NEED_LOCAL_LIST_INT, Integer.valueOf(i6));
                String str2 = e022.f182912j;
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GET_EXPT_APP_GLOBAL_SEQ_STRING, str2);
                Object[] objArr = new Object[5];
                objArr[0] = Integer.valueOf(i5);
                objArr[1] = Integer.valueOf(i6);
                objArr[2] = str2;
                objArr[3] = Integer.valueOf(arrayList.size());
                LinkedList<Integer> linkedList2 = e022.f182909g;
                if (linkedList2 != null) {
                    i4 = linkedList2.size();
                }
                objArr[4] = Integer.valueOf(i4);
                Log.m105925i("MicroMsg.NetSceneGetExptApp", "updateExpt interval[%d] nextReqNeedLocalList[%d] globalSeq[%s] updateList[%d] deleteList[%d]", objArr);
                i4 = 1;
            }
            if (i4 != 0) {
                C117407d.INSTANCE.idkeyStat(863, 156, 1, false);
                if (this.f174757f == 0) {
                    C117543a.Cx0().Jx0(true);
                }
            } else {
                C117407d.INSTANCE.idkeyStat(863, 157, 1, false);
            }
        } else {
            Log.m105928w("MicroMsg.NetSceneGetExptApp", "get expt error");
            mo86422l1((int) Util.nowSecond());
            C117407d.INSTANCE.idkeyStat(863, 157, 1, false);
        }
        this.f174755d.onSceneEnd(i2, i3, str, this);
    }
}
