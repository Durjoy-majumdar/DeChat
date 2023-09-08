package com.tencent.p014mm.plugin.flash.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import du1.C107069a;
import h81.C32735h;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import lu3.C34379c;
import xt1.C15900c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.flash.view.FaceNumberLayout */
public class FaceNumberLayout extends LinearLayout {

    /* renamed from: h */
    public static final int f313143h;

    /* renamed from: d */
    public int f313144d;

    /* renamed from: e */
    public int f313145e;

    /* renamed from: f */
    public C34379c f313146f;

    /* renamed from: g */
    public Runnable f313147g;

    /* renamed from: com.tencent.mm.plugin.flash.view.FaceNumberLayout$a */
    public class C105353a implements Runnable {
        public C105353a() {
        }

        public void run() {
            Log.m105925i("MicroMsg.FaceFlashManagerNumberView", "showNumberRunnable current index:%s", Integer.valueOf(FaceNumberLayout.this.f313144d));
            FaceNumberLayout faceNumberLayout = FaceNumberLayout.this;
            if (faceNumberLayout.getChildAt(faceNumberLayout.f313144d) != null) {
                FaceNumberLayout faceNumberLayout2 = FaceNumberLayout.this;
                FaceNumberView faceNumberView = (FaceNumberView) faceNumberLayout2.getChildAt(faceNumberLayout2.f313144d);
                faceNumberView.getClass();
                Log.m105924i("MicroMsg.FaceFlashManagerNumberView", "show");
                View view = faceNumberView.f313149d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/flash/view/FaceNumberView", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/flash/view/FaceNumberView", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                faceNumberView.f313150e.clearAnimation();
                faceNumberView.f313151f.setFillAfter(true);
                faceNumberView.f313151f.setDuration(500);
                faceNumberView.f313150e.startAnimation(faceNumberView.f313151f);
                faceNumberView.f313150e.setVisibility(0);
                FaceNumberLayout faceNumberLayout3 = FaceNumberLayout.this;
                int i = faceNumberLayout3.f313144d + 1;
                faceNumberLayout3.f313144d = i;
                if (i <= faceNumberLayout3.f313145e) {
                    faceNumberLayout3.f313146f = ((C119157j) C119157j.f356862d).mo183869C(faceNumberLayout3.f313147g, (long) FaceNumberLayout.f313143h);
                }
            }
        }
    }

    static {
        String str = C15900c.f42778a;
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_face_flash_read_number_interval, 1000);
        Log.m105925i("MicroMsg.FaceFlashManagerConfig", "getFaceReadNumberTimeInterval %d", Integer.valueOf(Qe));
        f313143h = Qe;
    }

    public FaceNumberLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo149962a() {
        Log.m105924i("MicroMsg.FaceFlashManagerNumberView", "release");
        C34379c cVar = this.f313146f;
        if (cVar != null && !cVar.isDone() && !this.f313146f.isCancelled()) {
            this.f313146f.cancel(true);
        }
        for (int i = 0; i < getChildCount(); i++) {
            FaceNumberView faceNumberView = (FaceNumberView) getChildAt(i);
            faceNumberView.getClass();
            faceNumberView.post(new C107069a(faceNumberView));
        }
    }

    /* renamed from: b */
    public void mo149963b() {
        Log.m105924i("MicroMsg.FaceFlashManagerNumberView", "startShowNumber");
        C34379c cVar = this.f313146f;
        if (cVar != null && !cVar.isDone() && !this.f313146f.isCancelled()) {
            this.f313146f.cancel(true);
        }
        this.f313146f = ((C119157j) C119157j.f356862d).mo183895z(this.f313147g);
    }

    public void setNumbers(String str) {
        Log.m105925i("MicroMsg.FaceFlashManagerNumberView", "setNumbers %s", str);
        this.f313145e = str.length();
        this.f313144d = getChildCount();
        setWeightSum((float) this.f313145e);
        for (int i = 0; i < this.f313145e; i++) {
            FaceNumberView faceNumberView = new FaceNumberView(getContext(), (AttributeSet) null);
            faceNumberView.setNumber(String.valueOf(str.charAt(i)));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
            layoutParams.weight = 1.0f;
            layoutParams.gravity = 1;
            addView(faceNumberView, layoutParams);
        }
    }

    public FaceNumberLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f313144d = 0;
        this.f313145e = 0;
        this.f313147g = new C105353a();
    }
}
