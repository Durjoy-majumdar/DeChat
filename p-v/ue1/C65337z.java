package ue1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import er1.C58784w3;
import ev1.C58840e;
import gy3.C87412m;
import hi3.C87515a;
import ht1.C60200t1;
import j20.C117292a;
import java.util.List;
import jq3.C60905o;
import k20.C9556a;
import org.json.JSONObject;
import p629ny.C76979h;
import p687sr.C64159i;
import rx3.C13598b0;
import te3.C48978cb0;
import te3.C49712hj1;

/* renamed from: ue1.z */
public final class C65337z extends C58840e {

    /* renamed from: o */
    public final boolean f188060o;

    /* renamed from: p */
    public final boolean f188061p;

    /* renamed from: q */
    public final Intent f188062q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65337z(String str, String str2, String str3, Bitmap bitmap, int i, long j, boolean z, boolean z2, Intent intent) {
        super(str, str2, str3, bitmap, i, j);
        C87412m.m108594g(str, "id");
        C87412m.m108594g(str2, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str3, "desc");
        C87412m.m108594g(intent, "intent");
        this.f188060o = z;
        this.f188061p = z2;
        this.f188062q = intent;
    }

    /* renamed from: a */
    public int mo84032a() {
        return MMApplicationContext.getColor(C0966R.color.f3605zw);
    }

    /* renamed from: b */
    public Drawable mo84033b() {
        return C87515a.m108835e(MMApplicationContext.getResources(), C0966R.raw.icons_outlined_live, 0.0f);
    }

    /* renamed from: d */
    public String mo84034d() {
        String string = MMApplicationContext.getContext().getString(C0966R.string.dku);
        C87412m.m108593f(string, "getContext().getString(c…string.finder_live_entry)");
        return string;
    }

    /* renamed from: i */
    public boolean mo84036i() {
        return this.f188060o;
    }

    /* renamed from: j */
    public boolean mo84037j() {
        return this.f188061p;
    }

    /* renamed from: m */
    public void mo84040m() {
        long longExtra = this.f188062q.getLongExtra("KEY_OBJECT_ID", 0);
        C48978cb0 cb02 = new C48978cb0();
        cb02.f131607d = longExtra;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("feedActionType", 38);
        jSONObject.put("feedActionSubType", 1);
        cb02.f131610g = jSONObject.toString();
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76900y((C49712hj1) null, 18054, cb02);
    }

    /* renamed from: p */
    public void mo84043p(C60905o oVar, View view, int i) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(view, "view");
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76769JB("temp_34");
        Context context = MMApplicationContext.getContext();
        Intent intent = this.f188062q;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/conv/FinderLiveMsgItem", "onItemClick", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/conv/FinderLiveMsgItem", "onItemClick", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: t */
    public void mo84048t(C60905o oVar, int i, int i2, boolean z, List<Object> list) {
        C13598b0 b0Var;
        C87412m.m108594g(oVar, "holder");
        if (((C64159i) C86312j.m106911c(C64159i.class)).sq0().mo84685a()) {
            TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.kpm);
            if (textView != null) {
                textView.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.f3484uu));
            }
            TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.lr8);
            if (textView2 != null) {
                textView2.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.f3482us));
            }
        } else {
            TextView textView3 = (TextView) oVar.mo85812D(C0966R.C0970id.kpm);
            if (textView3 != null) {
                textView3.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.f3481uq));
            }
            TextView textView4 = (TextView) oVar.mo85812D(C0966R.C0970id.lr8);
            if (textView4 != null) {
                textView4.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.f3479uo));
            }
        }
        ImageView imageView = (ImageView) oVar.f44854d.findViewById(C0966R.C0970id.a27);
        ImageView imageView2 = (ImageView) oVar.f44854d.findViewById(C0966R.C0970id.a0h);
        TextView textView5 = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.kpm);
        TextView textView6 = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.lr8);
        textView5.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(textView5.getContext(), this.f168438h, textView5.getTextSize()));
        textView6.setText(this.f168439i);
        textView6.requestLayout();
        Bitmap bitmap = this.f168440j;
        if (bitmap != null) {
            imageView.setVisibility(0);
            imageView.setImageBitmap(bitmap);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            imageView.setVisibility(8);
        }
        int i3 = this.f168441n;
        if (i3 == 1 || i3 == 2) {
            C58784w3 w3Var = C58784w3.f168295a;
            C87412m.m108593f(imageView2, "authIv");
            C58784w3.m68428E1(w3Var, imageView2, this.f168441n, (String) null, 0, 8, (Object) null);
            return;
        }
        imageView2.setVisibility(8);
    }
}
