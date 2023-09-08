package ve1;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;
import com.tencent.p014mm.plugin.finder.view.FinderPostProgressView;
import com.tencent.p014mm.plugin.sns.p106ui.view.ImageIndicatorView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import dp1.C58417y0;
import er1.C58684b;
import er1.C7878t0;
import fe1.C58960c;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import p565ir.C60606n;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import te3.C64273c21;
import te3.C64284cg;

/* renamed from: ve1.v7 */
public final class C14663v7 extends RecyclerView.C16631z {

    /* renamed from: A */
    public View f40549A;

    /* renamed from: B */
    public ImageView f40550B;

    /* renamed from: C */
    public WeImageView f40551C;

    /* renamed from: D */
    public ImageIndicatorView f40552D;

    /* renamed from: E */
    public FinderLiveOnliveWidget f40553E;

    /* renamed from: F */
    public FinderLiveOnliveWidget f40554F;

    /* renamed from: G */
    public ImageView f40555G;

    /* renamed from: H */
    public TextView f40556H;

    /* renamed from: I */
    public View f40557I;

    /* renamed from: J */
    public FinderPostProgressView f40558J;

    /* renamed from: K */
    public View f40559K;

    /* renamed from: L */
    public View f40560L;

    /* renamed from: M */
    public View f40561M;

    /* renamed from: N */
    public TextView f40562N;

    /* renamed from: P */
    public TextView f40563P;

    /* renamed from: Q */
    public View f40564Q;

    /* renamed from: Q0 */
    public final long f40565Q0;

    /* renamed from: R */
    public ValueAnimator f40566R;

    /* renamed from: R0 */
    public final long f40567R0;

    /* renamed from: S */
    public View f40568S;

    /* renamed from: T */
    public View f40569T;

    /* renamed from: U */
    public ImageView f40570U;

    /* renamed from: V */
    public TextView f40571V;

    /* renamed from: W */
    public View f40572W;

    /* renamed from: X */
    public ImageView f40573X;

    /* renamed from: Y */
    public final C13601g f40574Y = C36568h.m40985a(C14668e.f40588d);

    /* renamed from: Z */
    public final long f40575Z;

    /* renamed from: p0 */
    public final long f40576p0;

    /* renamed from: x0 */
    public final long f40577x0;

    /* renamed from: y0 */
    public final long f40578y0;

    /* renamed from: z */
    public final String f40579z = "Finder.FinderProfileUIMediaViewHolder";

    /* renamed from: ve1.v7$a */
    public static final class C14664a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58969q f40580d;

        /* renamed from: e */
        public final /* synthetic */ C14663v7 f40581e;

        /* renamed from: f */
        public final /* synthetic */ BaseFinderFeed f40582f;

        public C14664a(C58969q qVar, C14663v7 v7Var, BaseFinderFeed baseFinderFeed) {
            this.f40580d = qVar;
            this.f40581e = v7Var;
            this.f40582f = baseFinderFeed;
        }

