package qj1;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import c50.C54655b;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import nj3.C76912y0;
import ok1.C62042e;
import org.libpag.PAGView;
import sn0.C90259e;
import te3.C49712hj1;
import wg1.C15334p0;
import wg1.C15338q0;
import wg1.C15345r0;
import wg1.C66065o0;
import wg1.C66096w;

/* renamed from: qj1.z2 */
public final class C12765z2 extends C62660c implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    /* renamed from: p */
    public final C58124b f36558p;

    /* renamed from: q */
    public final String f36559q = "Finder.FinderLiveAnchorMusicVolumePlugin";

    /* renamed from: r */
    public int f36560r = 1;

    /* renamed from: s */
    public GestureDetector f36561s;

    /* renamed from: t */
    public boolean f36562t = C62042e.f176370a.mo86991B(mo87684A0());

    /* renamed from: u */
    public C62987t2 f36563u;

    /* renamed from: v */
    public C12657s2 f36564v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12765z2(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f36558p = bVar;
    }

    /* renamed from: Z0 */
    public final void mo12305Z0() {
        if (!mo12306a1() || this.f36560r != 1) {
            mo10792g(8);
            return;
        }
        if (this.f36561s == null) {
            GestureDetector gestureDetector = new GestureDetector(this.f166287d.getContext(), this);
            this.f36561s = gestureDetector;
            gestureDetector.setOnDoubleTapListener(this);
            this.f166287d.setOnTouchListener(new C12757y2(this));
        }
        mo10792g(0);
    }

    /* renamed from: a1 */
    public final boolean mo12306a1() {
        Class cls = C54991o.class;
        C54655b b = FinderLiveService.f159376d.mo77626b();
        Boolean valueOf = b != null ? Boolean.valueOf(b.f172995G) : null;
        String str = this.f36559q;
        Log.m105924i(str, "enableVolumeGesture isPlayingBgMusic:" + valueOf + ", enableMusic:" + this.f36562t + ", liveStatus:" + ((C54991o) mo87696x0(cls)).f154295b1);
        return this.f36562t && C87412m.m108589b(valueOf, Boolean.TRUE) && ((C54991o) mo87696x0(cls)).mo75999e4();
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: m0 */
    public void mo11992m0(LinkedHashMap<String, Rect> linkedHashMap) {
        C87412m.m108594g(linkedHashMap, "micUserMap");
        this.f36560r = linkedHashMap.size();
        mo12305Z0();
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMusicVolumePlugin", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMusicVolumePlugin", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMusicVolumePlugin", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMusicVolumePlugin", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C66096w wVar;
        Class cls = C54991o.class;
        if (this.f36564v == null) {
            this.f36564v = (C12657s2) mo87687E0(C12657s2.class);
        }
        C12657s2 s2Var = this.f36564v;
        if (s2Var != null && s2Var.f36253u) {
            TextView textView = s2Var.f36252t;
            if (textView != null && textView.getVisibility() == 0) {
                Log.m105924i(s2Var.f36249q, "hideGuideView");
                PAGView pAGView = s2Var.f36251s;
                if (pAGView != null) {
                    pAGView.stop();
                }
                PAGView pAGView2 = s2Var.f36251s;
                if (pAGView2 != null) {
                    pAGView2.setVisibility(8);
                }
                TextView textView2 = s2Var.f36252t;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                s2Var.mo10792g(8);
            }
        }
        boolean g4 = ((C54991o) mo87696x0(cls)).mo76003g4();
        if (mo12306a1() && !g4) {
            if (this.f36563u == null) {
                this.f36563u = (C62987t2) mo87687E0(C62987t2.class);
            }
            C62987t2 t2Var = this.f36563u;
            if (!(t2Var == null || (wVar = t2Var.f178717r) == null)) {
                C66065o0 o0Var = (C66065o0) wVar;
                if (((C54991o) o0Var.f189935f.mo71262a(cls)).f154239P2) {
                    SeekBar seekBar = o0Var.f189926C;
                    if (seekBar != null) {
                        String str = o0Var.f189937h;
                        Log.m105924i(str, "recoveryVolume recoveryVolume:" + ((C54991o) o0Var.f189935f.mo71262a(cls)).f154235O2 + ", progress:" + seekBar.getProgress());
                        int i = ((C54991o) o0Var.f189935f.mo71262a(cls)).f154235O2;
                        if (i >= 0 && i < 101) {
                            ((C54991o) o0Var.f189935f.mo71262a(cls)).f154239P2 = false;
                            seekBar.setProgress(((C54991o) o0Var.f189935f.mo71262a(cls)).f154235O2);
                            C76912y0.m92766e(o0Var.f189933d.getContext(), o0Var.f189933d.getContext().getResources().getString(C0966R.string.f360532dg2), C15345r0.f41685a);
                        }
                    }
                } else {
                    SeekBar seekBar2 = o0Var.f189926C;
                    if (seekBar2 != null) {
                        String str2 = o0Var.f189937h;
                        Log.m105924i(str2, "miniVolume seerBar progress:" + seekBar2.getProgress());
                        if (seekBar2.getProgress() > 5) {
                            ((C54991o) o0Var.f189935f.mo71262a(cls)).f154239P2 = true;
                            seekBar2.setProgress(5);
                            C76912y0.m92766e(o0Var.f189933d.getContext(), o0Var.f189933d.getContext().getResources().getString(C0966R.string.dfy), C15334p0.f41665a);
                        } else {
                            C76912y0.m92766e(o0Var.f189933d.getContext(), o0Var.f189933d.getContext().getResources().getString(C0966R.string.dfz), C15338q0.f41672a);
                        }
                    }
                }
            }
        } else if (g4) {
            Log.m105924i(this.f36559q, "onSingleTapConfirmed isMicLinking!");
        }
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMusicVolumePlugin", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMusicVolumePlugin", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
