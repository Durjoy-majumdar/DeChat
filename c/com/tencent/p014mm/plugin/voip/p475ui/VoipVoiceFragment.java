package com.tencent.p014mm.plugin.voip.p475ui;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.p475ui.VoipBaseFragment;
import com.tencent.p014mm.plugin.voip.widget.VoIPControlIconLayout;
import com.tencent.p014mm.plugin.voip.widget.VoIPFuncIconLayout;
import com.tencent.p014mm.plugin.voip.widget.VoipSmallIconButton;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import j20.C117292a;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import k20.C60958c;
import k20.C9556a;
import l33.C109247e;
import nj3.C76912y0;
import sf0.C90188n0;
import y33.C112390a;
import z33.C112604l;

/* renamed from: com.tencent.mm.plugin.voip.ui.VoipVoiceFragment */
public class VoipVoiceFragment extends VoipBaseFragment {

    /* renamed from: K */
    public TextView f317953K;

    /* renamed from: L */
    public TextView f317954L;

    /* renamed from: M */
    public TextView f317955M;

    /* renamed from: N */
    public boolean f317956N = false;

    /* renamed from: P */
    public MTimerHandler f317957P;

    /* renamed from: Q */
    public TextView f317958Q;

    /* renamed from: R */
    public boolean f317959R = false;

    /* renamed from: S */
    public final MTimerHandler.CallBack f317960S = new C106437a();

    /* renamed from: T */
    public Runnable f317961T = new C106438b();

    /* renamed from: com.tencent.mm.plugin.voip.ui.VoipVoiceFragment$a */
    public class C106437a implements MTimerHandler.CallBack {
        public C106437a() {
        }

