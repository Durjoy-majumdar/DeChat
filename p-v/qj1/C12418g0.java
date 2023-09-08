package qj1;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: qj1.g0 */
public final class C12418g0 extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveAnchorAfterPlugin f35780d;

    public C12418g0(FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin) {
        this.f35780d = finderLiveAnchorAfterPlugin;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareReplayPanel$clickableSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "widget");
        String I = C86709a0.m107535s().mo121142i().mo119675I(C72994y1.C72995a.USERINFO_FINDER_LIVE_REPLAY_GUIDE_URL_STRING_SYNC, "");
        if (!(!(I == null || I.length() == 0))) {
            I = null;
        }
        if (I != null) {
            FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin = this.f35780d;
            Intent intent = new Intent();
            intent.putExtra("rawUrl", I);
            intent.putExtra("convertActivityFromTranslucent", true);
            C88144b.m109791i(finderLiveAnchorAfterPlugin.f166287d.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$prepareReplayPanel$clickableSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
        textPaint.setColor(this.f35780d.f166287d.getContext().getResources().getColor(C0966R.color.f2958ae));
        textPaint.setUnderlineText(false);
    }
}
