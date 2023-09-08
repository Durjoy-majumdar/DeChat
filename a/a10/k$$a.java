package a10;

import a14.C53867c2;
import android.media.ImageReader;
import android.os.Handler;
import fy3.C32224a;
import gy3.C87412m;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.renderer.FlutterRenderer;
import rx3.C13598b0;

public final /* synthetic */ class k$$a implements ImageReader.OnImageAvailableListener {

    /* renamed from: d */
    public final /* synthetic */ C103283k f304534d;

    public /* synthetic */ k$$a(C103283k kVar) {
        this.f304534d = kVar;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        FlutterRenderer renderer;
        C103283k kVar = this.f304534d;
        C87412m.m108594g(kVar, "this$0");
        Log.m165288i("MicroMsg.FlutterOffscreenSurface", "on image available");
        kVar.f304528b.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
        FlutterEngine flutterEngine = kVar.f304529c;
        if (!(flutterEngine == null || (renderer = flutterEngine.getRenderer()) == null)) {
            renderer.pauseRenderingToSurface(kVar.f304528b.getSurface());
        }
        C53867c2 c2Var = (C53867c2) kVar.f304530d;
        c2Var.getClass();
        c2Var.mo74537j0(C13598b0.f38549a);
        C32224a<C13598b0> aVar = kVar.f304531e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
