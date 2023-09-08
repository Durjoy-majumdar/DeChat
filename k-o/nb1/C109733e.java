package nb1;

import android.os.Bundle;
import com.tencent.p014mm.plugin.facedetectaction.p046ui.FaceActionUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import te3.C64542m02;

/* renamed from: nb1.e */
public class C109733e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C64542m02 f328446d;

    /* renamed from: e */
    public final /* synthetic */ C109734f f328447e;

    public C109733e(C109734f fVar, C64542m02 m022) {
        this.f328447e = fVar;
        this.f328446d = m022;
    }

    public void run() {
        this.f328447e.f328448a.f312685r.clearAnimation();
        FaceActionUI faceActionUI = this.f328447e.f328448a;
        faceActionUI.f312674d.setVisibility(8);
        faceActionUI.f312685r.clearAnimation();
        faceActionUI.f312675e.setVisibility(8);
        faceActionUI.f312681n.setVisibility(0);
        faceActionUI.f312676f.setVisibility(0);
        faceActionUI.f312686s.setScaleX(0.0f);
        faceActionUI.f312686s.setScaleY(0.0f);
        faceActionUI.f312686s.animate().scaleX(1.0f).scaleY(1.0f).setDuration(800);
        FaceActionUI faceActionUI2 = this.f328447e.f328448a;
        C64542m02 m022 = this.f328446d;
        String str = m022.f184194h;
        faceActionUI2.f312672H = str;
        String str2 = m022.f184192f;
        faceActionUI2.getClass();
        Log.m105924i("MicroMsg.FaceActionUI", "callbackDetectSuccess（）");
        Bundle bundle = new Bundle();
        bundle.putString(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str2);
        bundle.putString("serial_id", str);
        faceActionUI2.f312671G = 0;
        faceActionUI2.mo149631I7("ok", 0, bundle, Boolean.valueOf(faceActionUI2.f312690w));
    }
}
