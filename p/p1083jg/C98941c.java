package p1083jg;

import com.tencent.p014mm.autogen.mmdata.rpt.AssetSetSendLogStruct;
import dm2.C58325i;
import p749xh.C38549d8;
import pe3.C47465a;
import qh0.C62619a;

/* renamed from: jg.c */
public final class C98941c<T extends C47465a> implements C58325i {

    /* renamed from: a */
    public final /* synthetic */ int f290035a;

    /* renamed from: b */
    public final /* synthetic */ long f290036b;

    /* renamed from: c */
    public final /* synthetic */ String f290037c;

    public C98941c(int i, long j, String str) {
        this.f290035a = i;
        this.f290036b = j;
        this.f290037c = str;
    }

    /* renamed from: a */
    public void mo32063a(int i, boolean z, C38549d8 d8Var, C47465a aVar) {
        C62619a aVar2 = (C62619a) aVar;
        if (aVar2 != null) {
            int i2 = this.f290035a;
            long j = this.f290036b;
            String str = this.f290037c;
            aVar2.f177831f += System.currentTimeMillis() - aVar2.f177832g;
            AssetSetSendLogStruct assetSetSendLogStruct = new AssetSetSendLogStruct();
            assetSetSendLogStruct.f265329d = assetSetSendLogStruct.mo86045b("SendSessionID", aVar2.f177829d, true);
            assetSetSendLogStruct.f265332g = (long) i2;
            assetSetSendLogStruct.f265331f = j;
            assetSetSendLogStruct.f265333h = aVar2.f177830e;
            assetSetSendLogStruct.f265334i = aVar2.f177831f;
            assetSetSendLogStruct.f265330e = assetSetSendLogStruct.mo86045b("ChatName", str, true);
            int i3 = (int) aVar2.f177833h;
            assetSetSendLogStruct.f265336k = i3 == 1 ? 1 : i3 == 5 ? 3 : 2;
            assetSetSendLogStruct.mo86054n();
        }
    }
}
