package ai2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import gi2.C98129b;
import gy3.C87412m;
import o40.C61926c;
import te3.C101765cp3;
import z04.C112550d0;
import zg2.C103020m;

/* renamed from: ai2.r */
public final class C92024r extends C92008b {

    /* renamed from: C */
    public final String f263520C = "MicroMsg.PositionItemView";

    /* renamed from: D */
    public final int f263521D = -1;

    /* renamed from: E */
    public final int f263522E = -1;

    /* renamed from: F */
    public final int f263523F;

    /* renamed from: G */
    public final Matrix f263524G;

    /* renamed from: H */
    public C92019m f263525H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92024r(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f263523F = C74942w4.m89784a(context, 32);
        this.f263524G = new Matrix();
    }

    /* renamed from: c */
    public final Bitmap mo125996c(C92019m mVar) {
        this.f263525H = mVar;
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.c6h, relativeLayout, true);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.bd7);
        TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.hyn);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.k8l);
        C87412m.m108593f(textView, "cityText");
        C61926c.m72678c(textView);
        C87412m.m108593f(textView2, "poiText");
        C61926c.m72678c(textView2);
        textView.setText(mVar.f263459g);
        textView2.setText(mVar.f263460h);
        ((ImageView) inflate.findViewById(C0966R.C0970id.k8k)).setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_location, -1));
        if (TextUtils.isEmpty(C112550d0.m153799i0(mVar.f263460h).toString())) {
            textView.setTextSize(0, (float) C74942w4.m89784a(getContext(), 20));
            imageView.setVisibility(8);
            textView2.setVisibility(8);
        }
        if (TextUtils.isEmpty(C112550d0.m153799i0(mVar.f263459g).toString())) {
            textView2.setTextSize(0, (float) C74942w4.m89784a(getContext(), 20));
            textView.setVisibility(8);
            imageView.setVisibility(8);
        }
        int i = this.f263523F;
        C103020m mVar2 = C103020m.f303985a;
        Rect rect = C103020m.f303987c;
        textView2.setMaxWidth(i >= rect.left ? rect.width() - ((this.f263523F - C103020m.f303987c.left) * 2) : rect.width());
        inflate.measure(0, 0);
        inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
        String str = this.f263520C;
        Log.m105924i(str, mVar + " parent.measuredWidth:" + inflate.getMeasuredWidth() + " , parent.measuredHeight:" + inflate.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap((inflate.getMeasuredWidth() <= 0 || inflate.getMeasuredWidth() > C103020m.f303987c.width()) ? C103020m.f303987c.width() : inflate.getMeasuredWidth(), (inflate.getMeasuredHeight() <= 0 || inflate.getMeasuredHeight() > C103020m.f303987c.height()) ? C103020m.f303987c.height() : inflate.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        relativeLayout.draw(new Canvas(createBitmap));
        setColor(this.f263521D);
        setTextBg(this.f263522E);
        setSourceDataType(C92011d.f263438g);
        setLocation(mVar);
        setBitmap(createBitmap);
        C87412m.m108593f(createBitmap, "bitmap");
        return createBitmap;
    }

    /* renamed from: g */
    public final void mo125997g(C92019m mVar) {
        C87412m.m108594g(mVar, "item");
        mo125996c(mVar);
        setViewMatrix(mVar.f263407f);
        getTouchTracker().f321806g.set(mVar.f263407f);
        setSourceDataType(C92011d.f263438g);
    }

    public C92007a getEditorData() {
        return this.f263525H;
    }

    public C98129b getType() {
        return C98129b.EditItemTypePosition;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
        this.f263524G.set(getTouchTracker().f321806g);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        getTouchTracker().f321806g.set(this.f263524G);
        return onTouchEvent;
    }

    public final void setLocation(C101765cp3 cp32) {
        C87412m.m108594g(cp32, FirebaseAnalytics.C113379b.LOCATION);
        String str = cp32.f298035f;
        C87412m.m108593f(str, "location.City");
        String str2 = cp32.f298036g;
        C87412m.m108593f(str2, "location.poiName");
        mo125996c(new C92019m(str, str2, cp32.f298033d, cp32.f298034e, new Matrix()));
        Bitmap bitmap = getBitmap();
        if (bitmap != null) {
            float height = ((float) ((getValidRect().height() - C74942w4.m89784a(getContext(), 128)) - C75044y4.m89991c(getContext()))) - ((float) bitmap.getHeight());
            int i = this.f263523F;
            C103020m mVar = C103020m.f303985a;
            int i2 = C103020m.f303987c.left;
            getTouchTracker().f321806g.setTranslate(i >= i2 ? (float) i : (float) i2, height);
        }
    }

    public void setValidArea(Rect rect) {
        C87412m.m108594g(rect, "validRect");
        getValidRect().set(rect);
    }
}
