package com.tencent.p014mm.plugin.webview.modeltools;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.autogen.events.ApduEngineFuncEvent;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.C55480f;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.NFCIPCHelper */
public class NFCIPCHelper {

    /* renamed from: com.tencent.mm.plugin.webview.modeltools.NFCIPCHelper$a */
    public static class C43737a implements C80916r<NFCEventTransfer, NFCEventTransfer> {
        private C43737a() {
        }

        public Object invoke(Object obj) {
            NFCEventTransfer nFCEventTransfer = (NFCEventTransfer) obj;
            Log.m105925i("MicroMsg.NFCIPCHelper", "alvinluo NfcEventInvokeTask invoke process: %s", C86709a0.m107531m().mo58407a().f124988a);
            ApduEngineFuncEvent apduEngineFuncEvent = new ApduEngineFuncEvent();
            ApduEngineFuncEvent.C40036a aVar = apduEngineFuncEvent.f107356d;
            aVar.f107358a = nFCEventTransfer.f118200d;
            aVar.f107360c = nFCEventTransfer.f118201e;
            aVar.f107361d = nFCEventTransfer.f118202f;
            aVar.f107362e = nFCEventTransfer.f118203g;
            apduEngineFuncEvent.publish();
            nFCEventTransfer.f118204h = apduEngineFuncEvent.f107357e.f107363a;
            return nFCEventTransfer;
        }
    }

    /* renamed from: a */
    public static void m47582a(ApduEngineFuncEvent apduEngineFuncEvent) {
        Bundle bundle;
        Log.m105925i("MicroMsg.NFCIPCHelper", "alvinluo nfcInvokeAsResult actionCode: %d", Integer.valueOf(apduEngineFuncEvent.f107356d.f107358a));
        try {
            NFCEventTransfer nFCEventTransfer = (NFCEventTransfer) XIPCInvoker.m98749b(WeChatProcess.PROCESS_TOOLS, new NFCEventTransfer(apduEngineFuncEvent), C43737a.class);
            if (nFCEventTransfer == null || (bundle = nFCEventTransfer.f118204h) == null) {
                Log.m105920e("MicroMsg.NFCIPCHelper", "alvinluo nfcInvokeAsResult error");
                C115669n.INSTANCE.mo175911u(C55480f.CTRL_INDEX, 0);
                return;
            }
            apduEngineFuncEvent.f107357e.f107363a = bundle;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.NFCIPCHelper", e, "alvinluo nfcInvokeAsResult exception", new Object[0]);
            Log.m105920e("MicroMsg.NFCIPCHelper", "alvinluo nfcInvokeAsResult error");
            C115669n.INSTANCE.mo175911u(C55480f.CTRL_INDEX, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.modeltools.NFCIPCHelper$NFCEventTransfer */
    public static class NFCEventTransfer implements Parcelable {
        public static final Parcelable.Creator<NFCEventTransfer> CREATOR = new C43736a();

        /* renamed from: d */
        public int f118200d;

        /* renamed from: e */
        public String f118201e;

        /* renamed from: f */
        public boolean f118202f;

        /* renamed from: g */
        public boolean f118203g;

        /* renamed from: h */
        public Bundle f118204h;

        /* renamed from: com.tencent.mm.plugin.webview.modeltools.NFCIPCHelper$NFCEventTransfer$a */
        public class C43736a implements Parcelable.Creator<NFCEventTransfer> {
            public Object createFromParcel(Parcel parcel) {
                return new NFCEventTransfer(parcel);
            }

            public Object[] newArray(int i) {
                return new NFCEventTransfer[i];
            }
        }

        public NFCEventTransfer(ApduEngineFuncEvent apduEngineFuncEvent) {
            ApduEngineFuncEvent.C40036a aVar = apduEngineFuncEvent.f107356d;
            this.f118200d = aVar.f107358a;
            this.f118201e = aVar.f107360c;
            this.f118202f = aVar.f107361d;
            this.f118203g = aVar.f107362e;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f118200d);
            parcel.writeString(this.f118201e);
            parcel.writeByte(this.f118202f ? (byte) 1 : 0);
            parcel.writeByte(this.f118203g ? (byte) 1 : 0);
            parcel.writeBundle(this.f118204h);
        }

        public NFCEventTransfer(Parcel parcel) {
            this.f118200d = parcel.readInt();
            this.f118201e = parcel.readString();
            boolean z = true;
            this.f118202f = parcel.readByte() != 0;
            this.f118203g = parcel.readByte() == 0 ? false : z;
            this.f118204h = parcel.readBundle(getClass().getClassLoader());
        }
    }
}
