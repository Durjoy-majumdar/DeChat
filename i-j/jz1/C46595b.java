package jz1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bz1.C0394d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40306c;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.tools.C45081s1;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import cz1.C7143c;
import di3.C86312j;
import dz1.C45499b;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import hz1.C46161a;
import java.util.LinkedList;
import jq3.C60905o;
import jz1.C46625t;
import kg3.C76577a;
import p192l4.C10461a;
import p629ny.C76979h;
import tl3.C78039a;
import xy1.C15912f;
import xy1.C15913g;

/* renamed from: jz1.b */
public final class C46595b extends RecyclerView.C16613e<C46596a> implements C46625t.C46626a {

    /* renamed from: d */
    public final C46612n f125501d = new C46612n(this);

    /* renamed from: e */
    public final C46594a f125502e = new C46594a(this);

    /* renamed from: f */
    public final C46627u f125503f = new C46627u(this);

    /* renamed from: g */
    public final LinkedList<C7143c> f125504g = new LinkedList<>();

    /* renamed from: jz1.b$a */
    public static class C46596a extends C60905o {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46596a(View view, C10461a aVar) {
            super(view, aVar);
            C87412m.m108594g(view, "itemView");
        }
    }

    /* renamed from: jz1.b$b */
    public interface C46597b {
        /* renamed from: a */
        void mo71887a(View view, int i, C7143c cVar);
    }

    /* renamed from: jz1.b$c */
    public interface C46598c {
        /* renamed from: a */
        void mo71888a(View view, int i, C7143c cVar, int i2);
    }

    public C7143c getItem(int i) {
        C7143c cVar = this.f125504g.get(i);
        C87412m.m108593f(cVar, "dataList[pos]");
        return cVar;
    }

