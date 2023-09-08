package ib1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Process;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.facedetect.model.C105227i;
import com.tencent.p014mm.plugin.facedetect.p045ui.FaceDetectUI;
import com.tencent.p014mm.plugin.facedetect.service.FaceDetectProcessService;
import com.tencent.p014mm.plugin.facedetect.views.FaceDetectView;
import com.tencent.p014mm.plugin.facedetect.views.FaceScanRect;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kb1.C108991e;
import kb1.C108993h;

/* renamed from: ib1.h */
public class C117150h implements ServiceConnection {

    /* renamed from: d */
    public final /* synthetic */ FaceDetectUI f350990d;

    public C117150h(FaceDetectUI faceDetectUI) {
        this.f350990d = faceDetectUI;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.m105925i("MicroMsg.FaceDetectUI", "alvinluo service connected %s", componentName);
        FaceDetectUI faceDetectUI = this.f350990d;
        faceDetectUI.f346006v = true;
        FaceDetectProcessService faceDetectProcessService = FaceDetectProcessService.this;
        faceDetectUI.f346004t = faceDetectProcessService;
        C105227i iVar = C105227i.INSTANCE;
        Log.m105925i("MicroMsg.FaceDetectManager", "alvinluo bindService process name: %s, hashCode: %d", Util.getProcessNameByPid(MMApplicationContext.getContext(), Process.myPid()), Integer.valueOf(iVar.hashCode()));
        iVar.f312612d = faceDetectProcessService;
        Log.m105925i("MicroMsg.FaceDetectUI", "alvinluo FaceDetectUI service hashCode: %d", Integer.valueOf(this.f350990d.f346004t.hashCode()));
        FaceDetectUI faceDetectUI2 = this.f350990d;
        faceDetectUI2.getClass();
        Log.m105924i("MicroMsg.FaceDetectUI", "alvinluo start");
        Log.m105924i("MicroMsg.FaceDetectUI", "alvinluo startFaceDetect ");
        WindowManager.LayoutParams attributes = faceDetectUI2.getWindow().getAttributes();
        if (attributes.screenBrightness < 0.9f) {
            attributes.screenBrightness = 0.9f;
            faceDetectUI2.getWindow().setAttributes(attributes);
        }
        FaceScanRect faceScanRect = faceDetectUI2.f346002r;
        faceScanRect.f346058y = FaceScanRect.C115438a.INIT;
        FaceScanRect.C115438a aVar = FaceScanRect.C115438a.OPENED;
        View view = faceScanRect.f346057x;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/facedetect/views/FaceScanRect", "startScanLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/facedetect/views/FaceScanRect", "startScanLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        faceScanRect.f346040d.setBackgroundResource(C0966R.C0969drawable.c0m);
        faceScanRect.f346057x.startAnimation(faceScanRect.f346054u);
        for (ImageView imageView : faceScanRect.f346049p) {
            imageView.clearAnimation();
            imageView.setBackgroundColor(faceScanRect.getResources().getColor(C0966R.color.al6));
        }
        faceScanRect.f346058y = aVar;
        faceDetectUI2.f346001q.f346023e.f197970d = false;
        faceDetectUI2.f346002r.setVisibility(0);
        Log.m105919d("MicroMsg.FaceDetectUI", "alvinluo %d, %d, %d, %d", Integer.valueOf(faceDetectUI2.f346002r.getTop()), Integer.valueOf(faceDetectUI2.f346002r.getRight()), Integer.valueOf(faceDetectUI2.f346002r.getLeft()), Integer.valueOf(faceDetectUI2.f346002r.getBottom()));
        faceDetectUI2.f345996i = true;
        faceDetectUI2.f345997j = false;
        FaceDetectUI.C115432e eVar = faceDetectUI2.f345995h;
        synchronized (eVar) {
            try {
                eVar.f346013a = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (faceDetectUI2.f345996i) {
            faceDetectUI2.f346008x = new C117151i(faceDetectUI2);
            Log.m105924i("MicroMsg.FaceDetectUI", "hy: start preview");
            C108993h hVar = faceDetectUI2.f346008x;
            FaceDetectView faceDetectView = faceDetectUI2.f346001q;
            faceDetectView.f346022d.mo149606H(new C108991e(faceDetectView, hVar));
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Log.m105925i("MicroMsg.FaceDetectUI", "alvinluo service disconnected %s", componentName.toString());
        this.f350990d.f346006v = false;
    }
}
