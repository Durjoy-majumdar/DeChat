package l52;

import a14.C0000n0;
import a14.C0002w;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39629l0;
import androidx.lifecycle.C54209k0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f14.C58901s;
import gy3.C87412m;
import i70.C87667c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import o52.C61944e;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: l52.d */
public final class C61224d extends UIComponent {

    /* renamed from: d */
    public MagicBrushSclDemoView f174275d;

    /* renamed from: e */
    public final C61944e f174276e;

    /* renamed from: f */
    public C0000n0 f174277f;

    /* renamed from: l52.d$a */
    public static final class C61225a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C61224d f174278d;

        public C61225a(C61224d dVar) {
            this.f174278d = dVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/magicbrush/scldemo/component/MagicBrushSclDemoUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C61224d dVar = this.f174278d;
            if (dVar.f174277f == null) {
                C0002w a = C53959v2.m60598a((C53973z1) null, 1, (Object) null);
                C53896h0 h0Var = C53872d1.f151117a;
                dVar.f174277f = C53930o0.m60554a(((C53884f2) a).plus(C58901s.f168555a));
            }
            MagicBrushSclDemoView magicBrushSclDemoView = dVar.f174275d;
            if (magicBrushSclDemoView != null) {
                magicBrushSclDemoView.setVisibility(0);
                MagicBrushSclDemoView magicBrushSclDemoView2 = dVar.f174275d;
                if (magicBrushSclDemoView2 != null) {
                    C39818r rVar = C39818r.f106831a;
                    magicBrushSclDemoView2.f157377h = ((C10463b) rVar.mo62444c(dVar.getActivity()).mo75002a(C10463b.class)).mo10777d3();
                    C61217a aVar = (C61217a) rVar.mo62444c(dVar.getActivity()).mo75002a(C61217a.class);
                    C0000n0 n0Var = dVar.f174277f;
                    if (n0Var != null) {
                        C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C61223c(dVar, (C15601d<? super C61223c>) null), 3, (Object) null);
                    }
                    C117292a.m165361g(this, "com/tencent/mm/plugin/magicbrush/scldemo/component/MagicBrushSclDemoUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C87412m.m108603p("frameSetView");
                throw null;
            }
            C87412m.m108603p("frameSetView");
            throw null;
        }
    }

    /* renamed from: l52.d$b */
    public static final class C61226b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C61224d f174279d;

