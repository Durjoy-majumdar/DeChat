package com.tencent.p014mm.plugin.voip.p475ui;

import a43.C0012b;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.PowerManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.model.C106348g0;
import com.tencent.p014mm.plugin.voip.video.NewMovableVideoView;
import com.tencent.p014mm.plugin.voip.video.render.VoIPRenderTextureView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import l33.C109247e;
import nj3.C76879j;
import nj3.C76912y0;
import p196ln.C76708i;
import p910lj.C76701a;
import rx3.C13598b0;
import sf0.C90188n0;
import y33.C112390a;
import z33.C112593f;

/* renamed from: com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment */
public class NewVoipVideoFragment extends VoipBaseFragment {

    /* renamed from: t1 */
    public static final /* synthetic */ int f317805t1 = 0;

    /* renamed from: K */
    public VoIPRenderTextureView f317806K;

    /* renamed from: L */
    public NewMovableVideoView f317807L;

    /* renamed from: M */
    public RelativeLayout f317808M;

    /* renamed from: N */
    public ImageView f317809N;

    /* renamed from: P */
    public TextView f317810P;

    /* renamed from: Q */
    public TextView f317811Q;

    /* renamed from: Q0 */
    public Button f317812Q0 = null;

    /* renamed from: R */
    public TextView f317813R;

    /* renamed from: R0 */
    public boolean f317814R0 = false;

    /* renamed from: S */
    public TextView f317815S;

    /* renamed from: S0 */
    public int f317816S0;

    /* renamed from: T */
    public TextView f317817T;

    /* renamed from: T0 */
    public int f317818T0;

    /* renamed from: U */
    public TextView f317819U;

    /* renamed from: U0 */
    public int f317820U0;

    /* renamed from: V */
    public TextView f317821V;

    /* renamed from: V0 */
    public boolean f317822V0;

    /* renamed from: W */
    public TextView f317823W;

    /* renamed from: W0 */
    public boolean f317824W0;

    /* renamed from: X */
    public TextView f317825X;

    /* renamed from: X0 */
    public boolean f317826X0;

    /* renamed from: Y */
    public TextView f317827Y;

    /* renamed from: Y0 */
    public boolean f317828Y0;

    /* renamed from: Z */
    public TextView f317829Z;

    /* renamed from: Z0 */
    public String f317830Z0;

    /* renamed from: a1 */
    public int f317831a1;

    /* renamed from: b1 */
    public boolean f317832b1;

    /* renamed from: c1 */
    public boolean f317833c1;

    /* renamed from: d1 */
    public MTimerHandler f317834d1;

    /* renamed from: e1 */
    public long f317835e1;

    /* renamed from: f1 */
    public int f317836f1;

    /* renamed from: g1 */
    public int f317837g1;

    /* renamed from: h1 */
    public int f317838h1;

    /* renamed from: i1 */
    public int f317839i1;

    /* renamed from: j1 */
    public MTimerHandler f317840j1;

    /* renamed from: k1 */
    public boolean f317841k1;

    /* renamed from: l1 */
    public PowerManager.WakeLock f317842l1;

    /* renamed from: m1 */
    public boolean f317843m1;

    /* renamed from: n1 */
    public boolean f317844n1;

    /* renamed from: o1 */
    public View.OnClickListener f317845o1;

    /* renamed from: p0 */
    public TextView f317846p0;

    /* renamed from: p1 */
    public View.OnClickListener f317847p1;

    /* renamed from: q1 */
    public final MTimerHandler.CallBack f317848q1;

    /* renamed from: r1 */
    public Runnable f317849r1;

    /* renamed from: s1 */
    public Runnable f317850s1;

    /* renamed from: x0 */
    public C0012b f317851x0 = null;

    /* renamed from: y0 */
    public Button f317852y0 = null;

