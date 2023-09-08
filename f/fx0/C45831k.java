package fx0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.autogen.events.BizPreSearchEvent;
import com.tencent.p014mm.plugin.brandservice.p028ui.BizSearchDetailPageUI;
import com.tencent.p014mm.plugin.fts.p059ui.C41653i;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import te3.C48884bn2;
import te3.C50274lk;
import te3.C50750ox3;

/* renamed from: fx0.k */
public class C45831k {

    /* renamed from: fx0.k$a */
    public static class C45832a implements C11385n {

        /* renamed from: d */
        public Context f123740d;

        /* renamed from: e */
        public String f123741e;

        /* renamed from: f */
        public long f123742f;

        /* renamed from: g */
        public int f123743g;

        /* renamed from: h */
        public int f123744h;

        /* renamed from: i */
        public String f123745i;

        /* renamed from: j */
        public boolean f123746j;

        /* renamed from: n */
        public BizPreSearchEvent f123747n;

        public C45832a(Context context, String str, long j, int i, int i2, String str2, boolean z, BizPreSearchEvent bizPreSearchEvent) {
            this.f123740d = context;
            this.f123741e = str;
            this.f123742f = j;
            this.f123743g = i;
            this.f123744h = i2;
            this.f123745i = str2;
            this.f123746j = z;
            this.f123747n = bizPreSearchEvent;
        }

        /* renamed from: a */
        public final void mo71299a(boolean z) {
            Runnable runnable;
            C86709a0.m107524d().mo123470p(WXWebReporter.WXWEB_IDKEY_FR_PDF_ID, this);
            BizPreSearchEvent bizPreSearchEvent = this.f123747n;
            if (bizPreSearchEvent != null && (runnable = bizPreSearchEvent.f107375d.f107383g) != null) {
                bizPreSearchEvent.f107376e.f107384a = z;
                ((C41653i) runnable).run();
            }
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            Log.m105925i("MicroMsg.BrandService.BrandServiceLogic", "errType (%d) , errCode (%d) , errMsg (errMsg)", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i != 0 || i2 != 0) {
                mo71299a(false);
            } else if (yVar == null) {
                Log.m105920e("MicroMsg.BrandService.BrandServiceLogic", "scene is null.");
                mo71299a(false);
            } else if (yVar.getType() != 1071) {
                Log.m105924i("MicroMsg.BrandService.BrandServiceLogic", "The NetScene is not a instanceof BizSearchDetailPage.");
            } else {
                Log.m105924i("MicroMsg.BrandService.BrandServiceLogic", "BizSearchDetailPage.");
                C50750ox3 ox32 = ((C45841u) yVar).f123776f;
                C50274lk lkVar = ox32 == null ? null : ox32.f139435d;
                if (lkVar == null || lkVar.f137472h == null) {
                    Log.m105920e("MicroMsg.BrandService.BrandServiceLogic", "response or BusinessContent or itemList is null.");
                    mo71299a(false);
                    return;
                }
                Log.m105919d("MicroMsg.BrandService.BrandServiceLogic", "searchId : %s.", lkVar.f137474j);
                Intent intent = new Intent(this.f123740d, BizSearchDetailPageUI.class);
                intent.putExtra("addContactScene", 35);
                intent.putExtra("fromScene", this.f123744h);
                intent.putExtra("keyword", this.f123741e);
                intent.putExtra("businessType", this.f123742f);
                intent.putExtra("offset", this.f123743g);
                intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f123745i);
                intent.putExtra("showEditText", this.f123746j);
                try {
                    intent.putExtra("result", lkVar.toByteArray());
                    if (!(this.f123740d instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    mo71299a(true);
                } catch (Exception e) {
                    mo71299a(false);
                    Log.printErrStackTrace("MicroMsg.BrandService.BrandServiceLogic", e, "", new Object[0]);
                }
            }
        }
    }

    /* renamed from: a */
    public static C48884bn2 m51131a() {
        try {
            C86709a0.m107528h();
            String str = (String) C86709a0.m107535s().mo121142i().mo119684e(67591, (Object) null);
            if (str != null) {
                C48884bn2 bn22 = new C48884bn2();
                String[] split = str.split(",");
                bn22.f131221f = Integer.valueOf(split[0]).intValue();
                bn22.f131224i = Integer.valueOf(split[1]).intValue();
                bn22.f131220e = ((float) Integer.valueOf(split[2]).intValue()) / 1000000.0f;
                bn22.f131219d = ((float) Integer.valueOf(split[3]).intValue()) / 1000000.0f;
                Log.m105925i("MicroMsg.BrandService.BrandServiceLogic", "lbs location is not null, %f, %f", Float.valueOf(bn22.f131220e), Float.valueOf(bn22.f131219d));
                return bn22;
            }
            Log.m105924i("MicroMsg.BrandService.BrandServiceLogic", "lbs location is null, lbsContent is null!");
            return null;
        } catch (Exception e) {
            Log.m105925i("MicroMsg.BrandService.BrandServiceLogic", "lbs location is null, reason %s", e.getMessage());
            return null;
        }
    }
}
