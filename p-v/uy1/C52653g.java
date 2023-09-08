package uy1;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import uy1.C52645f;

/* renamed from: uy1.g */
public class C52653g implements C52645f.C52652e {

    /* renamed from: a */
    public final /* synthetic */ ImageView f147027a;

    /* renamed from: b */
    public final /* synthetic */ int f147028b;

    /* renamed from: c */
    public final /* synthetic */ int f147029c;

    /* renamed from: d */
    public final /* synthetic */ int f147030d;

    /* renamed from: uy1.g$a */
    public class C52654a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f147031d;

        public C52654a(Bitmap bitmap) {
            this.f147031d = bitmap;
        }

        public void run() {
            C52653g.this.f147027a.setImageBitmap(this.f147031d);
            ViewGroup.LayoutParams layoutParams = C52653g.this.f147027a.getLayoutParams();
            C52653g gVar = C52653g.this;
            float f = ((float) gVar.f147028b) / ((float) gVar.f147029c);
            int i = gVar.f147030d;
            layoutParams.width = i;
            layoutParams.height = (int) (f * ((float) i));
            gVar.f147027a.setLayoutParams(layoutParams);
            C52653g.this.f147027a.setScaleType(ImageView.ScaleType.FIT_XY);
        }
    }

    public C52653g(C52645f fVar, ImageView imageView, int i, int i2, int i3) {
        this.f147027a = imageView;
        this.f147028b = i;
        this.f147029c = i2;
        this.f147030d = i3;
    }

    /* renamed from: a */
    public void mo65432a(View view, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            MMHandlerThread.postToMainThread(new C52654a(bitmap));
        }
    }

    /* renamed from: b */
    public void mo65433b(String str, View view) {
    }
}
