package kr0;

import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.appbrand.p942v8.C80681o;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import gu0.C87384a;
import gu0.C87393g;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p774zg.C91735n0;
import p963fc.C86812g;

public class e$$b extends C87384a {

    /* renamed from: kr0.e$$b$a */
    public class C88268a extends C87393g {
        public C88268a(C91735n0 n0Var) {
            super(n0Var);
        }

        /* renamed from: e */
        public void mo112515e(int i, C80669j jVar) {
            if ((e$$b.this.f245476a.getRuntime() instanceof C86812g) && ((C86812g) e$$b.this.f245476a.getRuntime()).mo113203h1()) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Log.m105925i("MicroMsg.V8WorkerManagerWC", "post report coverage task for appId:%s workerId:%d", e$$b.this.f245476a.getAppId(), Integer.valueOf(i));
                jVar.mo112500d("\n        ;(function() {\n            let data = (globalThis || {}).__coverage__;\n            if (typeof data === 'string' || typeof data === 'undefined') {\n                return data;\n            } else {\n                return JSON.stringify(data);\n            }\n        })();\n    ", new e$$b$a$$a(this, jVar, countDownLatch));
                try {
                    countDownLatch.await(3, TimeUnit.SECONDS);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.V8WorkerManagerWC", "post report coverage task for appId:%s workerId:%d latch await failed:%s", e$$b.this.f245476a.getAppId(), Integer.valueOf(i), e);
                } finally {
                    Log.m105925i("MicroMsg.V8WorkerManagerWC", "post report coverage task for appId:%s workerId:%d latch await end", e$$b.this.f245476a.getAppId(), Integer.valueOf(i));
                }
            }
            super.mo112515e(i, jVar);
        }
    }

    public e$$b(C88267e eVar, C81925i2 i2Var) {
        super(i2Var);
    }

    /* renamed from: b */
    public C80681o mo116724b() {
        return new C88268a(this.f245486k);
    }
}
