package p1219v6;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import com.tencent.wxmm.v2helper;
import p172io.flutter.plugin.common.EventChannel;

/* renamed from: v6.a */
public class C118662a implements EventChannel.StreamHandler {

    /* renamed from: d */
    public final /* synthetic */ Activity f355066d;

    /* renamed from: e */
    public final /* synthetic */ C118664b f355067e;

    /* renamed from: v6.a$a */
    public class C118663a extends OrientationEventListener {

        /* renamed from: a */
        public final /* synthetic */ EventChannel.EventSink f355068a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C118663a(Context context, EventChannel.EventSink eventSink) {
            super(context);
            this.f355068a = eventSink;
        }

        public void onOrientationChanged(int i) {
            EventChannel.EventSink eventSink = this.f355068a;
            C118664b bVar = C118662a.this.f355067e;
            int i2 = bVar.f355074h;
            if ((i2 != 0 || (i < 300 && i > 60)) && ((i2 != 1 || i < 30 || i > 150) && ((i2 != 2 || i < 120 || i > 240) && (i2 != 3 || i < 210 || i > 330)))) {
                bVar.f355074h = ((i + 45) % v2helper.VOIP_ENC_HEIGHT_LV1) / 90;
            }
            int i3 = bVar.f355074h;
            char c = i3 == 0 ? 1 : i3 == 1 ? 8 : i3 == 2 ? 9 : i3 == 3 ? (char) 0 : 65535;
            String str = c == 1 ? "DeviceOrientation.portraitUp" : c == 9 ? "DeviceOrientation.portraitDown" : c == 0 ? "DeviceOrientation.landscapeRight" : c == 8 ? "DeviceOrientation.landscapeLeft" : null;
            if (str != null) {
                eventSink.success(str);
            }
        }
    }

    public C118662a(C118664b bVar, Activity activity) {
        this.f355067e = bVar;
        this.f355066d = activity;
    }

    public void onCancel(Object obj) {
        OrientationEventListener orientationEventListener = this.f355067e.f355073g;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.f355067e.f355073g = null;
        }
    }

    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f355067e.f355073g = new C118663a(this.f355066d, eventSink);
        if (this.f355067e.f355073g.canDetectOrientation()) {
            this.f355067e.f355073g.enable();
        } else {
            eventSink.error("SensorError", "Cannot detect sensors. Not enabled", (Object) null);
        }
    }
}
