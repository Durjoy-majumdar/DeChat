package p61;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.List;
import kg3.C76577a;
import u61.C101962d;
import zp3.C79406f;

/* renamed from: p61.q */
public final class C100670q extends C100657j<C100681v> {

    /* renamed from: B */
    public final String f294939B = "MicroMsg.EmojiStoreV3ListMoreBottomHolder";

    /* renamed from: C */
    public final TextView f294940C;

    /* renamed from: D */
    public final Drawable f294941D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100670q(Context context, View view, C100640a0 a0Var) {
        super(view, a0Var);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(view, "itemView");
        View findViewById = view.findViewById(C0966R.C0970id.lyk);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.…oji_store_load_bottom_tv)");
        this.f294940C = (TextView) findViewById;
        int d = C76577a.m92153d(context, C0966R.color.BW_100);
        int d2 = C76577a.m92153d(context, C0966R.color.BW_0_Alpha_0_0_5);
        float a = (float) C79406f.m96347a(context, 8.0f);
        this.f294941D = C101962d.f300168a.mo141484b(d, d2, 0.0f, 0.0f, a, a);
    }

    /* renamed from: y */
    public void mo140091y(C100684y yVar, List<Object> list) {
        C87412m.m108594g(yVar, "item");
        C87412m.m108594g(list, "payloads");
        super.mo140091y(yVar, list);
        TextView textView = this.f294940C;
        C100681v vVar = (C100681v) this.f294874A;
        String str = null;
        textView.setText(vVar != null ? vVar.f294990a : null);
        String str2 = this.f294939B;
        StringBuilder sb = new StringBuilder();
        sb.append("content: ");
        C100681v vVar2 = (C100681v) this.f294874A;
        if (vVar2 != null) {
            str = vVar2.f294990a;
        }
        sb.append(str);
        Log.m105918d(str2, sb.toString());
        this.f44854d.setBackground(this.f294941D);
    }
}
