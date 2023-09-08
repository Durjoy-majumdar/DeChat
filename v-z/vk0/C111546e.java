package vk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83183s;
import com.tencent.p014mm.plugin.mmsight.api.MMSightRecordView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: vk0.e */
public class C111546e implements MMSightRecordView.C18936f {

    /* renamed from: a */
    public final C82381f f333965a;

    /* renamed from: b */
    public final C83183s f333966b;

    /* renamed from: c */
    public boolean f333967c;

    /* renamed from: d */
    public int f333968d = Integer.MIN_VALUE;

    /* renamed from: vk0.e$a */
    public class C111547a extends C82919r2 {
        private static final int CTRL_INDEX = 637;
        public static final String NAME = "onCameraFrame";

        public C111547a(C111546e eVar) {
        }
    }

    public C111546e(C82381f fVar) {
        this.f333965a = fVar;
        this.f333966b = (C83183s) fVar.getJsRuntime().mo63321n0(C83183s.class);
    }

    /* renamed from: a */
    public void mo163237a(MMSightRecordView mMSightRecordView) {
        Log.m105925i("MicroMsg.FrameDataCallbackHelper", "onUIResume mNeedCallback:%b", Boolean.valueOf(this.f333967c));
        if (this.f333967c) {
            if (mMSightRecordView == null) {
                Log.m105928w("MicroMsg.FrameDataCallbackHelper", "onUIResume recordView null");
                return;
            }
            int i = this.f333968d;
            if (i == Integer.MIN_VALUE) {
                Log.m105928w("MicroMsg.FrameDataCallbackHelper", "onUIResume invalid mCurrentSharedBufferId");
                return;
            }
            C83183s sVar = this.f333966b;
            if (sVar == null) {
                Log.m105928w("MicroMsg.FrameDataCallbackHelper", "onUIResume mSharedBufferAddon null");
            } else {
                mMSightRecordView.mo24026a(sVar.mo115398S(i), this);
            }
        }
    }
}
