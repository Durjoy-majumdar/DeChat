package cn1;

import an1.C0102o;
import android.app.Application;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.LinkedList;
import jq3.C60896i;
import jq3.C60905o;
import k60.C60979d;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C64273c21;
import te3.C64689rq2;
import tf0.C13887q1;
import up1.C27696y;
import xm1.C15828e;

/* renamed from: cn1.a1 */
public final class C0807a1 extends C60896i<C0102o> {

    /* renamed from: e */
    public final boolean f1882e;

    /* renamed from: f */
    public final int f1883f;

    /* renamed from: g */
    public final float f1884g;

    /* renamed from: h */
    public final C32227p<Long, String, C13598b0> f1885h;

    /* renamed from: i */
    public ViewGroup f1886i;

    /* renamed from: cn1.a1$a */
    public final class C0808a {

        /* renamed from: a */
        public Application.ActivityLifecycleCallbacks f1887a;

        public C0808a(C0807a1 a1Var) {
        }
    }

    public C0807a1(boolean z, int i, float f, C15828e eVar, C32227p pVar, int i2, C8480h hVar) {
        z = (i2 & 1) != 0 ? false : z;
        f = (i2 & 4) != 0 ? 1.7776f : f;
        C87412m.m108594g(eVar, "outsideOperator");
        C87412m.m108594g(pVar, "jumProfileCallback");
        this.f1882e = z;
        this.f1883f = i;
        this.f1884g = f;
        this.f1885h = pVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cn8;
    }

