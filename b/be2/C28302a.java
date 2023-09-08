package be2;

import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C86709a0;
import g40.C87134f;
import java.util.ArrayList;
import kj2.C117407d;

/* renamed from: be2.a */
public class C28302a implements C87134f {

    /* renamed from: d */
    public final /* synthetic */ C79692b f77899d;

    public C28302a(C79692b bVar) {
        this.f77899d = bVar;
    }

    /* renamed from: e */
    public void mo1180e() {
        ArrayList arrayList = new ArrayList();
        IDKey iDKey = new IDKey();
        iDKey.SetID(1313);
        iDKey.SetKey(BuildInfo.IS_ARM64 ? 1 : 0);
        iDKey.SetValue(1);
        arrayList.add(iDKey);
        IDKey iDKey2 = new IDKey();
        iDKey2.SetID(1313);
        this.f77899d.getClass();
        iDKey2.SetKey(MMApplicationContext.isMainProcess() ? BuildInfo.IS_ARM64 ? 12 : 2 : MMApplicationContext.isAppBrandProcess() ? BuildInfo.IS_ARM64 ? 13 : 3 : MMApplicationContext.isToolsProcess() ? BuildInfo.IS_ARM64 ? 14 : 4 : -1);
        iDKey2.SetValue(1);
        arrayList.add(iDKey2);
        C117407d.INSTANCE.mo160124a(arrayList, false);
        C86709a0.m107528h().mo121101p(this);
    }

    /* renamed from: g */
    public void mo1181g(boolean z) {
    }
}
