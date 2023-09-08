package com.tencent.p014mm.plugin.rubbishbin;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.List;
import rk2.C110573a;
import rk2.C90000b;

/* renamed from: com.tencent.mm.plugin.rubbishbin.RubbishBinServiceImpl */
public class RubbishBinServiceImpl extends RubbishBinService {

    /* renamed from: n */
    public List<C90000b> f248889n = new ArrayList();

    /* renamed from: a */
    public void mo118737a(String str) {
        Log.m105920e("MicroMsg.RubbishBinServiceImpl", "RubbishBinServiceImpl.main() execute start = " + str);
        for (int i = 0; i < ((ArrayList) this.f248889n).size(); i++) {
            C90000b bVar = (C90000b) ((ArrayList) this.f248889n).get(i);
            if (bVar.mo124322a() == null || str == null) {
                Log.m105920e("MicroMsg.RubbishBinServiceImpl", "RubbishBinServiceImpl main() return, task.getExecuteTag() = " + bVar.mo124322a() + ", executeTag = " + str);
                return;
            }
            if (!bVar.mo124322a().equals(str)) {
                Log.m105920e("MicroMsg.RubbishBinServiceImpl", "task.getExecuteTag() =  " + bVar.mo124322a() + ", executeTag = " + str + ", does not equals");
            } else {
                bVar.mo124321D();
            }
        }
        Log.m105920e("MicroMsg.RubbishBinServiceImpl", "RubbishBinServiceImpl.main() execute end = " + str);
    }

    public void onCreate() {
        super.onCreate();
        ((ArrayList) this.f248889n).add(new C110573a());
    }
}
