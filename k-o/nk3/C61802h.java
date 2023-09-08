package nk3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.gridviewheaders.C74763a;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Date;
import ok3.C62070e;
import p196ln.C76705f;
import p629ny.C76979h;
import z04.C112550d0;

/* renamed from: nk3.h */
public final class C61802h extends RecyclerView.C16613e<RecyclerView.C16631z> {

    /* renamed from: d */
    public final Context f175726d;

    /* renamed from: e */
    public final C61806k f175727e;

    /* renamed from: f */
    public final C61805j f175728f;

    /* renamed from: g */
    public String f175729g = "";

    /* renamed from: nk3.h$a */
    public static final class C61803a implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C61802h f175730d;

        public C61803a(C61802h hVar) {
            this.f175730d = hVar;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/search/multi/adapter/FTSMultiNormalResultAdapter$onCreateViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) tag).intValue();
            this.f175730d.f175728f.mo86729R1(view, intValue, this.f175730d.f175727e.getItem(intValue));
            C117292a.m165362h(true, this, "com/tencent/mm/ui/chatting/search/multi/adapter/FTSMultiNormalResultAdapter$onCreateViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: nk3.h$b */
    public static final class C61804b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C61802h f175731d;

        public C61804b(C61802h hVar) {
            this.f175731d = hVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/search/multi/adapter/FTSMultiNormalResultAdapter$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) tag).intValue();
            this.f175731d.f175728f.mo86728M0(view, intValue, this.f175731d.f175727e.getItem(intValue));
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/search/multi/adapter/FTSMultiNormalResultAdapter$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C61802h(Context context, C61806k kVar, C61805j jVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(kVar, "resultDetail");
        C87412m.m108594g(jVar, "itemClickListener");
        this.f175726d = context;
        this.f175727e = kVar;
        this.f175728f = jVar;
    }

    /* renamed from: F4 */
    public final void mo86725F4(String str) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        Log.m105924i("MicroMsg.FTSMultiNormalResultAdapter", "updateCurrentQuery >> " + str);
        this.f175729g = str;
    }

    public int getItemCount() {
        return this.f175727e.getCount();
    }

    public int getItemViewType(int i) {
        return this.f175727e.getItem(i).f176457b;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        String str;
        C87412m.m108594g(zVar, "baseHolder");
        int itemViewType = getItemViewType(i);
        C62070e item = this.f175727e.getItem(i);
        if (itemViewType != 1) {
            C61801g gVar = (C61801g) zVar;
            gVar.f175725z.setTag(Integer.valueOf(i));
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(gVar.f175720A, item.f176460e);
            C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
            Context context = this.f175726d;
            if (Util.isNullOrNil(this.f175729g)) {
                str = Util.isNullOrNil(item.f176462g) ? Util.isNullOrNil(item.f176463h) ? item.f176461f : item.f176463h : item.f176462g;
            } else if (!Util.isNullOrNil(item.f176462g)) {
                if (!Util.isNullOrNil(item.f176463h)) {
                    String str2 = item.f176463h;
                    C87412m.m108591d(str2);
                    if (C112550d0.m153801u(str2, this.f175729g, false)) {
                        str = item.f176462g + '(' + item.f176463h + ')';
                    }
                }
                if (!Util.isNullOrNil(item.f176461f)) {
                    String str3 = item.f176461f;
                    C87412m.m108591d(str3);
                    if (C112550d0.m153801u(str3, this.f175729g, false)) {
                        str = item.f176462g + '(' + item.f176461f + ')';
                    }
                }
                str = item.f176462g;
            } else if (!Util.isNullOrNil(item.f176463h)) {
                if (!Util.isNullOrNil(item.f176461f)) {
                    String str4 = item.f176461f;
                    C87412m.m108591d(str4);
                    if (C112550d0.m153801u(str4, this.f175729g, false)) {
                        str = item.f176463h + '(' + item.f176461f + ')';
                    }
                }
                str = item.f176463h;
            } else {
                str = item.f176461f;
            }
            gVar.f175721B.setText(hVar.yp0(context, str, gVar.f175721B.getTextSize()));
            gVar.f175722C.setText(C72715f.m85112e(this.f175726d, item.f176456a, true));
            gVar.f175723D.setText(item.f176458c);
            this.f175727e.mo86730V0(gVar, i, itemViewType);
            if (!Util.isNullOrNil(this.f175729g)) {
                gVar.mo86724y(gVar.f175721B, this.f175729g);
                gVar.mo86724y(gVar.f175723D, this.f175729g);
            }
        } else if (i == getItemCount() - 1) {
            ((C11212e) zVar).f33067z.setVisibility(8);
        } else {
            if (C74763a.m89510e().mo103933a(new Date(this.f175727e.getItem(i + 1).f176456a)) != C74763a.m89510e().mo103933a(new Date(item.f176456a))) {
                ((C11212e) zVar).f33067z.setVisibility(8);
                return;
            }
            C11212e eVar = (C11212e) zVar;
            eVar.f33067z.setVisibility(0);
            eVar.f33067z.setText(C74763a.m89510e().mo103936d(new Date(item.f176456a), this.f175726d));
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cvu, viewGroup, false);
            C87412m.m108593f(inflate, "from(parent.context).inf…item_date, parent, false)");
            return new C11212e(inflate, this.f175726d);
        }
        RecyclerView.C16631z o = this.f175727e.mo86733o(viewGroup, i);
        o.f44854d.setOnLongClickListener(new C61803a(this));
        o.f44854d.setOnClickListener(new C61804b(this));
        return o;
    }
}
