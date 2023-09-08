package fh1;

import android.graphics.Point;
import android.text.Editable;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import cj1.C0581o5;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.plugin.finder.live.infrastructure.coroutine.C55908a;
import com.tencent.p014mm.plugin.finder.live.view.C3206b2;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.replay.bullet.LiveDanmakuView;
import com.tencent.p014mm.plugin.finder.view.C41573e3;
import com.tencent.p014mm.plugin.finder.view.C56589c7;
import com.tencent.p014mm.plugin.finder.view.C56594d7;
import com.tencent.p014mm.plugin.finder.view.C56600e7;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import fj1.C45795b;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import ky2.C10432i;
import nj3.C76875f0;
import o40.C61926c;
import ok1.C62042e;
import p001ak.C54053a;
import p006bk.C54479b;
import p006bk.C54484g;
import p464ck.C54869f;
import p50.C62193a;
import p848dk.C58297b;
import p848dk.C58306h;
import p871zj.C66846j;
import qj1.C12322e5;
import qj1.C62660c;
import rx3.C36570n;
import te3.C49765hx0;
import wk1.C15440n;
import wo1.C15570j;
import wo1.C66145c;
import wo1.C66154f;
import wo1.C66156i;
import wo1.C66157k;

/* renamed from: fh1.q0 */
public final class C59070q0 implements C66846j.C66848b {

    /* renamed from: a */
    public final /* synthetic */ C59046m0 f169005a;

    /* renamed from: b */
    public final /* synthetic */ C66156i f169006b;

    public C59070q0(C59046m0 m0Var, C66156i iVar) {
        this.f169005a = m0Var;
        this.f169006b = iVar;
    }

