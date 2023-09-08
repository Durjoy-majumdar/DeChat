package p1217u6;

import android.content.Context;
import android.content.res.Configuration;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.tencent.wxmm.v2helper;
import p1217u6.C118589a;

/* renamed from: u6.f */
public class C118600f implements C118589a {

    /* renamed from: a */
    public final Context f354906a;

    /* renamed from: b */
    public final C118589a.C118590a f354907b;

    /* renamed from: c */
    public final C118602b f354908c;

    /* renamed from: d */
    public OrientationEventListener f354909d;

    /* renamed from: e */
    public C118591b f354910e = null;

    /* renamed from: u6.f$a */
    public class C118601a extends OrientationEventListener {
        public C118601a(Context context, int i) {
            super(context, i);
        }

        public void onOrientationChanged(int i) {
            C118600f fVar = C118600f.this;
            C118591b bVar = C118591b.Unknown;
            if (i == -1) {
                fVar.getClass();
            } else {
                int i2 = i + 45;
                Configuration configuration = fVar.f354906a.getResources().getConfiguration();
                int rotation = ((WindowManager) fVar.f354906a.getSystemService("window")).getDefaultDisplay().getRotation();
                if (((((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? (char) 2 : 1) == 2) {
                    i2 += 90;
                }
                int i3 = (i2 % v2helper.VOIP_ENC_HEIGHT_LV1) / 90;
                if (i3 == 0) {
                    bVar = C118591b.PortraitUp;
                } else if (i3 == 1) {
                    bVar = C118591b.LandscapeRight;
                } else if (i3 == 2) {
                    bVar = C118591b.PortraitDown;
                } else if (i3 == 3) {
                    bVar = C118591b.LandscapeLeft;
                }
            }
            if (!bVar.equals(C118600f.this.f354910e)) {
                C118600f fVar2 = C118600f.this;
                fVar2.f354910e = bVar;
                fVar2.f354907b.mo183344a(bVar);
            }
        }
    }

    /* renamed from: u6.f$b */
    public enum C118602b {
        normal(3),
        fastest(0);
        

        /* renamed from: d */
        public int f354915d;

        /* access modifiers changed from: public */
        C118602b(int i) {
            this.f354915d = i;
        }
    }

    public C118600f(Context context, C118589a.C118590a aVar, C118602b bVar) {
        this.f354906a = context;
        this.f354907b = aVar;
        this.f354908c = bVar;
    }

    /* renamed from: a */
    public void mo183342a() {
        if (this.f354909d != null) {
            this.f354907b.mo183344a(this.f354910e);
            return;
        }
        C118601a aVar = new C118601a(this.f354906a, this.f354908c.f354915d);
        this.f354909d = aVar;
        if (aVar.canDetectOrientation()) {
            this.f354909d.enable();
        }
    }

    /* renamed from: b */
    public void mo183343b() {
        OrientationEventListener orientationEventListener = this.f354909d;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.f354909d = null;
        }
    }
}
