package com.tencent.p014mm.p136ui.mmfb.sdk;

import android.os.Bundle;
import com.tencent.p014mm.p136ui.mmfb.sdk.C116095b;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import jg0.C117355j;

/* renamed from: com.tencent.mm.ui.mmfb.sdk.a */
public class C116094a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f348417d;

    /* renamed from: e */
    public final /* synthetic */ Bundle f348418e;

    /* renamed from: f */
    public final /* synthetic */ String f348419f;

    /* renamed from: g */
    public final /* synthetic */ C116095b.C116096a f348420g;

    /* renamed from: h */
    public final /* synthetic */ Object f348421h;

    /* renamed from: i */
    public final /* synthetic */ C116095b f348422i;

    public C116094a(C116095b bVar, String str, Bundle bundle, String str2, C116095b.C116096a aVar, Object obj) {
        this.f348422i = bVar;
        this.f348417d = str;
        this.f348418e = bundle;
        this.f348419f = str2;
        this.f348420g = aVar;
        this.f348421h = obj;
    }

    public void run() {
        try {
            String f = this.f348422i.f348423a.mo177422f(this.f348417d, this.f348418e, this.f348419f);
            ((C117355j.C117356b) this.f348420g).mo182019a(f, this.f348421h);
        } catch (FileNotFoundException e) {
            C117355j.C117356b bVar = (C117355j.C117356b) this.f348420g;
            bVar.getClass();
            Log.m105920e("MicroMsg.RefreshTokenRunner", "onFileNotFoundException");
            C117355j.m165448a(C117355j.this, 2, e.getMessage());
        } catch (MalformedURLException e2) {
            C117355j.C117356b bVar2 = (C117355j.C117356b) this.f348420g;
            bVar2.getClass();
            Log.m105920e("MicroMsg.RefreshTokenRunner", "onMalformedURLException");
            C117355j.m165448a(C117355j.this, 2, e2.getMessage());
        } catch (IOException e3) {
            C117355j.C117356b bVar3 = (C117355j.C117356b) this.f348420g;
            bVar3.getClass();
            Log.m105920e("MicroMsg.RefreshTokenRunner", "onIOException");
            C117355j.m165448a(C117355j.this, 2, e3.getMessage());
        }
    }
}
