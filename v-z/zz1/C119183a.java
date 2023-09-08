package zz1;

import a02.C112708e;
import android.content.Intent;
import com.tencent.p014mm.plugin.gwallet.GWalletQueryProvider;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: zz1.a */
public class C119183a {

    /* renamed from: a */
    public final /* synthetic */ GWalletQueryProvider f356904a;

    public C119183a(GWalletQueryProvider gWalletQueryProvider) {
        this.f356904a = gWalletQueryProvider;
    }

    /* renamed from: a */
    public void mo183898a(C112708e eVar, Intent intent) {
        Log.m105918d("MicroMsg.GWalletQueryProvider", "query detail done! Result " + eVar);
        GWalletQueryProvider gWalletQueryProvider = this.f356904a;
        gWalletQueryProvider.f346150g = true;
        gWalletQueryProvider.f346151h = intent.getStringArrayListExtra("RESPONSE_QUERY_DETAIL_INFO");
        this.f356904a.f346153j = intent.getIntExtra("RESPONSE_CODE", 0);
    }
}
