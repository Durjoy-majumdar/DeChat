package com.tencent.p014mm.plugin.flash;

import android.view.View;
import au1.C0222b;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import gb1.C116924a;
import j20.C117292a;
import java.util.ArrayList;
import jb1.C108680a;
import zt1.C119138d;
import zt1.C16402c;

/* renamed from: com.tencent.mm.plugin.flash.b */
public class C4383b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FaceFlashPreviewLayout f19016d;

    /* renamed from: com.tencent.mm.plugin.flash.b$a */
    public class C4384a implements C119138d.C16403a {
        public C4384a() {
        }

        /* renamed from: a */
        public void mo5293a(C116924a aVar) {
            Log.m105924i("MicroMsg.FaceFlashManager", "number verify start record voice");
            if (C4383b.this.f19016d.f18872u.f43810a) {
                aVar.mo180899a(C108680a.m147401e().mo159698f());
                C4383b.this.f19016d.f18872u.mo14858e();
            }
        }
    }

    public C4383b(FaceFlashPreviewLayout faceFlashPreviewLayout) {
        this.f19016d = faceFlashPreviewLayout;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/flash/FaceFlashPreviewLayout$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FaceFlashPreviewLayout faceFlashPreviewLayout = this.f19016d;
        faceFlashPreviewLayout.f18876y = true;
        faceFlashPreviewLayout.setOnClickListener((View.OnClickListener) null);
        this.f19016d.f18865n.setVisibility(4);
        this.f19016d.f18864j.setVisibility(0);
        this.f19016d.f18871t.reset();
        C119138d dVar = (C119138d) this.f19016d.f18871t;
        C4384a aVar = new C4384a();
        dVar.getClass();
        Log.m105924i("MicroMsg.FaceFlashManagerNumber", JsApiStartRecordVoice.NAME);
        C116924a aVar2 = dVar.f356819B;
        C16402c cVar = new C16402c(dVar, aVar);
        aVar2.getClass();
        Log.m105924i("MicroMsg.FaceVoiceRecordLogic", "start record");
        ThreadPool.post((Runnable) new C116924a.C116927d(cVar, (C116924a.C107792a) null), "FaceVoice_record", 10);
        this.f19016d.f18864j.mo149963b();
        C0222b.m163b().f9704t = System.currentTimeMillis();
        YtSDKKitFramework.getInstance().fireEvent(YtSDKKitFramework.YtFrameworkFireEventType.YT_EVENT_TRIGGER_BEGIN_LIVENESS, (Object) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/flash/FaceFlashPreviewLayout$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