        public C61226b(C61224d dVar) {
            this.f174279d = dVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/magicbrush/scldemo/component/MagicBrushSclDemoUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C61224d dVar = this.f174279d;
            C0000n0 n0Var = dVar.f174277f;
            if (n0Var == null) {
                C0002w a = C53959v2.m60598a((C53973z1) null, 1, (Object) null);
                C53896h0 h0Var = C53872d1.f151117a;
                dVar.f174277f = C53930o0.m60554a(((C53884f2) a).plus(C58901s.f168555a));
                MagicBrushSclDemoView magicBrushSclDemoView = dVar.f174275d;
                if (magicBrushSclDemoView != null) {
                    magicBrushSclDemoView.setVisibility(0);
                    MagicBrushSclDemoView magicBrushSclDemoView2 = dVar.f174275d;
                    if (magicBrushSclDemoView2 != null) {
                        C39818r rVar = C39818r.f106831a;
                        magicBrushSclDemoView2.f157377h = ((C10463b) rVar.mo62444c(dVar.getActivity()).mo75002a(C10463b.class)).mo10777d3();
                        C61217a aVar = (C61217a) rVar.mo62444c(dVar.getActivity()).mo75002a(C61217a.class);
                        C0000n0 n0Var2 = dVar.f174277f;
                        if (n0Var2 != null) {
                            C53895h.m60466d(n0Var2, (C66212f) null, (C53934p0) null, new C61229f(dVar, (C15601d<? super C61229f>) null), 3, (Object) null);
                        }
                    } else {
                        C87412m.m108603p("frameSetView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("frameSetView");
                    throw null;
                }
            } else {
                C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C61228e(dVar, (C15601d<? super C61228e>) null), 3, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/magicbrush/scldemo/component/MagicBrushSclDemoUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: l52.d$c */
    public static final class C61227c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C61224d f174280d;

        public C61227c(C61224d dVar) {
            this.f174280d = dVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/magicbrush/scldemo/component/MagicBrushSclDemoUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MagicBrushSclDemoView magicBrushSclDemoView = this.f174280d.f174275d;
            if (magicBrushSclDemoView != null) {
                magicBrushSclDemoView.mo76548e();
                C61224d dVar = this.f174280d;
                MagicBrushSclDemoView magicBrushSclDemoView2 = dVar.f174275d;
                if (magicBrushSclDemoView2 != null) {
                    magicBrushSclDemoView2.f157377h = ((C10463b) C39818r.f106831a.mo62444c(dVar.getActivity()).mo75002a(C10463b.class)).mo10777d3();
                    MagicBrushSclDemoView magicBrushSclDemoView3 = this.f174280d.f174275d;
                    if (magicBrushSclDemoView3 != null) {
                        ViewGroup.LayoutParams layoutParams = magicBrushSclDemoView3.getLayoutParams();
                        layoutParams.height = 1;
                        MagicBrushSclDemoView magicBrushSclDemoView4 = this.f174280d.f174275d;
                        if (magicBrushSclDemoView4 != null) {
                            magicBrushSclDemoView4.setLayoutParams(layoutParams);
                            this.f174280d.mo86195c3();
                            C117292a.m165361g(this, "com/tencent/mm/plugin/magicbrush/scldemo/component/MagicBrushSclDemoUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                        C87412m.m108603p("frameSetView");
                        throw null;
                    }
                    C87412m.m108603p("frameSetView");
                    throw null;
                }
                C87412m.m108603p("frameSetView");
                throw null;
            }
            C87412m.m108603p("frameSetView");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61224d(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39629l0.m42233a(appCompatActivity, (C54209k0.C54210b) null).mo75002a(C61944e.class);
        C87412m.m108593f(a, "of(activity).get(MagicBr…emoViewModel::class.java)");
        this.f174276e = (C61944e) a;
    }

    /* renamed from: c3 */
    public final void mo86195c3() {
        C0000n0 n0Var = this.f174277f;
        if (n0Var != null) {
            C53930o0.m60556c(n0Var, (CancellationException) null);
        }
        this.f174277f = null;
        MagicBrushSclDemoView magicBrushSclDemoView = this.f174275d;
        if (magicBrushSclDemoView != null) {
            magicBrushSclDemoView.setVisibility(4);
            C61217a aVar = (C61217a) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C61217a.class);
            C87667c<?, ?>.a aVar2 = aVar.f174260d;
            if (aVar2 != null) {
                aVar.f174262f.mo122097y0(aVar2.f253930e);
                aVar.f174262f.mo118861j0();
                return;
            }
            return;
        }
        C87412m.m108603p("frameSetView");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = getActivity().findViewById(C0966R.C0970id.o86);
        C87412m.m108593f(findViewById, "activity.findViewById(R.id.frame_set)");
        this.f174275d = (MagicBrushSclDemoView) findViewById;
        View findViewById2 = getActivity().findViewById(C0966R.C0970id.ndi);
        C87412m.m108593f(findViewById2, "activity.findViewById(R.id.democontainer)");
        ((FrameLayout) findViewById2).addView(((C61217a) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C61217a.class)).f174263g, new ViewGroup.LayoutParams(-1, -1));
        getActivity().findViewById(C0966R.C0970id.o8o).setOnClickListener(new C61225a(this));
        getActivity().findViewById(C0966R.C0970id.dsp).setOnClickListener(new C61226b(this));
        getActivity().findViewById(C0966R.C0970id.oa7).setOnClickListener(new C61227c(this));
    }

    public void onDestroy() {
        super.onDestroy();
        mo86195c3();
    }
}