        public boolean onTimerExpired() {
            VoipVoiceFragment voipVoiceFragment = VoipVoiceFragment.this;
            VoipVoiceFragment.this.f317953K.setText(voipVoiceFragment.mo152972M(Util.secondsToNow(voipVoiceFragment.f317922j)));
            VoipVoiceFragment voipVoiceFragment2 = VoipVoiceFragment.this;
            voipVoiceFragment2.f317953K.setContentDescription(voipVoiceFragment2.mo152971K());
            VoipVoiceFragment voipVoiceFragment3 = VoipVoiceFragment.this;
            voipVoiceFragment3.getClass();
            Log.m105918d("MicroMsg.VoipVoiceFragment", "in showEngineInfo");
            if (!C90188n0.f258920N) {
                return true;
            }
            byte[] bArr = C109247e.xx0().f317332a.f317396a.f317500x.f317637g1;
            Log.m105918d("MicroMsg.VoipVoiceFragment", "engine_info: " + bArr);
            if (bArr == null) {
                return true;
            }
            try {
                String str = new String(bArr, "UTF-8");
                Log.m105918d("MicroMsg.VoipVoiceFragment", "engine info: " + str);
                voipVoiceFragment3.f317958Q.setText(str);
                return true;
            } catch (UnsupportedEncodingException e) {
                Log.printErrStackTrace("MicroMsg.VoipVoiceFragment", e, "", new Object[0]);
                return true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.VoipVoiceFragment$b */
    public class C106438b implements Runnable {
        public C106438b() {
        }

        public void run() {
            if (VoipVoiceFragment.this.getActivity() != null && !VoipVoiceFragment.this.getActivity().isFinishing()) {
                VoipVoiceFragment.this.f317954L.setVisibility(8);
            }
        }
    }

    /* renamed from: L */
    public void mo152879L() {
        TextView textView = this.f317927r;
        if (textView != null) {
            textView.clearAnimation();
            this.f317927r.setVisibility(8);
        }
    }

    /* renamed from: N */
    public boolean mo152973N() {
        return false;
    }

    /* renamed from: S */
    public void mo152883S(boolean z) {
        Log.printInfoStack("MicroMsg.VoipVoiceFragment", "setMute:%s", Boolean.valueOf(z));
        C106476z zVar = this.f317913D;
        if (zVar != null && zVar.f318042l != z) {
            zVar.f318042l = z;
            VoIPControlIconLayout voIPControlIconLayout = zVar.f318040j;
            if (voIPControlIconLayout != null) {
                voIPControlIconLayout.setChecked(!z);
            }
        }
    }

    /* renamed from: T */
    public void mo152884T(int i, int i2) {
        Integer num;
        int i3 = i2;
        super.mo152884T(i, i2);
        Log.m105924i("MicroMsg.VoipVoiceFragment", "newState: " + C112604l.m153981d(i2) + ", action: " + C112604l.m153981d(i) + ", lastStatus: " + C112604l.m153981d(VoipBaseFragment.f317907H) + ", isSwitchFromVideo: " + this.f317959R);
        if (this.f317919g == null) {
            Log.m105924i("MicroMsg.VoipVoiceFragment", "fragment no create, return first, onCreateView will call it again");
        } else if (i3 == 1) {
            C106475y yVar = this.f317935z;
            if (yVar != null) {
                View view = yVar.f318029h;
                if (view == null) {
                    num = 0;
                } else {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    num = 0;
                    View view2 = view;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/voip/ui/VoIPAvatarContentLayoutUI", "showCallingInviting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/voip/ui/VoIPAvatarContentLayoutUI", "showCallingInviting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                TextView textView = yVar.f318024c;
                if (textView != null) {
                    textView.setText(C0966R.string.ki4);
                }
                yVar.f318028g.mo152984a(yVar.f318025d, VoipBaseFragment.f317906G, 500);
                View view3 = yVar.f318026e;
                if (view3 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(num);
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/voip/ui/VoIPAvatarContentLayoutUI", "showCallingInviting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/voip/ui/VoIPAvatarContentLayoutUI", "showCallingInviting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            this.f317953K.setVisibility(8);
            C106476z zVar = this.f317913D;
            if (zVar != null) {
                zVar.mo153044d(false);
            }
            this.f317955M.setVisibility(8);
            if (C109247e.xx0().f317351t != null) {
                this.f317955M.setVisibility(0);
                this.f317955M.setText(C109247e.xx0().f317351t);
            }
            C106476z zVar2 = this.f317913D;
            if (zVar2 != null) {
                if (zVar2.f318041k == 2) {
                    mo152888Z(C0966R.string.ken, 10000);
                }
            }
            mo152975Y();
        } else if (i3 == 3) {
            C106475y yVar2 = this.f317935z;
            if (yVar2 != null) {
                yVar2.mo153039c();
            }
            this.f317953K.setVisibility(8);
            C106476z zVar3 = this.f317913D;
            if (zVar3 != null) {
                VoipSmallIconButton voipSmallIconButton = zVar3.f318032b;
                if (voipSmallIconButton != null) {
                    voipSmallIconButton.setVisibility(8);
                }
                VoIPControlIconLayout voIPControlIconLayout = zVar3.f318040j;
                if (voIPControlIconLayout != null) {
                    voIPControlIconLayout.setVisibility(0);
                }
                VoIPControlIconLayout voIPControlIconLayout2 = zVar3.f318040j;
                if (voIPControlIconLayout2 != null) {
                    voIPControlIconLayout2.setIconEnabled(true);
                }
                VoIPControlIconLayout voIPControlIconLayout3 = zVar3.f318040j;
                if (voIPControlIconLayout3 != null) {
                    voIPControlIconLayout3.setChecked(!zVar3.f318042l);
                }
                VoIPControlIconLayout voIPControlIconLayout4 = zVar3.f318039i;
                if (voIPControlIconLayout4 != null) {
                    voIPControlIconLayout4.setVisibility(0);
                }
                C106440b0 b0Var = zVar3.f318037g;
                if (b0Var != null) {
                    VoIPFuncIconLayout voIPFuncIconLayout = b0Var.f317969h;
                    if (voIPFuncIconLayout != null) {
                        voIPFuncIconLayout.setVisibility(8);
                    }
                    VoIPFuncIconLayout voIPFuncIconLayout2 = b0Var.f317967f;
                    if (voIPFuncIconLayout2 != null) {
                        voIPFuncIconLayout2.setVisibility(8);
                    }
                    VoIPFuncIconLayout voIPFuncIconLayout3 = b0Var.f317968g;
                    if (voIPFuncIconLayout3 != null) {
                        voIPFuncIconLayout3.setVisibility(8);
                    }
                    VoIPFuncIconLayout voIPFuncIconLayout4 = b0Var.f317966e;
                    if (voIPFuncIconLayout4 != null) {
                        voIPFuncIconLayout4.setVisibility(0);
                    }
                }
            }
            C106476z zVar4 = this.f317913D;
            if (!(zVar4 == null || i == 4097)) {
                if (zVar4.f318041k == 2) {
                    mo152888Z(C0966R.string.ken, 10000);
                }
            }
            mo152975Y();
            this.f317955M.setVisibility(8);
            if (C109247e.xx0().f317351t != null) {
                this.f317955M.setVisibility(0);
                this.f317955M.setText(C109247e.xx0().f317351t);
            }
            if (VoipBaseFragment.f317907H == 2) {
                this.f317959R = true;
            }
        } else if (i3 == 5) {
            C106475y yVar3 = this.f317935z;
            if (yVar3 != null) {
                TextView textView2 = yVar3.f318024c;
                if (textView2 != null) {
                    textView2.setText(C0966R.string.kjs);
                }
                yVar3.f318028g.mo152984a(yVar3.f318025d, VoipBaseFragment.f317906G, 500);
            }
            C106476z zVar5 = this.f317913D;
            if (zVar5 != null) {
                zVar5.mo153043c(false);
            }
        } else if (i3 == 257) {
            C106475y yVar4 = this.f317935z;
            if (yVar4 != null) {
                yVar4.mo153038b(false);
            }
            C106476z zVar6 = this.f317913D;
            if (zVar6 != null) {
                zVar6.mo153042b(false);
            }
            if (VoipBaseFragment.f317907H == 256) {
                this.f317959R = true;
                mo152888Z(C0966R.string.keo, 10000);
            }
            mo152975Y();
            this.f317955M.setVisibility(8);
            if (C109247e.xx0().f317351t != null) {
                this.f317955M.setVisibility(0);
                this.f317955M.setText(C109247e.xx0().f317351t);
            }
        } else if (i3 != 259) {
            if (i3 != 7) {
                if (i3 != 8) {
                    if (i3 != 261) {
                        if (i3 != 262) {
                            return;
                        }
                    }
                }
                C106476z zVar7 = this.f317913D;
                if (zVar7 != null) {
                    VoipSmallIconButton voipSmallIconButton2 = zVar7.f318032b;
                    if (voipSmallIconButton2 != null) {
                        voipSmallIconButton2.setEnabled(false);
                    }
                    FrameLayout frameLayout = zVar7.f318038h;
                    if (frameLayout != null) {
                        frameLayout.setEnabled(false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f317953K.setVisibility(0);
            FrameLayout frameLayout2 = this.f317910A;
            if (!(frameLayout2 == null || this.f317935z == null)) {
                frameLayout2.removeAllViews();
                this.f317935z.mo153037a(getContext(), this.f317910A, this.f317916d, false);
                mo152977f0();
            }
            C106475y yVar5 = this.f317935z;
            if (yVar5 != null) {
                View view4 = yVar5.f318026e;
                if (view4 != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view5 = view4;
                    C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/voip/ui/VoIPAvatarContentLayoutUI", "showVoiceTalking", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/voip/ui/VoIPAvatarContentLayoutUI", "showVoiceTalking", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View view6 = yVar5.f318029h;
                if (view6 != null) {
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                    aVar4.mo10233c(0);
                    View view7 = view6;
                    C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/voip/ui/VoIPAvatarContentLayoutUI", "showVoiceTalking", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view7, "com/tencent/mm/plugin/voip/ui/VoIPAvatarContentLayoutUI", "showVoiceTalking", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            C106444e0 e0Var = this.f317911B;
            if (e0Var != null) {
                LinearLayout linearLayout = e0Var.f317979e;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                WeImageView weImageView = e0Var.f317977c;
                if (weImageView != null) {
                    weImageView.setVisibility(0);
                }
            }
            C106476z zVar8 = this.f317913D;
            if (zVar8 != null) {
                zVar8.mo153045e();
            }
            if (!this.f317959R) {
                mo152888Z(C0966R.string.kef, 10000);
            } else {
                C106476z zVar9 = this.f317913D;
                if (zVar9 != null) {
                    if (zVar9.f318041k == 2) {
                        mo152888Z(C0966R.string.keh, 10000);
                    }
                }
                if (zVar9 != null) {
                    if (zVar9.f318041k == 3) {
                        mo152888Z(C0966R.string.keg, 10000);
                    }
                }
            }
            if (C90188n0.f258920N) {
                this.f317958Q.setVisibility(0);
            }
            mo152975Y();
            if (this.f317957P != null && !this.f317956N) {
                if (-1 == this.f317922j) {
                    this.f317922j = Util.nowSecond();
                }
                this.f317956N = true;
                this.f317957P.startTimer(50, 1000);
            }
            this.f317955M.setVisibility(8);
            if (C109247e.xx0().f317351t != null) {
                this.f317955M.setVisibility(0);
                this.f317955M.setText(C109247e.xx0().f317351t);
            }
        } else {
            C106475y yVar6 = this.f317935z;
            if (yVar6 != null) {
                View view8 = yVar6.f318029h;
                if (view8 != null) {
                    C9556a aVar5 = new C9556a();
                    ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                    aVar5.mo10233c(0);
                    View view9 = view8;
                    C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/voip/ui/VoIPAvatarContentLayoutUI", "showCalledVoiceConnecting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view9, "com/tencent/mm/plugin/voip/ui/VoIPAvatarContentLayoutUI", "showCalledVoiceConnecting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View view10 = yVar6.f318026e;
                if (view10 != null) {
                    C9556a aVar6 = new C9556a();
                    ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                    aVar6.mo10233c(0);
                    View view11 = view10;
                    C117292a.m165358d(view11, aVar6.mo10232b(), "com/tencent/mm/plugin/voip/ui/VoIPAvatarContentLayoutUI", "showCalledVoiceConnecting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view10.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view11, "com/tencent/mm/plugin/voip/ui/VoIPAvatarContentLayoutUI", "showCalledVoiceConnecting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                TextView textView3 = yVar6.f318024c;
                if (textView3 != null) {
                    textView3.setText(C0966R.string.kjs);
                }
                yVar6.f318028g.mo152984a(yVar6.f318025d, VoipBaseFragment.f317906G, 500);
            }
            C106476z zVar10 = this.f317913D;
            if (zVar10 != null) {
                zVar10.mo153041a(false);
            }
            mo152888Z(C0966R.string.ken, 10000);
            mo152975Y();
        }
    }

    /* renamed from: U */
    public void mo152885U(Point point) {
    }

    /* renamed from: V */
    public void mo152886V(int i) {
        C106476z zVar;
        if (i != -1 && (zVar = this.f317913D) != null && zVar.f318041k != i) {
            zVar.f318041k = i;
            zVar.mo153047g();
        }
    }

    /* renamed from: X */
    public void mo152887X(boolean z) {
        TextView textView;
        if (!this.f317929t && (textView = this.f317927r) != null) {
            if (z) {
                textView.setText(C0966R.string.khs);
            } else {
                textView.setText(C0966R.string.khr);
            }
            this.f317927r.clearAnimation();
            this.f317927r.setVisibility(0);
        }
    }

    /* renamed from: Z */
    public void mo152888Z(int i, int i2) {
        TextView textView = this.f317954L;
        if (textView != null) {
            textView.setText(i);
            this.f317954L.setVisibility(0);
            this.f317954L.sendAccessibilityEvent(128);
            this.f317954L.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            this.f317954L.setBackgroundResource(C0966R.C0969drawable.ce_);
            this.f317954L.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f317954L.setCompoundDrawablePadding(0);
            this.f317918f.removeCallbacks(this.f317961T);
            if (-1 != i2) {
                this.f317918f.postDelayed(this.f317961T, (long) i2);
            }
        }
    }

    /* renamed from: d0 */
    public void mo152889d0(String str) {
        TextView textView = this.f317955M;
        if (textView != null) {
            textView.setVisibility(0);
            this.f317955M.setText(str);
            this.f317955M.sendAccessibilityEvent(128);
        }
    }

    /* renamed from: e0 */
    public void mo152890e0() {
        MTimerHandler mTimerHandler = this.f317957P;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f317957P = null;
        }
        super.mo152890e0();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cd5;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        View view2;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f317920h = (ImageView) this.f317919g.findViewById(C0966R.C0970id.lc8);
        this.f317953K = (TextView) this.f317919g.findViewById(C0966R.C0970id.ldr);
        this.f317954L = (TextView) this.f317919g.findViewById(C0966R.C0970id.ldm);
        this.f317955M = (TextView) this.f317919g.findViewById(C0966R.C0970id.ldq);
        this.f317927r = (TextView) this.f317919g.findViewById(C0966R.C0970id.f359525ld0);
        ImageView imageView = (ImageView) this.f317919g.findViewById(C0966R.C0970id.f356907for);
        this.f317928s = imageView;
        imageView.setImageDrawable(C74933u4.m89768e(MMApplicationContext.getContext(), C0966R.raw.icons_filled_arrow, -1));
        this.f317953K.setImportantForAccessibility(1);
        if (C90188n0.f258920N) {
            this.f317958Q = (TextView) this.f317919g.findViewById(C0966R.C0970id.f357937ck2);
        }
        int c = C76912y0.m92764c(getActivity());
        C106444e0 e0Var = this.f317911B;
        if (!(e0Var == null || (view2 = e0Var.f317976b) == null)) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin += c;
            view2.setLayoutParams(layoutParams2);
        }
        C106475y yVar = this.f317935z;
        if (!(yVar == null || (view = yVar.f318029h) == null)) {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            layoutParams4.topMargin += c;
            view.setLayoutParams(layoutParams4);
        }
        C106476z zVar = this.f317913D;
        if (zVar != null && this.f317917e) {
            if (zVar.f318041k == 2) {
                mo152888Z(C0966R.string.ken, 10000);
            }
        }
        this.f317957P = new MTimerHandler(Looper.myLooper(), this.f317960S, true);
        mo152884T(this.f317923n, this.f317924o);
        return this.f317919g;
    }

    public void onDestroy() {
        this.f317956N = false;
        super.onDestroy();
    }

    /* renamed from: v */
    public void mo152898v(C112390a.C112392b bVar, Bundle bundle) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        super.mo152898v(bVar, bundle);
        int ordinal = bVar.ordinal();
        if (ordinal == 5) {
            C115669n.INSTANCE.mo160131h(11619, 3);
        } else if (ordinal == 6) {
            WeakReference<C106448g> weakReference = this.f317931v;
            if (weakReference != null && weakReference.get() != null && this.f317931v.get().mo152482o() && this.f317913D != null) {
                mo152888Z(C0966R.string.kfc, -1);
                FrameLayout frameLayout3 = this.f317913D.f318038h;
                if (frameLayout3 != null) {
                    frameLayout3.setEnabled(false);
                }
            }
        } else if (ordinal == 7) {
            C115669n.INSTANCE.mo160140o(11526, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 2);
            WeakReference<C106448g> weakReference2 = this.f317931v;
            if (weakReference2 != null && weakReference2.get() != null && this.f317931v.get().mo152425F()) {
                C106475y yVar = this.f317935z;
                if (yVar != null) {
                    yVar.mo153040d();
                }
                this.f317953K.setVisibility(8);
                C106476z zVar = this.f317913D;
                if (zVar != null && (frameLayout = zVar.f318038h) != null) {
                    frameLayout.setEnabled(false);
                }
            }
        } else if (ordinal == 8) {
            C115669n.INSTANCE.mo160140o(11526, true, true, Integer.valueOf(C109247e.xx0().mo152615n()), Long.valueOf(C109247e.xx0().mo152616o()), Long.valueOf(C109247e.xx0().mo152617p()), 5);
            WeakReference<C106448g> weakReference3 = this.f317931v;
            if (weakReference3 != null && weakReference3.get() != null && this.f317931v.get().mo152486q()) {
                C106476z zVar2 = this.f317913D;
                if (!(zVar2 == null || (frameLayout2 = zVar2.f318038h) == null)) {
                    frameLayout2.setEnabled(false);
                }
                mo152888Z(C0966R.string.kib, -1);
                VoipBaseFragment.C106436g gVar = this.f317930u;
                if (gVar != null) {
                    gVar.mo152925f0(true, false);
                }
            }
        }
    }
}
