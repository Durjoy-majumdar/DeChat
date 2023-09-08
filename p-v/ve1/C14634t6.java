package ve1;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0711b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderShareGuideShowEvent;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import dp1.C7434f1;
import eb0.C31543z5;
import er1.C7878t0;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import l60.C99342a;
import o40.C61926c;
import pe3.C89349b;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import te3.C49712hj1;
import te3.C64629pl1;
import up1.C27696y;
import up1.C37521f;
import vq1.C65866w;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: ve1.t6 */
public class C14634t6 extends C60896i<C0711b> {

    /* renamed from: e */
    public final C49712hj1 f40481e;

    /* renamed from: f */
    public final List<C64629pl1> f40482f;

    /* renamed from: ve1.t6$a */
    public final class C14635a extends RecyclerView.C16613e<C14637c> {

        /* renamed from: d */
        public final Context f40483d;

        /* renamed from: e */
        public final Object f40484e;

        /* renamed from: f */
        public final String f40485f;

        /* renamed from: g */
        public final C89349b f40486g;

        /* renamed from: h */
        public List<FinderObject> f40487h = new ArrayList();

        /* renamed from: i */
        public List<Integer> f40488i = new ArrayList();

        /* renamed from: j */
        public int f40489j;

        /* renamed from: n */
        public int f40490n;

        /* renamed from: o */
        public final /* synthetic */ C14634t6 f40491o;

        public C14635a(C14634t6 t6Var, Context context, int i, int i2, Object obj, String str, C89349b bVar) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(str, "wording");
            this.f40491o = t6Var;
            this.f40483d = context;
            this.f40484e = obj;
            this.f40485f = str;
            this.f40486g = bVar;
            int i3 = ((C74783i3.m89537a(context).f24704a - (i2 * 2)) - (i * 2)) / 3;
            this.f40489j = i3;
            this.f40490n = (i3 * 4) / 3;
        }

