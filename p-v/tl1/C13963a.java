package tl1;

import al1.C0082q;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import o40.C61937h;
import ok1.C62042e;
import rl1.C13064o0;
import rx3.C13598b0;
import te3.C52204z21;
import y50.C15936n0;

/* renamed from: tl1.a */
public final class C13963a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C0082q f39209d;

    /* renamed from: e */
    public final /* synthetic */ C13969d f39210e;

    /* renamed from: f */
    public final /* synthetic */ boolean f39211f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13963a(C0082q qVar, C13969d dVar, boolean z) {
        super(0);
        this.f39209d = qVar;
        this.f39210e = dVar;
        this.f39211f = z;
    }

    public Object invoke() {
        C0082q qVar = this.f39209d;
        C52204z21 z212 = qVar.f509d;
        if (z212 != null) {
            int i = qVar.f506a;
            int i2 = qVar.f507b;
            String str = this.f39210e.f39229B;
            Log.m105924i(str, "anchorOpenCard lotteryInfo:" + C61937h.m72709h(z212) + ", status:" + i + ",statusChange:" + this.f39211f + ",haveLottering:" + this.f39209d.f508c + ",,localRemainTime:" + i2);
            if (i == 1) {
                C13969d dVar = this.f39210e;
                dVar.getClass();
                dVar.mo13420g1(0);
                C13969d dVar2 = this.f39210e;
                dVar2.getClass();
                int i3 = z212.f145641e;
                int i4 = z212.f145642f;
                int i5 = z212.f145643g;
                if (i2 < 0 || i2 >= i4 - i3) {
                    i2 = C62042e.f176370a.mo87099n0(i3, i4, i5);
                }
                int i6 = i2;
                TextView textView = dVar2.f39235H;
                if (textView != null) {
                    String string = dVar2.f166287d.getContext().getResources().getString(C0966R.string.dt7);
                    C87412m.m108593f(string, "root.context.resources.g…r_live_lottery_countdown)");
                    String str2 = string;
                    String format = String.format(str2, Arrays.copyOf(new Object[]{C15936n0.C15937a.m14866a(C15936n0.f42815a, i6, XVFSFile.PATH_SEPARATOR, false, false, false, 24, (Object) null)}, 1));
                    C87412m.m108593f(format, "format(format, *args)");
                    textView.setText(format);
                }
                if (z212.f145647n > 0) {
                    TextView textView2 = dVar2.f39236I;
                    if (textView2 != null) {
                        String string2 = dVar2.f166287d.getContext().getResources().getString(C0966R.string.dsl);
                        C87412m.m108593f(string2, "root.context.resources.g…nder_live_lottery_attend)");
                        String format2 = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(z212.f145647n)}, 1));
                        C87412m.m108593f(format2, "format(format, *args)");
                        textView2.setText(format2);
                    }
                    TextView textView3 = dVar2.f39237J;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                } else {
                    TextView textView4 = dVar2.f39236I;
                    if (textView4 != null) {
                        textView4.setText(dVar2.f166287d.getContext().getResources().getString(C0966R.string.du4));
                    }
                    TextView textView5 = dVar2.f39237J;
                    if (textView5 != null) {
                        textView5.setVisibility(0);
                    }
                }
                dVar2.mo13421h1(dVar2.f39234G, z212);
                TextView textView6 = dVar2.f39238K;
                if (textView6 != null) {
                    C13064o0.f37206a.mo12568g(textView6);
                }
                this.f39210e.mo10792g(0);
            } else if (i == 2) {
                C13969d dVar3 = this.f39210e;
                dVar3.mo13429d1(this.f39209d, z212, i, dVar3.f39250X);
            } else if (i == 3) {
                C13969d dVar4 = this.f39210e;
                dVar4.mo13429d1(this.f39209d, z212, i, dVar4.f39251Y);
            } else if (i == 4) {
                String str3 = this.f39210e.f39229B;
                Log.m105924i(str3, "anchorLotteryCancelled id:" + z212.f145640d);
                this.f39210e.mo10792g(8);
            }
        }
        return C13598b0.f38549a;
    }
}
