package d60;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.Arrays;

/* renamed from: d60.v */
public final class C58219v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C58213u f166721d;

    /* renamed from: e */
    public final /* synthetic */ int f166722e;

    /* renamed from: f */
    public final /* synthetic */ int f166723f;

    public C58219v(C58213u uVar, int i, int i2) {
        this.f166721d = uVar;
        this.f166722e = i;
        this.f166723f = i2;
    }

    public final void run() {
        String str;
        C58213u uVar = this.f166721d;
        int i = uVar.f166710t;
        if (i == 0) {
            uVar.f166706p.setImageDrawable(uVar.f166707q);
        } else if (i == 1) {
            uVar.f166706p.setImageDrawable(uVar.f166708r);
        } else if (i == 2) {
            uVar.f166706p.setImageDrawable(uVar.f166709s);
        }
        C58213u uVar2 = this.f166721d;
        TextView textView = uVar2.f166700g;
        String string = uVar2.f166287d.getContext().getString(C0966R.string.g8i);
        C87412m.m108593f(string, "root.context.getString(R.string.live_members_tip)");
        String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f166722e)}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        textView.setText(format);
        C58213u uVar3 = this.f166721d;
        uVar3.f166701h.setText(String.valueOf(uVar3.f166711u));
        TextView textView2 = this.f166721d.f166702i;
        int i2 = this.f166723f;
        if (i2 <= 0) {
            str = "0";
        } else if (i2 < 10000) {
            str = String.valueOf(i2);
        } else if (i2 % 10000 >= 1000) {
            String string2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.g7u);
            C87412m.m108593f(string2, "getContext().resources.g…g.live_like_count_format)");
            str = String.format(string2, Arrays.copyOf(new Object[]{Float.valueOf(((float) i2) / 10000.0f)}, 1));
            C87412m.m108593f(str, "format(format, *args)");
        } else {
            String string3 = MMApplicationContext.getContext().getResources().getString(C0966R.string.g7v);
            C87412m.m108593f(string3, "getContext().resources.g…ve_like_count_int_format)");
            str = String.format(string3, Arrays.copyOf(new Object[]{Integer.valueOf(i2 / 10000)}, 1));
            C87412m.m108593f(str, "format(format, *args)");
        }
        textView2.setText(str);
    }
}
