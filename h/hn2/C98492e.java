package hn2;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.MaxHeightScrollView;
import qo3.C101218e0;

/* renamed from: hn2.e */
public class C98492e extends C101218e0 {

    /* renamed from: L */
    public TextView f288863L;

    /* renamed from: M */
    public TextView f288864M;

    /* renamed from: N */
    public Button f288865N;

    /* renamed from: P */
    public Button f288866P;

    /* renamed from: Q */
    public TextView f288867Q;

    /* renamed from: R */
    public MaxHeightScrollView f288868R;

    /* renamed from: S */
    public boolean f288869S = false;

    /* renamed from: T */
    public LinearLayout f288870T;

    /* renamed from: U */
    public View f288871U;

    public C98492e(Context context) {
        super(context);
        if (context instanceof Activity) {
            mo140662i(C0966R.C0971layout.ayw);
            this.f288863L = (TextView) this.f296384g.findViewById(C0966R.C0970id.knm);
            this.f288864M = (TextView) this.f296384g.findViewById(C0966R.C0970id.kna);
            this.f288865N = (Button) this.f296384g.findViewById(C0966R.C0970id.hfe);
            this.f288866P = (Button) this.f296384g.findViewById(C0966R.C0970id.apy);
            TextView textView = (TextView) this.f296384g.findViewById(C0966R.C0970id.knb);
            this.f288867Q = textView;
            textView.setText(context.getResources().getString(C0966R.string.iov));
            this.f288868R = (MaxHeightScrollView) this.f296384g.findViewById(C0966R.C0970id.j3q);
            this.f288870T = (LinearLayout) this.f296384g.findViewById(C0966R.C0970id.mnu);
            MaxHeightScrollView maxHeightScrollView = this.f288868R;
            if (maxHeightScrollView == null) {
                return;
            }
            if (maxHeightScrollView.getContext() instanceof Activity) {
                DisplayMetrics displayMetrics = this.f288868R.getContext().getResources().getDisplayMetrics();
                if (displayMetrics != null) {
                    this.f288868R.setMaxHeight((int) (((float) displayMetrics.heightPixels) * 0.45f));
                    Log.m105924i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "displayMetrics.heightPixels = " + displayMetrics.heightPixels);
                    return;
                }
                Log.m105924i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "displayMetrics is null");
                return;
            }
            Log.m105924i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "display is null");
            return;
        }
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.ayw, (ViewGroup) null);
        this.f288871U = inflate;
        this.f288863L = (TextView) inflate.findViewById(C0966R.C0970id.knm);
        this.f288864M = (TextView) this.f288871U.findViewById(C0966R.C0970id.kna);
        this.f288865N = (Button) this.f288871U.findViewById(C0966R.C0970id.hfe);
        this.f288866P = (Button) this.f288871U.findViewById(C0966R.C0970id.apy);
        TextView textView2 = (TextView) this.f288871U.findViewById(C0966R.C0970id.knb);
        this.f288867Q = textView2;
        textView2.setText(context.getResources().getString(C0966R.string.iov));
        this.f288868R = (MaxHeightScrollView) this.f288871U.findViewById(C0966R.C0970id.j3q);
        this.f288870T = (LinearLayout) this.f288871U.findViewById(C0966R.C0970id.mnu);
        if (this.f288868R != null) {
            int i = context.getResources().getDisplayMetrics().heightPixels;
            if (i != 0) {
                this.f288868R.setMaxHeight((int) (((float) i) * 0.45f));
                Log.m105924i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "screenHeight = " + i);
                return;
            }
            Log.m105924i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "screenHeight is 0");
        }
    }
}
