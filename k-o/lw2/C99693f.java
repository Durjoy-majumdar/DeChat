package lw2;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.plugin.story.p108ui.view.CommentAvatarImageView;
import com.tencent.p014mm.plugin.story.p108ui.view.CommentItemView;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import ew2.C97757a;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kw2.C99268i;
import o40.C61926c;
import p196ln.C76705f;
import p629ny.C76979h;
import rx3.C13598b0;
import zv2.C103105a;

/* renamed from: lw2.f */
public final class C99693f extends RecyclerView.C16613e<C99694a> {

    /* renamed from: d */
    public final ArrayList<C97757a> f292190d = new ArrayList<>();

    /* renamed from: e */
    public C99268i f292191e;

    /* renamed from: f */
    public C32227p<? super C97757a, ? super Boolean, C13598b0> f292192f;

    /* renamed from: g */
    public C32224a<C13598b0> f292193g;

    /* renamed from: lw2.f$a */
    public abstract class C99694a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f292194A;

        /* renamed from: B */
        public final TextView f292195B;

        /* renamed from: C */
        public final View f292196C;

        /* renamed from: D */
        public View f292197D = mo139062y();

        /* renamed from: E */
        public final /* synthetic */ C99693f f292198E;

        /* renamed from: z */
        public final CommentAvatarImageView f292199z;

        /* renamed from: lw2.f$a$a */
        public static final class C61410a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C99694a f174654d;

            public C61410a(C99694a aVar) {
                this.f174654d = aVar;
            }

