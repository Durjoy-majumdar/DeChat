package com.tencent.p014mm.plugin.radar.p091ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.radar.model.RadarAddContact;
import com.tencent.p014mm.plugin.radar.p091ui.RadarMemberView;
import com.tencent.p014mm.pluginsdk.model.lbs.Location;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import eg2.C75615f;
import eg2.C75617h;
import f40.C86709a0;
import f62.C75700k0;
import f62.C75707s0;
import fg2.C75746a0;
import fg2.C75748b;
import fg2.C75749c;
import fg2.C75751c0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C76879j;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49870im3;
import te3.C50011jm3;
import te3.C64496km3;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003:;<B\u001b\u0012\u0006\u00105\u001a\u000204\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106¢\u0006\u0004\b8\u00109R\u001b\u0010\t\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0002¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010+R$\u00103\u001a\u00020-2\u0006\u0010.\u001a\u00020-8\u0006@BX\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u0006="}, mo182094d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarViewController;", "Landroid/widget/RelativeLayout;", "Leg2/h$c;", "Lcom/tencent/mm/plugin/radar/model/RadarAddContact$b;", "Lcom/tencent/mm/plugin/radar/ui/RadarWaveView;", "d", "Lrx3/g;", "getWaveView", "()Lcom/tencent/mm/plugin/radar/ui/RadarWaveView;", "waveView", "Lcom/tencent/mm/plugin/radar/ui/RadarMemberView;", "e", "getMemberDetailView", "()Lcom/tencent/mm/plugin/radar/ui/RadarMemberView;", "memberDetailView", "Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView;", "f", "getGrid", "()Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView;", "grid", "Lcom/tencent/mm/plugin/radar/ui/RadarTipsView;", "g", "getRadarTips", "()Lcom/tencent/mm/plugin/radar/ui/RadarTipsView;", "radarTips", "Landroid/widget/TextView;", "h", "getNewRadarTip", "()Landroid/widget/TextView;", "newRadarTip", "Landroid/widget/ProgressBar;", "i", "getNewRadarTipLoading", "()Landroid/widget/ProgressBar;", "newRadarTipLoading", "Landroid/widget/Button;", "j", "getQuitBtn", "()Landroid/widget/Button;", "quitBtn", "Landroid/view/View;", "n", "getRadarBgMask", "()Landroid/view/View;", "radarBgMask", "Leg2/h$d;", "<set-?>", "r", "Leg2/h$d;", "getRadarStatus", "()Leg2/h$d;", "radarStatus", "Landroid/content/Context;", "mContext", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "c", "plugin-radar_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.radar.ui.RadarViewController */
public final class RadarViewController extends RelativeLayout implements C75617h.C75619c, RadarAddContact.C70377b {

    /* renamed from: w */
    public static final /* synthetic */ int f203346w = 0;

    /* renamed from: d */
    public final C13601g f203347d = C36568h.m40985a(new C70399g(this));

    /* renamed from: e */
    public final C13601g f203348e = C75751c0.m91019a(this, C0966R.C0970id.ibg);

    /* renamed from: f */
    public final C13601g f203349f = C75751c0.m91019a(this, C0966R.C0970id.ibv);

    /* renamed from: g */
    public final C13601g f203350g = C75751c0.m91019a(this, C0966R.C0970id.ibx);

    /* renamed from: h */
    public final C13601g f203351h = C75751c0.m91019a(this, C0966R.C0970id.ibl);

    /* renamed from: i */
    public final C13601g f203352i = C75751c0.m91019a(this, C0966R.C0970id.ibm);

    /* renamed from: j */
    public final C13601g f203353j = C75751c0.m91019a(this, C0966R.C0970id.ibp);

    /* renamed from: n */
    public final C13601g f203354n = C75751c0.m91019a(this, C0966R.C0970id.iba);

    /* renamed from: o */
    public C75617h f203355o;

    /* renamed from: p */
    public RadarAddContact f203356p;

    /* renamed from: q */
    public C70392b f203357q;

    /* renamed from: r */
    public C75617h.C75620d f203358r = C75617h.C75620d.SEARCHING;

    /* renamed from: s */
    public boolean f203359s;

    /* renamed from: t */
    public final View.OnClickListener f203360t = new C70397e(this);

    /* renamed from: u */
    public final int f203361u = 33554433;

    /* renamed from: v */
    public final int f203362v = 33554434;

    /* renamed from: com.tencent.mm.plugin.radar.ui.RadarViewController$a */
    public final class C70390a {

        /* renamed from: a */
        public int f203363a;

        /* renamed from: b */
        public final boolean f203364b;

        /* renamed from: c */
        public final C70391a f203365c;

        /* renamed from: com.tencent.mm.plugin.radar.ui.RadarViewController$a$a */
        public static final class C70391a extends MMHandler {

            /* renamed from: a */
            public final /* synthetic */ C70390a f203367a;

            public C70391a(C70390a aVar) {
                this.f203367a = aVar;
            }

            public void handleMessage(Message message) {
                C87412m.m108594g(message, "msg");
                Object obj = message.obj;
                if (obj instanceof View) {
                    C87412m.m108592e(obj, "null cannot be cast to non-null type android.view.View");
                    View view = (View) obj;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarViewController$AvatarAnimator$delayShowHandler$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/radar/ui/RadarViewController$AvatarAnimator$delayShowHandler$1", "handleMessage", "(Landroid/os/Message;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.clearAnimation();
                    C70390a aVar2 = this.f203367a;
                    if (!aVar2.f203364b) {
                        Object tag = view.getTag(RadarViewController.this.f203362v);
                        Animation animation = tag instanceof Animation ? (Animation) tag : null;
                        if (animation == null) {
                            animation = this.f203367a.mo96969a();
                        }
                        view.startAnimation(animation);
                    }
                }
            }
        }

        public C70390a() {
            Context context = RadarViewController.this.getContext();
            C87412m.m108593f(context, "context");
            this.f203364b = context.getResources().getDisplayMetrics().densityDpi <= 240;
            this.f203365c = new C70391a(this);
        }

        /* renamed from: a */
        public final Animation mo96969a() {
            Animation loadAnimation = AnimationUtils.loadAnimation(RadarViewController.this.getContext(), C0966R.C0968anim.f2480e4);
            C87412m.m108593f(loadAnimation, "loadAnimation(context, R.anim.radar_user_turn_out)");
            return loadAnimation;
        }

