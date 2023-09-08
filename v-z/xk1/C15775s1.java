package xk1;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import bl3.C54492n;
import cj1.C54754f;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d60.C58124b;
import er1.C58739j4;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.LinkedList;
import ok1.C62042e;
import rl1.C13020c0;
import rl1.C13053n;
import rx3.C13598b0;
import te3.C50334m01;
import te3.C52312zv0;
import xk1.C66297d2;
import zj1.C16217b;

/* renamed from: xk1.s1 */
public final class C15775s1 extends UIComponent {

    /* renamed from: d */
    public RecyclerView f42527d;

    /* renamed from: e */
    public C45795b f42528e;

    /* renamed from: f */
    public ArrayList<C66297d2.C15723c> f42529f = new ArrayList<>();

    /* renamed from: g */
    public C32226l<? super C66297d2.C15723c, C13598b0> f42530g;

    /* renamed from: h */
    public C58124b f42531h;

    /* renamed from: i */
    public int f42532i;

    /* renamed from: j */
    public C13053n f42533j;

    /* renamed from: xk1.s1$a */
    public final class C15776a extends RecyclerView.C16613e<C15777b> {
        public C15776a() {
        }

        public int getItemCount() {
            return C15775s1.this.f42529f.size();
        }

        /* JADX WARNING: type inference failed for: r3v36, types: [qj1.c] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r22, int r23) {
            /*
                r21 = this;
                r0 = r21
                r1 = r23
                r2 = r22
                xk1.s1$b r2 = (xk1.C15775s1.C15777b) r2
                java.lang.String r3 = "holder"
                gy3.C87412m.m108594g(r2, r3)
                xk1.s1 r3 = xk1.C15775s1.this
                java.util.ArrayList<xk1.d2$c> r3 = r3.f42529f
                java.lang.Object r3 = r3.get(r1)
                java.lang.String r4 = "optList[position]"
                gy3.C87412m.m108593f(r3, r4)
                xk1.d2$c r3 = (xk1.C66297d2.C15723c) r3
                com.tencent.mm.ui.widget.imageview.WeImageView r4 = r2.f42537z
                r5 = 0
                r4.setRotationY(r5)
                xk1.s1 r4 = xk1.C15775s1.this
                android.app.Activity r4 = r4.getContext()
                boolean r5 = r4 instanceof androidx.appcompat.app.AppCompatActivity
                r6 = 0
                if (r5 == 0) goto L_0x0030
                androidx.appcompat.app.AppCompatActivity r4 = (androidx.appcompat.app.AppCompatActivity) r4
                goto L_0x0031
            L_0x0030:
                r4 = r6
            L_0x0031:
                int r3 = r3.f42429a
                java.lang.String r5 = "liveData"
                r15 = 2131099704(0x7f060038, float:1.7811769E38)
                if (r3 == 0) goto L_0x02bd
                r14 = 1
                if (r3 == r14) goto L_0x021a
                r7 = 2
                if (r3 == r7) goto L_0x0148
                r7 = 3
                if (r3 == r7) goto L_0x00f4
                r7 = 4
                if (r3 == r7) goto L_0x008a
                r4 = 5
                if (r3 == r4) goto L_0x004b
                goto L_0x037e
            L_0x004b:
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r2.f42537z
                android.content.Context r4 = r3.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131756043(0x7f10040b, float:1.9142982E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
                r3.setImageDrawable(r4)
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r2.f42537z
                xk1.s1 r4 = xk1.C15775s1.this
                android.app.Activity r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                int r4 = r4.getColor(r15)
                r3.setIconColor(r4)
                android.widget.TextView r3 = r2.f42535A
                com.tencent.mm.ui.widget.imageview.WeImageView r4 = r2.f42537z
                android.content.Context r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131828471(0x7f111ef7, float:1.9289884E38)
                java.lang.String r4 = r4.getString(r5)
                r3.setText(r4)
                goto L_0x037e
            L_0x008a:
                zj1.b r3 = zj1.C16217b.f43438a
                android.view.View r10 = r2.f42536B
                r11 = 0
                r12 = 0
                r13 = 24
                r14 = 0
                java.lang.String r9 = "startlive.bottom.link"
                r7 = r3
                r8 = r4
                zj1.C16217b.m15108i(r7, r8, r9, r10, r11, r12, r13, r14)
                java.lang.String r4 = "startlive.bottom.link"
                r3.mo14751g(r4)
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r2.f42537z
                android.content.Context r4 = r3.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r7 = 2131756065(0x7f100421, float:1.9143027E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r7)
                r3.setImageDrawable(r4)
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r2.f42537z
                xk1.s1 r4 = xk1.C15775s1.this
                android.app.Activity r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                int r4 = r4.getColor(r15)
                r3.setIconColor(r4)
                android.widget.TextView r3 = r2.f42535A
                android.content.Context r4 = r3.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r7 = 2131828007(0x7f111d27, float:1.9288943E38)
                java.lang.String r4 = r4.getString(r7)
                r3.setText(r4)
                xk1.s1 r3 = xk1.C15775s1.this
                fj1.b r8 = r3.f42528e
                if (r8 == 0) goto L_0x00f0
                dh1.b r7 = dh1.C7329b.f25441a
                r9 = 1
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 28
                r14 = 0
                dh1.C7329b.m7473b(r7, r8, r9, r10, r11, r12, r13, r14)
                goto L_0x037e
            L_0x00f0:
                gy3.C87412m.m108603p(r5)
                throw r6
            L_0x00f4:
                zj1.b r3 = zj1.C16217b.f43438a
                android.view.View r10 = r2.f42536B
                r11 = 0
                r12 = 0
                r13 = 24
                r14 = 0
                java.lang.String r9 = "startlive.bottom.lottery"
                r7 = r3
                r8 = r4
                zj1.C16217b.m15108i(r7, r8, r9, r10, r11, r12, r13, r14)
                java.lang.String r4 = "startlive.bottom.lottery"
                r3.mo14751g(r4)
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r2.f42537z
                android.content.Context r4 = r3.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131756149(0x7f100475, float:1.9143197E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r5, r6)
                r3.setImageDrawable(r4)
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r2.f42537z
                xk1.s1 r4 = xk1.C15775s1.this
                android.app.Activity r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                int r4 = r4.getColor(r15)
                r3.setIconColor(r4)
                android.widget.TextView r3 = r2.f42535A
                android.content.Context r4 = r3.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131828002(0x7f111d22, float:1.9288933E38)
                java.lang.String r4 = r4.getString(r5)
                r3.setText(r4)
                goto L_0x037e
            L_0x0148:
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r2.f42537z
                android.content.Context r7 = r3.getContext()
                android.content.res.Resources r7 = r7.getResources()
                r8 = 2131755724(0x7f1002cc, float:1.9142335E38)
                android.graphics.drawable.Drawable r7 = r7.getDrawable(r8)
                r3.setImageDrawable(r7)
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r2.f42537z
                xk1.s1 r7 = xk1.C15775s1.this
                android.app.Activity r7 = r7.getContext()
                android.content.res.Resources r7 = r7.getResources()
                int r7 = r7.getColor(r15)
                r3.setIconColor(r7)
                android.widget.TextView r3 = r2.f42535A
                android.content.Context r7 = r3.getContext()
                android.content.res.Resources r7 = r7.getResources()
                r8 = 2131828001(0x7f111d21, float:1.928893E38)
                java.lang.String r7 = r7.getString(r8)
                r3.setText(r7)
                xk1.s1 r3 = xk1.C15775s1.this
                fj1.b r3 = r3.f42528e
                if (r3 == 0) goto L_0x0216
                java.lang.Class<cl1.o> r5 = cl1.C54991o.class
                androidx.lifecycle.i0 r3 = r3.mo71262a(r5)
                cl1.o r3 = (cl1.C54991o) r3
                boolean r3 = r3.mo75960G3()
                if (r3 == 0) goto L_0x01b6
                zj1.b r3 = zj1.C16217b.f43438a
                android.view.View r10 = r2.f42536B
                r11 = 0
                r12 = 0
                r13 = 24
                r5 = 0
                java.lang.String r9 = "startlive.bottom.audiosetting"
                r7 = r3
                r8 = r4
                r15 = 1
                r14 = r5
                zj1.C16217b.m15108i(r7, r8, r9, r10, r11, r12, r13, r14)
                java.lang.String r5 = "anchorlive.bottom.audiosetting"
                r3.mo14754k(r4, r5, r15)
                java.lang.String r4 = "startlive.bottom.audiosetting"
                r3.mo14751g(r4)
                goto L_0x01f5
            L_0x01b6:
                r15 = 1
                xk1.s1 r3 = xk1.C15775s1.this
                d60.b r3 = r3.f42531h
                boolean r5 = r3 instanceof com.tencent.p014mm.plugin.finder.live.view.C56032b
                if (r5 == 0) goto L_0x01c2
                com.tencent.mm.plugin.finder.live.view.b r3 = (com.tencent.p014mm.plugin.finder.live.view.C56032b) r3
                goto L_0x01c3
            L_0x01c2:
                r3 = r6
            L_0x01c3:
                r14 = 0
                if (r3 == 0) goto L_0x01d7
                java.lang.Class<qj1.n0> r5 = qj1.C62889n0.class
                qj1.c r3 = r3.getPlugin(r5)
                qj1.n0 r3 = (qj1.C62889n0) r3
                if (r3 == 0) goto L_0x01d7
                boolean r3 = r3.mo87838s()
                if (r3 != r15) goto L_0x01d7
                r14 = 1
            L_0x01d7:
                if (r14 == 0) goto L_0x01f5
                zj1.b r3 = zj1.C16217b.f43438a
                android.view.View r10 = r2.f42536B
                r11 = 0
                r12 = 0
                r13 = 24
                r14 = 0
                java.lang.String r9 = "startlive.bottom.videosetting"
                r7 = r3
                r8 = r4
                zj1.C16217b.m15108i(r7, r8, r9, r10, r11, r12, r13, r14)
                java.lang.String r5 = "anchorlive.bottom.videosetting"
                r3.mo14754k(r4, r5, r15)
                java.lang.String r4 = "startlive.bottom.videosetting"
                r3.mo14751g(r4)
            L_0x01f5:
                xk1.s1 r3 = xk1.C15775s1.this
                d60.b r3 = r3.f42531h
                boolean r4 = r3 instanceof com.tencent.p014mm.plugin.finder.live.view.C56032b
                if (r4 == 0) goto L_0x0200
                com.tencent.mm.plugin.finder.live.view.b r3 = (com.tencent.p014mm.plugin.finder.live.view.C56032b) r3
                goto L_0x0201
            L_0x0200:
                r3 = r6
            L_0x0201:
                if (r3 == 0) goto L_0x020c
                java.lang.Class<qj1.n0> r4 = qj1.C62889n0.class
                qj1.c r3 = r3.getPlugin(r4)
                r6 = r3
                qj1.n0 r6 = (qj1.C62889n0) r6
            L_0x020c:
                if (r6 != 0) goto L_0x0210
                goto L_0x037e
            L_0x0210:
                android.view.View r3 = r2.f42536B
                r6.f178466W0 = r3
                goto L_0x037e
            L_0x0216:
                gy3.C87412m.m108603p(r5)
                throw r6
            L_0x021a:
                zj1.b r3 = zj1.C16217b.f43438a
                android.view.View r10 = r2.f42536B
                r11 = 0
                r12 = 0
                r13 = 24
                r14 = 0
                java.lang.String r9 = "startlive.bottom.music"
                r7 = r3
                r8 = r4
                zj1.C16217b.m15108i(r7, r8, r9, r10, r11, r12, r13, r14)
                java.lang.String r4 = "startlive.bottom.music"
                r3.mo14751g(r4)
                ok1.e r3 = ok1.C62042e.f176370a
                xk1.s1 r4 = xk1.C15775s1.this
                fj1.b r4 = r4.f42528e
                if (r4 == 0) goto L_0x02b9
                boolean r3 = r3.mo86991B(r4)
                if (r3 == 0) goto L_0x027c
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r2.f42537z
                android.content.Context r4 = r3.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131756071(0x7f100427, float:1.914304E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
                r3.setImageDrawable(r4)
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r2.f42537z
                xk1.s1 r4 = xk1.C15775s1.this
                android.app.Activity r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                int r4 = r4.getColor(r15)
                r3.setIconColor(r4)
                android.widget.TextView r3 = r2.f42535A
                android.content.Context r4 = r3.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131828006(0x7f111d26, float:1.928894E38)
                java.lang.String r4 = r4.getString(r5)
                r3.setText(r4)
                goto L_0x037e
            L_0x027c:
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r2.f42537z
                android.content.Context r4 = r3.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131755920(0x7f100390, float:1.9142733E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
                r3.setImageDrawable(r4)
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r2.f42537z
                xk1.s1 r4 = xk1.C15775s1.this
                android.app.Activity r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                int r4 = r4.getColor(r15)
                r3.setIconColor(r4)
                android.widget.TextView r3 = r2.f42535A
                android.content.Context r4 = r3.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131827023(0x7f11194f, float:1.9286947E38)
                java.lang.String r4 = r4.getString(r5)
                r3.setText(r4)
                goto L_0x037e
            L_0x02b9:
                gy3.C87412m.m108603p(r5)
                throw r6
            L_0x02bd:
                zj1.b r3 = zj1.C16217b.f43438a
                android.view.View r10 = r2.f42536B
                r11 = 0
                r12 = 0
                r13 = 24
                r14 = 0
                java.lang.String r9 = "startlive.bottom.shopping"
                r7 = r3
                r8 = r4
                zj1.C16217b.m15108i(r7, r8, r9, r10, r11, r12, r13, r14)
                java.lang.String r4 = "startlive.bottom.shopping"
                r3.mo14751g(r4)
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r2.f42537z
                android.content.Context r4 = r3.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r7 = 2131756159(0x7f10047f, float:1.9143218E38)
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r7)
                r3.setImageDrawable(r4)
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r2.f42537z
                xk1.s1 r4 = xk1.C15775s1.this
                android.app.Activity r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                int r4 = r4.getColor(r15)
                r3.setIconColor(r4)
                android.widget.TextView r3 = r2.f42535A
                android.content.Context r4 = r3.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r7 = 2131828008(0x7f111d28, float:1.9288945E38)
                java.lang.String r4 = r4.getString(r7)
                r3.setText(r4)
                xk1.s1 r3 = xk1.C15775s1.this
                r3.getClass()
                java.lang.Class<cl1.u> r4 = cl1.C55001u.class
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r7.getClass()
                cj1.n5 r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159396y
                if (r7 != 0) goto L_0x0333
                bl3.r r7 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r8 = r3.getActivity()
                bl3.r$a r7 = r7.mo62444c(r8)
                java.lang.Class<xk1.m> r8 = xk1.C66331m.class
                androidx.lifecycle.i0 r7 = r7.mo75002a(r8)
                xk1.m r7 = (xk1.C66331m) r7
                cj1.t r7 = r7.f190944g
            L_0x0333:
                fj1.b r8 = r3.f42528e
                if (r8 == 0) goto L_0x0399
                androidx.lifecycle.i0 r5 = r8.mo71262a(r4)
                cl1.u r5 = (cl1.C55001u) r5
                android.app.Activity r6 = r3.getContext()
                java.lang.String r8 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
                gy3.C87412m.m108592e(r6, r8)
                r10 = r6
                com.tencent.mm.ui.MMActivity r10 = (com.tencent.p014mm.p136ui.MMActivity) r10
                te3.c21 r6 = r5.f154420q
                long r11 = r6.f182392d
                long r13 = r5.f154416j
                zc1.b r6 = zc1.C66785b.f191882e
                java.lang.String r15 = r6.mo90662O5()
                androidx.lifecycle.i0 r4 = r5.business(r4)
                cl1.u r4 = (cl1.C55001u) r4
                byte[] r4 = r4.f154417n
                xk1.t1 r5 = new xk1.t1
                r5.<init>(r3)
                r17 = 0
                r18 = 1
                r19 = 0
                r9 = r7
                cj1.t r9 = (cj1.C54820t) r9
                r16 = r4
                r20 = r5
                r9.mo75746n(r10, r11, r13, r15, r16, r17, r18, r19, r20)
                rx3.b0 r3 = rx3.C13598b0.f38549a
                if (r3 != 0) goto L_0x037e
                java.lang.String r3 = "Finder.FinderLivePostUIC"
                java.lang.String r4 = "tryTopreloadMiniprogram liveData is empty!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r4)
            L_0x037e:
                android.view.View r3 = r2.f44854d
                xk1.r1 r4 = new xk1.r1
                xk1.s1 r5 = xk1.C15775s1.this
                r4.<init>(r5, r1)
                r3.setOnClickListener(r4)
                android.view.View r1 = r2.f44854d
                r3 = 2131302533(0x7f091885, float:1.8223155E38)
                android.widget.TextView r2 = r2.f42535A
                java.lang.CharSequence r2 = r2.getText()
                r1.setTag(r3, r2)
                return
            L_0x0399:
                gy3.C87412m.m108603p(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: xk1.C15775s1.C15776a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            C15775s1 s1Var = C15775s1.this;
            View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.afe, (ViewGroup) null);
            C87412m.m108593f(inflate, "inflate(parent.context, …re_camera_opt_item, null)");
            return new C15777b(s1Var, inflate);
        }
    }

    /* renamed from: xk1.s1$b */
    public final class C15777b extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f42535A;

