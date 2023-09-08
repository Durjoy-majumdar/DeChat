package com.tencent.p014mm.plugin.voip.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.LogoutEvent;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.plugin.voip.p475ui.C106448g;
import com.tencent.p014mm.plugin.voip.p475ui.C71599n0;
import com.tencent.p014mm.plugin.voip.video.render.VoIPRenderTextureView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import l33.C109247e;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.voip.widget.NewVideoTalkingSmallView */
public class NewVideoTalkingSmallView extends BaseSmallView {

    /* renamed from: A */
    public boolean f318167A = false;

    /* renamed from: B */
    public Bitmap f318168B;

    /* renamed from: C */
    public Bitmap f318169C;

    /* renamed from: D */
    public Bitmap f318170D;

    /* renamed from: E */
    public Bitmap f318171E;

    /* renamed from: F */
    public Runnable f318172F = new NewVideoTalkingSmallView$$c(this);

    /* renamed from: G */
    public IListener f318173G = new IListener<LogoutEvent>(C40008f.f107254d) {
        {
            this.__eventId = 276997888;
        }

        public boolean callback(IEvent iEvent) {
            if (((LogoutEvent) iEvent) instanceof LogoutEvent) {
                Log.m105925i("MicroMsg.Voip.NewVideoTalkingSmallView", "summerkick LogoutEvent thread name[%s]", Thread.currentThread().getName());
                MMHandlerThread.postToMainThread(new C106508a(this));
            }
            return false;
        }
    };

    /* renamed from: H */
    public final C0120a0<Integer> f318174H;

    /* renamed from: I */
    public final C0120a0<Boolean> f318175I;

    /* renamed from: J */
    public boolean f318176J;

    /* renamed from: h */
    public float f318177h = ((float) C76577a.m92151b(MMApplicationContext.getContext(), 4));

    /* renamed from: i */
    public VoIPRenderTextureView f318178i;

    /* renamed from: j */
    public VoIPRenderTextureView f318179j;

    /* renamed from: n */
    public MMRoundCornerImageView f318180n;

    /* renamed from: o */
    public MMRoundCornerImageView f318181o;

    /* renamed from: p */
    public View f318182p;

    /* renamed from: q */
    public MMRoundCornerImageView f318183q;

    /* renamed from: r */
    public boolean f318184r;

    /* renamed from: s */
    public int f318185s = -1;

    /* renamed from: t */
    public MMHandler f318186t = new MMHandler(Looper.getMainLooper());

    /* renamed from: u */
    public TextView f318187u;

    /* renamed from: v */
    public RelativeLayout f318188v;

    /* renamed from: w */
    public ImageView f318189w;

    /* renamed from: x */
    public TextView f318190x;

    /* renamed from: y */
    public boolean f318191y = false;

    /* renamed from: z */
    public boolean f318192z = false;

