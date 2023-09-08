package xd0;

import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: xd0.c */
public final class C23075c extends C87413o implements C32227p<SubscribeMsgTmpItem, SubscribeMsgTmpItem, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f66289d;

    /* renamed from: e */
    public final /* synthetic */ boolean f66290e;

    /* renamed from: f */
    public final /* synthetic */ boolean f66291f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23075c(boolean z, boolean z2, boolean z3) {
        super(2);
        this.f66289d = z;
        this.f66290e = z2;
        this.f66291f = z3;
    }

    public Object invoke(Object obj, Object obj2) {
        SubscribeMsgTmpItem subscribeMsgTmpItem = (SubscribeMsgTmpItem) obj;
        SubscribeMsgTmpItem subscribeMsgTmpItem2 = (SubscribeMsgTmpItem) obj2;
        C87412m.m108594g(subscribeMsgTmpItem2, "toUpdateItem");
        Log.m105927v("MicroMsg.BrandSubscribeStorageManager", "alvinluo saveSubscribeMsgUiStatus updateCache templateId: %s settingStatus: %ss", subscribeMsgTmpItem2.f49021f, Integer.valueOf(subscribeMsgTmpItem2.f49025j));
        if (subscribeMsgTmpItem != null) {
            boolean z = this.f66289d;
            boolean z2 = this.f66290e;
            boolean z3 = this.f66291f;
            if (z) {
                subscribeMsgTmpItem.f49025j = subscribeMsgTmpItem2.f49025j;
            }
            if (z2) {
                subscribeMsgTmpItem.f49027o = subscribeMsgTmpItem2.f49027o;
            }
            if (z3) {
                subscribeMsgTmpItem.f49026n = subscribeMsgTmpItem2.f49026n;
            }
        }
        return C13598b0.f38549a;
    }
}
