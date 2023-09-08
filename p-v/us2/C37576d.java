package us2;

import android.content.Context;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import java.util.Map;
import org.json.JSONObject;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import sx3.C90364q0;

/* renamed from: us2.d */
public final class C37576d {

    /* renamed from: a */
    public static final C13601g f99662a = C36568h.m40985a(C37578b.f99663d);

    /* renamed from: us2.d$a */
    public interface C37577a {
        /* renamed from: a */
        void mo61213a(JSONObject jSONObject, Context context, C32227p<? super String, ? super Map<String, ? extends Object>, C13598b0> pVar);
    }

    /* renamed from: us2.d$b */
    public static final class C37578b extends C87413o implements C32224a<Map<String, C37577a>> {

        /* renamed from: d */
        public static final C37578b f99663d = new C37578b();

        public C37578b() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdJsApiPool$jsapiMap$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdJsApiPool$jsapiMap$2");
            Map g = C90364q0.m113148g(new C13604l("controlFloatComponent", C102076e.f300590a));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdJsApiPool$jsapiMap$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdJsApiPool$jsapiMap$2");
            return g;
        }
    }
}
