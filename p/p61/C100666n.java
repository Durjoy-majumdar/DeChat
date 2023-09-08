package p61;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.emoji.model.C93104c0;
import com.tencent.p014mm.plugin.emoji.model.C93116n;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96984r2;
import eb0.C75592q0;
import gc0.C20828a;
import gy3.C87412m;
import i61.C98601f;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import k60.C99099a;
import k60.C99101e;
import l60.C99342a;
import l60.C99344b;
import n60.C100075f;
import te3.C101754a80;
import te3.C101776f80;
import te3.C101792j80;
import te3.C101824o80;
import u61.C101963g;
import u61.C14123e;
import x51.C102561f;
import x51.C102562g;

/* renamed from: p61.n */
public final class C100666n extends C100657j<C100683x> implements C100642b0 {

    /* renamed from: B */
    public final Context f294899B;

    /* renamed from: C */
    public final View f294900C;

    /* renamed from: D */
    public final List<String> f294901D;

    /* renamed from: E */
    public boolean f294902E;

    /* renamed from: F */
    public boolean f294903F;

    /* renamed from: G */
    public final C100640a0 f294904G;

    /* renamed from: H */
    public final View f294905H;

    /* renamed from: I */
    public final View f294906I;

    /* renamed from: J */
    public final ImageView f294907J;

    /* renamed from: K */
    public final TextView f294908K;

    /* renamed from: L */
    public final View f294909L;

    /* renamed from: M */
    public final ViewGroup f294910M;

    /* renamed from: N */
    public final TextView f294911N;

    /* renamed from: P */
    public ImageView f294912P;

    /* renamed from: Q */
    public final View f294913Q;

    /* renamed from: Q0 */
    public C100671r f294914Q0;

    /* renamed from: R */
    public final ViewGroup f294915R;

    /* renamed from: R0 */
    public C93104c0 f294916R0;

    /* renamed from: S */
    public TextView f294917S;

    /* renamed from: S0 */
    public final String f294918S0;

    /* renamed from: T */
    public View f294919T;

    /* renamed from: T0 */
    public C102562g f294920T0;

    /* renamed from: U */
    public ImageView f294921U;

    /* renamed from: V */
    public View f294922V;

    /* renamed from: W */
    public ProgressBar f294923W;

    /* renamed from: X */
    public ProgressBar f294924X;

    /* renamed from: Y */
    public final View f294925Y;

    /* renamed from: Z */
    public final TextView f294926Z;

    /* renamed from: p0 */
    public final ImageView f294927p0;

    /* renamed from: x0 */
    public final Drawable f294928x0;

    /* renamed from: y0 */
    public final Drawable f294929y0;

    /* renamed from: p61.n$a */
    public static final class C100667a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C100666n f294930d;

        /* renamed from: e */
        public final /* synthetic */ C100684y f294931e;