    /* JADX WARNING: type inference failed for: r4v23, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x036a  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r23, jq3.C9493c r24, int r25, int r26, boolean r27, java.util.List r28) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            an1.o r2 = (an1.C0102o) r2
            java.lang.String r3 = "holder"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "item"
            gy3.C87412m.m108594g(r2, r3)
            r22.mo737k(r23)
            cn1.a1$a r3 = new cn1.a1$a
            r3.<init>(r0)
            android.view.View r4 = r1.f44854d
            r5 = 2131310054(0x7f0935e6, float:1.823841E38)
            java.lang.String r6 = ""
            r4.setTag(r5, r6)
            android.view.View r4 = r1.f44854d
            r5 = 2131310053(0x7f0935e5, float:1.8238407E38)
            r4.setTag(r5, r6)
            android.view.View r4 = r1.f44854d
            r5 = 2131310052(0x7f0935e4, float:1.8238405E38)
            r4.setTag(r5, r6)
            android.view.View r4 = r1.f44854d
            r5 = 2131310056(0x7f0935e8, float:1.8238413E38)
            android.view.View r4 = r4.findViewById(r5)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r0.f1886i = r4
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r2.mo3513o()
            boolean r4 = r4.isLiveFeed()
            if (r4 == 0) goto L_0x005a
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r2.mo3513o()
            java.util.LinkedList r4 = r4.getLiveMediaList()
            java.lang.Object r4 = sx3.C110818d0.m150914L(r4)
            te3.rq2 r4 = (te3.C64689rq2) r4
            goto L_0x0068
        L_0x005a:
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r2.mo3513o()
            java.util.LinkedList r4 = r4.getMediaList()
            java.lang.Object r4 = sx3.C110818d0.m150914L(r4)
            te3.rq2 r4 = (te3.C64689rq2) r4
        L_0x0068:
            java.lang.Class<pl1.s0> r5 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r7 = ht1.C60200t1.class
            r8 = 2131302682(0x7f09191a, float:1.8223457E38)
            android.view.View r8 = r1.mo85812D(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            bl3.r r9 = bl3.C39818r.f106831a
            bl3.r$a r10 = r9.mo62446e(r7)
            bl3.c r10 = r10.mo62447c(r5)
            pl1.s0 r10 = (pl1.C11990s0) r10
            k60.d r10 = r10.mo11872i2()
            pl1.f r11 = new pl1.f
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r2.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r12 = r12.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r12 = r12.contact
            r13 = 0
            if (r12 == 0) goto L_0x0097
            java.lang.String r12 = r12.headUrl
            goto L_0x0098
        L_0x0097:
            r12 = r13
        L_0x0098:
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            up1.y r14 = up1.C27696y.SMALL_AVATAR_IMAGE
            r11.<init>(r12, r14)
            java.lang.String r12 = "avatar"
            gy3.C87412m.m108593f(r8, r12)
            pl1.e0$a r12 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r7 = r9.mo62446e(r7)
            bl3.c r5 = r7.mo62447c(r5)
            pl1.s0 r5 = (pl1.C11990s0) r5
            n60.f r5 = r5.mo11867O2(r12)
            r10.mo85957c(r11, r8, r5)
            cn1.b1 r5 = new cn1.b1
            r5.<init>(r2, r1, r0)
            r8.setOnClickListener(r5)
            r5 = 2131304533(0x7f092055, float:1.8227211E38)
            android.view.View r5 = r1.mo85812D(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r7 = 2131302755(0x7f091963, float:1.8223605E38)
            android.view.View r8 = r1.mo85812D(r7)
            android.widget.TextView r8 = (android.widget.TextView) r8
            wc1.b r14 = wc1.C15064b.f41199a
            android.content.Context r15 = r1.f173499A
            java.lang.String r9 = "holder.context"
            gy3.C87412m.m108593f(r15, r9)
            r17 = 1096810496(0x41600000, float:14.0)
            r18 = 0
            r19 = 8
            r20 = 0
            r16 = r5
            wc1.C15064b.m14230a(r14, r15, r16, r17, r18, r19, r20)
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r2.mo3513o()
            android.text.SpannableString r9 = r9.getNickNameSpan()
            r5.setText(r9)
            android.view.ViewGroup r9 = r0.f1886i
            if (r9 == 0) goto L_0x0102
            r10 = 2131302575(0x7f0918af, float:1.822324E38)
            java.lang.CharSequence r11 = r5.getText()
            r9.setTag(r10, r11)
        L_0x0102:
            android.text.TextPaint r8 = r8.getPaint()
            r9 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r8, r9)
            android.text.TextPaint r8 = r5.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r8, r9)
            cn1.c1 r8 = new cn1.c1
            r8.<init>(r2, r1, r0)
            r5.setOnClickListener(r8)
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.contact
            r8 = 0
            if (r5 == 0) goto L_0x0160
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r9 = r5.authInfo
            if (r9 == 0) goto L_0x012f
            int r9 = r9.authIconType
            goto L_0x0130
        L_0x012f:
            r9 = 0
        L_0x0130:
            android.view.ViewGroup r10 = r0.f1886i
            if (r10 == 0) goto L_0x013e
            r11 = 2131302511(0x7f09186f, float:1.822311E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10.setTag(r11, r9)
        L_0x013e:
            er1.w3 r14 = er1.C58784w3.f168295a
            r9 = 2131297406(0x7f09047e, float:1.8212756E38)
            android.view.View r9 = r1.mo85812D(r9)
            java.lang.String r10 = "holder.getView(R.id.auth_icon)"
            gy3.C87412m.m108593f(r9, r10)
            r15 = r9
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r9 = r5.authInfo
            r17 = 0
            te3.cg r18 = fe1.C58960c.m68829a(r5, r8)
            r19 = 4
            r20 = 0
            r16 = r9
            er1.C58784w3.m68429F1(r14, r15, r16, r17, r18, r19, r20)
        L_0x0160:
            android.view.View r5 = r1.mo85812D(r7)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String r7 = r2.f904e
            r9 = 1
            if (r7 == 0) goto L_0x0178
            int r7 = r7.length()
            if (r7 <= 0) goto L_0x0173
            r7 = 1
            goto L_0x0174
        L_0x0173:
            r7 = 0
        L_0x0174:
            if (r7 != r9) goto L_0x0178
            r7 = 1
            goto L_0x0179
        L_0x0178:
            r7 = 0
        L_0x0179:
            r10 = 8
            if (r7 == 0) goto L_0x0186
            r5.setVisibility(r8)
            java.lang.String r7 = r2.f904e
            r5.setText(r7)
            goto L_0x01a6
        L_0x0186:
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r2.mo3513o()
            java.lang.String r7 = r7.getDescription()
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x01a3
            r5.setVisibility(r8)
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r2.mo3513o()
            android.text.SpannableString r7 = r7.getDescriptionSpan()
            r5.setText(r7)
            goto L_0x01a6
        L_0x01a3:
            r5.setVisibility(r10)
        L_0x01a6:
            r0.mo736j(r1, r4, r2)     // Catch:{ all -> 0x01aa }
            goto L_0x01b1
        L_0x01aa:
            java.lang.String r4 = "Finder.Loader"
            java.lang.String r5 = "bindCover throw Throwable."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r5)
        L_0x01b1:
            r4 = 2131303847(0x7f091da7, float:1.822582E38)
            android.view.View r4 = r1.mo85812D(r4)
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r4 = (com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget) r4
            r5 = 2131304081(0x7f091e91, float:1.8226295E38)
            android.view.View r5 = r1.mo85812D(r5)
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r2.mo3513o()
            boolean r7 = r7.isLiveFeed()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            if (r7 == 0) goto L_0x0267
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r2.mo3513o()
            te3.c21 r7 = r7.getLiveInfo()
            if (r7 == 0) goto L_0x01df
            int r7 = r7.f182394f
            if (r7 != r9) goto L_0x01df
            r7 = 1
            goto L_0x01e0
        L_0x01df:
            r7 = 0
        L_0x01e0:
            if (r7 == 0) goto L_0x0227
            r4.setVisibility(r10)
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r4.mo10233c(r7)
            java.lang.Object[] r15 = r4.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/RelatedLivingConvert"
            java.lang.String r17 = "bindLive"
            java.lang.String r18 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r5
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r4 = r4.mo10231a(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5.setVisibility(r4)
            java.lang.String r15 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/RelatedLivingConvert"
            java.lang.String r16 = "bindLive"
            java.lang.String r17 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x02a6
        L_0x0227:
            r4.setVisibility(r8)
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            r4.mo10233c(r11)
            java.lang.Object[] r15 = r4.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/RelatedLivingConvert"
            java.lang.String r17 = "bindLive"
            java.lang.String r18 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r5
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r4 = r4.mo10231a(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5.setVisibility(r4)
            java.lang.String r15 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/RelatedLivingConvert"
            java.lang.String r16 = "bindLive"
            java.lang.String r17 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x02a6
        L_0x0267:
            r4.setVisibility(r10)
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            r4.mo10233c(r11)
            java.lang.Object[] r15 = r4.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/RelatedLivingConvert"
            java.lang.String r17 = "bindLive"
            java.lang.String r18 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r5
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r4 = r4.mo10231a(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5.setVisibility(r4)
            java.lang.String r15 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/RelatedLivingConvert"
            java.lang.String r16 = "bindLive"
            java.lang.String r17 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
        L_0x02a6:
            android.view.View r4 = r1.f44854d
            android.content.Context r4 = r4.getContext()
            boolean r5 = r4 instanceof com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI
            if (r5 == 0) goto L_0x02b3
            com.tencent.mm.plugin.finder.ui.MMFinderUI r4 = (com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI) r4
            goto L_0x02b4
        L_0x02b3:
            r4 = r13
        L_0x02b4:
            if (r4 == 0) goto L_0x02fc
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.getFeedObject()
            long r11 = r5.block_cgi_flag
            r14 = 1
            long r11 = r11 & r14
            r14 = 0
            int r5 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r5 != 0) goto L_0x02fc
            bl3.r r5 = bl3.C39818r.f106831a
            bl3.r$a r5 = r5.mo62444c(r4)
            java.lang.Class<ht1.w2> r7 = ht1.C8809w2.class
            bl3.c r5 = r5.mo62447c(r7)
            ht1.w2 r5 = (ht1.C8809w2) r5
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r2.mo3513o()
            long r11 = r7.getId()
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r2.mo3513o()
            java.lang.String r17 = r7.getObjectNonceId()
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r2.mo3513o()
            te3.c21 r7 = r7.getLiveInfo()
            if (r7 == 0) goto L_0x02f3
            long r14 = r7.f182392d
        L_0x02f3:
            r18 = r14
            r14 = r5
            r15 = r11
            r20 = r4
            r14.mo9637P0(r15, r17, r18, r20)
        L_0x02fc:
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r2.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            java.lang.String r4 = r4.recommendReason
            if (r4 != 0) goto L_0x0309
            r4 = r6
        L_0x0309:
            r5 = 2131311848(0x7f093ce8, float:1.8242048E38)
            android.view.View r5 = r1.mo85812D(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 != 0) goto L_0x0315
            goto L_0x0325
        L_0x0315:
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r2.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.getFeedObject()
            java.lang.String r7 = r7.recommendReason
            if (r7 == 0) goto L_0x0322
            r6 = r7
        L_0x0322:
            r5.setText(r6)
        L_0x0325:
            if (r5 != 0) goto L_0x0328
            goto L_0x033a
        L_0x0328:
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0330
            r4 = 1
            goto L_0x0331
        L_0x0330:
            r4 = 0
        L_0x0331:
            if (r4 == 0) goto L_0x0336
            r4 = 8
            goto L_0x0337
        L_0x0336:
            r4 = 0
        L_0x0337:
            r5.setVisibility(r4)
        L_0x033a:
            r4 = 2131316870(0x7f095086, float:1.8252234E38)
            android.view.View r4 = r1.mo85812D(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r2.mo3513o()
            te3.c21 r5 = r5.getLiveInfo()
            if (r5 == 0) goto L_0x0350
            int r5 = r5.f182403q
            goto L_0x0351
        L_0x0350:
            r5 = 0
        L_0x0351:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r2.mo3513o()
            te3.c21 r2 = r2.getLiveInfo()
            if (r2 == 0) goto L_0x035e
            java.lang.String r2 = r2.f182411x0
            goto L_0x035f
        L_0x035e:
            r2 = r13
        L_0x035f:
            if (r2 == 0) goto L_0x036a
            int r6 = r2.length()
            if (r6 != 0) goto L_0x0368
            goto L_0x036a
        L_0x0368:
            r6 = 0
            goto L_0x036b
        L_0x036a:
            r6 = 1
        L_0x036b:
            if (r6 == 0) goto L_0x0373
            if (r5 <= 0) goto L_0x0373
            java.lang.String r2 = er1.C7878t0.m8033b(r5)
        L_0x0373:
            if (r2 == 0) goto L_0x037d
            int r5 = r2.length()
            if (r5 != 0) goto L_0x037c
            goto L_0x037d
        L_0x037c:
            r9 = 0
        L_0x037d:
            if (r9 != 0) goto L_0x0386
            r4.setText(r2)
            r4.setVisibility(r8)
            goto L_0x0389
        L_0x0386:
            r4.setVisibility(r10)
        L_0x0389:
            cn1.d1 r2 = new cn1.d1
            r2.<init>(r1, r0)
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Context r4 = r4.getApplicationContext()
            boolean r5 = r4 instanceof android.app.Application
            if (r5 == 0) goto L_0x039d
            r13 = r4
            android.app.Application r13 = (android.app.Application) r13
        L_0x039d:
            if (r13 == 0) goto L_0x03a2
            r13.registerActivityLifecycleCallbacks(r2)
        L_0x03a2:
            r3.f1887a = r2
            r1.f173502D = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn1.C0807a1.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: i */
    public void mo735i(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        Log.m105924i("Finder.Loader", "#onViewRecycled holder=" + oVar);
        mo737k(oVar);
    }

