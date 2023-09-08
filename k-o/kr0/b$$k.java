package kr0;

import android.content.Context;
import android.widget.FrameLayout;
import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83188y;
import com.tencent.p014mm.plugin.appbrand.page.C83882p4;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import nj0.C88961a;
import nj0.C88965e;
import nj0.C88966f;
import nj0.C88967g;
import nj0.C88974m;
import nj0.C88976p;
import nj0.C88980t;
import nj0.C88981u;
import nj0.C88984x;
import ny3.C89104m;
import p1017od.C89166m;
import p1017od.C89167n;
import p1059wd.C90954a;
import p748xd.C78798e;
import p760ya.C91384c;

public class b$$k extends C91384c {

    /* renamed from: f */
    public final /* synthetic */ C88256b f255088f;

    /* renamed from: kr0.b$$k$a */
    public class C88257a implements C80301a.C80305d {

        /* renamed from: a */
        public FrameLayout f255089a = null;

        /* renamed from: b */
        public C78798e f255090b = new C78798e();

        /* renamed from: kr0.b$$k$a$a */
        public class C88258a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MagicBrushView f255092d;

            /* renamed from: e */
            public final /* synthetic */ int f255093e;

            /* renamed from: f */
            public final /* synthetic */ int f255094f;

            /* renamed from: g */
            public final /* synthetic */ int f255095g;

            /* renamed from: h */
            public final /* synthetic */ int f255096h;

            /* renamed from: i */
            public final /* synthetic */ int f255097i;

            public C88258a(MagicBrushView magicBrushView, int i, int i2, int i3, int i4, int i5) {
                this.f255092d = magicBrushView;
                this.f255093e = i;
                this.f255094f = i2;
                this.f255095g = i3;
                this.f255096h = i4;
                this.f255097i = i5;
            }

            public void run() {
                C88257a aVar = C88257a.this;
                if (aVar.f255089a == null) {
                    aVar.f255089a = new FrameLayout(((C88267e) b$$k.this.f255088f.mo124764Z()).getContext());
                    C83882p4.m103245a(((C88267e) b$$k.this.f255088f.mo124764Z()).mo114341l0().f244556H, C88257a.this.f255089a);
                }
                C88257a aVar2 = C88257a.this;
                int a = aVar2.f255090b.mo108711a(aVar2.f255089a, this.f255092d, this.f255093e);
                this.f255092d.setOpaque(false);
                int i = this.f255094f;
                int i2 = this.f255095g;
                int i3 = (int) ((C88267e) b$$k.this.f255088f.mo124764Z()).getContext().getResources().getDisplayMetrics().density;
                if (i <= 0) {
                    i = i3 * 100;
                }
                if (i2 <= 0) {
                    i2 = i3 * 100;
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
                layoutParams.setMargins(this.f255096h, this.f255097i, 0, 0);
                C88257a.this.f255089a.addView(this.f255092d, a, layoutParams);
                this.f255092d.setOpaque(false);
            }
        }

        /* renamed from: kr0.b$$k$a$b */
        public class C88259b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f255099d;

            /* renamed from: e */
            public final /* synthetic */ int f255100e;

            /* renamed from: f */
            public final /* synthetic */ int f255101f;

            /* renamed from: g */
            public final /* synthetic */ int f255102g;

            /* renamed from: h */
            public final /* synthetic */ MagicBrushView f255103h;

            /* renamed from: i */
            public final /* synthetic */ int f255104i;

            public C88259b(int i, int i2, int i3, int i4, MagicBrushView magicBrushView, int i5) {
                this.f255099d = i;
                this.f255100e = i2;
                this.f255101f = i3;
                this.f255102g = i4;
                this.f255103h = magicBrushView;
                this.f255104i = i5;
            }

