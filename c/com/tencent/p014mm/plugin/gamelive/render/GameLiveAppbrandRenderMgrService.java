package com.tencent.p014mm.plugin.gamelive.render;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.Surface;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.feature.gamelive.GameLiveCommonService;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86301e;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import mz1.C109658r;
import mz1.C88870s;
import p635os.C89291d;

@C86522b(dependencies = {C89291d.class}, onProcess = {C80625v0.MATCH_APPBRAND})
/* renamed from: com.tencent.mm.plugin.gamelive.render.GameLiveAppbrandRenderMgrService */
public final class GameLiveAppbrandRenderMgrService extends C86301e implements C109658r {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/gamelive/render/GameLiveAppbrandRenderMgrService$Payload;", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.gamelive.render.GameLiveAppbrandRenderMgrService$Payload */
    public static final class Payload implements Parcelable {
        public static final Parcelable.Creator<Payload> CREATOR = new C30121a();

        /* renamed from: d */
        public final int f81453d;

        /* renamed from: e */
        public final int f81454e;

        /* renamed from: com.tencent.mm.plugin.gamelive.render.GameLiveAppbrandRenderMgrService$Payload$a */
        public static final class C30121a implements Parcelable.Creator<Payload> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new Payload(parcel.readInt(), parcel.readInt());
            }

            public Object[] newArray(int i) {
                return new Payload[i];
            }
        }

        public Payload(int i, int i2) {
            this.f81453d = i;
            this.f81454e = i2;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return this.f81453d == payload.f81453d && this.f81454e == payload.f81454e;
        }

        public int hashCode() {
            return (this.f81453d * 31) + this.f81454e;
        }

        public String toString() {
            return "Payload(width=" + this.f81453d + ", height=" + this.f81454e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeInt(this.f81453d);
            parcel.writeInt(this.f81454e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.gamelive.render.GameLiveAppbrandRenderMgrService$a */
    public static final class C85234a<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C88870s.C88871a f248322d;

        public C85234a(C88870s.C88871a aVar) {
            this.f248322d = aVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            GameLiveCommonService.IPCLiveControlData iPCLiveControlData = (GameLiveCommonService.IPCLiveControlData) obj;
            this.f248322d.mo112615a((Surface) (iPCLiveControlData != null ? iPCLiveControlData.f237647g : null));
        }
    }

    /* renamed from: Bx */
    public void mo118326Bx(C88870s.C88871a aVar) {
        C87412m.m108594g(aVar, "callback");
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionGetInputSurfaceTexture, (String) null, 0, (Parcelable) null, 12, (C8480h) null), GameLiveCommonService.C80854b.class, new C85234a(aVar));
    }

    /* renamed from: C */
    public void mo118327C(int i, int i2) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionSetSize, (String) null, 0, new Payload(i, i2), 6, (C8480h) null), GameLiveCommonService.C80854b.class, (C1256g) null);
    }

    /* renamed from: bb */
    public void mo118328bb(Surface surface) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new GameLiveCommonService.IPCLiveControlData(GameLiveCommonService.IPCLiveControlData.C80852b.IPCLiveControlActionSetOnScreenSurfaceTexture, (String) null, 0, surface, 6, (C8480h) null), GameLiveCommonService.C80854b.class, (C1256g) null);
    }
}
