package x82;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitalk.model.C105808j;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.voip.video.render.VoIPRenderTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.ArrayList;
import ky3.C88334c;
import my3.C61595o;
import zt3.C119157j;

/* renamed from: x82.q */
public final class C112113q implements C105808j {

    /* renamed from: d */
    public Context f335665d;

    /* renamed from: e */
    public C112075a f335666e;

    /* renamed from: f */
    public View f335667f;

    /* renamed from: g */
    public C112102l f335668g;

    /* renamed from: h */
    public C112112p f335669h;

    /* renamed from: i */
    public ViewGroup f335670i;

    /* renamed from: j */
    public int f335671j = -1;

    public C112113q(Context context, C112075a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "statusManager");
        this.f335665d = context;
        this.f335666e = aVar;
        this.f335669h = new C112112p(this, aVar);
    }

    /* renamed from: a */
    public void mo150771a(String str, Bitmap bitmap, int i, int i2) {
        C112102l lVar;
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(bitmap, "bm");
        C112102l lVar2 = this.f335668g;
        String str2 = null;
        if ((lVar2 != null ? lVar2.f335635g : null) != null) {
            if (lVar2 != null) {
                str2 = lVar2.f335635g;
            }
            if (!C87412m.m108589b(str, str2)) {
                return;
            }
            if ((C105851w0.zx0().mo150672o().mo150748a(str) == 100 || C105851w0.zx0().mo150672o().mo150748a(str) == 104) && (lVar = this.f335668g) != null) {
                synchronized (lVar) {
                    if (lVar.f335631c == null) {
                        Log.m105920e("MicroMsg.ScreenProjectAvatarCellLayout", "drawVideo view is null");
                    } else if (lVar.f335642n) {
                        Log.m105920e("MicroMsg.ScreenProjectAvatarCellLayout", "renderVideoBitmap img false cause isDoingAnimationChange");
                    } else if (!lVar.mo163817c(str, bitmap, i, i2, 1)) {
                        ImageView imageView = lVar.f335632d;
                        if (imageView != null) {
                            imageView.setVisibility(8);
                        }
                        VoIPRenderTextureView voIPRenderTextureView = lVar.f335631c;
                        if (voIPRenderTextureView != null) {
                            voIPRenderTextureView.setVisibility(0);
                        }
                        lVar.mo163819e(bitmap, i, i2, 1);
                        ((C119157j) C119157j.f356862d).mo183895z(new C112109m(lVar, str));
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo150772b() {
    }

    /* renamed from: c */
    public final void mo163843c(boolean z) {
        C112102l lVar;
        Integer valueOf;
        C112102l lVar2;
        Integer valueOf2;
        boolean z2 = true;
        if (z) {
            C112102l lVar3 = this.f335668g;
            if (lVar3 == null || (valueOf2 = Integer.valueOf(lVar3.f335629a.getVisibility())) == null || valueOf2.intValue() != 0) {
                z2 = false;
            }
            if (!z2 && (lVar2 = this.f335668g) != null) {
                lVar2.mo163820f();
                lVar2.mo163815a(lVar2.f335630b.mo163771b());
                lVar2.f335629a.setAlpha(0.0f);
                lVar2.f335629a.setVisibility(0);
                lVar2.f335629a.clearAnimation();
                lVar2.f335629a.animate().alpha(1.0f).setDuration(300).setListener(new C112111o(lVar2)).start();
                return;
            }
            return;
        }
        C112102l lVar4 = this.f335668g;
        if (lVar4 == null || (valueOf = Integer.valueOf(lVar4.f335629a.getVisibility())) == null || valueOf.intValue() != 4) {
            z2 = false;
        }
        if (!z2 && (lVar = this.f335668g) != null) {
            lVar.f335633e = 0;
            lVar.f335629a.setAlpha(1.0f);
            lVar.f335629a.setVisibility(0);
            lVar.f335629a.clearAnimation();
            lVar.f335629a.animate().alpha(0.0f).setDuration(300).setListener(new C112110n(lVar)).start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f335635g;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo163844d() {
        /*
            r1 = this;
            x82.l r0 = r1.f335668g
            if (r0 == 0) goto L_0x0008
            java.lang.String r0 = r0.f335635g
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            java.lang.String r0 = ""
        L_0x000a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x82.C112113q.mo163844d():java.lang.String");
    }

    /* renamed from: e */
    public final void mo163845e(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "rootView");
        this.f335670i = viewGroup;
        View inflate = View.inflate(this.f335665d, C0966R.C0971layout.bho, viewGroup);
        this.f335667f = inflate;
        RelativeLayout relativeLayout = inflate != null ? (RelativeLayout) inflate.findViewById(C0966R.C0970id.a1z) : null;
        C87412m.m108592e(relativeLayout, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.f335668g = new C112102l(relativeLayout, this.f335666e);
    }

    /* renamed from: f */
    public final boolean mo163846f(ArrayList<String> arrayList) {
        C87412m.m108594g(arrayList, "speakers");
        C112112p pVar = this.f335669h;
        pVar.getClass();
        C112102l lVar = pVar.f335660d.f335668g;
        Long l = null;
        Long l2 = lVar != null ? lVar.f335637i : null;
        String d = l2 == null ? arrayList.get(C61595o.m72299g(C61595o.m72301i(0, arrayList.size()), C88334c.f255322d)) : Util.ticksToNow(l2.longValue()) >= 3000 ? arrayList.contains(pVar.f335660d.mo163844d()) ? pVar.f335660d.mo163844d() : arrayList.get(C61595o.m72299g(C61595o.m72301i(0, arrayList.size()), C88334c.f255322d)) : pVar.f335660d.mo163844d();
        C112102l lVar2 = pVar.f335660d.f335668g;
        if (lVar2 != null) {
            if (d != null) {
                l = Long.valueOf(Util.currentTicks());
            }
            lVar2.f335637i = l;
            lVar2.f335635g = d;
        }
        pVar.f335660d.mo163843c(true);
        return true;
    }

    /* renamed from: g */
    public final void mo163847g() {
        C112112p pVar = this.f335669h;
        C112091e0 e0Var = pVar.f335662f;
        if (e0Var != null) {
            MTimerHandler mTimerHandler = e0Var.f335589b;
            if (mTimerHandler != null) {
                mTimerHandler.removeCallbacksAndMessages((Object) null);
            }
            MTimerHandler mTimerHandler2 = e0Var.f335589b;
            if (mTimerHandler2 != null) {
                mTimerHandler2.stopTimer();
            }
            MTimerHandler mTimerHandler3 = e0Var.f335589b;
            if (mTimerHandler3 != null) {
                mTimerHandler3.quitSafely();
            }
        }
        C105851w0.zx0().mo150676q().mo150845i(pVar);
    }

    public ImageView getAvatarIv() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f335635g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getUsername() {
        /*
            r1 = this;
            x82.l r0 = r1.f335668g
            if (r0 == 0) goto L_0x0008
            java.lang.String r0 = r0.f335635g
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            java.lang.String r0 = ""
        L_0x000a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x82.C112113q.getUsername():java.lang.String");
    }

    /* renamed from: h */
    public final void mo163848h(String str) {
        C112102l lVar;
        C87412m.m108594g(str, "userName");
        C112102l lVar2 = this.f335668g;
        boolean z = true;
        if (lVar2 == null || lVar2.f335633e != 1) {
            z = false;
        }
        if ((!z || !C105851w0.zx0().f314503q.contains(str)) && (lVar = this.f335668g) != null) {
            lVar.mo163818d(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = java.lang.Integer.valueOf(r0.f335629a.getVisibility());
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo163849i(boolean r12) {
        /*
            r11 = this;
            x82.l r0 = r11.f335668g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001b
            android.widget.RelativeLayout r0 = r0.f335629a
            int r0 = r0.getVisibility()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 != 0) goto L_0x0013
            goto L_0x001b
        L_0x0013:
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x001b
            r0 = 1
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = r11.mo163844d()
            boolean r0 = z04.C112551y.m153811k(r0)
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x007e
            x82.l r0 = r11.f335668g
            if (r0 == 0) goto L_0x007e
            x82.a r1 = r0.f335630b
            int r1 = r1.mo163771b()
            r0.mo163815a(r1)
            android.view.View r0 = r0.f335640l
            if (r0 != 0) goto L_0x003b
            goto L_0x007e
        L_0x003b:
            if (r12 == 0) goto L_0x003f
            r12 = 0
            goto L_0x0040
        L_0x003f:
            r12 = 4
        L_0x0040:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r1.mo10233c(r12)
            java.lang.Object[] r4 = r1.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectAvatarCellLayout"
            java.lang.String r6 = "doShowOrHideSpeakerVoice"
            java.lang.String r7 = "(Z)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r0
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r12 = r1.mo10231a(r2)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r0.setVisibility(r12)
            java.lang.String r4 = "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectAvatarCellLayout"
            java.lang.String r5 = "doShowOrHideSpeakerVoice"
            java.lang.String r6 = "(Z)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x82.C112113q.mo163849i(boolean):void");
    }
}
