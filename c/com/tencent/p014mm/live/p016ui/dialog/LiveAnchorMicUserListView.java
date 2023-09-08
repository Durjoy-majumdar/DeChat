package com.tencent.p014mm.live.p016ui.dialog;

import a43.C103310i;
import a60.C53979a;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import e60.C58532b;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import g60.C59365a;
import g60.C59366b;
import g60.C59367c;
import g60.C59368d;
import g60.C59369e;
import g60.C59370f;
import g60.C59371g;
import gy3.C24564k0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import p196ln.C76705f;
import p734vz.C65905c;
import p734vz.C65906d;
import qo3.C77407n;
import rx3.C13598b0;
import y50.C66519j0;
import z50.C16108j;
import z50.C16109n;
import z50.C53738f;
import z50.C53741k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00029:B#\u0012\u0006\u00102\u001a\u000201\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\b\b\u0002\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u0004\u0018\u00010\u0006R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R8\u0010 \u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR0\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006;"}, mo182094d2 = {"Lcom/tencent/mm/live/ui/dialog/LiveAnchorMicUserListView;", "Landroid/widget/RelativeLayout;", "", "enable", "Lrx3/b0;", "setDefaultMicState", "La60/a$a;", "micUser", "setMicUser", "getSelectUser", "f", "Z", "getMicPermission", "()Z", "setMicPermission", "(Z)V", "micPermission", "Lkotlin/Function0;", "g", "Lfy3/a;", "getHideClickListener", "()Lfy3/a;", "setHideClickListener", "(Lfy3/a;)V", "hideClickListener", "Lkotlin/Function2;", "h", "Lfy3/p;", "getCallMicListener", "()Lfy3/p;", "setCallMicListener", "(Lfy3/p;)V", "callMicListener", "Lkotlin/Function1;", "i", "Lfy3/l;", "getMicPermissionListener", "()Lfy3/l;", "setMicPermissionListener", "(Lfy3/l;)V", "micPermissionListener", "Landroid/view/View;", "s", "Landroid/view/View;", "getParent", "()Landroid/view/View;", "setParent", "(Landroid/view/View;)V", "parent", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "b", "c", "plugin-logic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.ui.dialog.LiveAnchorMicUserListView */
public final class LiveAnchorMicUserListView extends RelativeLayout {

    /* renamed from: t */
    public static final /* synthetic */ int f157234t = 0;

    /* renamed from: d */
    public C77407n f157235d;

    /* renamed from: e */
    public final C65905c f157236e = ((C65906d) C86312j.m106911c(C65906d.class)).mo89615OY(MMApplicationContext.getContext());

    /* renamed from: f */
    public boolean f157237f = true;

    /* renamed from: g */
    public C32224a<C13598b0> f157238g;

    /* renamed from: h */
    public C32227p<? super Boolean, ? super C53979a.C53980a, C13598b0> f157239h;

    /* renamed from: i */
    public C32226l<? super Boolean, C13598b0> f157240i;

    /* renamed from: j */
    public final C55216b f157241j;

    /* renamed from: n */
    public C53979a.C53980a f157242n;

    /* renamed from: o */
    public boolean f157243o;

    /* renamed from: p */
    public boolean f157244p;

    /* renamed from: q */
    public C32226l<? super C53979a.C53980a, C13598b0> f157245q;

    /* renamed from: r */
    public C32226l<? super C53979a.C53980a, C13598b0> f157246r;

    /* renamed from: s */
    public View f157247s;

    /* renamed from: com.tencent.mm.live.ui.dialog.LiveAnchorMicUserListView$a */
    public static final class C55215a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ LiveAnchorMicUserListView f157248d;