    /* renamed from: com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment$e */
    public class C43277e implements View.OnClickListener {
        public C43277e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/ui/NewVoipVideoFragment$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            NewVoipVideoFragment newVoipVideoFragment = NewVoipVideoFragment.this;
            boolean z = !newVoipVideoFragment.f317814R0;
            newVoipVideoFragment.f317814R0 = z;
            if (!z) {
                newVoipVideoFragment.f317851x0.setVisibility(8);
            }
            C76701a.makeText((Context) NewVoipVideoFragment.this.getActivity(), (CharSequence) String.format("mIsShowFaceRect:%b", new Object[]{Boolean.valueOf(NewVoipVideoFragment.this.f317814R0)}), 0).show();
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/NewVoipVideoFragment$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment$f */
    public class C43278f implements View.OnClickListener {
        public C43278f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/ui/NewVoipVideoFragment$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            boolean nullAs = Util.nullAs((Boolean) view.getTag(), false);
            view.setTag(Boolean.valueOf(!nullAs));
            if (nullAs) {
                NewVoipVideoFragment.this.f317851x0.setVisibility(8);
                C76701a.makeText((Context) NewVoipVideoFragment.this.getActivity(), (CharSequence) "stop face detect", 0).show();
            } else {
                C76701a.makeText((Context) NewVoipVideoFragment.this.getActivity(), (CharSequence) "start face detect", 0).show();
            }
            WeakReference<C106448g> weakReference = NewVoipVideoFragment.this.f317931v;
            if (weakReference != null) {
                weakReference.get();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/NewVoipVideoFragment$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment$i */
    public class C43279i implements Runnable {
        public C43279i() {
        }

        public void run() {
            if (NewVoipVideoFragment.this.getActivity() != null && !NewVoipVideoFragment.this.getActivity().isFinishing()) {
                NewVoipVideoFragment.this.f317811Q.setVisibility(8);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment$a */
    public class C106405a implements DialogInterface.OnClickListener {
        public C106405a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C106348g0.m143246g();
            NewVoipVideoFragment newVoipVideoFragment = NewVoipVideoFragment.this;
            int i2 = NewVoipVideoFragment.f317805t1;
            newVoipVideoFragment.mo152893h0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment$b */
    public class C106406b implements DialogInterface.OnClickListener {
        public C106406b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            NewVoipVideoFragment.this.mo152896k0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment$c */
    public class C106407c implements DialogInterface.OnClickListener {
        public C106407c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!NetStatusUtil.is2G(NewVoipVideoFragment.this.getActivity())) {
                C106348g0.m143246g();
            }
            NewVoipVideoFragment newVoipVideoFragment = NewVoipVideoFragment.this;
            int i2 = NewVoipVideoFragment.f317805t1;
            newVoipVideoFragment.mo152891g0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment$d */
    public class C106408d implements DialogInterface.OnClickListener {
        public C106408d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            NewVoipVideoFragment.this.mo152896k0();
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment$g */
    public class C106409g implements MTimerHandler.CallBack {
        public C106409g() {
        }

        public boolean onTimerExpired() {
            TextView textView;
            NewVoipVideoFragment newVoipVideoFragment = NewVoipVideoFragment.this;
            NewVoipVideoFragment.this.f317810P.setText(newVoipVideoFragment.mo152972M(Util.secondsToNow(newVoipVideoFragment.f317922j)));
            NewVoipVideoFragment newVoipVideoFragment2 = NewVoipVideoFragment.this;
            newVoipVideoFragment2.f317810P.setContentDescription(newVoipVideoFragment2.mo152971K());
            NewVoipVideoFragment newVoipVideoFragment3 = NewVoipVideoFragment.this;
            newVoipVideoFragment3.getClass();
            if (C90188n0.m112865a()) {
                long nowSecond = Util.nowSecond();
                int i = (int) (nowSecond - newVoipVideoFragment3.f317835e1);
                if (i <= 1) {
                    i = 1;
                }
                Locale locale = Locale.US;
                String format = String.format(locale, "Capt: %d,CPU:%d,vP:%d", new Object[]{0, Integer.valueOf(newVoipVideoFragment3.f317839i1), Integer.valueOf(newVoipVideoFragment3.f317837g1)});
                String format2 = String.format(locale, "Send Fps: %d", new Object[]{0});
                String format3 = String.format(locale, "Recv Fps: %d", new Object[]{Integer.valueOf(newVoipVideoFragment3.f317816S0)});
                int i2 = C109247e.xx0().f317332a.f317396a.f317450A.f317711d.f317500x.field_sendVideoLen;
                int i3 = C109247e.xx0().f317332a.f317396a.f317450A.f317711d.f317500x.field_recvVideoLen;
                long j = nowSecond;
                double d = (double) (i * 1000);
                int i4 = (int) ((((double) (i2 - newVoipVideoFragment3.f317818T0)) * 8.0d) / d);
                newVoipVideoFragment3.f317818T0 = i4;
                newVoipVideoFragment3.f317820U0 = (int) ((((double) (i3 - newVoipVideoFragment3.f317820U0)) * 8.0d) / d);
                int i5 = newVoipVideoFragment3.f317836f1;
                int i6 = (i5 >> 8) != 0 ? 1 : 0;
                int i7 = (i5 & 255) != 0 ? 1 : 0;
                String format4 = String.format(locale, "Tx:%d, HWEnc:%d", new Object[]{Integer.valueOf(i4), Integer.valueOf(i6)});
                String format5 = String.format(locale, "Rx:%d, HWDec:%d", new Object[]{Integer.valueOf(newVoipVideoFragment3.f317820U0), Integer.valueOf(i7)});
                byte[] bArr = C109247e.xx0().f317332a.f317396a.f317500x.f317637g1;
                if (bArr != null) {
                    try {
                        newVoipVideoFragment3.f317825X.setText(new String(bArr, "UTF-8"));
                    } catch (UnsupportedEncodingException e) {
                        Log.printErrStackTrace("MicroMsg.Voip.VoipVideoFragment", e, "", new Object[0]);
                    }
                }
                if (newVoipVideoFragment3.f317824W0) {
                    if (newVoipVideoFragment3.f317822V0) {
                        newVoipVideoFragment3.f317827Y.setText("gpu crop");
                    } else {
                        newVoipVideoFragment3.f317827Y.setText("gpu rgb2yuv");
                    }
                }
                if (!newVoipVideoFragment3.f317826X0 || (textView = newVoipVideoFragment3.f317829Z) == null) {
                    TextView textView2 = newVoipVideoFragment3.f317829Z;
                    textView2.setText("prev CameraModular\nencodeSize" + C112593f.f337156a.mo164364b());
                } else if (newVoipVideoFragment3.f317828Y0) {
                    textView.setText("new CameraModular + Camera2\nencodeSize" + C112593f.f337156a.mo164364b());
                } else {
                    textView.setText("new CameraModular + Camera1\nencodeSize" + C112593f.f337156a.mo164364b());
                }
                newVoipVideoFragment3.f317846p0.setText(newVoipVideoFragment3.f317830Z0);
                newVoipVideoFragment3.f317815S.setText(format);
                newVoipVideoFragment3.f317817T.setText(format2);
                newVoipVideoFragment3.f317819U.setText(format3);
                newVoipVideoFragment3.f317823W.setText(format5);
                newVoipVideoFragment3.f317821V.setText(format4);
                newVoipVideoFragment3.f317818T0 = i2;
                newVoipVideoFragment3.f317820U0 = i3;
                newVoipVideoFragment3.f317835e1 = j;
            }
            newVoipVideoFragment3.f317816S0 = 0;
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment$h */
    public class C106410h implements Runnable {
        public C106410h() {
        }

        public void run() {
            View view;
            Log.m105924i("MicroMsg.Voip.VoipVideoFragment", "dismiss bar");
            NewVoipVideoFragment newVoipVideoFragment = NewVoipVideoFragment.this;
            newVoipVideoFragment.f317831a1--;
            if (newVoipVideoFragment.getActivity() != null && !NewVoipVideoFragment.this.getActivity().isFinishing()) {
                NewVoipVideoFragment newVoipVideoFragment2 = NewVoipVideoFragment.this;
                if (newVoipVideoFragment2.f317831a1 <= 0) {
                    newVoipVideoFragment2.f317810P.setVisibility(8);
                    C106444e0 e0Var = NewVoipVideoFragment.this.f317911B;
                    if (e0Var != null) {
                        e0Var.mo152998a();
                    }
                    C106476z zVar = NewVoipVideoFragment.this.f317913D;
                    if (!(zVar == null || (view = zVar.f318036f) == null)) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/voip/ui/VoIPBottomControlUI", "dismissUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/voip/ui/VoIPBottomControlUI", "dismissUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    NewVoipVideoFragment.this.getActivity().getWindow().setFlags(1024, 1024);
                    NewVoipVideoFragment newVoipVideoFragment3 = NewVoipVideoFragment.this;
                    newVoipVideoFragment3.f317808M.setContentDescription(newVoipVideoFragment3.getString(C0966R.string.kjd));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002e, code lost:
        if (r4.mo109882e(r5, 0) != 1) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NewVoipVideoFragment() {
        /*
            r8 = this;
            r8.<init>()
            r0 = 0
            r8.f317851x0 = r0
            r8.f317852y0 = r0
            r8.f317812Q0 = r0
            r1 = 0
            r8.f317814R0 = r1
            z33.h r2 = z33.C112595h.f337166a
            boolean r3 = r2.mo164372p()
            r8.f317822V0 = r3
            boolean r2 = r2.mo164372p()
            r8.f317824W0 = r2
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_voip_use_new_camera_modular
            java.lang.Class<h81.h> r3 = h81.C32735h.class
            bp3.p r4 = bp3.C79758p.f233760a
            bp3.f r5 = bp3.C104160f.RepairerConfig_VOIP_CameraFrameWork_Int
            int r6 = r4.mo109882e(r5, r1)
            r7 = 1
            if (r6 == 0) goto L_0x0033
            int r2 = r4.mo109882e(r5, r1)
            if (r2 == r7) goto L_0x0031
            goto L_0x0054
        L_0x0031:
            r7 = 0
            goto L_0x0054
        L_0x0033:
            gj.m r4 = p156gj.C107835h0.f322856m
            int r4 = r4.f322872L
            r5 = -1
            if (r4 == r5) goto L_0x004a
            if (r4 == r7) goto L_0x0054
            r5 = 2
            if (r4 == r5) goto L_0x0031
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.h r3 = (h81.C32735h) r3
            boolean r7 = r3.mo58784wf(r2, r1)
            goto L_0x0054
        L_0x004a:
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.h r3 = (h81.C32735h) r3
            boolean r7 = r3.mo58784wf(r2, r1)
        L_0x0054:
            r8.f317826X0 = r7
            boolean r2 = z33.C112595h.m153929q()
            r8.f317828Y0 = r2
            w80.e$a r2 = w80.C111744e.f334654d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r2.mo163482e()
            r3.append(r4)
            java.lang.String r4 = " \n Rating is "
            r3.append(r4)
            int r2 = r2.mo163483f()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r8.f317830Z0 = r2
            r8.f317831a1 = r1
            r8.f317832b1 = r1
            r8.f317833c1 = r1
            r8.f317834d1 = r0
            r2 = 0
            r8.f317835e1 = r2
            r8.f317836f1 = r1
            r8.f317837g1 = r1
            r8.f317838h1 = r1
            r8.f317839i1 = r1
            r8.f317840j1 = r0
            r8.f317841k1 = r1
            r8.f317843m1 = r1
            r8.f317844n1 = r1
            com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment$e r0 = new com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment$e
            r0.<init>()
            r8.f317845o1 = r0
            com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment$f r0 = new com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment$f
            r0.<init>()
            r8.f317847p1 = r0
            com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment$g r0 = new com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment$g
            r0.<init>()
            r8.f317848q1 = r0
            com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment$h r0 = new com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment$h
            r0.<init>()
            r8.f317849r1 = r0
            com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment$i r0 = new com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment$i
            r0.<init>()
            r8.f317850s1 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.p475ui.NewVoipVideoFragment.<init>():void");
    }

    /* renamed from: L */
    public void mo152879L() {
        TextView textView = this.f317927r;
        if (textView != null) {
            textView.clearAnimation();
            this.f317927r.setVisibility(8);
        }
    }

    /* renamed from: O */
    public void mo152880O(int i) {
        this.f317836f1 = i;
    }

    /* renamed from: Q */
    public void mo152881Q() {
        this.f317816S0++;
    }

    /* renamed from: R */
    public void mo152882R(int i) {
        this.f317837g1 = i;
    }

    /* renamed from: S */
    public void mo152883S(boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r9 != 262) goto L_0x0294;
     */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo152884T(int r8, int r9) {
        /*
            r7 = this;
            super.mo152884T(r8, r9)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "newState: "
            r0.append(r1)
            java.lang.String r1 = z33.C112604l.m153981d(r9)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.Voip.VoipVideoFragment"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            android.widget.RelativeLayout r0 = r7.f317919g
            if (r0 != 0) goto L_0x0027
            java.lang.String r8 = "fragment no create, return first, onCreateView will call it again"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)
            return
        L_0x0027:
            r2 = 4
            r3 = 8
            r4 = 0
            r5 = 1
            if (r9 == 0) goto L_0x0250
            r6 = 2
            if (r9 == r6) goto L_0x0250
            if (r9 == r2) goto L_0x0241
            r6 = 6
            if (r9 == r6) goto L_0x00ea
            if (r9 == r3) goto L_0x00bb
            r6 = 256(0x100, float:3.59E-43)
            if (r9 == r6) goto L_0x005a
            r2 = 258(0x102, float:3.62E-43)
            if (r9 == r2) goto L_0x004a
            r2 = 260(0x104, float:3.64E-43)
            if (r9 == r2) goto L_0x00ea
            r0 = 262(0x106, float:3.67E-43)
            if (r9 == r0) goto L_0x00bb
            goto L_0x0294
        L_0x004a:
            com.tencent.mm.plugin.voip.ui.y r8 = r7.f317935z
            if (r8 == 0) goto L_0x0051
            r8.mo153040d()
        L_0x0051:
            com.tencent.mm.plugin.voip.ui.z r8 = r7.f317913D
            if (r8 == 0) goto L_0x0294
            r8.mo153041a(r5)
            goto L_0x0294
        L_0x005a:
            r7.f317843m1 = r5
            r7.mo152894i0(r5)
            com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView r8 = r7.f317806K
            r8.setVisibility(r4)
            android.widget.RelativeLayout r8 = r7.f317808M
            r8.setImportantForAccessibility(r2)
            android.widget.ImageView r8 = r7.f317921i
            if (r8 == 0) goto L_0x007e
            r8.setVisibility(r4)
            com.tencent.mm.plugin.voip.ui.VoipBaseFragment$e r8 = new com.tencent.mm.plugin.voip.ui.VoipBaseFragment$e
            r8.<init>()
            r7.f317933x = r8
            zt3.t r9 = zt3.C119157j.f356862d
            zt3.j r9 = (zt3.C119157j) r9
            r9.mo183875f(r8)
        L_0x007e:
            com.tencent.mm.plugin.voip.ui.y r8 = r7.f317935z
            if (r8 == 0) goto L_0x0085
            r8.mo153038b(r5)
        L_0x0085:
            com.tencent.mm.plugin.voip.ui.z r8 = r7.f317913D
            if (r8 == 0) goto L_0x008c
            r8.mo153042b(r5)
        L_0x008c:
            android.widget.TextView r8 = r7.f317813R
            r8.setVisibility(r3)
            com.tencent.mm.plugin.voip.model.h0 r8 = l33.C109247e.xx0()
            java.lang.String r8 = r8.f317351t
            if (r8 == 0) goto L_0x00a9
            android.widget.TextView r8 = r7.f317813R
            r8.setVisibility(r4)
            android.widget.TextView r8 = r7.f317813R
            com.tencent.mm.plugin.voip.model.h0 r9 = l33.C109247e.xx0()
            java.lang.String r9 = r9.f317351t
            r8.setText(r9)
        L_0x00a9:
            gj.d r8 = p156gj.C107835h0.f322845b
            int r8 = r8.f322806e
            if (r8 != r5) goto L_0x0295
            android.widget.ImageView r8 = r7.f317809N
            r8.setVisibility(r4)
            com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView r8 = r7.f317806K
            r8.setVisibility(r2)
            goto L_0x0295
        L_0x00bb:
            com.tencent.mm.plugin.voip.ui.z r9 = r7.f317913D
            if (r9 == 0) goto L_0x00cf
            com.tencent.mm.plugin.voip.widget.VoipSmallIconButton r0 = r9.f318032b
            if (r0 != 0) goto L_0x00c4
            goto L_0x00c7
        L_0x00c4:
            r0.setEnabled(r4)
        L_0x00c7:
            android.widget.FrameLayout r9 = r9.f318038h
            if (r9 != 0) goto L_0x00cc
            goto L_0x00cf
        L_0x00cc:
            r9.setEnabled(r4)
        L_0x00cf:
            r9 = 4105(0x1009, float:5.752E-42)
            if (r8 == r9) goto L_0x00d4
            goto L_0x00e1
        L_0x00d4:
            android.widget.TextView r8 = r7.f317811Q
            r8.setVisibility(r4)
            android.widget.TextView r8 = r7.f317811Q
            r9 = 2131838667(0x7f1146cb, float:1.9310564E38)
            r8.setText(r9)
        L_0x00e1:
            com.tencent.mm.plugin.voip.ui.VoipBaseFragment$g r8 = r7.f317930u
            if (r8 == 0) goto L_0x0294
            r8.mo152925f0(r5, r4)
            goto L_0x0294
        L_0x00ea:
            com.tencent.mm.plugin.voip.ui.i r8 = new com.tencent.mm.plugin.voip.ui.i
            r8.<init>(r7)
            r0.setOnClickListener(r8)
            boolean r8 = r7.f317843m1
            if (r8 == 0) goto L_0x0104
            java.lang.ref.WeakReference<com.tencent.mm.plugin.voip.ui.g> r8 = r7.f317931v
            java.lang.Object r8 = r8.get()
            com.tencent.mm.plugin.voip.ui.g r8 = (com.tencent.p014mm.plugin.voip.p475ui.C106448g) r8
            r8.mo152480n()
            r7.f317843m1 = r4
            goto L_0x0107
        L_0x0104:
            r7.mo152894i0(r4)
        L_0x0107:
            android.widget.ImageView r8 = r7.f317921i
            if (r8 == 0) goto L_0x010e
            r8.setVisibility(r3)
        L_0x010e:
            com.tencent.mm.plugin.voip.ui.e0 r8 = r7.f317911B
            if (r8 == 0) goto L_0x011a
            android.widget.LinearLayout r8 = r8.f317979e
            if (r8 != 0) goto L_0x0117
            goto L_0x011a
        L_0x0117:
            r8.setVisibility(r3)
        L_0x011a:
            com.tencent.mm.plugin.voip.video.NewMovableVideoView r8 = r7.f317807L
            if (r8 != 0) goto L_0x0120
            goto L_0x0294
        L_0x0120:
            int r8 = r8.getVisibility()
            if (r8 != 0) goto L_0x0128
            goto L_0x0294
        L_0x0128:
            boolean r8 = r7.f317917e
            if (r8 == 0) goto L_0x0140
            boolean r8 = r7.f317832b1
            r8 = r8 ^ r5
            r7.f317832b1 = r8
            r8 = r8 ^ r5
            android.graphics.Point r8 = r7.mo152895j0(r8)
            com.tencent.mm.plugin.voip.video.NewMovableVideoView r9 = r7.f317807L
            int r0 = r8.x
            int r8 = r8.y
            r9.mo153098e(r0, r8)
            goto L_0x0145
        L_0x0140:
            boolean r8 = r7.f317832b1
            r8 = r8 ^ r5
            r7.f317832b1 = r8
        L_0x0145:
            boolean r8 = sf0.C90188n0.m112865a()
            if (r8 == 0) goto L_0x0178
            android.widget.TextView r8 = r7.f317815S
            r8.setVisibility(r4)
            android.widget.TextView r8 = r7.f317817T
            r8.setVisibility(r4)
            android.widget.TextView r8 = r7.f317819U
            r8.setVisibility(r4)
            android.widget.TextView r8 = r7.f317821V
            r8.setVisibility(r4)
            android.widget.TextView r8 = r7.f317823W
            r8.setVisibility(r4)
            android.widget.TextView r8 = r7.f317825X
            r8.setVisibility(r4)
            android.widget.TextView r8 = r7.f317827Y
            r8.setVisibility(r4)
            android.widget.TextView r8 = r7.f317829Z
            r8.setVisibility(r4)
            android.widget.TextView r8 = r7.f317846p0
            r8.setVisibility(r4)
        L_0x0178:
            com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView r8 = r7.f317806K
            r8.setVisibility(r4)
            com.tencent.mm.plugin.voip.video.NewMovableVideoView r8 = r7.f317807L
            r8.setVisibility(r4)
            android.widget.RelativeLayout r8 = r7.f317808M
            r8.setImportantForAccessibility(r5)
            com.tencent.mm.plugin.voip.video.NewMovableVideoView r8 = r7.f317807L
            r9 = 2131838569(0x7f114669, float:1.9310365E38)
            java.lang.String r9 = r7.getString(r9)
            r8.setContentDescription(r9)
            android.widget.RelativeLayout r8 = r7.f317808M
            r9 = 2131838724(0x7f114704, float:1.931068E38)
            java.lang.String r9 = r7.getString(r9)
            r8.setContentDescription(r9)
            android.widget.TextView r8 = r7.f317810P
            r8.setVisibility(r4)
            android.widget.FrameLayout r8 = r7.f317910A
            if (r8 == 0) goto L_0x01ae
            r8.removeAllViews()
            r7.mo152977f0()
        L_0x01ae:
            com.tencent.mm.plugin.voip.ui.z r8 = r7.f317913D
            if (r8 == 0) goto L_0x01b5
            r8.mo153045e()
        L_0x01b5:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.voip.ui.g> r8 = r7.f317931v
            java.lang.Object r8 = r8.get()
            com.tencent.mm.plugin.voip.ui.g r8 = (com.tencent.p014mm.plugin.voip.p475ui.C106448g) r8
            boolean r9 = r7.f317832b1
            r8.mo152469g(r9)
            java.lang.Object[] r8 = new java.lang.Object[r5]
            int r9 = r7.f317836f1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r4] = r9
            java.lang.String r9 = "steve: showVideoTalking decMode:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r9, r8)
            boolean r8 = r7.f317832b1
            r8 = r8 ^ r5
            android.graphics.Point r8 = r7.mo152895j0(r8)
            com.tencent.mm.plugin.voip.video.NewMovableVideoView r9 = r7.f317807L
            int r0 = r8.x
            int r8 = r8.y
            r9.mo153097d(r0, r8)
            com.tencent.mm.sdk.platformtools.MTimerHandler r8 = r7.f317834d1
            if (r8 == 0) goto L_0x0218
            boolean r8 = r7.f317833c1
            if (r8 == 0) goto L_0x01ea
            goto L_0x0218
        L_0x01ea:
            r8 = -1
            long r0 = r7.f317922j
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x01f8
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r7.f317922j = r8
        L_0x01f8:
            long r8 = r7.f317922j
            r7.f317835e1 = r8
            r7.f317833c1 = r5
            com.tencent.mm.sdk.platformtools.MTimerHandler r8 = r7.f317834d1
            r0 = 1000(0x3e8, double:4.94E-321)
            r8.startTimer(r0, r0)
            com.tencent.mm.sdk.platformtools.MTimerHandler r8 = new com.tencent.mm.sdk.platformtools.MTimerHandler
            com.tencent.mm.plugin.voip.ui.l r9 = new com.tencent.mm.plugin.voip.ui.l
            r9.<init>(r7)
            java.lang.String r2 = "VoipVideoFragment_cpuStatThread"
            r8.<init>((java.lang.String) r2, (com.tencent.p014mm.sdk.platformtools.MTimerHandler.CallBack) r9, (boolean) r5)
            r7.f317840j1 = r8
            r7.f317841k1 = r5
            r8.startTimer(r0)
        L_0x0218:
            android.content.SharedPreferences r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            java.lang.String r9 = "voipfaceDebug"
            boolean r8 = r8.getBoolean(r9, r4)
            if (r8 == 0) goto L_0x022f
            android.widget.Button r8 = r7.f317852y0
            r8.setVisibility(r4)
            android.widget.Button r8 = r7.f317812Q0
            r8.setVisibility(r4)
        L_0x022f:
            r7.mo152897l0()
            int r8 = r7.f317923n
            r9 = 4102(0x1006, float:5.748E-42)
            if (r8 != r9) goto L_0x0294
            r8 = 2131838530(0x7f114642, float:1.9310286E38)
            r9 = 10000(0x2710, float:1.4013E-41)
            r7.mo152888Z(r8, r9)
            goto L_0x0294
        L_0x0241:
            com.tencent.mm.plugin.voip.ui.y r8 = r7.f317935z
            if (r8 == 0) goto L_0x0248
            r8.mo153040d()
        L_0x0248:
            com.tencent.mm.plugin.voip.ui.z r8 = r7.f317913D
            if (r8 == 0) goto L_0x0294
            r8.mo153043c(r5)
            goto L_0x0294
        L_0x0250:
            r7.f317843m1 = r5
            r7.mo152894i0(r5)
            com.tencent.mm.plugin.voip.ui.y r8 = r7.f317935z
            if (r8 == 0) goto L_0x025c
            r8.mo153039c()
        L_0x025c:
            com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView r8 = r7.f317806K
            r8.setVisibility(r4)
            android.widget.RelativeLayout r8 = r7.f317808M
            r8.setImportantForAccessibility(r2)
            android.widget.ImageView r8 = r7.f317920h
            r8.setVisibility(r3)
            android.widget.TextView r8 = r7.f317811Q
            r8.setVisibility(r3)
            android.widget.TextView r8 = r7.f317813R
            r8.setVisibility(r3)
            com.tencent.mm.plugin.voip.model.h0 r8 = l33.C109247e.xx0()
            java.lang.String r8 = r8.f317351t
            if (r8 == 0) goto L_0x028d
            android.widget.TextView r8 = r7.f317813R
            r8.setVisibility(r4)
            android.widget.TextView r8 = r7.f317813R
            com.tencent.mm.plugin.voip.model.h0 r9 = l33.C109247e.xx0()
            java.lang.String r9 = r9.f317351t
            r8.setText(r9)
        L_0x028d:
            com.tencent.mm.plugin.voip.ui.z r8 = r7.f317913D
            if (r8 == 0) goto L_0x0294
            r8.mo153044d(r5)
        L_0x0294:
            r4 = 1
        L_0x0295:
            gj.d r8 = p156gj.C107835h0.f322845b
            int r8 = r8.f322806e
            if (r8 != r5) goto L_0x02a2
            if (r4 == 0) goto L_0x02a2
            android.widget.ImageView r8 = r7.f317809N
            r8.setVisibility(r3)
        L_0x02a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.p475ui.NewVoipVideoFragment.mo152884T(int, int):void");
    }

    /* renamed from: U */
    public void mo152885U(Point point) {
        RelativeLayout.LayoutParams layoutParams;
        VoIPRenderTextureView voIPRenderTextureView = this.f317806K;
        voIPRenderTextureView.getClass();
        C87412m.m108594g(point, "screenSize");
        Log.m105925i("RenderView", "new size from resource Helper w %s * h  %s", Integer.valueOf(C76577a.m92145A(voIPRenderTextureView.getContext())), Integer.valueOf(C76577a.m92159j(voIPRenderTextureView.getContext())));
        int i = point.y;
        if (C85875k4.m106207v()) {
            layoutParams = new RelativeLayout.LayoutParams((i * 9) / 16, i);
            layoutParams.addRule(13);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        }
        voIPRenderTextureView.setLayoutParams(layoutParams);
        voIPRenderTextureView.requestLayout();
        NewMovableVideoView newMovableVideoView = this.f317807L;
        if (newMovableVideoView != null) {
            Log.m105925i("MicroMsg.MovableVideoView", "refrsh view %s, %s", Integer.valueOf(newMovableVideoView.f318108d), Integer.valueOf(newMovableVideoView.f318109e));
            newMovableVideoView.f318115n = 0;
            newMovableVideoView.mo153097d(newMovableVideoView.f318108d, newMovableVideoView.f318109e);
        }
    }

    /* renamed from: V */
    public void mo152886V(int i) {
    }

    /* renamed from: X */
    public void mo152887X(boolean z) {
        TextView textView = this.f317927r;
        if (textView != null) {
            if (z) {
                textView.setText(C0966R.string.khs);
            } else {
                textView.setText(C0966R.string.khr);
            }
            this.f317927r.clearAnimation();
            this.f317927r.setVisibility(0);
            this.f317927r.sendAccessibilityEvent(128);
        }
    }

    /* renamed from: Z */
    public void mo152888Z(int i, int i2) {
        TextView textView = this.f317811Q;
        if (textView != null) {
            textView.setText(i);
            this.f317811Q.setVisibility(0);
            this.f317811Q.sendAccessibilityEvent(128);
            this.f317811Q.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            this.f317811Q.setBackgroundResource(C0966R.C0969drawable.ce_);
            this.f317811Q.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f317811Q.setCompoundDrawablePadding(0);
            this.f317918f.removeCallbacks(this.f317850s1);
            if (-1 != i2) {
                this.f317918f.postDelayed(this.f317850s1, (long) i2);
            }
        }
    }

    /* renamed from: d0 */
    public void mo152889d0(String str) {
        TextView textView = this.f317813R;
        if (textView != null) {
            textView.setVisibility(0);
            this.f317813R.setText(str);
            this.f317811Q.sendAccessibilityEvent(128);
        }
    }

    /* renamed from: e0 */
    public void mo152890e0() {
        WeakReference<C106448g> weakReference;
        Log.printInfoStack("MicroMsg.Voip.VoipVideoFragment", "unit should not be allow in foreground", new Object[0]);
        if (!(this.f317806K == null || (weakReference = this.f317931v) == null || weakReference.get() == null)) {
            this.f317806K.getClass();
        }
        WeakReference<C106448g> weakReference2 = this.f317931v;
        if (!(weakReference2 == null || weakReference2.get() == null)) {
            this.f317931v.get().mo152467f(this.f317806K);
            this.f317931v.get().mo152467f(this.f317807L);
        }
        NewMovableVideoView newMovableVideoView = this.f317807L;
        if (newMovableVideoView != null) {
            newMovableVideoView.getClass();
            this.f317807L.setVisibility(4);
            this.f317807L = null;
        }
        super.mo152890e0();
    }

    /* renamed from: g0 */
    public final void mo152891g0() {
        C106476z zVar;
        FrameLayout frameLayout;
        Log.m105924i("MicroMsg.Voip.VoipVideoFragment", "accept video invite");
        C115669n.INSTANCE.mo160140o(11526, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 1);
        WeakReference<C106448g> weakReference = this.f317931v;
        if (weakReference != null && weakReference.get() != null && this.f317931v.get().mo152421C() && (zVar = this.f317913D) != null && (frameLayout = zVar.f318038h) != null) {
            frameLayout.setEnabled(false);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f360050cd3;
    }

    /* renamed from: h0 */
    public final void mo152893h0() {
        FrameLayout frameLayout;
        C115669n.INSTANCE.mo160140o(11526, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 3);
        WeakReference<C106448g> weakReference = this.f317931v;
        if (weakReference != null && weakReference.get() != null && this.f317931v.get().mo152478m()) {
            C106476z zVar = this.f317913D;
            if (!(zVar == null || (frameLayout = zVar.f318038h) == null)) {
                frameLayout.setEnabled(false);
            }
            C106475y yVar = this.f317935z;
            if (yVar != null) {
                yVar.mo153040d();
            }
        }
    }

    /* renamed from: i0 */
    public void mo152894i0(boolean z) {
        if (!this.f317844n1) {
            this.f317808M.addView(this.f317806K);
            boolean z2 = false;
            if (z) {
                this.f317931v.get().mo152417A(this.f317807L, 1);
                this.f317931v.get().mo152417A(this.f317806K, 0);
            } else {
                this.f317931v.get().mo152417A(this.f317807L, 0);
                this.f317931v.get().mo152417A(this.f317806K, 1);
            }
            C106448g gVar = this.f317931v.get();
            int i = this.f317924o;
            if (!(260 == i || 6 == i)) {
                z2 = true;
            }
            gVar.mo152473j(true, z2);
            this.f317844n1 = true;
        }
    }

    /* renamed from: j0 */
    public final Point mo152895j0(boolean z) {
        int i = (int) (((double) C85875k4.m106184h(getActivity()).y) / 5.0d);
        return new Point((int) (((float) i) * C109247e.xx0().mo152618q(z)), i);
    }

    /* renamed from: k0 */
    public void mo152896k0() {
        FrameLayout frameLayout;
        Log.m105924i("MicroMsg.Voip.VoipVideoFragment", "reject video invite");
        C115669n.INSTANCE.mo160140o(11526, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 4);
        WeakReference<C106448g> weakReference = this.f317931v;
        if (weakReference != null && weakReference.get() != null && this.f317931v.get().mo152432K()) {
            mo152888Z(C0966R.string.kib, -1);
            C106476z zVar = this.f317913D;
            if (zVar != null && (frameLayout = zVar.f318038h) != null) {
                frameLayout.setEnabled(false);
            }
        }
    }

    /* renamed from: l0 */
    public final void mo152897l0() {
        Log.m105924i("MicroMsg.Voip.VoipVideoFragment", "trigger dismiss bar");
        this.f317831a1++;
        this.f317918f.postDelayed(this.f317849r1, 10000);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RelativeLayout.LayoutParams layoutParams;
        View view;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f317920h = (ImageView) this.f317919g.findViewById(C0966R.C0970id.lc8);
        this.f317921i = (ImageView) this.f317919g.findViewById(C0966R.C0970id.ldh);
        Context context = viewGroup.getContext();
        C87412m.m108594g(context, "context");
        VoIPRenderTextureView voIPRenderTextureView = new VoIPRenderTextureView(context, (AttributeSet) null);
        this.f317806K = voIPRenderTextureView;
        voIPRenderTextureView.mo153096b(VoipBaseFragment.f317908I, VoipBaseFragment.f317909J);
        RelativeLayout relativeLayout = (RelativeLayout) this.f317919g.findViewById(C0966R.C0970id.f357512a91);
        this.f317808M = relativeLayout;
        int i = VoipBaseFragment.f317909J;
        if (C85875k4.m106207v() || C85875k4.m106157N()) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((i * 9) / 16, -1);
            layoutParams2.addRule(14);
            layoutParams = layoutParams2;
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        }
        relativeLayout.setLayoutParams(layoutParams);
        this.f317808M.setImportantForAccessibility(4);
        Log.m105924i("MicroMsg.Voip.VoipVideoFragment", "steve: onCreateView!");
        this.f317810P = (TextView) this.f317919g.findViewById(C0966R.C0970id.ldl);
        this.f317811Q = (TextView) this.f317919g.findViewById(C0966R.C0970id.ldi);
        this.f317813R = (TextView) this.f317919g.findViewById(C0966R.C0970id.ldj);
        this.f317927r = (TextView) this.f317919g.findViewById(C0966R.C0970id.f359525ld0);
        ImageView imageView = (ImageView) this.f317919g.findViewById(C0966R.C0970id.f356907for);
        this.f317928s = imageView;
        imageView.setImageDrawable(C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_filled_arrow, -1));
        this.f317809N = (ImageView) this.f317919g.findViewById(C0966R.C0970id.egg);
        this.f317809N.setImageBitmap(BitmapUtil.fastblur(((C76708i) C86312j.m106911c(C76708i.class)).N50(this.f317916d), 10));
        if (C90188n0.m112865a()) {
            this.f317815S = (TextView) this.f317919g.findViewById(C0966R.C0970id.lc_);
            this.f317817T = (TextView) this.f317919g.findViewById(C0966R.C0970id.lda);
            this.f317819U = (TextView) this.f317919g.findViewById(C0966R.C0970id.f359528ld3);
            this.f317821V = (TextView) this.f317919g.findViewById(C0966R.C0970id.ldb);
            this.f317823W = (TextView) this.f317919g.findViewById(C0966R.C0970id.ld4);
            this.f317825X = (TextView) this.f317919g.findViewById(C0966R.C0970id.f357937ck2);
            this.f317827Y = (TextView) this.f317919g.findViewById(C0966R.C0970id.eql);
            this.f317829Z = (TextView) this.f317919g.findViewById(C0966R.C0970id.apn);
            this.f317846p0 = (TextView) this.f317919g.findViewById(C0966R.C0970id.eqm);
        }
        this.f317852y0 = (Button) this.f317919g.findViewById(C0966R.C0970id.lcn);
        this.f317812Q0 = (Button) this.f317919g.findViewById(C0966R.C0970id.lco);
        this.f317852y0.setVisibility(8);
        this.f317812Q0.setVisibility(8);
        this.f317852y0.setOnClickListener(this.f317845o1);
        this.f317812Q0.setOnClickListener(this.f317847p1);
        C0012b bVar = new C0012b(getActivity());
        this.f317851x0 = bVar;
        this.f317919g.addView(bVar);
        this.f317851x0.setVisibility(8);
        int c = C76912y0.m92764c(getActivity());
        Log.m105918d("MicroMsg.Voip.VoipVideoFragment", "statusHeight: " + c);
        View findViewById = this.f317919g.findViewById(C0966R.C0970id.ldg);
        if (findViewById != null) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams3.topMargin += c;
            findViewById.setLayoutParams(layoutParams3);
        }
        C106444e0 e0Var = this.f317911B;
        if (!(e0Var == null || (view = e0Var.f317976b) == null)) {
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            C87412m.m108592e(layoutParams4, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) layoutParams4;
            layoutParams5.topMargin += c;
            view.setLayoutParams(layoutParams5);
        }
        this.f317816S0 = 0;
        this.f317818T0 = 0;
        this.f317820U0 = 0;
        this.f317838h1 = 0;
        this.f317839i1 = 0;
        int i2 = C85875k4.m106184h(getContext()).y;
        int i3 = C85875k4.m106184h(getContext()).x;
        int i4 = i2 / 5;
        if (i2 != 0) {
            i3 = (i3 * i4) / i2;
        }
        NewMovableVideoView newMovableVideoView = new NewMovableVideoView(MMApplicationContext.getContext(), (AttributeSet) null);
        this.f317807L = newMovableVideoView;
        newMovableVideoView.setContentDescription("切换画面，按钮，点按两次即可激活");
        this.f317807L.mo153097d(i3, i4);
        this.f317807L.setVisibility(4);
        this.f317806K.setVisibility(0);
        Log.m105924i("MicroMsg.Voip.VoipVideoFragment", "steve: before AvcDecoder init");
        this.f317919g.addView(this.f317807L);
        this.f317807L.setOnClickListener(new C106452j(this));
        if (this.f317917e) {
            this.f317918f.postDelayed(new C106460k(this), 2000);
        }
        this.f317834d1 = new MTimerHandler(Looper.getMainLooper(), this.f317848q1, true);
        Log.m105925i("MicroMsg.Voip.VoipVideoFragment", "onCreateView, voipBeautyMode: %s", Integer.valueOf(this.f317837g1));
        WeakReference<C106448g> weakReference = this.f317931v;
        if (!(weakReference == null || weakReference.get() == null)) {
            this.f317931v.get().mo152492u();
        }
        mo152884T(0, this.f317924o);
        PowerManager.WakeLock newWakeLock = ((PowerManager) MMApplicationContext.getContext().getSystemService("power")).newWakeLock(536870922, "MicroMsg.Voip.VoipVideoFragment");
        this.f317842l1 = newWakeLock;
        PowerManager.WakeLock wakeLock = newWakeLock;
        C117292a.m165357c(wakeLock, "com/tencent/mm/plugin/voip/ui/NewVoipVideoFragment", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        newWakeLock.acquire();
        C117292a.m165359e(wakeLock, "com/tencent/mm/plugin/voip/ui/NewVoipVideoFragment", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        Log.m105924i("MicroMsg.Voip.VoipVideoFragment", "acquire wakelock");
        return this.f317919g;
    }

    public void onDestroy() {
        this.f317833c1 = false;
        Log.m105924i("MicroMsg.Voip.VoipVideoFragment", "onDestory");
        super.onDestroy();
        PowerManager.WakeLock wakeLock = this.f317842l1;
        if (wakeLock != null && wakeLock.isHeld()) {
            Log.m105924i("MicroMsg.Voip.VoipVideoFragment", "release waklock");
            PowerManager.WakeLock wakeLock2 = this.f317842l1;
            PowerManager.WakeLock wakeLock3 = wakeLock2;
            C117292a.m165357c(wakeLock3, "com/tencent/mm/plugin/voip/ui/NewVoipVideoFragment", "onDestroy", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock2.release();
            C117292a.m165359e(wakeLock3, "com/tencent/mm/plugin/voip/ui/NewVoipVideoFragment", "onDestroy", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        VoIPRenderTextureView voIPRenderTextureView = this.f317806K;
        if (voIPRenderTextureView != null) {
            voIPRenderTextureView.setVisibility(8);
            this.f317806K = null;
        }
    }

    public void onDetach() {
        Log.m105924i("MicroMsg.Voip.VoipVideoFragment", "onDetach");
        MTimerHandler mTimerHandler = this.f317834d1;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f317834d1 = null;
        }
        MTimerHandler mTimerHandler2 = this.f317840j1;
        if (mTimerHandler2 != null) {
            mTimerHandler2.stopTimer();
        }
        this.f317841k1 = false;
        super.onDetach();
    }

    /* renamed from: v */
    public void mo152898v(C112390a.C112392b bVar, Bundle bundle) {
        WeakReference<C106448g> weakReference;
        super.mo152898v(bVar, bundle);
        switch (bVar.ordinal()) {
            case 6:
                Log.m105924i("MicroMsg.Voip.VoipVideoFragment", "click cancel video invite button");
                WeakReference<C106448g> weakReference2 = this.f317931v;
                if (weakReference2 != null && weakReference2.get() != null && this.f317931v.get().mo152430J() && (weakReference = this.f317931v) != null && weakReference.get() != null && this.f317913D != null) {
                    mo152888Z(C0966R.string.kfc, -1);
                    FrameLayout frameLayout = this.f317913D.f318038h;
                    if (frameLayout != null) {
                        frameLayout.setEnabled(false);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                Log.m105924i("MicroMsg.Voip.VoipVideoFragment", "click accept video invite button");
                if (NetStatusUtil.isWifi((Context) getActivity()) || (C106348g0.m143242c() && !NetStatusUtil.is2G(getActivity()))) {
                    mo152891g0();
                    return;
                } else {
                    C76879j.m92743n(getActivity(), C0966R.string.khy, C0966R.string.khz, new C106407c(), new C106408d());
                    return;
                }
            case 8:
                mo152896k0();
                return;
            case 10:
                if (NetStatusUtil.isWifi((Context) getActivity()) || C106348g0.m143242c()) {
                    Log.m105924i("MicroMsg.Voip.VoipVideoFragment", "accept video invite use voice");
                    mo152893h0();
                    return;
                }
                C76879j.m92743n(getActivity(), C0966R.string.khy, C0966R.string.khz, new C106405a(), new C106406b());
                return;
            case 11:
                Log.m105924i("MicroMsg.Voip.VoipVideoFragment", "click switch to voice button");
                WeakReference<C106448g> weakReference3 = this.f317931v;
                if (weakReference3 != null && weakReference3.get() != null) {
                    this.f317931v.get().mo152466e();
                    return;
                }
                return;
            case 12:
                Log.m105924i("MicroMsg.Voip.VoipVideoFragment", "switch camera");
                mo152897l0();
                WeakReference<C106448g> weakReference4 = this.f317931v;
                if (weakReference4 != null && weakReference4.get() != null) {
                    this.f317931v.get().mo152424E((C32226l<Boolean, C13598b0>) null);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
