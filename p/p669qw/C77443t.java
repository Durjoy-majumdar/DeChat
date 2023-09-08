package p669qw;

import a14.C53916l;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C67073a;
import androidx.activity.result.C67074b;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.HashMap;
import kotlin.Result;
import p232rw.C77575r;

/* renamed from: qw.t */
public final class C77443t<O> implements C67073a {

    /* renamed from: a */
    public final /* synthetic */ ComponentActivity f225870a;

    /* renamed from: b */
    public final /* synthetic */ String f225871b;

    /* renamed from: c */
    public final /* synthetic */ C8479f0<C67074b<RecordConfigProvider>> f225872c;

    /* renamed from: d */
    public final /* synthetic */ C77439s f225873d;

    /* renamed from: e */
    public final /* synthetic */ C53916l<C77575r> f225874e;

    public C77443t(ComponentActivity componentActivity, String str, C8479f0<C67074b<RecordConfigProvider>> f0Var, C77439s sVar, C53916l<? super C77575r> lVar) {
        this.f225870a = componentActivity;
        this.f225871b = str;
        this.f225872c = f0Var;
        this.f225873d = sVar;
        this.f225874e = lVar;
    }

    /* renamed from: a */
    public void mo91080a(Object obj) {
        C77575r rVar = (C77575r) obj;
        ActivityResultRegistry activityResultRegistry = this.f225870a.getActivityResultRegistry();
        C87412m.m108593f(activityResultRegistry, "ui.activityResultRegistry");
        String str = this.f225871b;
        C87412m.m108594g(str, "key");
        Integer num = (Integer) ((HashMap) activityResultRegistry.f337845c).get(str);
        int intValue = num != null ? num.intValue() : -1;
        Log.m105924i("MicroMsg.MediaOptService", "ActivityResultCallback key:" + this.f225871b + " requestCode:" + intValue);
        rVar.f226146a = intValue;
        C67074b bVar = (C67074b) this.f225872c.f27484d;
        if (bVar != null) {
            bVar.mo91082b();
        }
        this.f225873d.f225864d.remove(this.f225871b);
        this.f225874e.resumeWith(Result.m168114constructorimpl(rVar));
    }
}
