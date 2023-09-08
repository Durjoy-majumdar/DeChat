package p172io.flutter.embedding.engine;

import android.graphics.ImageDecoder;

/* renamed from: io.flutter.embedding.engine.FlutterJNI$$a */
public final /* synthetic */ class FlutterJNI$$a implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a */
    public final /* synthetic */ long f324798a;

    public /* synthetic */ FlutterJNI$$a(long j) {
        this.f324798a = j;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        FlutterJNI.lambda$decodeImage$0(this.f324798a, imageDecoder, imageInfo, source);
    }
}
