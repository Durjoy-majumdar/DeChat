package com.tencent.p014mm.plugin.appbrand.appcache;

import android.os.Looper;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Landroid/os/Parcelable;", "<anonymous parameter 1>", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/appcache/NotifyWxaCommLibUpdatedEvent;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.z0 */
final class C81394z0<InputType, ResultType> implements C80883e {

    /* renamed from: d */
    public static final C81394z0<InputType, ResultType> f238901d = new C81394z0<>();

    public void invoke(Object obj, C1256g gVar) {
        NotifyWxaCommLibUpdatedEvent notifyWxaCommLibUpdatedEvent = (NotifyWxaCommLibUpdatedEvent) obj;
        if (notifyWxaCommLibUpdatedEvent != null) {
            notifyWxaCommLibUpdatedEvent.asyncPublish(Looper.getMainLooper());
        }
    }
}
