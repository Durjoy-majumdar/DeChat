package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.v1 */
public class C72932v1 {

    /* renamed from: a */
    public static int f212557a = -1;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.v1$a */
    public class C72933a implements View.OnLayoutChangeListener {

        /* renamed from: d */
        public final /* synthetic */ View f212558d;

        /* renamed from: com.tencent.mm.pluginsdk.ui.tools.v1$a$a */
        public class C72934a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f212559d;

            public C72934a(View view) {
                this.f212559d = view;
            }

            public void run() {
                int height = (this.f212559d.getResources().getDisplayMetrics().heightPixels - this.f212559d.getHeight()) >>> 1;
                int height2 = (int) ((((double) height) / 1.618d) - ((double) (C72933a.this.f212558d.getHeight() >>> 1)));
                if (height2 >= 0) {
                    if (C72932v1.f212557a < 0) {
                        C72932v1.f212557a = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f212559d.getContext(), 20.0f);
                    }
                    if (C72933a.this.f212558d.getHeight() + height2 + C72932v1.f212557a > height) {
                        height2 -= ((C72933a.this.f212558d.getHeight() + height2) + C72932v1.f212557a) - height;
                    }
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) C72933a.this.f212558d.getLayoutParams();
                    if (height2 > 0 && height2 != layoutParams.bottomMargin) {
                        Log.m105924i("VideoSightHelper", "setting tip marginBottom " + height2);
                        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, height2);
                        C72933a.this.f212558d.setLayoutParams(layoutParams);
                    }
                }
            }
        }

        public C72933a(View view) {
            this.f212558d = view;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i4 - i2;
            int i15 = i8 - i6;
            if (i9 > 0 && i15 != i9) {
                view.post(new C72934a(view));
            }
        }
    }

    /* renamed from: a */
    public static void m85535a(View view, VideoSightView videoSightView) {
        if (view == null || videoSightView == null) {
            Log.m105920e("VideoSightHelper", "null view object " + view + "," + videoSightView);
        } else if (view.getVisibility() == 0) {
            videoSightView.addOnLayoutChangeListener(new C72933a(view));
        }
    }
}
