package nm1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58684b;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.List;
import java.util.concurrent.CancellationException;
import jq3.C60905o;
import jq3.C9493c;
import ns3.C11266d;
import o40.C61926c;
import p565ir.C60606n;
import rm1.C13087a;
import rx3.C13598b0;
import we1.C15155a;
import wx3.C15601d;
import wx3.C66212f;
import zp3.C23564m;

/* renamed from: nm1.d */
public class C11227d extends C15155a {

    /* renamed from: i */
    public C0000n0 f33090i = C53930o0.m60555b();

    /* renamed from: nm1.d$a */
    public static final class C11228a extends C87413o implements C32227p<BaseFinderFeed, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Context f33091d;

        /* renamed from: e */
        public final /* synthetic */ int f33092e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11228a(Context context, int i) {
            super(2);
            this.f33091d = context;
            this.f33092e = i;
        }

        public Object invoke(Object obj, Object obj2) {
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) obj;
            String str = (String) obj2;
            C87412m.m108594g(baseFinderFeed, "feed");
            C87412m.m108594g(str, "username");
            Context context = this.f33091d;
            baseFinderFeed.getItemId();
            int i = this.f33092e;
            Class cls = C11266d.class;
            C87412m.m108594g(context, "context");
            Intent intent = new Intent();
            intent.putExtra("key_click_tab_context_id", ((C11266d) C86312j.m106911c(cls)).mo9187Uy().mo10844b());
            intent.putExtra("finder_username", str);
            intent.putExtra("key_from_comment_scene", i);
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76739CG(((C11266d) C86312j.m106911c(cls)).mo9187Uy().getContextId(), intent);
            ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context, intent);
            Log.m105924i("FinderLiveSquareTabLifeCycleReport", "enterProfile");
            C13087a.f37257d = "page_profile";
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11227d(int i, float f, boolean z, boolean z2, Context context) {
        super(f, z, z2, new C11228a(context, i));
        C87412m.m108594g(context, "baseContext");
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(baseFinderFeed, "item");
        super.mo14107l(oVar, baseFinderFeed, i, i2, z, list);
        mo11309m(oVar, baseFinderFeed);
        if (((C60606n) C86312j.m106911c(C60606n.class)).mo85035Sm()) {
            String p = C61926c.m72691p(baseFinderFeed.mo3513o().field_id);
            Log.m105924i("NearbyLiveViewCallback", "#bindActivityIcon feedId=" + p);
            ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.f358478fd2);
            if (imageView == null) {
                Log.m105924i("NearbyLiveViewCallback", "#bindActivityIcon feedId=" + p + " iconView is null!");
                return;
            }
            Object tag = imageView.getTag(C0966R.C0970id.e3t);
            if (tag instanceof C53973z1) {
                C53973z1.C53974a.m60623a((C53973z1) tag, (CancellationException) null, 1, (Object) null);
            }
            View view = oVar.f44854d;
            C87412m.m108593f(view, "holder.itemView");
            C23564m.m28138h(view, new C11229e(imageView));
            imageView.setTag(C0966R.C0970id.e3t, C53895h.m60466d(this.f33090i, (C66212f) null, (C53934p0) null, new C11230f(oVar, baseFinderFeed, imageView, (C15601d<? super C11230f>) null), 3, (Object) null));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11309m(jq3.C60905o r21, com.tencent.p014mm.plugin.finder.model.BaseFinderFeed r22) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "holder"
            gy3.C87412m.m108594g(r0, r1)
            java.lang.String r1 = "item"
            r2 = r22
            gy3.C87412m.m108594g(r2, r1)
            android.view.View r1 = r0.f44854d
            r3 = 2131310056(0x7f0935e8, float:1.8238413E38)
            android.view.View r1 = r1.findViewById(r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r3 = 2131304081(0x7f091e91, float:1.8226295E38)
            android.view.View r3 = r0.mo85812D(r3)
            r4 = 2131311848(0x7f093ce8, float:1.8242048E38)
            android.view.View r4 = r0.mo85812D(r4)
            r12 = r4
            android.widget.TextView r12 = (android.widget.TextView) r12
            r4 = 2131316870(0x7f095086, float:1.8252234E38)
            android.view.View r4 = r0.mo85812D(r4)
            r13 = r4
            android.widget.TextView r13 = (android.widget.TextView) r13
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r22.mo3513o()
            te3.c21 r4 = r4.getLiveInfo()
            r14 = 1
            r15 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            if (r4 == 0) goto L_0x004a
            int r4 = r4.f182394f
            if (r4 != r14) goto L_0x004a
            r4 = 1
            goto L_0x004b
        L_0x004a:
            r4 = 0
        L_0x004b:
            r10 = 8
            if (r4 == 0) goto L_0x01a8
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r9.mo10233c(r11)
            java.lang.Object[] r5 = r9.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderSquareLiveFeedConvert"
            java.lang.String r7 = "bindLive"
            java.lang.String r8 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r4 = r3
            r14 = r9
            r9 = r16
            r16 = 8
            r10 = r17
            r19 = r11
            r11 = r18
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r14.mo10231a(r15)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderSquareLiveFeedConvert"
            java.lang.String r6 = "bindLive"
            java.lang.String r7 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r4 = r3
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r22.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
            java.lang.String r4 = r4.recommendReason
            if (r4 != 0) goto L_0x00a5
            java.lang.String r4 = ""
        L_0x00a5:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x00eb
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            r12.mo10233c(r4)
            java.lang.Object[] r5 = r12.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderSquareLiveFeedConvert"
            java.lang.String r7 = "bindLive"
            java.lang.String r8 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r3
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r12.mo10231a(r15)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderSquareLiveFeedConvert"
            java.lang.String r6 = "bindLive"
            java.lang.String r7 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r4 = r3
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0131
        L_0x00eb:
            r12.setText(r4)
            r5 = 2131302559(0x7f09189f, float:1.8223208E38)
            r1.setTag(r5, r4)
            k20.a r12 = new k20.a
            r12.<init>()
            r4 = r19
            r12.mo10233c(r4)
            java.lang.Object[] r5 = r12.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderSquareLiveFeedConvert"
            java.lang.String r7 = "bindLive"
            java.lang.String r8 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r3
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r12.mo10231a(r15)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderSquareLiveFeedConvert"
            java.lang.String r6 = "bindLive"
            java.lang.String r7 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r4 = r3
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x0131:
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r22.mo3513o()
            te3.c21 r3 = r3.getLiveInfo()
            if (r3 == 0) goto L_0x013e
            int r3 = r3.f182403q
            goto L_0x013f
        L_0x013e:
            r3 = 0
        L_0x013f:
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r22.mo3513o()
            te3.c21 r4 = r4.getLiveInfo()
            if (r4 == 0) goto L_0x014c
            java.lang.String r4 = r4.f182411x0
            goto L_0x014d
        L_0x014c:
            r4 = 0
        L_0x014d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "participantCountString: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r6 = " participantCount: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "NearbyFinderSquareLiveF.NearbyLiveViewCallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            if (r4 == 0) goto L_0x0176
            int r5 = r4.length()
            if (r5 != 0) goto L_0x0174
            goto L_0x0176
        L_0x0174:
            r5 = 0
            goto L_0x0177
        L_0x0176:
            r5 = 1
        L_0x0177:
            if (r5 == 0) goto L_0x0183
            if (r3 <= 0) goto L_0x0183
            java.lang.String r3 = er1.C7878t0.m8033b(r3)
            java.lang.String r4 = java.lang.String.valueOf(r3)
        L_0x0183:
            if (r4 == 0) goto L_0x018e
            int r3 = r4.length()
            if (r3 != 0) goto L_0x018c
            goto L_0x018e
        L_0x018c:
            r3 = 0
            goto L_0x018f
        L_0x018e:
            r3 = 1
        L_0x018f:
            if (r3 != 0) goto L_0x01a2
            r13.setText(r4)
            r13.setVisibility(r15)
            r3 = 2131302558(0x7f09189e, float:1.8223206E38)
            java.lang.CharSequence r4 = r13.getText()
            r1.setTag(r3, r4)
            goto L_0x01a8
        L_0x01a2:
            r1 = 8
            r13.setVisibility(r1)
            goto L_0x01aa
        L_0x01a8:
            r1 = 8
        L_0x01aa:
            r3 = 2131302755(0x7f091963, float:1.8223605E38)
            android.view.View r3 = r0.mo85812D(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setVisibility(r1)
            java.lang.Class<ir.n> r1 = p565ir.C60606n.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ir.n r1 = (p565ir.C60606n) r1
            boolean r1 = r1.mo85035Sm()
            if (r1 == 0) goto L_0x0233
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r22.mo3513o()
            te3.c21 r1 = r1.getLiveInfo()
            if (r1 == 0) goto L_0x01df
            java.util.LinkedList<java.lang.Integer> r1 = r1.f182368N
            if (r1 == 0) goto L_0x01df
            java.lang.Object r1 = sx3.C110818d0.m150917O(r1, r15)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x01df
            int r1 = r1.intValue()
            goto L_0x01e0
        L_0x01df:
            r1 = 0
        L_0x01e0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "#bindIconToActivityImageView activityInfoIcon="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "NearbyLiveViewCallback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            int r2 = ns3.C11269h.f33201a
            r2 = 4
            r3 = 1
            if (r1 == r3) goto L_0x0219
            r3 = 2
            if (r1 == r3) goto L_0x0215
            r3 = 3
            if (r1 == r3) goto L_0x0211
            if (r1 == r2) goto L_0x020d
            r3 = 5
            if (r1 == r3) goto L_0x0209
            r1 = 0
            goto L_0x021c
        L_0x0209:
            r1 = 2131232294(0x7f080626, float:1.8080693E38)
            goto L_0x021c
        L_0x020d:
            r1 = 2131232293(0x7f080625, float:1.8080691E38)
            goto L_0x021c
        L_0x0211:
            r1 = 2131232292(0x7f080624, float:1.808069E38)
            goto L_0x021c
        L_0x0215:
            r1 = 2131232291(0x7f080623, float:1.8080687E38)
            goto L_0x021c
        L_0x0219:
            r1 = 2131232290(0x7f080622, float:1.8080685E38)
        L_0x021c:
            r3 = 2131306756(0x7f092904, float:1.823172E38)
            android.view.View r0 = r0.mo85812D(r3)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x0233
            if (r1 != 0) goto L_0x022d
            r0.setVisibility(r2)
            goto L_0x0233
        L_0x022d:
            r0.setImageResource(r1)
            r0.setVisibility(r15)
        L_0x0233:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nm1.C11227d.mo11309m(jq3.o, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }
}
