package il1;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import cl1.C0696x;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import te3.C50326ly0;

/* renamed from: il1.j2 */
public final class C9026j2 extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ C9002h2 f28503d;

    public C9026j2(C9002h2 h2Var) {
        this.f28503d = h2Var;
    }

    public void onClick(View view) {
        String str;
        C50326ly0 ly02;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansBuildWidget$setSubTitleContent$rightSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "p0");
        Intent intent = new Intent();
        C9002h2 h2Var = this.f28503d;
        C0696x xVar = (C0696x) FinderLiveService.f159376d.mo77630e(C0696x.class);
        if (xVar == null || (ly02 = xVar.f1644g) == null || (str = ly02.f137709g) == null) {
            str = "";
        }
        intent.putExtra("rawUrl", str);
        intent.putExtra("convertActivityFromTranslucent", true);
        C88144b.m109791i(h2Var.f28442o.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        this.f28503d.mo9809b();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansBuildWidget$setSubTitleContent$rightSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
        textPaint.setColor(this.f28503d.getContext().getResources().getColor(C0966R.color.Link_100));
        textPaint.setUnderlineText(false);
        textPaint.clearShadowLayer();
    }
}
