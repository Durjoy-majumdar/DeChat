package lw2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.plugin.story.p108ui.view.CommentAvatarImageView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import ew2.C97757a;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import p196ln.C76705f;
import p629ny.C76979h;

/* renamed from: lw2.q */
public final class C99706q extends RecyclerView.C16613e<C99707a> {

    /* renamed from: d */
    public final ArrayList<C97757a> f292238d;

    /* renamed from: e */
    public final String f292239e = "MicroMsg.StoryVisitorListAdapter";

    /* renamed from: f */
    public final HashMap<String, Boolean> f292240f = new HashMap<>();

    /* renamed from: lw2.q$a */
    public final class C99707a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final CommentAvatarImageView f292241A;

        /* renamed from: B */
        public final TextView f292242B;

        /* renamed from: C */
        public final /* synthetic */ C99706q f292243C;

        /* renamed from: z */
        public final int f292244z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99707a(C99706q qVar, View view, int i, int i2, C8480h hVar) {
            super(view);
            i = (i2 & 2) != 0 ? C74942w4.m89784a(MMApplicationContext.getContext(), 4) : i;
            C87412m.m108594g(view, "itemView");
            this.f292243C = qVar;
            this.f292244z = i;
            View findViewById = view.findViewById(C0966R.C0970id.k84);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…sg_bubble_item_avatar_iv)");
            this.f292241A = (CommentAvatarImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.k86);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.…_bubble_item_username_tv)");
            this.f292242B = (TextView) findViewById2;
        }
    }

    public C99706q(ArrayList<C97757a> arrayList) {
        C87412m.m108594g(arrayList, "bubbleDatas");
        this.f292238d = arrayList;
    }

    public int getItemCount() {
        return this.f292238d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C99707a aVar = (C99707a) zVar;
        C87412m.m108594g(aVar, "holder");
        C97757a aVar2 = this.f292238d.get(i);
        C87412m.m108593f(aVar2, "bubbleDatas[position]");
        C97757a aVar3 = aVar2;
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5(aVar.f292241A, aVar3.f286808a);
        boolean z = false;
        String str = null;
        if (aVar3.f286813f) {
            CommentAvatarImageView commentAvatarImageView = aVar.f292241A;
            commentAvatarImageView.setBackground(commentAvatarImageView.getContext().getResources().getDrawable(C0966R.C0969drawable.avl));
            CommentAvatarImageView commentAvatarImageView2 = aVar.f292241A;
            int i2 = aVar.f292244z;
            commentAvatarImageView2.setPadding(i2, i2, i2, i2);
            CommentAvatarImageView commentAvatarImageView3 = aVar.f292241A;
            commentAvatarImageView3.setHintBg(commentAvatarImageView3.getContext().getResources().getColor(C0966R.color.aeq));
        } else {
            aVar.f292241A.setBackground((Drawable) null);
            aVar.f292241A.setPadding(0, 0, 0, 0);
            aVar.f292241A.setHintBg(0);
        }
        HashMap<String, Boolean> hashMap = aVar.f292243C.f292240f;
        String str2 = aVar3.f286808a;
        StoryCore.C96337h hVar = StoryCore.f281736t;
        if (!Util.isEqual(hVar.mo134187e(), aVar3.f286808a) && hVar.mo134189g().mo138644bD(aVar3.f286808a).mo138638l2()) {
            z = true;
        }
        hashMap.put(str2, Boolean.valueOf(z));
        CommentAvatarImageView commentAvatarImageView4 = aVar.f292241A;
        String str3 = aVar3.f286808a;
        commentAvatarImageView4.getClass();
        C87412m.m108594g(str3, "userName");
        if (!TextUtils.equals(commentAvatarImageView4.f281799d, str3)) {
            commentAvatarImageView4.f281799d = str3;
        }
        aVar.f292241A.setOnClickListener(new C61415p(aVar3, aVar));
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(aVar3.f286808a);
        C76979h hVar2 = (C76979h) C86312j.m106911c(C76979h.class);
        Context context = aVar.f292242B.getContext();
        if (z1Var != null) {
            str = z1Var.mo62898f();
        }
        if (str == null) {
            str = "";
        }
        aVar.f292242B.setText(hVar2.yp0(context, str, aVar.f292242B.getTextSize()));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        this.f292238d.clone();
        View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.c76, (ViewGroup) null);
        C87412m.m108593f(inflate, "inflate(parent.context, …bubble_item_layout, null)");
        return new C99707a(this, inflate, 0, 2, (C8480h) null);
    }
}
