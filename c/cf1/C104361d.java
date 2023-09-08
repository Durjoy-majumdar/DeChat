package cf1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import fy3.C32226l;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: cf1.d */
public final class C104361d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveFixRatioPhoneEditPluginLayout f309008d;

    /* renamed from: cf1.d$a */
    public static final class C104362a extends C87413o implements C32226l<CaptureDataManager.CaptureVideoNormalModel, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveFixRatioPhoneEditPluginLayout f309009d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104362a(FinderLiveFixRatioPhoneEditPluginLayout finderLiveFixRatioPhoneEditPluginLayout) {
            super(1);
            this.f309009d = finderLiveFixRatioPhoneEditPluginLayout;
        }

        /* JADX WARNING: type inference failed for: r3v6, types: [android.content.Context] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r3) {
            /*
                r2 = this;
                com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r3 = (com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.CaptureVideoNormalModel) r3
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r3, r0)
                com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout r3 = r2.f309009d
                android.content.Context r3 = r3.getContext()
                boolean r0 = r3 instanceof android.app.Activity
                r1 = 0
                if (r0 == 0) goto L_0x0015
                android.app.Activity r3 = (android.app.Activity) r3
                goto L_0x0016
            L_0x0015:
                r3 = r1
            L_0x0016:
                if (r3 == 0) goto L_0x001d
                r0 = 10012(0x271c, float:1.403E-41)
                r3.setResult(r0)
            L_0x001d:
                com.tencent.mm.plugin.finder.edit.FinderLiveFixRatioPhoneEditPluginLayout r3 = r2.f309009d
                android.content.Context r3 = r3.getContext()
                boolean r0 = r3 instanceof android.app.Activity
                if (r0 == 0) goto L_0x002a
                r1 = r3
                android.app.Activity r1 = (android.app.Activity) r1
            L_0x002a:
                if (r1 == 0) goto L_0x002f
                r1.finish()
            L_0x002f:
                rx3.b0 r3 = rx3.C13598b0.f38549a
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: cf1.C104361d.C104362a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public C104361d(FinderLiveFixRatioPhoneEditPluginLayout finderLiveFixRatioPhoneEditPluginLayout) {
        this.f309008d = finderLiveFixRatioPhoneEditPluginLayout;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderLiveFixRatioPhoneEditPluginLayout finderLiveFixRatioPhoneEditPluginLayout = this.f309008d;
        FinderLiveFixRatioPhoneEditPluginLayout.C105252a aVar = FinderLiveFixRatioPhoneEditPluginLayout.f312705x;
        finderLiveFixRatioPhoneEditPluginLayout.getEditPhotoWrapper().mo160569b();
        this.f309008d.getEditPhotoWrapper().mo160570c(new C104362a(this.f309008d));
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/edit/FinderLiveFixRatioPhoneEditPluginLayout$setLiveEditLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
