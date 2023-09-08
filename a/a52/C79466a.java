package a52;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import e42.C7594e;
import e42.C7596h;
import e42.C86430i;
import gy3.C87412m;
import java.util.HashMap;
import qo3.C47883u;
import qo3.C77426q;

/* renamed from: a52.a */
public final class C79466a<T extends C7594e> extends C86430i<T> {

    /* renamed from: a52.a$a */
    public static final class C79467a implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C79466a<T> f233009a;

        public C79467a(C79466a<T> aVar) {
            this.f233009a = aVar;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("confirm", Boolean.valueOf(z));
            hashMap.put("cancel", Boolean.FALSE);
            this.f233009a.mo120840p().invoke(this.f233009a.mo120846k(hashMap));
        }
    }

    /* renamed from: a52.a$b */
    public static final class C79468b implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C79466a<T> f233010a;

        public C79468b(C79466a<T> aVar) {
            this.f233010a = aVar;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            HashMap hashMap = new HashMap();
            hashMap.put("confirm", Boolean.valueOf(z));
            hashMap.put("cancel", Boolean.TRUE);
            this.f233010a.mo120840p().invoke(this.f233010a.mo120846k(hashMap));
        }
    }

    /* renamed from: a52.a$c */
    public static final class C79469c implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C79466a<T> f233011d;

        public C79469c(C79466a<T> aVar) {
            this.f233011d = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            Log.m105924i("MBJsApiShowModal", "cancel!");
            HashMap hashMap = new HashMap();
            hashMap.put("confirm", Boolean.FALSE);
            hashMap.put("cancel", Boolean.TRUE);
            this.f233011d.mo120840p().invoke(this.f233011d.mo120846k(hashMap));
        }
    }

    /* renamed from: a52.a$d */
    public static final class C79470d implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public static final C79470d f233012d = new C79470d();

        public final void onDismiss(DialogInterface dialogInterface) {
            Log.m105924i("MBJsApiShowModal", "dismiss");
        }
    }

    /* renamed from: e */
    public String mo16e() {
        return "showModal";
    }

    /* renamed from: l */
    public boolean mo17l() {
        return true;
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        Context context;
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        String optString2 = hVar.optString("content");
        String optString3 = hVar.optString("confirmText");
        String optString4 = hVar.optString("cancelText");
        boolean optBoolean = hVar.optBoolean("showCancel", true);
        String optString5 = hVar.optString("confirmColor");
        String optString6 = hVar.optString("cancelColor");
        C87412m.m108593f(optString, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        boolean z = false;
        if (optString.length() == 0) {
            C87412m.m108593f(optString2, "content");
            if (optString2.length() == 0) {
                z = true;
            }
            if (z) {
                mo120840p().invoke(mo120842g(1, "modal title and content null"));
            }
        }
        T t = this.f251227a;
        if (t == null || (context = t.mo8720e0()) == null) {
            context = MMApplicationContext.getContext();
        }
        Log.m105918d("MBJsApiShowModal", "context: " + context);
        C77426q qVar = new C77426q(context);
        qVar.mo107606r(optString);
        qVar.mo107595g(optString2);
        qVar.f225837a.f225714b.f225637T = Color.parseColor(optString6);
        qVar.mo107599k(Color.parseColor(optString5));
        qVar.mo107602n(optString3);
        qVar.mo107598j(optString4);
        qVar.mo107589a(optBoolean);
        qVar.mo107600l(new C79467a(this));
        qVar.mo107597i(new C79468b(this));
        qVar.f225837a.f225714b.f225622E = new C79469c(this);
        qVar.mo107593e(C79470d.f233012d);
        qVar.mo107603o();
    }
}
