package qj1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.C0120a0;
import cl1.C0700z;
import cl1.C54991o;
import cl1.C54994o1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import gy3.C87412m;
import nj3.C11192z0;
import nj3.C76912y0;
import ok1.C62042e;
import te3.C49712hj1;
import wg1.C53168x;
import wg1.C65982b3;
import wg1.C65996e3;
import wg1.C65997e4;
import wg1.C66002f3;
import wg1.C66009f4;

/* renamed from: qj1.qh */
public final class C62943qh extends C62660c {

    /* renamed from: p */
    public final C58124b f178609p;

    /* renamed from: q */
    public final String f178610q = "Finder.FinderLiveVisitorMusicSingSongListPlugin";

    /* renamed from: r */
    public C65997e4 f178611r;

    /* renamed from: s */
    public C66009f4 f178612s;

    /* renamed from: qj1.qh$b */
    public static final class C12630b<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f36194d;

        public C12630b(ViewGroup viewGroup) {
            this.f36194d = viewGroup;
        }

        public void onChanged(Object obj) {
            if (C87412m.m108589b((Boolean) obj, Boolean.TRUE)) {
                Context context = this.f36194d.getContext();
                String string = this.f36194d.getContext().getResources().getString(C0966R.string.f360697mc1);
                int i = C76912y0.f224770h;
                Toast makeText = Toast.makeText(context, "", 0);
                View inflate = View.inflate(context, C0966R.C0971layout.f6796os, (ViewGroup) null);
                ((WeImageView) inflate.findViewById(C0966R.C0970id.kpx)).setImageResource(C0966R.raw.icon_song_filled);
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kpy);
                textView.setText(string);
                textView.getViewTreeObserver().addOnGlobalLayoutListener(new C11192z0(textView, context));
                makeText.setGravity(17, 0, 0);
                makeText.setView(inflate);
                makeText.show();
            }
        }
    }

    /* renamed from: qj1.qh$a */
    public static final class C62944a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C62943qh f178613d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f178614e;

        public C62944a(C62943qh qhVar, ViewGroup viewGroup) {
            this.f178613d = qhVar;
            this.f178614e = viewGroup;
        }

        public void onChanged(Object obj) {
            String str = (String) obj;
            if (!(str == null || str.length() == 0)) {
                C62042e eVar = C62042e.f176370a;
                if (eVar.mo87092k1(this.f178613d.mo87684A0())) {
                    String str2 = this.f178613d.f178610q;
                    Log.m105924i(str2, "visitor openSongList songName: " + str);
                    FinderLiveService.f159376d.getClass();
                    if (!FinderLiveService.f159380h && eVar.mo87092k1(this.f178613d.mo87684A0())) {
                        this.f178613d.mo10792g(0);
                        C65997e4 e4Var = this.f178613d.f178611r;
                        if (e4Var != null) {
                            C65982b3 b3Var = (C65982b3) e4Var;
                            C53168x.C53169a.m59582a(b3Var, false, new C65996e3(b3Var), 1, (Object) null);
                            C66009f4 f4Var = b3Var.f189712h;
                            if (f4Var != null) {
                                f4Var.mo90038g(true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                String str3 = this.f178613d.f178610q;
                Log.m105924i(str3, "visitor songList closed songName: " + str);
                C76912y0.m92767f(this.f178614e.getContext(), this.f178614e.getContext().getResources().getString(C0966R.string.mbs));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62943qh(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178609p = bVar;
        ((C54994o1) mo87684A0().mo71262a(C54994o1.class)).f154401h.observe(this, new C62944a(this, viewGroup));
        ((C0700z) mo87684A0().mo71262a(C0700z.class)).f1662n.observe(this, new C12630b(viewGroup));
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        if (this.f178611r == null || this.f178612s == null) {
            Context context = this.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            this.f178611r = new C65982b3(context, mo87684A0(), this.f178609p, this);
            ViewGroup viewGroup = this.f166287d;
            Context context2 = viewGroup.getContext();
            C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            this.f178612s = new C66002f3(viewGroup, (MMActivity) context2, mo87684A0(), this.f178611r);
        }
        C65997e4 e4Var = this.f178611r;
        if (e4Var != null) {
            C66009f4 f4Var = this.f178612s;
            C87412m.m108591d(f4Var);
            e4Var.onAttach(f4Var);
        }
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        LiveBottomSheetPanel liveBottomSheetPanel;
        if (this.f166287d.getVisibility() != 0) {
            return false;
        }
        C66009f4 f4Var = this.f178612s;
        if (f4Var == null || (liveBottomSheetPanel = ((C66002f3) f4Var).f189758n) == null) {
            return true;
        }
        liveBottomSheetPanel.mo78802a();
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 2;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 93) {
            mo10792g(0);
            C65997e4 e4Var = this.f178611r;
            if (e4Var != null) {
                C65982b3 b3Var = (C65982b3) e4Var;
                C53168x.C53169a.m59582a(b3Var, false, new C65996e3(b3Var), 1, (Object) null);
                C66009f4 f4Var = b3Var.f189712h;
                if (f4Var != null) {
                    f4Var.mo90038g(true);
                }
            }
        } else if (ordinal == 94) {
            mo10792g(8);
        }
    }
}
