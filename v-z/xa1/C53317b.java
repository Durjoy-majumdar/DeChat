package xa1;

import android.database.Cursor;
import com.tencent.p014mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.SyncTask;
import f40.C86709a0;
import u24.C90599h;
import wa1.C53141a;

/* renamed from: xa1.b */
public class C53317b extends SyncTask<Cursor> {

    /* renamed from: a */
    public final /* synthetic */ String[] f148916a;

    /* renamed from: b */
    public final /* synthetic */ ExtControlProviderOpenApi f148917b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53317b(ExtControlProviderOpenApi extControlProviderOpenApi, long j, Cursor cursor, boolean z, String[] strArr) {
        super(j, cursor, z);
        this.f148917b = extControlProviderOpenApi;
        this.f148916a = strArr;
    }

    public Object run() {
        ExtControlProviderOpenApi extControlProviderOpenApi = this.f148917b;
        String d = C72688j0.m85018d(extControlProviderOpenApi.f269488s, extControlProviderOpenApi.mo128169b());
        if (C90599h.m113511d(d)) {
            d = "";
        }
        ExtControlProviderOpenApi extControlProviderOpenApi2 = this.f148917b;
        C86709a0.m107529k().f251779b.mo123460f(new C53141a(extControlProviderOpenApi2.f269494g, extControlProviderOpenApi2.mo128169b(), d, new C53316a(this, d)));
        return null;
    }
}