            public final void run() {
                View view = this.f174654d.f44854d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$BaseStoryCommentViewHolder$onBind$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$BaseStoryCommentViewHolder$onBind$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        /* renamed from: lw2.f$a$b */
        public static final class C61411b implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C99693f f174655d;

            public C61411b(C99693f fVar) {
                this.f174655d = fVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$BaseStoryCommentViewHolder$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C32224a<C13598b0> aVar = this.f174655d.f292193g;
                if (aVar != null) {
                    aVar.invoke();
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$BaseStoryCommentViewHolder$onBind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99694a(C99693f fVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f292198E = fVar;
            View findViewById = view.findViewById(C0966R.C0970id.k45);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…tory_comment_item_avatar)");
            this.f292199z = (CommentAvatarImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.k4d);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.…ry_comment_item_username)");
            this.f292194A = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.k48);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.…ory_comment_item_content)");
            this.f292195B = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C0966R.C0970id.k46);
            C87412m.m108593f(findViewById4, "itemView.findViewById(R.…_comment_item_blank_area)");
            this.f292196C = findViewById4;
        }

        /* renamed from: y */
        public abstract View mo139062y();

        /* renamed from: z */
        public void mo139063z(int i, C97757a aVar) {
            C87412m.m108594g(aVar, FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
            View view = this.f44854d;
            if (view instanceof CommentItemView) {
                C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.story.ui.view.CommentItemView");
                ((CommentItemView) view).setComment(aVar);
            }
            View view2 = this.f44854d;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(4);
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$BaseStoryCommentViewHolder", "onBind", "(ILcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int i2 = 0;
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$BaseStoryCommentViewHolder", "onBind", "(ILcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f44854d.post(new C61410a(this));
            this.f292196C.setOnClickListener(new C61411b(this.f292198E));
            if (this.f44854d instanceof CommentItemView) {
                if (aVar.f286813f) {
                    this.f292197D.getBackground().setColorFilter(new PorterDuffColorFilter(this.f44854d.getContext().getResources().getColor(C0966R.color.f2956ac), PorterDuff.Mode.SRC_ATOP));
                } else {
                    this.f292197D.getBackground().setColorFilter(new PorterDuffColorFilter(this.f44854d.getContext().getResources().getColor(C0966R.color.aex), PorterDuff.Mode.SRC_ATOP));
                }
            }
            Class cls = C75700k0.class;
            Class cls2 = C76979h.class;
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(aVar.f286808a);
            C76979h hVar = (C76979h) C86312j.m106911c(cls2);
            Context context = this.f292194A.getContext();
            String str = null;
            String f = z1Var != null ? z1Var.mo62898f() : null;
            String str2 = "";
            if (f == null) {
                f = str2;
            }
            CharSequence yp02 = hVar.yp0(context, f, this.f292194A.getTextSize());
            C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(aVar.f286817j);
            C76979h hVar2 = (C76979h) C86312j.m106911c(cls2);
            Context context2 = this.f292194A.getContext();
            if (z1Var2 != null) {
                str = z1Var2.mo62898f();
            }
            if (str != null) {
                str2 = str;
            }
            SpannableString yp03 = hVar2.yp0(context2, str2, this.f292194A.getTextSize());
            boolean z = aVar.f286819l != 0;
            TextView textView = this.f292194A;
            if (z) {
                yp02 = yp02 + ' ' + this.f292194A.getContext().getResources().getString(C0966R.string.a2h) + ' ' + yp03;
            }
            textView.setText(yp02);
            this.f292195B.setText(((C76979h) C86312j.m106911c(cls2)).yp0(this.f292195B.getContext(), aVar.f286809b, this.f292195B.getTextSize()));
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5(this.f292199z, aVar.f286808a);
            StoryCore.f281736t.mo134189g().mo138644bD(aVar.f286808a).mo138638l2();
            CommentAvatarImageView commentAvatarImageView = this.f292199z;
            String str3 = aVar.f286808a;
            commentAvatarImageView.getClass();
            C87412m.m108594g(str3, "userName");
            if (!TextUtils.equals(commentAvatarImageView.f281799d, str3)) {
                commentAvatarImageView.f281799d = str3;
            }
            CommentAvatarImageView commentAvatarImageView2 = this.f292199z;
            if (aVar.f286814g) {
                i2 = commentAvatarImageView2.getResources().getColor(C0966R.color.aex);
            }
            commentAvatarImageView2.setHintBg(i2);
            this.f292199z.setOnClickListener(new C61412g(aVar, this));
        }
    }

    /* renamed from: lw2.f$b */
    public final class C99695b extends C99694a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99695b(C99693f fVar, View view) {
            super(fVar, view);
            C87412m.m108594g(view, "itemView");
        }

        /* renamed from: y */
        public View mo139062y() {
            View findViewById = this.f44854d.findViewById(C0966R.C0970id.k3l);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…omment_bubble_background)");
            return findViewById;
        }

        /* renamed from: z */
        public void mo139063z(int i, C97757a aVar) {
            C87412m.m108594g(aVar, FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
            super.mo139063z(i, aVar);
            if (aVar.f286814g) {
                C61926c.m72678c(this.f292194A);
            }
        }
    }

    /* renamed from: lw2.f$c */
    public final class C99696c extends C99694a {

        /* renamed from: F */
        public final TextView f292200F;

        /* renamed from: G */
        public final /* synthetic */ C99693f f292201G;

        /* renamed from: lw2.f$c$a */
        public static final class C99697a implements View.OnClickListener {
            public C99697a(C99693f fVar, C97757a aVar) {
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$StoryCommentViewHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C103105a.C103106a aVar = (C103105a.C103106a) C103105a.f304209b.mo138761d();
                C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$StoryCommentViewHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99696c(C99693f fVar, View view) {
            super(fVar, view);
            C87412m.m108594g(view, "itemView");
            this.f292201G = fVar;
            View findViewById = view.findViewById(C0966R.C0970id.k4a);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…story_comment_item_op_tv)");
            this.f292200F = (TextView) findViewById;
        }

        /* renamed from: y */
        public View mo139062y() {
            View findViewById = this.f44854d.findViewById(C0966R.C0970id.k3s);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…mment_content_background)");
            return findViewById;
        }

        /* renamed from: z */
        public void mo139063z(int i, C97757a aVar) {
            C87412m.m108594g(aVar, FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
            super.mo139063z(i, aVar);
            if (aVar.f286814g) {
                C61926c.m72678c(this.f292194A);
            }
            if (aVar.f286814g) {
                this.f292200F.setVisibility(8);
            } else {
                boolean isEqual = Util.isEqual(StoryCore.f281736t.mo134187e(), aVar.f286808a);
                this.f292200F.setVisibility(0);
                if (isEqual) {
                    this.f292200F.setOnClickListener(new C61413h(this.f292201G, aVar));
                    this.f292200F.setText(this.f44854d.getContext().getResources().getString(C0966R.string.f361414jp1));
                    this.f292200F.setTextColor(-1);
                    C61926c.m72678c(this.f292200F);
                } else {
                    C103105a.C103106a aVar2 = (C103105a.C103106a) C103105a.f304209b.mo138761d();
                    this.f292200F.setVisibility(8);
                }
            }
            this.f44854d.setOnClickListener(new C99697a(this.f292201G, aVar));
        }
    }

    /* renamed from: F4 */
    public final void mo139061F4(List<C97757a> list) {
        C87412m.m108594g(list, "storyComments");
        this.f292190d.clear();
        this.f292190d.addAll(list);
    }

    public int getItemCount() {
        return this.f292190d.size();
    }

    public int getItemViewType(int i) {
        return this.f292190d.get(i).f286814g ? 1 : 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C99694a aVar = (C99694a) zVar;
        C87412m.m108594g(aVar, "holder");
        C97757a aVar2 = this.f292190d.get(i);
        C87412m.m108593f(aVar2, "comments[position]");
        aVar.mo139063z(i, aVar2);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.c6c, viewGroup, false);
            C87412m.m108593f(inflate, "from(parent.context)\n   …em_bubble, parent, false)");
            return new C99695b(this, inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.c6b, viewGroup, false);
        C87412m.m108593f(inflate2, "from(parent.context)\n   …ment_item, parent, false)");
        return new C99696c(this, inflate2);
    }
}