        public int getItemCount() {
            return ((ArrayList) this.f40487h).size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            LinkedList<FinderMedia> linkedList;
            String str;
            C14637c cVar = (C14637c) zVar;
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            C87412m.m108594g(cVar, "holder");
            FinderObject finderObject = (FinderObject) ((ArrayList) this.f40487h).get(i);
            int intValue = ((Number) ((ArrayList) this.f40488i).get(i)).intValue();
            int h = C65866w.f189407h.mo89909h(finderObject);
            String c = h > 0 ? C7878t0.m8034c(2, h) : "0";
            TextView textView = cVar.f40494A;
            if (textView != null) {
                textView.setText(c);
            }
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
                ImageView imageView = cVar.f40495z;
                if (imageView != null) {
                    C39818r rVar = C39818r.f106831a;
                    ((C99342a) ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(str, C27696y.THUMB_IMAGE), ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.SHARE_STREAM_GUIDE_ITEM))).mo85954d(imageView);
                }
            }
            cVar.f44854d.setOnClickListener(new C14627s6(intValue, this, i, this.f40491o, finderObject));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.ams, viewGroup, false);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
            ViewGroup.LayoutParams layoutParams = ((RelativeLayout) inflate).getLayoutParams();
            layoutParams.width = this.f40489j;
            layoutParams.height = this.f40490n;
            C14637c cVar = new C14637c(this.f40491o, inflate);
            ImageView imageView = cVar.f40495z;
            ViewGroup.LayoutParams layoutParams2 = imageView != null ? imageView.getLayoutParams() : null;
            if (layoutParams2 != null) {
                layoutParams2.height = this.f40490n;
            }
            return cVar;
        }
    }

    /* renamed from: ve1.t6$b */
    public final class C14636b extends RecyclerView.C0129l {

        /* renamed from: d */
        public final int f40492d;

        /* renamed from: e */
        public final int f40493e;

        public C14636b(C14634t6 t6Var, int i, int i2) {
            this.f40492d = i;
            this.f40493e = i2;
        }

        /* renamed from: f */
        public void mo121f(Rect rect, int i, RecyclerView recyclerView) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(recyclerView, "parent");
            rect.set(0, 0, 0, 0);
            int i2 = i % 3;
            if (i2 == 0) {
                rect.left = this.f40492d;
                return;
            }
            rect.left = this.f40493e;
            if (i2 == 2) {
                rect.right = this.f40492d;
            }
        }
    }

    /* renamed from: ve1.t6$c */
    public final class C14637c extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f40494A;

        /* renamed from: z */
        public ImageView f40495z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14637c(C14634t6 t6Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            RoundCornerRelativeLayout roundCornerRelativeLayout = (RoundCornerRelativeLayout) view;
            roundCornerRelativeLayout.setRadius(roundCornerRelativeLayout.getContext().getResources().getDimension(C0966R.dimen.f3766df));
            this.f40495z = (ImageView) view.findViewById(C0966R.C0970id.hmk);
            this.f40494A = (TextView) view.findViewById(C0966R.C0970id.onh);
        }
    }

    /* renamed from: ve1.t6$d */
    public static final class C14638d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f40496d;

        public C14638d(Context context) {
            this.f40496d = context;
        }

        public final void run() {
            ((Activity) this.f40496d).finish();
        }
    }

    /* renamed from: ve1.t6$e */
    public static final class C14639e extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C14634t6 f40497a;

        /* renamed from: b */
        public final /* synthetic */ LinearLayout f40498b;

        /* renamed from: c */
        public final /* synthetic */ C8479f0<List<FinderObject>> f40499c;

        /* renamed from: d */
        public final /* synthetic */ C8478d0 f40500d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<String> f40501e;

        public C14639e(C14634t6 t6Var, LinearLayout linearLayout, C8479f0<List<FinderObject>> f0Var, C8478d0 d0Var, C8479f0<String> f0Var2) {
            this.f40497a = t6Var;
            this.f40498b = linearLayout;
            this.f40499c = f0Var;
            this.f40500d = d0Var;
            this.f40501e = f0Var2;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            boolean z2 = z;
            C87412m.m108594g(view, "view");
            C14634t6 t6Var = this.f40497a;
            Object tag = this.f40498b.getTag();
            t6Var.getClass();
            int intValue = (tag == null || !(tag instanceof Integer)) ? -1 : ((Number) tag).intValue();
            if (z2) {
                C14634t6 t6Var2 = this.f40497a;
                List<FinderObject> list = (List) this.f40499c.f27484d;
                t6Var2.getClass();
                int i = 0;
                String str = "";
                if (!(list == null || list.isEmpty())) {
                    for (FinderObject finderObject : list) {
                        int i2 = i + 1;
                        str = str + C61926c.m72691p(finderObject.f164794id);
                        if (i < list.size() - 1) {
                            str = str + ';';
                        }
                        i = i2;
                    }
                }
                C7434f1.m7549a(C7434f1.f25625a, this.f40497a.f40481e, 1, C31543z5.m39453c(), intValue, this.f40500d.f27483d, (String) this.f40501e.f27484d, (Integer) null, str, 64, (Object) null);
            }
            FinderShareGuideShowEvent finderShareGuideShowEvent = new FinderShareGuideShowEvent();
            FinderShareGuideShowEvent.C1062a aVar = finderShareGuideShowEvent.f9248d;
            aVar.f9249a = intValue - 1;
            aVar.f9250b = z2 ? 1 : 0;
            finderShareGuideShowEvent.publish();
        }
    }

    /* renamed from: ve1.t6$f */
    public static final class C14640f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14634t6 f40502d;

        /* renamed from: e */
        public final /* synthetic */ C8478d0 f40503e;

        /* renamed from: f */
        public final /* synthetic */ RecyclerView f40504f;

        /* renamed from: g */
        public final /* synthetic */ LinearLayout f40505g;

        /* renamed from: h */
        public final /* synthetic */ C8479f0<String> f40506h;

        public C14640f(C14634t6 t6Var, C8478d0 d0Var, RecyclerView recyclerView, LinearLayout linearLayout, C8479f0<String> f0Var) {
            this.f40502d = t6Var;
            this.f40503e = d0Var;
            this.f40504f = recyclerView;
            this.f40505g = linearLayout;
            this.f40506h = f0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderOpenEntranceTipConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C37521f.f99374d.getClass();
            int intValue = C37521f.f99546w3.mo60266n().intValue();
            int i = 1;
            if (intValue == 0) {
                i = 3;
            } else if (intValue != 1 && intValue == 2) {
                i = 4;
            }
            C14486c8.f40164d = i;
            C14486c8.f40165e = 0;
            C14634t6 t6Var = this.f40502d;
            int i2 = this.f40503e.f27483d;
            Context context = this.f40504f.getContext();
            C87412m.m108593f(context, "recyclerView.context");
            t6Var.mo13836j(intValue, i2, context, this.f40505g.getTag(), (String) this.f40506h.f27484d, "");
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderOpenEntranceTipConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C14634t6(C49712hj1 hj12, int i, List<? extends C64629pl1> list) {
        this.f40481e = hj12;
        this.f40482f = list;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.amr;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g((C0711b) cVar, "item");
        LinearLayout linearLayout = (LinearLayout) oVar.f44854d.findViewById(C0966R.C0970id.hmm);
        if (linearLayout.getTag() == null) {
            linearLayout.setTag(Integer.valueOf(i));
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        LinkedList<Integer> linkedList;
        C89349b bVar;
        C8479f0 f0Var;
        C60905o oVar2 = oVar;
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar2, "holder");
        C8479f0 f0Var2 = new C8479f0();
        C8479f0 f0Var3 = new C8479f0();
        T t = "";
        f0Var3.f27484d = t;
        C8478d0 d0Var = new C8478d0();
        boolean z = true;
        d0Var.f27483d = 1;
        List<C64629pl1> list = this.f40482f;
        if (!(list == null || list.isEmpty())) {
            C64629pl1 pl12 = this.f40482f.get(0);
            T t2 = pl12.f184841e;
            if (t2 != null) {
                t = t2;
            }
            f0Var3.f27484d = t;
            T t3 = pl12.f184844h;
            f0Var2.f27484d = t3;
            LinkedList<Integer> linkedList2 = pl12.f184845i;
            C89349b bVar2 = pl12.f184846j;
            List list2 = (List) t3;
            if (list2 != null && !list2.isEmpty()) {
                d0Var.f27483d = 3;
            }
            bVar = bVar2;
            linkedList = linkedList2;
        } else {
            bVar = null;
            linkedList = null;
        }
        CharSequence charSequence = (CharSequence) f0Var3.f27484d;
        if (charSequence == null || charSequence.length() == 0) {
            T string = recyclerView.getContext().getString(C0966R.string.d8q);
            C87412m.m108593f(string, "recyclerView.context.get…d_active_and_jump_finder)");
            f0Var3.f27484d = string;
        }
        LinearLayout linearLayout = (LinearLayout) oVar2.f44854d.findViewById(C0966R.C0970id.hmm);
        TextView textView = (TextView) oVar2.f44854d.findViewById(C0966R.C0970id.hmo);
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        textView.setText((CharSequence) f0Var3.f27484d);
        Object tag = linearLayout.getTag();
        String str = (String) f0Var3.f27484d;
        List list3 = (List) f0Var2.f27484d;
        if (list3 != null && !list3.isEmpty()) {
            z = false;
        }
        if (z) {
            ((WeImageView) oVar2.f44854d.findViewById(C0966R.C0970id.hml)).setVisibility(0);
        }
        if (list3 == null || linkedList == null) {
            f0Var = f0Var3;
        } else {
            RecyclerView recyclerView2 = (RecyclerView) oVar2.f44854d.findViewById(C0966R.C0970id.hmn);
            recyclerView2.setVisibility(0);
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            int dimensionPixelSize = recyclerView.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
            int dimensionPixelSize2 = recyclerView.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3703bv);
            RecyclerView recyclerView3 = recyclerView2;
            Context context = recyclerView.getContext();
            C87412m.m108593f(context, "recyclerView.context");
            int i2 = dimensionPixelSize2;
            RecyclerView recyclerView4 = recyclerView3;
            f0Var = f0Var3;
            C14635a aVar = new C14635a(this, context, dimensionPixelSize, i2, tag, str, bVar);
            recyclerView4.setAdapter(aVar);
            recyclerView4.mo17085h0(new C14636b(this, dimensionPixelSize, i2));
            ((ArrayList) aVar.f40487h).clear();
            ((ArrayList) aVar.f40487h).addAll(list3);
            ((ArrayList) aVar.f40488i).clear();
            ((ArrayList) aVar.f40488i).addAll(linkedList);
            aVar.notifyDataSetChanged();
        }
        View view = oVar2.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        C8479f0 f0Var4 = f0Var;
        C23564m.m28138h(view, new C14639e(this, linearLayout, f0Var2, d0Var, f0Var4));
        linearLayout.setOnClickListener(new C14640f(this, d0Var, recyclerView, linearLayout, f0Var4));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13836j(int r23, int r24, android.content.Context r25, java.lang.Object r26, java.lang.String r27, java.lang.String r28) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r25
            r3 = r26
            java.lang.Class<dp1.y0> r4 = dp1.C58417y0.class
            java.lang.String r5 = "context"
            gy3.C87412m.m108594g(r2, r5)
            java.lang.String r5 = "wording"
            r13 = r27
            gy3.C87412m.m108594g(r13, r5)
            java.lang.String r5 = "feedIds"
            r15 = r28
            gy3.C87412m.m108594g(r15, r5)
            java.lang.Class<kq.h> r5 = p185kq.C10383h.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            kq.h r5 = (p185kq.C10383h) r5
            te3.hj1 r6 = r0.f40481e
            r18 = 0
            if (r6 == 0) goto L_0x002f
            java.lang.String r6 = r6.f134671e
            goto L_0x0031
        L_0x002f:
            r6 = r18
        L_0x0031:
            r5.mo10697OK(r6)
            long r5 = eb0.C75592q0.m90781k()
            r7 = 34359738368(0x800000000, double:1.69759663277E-313)
            long r7 = r7 & r5
            r9 = 0
            r14 = 0
            r12 = 1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0048
            r7 = 1
            goto L_0x0049
        L_0x0048:
            r7 = 0
        L_0x0049:
            if (r7 == 0) goto L_0x00bc
            r7 = -34359738369(0xfffffff7ffffffff, double:NaN)
            long r5 = r5 & r7
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            java.lang.Long r8 = java.lang.Long.valueOf(r5)
            r9 = 147457(0x24001, float:2.06631E-40)
            r7.mo119676J(r9, r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "openFinderEntrance extstatus:"
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.String r6 = "Finder.FinderOpenEntranceTipConvert"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            te3.br1 r5 = new te3.br1
            r5.<init>()
            r7 = 57
            r5.f182324d = r7
            r5.f182325e = r12
            java.lang.Class<f62.k0> r7 = f62.C75700k0.class
            k40.a r7 = f40.C86709a0.m107533q(r7)
            f62.k0 r7 = (f62.C75700k0) r7
            g62.m r7 = r7.mo96100XW()
            g62.n r8 = new g62.n
            r9 = 23
            r8.<init>(r9, r5)
            tc0.p r7 = (tc0.C77885p) r7
            r7.mo107993q(r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "openFinderEntrance switch functionId:"
            r7.append(r8)
            int r8 = r5.f182324d
            r7.append(r8)
            java.lang.String r8 = " to "
            r7.append(r8)
            int r5 = r5.f182325e
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r5)
        L_0x00bc:
            if (r3 == 0) goto L_0x00cb
            boolean r6 = r3 instanceof java.lang.Integer
            if (r6 != 0) goto L_0x00c3
            goto L_0x00cb
        L_0x00c3:
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r11 = r3
            goto L_0x00cc
        L_0x00cb:
            r11 = -1
        L_0x00cc:
            r3 = 18
            r9 = 3
            r10 = 2
            if (r1 == 0) goto L_0x00e5
            if (r1 == r10) goto L_0x00d7
            java.lang.String r1 = "KEY_FINDER_POST_FINISH_JUMP_FRIEND_TAB"
            goto L_0x00f1
        L_0x00d7:
            di3.d r1 = di3.C86312j.m106911c(r4)
            dp1.y0 r1 = (dp1.C58417y0) r1
            r3 = 4
            int r3 = r1.mo83328dc(r3)
            java.lang.String r1 = "KEY_FINDER_POST_FINISH_JUMP_HOT_TAB"
            goto L_0x00f1
        L_0x00e5:
            di3.d r1 = di3.C86312j.m106911c(r4)
            dp1.y0 r1 = (dp1.C58417y0) r1
            int r3 = r1.mo83328dc(r9)
            java.lang.String r1 = "KEY_FINDER_POST_FINISH_JUMP_FOLLOW_TAB"
        L_0x00f1:
            if (r11 <= 0) goto L_0x0117
            dp1.f1 r6 = dp1.C7434f1.f25625a
            te3.hj1 r7 = r0.f40481e
            r8 = 2
            long r16 = eb0.C31543z5.m39453c()
            r4 = 0
            r19 = 64
            r20 = 0
            r5 = 3
            r21 = 2
            r9 = r16
            r23 = 1
            r12 = r24
            r13 = r27
            r14 = r4
            r15 = r28
            r16 = r19
            r17 = r20
            dp1.C7434f1.m7549a(r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x011c
        L_0x0117:
            r23 = 1
            r5 = 3
            r21 = 2
        L_0x011c:
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 15185(0x3b51, float:2.1279E-41)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r8 = 11
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 0
            r7[r9] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r23)
            r10 = 1
            r7[r10] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r21)
            r7[r21] = r8
            r4.mo160131h(r6, r7)
            boolean r4 = r2 instanceof android.app.Activity
            if (r4 == 0) goto L_0x0163
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r4 = r4.mo62443b(r2)
            java.lang.Class<rs1.q> r6 = rs1.C13371q.class
            bl3.t r4 = r4.mo62449e(r6)
            rs1.q r4 = (rs1.C13371q) r4
            if (r4 != 0) goto L_0x0150
            goto L_0x0152
        L_0x0150:
            r4.f37885e = r9
        L_0x0152:
            zt3.t r4 = zt3.C119157j.f356862d
            ve1.t6$d r6 = new ve1.t6$d
            r6.<init>(r2)
            r7 = 280(0x118, double:1.383E-321)
            zt3.j r4 = (zt3.C119157j) r4
            r4.getClass()
            r4.mo183892w(r6, r7, r9)
        L_0x0163:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            r4.putExtra(r1, r10)
            java.lang.String r1 = "KEY_FROM_SHARE_REL"
            r4.putExtra(r1, r10)
            java.lang.String r1 = "key_auto_trigger_type"
            r4.putExtra(r1, r5)
            te3.hj1 r1 = r0.f40481e
            if (r1 == 0) goto L_0x0194
            java.lang.String r11 = r1.f134671e
            if (r11 == 0) goto L_0x0194
            char[] r12 = new char[r10]
            r1 = 45
            r12[r9] = r1
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            java.util.List r1 = z04.C112550d0.m153784T(r11, r12, r13, r14, r15, r16)
            java.lang.Object r1 = r1.get(r9)
            r18 = r1
            java.lang.String r18 = (java.lang.String) r18
        L_0x0194:
            r1 = r18
            r5 = -1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r5)
            if (r1 <= 0) goto L_0x01ac
            if (r3 <= 0) goto L_0x01ac
            java.lang.Class<ht1.t1> r5 = ht1.C60200t1.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ht1.t1 r5 = (ht1.C60200t1) r5
            r6 = 9
            r5.mo76842e7(r1, r6, r3, r4)
        L_0x01ac:
            dp1.e0 r1 = dp1.C20480e0.f57583a
            r1.mo32031d()
            java.lang.Class<er1.b> r1 = er1.C58684b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r3 = "getService(ActivityRouter::class.java)"
            gy3.C87412m.m108593f(r1, r3)
            er1.b r1 = (er1.C58684b) r1
            r5 = 1
            r6 = 0
            r7 = 8
            r8 = 0
            r2 = r25
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            er1.C58684b.by0(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14634t6.mo13836j(int, int, android.content.Context, java.lang.Object, java.lang.String, java.lang.String):void");
    }
}
