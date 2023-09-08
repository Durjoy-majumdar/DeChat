package hp1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.regex.Pattern;

/* renamed from: hp1.d1 */
public final class C60054d1 {

    /* renamed from: a */
    public final Context f171382a;

    /* renamed from: b */
    public final Pattern f171383b = Pattern.compile("<em class=\"highlight\">\\S+</em>");

    /* renamed from: c */
    public final int f171384c = 22;

    /* renamed from: d */
    public final int f171385d = 5;

    /* renamed from: e */
    public final int f171386e;

    /* renamed from: f */
    public final int f171387f;

    public C60054d1(Context context, boolean z, boolean z2) {
        C87412m.m108594g(context, "context");
        this.f171382a = context;
        this.f171386e = z ? z2 ? context.getResources().getColor(C0966R.color.BW_100_Alpha_0_5) : context.getResources().getColor(C0966R.color.BW_100_Alpha_0_5) : z2 ? context.getResources().getColor(C0966R.color.BW_100_Alpha_0_5) : context.getResources().getColor(C0966R.color.FG_1);
        this.f171387f = z ? context.getResources().getColor(C0966R.color.BW_100_Alpha_0_8) : z2 ? context.getResources().getColor(C0966R.color.BW_100_Alpha_0_8) : context.getResources().getColor(C0966R.color.FG_0);
    }
}
