package sn3;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import d62.C7250m;
import java.util.List;
import um3.C78237b;
import wd3.C65953v0;

/* renamed from: sn3.a */
public final class C77738a implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ C77741d f226547a;

    /* renamed from: b */
    public final /* synthetic */ List<String> f226548b;

    /* renamed from: c */
    public final /* synthetic */ String f226549c;

    public C77738a(C77741d dVar, List<String> list, String str) {
        this.f226547a = dVar;
        this.f226548b = list;
        this.f226549c = str;
    }

    /* renamed from: a */
    public final void mo23a(boolean z, String str, int i) {
        this.f226547a.mo14600f3();
        if (z) {
            List<String> list = this.f226548b;
            C77741d dVar = this.f226547a;
            String str2 = this.f226549c;
            for (String str3 : list) {
                C77741d.m93797g3(dVar, str3, str2);
                if (!Util.isNullOrNil(str)) {
                    C7250m.m7431a().mo136252Ar(str, str3);
                }
            }
            C77741d dVar2 = this.f226547a;
            UIStateCenter e3 = dVar2.mo14599e3();
            if (e3 != null) {
                e3.dispatch(new C78237b());
            }
            dVar2.getActivity().finish();
        }
    }
}
