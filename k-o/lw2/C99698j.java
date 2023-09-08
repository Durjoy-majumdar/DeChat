package lw2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C54248l;
import androidx.recyclerview.widget.C54258u;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.plugin.story.p108ui.view.CommentAvatarImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import ew2.C97757a;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kw2.C99268i;
import p196ln.C76705f;
import p629ny.C76979h;
import rx3.C13598b0;

/* renamed from: lw2.j */
public final class C99698j extends RecyclerView.C16613e<C99699a> {

    /* renamed from: d */
    public final ArrayList<C97757a> f292202d;

    /* renamed from: e */
    public final String f292203e = "MicroMsg.StoryCommentListAdapter";

    /* renamed from: f */
    public final HashMap<String, Boolean> f292204f = new HashMap<>();

    /* renamed from: g */
    public C99268i f292205g;

    /* renamed from: h */
    public C32226l<? super C97757a, C13598b0> f292206h;

    /* renamed from: lw2.j$a */
    public final class C99699a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final CommentAvatarImageView f292207A;

        /* renamed from: B */
        public final TextView f292208B;

        /* renamed from: C */
        public final TextView f292209C;

        /* renamed from: D */
        public final /* synthetic */ C99698j f292210D;

        /* renamed from: z */
        public final int f292211z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99699a(C99698j jVar, View view, int i, int i2, C8480h hVar) {
            super(view);
            i = (i2 & 2) != 0 ? C74942w4.m89784a(MMApplicationContext.getContext(), 4) : i;
            C87412m.m108594g(view, "itemView");
            this.f292210D = jVar;
            this.f292211z = i;
            View findViewById = view.findViewById(C0966R.C0970id.k88);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…ry_msg_comment_avatar_iv)");
            this.f292207A = (CommentAvatarImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.k8a);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.…comment_content_username)");
            this.f292208B = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.k8_);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.…_msg_comment_content_msg)");
            this.f292209C = (TextView) findViewById3;
        }
    }

    /* renamed from: lw2.j$b */
    public static final class C99700b implements C54258u {

        /* renamed from: a */
        public final /* synthetic */ C99698j f292212a;

        /* renamed from: b */
        public final /* synthetic */ List<C97757a> f292213b;

        public C99700b(C99698j jVar, List<C97757a> list) {
            this.f292212a = jVar;
            this.f292213b = list;
        }

        /* renamed from: a */
        public void mo2860a(int i, int i2) {
            String str = this.f292212a.f292203e;
            Log.m105918d(str, "onRemoved position:" + i + ", count:" + i2);
            this.f292212a.f292202d.clear();
            this.f292212a.f292202d.addAll(this.f292213b);
            this.f292212a.notifyItemRangeRemoved(i, i2);
        }

        /* renamed from: b */
        public void mo2861b(int i, int i2) {
            String str = this.f292212a.f292203e;
            Log.m105918d(str, "onInserted position:" + i + ", count:" + i2);
            this.f292212a.f292202d.clear();
            this.f292212a.f292202d.addAll(this.f292213b);
            this.f292212a.notifyItemRangeInserted(i, i2);
        }

        /* renamed from: c */
        public void mo2862c(int i, int i2, Object obj) {
            String str = this.f292212a.f292203e;
            Log.m105918d(str, "onChanged position:" + i + ", count:" + i2);
            this.f292212a.f292202d.clear();
            this.f292212a.f292202d.addAll(this.f292213b);
            this.f292212a.notifyItemRangeChanged(i, i2);
        }

        /* renamed from: d */
        public void mo2863d(int i, int i2) {
            String str = this.f292212a.f292203e;
            Log.m105918d(str, "onMoved fromPosition:" + i + ", toPosition:" + i2);
        }
    }

    /* renamed from: lw2.j$c */
    public static final class C99701c extends C54248l.C54250b {

        /* renamed from: a */
        public final /* synthetic */ C99698j f292214a;

        /* renamed from: b */
        public final /* synthetic */ List<C97757a> f292215b;

        public C99701c(C99698j jVar, List<C97757a> list) {
            this.f292214a = jVar;
            this.f292215b = list;
        }

        /* renamed from: a */
        public boolean mo11465a(int i, int i2) {
            return this.f292214a.f292202d.get(i).f286813f == this.f292215b.get(i2).f286813f && Util.isEqual(this.f292214a.f292202d.get(i).f286809b, this.f292215b.get(i2).f286809b);
        }

        /* renamed from: b */
        public boolean mo11466b(int i, int i2) {
            return this.f292214a.f292202d.get(i).f286811d == this.f292215b.get(i2).f286811d && this.f292214a.f292202d.get(i).f286812e == this.f292215b.get(i2).f286812e;
        }

        /* renamed from: d */
        public int mo11468d() {
            return this.f292215b.size();
        }

        /* renamed from: e */
        public int mo11469e() {
            return this.f292214a.f292202d.size();
        }
    }

    public C99698j(ArrayList<C97757a> arrayList) {
        C87412m.m108594g(arrayList, "commentDatas");
        this.f292202d = arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006a A[EDGE_INSN: B:15:0x006a->B:12:0x006a ?: BREAK  , SYNTHETIC] */
    /* renamed from: F4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo139065F4(java.util.List<ew2.C97757a> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "newComments"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = r7.f292203e
            java.lang.String r1 = "updateComments"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = r7.f292204f
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0069
            java.lang.Object r1 = r0.next()
            java.lang.String r4 = "it.next()"
            gy3.C87412m.m108593f(r1, r4)
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.tencent.mm.plugin.story.model.StoryCore$h r4 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t
            java.lang.String r5 = r4.mo134187e()
            java.lang.Object r6 = r1.getKey()
            java.lang.String r6 = (java.lang.String) r6
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r6)
            if (r5 != 0) goto L_0x0059
            kw2.f r4 = r4.mo134189g()
            java.lang.Object r5 = r1.getKey()
            java.lang.String r6 = "entry.key"
            gy3.C87412m.m108593f(r5, r6)
            java.lang.String r5 = (java.lang.String) r5
            kw2.e r4 = r4.mo138644bD(r5)
            boolean r4 = r4.mo138638l2()
            if (r4 == 0) goto L_0x0059
            r4 = 1
            goto L_0x005a
        L_0x0059:
            r4 = 0
        L_0x005a:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r1 = r1.getValue()
            boolean r1 = gy3.C87412m.m108589b(r4, r1)
            if (r1 != 0) goto L_0x0018
            goto L_0x006a
        L_0x0069:
            r2 = 0
        L_0x006a:
            if (r2 == 0) goto L_0x007a
            java.util.ArrayList<ew2.a> r0 = r7.f292202d
            r0.clear()
            java.util.ArrayList<ew2.a> r0 = r7.f292202d
            r0.addAll(r8)
            r7.notifyDataSetChanged()
            goto L_0x008b
        L_0x007a:
            lw2.j$c r0 = new lw2.j$c
            r0.<init>(r7, r8)
            androidx.recyclerview.widget.l$c r0 = androidx.recyclerview.widget.C54248l.m60949a(r0, r3)
            lw2.j$b r1 = new lw2.j$b
            r1.<init>(r7, r8)
            r0.mo75045a(r1)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lw2.C99698j.mo139065F4(java.util.List):void");
    }

    public int getItemCount() {
        return this.f292202d.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        String str;
        C99699a aVar = (C99699a) zVar;
        Class cls = C76979h.class;
        C87412m.m108594g(aVar, "holder");
        C97757a aVar2 = this.f292202d.get(i);
        C87412m.m108593f(aVar2, "commentDatas[position]");
        C97757a aVar3 = aVar2;
        aVar.f44854d.setOnClickListener(new C99702k(this, aVar3));
        Class cls2 = C75700k0.class;
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().get(aVar3.f286808a);
        C76979h hVar = (C76979h) C86312j.m106911c(cls);
        Context context = aVar.f292208B.getContext();
        String f = z1Var != null ? z1Var.mo62898f() : null;
        String str2 = "";
        if (f == null) {
            f = str2;
        }
        SpannableString yp02 = hVar.yp0(context, f, aVar.f292208B.getTextSize());
        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls2)).mo96097Ni().get(aVar3.f286817j);
        C76979h hVar2 = (C76979h) C86312j.m106911c(cls);
        Context context2 = aVar.f292208B.getContext();
        String f2 = z1Var2 != null ? z1Var2.mo62898f() : null;
        if (f2 != null) {
            str2 = f2;
        }
        SpannableString yp03 = hVar2.yp0(context2, str2, aVar.f292208B.getTextSize());
        boolean z = true;
        boolean z2 = aVar3.f286819l != 0;
        TextView textView = aVar.f292208B;
        if (z2) {
            str = yp02 + ' ' + aVar.f292208B.getContext().getResources().getString(C0966R.string.a2h) + ' ' + yp03;
        } else {
            str = String.valueOf(yp02);
        }
        textView.setText(str);
        aVar.f292209C.setText(((C76979h) C86312j.m106911c(cls)).yp0(aVar.f292209C.getContext(), aVar3.f286809b, aVar.f292209C.getTextSize()));
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5(aVar.f292207A, aVar3.f286808a);
        if (aVar3.f286813f) {
            CommentAvatarImageView commentAvatarImageView = aVar.f292207A;
            commentAvatarImageView.setBackground(commentAvatarImageView.getContext().getResources().getDrawable(C0966R.C0969drawable.avl));
            CommentAvatarImageView commentAvatarImageView2 = aVar.f292207A;
            int i2 = aVar.f292211z;
            commentAvatarImageView2.setPadding(i2, i2, i2, i2);
        } else {
            aVar.f292207A.setBackground((Drawable) null);
            aVar.f292207A.setPadding(0, 0, 0, 0);
        }
        HashMap<String, Boolean> hashMap = aVar.f292210D.f292204f;
        String str3 = aVar3.f286808a;
        StoryCore.C96337h hVar3 = StoryCore.f281736t;
        if (Util.isEqual(hVar3.mo134187e(), aVar3.f286808a) || !hVar3.mo134189g().mo138644bD(aVar3.f286808a).mo138638l2()) {
            z = false;
        }
        hashMap.put(str3, Boolean.valueOf(z));
        CommentAvatarImageView commentAvatarImageView3 = aVar.f292207A;
        String str4 = aVar3.f286808a;
        commentAvatarImageView3.getClass();
        C87412m.m108594g(str4, "userName");
        if (!TextUtils.equals(commentAvatarImageView3.f281799d, str4)) {
            commentAvatarImageView3.f281799d = str4;
        }
        aVar.f292207A.setOnClickListener(new C61414i(aVar3, aVar));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.c77, (ViewGroup) null);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new C99699a(this, inflate, 0, 2, (C8480h) null);
    }
}