    /* renamed from: a */
    public void mo84284a(C54053a<?, ?> aVar, C58306h hVar, C58297b bVar) {
        C12322e5 e5Var;
        View view;
        C0581o5 o5Var;
        View anchorView;
        View anchorView2;
        boolean z;
        C54053a<?, ?> aVar2 = aVar;
        C58306h hVar2 = hVar;
        C87412m.m108594g(aVar2, "danmaku");
        C87412m.m108594g(hVar2, "touchPoint");
        C87412m.m108594g(bVar, "clickResult");
        C66157k kVar = aVar2 instanceof C66157k ? (C66157k) aVar2 : null;
        C62660c d3 = this.f169005a.mo9307d3(C12322e5.class);
        C66156i iVar = this.f169006b;
        C59046m0 m0Var = this.f169005a;
        if (kVar != null && d3 != null) {
            C12322e5 e5Var2 = (C12322e5) d3;
            DATA data = kVar.f151367x;
            C87412m.m108592e(data, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.model.IFinderLiveMsg");
            C0581o5 o5Var2 = (C0581o5) data;
            C54869f.C54870a aVar3 = kVar.f151373E;
            C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.replay.bullet.LiveDanmakuRender.BulletViewHolder");
            C15570j.C15571a aVar4 = (C15570j.C15571a) aVar3;
            Log.m105924i(iVar.f190154k, "danmakuClick point:" + hVar2 + ",content size:[" + aVar2.f151363t + '-' + aVar2.f151364u + "],likePosition:[" + aVar4.f42186i.getLeft() + ',' + aVar4.f42186i.getTop() + '-' + aVar4.f42186i.getRight() + ',' + aVar4.f42186i.getBottom() + "],content msg(" + o5Var2.hashCode() + ")=[nickname:" + o5Var2.mo573g() + ",content:" + o5Var2.getContent() + "}]");
            if (C59046m0.m68967n3(hVar2, aVar4.f42186i)) {
                C59046m0.m68966m3(m0Var, o5Var2, aVar4.f42186i, kVar);
                return;
            }
            if (o5Var2.getType() == 20035 && C59046m0.m68967n3(hVar2, aVar4.f42184g)) {
                TextView textView = aVar4.f42184g;
                Editable newEditable = new Editable.Factory().newEditable(textView.getText());
                int offsetForPosition = textView.getOffsetForPosition((((float) hVar2.f166949b.x) - hVar2.f166951d) - ((float) textView.getLeft()), ((float) hVar2.f166949b.y) - hVar2.f166952e);
                if (offsetForPosition >= 0 && offsetForPosition < textView.getText().length()) {
                    char charAt = textView.getText().charAt(offsetForPosition);
                    Log.m105924i(m0Var.f168949j, "click offset:" + offsetForPosition + ", offsetContent:" + charAt + '!');
                    Object[] spans = newEditable.getSpans(0, newEditable.length(), ClickableSpan.class);
                    C87412m.m108593f(spans, "editable.getSpans(0, edi…lickableSpan::class.java)");
                    int length = spans.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        ClickableSpan clickableSpan = (ClickableSpan) spans[i];
                        int spanStart = newEditable.getSpanStart(clickableSpan);
                        Object[] objArr = spans;
                        int spanEnd = newEditable.getSpanEnd(clickableSpan);
                        if (offsetForPosition >= spanStart && offsetForPosition <= spanEnd) {
                            Log.m105924i(m0Var.f168949j, "click offset:" + offsetForPosition + " hit span " + clickableSpan + '!');
                            clickableSpan.onClick(textView);
                            z = true;
                            break;
                        }
                        i++;
                        spans = objArr;
                    }
                }
                z = false;
                if (z) {
                    return;
                }
            }
            View view2 = aVar4.f42181d;
            View view3 = aVar4.f42186i;
            m0Var.getClass();
            long j = hVar2.f166948a;
            float f = kVar.f151351h - ((float) C54479b.m61196c().f152758e);
            C12322e5 e5Var3 = e5Var2;
            long j2 = kVar.f151346c;
            float f2 = f - (((float) (j - j2)) * kVar.f151372D);
            if (f2 > 0.0f) {
                C15440n nVar = C15440n.f41895a;
                float i2 = ((float) nVar.mo14260i()) + f2;
                view = view2;
                e5Var = e5Var3;
                o5Var = o5Var2;
                kVar.f151346c -= (long) ((((float) nVar.mo14260i()) + f2) / kVar.f151372D);
                Log.m105924i(m0Var.f168949j, "tryShowEntireDanmaku waitToShowWidth:" + f2 + ",forwardDistance:" + i2 + ",sourceFirstDrawTime:" + j2 + ",after forward firstDrawTime:" + kVar.f151346c);
                kVar.f151366w = true;
                C66154f fVar = m0Var.f168953q;
                if (fVar != null) {
                    ((C66145c) fVar).mo90203k().mo90845d();
                }
                float f3 = hVar2.f166952e;
                hVar2.f166951d -= i2;
                hVar2.f166952e = f3;
            } else {
                view = view2;
                e5Var = e5Var3;
                o5Var = o5Var2;
                Log.m105924i(m0Var.f168949j, "tryShowEntireDanmaku waitToShowWidth:" + f2);
            }
            int[] iArr = new int[2];
            LiveDanmakuView liveDanmakuView = m0Var.f168952p;
            if (!(liveDanmakuView == null || (anchorView2 = liveDanmakuView.getAnchorView()) == null)) {
                anchorView2.getLocationInWindow(iArr);
            }
            int i3 = (int) (((float) iArr[0]) + hVar2.f166951d + (kVar.f151363t / 2.0f));
            int i4 = (int) (((float) iArr[1]) + hVar2.f166952e + kVar.f151364u);
            C54869f.C54870a aVar5 = kVar.f151373E;
            C87412m.m108592e(aVar5, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.replay.bullet.LiveDanmakuRender.BulletViewHolder");
            C15570j.C15571a aVar6 = (C15570j.C15571a) aVar5;
            String f4 = o5Var.mo572f();
            if (f4 == null) {
                f4 = "";
            }
            aVar6.mo14336e(true, f4, o5Var);
            kVar.f151360q = true;
            kVar.f151366w = true;
            C66154f fVar2 = m0Var.f168953q;
            if (fVar2 != null) {
                ((C66145c) fVar2).mo90203k().mo90845d();
            }
            C61926c.m72667L(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, (Runnable) ((C36570n) m0Var.f168955s).getValue());
            C3206b2 b2Var = m0Var.f27261e;
            C56032b bVar2 = b2Var instanceof C56032b ? (C56032b) b2Var : null;
            C55908a viewScope = bVar2 != null ? bVar2.getViewScope() : null;
            LiveDanmakuView liveDanmakuView2 = m0Var.f168952p;
            View view4 = (liveDanmakuView2 == null || (anchorView = liveDanmakuView2.getAnchorView()) == null) ? view : anchorView;
            C45795b liveRoomData = m0Var.getStore().getLiveRoomData();
            C59080t0 t0Var = new C59080t0(m0Var, aVar6, o5Var, kVar);
            C59082u0 u0Var = new C59082u0(m0Var, o5Var, view3, kVar);
            Class cls = C54991o.class;
            C12322e5 e5Var4 = e5Var;
            ViewGroup viewGroup = e5Var4.f166287d;
            C49765hx0 i5 = o5Var.mo579i();
            int i6 = i5 != null ? i5.f134926n : 1;
            boolean z2 = (i6 == 3 || i6 == 4) ? false : true;
            int type = o5Var.getType();
            boolean z3 = type == 100000 || type == 20036;
            if ((C62042e.f176370a.mo87027N0() || ((C54991o) liveRoomData.mo71262a(cls)).f154190D) && (o5Var.getType() == 1 || o5Var.getType() == 20002 || o5Var.getType() == 20035 || o5Var.getType() == 1000066 || z3)) {
                boolean z4 = z3;
                Log.m105924i(m0Var.f168949j, "showPopupWindow anchor,msg:" + o5Var.mo573g() + XVFSFile.PATH_SEPARATOR_CHAR + o5Var.getContent() + ",pos:" + i3 + '-' + i4);
                C41573e3 e3Var = C41573e3.f111902a;
                C87412m.m108594g(liveRoomData, "buContext");
                e3Var.mo64661d(new C56589c7(liveRoomData, o5Var, z4, z2, o5Var.mo571e()), new C8089v0(u0Var, o5Var, liveRoomData, viewScope, view3, e5Var4, viewGroup), t0Var, new C41573e3.C41574a(view4, new C41573e3.C41575b(new Point(i3, i4), true), o5Var.mo579i(), ((C54991o) liveRoomData.mo71262a(cls)).f154190D, false, false, (String) null, (String) null, 240, (C8480h) null), new C41573e3.C41576c(z4 ^ true, (C76875f0) null, false));
            } else if (!((C54991o) liveRoomData.mo71262a(cls)).mo76001f4() || !(o5Var.getType() == 1 || o5Var.getType() == 20002 || o5Var.getType() == 20035 || o5Var.getType() == 1000066 || z3)) {
                C59080t0 t0Var2 = t0Var;
                C62193a.C62194a aVar7 = C62193a.f176816k1;
                C59046m0 m0Var2 = m0Var;
                if (!C62193a.f176817l1.containsKey(Long.valueOf(((C55001u) liveRoomData.mo71262a(C55001u.class)).f154420q.f182392d)) || ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e() || !(o5Var.getType() == 1 || o5Var.getType() == 20002 || o5Var.getType() == 20035 || o5Var.getType() == 1000066)) {
                    t0Var2.onDismiss();
                    return;
                }
                Log.m105924i(m0Var2.f168949j, "showPopupWindow visitor,msg:" + o5Var.mo573g() + XVFSFile.PATH_SEPARATOR_CHAR + o5Var.getContent() + ",pos:" + i3 + '-' + i4);
                C41573e3.f111902a.mo64661d(new C56600e7(o5Var, liveRoomData), new C8093x0(u0Var, o5Var, liveRoomData, viewScope, view3, e5Var4, viewGroup), t0Var2, new C41573e3.C41574a(view4, new C41573e3.C41575b(new Point(i3, i4), true), o5Var.mo579i(), false, true, false, (String) null, (String) null, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, (C8480h) null), new C41573e3.C41576c(((C54991o) liveRoomData.mo71262a(cls)).f154382x ^ true, (C76875f0) null, false));
            } else {
                Log.m105924i(m0Var.f168949j, "showPopupWindow manager,msg:" + o5Var.mo573g() + XVFSFile.PATH_SEPARATOR_CHAR + o5Var.getContent() + ",pos:" + i3 + '-' + i4);
                C41573e3.f111902a.mo64661d(new C56594d7(liveRoomData, z3, o5Var, o5Var.mo571e()), new C8091w0(u0Var, liveRoomData, viewScope, view3, e5Var4, viewGroup, o5Var), t0Var, new C41573e3.C41574a(view4, new C41573e3.C41575b(new Point(i3, i4), true), o5Var.mo579i(), ((C54991o) liveRoomData.mo71262a(cls)).f154190D, false, false, (String) null, (String) null, 240, (C8480h) null), new C41573e3.C41576c(z3 ^ true, (C76875f0) null, false));
            }
        }
    }

    /* renamed from: b */
    public void mo84285b(List<C54053a<Object, C54484g>> list) {
    }

    /* renamed from: c */
    public void mo84286c(boolean z) {
    }
}
