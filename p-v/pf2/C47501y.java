package pf2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import fy0.C8219i;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kw0.C46746a;
import nf2.C47240a;
import pf2.C47478f;
import sf0.C77702q0;
import te3.C49699hg;
import te3.C50117ke;
import te3.C50249le;

/* renamed from: pf2.y */
public final class C47501y extends C47466a {

    /* renamed from: B */
    public final Context f127446B;

    /* renamed from: C */
    public final ImageView f127447C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47501y(View view, C47240a aVar, C50117ke keVar) {
        super(view, aVar, keVar);
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(aVar, "outAdapter");
        C87412m.m108594g(keVar, "baseInfo");
        this.f127446B = view.getContext();
        this.f127447C = (ImageView) view.findViewById(C0966R.C0970id.lyv);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.lzc);
        TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.f357999lz0);
        TextView textView3 = (TextView) view.findViewById(C0966R.C0970id.lyw);
    }

    /* renamed from: y */
    public void mo72488y(C47472c cVar, int i) {
        C87412m.m108594g(cVar, "dataModel");
        C49699hg hgVar = cVar.f127337c;
        C50249le leVar = cVar.f127336b;
        Context context = this.f127446B;
        C87412m.m108593f(context, "mContext");
        C47240a aVar = this.f127316z;
        View view = this.f44854d;
        C87412m.m108593f(view, "itemView");
        C50117ke keVar = this.f127315A;
        C87412m.m108594g(aVar, "adapter");
        C87412m.m108594g(leVar, "detail");
        C87412m.m108594g(keVar, LiteAppCenter.FRAMEWORK_TYPE_BASE);
        C40726l.f109414a.mo63636e(leVar.f137340h, leVar.f137345p);
        view.setOnClickListener(new C47478f.C47480b(leVar, context, aVar, hgVar, keVar, i));
        View findViewById = this.f44854d.findViewById(C0966R.C0970id.lzb);
        View findViewById2 = this.f44854d.findViewById(C0966R.C0970id.lza);
        if (C77702q0.m93719b(leVar.f137317A)) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeVideoViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeVideoViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            C117292a.m165358d(findViewById, aVar3.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeVideoViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeVideoViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((TextView) findViewById2.findViewById(C0966R.C0970id.lyw)).setText(C92721n.m116876d(leVar.f137355z));
            TextView textView = (TextView) findViewById2.findViewById(C0966R.C0970id.lzc);
            textView.setText(leVar.f137336d);
            C8219i.f27144a.mo9271b(textView);
        } else {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view3 = findViewById2;
            C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeVideoViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeVideoViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(0);
            View view4 = findViewById;
            C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeVideoViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/LargeVideoViewHolder", "filling", "(Lcom/tencent/mm/plugin/profile/ui/tab/msg/holder/DataModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((TextView) findViewById.findViewById(C0966R.C0970id.lyz)).setText(C92721n.m116876d(leVar.f137355z));
            TextView textView2 = (TextView) findViewById.findViewById(C0966R.C0970id.lzd);
            textView2.setText(leVar.f137336d);
            C8219i.f27144a.mo9271b(textView2);
            ((TextView) findViewById.findViewById(C0966R.C0970id.f358000lz1)).setText(leVar.f137317A);
        }
        String str = C77702q0.m93719b(leVar.f137328L) ? leVar.f137342j : leVar.f137328L;
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59361q = C0966R.C0969drawable.f4586h2;
        bVar.f59347c = true;
        C20828a.m22825b().mo32519h(str, this.f127447C, bVar.mo32666a());
        ViewGroup.LayoutParams layoutParams = this.f127447C.getLayoutParams();
        C46746a aVar6 = C46746a.f125826a;
        Context context2 = this.f127446B;
        C87412m.m108593f(context2, "mContext");
        layoutParams.height = (int) (((double) (aVar6.mo71973f(context2) - C76577a.m92151b(this.f127446B, 16))) * 0.5625d);
    }
}
