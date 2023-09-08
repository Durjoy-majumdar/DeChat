package eo0;

import android.app.Activity;
import co0.C80130d;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import do0.C86385b;
import java.util.HashMap;
import org.json.JSONObject;
import p225rc.C89922k;
import p918s2.C90111a;
import vk0.C90809a;
import vk0.C90815g;
import vk0.C90817j;
import wq0.C91085v;

/* renamed from: eo0.d */
public class C86625d extends C86622a implements C80130d {
    private static final int CTRL_INDEX = 806;
    public static final String NAME = "insertXWebCamera";

    /* renamed from: g */
    public boolean f251590g;

    /* renamed from: eo0.d$a */
    public class C86626a implements C90111a.C90113b {

        /* renamed from: d */
        public final /* synthetic */ C82381f f251591d;

        /* renamed from: e */
        public final /* synthetic */ C90815g f251592e;

        /* renamed from: f */
        public final /* synthetic */ C86627b f251593f;

        public C86626a(C82381f fVar, C90815g gVar, C86627b bVar) {
            this.f251591d = fVar;
            this.f251592e = gVar;
            this.f251593f = bVar;
        }

        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            if (i != 16) {
                return;
            }
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("cameraId", Integer.valueOf(this.f251592e.getCameraId()));
                String jSONObject = new JSONObject(hashMap).toString();
                C90817j jVar = new C90817j();
                jVar.mo115161k(this.f251591d);
                jVar.mo115163m(jSONObject);
                jVar.mo115158h();
                C90809a.C90811b.f260763a.f260759a = false;
                return;
            }
            C90809a.C90811b.f260763a.f260759a = true;
            C86625d.this.mo121050z(this.f251591d, this.f251592e, this.f251593f);
        }
    }

    /* renamed from: eo0.d$b */
    public interface C86627b {
    }

    /* renamed from: z */
    public final boolean mo121050z(C82381f fVar, C90815g gVar, C86627b bVar) {
        C91085v.m114266a(String.valueOf(fVar.getAppId()), new C86626a(fVar, gVar, bVar));
        Activity activity = (Activity) fVar.getContext();
        if (activity == null) {
            return false;
        }
        boolean b = C89922k.m112465b(activity, fVar, "android.permission.WRITE_EXTERNAL_STORAGE");
        C90809a.C90811b.f260763a.getClass();
        Log.m105925i("MicroMsg.AppBrandCameraMrg", "has external storage permission: %b", Boolean.valueOf(b));
        boolean a = C89922k.m112464a(activity, fVar, "android.permission.CAMERA", 16, "", "");
        C90809a.C90811b.f260763a.f260759a = a;
        if (!a) {
            return false;
        }
        C91085v.m114268c(fVar.getAppId());
        if (!this.f251590g) {
            if (bVar != null) {
                C86385b bVar2 = (C86385b) bVar;
                bVar2.f251169a.mo109647a(bVar2.f251170b, bVar2.f251171c.mo115109j("ok"));
            }
            gVar.mo22088a();
            this.f251590g = true;
        }
        return true;
    }
}
