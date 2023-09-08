package d60;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import c50.C54654a;
import c50.C54655b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.core.view.LivePreviewView;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import e60.C58532b;
import gy3.C87412m;
import j50.C60735a;
import k50.C60971a;
import s50.C63699b;

/* renamed from: d60.v0 */
public final class C58220v0 extends C58121a {

    /* renamed from: f */
    public final C58124b f166724f;

    /* renamed from: g */
    public final Context f166725g;

    /* renamed from: h */
    public C54654a f166726h;

    /* renamed from: i */
    public final LivePreviewView f166727i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58220v0(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f166724f = bVar;
        this.f166725g = viewGroup.getContext();
        View findViewById = viewGroup.findViewById(C0966R.C0970id.f358581fx0);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.live_preview_view)");
        this.f166727i = (LivePreviewView) findViewById;
        if (C54655b.f153178f1 == null) {
            C54655b.f153178f1 = new C54655b();
        }
        C54655b bVar2 = C54655b.f153178f1;
        C87412m.m108591d(bVar2);
        this.f166726h = bVar2;
        viewGroup.setPadding(0, 0, 0, 0);
    }

    /* renamed from: i0 */
    public void mo8357i0() {
    }

    /* renamed from: r0 */
    public void mo8358r0() {
    }

    /* renamed from: s0 */
    public void mo3209s0() {
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 5 || ordinal == 6 || ordinal == 7) {
            mo10792g(0);
        } else if (ordinal == 10) {
            Log.m105924i("MicroMsg.LiveCoreAnchor", "switchCamera");
            C54654a aVar = this.f166726h;
            if (aVar != null) {
                ((C60735a) aVar).mo85703v0();
            }
            C58532b.m67948d(RoomLiveService.f157192c, RoomLiveService.f157197h.f133050d, RoomLiveService.f157199j, 1, C60971a.C60973b.f173670a.mo85945b().f174704a == 0 ? 1 : 0, (String) null, RoomLiveService.f157197h.f133055i, 32, (Object) null);
            Log.m105924i("MicroMsg.LiveAnchorIDKeyStat", "markAnchorSwitchCameraWhileLiveOn");
            C115669n.INSTANCE.mo175913w(1380, 7, 1);
        } else if (ordinal == 27) {
            mo10792g(8);
            C54654a aVar2 = this.f166726h;
            if (aVar2 != null) {
                ((C60735a) aVar2).mo85702u0();
            }
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        Log.m105924i("MicroMsg.LiveCoreAnchor", "unMount");
    }

    /* renamed from: x0 */
    public final void mo82962x0() {
        C54654a aVar = this.f166726h;
        if (aVar != null) {
            LivePreviewView livePreviewView = this.f166727i;
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            ((C60735a) aVar).mo85700s0(livePreviewView, RoomLiveService.f157191b, (C63699b) null);
        }
        this.f166727i.mo76420c();
    }
}
