package ve1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import cm1.C55034v;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.C4059g5;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import go3.C76003c;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import pf1.C62262d0;
import qo3.C77407n;
import vd1.C14432d;
import vd1.C14433e;
import vd1.C65584b;

/* renamed from: ve1.d0 */
public final class C14488d0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14680x f40169d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f40170e;

    /* renamed from: f */
    public final /* synthetic */ C55034v f40171f;

    /* renamed from: g */
    public final /* synthetic */ FinderJumpInfo f40172g;

    public C14488d0(C14680x xVar, C60905o oVar, C55034v vVar, FinderJumpInfo finderJumpInfo) {
        this.f40169d = xVar;
        this.f40170e = oVar;
        this.f40171f = vVar;
        this.f40172g = finderJumpInfo;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshMoreView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C14680x xVar = this.f40169d;
        C60905o oVar = this.f40170e;
        C55034v vVar = this.f40171f;
        FinderJumpInfo finderJumpInfo = this.f40172g;
        xVar.getClass();
        boolean z = ((Number) C65584b.f188718a.mo89659b(finderJumpInfo).f38556e).intValue() == 1;
        Context context = oVar.f44854d.getContext();
        C87412m.m108593f(context, "holder.itemView.context");
        FinderItem finderItem = vVar.f154508w;
        C14695y yVar = new C14695y(z, finderJumpInfo, xVar, oVar, vVar);
        C87412m.m108594g(finderItem, "feed");
        C77407n nVar = new C77407n(context, 1, true);
        String str = null;
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.d4q, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0966R.C0970id.kpm)).setText(context.getResources().getString(z ? C0966R.string.n1b : C0966R.string.n18));
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.nxb);
        if (textView != null) {
            float f = (float) C74783i3.m89537a(context).f24704a;
            if (finderJumpInfo != null) {
                str = C62262d0.f176978a.mo87315e(context, finderJumpInfo);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(' ');
            sb.append(TextUtils.ellipsize(str, textView.getPaint(), f, TextUtils.TruncateAt.END));
            sb.append(12301);
            String sb4 = sb.toString();
            SpannableString spannableString = new SpannableString("「" + ' ' + sb4);
            int color = context.getResources().getColor(C0966R.color.FG_1);
            Drawable e = C74933u4.m89768e(context, C0966R.raw.icons_filled_music4, color);
            int dimension = (int) context.getResources().getDimension(C0966R.dimen.f3723cd);
            e.setBounds(0, 0, (int) (((((float) dimension) * 1.0f) * ((float) e.getIntrinsicWidth())) / ((float) e.getIntrinsicHeight())), dimension);
            spannableString.setSpan(new C76003c(e, 1), 1, 2, 17);
            spannableString.setSpan(new C4059g5(sb4, color, color, false, false, C14433e.f40046d, 24, (C8480h) null), 2, sb4.length() + 2, 17);
            textView.setText(spannableString);
        }
        nVar.mo107569n(inflate, false);
        inflate.setOnClickListener(new C14432d(context, finderItem, z, yVar, nVar));
        nVar.mo107573q();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshMoreView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