        /* renamed from: b */
        public final void mo96970b(int i, View view) {
            C87412m.m108594g(view, "view");
            Message obtainMessage = this.f203365c.obtainMessage();
            Object tag = view.getTag(RadarViewController.this.f203361u);
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            obtainMessage.what = num != null ? num.intValue() : -1;
            obtainMessage.obj = view;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarViewController$AvatarAnimator", "show", "(ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/radar/ui/RadarViewController$AvatarAnimator", "show", "(ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f203365c.sendMessageDelayed(obtainMessage, (long) ((i + 1) * 500));
        }
    }

    /* renamed from: com.tencent.mm.plugin.radar.ui.RadarViewController$b */
    public final class C70392b extends C75748b {

        /* renamed from: d */
        public final Context f203368d;

        /* renamed from: e */
        public C64496km3[] f203369e = new C64496km3[12];

        /* renamed from: f */
        public HashMap<String, String> f203370f = new HashMap<>();

        /* renamed from: g */
        public HashMap<String, Integer> f203371g = new HashMap<>();

        /* renamed from: h */
        public final C70390a f203372h;

        /* renamed from: i */
        public int f203373i;

        /* renamed from: j */
        public HashMap<String, View> f203374j = new HashMap<>();

        /* renamed from: k */
        public final /* synthetic */ RadarViewController f203375k;

        /* renamed from: com.tencent.mm.plugin.radar.ui.RadarViewController$b$a */
        public final class C70393a {

            /* renamed from: a */
            public TextView f203376a;

            /* renamed from: b */
            public ImageView f203377b;

            /* renamed from: c */
            public RadarStateView f203378c;

            /* renamed from: d */
            public RadarStateChooseView f203379d;

            /* renamed from: e */
            public ImageView f203380e;

            public C70393a(C70392b bVar, TextView textView, ImageView imageView, RadarStateView radarStateView, RadarStateChooseView radarStateChooseView, ImageView imageView2) {
                C87412m.m108594g(textView, "tvMemberName");
                C87412m.m108594g(imageView, "ivMemberAvatar");
                C87412m.m108594g(radarStateView, "vMemberState");
                C87412m.m108594g(radarStateChooseView, "vMemberChooseState");
                C87412m.m108594g(imageView2, "ivMemberAvatarMask");
                this.f203376a = textView;
                this.f203377b = imageView;
                this.f203378c = radarStateView;
                this.f203379d = radarStateChooseView;
                this.f203380e = imageView2;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C70392b(RadarViewController radarViewController, RadarSpecialGridView radarSpecialGridView, Context context) {
            super(radarSpecialGridView, context);
            C87412m.m108594g(radarSpecialGridView, "radarGridView");
            C87412m.m108594g(context, "context");
            this.f203375k = radarViewController;
            this.f203368d = context;
            this.f203372h = new C70390a();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.String} */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
            if ((r2 == null || z04.C112551y.m153811k(r2)) != false) goto L_0x0024;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0027 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo96971b(te3.C64496km3 r4) {
            /*
                r3 = this;
                r0 = 0
                r1 = 1
                if (r4 == 0) goto L_0x0024
                java.lang.String r2 = r4.f183957d
                if (r2 == 0) goto L_0x0011
                boolean r2 = z04.C112551y.m153811k(r2)
                if (r2 == 0) goto L_0x000f
                goto L_0x0011
            L_0x000f:
                r2 = 0
                goto L_0x0012
            L_0x0011:
                r2 = 1
            L_0x0012:
                if (r2 == 0) goto L_0x0025
                java.lang.String r2 = r4.f183961h
                if (r2 == 0) goto L_0x0021
                boolean r2 = z04.C112551y.m153811k(r2)
                if (r2 == 0) goto L_0x001f
                goto L_0x0021
            L_0x001f:
                r2 = 0
                goto L_0x0022
            L_0x0021:
                r2 = 1
            L_0x0022:
                if (r2 == 0) goto L_0x0025
            L_0x0024:
                r0 = 1
            L_0x0025:
                if (r0 == 0) goto L_0x0028
                return
            L_0x0028:
                gy3.C87412m.m108591d(r4)
                java.lang.String r0 = r4.f183957d
                if (r0 != 0) goto L_0x0035
                java.lang.String r0 = r4.f183961h
                if (r0 != 0) goto L_0x0035
                java.lang.String r0 = ""
            L_0x0035:
                com.tencent.mm.plugin.radar.ui.RadarViewController r4 = r3.f203375k
                eg2.h r4 = r4.f203355o
                r1 = 0
                java.lang.String r2 = "radarManager"
                if (r4 == 0) goto L_0x0069
                java.util.Map<java.lang.String, java.lang.String> r4 = r4.f222150o
                boolean r4 = r4.containsKey(r0)
                if (r4 == 0) goto L_0x0063
                com.tencent.mm.plugin.radar.ui.RadarViewController r4 = r3.f203375k
                eg2.h r4 = r4.f203355o
                if (r4 == 0) goto L_0x005f
                java.util.Map<java.lang.String, java.lang.String> r4 = r4.f222150o
                java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
                java.lang.Object r4 = r4.get(r0)
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
                gy3.C87412m.m108592e(r4, r0)
                r0 = r4
                java.lang.String r0 = (java.lang.String) r0
                goto L_0x0063
            L_0x005f:
                gy3.C87412m.m108603p(r2)
                throw r1
            L_0x0063:
                java.util.HashMap<java.lang.String, java.lang.String> r4 = r3.f203370f
                r4.put(r0, r0)
                return
            L_0x0069:
                gy3.C87412m.m108603p(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.radar.p091ui.RadarViewController.C70392b.mo96971b(te3.km3):void");
        }

        /* renamed from: c */
        public final View mo96972c(View view, int i) {
            View view2;
            int i2 = i;
            if (view == null) {
                view2 = View.inflate(this.f203368d, C0966R.C0971layout.bpd, (ViewGroup) null);
                C87412m.m108591d(view2);
                int i3 = this.f203375k.f203361u;
                C70390a aVar = this.f203372h;
                int i4 = aVar.f203363a + 1;
                aVar.f203363a = i4;
                view2.setTag(i3, Integer.valueOf(i4));
                view2.setTag(this.f203375k.f203362v, this.f203372h.mo96969a());
            } else {
                view2 = view;
            }
            View findViewById = view2.findViewById(C0966R.C0970id.ibq);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = view2.findViewById(C0966R.C0970id.ibr);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            C117292a.m165358d(findViewById2, aVar3.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById3 = view2.findViewById(C0966R.C0970id.ibs);
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(4);
            C117292a.m165358d(findViewById3, aVar4.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById3, "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById4 = view2.findViewById(C0966R.C0970id.ibk);
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(4);
            C117292a.m165358d(findViewById4, aVar5.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById4, "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById5 = view2.findViewById(C0966R.C0970id.ibj);
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(4);
            C117292a.m165358d(findViewById5, aVar6.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById5, "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (i2 == 7 || i2 % 3 == 1) {
                View findViewById6 = view2.findViewById(C0966R.C0970id.ahr);
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(0);
                View view3 = findViewById6;
                C117292a.m165358d(view3, aVar7.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById6.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById7 = view2.findViewById(C0966R.C0970id.f359409ks1);
                C9556a aVar8 = new C9556a();
                aVar8.mo10233c(8);
                View view4 = findViewById7;
                C117292a.m165358d(view4, aVar8.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById7.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View findViewById8 = view2.findViewById(C0966R.C0970id.f359409ks1);
                C9556a aVar9 = new C9556a();
                aVar9.mo10233c(0);
                View view5 = findViewById8;
                C117292a.m165358d(view5, aVar9.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById8.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById9 = view2.findViewById(C0966R.C0970id.ahr);
                C9556a aVar10 = new C9556a();
                aVar10.mo10233c(8);
                View view6 = findViewById9;
                C117292a.m165358d(view6, aVar10.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById9.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            return view2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.radar.ui.RadarViewController$c */
    public final class C70394c {
        public C70394c(RadarViewController radarViewController, C64496km3 km32) {
            C87412m.m108594g(km32, "member");
        }
    }

    /* renamed from: com.tencent.mm.plugin.radar.ui.RadarViewController$d */
    public static final class C70395d implements RadarMemberView.C70382a {

        /* renamed from: a */
        public final /* synthetic */ RadarViewController f203381a;

        /* renamed from: com.tencent.mm.plugin.radar.ui.RadarViewController$d$a */
        public /* synthetic */ class C70396a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f203382a;

            static {
                int[] iArr = new int[RadarAddContact.C70378d.values().length];
                iArr[0] = 1;
                iArr[3] = 2;
                f203382a = iArr;
            }
        }

        public C70395d(RadarViewController radarViewController) {
            this.f203381a = radarViewController;
        }

        /* renamed from: a */
        public void mo96931a(C64496km3 km32, RadarAddContact.C70378d dVar) {
            String str;
            if (km32 != null) {
                str = km32.f183957d;
                if (str == null && (str = km32.f183961h) == null) {
                    str = "";
                }
            } else {
                str = null;
            }
            C70392b bVar = this.f203381a.f203357q;
            if (bVar != null) {
                View view = bVar.f203374j.get(str);
                if (view != null) {
                    Object tag = view.getTag();
                    C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.radar.ui.RadarViewController.RadarSearchAdapter.ViewHolder");
                    C70392b.C70393a aVar = (C70392b.C70393a) tag;
                    if (dVar != RadarAddContact.C70378d.Stranger) {
                        aVar.f203378c.mo66964c();
                    }
                }
                this.f203381a.getWaveView().mo96975a();
                return;
            }
            C87412m.m108603p("adapter");
            throw null;
        }

        /* renamed from: b */
        public void mo96932b(C64496km3 km32, RadarAddContact.C70378d dVar) {
            String str;
            long j;
            RadarAddContact.C70378d dVar2 = RadarAddContact.C70378d.Verifying;
            C87412m.m108594g(km32, "member");
            String str2 = km32.f183957d;
            if (str2 == null && (str2 = km32.f183961h) == null) {
                str2 = "";
            }
            int i = dVar == null ? -1 : C70396a.f203382a[dVar.ordinal()];
            if (i == 1) {
                long c = this.f203381a.f203356p.mo96911c(str2);
                C75617h hVar = this.f203381a.f203355o;
                if (hVar != null) {
                    hVar.f222153r.put(Long.valueOf(c), new C75617h.C75618b(km32, dVar));
                    this.f203381a.mo96967p(str2, dVar2);
                    return;
                }
                C87412m.m108603p("radarManager");
                throw null;
            } else if (i == 2) {
                RadarAddContact radarAddContact = this.f203381a.f203356p;
                radarAddContact.getClass();
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str2);
                String username = z1Var.getUsername();
                if (username == null || C112551y.m153811k(username)) {
                    str = str2;
                } else {
                    str = z1Var.getUsername();
                    C87412m.m108593f(str, "contact.username");
                }
                String str3 = radarAddContact.f203280g.get(str);
                if (str3 == null || C112551y.m153811k(str3)) {
                    Log.m105921e("MicroMsg.RadarAddContact", "Verify Contact username(%s) error, verifyTicket is null", str);
                    radarAddContact.mo96911c(str);
                    j = -1;
                } else {
                    C72963f4.C72971h v = C72963f4.C72971h.m85668v(str3);
                    long currentTimeMillis = System.currentTimeMillis();
                    RadarAddContact.C42801a aVar = new RadarAddContact.C42801a(new C75615f(str3, radarAddContact, currentTimeMillis));
                    String str4 = v.f212756t;
                    C87412m.m108593f(str4, "verify.verifyTicket");
                    aVar.mo66956c(str, str4, 48);
                    j = currentTimeMillis;
                }
                C75617h hVar2 = this.f203381a.f203355o;
                if (hVar2 != null) {
                    hVar2.f222153r.put(Long.valueOf(j), new C75617h.C75618b(km32, dVar));
                    this.f203381a.mo96967p(str2, dVar2);
                    return;
                }
                C87412m.m108603p("radarManager");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.radar.ui.RadarViewController$e */
    public static final class C70397e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RadarViewController f203383d;

        public C70397e(RadarViewController radarViewController) {
            this.f203383d = radarViewController;
        }

        public final void onClick(View view) {
            C75617h.C75620d dVar = C75617h.C75620d.SEARCH_RETRUN;
            C75617h.C75620d dVar2 = C75617h.C75620d.SEARCHING;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/radar/ui/RadarViewController$mOnQuitActionButtonListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f203383d.getRadarStatus() == dVar2 || this.f203383d.getRadarStatus() == dVar) {
                Context context = this.f203383d.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).finish();
            } else {
                RadarViewController radarViewController = this.f203383d;
                C70392b bVar = radarViewController.f203357q;
                if (bVar != null) {
                    LinkedList linkedList = new LinkedList();
                    for (C64496km3 km32 : bVar.f203369e) {
                        if (km32 != null) {
                            linkedList.add(km32);
                        }
                    }
                    if (radarViewController.mo96961k(linkedList)) {
                        this.f203383d.getWaveView().mo96975a();
                        this.f203383d.getWaveView().setVisibility(0);
                        C75617h hVar = this.f203383d.f203355o;
                        if (hVar != null) {
                            hVar.mo105968f();
                            this.f203383d.mo96968q(dVar);
                        } else {
                            C87412m.m108603p("radarManager");
                            throw null;
                        }
                    } else {
                        this.f203383d.mo96968q(dVar2);
                    }
                    C70392b bVar2 = this.f203383d.f203357q;
                    if (bVar2 != null) {
                        bVar2.mo106065a();
                    } else {
                        C87412m.m108603p("adapter");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("adapter");
                    throw null;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/radar/ui/RadarViewController$mOnQuitActionButtonListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.radar.ui.RadarViewController$f */
    public static final class C70398f implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RadarViewController f203384d;

        public C70398f(RadarViewController radarViewController) {
            this.f203384d = radarViewController;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            LocationUtil.jumpToOpenGps(this.f203384d.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.radar.ui.RadarViewController$g */
    public static final class C70399g extends C87413o implements C32224a<RadarWaveView> {

        /* renamed from: d */
        public final /* synthetic */ RadarViewController f203385d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C70399g(RadarViewController radarViewController) {
            super(0);
            this.f203385d = radarViewController;
        }

        public Object invoke() {
            Context context = this.f203385d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            return (RadarWaveView) ((Activity) context).findViewById(C0966R.C0970id.f359002ic0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadarViewController(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "mContext");
        Context applicationContext = context.getApplicationContext();
        C87412m.m108593f(applicationContext, "mContext.getApplicationContext()");
        this.f203355o = new C75617h(this, applicationContext);
        this.f203356p = new RadarAddContact(this, context);
    }

    private final RadarSpecialGridView getGrid() {
        return (RadarSpecialGridView) this.f203349f.getValue();
    }

    /* access modifiers changed from: private */
    public final RadarMemberView getMemberDetailView() {
        return (RadarMemberView) this.f203348e.getValue();
    }

    private final TextView getNewRadarTip() {
        return (TextView) this.f203351h.getValue();
    }

    private final ProgressBar getNewRadarTipLoading() {
        return (ProgressBar) this.f203352i.getValue();
    }

    private final Button getQuitBtn() {
        return (Button) this.f203353j.getValue();
    }

    private final View getRadarBgMask() {
        return (View) this.f203354n.getValue();
    }

    private final RadarTipsView getRadarTips() {
        return (RadarTipsView) this.f203350g.getValue();
    }

    /* access modifiers changed from: private */
    public final RadarWaveView getWaveView() {
        Object value = ((C36570n) this.f203347d).getValue();
        C87412m.m108593f(value, "<get-waveView>(...)");
        return (RadarWaveView) value;
    }

    /* renamed from: a */
    public void mo96956a(int i, int i2, LinkedList<C64496km3> linkedList, int i3) {
        if (i == 0 && i2 == 0) {
            mo96963m(linkedList);
            return;
        }
        Log.m105921e("MicroMsg.Radar.RadarViewController", "radar member return error : %s, type : %s ", Integer.valueOf(i2), Integer.valueOf(i));
        if (2 == i) {
            RadarTipsView radarTips = getRadarTips();
            String string = getContext().getString(C0966R.string.f360087a11);
            C87412m.m108593f(string, "context.getString(com.te….app_network_unavailable)");
            radarTips.mo96950d(string);
            return;
        }
        RadarTipsView radarTips2 = getRadarTips();
        String string2 = getContext().getString(C0966R.string.hr7);
        C87412m.m108593f(string2, "context.getString(R.string.radar_tips_network_err)");
        radarTips2.mo96950d(string2);
    }

    /* renamed from: b */
    public void mo96916b(boolean z, String str, String str2, long j) {
        if (z) {
            mo96967p(str2, RadarAddContact.C70378d.Added);
        } else {
            RadarTipsView radarTips = getRadarTips();
            String str3 = "";
            if (str == null) {
                str = str3;
            }
            radarTips.mo96950d(str);
            C75617h hVar = this.f203355o;
            if (hVar != null) {
                C75617h.C75618b bVar = (C75617h.C75618b) ((LinkedHashMap) hVar.f222153r).get(Long.valueOf(j));
                if (bVar != null) {
                    C64496km3 km32 = bVar.f222158a;
                    C87412m.m108594g(km32, "member");
                    String str4 = km32.f183957d;
                    if (str4 == null) {
                        String str5 = km32.f183961h;
                        if (str5 != null) {
                            str3 = str5;
                        }
                    } else {
                        str3 = str4;
                    }
                    mo96967p(str3, bVar.f222159b);
                }
            } else {
                C87412m.m108603p("radarManager");
                throw null;
            }
        }
        C75617h hVar2 = this.f203355o;
        if (hVar2 != null) {
            hVar2.f222153r.remove(Long.valueOf(j));
        } else {
            C87412m.m108603p("radarManager");
            throw null;
        }
    }

    /* renamed from: c */
    public void mo96917c(C72996z1 z1Var) {
        RadarAddContact.C70378d dVar = RadarAddContact.C70378d.Added;
        C87412m.m108594g(z1Var, "contact");
        if (getMemberDetailView().getVisibility() == 0) {
            RadarMemberView memberDetailView = getMemberDetailView();
            String v2 = z1Var.mo73978v2();
            C87412m.m108593f(v2, "contact.encryptUsername");
            memberDetailView.mo96925g(v2, dVar);
        }
        mo96967p(z1Var.getUsername(), dVar);
        mo96967p(z1Var.mo73978v2(), dVar);
    }

    /* renamed from: d */
    public void mo96957d(boolean z, Location location) {
        if (!z) {
            RadarTipsView radarTips = getRadarTips();
            String string = getContext().getString(C0966R.string.hr6);
            C87412m.m108593f(string, "context.getString(R.stri….radar_tips_location_err)");
            radarTips.mo96950d(string);
            if (!this.f203359s && !LocationUtil.isGpsEnable()) {
                this.f203359s = true;
                C76879j.m92709C(getContext(), getContext().getString(C0966R.string.fez), getContext().getString(C0966R.string.a3h), getContext().getString(C0966R.string.fyd), getContext().getString(C0966R.string.f7926wf), false, new C70398f(this), (DialogInterface.OnClickListener) null);
            }
        }
    }

    /* renamed from: e */
    public void mo96958e(int i, int i2, LinkedList<C49870im3> linkedList, int i3) {
        String str;
        if (i == 0 && i2 == 0 && linkedList != null) {
            mo96968q(C75617h.C75620d.RALATIONCHAIN_RETRUN);
            C70392b bVar = this.f203357q;
            if (bVar != null) {
                C75617h hVar = bVar.f203375k.f203355o;
                if (hVar != null) {
                    ((LinkedHashMap) hVar.f222154s).clear();
                    C75617h hVar2 = bVar.f203375k.f203355o;
                    if (hVar2 != null) {
                        ((LinkedHashMap) hVar2.f222150o).clear();
                        bVar.f203370f.clear();
                        bVar.f203371g.clear();
                        if (linkedList.size() > 0) {
                            LinkedList linkedList2 = new LinkedList();
                            int size = linkedList.size();
                            int i4 = 0;
                            int i5 = 0;
                            while (true) {
                                String str2 = "";
                                if (i5 < size) {
                                    C49870im3 im32 = linkedList.get(i5);
                                    C87412m.m108593f(im32, "radarChatMember[i]");
                                    C49870im3 im33 = im32;
                                    C50011jm3 jm32 = new C50011jm3();
                                    jm32.f136204d = im33.f135503d;
                                    linkedList2.add(jm32);
                                    C75617h hVar3 = bVar.f203375k.f203355o;
                                    if (hVar3 != null) {
                                        Map<String, String> map = hVar3.f222150o;
                                        String str3 = im33.f135505f;
                                        C87412m.m108593f(str3, "radarchatroomMember.EncodeUserName");
                                        String str4 = im33.f135503d;
                                        C87412m.m108593f(str4, "radarchatroomMember.UserName");
                                        map.put(str3, str4);
                                        HashMap<String, Integer> hashMap = bVar.f203371g;
                                        String str5 = im33.f135505f;
                                        if (str5 == null) {
                                            String str6 = im33.f135503d;
                                            if (str6 != null) {
                                                str2 = str6;
                                            }
                                        } else {
                                            str2 = str5;
                                        }
                                        hashMap.put(str2, 0);
                                        i5++;
                                    } else {
                                        C87412m.m108603p("radarManager");
                                        throw null;
                                    }
                                } else {
                                    int length = bVar.f203369e.length;
                                    while (i4 < length) {
                                        C64496km3 km32 = bVar.f203369e[i4];
                                        C75617h hVar4 = bVar.f203375k.f203355o;
                                        if (hVar4 != null) {
                                            Map<String, String> map2 = hVar4.f222150o;
                                            if (km32 == null || ((str = km32.f183961h) == null && (str = km32.f183957d) == null)) {
                                                str = str2;
                                            }
                                            if (!Util.isNullOrNil((String) ((LinkedHashMap) map2).get(str))) {
                                                C70392b bVar2 = bVar.f203375k.f203357q;
                                                if (bVar2 != null) {
                                                    bVar2.mo96971b(km32);
                                                    C75617h hVar5 = bVar.f203375k.f203355o;
                                                    if (hVar5 != null) {
                                                        hVar5.mo105967e(km32);
                                                    } else {
                                                        C87412m.m108603p("radarManager");
                                                        throw null;
                                                    }
                                                } else {
                                                    C87412m.m108603p("adapter");
                                                    throw null;
                                                }
                                            }
                                            i4++;
                                        } else {
                                            C87412m.m108603p("radarManager");
                                            throw null;
                                        }
                                    }
                                }
                            }
                        }
                        if (bVar.f203375k.f203355o != null) {
                            C70392b bVar3 = this.f203357q;
                            if (bVar3 != null) {
                                bVar3.mo106065a();
                            } else {
                                C87412m.m108603p("adapter");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("radarManager");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("radarManager");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("radarManager");
                    throw null;
                }
            } else {
                C87412m.m108603p("adapter");
                throw null;
            }
        } else {
            mo96968q(C75617h.C75620d.SEARCHING);
            RadarTipsView radarTips = getRadarTips();
            String string = getContext().getString(C0966R.string.hr7);
            C87412m.m108593f(string, "context.getString(R.string.radar_tips_network_err)");
            radarTips.mo96950d(string);
        }
    }

    /* renamed from: f */
    public void mo96918f(C72996z1 z1Var) {
        RadarAddContact.C70378d dVar = RadarAddContact.C70378d.NeedVerify;
        C87412m.m108594g(z1Var, "contact");
        C75617h hVar = this.f203355o;
        if (hVar != null) {
            String username = z1Var.getUsername();
            C87412m.m108593f(username, "contact.username");
            boolean z = false;
            if (hVar.mo105964b(username, false) == null) {
                C75617h hVar2 = this.f203355o;
                if (hVar2 != null) {
                    String v2 = z1Var.mo73978v2();
                    C87412m.m108593f(v2, "contact.encryptUsername");
                    if (hVar2.mo105964b(v2, false) == null) {
                        LinkedList linkedList = new LinkedList();
                        String username2 = z1Var.getUsername();
                        C87412m.m108593f(username2, "contact.username");
                        String v25 = z1Var.mo73978v2();
                        C87412m.m108593f(v25, "contact.encryptUsername");
                        String nickname = z1Var.getNickname();
                        C87412m.m108593f(nickname, "contact.nickname");
                        C64496km3 km32 = new C64496km3();
                        km32.f183958e = 100;
                        km32.f183957d = username2;
                        km32.f183959f = nickname;
                        km32.f183960g = "";
                        km32.f183961h = v25;
                        linkedList.add(km32);
                        mo96963m(linkedList);
                    }
                } else {
                    C87412m.m108603p("radarManager");
                    throw null;
                }
            }
            if (getMemberDetailView().getVisibility() == 0) {
                z = true;
            }
            if (z) {
                RadarMemberView memberDetailView = getMemberDetailView();
                String v26 = z1Var.mo73978v2();
                C87412m.m108593f(v26, "contact.encryptUsername");
                memberDetailView.mo96925g(v26, dVar);
            }
            mo96967p(z1Var.getUsername(), dVar);
            mo96967p(z1Var.mo73978v2(), dVar);
            return;
        }
        C87412m.m108603p("radarManager");
        throw null;
    }

    /* renamed from: g */
    public void mo96919g(boolean z, boolean z2, String str, String str2, long j) {
        if (z) {
            mo96967p(str2, RadarAddContact.C70378d.Added);
        } else if (z2) {
            mo96967p(str2, RadarAddContact.C70378d.Verifying);
        } else {
            RadarTipsView radarTips = getRadarTips();
            String str3 = "";
            if (str == null) {
                str = str3;
            }
            radarTips.mo96950d(str);
            C75617h hVar = this.f203355o;
            if (hVar != null) {
                C75617h.C75618b bVar = (C75617h.C75618b) ((LinkedHashMap) hVar.f222153r).get(Long.valueOf(j));
                if (bVar != null) {
                    C64496km3 km32 = bVar.f222158a;
                    C87412m.m108594g(km32, "member");
                    String str4 = km32.f183957d;
                    if (str4 == null && (str4 = km32.f183961h) == null) {
                        str4 = str3;
                    }
                    mo96967p(str4, bVar.f222159b);
                    C64496km3 km33 = bVar.f222158a;
                    if (km33 != null) {
                        String str5 = km33.f183961h;
                        if (str5 == null) {
                            String str6 = km33.f183957d;
                            if (str6 != null) {
                                str3 = str6;
                            }
                        } else {
                            str3 = str5;
                        }
                    }
                    mo96967p(str3, bVar.f222159b);
                }
            } else {
                C87412m.m108603p("radarManager");
                throw null;
            }
        }
        C75617h hVar2 = this.f203355o;
        if (hVar2 != null) {
            hVar2.f222153r.remove(Long.valueOf(j));
        } else {
            C87412m.m108603p("radarManager");
            throw null;
        }
    }

    public final C75617h.C75620d getRadarStatus() {
        return this.f203358r;
    }

    /* renamed from: j */
    public final void mo96960j() {
        View findViewById = findViewById(C0966R.C0970id.ibf);
        C87412m.m108593f(findViewById, "findViewById(R.id.radar_main_layer)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById;
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Context context = getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        layoutParams2.width = displayMetrics.widthPixels;
        relativeLayout.setLayoutParams(layoutParams2);
        getRadarTips().mo96949c();
        RadarTipsView radarTips = getRadarTips();
        radarTips.f203340q.sendEmptyMessageDelayed(radarTips.f203337n, (long) 1000);
        radarTips.f203340q.sendEmptyMessageDelayed(radarTips.f203336j, (long) 9000);
        getRadarTips().setPressingDown(true);
        getQuitBtn().setOnClickListener(this.f203360t);
        ViewGroup.LayoutParams layoutParams3 = getQuitBtn().getLayoutParams();
        C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
        int i = layoutParams4.topMargin;
        if (C85875k4.m106205t(getContext(), false)) {
            i += C85875k4.m106198o(getContext());
        }
        layoutParams4.setMargins(layoutParams4.leftMargin, i, layoutParams4.rightMargin, layoutParams4.bottomMargin);
        getQuitBtn().setLayoutParams(layoutParams4);
        RadarWaveView waveView = getWaveView();
        waveView.f203386d = waveView.findViewById(C0966R.C0970id.ibt);
        Animation loadAnimation = AnimationUtils.loadAnimation(waveView.getContext(), C0966R.C0968anim.f2481e5);
        waveView.f203387e = loadAnimation;
        C87412m.m108591d(loadAnimation);
        loadAnimation.setInterpolator(new LinearInterpolator());
        C75749c.C75750a aVar = C75749c.C75750a.f222350a;
        View findViewById2 = findViewById(C0966R.C0970id.f359156jb2);
        C87412m.m108593f(findViewById2, "findViewById(R.id.self_round_avatar)");
        String s = C75592q0.m90789s();
        C87412m.m108593f(s, "getUsernameFromUserInfo()");
        aVar.mo106066a((ImageView) findViewById2, s);
        getMemberDetailView().setListener(new C70395d(this));
        RadarSpecialGridView grid = getGrid();
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        this.f203357q = new C70392b(this, grid, context2);
        getGrid().setOnItemClickListener(new C75746a0(this));
    }

    /* renamed from: k */
    public final boolean mo96961k(LinkedList<C64496km3> linkedList) {
        C87412m.m108591d(linkedList);
        Iterator<C64496km3> it = linkedList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C64496km3 next = it.next();
            C75617h hVar = this.f203355o;
            if (hVar != null) {
                C87412m.m108593f(next, "member");
                RadarAddContact.C70378d a = hVar.mo105963a(next, false);
                if (a == null) {
                    String str = next.f183957d;
                    if (str == null && (str = next.f183961h) == null) {
                        str = "";
                    }
                    RadarAddContact.C70378d e = this.f203356p.mo96913e(str);
                    C75617h hVar2 = this.f203355o;
                    if (hVar2 != null) {
                        hVar2.mo105965c(str, e);
                        a = e;
                    } else {
                        C87412m.m108603p("radarManager");
                        throw null;
                    }
                }
                if (a == RadarAddContact.C70378d.Added) {
                    z = true;
                }
            } else {
                C87412m.m108603p("radarManager");
                throw null;
            }
        }
        return z;
    }

    /* renamed from: l */
    public final void mo96962l() {
        RadarAddContact radarAddContact = this.f203356p;
        radarAddContact.getClass();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(radarAddContact);
        radarAddContact.f203281h.dead();
        ((C75707s0) C86312j.m106911c(C75707s0.class)).H60().mo120966D("addcontact", radarAddContact.f203282i, true);
        C75617h hVar = this.f203355o;
        if (hVar != null) {
            C86709a0.m107524d().mo123470p(425, hVar);
            C86709a0.m107524d().mo123470p(602, hVar);
            hVar.mo105969g();
            C92411b bVar = hVar.f222144f;
            if (bVar != null) {
                bVar.mo126408b(hVar.f222157v);
            }
            getWaveView().getClass();
            return;
        }
        C87412m.m108603p("radarManager");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0102, code lost:
        if ((r10 == null || z04.C112551y.m153811k(r10)) != false) goto L_0x0107;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x010a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0127 A[SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96963m(java.util.LinkedList<te3.C64496km3> r13) {
        /*
            r12 = this;
            gy3.C87412m.m108591d(r13)
            int r0 = r13.size()
            r1 = 0
            java.lang.String r2 = "adapter"
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0023
            com.tencent.mm.plugin.radar.ui.RadarViewController$b r0 = r12.f203357q
            if (r0 == 0) goto L_0x001f
            te3.km3[] r0 = r0.f203369e
            int r0 = r0.length
            if (r0 != 0) goto L_0x0023
            com.tencent.mm.plugin.radar.ui.RadarTipsView r0 = r12.getRadarTips()
            r0.setNoMember(r3)
            goto L_0x002a
        L_0x001f:
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x0023:
            com.tencent.mm.plugin.radar.ui.RadarTipsView r0 = r12.getRadarTips()
            r0.setNoMember(r4)
        L_0x002a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "members got, size : "
            r0.append(r5)
            int r5 = r13.size()
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "MicroMsg.Radar.RadarViewController"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
            boolean r0 = r12.mo96961k(r13)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r0 = ""
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6[r4] = r7
            java.lang.String r7 = "has friend:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r7, r6)
            com.tencent.mm.plugin.radar.ui.RadarViewController$b r5 = r12.f203357q
            if (r5 == 0) goto L_0x0185
            com.tencent.mm.plugin.radar.ui.RadarViewController$a r1 = r5.f203372h
            r1.getClass()
            int r1 = r13.size()
            if (r1 != 0) goto L_0x0074
            r1 = 1
            goto L_0x0075
        L_0x0074:
            r1 = 0
        L_0x0075:
            if (r1 != 0) goto L_0x0184
            te3.km3[] r1 = r5.f203369e
            int r1 = r1.length
            r2 = 0
        L_0x007b:
            if (r2 >= r1) goto L_0x00b3
            java.util.Iterator r6 = r13.iterator()
        L_0x0081:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00b0
            java.lang.Object r7 = r6.next()
            te3.km3 r7 = (te3.C64496km3) r7
            if (r7 == 0) goto L_0x0097
            java.lang.String r8 = r7.f183961h
            if (r8 != 0) goto L_0x0098
            java.lang.String r8 = r7.f183957d
            if (r8 != 0) goto L_0x0098
        L_0x0097:
            r8 = r0
        L_0x0098:
            te3.km3[] r9 = r5.f203369e
            r9 = r9[r2]
            if (r9 == 0) goto L_0x00a6
            java.lang.String r10 = r9.f183961h
            if (r10 != 0) goto L_0x00a7
            java.lang.String r10 = r9.f183957d
            if (r10 != 0) goto L_0x00a7
        L_0x00a6:
            r10 = r0
        L_0x00a7:
            boolean r8 = gy3.C87412m.m108589b(r8, r10)
            if (r8 == 0) goto L_0x0081
            r13.remove(r7)
        L_0x00b0:
            int r2 = r2 + 1
            goto L_0x007b
        L_0x00b3:
            java.util.Iterator r1 = r13.iterator()
        L_0x00b7:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x012a
            java.lang.Object r2 = r1.next()
            te3.km3 r2 = (te3.C64496km3) r2
            long r6 = java.lang.System.currentTimeMillis()
            int r7 = (int) r6
            int r7 = r7 % 6
            int r6 = java.lang.Math.abs(r7)
            te3.km3[] r7 = r5.f203369e
            int r7 = r7.length
            r8 = 0
        L_0x00d2:
            if (r8 >= r7) goto L_0x00b7
            int r9 = r8 + r6
            int r9 = r9 % 12
            r10 = 4
            if (r9 == r10) goto L_0x0127
            r10 = 7
            if (r9 == r10) goto L_0x0127
            te3.km3[] r10 = r5.f203369e
            r10 = r10[r9]
            if (r10 == 0) goto L_0x0107
            java.lang.String r11 = r10.f183957d
            if (r11 == 0) goto L_0x00f1
            boolean r11 = z04.C112551y.m153811k(r11)
            if (r11 == 0) goto L_0x00ef
            goto L_0x00f1
        L_0x00ef:
            r11 = 0
            goto L_0x00f2
        L_0x00f1:
            r11 = 1
        L_0x00f2:
            if (r11 == 0) goto L_0x0105
            java.lang.String r10 = r10.f183961h
            if (r10 == 0) goto L_0x0101
            boolean r10 = z04.C112551y.m153811k(r10)
            if (r10 == 0) goto L_0x00ff
            goto L_0x0101
        L_0x00ff:
            r10 = 0
            goto L_0x0102
        L_0x0101:
            r10 = 1
        L_0x0102:
            if (r10 == 0) goto L_0x0105
            goto L_0x0107
        L_0x0105:
            r10 = 0
            goto L_0x0108
        L_0x0107:
            r10 = 1
        L_0x0108:
            if (r10 == 0) goto L_0x0127
            te3.km3[] r6 = r5.f203369e
            r6[r9] = r2
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r5.f203371g
            java.lang.String r7 = "member"
            gy3.C87412m.m108593f(r2, r7)
            java.lang.String r7 = r2.f183957d
            if (r7 != 0) goto L_0x011f
            java.lang.String r7 = r2.f183961h
            if (r7 != 0) goto L_0x011f
            r7 = r0
        L_0x011f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r6.put(r7, r2)
            goto L_0x00b7
        L_0x0127:
            int r8 = r8 + 1
            goto L_0x00d2
        L_0x012a:
            int r0 = r13.size()
            if (r0 <= 0) goto L_0x0184
            r5.mo106065a()
            int r13 = r13.size()
            int r0 = eg2.C75616g.f222140e
            if (r0 != 0) goto L_0x017a
            if (r13 <= 0) goto L_0x017a
            long r0 = java.lang.System.currentTimeMillis()
            long r5 = eg2.C75616g.f222139d
            long r0 = r0 - r5
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r1
            r1 = 1000(0x3e8, float:1.401E-42)
            float r1 = (float) r1
            float r0 = r0 / r1
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            r1[r4] = r2
            java.lang.String r2 = "MicroMsg.RadarKvStatReport"
            java.lang.String r5 = "FoundFirstFriendTimeSpent %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r5, r1)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2[r4] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String r2 = "%s"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            java.lang.String r2 = "format(format, *args)"
            gy3.C87412m.m108593f(r0, r2)
            r2 = 10682(0x29ba, float:1.4969E-41)
            r1.kvStat(r2, r0)
        L_0x017a:
            int r0 = eg2.C75616g.f222140e
            int r0 = r0 + r13
            eg2.C75616g.f222140e = r0
            int r0 = eg2.C75616g.f222141f
            int r0 = r0 + r13
            eg2.C75616g.f222141f = r0
        L_0x0184:
            return
        L_0x0185:
            gy3.C87412m.m108603p(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.radar.p091ui.RadarViewController.mo96963m(java.util.LinkedList):void");
    }

    /* renamed from: n */
    public final void mo96964n() {
        getWaveView().mo96975a();
    }

    /* renamed from: o */
    public final void mo96965o() {
        getWaveView().mo96976b();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        if (i == 4) {
            if (getMemberDetailView().getVisibility() == 0) {
                getMemberDetailView().mo96921c();
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public final void mo96967p(String str, RadarAddContact.C70378d dVar) {
        C75617h hVar = this.f203355o;
        if (hVar != null) {
            C87412m.m108591d(str);
            RadarAddContact.C70378d b = hVar.mo105964b(str, false);
            if (b != null && b != dVar) {
                C75617h hVar2 = this.f203355o;
                if (hVar2 != null) {
                    hVar2.mo105965c(str, dVar);
                    C70392b bVar = this.f203357q;
                    if (bVar != null) {
                        bVar.mo106065a();
                    } else {
                        C87412m.m108603p("adapter");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("radarManager");
                    throw null;
                }
            }
        } else {
            C87412m.m108603p("radarManager");
            throw null;
        }
    }

    /* renamed from: q */
    public final void mo96968q(C75617h.C75620d dVar) {
        this.f203358r = dVar;
        int ordinal = dVar.ordinal();
        if (ordinal == 0) {
            View radarBgMask = getRadarBgMask();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = radarBgMask;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarViewController", "swithcRadarUI", "(Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            radarBgMask.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/radar/ui/RadarViewController", "swithcRadarUI", "(Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getQuitBtn().setText(C0966R.string.f361159hr1);
            getNewRadarTipLoading().setVisibility(8);
            getNewRadarTip().setText("");
            getWaveView().mo96975a();
            getWaveView().setVisibility(0);
            C75617h hVar = this.f203355o;
            if (hVar != null) {
                hVar.mo105968f();
            } else {
                C87412m.m108603p("radarManager");
                throw null;
            }
        } else if (ordinal == 1) {
            View radarBgMask2 = getRadarBgMask();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(radarBgMask2, aVar2.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarViewController", "swithcRadarUI", "(Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            radarBgMask2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(radarBgMask2, "com/tencent/mm/plugin/radar/ui/RadarViewController", "swithcRadarUI", "(Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getNewRadarTipLoading().setVisibility(8);
            getNewRadarTip().setText("");
        } else if (ordinal == 2) {
            if (getRadarBgMask().getVisibility() != 0) {
                getRadarBgMask().setAnimation(AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2473dx));
                View radarBgMask3 = getRadarBgMask();
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view2 = radarBgMask3;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarViewController", "radarBackgroundFadeIn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                radarBgMask3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/radar/ui/RadarViewController", "radarBackgroundFadeIn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            getQuitBtn().setText(C0966R.string.f7926wf);
            C75617h hVar2 = this.f203355o;
            if (hVar2 != null) {
                hVar2.mo105970h();
                getNewRadarTipLoading().setVisibility(0);
                getNewRadarTip().setText(C0966R.string.f361161hr3);
                getWaveView().mo96976b();
                getWaveView().setVisibility(4);
                getGrid().setVisibility(4);
                C70392b bVar = this.f203357q;
                if (bVar != null) {
                    bVar.f203371g.clear();
                    bVar.f203374j.clear();
                    for (String str : bVar.f203374j.keySet()) {
                        View view3 = bVar.f203374j.get(str);
                        if (view3 != null) {
                            C70390a aVar4 = bVar.f203372h;
                            aVar4.getClass();
                            Object tag = view3.getTag(RadarViewController.this.f203361u);
                            Integer num = tag instanceof Integer ? (Integer) tag : null;
                            int intValue = num != null ? num.intValue() : -1;
                            if (intValue > 0) {
                                aVar4.f203365c.removeMessages(intValue);
                            }
                            view3.clearAnimation();
                        }
                    }
                    bVar.mo106065a();
                    return;
                }
                C87412m.m108603p("adapter");
                throw null;
            }
            C87412m.m108603p("radarManager");
            throw null;
        } else if (ordinal == 3) {
            View radarBgMask4 = getRadarBgMask();
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar5.mo10233c(0);
            View view4 = radarBgMask4;
            C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarViewController", "swithcRadarUI", "(Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            radarBgMask4.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/radar/ui/RadarViewController", "swithcRadarUI", "(Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C75617h hVar3 = this.f203355o;
            if (hVar3 != null) {
                hVar3.mo105970h();
                getNewRadarTipLoading().setVisibility(8);
                getNewRadarTip().setText(C0966R.string.hqr);
                getGrid().setVisibility(0);
                return;
            }
            C87412m.m108603p("radarManager");
            throw null;
        } else if (ordinal == 4) {
            View radarBgMask5 = getRadarBgMask();
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
            aVar6.mo10233c(8);
            View view5 = radarBgMask5;
            C117292a.m165358d(view5, aVar6.mo10232b(), "com/tencent/mm/plugin/radar/ui/RadarViewController", "swithcRadarUI", "(Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            radarBgMask5.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/radar/ui/RadarViewController", "swithcRadarUI", "(Lcom/tencent/mm/plugin/radar/model/RadarManager$RadarStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C75617h hVar4 = this.f203355o;
            if (hVar4 != null) {
                hVar4.mo105970h();
                getNewRadarTipLoading().setVisibility(0);
                getNewRadarTip().setText(C0966R.string.hqs);
                return;
            }
            C87412m.m108603p("radarManager");
            throw null;
        }
    }
}