        public C55215a(LiveAnchorMicUserListView liveAnchorMicUserListView) {
            this.f157248d = liveAnchorMicUserListView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/ui/dialog/LiveAnchorMicUserListView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> hideClickListener = this.f157248d.getHideClickListener();
            if (hideClickListener != null) {
                hideClickListener.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/live/ui/dialog/LiveAnchorMicUserListView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.live.ui.dialog.LiveAnchorMicUserListView$b */
    public final class C55216b extends RecyclerView.C16613e<RecyclerView.C16631z> {

        /* renamed from: d */
        public ArrayList<C55227c> f157249d = new ArrayList<>();

        /* renamed from: com.tencent.mm.live.ui.dialog.LiveAnchorMicUserListView$b$a */
        public static final class C55217a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ LiveAnchorMicUserListView f157251d;

            public C55217a(LiveAnchorMicUserListView liveAnchorMicUserListView) {
                this.f157251d = liveAnchorMicUserListView;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/live/ui/dialog/LiveAnchorMicUserListView$LiveAnchorMicUserAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (this.f157251d.getMicPermission()) {
                    LiveAnchorMicUserListView liveAnchorMicUserListView = this.f157251d;
                    if (liveAnchorMicUserListView.f157235d == null) {
                        C77407n nVar = new C77407n(liveAnchorMicUserListView.getContext(), 1, true);
                        liveAnchorMicUserListView.f157235d = nVar;
                        nVar.f225775k1 = true;
                        View inflate = View.inflate(liveAnchorMicUserListView.getContext(), C0966R.C0971layout.b6k, (ViewGroup) null);
                        ((TextView) inflate.findViewById(C0966R.C0970id.fs_)).setText(liveAnchorMicUserListView.getContext().getResources().getString(C0966R.string.g9y));
                        C77407n nVar2 = liveAnchorMicUserListView.f157235d;
                        if (nVar2 != null) {
                            nVar2.mo107569n(inflate, false);
                        }
                    }
                    C77407n nVar3 = liveAnchorMicUserListView.f157235d;
                    if (nVar3 != null) {
                        nVar3.f225771i = new C59366b(liveAnchorMicUserListView);
                    }
                    if (nVar3 != null) {
                        nVar3.f225782p = new C59367c(liveAnchorMicUserListView);
                    }
                    if (nVar3 != null) {
                        nVar3.f225761d = new C59368d(liveAnchorMicUserListView);
                    }
                    C77407n nVar4 = this.f157251d.f157235d;
                    if (nVar4 != null) {
                        nVar4.mo107573q();
                    }
                } else {
                    LiveAnchorMicUserListView.m62843a(this.f157251d, true);
                }
                C117292a.m165361g(this, "com/tencent/mm/live/ui/dialog/LiveAnchorMicUserListView$LiveAnchorMicUserAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.live.ui.dialog.LiveAnchorMicUserListView$b$b */
        public static final class C55218b implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ LiveAnchorMicUserListView f157252d;

            /* renamed from: e */
            public final /* synthetic */ C55216b f157253e;

            /* renamed from: f */
            public final /* synthetic */ int f157254f;

            public C55218b(LiveAnchorMicUserListView liveAnchorMicUserListView, C55216b bVar, int i) {
                this.f157252d = liveAnchorMicUserListView;
                this.f157253e = bVar;
                this.f157254f = i;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/live/ui/dialog/LiveAnchorMicUserListView$LiveAnchorMicUserAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                LiveAnchorMicUserListView liveAnchorMicUserListView = this.f157252d;
                if (liveAnchorMicUserListView.f157243o) {
                    liveAnchorMicUserListView.f157244p = true;
                    ((C55228d) liveAnchorMicUserListView.f157245q).invoke(this.f157253e.f157249d.get(this.f157254f).f157259b);
                }
                C117292a.m165361g(this, "com/tencent/mm/live/ui/dialog/LiveAnchorMicUserListView$LiveAnchorMicUserAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.live.ui.dialog.LiveAnchorMicUserListView$b$c */
        public static final class C55219c implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ LiveAnchorMicUserListView f157255d;

            /* renamed from: e */
            public final /* synthetic */ C55216b f157256e;

            /* renamed from: f */
            public final /* synthetic */ int f157257f;

            public C55219c(LiveAnchorMicUserListView liveAnchorMicUserListView, C55216b bVar, int i) {
                this.f157255d = liveAnchorMicUserListView;
                this.f157256e = bVar;
                this.f157257f = i;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/live/ui/dialog/LiveAnchorMicUserListView$LiveAnchorMicUserAdapter$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                ((C55230f) this.f157255d.f157246r).invoke(this.f157256e.f157249d.get(this.f157257f).f157259b);
                C117292a.m165361g(this, "com/tencent/mm/live/ui/dialog/LiveAnchorMicUserListView$LiveAnchorMicUserAdapter$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.live.ui.dialog.LiveAnchorMicUserListView$b$d */
        public static final class C55220d extends RecyclerView.C16631z {
            public C55220d(View view) {
                super(view);
            }
        }

        /* renamed from: com.tencent.mm.live.ui.dialog.LiveAnchorMicUserListView$b$e */
        public static final class C55221e extends RecyclerView.C16631z {
            public C55221e(View view) {
                super(view);
            }
        }

        /* renamed from: com.tencent.mm.live.ui.dialog.LiveAnchorMicUserListView$b$f */
        public static final class C55222f extends RecyclerView.C16631z {
            public C55222f(View view) {
                super(view);
            }
        }

        /* renamed from: com.tencent.mm.live.ui.dialog.LiveAnchorMicUserListView$b$g */
        public static final class C55223g extends RecyclerView.C16631z {
            public C55223g(View view) {
                super(view);
            }
        }

        /* renamed from: com.tencent.mm.live.ui.dialog.LiveAnchorMicUserListView$b$h */
        public static final class C55224h extends RecyclerView.C16631z {
            public C55224h(View view) {
                super(view);
            }
        }

        /* renamed from: com.tencent.mm.live.ui.dialog.LiveAnchorMicUserListView$b$i */
        public static final class C55225i extends RecyclerView.C16631z {
            public C55225i(View view) {
                super(view);
            }
        }

        /* renamed from: com.tencent.mm.live.ui.dialog.LiveAnchorMicUserListView$b$j */
        public static final class C55226j extends RecyclerView.C16631z {
            public C55226j(View view) {
                super(view);
            }
        }

        public C55216b() {
        }

        /* renamed from: F4 */
        public final void mo76476F4(View view, C53979a.C53980a aVar) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(aVar.f151238c);
            ((C76705f) C86312j.m106911c(C76705f.class)).D20((ImageView) view.findViewById(C0966R.C0970id.frl), aVar.f151238c, 0.1f);
            ((TextView) view.findViewById(C0966R.C0970id.frm)).setText(z1Var.getNickname());
        }

        public int getItemCount() {
            return this.f157249d.size();
        }

        public int getItemViewType(int i) {
            return this.f157249d.get(i).f157258a;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            RecyclerView.C16631z zVar2 = zVar;
            int i2 = i;
            C87412m.m108594g(zVar2, "holder");
            int itemViewType = getItemViewType(i2);
            if (itemViewType == 0) {
                ((TextView) zVar2.f44854d.findViewById(C0966R.C0970id.fro)).setOnClickListener(new C55217a(LiveAnchorMicUserListView.this));
                ((MMSwitchBtn) zVar2.f44854d.findViewById(C0966R.C0970id.frn)).setCheck(LiveAnchorMicUserListView.this.getMicPermission());
            } else if (itemViewType == 1) {
                View view = zVar2.f44854d;
                C87412m.m108592e(view, "null cannot be cast to non-null type android.widget.TextView");
                ((TextView) view).setText(this.f157249d.get(i2).f157260c);
            } else if (itemViewType == 2) {
                C53979a.C53980a aVar = this.f157249d.get(i2).f157259b;
                if (aVar != null) {
                    View view2 = zVar2.f44854d;
                    C87412m.m108593f(view2, "holder.itemView");
                    mo76476F4(view2, aVar);
                }
                ((TextView) zVar2.f44854d.findViewById(C0966R.C0970id.fwa)).setOnClickListener(new C55218b(LiveAnchorMicUserListView.this, this, i2));
            } else if (itemViewType == 3) {
                C53979a.C53980a aVar2 = this.f157249d.get(i2).f157259b;
                if (aVar2 != null) {
                    View view3 = zVar2.f44854d;
                    C87412m.m108593f(view3, "holder.itemView");
                    mo76476F4(view3, aVar2);
                }
                ImageView imageView = (ImageView) zVar2.f44854d.findViewById(C0966R.C0970id.fwr);
                ImageView imageView2 = (ImageView) zVar2.f44854d.findViewById(C0966R.C0970id.fws);
                TextView textView = (TextView) zVar2.f44854d.findViewById(C0966R.C0970id.fwk);
                if (LiveAnchorMicUserListView.this.f157244p) {
                    imageView2.setVisibility(0);
                    imageView.setVisibility(0);
                    Drawable background = imageView.getBackground();
                    C87412m.m108592e(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                    ((AnimationDrawable) background).stop();
                    Drawable background2 = imageView.getBackground();
                    C87412m.m108592e(background2, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                    ((AnimationDrawable) background2).start();
                    textView.setBackground(LiveAnchorMicUserListView.this.getContext().getResources().getDrawable(C0966R.C0969drawable.abs));
                    textView.setText(LiveAnchorMicUserListView.this.getContext().getResources().getString(C0966R.string.g9v));
                } else {
                    imageView2.setVisibility(4);
                    imageView.setVisibility(4);
                    Drawable background3 = imageView.getBackground();
                    C87412m.m108592e(background3, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                    ((AnimationDrawable) background3).stop();
                    textView.setBackground(LiveAnchorMicUserListView.this.getContext().getResources().getDrawable(C0966R.C0969drawable.ac4));
                    textView.setText(LiveAnchorMicUserListView.this.getContext().getResources().getString(C0966R.string.g_3));
                }
                textView.setOnClickListener(new C55219c(LiveAnchorMicUserListView.this, this, i2));
            }
            View view4 = zVar2.f44854d;
            C87412m.m108593f(view4, "holder.itemView");
            if (LiveAnchorMicUserListView.this.f157243o) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar3.mo10233c(Float.valueOf(1.0f));
                View view5 = view4;
                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/live/ui/dialog/LiveAnchorMicUserListView$LiveAnchorMicUserAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                C117292a.m165359e(view5, "com/tencent/mm/live/ui/dialog/LiveAnchorMicUserListView$LiveAnchorMicUserAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setEnabled(true);
            } else if (i2 >= 3) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(Float.valueOf(0.3f));
                View view6 = view4;
                C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/live/ui/dialog/LiveAnchorMicUserListView$LiveAnchorMicUserAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
                C117292a.m165359e(view6, "com/tencent/mm/live/ui/dialog/LiveAnchorMicUserListView$LiveAnchorMicUserAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setEnabled(false);
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new C55226j(LayoutInflater.from(LiveAnchorMicUserListView.this.getContext()).inflate(C0966R.C0971layout.b6c, viewGroup, false)) : new C55225i(LayoutInflater.from(LiveAnchorMicUserListView.this.getContext()).inflate(C0966R.C0971layout.b6a, viewGroup, false)) : new C55224h(LayoutInflater.from(LiveAnchorMicUserListView.this.getContext()).inflate(C0966R.C0971layout.b6_, viewGroup, false)) : new C55223g(LayoutInflater.from(LiveAnchorMicUserListView.this.getContext()).inflate(C0966R.C0971layout.b69, viewGroup, false)) : new C55222f(LayoutInflater.from(LiveAnchorMicUserListView.this.getContext()).inflate(C0966R.C0971layout.b68, viewGroup, false)) : new C55221e(LayoutInflater.from(LiveAnchorMicUserListView.this.getContext()).inflate(C0966R.C0971layout.b6c, viewGroup, false)) : new C55220d(LayoutInflater.from(LiveAnchorMicUserListView.this.getContext()).inflate(C0966R.C0971layout.b6b, viewGroup, false));
        }
    }

    /* renamed from: com.tencent.mm.live.ui.dialog.LiveAnchorMicUserListView$c */
    public static final class C55227c {

        /* renamed from: a */
        public int f157258a;

        /* renamed from: b */
        public C53979a.C53980a f157259b;

        /* renamed from: c */
        public String f157260c;

        public C55227c(int i, C53979a.C53980a aVar, String str, int i2, C8480h hVar) {
            aVar = (i2 & 2) != 0 ? null : aVar;
            str = (i2 & 4) != 0 ? null : str;
            this.f157258a = i;
            this.f157259b = aVar;
            this.f157260c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C55227c)) {
                return false;
            }
            C55227c cVar = (C55227c) obj;
            return this.f157258a == cVar.f157258a && C87412m.m108589b(this.f157259b, cVar.f157259b) && C87412m.m108589b(this.f157260c, cVar.f157260c);
        }

        public int hashCode() {
            int i = this.f157258a * 31;
            C53979a.C53980a aVar = this.f157259b;
            int i2 = 0;
            int hashCode = (i + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str = this.f157260c;
            if (str != null) {
                i2 = str.hashCode();
            }
            return hashCode + i2;
        }

        public String toString() {
            return "LiveMicListItem(type=" + this.f157258a + ", user=" + this.f157259b + ", title=" + this.f157260c + ')';
        }
    }

    /* renamed from: com.tencent.mm.live.ui.dialog.LiveAnchorMicUserListView$d */
    public static final class C55228d extends C87413o implements C32226l<C53979a.C53980a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveAnchorMicUserListView f157261d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55228d(LiveAnchorMicUserListView liveAnchorMicUserListView) {
            super(1);
            this.f157261d = liveAnchorMicUserListView;
        }

        public Object invoke(Object obj) {
            C53979a.C53980a aVar = (C53979a.C53980a) obj;
            if (aVar != null) {
                LiveAnchorMicUserListView liveAnchorMicUserListView = this.f157261d;
                liveAnchorMicUserListView.f157243o = false;
                C32227p<Boolean, C53979a.C53980a, C13598b0> callMicListener = liveAnchorMicUserListView.getCallMicListener();
                if (callMicListener != null) {
                    callMicListener.invoke(Boolean.TRUE, aVar);
                }
                liveAnchorMicUserListView.f157242n = aVar;
                liveAnchorMicUserListView.mo76461d();
                String str = "[cgi]anchor accept user mic." + aVar;
                C87412m.m108594g(str, "debugText");
                Log.m105924i("MicroMsg.LiveCoreMic", str);
                new C53738f(RoomLiveService.f157197h.f133050d, aVar.f151240e, aVar.f151239d, aVar.f151237b, String.valueOf(System.currentTimeMillis())).doScene(C86709a0.m107524d().f256809d, new C59365a(liveAnchorMicUserListView, aVar));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.live.ui.dialog.LiveAnchorMicUserListView$e */
    public static final class C55229e implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ LiveAnchorMicUserListView f157262d;

        /* renamed from: e */
        public final /* synthetic */ C32227p<Integer, Integer, C13598b0> f157263e;

        /* renamed from: f */
        public final /* synthetic */ C53979a.C53980a f157264f;

        public C55229e(LiveAnchorMicUserListView liveAnchorMicUserListView, C32227p<? super Integer, ? super Integer, C13598b0> pVar, C53979a.C53980a aVar) {
            this.f157262d = liveAnchorMicUserListView;
            this.f157263e = pVar;
            this.f157264f = aVar;
        }

        public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            yVar.setHasCallbackToQueue(true);
            String str2 = "[cgi-ret]anchor close mic :" + i + " errCode:" + i2 + " errMsg:" + str;
            C87412m.m108594g(str2, "debugText");
            Log.m105924i("MicroMsg.LiveCoreMic", str2);
            if (i == 0 && i2 == 0) {
                ((C103310i) this.f157262d.f157236e).mo143086b("playend", true, 1, true);
            }
            C32227p<Integer, Integer, C13598b0> pVar = this.f157263e;
            if (pVar != null) {
                pVar.invoke(Integer.valueOf(i), Integer.valueOf(i2));
            } else if (i == 0 && i2 == 0) {
                C76912y0.makeText(this.f157262d.getContext(), (CharSequence) this.f157262d.getContext().getResources().getString(C0966R.string.g_f), 0).show();
                RoomLiveService.f157185Q.f151233h.remove(this.f157264f);
                LiveAnchorMicUserListView liveAnchorMicUserListView = this.f157262d;
                liveAnchorMicUserListView.f157243o = true;
                liveAnchorMicUserListView.f157242n = null;
                RoomLiveService.f157185Q.mo74652b();
                this.f157262d.mo76461d();
                C32227p<Boolean, C53979a.C53980a, C13598b0> callMicListener = this.f157262d.getCallMicListener();
                if (callMicListener != null) {
                    callMicListener.invoke(Boolean.FALSE, null);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.live.ui.dialog.LiveAnchorMicUserListView$f */
    public static final class C55230f extends C87413o implements C32226l<C53979a.C53980a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveAnchorMicUserListView f157265d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55230f(LiveAnchorMicUserListView liveAnchorMicUserListView) {
            super(1);
            this.f157265d = liveAnchorMicUserListView;
        }

        public Object invoke(Object obj) {
            if (((C53979a.C53980a) obj) != null) {
                LiveAnchorMicUserListView liveAnchorMicUserListView = this.f157265d;
                int i = LiveAnchorMicUserListView.f157234t;
                liveAnchorMicUserListView.mo76459b((C32227p<? super Integer, ? super Integer, C13598b0>) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveAnchorMicUserListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C55216b bVar = new C55216b();
        this.f157241j = bVar;
        this.f157243o = true;
        this.f157245q = new C55228d(this);
        this.f157246r = new C55230f(this);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b6d, this, true);
        C87412m.m108593f(inflate, "from(context).inflate(R.…ic_list_view, this, true)");
        this.f157247s = inflate;
        inflate.findViewById(C0966R.C0970id.beq).setOnClickListener(new C55215a(this));
        View findViewById = this.f157247s.findViewById(C0966R.C0970id.frg);
        C87412m.m108593f(findViewById, "parent.findViewById(R.id.live_anchor_mic_list)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(bVar);
        recyclerView.setItemViewCacheSize(0);
    }

    /* renamed from: a */
    public static final void m62843a(LiveAnchorMicUserListView liveAnchorMicUserListView, boolean z) {
        liveAnchorMicUserListView.getClass();
        if (z) {
            new C16108j(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, false).doScene(C86709a0.m107524d().f256809d, new C59369e(liveAnchorMicUserListView));
            C58532b.m67948d(RoomLiveService.f157192c, RoomLiveService.f157197h.f133050d, RoomLiveService.f157199j, 3, 0, (String) null, RoomLiveService.f157197h.f133055i, 32, (Object) null);
            Log.m105924i("MicroMsg.LiveLinkMicIDKeyStat", "markAnchorAllowLinkMic");
            C115669n.INSTANCE.mo175913w(1386, 1, 1);
            return;
        }
        liveAnchorMicUserListView.mo76459b(new C59370f(liveAnchorMicUserListView));
        new C16108j(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, true).doScene(C86709a0.m107524d().f256809d, new C59371g(liveAnchorMicUserListView));
        C58532b.m67948d(RoomLiveService.f157192c, RoomLiveService.f157197h.f133050d, RoomLiveService.f157199j, 3, 1, (String) null, RoomLiveService.f157197h.f133055i, 32, (Object) null);
        Log.m105924i("MicroMsg.LiveLinkMicIDKeyStat", "markAnchorForbidLinkMic");
        C115669n.INSTANCE.mo175913w(1386, 0, 1);
    }

    /* renamed from: b */
    public final void mo76459b(C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        C53979a.C53980a aVar = this.f157242n;
        if (aVar != null) {
            String str = "[cgi]anchor close mic." + aVar;
            C87412m.m108594g(str, "debugText");
            Log.m105924i("MicroMsg.LiveCoreMic", str);
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            new C53741k(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, String.valueOf(System.currentTimeMillis()), aVar.f151237b, aVar.f151240e).doScene(C86709a0.m107524d().f256809d, new C55229e(this, pVar, aVar));
        }
    }

    /* renamed from: c */
    public final void mo76460c() {
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        ArrayList<C53979a.C53980a> arrayList = RoomLiveService.f157185Q.f151233h;
        ArrayList arrayList2 = new ArrayList();
        for (C53979a.C53980a aVar : arrayList) {
            arrayList2.add(aVar.f151238c);
        }
        C66519j0 j0Var = C66519j0.f191358d;
        C86709a0.m107529k().f251779b.mo123460f(new C16109n(RoomLiveService.f157197h.f133050d, arrayList2));
    }

    /* renamed from: d */
    public final void mo76461d() {
        int A = C76577a.m92145A(getContext());
        int j = C76577a.m92159j(getContext());
        if (A > j) {
            A = j;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(A, -1);
        layoutParams.gravity = 1;
        layoutParams.topMargin = C76577a.m92150a(getContext(), getContext().getResources().getDimension(C0966R.dimen.f357042ad2));
        this.f157247s.setLayoutParams(layoutParams);
        this.f157241j.f157249d.clear();
        this.f157241j.f157249d.add(new C55227c(0, (C53979a.C53980a) null, (String) null, 6, (C8480h) null));
        C53979a.C53980a aVar = this.f157242n;
        if (!(aVar == null || aVar == null)) {
            this.f157241j.f157249d.add(new C55227c(1, (C53979a.C53980a) null, C76577a.m92166q(getContext(), C0966R.string.g9u), 2, (C8480h) null));
            this.f157241j.f157249d.add(new C55227c(3, aVar, (String) null, 4, (C8480h) null));
        }
        if (this.f157237f) {
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            ArrayList<C53979a.C53980a> arrayList = RoomLiveService.f157185Q.f151233h;
            C24564k0.m30737a(arrayList).remove(this.f157242n);
            if (arrayList.size() > 0) {
                ArrayList<C55227c> arrayList2 = this.f157241j.f157249d;
                String q = C76577a.m92166q(getContext(), C0966R.string.g_s);
                C87412m.m108593f(q, "getString(context, R.str…ive_room_wait_mic_number)");
                String format = String.format(q, Arrays.copyOf(new Object[]{Integer.valueOf(RoomLiveService.f157185Q.f151233h.size())}, 1));
                C87412m.m108593f(format, "format(format, *args)");
                arrayList2.add(new C55227c(1, (C53979a.C53980a) null, format, 2, (C8480h) null));
                Iterator<C53979a.C53980a> it = arrayList.iterator();
                while (it.hasNext()) {
                    C53979a.C53980a next = it.next();
                    String str = next.f151238c;
                    C53979a.C53980a aVar2 = this.f157242n;
                    if (!C87412m.m108589b(str, aVar2 != null ? aVar2.f151238c : null)) {
                        this.f157241j.f157249d.add(new C55227c(2, next, (String) null, 4, (C8480h) null));
                    }
                }
            } else if (this.f157242n == null) {
                this.f157241j.f157249d.add(new C55227c(4, (C53979a.C53980a) null, (String) null, 6, (C8480h) null));
            }
        } else {
            this.f157241j.f157249d.add(new C55227c(5, (C53979a.C53980a) null, (String) null, 6, (C8480h) null));
        }
        this.f157241j.notifyDataSetChanged();
    }

    public final C32227p<Boolean, C53979a.C53980a, C13598b0> getCallMicListener() {
        return this.f157239h;
    }

    public final C32224a<C13598b0> getHideClickListener() {
        return this.f157238g;
    }

    public final boolean getMicPermission() {
        return this.f157237f;
    }

    public final C32226l<Boolean, C13598b0> getMicPermissionListener() {
        return this.f157240i;
    }

    public final View getParent() {
        return this.f157247s;
    }

    public final C53979a.C53980a getSelectUser() {
        return this.f157242n;
    }

    public final void setCallMicListener(C32227p<? super Boolean, ? super C53979a.C53980a, C13598b0> pVar) {
        this.f157239h = pVar;
    }

    public final void setDefaultMicState(boolean z) {
        this.f157237f = z;
    }

    public final void setHideClickListener(C32224a<C13598b0> aVar) {
        this.f157238g = aVar;
    }

    public final void setMicPermission(boolean z) {
        this.f157237f = z;
    }

    public final void setMicPermissionListener(C32226l<? super Boolean, C13598b0> lVar) {
        this.f157240i = lVar;
    }

    public final void setMicUser(C53979a.C53980a aVar) {
        this.f157242n = aVar;
    }

    public final void setParent(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f157247s = view;
    }
}