        /* renamed from: B */
        public final View f42536B;

        /* renamed from: z */
        public final WeImageView f42537z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15777b(C15775s1 s1Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f42537z = (WeImageView) view.findViewById(C0966R.C0970id.dgn);
            this.f42535A = (TextView) view.findViewById(C0966R.C0970id.dgo);
            this.f42536B = view.findViewById(C0966R.C0970id.iis);
        }
    }

    /* renamed from: xk1.s1$c */
    public static final class C15778c extends C87413o implements C32226l<C66297d2.C15723c, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C15775s1 f42538d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15778c(C15775s1 s1Var) {
            super(1);
            this.f42538d = s1Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:81:0x0239, code lost:
            if (r3.mo86991B(r1) == false) goto L_0x0240;
         */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0231  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                xk1.d2$c r1 = (xk1.C66297d2.C15723c) r1
                java.lang.String r2 = "it"
                gy3.C87412m.m108594g(r1, r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "onOptionClick "
                r2.append(r3)
                int r3 = r1.f42429a
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "Finder.FinderLivePostUIC"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                int r1 = r1.f42429a
                r2 = 0
                r4 = 1
                if (r1 == 0) goto L_0x0255
                java.lang.String r5 = "clickMusic"
                java.lang.String r6 = "liveData"
                r7 = 2
                r8 = 0
                if (r1 == r4) goto L_0x01b1
                if (r1 == r7) goto L_0x0108
                r9 = 3
                if (r1 == r9) goto L_0x0097
                r9 = 4
                if (r1 == r9) goto L_0x004b
                r2 = 5
                if (r1 == r2) goto L_0x003e
                goto L_0x0277
            L_0x003e:
                xk1.s1 r1 = r0.f42538d
                d60.b r1 = r1.f42531h
                if (r1 == 0) goto L_0x0277
                d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_ANCHOR_GAME_PLAY_TOGETHER_SHOW_HALF
                d60.C58124b.C7172a.m7372a(r1, r2, r8, r7, r8)
                goto L_0x0277
            L_0x004b:
                xk1.s1 r1 = r0.f42538d
                r1.getClass()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
                int r3 = r1.f42532i
                if (r3 != r4) goto L_0x0061
                d60.b r3 = r1.f42531h
                if (r3 == 0) goto L_0x0078
                d60.b$b r4 = d60.C58124b.C58125b.FINDER_LIVE_ANCHOR_PROMOTE_SHOW
                d60.C58124b.C7172a.m7372a(r3, r4, r8, r7, r8)
                goto L_0x0078
            L_0x0061:
                if (r3 != r7) goto L_0x0078
                bl3.r r3 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r4 = r1.getActivity()
                bl3.r$a r3 = r3.mo62444c(r4)
                java.lang.Class<xk1.q0> r4 = xk1.C66342q0.class
                androidx.lifecycle.i0 r3 = r3.mo75002a(r4)
                xk1.q0 r3 = (xk1.C66342q0) r3
                r3.mo90449d3(r8)
            L_0x0078:
                fj1.b r10 = r1.f42528e
                if (r10 == 0) goto L_0x0093
                dh1.b r9 = dh1.C7329b.f25441a
                r11 = 2
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 28
                r16 = 0
                dh1.C7329b.m7473b(r9, r10, r11, r12, r13, r14, r15, r16)
                zj1.b r1 = zj1.C16217b.f43438a
                java.lang.String r3 = "startlive.bottom.link"
                r1.mo14745b(r3, r2)
                goto L_0x0277
            L_0x0093:
                gy3.C87412m.m108603p(r6)
                throw r8
            L_0x0097:
                xk1.s1 r1 = r0.f42538d
                r1.getClass()
                java.lang.Class<rl1.c0> r3 = rl1.C13020c0.class
                java.lang.Class<ht1.t1> r5 = ht1.C60200t1.class
                java.lang.String r6 = "SimpleUIComponent"
                java.lang.String r7 = "clickLottery"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
                bl3.r r6 = bl3.C39818r.f106831a
                bl3.r$a r7 = r6.mo62446e(r5)
                androidx.lifecycle.i0 r7 = r7.mo75002a(r3)
                rl1.c0 r7 = (rl1.C13020c0) r7
                java.util.LinkedList<te3.a31> r7 = r7.f37083e
                if (r7 == 0) goto L_0x00c0
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L_0x00be
                goto L_0x00c0
            L_0x00be:
                r7 = 0
                goto L_0x00c1
            L_0x00c0:
                r7 = 1
            L_0x00c1:
                if (r7 == 0) goto L_0x00e1
                java.lang.Class<tf0.o1> r3 = tf0.C13883o1.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                tf0.o1 r3 = (tf0.C13883o1) r3
                androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()
                android.content.Intent r5 = new android.content.Intent
                r5.<init>()
                java.lang.String r6 = "KEY_PARAMS_LOTTERY_SOURCE"
                r5.putExtra(r6, r4)
                rx3.b0 r4 = rx3.C13598b0.f38549a
                r4 = 1002(0x3ea, float:1.404E-42)
                r3.mo13250CN(r1, r5, r4)
                goto L_0x00fe
            L_0x00e1:
                r1.mo14490c3()
                rl1.n r1 = r1.f42533j
                if (r1 == 0) goto L_0x00fe
                te3.m01 r4 = new te3.m01
                r4.<init>()
                bl3.r$a r5 = r6.mo62446e(r5)
                androidx.lifecycle.i0 r3 = r5.mo75002a(r3)
                rl1.c0 r3 = (rl1.C13020c0) r3
                java.util.LinkedList<te3.a31> r3 = r3.f37083e
                r4.f137739d = r3
                r1.mo12559e(r4)
            L_0x00fe:
                zj1.b r1 = zj1.C16217b.f43438a
                java.lang.String r3 = "startlive.bottom.lottery"
                r1.mo14745b(r3, r2)
                goto L_0x0277
            L_0x0108:
                xk1.s1 r1 = r0.f42538d
                r1.getClass()
                java.lang.Class<cl1.o> r4 = cl1.C54991o.class
                java.lang.Class<ak1.o> r5 = ak1.C54108o.class
                java.lang.String r7 = "clickBeauty"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
                di3.d r3 = di3.C86312j.m106911c(r5)
                java.lang.String r7 = "getService(HellLiveReport::class.java)"
                gy3.C87412m.m108593f(r3, r7)
                r9 = r3
                ht1.j5 r9 = (ht1.C8777j5) r9
                ak1.f0$m r10 = ak1.C54067f0.C0064m.FRAME
                di3.d r3 = di3.C86312j.m106911c(r5)
                ak1.o r3 = (ak1.C54108o) r3
                ak1.f0$l r5 = ak1.C54067f0.C0062l.BEFORE
                java.util.Map r11 = r3.Ex0(r5)
                r12 = 0
                r13 = 4
                r14 = 0
                ht1.C8777j5.C8778a.m8606g(r9, r10, r11, r12, r13, r14)
                bl3.r r3 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r5 = r1.getActivity()
                bl3.r$a r5 = r3.mo62444c(r5)
                java.lang.Class<xk1.d2> r7 = xk1.C66297d2.class
                androidx.lifecycle.i0 r5 = r5.mo75002a(r7)
                xk1.d2 r5 = (xk1.C66297d2) r5
                androidx.appcompat.app.AppCompatActivity r7 = r1.getActivity()
                bl3.r$a r3 = r3.mo62444c(r7)
                java.lang.Class<xk1.d2> r7 = xk1.C66297d2.class
                androidx.lifecycle.i0 r3 = r3.mo75002a(r7)
                xk1.d2 r3 = (xk1.C66297d2) r3
                int r3 = r3.f190848d
                r5.f190867z = r3
                fj1.b r3 = r1.f42528e
                if (r3 == 0) goto L_0x01ad
                androidx.lifecycle.i0 r3 = r3.mo71262a(r4)
                cl1.o r3 = (cl1.C54991o) r3
                boolean r5 = r3.mo75999e4()
                if (r5 != 0) goto L_0x0185
                boolean r3 = r3.mo75997d4()
                if (r3 != 0) goto L_0x0185
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                java.lang.String r5 = "PARAM_FINDER_LIVE_CAMERA_OPT_SCENE"
                r3.putInt(r5, r2)
                d60.b r5 = r1.f42531h
                if (r5 == 0) goto L_0x0185
                d60.b$b r7 = d60.C58124b.C58125b.FINDER_LIVE_SHOW_CAMERA_OPT_SHEET
                r5.statusChange(r7, r3)
            L_0x0185:
                fj1.b r1 = r1.f42528e
                if (r1 == 0) goto L_0x01a9
                androidx.lifecycle.i0 r1 = r1.mo71262a(r4)
                cl1.o r1 = (cl1.C54991o) r1
                boolean r1 = r1.mo75960G3()
                if (r1 == 0) goto L_0x019f
                zj1.b r1 = zj1.C16217b.f43438a
                java.lang.String r3 = "startlive.bottom.audiosetting"
                r1.mo14745b(r3, r2)
                goto L_0x0277
            L_0x019f:
                zj1.b r1 = zj1.C16217b.f43438a
                java.lang.String r3 = "startlive.bottom.videosetting"
                r1.mo14745b(r3, r2)
                goto L_0x0277
            L_0x01a9:
                gy3.C87412m.m108603p(r6)
                throw r8
            L_0x01ad:
                gy3.C87412m.m108603p(r6)
                throw r8
            L_0x01b1:
                xk1.s1 r1 = r0.f42538d
                r1.getClass()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
                ok1.e r3 = ok1.C62042e.f176370a
                boolean r4 = r3.mo86994C()
                if (r4 == 0) goto L_0x0212
                fj1.b r4 = r1.f42528e
                if (r4 == 0) goto L_0x020e
                boolean r4 = r3.mo86991B(r4)
                if (r4 == 0) goto L_0x0212
                bl3.r r4 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r5 = r1.getActivity()
                bl3.r$a r5 = r4.mo62444c(r5)
                java.lang.Class<xk1.d2> r9 = xk1.C66297d2.class
                androidx.lifecycle.i0 r5 = r5.mo75002a(r9)
                xk1.d2 r5 = (xk1.C66297d2) r5
                androidx.appcompat.app.AppCompatActivity r9 = r1.getActivity()
                bl3.r$a r9 = r4.mo62444c(r9)
                java.lang.Class<xk1.d2> r10 = xk1.C66297d2.class
                androidx.lifecycle.i0 r9 = r9.mo75002a(r10)
                xk1.d2 r9 = (xk1.C66297d2) r9
                int r9 = r9.f190849e
                r5.f190867z = r9
                androidx.appcompat.app.AppCompatActivity r5 = r1.getActivity()
                bl3.r$a r4 = r4.mo62444c(r5)
                java.lang.Class<xk1.d2> r5 = xk1.C66297d2.class
                androidx.lifecycle.i0 r4 = r4.mo75002a(r5)
                xk1.d2 r4 = (xk1.C66297d2) r4
                r4.mo90415e3()
                d60.b r4 = r1.f42531h
                if (r4 == 0) goto L_0x022b
                d60.b$b r5 = d60.C58124b.C58125b.FINDER_LIVE_ANCHOR_MUSIC_SELECT_SHOW
                d60.C58124b.C7172a.m7372a(r4, r5, r8, r7, r8)
                goto L_0x022b
            L_0x020e:
                gy3.C87412m.m108603p(r6)
                throw r8
            L_0x0212:
                boolean r4 = r3.mo86994C()
                if (r4 == 0) goto L_0x0222
                d60.b r4 = r1.f42531h
                if (r4 == 0) goto L_0x022b
                d60.b$b r5 = d60.C58124b.C58125b.FINDER_LIVE_ANCHOR_MUSIC_SING_SONG_LIST_SHOW
                d60.C58124b.C7172a.m7372a(r4, r5, r8, r7, r8)
                goto L_0x022b
            L_0x0222:
                d60.b r4 = r1.f42531h
                if (r4 == 0) goto L_0x022b
                d60.b$b r5 = d60.C58124b.C58125b.FINDER_LIVE_ANCHOR_MUSIC_SHOW
                d60.C58124b.C7172a.m7372a(r4, r5, r8, r7, r8)
            L_0x022b:
                boolean r4 = r3.mo86994C()
                if (r4 == 0) goto L_0x0240
                fj1.b r1 = r1.f42528e
                if (r1 == 0) goto L_0x023c
                boolean r1 = r3.mo86991B(r1)
                if (r1 != 0) goto L_0x024c
                goto L_0x0240
            L_0x023c:
                gy3.C87412m.m108603p(r6)
                throw r8
            L_0x0240:
                zj1.b r1 = zj1.C16217b.f43438a
                java.lang.String r3 = "anchorlive.bottom.music.bgmusic"
                r1.mo14751g(r3)
                java.lang.String r3 = "anchorlive.bottom.music.song"
                r1.mo14751g(r3)
            L_0x024c:
                zj1.b r1 = zj1.C16217b.f43438a
                java.lang.String r3 = "startlive.bottom.music"
                r1.mo14745b(r3, r2)
                goto L_0x0277
            L_0x0255:
                xk1.s1 r1 = r0.f42538d
                r1.getClass()
                zj1.b r3 = zj1.C16217b.f43438a
                java.lang.String r5 = "startlive.bottom.shopping"
                r3.mo14745b(r5, r2)
                d60.b r1 = r1.f42531h
                if (r1 == 0) goto L_0x0277
                d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_SHOPPING_LIST_SHOW
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                java.lang.String r5 = "PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK"
                r3.putBoolean(r5, r4)
                rx3.b0 r4 = rx3.C13598b0.f38549a
                r1.statusChange(r2, r3)
            L_0x0277:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: xk1.C15775s1.C15778c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15775s1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo14490c3() {
        if (this.f42533j == null) {
            AppCompatActivity activity = getActivity();
            C45795b bVar = this.f42528e;
            if (bVar != null) {
                this.f42533j = new C13053n(activity, bVar, 1);
            } else {
                C87412m.m108603p("liveData");
                throw null;
            }
        }
    }

    /* renamed from: d3 */
    public void mo14491d3(int i, View view, C58124b bVar, C45795b bVar2) {
        C87412m.m108594g(view, "rootView");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(bVar2, "liveData");
        this.f42528e = bVar2;
        this.f42531h = bVar;
        this.f42532i = i;
        Class cls = C54991o.class;
        StringBuilder sb = new StringBuilder();
        sb.append("loadOptions exptFilterEnable:");
        C45795b bVar3 = this.f42528e;
        if (bVar3 != null) {
            sb.append(Boolean.valueOf(((C54991o) bVar3.mo71262a(cls)).f154313f2));
            sb.append(", exptBeautyEnable:");
            C45795b bVar4 = this.f42528e;
            if (bVar4 != null) {
                sb.append(Boolean.valueOf(((C54991o) bVar4.mo71262a(cls)).f154308e2));
                Log.m105924i("Finder.FinderLivePostUIC", sb.toString());
                this.f42529f.clear();
                for (int i2 = 0; i2 < 6; i2++) {
                    boolean z = true;
                    if (i2 == 1) {
                        C62042e eVar = C62042e.f176370a;
                        C45795b bVar5 = this.f42528e;
                        if (bVar5 == null) {
                            C87412m.m108603p("liveData");
                            throw null;
                        } else if (eVar.mo86991B(bVar5) || eVar.mo86994C()) {
                            this.f42529f.add(new C66297d2.C15723c(i2));
                            C45795b bVar6 = this.f42528e;
                            if (bVar6 != null) {
                                C54754f fVar = ((C54991o) bVar6.mo71262a(cls)).f154232N2;
                                LinkedList<Integer> linkedList = fVar != null ? fVar.f153466c : null;
                                if (linkedList != null && !linkedList.isEmpty()) {
                                    z = false;
                                }
                                if (!z) {
                                    AppCompatActivity activity = getActivity();
                                    C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                                    MMActivity mMActivity = (MMActivity) activity;
                                    C45795b bVar7 = this.f42528e;
                                    if (bVar7 != null) {
                                        C52312zv0 zv02 = new C52312zv0();
                                        zv02.f146240d = linkedList;
                                        C13598b0 b0Var = C13598b0.f38549a;
                                        eVar.mo86996C1(mMActivity, bVar7, zv02, (C32224a<C13598b0>) null);
                                    } else {
                                        C87412m.m108603p("liveData");
                                        throw null;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                C87412m.m108603p("liveData");
                                throw null;
                            }
                        }
                    } else if (i2 != 2) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                this.f42529f.add(new C66297d2.C15723c(i2));
                            } else if (this.f42532i != 2) {
                                continue;
                            } else {
                                C45795b bVar8 = this.f42528e;
                                if (bVar8 == null) {
                                    C87412m.m108603p("liveData");
                                    throw null;
                                } else if (C87412m.m108589b(((C54991o) bVar8.mo71262a(cls)).f154290Z3.getValue(), Boolean.TRUE)) {
                                    this.f42529f.add(new C66297d2.C15723c(i2));
                                }
                            }
                        } else if (C58739j4.f168176a.mo83689R()) {
                            this.f42529f.add(new C66297d2.C15723c(i2));
                        }
                    } else if (this.f42532i == 1) {
                        this.f42529f.add(new C66297d2.C15723c(i2));
                    }
                }
                this.f42527d = (RecyclerView) view.findViewById(C0966R.C0970id.dgp);
                this.f42530g = new C15778c(this);
                RecyclerView recyclerView = this.f42527d;
                if (recyclerView != null) {
                    recyclerView.setAdapter(new C15776a());
                }
                RecyclerView recyclerView2 = this.f42527d;
                if (recyclerView2 != null) {
                    recyclerView2.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
                    return;
                }
                return;
            }
            C87412m.m108603p("liveData");
            throw null;
        }
        C87412m.m108603p("liveData");
        throw null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C13598b0 b0Var;
        int i3 = -1;
        boolean z = false;
        if (i2 == -1 && i == 1002) {
            if (intent != null && intent.hasExtra("KEY_PARAMS_LOTTERY_SOURCE")) {
                i3 = intent.getIntExtra("KEY_PARAMS_LOTTERY_SOURCE", -1);
                Log.m105924i(C54492n.TAG, "onActivityResult source:" + i3 + '!');
            } else {
                Log.m105924i(C54492n.TAG, "onActivityResult but KEY_PARAMS_LOTTERY_SOURCE is null!");
            }
            if (i3 == 1) {
                z = true;
            }
        }
        if (z) {
            mo14490c3();
            C13053n nVar = this.f42533j;
            if (nVar != null) {
                C50334m01 m012 = new C50334m01();
                m012.f137739d = ((C13020c0) C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C13020c0.class)).f37083e;
                nVar.mo12559e(m012);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                Log.m105920e(C54492n.TAG, "onActivityResult show lottery panel but lottery panel is null!");
            }
        }
    }

    public void onStop() {
        super.onStop();
        C16217b bVar = C16217b.f43438a;
        bVar.mo14746c("startlive.bottom.videosetting");
        bVar.mo14746c("startlive.bottom.audiosetting");
        bVar.mo14746c("startlive.bottom.link");
        bVar.mo14746c("startlive.bottom.music");
        bVar.mo14746c("startlive.bottom.lottery");
        bVar.mo14746c("startlive.bottom.shopping");
    }
}
