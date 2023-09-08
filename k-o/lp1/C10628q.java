package lp1;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dp1.C7434f1;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import l60.C99342a;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import rr3.C110622b;
import up1.C27696y;
import vp3.C65849b;

/* renamed from: lp1.q */
public final class C10628q extends C10605a {

    /* renamed from: q */
    public RecyclerView f32031q;

    /* renamed from: r */
    public C10629a f32032r;

    /* renamed from: s */
    public Animator f32033s;

    /* renamed from: t */
    public Animator f32034t;

    /* renamed from: u */
    public ViewTreeObserver.OnGlobalLayoutListener f32035u;

    /* renamed from: lp1.q$a */
    public final class C10629a extends RecyclerView.C16613e<C10631c> {

        /* renamed from: d */
        public final Context f32036d;

        /* renamed from: e */
        public List<FinderObject> f32037e = new ArrayList();

        /* renamed from: f */
        public int f32038f;

        /* renamed from: g */
        public final /* synthetic */ C10628q f32039g;

        public C10629a(C10628q qVar, Context context) {
            C87412m.m108594g(context, "context");
            this.f32039g = qVar;
            this.f32036d = context;
        }

        public int getItemCount() {
            return ((ArrayList) this.f32037e).size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            LinkedList<FinderMedia> linkedList;
            String str;
            int i2 = i;
            C10631c cVar = (C10631c) zVar;
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            C87412m.m108594g(cVar, "holder");
            FinderObject finderObject = (FinderObject) ((ArrayList) this.f32037e).get(i2);
            FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
            if (!(finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null || linkedList.size() <= 0)) {
                String str2 = linkedList.get(0).coverUrl;
                String str3 = "";
                if (str2 == null || str2.length() == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(linkedList.get(0).thumbUrl);
                    String str4 = linkedList.get(0).thumb_url_token;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    sb.append(str3);
                    str = sb.toString();
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(linkedList.get(0).coverUrl);
                    String str5 = linkedList.get(0).cover_url_token;
                    if (str5 != null) {
                        str3 = str5;
                    }
                    sb4.append(str3);
                    str = sb4.toString();
                }
                ImageView imageView = cVar.f32042z;
                if (imageView != null) {
                    C39818r rVar = C39818r.f106831a;
                    ((C99342a) ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(str, C27696y.THUMB_IMAGE), ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.SHARE_STREAM_GUIDE_ITEM))).mo85954d(imageView);
                }
            }
            View view = cVar.f32041A;
            if (view != null) {
                int i3 = i2 == this.f32038f ? 0 : 8;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i3));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/share/FinderShareSideGuideUIC$RvAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/share/FinderShareSideGuideUIC$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/share/FinderShareSideGuideUIC$RvAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/share/FinderShareSideGuideUIC$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            cVar.f44854d.setOnClickListener(new C10627p(this, i2, this.f32039g, finderObject));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.apn, viewGroup, false);
            C10628q qVar = this.f32039g;
            C87412m.m108593f(inflate, "view");
            return new C10631c(qVar, inflate);
        }
    }

    /* renamed from: lp1.q$b */
    public final class C10630b extends RecyclerView.C0129l {

        /* renamed from: d */
        public final int f32040d;

        public C10630b(C10628q qVar, int i) {
            this.f32040d = i;
        }

        /* renamed from: f */
        public void mo121f(Rect rect, int i, RecyclerView recyclerView) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(recyclerView, "parent");
            rect.set(0, 0, 0, 0);
            rect.bottom = this.f32040d;
        }
    }

    /* renamed from: lp1.q$c */
    public final class C10631c extends RecyclerView.C16631z {

        /* renamed from: A */
        public View f32041A;

        /* renamed from: z */
        public ImageView f32042z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10631c(C10628q qVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            RoundCornerRelativeLayout roundCornerRelativeLayout = (RoundCornerRelativeLayout) view;
            roundCornerRelativeLayout.setRadius(roundCornerRelativeLayout.getContext().getResources().getDimension(C0966R.dimen.f3703bv));
            this.f32042z = (ImageView) view.findViewById(C0966R.C0970id.esi);
            this.f32041A = view.findViewById(C0966R.C0970id.esj);
        }
    }

    /* renamed from: lp1.q$d */
    public static final class C10632d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ C10628q f32043d;

        public C10632d(C10628q qVar) {
            this.f32043d = qVar;
        }

        public final void onGlobalLayout() {
            WeImageView weImageView;
            C10628q qVar = this.f32043d;
            View view = qVar.f31970d;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                ((FrameLayout.LayoutParams) layoutParams).topMargin = (int) ((((double) C74783i3.m89537a(qVar.getContext()).f24705b) * 0.45d) - ((double) (view.getHeight() >> 1)));
            }
            C10628q qVar2 = this.f32043d;
            if (!qVar2.f31971e) {
                View view2 = qVar2.f31970d;
                ViewGroup.LayoutParams layoutParams2 = null;
                ImageView imageView = view2 != null ? (ImageView) view2.findViewById(C0966R.C0970id.a8d) : null;
                View view3 = qVar2.f31970d;
                ImageView imageView2 = view3 != null ? (ImageView) view3.findViewById(C0966R.C0970id.a8m) : null;
                C65849b bVar = new C65849b();
                Resources resources = qVar2.getActivity().getResources();
                int i = 0;
                int dimensionPixelSize = resources != null ? resources.getDimensionPixelSize(C0966R.dimen.f3763dc) : 0;
                View view4 = qVar2.f31970d;
                if (view4 != null) {
                    i = view4.getHeight();
                }
                if (i <= 0) {
                    i = 900;
                }
                ViewGroup.LayoutParams layoutParams3 = imageView != null ? imageView.getLayoutParams() : null;
                if (layoutParams3 != null) {
                    layoutParams3.height = i;
                }
                if (imageView2 != null) {
                    layoutParams2 = imageView2.getLayoutParams();
                }
                if (layoutParams2 != null) {
                    layoutParams2.height = i;
                }
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, i, Bitmap.Config.ARGB_8888);
                createBitmap.eraseColor(Color.parseColor("#61F0F0F0"));
                bVar.mo89891b(createBitmap);
                bVar.f189363b = dimensionPixelSize;
                bVar.f189364c = i;
                C110622b b = bVar.f189366e.f334033b.mo154922b();
                b.mo162186d(qVar2.getActivity().getResources().getDimension(C0966R.dimen.f3766df));
                b.mo162187e(5.0f);
                bVar.mo89890a(new C10636u(imageView));
                if (imageView2 != null) {
                    imageView2.setImageDrawable(new ColorDrawable(qVar2.getActivity().getResources().getColor(C0966R.color.f2937k)));
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qVar2.f31970d, "alpha", new float[]{0.0f, 1.0f});
                qVar2.f32033s = ofFloat;
                if (ofFloat != null) {
                    ofFloat.addListener(new C10634s(qVar2));
                }
                Animator animator = qVar2.f32033s;
                if (animator != null) {
                    animator.setDuration(280);
                }
                Animator animator2 = qVar2.f32033s;
                if (animator2 != null) {
                    animator2.start();
                }
                qVar2.f31971e = true;
                View view5 = qVar2.f31970d;
                if (!(view5 == null || (weImageView = (WeImageView) view5.findViewById(C0966R.C0970id.e7_)) == null)) {
                    weImageView.setOnClickListener(new C10635t(qVar2));
                }
                C7434f1.f25625a.mo8576b(qVar2.getActivity(), 3, "right");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10628q(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: f3 */
    public int mo10862f3() {
        return C0966R.C0970id.f359096iu0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x005d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: n3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10869n3() {
        /*
            r4 = this;
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99150D3
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x005e
            int r0 = r4.f31979p
            r3 = 25
            if (r0 == r3) goto L_0x0022
            r3 = 38
            if (r0 != r3) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r0 = 0
            goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            if (r0 == 0) goto L_0x005e
            er1.w3 r0 = er1.C58784w3.f168295a
            boolean r0 = r0.mo83869G0()
            if (r0 == 0) goto L_0x005e
            java.util.List<? extends com.tencent.mm.plugin.finder.model.BaseFinderFeed> r0 = r4.f31976j
            if (r0 == 0) goto L_0x005a
            int r3 = r0.size()
            if (r3 <= r2) goto L_0x005a
            java.lang.Object r0 = r0.get(r1)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r0
            if (r0 == 0) goto L_0x004e
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo3513o()
            if (r0 == 0) goto L_0x004e
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            if (r0 == 0) goto L_0x004e
            int r0 = r0.permissionFlag
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0055
            r0 = 1
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r0 != 0) goto L_0x005a
            r0 = 1
            goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            if (r0 == 0) goto L_0x005e
            r1 = 1
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lp1.C10628q.mo10869n3():boolean");
    }

    /* renamed from: o3 */
    public void mo10870o3() {
        View view;
        FinderItem o;
        FinderObject feedObject;
        if (!this.f31971e && !mo10865j3() && (view = this.f31970d) != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/share/FinderShareSideGuideUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int i = 0;
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/share/FinderShareSideGuideUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            float dimension = getActivity().getResources().getDimension(C0966R.dimen.f3766df);
            RoundCornerRelativeLayout roundCornerRelativeLayout = (RoundCornerRelativeLayout) view;
            roundCornerRelativeLayout.mo82317c(dimension, 0.0f, dimension, 0.0f);
            this.f32035u = new C10632d(this);
            ViewTreeObserver viewTreeObserver = roundCornerRelativeLayout.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f32035u);
            }
            View view2 = this.f31970d;
            RecyclerView recyclerView = view2 != null ? (RecyclerView) view2.findViewById(C0966R.C0970id.e7b) : null;
            this.f32031q = recyclerView;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
            }
            float dimension2 = getActivity().getResources().getDimension(C0966R.dimen.f3766df);
            RecyclerView recyclerView2 = this.f32031q;
            if (recyclerView2 != null) {
                recyclerView2.mo17085h0(new C10630b(this, (int) dimension2));
            }
            C10629a aVar2 = new C10629a(this, getActivity());
            this.f32032r = aVar2;
            RecyclerView recyclerView3 = this.f32031q;
            if (recyclerView3 != null) {
                recyclerView3.setAdapter(aVar2);
            }
            C10629a aVar3 = this.f32032r;
            if (aVar3 != null) {
                LinkedList linkedList = new LinkedList();
                List<? extends BaseFinderFeed> list = this.f31976j;
                if (list != null) {
                    for (BaseFinderFeed baseFinderFeed : list) {
                        int i2 = i + 1;
                        if (!(baseFinderFeed instanceof BaseFinderFeed)) {
                            baseFinderFeed = null;
                        }
                        if (!(baseFinderFeed == null || (o = baseFinderFeed.mo3513o()) == null || (feedObject = o.getFeedObject()) == null)) {
                            linkedList.add(feedObject);
                        }
                        if (i >= 5) {
                            break;
                        }
                        i = i2;
                    }
                }
                ((ArrayList) aVar3.f32037e).clear();
                ((ArrayList) aVar3.f32037e).addAll(linkedList);
                aVar3.notifyDataSetChanged();
            }
        }
    }

    public boolean onBackPressed() {
        View view = this.f31970d;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/share/FinderShareSideGuideUIC", "handleOnExit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/share/FinderShareSideGuideUIC", "handleOnExit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return super.onBackPressed();
    }

    public void onDestroy() {
        super.onDestroy();
        Animator animator = this.f32033s;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f32034t;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10628q(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }
}
