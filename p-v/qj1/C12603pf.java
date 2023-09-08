package qj1;

import android.text.Layout;
import android.text.StaticLayout;
import android.widget.ScrollView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import kg3.C76577a;
import p629ny.C76979h;
import rx3.C36570n;
import te3.C64674r41;

/* renamed from: qj1.pf */
public final class C12603pf implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C12522mf f36134d;

    /* renamed from: e */
    public final /* synthetic */ C64674r41 f36135e;

    /* renamed from: qj1.pf$a */
    public static final class C12604a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C12522mf f36136d;

        public C12604a(C12522mf mfVar) {
            this.f36136d = mfVar;
        }

        public final void run() {
            if (this.f36136d.f166287d.getVisibility() == 0) {
                this.f36136d.mo10792g(8);
            }
            this.f36136d.mo12153b1().removeMessages(this.f36136d.f36000w);
            this.f36136d.mo12153b1().sendEmptyMessage(this.f36136d.f35999v);
        }
    }

    public C12603pf(C12522mf mfVar, C64674r41 r412) {
        this.f36134d = mfVar;
        this.f36135e = r412;
    }

    public final void run() {
        Class cls = C76979h.class;
        int width = this.f36134d.mo12152a1().getWidth();
        StaticLayout staticLayout = new StaticLayout(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f36134d.f166287d.getContext(), this.f36135e.f185126f), this.f36134d.mo12152a1().getPaint(), width, Layout.Alignment.ALIGN_NORMAL, this.f36134d.mo12152a1().getLineSpacingMultiplier(), this.f36134d.mo12152a1().getLineSpacingExtra(), true);
        int height = this.f36134d.f166287d.getHeight() - ((ScrollView) ((C36570n) this.f36134d.f35997t).getValue()).getHeight();
        int b = C76577a.m92151b(this.f36134d.f166287d.getContext(), 155) - height;
        if (staticLayout.getHeight() > b) {
            this.f36134d.mo12152a1().setTextSize(0, (float) C76577a.m92157h(this.f36134d.f166287d.getContext(), C0966R.dimen.f3635t));
            int height2 = (int) (((float) ((new StaticLayout(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f36134d.f166287d.getContext(), this.f36135e.f185126f), this.f36134d.mo12152a1().getPaint(), width, Layout.Alignment.ALIGN_NORMAL, this.f36134d.mo12152a1().getLineSpacingMultiplier(), this.f36134d.mo12152a1().getLineSpacingExtra(), true).getHeight() / staticLayout.getLineCount()) * 2)) * 1.2f);
            this.f36134d.f166287d.getLayoutParams().height = height2 > b ? height2 + height : b + height;
            String str = this.f36134d.f35994q;
            Log.m105926v(str, "topComment width:" + width + " restHeight:" + height + " contextTvSv.height:" + ((ScrollView) ((C36570n) this.f36134d.f35997t).getValue()).getHeight() + " atLeastTwoLinesHeight:" + height2 + "  maxContentHeight:" + b);
        }
        this.f36134d.mo12152a1().post(new C12604a(this.f36134d));
    }
}