            public void run() {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f255099d, this.f255100e);
                layoutParams.setMargins(this.f255101f, this.f255102g, 0, 0);
                C88257a aVar = C88257a.this;
                int a = aVar.f255090b.mo108711a(aVar.f255089a, this.f255103h, this.f255104i);
                if (a == -2) {
                    this.f255103h.setLayoutParams(layoutParams);
                    this.f255103h.requestLayout();
                } else {
                    C88257a.this.f255089a.removeView(this.f255103h);
                    C88257a.this.f255089a.addView(this.f255103h, a, layoutParams);
                }
                this.f255103h.setOpaque(false);
            }
        }

        /* renamed from: kr0.b$$k$a$c */
        public class C88260c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MagicBrushView f255106d;

            public C88260c(MagicBrushView magicBrushView) {
                this.f255106d = magicBrushView;
            }

            public void run() {
                C78798e eVar = C88257a.this.f255090b;
                MagicBrushView magicBrushView = this.f255106d;
                eVar.getClass();
                C87412m.m108594g(magicBrushView, "view");
                eVar.f230555a.remove(magicBrushView);
                C88257a.this.f255089a.removeView(this.f255106d);
            }
        }

        public C88257a() {
        }

        /* renamed from: M */
        public void mo111584M(MagicBrushView magicBrushView, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        }

        /* renamed from: P */
        public void mo111585P(MagicBrushView magicBrushView, int i, int i2, int i3, int i4, int i5) {
            if (b$$k.this.f255088f.mo125523j0() != null) {
                b$$k.this.f255088f.mo125523j0().mo113024P0(new C88258a(magicBrushView, i5, i3, i4, i, i2));
            }
        }

        /* renamed from: W */
        public void mo111586W(MagicBrushView magicBrushView, int i, int i2, int i3, int i4, int i5) {
            if (b$$k.this.f255088f.mo125523j0() != null) {
                b$$k.this.f255088f.mo125523j0().mo113024P0(new C88259b(i3, i4, i, i2, magicBrushView, i5));
            }
        }

        /* renamed from: c0 */
        public void mo111587c0(MagicBrushView magicBrushView) {
            if (b$$k.this.f255088f.mo125523j0() != null) {
                b$$k.this.f255088f.mo125523j0().mo113024P0(new C88260c(magicBrushView));
            }
        }

        /* renamed from: q */
        public MagicBrushView mo111588q() {
            MagicBrushView magicBrushView = new MagicBrushView(((C88267e) b$$k.this.f255088f.mo124764Z()).getContext(), MagicBrushView.C80327h.TextureView);
            C80301a aVar = b$$k.this.f262085c;
            C87412m.m108591d(aVar);
            magicBrushView.setMagicBrush(aVar);
            magicBrushView.setUseRawAxisTouchEvent(true);
            return magicBrushView;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b$$k(C88256b bVar, Context context, C83165i iVar) {
        super(context, iVar);
        this.f255088f = bVar;
    }

    /* renamed from: c */
    public void mo120929c(C89166m mVar) {
        super.mo120929c(mVar);
        float i = C88966f.f256550c.mo123350i(((C88267e) this.f255088f.mo124764Z()).getContext());
        C89167n.C89168a aVar = mVar.f256984q;
        C89104m<Object>[] mVarArr = C89167n.f256956L;
        aVar.mo125228b(mVar, mVarArr[10], Float.valueOf(i));
        mVar.f256985r.mo125228b(mVar, mVarArr[12], Boolean.FALSE);
        mVar.mo123522j(((Boolean) C88976p.f256568c.mo123353e()).booleanValue());
        if ((this.f262084b instanceof C83188y) && ((Boolean) C88984x.f256576c.mo123353e()).booleanValue()) {
            mVar.mo123517e(C90954a.C90956b.NativeLocker);
        }
        mVar.f256978k = new C88257a();
        boolean booleanValue = ((Boolean) C88967g.f256557c.mo123353e()).booleanValue();
        boolean booleanValue2 = ((Boolean) C88980t.f256572c.mo123353e()).booleanValue();
        boolean booleanValue3 = ((Boolean) C88981u.f256573c.mo123353e()).booleanValue();
        Object[] objArr = new Object[3];
        String str = "yes";
        objArr[0] = booleanValue ? str : "no";
        objArr[1] = booleanValue2 ? str : "no";
        if (!booleanValue3) {
            str = "no";
        }
        objArr[2] = str;
        Log.m105925i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "[hilive] supportHardCodec: %s useHardDecode: %s useHardEncode: %s", objArr);
        mVar.f256962F.mo125228b(mVar, mVarArr[25], Boolean.valueOf(booleanValue && booleanValue2));
        mVar.f256961E.mo125228b(mVar, mVarArr[24], Boolean.valueOf(booleanValue && booleanValue3));
        mVar.f256964H.mo125228b(mVar, mVarArr[27], Boolean.valueOf(((Boolean) C88965e.f256549c.mo123353e()).booleanValue()));
        mVar.mo123518f(this.f255088f.mo125522h0().f262484a.getNativeHandle());
        boolean booleanValue4 = ((Boolean) C88974m.f256566c.mo123353e()).booleanValue();
        mVar.f256963G.mo125228b(mVar, mVarArr[26], Boolean.valueOf(booleanValue4));
        mVar.f256959C.mo125228b(mVar, mVarArr[22], Boolean.TRUE);
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_magicbrush_force_close_cmdbuffer, 0) > 0) {
            mVar.mo123520h(false);
        }
        mVar.f256982o.mo125228b(mVar, mVarArr[8], Boolean.valueOf(((Integer) C88961a.f256545c.mo123353e()).intValue() != 0));
        Log.m105925i("MicroMsg.AppBrandMiniProgramServiceLogicImpWC", "dl: supportETC2ASTC[%b]", Boolean.valueOf(booleanValue4));
    }

    /* renamed from: d */
    public void mo122637d(C80301a aVar, long j) {
        C84185b.f245912a.mo116890i(((C88267e) this.f255088f.mo124764Z()).mo114335b0(), ((C88267e) this.f255088f.mo124764Z()).getAppId(), j);
    }
}
