package nj3;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.MaxHeightScrollView;
import qo3.C101218e0;

/* renamed from: nj3.z */
public class C100127z extends C101218e0 {

    /* renamed from: L */
    public TextView f293292L;

    /* renamed from: M */
    public Button f293293M;

    /* renamed from: N */
    public Button f293294N;

    /* renamed from: P */
    public ImageView f293295P;

    /* renamed from: Q */
    public ImageView f293296Q;

    /* renamed from: R */
    public MaxHeightScrollView f293297R;

    /* renamed from: S */
    public boolean f293298S = false;

    public C100127z(Context context) {
        super(context);
        mo140662i(C0966R.C0971layout.clx);
        TextView textView = (TextView) this.f296384g.findViewById(C0966R.C0970id.knm);
        this.f293292L = (TextView) this.f296384g.findViewById(C0966R.C0970id.kna);
        this.f293293M = (Button) this.f296384g.findViewById(C0966R.C0970id.hfe);
        this.f293294N = (Button) this.f296384g.findViewById(C0966R.C0970id.apy);
        TextView textView2 = (TextView) this.f296384g.findViewById(C0966R.C0970id.knb);
        this.f293297R = (MaxHeightScrollView) this.f296384g.findViewById(C0966R.C0970id.j3q);
        this.f293296Q = (ImageView) this.f296384g.findViewById(C0966R.C0970id.m86);
        MaxHeightScrollView maxHeightScrollView = this.f293297R;
        if (maxHeightScrollView != null) {
            maxHeightScrollView.setVisibility(0);
            if (this.f293297R.getContext() instanceof Activity) {
                DisplayMetrics displayMetrics = this.f293297R.getContext().getResources().getDisplayMetrics();
                if (displayMetrics != null) {
                    this.f293297R.setMaxHeight((int) (((float) displayMetrics.heightPixels) * 0.45f));
                    Log.m105924i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "displayMetrics.heightPixels = " + displayMetrics.heightPixels);
                } else {
                    Log.m105924i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "displayMetrics is null");
                }
            } else {
                Log.m105924i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "display is null");
            }
        } else {
            Log.m105924i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "scroll is null");
        }
        this.f293295P = (ImageView) this.f296384g.findViewById(C0966R.C0970id.ly_);
    }
}
