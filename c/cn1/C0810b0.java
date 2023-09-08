package cn1;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53973z1;
import android.app.Application;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import bn1.C0331b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import er1.C7878t0;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.concurrent.CancellationException;
import jq3.C60896i;
import jq3.C60905o;
import k60.C60979d;
import n60.C100075f;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import rx3.C13598b0;
import te3.C64273c21;
import te3.C64456ix0;
import te3.C64689rq2;
import tf0.C13887q1;
import up1.C27696y;
import xm1.C15828e;

/* renamed from: cn1.b0 */
public final class C0810b0 extends C60896i<C0331b> {

    /* renamed from: e */
    public final boolean f1890e;

    /* renamed from: f */
    public final int f1891f;

    /* renamed from: g */
    public final float f1892g;

    /* renamed from: h */
    public final C32227p<Long, String, C13598b0> f1893h;

    /* renamed from: i */
    public ViewGroup f1894i;

    /* renamed from: cn1.b0$a */
    public static final class C0811a {

        /* renamed from: a */
        public final boolean f1895a;

        /* renamed from: b */
        public final int f1896b;

        /* renamed from: c */
        public final int f1897c;

        /* renamed from: d */
        public final boolean f1898d;

        public C0811a(boolean z, int i, int i2, boolean z2) {
            this.f1895a = z;
            this.f1896b = i;
            this.f1897c = i2;
            this.f1898d = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0811a)) {
                return false;
            }
            C0811a aVar = (C0811a) obj;
            return this.f1895a == aVar.f1895a && this.f1896b == aVar.f1896b && this.f1897c == aVar.f1897c && this.f1898d == aVar.f1898d;
        }

        public int hashCode() {
            boolean z = this.f1895a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (((((z ? 1 : 0) * true) + this.f1896b) * 31) + this.f1897c) * 31;
            boolean z3 = this.f1898d;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            return "RequestAndRefreshLiveInfo(isSuccess=" + this.f1895a + ", interval=" + this.f1896b + ", participantCount=" + this.f1897c + ", isLiving=" + this.f1898d + ')';
        }
    }

    /* renamed from: cn1.b0$b */
    public final class C0812b {

        /* renamed from: a */
        public final C0000n0 f1899a = C53930o0.m60555b();

        /* renamed from: b */
        public C53973z1 f1900b;

        /* renamed from: c */
        public Application.ActivityLifecycleCallbacks f1901c;

        public C0812b(C0810b0 b0Var) {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0810b0(boolean z, int i, float f, C15828e eVar, C32227p pVar, int i2, C8480h hVar) {
        this((i2 & 1) != 0 ? false : z, i, (i2 & 4) != 0 ? 1.7776f : f, eVar, pVar);
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cn7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x04a9  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x04ab  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x03be  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r25, jq3.C9493c r26, int r27, int r28, boolean r29, java.util.List r30) {
        /*
            r24 = this;
            r6 = r24
            r7 = r25
            r8 = r26
            bn1.b r8 = (bn1.C0331b) r8
            java.lang.Class<l31.e> r9 = l31.C61212e.class
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r8, r0)
            r24.mo740k(r25)
            cn1.b0$b r10 = new cn1.b0$b
            r10.<init>(r6)
            android.view.View r0 = r7.f44854d
            java.lang.String r1 = "holder.itemView"
            gy3.C87412m.m108593f(r0, r1)
            boolean r1 = zo3.C16376b.f43775a
            if (r1 == 0) goto L_0x0035
            r1 = 2131314894(0x7f0948ce, float:1.8248226E38)
            java.lang.String r2 = "FinderLive"
            r0.setTag(r1, r2)
            r1 = 2131314893(0x7f0948cd, float:1.8248224E38)
            r0.setTag(r1, r8)
        L_0x0035:
            android.view.View r0 = r7.f44854d
            r1 = 2131310054(0x7f0935e6, float:1.823841E38)
            java.lang.String r11 = ""
            r0.setTag(r1, r11)
            android.view.View r0 = r7.f44854d
            r1 = 2131310053(0x7f0935e5, float:1.8238407E38)
            r0.setTag(r1, r11)
            android.view.View r0 = r7.f44854d
            r1 = 2131310052(0x7f0935e4, float:1.8238405E38)
            r0.setTag(r1, r11)
            android.view.View r0 = r7.f44854d
            r1 = 2131310056(0x7f0935e8, float:1.8238413E38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r6.f1894i = r0
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r8.mo3513o()
            boolean r0 = r0.isLiveFeed()
            if (r0 == 0) goto L_0x0075
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r8.mo3513o()
            java.util.LinkedList r0 = r0.getLiveMediaList()
            java.lang.Object r0 = sx3.C110818d0.m150914L(r0)
            te3.rq2 r0 = (te3.C64689rq2) r0
            goto L_0x0083
        L_0x0075:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r8.mo3513o()
            java.util.LinkedList r0 = r0.getMediaList()
            java.lang.Object r0 = sx3.C110818d0.m150914L(r0)
            te3.rq2 r0 = (te3.C64689rq2) r0
        L_0x0083:
            java.lang.Class<pl1.s0> r1 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            r3 = 2131302682(0x7f09191a, float:1.8223457E38)
            android.view.View r3 = r7.mo85812D(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r5 = r4.mo62446e(r2)
            bl3.c r5 = r5.mo62447c(r1)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11872i2()
            pl1.f r12 = new pl1.f
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r8.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r13 = r13.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r13 = r13.contact
            r14 = 0
            if (r13 == 0) goto L_0x00b2
            java.lang.String r13 = r13.headUrl
            goto L_0x00b3
        L_0x00b2:
            r13 = r14
        L_0x00b3:
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)
            up1.y r15 = up1.C27696y.SMALL_AVATAR_IMAGE
            r12.<init>(r13, r15)
            java.lang.String r13 = "avatar"
            gy3.C87412m.m108593f(r3, r13)
            pl1.e0$a r13 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r2 = r4.mo62446e(r2)
            bl3.c r1 = r2.mo62447c(r1)
            pl1.s0 r1 = (pl1.C11990s0) r1
            n60.f r1 = r1.mo11867O2(r13)
            r5.mo85957c(r12, r3, r1)
            cn1.d0 r1 = new cn1.d0
            r1.<init>(r8, r7, r6)
            r3.setOnClickListener(r1)
            android.content.Context r1 = r7.f173499A
            r2 = 2131828885(0x7f112095, float:1.9290723E38)
            java.lang.String r1 = r1.getString(r2)
            r3.setContentDescription(r1)
            r1 = 2131304533(0x7f092055, float:1.8227211E38)
            android.view.View r1 = r7.mo85812D(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 2131302755(0x7f091963, float:1.8223605E38)
            android.view.View r3 = r7.mo85812D(r2)
            android.widget.TextView r3 = (android.widget.TextView) r3
            wc1.b r15 = wc1.C15064b.f41199a
            android.content.Context r4 = r7.f173499A
            java.lang.String r12 = "holder.context"
            gy3.C87412m.m108593f(r4, r12)
            r18 = 1096810496(0x41600000, float:14.0)
            r19 = 0
            r20 = 8
            r21 = 0
            r16 = r4
            r17 = r1
            wc1.C15064b.m14230a(r15, r16, r17, r18, r19, r20, r21)
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r8.mo3513o()
            android.text.SpannableString r4 = r4.getNickNameSpan()
            r1.setText(r4)
            android.view.ViewGroup r4 = r6.f1894i
            if (r4 == 0) goto L_0x012b
            r5 = 2131302575(0x7f0918af, float:1.822324E38)
            java.lang.CharSequence r13 = r1.getText()
            r4.setTag(r5, r13)
        L_0x012b:
            android.text.TextPaint r3 = r3.getPaint()
            r4 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r3, r4)
            android.text.TextPaint r3 = r1.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r3, r4)
            cn1.e0 r3 = new cn1.e0
            r3.<init>(r8, r7, r6)
            r1.setOnClickListener(r3)
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r8.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderContact r1 = r1.contact
            r13 = 0
            if (r1 == 0) goto L_0x018a
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r3 = r1.authInfo
            if (r3 == 0) goto L_0x0158
            int r3 = r3.authIconType
            goto L_0x0159
        L_0x0158:
            r3 = 0
        L_0x0159:
            android.view.ViewGroup r4 = r6.f1894i
            if (r4 == 0) goto L_0x0167
            r5 = 2131302511(0x7f09186f, float:1.822311E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.setTag(r5, r3)
        L_0x0167:
            er1.w3 r15 = er1.C58784w3.f168295a
            r3 = 2131297406(0x7f09047e, float:1.8212756E38)
            android.view.View r3 = r7.mo85812D(r3)
            java.lang.String r4 = "holder.getView(R.id.auth_icon)"
            gy3.C87412m.m108593f(r3, r4)
            r16 = r3
            android.widget.ImageView r16 = (android.widget.ImageView) r16
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r3 = r1.authInfo
            r18 = 0
            te3.cg r19 = fe1.C58960c.m68829a(r1, r13)
            r20 = 4
            r21 = 0
            r17 = r3
            er1.C58784w3.m68429F1(r15, r16, r17, r18, r19, r20, r21)
        L_0x018a:
            android.view.View r1 = r7.mo85812D(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = r8.f904e
            r15 = 1
            if (r2 == 0) goto L_0x01a2
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x019d
            r2 = 1
            goto L_0x019e
        L_0x019d:
            r2 = 0
        L_0x019e:
            if (r2 != r15) goto L_0x01a2
            r2 = 1
            goto L_0x01a3
        L_0x01a2:
            r2 = 0
        L_0x01a3:
            if (r2 == 0) goto L_0x01ad
            r1.setVisibility(r13)
            java.lang.String r2 = r8.f904e
            r1.setText(r2)
        L_0x01ad:
            r6.mo739j(r7, r0, r8)     // Catch:{ all -> 0x01b1 }
            goto L_0x01b8
        L_0x01b1:
            java.lang.String r0 = "Finder.LivingConvert"
            java.lang.String r1 = "bindCover throw Throwable."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
        L_0x01b8:
            r0 = 2131303847(0x7f091da7, float:1.822582E38)
            android.view.View r0 = r7.mo85812D(r0)
            com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r0 = (com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget) r0
            r1 = 2131304081(0x7f091e91, float:1.8226295E38)
            android.view.View r1 = r7.mo85812D(r1)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r8.mo3513o()
            boolean r2 = r2.isLiveFeed()
            r3 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            if (r2 == 0) goto L_0x0272
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r8.mo3513o()
            te3.c21 r2 = r2.getLiveInfo()
            if (r2 == 0) goto L_0x01e8
            int r2 = r2.f182394f
            if (r2 != r15) goto L_0x01e8
            r2 = 1
            goto L_0x01e9
        L_0x01e8:
            r2 = 0
        L_0x01e9:
            if (r2 == 0) goto L_0x0231
            r0.setVisibility(r3)
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r0.mo10233c(r2)
            java.lang.Object[] r17 = r0.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert"
            java.lang.String r19 = "bindLive"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/base/LiveConvertData;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert$TagObject;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r0 = r0.mo10231a(r13)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.setVisibility(r0)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert"
            java.lang.String r18 = "bindLive"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/base/LiveConvertData;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert$TagObject;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x02b2
        L_0x0231:
            r0.setVisibility(r13)
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r0.mo10233c(r4)
            java.lang.Object[] r17 = r0.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert"
            java.lang.String r19 = "bindLive"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/base/LiveConvertData;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert$TagObject;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r0 = r0.mo10231a(r13)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.setVisibility(r0)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert"
            java.lang.String r18 = "bindLive"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/base/LiveConvertData;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert$TagObject;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x02b2
        L_0x0272:
            r0.setVisibility(r3)
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r0.mo10233c(r4)
            java.lang.Object[] r17 = r0.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert"
            java.lang.String r19 = "bindLive"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/base/LiveConvertData;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert$TagObject;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r0 = r0.mo10231a(r13)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.setVisibility(r0)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert"
            java.lang.String r18 = "bindLive"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/base/LiveConvertData;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert$TagObject;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x02b2:
            android.view.View r0 = r7.f44854d
            android.content.Context r0 = r0.getContext()
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI
            if (r1 == 0) goto L_0x02bf
            com.tencent.mm.plugin.finder.ui.MMFinderUI r0 = (com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI) r0
            goto L_0x02c0
        L_0x02bf:
            r0 = r14
        L_0x02c0:
            if (r0 == 0) goto L_0x030b
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r8.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            long r1 = r1.block_cgi_flag
            r4 = 1
            long r1 = r1 & r4
            r4 = 0
            int r16 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r16 != 0) goto L_0x030b
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r1 = r1.mo62444c(r0)
            java.lang.Class<ht1.w2> r2 = ht1.C8809w2.class
            bl3.c r1 = r1.mo62447c(r2)
            r16 = r1
            ht1.w2 r16 = (ht1.C8809w2) r16
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r8.mo3513o()
            long r17 = r1.getId()
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r8.mo3513o()
            java.lang.String r19 = r1.getObjectNonceId()
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r8.mo3513o()
            te3.c21 r1 = r1.getLiveInfo()
            if (r1 == 0) goto L_0x0304
            long r1 = r1.f182392d
            r20 = r1
            goto L_0x0306
        L_0x0304:
            r20 = r4
        L_0x0306:
            r22 = r0
            r16.mo9637P0(r17, r19, r20, r22)
        L_0x030b:
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r8.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            java.lang.String r0 = r0.recommendReason
            if (r0 != 0) goto L_0x0318
            r0 = r11
        L_0x0318:
            r1 = 2131311848(0x7f093ce8, float:1.8242048E38)
            android.view.View r1 = r7.mo85812D(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 != 0) goto L_0x0324
            goto L_0x0335
        L_0x0324:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r8.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            java.lang.String r2 = r2.recommendReason
            if (r2 == 0) goto L_0x0331
            goto L_0x0332
        L_0x0331:
            r2 = r11
        L_0x0332:
            r1.setText(r2)
        L_0x0335:
            if (r1 != 0) goto L_0x0338
            goto L_0x0348
        L_0x0338:
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0340
            r0 = 1
            goto L_0x0341
        L_0x0340:
            r0 = 0
        L_0x0341:
            if (r0 == 0) goto L_0x0344
            goto L_0x0345
        L_0x0344:
            r3 = 0
        L_0x0345:
            r1.setVisibility(r3)
        L_0x0348:
            r0 = 2131316870(0x7f095086, float:1.8252234E38)
            android.view.View r0 = r7.mo85812D(r0)
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r8.mo3513o()
            te3.c21 r0 = r0.getLiveInfo()
            if (r0 == 0) goto L_0x035f
            int r0 = r0.f182403q
            goto L_0x0360
        L_0x035f:
            r0 = 0
        L_0x0360:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r8.mo3513o()
            te3.c21 r1 = r1.getLiveInfo()
            if (r1 == 0) goto L_0x036d
            java.lang.String r1 = r1.f182411x0
            goto L_0x036e
        L_0x036d:
            r1 = r14
        L_0x036e:
            java.lang.String r2 = "watchCountHistoryTv"
            gy3.C87412m.m108593f(r4, r2)
            r6.mo742m(r4, r1, r0)
            boolean r0 = r8.f906g
            if (r0 != 0) goto L_0x03a7
            a14.z1 r0 = r10.f1900b
            if (r0 == 0) goto L_0x0382
            a14.C53973z1.C53974a.m60623a(r0, r14, r15, r14)
        L_0x0382:
            a14.n0 r5 = r10.f1899a
            r17 = 0
            r18 = 0
            cn1.c0 r19 = new cn1.c0
            r21 = 0
            r16 = 0
            r0 = r19
            r1 = r24
            r2 = r25
            r3 = r8
            r20 = r5
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 3
            r16 = r20
            r20 = r0
            a14.z1 r0 = a14.C53895h.m60466d(r16, r17, r18, r19, r20, r21)
            r10.f1900b = r0
        L_0x03a7:
            cn1.f0 r0 = new cn1.f0
            r0.<init>(r7, r6)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.Context r1 = r1.getApplicationContext()
            boolean r2 = r1 instanceof android.app.Application
            if (r2 == 0) goto L_0x03bb
            android.app.Application r1 = (android.app.Application) r1
            goto L_0x03bc
        L_0x03bb:
            r1 = r14
        L_0x03bc:
            if (r1 == 0) goto L_0x03c1
            r1.registerActivityLifecycleCallbacks(r0)
        L_0x03c1:
            r10.f1901c = r0
            r7.f173502D = r10
            te3.a91 r0 = r8.f903d
            r1 = 4
            if (r0 == 0) goto L_0x03dc
            int r0 = r0.f130378e
            if (r0 != r1) goto L_0x03dc
            di3.d r0 = di3.C86312j.m106911c(r9)
            l31.e r0 = (l31.C61212e) r0
            android.view.View r2 = r7.f44854d
            java.lang.String r3 = "live_square_room_card"
            r0.o30(r2, r3)
            goto L_0x03e9
        L_0x03dc:
            di3.d r0 = di3.C86312j.m106911c(r9)
            l31.e r0 = (l31.C61212e) r0
            android.view.View r2 = r7.f44854d
            java.lang.String r3 = "live_square_room_card_special_column"
            r0.o30(r2, r3)
        L_0x03e9:
            di3.d r0 = di3.C86312j.m106911c(r9)
            l31.e r0 = (l31.C61212e) r0
            android.view.View r2 = r7.f44854d
            r3 = 25388(0x632c, float:3.5576E-41)
            r4 = 40
            r0.mo86175pO(r2, r4, r3)
            di3.d r0 = di3.C86312j.m106911c(r9)
            l31.e r0 = (l31.C61212e) r0
            android.view.View r2 = r7.f44854d
            r3 = 26236(0x667c, float:3.6764E-41)
            r0.mo86175pO(r2, r4, r3)
            rs1.s8$a r0 = rs1.C13442s8.f38060Q0
            android.content.Context r2 = r7.f173499A
            gy3.C87412m.m108593f(r2, r12)
            rs1.s8 r0 = r0.mo12873f(r2)
            if (r0 == 0) goto L_0x0419
            int r0 = r0.f38096i
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x041a
        L_0x0419:
            r0 = r14
        L_0x041a:
            di3.d r2 = di3.C86312j.m106911c(r9)
            l31.e r2 = (l31.C61212e) r2
            android.view.View r3 = r7.f44854d
            r4 = 7
            rx3.l[] r4 = new rx3.C13604l[r4]
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r8.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.getFeedObject()
            r27 = r2
            long r1 = r5.f164794id
            java.lang.String r1 = o40.C61926c.m72691p(r1)
            rx3.l r2 = new rx3.l
            java.lang.String r5 = "feed_id"
            r2.<init>(r5, r1)
            r4[r13] = r2
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r8.mo3513o()
            te3.c21 r1 = r1.getLiveInfo()
            if (r1 == 0) goto L_0x044f
            long r1 = r1.f182392d
            java.lang.String r1 = o40.C61926c.m72691p(r1)
            goto L_0x0450
        L_0x044f:
            r1 = r14
        L_0x0450:
            rx3.l r2 = new rx3.l
            java.lang.String r5 = "live_id"
            r2.<init>(r5, r1)
            r4[r15] = r2
            r1 = 2
            rx3.l r2 = new rx3.l
            java.lang.String r5 = "comment_scene"
            r2.<init>(r5, r0)
            r4[r1] = r2
            r1 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r28)
            rx3.l r5 = new rx3.l
            java.lang.String r10 = "live_room_type"
            r5.<init>(r10, r2)
            r4[r1] = r5
            te3.a91 r1 = r8.f903d
            int r1 = r1.f130377d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            rx3.l r2 = new rx3.l
            java.lang.String r5 = "live_label_type"
            r2.<init>(r5, r1)
            r1 = 4
            r4[r1] = r2
            r1 = 5
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r8.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            java.lang.String r2 = r2.username
            rx3.l r5 = new rx3.l
            java.lang.String r10 = "finder_username"
            r5.<init>(r10, r2)
            r4[r1] = r5
            r1 = 6
            if (r0 == 0) goto L_0x04cf
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x04cf
            java.lang.String r2 = "temp_"
            boolean r2 = z04.C112550d0.m153801u(r0, r2, r13)
            if (r2 == 0) goto L_0x04ab
            r14 = r0
            goto L_0x04cf
        L_0x04ab:
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r8.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            long r13 = r2.f164794id
            t91.c$a r2 = t91.C64208c.f181951a
            java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x04bb }
            goto L_0x04bc
        L_0x04bb:
            r15 = 0
        L_0x04bc:
            if (r15 == 0) goto L_0x04ce
            java.lang.Class<tf0.p1> r2 = tf0.C64916p1.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            tf0.p1 r2 = (tf0.C64916p1) r2
            int r0 = java.lang.Integer.parseInt(r0)
            java.lang.String r11 = r2.mo76655Cu(r13, r0)
        L_0x04ce:
            r14 = r11
        L_0x04cf:
            rx3.l r0 = new rx3.l
            java.lang.String r2 = "session_buffer"
            r0.<init>(r2, r14)
            r4[r1] = r0
            java.util.Map r0 = sx3.C90364q0.m113147f(r4)
            r2 = r27
            r2.mo86149PM(r3, r0)
            di3.d r0 = di3.C86312j.m106911c(r9)
            l31.e r0 = (l31.C61212e) r0
            android.view.View r1 = r7.f44854d
            cn1.g0 r2 = new cn1.g0
            r2.<init>(r7, r8)
            r0.E60(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn1.C0810b0.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: i */
    public void mo735i(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        Log.m105924i("Finder.LivingConvert", "#onViewRecycled holder=" + oVar);
        mo740k(oVar);
    }

    /* renamed from: j */
    public final void mo739j(C60905o oVar, C64689rq2 rq22, C0331b bVar) {
        ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.kk6);
        oVar.mo85812D(C0966R.C0970id.fwx);
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.f358052mq2);
        if (imageView == null) {
            Log.m105928w("Finder.LivingConvert", "bindCover return for thumbIv is null.");
            return;
        }
        int i = this.f1891f;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = i;
        float f = (float) i;
        layoutParams.height = (int) (this.f1892g * f);
        imageView.setLayoutParams(layoutParams);
        ViewGroup viewGroup = this.f1894i;
        ViewGroup.LayoutParams layoutParams2 = null;
        ViewGroup.LayoutParams layoutParams3 = viewGroup != null ? viewGroup.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.width = i;
        }
        ViewGroup viewGroup2 = this.f1894i;
        if (viewGroup2 != null) {
            layoutParams2 = viewGroup2.getLayoutParams();
        }
        if (layoutParams2 != null) {
            layoutParams2.height = (int) (this.f1892g * f);
        }
        String str = bVar.f905f;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            str = C58739j4.f168176a.mo83674B(rq22, 1);
            if (!(str.length() > 0) && (str = bVar.f905f) == null) {
                str = Util.nullAsNil(rq22.f185283w) + Util.nullAsNil(rq22.f185234A);
            }
        }
        if (Util.isNullOrNil(str)) {
            str = rq22.f185267e + Util.nullAsNil(rq22.f185288z);
        }
        String str2 = str;
        FinderObject feedObject = bVar.mo3513o().getFeedObject();
        C64273c21 liveInfo = bVar.mo3513o().getLiveInfo();
        mo741l(feedObject, liveInfo != null && liveInfo.f182394f == 1, str2, imageView, textView);
    }

    /* renamed from: k */
    public final void mo740k(C60905o oVar) {
        Object obj = oVar.f173502D;
        if (obj != null && (obj instanceof C0812b)) {
            C0812b bVar = (C0812b) obj;
            C53930o0.m60558e(bVar.f1899a, (CancellationException) null, 1, (Object) null);
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = bVar.f1901c;
            if (activityLifecycleCallbacks != null) {
                Context applicationContext = MMApplicationContext.getContext().getApplicationContext();
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
            }
        }
        oVar.f173502D = null;
    }

    /* renamed from: l */
    public final void mo741l(FinderObject finderObject, boolean z, String str, ImageView imageView, TextView textView) {
        String str2;
        C64456ix0 ix02;
        C100075f fVar;
        C64456ix0 ix03;
        FinderObject finderObject2 = finderObject;
        TextView textView2 = textView;
        Class cls = C11990s0.class;
        Class cls2 = C60200t1.class;
        if (imageView != null) {
            if (z) {
                C64273c21 c212 = finderObject2.liveInfo;
                boolean z2 = true;
                if (c212 == null || (ix03 = c212.f182386Y) == null || ix03.f183745d != 1) {
                    z2 = false;
                }
                if (!z2) {
                    C60979d<C100810g0> f2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2();
                    String str3 = str;
                    C11984n0 n0Var = new C11984n0(str, C27696y.RAW_IMAGE);
                    if (this.f1890e) {
                        fVar = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DARK_LIVE_SQUARE);
                    } else {
                        fVar = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE);
                    }
                    f2.mo85957c(n0Var, imageView, fVar);
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                        return;
                    }
                    return;
                }
                String str4 = str;
                C7335d c = C86312j.m106911c(cls2);
                C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                C60200t1.C60201a.m70367e((C60200t1) c, str, imageView, (C11978e0.C11979a) null, 4, (Object) null);
                if (textView2 != null) {
                    C64273c21 c213 = finderObject2.liveInfo;
                    if (c213 == null || (ix02 = c213.f182386Y) == null || (str2 = ix02.f183746e) == null) {
                        str2 = "";
                    }
                    textView2.setText(str2);
                }
                if (textView2 != null) {
                    textView2.setVisibility(0);
                    return;
                }
                return;
            }
            String str5 = str;
            C7335d c2 = C86312j.m106911c(C13887q1.class);
            C87412m.m108593f(c2, "getService(IFinderCommonLiveService::class.java)");
            C13887q1.C13888a.m13309e((C13887q1) c2, imageView, str, 0, 4, (Object) null);
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
    }

    /* renamed from: m */
    public final void mo742m(TextView textView, String str, int i) {
        boolean z = true;
        if ((str == null || str.length() == 0) && i > 0) {
            str = C7878t0.m8033b(i);
        }
        if (!(str == null || str.length() == 0)) {
            z = false;
        }
        if (!z) {
            textView.setText(str);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    public C0810b0(boolean z, int i, float f, C15828e eVar, C32227p<? super Long, ? super String, C13598b0> pVar) {
        C87412m.m108594g(eVar, "outsideOperator");
        C87412m.m108594g(pVar, "jumProfileCallback");
        this.f1890e = z;
        this.f1891f = i;
        this.f1892g = f;
        this.f1893h = pVar;
    }
}
