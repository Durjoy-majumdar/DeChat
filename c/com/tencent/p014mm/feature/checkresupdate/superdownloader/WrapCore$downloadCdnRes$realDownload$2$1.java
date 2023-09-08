package com.tencent.p014mm.feature.checkresupdate.superdownloader;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8479f0;
import gy3.C87412m;
import kotlin.Metadata;
import kotlin.Result;
import p164hp.C20992d;
import rx3.C13604l;
import wx3.C15601d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/feature/checkresupdate/superdownloader/WrapCore$downloadCdnRes$realDownload$2$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/CheckResUpdateCacheFileEvent;", "plugin-comm_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.feature.checkresupdate.superdownloader.WrapCore$downloadCdnRes$realDownload$2$1 */
public final class WrapCore$downloadCdnRes$realDownload$2$1 extends IListener<CheckResUpdateCacheFileEvent> {

    /* renamed from: d */
    public final /* synthetic */ int f79334d;

    /* renamed from: e */
    public final /* synthetic */ int f79335e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<C15601d<C13604l<Boolean, String>>> f79336f;

    /* renamed from: g */
    public final /* synthetic */ C8479f0<IListener<CheckResUpdateCacheFileEvent>> f79337g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrapCore$downloadCdnRes$realDownload$2$1(int i, int i2, C8479f0<C15601d<C13604l<Boolean, String>>> f0Var, C8479f0<IListener<CheckResUpdateCacheFileEvent>> f0Var2, C40008f fVar) {
        super(fVar);
        this.f79334d = i;
        this.f79335e = i2;
        this.f79336f = f0Var;
        this.f79337g = f0Var2;
    }

    public boolean callback(IEvent iEvent) {
        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
        C87412m.m108594g(checkResUpdateCacheFileEvent, "event");
        int i = checkResUpdateCacheFileEvent.f78743d.f78744a;
        int i2 = this.f79334d;
        if (i == i2) {
            C8479f0<IListener<CheckResUpdateCacheFileEvent>> f0Var = this.f79337g;
            int i3 = this.f79335e;
            String str = C20992d.f59435c;
            IListener iListener = (IListener) f0Var.f27484d;
            if (iListener != null) {
                iListener.dead();
            }
            Log.m105924i("Download.SuperDownloaderWrapCore", "#downloadCdnRes resType:" + i2 + " subType:" + i3 + " resEventListener-dead");
            f0Var.f27484d = null;
            CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
            int i4 = aVar.f78745b;
            String str2 = aVar.f78746c;
            boolean z = aVar.f78748e;
            Log.m105924i("Download.SuperDownloaderWrapCore", "#downloadCdnRes-realDownload callback resType:" + this.f79334d + " subType:" + this.f79335e + " subtype" + i4 + ' ' + str2 + ' ' + z);
            if (str2 == null || str2.length() == 0) {
                C15601d dVar = (C15601d) this.f79336f.f27484d;
                if (dVar != null) {
                    Result.Companion companion = Result.Companion;
                    dVar.resumeWith(Result.m168114constructorimpl(new C13604l(Boolean.FALSE, "")));
                }
                this.f79336f.f27484d = null;
            } else {
                C15601d dVar2 = (C15601d) this.f79336f.f27484d;
                if (dVar2 != null) {
                    Result.Companion companion2 = Result.Companion;
                    Boolean bool = Boolean.TRUE;
                    C87412m.m108593f(str2, "path");
                    dVar2.resumeWith(Result.m168114constructorimpl(new C13604l(bool, str2)));
                }
                this.f79336f.f27484d = null;
            }
        }
        return false;
    }
}
