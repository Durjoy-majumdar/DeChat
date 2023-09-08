package vk2;

import bx0.C39846d;
import com.tencent.p014mm.plugin.scanner.model.C42906n;
import com.tencent.p014mm.sdk.platformtools.Log;
import cx0.C45215d;
import cx0.C45218e;
import f40.C86709a0;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C47465a;
import te3.C48990ce;

/* renamed from: vk2.e0 */
public final class C52947e0 implements C11385n, C45218e {

    /* renamed from: d */
    public final C39846d f147791d;

    /* renamed from: e */
    public C42906n f147792e;

    public C52947e0(C39846d dVar) {
        C87412m.m108594g(dVar, "uiComponent");
        this.f147791d = dVar;
        C86709a0.m107524d().mo123455a(1532, this);
    }

    /* renamed from: a */
    public void mo70691a(String str, String str2) {
        Log.m105925i("MicroMsg.ScanBoxWebData", "alvinluo requestDataFromServer requestId: %s, queryJson: %s", str, str2);
        if (!(str2 == null || str2.length() == 0)) {
            try {
                if (this.f147792e != null) {
                    C86709a0.m107524d().mo123458d(this.f147792e);
                }
                this.f147792e = new C42906n(str, str2, 1);
                C86709a0.m107524d().mo123460f(this.f147792e);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ScanBoxWebData", e, "alvinluo requestDataFromServer exception", new Object[0]);
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = str;
        String str3 = null;
        objArr[3] = yVar != null ? Integer.valueOf(yVar.getType()) : null;
        Log.m105925i("MicroMsg.ScanBoxWebData", "alvinluo onSceneEnd errType: %d, errCode: %d, errMsg: %s, scene type: %s", objArr);
        if (C87412m.m108589b(yVar, this.f147792e)) {
            C45215d o0 = this.f147791d.mo62492o0();
            C42906n nVar = this.f147792e;
            String str4 = "";
            if (nVar == null || (str2 = nVar.f116175d) == null) {
                str2 = str4;
            }
            if (nVar != null) {
                C47465a aVar = nVar.f116177f.f127056b.f127083a;
                C48990ce ceVar = aVar != null ? (C48990ce) aVar : null;
                if (ceVar != null) {
                    str3 = ceVar.f131673d;
                }
            }
            if (str3 != null) {
                str4 = str3;
            }
            o0.mo70692a(str2, i2, str, str4);
        }
    }
}
