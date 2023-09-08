package i90;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f90.C107518h;
import gy3.C87412m;
import l90.C109291a;
import s80.C110777a;
import y80.C66557b;

/* renamed from: i90.a */
public final class C108423a {

    /* renamed from: a */
    public int f324647a;

    /* renamed from: b */
    public Context f324648b;

    /* renamed from: c */
    public C66557b f324649c;

    /* renamed from: d */
    public C108424a f324650d;

    /* renamed from: i90.a$a */
    public static final class C108424a extends OrientationEventListener {

        /* renamed from: a */
        public final /* synthetic */ C108423a f324651a;

        /* renamed from: b */
        public final /* synthetic */ C109291a f324652b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108424a(C108423a aVar, C109291a aVar2, Context context) {
            super(context, 3);
            this.f324651a = aVar;
            this.f324652b = aVar2;
        }

        public void onOrientationChanged(int i) {
            C66557b bVar;
            Context context = this.f324651a.f324648b;
            char c = 0;
            if (context != null) {
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                int rotation = ((Activity) context).getWindowManager().getDefaultDisplay().getRotation();
                if (rotation != this.f324651a.f324647a) {
                    Log.m105924i("MicroMsg.PreviewOrientationFit", "last rotation :" + this.f324651a.f324647a + " ,current rotation:" + rotation);
                    C108423a aVar = this.f324651a;
                    aVar.f324647a = rotation;
                    if (rotation != 0) {
                        if (rotation == 1) {
                            c = 'Z';
                        } else if (rotation == 2) {
                            c = 180;
                        } else if (rotation == 3) {
                            c = 270;
                        }
                    }
                    if (c == 0) {
                        C66557b bVar2 = aVar.f324649c;
                        if (bVar2 != null) {
                            C109291a aVar2 = this.f324652b;
                            C66557b.f191417d = 270;
                            aVar2.getCameraPreviewView().mo148310m(bVar2);
                            C110777a aVar3 = C107518h.f321689b;
                            if (aVar3 != null) {
                                aVar3.mo159589r(C66557b.f191417d);
                            }
                        }
                    } else if (c == 180 && (bVar = aVar.f324649c) != null) {
                        C109291a aVar4 = this.f324652b;
                        C66557b.f191417d = 90;
                        aVar4.getCameraPreviewView().mo148310m(bVar);
                        C110777a aVar5 = C107518h.f321689b;
                        if (aVar5 != null) {
                            aVar5.mo159589r(C66557b.f191417d);
                        }
                    }
                }
            }
        }
    }

    public C108423a(Context context, C109291a aVar) {
        C87412m.m108594g(context, "ctx");
        C87412m.m108594g(aVar, "process");
        this.f324648b = context;
        this.f324650d = new C108424a(this, aVar, context);
    }

    /* renamed from: a */
    public final void mo158966a(boolean z, C66557b bVar) {
        Log.m105924i("MicroMsg.PreviewOrientationFit", "enable :" + z + " ,cameraConfig " + bVar);
        Context context = this.f324648b;
        if (context != null) {
            if (z) {
                this.f324649c = bVar;
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).setRequestedOrientation(7);
                this.f324650d.enable();
                return;
            }
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).setRequestedOrientation(1);
            this.f324650d.disable();
            this.f324647a = 0;
        }
    }
}
