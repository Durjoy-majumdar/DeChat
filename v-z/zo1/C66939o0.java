package zo1;

import ak1.C0047e0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import bp1.C54519d;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout;
import com.tencent.p014mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.file.XVFSFile;
import cp1.C57939g;
import cp1.C57952m;
import cp1.C57959q;
import d60.C58124b;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import ok1.C11428d;
import ok1.C62042e;
import org.json.JSONObject;
import p282z2.C16095a;
import qj1.C62660c;
import rx3.C13598b0;
import sx3.C64186f0;
import te3.C49712hj1;
import te3.C64338e71;
import te3.C64662qp2;
import vo1.C65799i0;
import y50.C15936n0;

/* renamed from: zo1.o0 */
public final class C66939o0 extends C62660c implements View.OnClickListener {

    /* renamed from: p */
    public final C58124b f192321p;

    /* renamed from: q */
    public final String f192322q = "ReplayerSeekbarPlugin";

    /* renamed from: r */
    public final FinderLiveReplaySeekbar f192323r;

    /* renamed from: s */
    public final WeImageView f192324s;

    /* renamed from: t */
    public final TextView f192325t;

    /* renamed from: u */
    public final TextView f192326u;

    /* renamed from: v */
    public int f192327v;

    /* renamed from: zo1.o0$a */
    public static final class C66940a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C66939o0 f192328d;

