package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import gy3.C87412m;
import kotlin.Metadata;
import ob0.C47350c;
import ob0.C89144l0;
import pe3.C47465a;
import te3.C101820nt3;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/t;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.t */
final class C2132t implements C80883e<Bundle, Bundle> {
    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        C87412m.m108594g(bundle, "bundle");
        C87412m.m108594g(gVar, "callback");
        String string = bundle.getString("uri");
        int i = bundle.getInt("funId");
        int i2 = bundle.getInt("reqCmdId");
        int i3 = bundle.getInt("respCmdId");
        String string2 = bundle.getString("reqClassName");
        Class<?> cls = Class.forName(String.valueOf(bundle.getString("respClassName")));
        Object newInstance = Class.forName(String.valueOf(string2)).newInstance();
        C87412m.m108592e(newInstance, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.RequestProtoBuf");
        C101820nt3 nt32 = (C101820nt3) newInstance;
        nt32.parseFrom(bundle.getByteArray("req"));
        String valueOf = String.valueOf(string);
        C2131s sVar = new C2131s(gVar);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = nt32;
        Object newInstance2 = cls.newInstance();
        C87412m.m108592e(newInstance2, "null cannot be cast to non-null type com.tencent.mm.protobuf.BaseProtoBuf");
        bVar.f127067b = (C47465a) newInstance2;
        bVar.f127068c = valueOf;
        bVar.f127069d = i;
        bVar.f127070e = i2;
        bVar.f127071f = i3;
        C89144l0.m111429e(bVar.mo72403a(), new C2130o(sVar), false);
    }
}