    public NewVideoTalkingSmallView(Context context) {
        super(context, (AttributeSet) null);
        NewVideoTalkingSmallView$$d newVideoTalkingSmallView$$d = new NewVideoTalkingSmallView$$d(this);
        this.f318174H = newVideoTalkingSmallView$$d;
        NewVideoTalkingSmallView$$e newVideoTalkingSmallView$$e = new NewVideoTalkingSmallView$$e(this);
        this.f318175I = newVideoTalkingSmallView$$e;
        this.f318176J = false;
        LayoutInflater.from(context).inflate(C0966R.C0971layout.cd9, this);
        this.f318187u = (TextView) findViewById(C0966R.C0970id.kms);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C0966R.C0970id.lcz);
        this.f318188v = relativeLayout;
        relativeLayout.setVisibility(4);
        this.f318189w = (ImageView) findViewById(C0966R.C0970id.lcx);
        this.f318190x = (TextView) findViewById(C0966R.C0970id.lcy);
        this.f318178i = (VoIPRenderTextureView) findViewById(C0966R.C0970id.hlk);
        this.f318187u = (TextView) findViewById(C0966R.C0970id.kms);
        VoIPRenderTextureView voIPRenderTextureView = (VoIPRenderTextureView) findViewById(C0966R.C0970id.hlj);
        this.f318179j = voIPRenderTextureView;
        voIPRenderTextureView.setClipToOutline(true);
        this.f318179j.setOutlineProvider(new C71599n0(this.f318177h));
        this.f318180n = (MMRoundCornerImageView) findViewById(C0966R.C0970id.f358621na1);
        this.f318181o = (MMRoundCornerImageView) findViewById(C0966R.C0970id.nc4);
        this.f318182p = findViewById(C0966R.C0970id.f359076nc3);
        this.f318183q = (MMRoundCornerImageView) findViewById(C0966R.C0970id.nc5);
        this.f318184r = false;
        this.f318173G.alive();
        if (!(C109247e.xx0() == null || C109247e.xx0().f317333b == null)) {
            ((C119157j) C119157j.f356862d).mo183884o(new NewVideoTalkingSmallView$$a(this));
            boolean z = C109247e.vx0().f333451k;
            if (this.f318185s == -1 || z != this.f318192z) {
                this.f318192z = z;
                Log.m105924i("MicroMsg.Voip.NewVideoTalkingSmallView", "showLocalCaptureState: " + z);
                mo153139o();
            }
            mo153122j(C109247e.xx0().mo152622u());
        }
        C109247e.vx0().f333442b.observeForever(newVideoTalkingSmallView$$d);
        C109247e.vx0().f333447g.observeForever(newVideoTalkingSmallView$$e);
    }

    /* renamed from: c */
    public void mo153021c(boolean z) {
        if (z) {
            this.f318187u.setVisibility(0);
            this.f318187u.setText(C0966R.string.khu);
            setContentDescription(getResources().getString(C0966R.string.juy));
            return;
        }
        super.mo153021c(false);
    }

    /* renamed from: d */
    public boolean mo153022d() {
        super.mo153022d();
        this.f318187u.setVisibility(8);
        this.f318188v.setVisibility(0);
        this.f318189w.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_call_end, Color.parseColor("#FFFFFF")));
        this.f318190x.setVisibility(0);
        this.f318190x.setText(C0966R.string.khf);
        this.f318190x.requestLayout();
        setContentDescription("");
        return true;
    }

    /* renamed from: e */
    public void mo153119e(int i) {
        C109247e.vx0().f333448h = i;
        mo153142p();
    }

    /* renamed from: f */
    public void mo153120f() {
    }

    /* renamed from: g */
    public void mo153023g() {
        this.f318187u.setVisibility(8);
        this.f318188v.setVisibility(8);
    }

    /* renamed from: h */
    public void mo153026h() {
        this.f318187u.setVisibility(8);
        this.f318188v.setVisibility(0);
        this.f318189w.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icon_filled_mike_off, Color.parseColor("#FFFFFF")));
        this.f318190x.setText(C0966R.string.kix);
        this.f318190x.requestLayout();
        super.mo153026h();
    }

    /* renamed from: i */
    public void mo153121i(int i, int i2) {
        int i3 = this.f318185s;
        if (i3 == 2 || i3 == 0 || i3 == 256 || this.f318191y) {
            this.f318179j.mo153116a(false);
        } else {
            this.f318184r = true;
            mo153138n();
            Log.m105924i("MicroMsg.Voip.NewVideoTalkingSmallView", "onRemoteReady");
            mo153139o();
            mo153142p();
            this.f318179j.mo153117c();
            this.f318178i.mo153116a(false);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
        setLayoutParams(layoutParams);
    }

    /* renamed from: j */
    public void mo153122j(boolean z) {
        if (this.f318185s == -1 || z != this.f318167A) {
            this.f318167A = z;
            Log.m105924i("MicroMsg.Voip.NewVideoTalkingSmallView", "showRemoteCaptureState: " + z);
            mo153139o();
        }
    }

    /* renamed from: k */
    public void mo153123k() {
        this.f318161f.get().mo152467f(this.f318179j);
        this.f318161f.get().mo152467f(this.f318178i);
        this.f318159d = null;
        this.f318173G.dead();
        setVisibility(4);
        C109247e.vx0().f333442b.removeObserver(this.f318174H);
        C109247e.vx0().f333447g.removeObserver(this.f318175I);
    }

    /* renamed from: l */
    public void mo153027l(String str) {
        this.f318187u.setTextSize(1, 12.0f);
        this.f318187u.setText(str);
        setContentDescription(getResources().getString(C0966R.string.f361431jv0));
    }

    /* renamed from: m */
    public void mo153028m(String str) {
        setContentDescription(getResources().getString(C0966R.string.juz));
    }

    /* renamed from: n */
    public final void mo153138n() {
        Log.m105924i("MicroMsg.Voip.NewVideoTalkingSmallView", "refreshAvatar: " + this.f318184r);
        this.f318180n.setImageBitmap(this.f318168B);
        this.f318183q.setImageBitmap(this.f318184r ? this.f318169C : this.f318168B);
        this.f318181o.setImageBitmap(this.f318184r ? this.f318171E : this.f318170D);
    }

    /* renamed from: o */
    public final void mo153139o() {
        Log.m105924i("MicroMsg.Voip.NewVideoTalkingSmallView", "refreshCoverAndCaptureStatus, mIsRemoteReady:" + this.f318184r + ", isLocalPause:" + this.f318192z + ", isRemotePause::" + this.f318167A);
        int i = 0;
        int i2 = 8;
        if (this.f318184r) {
            this.f318180n.setVisibility(this.f318192z ? 0 : 8);
            this.f318179j.setVisibility(this.f318192z ? 8 : 0);
            this.f318183q.setVisibility(this.f318167A ? 0 : 8);
            View view = this.f318182p;
            int i3 = this.f318167A ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i3));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/voip/widget/NewVideoTalkingSmallView", "refreshCoverAndCaptureStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/voip/widget/NewVideoTalkingSmallView", "refreshCoverAndCaptureStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            VoIPRenderTextureView voIPRenderTextureView = this.f318178i;
            if (this.f318167A) {
                i = 8;
            }
            voIPRenderTextureView.setVisibility(i);
            return;
        }
        this.f318180n.setVisibility(8);
        this.f318178i.setVisibility(8);
        this.f318179j.setVisibility(this.f318192z ? 8 : 0);
        this.f318183q.setVisibility(!this.f318192z ? 8 : 0);
        View view3 = this.f318182p;
        if (this.f318192z) {
            i2 = 0;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(Integer.valueOf(i2));
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/voip/widget/NewVideoTalkingSmallView", "refreshCoverAndCaptureStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/voip/widget/NewVideoTalkingSmallView", "refreshCoverAndCaptureStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo153142p();
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.f318161f != null) {
            Log.m105924i("MicroMsg.Voip.NewVideoTalkingSmallView", "view added");
            this.f318161f.get().mo152417A(this.f318179j, 0);
            C106448g gVar = this.f318161f.get();
            int i = this.f318185s;
            gVar.mo152473j(false, (260 == i || 6 == i) ? false : true);
            this.f318161f.get().mo152417A(this.f318178i, 1);
            this.f318178i.getClass();
            this.f318179j.getClass();
            return;
        }
        this.f318176J = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r6 != 3) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        if ((r7 % 2) != 0) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0070, code lost:
        if (((((!(z33.C112595h.f337172g && z33.C112595h.f337173h) || !l33.C109247e.vx0().f333446f) ? r5 + r7 : 0) + r0) % 2) == 0) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0055  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo153142p() {
        /*
            r9 = this;
            boolean r0 = z33.C112595h.f337172g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000c
            boolean r0 = z33.C112595h.f337174i
            if (r0 == 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            r3 = 4
            java.lang.String r4 = "MicroMsg.Voip.NewVideoTalkingSmallView"
            if (r0 == 0) goto L_0x00b8
            int r0 = r9.getVisibility()
            if (r0 == 0) goto L_0x001a
            goto L_0x00b8
        L_0x001a:
            v33.b r0 = l33.C109247e.vx0()
            boolean r5 = r0.mo163050d()
            if (r5 == 0) goto L_0x002b
            boolean r5 = z33.C112595h.f337172g
            if (r5 == 0) goto L_0x002b
            int r0 = r0.f333448h
            goto L_0x002c
        L_0x002b:
            r0 = 1
        L_0x002c:
            v33.b r5 = l33.C109247e.vx0()
            int r5 = r5.f333441a
            int r5 = r5 / 90
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r6 = com.tencent.p014mm.p136ui.C75044y4.m89998j(r6)
            r7 = 3
            r8 = 2
            if (r6 == 0) goto L_0x004b
            if (r6 == r1) goto L_0x0049
            if (r6 == r8) goto L_0x0047
            if (r6 == r7) goto L_0x004c
            goto L_0x004b
        L_0x0047:
            r7 = 2
            goto L_0x004c
        L_0x0049:
            r7 = 1
            goto L_0x004c
        L_0x004b:
            r7 = 0
        L_0x004c:
            boolean r6 = r9.f318184r
            if (r6 != 0) goto L_0x0055
            int r6 = r7 % 2
            if (r6 == 0) goto L_0x0073
            goto L_0x0074
        L_0x0055:
            boolean r6 = z33.C112595h.f337172g
            if (r6 == 0) goto L_0x005f
            boolean r6 = z33.C112595h.f337173h
            if (r6 == 0) goto L_0x005f
            r6 = 1
            goto L_0x0060
        L_0x005f:
            r6 = 0
        L_0x0060:
            if (r6 == 0) goto L_0x006c
            v33.b r6 = l33.C109247e.vx0()
            boolean r6 = r6.f333446f
            if (r6 == 0) goto L_0x006c
            r6 = 0
            goto L_0x006e
        L_0x006c:
            int r6 = r5 + r7
        L_0x006e:
            int r6 = r6 + r0
            int r6 = r6 % r8
            if (r6 != 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r1 = 0
        L_0x0074:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "refreshFloatBallSize:"
            r6.append(r8)
            int r8 = r9.f318185s
            r6.append(r8)
            java.lang.String r8 = ", "
            r6.append(r8)
            r6.append(r0)
            r6.append(r8)
            r6.append(r5)
            r6.append(r8)
            r6.append(r7)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            o33.a r0 = o33.C109935a.C109937b.f328933a
            r0.mo161256y0(r3, r2, r1)
            o33.a r0 = o33.C109935a.C109937b.f328933a
            r0.mo68414O()
            com.tencent.mm.ui.widget.MMRoundCornerImageView r0 = r9.f318180n
            int r5 = r5 + r7
            int r1 = -r5
            int r1 = r1 * 90
            float r1 = (float) r1
            r0.setRotation(r1)
            com.tencent.mm.ui.widget.MMRoundCornerImageView r0 = r9.f318183q
            r0.setRotation(r1)
            return
        L_0x00b8:
            java.lang.String r0 = "refreshFloatBallSize, skip check float ball size"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            o33.a r0 = o33.C109935a.C109937b.f328933a
            int r1 = r9.getVisibility()
            if (r1 != 0) goto L_0x00c6
            goto L_0x00c8
        L_0x00c6:
            r3 = 8
        L_0x00c8:
            r0.mo161256y0(r3, r2, r2)
            o33.a r0 = o33.C109935a.C109937b.f328933a
            r0.mo68414O()
            com.tencent.mm.ui.widget.MMRoundCornerImageView r0 = r9.f318180n
            r1 = 0
            r0.setRotation(r1)
            com.tencent.mm.ui.widget.MMRoundCornerImageView r0 = r9.f318183q
            r0.setRotation(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.widget.NewVideoTalkingSmallView.mo153142p():void");
    }

    public void setConnectSec(long j) {
        super.setConnectSec(j);
        if (j != -1) {
            this.f318186t.post(this.f318172F);
        }
    }

    public void setStatus(int i) {
        this.f318185s = i;
        if (i == 2 || i == 256 || i == 0) {
            this.f318191y = true;
            this.f318178i.mo153116a(true);
            this.f318179j.setVisibility(0);
            this.f318179j.mo153116a(false);
            this.f318187u.setVisibility(0);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo153142p();
    }

    public void setVoicePlayDevice(int i) {
        if (this.f318160e != i) {
            this.f318187u.setVisibility(8);
            this.f318160e = i;
            this.f318188v.setVisibility(0);
            if (i == 1) {
                this.f318189w.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_volume_up, Color.parseColor("#FFFFFF")));
                this.f318190x.setText(C0966R.string.khe);
            } else if (i == 2) {
                this.f318189w.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_ear, Color.parseColor("#FFFFFF")));
                this.f318190x.setText(C0966R.string.khc);
            } else if (i == 3) {
                this.f318189w.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_headset, Color.parseColor("#FFFFFF")));
                this.f318190x.setText(C0966R.string.khd);
            } else if (i == 4) {
                this.f318189w.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_bluetooth, Color.parseColor("#FFFFFF")));
                this.f318190x.setText(C0966R.string.khb);
            }
            this.f318187u.setVisibility(8);
            this.f318190x.requestLayout();
            super.setVoicePlayDevice(i);
        }
    }

    public void setVoipUIListener(C106448g gVar) {
        super.setVoipUIListener(gVar);
        if (this.f318176J) {
            this.f318161f.get().mo152417A(this.f318179j, 0);
            C106448g gVar2 = this.f318161f.get();
            int i = this.f318185s;
            gVar2.mo152473j(false, (260 == i || 6 == i) ? false : true);
            this.f318161f.get().mo152417A(this.f318178i, 1);
            this.f318176J = false;
            this.f318178i.getClass();
            this.f318179j.getClass();
        }
    }
}