        public C66940a(C66939o0 o0Var) {
            this.f192328d = o0Var;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C87412m.m108594g(seekBar, "seekBar");
            String str = this.f192328d.f192322q;
            Log.m105924i(str, "onProgressChanged progress:" + i + " fromUser:" + z);
            if (z && ((C54519d) this.f192328d.mo87696x0(C54519d.class)).mo75375i3() > 0) {
                this.f192328d.mo90924Z0(((float) i) / ((float) seekBar.getMax()));
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            C57952m mVar;
            C87412m.m108594g(seekBar, "seekBar");
            Log.m105924i(this.f192328d.f192322q, "onStartTrackingTouch");
            this.f192328d.f192327v = (int) ((((float) seekBar.getProgress()) / ((float) seekBar.getMax())) * ((float) ((C54519d) this.f192328d.mo87696x0(C54519d.class)).mo75375i3()));
            C66925j0 j0Var = (C66925j0) this.f192328d.mo87687E0(C66925j0.class);
            if (j0Var != null && (mVar = j0Var.f192301r) != null) {
                mVar.mo82758d();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0054, code lost:
            r3 = r3.f192301r;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onStopTrackingTouch(android.widget.SeekBar r11) {
            /*
                r10 = this;
                java.lang.Class<zo1.j0> r0 = zo1.C66925j0.class
                java.lang.Class<bp1.d> r1 = bp1.C54519d.class
                zo1.o0 r2 = r10.f192328d
                java.lang.String r2 = r2.f192322q
                java.lang.String r3 = "onStopTrackingTouch"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                zo1.o0 r2 = r10.f192328d
                androidx.lifecycle.i0 r2 = r2.mo87696x0(r1)
                bp1.d r2 = (bp1.C54519d) r2
                int r2 = r2.mo75375i3()
                if (r2 <= 0) goto L_0x0189
                if (r11 == 0) goto L_0x0189
                zo1.o0 r2 = r10.f192328d
                int r3 = r11.getProgress()
                float r3 = (float) r3
                int r11 = r11.getMax()
                float r11 = (float) r11
                float r3 = r3 / r11
                androidx.lifecycle.i0 r11 = r2.mo87696x0(r1)
                bp1.d r11 = (bp1.C54519d) r11
                int r11 = r11.mo75375i3()
                float r11 = (float) r11
                float r3 = r3 * r11
                androidx.lifecycle.i0 r11 = r2.mo87696x0(r1)
                bp1.d r11 = (bp1.C54519d) r11
                int r11 = r11.mo75375i3()
                float r11 = (float) r11
                r4 = 1065353216(0x3f800000, float:1.0)
                float r11 = r11 - r4
                r4 = 0
                float r11 = p282z2.C16095a.m14979a(r3, r4, r11)
                qj1.c r3 = r2.mo87687E0(r0)
                zo1.j0 r3 = (zo1.C66925j0) r3
                r5 = 1
                r6 = 0
                if (r3 == 0) goto L_0x006a
                cp1.m r3 = r3.f192301r
                if (r3 == 0) goto L_0x006a
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r7 = r3.f165852a
                boolean r7 = r7.mo78599D()
                if (r7 != 0) goto L_0x0068
                com.tencent.mm.plugin.finder.replay.FinderLiveThumbPlayerProxy r3 = r3.f165852a
                boolean r3 = r3.mo78600E()
                if (r3 == 0) goto L_0x006a
            L_0x0068:
                r3 = 1
                goto L_0x006b
            L_0x006a:
                r3 = 0
            L_0x006b:
                java.lang.String r7 = r2.f192322q
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "seek to "
                r8.append(r9)
                r8.append(r11)
                java.lang.String r9 = ",isPreparedOrStartPlay:"
                r8.append(r9)
                r8.append(r3)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
                r7 = 0
                if (r3 == 0) goto L_0x0099
                qj1.c r0 = r2.mo87687E0(r0)
                zo1.j0 r0 = (zo1.C66925j0) r0
                if (r0 == 0) goto L_0x00ce
                double r3 = (double) r11
                r0.mo90917c1(r3, r5)
                goto L_0x00ce
            L_0x0099:
                qj1.c r0 = r2.mo87687E0(r0)
                zo1.j0 r0 = (zo1.C66925j0) r0
                if (r0 == 0) goto L_0x00a9
                int r3 = (int) r11
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.mo90916b1(r3, r6)
            L_0x00a9:
                java.lang.Class<cl1.l> r0 = cl1.C0668l.class
                androidx.lifecycle.i0 r0 = r2.mo87696x0(r0)
                cl1.l r0 = (cl1.C0668l) r0
                boolean r0 = r0.mo631g3()
                if (r0 == 0) goto L_0x00ce
                java.lang.Class<qj1.t4> r0 = qj1.C12669t4.class
                qj1.c r0 = r2.mo87687E0(r0)
                qj1.t4 r0 = (qj1.C12669t4) r0
                if (r0 == 0) goto L_0x00ce
                int r3 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r3 <= 0) goto L_0x00ce
                int r3 = r0.mo14483f0()
                if (r3 != 0) goto L_0x00ce
                r0.mo12250d1(r5)
            L_0x00ce:
                java.lang.Class<qj1.e5> r0 = qj1.C12322e5.class
                qj1.c r0 = r2.mo87687E0(r0)
                qj1.e5 r0 = (qj1.C12322e5) r0
                if (r0 == 0) goto L_0x0114
                java.lang.Class<cl1.z0> r3 = cl1.C0702z0.class
                androidx.lifecycle.i0 r3 = r0.mo87696x0(r3)
                cl1.z0 r3 = (cl1.C0702z0) r3
                java.util.List<cj1.o5> r3 = r3.f1672f
                java.lang.String r4 = "business(LiveMsgSlice::class.java).msgList"
                gy3.C87412m.m108593f(r3, r4)
                qj1.k5 r4 = qj1.C12483k5.f35908d
                java.lang.String r8 = "f"
                gy3.C87412m.m108594g(r4, r8)
                monitor-enter(r3)
                o40.C61926c.m72674S(r3, r4)     // Catch:{ all -> 0x0111 }
                monitor-exit(r3)
                qk1.i0 r3 = r0.f35506C
                java.util.ArrayList<cj1.o5> r3 = r3.f36654g
                qj1.l5 r4 = qj1.C12498l5.f35949d
                java.lang.String r8 = "<this>"
                gy3.C87412m.m108594g(r3, r8)
                java.lang.String r8 = "f"
                gy3.C87412m.m108594g(r4, r8)
                monitor-enter(r3)
                o40.C61926c.m72674S(r3, r4)     // Catch:{ all -> 0x010e }
                monitor-exit(r3)
                qk1.i0 r0 = r0.f35506C
                r0.notifyDataSetChanged()
                goto L_0x0114
            L_0x010e:
                r11 = move-exception
                monitor-exit(r3)
                throw r11
            L_0x0111:
                r11 = move-exception
                monitor-exit(r3)
                throw r11
            L_0x0114:
                com.tencent.mm.ui.widget.imageview.WeImageView r0 = r2.f192324s
                android.view.ViewGroup r3 = r2.f166287d
                android.content.Context r3 = r3.getContext()
                r4 = 2131756113(0x7f100451, float:1.9143124E38)
                android.graphics.drawable.Drawable r3 = r3.getDrawable(r4)
                r4 = -1
                com.tencent.p014mm.p136ui.C74933u4.m89769f(r3, r4)
                r0.setImageDrawable(r3)
                int r11 = (int) r11
                ak1.e0 r0 = ak1.C0047e0.f58a
                org.json.JSONObject r0 = ak1.C0047e0.m34b(r0, r7, r5, r7)
                androidx.lifecycle.i0 r1 = r2.mo87696x0(r1)
                bp1.d r1 = (bp1.C54519d) r1
                int r1 = r1.mo75375i3()
                int r1 = r1 * 1000
                java.lang.String r3 = "live_duration"
                r0.put(r3, r1)
                int r1 = r2.f192327v
                java.lang.String r3 = "from_time"
                r0.put(r3, r1)
                java.lang.String r1 = "to_time"
                r0.put(r1, r11)
                com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar r1 = r2.f192323r
                java.util.List r1 = r1.getFragmentItems()
                java.util.Iterator r1 = r1.iterator()
            L_0x0159:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x016d
                java.lang.Object r2 = r1.next()
                com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar$a r2 = (com.tencent.p014mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar.C56261a) r2
                te3.qp2 r2 = r2.f160818b
                int r2 = r2.f185060d
                if (r2 != r11) goto L_0x0159
                r6 = 1
                goto L_0x0159
            L_0x016d:
                java.lang.String r11 = "is_point"
                r0.put(r11, r6)
                java.lang.Class<ht1.j5> r11 = ht1.C8777j5.class
                di3.d r11 = di3.C86312j.m106911c(r11)
                ht1.j5 r11 = (ht1.C8777j5) r11
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "jsonObj.toString()"
                gy3.C87412m.m108593f(r0, r1)
                java.lang.String r1 = "watch_live_progress_bar"
                r11.hg0(r1, r0)
            L_0x0189:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zo1.C66939o0.C66940a.onStopTrackingTouch(android.widget.SeekBar):void");
        }
    }

    /* renamed from: zo1.o0$b */
    public static final class C66941b extends C87413o implements C32226l<FinderLiveReplaySeekbar.C56261a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66939o0 f192329d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66941b(C66939o0 o0Var) {
            super(1);
            this.f192329d = o0Var;
        }

        /* JADX WARNING: type inference failed for: r0v5, types: [android.view.View] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r6) {
            /*
                r5 = this;
                com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar$a r6 = (com.tencent.p014mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar.C56261a) r6
                if (r6 != 0) goto L_0x0006
                goto L_0x00bd
            L_0x0006:
                java.lang.Class<ht1.j5> r0 = ht1.C8777j5.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                ht1.j5 r0 = (ht1.C8777j5) r0
                ak1.e0 r1 = ak1.C0047e0.f58a
                r2 = 0
                r3 = 1
                org.json.JSONObject r1 = ak1.C0047e0.m34b(r1, r2, r3, r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r4 = "LiveChargeAndReplayRepor…CommonParams().toString()"
                gy3.C87412m.m108593f(r1, r4)
                java.lang.String r4 = "watch_live_point_click"
                r0.hg0(r4, r1)
                zo1.o0 r0 = r5.f192329d
                com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar r0 = r0.f192323r
                android.view.View r0 = r0.getFragmentView()
                boolean r1 = r0 instanceof cp1.C57939g
                if (r1 == 0) goto L_0x0034
                r2 = r0
                cp1.g r2 = (cp1.C57939g) r2
            L_0x0034:
                if (r2 == 0) goto L_0x003b
                te3.qp2 r0 = r6.f160818b
                r2.setFragment(r0)
            L_0x003b:
                zo1.o0 r0 = r5.f192329d
                com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar r0 = r0.f192323r
                r0.getClass()
                vo1.a0$b r1 = vo1.C65770a0.f189184r
                vo1.a0 r1 = r1.mo89819a()
                fj1.b r1 = r1.f189189c
                r2 = 0
                if (r1 == 0) goto L_0x005a
                java.lang.Class<cl1.o> r4 = cl1.C54991o.class
                androidx.lifecycle.i0 r1 = r1.mo71262a(r4)
                cl1.o r1 = (cl1.C54991o) r1
                boolean r1 = r1.f154286Z
                if (r1 != r3) goto L_0x005a
                goto L_0x005b
            L_0x005a:
                r3 = 0
            L_0x005b:
                nj3.s0 r1 = r0.f160811q
                if (r1 == 0) goto L_0x00bd
                if (r3 == 0) goto L_0x0062
                goto L_0x00bd
            L_0x0062:
                android.view.View r1 = r1.getContentView()
                if (r1 == 0) goto L_0x006b
                r1.measure(r2, r2)
            L_0x006b:
                android.graphics.drawable.Drawable r1 = r6.f160819c
                android.graphics.Rect r1 = r1.getBounds()
                int r1 = r1.left
                float r1 = (float) r1
                android.graphics.drawable.Drawable r6 = r6.f160819c
                int r6 = r6.getIntrinsicWidth()
                float r6 = (float) r6
                r2 = 1073741824(0x40000000, float:2.0)
                float r6 = r6 / r2
                float r1 = r1 + r6
                nj3.s0 r6 = r0.f160811q
                gy3.C87412m.m108591d(r6)
                android.view.View r6 = r6.getContentView()
                int r6 = r6.getMeasuredWidth()
                int r6 = r6 / 2
                float r6 = (float) r6
                float r1 = r1 - r6
                int r6 = (int) r1
                int r1 = r0.getHeight()
                nj3.s0 r2 = r0.f160811q
                gy3.C87412m.m108591d(r2)
                android.view.View r2 = r2.getContentView()
                int r2 = r2.getMeasuredHeight()
                int r1 = r1 + r2
                float r1 = (float) r1
                android.content.Context r2 = r0.getContext()
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131165346(0x7f0700a2, float:1.7944907E38)
                float r2 = r2.getDimension(r3)
                float r1 = r1 + r2
                float r1 = -r1
                int r1 = (int) r1
                nj3.s0 r2 = r0.f160811q
                if (r2 == 0) goto L_0x00bd
                r2.showAsDropDown(r0, r6, r1)
            L_0x00bd:
                rx3.b0 r6 = rx3.C13598b0.f38549a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: zo1.C66939o0.C66941b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: zo1.o0$c */
    public static final class C66942c extends C87413o implements C32226l<FinderLiveReplaySeekbar.C56261a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66939o0 f192330d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66942c(C66939o0 o0Var) {
            super(1);
            this.f192330d = o0Var;
        }

        public Object invoke(Object obj) {
            C66925j0 j0Var;
            FinderLiveReplaySeekbar.C56261a aVar = (FinderLiveReplaySeekbar.C56261a) obj;
            if (!(aVar == null || (j0Var = (C66925j0) this.f192330d.mo87687E0(C66925j0.class)) == null)) {
                j0Var.mo90917c1((double) aVar.f160818b.f185060d, false);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66939o0(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f192321p = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.ip9);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.replay_seek_bar)");
        FinderLiveReplaySeekbar finderLiveReplaySeekbar = (FinderLiveReplaySeekbar) findViewById;
        this.f192323r = finderLiveReplaySeekbar;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.ip_);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.replay_seek_bar_action_btn)");
        this.f192324s = (WeImageView) findViewById2;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.ipa);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.replay_seek_bar_cur_time)");
        this.f192325t = (TextView) findViewById3;
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.ipb);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.replay_seek_bar_sum_time)");
        this.f192326u = (TextView) findViewById4;
        if (Build.VERSION.SDK_INT >= 29) {
            finderLiveReplaySeekbar.setMaxHeight(mo82893g0() ? MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3703bv) : MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.a66));
        }
    }

    /* renamed from: Z0 */
    public final void mo90924Z0(float f) {
        float i3 = (float) ((C54519d) mo87696x0(C54519d.class)).mo75375i3();
        int a = (int) C16095a.m14979a(f * i3, 0.0f, i3 - 1.0f);
        this.f192325t.setText(a >= 3600 ? C15936n0.C15937a.m14866a(C15936n0.f42815a, a, XVFSFile.PATH_SEPARATOR, true, false, false, 24, (Object) null) : C15936n0.C15937a.m14866a(C15936n0.f42815a, a, XVFSFile.PATH_SEPARATOR, false, false, false, 24, (Object) null));
    }

    /* renamed from: a1 */
    public final void mo90925a1() {
        WeImageView weImageView = this.f192324s;
        Drawable drawable = this.f166287d.getContext().getDrawable(C0966R.raw.icons_filled_play);
        C74933u4.m89769f(drawable, -1);
        weImageView.setImageDrawable(drawable);
        mo90927c1();
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: b1 */
    public final void mo90926b1() {
        WeImageView weImageView = this.f192324s;
        Drawable drawable = this.f166287d.getContext().getDrawable(C0966R.raw.icons_filled_pause);
        C74933u4.m89769f(drawable, -1);
        weImageView.setImageDrawable(drawable);
    }

    /* renamed from: c1 */
    public final void mo90927c1() {
        if (!((C54519d) mo87696x0(C54519d.class)).f152842D) {
            mo10792g(0);
        }
    }

    /* renamed from: d1 */
    public final void mo90928d1(int i) {
        Class cls = C54519d.class;
        if (((C54519d) mo87696x0(cls)).mo75375i3() > 0) {
            mo90927c1();
            this.f192323r.setProgress((int) ((((float) i) / ((float) ((C54519d) mo87696x0(cls)).mo75375i3())) * ((float) this.f192323r.getMax())));
            C65799i0 i0Var = C65799i0.f189246a;
            this.f192325t.setText(i0Var.mo89847b(i));
            C54519d dVar = (C54519d) mo87696x0(cls);
            int i2 = dVar.f152857t;
            if (i2 <= 0) {
                i2 = dVar.f152855r;
            }
            this.f192326u.setText(i0Var.mo89847b(i2));
        }
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return false;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        FinderLiveReplaySeekbar finderLiveReplaySeekbar = this.f192323r;
        C66940a aVar = new C66940a(this);
        finderLiveReplaySeekbar.getClass();
        ((ArrayList) finderLiveReplaySeekbar.f160810p).add(aVar);
        C64338e71 e712 = ((C55001u) mo87696x0(C55001u.class)).f154420q.f182388Z;
        List<C64662qp2> list = e712 != null ? e712.f182935n : null;
        if (list == null) {
            list = C64186f0.f181907d;
        }
        for (C64662qp2 qp22 : list) {
            String jSONObject = C0047e0.m34b(C0047e0.f58a, (JSONObject) null, 1, (Object) null).toString();
            C87412m.m108593f(jSONObject, "LiveChargeAndReplayRepor…CommonParams().toString()");
            ((C8777j5) C86312j.m106911c(C8777j5.class)).hg0("watch_live_point_exp", jSONObject);
        }
        this.f192324s.setOnClickListener(this);
        FinderLiveReplaySeekbar finderLiveReplaySeekbar2 = this.f192323r;
        Context context = this.f166287d.getContext();
        C87412m.m108593f(context, "root.context");
        finderLiveReplaySeekbar2.setFragmentPreview(new C57939g(context));
        this.f192323r.setFragmentItems(list);
        this.f192323r.setBreakpointClickCallback(new C66941b(this));
        this.f192323r.setBreakPointDoubleClickCallback(new C66942c(this));
        C62042e.f176370a.getClass();
        this.f177935f.post(new C11428d(this, true, true));
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    public void onClick(View view) {
        C66925j0 j0Var;
        C57959q uiClickListener;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/replay/plugin/ReplayerSeekbarPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (!(valueOf == null || valueOf.intValue() != C0966R.C0970id.ip_ || (j0Var = (C66925j0) mo87687E0(C66925j0.class)) == null)) {
            C56032b z0 = mo14484z0();
            FinderLiveReplayPluginLayout finderLiveReplayPluginLayout = z0 instanceof FinderLiveReplayPluginLayout ? (FinderLiveReplayPluginLayout) z0 : null;
            if (!(finderLiveReplayPluginLayout == null || (uiClickListener = finderLiveReplayPluginLayout.getUiClickListener()) == null)) {
                uiClickListener.mo82765a(!j0Var.mo90915a1());
            }
            if (j0Var.mo90915a1()) {
                WeImageView weImageView = this.f192324s;
                Drawable drawable = this.f166287d.getContext().getDrawable(C0966R.raw.icons_filled_play);
                C74933u4.m89769f(drawable, -1);
                weImageView.setImageDrawable(drawable);
                C57952m mVar = j0Var.f192301r;
                if (mVar != null) {
                    mVar.mo82758d();
                }
            } else {
                WeImageView weImageView2 = this.f192324s;
                Drawable drawable2 = this.f166287d.getContext().getDrawable(C0966R.raw.icons_filled_pause);
                C74933u4.m89769f(drawable2, -1);
                weImageView2.setImageDrawable(drawable2);
                j0Var.mo90916b1((Integer) null, false);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayerSeekbarPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        ((ArrayList) this.f192323r.f160810p).clear();
    }
}