        public final void onClick(View view) {
            C13598b0 b0Var;
            C64284cg b;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder$bindMedia$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58969q qVar = this.f40580d;
            String str = null;
            if (qVar == null || (b = C58960c.m68830b(qVar, false)) == null) {
                b0Var = null;
            } else {
                C14663v7 v7Var = this.f40581e;
                Intent intent = new Intent();
                String str2 = b.f182468d;
                if (str2 == null) {
                    str2 = "";
                }
                intent.putExtra("Contact_User", str2);
                intent.putExtra("Contact_Scene", 213);
                intent.putExtra("biz_profile_enter_from_finder", true);
                intent.putExtra("force_get_contact", true);
                intent.putExtra("key_use_new_contact_profile", true);
                intent.putExtra("biz_profile_tab_type", 1);
                C88144b.m109791i(v7Var.f44854d.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                C14663v7 v7Var2 = this.f40581e;
                C58969q qVar2 = this.f40580d;
                BaseFinderFeed baseFinderFeed = this.f40582f;
                Intent intent2 = new Intent();
                intent2.putExtra("finder_username", qVar2 != null ? qVar2.getUsername() : null);
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context = v7Var2.f44854d.getContext();
                C87412m.m108593f(context, "itemView.context");
                C13442s8.C13443a.m12791e(aVar, context, intent2, baseFinderFeed.getItemId(), (String) null, 0, 6, false, 0, 192, (Object) null);
                Context context2 = v7Var2.f44854d.getContext();
                C87412m.m108593f(context2, "itemView.context");
                ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context2, intent2);
            }
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
            long itemId = this.f40582f.getItemId();
            C58969q qVar3 = this.f40580d;
            if (qVar3 != null) {
                str = qVar3.getUsername();
            }
            y0Var.yx0(4, itemId, 6, 1, str);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder$bindMedia$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.v7$b */
    public static final class C14665b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Integer, C13598b0> f40583d;

        /* renamed from: e */
        public final /* synthetic */ int f40584e;

        public C14665b(C32226l<? super Integer, C13598b0> lVar, int i) {
            this.f40583d = lVar;
            this.f40584e = i;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder$bindMedia$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f40583d.invoke(Integer.valueOf(this.f40584e));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder$bindMedia$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.v7$c */
    public static final class C14666c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C14663v7 f40585d;

        public C14666c(C14663v7 v7Var) {
            this.f40585d = v7Var;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FinderPostProgressView finderPostProgressView = this.f40585d.f40558J;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            finderPostProgressView.setProgress(((Integer) animatedValue).intValue());
            this.f40585d.f40558J.invalidate();
        }
    }

    /* renamed from: ve1.v7$d */
    public static final class C14667d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C14663v7 f40586d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f40587e;

        public C14667d(C14663v7 v7Var, ImageView imageView) {
            this.f40586d = v7Var;
            this.f40587e = imageView;
        }

        public final void run() {
            TextView textView = this.f40586d.f40563P;
            if (textView != null) {
                ImageView imageView = this.f40587e;
                if (imageView.getRight() > textView.getLeft()) {
                    imageView.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: ve1.v7$e */
    public static final class C14668e extends C87413o implements C32224a<Point> {

        /* renamed from: d */
        public static final C14668e f40588d = new C14668e();

        public C14668e() {
            super(0);
        }

        public Object invoke() {
            return C75044y4.m89990b(MMApplicationContext.getContext());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14663v7(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
        this.f40549A = view.findViewById(C0966R.C0970id.e3_);
        View findViewById = view.findViewById(C0966R.C0970id.e5s);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.…inder_profile_item_image)");
        this.f40550B = (ImageView) findViewById;
        View findViewById2 = view.findViewById(C0966R.C0970id.f4i);
        C87412m.m108593f(findViewById2, "itemView.findViewById(R.id.image_indicator)");
        this.f40552D = (ImageIndicatorView) findViewById2;
        View findViewById3 = view.findViewById(C0966R.C0970id.dv9);
        C87412m.m108593f(findViewById3, "itemView.findViewById(R.…inder_live_onlive_widget)");
        this.f40553E = (FinderLiveOnliveWidget) findViewById3;
        View findViewById4 = view.findViewById(C0966R.C0970id.dr9);
        C87412m.m108593f(findViewById4, "itemView.findViewById<Fi…id.finder_live_mask_view)");
        this.f40554F = (FinderLiveOnliveWidget) findViewById4;
        this.f40551C = (WeImageView) view.findViewById(C0966R.C0970id.i5c);
        View findViewById5 = view.findViewById(C0966R.C0970id.i5_);
        C87412m.m108593f(findViewById5, "itemView.findViewById(R.id.profile_item_desc_tv)");
        this.f40556H = (TextView) findViewById5;
        View findViewById6 = view.findViewById(C0966R.C0970id.i7_);
        C87412m.m108593f(findViewById6, "itemView.findViewById(R.….profile_upload_progress)");
        this.f40558J = (FinderPostProgressView) findViewById6;
        View findViewById7 = view.findViewById(C0966R.C0970id.i79);
        C87412m.m108593f(findViewById7, "itemView.findViewById(R.id.profile_upload_area)");
        this.f40559K = findViewById7;
        View findViewById8 = view.findViewById(C0966R.C0970id.i5a);
        C87412m.m108593f(findViewById8, "itemView.findViewById(R.…profile_item_failed_area)");
        this.f40560L = findViewById8;
        View findViewById9 = view.findViewById(C0966R.C0970id.i5e);
        C87412m.m108593f(findViewById9, "itemView.findViewById(R.id.profile_like_area)");
        this.f40561M = findViewById9;
        View findViewById10 = view.findViewById(C0966R.C0970id.i5f);
        C87412m.m108593f(findViewById10, "itemView.findViewById(R.id.profile_like_count_tv)");
        this.f40562N = (TextView) findViewById10;
        View findViewById11 = view.findViewById(C0966R.C0970id.e5u);
        C87412m.m108593f(findViewById11, "itemView.findViewById(R.…_profile_item_reprint_iv)");
        this.f40555G = (ImageView) findViewById11;
        View findViewById12 = view.findViewById(C0966R.C0970id.ij_);
        C87412m.m108593f(findViewById12, "itemView.findViewById(R.id.ref_deleted_tips)");
        this.f40557I = findViewById12;
        View findViewById13 = view.findViewById(C0966R.C0970id.hqn);
        C87412m.m108593f(findViewById13, "itemView.findViewById(R.id.padding_view)");
        this.f40564Q = findViewById13;
        this.f40563P = (TextView) view.findViewById(C0966R.C0970id.kky);
        View findViewById14 = view.findViewById(C0966R.C0970id.a2_);
        C87412m.m108593f(findViewById14, "itemView.findViewById(R.id.avatar_layout)");
        this.f40568S = findViewById14;
        this.f40569T = view.findViewById(C0966R.C0970id.aqb);
        View findViewById15 = view.findViewById(C0966R.C0970id.a27);
        C87412m.m108593f(findViewById15, "itemView.findViewById(R.id.avatar_iv)");
        this.f40570U = (ImageView) findViewById15;
        View findViewById16 = view.findViewById(C0966R.C0970id.hg4);
        C87412m.m108593f(findViewById16, "itemView.findViewById(R.id.nickname_tv)");
        this.f40571V = (TextView) findViewById16;
        this.f40572W = view.findViewById(C0966R.C0970id.f358960i31);
        this.f40573X = (ImageView) view.findViewById(C0966R.C0970id.i56);
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.e5t);
        this.f40575Z = 60000;
        long j = ((long) 60) * 60000;
        this.f40576p0 = j;
        long j2 = ((long) 24) * j;
        this.f40577x0 = j2;
        this.f40578y0 = ((long) 7) * j2;
        this.f40565Q0 = ((long) 30) * j2;
        this.f40567R0 = ((long) 365) * j2;
    }

    /* renamed from: B */
    public final String mo13855B(Context context, long j) {
        C87412m.m108594g(context, "context");
        if (j < 3600000) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        long j2 = (long) 10;
        long j3 = this.f40575Z;
        if (currentTimeMillis < j2 * j3) {
            String string = context.getString(C0966R.string.loh);
            C87412m.m108593f(string, "context.getString(R.stri…rch_time_format_just_now)");
            return string;
        }
        long j4 = j2 * j3;
        long j5 = this.f40576p0;
        if (currentTimeMillis < j5 && j4 <= currentTimeMillis) {
            String string2 = context.getString(C0966R.string.loi, new Object[]{Long.valueOf(currentTimeMillis / j3)});
            C87412m.m108593f(string2, "context.getString(R.stri…nute, diffMills / MINUTE)");
            return string2;
        }
        long j6 = this.f40577x0;
        if (currentTimeMillis < j6 && j5 <= currentTimeMillis) {
            String string3 = context.getString(C0966R.string.log, new Object[]{Long.valueOf(currentTimeMillis / j5)});
            C87412m.m108593f(string3, "context.getString(R.stri…t_hour, diffMills / HOUR)");
            return string3;
        }
        long j7 = this.f40578y0;
        if (currentTimeMillis < j7 && j6 <= currentTimeMillis) {
            long j8 = currentTimeMillis / j6;
            String string4 = j8 == 1 ? context.getString(C0966R.string.lol) : context.getString(C0966R.string.lof, new Object[]{Long.valueOf(j8)});
            C87412m.m108593f(string4, "{\n                val di…          }\n            }");
            return string4;
        }
        long j9 = this.f40565Q0;
        if (currentTimeMillis < j9 && j7 <= currentTimeMillis) {
            String string5 = context.getString(C0966R.string.lok, new Object[]{Long.valueOf(currentTimeMillis / j7)});
            C87412m.m108593f(string5, "context.getString(R.stri…t_week, diffMills / WEEK)");
            return string5;
        }
        if (!(currentTimeMillis < this.f40567R0 && j9 <= currentTimeMillis)) {
            return "";
        }
        String string6 = context.getString(C0966R.string.loj, new Object[]{Long.valueOf(currentTimeMillis / j9)});
        C87412m.m108593f(string6, "context.getString(R.stri…month, diffMills / MONTH)");
        return string6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13856C(com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r5) {
        /*
            r4 = this;
            fe1.q r5 = r5.mo3507l()
            r0 = 0
            if (r5 == 0) goto L_0x000a
            java.lang.String r5 = r5.field_username
            goto L_0x000b
        L_0x000a:
            r5 = r0
        L_0x000b:
            zc1.b r1 = zc1.C66785b.f191882e
            java.lang.String r1 = r1.mo90662O5()
            r2 = 2
            r3 = 0
            boolean r5 = z04.C112551y.m153810j(r5, r1, r3, r2, r0)
            if (r5 == 0) goto L_0x0032
            android.view.View r5 = r4.f44854d
            r1 = 2131311385(0x7f093b19, float:1.8241109E38)
            java.lang.Object r5 = r5.getTag(r1)
            boolean r1 = r5 instanceof java.lang.Boolean
            if (r1 == 0) goto L_0x0029
            r0 = r5
            java.lang.Boolean r0 = (java.lang.Boolean) r0
        L_0x0029:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r5 = gy3.C87412m.m108589b(r0, r5)
            if (r5 == 0) goto L_0x0032
            r3 = 1
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14663v7.mo13856C(com.tencent.mm.plugin.finder.model.BaseFinderFeed):boolean");
    }

    /* renamed from: y */
    public final void mo13857y(BaseFinderFeed baseFinderFeed) {
        Class cls = C60606n.class;
        C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
        if (liveInfo != null && liveInfo.f182394f == 1) {
            this.f40553E.setVisibility(0);
            ((C60606n) C86312j.m106911c(cls)).Ej0(this.f40553E, false, ((C60606n) C86312j.m106911c(cls)).mo85008I1(baseFinderFeed.mo3513o().getLiveInfo()) ? 2 : 0);
            this.f40554F.setVisibility(8);
            WeImageView weImageView = this.f40551C;
            if (weImageView != null) {
                weImageView.setVisibility(8);
            }
            C64273c21 liveInfo2 = baseFinderFeed.mo3513o().getLiveInfo();
            int i = liveInfo2 != null ? liveInfo2.f182403q : 0;
            if (i > 0) {
                this.f40562N.setText(this.f44854d.getContext().getString(C0966R.string.dvm, new Object[]{C7878t0.m8034c(2, i)}));
            } else {
                this.f40562N.setVisibility(8);
                View view = this.f40561M;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder", "bindLive", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder", "bindLive", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            this.f40553E.setVisibility(8);
            this.f40554F.setVisibility(0);
        }
        this.f40556H.setVisibility(8);
    }

    /* JADX WARNING: type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x05a3  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x05f9  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x063d  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x064c  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0659  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x067d  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x068a  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0698  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x06ab  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x06cb  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x06fd  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x07d3  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x07ee  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x07f4  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0845  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0852  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0909  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0b18  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0c41  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0d48  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0d4f  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0db7  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0dbe  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0dd1  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0dd8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x044e  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13858z(com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r40, int r41, boolean r42, boolean r43, fy3.C32226l<? super java.lang.Integer, rx3.C13598b0> r44) {
        /*
            r39 = this;
            r0 = r39
            r1 = r40
            r2 = r44
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            up1.y r6 = up1.C27696y.THUMB_IMAGE
            up1.y r13 = up1.C27696y.RAW_IMAGE
            pl1.e0$a r14 = pl1.C11978e0.C11979a.COMMON
            java.lang.Class<pl1.s0> r15 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r12 = ht1.C60200t1.class
            java.lang.String r4 = "feed"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "itemClickListener"
            gy3.C87412m.m108594g(r2, r4)
            android.widget.TextView r4 = r0.f40556H
            r11 = 2
            if (r4 != 0) goto L_0x0022
            goto L_0x0025
        L_0x0022:
            r4.setMaxLines(r11)
        L_0x0025:
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r40.mo3513o()
            java.lang.String r4 = r4.getDescription()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            java.lang.String r16 = ""
            if (r4 == 0) goto L_0x0038
            r10 = r16
            goto L_0x0041
        L_0x0038:
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r40.mo3513o()
            android.text.SpannableString r4 = r4.getDescriptionSpan()
            r10 = r4
        L_0x0041:
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r0.f40551C
            r9 = 0
            if (r4 != 0) goto L_0x0047
            goto L_0x004a
        L_0x0047:
            r4.setVisibility(r9)
        L_0x004a:
            android.widget.TextView r4 = r0.f40562N
            r4.setVisibility(r9)
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r40.mo3513o()
            java.util.LinkedList r4 = r4.getMediaList()
            boolean r4 = r4.isEmpty()
            r8 = 8
            if (r4 == 0) goto L_0x0130
            java.lang.String r2 = r0.f40579z
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "invalid item id "
            r3.append(r4)
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r40.mo3513o()
            long r4 = r4.getId()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r40.mo3513o()
            java.lang.String r2 = r2.getDescription()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0096
            android.widget.TextView r2 = r0.f40556H
            r2.setVisibility(r9)
            android.widget.TextView r2 = r0.f40556H
            r2.setText(r10)
            goto L_0x009b
        L_0x0096:
            android.widget.TextView r2 = r0.f40556H
            r2.setVisibility(r8)
        L_0x009b:
            android.view.View r2 = r0.f40560L
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r3.mo10233c(r4)
            java.lang.Object[] r11 = r3.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r13 = "bindMedia"
            java.lang.String r14 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r10 = r2
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r3 = r3.mo10231a(r9)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r11 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r12 = "bindMedia"
            java.lang.String r13 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            android.view.View r2 = r0.f40559K
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r3.mo10233c(r4)
            java.lang.Object[] r18 = r3.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r20 = "bindMedia"
            java.lang.String r21 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r2
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r3 = r3.mo10231a(r9)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r19 = "bindMedia"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            android.widget.TextView r2 = r0.f40562N
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r40.mo3513o()
            int r1 = r1.getLikeCount()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.setText(r1)
            return
        L_0x0130:
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r40.mo3513o()
            boolean r4 = r4.isLiveFeed()
            if (r4 == 0) goto L_0x0149
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r40.mo3513o()
            java.util.LinkedList r4 = r4.getLiveMediaList()
            java.lang.Object r4 = sx3.C110818d0.m150914L(r4)
            te3.rq2 r4 = (te3.C64689rq2) r4
            goto L_0x0157
        L_0x0149:
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r40.mo3513o()
            java.util.LinkedList r4 = r4.getMediaList()
            java.lang.Object r4 = sx3.C110818d0.m150914L(r4)
            te3.rq2 r4 = (te3.C64689rq2) r4
        L_0x0157:
            r7 = r4
            android.widget.ImageView r4 = r0.f40550B
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            rx3.g r5 = r0.f40574Y
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            android.graphics.Point r5 = (android.graphics.Point) r5
            int r5 = r5.x
            rx3.g r9 = r0.f40574Y
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            android.graphics.Point r9 = (android.graphics.Point) r9
            int r9 = r9.y
            if (r9 < r5) goto L_0x0179
            goto L_0x018e
        L_0x0179:
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r5 = r5.getResources()
            gy3.C87412m.m108591d(r5)
            r8 = 2131165346(0x7f0700a2, float:1.7944907E38)
            float r5 = r5.getDimension(r8)
            int r5 = (int) r5
            int r5 = r9 - r5
        L_0x018e:
            int r5 = r5 / r11
            er1.w3 r9 = er1.C58784w3.f168295a
            int r8 = r9.mo83921d(r1, r7, r5)
            java.lang.String r11 = "onBindViewHolder "
            if (r8 <= 0) goto L_0x01f5
            r4.height = r8
            r19 = r9
            java.lang.String r9 = r0.f40579z
            r20 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            int r11 = r39.mo17363j()
            r10.append(r11)
            java.lang.String r11 = " lpWidth:"
            r10.append(r11)
            int r11 = r4.width
            r10.append(r11)
            java.lang.String r11 = ", lpHeight:"
            r10.append(r11)
            int r11 = r4.height
            r10.append(r11)
            java.lang.String r11 = ", width:"
            r10.append(r11)
            r10.append(r5)
            java.lang.String r5 = ", height:"
            r10.append(r5)
            r10.append(r8)
            java.lang.String r5 = ", mediaWidth:"
            r10.append(r5)
            float r5 = r7.f185270h
            r10.append(r5)
            java.lang.String r5 = ", mediaHeight:"
            r10.append(r5)
            float r5 = r7.f185271i
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r5)
            android.widget.ImageView r5 = r0.f40550B
            r5.setLayoutParams(r4)
            goto L_0x0237
        L_0x01f5:
            r19 = r9
            r20 = r10
            java.lang.String r4 = r0.f40579z
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r11)
            int r9 = r39.mo17363j()
            r8.append(r9)
            java.lang.String r9 = " width invalid:"
            r8.append(r9)
            r8.append(r5)
            java.lang.String r5 = ", "
            r8.append(r5)
            android.widget.ImageView r9 = r0.f40550B
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            int r9 = r9.width
            r8.append(r9)
            r8.append(r5)
            android.widget.ImageView r5 = r0.f40550B
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            int r5 = r5.height
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
        L_0x0237:
            android.view.View r4 = r0.f40557I
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r8 = 8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r5.mo10233c(r9)
            java.lang.Object[] r22 = r5.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r24 = "bindMedia"
            java.lang.String r25 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r4
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            r9 = 0
            java.lang.Object r5 = r5.mo10231a(r9)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r22 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r23 = "bindMedia"
            java.lang.String r24 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
            r11 = 4
            r10 = 1
            if (r42 == 0) goto L_0x0445
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r40.mo3513o()
            long r4 = r4.getRefObjectFlag()
            r21 = 2
            int r9 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            if (r9 != 0) goto L_0x02dc
            android.widget.ImageView r4 = r0.f40550B
            r5 = 2131099659(0x7f06000b, float:1.7811677E38)
            r4.setImageResource(r5)
            android.view.View r4 = r0.f40557I
            k20.a r5 = new k20.a
            r5.<init>()
            r6 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r5.mo10233c(r9)
            java.lang.Object[] r22 = r5.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r24 = "bindMedia"
            java.lang.String r25 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r4
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            r9 = 0
            java.lang.Object r5 = r5.mo10231a(r9)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r22 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r23 = "bindMedia"
            java.lang.String r24 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0445
        L_0x02dc:
            r9 = 0
            int r4 = r7.f185268f
            if (r4 != r11) goto L_0x0369
            java.lang.String r4 = r7.f185283w
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x032e
            pl1.b0 r5 = new pl1.b0
            r17 = 0
            r21 = 0
            r22 = 12
            r23 = 0
            r4 = r5
            r11 = r5
            r5 = r7
            r42 = r7
            r7 = r17
            r8 = r21
            r30 = r19
            r17 = 0
            r9 = r22
            r2 = 1
            r10 = r23
            r4.<init>(r5, r6, r7, r8, r9, r10)
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r5 = r4.mo62446e(r12)
            bl3.c r5 = r5.mo62447c(r15)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11871f2()
            android.widget.ImageView r6 = r0.f40550B
            bl3.r$a r4 = r4.mo62446e(r12)
            bl3.c r4 = r4.mo62447c(r15)
            pl1.s0 r4 = (pl1.C11990s0) r4
            n60.f r4 = r4.mo11867O2(r14)
            r5.mo85957c(r11, r6, r4)
            r2 = r12
            goto L_0x044c
        L_0x032e:
            r42 = r7
            r30 = r19
            r2 = 1
            r17 = 0
            pl1.o0 r4 = new pl1.o0
            r10 = 0
            r11 = 4
            r5 = 0
            r7 = r4
            r8 = r42
            r9 = r13
            r6 = 4
            r2 = r12
            r12 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            bl3.r r5 = bl3.C39818r.f106831a
            bl3.r$a r7 = r5.mo62446e(r2)
            bl3.c r7 = r7.mo62447c(r15)
            pl1.s0 r7 = (pl1.C11990s0) r7
            k60.d r7 = r7.mo11871f2()
            android.widget.ImageView r8 = r0.f40550B
            bl3.r$a r5 = r5.mo62446e(r2)
            bl3.c r5 = r5.mo62447c(r15)
            pl1.s0 r5 = (pl1.C11990s0) r5
            n60.f r5 = r5.mo11867O2(r14)
            r7.mo85957c(r4, r8, r5)
            goto L_0x044c
        L_0x0369:
            r42 = r7
            r2 = r12
            r30 = r19
            r17 = 0
            r5 = 9
            if (r4 != r5) goto L_0x0405
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r12 = r42
            java.lang.String r5 = r12.f185283w
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r4.append(r5)
            java.lang.String r5 = r12.f185234A
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x03ae
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r12.f185267e
            r4.append(r5)
            java.lang.String r5 = r12.f185288z
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L_0x03ae:
            r7 = r4
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r40.mo3513o()
            te3.c21 r4 = r4.getLiveInfo()
            if (r4 == 0) goto L_0x03c0
            int r4 = r4.f182394f
            r5 = 1
            if (r4 != r5) goto L_0x03c0
            r9 = 1
            goto L_0x03c1
        L_0x03c0:
            r9 = 0
        L_0x03c1:
            if (r9 == 0) goto L_0x03ec
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r5 = r4.mo62446e(r2)
            bl3.c r5 = r5.mo62447c(r15)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11871f2()
            pl1.n0 r6 = new pl1.n0
            r6.<init>(r7, r13)
            android.widget.ImageView r7 = r0.f40550B
            bl3.r$a r4 = r4.mo62446e(r2)
            bl3.c r4 = r4.mo62447c(r15)
            pl1.s0 r4 = (pl1.C11990s0) r4
            n60.f r4 = r4.mo11867O2(r14)
            r5.mo85957c(r6, r7, r4)
            goto L_0x0402
        L_0x03ec:
            java.lang.Class<tf0.q1> r4 = tf0.C13887q1.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            java.lang.String r5 = "getService(IFinderCommonLiveService::class.java)"
            gy3.C87412m.m108593f(r4, r5)
            r5 = r4
            tf0.q1 r5 = (tf0.C13887q1) r5
            android.widget.ImageView r6 = r0.f40550B
            r8 = 0
            r9 = 4
            r10 = 0
            tf0.C13887q1.C13888a.m13309e(r5, r6, r7, r8, r9, r10)
        L_0x0402:
            r42 = r12
            goto L_0x044c
        L_0x0405:
            r12 = r42
            bl3.r r10 = bl3.C39818r.f106831a
            bl3.r$a r4 = r10.mo62446e(r2)
            bl3.c r4 = r4.mo62447c(r15)
            pl1.s0 r4 = (pl1.C11990s0) r4
            k60.d r9 = r4.mo11871f2()
            pl1.b0 r8 = new pl1.b0
            r7 = 0
            r18 = 0
            r19 = 12
            r21 = 0
            r4 = r8
            r5 = r12
            r11 = r8
            r8 = r18
            r32 = r9
            r9 = r19
            r12 = r10
            r10 = r21
            r4.<init>(r5, r6, r7, r8, r9, r10)
            android.widget.ImageView r4 = r0.f40550B
            bl3.r$a r5 = r12.mo62446e(r2)
            bl3.c r5 = r5.mo62447c(r15)
            pl1.s0 r5 = (pl1.C11990s0) r5
            n60.f r5 = r5.mo11867O2(r14)
            r6 = r32
            r6.mo85957c(r11, r4, r5)
            goto L_0x044c
        L_0x0445:
            r42 = r7
            r2 = r12
            r30 = r19
            r17 = 0
        L_0x044c:
            if (r43 == 0) goto L_0x05a3
            android.view.View r12 = r0.f40568S
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r11.mo10233c(r5)
            java.lang.Object[] r6 = r11.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r8 = "bindMedia"
            java.lang.String r9 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r5 = r12
            r4 = r11
            r11 = r18
            r18 = r14
            r14 = r12
            r12 = r19
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            r12 = 0
            java.lang.Object r4 = r4.mo10231a(r12)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r14.setVisibility(r4)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r7 = "bindMedia"
            java.lang.String r8 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r5 = r14
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r40.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.contact
            if (r4 == 0) goto L_0x04ac
            r5 = 3
            r6 = 0
            fe1.q r4 = fe1.C58960c.m68834f(r4, r6, r12, r5, r6)
            r6 = r4
            goto L_0x04ad
        L_0x04ac:
            r6 = 0
        L_0x04ad:
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r5 = r4.mo62446e(r2)
            bl3.c r5 = r5.mo62447c(r15)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11872i2()
            pl1.f r7 = new pl1.f
            if (r6 == 0) goto L_0x04c6
            java.lang.String r8 = r6.getAvatarUrl()
            goto L_0x04c8
        L_0x04c6:
            r8 = r16
        L_0x04c8:
            up1.y r9 = up1.C27696y.SMALL_AVATAR_IMAGE
            r7.<init>(r8, r9)
            android.widget.ImageView r8 = r0.f40570U
            pl1.e0$a r9 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r4 = r4.mo62446e(r2)
            bl3.c r4 = r4.mo62447c(r15)
            pl1.s0 r4 = (pl1.C11990s0) r4
            n60.f r4 = r4.mo11867O2(r9)
            r5.mo85957c(r7, r8, r4)
            android.widget.TextView r4 = r0.f40571V
            di3.d r5 = di3.C86312j.m106911c(r3)
            ny.h r5 = (p629ny.C76979h) r5
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            hp1.w0 r8 = hp1.C8703w0.f27927a
            if (r6 == 0) goto L_0x04f7
            java.lang.String r9 = r6.getNickname()
            goto L_0x04f9
        L_0x04f7:
            r9 = r16
        L_0x04f9:
            r10 = 2
            r11 = 0
            android.text.Spanned r8 = hp1.C8703w0.m8539d(r8, r9, r11, r10, r11)
            android.widget.TextView r9 = r0.f40571V
            float r9 = r9.getTextSize()
            android.text.SpannableString r5 = r5.Te0(r7, r8, r9)
            r4.setText(r5)
            android.view.View r4 = r0.f44854d
            android.content.Context r4 = r4.getContext()
            java.lang.String r5 = "itemView.context"
            gy3.C87412m.m108593f(r4, r5)
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r40.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.getFeedObject()
            int r5 = r5.createtime
            long r7 = (long) r5
            r21 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r21
            java.lang.String r4 = r0.mo13855B(r4, r7)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x0557
            android.widget.TextView r4 = r0.f40563P
            r5 = 8
            if (r4 != 0) goto L_0x0537
            goto L_0x053a
        L_0x0537:
            r4.setVisibility(r5)
        L_0x053a:
            android.view.View r4 = r0.f40569T
            if (r4 != 0) goto L_0x053f
            goto L_0x0596
        L_0x053f:
            android.view.ViewGroup$LayoutParams r7 = r4.getLayoutParams()
            boolean r8 = r7 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r8 == 0) goto L_0x054a
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            goto L_0x054b
        L_0x054a:
            r7 = 0
        L_0x054b:
            if (r7 == 0) goto L_0x0552
            r7.rightMargin = r12
            rx3.b0 r8 = rx3.C13598b0.f38549a
            goto L_0x0553
        L_0x0552:
            r7 = 0
        L_0x0553:
            r4.setLayoutParams(r7)
            goto L_0x0596
        L_0x0557:
            r5 = 8
            android.widget.TextView r7 = r0.f40563P
            if (r7 != 0) goto L_0x055e
            goto L_0x0561
        L_0x055e:
            r7.setVisibility(r12)
        L_0x0561:
            android.widget.TextView r7 = r0.f40563P
            if (r7 != 0) goto L_0x0566
            goto L_0x0569
        L_0x0566:
            r7.setText(r4)
        L_0x0569:
            android.view.View r7 = r0.f40569T
            if (r7 != 0) goto L_0x056e
            goto L_0x0596
        L_0x056e:
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            boolean r9 = r8 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r9 == 0) goto L_0x0579
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            goto L_0x057a
        L_0x0579:
            r8 = 0
        L_0x057a:
            if (r8 == 0) goto L_0x0592
            android.widget.TextView r9 = r0.f40563P
            if (r9 == 0) goto L_0x058c
            android.text.TextPaint r9 = r9.getPaint()
            if (r9 == 0) goto L_0x058c
            float r4 = r9.measureText(r4)
            int r9 = (int) r4
            goto L_0x058d
        L_0x058c:
            r9 = 0
        L_0x058d:
            r8.rightMargin = r9
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x0593
        L_0x0592:
            r8 = 0
        L_0x0593:
            r7.setLayoutParams(r8)
        L_0x0596:
            android.widget.ImageView r4 = r0.f40570U
            ve1.v7$a r7 = new ve1.v7$a
            r7.<init>(r6, r0, r1)
            r4.setOnClickListener(r7)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x05ea
        L_0x05a3:
            r18 = r14
            r5 = 8
            r10 = 2
            r12 = 0
            android.view.View r4 = r0.f40568S
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r6.mo10233c(r7)
            java.lang.Object[] r32 = r6.mo10232b()
            java.lang.String r33 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r34 = "bindMedia"
            java.lang.String r35 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r36 = "android/view/View_EXEC_"
            java.lang.String r37 = "setVisibility"
            java.lang.String r38 = "(I)V"
            r31 = r4
            j20.C117292a.m165358d(r31, r32, r33, r34, r35, r36, r37, r38)
            java.lang.Object r6 = r6.mo10231a(r12)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.setVisibility(r6)
            java.lang.String r32 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r33 = "bindMedia"
            java.lang.String r34 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r35 = "android/view/View_EXEC_"
            java.lang.String r36 = "setVisibility"
            java.lang.String r37 = "(I)V"
            j20.C117292a.m165359e(r31, r32, r33, r34, r35, r36, r37)
        L_0x05ea:
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r40.mo3513o()
            java.lang.String r4 = r4.getDescription()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            r6 = 0
            if (r4 != 0) goto L_0x063d
            android.widget.TextView r4 = r0.f40556H
            r4.setVisibility(r12)
            hp1.w0 r31 = hp1.C8703w0.f27927a
            int r34 = hp1.C8703w0.f27928b
            if (r43 == 0) goto L_0x0635
            android.widget.TextView r4 = r0.f40556H
            di3.d r3 = di3.C86312j.m106911c(r3)
            ny.h r3 = (p629ny.C76979h) r3
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r40.mo3513o()
            java.lang.String r32 = r8.getDescription()
            android.widget.TextView r8 = r0.f40556H
            android.text.TextPaint r8 = r8.getPaint()
            java.lang.String r9 = "descTv.paint"
            gy3.C87412m.m108593f(r8, r9)
            r36 = 1
            java.lang.String r35 = ""
            r33 = r8
            android.text.Spanned r8 = r31.mo9551b(r32, r33, r34, r35, r36)
            android.text.SpannableString r3 = r3.Te0(r7, r8, r6)
            r4.setText(r3)
            goto L_0x0642
        L_0x0635:
            android.widget.TextView r3 = r0.f40556H
            r4 = r20
            r3.setText(r4)
            goto L_0x0642
        L_0x063d:
            android.widget.TextView r3 = r0.f40556H
            r3.setVisibility(r5)
        L_0x0642:
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r40.mo3513o()
            int r3 = r3.getLikeCount()
            if (r3 <= 0) goto L_0x0659
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r40.mo3513o()
            int r3 = r3.getLikeCount()
            java.lang.String r3 = er1.C7878t0.m8034c(r10, r3)
            goto L_0x065b
        L_0x0659:
            java.lang.String r3 = "0"
        L_0x065b:
            android.widget.TextView r4 = r0.f40562N
            r4.setText(r3)
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r3 = r0.f40553E
            r3.setVisibility(r5)
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r3 = r0.f40554F
            r3.setVisibility(r5)
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView r3 = r0.f40552D
            r3.setVisibility(r5)
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r40.mo3513o()
            int r3 = r3.getMediaType()
            boolean r4 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r4 == 0) goto L_0x068a
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView r4 = r0.f40552D
            r7 = 2131099694(0x7f06002e, float:1.7811748E38)
            r8 = 2131099690(0x7f06002a, float:1.781174E38)
            r4.f21262i = r8
            r4.f21261h = r7
            goto L_0x0696
        L_0x068a:
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView r4 = r0.f40552D
            r7 = 2131099661(0x7f06000d, float:1.7811682E38)
            r8 = 2131099657(0x7f060009, float:1.7811673E38)
            r4.f21262i = r8
            r4.f21261h = r7
        L_0x0696:
            if (r3 == r10) goto L_0x06ab
            r4 = 4
            if (r3 == r4) goto L_0x06a3
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView r4 = r0.f40552D
            r4.setVisibility(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x06c2
        L_0x06a3:
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView r4 = r0.f40552D
            r4.setVisibility(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x06c2
        L_0x06ab:
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView r4 = r0.f40552D
            r4.setVisibility(r12)
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView r4 = r0.f40552D
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r40.mo3513o()
            java.util.LinkedList r7 = r7.getMediaList()
            int r7 = r7.size()
            r4.f21258e = r7
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x06c2:
            boolean r4 = r39.mo13856C(r40)
            r7 = 2131099940(0x7f060124, float:1.7812247E38)
            if (r4 == 0) goto L_0x06fd
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f40551C
            if (r2 == 0) goto L_0x06d5
            r4 = 2131756028(0x7f1003fc, float:1.9142952E38)
            r2.setImageResource(r4)
        L_0x06d5:
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f40551C
            if (r2 == 0) goto L_0x06ea
            android.view.View r4 = r0.f44854d
            android.content.Context r4 = r4.getContext()
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getColor(r7)
            r2.setIconColor(r4)
        L_0x06ea:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r40.mo3513o()
            int r2 = r2.getReadCount()
            android.widget.TextView r4 = r0.f40562N
            long r8 = (long) r2
            java.lang.String r2 = er1.C7878t0.m8036e(r8)
            r4.setText(r2)
            goto L_0x0761
        L_0x06fd:
            wp1.j r4 = wp1.C15587j.f42215a
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r40.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.getFeedObject()
            int r8 = r8.objectType
            te3.if1 r4 = r4.mo14351c(r8)
            if (r4 == 0) goto L_0x0764
            java.lang.String r8 = r4.f135279y
            if (r8 == 0) goto L_0x071c
            int r8 = r8.length()
            if (r8 != 0) goto L_0x071a
            goto L_0x071c
        L_0x071a:
            r9 = 0
            goto L_0x071d
        L_0x071c:
            r9 = 1
        L_0x071d:
            if (r9 == 0) goto L_0x0720
            goto L_0x0764
        L_0x0720:
            com.tencent.mm.ui.widget.imageview.WeImageView r6 = r0.f40551C
            if (r6 == 0) goto L_0x074e
            bl3.r r8 = bl3.C39818r.f106831a
            bl3.r$a r9 = r8.mo62446e(r2)
            bl3.c r9 = r9.mo62447c(r15)
            pl1.s0 r9 = (pl1.C11990s0) r9
            k60.d r9 = r9.mo11871f2()
            pl1.n0 r11 = new pl1.n0
            java.lang.String r4 = r4.f135279y
            r11.<init>(r4, r13)
            bl3.r$a r2 = r8.mo62446e(r2)
            bl3.c r2 = r2.mo62447c(r15)
            pl1.s0 r2 = (pl1.C11990s0) r2
            r4 = r18
            n60.f r2 = r2.mo11867O2(r4)
            r9.mo85957c(r11, r6, r2)
        L_0x074e:
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f40551C
            if (r2 == 0) goto L_0x0761
            android.view.View r4 = r0.f44854d
            android.content.Context r4 = r4.getContext()
            int r4 = kg3.C76577a.m92153d(r4, r7)
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r2.setColorFilter(r4, r6)
        L_0x0761:
            r9 = r30
            goto L_0x07bb
        L_0x0764:
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f40551C
            r4 = 2131756066(0x7f100422, float:1.914303E38)
            if (r2 == 0) goto L_0x076e
            r2.setImageResource(r4)
        L_0x076e:
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f40551C
            if (r2 == 0) goto L_0x0783
            android.view.View r8 = r0.f44854d
            android.content.Context r8 = r8.getContext()
            android.content.res.Resources r8 = r8.getResources()
            int r8 = r8.getColor(r7)
            r2.setIconColor(r8)
        L_0x0783:
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f40551C
            if (r2 == 0) goto L_0x07a6
            android.view.View r8 = r0.f44854d
            android.content.Context r8 = r8.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r9 = r30
            r11 = 1
            java.lang.Integer r13 = r9.mo83917b0(r11, r11)
            if (r13 == 0) goto L_0x079e
            int r4 = r13.intValue()
        L_0x079e:
            android.graphics.drawable.Drawable r4 = hi3.C87515a.m108835e(r8, r4, r6)
            r2.setImageDrawable(r4)
            goto L_0x07a8
        L_0x07a6:
            r9 = r30
        L_0x07a8:
            android.widget.TextView r2 = r0.f40562N
            android.view.View r4 = r0.f44854d
            android.content.Context r4 = r4.getContext()
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getColor(r7)
            r2.setTextColor(r4)
        L_0x07bb:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r40.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            te3.ek1 r2 = r2.flow_card_recommand_reason
            if (r2 == 0) goto L_0x07cb
            java.lang.String r2 = r2.f132981d
            if (r2 != 0) goto L_0x07cd
        L_0x07cb:
            r2 = r16
        L_0x07cd:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r4 != 0) goto L_0x07e0
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r0.f40551C
            if (r4 != 0) goto L_0x07d8
            goto L_0x07db
        L_0x07d8:
            r4.setVisibility(r5)
        L_0x07db:
            android.widget.TextView r4 = r0.f40562N
            r4.setText(r2)
        L_0x07e0:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r40.mo3513o()
            long r13 = r2.getRefObjectFlag()
            r15 = 0
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x07f4
            android.widget.ImageView r2 = r0.f40555G
            r2.setVisibility(r12)
            goto L_0x07f9
        L_0x07f4:
            android.widget.ImageView r2 = r0.f40555G
            r2.setVisibility(r5)
        L_0x07f9:
            android.view.View r2 = r0.f44854d
            ve1.v7$b r4 = new ve1.v7$b
            r6 = r44
            r4.<init>(r6, r3)
            r2.setOnClickListener(r4)
            android.view.View r2 = r0.f40561M
            k20.a r4 = new k20.a
            r4.<init>()
            k20.C60958c.m71442b(r12, r4)
            java.lang.Object[] r14 = r4.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r16 = "bindMedia"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r2
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r4 = r4.mo10231a(r12)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r15 = "bindMedia"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            android.animation.ValueAnimator r2 = r0.f40566R
            if (r2 == 0) goto L_0x0848
            r2.cancel()
        L_0x0848:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r40.mo3513o()
            boolean r2 = r2.isPostFailed()
            if (r2 == 0) goto L_0x0909
            android.view.View r2 = r0.f40560L
            k20.a r4 = new k20.a
            r4.<init>()
            k20.C60958c.m71442b(r12, r4)
            java.lang.Object[] r14 = r4.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r16 = "bindMedia"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r2
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r4 = r4.mo10231a(r12)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r15 = "bindMedia"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            android.view.View r2 = r0.f40559K
            k20.a r4 = new k20.a
            r4.<init>()
            k20.C60958c.m71442b(r5, r4)
            java.lang.Object[] r28 = r4.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r30 = "bindMedia"
            java.lang.String r31 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r2
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            java.lang.Object r4 = r4.mo10231a(r12)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r28 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r29 = "bindMedia"
            java.lang.String r30 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            android.view.View r2 = r0.f40561M
            k20.a r4 = new k20.a
            r4.<init>()
            k20.C60958c.m71442b(r5, r4)
            java.lang.Object[] r14 = r4.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r16 = "bindMedia"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r2
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r4 = r4.mo10231a(r12)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r15 = "bindMedia"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0a7b
        L_0x0909:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r40.mo3513o()
            boolean r2 = r2.isPostFinish()
            if (r2 == 0) goto L_0x098e
            android.view.View r2 = r0.f40560L
            k20.a r4 = new k20.a
            r4.<init>()
            k20.C60958c.m71442b(r5, r4)
            java.lang.Object[] r14 = r4.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r16 = "bindMedia"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r2
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r4 = r4.mo10231a(r12)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r15 = "bindMedia"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            android.view.View r2 = r0.f40559K
            k20.a r4 = new k20.a
            r4.<init>()
            k20.C60958c.m71442b(r5, r4)
            java.lang.Object[] r28 = r4.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r30 = "bindMedia"
            java.lang.String r31 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r2
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            java.lang.Object r4 = r4.mo10231a(r12)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r28 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r29 = "bindMedia"
            java.lang.String r30 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            goto L_0x0a7b
        L_0x098e:
            android.view.View r2 = r0.f40560L
            k20.a r4 = new k20.a
            r4.<init>()
            k20.C60958c.m71442b(r5, r4)
            java.lang.Object[] r14 = r4.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r16 = "bindMedia"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r2
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r4 = r4.mo10231a(r12)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r15 = "bindMedia"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            android.view.View r2 = r0.f40561M
            k20.a r4 = new k20.a
            r4.<init>()
            k20.C60958c.m71442b(r5, r4)
            java.lang.Object[] r28 = r4.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r30 = "bindMedia"
            java.lang.String r31 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r2
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            java.lang.Object r4 = r4.mo10231a(r12)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r28 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r29 = "bindMedia"
            java.lang.String r30 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            android.view.View r2 = r0.f40559K
            k20.a r4 = new k20.a
            r4.<init>()
            k20.C60958c.m71442b(r12, r4)
            java.lang.Object[] r14 = r4.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r16 = "bindMedia"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r2
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r4 = r4.mo10231a(r12)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r15 = "bindMedia"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            int[] r2 = new int[r10]
            com.tencent.mm.plugin.finder.view.FinderPostProgressView r4 = r0.f40558J
            int r4 = r4.getProgress()
            r2[r12] = r4
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r40.mo3513o()
            te3.tq2 r4 = r4.getPostInfo()
            int r4 = r4.f185649h
            r6 = 1
            r2[r6] = r4
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r2)
            r0.f40566R = r2
            gy3.C87412m.m108591d(r2)
            ve1.v7$c r4 = new ve1.v7$c
            r4.<init>(r0)
            r2.addUpdateListener(r4)
            android.animation.ValueAnimator r2 = r0.f40566R
            gy3.C87412m.m108591d(r2)
            r10 = 400(0x190, double:1.976E-321)
            android.animation.ValueAnimator r2 = r2.setDuration(r10)
            if (r2 == 0) goto L_0x0a7b
            r2.start()
        L_0x0a7b:
            android.view.View r2 = r0.f40560L
            int r2 = r2.getVisibility()
            if (r2 != r5) goto L_0x0ad2
            android.view.View r2 = r0.f40559K
            int r2 = r2.getVisibility()
            if (r2 != r5) goto L_0x0ad2
            android.widget.TextView r2 = r0.f40556H
            int r2 = r2.getVisibility()
            if (r2 != r5) goto L_0x0ad2
            if (r43 != 0) goto L_0x0ad2
            android.view.View r2 = r0.f40564Q
            k20.a r4 = new k20.a
            r4.<init>()
            k20.C60958c.m71442b(r5, r4)
            java.lang.Object[] r14 = r4.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r16 = "bindMedia"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r2
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r4 = r4.mo10231a(r12)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r15 = "bindMedia"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0b0f
        L_0x0ad2:
            android.view.View r2 = r0.f40564Q
            k20.a r4 = new k20.a
            r4.<init>()
            k20.C60958c.m71442b(r12, r4)
            java.lang.Object[] r28 = r4.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r30 = "bindMedia"
            java.lang.String r31 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r2
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            java.lang.Object r4 = r4.mo10231a(r12)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r28 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r29 = "bindMedia"
            java.lang.String r30 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
        L_0x0b0f:
            boolean r2 = r39.mo13856C(r40)
            r4 = 2131756180(0x7f100494, float:1.914326E38)
            if (r2 == 0) goto L_0x0c41
            android.view.View r2 = r0.f40572W
            if (r2 != 0) goto L_0x0b1d
            goto L_0x0b57
        L_0x0b1d:
            k20.a r6 = new k20.a
            r6.<init>()
            k20.C60958c.m71442b(r5, r6)
            java.lang.Object[] r14 = r6.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r16 = "bindMedia"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r2
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r5 = r6.mo10231a(r12)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r15 = "bindMedia"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
        L_0x0b57:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r40.mo3513o()
            boolean r2 = r2.isPrivate()
            r5 = 2131100166(0x7f060206, float:1.7812706E38)
            if (r2 == 0) goto L_0x0bce
            android.widget.ImageView r2 = r0.f40573X
            if (r2 == 0) goto L_0x0b8c
            android.content.Context r4 = r2.getContext()
            r6 = 2131755651(0x7f100283, float:1.9142187E38)
            android.widget.ImageView r7 = r0.f40573X
            if (r7 == 0) goto L_0x0b84
            android.content.Context r7 = r7.getContext()
            if (r7 == 0) goto L_0x0b84
            android.content.res.Resources r7 = r7.getResources()
            if (r7 == 0) goto L_0x0b84
            int r9 = r7.getColor(r5)
            goto L_0x0b85
        L_0x0b84:
            r9 = 0
        L_0x0b85:
            android.graphics.drawable.Drawable r4 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r4, r6, r9)
            r2.setImageDrawable(r4)
        L_0x0b8c:
            android.view.View r5 = r0.f40572W
            if (r5 != 0) goto L_0x0b92
            goto L_0x0d3f
        L_0x0b92:
            k20.a r2 = new k20.a
            r2.<init>()
            k20.C60958c.m71442b(r12, r2)
            java.lang.Object[] r14 = r2.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r16 = "bindMedia"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r5
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r2 = r2.mo10231a(r12)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r5.setVisibility(r2)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r7 = "bindMedia"
            java.lang.String r8 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0d3f
        L_0x0bce:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r40.mo3513o()
            int r2 = r2.getStickyTime()
            if (r2 <= 0) goto L_0x0d3f
            if (r43 != 0) goto L_0x0d3f
            android.widget.ImageView r2 = r0.f40573X
            if (r2 == 0) goto L_0x0bff
            android.content.Context r6 = r2.getContext()
            android.widget.ImageView r7 = r0.f40573X
            if (r7 == 0) goto L_0x0bf7
            android.content.Context r7 = r7.getContext()
            if (r7 == 0) goto L_0x0bf7
            android.content.res.Resources r7 = r7.getResources()
            if (r7 == 0) goto L_0x0bf7
            int r9 = r7.getColor(r5)
            goto L_0x0bf8
        L_0x0bf7:
            r9 = 0
        L_0x0bf8:
            android.graphics.drawable.Drawable r4 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r6, r4, r9)
            r2.setImageDrawable(r4)
        L_0x0bff:
            android.view.View r5 = r0.f40572W
            if (r5 != 0) goto L_0x0c05
            goto L_0x0d3f
        L_0x0c05:
            k20.a r2 = new k20.a
            r2.<init>()
            k20.C60958c.m71442b(r12, r2)
            java.lang.Object[] r14 = r2.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r16 = "bindMedia"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r5
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r2 = r2.mo10231a(r12)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r5.setVisibility(r2)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r7 = "bindMedia"
            java.lang.String r8 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0d3f
        L_0x0c41:
            android.view.View r2 = r0.f40572W
            if (r2 != 0) goto L_0x0c46
            goto L_0x0c80
        L_0x0c46:
            k20.a r6 = new k20.a
            r6.<init>()
            k20.C60958c.m71442b(r5, r6)
            java.lang.Object[] r14 = r6.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r16 = "bindMedia"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r2
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r5 = r6.mo10231a(r12)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r15 = "bindMedia"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
        L_0x0c80:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r40.mo3513o()
            int r2 = r2.getStickyTime()
            if (r2 <= 0) goto L_0x0cf0
            if (r43 != 0) goto L_0x0cf0
            android.widget.ImageView r2 = r0.f40573X
            if (r2 == 0) goto L_0x0cb1
            android.content.Context r5 = r2.getContext()
            android.widget.ImageView r6 = r0.f40573X
            if (r6 == 0) goto L_0x0ca9
            android.content.Context r6 = r6.getContext()
            if (r6 == 0) goto L_0x0ca9
            android.content.res.Resources r6 = r6.getResources()
            if (r6 == 0) goto L_0x0ca9
            int r6 = r6.getColor(r7)
            goto L_0x0caa
        L_0x0ca9:
            r6 = 0
        L_0x0caa:
            android.graphics.drawable.Drawable r4 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r5, r4, r6)
            r2.setImageDrawable(r4)
        L_0x0cb1:
            android.view.View r2 = r0.f40572W
            if (r2 != 0) goto L_0x0cb6
            goto L_0x0cf0
        L_0x0cb6:
            k20.a r4 = new k20.a
            r4.<init>()
            k20.C60958c.m71442b(r12, r4)
            java.lang.Object[] r14 = r4.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r16 = "bindMedia"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r2
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r4 = r4.mo10231a(r12)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/convert/FinderProfileUIMediaViewHolder"
            java.lang.String r15 = "bindMedia"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IZZLkotlin/jvm/functions/Function1;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
        L_0x0cf0:
            fe1.q r2 = r40.mo3507l()
            if (r2 == 0) goto L_0x0d3f
            android.view.View r4 = r0.f44854d
            r5 = 2131297406(0x7f09047e, float:1.8212756E38)
            android.view.View r4 = r4.findViewById(r5)
            boolean r5 = r4 instanceof android.widget.ImageView
            if (r5 == 0) goto L_0x0d07
            r6 = r4
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            goto L_0x0d08
        L_0x0d07:
            r6 = 0
        L_0x0d08:
            if (r6 == 0) goto L_0x0d3f
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r4 = r2.field_authInfo
            r21 = 0
            r5 = 0
            r7 = 1
            te3.cg r22 = fe1.C58960c.m68831c(r2, r12, r7, r5)
            r23 = 4
            r24 = 0
            r18 = r9
            r19 = r6
            r20 = r4
            er1.C58784w3.m68429F1(r18, r19, r20, r21, r22, r23, r24)
            int r2 = r6.getVisibility()
            if (r2 != 0) goto L_0x0d40
            android.widget.TextView r2 = r0.f40563P
            if (r2 == 0) goto L_0x0d33
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0d33
            r9 = 1
            goto L_0x0d34
        L_0x0d33:
            r9 = 0
        L_0x0d34:
            if (r9 == 0) goto L_0x0d40
            ve1.v7$d r2 = new ve1.v7$d
            r2.<init>(r0, r6)
            r6.post(r2)
            goto L_0x0d40
        L_0x0d3f:
            r5 = 0
        L_0x0d40:
            er1.j4 r2 = er1.C58739j4.f168176a
            boolean r2 = r2.mo83686O(r1)
            if (r2 == 0) goto L_0x0d4b
            r39.mo13857y(r40)
        L_0x0d4b:
            android.view.View r2 = r0.f40549A
            if (r2 == 0) goto L_0x0d95
            r4 = 2131302517(0x7f091875, float:1.8223122E38)
            android.widget.TextView r6 = r0.f40556H
            java.lang.CharSequence r6 = r6.getText()
            r2.setTag(r4, r6)
            r4 = 2131302575(0x7f0918af, float:1.822324E38)
            android.widget.TextView r6 = r0.f40571V
            java.lang.CharSequence r6 = r6.getText()
            r2.setTag(r4, r6)
            r4 = 2131302511(0x7f09186f, float:1.822311E38)
            fe1.q r6 = r40.mo3507l()
            if (r6 == 0) goto L_0x0d77
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r6 = r6.field_authInfo
            if (r6 == 0) goto L_0x0d77
            int r9 = r6.authIconType
            goto L_0x0d78
        L_0x0d77:
            r9 = 0
        L_0x0d78:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r2.setTag(r4, r6)
            r4 = 2131302569(0x7f0918a9, float:1.8223228E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.setTag(r4, r3)
            r3 = 2131302530(0x7f091882, float:1.8223149E38)
            android.widget.TextView r4 = r0.f40562N
            java.lang.CharSequence r4 = r4.getText()
            r2.setTag(r3, r4)
        L_0x0d95:
            java.lang.String r2 = r0.f40579z
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "mediaType:"
            r3.append(r4)
            r4 = r42
            int r4 = r4.f185268f
            r3.append(r4)
            java.lang.String r4 = ",liveStatus:"
            r3.append(r4)
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r40.mo3513o()
            te3.c21 r4 = r4.getLiveInfo()
            if (r4 == 0) goto L_0x0dbe
            int r4 = r4.f182394f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            goto L_0x0dbf
        L_0x0dbe:
            r6 = r5
        L_0x0dbf:
            r3.append(r6)
            java.lang.String r4 = ",contact liveStatus:"
            r3.append(r4)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r40.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r1.getRefObjectContact()
            if (r1 == 0) goto L_0x0dd8
            int r1 = r1.liveStatus
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            goto L_0x0dd9
        L_0x0dd8:
            r4 = r5
        L_0x0dd9:
            r3.append(r4)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14663v7.mo13858z(com.tencent.mm.plugin.finder.model.BaseFinderFeed, int, boolean, boolean, fy3.l):void");
    }
}
