package rs1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0751m0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import dp1.C7435f2;
import er1.C58784w3;
import er1.C7878t0;
import er1.C7919x;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import l60.C99342a;
import l60.C99344b;
import o40.C61926c;
import org.json.JSONObject;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import qo3.C77407n;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C64414h71;
import up1.C27696y;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: rs1.h */
public final class C13248h extends C60896i<C13310l> {

    /* renamed from: e */
    public final int f37609e = 10021;

    /* renamed from: f */
    public C77407n f37610f;

    /* renamed from: rs1.h$a */
    public final class C13249a extends RecyclerView.C16613e<C13251c> {

        /* renamed from: d */
        public final Context f37611d;

        /* renamed from: e */
        public List<FinderObject> f37612e = new ArrayList();

        /* renamed from: f */
        public int f37613f;

        /* renamed from: g */
        public int f37614g;

        /* renamed from: h */
        public final /* synthetic */ C13248h f37615h;

        public C13249a(C13248h hVar, Context context, int i, int i2, int i3) {
            C87412m.m108594g(context, "context");
            this.f37615h = hVar;
            this.f37611d = context;
            int i4 = (((C74783i3.m89537a(context).f24704a - (i2 * 2)) - (i * 2)) - (i3 * 2)) / 3;
            this.f37613f = i4;
            this.f37614g = (i4 * 4) / 3;
        }

