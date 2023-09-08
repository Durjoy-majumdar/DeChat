package ve1;

import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C7865r3;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import kf1.C9833k9;
import kg3.C76577a;

/* renamed from: ve1.n6 */
public final class C14580n6 extends C60896i<C9833k9> {

    /* renamed from: e */
    public final boolean f40396e;

    public C14580n6(boolean z) {
        this.f40396e = z;
        Log.m105924i("FinderNearbyLiveFollowAllDividerConvert", "#init");
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.amp;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        String str;
        String str2;
        C60905o oVar2 = oVar;
        C9833k9 k9Var = (C9833k9) cVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(k9Var, "item");
        Log.m105924i("FinderNearbyLiveFollowAllDividerConvert", "onBindViewHolder size:" + k9Var.f30389f.size() + " continueAtTheEnd:" + k9Var.f30387d.f184850q);
        k9Var.f30391h = i;
        View findViewById = oVar2.f44854d.findViewById(C0966R.C0970id.haf);
        C87412m.m108593f(findViewById, "holder.itemView.findView…R.id.nearby_live_divider)");
        if (this.f40396e) {
            findViewById.setBackground(findViewById.getResources().getDrawable(C0966R.C0969drawable.aka));
        } else {
            findViewById.setBackground(findViewById.getResources().getDrawable(C0966R.C0969drawable.ak_));
        }
        View findViewById2 = oVar2.f44854d.findViewById(C0966R.C0970id.hah);
        C87412m.m108593f(findViewById2, "holder.itemView.findViewById(R.id.nearby_live_tv)");
        TextView textView = (TextView) findViewById2;
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        if (this.f40396e) {
            textView.setTextColor(textView.getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
            textView.setTextSize(0, (float) C76577a.m92155f(textView.getContext(), C0966R.dimen.a6j));
        }
        View findViewById3 = oVar2.f44854d.findViewById(C0966R.C0970id.ftz);
        C87412m.m108593f(findViewById3, "holder.itemView.findViewById(R.id.live_flag)");
        WeImageView weImageView = (WeImageView) findViewById3;
        if (this.f40396e) {
            weImageView.setIconColor(weImageView.getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
        }
        String str3 = "";
        String valueOf = k9Var.f30389f.size() > 0 ? String.valueOf(k9Var.f30389f.get(0).mo3513o().getNickNameSpan()) : str3;
        if (k9Var.f30389f.size() > 1) {
            str3 = String.valueOf(k9Var.f30389f.get(1).mo3513o().getNickNameSpan());
        }
        String string = k9Var.f30389f.size() == 2 ? oVar2.f173499A.getResources().getString(C0966R.string.h6_) : oVar2.f173499A.getResources().getString(C0966R.string.h69, new Object[]{Integer.valueOf(k9Var.f30387d.f184839E)});
        C87412m.m108593f(string, "if(item.rvFeedList.size …ips, feedCount)\n        }");
        if (TextUtils.isEmpty(valueOf) || TextUtils.isEmpty(str3)) {
            str = oVar2.f173499A.getResources().getString(C0966R.string.h6a);
            C87412m.m108593f(str, "{\n            holder.con…l_divider_tips)\n        }");
        } else {
            str = valueOf + 12289 + str3 + ' ' + string;
        }
        TextView textView2 = (TextView) oVar2.f44854d.findViewById(C0966R.C0970id.hah);
        int c = (C7865r3.f26468a.mo8970c() - textView2.getResources().getDimensionPixelOffset(C0966R.dimen.f3743cv)) - textView2.getResources().getDimensionPixelOffset(C0966R.dimen.f3755d6);
        TextPaint paint = textView2.getPaint();
        float measureText = paint.measureText(str);
        Log.m105924i("FinderNearbyLiveFollowAllDividerConvert", "setTips before textShowWidth:" + c + " textPaintWidth:" + measureText + " nickname1:" + valueOf + " nickname2:" + str3 + " dividerTips:" + str);
        float f = (float) c;
        String str4 = str;
        if (measureText > f) {
            if (str3.length() > 4) {
                StringBuilder sb = new StringBuilder();
                String substring = str3.substring(0, 4);
                C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(substring);
                sb.append("...");
                str3 = sb.toString();
            }
            str2 = valueOf + 12289 + str3 + ' ' + string;
        } else {
            str2 = str4;
        }
        float measureText2 = paint.measureText(str2);
        StringBuilder sb4 = new StringBuilder();
        TextPaint textPaint = paint;
        sb4.append("setTips after nickname1 textShowWidth:");
        sb4.append(c);
        sb4.append(" textPaintWidth:");
        sb4.append(measureText2);
        sb4.append(" nickname1:");
        sb4.append(valueOf);
        sb4.append(" nickname2:");
        sb4.append(str3);
        sb4.append(" dividerTips:");
        sb4.append(str2);
        Log.m105924i("FinderNearbyLiveFollowAllDividerConvert", sb4.toString());
        if (measureText2 > f) {
            if (valueOf.length() > 4) {
                StringBuilder sb5 = new StringBuilder();
                String substring2 = valueOf.substring(0, 4);
                C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                sb5.append(substring2);
                sb5.append("...");
                valueOf = sb5.toString();
            }
            str2 = valueOf + 12289 + str3 + ' ' + string;
        }
        Log.m105924i("FinderNearbyLiveFollowAllDividerConvert", "setTips after nickname2 textShowWidth:" + c + " textPaintWidth:" + textPaint.measureText(str2) + " nickname1:" + valueOf + " nickname2:" + str3 + " dividerTips:" + str2);
        if (!TextUtils.isEmpty(str2)) {
            oVar.mo85815G(C0966R.C0970id.hah, str2);
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
