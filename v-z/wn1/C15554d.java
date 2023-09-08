package wn1;

import android.content.Context;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.finder.order.p054ui.OrderConvert;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import jq3.C60905o;
import rx3.C13604l;
import sx3.C110818d0;
import te3.C50831ph3;
import tn1.C14051a;

/* renamed from: wn1.d */
public final class C15554d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60905o f42149d;

    /* renamed from: e */
    public final /* synthetic */ OrderConvert f42150e;

    /* renamed from: f */
    public final /* synthetic */ C14051a f42151f;

    /* renamed from: g */
    public final /* synthetic */ TextView f42152g;

    /* renamed from: h */
    public final /* synthetic */ TextView f42153h;

    public C15554d(C60905o oVar, OrderConvert orderConvert, C14051a aVar, TextView textView, TextView textView2) {
        this.f42149d = oVar;
        this.f42150e = orderConvert;
        this.f42151f = aVar;
        this.f42152g = textView;
        this.f42153h = textView2;
    }

    public final void run() {
        C13604l lVar;
        float width = (float) this.f42149d.f44854d.getWidth();
        OrderConvert orderConvert = this.f42150e;
        Context context = this.f42149d.f173499A;
        C87412m.m108593f(context, "holder.context");
        LinkedList<C50831ph3> linkedList = this.f42151f.f39399d.f137196D;
        C87412m.m108593f(linkedList, "item.order.price_wording_part_list");
        TextPaint paint = this.f42152g.getPaint();
        C87412m.m108593f(paint, "skuDescTv.paint");
        orderConvert.getClass();
        boolean z = true;
        if (linkedList.isEmpty()) {
            lVar = new C13604l("", "");
        } else {
            CharSequence k = orderConvert.mo3690k((C50831ph3) C110818d0.m150914L(linkedList));
            String k2 = linkedList.size() >= 2 ? orderConvert.mo3690k(linkedList.get(1)) : "";
            String str = orderConvert.f15844e;
            Log.m105924i(str, "price desc first line = " + k);
            String str2 = orderConvert.f15844e;
            Log.m105924i(str2, "price desc second line = " + k2);
            CharSequence concat = TextUtils.concat(new CharSequence[]{k, k2});
            float desiredWidth = Layout.getDesiredWidth(concat, paint) + ((float) C74942w4.m89784a(context, 32));
            String str3 = orderConvert.f15844e;
            Log.m105924i(str3, "price desc combined width = " + desiredWidth + ", available width = " + width);
            lVar = desiredWidth >= width ? new C13604l(k, k2) : new C13604l(concat, "");
        }
        this.f42152g.setText((CharSequence) lVar.f38555d);
        if (((CharSequence) lVar.f38556e).length() <= 0) {
            z = false;
        }
        if (z) {
            this.f42153h.setVisibility(0);
            this.f42153h.setText((CharSequence) lVar.f38556e);
            return;
        }
        this.f42153h.setVisibility(8);
    }
}