        public int getItemCount() {
            return ((ArrayList) this.f37612e).size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            LinkedList<FinderMedia> linkedList;
            String str;
            C13251c cVar = (C13251c) zVar;
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            C87412m.m108594g(cVar, "holder");
            FinderObject finderObject = (FinderObject) ((ArrayList) this.f37612e).get(i);
            TextView textView = cVar.f37618A;
            if (textView != null) {
                textView.setText(C7878t0.m8034c(2, finderObject.likeCount));
            }
            WeImageView weImageView = cVar.f37619B;
            if (weImageView != null) {
                Context context = this.f37611d;
                Integer c0 = C58784w3.m68436c0(C58784w3.f168295a, 2, false, 2, (Object) null);
                weImageView.setImageDrawable(C74933u4.m89768e(context, c0 != null ? c0.intValue() : C0966R.raw.icon_filled_awesome, this.f37611d.getResources().getColor(C0966R.color.f2975b6)));
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
                ImageView imageView = cVar.f37620z;
                if (imageView != null) {
                    C39818r rVar = C39818r.f106831a;
                    C99344b<C100810g0, Bitmap> b = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(str, C27696y.THUMB_IMAGE), ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.PROFILE_COVER));
                    b.f291321e = null;
                    ((C99342a) b).mo85954d(imageView);
                }
            }
            cVar.f44854d.setOnClickListener(new C13238g(finderObject, this, cVar, i));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.b0u, viewGroup, false);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
            ViewGroup.LayoutParams layoutParams = ((RelativeLayout) inflate).getLayoutParams();
            layoutParams.width = this.f37613f;
            layoutParams.height = this.f37614g;
            C13251c cVar = new C13251c(this.f37615h, inflate);
            ImageView imageView = cVar.f37620z;
            ViewGroup.LayoutParams layoutParams2 = imageView != null ? imageView.getLayoutParams() : null;
            if (layoutParams2 != null) {
                layoutParams2.height = this.f37614g;
            }
            return cVar;
        }
    }

    /* renamed from: rs1.h$b */
    public final class C13250b extends RecyclerView.C0129l {

        /* renamed from: d */
        public final int f37616d;

        /* renamed from: e */
        public final int f37617e;

        public C13250b(C13248h hVar, int i, int i2) {
            this.f37616d = i;
            this.f37617e = i2;
        }

        /* renamed from: f */
        public void mo121f(Rect rect, int i, RecyclerView recyclerView) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(recyclerView, "parent");
            rect.set(0, 0, 0, 0);
            int i2 = i % 3;
            if (i2 == 0) {
                rect.left = this.f37616d;
                rect.right = 0;
                return;
            }
            rect.left = this.f37617e;
            if (i2 == 2) {
                rect.right = this.f37616d;
            } else {
                rect.right = 0;
            }
        }
    }

    /* renamed from: rs1.h$c */
    public final class C13251c extends RecyclerView.C16631z {

        /* renamed from: A */
        public TextView f37618A;

        /* renamed from: B */
        public WeImageView f37619B;

        /* renamed from: z */
        public ImageView f37620z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13251c(C13248h hVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            RoundCornerRelativeLayout roundCornerRelativeLayout = (RoundCornerRelativeLayout) view;
            roundCornerRelativeLayout.setRadius(roundCornerRelativeLayout.getContext().getResources().getDimension(C0966R.dimen.f3703bv));
            this.f37620z = (ImageView) view.findViewById(C0966R.C0970id.kk6);
            this.f37618A = (TextView) view.findViewById(C0966R.C0970id.fnp);
            this.f37619B = (WeImageView) view.findViewById(C0966R.C0970id.j05);
        }
    }

    /* renamed from: rs1.h$d */
    public static final class C13252d extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C60905o f37621a;

        /* renamed from: rs1.h$d$a */
        public static final class C13253a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ String f37622d;

            /* renamed from: e */
            public final /* synthetic */ C49712hj1 f37623e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13253a(String str, C49712hj1 hj12) {
                super(0);
                this.f37622d = str;
                this.f37623e = hj12;
            }

            public Object invoke() {
                C58969q b = C58961d.f168673a.mo84155b(this.f37622d);
                int i = 1;
                boolean z = b != null && b.field_follow_Flag == C58969q.f168707c2;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("finderusername", this.f37622d);
                if (!z) {
                    i = 2;
                }
                jSONObject.put("follow_button_type", i);
                C7435f2.f25626a.mo8577a(this.f37623e, "frifollow_page_follow_button", 0, jSONObject);
                return C13598b0.f38549a;
            }
        }

        public C13252d(C60905o oVar) {
            this.f37621a = oVar;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            C87412m.m108594g(view, "view");
            if (z) {
                C60905o oVar = this.f37621a;
                String str = ((C13310l) oVar.f173503E).f37767d.username;
                if (str == null) {
                    str = "";
                }
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context = oVar.f173499A;
                C87412m.m108593f(context, "holder.context");
                C13442s8 f = aVar.mo12873f(context);
                C61926c.m72656A((String) null, new C13253a(str, f != null ? f.mo12861q3() : null));
            }
        }
    }

    /* renamed from: rs1.h$e */
    public static final class C13254e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f37624d;

        /* renamed from: e */
        public final /* synthetic */ C13248h f37625e;

        public C13254e(C60905o oVar, C13248h hVar) {
            this.f37624d = oVar;
            this.f37625e = hVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00b3  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00b5  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00ce  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00d3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r13) {
            /*
                r12 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r13)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderAccountRecommendListConvert$onCreateViewHolder$2"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r12
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                jq3.o r0 = r12.f37624d
                java.lang.Object r0 = r0.f173503E
                rs1.l r0 = (rs1.C13310l) r0
                com.tencent.mm.protocal.protobuf.FinderContact r1 = r0.f37767d
                java.lang.String r1 = r1.username
                if (r1 != 0) goto L_0x0029
                java.lang.String r1 = ""
            L_0x0029:
                r7 = r1
                fe1.d$b r1 = fe1.C58961d.f168673a
                fe1.q r1 = r1.mo84155b(r7)
                r2 = 0
                r8 = 1
                if (r1 == 0) goto L_0x003e
                int r1 = r1.field_follow_Flag
                com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r3 = fe1.C58969q.f168705a2
                int r3 = fe1.C58969q.f168707c2
                if (r1 != r3) goto L_0x003e
                r9 = 1
                goto L_0x003f
            L_0x003e:
                r9 = 0
            L_0x003f:
                if (r9 == 0) goto L_0x0090
                rs1.h r13 = r12.f37625e
                jq3.o r5 = r12.f37624d
                r13.getClass()
                android.content.Context r3 = r5.f173499A
                qo3.n r1 = r13.f37610f
                if (r1 != 0) goto L_0x0082
                android.content.res.Resources r1 = r3.getResources()
                qo3.n r10 = new qo3.n
                r10.<init>((android.content.Context) r3, (int) r8, (boolean) r8)
                android.content.res.Resources r4 = r3.getResources()
                r6 = 2131826246(0x7f111646, float:1.928537E38)
                java.lang.String r4 = r4.getString(r6)
                r6 = 17
                r10.mo107568m(r4, r6, r2)
                rs1.i r2 = new rs1.i
                r2.<init>(r13, r1)
                r10.f225771i = r2
                rs1.j r11 = new rs1.j
                r1 = r11
                r2 = r13
                r4 = r7
                r6 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                r10.f225782p = r11
                rs1.k r1 = new rs1.k
                r1.<init>(r13)
                r10.f225761d = r1
                r13.f37610f = r10
            L_0x0082:
                qo3.n r13 = r13.f37610f
                if (r13 == 0) goto L_0x00a0
                boolean r1 = r13.mo107563h()
                if (r1 != 0) goto L_0x00a0
                r13.mo107573q()
                goto L_0x00a0
            L_0x0090:
                rs1.h r1 = r12.f37625e
                android.content.Context r13 = r13.getContext()
                java.lang.String r2 = "it.context"
                gy3.C87412m.m108593f(r13, r2)
                r2 = r9 ^ 1
                rs1.C13248h.m12617j(r1, r13, r7, r2)
            L_0x00a0:
                rs1.h r13 = r12.f37625e
                jq3.o r1 = r12.f37624d
                r13.mo12721k(r1, r0)
                org.json.JSONObject r13 = new org.json.JSONObject
                r13.<init>()
                java.lang.String r0 = "finderusername"
                r13.put(r0, r7)
                if (r9 != 0) goto L_0x00b5
                r0 = 1
                goto L_0x00b6
            L_0x00b5:
                r0 = 2
            L_0x00b6:
                java.lang.String r1 = "click_action_type"
                r13.put(r1, r0)
                dp1.f2 r0 = dp1.C7435f2.f25626a
                rs1.s8$a r1 = rs1.C13442s8.f38060Q0
                jq3.o r2 = r12.f37624d
                android.content.Context r2 = r2.f173499A
                java.lang.String r3 = "holder.context"
                gy3.C87412m.m108593f(r2, r3)
                rs1.s8 r1 = r1.mo12873f(r2)
                if (r1 == 0) goto L_0x00d3
                te3.hj1 r1 = r1.mo12861q3()
                goto L_0x00d4
            L_0x00d3:
                r1 = 0
            L_0x00d4:
                java.lang.String r2 = "frifollow_page_follow_button"
                r0.mo8577a(r1, r2, r8, r13)
                java.lang.String r13 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderAccountRecommendListConvert$onCreateViewHolder$2"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r12, r13, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rs1.C13248h.C13254e.onClick(android.view.View):void");
        }
    }

    /* renamed from: j */
    public static final void m12617j(C13248h hVar, Context context, String str, boolean z) {
        int i;
        hVar.getClass();
        C0751m0.m692c(C0751m0.f1769a, ((C13442s8) C39818r.f106831a.mo62443b(context).mo75002a(C13442s8.class)).mo12861q3(), str, z ? 1 : 2, -1, false, 31, (C64414h71) null, 6, 64, (Object) null);
        C58961d.C58963b bVar = C58961d.f168673a;
        if (z) {
            i = C58969q.f168707c2;
        } else {
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C58969q.f168705a2;
            i = 0;
        }
        bVar.mo84161i(str, i);
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.b0s;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x01ef  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r20, jq3.C9493c r21, int r22, int r23, boolean r24, java.util.List r25) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            rs1.l r1 = (rs1.C13310l) r1
            java.lang.Class<pl1.s0> r2 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r0, r4)
            java.lang.String r4 = "item"
            gy3.C87412m.m108594g(r1, r4)
            r4 = 2131310273(0x7f0936c1, float:1.8238853E38)
            android.view.View r4 = r0.mo85812D(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.Class<ny.h> r5 = p629ny.C76979h.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ny.h r5 = (p629ny.C76979h) r5
            android.content.Context r6 = r0.f173499A
            com.tencent.mm.protocal.protobuf.FinderContact r7 = r1.f37767d
            java.lang.String r7 = r7.nickname
            android.text.SpannableString r5 = r5.mo107057T1(r6, r7)
            r4.setText(r5)
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r1.f37767d
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r6 = r5.authInfo
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L_0x0040
            int r6 = r6.authIconType
            if (r6 != 0) goto L_0x0040
            r6 = 1
            goto L_0x0041
        L_0x0040:
            r6 = 0
        L_0x0041:
            r9 = 0
            if (r6 == 0) goto L_0x0065
            te3.cg r5 = fe1.C58960c.m68829a(r5, r8)
            if (r5 == 0) goto L_0x0053
            te3.se r5 = r5.f182473i
            if (r5 == 0) goto L_0x0053
            int r5 = r5.f185417d
            if (r5 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r7 = 0
        L_0x0054:
            if (r7 != 0) goto L_0x0057
            goto L_0x0065
        L_0x0057:
            android.content.Context r5 = r4.getContext()
            r6 = 160(0xa0, float:2.24E-43)
            int r5 = kg3.C76577a.m92151b(r5, r6)
            r4.setMaxWidth(r5)
            goto L_0x0072
        L_0x0065:
            android.content.Context r5 = r4.getContext()
            r6 = 140(0x8c, float:1.96E-43)
            int r5 = kg3.C76577a.m92151b(r5, r6)
            r4.setMaxWidth(r5)
        L_0x0072:
            r4 = 2131305203(0x7f0922f3, float:1.822857E38)
            android.view.View r4 = r0.mo85812D(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 8
            r4.setVisibility(r5)
            r4 = r19
            r4.mo12721k(r0, r1)
            r6 = 2131310266(0x7f0936ba, float:1.823884E38)
            android.view.View r6 = r0.mo85812D(r6)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            java.lang.String r7 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            gy3.C87412m.m108592e(r6, r7)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r6 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r6
            r7 = -1
            r6.f44455k = r7
            r6 = 2131313577(0x7f0943a9, float:1.8245555E38)
            android.view.View r7 = r0.mo85812D(r6)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r7.setVisibility(r8)
            android.view.View r6 = r0.mo85812D(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r7 = r1.f37768e
            r6.setText(r7)
            bl3.r r6 = bl3.C39818r.f106831a
            bl3.r$a r7 = r6.mo62446e(r3)
            bl3.c r7 = r7.mo62447c(r2)
            pl1.s0 r7 = (pl1.C11990s0) r7
            k60.d r7 = r7.mo11872i2()
            pl1.f r10 = new pl1.f
            com.tencent.mm.protocal.protobuf.FinderContact r11 = r1.f37767d
            java.lang.String r11 = r11.headUrl
            up1.y r12 = up1.C27696y.MEDIUM_AVATAR_IMAGE
            r10.<init>(r11, r12)
            r11 = 2131297455(0x7f0904af, float:1.8212855E38)
            android.view.View r11 = r0.mo85812D(r11)
            java.lang.String r12 = "holder.getView(R.id.avatar)"
            gy3.C87412m.m108593f(r11, r12)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            pl1.e0$a r12 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r3 = r6.mo62446e(r3)
            bl3.c r2 = r3.mo62447c(r2)
            pl1.s0 r2 = (pl1.C11990s0) r2
            n60.f r2 = r2.mo11867O2(r12)
            r7.mo85957c(r10, r11, r2)
            er1.w3 r12 = er1.C58784w3.f168295a
            r2 = 2131297406(0x7f09047e, float:1.8212756E38)
            android.view.View r2 = r0.mo85812D(r2)
            java.lang.String r3 = "holder.getView(R.id.auth_icon)"
            gy3.C87412m.m108593f(r2, r3)
            r13 = r2
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r1.f37767d
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r14 = r2.authInfo
            r15 = 0
            te3.cg r16 = fe1.C58960c.m68829a(r2, r8)
            r17 = 4
            r18 = 0
            er1.C58784w3.m68429F1(r12, r13, r14, r15, r16, r17, r18)
            r2 = 2131302330(0x7f0917ba, float:1.8222743E38)
            android.view.View r2 = r0.mo85812D(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r3 = 2131310483(0x7f093793, float:1.823928E38)
            android.view.View r3 = r0.mo85812D(r3)
            java.util.List<com.tencent.mm.protocal.protobuf.FinderObject> r6 = r1.f37769f
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x016a
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r6.mo10233c(r7)
            java.lang.Object[] r11 = r6.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderAccountRecommendListConvert"
            java.lang.String r13 = "onBindViewHolder"
            java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderAccountRecommendListItem;IIZLjava/util/List;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r3
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r6 = r6.mo10231a(r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r3.setVisibility(r6)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderAccountRecommendListConvert"
            java.lang.String r12 = "onBindViewHolder"
            java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderAccountRecommendListItem;IIZLjava/util/List;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            r2.setVisibility(r5)
            goto L_0x01d0
        L_0x016a:
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.mo10233c(r5)
            java.lang.Object[] r11 = r6.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderAccountRecommendListConvert"
            java.lang.String r13 = "onBindViewHolder"
            java.lang.String r14 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderAccountRecommendListItem;IIZLjava/util/List;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r3
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r5 = r6.mo10231a(r8)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderAccountRecommendListConvert"
            java.lang.String r12 = "onBindViewHolder"
            java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderAccountRecommendListItem;IIZLjava/util/List;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            r2.setVisibility(r8)
            androidx.recyclerview.widget.RecyclerView$e r2 = r2.getAdapter()
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListConvert.RvAdapter"
            gy3.C87412m.m108592e(r2, r3)
            rs1.h$a r2 = (rs1.C13248h.C13249a) r2
            java.util.List<com.tencent.mm.protocal.protobuf.FinderObject> r3 = r1.f37769f
            java.lang.String r5 = "objects"
            gy3.C87412m.m108594g(r3, r5)
            java.util.List<com.tencent.mm.protocal.protobuf.FinderObject> r5 = r2.f37612e
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.clear()
            java.util.List<com.tencent.mm.protocal.protobuf.FinderObject> r5 = r2.f37612e
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.addAll(r3)
            r2.notifyDataSetChanged()
        L_0x01d0:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r1.f37767d
            java.lang.String r1 = r1.nickname
            java.lang.String r3 = "finder_nickname"
            r2.put(r3, r1)
            dp1.f2 r1 = dp1.C7435f2.f25626a
            rs1.s8$a r3 = rs1.C13442s8.f38060Q0
            android.content.Context r0 = r0.f173499A
            java.lang.String r5 = "holder.context"
            gy3.C87412m.m108593f(r0, r5)
            rs1.s8 r0 = r3.mo12873f(r0)
            if (r0 == 0) goto L_0x01f3
            te3.hj1 r9 = r0.mo12861q3()
        L_0x01f3:
            java.lang.String r0 = "channel_profile_otherfrdfollow_authorcard"
            r1.mo8577a(r9, r0, r8, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13248h.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        View D = oVar.mo85812D(C0966R.C0970id.hft);
        C87412m.m108593f(D, "holder.getView<TextView>(R.id.nickname)");
        C7919x.m8091a((TextView) D);
        RecyclerView recyclerView2 = (RecyclerView) oVar.mo85812D(C0966R.C0970id.iyc);
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        int dimensionPixelSize = recyclerView2.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3723cd);
        int dimensionPixelSize2 = recyclerView2.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
        int dimensionPixelSize3 = recyclerView2.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
        Context context = recyclerView2.getContext();
        C87412m.m108593f(context, "innerRv.context");
        recyclerView2.setAdapter(new C13249a(this, context, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3));
        recyclerView2.mo17085h0(new C13250b(this, dimensionPixelSize, dimensionPixelSize2));
        View D2 = oVar.mo85812D(C0966R.C0970id.ec9);
        C87412m.m108593f(D2, "holder.getView<View>(R.id.follow_layout)");
        C23564m.m28138h(D2, new C13252d(oVar));
        oVar.mo85812D(C0966R.C0970id.ec9).setOnClickListener(new C13254e(oVar, this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x006b  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12721k(jq3.C60905o r6, rs1.C13310l r7) {
        /*
            r5 = this;
            r0 = 2131305077(0x7f092275, float:1.8228315E38)
            android.view.View r0 = r6.mo85812D(r0)
            r1 = 2131305100(0x7f09228c, float:1.8228361E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 2131305076(0x7f092274, float:1.8228313E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            com.tencent.mm.protocal.protobuf.FinderContact r7 = r7.f37767d
            java.lang.String r7 = r7.username
            if (r7 != 0) goto L_0x0021
            java.lang.String r7 = ""
        L_0x0021:
            fe1.d$b r3 = fe1.C58961d.f168673a
            fe1.q r7 = r3.mo84155b(r7)
            r3 = 0
            if (r7 == 0) goto L_0x0034
            int r7 = r7.field_follow_Flag
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r4 = fe1.C58969q.f168705a2
            int r4 = fe1.C58969q.f168707c2
            if (r7 != r4) goto L_0x0034
            r7 = 1
            goto L_0x0035
        L_0x0034:
            r7 = 0
        L_0x0035:
            if (r7 != 0) goto L_0x006b
            r7 = 8
            r2.setVisibility(r7)
            android.content.Context r7 = r6.f173499A
            android.content.res.Resources r7 = r7.getResources()
            r2 = 2131099757(0x7f06006d, float:1.7811876E38)
            int r7 = r7.getColor(r2)
            r0.setBackgroundColor(r7)
            android.content.Context r7 = r0.getContext()
            r0 = 2131826668(0x7f1117ec, float:1.9286227E38)
            java.lang.String r7 = r7.getString(r0)
            r1.setText(r7)
            android.content.Context r6 = r6.f173499A
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131101833(0x7f060889, float:1.7816087E38)
            int r6 = r6.getColor(r7)
            r1.setTextColor(r6)
            goto L_0x009c
        L_0x006b:
            r2.setVisibility(r3)
            android.content.Context r7 = r6.f173499A
            android.content.res.Resources r7 = r7.getResources()
            r2 = 2131100977(0x7f060531, float:1.781435E38)
            int r7 = r7.getColor(r2)
            android.content.Context r6 = r6.f173499A
            android.content.res.Resources r6 = r6.getResources()
            r2 = 2131099682(0x7f060022, float:1.7811724E38)
            int r6 = r6.getColor(r2)
            r0.setBackgroundColor(r7)
            android.content.Context r7 = r0.getContext()
            r0 = 2131826692(0x7f111804, float:1.9286276E38)
            java.lang.String r7 = r7.getString(r0)
            r1.setText(r7)
            r1.setTextColor(r6)
        L_0x009c:
            java.lang.String r6 = "tv"
            gy3.C87412m.m108593f(r1, r6)
            er1.C7919x.m8091a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13248h.mo12721k(jq3.o, rs1.l):void");
    }
}
