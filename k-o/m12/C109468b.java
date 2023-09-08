package m12;

import android.os.Looper;
import com.tencent.p014mm.plugin.ipcall.IPCallManager;
import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.plugin.voip.model.v2protocal;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.LinkedList;
import k12.C108828c;
import pe3.C89349b;
import t12.C110899d;
import te3.C101851uq3;
import te3.C101858vq3;
import te3.C50550ni3;
import te3.mv4;
import z33.C112597j;

/* renamed from: m12.b */
public class C109468b {

    /* renamed from: a */
    public v2protocal f327640a = new v2protocal(this.f327641b);

    /* renamed from: b */
    public MMHandler f327641b = new C109467a(this, Looper.getMainLooper());

    /* renamed from: c */
    public boolean f327642c = false;

    /* renamed from: d */
    public boolean f327643d = false;

    /* renamed from: e */
    public boolean f327644e = false;

    /* renamed from: f */
    public C109469a f327645f = null;

    /* renamed from: m12.b$a */
    public interface C109469a {
    }

    /* renamed from: a */
    public static void m148687a(C109468b bVar, int i) {
        bVar.getClass();
        Log.m105918d("MicroMsg.IPCallEngineManager", "channel connect failed!");
        C109469a aVar = bVar.f327645f;
        if (aVar != null) {
            ((IPCallManager) aVar).mo150064g(i);
        }
    }

    /* renamed from: b */
    public void mo160703b() {
        if (this.f327642c) {
            Log.m105918d("MicroMsg.IPCallEngineManager", "requestChannelConnect, already request channel connect");
            return;
        }
        Log.m105924i("MicroMsg.IPCallEngineManager", "requestChannelConnect");
        C108828c cVar = C105385g.Gx0().f313260u;
        if (cVar != null) {
            LinkedList<C50550ni3> linkedList = cVar.f325884B;
            if (linkedList != null) {
                C110899d.m151194h(linkedList);
                C110899d.m151194h(cVar.f325885C);
                mv4 mv4 = new mv4();
                mv4.f332178d = 0;
                mv4.f332179e = 0;
                mv4.f332180f = 0;
                mv4.f332181g = "";
                mv4.f332182h = "";
            }
            Log.m105918d("MicroMsg.IPCallEngineManager", "finish set svr addr");
            v2protocal v2protocal = this.f327640a;
            v2protocal.f317680v = cVar.f325918w;
            v2protocal.f317619a1 = cVar.f325921z;
            C89349b bVar = cVar.f325883A;
            if (bVar != null) {
                v2protocal.f317622b1 = bVar.mo123703f();
            }
            C89349b bVar2 = cVar.f325919x;
            if (bVar2 != null) {
                this.f327640a.f317683w = bVar2.mo123703f();
            }
            v2protocal v2protocal2 = this.f327640a;
            int i = cVar.f325896a;
            v2protocal2.f317656n = i;
            long j = cVar.f325897b;
            v2protocal2.f317665q = j;
            int i2 = cVar.f325906k;
            v2protocal2.f317662p = i2;
            int i3 = cVar.f325916u;
            v2protocal2.f317692z = i3;
            int i4 = cVar.f325917v;
            v2protocal2.f317689y = i4;
            int i5 = cVar.f325886D;
            v2protocal2.f317548A = i5;
            byte[] bArr = v2protocal2.f317683w;
            int configInfo = v2protocal2.setConfigInfo(v2protocal2.f317653m, (long) i, i2, 0, j, v2protocal2.field_peerId, 1, i4, i3, v2protocal2.f317680v, bArr == null ? 0 : bArr.length, bArr, i5, 0, 0, v2protocal2.f317619a1, v2protocal2.f317622b1, 255, 0, 0, 0, (byte[]) null, 0, (byte[]) null, 0, 0, 0, 0, "", "", "");
            Log.m105919d("MicroMsg.IPCallEngineManager", "setConfigInfo, ret: %d", Integer.valueOf(configInfo));
            if (configInfo == 0) {
                C101851uq3 uq32 = new C101851uq3();
                uq32.f299626d = 0;
                uq32.f299627e = "";
                uq32.f299628f = "";
                uq32.f299629g = 4;
                uq32.f299630h = 4;
                uq32.f299631i = 2;
                uq32.f299632j = C110899d.m151194h(cVar.f325884B);
                uq32.f299633n = C110899d.m151194h(cVar.f325885C);
                C101858vq3 vq32 = new C101858vq3();
                vq32.f299682d = 1;
                LinkedList<C101851uq3> linkedList2 = new LinkedList<>();
                vq32.f299683e = linkedList2;
                linkedList2.add(uq32);
                try {
                    this.f327640a.f317664p1 = vq32.toByteArray();
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.IPCallEngineManager", "relay conn info to byte array fail..");
                }
                v2protocal v2protocal3 = this.f327640a;
                byte[] bArr2 = v2protocal3.f317664p1;
                if (bArr2 == null) {
                    C112597j.m153937b("MicroMsg.IPCallEngineManager", "relay conns buf null");
                    C109469a aVar = this.f327645f;
                    if (aVar != null) {
                        ((IPCallManager) aVar).mo150064g(21);
                    }
                } else {
                    int AddNewRelayConns = v2protocal3.AddNewRelayConns(bArr2, bArr2.length, 0, false);
                    if (AddNewRelayConns < 0) {
                        C112597j.m153937b("MicroMsg.IPCallEngineManager", "add relayconns err:" + AddNewRelayConns);
                        C109469a aVar2 = this.f327645f;
                        if (aVar2 != null) {
                            ((IPCallManager) aVar2).mo150064g(21);
                        }
                    }
                }
            } else if (configInfo < 0) {
                Log.m105921e("MicroMsg.IPCallEngineManager", "setConfigInfo failed, ret: %d", Integer.valueOf(configInfo));
                C109469a aVar3 = this.f327645f;
                if (aVar3 != null) {
                    ((IPCallManager) aVar3).mo150064g(21);
                }
            }
            this.f327642c = true;
        }
    }

    /* renamed from: c */
    public void mo160704c(int i) {
        if (this.f327643d) {
            Log.m105919d("MicroMsg.IPCallEngineManager", "setDtmfPayloadType: %d", Integer.valueOf(i));
            int SetDTMFPayload = this.f327640a.SetDTMFPayload(i);
            if (SetDTMFPayload < 0) {
                Log.m105925i("MicroMsg.IPCallEngineManager", "setDtmfPayloadType failed, ret: %d", Integer.valueOf(SetDTMFPayload));
            }
        }
    }
}
