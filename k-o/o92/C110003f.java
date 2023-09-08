package o92;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import l92.C109293a;

/* renamed from: o92.f */
public final class C110003f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Activity f329187d;

    /* renamed from: e */
    public final /* synthetic */ C109293a f329188e;

    public C110003f(Activity activity, C109293a aVar) {
        this.f329187d = activity;
        this.f329188e = aVar;
    }

    public final void run() {
        Activity activity = this.f329187d;
        C109293a aVar = this.f329188e;
        Log.m105924i("MicroMsg.MultiTaskTipsHelper", "showBottomSheet");
        C109999c cVar = new C109999c(activity);
        boolean z = true;
        LayoutInflater.from(cVar.f329177f.getContext()).inflate(C0966R.C0971layout.bib, (LinearLayout) cVar.f329177f.findViewById(C0966R.C0970id.ahc), true);
        cVar.f329177f.findViewById(C0966R.C0970id.h5g).setOnClickListener(new C110001d(cVar, aVar));
        ((ImageView) cVar.f329177f.findViewById(C0966R.C0970id.h5f)).setImageResource(C0966R.C0969drawable.chz);
        cVar.f329183o = new C110002e(aVar);
        cVar.f329178g = cVar.mo161340a();
        Context context = cVar.f329176e;
        cVar.f329179h = context instanceof Activity ? ((Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0;
        if (cVar.f329175d != null) {
            ((ViewGroup) cVar.f329177f.getParent()).setVisibility(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cVar.f329177f.getLayoutParams();
            if (cVar.f329178g && cVar.f329180i != null) {
                Rect rect = new Rect();
                cVar.f329180i.getWindowVisibleDisplayFrame(rect);
                layoutParams.width = rect.right;
            }
            cVar.f329177f.setLayoutParams(layoutParams);
            cVar.f329175d.getWindow().addFlags(Integer.MIN_VALUE);
            cVar.f329175d.getWindow().clearFlags(8);
            cVar.f329175d.getWindow().clearFlags(131072);
            cVar.f329175d.getWindow().clearFlags(128);
            cVar.f329175d.getWindow().getDecorView().setSystemUiVisibility(0);
            View view = cVar.f329180i;
            if (view != null) {
                if (cVar.f329181j != null) {
                    z = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                cVar.f329181j = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(cVar);
                }
            }
            Context context2 = cVar.f329176e;
            if ((context2 instanceof Activity) && !((Activity) context2).isFinishing()) {
                cVar.f329175d.show();
            }
            BottomSheetBehavior bottomSheetBehavior = cVar.f329182n;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f309230p = false;
            }
        }
        if (aVar != null) {
            aVar.mo160106a();
        }
    }
}
