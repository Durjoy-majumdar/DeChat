package nb1;

import android.hardware.Camera;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import com.tencent.p014mm.plugin.facedetect.model.C93390g;
import com.tencent.p014mm.plugin.facedetectaction.p046ui.FaceActionUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob1.C110011a;

/* renamed from: nb1.d */
public class C109732d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C109734f f328445d;

    public C109732d(C109734f fVar) {
        this.f328445d = fVar;
    }

    public void run() {
        FaceActionUI faceActionUI = this.f328445d.f328448a;
        C110011a aVar = faceActionUI.f312693z;
        if (aVar != null) {
            Log.m105925i("MicroMsg.FaceReflectCam", "stopPreview ,isPreview %s camera:%s", Boolean.valueOf(aVar.f329246q), aVar.f329239g);
            if (aVar.f329239g != null) {
                aVar.f329246q = false;
                aVar.f329239g.mo158268l();
                aVar.f329239g.mo158263g((Camera.PreviewCallback) null);
                aVar.f329229J.removeCallbacksAndMessages((Object) null);
                C93390g.f269584d.mo126892c();
            }
        }
        faceActionUI.f312674d.setVisibility(8);
        faceActionUI.f312675e.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) faceActionUI.f312683p.getHeight());
        translateAnimation.setDuration(2000);
        translateAnimation.setRepeatMode(2);
        translateAnimation.setRepeatCount(-1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(1000);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setAnimationListener(new C109739h(faceActionUI));
        animationSet.setRepeatCount(-1);
        faceActionUI.f312685r.startAnimation(animationSet);
    }
}