        public C100667a(C100666n nVar, C100684y yVar) {
            this.f294930d = nVar;
            this.f294931e = yVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C100666n nVar = this.f294930d;
            C100640a0 a0Var = nVar.f294904G;
            if (a0Var != null) {
                a0Var.mo127714a(nVar, nVar.mo17363j(), this.f294931e);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C100666n(android.content.Context r11, android.view.View r12, java.util.List r13, boolean r14, boolean r15, p61.C100640a0 r16, int r17, gy3.C8480h r18) {
        /*
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r17 & 4
            if (r3 == 0) goto L_0x000a
            sx3.f0 r3 = sx3.C64186f0.f181907d
            goto L_0x000b
        L_0x000a:
            r3 = r13
        L_0x000b:
            r4 = r17 & 8
            if (r4 == 0) goto L_0x0011
            r4 = 0
            goto L_0x0012
        L_0x0011:
            r4 = r14
        L_0x0012:
            r5 = r17 & 16
            if (r5 == 0) goto L_0x0018
            r5 = 1
            goto L_0x0019
        L_0x0018:
            r5 = r15
        L_0x0019:
            r6 = r17 & 32
            if (r6 == 0) goto L_0x001f
            r6 = 0
            goto L_0x0021
        L_0x001f:
            r6 = r16
        L_0x0021:
            java.lang.String r7 = "context"
            gy3.C87412m.m108594g(r11, r7)
            java.lang.String r7 = "itemView"
            gy3.C87412m.m108594g(r12, r7)
            java.lang.String r7 = "designerNewProductList"
            gy3.C87412m.m108594g(r3, r7)
            r10.<init>(r12, r6)
            r0.f294899B = r1
            r0.f294900C = r2
            r0.f294901D = r3
            r0.f294902E = r4
            r0.f294903F = r5
            r0.f294904G = r6
            r3 = 2131306634(0x7f09288a, float:1.8231473E38)
            android.view.View r3 = r12.findViewById(r3)
            java.lang.String r4 = "itemView.findViewById(R.id.item_list_content)"
            gy3.C87412m.m108593f(r3, r4)
            r0.f294905H = r3
            r3 = 2131306598(0x7f092866, float:1.82314E38)
            android.view.View r3 = r12.findViewById(r3)
            java.lang.String r4 = "itemView.findViewById(R.id.item_container)"
            gy3.C87412m.m108593f(r3, r4)
            r0.f294906I = r3
            r3 = 2131306613(0x7f092875, float:1.823143E38)
            android.view.View r3 = r12.findViewById(r3)
            java.lang.String r4 = "itemView.findViewById(R.id.item_icon)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0.f294907J = r3
            r3 = 2131306649(0x7f092899, float:1.8231503E38)
            android.view.View r3 = r12.findViewById(r3)
            java.lang.String r4 = "itemView.findViewById(R.id.item_name)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f294908K = r3
            r3 = 2131306656(0x7f0928a0, float:1.8231517E38)
            android.view.View r3 = r12.findViewById(r3)
            java.lang.String r4 = "itemView.findViewById(R.id.item_option)"
            gy3.C87412m.m108593f(r3, r4)
            r0.f294909L = r3
            r3 = 2131306667(0x7f0928ab, float:1.823154E38)
            android.view.View r3 = r12.findViewById(r3)
            java.lang.String r4 = "itemView.findViewById(R.id.item_root)"
            gy3.C87412m.m108593f(r3, r4)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r0.f294910M = r3
            r3 = 2131306672(0x7f0928b0, float:1.823155E38)
            android.view.View r3 = r12.findViewById(r3)
            java.lang.String r4 = "itemView.findViewById(R.id.item_state)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f294911N = r3
            r3 = 2131306677(0x7f0928b5, float:1.823156E38)
            android.view.View r3 = r12.findViewById(r3)
            java.lang.String r4 = "itemView.findViewById(R.id.item_tip)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0.f294912P = r3
            r3 = 2131306651(0x7f09289b, float:1.8231507E38)
            android.view.View r3 = r12.findViewById(r3)
            java.lang.String r4 = "itemView.findViewById(R.id.item_name_new_tip)"
            gy3.C87412m.m108593f(r3, r4)
            r0.f294913Q = r3
            r3 = 2131306620(0x7f09287c, float:1.8231444E38)
            android.view.View r3 = r12.findViewById(r3)
            java.lang.String r4 = "itemView.findViewById(R.id.item_introduce_root)"
            gy3.C87412m.m108593f(r3, r4)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r0.f294915R = r3
            r3 = 2131306619(0x7f09287b, float:1.8231442E38)
            android.view.View r3 = r12.findViewById(r3)
            java.lang.String r4 = "itemView.findViewById(R.id.item_introduce)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f294917S = r3
            r3 = 2131301550(0x7f0914ae, float:1.8221161E38)
            android.view.View r3 = r12.findViewById(r3)
            java.lang.String r4 = "itemView.findViewById(R.id.emoji_preview_info_tag)"
            gy3.C87412m.m108593f(r3, r4)
            r0.f294919T = r3
            r3 = 2131306673(0x7f0928b1, float:1.8231552E38)
            android.view.View r3 = r12.findViewById(r3)
            java.lang.String r4 = "itemView.findViewById(R.id.item_state_image)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0.f294921U = r3
            r3 = 2131306666(0x7f0928aa, float:1.8231538E38)
            android.view.View r3 = r12.findViewById(r3)
            java.lang.String r4 = "itemView.findViewById(R.id.item_progress_bar)"
            gy3.C87412m.m108593f(r3, r4)
            r0.f294922V = r3
            r3 = 2131306607(0x7f09286f, float:1.8231418E38)
            android.view.View r3 = r12.findViewById(r3)
            java.lang.String r4 = "itemView.findViewById(R.id.item_download_progress)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            r0.f294923W = r3
            r3 = 2131311283(0x7f093ab3, float:1.8240902E38)
            android.view.View r3 = r12.findViewById(r3)
            java.lang.String r4 = "itemView.findViewById(R.id.price_loading)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            r0.f294924X = r3
            r3 = 2131301458(0x7f091452, float:1.8220974E38)
            android.view.View r3 = r12.findViewById(r3)
            java.lang.String r4 = "itemView.findViewById(R.id.emoji_detail_link_info)"
            gy3.C87412m.m108593f(r3, r4)
            r0.f294925Y = r3
            r3 = 2131301460(0x7f091454, float:1.8220979E38)
            android.view.View r3 = r12.findViewById(r3)
            java.lang.String r4 = "itemView.findViewById(R.…i_detail_link_info_title)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f294926Z = r3
            r3 = 2131301459(0x7f091453, float:1.8220976E38)
            android.view.View r2 = r12.findViewById(r3)
            java.lang.String r3 = "itemView.findViewById(R.…ji_detail_link_info_icon)"
            gy3.C87412m.m108593f(r2, r3)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r0.f294927p0 = r2
            r2 = 1090519040(0x41000000, float:8.0)
            int r2 = zp3.C79406f.m96347a(r11, r2)
            float r2 = (float) r2
            r3 = 2131099688(0x7f060028, float:1.7811736E38)
            int r3 = kg3.C76577a.m92153d(r11, r3)
            r4 = 2131099657(0x7f060009, float:1.7811673E38)
            int r4 = kg3.C76577a.m92153d(r11, r4)
            u61.d r5 = u61.C101962d.f300168a
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r12 = r5
            r13 = r3
            r14 = r4
            r15 = r2
            r16 = r2
            r17 = r8
            r18 = r9
            android.graphics.drawable.Drawable r2 = r12.mo141484b(r13, r14, r15, r16, r17, r18)
            r0.f294928x0 = r2
            r2 = 0
            r15 = r2
            r16 = r6
            r17 = r7
            r18 = r8
            android.graphics.drawable.Drawable r2 = r12.mo141484b(r13, r14, r15, r16, r17, r18)
            r0.f294929y0 = r2
            android.content.res.Resources r1 = r11.getResources()
            r2 = 2131165371(0x7f0700bb, float:1.7944957E38)
            r1.getDimension(r2)
            java.lang.String r1 = "MicroMsg.EmojiStoreV3HomeMainHolder"
            r0.f294918S0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p61.C100666n.<init>(android.content.Context, android.view.View, java.util.List, boolean, boolean, p61.a0, int, gy3.h):void");
    }

    /* renamed from: B */
    public final void mo140103B(C102562g gVar, String str, int i) {
        if (gVar != null && str != null && !C87412m.m108589b(str, "")) {
            gVar.mo142189b(i);
            C93104c0 c0Var = this.f294916R0;
            if (c0Var != null) {
                c0Var.mo127609a(str, i);
            }
        }
    }

    /* renamed from: C */
    public final void mo140104C(String str) {
        if (Util.isNullOrNil(str)) {
            this.f294915R.setVisibility(8);
            this.f294917S.setVisibility(8);
            return;
        }
        this.f294915R.setVisibility(0);
        this.f294917S.setVisibility(0);
        this.f294917S.setText(str);
    }

    /* renamed from: a */
    public void mo140085a(int i, String str) {
        C87412m.m108594g(str, "productId");
        C102562g gVar = this.f294920T0;
        if (gVar != null) {
            mo140103B(gVar, str, i);
            if (gVar.f301987f == -1) {
                Log.m105924i(this.f294918S0, "force refresh status");
                boolean z = C75592q0.m90796z();
                C93104c0 c0Var = this.f294916R0;
                C96984r2 b = c0Var != null ? c0Var.mo127610b(str) : null;
                C93116n.C93117a aVar = C93116n.f268258c;
                gVar.mo142188a(z, b, C93116n.f268259d.containsKey(str));
            }
            mo140086b();
        }
    }

    /* renamed from: b */
    public void mo140086b() {
        C102562g gVar = this.f294920T0;
        if (gVar != null) {
            this.f294911N.setVisibility(8);
            this.f294911N.setTextColor(this.f294899B.getResources().getColorStateList(C0966R.color.f3142gq));
            int i = gVar.f301987f;
            if (i == 0) {
                mo140105z();
            } else if (i == 20) {
                this.f294924X.setVisibility(8);
                this.f294910M.setBackgroundResource(C0966R.C0969drawable.f4653j6);
                this.f294910M.setEnabled(false);
                this.f294910M.setVisibility(0);
                View view = this.f294919T;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealActivityLimitView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealActivityLimitView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f294909L.setEnabled(false);
                TextView textView = this.f294911N;
                textView.setTextColor(textView.getResources().getColorStateList(C0966R.color.f3325nz));
                this.f294911N.setVisibility(0);
                this.f294911N.setText(C0966R.string.c79);
                this.f294921U.setVisibility(4);
                View view3 = this.f294922V;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(4);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealActivityLimitView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealActivityLimitView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i != 3) {
                if (i != 4) {
                    if (i == 6) {
                        C102562g gVar2 = this.f294920T0;
                        if (gVar2 != null) {
                            this.f294924X.setVisibility(8);
                            this.f294910M.setVisibility(8);
                            this.f294909L.setEnabled(false);
                            this.f294921U.setVisibility(8);
                            this.f294923W.setVisibility(0);
                            this.f294923W.setProgress(gVar2.f301986e);
                            ProgressBar progressBar = this.f294923W;
                            String string = MMApplicationContext.getString(C0966R.string.c65);
                            C87412m.m108593f(string, "getString(R.string.emoji_download)");
                            String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(gVar2.f301986e)}, 1));
                            C87412m.m108593f(format, "format(format, *args)");
                            progressBar.setContentDescription(format);
                            View view5 = this.f294922V;
                            C9556a aVar3 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar3.mo10233c(0);
                            View view6 = view5;
                            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                            C117292a.m165359e(view6, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                        return;
                    } else if (i != 7) {
                        if (i != 8) {
                            switch (i) {
                                case 10:
                                    this.f294924X.setVisibility(8);
                                    this.f294910M.setBackgroundResource(C0966R.C0969drawable.f4665jf);
                                    this.f294910M.setVisibility(0);
                                    this.f294911N.setVisibility(0);
                                    this.f294911N.setText(C0966R.string.f360375c93);
                                    this.f294921U.setVisibility(4);
                                    this.f294909L.setEnabled(true);
                                    View view7 = this.f294922V;
                                    C9556a aVar4 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                                    aVar4.mo10233c(4);
                                    View view8 = view7;
                                    C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealLoadGoogleMarketFailView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                                    C117292a.m165359e(view8, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealLoadGoogleMarketFailView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    return;
                                case 11:
                                    this.f294924X.setVisibility(0);
                                    this.f294910M.setBackgroundResource(C0966R.C0969drawable.f4665jf);
                                    this.f294910M.setVisibility(0);
                                    this.f294911N.setVisibility(0);
                                    this.f294911N.setText("");
                                    this.f294909L.setEnabled(false);
                                    this.f294921U.setVisibility(4);
                                    View view9 = this.f294922V;
                                    C9556a aVar5 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                                    aVar5.mo10233c(4);
                                    View view10 = view9;
                                    C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealLoadingGoogleMarketView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                                    C117292a.m165359e(view10, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealLoadingGoogleMarketView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    return;
                                case 12:
                                    break;
                                default:
                                    Log.m105929w(this.f294918S0, "unknown product status:%d", Integer.valueOf(i));
                                    return;
                            }
                        } else {
                            this.f294924X.setVisibility(8);
                            this.f294910M.setBackgroundDrawable((Drawable) null);
                            this.f294910M.setVisibility(0);
                            this.f294909L.setEnabled(false);
                            this.f294911N.setVisibility(0);
                            this.f294911N.setText(C0966R.string.c8h);
                            this.f294921U.setVisibility(4);
                            View view11 = this.f294922V;
                            C9556a aVar6 = new C9556a();
                            ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                            aVar6.mo10233c(4);
                            View view12 = view11;
                            C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealExpiredView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                            C117292a.m165359e(view12, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealExpiredView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                    } else if (gVar.f301989h) {
                        C102562g gVar3 = this.f294920T0;
                        if (gVar3 != null) {
                            this.f294924X.setVisibility(8);
                            this.f294910M.setBackgroundResource(C0966R.C0969drawable.f4653j6);
                            this.f294910M.setVisibility(0);
                            this.f294910M.setTag(gVar3.f301983b.f298994d);
                            this.f294909L.setEnabled(true);
                            this.f294911N.setVisibility(0);
                            this.f294911N.setText(C0966R.string.c_a);
                            this.f294911N.setTextColor(this.f294899B.getResources().getColorStateList(C0966R.color.alc));
                            this.f294921U.setVisibility(4);
                            View view13 = this.f294922V;
                            C9556a aVar7 = new C9556a();
                            ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                            aVar7.mo10233c(4);
                            View view14 = view13;
                            C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealCurrentDownloadView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                            C117292a.m165359e(view14, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealCurrentDownloadView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                        return;
                    } else if (!gVar.f301991j || !C102561f.m135423c(gVar.f301983b.f299001n, 64)) {
                        this.f294924X.setVisibility(8);
                        this.f294910M.setVisibility(0);
                        this.f294910M.setBackgroundResource(C0966R.C0969drawable.f4665jf);
                        this.f294911N.setVisibility(0);
                        this.f294911N.setText(C0966R.string.c8g);
                        this.f294911N.setTextColor(this.f294899B.getResources().getColorStateList(C0966R.color.f3140go));
                        this.f294921U.setVisibility(4);
                        this.f294909L.setEnabled(false);
                        View view15 = this.f294922V;
                        C9556a aVar8 = new C9556a();
                        ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                        aVar8.mo10233c(4);
                        View view16 = view15;
                        C117292a.m165358d(view16, aVar8.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealDownloadedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view15.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                        C117292a.m165359e(view16, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealDownloadedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    } else {
                        this.f294910M.setVisibility(0);
                        this.f294910M.setBackgroundResource(C0966R.C0969drawable.f4663je);
                        this.f294911N.setVisibility(0);
                        this.f294911N.setText(C0966R.string.c9b);
                        this.f294911N.setTextColor(this.f294899B.getResources().getColorStateList(C0966R.color.alc));
                        this.f294921U.setVisibility(4);
                        this.f294909L.setEnabled(true);
                        View view17 = this.f294922V;
                        C9556a aVar9 = new C9556a();
                        ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
                        aVar9.mo10233c(4);
                        View view18 = view17;
                        C117292a.m165358d(view18, aVar9.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view17.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                        C117292a.m165359e(view18, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealRewardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                }
                C102562g gVar4 = this.f294920T0;
                if (gVar4 != null) {
                    this.f294924X.setVisibility(8);
                    this.f294910M.setBackgroundResource(C0966R.C0969drawable.f4665jf);
                    this.f294910M.setVisibility(0);
                    View view19 = this.f294922V;
                    C9556a aVar10 = new C9556a();
                    ThreadLocal<C9556a> threadLocal9 = C60958c.f173611a;
                    aVar10.mo10233c(4);
                    View view20 = view19;
                    C117292a.m165358d(view20, aVar10.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealWaitForPayView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view19.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                    C117292a.m165359e(view20, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealWaitForPayView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f294909L.setEnabled(true);
                    this.f294921U.setVisibility(4);
                    this.f294911N.setVisibility(0);
                    C101824o80 o802 = gVar4.f301983b;
                    if (o802 != null) {
                        C14123e.C14124a aVar11 = C14123e.f39523a;
                        if ((o802.f299001n & 512) == 512) {
                            this.f294911N.setText(aVar11.mo13542b(this.f294899B, o802.f298990A, "", -1));
                            TextView textView2 = this.f294911N;
                            String string2 = MMApplicationContext.getString(C0966R.string.ca8);
                            C87412m.m108593f(string2, "getString(R.string.emoji_wecoin_price_unit)");
                            String format2 = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(gVar4.f301983b.f298990A)}, 1));
                            C87412m.m108593f(format2, "format(format, *args)");
                            textView2.setContentDescription(format2);
                        } else {
                            this.f294911N.setText(o802.f298999i);
                            TextView textView3 = this.f294911N;
                            String string3 = MMApplicationContext.getString(C0966R.string.c7b);
                            C87412m.m108593f(string3, "getString(R.string.emoji_price_unit)");
                            String format3 = String.format(string3, Arrays.copyOf(new Object[]{this.f294911N.getText()}, 1));
                            C87412m.m108593f(format3, "format(format, *args)");
                            textView3.setContentDescription(format3);
                        }
                        this.f294911N.setTextColor(this.f294899B.getResources().getColorStateList(C0966R.color.alc));
                        this.f294910M.setBackgroundResource(C0966R.C0969drawable.f4653j6);
                    }
                }
            } else {
                mo140105z();
            }
        }
    }

    /* renamed from: d */
    public C102562g mo140087d() {
        return this.f294920T0;
    }

    /* renamed from: f */
    public void mo140088f(String str) {
        C87412m.m108594g(str, "productId");
        C102562g gVar = this.f294920T0;
        if (gVar != null) {
            gVar.mo142189b(-1);
            boolean z = C75592q0.m90796z();
            C93104c0 c0Var = this.f294916R0;
            C96984r2 b = c0Var != null ? c0Var.mo127610b(str) : null;
            C93116n.C93117a aVar = C93116n.f268258c;
            gVar.mo142188a(z, b, C93116n.f268259d.containsKey(str));
        }
    }

    /* renamed from: g */
    public void mo140089g(int i, String str) {
        C87412m.m108594g(str, "productId");
        C102562g gVar = this.f294920T0;
        if (gVar != null) {
            boolean z = false;
            if (i >= 0 && i < 100) {
                z = true;
            }
            if (z) {
                mo140103B(gVar, str, 6);
                gVar.f301986e = i;
            }
            if (i >= 100) {
                mo140103B(gVar, str, 7);
            }
            mo140086b();
        }
    }

    /* renamed from: y */
    public void mo140091y(C100684y yVar, List<Object> list) {
        C102562g gVar;
        boolean z;
        C101824o80 o802;
        C100684y yVar2 = yVar;
        C87412m.m108594g(yVar2, "item");
        C87412m.m108594g(list, "payloads");
        super.mo140091y(yVar, list);
        if (!list.isEmpty()) {
            mo140086b();
            return;
        }
        C100683x xVar = yVar2 instanceof C100683x ? (C100683x) yVar2 : null;
        if (xVar != null && (gVar = xVar.f294996a) != null) {
            this.f294920T0 = gVar;
            boolean z2 = false;
            if (this.f294902E) {
                gVar.f301991j = true;
                gVar.f301989h = true;
                gVar.f301990i = false;
            }
            gVar.f301990i = this.f294903F;
            C101754a80 a802 = gVar.f301984c;
            if (a802 == null) {
                View view = this.f294909L;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dellCellSet", "(Lcom/tencent/mm/plugin/emoji/adapter/data/EmotionItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dellCellSet", "(Lcom/tencent/mm/plugin/emoji/adapter/data/EmotionItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                z = false;
            } else {
                this.f294908K.setText(a802.f297839e);
                mo140104C(a802.f297845n);
                if (!Util.isNullOrNil(a802.f297844j)) {
                    C20828a b = C20828a.m22825b();
                    String str = a802.f297844j;
                    b.mo32519h(str, this.f294907J, C98601f.m128139d("", str));
                }
                if (!Util.isNullOrNil(a802.f297847p)) {
                    C20828a b2 = C20828a.m22825b();
                    String str2 = a802.f297847p;
                    b2.mo32519h(str2, this.f294912P, C98601f.m128139d("", str2));
                    this.f294912P.setVisibility(0);
                } else {
                    this.f294912P.setVisibility(8);
                }
                View view3 = this.f294909L;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dellCellSet", "(Lcom/tencent/mm/plugin/emoji/adapter/data/EmotionItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dellCellSet", "(Lcom/tencent/mm/plugin/emoji/adapter/data/EmotionItem;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                z = true;
            }
            if (!z && (o802 = gVar.f301983b) != null) {
                this.f294908K.setText(o802.f298996f);
                if (C101963g.m134218c(o802)) {
                    C20828a.m22825b().mo32518g("", this.f294907J);
                    this.f294907J.setImageResource(C0966R.C0969drawable.icon_002_cover);
                } else {
                    C20828a b3 = C20828a.m22825b();
                    String str3 = o802.f298995e;
                    b3.mo32519h(str3, this.f294907J, C98601f.m128139d(o802.f298994d, str3));
                }
                boolean c = C102561f.m135423c(o802.f299000j, 2);
                if (!TextUtils.isEmpty(o802.f299012y)) {
                    this.f294912P.setImageDrawable((Drawable) null);
                    this.f294912P.setVisibility(0);
                    C20828a b4 = C20828a.m22825b();
                    String str4 = o802.f299012y;
                    b4.mo32519h(str4, this.f294912P, C98601f.m128139d("", str4));
                } else if (c) {
                    this.f294912P.setVisibility(0);
                    this.f294912P.setImageResource(C0966R.C0969drawable.bfp);
                } else {
                    this.f294912P.setVisibility(8);
                }
                View view5 = this.f294913Q;
                int i = this.f294901D.contains(o802.f298994d) ? 0 : 8;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(Integer.valueOf(i));
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "onBind", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "onBind", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C101776f80 f802 = gVar.f301985d;
                if (f802 == null || !C102561f.m135421a(f802.f298242n)) {
                    mo140104C(!Util.isNullOrNil(o802.f299013z) ? o802.f299013z : o802.f299011x);
                } else {
                    String str5 = gVar.f301985d.f298230F;
                    this.f294915R.setVisibility(0);
                    this.f294917S.setVisibility(0);
                    this.f294917S.setText(str5);
                    View view7 = this.f294919T;
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(0);
                    View view8 = view7;
                    C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "setIntroduce", "(Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view8, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "setIntroduce", "(Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                mo140086b();
                this.f294906I.setBackgroundResource(C0966R.C0969drawable.f4859pe);
                if (((C100683x) yVar2).f294997b) {
                    this.f294905H.setBackground(this.f294928x0);
                } else {
                    this.f294905H.setBackground(this.f294929y0);
                }
                this.f294909L.setOnClickListener(new C100667a(this, yVar2));
                C101792j80 j802 = o802.f298993D;
                if (EmojiLogic.m117490u(j802)) {
                    View view9 = this.f294925Y;
                    C9556a aVar5 = new C9556a();
                    aVar5.mo10233c(0);
                    View view10 = view9;
                    C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "onBind", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view10, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "onBind", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    String str6 = j802.f298503e;
                    if (str6 == null || str6.length() == 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        C99101e eVar = C99101e.f290570a;
                        C99099a aVar6 = C99101e.f290571b;
                        String str7 = j802.f298503e;
                        C87412m.m108593f(str7, "link.IconUrl");
                        C99344b<String, Bitmap> e = aVar6.mo85955a(str7);
                        C100075f.C100076a aVar7 = new C100075f.C100076a();
                        aVar7.f293176b = true;
                        e.f291319c = aVar7.mo139398a();
                        ((C99342a) e).mo85954d(this.f294927p0);
                        this.f294926Z.setText(j802.f298504f);
                    }
                    this.f294915R.setVisibility(8);
                    return;
                }
                View view11 = this.f294925Y;
                C9556a aVar8 = new C9556a();
                aVar8.mo10233c(8);
                View view12 = view11;
                C117292a.m165358d(view12, aVar8.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "onBind", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view12, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "onBind", "(Lcom/tencent/mm/plugin/emoji/ui/v3/model/IEmojiStoreTypeItem;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: z */
    public void mo140105z() {
        this.f294924X.setVisibility(8);
        this.f294910M.setBackgroundResource(C0966R.C0969drawable.f4653j6);
        this.f294910M.setVisibility(0);
        this.f294909L.setEnabled(true);
        this.f294911N.setText("");
        View view = this.f294922V;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealWaitForDownloadView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder", "dealWaitForDownloadView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f294911N.setVisibility(0);
        this.f294911N.setText(C0966R.string.c8e);
        this.f294911N.setTextColor(this.f294899B.getResources().getColorStateList(C0966R.color.alc));
        this.f294921U.setVisibility(8);
    }
}
