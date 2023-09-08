package ji0;

import com.tencent.p014mm.autogen.mmdata.rpt.WAPrefetchHitPkgStruct;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29324f;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import ii0.C87732a;
import rx3.C13598b0;

/* renamed from: ji0.a */
public final class C87965a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C87966b f254553d;

    /* renamed from: e */
    public final /* synthetic */ String f254554e;

    /* renamed from: f */
    public final /* synthetic */ String f254555f;

    /* renamed from: g */
    public final /* synthetic */ int f254556g;

    /* renamed from: h */
    public final /* synthetic */ int f254557h;

    /* renamed from: i */
    public final /* synthetic */ String f254558i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87965a(C87966b bVar, String str, String str2, int i, int i2, String str3) {
        super(0);
        this.f254553d = bVar;
        this.f254554e = str;
        this.f254555f = str2;
        this.f254556g = i;
        this.f254557h = i2;
        this.f254558i = str3;
    }

    public Object invoke() {
        C87966b bVar = this.f254553d;
        String str = this.f254554e;
        String str2 = this.f254555f;
        int i = this.f254556g;
        int i2 = this.f254557h;
        String str3 = this.f254558i;
        bVar.getClass();
        if (!(str2 == null || str2.length() == 0)) {
            C87967c cVar = new C87967c();
            cVar.field_appId = str2;
            cVar.field_version = i;
            cVar.field_packageType = i2;
            if (i2 == 6) {
                cVar.field_packageKey = str2;
            } else if (i2 == 12 || i2 == 13) {
                cVar.field_packageKey = "";
            } else {
                if (str3 == null) {
                    str3 = "";
                }
                cVar.field_packageKey = str3;
            }
            cVar.field_hitCount = 0;
            cVar.field_source = 0;
            cVar.field_reportId = 0;
            if (!bVar.get(cVar, new String[0])) {
                Log.m105924i("MicroMsg.AppBrand.PredownloadGetCodeStatStorage", "checkReportOnLocalPkg(" + bVar.mo122423jo(cVar) + "), not pre-downloaded before");
            } else {
                if (cVar.field_source == 1) {
                    boolean z = cVar.field_hitCount <= 0;
                    C87732a.INSTANCE.mo122144a(cVar.field_reportId, !z ? 57 : 56);
                    WAPrefetchHitPkgStruct wAPrefetchHitPkgStruct = new WAPrefetchHitPkgStruct();
                    wAPrefetchHitPkgStruct.f236520d = wAPrefetchHitPkgStruct.mo86045b("Username", ((C29324f) C81161g2.Bx0(C29324f.class)).mo56603qq(cVar.field_appId), true);
                    wAPrefetchHitPkgStruct.f236521e = wAPrefetchHitPkgStruct.mo86045b("Appid", cVar.field_appId, true);
                    wAPrefetchHitPkgStruct.f236522f = (long) cVar.field_version;
                    wAPrefetchHitPkgStruct.f236523g = z ? 1 : 0;
                    wAPrefetchHitPkgStruct.f236524h = (long) cVar.field_reportId;
                    wAPrefetchHitPkgStruct.f236525i = (long) cVar.field_packageType;
                    wAPrefetchHitPkgStruct.f236526j = wAPrefetchHitPkgStruct.mo86045b("ModuleName", cVar.field_packageKey, true);
                    wAPrefetchHitPkgStruct.f236527k = wAPrefetchHitPkgStruct.mo86045b("InstanceId", str, true);
                    wAPrefetchHitPkgStruct.mo86054n();
                }
                cVar.field_hitCount++;
                Log.m105924i("MicroMsg.AppBrand.PredownloadGetCodeStatStorage", "checkReportOnLocalPkg(" + bVar.mo122423jo(cVar) + "), update hitCount=" + cVar.field_hitCount + ", updated:" + bVar.update(cVar, new String[0]));
            }
        }
        return C13598b0.f38549a;
    }
}
