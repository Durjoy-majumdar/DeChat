package ve1;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dp1.C58417y0;
import dq1.C7461a;
import er1.C58684b;
import er1.C58784w3;
import er1.C7865r3;
import fy3.C32224a;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60896i;
import jq3.C60905o;
import ke3.C88144b;
import kf1.C9914ob;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C64284cg;
import z04.C112550d0;

/* renamed from: ve1.f3 */
public abstract class C14514f3 extends C60896i<BaseFinderFeed> {

    /* renamed from: e */
    public final int f40238e;

    /* renamed from: f */
    public final C7461a f40239f;

    /* renamed from: g */
    public final int f40240g;

    /* renamed from: h */
    public final C32229r<C60905o, BaseFinderFeed, Integer, Boolean, C13598b0> f40241h;

    /* renamed from: i */
    public final C32224a<String> f40242i;

    /* renamed from: j */
    public final C13601g f40243j;

    /* renamed from: n */
    public final C13601g f40244n;

    /* renamed from: o */
    public final C13601g f40245o;

    /* renamed from: p */
    public C9914ob f40246p;

    /* renamed from: q */
    public ValueAnimator f40247q;

    /* renamed from: ve1.f3$a */
    public static final class C14515a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C14515a f40248d = new C14515a();

        public C14515a() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3766df));
        }
    }

    /* renamed from: ve1.f3$b */
    public static final class C14516b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14514f3 f40249d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f40250e;

        /* renamed from: f */
        public final /* synthetic */ BaseFinderFeed f40251f;

        public C14516b(C14514f3 f3Var, C60905o oVar, BaseFinderFeed baseFinderFeed) {
            this.f40249d = f3Var;
            this.f40250e = oVar;
            this.f40251f = baseFinderFeed;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C14514f3 f3Var = this.f40249d;
            C60905o oVar = this.f40250e;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            BaseFinderFeed baseFinderFeed = this.f40251f;
            f3Var.mo13775k(oVar, context, baseFinderFeed, baseFinderFeed.mo3513o().getUserName());
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.f3$c */
    public static final class C14517c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14514f3 f40252d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f40253e;

        /* renamed from: f */
        public final /* synthetic */ BaseFinderFeed f40254f;

        public C14517c(C14514f3 f3Var, C60905o oVar, BaseFinderFeed baseFinderFeed) {
            this.f40252d = f3Var;
            this.f40253e = oVar;
            this.f40254f = baseFinderFeed;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C14514f3 f3Var = this.f40252d;
            C60905o oVar = this.f40253e;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            BaseFinderFeed baseFinderFeed = this.f40254f;
            f3Var.mo13775k(oVar, context, baseFinderFeed, baseFinderFeed.mo3513o().getUserName());
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.f3$d */
    public static final class C14518d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C14518d f40255d = new C14518d();

        public C14518d() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(C7865r3.f26468a.mo8970c());
        }
    }

    /* renamed from: ve1.f3$e */
    public static final class C14519e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C14514f3 f40256d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14519e(C14514f3 f3Var) {
            super(0);
            this.f40256d = f3Var;
        }

        public Object invoke() {
            return Integer.valueOf((((Number) ((C36570n) this.f40256d.f40243j).getValue()).intValue() - (((Number) ((C36570n) this.f40256d.f40244n).getValue()).intValue() * 6)) / 2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14514f3(int i, C7461a aVar, int i2, C32229r rVar, C32224a aVar2, int i3, C8480h hVar) {
        this(i, (i3 & 2) != 0 ? new C7461a() : aVar, (i3 & 4) != 0 ? -1 : i2, (i3 & 8) != 0 ? null : rVar, (i3 & 16) != 0 ? null : aVar2);
    }

    /* renamed from: c */
    public int mo43c() {
        return this.f40238e;
    }

    /* renamed from: j */
    public final void mo13774j(C60905o oVar, BaseFinderFeed baseFinderFeed) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(baseFinderFeed, "feed");
        LinearLayout linearLayout = (LinearLayout) oVar.mo85812D(C0966R.C0970id.e8f);
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        if (baseFinderFeed.mo3513o().getStickyTime() > 0) {
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
        } else if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: k */
    public final void mo13775k(C60905o oVar, Context context, BaseFinderFeed baseFinderFeed, String str) {
        String str2;
        C60905o oVar2 = oVar;
        Context context2 = context;
        String str3 = str;
        Class cls = C58417y0.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(baseFinderFeed, "feed");
        C87412m.m108594g(str3, "username");
        if (!C58784w3.f168295a.mo83932g1(oVar2, baseFinderFeed.mo3513o().getFeedObject(), 0)) {
            C64284cg bizInfo = baseFinderFeed.mo3513o().getBizInfo();
            C13598b0 b0Var = null;
            if (bizInfo != null) {
                Log.m105924i("FinderFeedRoundCornerConvert", "jumpBizProfile: bizUsername = " + bizInfo.f182468d);
                String str4 = bizInfo.f182468d;
                if (str4 == null) {
                    str4 = "";
                }
                Intent intent = new Intent();
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                C13442s8.C13443a aVar2 = aVar;
                C13442s8.C13443a.m12791e(aVar, context, intent, baseFinderFeed.getItemId(), (String) null, 0, 5, false, 0, 192, (Object) null);
                Intent intent2 = intent;
                intent2.putExtra("Contact_User", str4);
                intent2.putExtra("Contact_Scene", JsApiCheckIsSupportFaceDetect.CTRL_INDEX);
                boolean z = true;
                intent2.putExtra("biz_profile_enter_from_finder", true);
                intent2.putExtra("force_get_contact", true);
                intent2.putExtra("key_use_new_contact_profile", true);
                intent2.putExtra("biz_profile_tab_type", 1);
                String str5 = baseFinderFeed.mo3513o().getFeedObject().sessionBuffer;
                if (!(str5 == null || str5.length() == 0)) {
                    z = false;
                }
                if (z) {
                    C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
                    long itemId = baseFinderFeed.getItemId();
                    C13442s8 f = aVar2.mo12873f(context2);
                    str2 = y0Var.mo83281Cu(itemId, f != null ? f.f38096i : 0);
                } else {
                    str2 = baseFinderFeed.mo3513o().getFeedObject().sessionBuffer;
                }
                intent2.putExtra("Contact_Scene_Note", str2);
                C88144b.m109791i(context2, Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Intent intent3 = new Intent();
                intent3.putExtra("finder_username", str3);
                C13442s8.C13443a.m12791e(C13442s8.f38060Q0, context, intent3, baseFinderFeed.getItemId(), (String) null, 0, 1, false, 0, 192, (Object) null);
                ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context2, intent3);
            }
        }
        C13442s8 f2 = C13442s8.f38060Q0.mo12873f(context2);
        if (f2 != null) {
            ((C58417y0) C86312j.m106911c(cls)).yx0(4, baseFinderFeed.getItemId(), f2.f38096i, 1, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0075, code lost:
        r0 = r0.invoke();
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03fd  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x04de  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x056a  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x05c6  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0611  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0662  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0665  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0690  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x079c  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0c1a  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0c40  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0c5d  */
    /* JADX WARNING: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x036a  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r32, com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r33, int r34, int r35, boolean r36, java.util.List<java.lang.Object> r37) {
        /*
            r31 = this;
            r6 = r31
            r7 = r32
            r8 = r33
            java.lang.Class<ny.h> r9 = p629ny.C76979h.class
            java.lang.Class<pl1.s0> r10 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r11 = ht1.C60200t1.class
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r8, r0)
            r12 = 2131302682(0x7f09191a, float:1.8223457E38)
            android.view.View r0 = r7.mo85812D(r12)
            r13 = r0
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            bl3.r r14 = bl3.C39818r.f106831a
            bl3.r$a r0 = r14.mo62446e(r11)
            bl3.c r0 = r0.mo62447c(r10)
            pl1.s0 r0 = (pl1.C11990s0) r0
            k60.d r0 = r0.mo11872i2()
            pl1.f r1 = new pl1.f
            java.lang.String r2 = r33.mo3503i()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            up1.y r3 = up1.C27696y.SMALL_AVATAR_IMAGE
            r1.<init>(r2, r3)
            java.lang.String r2 = "avatar"
            gy3.C87412m.m108593f(r13, r2)
            pl1.e0$a r2 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r3 = r14.mo62446e(r11)
            bl3.c r3 = r3.mo62447c(r10)
            pl1.s0 r3 = (pl1.C11990s0) r3
            n60.f r2 = r3.mo11867O2(r2)
            r0.mo85957c(r1, r13, r2)
            r15 = 2131304533(0x7f092055, float:1.8227211E38)
            android.view.View r0 = r7.mo85812D(r15)
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            rx3.g r0 = r6.f40245o
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            fy3.a<java.lang.String> r0 = r6.f40242i
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0081
            java.lang.Object r0 = r0.invoke()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x007e
            goto L_0x0081
        L_0x007e:
            r16 = r0
            goto L_0x0083
        L_0x0081:
            r16 = r3
        L_0x0083:
            android.content.Context r1 = r7.f173499A
            java.lang.String r2 = "holder.context"
            gy3.C87412m.m108593f(r1, r2)
            android.text.TextPaint r0 = r5.getPaint()
            java.lang.String r15 = "nickname.paint"
            gy3.C87412m.m108593f(r0, r15)
            com.tencent.mm.plugin.finder.storage.FinderItem r15 = r33.mo3513o()
            android.text.SpannableString r15 = r15.getNickNameSpan()
            r17 = r0
            r0 = r31
            r12 = r2
            r2 = r17
            r37 = r13
            r13 = r3
            r3 = r15
            r15 = r5
            r5 = r16
            java.lang.CharSequence r0 = r0.mo13776m(r1, r2, r3, r4, r5)
            r15.setText(r0)
            r5 = 2131297406(0x7f09047e, float:1.8212756E38)
            android.view.View r0 = r7.mo85812D(r5)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = r33.mo3511n()
            r1 = 2131304843(0x7f09218b, float:1.822784E38)
            r4 = 8
            r3 = 0
            if (r0 == 0) goto L_0x010f
            android.view.View r0 = r7.mo85812D(r1)
            if (r0 != 0) goto L_0x00cd
            goto L_0x0157
        L_0x00cd:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r1.mo10233c(r2)
            java.lang.Object[] r17 = r1.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r19 = "onBindViewHolder"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r1 = r1.mo10231a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r18 = "onBindViewHolder"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0157
        L_0x010f:
            android.view.View r0 = r7.mo85812D(r1)
            if (r0 != 0) goto L_0x0116
            goto L_0x0157
        L_0x0116:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1.mo10233c(r2)
            java.lang.Object[] r24 = r1.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r26 = "onBindViewHolder"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r0
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.Object r1 = r1.mo10231a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r25 = "onBindViewHolder"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
        L_0x0157:
            r0 = 2131307275(0x7f092b0b, float:1.8232773E38)
            android.view.View r0 = r7.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 2131307282(0x7f092b12, float:1.8232787E38)
            android.view.View r1 = r7.mo85812D(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r33.mo3513o()
            int r2 = r2.getLikeCount()
            r4 = 2
            if (r2 <= 0) goto L_0x0181
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r33.mo3513o()
            int r2 = r2.getLikeCount()
            java.lang.String r2 = er1.C7878t0.m8034c(r4, r2)
            goto L_0x0183
        L_0x0181:
            java.lang.String r2 = "0"
        L_0x0183:
            r0.setText(r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r33.mo3513o()
            int r2 = r2.getLikeCount()
            if (r2 < 0) goto L_0x0192
            r2 = 0
            goto L_0x0194
        L_0x0192:
            r2 = 8
        L_0x0194:
            r0.setVisibility(r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r33.mo3513o()
            int r2 = r2.getLikeCount()
            if (r2 < 0) goto L_0x01a3
            r2 = 0
            goto L_0x01a5
        L_0x01a3:
            r2 = 8
        L_0x01a5:
            r1.setVisibility(r2)
            wp1.j r2 = wp1.C15587j.f42215a
            com.tencent.mm.plugin.finder.storage.FinderItem r17 = r33.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r17.getFeedObject()
            int r4 = r4.objectType
            te3.if1 r2 = r2.mo14351c(r4)
            if (r2 == 0) goto L_0x0204
            java.lang.String r5 = r2.f135279y
            if (r5 == 0) goto L_0x01c7
            int r5 = r5.length()
            if (r5 != 0) goto L_0x01c5
            goto L_0x01c7
        L_0x01c5:
            r5 = 0
            goto L_0x01c8
        L_0x01c7:
            r5 = 1
        L_0x01c8:
            if (r5 == 0) goto L_0x01cb
            goto L_0x0204
        L_0x01cb:
            bl3.r$a r5 = r14.mo62446e(r11)
            bl3.c r5 = r5.mo62447c(r10)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11871f2()
            pl1.n0 r3 = new pl1.n0
            java.lang.String r2 = r2.f135279y
            up1.y r4 = up1.C27696y.RAW_IMAGE
            r3.<init>(r2, r4)
            pl1.e0$a r2 = pl1.C11978e0.C11979a.TIMELINE
            bl3.r$a r4 = r14.mo62446e(r11)
            bl3.c r4 = r4.mo62447c(r10)
            pl1.s0 r4 = (pl1.C11990s0) r4
            n60.f r2 = r4.mo11867O2(r2)
            r5.mo85957c(r3, r1, r2)
            android.content.Context r2 = r7.f173499A
            r3 = 2131099940(0x7f060124, float:1.7812247E38)
            int r2 = kg3.C76577a.m92153d(r2, r3)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r1.setColorFilter(r2, r3)
            goto L_0x022d
        L_0x0204:
            er1.w3 r2 = er1.C58784w3.f168295a
            r3 = 1
            java.lang.Integer r2 = r2.mo83917b0(r3, r3)
            if (r2 == 0) goto L_0x0212
            int r2 = r2.intValue()
            goto L_0x0215
        L_0x0212:
            r2 = 2131756066(0x7f100422, float:1.914303E38)
        L_0x0215:
            android.content.Context r3 = r7.f173499A
            android.content.res.Resources r4 = r3.getResources()
            r5 = 2131099940(0x7f060124, float:1.7812247E38)
            int r4 = r4.getColor(r5)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r3, r2, r4)
            r1.setImageDrawable(r2)
            r2 = 0
            r1.setEnabled(r2)
        L_0x022d:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r33.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            te3.ek1 r2 = r2.flow_card_recommand_reason
            if (r2 == 0) goto L_0x023d
            java.lang.String r3 = r2.f132981d
            if (r3 != 0) goto L_0x023e
        L_0x023d:
            r3 = r13
        L_0x023e:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            r10 = 170(0xaa, float:2.38E-43)
            if (r2 != 0) goto L_0x0252
            int r2 = r6.f40240g
            if (r2 == r10) goto L_0x0252
            r2 = 8
            r1.setVisibility(r2)
            r0.setText(r3)
        L_0x0252:
            r11 = 2131302755(0x7f091963, float:1.8223605E38)
            android.view.View r0 = r7.mo85812D(r11)
            r14 = r0
            android.widget.TextView r14 = (android.widget.TextView) r14
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r33.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.objectDesc
            r21 = 0
            if (r0 == 0) goto L_0x0279
            java.util.LinkedList<te3.zk1> r0 = r0.short_title
            if (r0 == 0) goto L_0x0279
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            te3.zk1 r0 = (te3.C52277zk1) r0
            if (r0 == 0) goto L_0x0279
            java.lang.String r0 = r0.f146050d
            goto L_0x027b
        L_0x0279:
            r0 = r21
        L_0x027b:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r33.mo3513o()
            android.text.SpannableString r1 = r1.getFlowCardDescSpan()
            if (r1 == 0) goto L_0x028e
            int r1 = r1.length()
            if (r1 != 0) goto L_0x028c
            goto L_0x028e
        L_0x028c:
            r1 = 0
            goto L_0x028f
        L_0x028e:
            r1 = 1
        L_0x028f:
            if (r1 != 0) goto L_0x02a0
            r1 = 0
            r14.setVisibility(r1)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r33.mo3513o()
            android.text.SpannableString r0 = r0.getFlowCardDescSpan()
            r3 = 0
            r4 = 1
            goto L_0x02df
        L_0x02a0:
            if (r0 == 0) goto L_0x02b0
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x02aa
            r3 = 1
            goto L_0x02ab
        L_0x02aa:
            r3 = 0
        L_0x02ab:
            r4 = 1
            if (r3 != r4) goto L_0x02b1
            r3 = 1
            goto L_0x02b2
        L_0x02b0:
            r4 = 1
        L_0x02b1:
            r3 = 0
        L_0x02b2:
            if (r3 == 0) goto L_0x02c5
            r3 = 0
            r14.setVisibility(r3)
            di3.d r1 = di3.C86312j.m106911c(r9)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r2 = r7.f173499A
            android.text.SpannableString r0 = r1.mo107057T1(r2, r0)
            goto L_0x02df
        L_0x02c5:
            r3 = 0
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r33.mo3513o()
            java.lang.String r0 = r0.getDescription()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x02e2
            r14.setVisibility(r3)
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r33.mo3513o()
            android.text.SpannableString r0 = r0.getDescriptionSpan()
        L_0x02df:
            r5 = 8
            goto L_0x02ec
        L_0x02e2:
            r5 = 8
            r14.setVisibility(r5)
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r13)
        L_0x02ec:
            fy3.a<java.lang.String> r1 = r6.f40242i
            if (r1 == 0) goto L_0x02fc
            java.lang.Object r1 = r1.invoke()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x02f9
            goto L_0x02fc
        L_0x02f9:
            r16 = r1
            goto L_0x02fe
        L_0x02fc:
            r16 = r13
        L_0x02fe:
            rx3.g r1 = r6.f40245o
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            dq1.a r2 = r6.f40239f
            int r2 = r2.f25669a
            int r17 = r1 * r2
            android.content.Context r1 = r7.f173499A
            gy3.C87412m.m108593f(r1, r12)
            android.text.TextPaint r2 = r14.getPaint()
            java.lang.String r3 = "descTv.paint"
            gy3.C87412m.m108593f(r2, r3)
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r0)
            r0 = r31
            r4 = 0
            r11 = 1
            r5 = 2
            r10 = 8
            r11 = 0
            r4 = r17
            r5 = r16
            java.lang.CharSequence r0 = r0.mo13776m(r1, r2, r3, r4, r5)
            r14.setText(r0)
            dq1.a r0 = r6.f40239f
            int r0 = r0.f25669a
            r14.setMaxLines(r0)
            dq1.a r0 = r6.f40239f
            boolean r0 = r0.f25670b
            if (r0 == 0) goto L_0x0349
            er1.C7919x.m8091a(r14)
            goto L_0x034c
        L_0x0349:
            er1.C7919x.m8092b(r14)
        L_0x034c:
            r0 = 2131304718(0x7f09210e, float:1.8227587E38)
            android.view.View r0 = r7.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r33.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            java.lang.String r1 = r1.inner_recommend_reason
            if (r1 == 0) goto L_0x036a
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0368
            goto L_0x036a
        L_0x0368:
            r3 = 0
            goto L_0x036b
        L_0x036a:
            r3 = 1
        L_0x036b:
            if (r3 == 0) goto L_0x0371
            r0.setVisibility(r10)
            goto L_0x03d1
        L_0x0371:
            r0.setVisibility(r11)
            di3.d r1 = di3.C86312j.m106911c(r9)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r2 = r7.f173499A
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r33.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            java.lang.String r3 = r3.inner_recommend_reason
            float r4 = r0.getTextSize()
            int r4 = (int) r4
            r5 = 1
            android.text.SpannableString r1 = r1.mo107049Jh(r2, r3, r4, r5)
            android.content.Context r2 = r7.f173499A
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131100928(0x7f060500, float:1.7814251E38)
            int r2 = r2.getColor(r3)
            android.content.Context r3 = r7.f173499A
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131100949(0x7f060515, float:1.7814294E38)
            int r3 = r3.getColor(r4)
            int r4 = r1.length()
            java.lang.Class<de3.b0> r5 = de3.C75359b0.class
            java.lang.Object[] r4 = r1.getSpans(r11, r4, r5)
            de3.b0[] r4 = (de3.C75359b0[]) r4
            if (r4 == 0) goto L_0x03c6
            int r5 = r4.length
            r14 = 0
        L_0x03ba:
            if (r14 >= r5) goto L_0x03c6
            r10 = r4[r14]
            r10.setColor(r3, r2)
            int r14 = r14 + 1
            r10 = 8
            goto L_0x03ba
        L_0x03c6:
            r0.setText(r1)
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
        L_0x03d1:
            r0 = 2131304717(0x7f09210d, float:1.8227584E38)
            android.view.View r0 = r7.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            up1.f r1 = up1.C37521f.f99374d
            r1.getClass()
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99365b8
            java.lang.Object r2 = r1.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = 1
            if (r2 == r3) goto L_0x03f6
            java.lang.String r2 = "recommendTv"
            gy3.C87412m.m108593f(r0, r2)
            er1.C7919x.m8091a(r0)
        L_0x03f6:
            int r2 = r6.f40240g
            r10 = 3
            r3 = 170(0xaa, float:2.38E-43)
            if (r2 != r3) goto L_0x04de
            dq1.a r2 = r6.f40239f
            int r2 = r2.f25672d
            r14 = 2
            if (r2 == r14) goto L_0x04db
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r33.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            te3.ek1 r2 = r2.flow_card_recommand_reason
            if (r2 == 0) goto L_0x0414
            java.lang.String r3 = r2.f132981d
            if (r3 != 0) goto L_0x0415
        L_0x0414:
            r3 = r13
        L_0x0415:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r33.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            te3.ek1 r2 = r2.flow_card_recommand_reason
            if (r2 == 0) goto L_0x0424
            int r2 = r2.f132982e
            goto L_0x0425
        L_0x0424:
            r2 = 0
        L_0x0425:
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x042d
            r4 = 1
            goto L_0x042e
        L_0x042d:
            r4 = 0
        L_0x042e:
            if (r4 == 0) goto L_0x0431
            goto L_0x0433
        L_0x0431:
            r3 = r21
        L_0x0433:
            if (r3 == 0) goto L_0x04d1
            di3.d r4 = di3.C86312j.m106911c(r9)
            ny.h r4 = (p629ny.C76979h) r4
            android.content.Context r5 = r7.f173499A
            android.text.SpannableString r3 = r4.mo107057T1(r5, r3)
            r0.setText(r3)
            if (r2 != r14) goto L_0x0457
            android.content.Context r1 = r7.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099669(0x7f060015, float:1.7811698E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            goto L_0x0485
        L_0x0457:
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = 1
            if (r1 != r2) goto L_0x0475
            android.content.Context r1 = r7.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            goto L_0x0485
        L_0x0475:
            android.content.Context r1 = r7.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099738(0x7f06005a, float:1.7811838E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
        L_0x0485:
            dq1.a r1 = r6.f40239f
            int r1 = r1.f25672d
            r2 = 1
            if (r1 != r2) goto L_0x0492
            r0.setVisibility(r11)
            r1 = 8
            goto L_0x04ce
        L_0x0492:
            if (r1 != r10) goto L_0x04c9
            fe1.d$b r23 = fe1.C58961d.f168673a
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r33.mo3513o()
            java.lang.String r1 = r1.field_username
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r33.mo3513o()
            te3.cg r2 = r2.getBizInfo()
            if (r2 == 0) goto L_0x04ab
            java.lang.String r2 = r2.f182468d
            r25 = r2
            goto L_0x04ad
        L_0x04ab:
            r25 = r21
        L_0x04ad:
            r26 = 0
            r27 = 0
            r28 = 12
            r29 = 0
            r24 = r1
            boolean r1 = fe1.C58961d.C58963b.m68836h(r23, r24, r25, r26, r27, r28, r29)
            if (r1 == 0) goto L_0x04c3
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x04ce
        L_0x04c3:
            r1 = 8
            r0.setVisibility(r11)
            goto L_0x04ce
        L_0x04c9:
            r1 = 8
            r0.setVisibility(r1)
        L_0x04ce:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x04d5
        L_0x04d1:
            r1 = 8
            r2 = r21
        L_0x04d5:
            if (r2 != 0) goto L_0x04e4
            r0.setVisibility(r1)
            goto L_0x04e4
        L_0x04db:
            r1 = 8
            goto L_0x04e1
        L_0x04de:
            r1 = 8
            r14 = 2
        L_0x04e1:
            r0.setVisibility(r1)
        L_0x04e4:
            bl3.r r9 = bl3.C39818r.f106831a
            android.content.Context r0 = r7.f173499A
            gy3.C87412m.m108593f(r0, r12)
            bl3.r$a r0 = r9.mo62443b(r0)
            java.lang.Class<mf1.a1> r1 = mf1.C10786a1.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            java.lang.String r1 = "UICProvider.of(holder.co…eedJumperUIC::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            mf1.a1 r0 = (mf1.C10786a1) r0
            r4 = 0
            ve1.g3 r5 = new ve1.g3
            r5.<init>(r8)
            java.lang.String r3 = "TWO_FLOW"
            r1 = r33
            r2 = r32
            r0.mo11064n3(r1, r2, r3, r4, r5)
            r0 = 2131310641(0x7f093831, float:1.82396E38)
            r1 = 2131307295(0x7f092b1f, float:1.8232813E38)
            if (r34 != 0) goto L_0x056a
            boolean r2 = r33.mo3478L()
            if (r2 == 0) goto L_0x056a
            android.view.View r1 = r7.mo85812D(r1)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r2.mo10233c(r3)
            java.lang.Object[] r24 = r2.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r26 = "onBindViewHolder"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r1
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.Object r2 = r2.mo10231a(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r25 = "onBindViewHolder"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            android.view.View r0 = r7.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setVisibility(r11)
            r1 = 8
            goto L_0x05bc
        L_0x056a:
            android.view.View r1 = r7.mo85812D(r1)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r4)
            java.lang.Object[] r24 = r2.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r26 = "onBindViewHolder"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r1
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.Object r2 = r2.mo10231a(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r25 = "onBindViewHolder"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            android.view.View r0 = r7.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 8
            r0.setVisibility(r1)
        L_0x05bc:
            r0 = 2131307309(0x7f092b2d, float:1.8232842E38)
            android.view.View r0 = r7.mo85812D(r0)
            if (r0 != 0) goto L_0x05c6
            goto L_0x0605
        L_0x05c6:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2.mo10233c(r3)
            java.lang.Object[] r24 = r2.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r26 = "refreshFriendsLike"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r0
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.Object r1 = r2.mo10231a(r11)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r25 = "refreshFriendsLike"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
        L_0x0605:
            r0 = 2131305225(0x7f092309, float:1.8228615E38)
            android.view.View r0 = r7.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 != 0) goto L_0x0611
            goto L_0x0616
        L_0x0611:
            r1 = 8
            r0.setVisibility(r1)
        L_0x0616:
            ve1.f3$b r0 = new ve1.f3$b
            r0.<init>(r6, r7, r8)
            r1 = r37
            r1.setOnClickListener(r0)
            ve1.f3$c r0 = new ve1.f3$c
            r0.<init>(r6, r7, r8)
            r15.setOnClickListener(r0)
            r0 = 2131311488(0x7f093b80, float:1.8241318E38)
            android.view.View r0 = r7.mo85812D(r0)
            com.tencent.mm.plugin.finder.view.FinderPostProgressView r0 = (com.tencent.p014mm.plugin.finder.view.FinderPostProgressView) r0
            r1 = 2131311487(0x7f093b7f, float:1.8241316E38)
            android.view.View r2 = r7.mo85812D(r1)
            r3 = 2131311403(0x7f093b2b, float:1.8241145E38)
            android.view.View r4 = r7.mo85812D(r3)
            r5 = 2131302682(0x7f09191a, float:1.8223457E38)
            android.view.View r5 = r7.mo85812D(r5)
            r13 = 2131304533(0x7f092055, float:1.8227211E38)
            android.view.View r13 = r7.mo85812D(r13)
            r3 = 2131297406(0x7f09047e, float:1.8212756E38)
            android.view.View r3 = r7.mo85812D(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.content.Context r1 = r7.f173499A
            float r1 = kg3.C76577a.m92165p(r1)
            r17 = 1065353216(0x3f800000, float:1.0)
            int r17 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r17 != 0) goto L_0x0665
            r17 = 1
            goto L_0x0667
        L_0x0665:
            r17 = 0
        L_0x0667:
            if (r17 != 0) goto L_0x0686
            android.view.ViewGroup$LayoutParams r10 = r3.getLayoutParams()
            if (r10 == 0) goto L_0x0686
            android.content.Context r14 = r7.f173499A
            android.content.res.Resources r14 = r14.getResources()
            r11 = 2131165307(0x7f07007b, float:1.7944827E38)
            float r11 = r14.getDimension(r11)
            float r11 = r11 * r1
            int r1 = (int) r11
            r10.width = r1
            r10.height = r1
            r3.setLayoutParams(r10)
        L_0x0686:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r33.mo3513o()
            boolean r1 = r1.isPostFailed()
            if (r1 == 0) goto L_0x079c
            k20.a r0 = new k20.a
            r0.<init>()
            r1 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r0.mo10233c(r10)
            java.lang.Object[] r24 = r0.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r26 = "refreshPost"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r4
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r4.setVisibility(r0)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r25 = "refreshPost"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            k20.a r0 = new k20.a
            r0.<init>()
            r1 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r0.mo10233c(r4)
            java.lang.Object[] r24 = r0.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r26 = "refreshPost"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r2
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.setVisibility(r0)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r25 = "refreshPost"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            k20.a r0 = new k20.a
            r0.<init>()
            r1 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.mo10233c(r2)
            java.lang.Object[] r24 = r0.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r26 = "refreshPost"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r5
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r5.setVisibility(r0)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r25 = "refreshPost"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            r0 = 8
            r3.setVisibility(r0)
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.mo10233c(r2)
            java.lang.Object[] r24 = r1.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r26 = "refreshPost"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r13
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r0 = 0
            java.lang.Object r1 = r1.mo10231a(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r1.intValue()
            r13.setVisibility(r0)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r25 = "refreshPost"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            goto L_0x0bf3
        L_0x079c:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r33.mo3513o()
            boolean r1 = r1.isPostFinish()
            if (r1 == 0) goto L_0x0ab1
            k20.a r0 = new k20.a
            r0.<init>()
            r1 = 8
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r0.mo10233c(r10)
            java.lang.Object[] r24 = r0.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r26 = "refreshPost"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r4
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r4.setVisibility(r0)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r25 = "refreshPost"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            k20.a r0 = new k20.a
            r0.<init>()
            r1 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r0.mo10233c(r4)
            java.lang.Object[] r24 = r0.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r26 = "refreshPost"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r2
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.setVisibility(r0)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r25 = "refreshPost"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            fe1.q r0 = r33.mo3507l()
            if (r0 == 0) goto L_0x084e
            er1.w3 r23 = er1.C58784w3.f168295a
            java.lang.String r1 = "authIconView"
            gy3.C87412m.m108593f(r3, r1)
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r1 = r0.field_authInfo
            r26 = 0
            r2 = 0
            te3.cg r27 = fe1.C58960c.m68830b(r0, r2)
            r28 = 4
            r29 = 0
            r24 = r3
            r25 = r1
            er1.C58784w3.m68429F1(r23, r24, r25, r26, r27, r28, r29)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0850
        L_0x084e:
            r0 = r21
        L_0x0850:
            if (r0 != 0) goto L_0x0858
            r0 = 8
            r3.setVisibility(r0)
            goto L_0x085a
        L_0x0858:
            r0 = 8
        L_0x085a:
            dq1.a r1 = r6.f40239f
            int r1 = r1.f25671c
            r2 = 2
            if (r1 != r2) goto L_0x08ea
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1.mo10233c(r2)
            java.lang.Object[] r24 = r1.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r26 = "refreshPost"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r5
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r0 = 0
            java.lang.Object r1 = r1.mo10231a(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r1.intValue()
            r5.setVisibility(r0)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r25 = "refreshPost"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            k20.a r0 = new k20.a
            r0.<init>()
            r1 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.mo10233c(r2)
            java.lang.Object[] r24 = r0.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r26 = "refreshPost"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r13
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r13.setVisibility(r0)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r25 = "refreshPost"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            r0 = 8
            r3.setVisibility(r0)
            goto L_0x0bf3
        L_0x08ea:
            r0 = 3
            if (r1 != r0) goto L_0x0a29
            fe1.d$b r23 = fe1.C58961d.f168673a
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r33.mo3513o()
            java.lang.String r0 = r0.field_username
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r33.mo3513o()
            te3.cg r1 = r1.getBizInfo()
            if (r1 == 0) goto L_0x0904
            java.lang.String r1 = r1.f182468d
            r25 = r1
            goto L_0x0906
        L_0x0904:
            r25 = r21
        L_0x0906:
            r26 = 0
            r27 = 0
            r28 = 12
            r29 = 0
            r24 = r0
            boolean r0 = fe1.C58961d.C58963b.m68836h(r23, r24, r25, r26, r27, r28, r29)
            if (r0 == 0) goto L_0x099e
            k20.a r0 = new k20.a
            r0.<init>()
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.mo10233c(r2)
            java.lang.Object[] r24 = r0.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r26 = "refreshPost"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r5
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r5.setVisibility(r0)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r25 = "refreshPost"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            k20.a r0 = new k20.a
            r0.<init>()
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.mo10233c(r2)
            java.lang.Object[] r24 = r0.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r26 = "refreshPost"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r13
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r13.setVisibility(r0)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r25 = "refreshPost"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            r0 = 0
            r3.setVisibility(r0)
            goto L_0x0bf3
        L_0x099e:
            k20.a r0 = new k20.a
            r0.<init>()
            r1 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.mo10233c(r2)
            java.lang.Object[] r24 = r0.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r26 = "refreshPost"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r5
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r5.setVisibility(r0)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r25 = "refreshPost"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            k20.a r0 = new k20.a
            r0.<init>()
            r1 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.mo10233c(r2)
            java.lang.Object[] r24 = r0.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r26 = "refreshPost"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r13
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r13.setVisibility(r0)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r25 = "refreshPost"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            r0 = 8
            r3.setVisibility(r0)
            goto L_0x0bf3
        L_0x0a29:
            k20.a r0 = new k20.a
            r0.<init>()
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.mo10233c(r2)
            java.lang.Object[] r24 = r0.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r26 = "refreshPost"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r5
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r5.setVisibility(r0)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r25 = "refreshPost"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            k20.a r0 = new k20.a
            r0.<init>()
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.mo10233c(r2)
            java.lang.Object[] r24 = r0.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r26 = "refreshPost"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r13
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r13.setVisibility(r0)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r25 = "refreshPost"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            r0 = 0
            r3.setVisibility(r0)
            goto L_0x0bf3
        L_0x0ab1:
            k20.a r1 = new k20.a
            r1.<init>()
            r10 = 8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r1.mo10233c(r11)
            java.lang.Object[] r24 = r1.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r26 = "refreshPost"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r4
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r10 = 0
            java.lang.Object r1 = r1.mo10231a(r10)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4.setVisibility(r1)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r25 = "refreshPost"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            k20.a r1 = new k20.a
            r1.<init>()
            r4 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r1.mo10233c(r10)
            java.lang.Object[] r24 = r1.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r26 = "refreshPost"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r2
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r4 = 0
            java.lang.Object r1 = r1.mo10231a(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.setVisibility(r1)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r25 = "refreshPost"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            k20.a r1 = new k20.a
            r1.<init>()
            r2 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r4)
            java.lang.Object[] r24 = r1.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r26 = "refreshPost"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r5
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5.setVisibility(r1)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r25 = "refreshPost"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            r1 = 8
            r3.setVisibility(r1)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2.mo10233c(r3)
            java.lang.Object[] r24 = r2.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r26 = "refreshPost"
            java.lang.String r27 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r13
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r1 = 0
            java.lang.Object r2 = r2.mo10231a(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            r13.setVisibility(r1)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert"
            java.lang.String r25 = "refreshPost"
            java.lang.String r26 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            r1 = 2
            int[] r1 = new int[r1]
            int r2 = r0.getProgress()
            r3 = 0
            r1[r3] = r2
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r33.mo3513o()
            te3.tq2 r2 = r2.getPostInfo()
            int r2 = r2.f185649h
            r3 = 1
            r1[r3] = r2
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofInt(r1)
            r6.f40247q = r1
            gy3.C87412m.m108591d(r1)
            ve1.h3 r2 = new ve1.h3
            r2.<init>(r0)
            r1.addUpdateListener(r2)
            android.animation.ValueAnimator r0 = r6.f40247q
            gy3.C87412m.m108591d(r0)
            r1 = 400(0x190, double:1.976E-321)
            android.animation.ValueAnimator r0 = r0.setDuration(r1)
            if (r0 == 0) goto L_0x0bf3
            r0.start()
        L_0x0bf3:
            r0 = 2131313069(0x7f0941ad, float:1.8244524E38)
            android.view.View r0 = r7.mo85812D(r0)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            android.content.Context r1 = r7.f173499A
            gy3.C87412m.m108593f(r1, r12)
            bl3.r$a r1 = r9.mo62443b(r1)
            java.lang.Class<rs1.r2> r2 = rs1.C13390r2.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            java.lang.String r2 = "UICProvider.of(holder.co…ltiSelectMgr::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            rs1.r2 r1 = (rs1.C13390r2) r1
            boolean r2 = r1.f37929d
            if (r2 == 0) goto L_0x0c40
            fy3.r<jq3.o, com.tencent.mm.plugin.finder.model.BaseFinderFeed, java.lang.Integer, java.lang.Boolean, rx3.b0> r2 = r6.f40241h
            if (r2 == 0) goto L_0x0c40
            r2 = 0
            r0.setVisibility(r2)
            long r2 = r33.getItemId()
            java.util.HashMap<java.lang.Long, java.lang.Boolean> r1 = r1.f37930e
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            if (r1 != 0) goto L_0x0c30
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L_0x0c30:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            boolean r2 = r0.isChecked()
            if (r2 == r1) goto L_0x0c45
            r0.setChecked(r1)
            goto L_0x0c45
        L_0x0c40:
            r1 = 8
            r0.setVisibility(r1)
        L_0x0c45:
            kf1.ob r0 = r6.f40246p
            if (r0 == 0) goto L_0x0c55
            te3.sn1 r0 = r0.f30538a
            if (r0 == 0) goto L_0x0c55
            te3.zj0 r0 = r0.f141633w
            if (r0 == 0) goto L_0x0c55
            java.lang.String r0 = r0.f146010i
            r21 = r0
        L_0x0c55:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r21)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0ce9
            r0 = 2131302755(0x7f091963, float:1.8223605E38)
            android.view.View r0 = r7.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.Context r1 = r7.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131100560(0x7f060390, float:1.7813505E38)
            int r1 = r1.getColor(r2)
            android.content.Context r2 = r7.f173499A
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131100562(0x7f060392, float:1.7813509E38)
            int r2 = r2.getColor(r3)
            android.content.Context r3 = r7.f173499A
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131100565(0x7f060395, float:1.7813515E38)
            int r3 = r3.getColor(r4)
            r15.setTextColor(r1)
            r0.setTextColor(r1)
            r0 = 2131304592(0x7f092090, float:1.822733E38)
            android.view.View r0 = r7.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0ca1
            r0.setTextColor(r1)
        L_0x0ca1:
            r0 = 2131304571(0x7f09207b, float:1.8227288E38)
            android.view.View r0 = r7.mo85812D(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0caf
            r0.setTextColor(r1)
        L_0x0caf:
            r0 = 2131304483(0x7f092023, float:1.822711E38)
            android.view.View r0 = r7.mo85812D(r0)
            if (r0 == 0) goto L_0x0cbb
            r0.setBackgroundColor(r3)
        L_0x0cbb:
            r0 = 2131311487(0x7f093b7f, float:1.8241316E38)
            android.view.View r0 = r7.mo85812D(r0)
            if (r0 == 0) goto L_0x0cc7
            r0.setBackgroundColor(r3)
        L_0x0cc7:
            r0 = 2131311403(0x7f093b2b, float:1.8241145E38)
            android.view.View r0 = r7.mo85812D(r0)
            if (r0 == 0) goto L_0x0cd3
            r0.setBackgroundColor(r3)
        L_0x0cd3:
            r0 = 2131311397(0x7f093b25, float:1.8241133E38)
            android.view.View r0 = r7.mo85812D(r0)
            r0.setBackgroundColor(r2)
            r0 = 2131311398(0x7f093b26, float:1.8241135E38)
            android.view.View r0 = r7.mo85812D(r0)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r0
            r0.setIconColor(r2)
        L_0x0ce9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14514f3.mo44e(jq3.o, com.tencent.mm.plugin.finder.model.BaseFinderFeed, int, int, boolean, java.util.List):void");
    }

    /* renamed from: m */
    public final CharSequence mo13776m(Context context, TextPaint textPaint, SpannableString spannableString, int i, String str) {
        TextPaint textPaint2 = textPaint;
        SpannableString spannableString2 = spannableString;
        if (spannableString2 == null) {
            return null;
        }
        if (Util.isNullOrNil(str)) {
            return spannableString2;
        }
        int E = C112550d0.m153769E(spannableString, str, 0, false, 6, (Object) null);
        int length = str.length() + E;
        if (E < 0) {
            return spannableString2;
        }
        float measureText = textPaint2.measureText("…");
        float measureText2 = textPaint2.measureText(spannableString2, 0, E);
        float measureText3 = textPaint2.measureText(spannableString2, E, length);
        float measureText4 = textPaint2.measureText(spannableString2, length, spannableString.length());
        float f = measureText2 + measureText3;
        float f2 = (float) i;
        if (f + measureText4 < f2) {
            spannableString2.setSpan(new ForegroundColorSpan(context.getResources().getColor(C0966R.color.f2939n)), E, length, 33);
            return spannableString2;
        }
        SpannableString spannableString3 = new SpannableString(str);
        spannableString3.setSpan(new ForegroundColorSpan(context.getResources().getColor(C0966R.color.f2939n)), 0, str.length(), 33);
        if (f + measureText < f2) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableString2, 0, E);
            spannableStringBuilder.append(spannableString3);
            CharSequence subSequence = spannableString2.subSequence(length, spannableString.length());
            C87412m.m108593f(subSequence, "text.subSequence(hlEnd, text.length)");
            spannableStringBuilder.append(TextUtils.ellipsize(subSequence, textPaint2, (f2 - measureText2) - measureText3, TextUtils.TruncateAt.END));
            return spannableStringBuilder;
        } else if (measureText3 + measureText4 + measureText < f2) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            CharSequence subSequence2 = spannableString2.subSequence(0, E);
            C87412m.m108593f(subSequence2, "text.subSequence(0, hlStart)");
            spannableStringBuilder2.append(TextUtils.ellipsize(subSequence2, textPaint2, (f2 - measureText3) - measureText4, TextUtils.TruncateAt.START));
            spannableStringBuilder2.append(spannableString3);
            spannableStringBuilder2.append(spannableString2, length, spannableString.length());
            return spannableStringBuilder2;
        } else if (measureText + measureText3 + measureText >= f2) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append(TextUtils.ellipsize(spannableString3, textPaint2, f2, TextUtils.TruncateAt.END));
            return spannableStringBuilder3;
        } else {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
            float f3 = (f2 - measureText3) / ((float) 2);
            CharSequence subSequence3 = spannableString2.subSequence(0, E);
            C87412m.m108593f(subSequence3, "text.subSequence(0, hlStart)");
            CharSequence subSequence4 = spannableString2.subSequence(length, spannableString.length());
            C87412m.m108593f(subSequence4, "text.subSequence(hlEnd, text.length)");
            spannableStringBuilder4.append(TextUtils.ellipsize(subSequence3, textPaint2, f3, TextUtils.TruncateAt.START));
            spannableStringBuilder4.append(spannableString3);
            spannableStringBuilder4.append(TextUtils.ellipsize(subSequence4, textPaint2, f3, TextUtils.TruncateAt.END));
            return spannableStringBuilder4;
        }
    }

    public C14514f3(int i, C7461a aVar, int i2, C32229r<? super C60905o, ? super BaseFinderFeed, ? super Integer, ? super Boolean, C13598b0> rVar, C32224a<String> aVar2) {
        C87412m.m108594g(aVar, "itemViewConfig");
        this.f40238e = i;
        this.f40239f = aVar;
        this.f40240g = i2;
        this.f40241h = rVar;
        this.f40242i = aVar2;
        this.f40243j = C36568h.m40985a(C14518d.f40255d);
        this.f40244n = C36568h.m40985a(C14515a.f40248d);
        this.f40245o = C36568h.m40985a(new C14519e(this));
    }
}
