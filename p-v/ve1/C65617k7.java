package ve1;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C55032t1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.FinderPostProgressView;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import jq3.C60896i;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62344b0;
import sx3.C110818d0;
import te3.C64417hb1;
import te3.C64463jb1;
import te3.C64689rq2;
import up1.C27696y;

/* renamed from: ve1.k7 */
public final class C65617k7 extends C60896i<C55032t1> {

    /* renamed from: e */
    public Boolean f188815e;

    /* renamed from: ve1.k7$a */
    public static final class C65618a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f188816d;

        public C65618a(C60905o oVar) {
            this.f188816d = oVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            ((FinderPostProgressView) this.f188816d.mo85812D(C0966R.C0970id.f358974i62)).setProgress(((Integer) animatedValue).intValue());
            ((FinderPostProgressView) this.f188816d.mo85812D(C0966R.C0970id.f358974i62)).invalidate();
        }
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f359780ao3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0438  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0050 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0050 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fa  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r19, jq3.C9493c r20, int r21, int r22, boolean r23, java.util.List r24) {
        /*
            r18 = this;
            r0 = r18
            r7 = r19
            r1 = r21
            r8 = r20
            cm1.t1 r8 = (cm1.C55032t1) r8
            java.lang.String r2 = "holder"
            gy3.C87412m.m108594g(r7, r2)
            java.lang.String r2 = "item"
            gy3.C87412m.m108594g(r8, r2)
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r8.f154491d
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            r3 = 0
            if (r2 == 0) goto L_0x0022
            te3.hb1 r2 = r2.mvInfo
            goto L_0x0023
        L_0x0022:
            r2 = r3
        L_0x0023:
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r8.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFinderObject()
            long r4 = r4.f164794id
            java.lang.String r6 = o40.C61926c.m72691p(r4)
            r5 = 0
            if (r24 == 0) goto L_0x003d
            boolean r9 = r24.isEmpty()
            if (r9 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r9 = 0
            goto L_0x003e
        L_0x003d:
            r9 = 1
        L_0x003e:
            r10 = 2
            java.lang.String r11 = "Finder.ProfileMusicConvert"
            r12 = 2131756393(0x7f100569, float:1.9143692E38)
            r13 = 2131756415(0x7f10057f, float:1.9143737E38)
            r14 = 2131311427(0x7f093b43, float:1.8241194E38)
            if (r9 != 0) goto L_0x010e
            java.util.Iterator r2 = r24.iterator()
        L_0x0050:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x0544
            java.lang.Object r9 = r2.next()
            boolean r15 = r9 instanceof rx3.C13604l
            if (r15 == 0) goto L_0x0050
            rx3.l r9 = (rx3.C13604l) r9
            A r9 = r9.f38555d
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 == r10) goto L_0x0109
            java.lang.String r15 = "  isTheSameIdPlaying:"
            java.lang.String r4 = "payloadsMusicPause :"
            switch(r9) {
                case 20: goto L_0x00ff;
                case 21: goto L_0x00b8;
                case 22: goto L_0x0072;
                default: goto L_0x0071;
            }
        L_0x0071:
            goto L_0x0050
        L_0x0072:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            r9.append(r1)
            r9.append(r15)
            qc0.m r4 = qc0.C101093a.m132480b()
            if (r4 == 0) goto L_0x0089
            java.lang.String r15 = r4.f295960e
            goto L_0x008a
        L_0x0089:
            r15 = r3
        L_0x008a:
            if (r15 == 0) goto L_0x00a1
            int r15 = r4.f295959d
            if (r15 != 0) goto L_0x00a1
            boolean r15 = qc0.C101093a.m132481c()
            if (r15 == 0) goto L_0x00a1
            java.lang.String r4 = r4.f295960e     // Catch:{ Exception -> 0x00a0 }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r4, (java.lang.String) r6)     // Catch:{ Exception -> 0x00a0 }
            if (r4 == 0) goto L_0x00a1
            r4 = 1
            goto L_0x00a2
        L_0x00a0:
        L_0x00a1:
            r4 = 0
        L_0x00a2:
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r4)
            android.view.View r4 = r7.mo85812D(r14)
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r4
            if (r4 == 0) goto L_0x0050
            r4.setImageResource(r13)
            goto L_0x0050
        L_0x00b8:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            r9.append(r1)
            r9.append(r15)
            qc0.m r4 = qc0.C101093a.m132480b()
            if (r4 == 0) goto L_0x00cf
            java.lang.String r15 = r4.f295960e
            goto L_0x00d0
        L_0x00cf:
            r15 = r3
        L_0x00d0:
            if (r15 == 0) goto L_0x00e7
            int r15 = r4.f295959d
            if (r15 != 0) goto L_0x00e7
            boolean r15 = qc0.C101093a.m132481c()
            if (r15 == 0) goto L_0x00e7
            java.lang.String r4 = r4.f295960e     // Catch:{ Exception -> 0x00e6 }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r4, (java.lang.String) r6)     // Catch:{ Exception -> 0x00e6 }
            if (r4 == 0) goto L_0x00e7
            r4 = 1
            goto L_0x00e8
        L_0x00e6:
        L_0x00e7:
            r4 = 0
        L_0x00e8:
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r4)
            android.view.View r4 = r7.mo85812D(r14)
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r4
            if (r4 == 0) goto L_0x0050
            r4.setImageResource(r12)
            goto L_0x0050
        L_0x00ff:
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r8.f154491d
            r0.mo89698k(r4, r7)
            r0.mo89697j(r8, r7)
            goto L_0x0050
        L_0x0109:
            r0.mo89697j(r8, r7)
            goto L_0x0050
        L_0x010e:
            android.view.View r1 = r7.mo85812D(r14)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            r4 = 2131311426(0x7f093b42, float:1.8241192E38)
            android.view.View r4 = r7.mo85812D(r4)
            r9 = r4
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r8.mo76086p0()
            r15 = 2131311409(0x7f093b31, float:1.8241157E38)
            if (r4 == 0) goto L_0x0226
            fe1.q r14 = r8.mo3507l()
            if (r14 == 0) goto L_0x0130
            java.lang.String r14 = r14.field_username
            goto L_0x0131
        L_0x0130:
            r14 = r3
        L_0x0131:
            zc1.b r16 = zc1.C66785b.f191882e
            java.lang.String r13 = r16.mo90662O5()
            boolean r13 = z04.C112551y.m153810j(r14, r13, r5, r10, r3)
            if (r13 == 0) goto L_0x0149
            java.lang.Boolean r13 = r0.f188815e
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            boolean r13 = gy3.C87412m.m108589b(r13, r14)
            if (r13 == 0) goto L_0x0149
            r13 = 1
            goto L_0x014a
        L_0x0149:
            r13 = 0
        L_0x014a:
            r14 = 2131311405(0x7f093b2d, float:1.824115E38)
            r12 = 2131311407(0x7f093b2f, float:1.8241153E38)
            if (r13 == 0) goto L_0x01b2
            android.view.View r4 = r7.mo85812D(r14)
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r4
            r10 = 2131756028(0x7f1003fc, float:1.9142952E38)
            r4.setImageResource(r10)
            android.view.View r4 = r7.mo85812D(r14)
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r4
            android.content.Context r10 = r7.f173499A
            android.content.res.Resources r10 = r10.getResources()
            r13 = 2131100166(0x7f060206, float:1.7812706E38)
            int r10 = r10.getColor(r13)
            r4.setIconColor(r10)
            com.tencent.mm.protocal.protobuf.FinderObject r4 = r8.mo76086p0()
            if (r4 == 0) goto L_0x017d
            int r4 = r4.readCount
            goto L_0x017e
        L_0x017d:
            r4 = 0
        L_0x017e:
            android.view.View r10 = r7.mo85812D(r15)
            android.widget.TextView r10 = (android.widget.TextView) r10
            long r3 = (long) r4
            java.lang.String r3 = er1.C7878t0.m8036e(r3)
            r10.setText(r3)
            android.view.View r3 = r7.mo85812D(r15)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.content.Context r4 = r7.f173499A
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getColor(r13)
            r3.setTextColor(r4)
            android.view.View r3 = r7.mo85812D(r12)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            android.content.Context r4 = r7.f173499A
            r10 = 2131233065(0x7f080929, float:1.8082257E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r10)
            r3.setBackground(r4)
            goto L_0x0226
        L_0x01b2:
            er1.w3 r3 = er1.C58784w3.f168295a
            r13 = 0
            java.lang.Integer r3 = er1.C58784w3.m68436c0(r3, r10, r5, r10, r13)
            if (r3 == 0) goto L_0x01c0
            int r3 = r3.intValue()
            goto L_0x01c3
        L_0x01c0:
            r3 = 2131755879(0x7f100367, float:1.914265E38)
        L_0x01c3:
            android.view.View r17 = r7.mo85812D(r14)
            r13 = r17
            com.tencent.mm.ui.widget.imageview.WeImageView r13 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r13
            r13.setImageResource(r3)
            android.view.View r3 = r7.mo85812D(r14)
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r3
            android.content.Context r13 = r7.f173499A
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131099940(0x7f060124, float:1.7812247E38)
            int r13 = r13.getColor(r14)
            r3.setIconColor(r13)
            int r3 = r4.likeCount
            if (r3 <= 0) goto L_0x01ed
            java.lang.String r3 = er1.C7878t0.m8034c(r10, r3)
            goto L_0x01ef
        L_0x01ed:
            java.lang.String r3 = "0"
        L_0x01ef:
            android.view.View r4 = r7.mo85812D(r15)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setText(r3)
            android.view.View r3 = r7.mo85812D(r12)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            android.content.Context r4 = r7.f173499A
            r10 = 2131233061(0x7f080925, float:1.8082249E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r10)
            r3.setBackground(r4)
            android.view.View r3 = r7.mo85812D(r15)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.content.Context r4 = r7.f173499A
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getColor(r14)
            r3.setTextColor(r4)
            android.view.View r3 = r7.mo85812D(r12)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r3.setVisibility(r5)
        L_0x0226:
            r10 = 2131311434(0x7f093b4a, float:1.8241208E38)
            android.view.View r3 = r7.mo85812D(r10)
            r12 = r3
            android.widget.TextView r12 = (android.widget.TextView) r12
            r13 = 2131311424(0x7f093b40, float:1.8241188E38)
            android.view.View r3 = r7.mo85812D(r13)
            r14 = r3
            android.widget.TextView r14 = (android.widget.TextView) r14
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0250
            te3.kb1 r4 = r2.f183456e
            if (r4 == 0) goto L_0x0250
            java.lang.String r5 = r4.f183904d
            r12.setText(r5)
            java.lang.String r4 = r4.f183905e
            if (r4 == 0) goto L_0x024c
            goto L_0x024d
        L_0x024c:
            r4 = r3
        L_0x024d:
            r14.setText(r4)
        L_0x0250:
            r0.mo89697j(r8, r7)
            java.lang.String r4 = r8.mo76087q0()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r13 = "onBindViewHolder imageUrl: "
            r5.append(r13)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r4)
            if (r23 != 0) goto L_0x0281
            r4 = 2131304667(0x7f0920db, float:1.8227483E38)
            android.view.View r4 = r7.mo85812D(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r5 = 2131232388(0x7f080684, float:1.8080884E38)
            r4.setImageResource(r5)
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r8.f154491d
            r0.mo89698k(r4, r7)
        L_0x0281:
            r4 = 2131311418(0x7f093b3a, float:1.8241176E38)
            android.view.View r4 = r7.mo85812D(r4)
            ve1.g7 r5 = new ve1.g7
            r5.<init>(r8)
            r4.setOnClickListener(r5)
            r4 = 2131311431(0x7f093b47, float:1.8241202E38)
            android.view.View r4 = r7.mo85812D(r4)
            ve1.h7 r5 = new ve1.h7
            r5.<init>(r8)
            r4.setOnClickListener(r5)
            qc0.m r4 = qc0.C101093a.m132480b()
            if (r4 == 0) goto L_0x02a8
            java.lang.String r5 = r4.f295960e
            goto L_0x02a9
        L_0x02a8:
            r5 = 0
        L_0x02a9:
            if (r5 == 0) goto L_0x02c0
            int r5 = r4.f295959d
            if (r5 != 0) goto L_0x02c0
            boolean r5 = qc0.C101093a.m132481c()
            if (r5 == 0) goto L_0x02c0
            java.lang.String r4 = r4.f295960e     // Catch:{ Exception -> 0x02bf }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r4, (java.lang.String) r6)     // Catch:{ Exception -> 0x02bf }
            if (r4 == 0) goto L_0x02c0
            r4 = 1
            goto L_0x02c1
        L_0x02bf:
        L_0x02c0:
            r4 = 0
        L_0x02c1:
            if (r4 == 0) goto L_0x02ca
            r4 = 2131756393(0x7f100569, float:1.9143692E38)
            r1.setImageResource(r4)
            goto L_0x02d0
        L_0x02ca:
            r4 = 2131756415(0x7f10057f, float:1.9143737E38)
            r1.setImageResource(r4)
        L_0x02d0:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r8.f154491d
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r1.objectDesc
            if (r1 == 0) goto L_0x02e5
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r1 = r1.media
            if (r1 == 0) goto L_0x02e5
            java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
            com.tencent.mm.protocal.protobuf.FinderMedia r1 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r1
            goto L_0x02e6
        L_0x02e5:
            r1 = 0
        L_0x02e6:
            if (r1 == 0) goto L_0x02fd
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r1.thumbUrl
            r3.append(r4)
            java.lang.String r1 = r1.thumb_url_token
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r4 = r1
            goto L_0x02fe
        L_0x02fd:
            r4 = r3
        L_0x02fe:
            ve1.i7 r11 = new ve1.i7
            r1 = r11
            r3 = r8
            r5 = r19
            r1.<init>(r2, r3, r4, r5, r6)
            r9.setOnClickListener(r11)
            if (r23 != 0) goto L_0x0322
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r8.f154491d
            long r1 = r1.getId()
            java.lang.String r1 = o40.C61926c.m72691p(r1)
            zt3.t r2 = zt3.C119157j.f356862d
            ve1.j7 r3 = new ve1.j7
            r3.<init>(r7, r1)
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183875f(r3)
        L_0x0322:
            android.view.View r1 = r7.mo85812D(r15)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 2131311425(0x7f093b41, float:1.824119E38)
            android.view.View r3 = r7.mo85812D(r2)
            android.widget.TextView r3 = (android.widget.TextView) r3
            bl3.r r4 = bl3.C39818r.f106831a
            android.content.Context r5 = r7.f173499A
            java.lang.String r6 = "holder.context"
            gy3.C87412m.m108593f(r5, r6)
            bl3.r$a r4 = r4.mo62443b(r5)
            java.lang.Class<com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC> r5 = com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC.class
            androidx.lifecycle.i0 r4 = r4.mo75002a(r5)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC r4 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileUiStyleUIC) r4
            boolean r4 = r4.mo3861i0()
            r5 = 2131311419(0x7f093b3b, float:1.8241178E38)
            r6 = 2131311430(0x7f093b46, float:1.82412E38)
            r8 = 2131311433(0x7f093b49, float:1.8241206E38)
            r9 = 2131311432(0x7f093b48, float:1.8241204E38)
            r11 = 2131311420(0x7f093b3c, float:1.824118E38)
            if (r4 == 0) goto L_0x0438
            android.view.View r4 = r7.mo85812D(r10)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r10 = 2131099704(0x7f060038, float:1.7811769E38)
            if (r4 == 0) goto L_0x0373
            android.content.Context r15 = r7.f173499A
            android.content.res.Resources r15 = r15.getResources()
            int r15 = r15.getColor(r10)
            r4.setTextColor(r15)
        L_0x0373:
            r4 = 2131311424(0x7f093b40, float:1.8241188E38)
            android.view.View r4 = r7.mo85812D(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r15 = 2131099699(0x7f060033, float:1.7811759E38)
            if (r4 == 0) goto L_0x038e
            android.content.Context r13 = r7.f173499A
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getColor(r15)
            r4.setTextColor(r13)
        L_0x038e:
            r4 = 2131311427(0x7f093b43, float:1.8241194E38)
            android.view.View r4 = r7.mo85812D(r4)
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r4
            if (r4 == 0) goto L_0x03a6
            android.content.Context r13 = r7.f173499A
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getColor(r10)
            r4.setIconColor(r13)
        L_0x03a6:
            android.view.View r4 = r7.mo85812D(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x03bb
            android.content.Context r6 = r7.f173499A
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getColor(r15)
            r4.setTextColor(r6)
        L_0x03bb:
            android.view.View r4 = r7.mo85812D(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r4
            if (r4 == 0) goto L_0x03d0
            android.content.Context r5 = r7.f173499A
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getColor(r10)
            r4.setIconColor(r5)
        L_0x03d0:
            android.view.View r4 = r7.mo85812D(r11)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x03e5
            android.content.Context r5 = r7.f173499A
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getColor(r10)
            r4.setTextColor(r5)
        L_0x03e5:
            android.view.View r4 = r7.mo85812D(r9)
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r4
            if (r4 == 0) goto L_0x03fa
            android.content.Context r5 = r7.f173499A
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getColor(r10)
            r4.setIconColor(r5)
        L_0x03fa:
            android.view.View r4 = r7.mo85812D(r8)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x040f
            android.content.Context r5 = r7.f173499A
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getColor(r10)
            r4.setTextColor(r5)
        L_0x040f:
            android.view.View r2 = r7.mo85812D(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L_0x0427
            android.content.Context r4 = r7.f173499A
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131099697(0x7f060031, float:1.7811755E38)
            int r4 = r4.getColor(r5)
            r2.setTextColor(r4)
        L_0x0427:
            r2 = 2131311421(0x7f093b3d, float:1.8241182E38)
            android.view.View r2 = r7.mo85812D(r2)
            if (r2 == 0) goto L_0x0513
            r4 = 2131099690(0x7f06002a, float:1.781174E38)
            r2.setBackgroundResource(r4)
            goto L_0x0513
        L_0x0438:
            android.view.View r4 = r7.mo85812D(r10)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r10 = 2131099800(0x7f060098, float:1.7811963E38)
            if (r4 == 0) goto L_0x0450
            android.content.Context r13 = r7.f173499A
            android.content.res.Resources r13 = r13.getResources()
            int r13 = r13.getColor(r10)
            r4.setTextColor(r13)
        L_0x0450:
            r4 = 2131311424(0x7f093b40, float:1.8241188E38)
            android.view.View r4 = r7.mo85812D(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r13 = 2131099804(0x7f06009c, float:1.7811972E38)
            if (r4 == 0) goto L_0x046b
            android.content.Context r15 = r7.f173499A
            android.content.res.Resources r15 = r15.getResources()
            int r15 = r15.getColor(r13)
            r4.setTextColor(r15)
        L_0x046b:
            r4 = 2131311427(0x7f093b43, float:1.8241194E38)
            android.view.View r4 = r7.mo85812D(r4)
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r4
            if (r4 == 0) goto L_0x0483
            android.content.Context r15 = r7.f173499A
            android.content.res.Resources r15 = r15.getResources()
            int r15 = r15.getColor(r10)
            r4.setIconColor(r15)
        L_0x0483:
            android.view.View r4 = r7.mo85812D(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x0498
            android.content.Context r6 = r7.f173499A
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getColor(r13)
            r4.setTextColor(r6)
        L_0x0498:
            android.view.View r4 = r7.mo85812D(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r4
            if (r4 == 0) goto L_0x04ad
            android.content.Context r5 = r7.f173499A
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getColor(r10)
            r4.setIconColor(r5)
        L_0x04ad:
            android.view.View r4 = r7.mo85812D(r11)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x04c2
            android.content.Context r5 = r7.f173499A
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getColor(r10)
            r4.setTextColor(r5)
        L_0x04c2:
            android.view.View r4 = r7.mo85812D(r9)
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r4
            if (r4 == 0) goto L_0x04d7
            android.content.Context r5 = r7.f173499A
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getColor(r10)
            r4.setIconColor(r5)
        L_0x04d7:
            android.view.View r4 = r7.mo85812D(r8)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x04ec
            android.content.Context r5 = r7.f173499A
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getColor(r10)
            r4.setTextColor(r5)
        L_0x04ec:
            android.view.View r2 = r7.mo85812D(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L_0x0504
            android.content.Context r4 = r7.f173499A
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r4 = r4.getColor(r5)
            r2.setTextColor(r4)
        L_0x0504:
            r2 = 2131311421(0x7f093b3d, float:1.8241182E38)
            android.view.View r2 = r7.mo85812D(r2)
            if (r2 == 0) goto L_0x0513
            r4 = 2131099808(0x7f0600a0, float:1.781198E38)
            r2.setBackgroundResource(r4)
        L_0x0513:
            r2 = 2131311417(0x7f093b39, float:1.8241174E38)
            android.view.View r2 = r7.mo85812D(r2)
            if (r2 == 0) goto L_0x0544
            r4 = 2131302587(0x7f0918bb, float:1.8223264E38)
            java.lang.CharSequence r5 = r12.getText()
            r2.setTag(r4, r5)
            r4 = 2131302513(0x7f091871, float:1.8223114E38)
            java.lang.CharSequence r5 = r14.getText()
            r2.setTag(r4, r5)
            r4 = 2131302530(0x7f091882, float:1.8223149E38)
            java.lang.CharSequence r1 = r1.getText()
            r2.setTag(r4, r1)
            r1 = 2131302578(0x7f0918b2, float:1.8223246E38)
            java.lang.CharSequence r3 = r3.getText()
            r2.setTag(r1, r3)
        L_0x0544:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C65617k7.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: j */
    public final void mo89697j(C55032t1 t1Var, C60905o oVar) {
        C64463jb1 jb12;
        C55032t1 t1Var2 = t1Var;
        C60905o oVar2 = oVar;
        WeImageView weImageView = (WeImageView) oVar2.mo85812D(C0966R.C0970id.i5u);
        Context context = oVar2.f173499A;
        C87412m.m108593f(context, "holder.context");
        C87412m.m108593f(weImageView, "playIcon");
        ((LinearLayout) oVar2.mo85812D(C0966R.C0970id.i5w)).setVisibility(0);
        View D = oVar2.mo85812D(C0966R.C0970id.i5p);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileMusicConvert", "setPosting", "(Landroid/content/Context;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view = D;
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderProfileMusicConvert", "setPosting", "(Landroid/content/Context;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((TextView) oVar2.mo85812D(C0966R.C0970id.i5x)).setText(context.getString(C0966R.string.ek9));
        ((FinderPostProgressView) oVar2.mo85812D(C0966R.C0970id.f358974i62)).setVisibility(0);
        View D2 = oVar2.mo85812D(C0966R.C0970id.i5y);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        C117292a.m165358d(D2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileMusicConvert", "setPosting", "(Landroid/content/Context;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(D2, "com/tencent/mm/plugin/finder/convert/FinderProfileMusicConvert", "setPosting", "(Landroid/content/Context;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((TextView) oVar2.mo85812D(C0966R.C0970id.i5s)).setVisibility(8);
        weImageView.setVisibility(8);
        if (t1Var.mo76086p0() == null) {
            return;
        }
        if (t1Var2.f154491d.isPostFailed()) {
            Context context2 = oVar2.f173499A;
            C87412m.m108593f(context2, "holder.context");
            ((LinearLayout) oVar2.mo85812D(C0966R.C0970id.i5w)).setVisibility(0);
            View D3 = oVar2.mo85812D(C0966R.C0970id.i5p);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            C117292a.m165358d(D3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileMusicConvert", "setPostFailed", "(Landroid/content/Context;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(D3, "com/tencent/mm/plugin/finder/convert/FinderProfileMusicConvert", "setPostFailed", "(Landroid/content/Context;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((TextView) oVar2.mo85812D(C0966R.C0970id.i5x)).setText(context2.getString(C0966R.string.eil));
            ((FinderPostProgressView) oVar2.mo85812D(C0966R.C0970id.f358974i62)).setVisibility(8);
            View D4 = oVar2.mo85812D(C0966R.C0970id.i5y);
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            C117292a.m165358d(D4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileMusicConvert", "setPostFailed", "(Landroid/content/Context;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(D4, "com/tencent/mm/plugin/finder/convert/FinderProfileMusicConvert", "setPostFailed", "(Landroid/content/Context;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((TextView) oVar2.mo85812D(C0966R.C0970id.i5s)).setVisibility(8);
            weImageView.setVisibility(8);
            return;
        }
        if (!t1Var2.f154491d.isPostFailed() && !t1Var2.f154491d.isPostFinish()) {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{((FinderPostProgressView) oVar2.mo85812D(C0966R.C0970id.f358974i62)).getProgress(), t1Var2.f154491d.getPostInfo().f185649h});
            ofInt.addUpdateListener(new C65618a(oVar2));
            ValueAnimator duration = ofInt.setDuration(400);
            if (duration != null) {
                duration.start();
            }
            oVar2.f173502D = ofInt;
            Log.m105924i("Finder.ProfileMusicConvert", "progress animate: " + ((FinderPostProgressView) oVar2.mo85812D(C0966R.C0970id.f358974i62)).getProgress() + ", " + t1Var2.f154491d.getPostInfo().f185649h);
            return;
        }
        FinderObjectDesc finderObjectDesc = t1Var2.f154491d.getFeedObject().objectDesc;
        C64417hb1 hb12 = finderObjectDesc != null ? finderObjectDesc.mvInfo : null;
        ((LinearLayout) oVar2.mo85812D(C0966R.C0970id.i5w)).setVisibility(8);
        ((TextView) oVar2.mo85812D(C0966R.C0970id.i5s)).setVisibility(0);
        ((TextView) oVar2.mo85812D(C0966R.C0970id.i5s)).setText("");
        weImageView.setVisibility(0);
        if (hb12 != null && (jb12 = hb12.f183457f) != null) {
            String string = oVar2.f173499A.getResources().getString(C0966R.string.ekk, new Object[]{Integer.valueOf((int) (jb12.f183776e * ((float) 100)))});
            C87412m.m108593f(string, "holder.context.resources…ompletion * 100).toInt())");
            ((TextView) oVar2.mo85812D(C0966R.C0970id.i5s)).setText(string);
        }
    }

    /* renamed from: k */
    public final void mo89698k(FinderItem finderItem, C60905o oVar) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C64689rq2 rq22 = (C64689rq2) C110818d0.m150916N(finderItem.getMediaList());
        if (rq22 != null) {
            C60979d<C100810g0> f2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2();
            C62344b0 b0Var = new C62344b0(rq22, C27696y.THUMB_IMAGE, (String) null, (String) null, 12, (C8480h) null);
            View D = oVar.mo85812D(C0966R.C0970id.e5s);
            C87412m.m108593f(D, "holder.getView<ImageView…inder_profile_item_image)");
            f2.mo85957c(b0Var, (ImageView) D, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
        }
    }
}
