package i60;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import de3.C75375u;
import di3.C86312j;
import eb0.C75592q0;
import gc0.C20828a;
import gy3.C87412m;
import java.util.ArrayList;
import p196ln.C76705f;
import p629ny.C76979h;

/* renamed from: i60.d */
public final class C46170d extends RecyclerView.C16613e<C46171a> {

    /* renamed from: d */
    public final ArrayList<C46169a> f124462d = new ArrayList<>();

    /* renamed from: e */
    public final C46172b f124463e = new C46172b();

    /* renamed from: i60.d$a */
    public static final class C46171a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final ImageView f124464A;

        /* renamed from: B */
        public final TextView f124465B;

        /* renamed from: z */
        public final ViewGroup f124466z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46171a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            View findViewById = view.findViewById(C0966R.C0970id.fst);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…omment_item_avatar_group)");
            this.f124466z = (ViewGroup) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.fsu);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.…comment_item_avatar_icon)");
            this.f124464A = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.fsv);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.…_comment_item_content_tv)");
            this.f124465B = (TextView) findViewById3;
        }
    }

    /* renamed from: i60.d$b */
    public static final class C46172b extends CharacterStyle {
        public void updateDrawState(TextPaint textPaint) {
            int color = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3553xj);
            if (textPaint != null) {
                textPaint.setColor(color);
            }
            if (textPaint != null) {
                textPaint.setUnderlineText(false);
            }
        }
    }

    public int getItemCount() {
        return this.f124462d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C46171a aVar = (C46171a) zVar;
        Class cls = C76979h.class;
        C87412m.m108594g(aVar, "holder");
        Context context = MMApplicationContext.getContext();
        int i2 = this.f124462d.get(i).f124460d;
        if (i2 == 1) {
            C87412m.m108593f(context, "context");
            C46169a aVar2 = this.f124462d.get(i);
            C87412m.m108593f(aVar2, "commentList[position]");
            C46169a aVar3 = aVar2;
            Class cls2 = C76705f.class;
            if (C87412m.m108589b(aVar3.f124457a, C75592q0.m90783m())) {
                ((C76705f) C86312j.m106911c(cls2)).mo106849z(aVar.f124464A, C75592q0.m90789s());
            } else if (Util.isNullOrNil(aVar3.f124458b)) {
                ((C76705f) C86312j.m106911c(cls2)).mo106849z(aVar.f124464A, aVar3.f124457a);
            } else {
                C20828a.m22825b().mo32518g(aVar3.f124458b, aVar.f124464A);
            }
            aVar.f124466z.setVisibility(0);
            String string = context.getString(C0966R.string.g6r, new Object[]{RoomLiveService.f157190a.mo76443a(aVar3.f124457a)});
            C87412m.m108593f(string, "context.getString(R.stri…ontent_tmpl, displayName)");
            C75375u uVar = new C75375u(((C76979h) C86312j.m106911c(cls)).mo107057T1(context, string + aVar3.f124459c));
            uVar.mo105705b(this.f124463e, 0, string.length() + 0, 33);
            aVar.f124465B.setText(uVar);
        } else if (i2 == 10001) {
            C87412m.m108593f(context, "context");
            C46169a aVar4 = this.f124462d.get(i);
            C87412m.m108593f(aVar4, "commentList[position]");
            C46169a aVar5 = aVar4;
            aVar.f124466z.setVisibility(8);
            String string2 = context.getString(C0966R.string.g6r, new Object[]{aVar5.f124457a});
            C87412m.m108593f(string2, "context.getString(R.stri…, commentData.identityId)");
            C75375u uVar2 = new C75375u(((C76979h) C86312j.m106911c(cls)).mo107057T1(context, string2 + aVar5.f124459c));
            uVar2.mo105705b(this.f124463e, 0, string2.length() + 0, 33);
            aVar.f124465B.setText(uVar2);
        }
        aVar.f44854d.setOnClickListener(new C8854e(this, i));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "viewGroup");
        View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.b6l, (ViewGroup) null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.bottomMargin = C74942w4.m89784a(viewGroup.getContext(), 12);
        inflate.setLayoutParams(marginLayoutParams);
        return new C46171a(inflate);
    }
}
