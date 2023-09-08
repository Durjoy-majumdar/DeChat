package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.eclipsesource.mmv8.C80135V8;
import com.tencent.p014mm.appbrand.p942v8.C80658e;
import fy3.C32224a;
import gy3.C87413o;
import org.json.JSONObject;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.z */
public abstract class C84881z {

    /* renamed from: a */
    public final C13601g f247400a = C36568h.m40985a(new C84882a(this));

    /* renamed from: b */
    public final C13601g f247401b = C36568h.m40985a(C84883b.f247403d);

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.z$a */
    public static final class C84882a extends C87413o implements C32224a<JSONObject> {

        /* renamed from: d */
        public final /* synthetic */ C84881z f247402d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84882a(C84881z zVar) {
            super(0);
            this.f247402d = zVar;
        }

        public Object invoke() {
            JSONObject jSONObject = new JSONObject();
            try {
                this.f247402d.getClass();
                jSONObject.put("v8Flag", "");
                jSONObject.put("keepCompiledData", C84831a0.f247292a);
                C80658e.m98344a();
                jSONObject.put("mmv8Version", C80135V8.getV8Version());
                jSONObject.put("compress", false);
                jSONObject.put("snapshotHarmonyShippingFeatures", true);
                jSONObject.put("v8Debug", false);
                jSONObject.put("mmj2v8Version", "1.0.12");
            } catch (Exception unused) {
            }
            return jSONObject;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.z$b */
    public static final class C84883b extends C87413o implements C32224a<JSONObject> {

        /* renamed from: d */
        public static final C84883b f247403d = new C84883b();

        public C84883b() {
            super(0);
        }

        public Object invoke() {
            JSONObject jSONObject = new JSONObject();
            try {
                C80658e.m98344a();
                jSONObject.put("mmnodeVersion", C80135V8.getNodeVersion());
            } catch (Exception unused) {
            }
            return jSONObject;
        }
    }
}
