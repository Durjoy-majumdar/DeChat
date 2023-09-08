package com.tencent.p014mm.plugin.flash.action;

import android.view.View;
import android.view.animation.Animation;
import au1.C0222b;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import gb1.C116924a;
import j20.C117292a;
import jb1.C108680a;
import k20.C60958c;
import k20.C9556a;
import lu3.C34379c;
import zt1.C119138d;
import zt1.C16402c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.flash.action.f */
public class C4372f implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ FaceFlashActionPreviewLayout f18998a;

    /* renamed from: com.tencent.mm.plugin.flash.action.f$a */
    public class C4373a implements Runnable {

        /* renamed from: com.tencent.mm.plugin.flash.action.f$a$a */
        public class C4374a implements C119138d.C16403a {
            public C4374a() {
            }

            /* renamed from: a */
            public void mo5293a(C116924a aVar) {
                Log.m105924i("MicroMsg.FaceFlashActionPreviewLayout", "number verify start record voice");
                if (C4372f.this.f18998a.f18941v.f43810a) {
                    aVar.mo180899a(C108680a.m147401e().mo159698f());
                    C4372f.this.f18998a.f18941v.mo14858e();
                }
            }
        }

        public C4373a() {
        }

        public void run() {
            if (!C4372f.this.f18998a.f18945z) {
                Log.m105924i("MicroMsg.FaceFlashActionPreviewLayout", "prepareVerifying = false ,face not in rect.");
                return;
            }
            Log.m105924i("MicroMsg.FaceFlashActionPreviewLayout", "onAnimationEnd end......... start face verity.");
            C0222b.m172k("sdkVerify");
            YtSDKKitFramework.getInstance().fireEvent(YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_BEGIN_LIVENESS, (Object) null);
            FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = C4372f.this.f18998a;
            faceFlashActionPreviewLayout.f18913A = true;
            if (faceFlashActionPreviewLayout.f18942w == YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE) {
                View view = faceFlashActionPreviewLayout.f18935p;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/flash/action/FaceFlashActionPreviewLayout$7$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/flash/action/FaceFlashActionPreviewLayout$7$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C4372f.this.f18998a.f18934o.setVisibility(0);
                C4372f.this.f18998a.f18934o.mo149963b();
                C119138d dVar = (C119138d) C4372f.this.f18998a.f18940u;
                C4374a aVar2 = new C4374a();
                dVar.getClass();
                Log.m105924i("MicroMsg.FaceFlashManagerNumber", JsApiStartRecordVoice.NAME);
                C116924a aVar3 = dVar.f356819B;
                C16402c cVar = new C16402c(dVar, aVar2);
                aVar3.getClass();
                Log.m105924i("MicroMsg.FaceVoiceRecordLogic", "start record");
                ThreadPool.post((Runnable) new C116924a.C116927d(cVar, (C116924a.C107792a) null), "FaceVoice_record", 10);
                return;
            }
            faceFlashActionPreviewLayout.f18941v.mo14858e();
        }
    }

    public C4372f(FaceFlashActionPreviewLayout faceFlashActionPreviewLayout) {
        this.f18998a = faceFlashActionPreviewLayout;
    }

    public void onAnimationEnd(Animation animation) {
        C34379c cVar = this.f18998a.f18918F;
        if (cVar != null) {
            cVar.cancel(true);
            this.f18998a.f18918F = null;
        }
        this.f18998a.f18918F = ((C119157j) C119157j.f356862d).mo183895z(new C4373a());
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        Log.m105924i("MicroMsg.FaceFlashActionPreviewLayout", "after onAnimationStart ");
        FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = this.f18998a;
        faceFlashActionPreviewLayout.f18940u.mo14859a(faceFlashActionPreviewLayout.f18930h);
        this.f18998a.f18930h.setVisibility(0);
    }
}