    /* renamed from: j */
    public final void mo736j(C60905o oVar, C64689rq2 rq22, C0102o oVar2) {
        String str;
        String str2;
        String str3;
        FinderObjectDesc finderObjectDesc;
        LinkedList<FinderMedia> linkedList;
        FinderMedia finderMedia;
        FinderObjectDesc finderObjectDesc2;
        LinkedList<FinderMedia> linkedList2;
        FinderMedia finderMedia2;
        FinderObjectDesc finderObjectDesc3;
        LinkedList<FinderMedia> linkedList3;
        FinderMedia finderMedia3;
        C60905o oVar3 = oVar;
        C64689rq2 rq23 = rq22;
        C0102o oVar4 = oVar2;
        ImageView imageView = (ImageView) oVar3.mo85812D(C0966R.C0970id.kk6);
        oVar3.mo85812D(C0966R.C0970id.fwx);
        if (imageView == null) {
            Log.m105928w("Finder.Loader", "bindCover return for thumbIv is null.");
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i = (int) (((double) this.f1883f) * 0.66666d * ((double) this.f1884g));
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
        ((ViewGroup) oVar3.mo85812D(C0966R.C0970id.m_e)).getLayoutParams().height = i;
        ViewGroup viewGroup = this.f1886i;
        ViewGroup.LayoutParams layoutParams2 = viewGroup != null ? viewGroup.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.width = this.f1883f;
        }
        ViewGroup viewGroup2 = this.f1886i;
        ViewGroup.LayoutParams layoutParams3 = viewGroup2 != null ? viewGroup2.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.height = (int) (this.f1884g * ((float) this.f1883f));
        }
        ImageView imageView2 = (ImageView) oVar3.mo85812D(C0966R.C0970id.m_l);
        imageView2.getLayoutParams().height = layoutParams.height / 3;
        ImageView imageView3 = (ImageView) oVar3.mo85812D(C0966R.C0970id.m_m);
        imageView3.getLayoutParams().height = layoutParams.height / 3;
        ImageView imageView4 = (ImageView) oVar3.mo85812D(C0966R.C0970id.m_n);
        imageView4.getLayoutParams().height = layoutParams.height / 3;
        FinderObject finderObject = (FinderObject) C110818d0.m150917O(oVar4.f543h, 0);
        if (finderObject == null || (finderObjectDesc3 = finderObject.objectDesc) == null || (linkedList3 = finderObjectDesc3.media) == null || (finderMedia3 = (FinderMedia) C110818d0.m150916N(linkedList3)) == null) {
            str = null;
        } else {
            str = finderMedia3.thumbUrl + Util.nullAsNil(finderMedia3.thumb_url_token);
        }
        FinderObject finderObject2 = (FinderObject) C110818d0.m150917O(oVar4.f543h, 1);
        if (finderObject2 == null || (finderObjectDesc2 = finderObject2.objectDesc) == null || (linkedList2 = finderObjectDesc2.media) == null || (finderMedia2 = (FinderMedia) C110818d0.m150916N(linkedList2)) == null) {
            str2 = null;
        } else {
            str2 = finderMedia2.thumbUrl + Util.nullAsNil(finderMedia2.thumb_url_token);
        }
        FinderObject finderObject3 = (FinderObject) C110818d0.m150917O(oVar4.f543h, 2);
        if (finderObject3 == null || (finderObjectDesc = finderObject3.objectDesc) == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null) {
            str3 = null;
        } else {
            str3 = finderMedia.thumbUrl + Util.nullAsNil(finderMedia.thumb_url_token);
        }
        C11978e0 e0Var = C11978e0.f34938a;
        C60979d<C100810g0> b = e0Var.mo11850b();
        C62345f fVar = new C62345f(str, (C27696y) null, 2, (C8480h) null);
        C11978e0.C11979a aVar = C11978e0.C11979a.DEFAULT;
        b.mo85957c(fVar, imageView2, e0Var.mo11851c(aVar));
        e0Var.mo11850b().mo85957c(new C62345f(str2, (C27696y) null, 2, (C8480h) null), imageView3, e0Var.mo11851c(aVar));
        e0Var.mo11850b().mo85957c(new C62345f(str3, (C27696y) null, 2, (C8480h) null), imageView4, e0Var.mo11851c(aVar));
        String str4 = oVar4.f905f;
        if (str4 == null) {
            str4 = "";
        }
        if (Util.isNullOrNil(str4) && (str4 = oVar4.f905f) == null) {
            str4 = Util.nullAsNil(rq23.f185283w) + Util.nullAsNil(rq23.f185234A);
        }
        if (Util.isNullOrNil(str4)) {
            str4 = Util.nullAsNil(rq23.f185267e) + Util.nullAsNil(rq23.f185288z);
        }
        String str5 = str4;
        C64273c21 liveInfo = oVar2.mo3513o().getLiveInfo();
        if (liveInfo != null && liveInfo.f182394f == 1) {
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            e0Var.mo11850b().mo85957c(new C11984n0(str5, C27696y.RAW_IMAGE), imageView, this.f1882e ? ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DARK_LIVE_SQUARE) : ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
            return;
        }
        C7335d c = C86312j.m106911c(C13887q1.class);
        C87412m.m108593f(c, "getService(IFinderCommonLiveService::class.java)");
        C13887q1.C13888a.m13309e((C13887q1) c, imageView, str5, 0, 4, (Object) null);
    }

    /* renamed from: k */
    public final void mo737k(C60905o oVar) {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
        Object obj = oVar.f173502D;
        if (!(obj == null || !(obj instanceof C0808a) || (activityLifecycleCallbacks = ((C0808a) obj).f1887a) == null)) {
            Context applicationContext = MMApplicationContext.getContext().getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            }
        }
        oVar.f173502D = null;
    }
}
