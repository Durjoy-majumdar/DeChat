package com.tencent.p014mm.plugin.appbrand.appusage;

import android.os.Parcel;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appusage/o1;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/plugin/appbrand/appusage/QueryParams;", "Landroid/os/Parcel;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.appusage.o1 */
final class C81518o1 implements C80916r<QueryParams, Parcel> {
    public Object invoke(Object obj) {
        QueryParams queryParams = (QueryParams) obj;
        Parcel obtain = Parcel.obtain();
        C87412m.m108593f(obtain, "obtain()");
        if (C86709a0.m107522a() && queryParams != null) {
            try {
                obtain.writeTypedList(((C68585h1) C86312j.m106911c(C68585h1.class)).tl0(queryParams.f239052d, queryParams.f239053e, queryParams.f239054f));
            } catch (Exception e) {
                Log.m105920e("MicroMsg.AppBrandCollectionStorageIPC", "QueryCall, writeTypedList e = " + e);
            }
        }
        return obtain;
    }
}