    public int getItemCount() {
        return this.f125504g.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        CharSequence charSequence;
        C46596a aVar = (C46596a) zVar;
        C87412m.m108594g(aVar, "holder");
        C46612n nVar = this.f125501d;
        nVar.getClass();
        View view = aVar.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        C7143c item = nVar.f125565a.getItem(i);
        C10461a aVar2 = aVar.f173501C;
        C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelife.databinding.GamelifeConversationNormalItemBinding");
        C45499b bVar = (C45499b) aVar2;
        aVar.f173503E = item;
        view.setBackgroundResource(C0966R.C0969drawable.f4855pa);
        bVar.f123150d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        C72963f4 Ex0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Ex0(item.field_sessionId);
        int i2 = 0;
        if (Ex0 != null && Ex0.getStatus() == 5) {
            Drawable drawable = view.getContext().getResources().getDrawable(C0966R.raw.msg_state_failed);
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            } else {
                drawable = null;
            }
            bVar.f123150d.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        TextView textView = bVar.f123150d;
        Class cls = C76979h.class;
        Context context = MMApplicationContext.getContext();
        if ((item.field_digestFlag & 1) > 0) {
            item.field_digestPrefix = C76577a.m92166q(context, C0966R.string.fcx);
            item.field_digestFlag = 0;
        }
        String str = item.field_digestPrefix;
        if (str == null || str.length() == 0) {
            charSequence = ((C76979h) C86312j.m106911c(cls)).mo107057T1(context, item.field_digest);
            C87412m.m108593f(charSequence, "getService(ISpannableSer…ey(context, field_digest)");
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(item.field_digestPrefix);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C76577a.m92153d(context, C0966R.color.f2966ao)), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append(" ").append(((C76979h) C86312j.m106911c(cls)).mo107057T1(context, item.field_digest));
            charSequence = spannableStringBuilder;
        }
        textView.setText(charSequence);
        bVar.f123154h.setText(String.valueOf(C72715f.m85112e(view.getContext(), item.field_updateTime, true)));
        bVar.f123156j.setVisibility(8);
        bVar.f123155i.setVisibility(item.field_unReadCount > 0 ? 0 : 8);
        TextView textView2 = bVar.f123155i;
        int i3 = item.field_unReadCount;
        textView2.setText(i3 > 99 ? "..." : String.valueOf(i3));
        bVar.f123155i.setBackgroundResource(C45081s1.m49933b(view.getContext(), item.field_unReadCount));
        if (item.mo8334m2()) {
            View view2 = aVar.f44854d;
            bVar.f123155i.setVisibility(8);
            TextView textView3 = bVar.f123156j;
            int i4 = item.field_unReadCount;
            if (i4 == Integer.MAX_VALUE || i4 == 0) {
                i2 = 8;
            }
            textView3.setVisibility(i2);
            bVar.f123148b.setImageResource(C0966R.C0969drawable.f357215a83);
            bVar.f123149c.setText(C76577a.m92166q(view2.getContext(), C0966R.string.f360853fd1));
            view2.setOnClickListener(new C46608j(item, nVar, i, view2));
            view2.setOnLongClickListener(new C46609k(nVar, item, i, aVar, view2));
            return;
        }
        C46612n nVar2 = nVar;
        C7143c cVar = item;
        int i5 = i;
        C46596a aVar3 = aVar;
        View view3 = view;
        view.setOnClickListener(new C46610l(nVar2, cVar, i5, aVar3, view3));
        view.setOnLongClickListener(new C46611m(nVar2, cVar, i5, aVar3, view3));
        bVar.f123149c.setText(item.f25116G);
        C78039a.m94189a(bVar.f123148b, item.field_sessionId);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        this.f125501d.getClass();
        C45499b a = C45499b.m50457a(C85868k2.m106137b(viewGroup.getContext()), viewGroup, false);
        LinearLayout linearLayout = a.f123147a;
        C87412m.m108593f(linearLayout, "itemBinding.root");
        return new C46596a(linearLayout, a);
    }

    public void onViewAttachedToWindow(RecyclerView.C16631z zVar) {
        C46596a aVar = (C46596a) zVar;
        C87412m.m108594g(aVar, "holder");
        super.onViewAttachedToWindow(aVar);
        C7143c cVar = (C7143c) aVar.f173503E;
        if (cVar != null) {
            int j = aVar.mo17363j();
            if (!cVar.mo8334m2()) {
                C15912f X3 = ((C15913g) C86312j.m106911c(C15913g.class)).mo440X3(cVar.field_selfUserName);
                if (X3 != null) {
                    C40306c.C40307a aVar2 = C40306c.f108374a;
                    int i = j + 1;
                    int w2 = mo71886w2();
                    String str = cVar.field_sessionId;
                    String str2 = str;
                    C87412m.m108593f(str, "item.field_sessionId");
                    long D0 = (long) X3.mo422D0();
                    String str3 = cVar.field_selfUserName;
                    String str4 = str3;
                    C87412m.m108593f(str3, "item.field_selfUserName");
                    C0394d dVar = cVar.f25115F;
                    C87412m.m108591d(dVar);
                    long j2 = (long) dVar.field_accountType;
                    String str5 = cVar.field_talker;
                    C87412m.m108593f(str5, "item.field_talker");
                    C40306c.C40307a.m43452g(aVar2, i, 1, w2, str2, D0, str4, j2, str5, cVar.mo8333l2(), C46161a.f124440a, (String) null, 1024, (Object) null);
                    return;
                }
                return;
            }
            C40306c.C40307a aVar3 = C40306c.f108374a;
            int i2 = j + 1;
            int w25 = mo71886w2();
            String str6 = cVar.field_sessionId;
            C87412m.m108593f(str6, "item.field_sessionId");
            C40306c.C40307a.m43452g(aVar3, i2, 1, w25, str6, 0, "", 0, "", cVar.mo8333l2(), C46161a.f124440a, (String) null, 1024, (Object) null);
        }
    }

    /* renamed from: w2 */
    public int mo71886w2() {
        return this.f125504g.size();
    }
}
