package fh1;

import android.content.Context;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import gy3.C87412m;
import p006bk.C0306f;
import p464ck.C54866a;
import wo1.C15570j;

/* renamed from: fh1.p0 */
public final class C8076p0 implements C0306f {

    /* renamed from: a */
    public final /* synthetic */ LiveRoomControllerStore f26857a;

    public C8076p0(LiveRoomControllerStore liveRoomControllerStore) {
        this.f26857a = liveRoomControllerStore;
    }

    /* renamed from: a */
    public C54866a<?> mo357a(Context context) {
        C87412m.m108594g(context, "context");
        return new C15570j(context, this.f26857a.getLiveRoomData());
    }
}
