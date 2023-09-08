package he1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.view.StrokeTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import p001ak.C54057e;
import p464ck.C54869f;
import p629ny.C76979h;
import te3.C50409mj;
import up1.C37521f;
import zp3.C79406f;

/* renamed from: he1.u */
public final class C59868u extends C54869f {

    /* renamed from: a */
    public final Context f170933a;

    public C59868u(Context context) {
        C87412m.m108594g(context, "context");
        this.f170933a = context;
    }

    /* renamed from: e */
    public int mo14332e(Object obj) {
        return 0;
    }

    /* renamed from: f */
    public void mo14333f(int i, C54869f.C54870a aVar, C54057e eVar) {
        C87412m.m108594g(aVar, "viewHolder");
        C87412m.m108594g(eVar, "danmaku");
        DATA data = eVar.f151367x;
        C87412m.m108592e(data, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.bullet.FinderBulletInfo");
        C59840c cVar = (C59840c) data;
        C59839b bVar = (C59839b) aVar;
        StrokeTextView strokeTextView = bVar.f170849f;
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        strokeTextView.setStrokeColor(C37521f.f99370c5.mo60266n().intValue() == 1 ? this.f170933a.getResources().getColor(C0966R.color.f3574y7) : this.f170933a.getResources().getColor(C0966R.color.f3577y_));
        fVar.getClass();
        int intValue = C37521f.f99379d5.mo60266n().intValue();
        if (intValue <= 0) {
            intValue = 17;
        }
        bVar.f170849f.setTextSize(0, (float) C79406f.m96347a(this.f170933a, (float) intValue));
        Log.m105924i("TextDanmakuRender", "onBindViewHolder: bulletTextSize=" + intValue);
        C50409mj mjVar = cVar.f170850a;
        String str = mjVar.f138060f;
        int i2 = mjVar.f138064j;
        if (i2 == 1) {
            bVar.f170848e.setVisibility(8);
            bVar.f170849f.setTextColor(this.f170933a.getResources().getColor(C0966R.color.f2939n));
        } else if (i2 != 2) {
            bVar.f170848e.setVisibility(8);
            bVar.f170849f.setTextColor(-1);
        } else {
            bVar.f170848e.setVisibility(0);
            bVar.f170848e.setImageResource(C0966R.C0969drawable.cgx);
            bVar.f170848e.getLayoutParams().width = this.f170933a.getResources().getDimensionPixelOffset(C0966R.dimen.f3745cw);
            bVar.f170849f.setTextColor(-1);
        }
        bVar.f170849f.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this.f170933a, str));
    }

    /* renamed from: g */
    public C54869f.C54870a mo14334g(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        View inflate = LayoutInflater.from(this.f170933a).inflate(C0966R.C0971layout.bbg, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(context).inflate(R.…mega_bullet_layout, null)");
        C59839b bVar = new C59839b(inflate);
        C85875k4.m106189j0(bVar.f170849f.getPaint(), 0.8f);
        Log.m105924i("TextDanmakuRender", "onCreateViewHolder: cost = " + (System.currentTimeMillis() - currentTimeMillis));
        return bVar;
    }
}
