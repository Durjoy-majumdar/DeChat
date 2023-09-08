package hi1;

import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import cl1.C54963d0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import il1.C8961e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import kg3.C76577a;
import l31.C61212e;
import nh1.C61749s;
import nj3.C76912y0;
import ok1.C11471u;
import ok1.C62042e;
import p192l4.C10462b;
import qj1.C62660c;
import rx3.C13598b0;
import te3.C48770aw0;

/* renamed from: hi1.e */
public final class C59914e extends C8961e implements View.OnClickListener {

    /* renamed from: h */
    public final C58124b f171017h;

    /* renamed from: i */
    public final C62660c f171018i;

    /* renamed from: j */
    public C61749s f171019j;

    /* renamed from: n */
    public int f171020n;

    /* renamed from: hi1.e$a */
    public static final class C59915a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59914e f171021d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59915a(C59914e eVar) {
            super(0);
            this.f171021d = eVar;
        }

        public Object invoke() {
            if (!C62042e.f176370a.mo87087i1(this.f171021d.f171018i.mo87684A0(), (LinkedList<C48770aw0>) null)) {
                this.f171021d.mo84843r();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hi1.e$b */
    public static final class C59916b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59914e f171022d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59916b(C59914e eVar) {
            super(0);
            this.f171022d = eVar;
        }

        public Object invoke() {
            if (!C62042e.f176370a.mo87087i1(this.f171022d.f171018i.mo87684A0(), (LinkedList<C48770aw0>) null)) {
                this.f171022d.mo84842q();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59914e(Context context, C58124b bVar, C62660c cVar) {
        super(context, false, (C11471u.C11473b) null, 6, (C8480h) null);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f171017h = bVar;
        this.f171018i = cVar;
    }

    /* renamed from: c */
    public View mo9764c() {
        C32444a aVar = C32444a.f86121a;
        boolean z = true;
        if (C32444a.f86161k.mo60266n().intValue() != 1) {
            z = false;
        }
        if (!z) {
            return null;
        }
        WeImageView weImageView = new WeImageView(this.f28306d);
        weImageView.setIconColor(weImageView.getContext().getResources().getColor(C0966R.color.FG_0));
        weImageView.setLayoutParams(new ViewGroup.LayoutParams(C76577a.m92151b(weImageView.getContext(), 24), C76577a.m92151b(weImageView.getContext(), 24)));
        weImageView.setImageResource(C0966R.raw.icons_outlined_screen_effect_medium);
        return weImageView;
    }

    /* renamed from: g */
    public int mo3425g() {
        return C0966R.C0971layout.f7181rt;
    }

    /* renamed from: j */
    public String mo9449j() {
        C61749s sVar = this.f171019j;
        if (sVar != null) {
            String string = sVar.f175534a.getResources().getString(C0966R.string.f8149oh);
            C87412m.m108593f(string, "viewBinding.root.resourc…isitor_mic_request_title)");
            return string;
        }
        C87412m.m108603p("viewBinding");
        throw null;
    }

    /* renamed from: k */
    public void mo3428k(View view) {
        C87412m.m108594g(view, "rootView");
        int i = C0966R.C0970id.aye;
        WeImageView weImageView = (WeImageView) C10462b.m10395a(view, C0966R.C0970id.aye);
        if (weImageView != null) {
            i = C0966R.C0970id.bdw;
            LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(view, C0966R.C0970id.bdw);
            if (linearLayout != null) {
                i = C0966R.C0970id.l5y;
                WeImageView weImageView2 = (WeImageView) C10462b.m10395a(view, C0966R.C0970id.l5y);
                if (weImageView2 != null) {
                    i = C0966R.C0970id.oph;
                    LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(view, C0966R.C0970id.oph);
                    if (linearLayout2 != null) {
                        this.f171019j = new C61749s((LinearLayout) view, weImageView, linearLayout, weImageView2, linearLayout2);
                        linearLayout2.setOnClickListener(this);
                        C61749s sVar = this.f171019j;
                        if (sVar != null) {
                            sVar.f175535b.setOnClickListener(this);
                            return;
                        } else {
                            C87412m.m108603p("viewBinding");
                            throw null;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: o */
    public void mo9768o() {
        mo9763a();
        this.f171017h.statusChange(C58124b.C58125b.FINDER_LIVE_SHOW_CAMERA_OPT_SHEET, (Bundle) null);
    }

    public void onClick(View view) {
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicRequestPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view2 != null ? Integer.valueOf(view.getId()) : null;
        C61749s sVar = this.f171019j;
        if (sVar != null) {
            int id = sVar.f175536c.getId();
            if (valueOf != null && valueOf.intValue() == id) {
                Log.m105924i("FinderLiveMicRequestPanelWidget", "SHEET_MORE_ACTION_VIDEO_LINK");
                C62042e eVar = C62042e.f176370a;
                Context context = this.f28306d;
                C45795b A0 = this.f171018i.mo87684A0();
                String string = this.f28306d.getString(C0966R.string.f8145od);
                C87412m.m108593f(string, "context.getString(R.stri…terious_dialog_title_mic)");
                String string2 = this.f28306d.getString(C0966R.string.f8143oa);
                C87412m.m108593f(string2, "context.getString(R.stri…sterious_dialog_desc_mic)");
                if (eVar.mo87117t(context, A0, string, string2, new C59915a(this))) {
                    mo9763a();
                    C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicRequestPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                mo84843r();
            } else {
                C61749s sVar2 = this.f171019j;
                if (sVar2 != null) {
                    int id4 = sVar2.f175535b.getId();
                    if (valueOf != null && valueOf.intValue() == id4) {
                        C62042e eVar2 = C62042e.f176370a;
                        Context context2 = this.f28306d;
                        C45795b A02 = this.f171018i.mo87684A0();
                        String string3 = this.f28306d.getString(C0966R.string.f8145od);
                        C87412m.m108593f(string3, "context.getString(R.stri…terious_dialog_title_mic)");
                        String string4 = this.f28306d.getString(C0966R.string.f8143oa);
                        C87412m.m108593f(string4, "context.getString(R.stri…sterious_dialog_desc_mic)");
                        if (eVar2.mo87117t(context2, A02, string3, string4, new C59916b(this))) {
                            mo9763a();
                            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicRequestPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                        mo84842q();
                    }
                } else {
                    C87412m.m108603p("viewBinding");
                    throw null;
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicRequestPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("viewBinding");
        throw null;
    }

    /* renamed from: q */
    public final void mo84842q() {
        Log.m105924i("FinderLiveMicRequestPanelWidget", "SHEET_MORE_ACTION_AUDIO_LINK");
        if (!((C54963d0) this.f171018i.mo87696x0(C54963d0.class)).mo75902I3()) {
            Log.m105924i("FinderLiveMicRequestPanelWidget", "skip apply mic, disable mic");
            C61749s sVar = this.f171019j;
            if (sVar != null) {
                Context context = sVar.f175534a.getContext();
                C61749s sVar2 = this.f171019j;
                if (sVar2 != null) {
                    C76912y0.makeText(context, (CharSequence) sVar2.f175534a.getContext().getResources().getString(C0966R.string.dr9), 0).show();
                } else {
                    C87412m.m108603p("viewBinding");
                    throw null;
                }
            } else {
                C87412m.m108603p("viewBinding");
                throw null;
            }
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_TYPE", 1);
            bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_POSITION", this.f171020n);
            this.f171017h.statusChange(C58124b.C58125b.FINDER_LIVE_LINK_MIC_VISITOR_REQUEST, bundle);
            mo9763a();
            if (this.f171017h.getLiveRole() == 0) {
                C7335d c = C86312j.m106911c(C54116w.class);
                C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w.oy0((C54116w) c, C54067f0.C54085u0.APPLY_AUDIO_LINKMIC, (C54067f0.C54068a0) null, 0, 6, (Object) null);
                C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
                C61749s sVar3 = this.f171019j;
                if (sVar3 != null) {
                    eVar.mo86153W7("finder_live_apply_for_audio_event", sVar3.f175534a, (Map<String, Object>) null, 25561);
                } else {
                    C87412m.m108603p("viewBinding");
                    throw null;
                }
            }
        }
    }

    /* renamed from: r */
    public final void mo84843r() {
        Log.m105924i("FinderLiveMicRequestPanelWidget", "SHEET_MORE_ACTION_VIDEO_LINK");
        if (!((C54963d0) this.f171018i.mo87696x0(C54963d0.class)).mo75902I3()) {
            Log.m105924i("FinderLiveMicRequestPanelWidget", "skip apply mic, disable mic");
            C61749s sVar = this.f171019j;
            if (sVar != null) {
                Context context = sVar.f175534a.getContext();
                C61749s sVar2 = this.f171019j;
                if (sVar2 != null) {
                    C76912y0.makeText(context, (CharSequence) sVar2.f175534a.getContext().getResources().getString(C0966R.string.dr9), 0).show();
                } else {
                    C87412m.m108603p("viewBinding");
                    throw null;
                }
            } else {
                C87412m.m108603p("viewBinding");
                throw null;
            }
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_TYPE", 2);
            bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_POSITION", this.f171020n);
            this.f171017h.statusChange(C58124b.C58125b.FINDER_LIVE_LINK_MIC_VISITOR_REQUEST, bundle);
            mo9763a();
            if (this.f171017h.getLiveRole() == 0) {
                C7335d c = C86312j.m106911c(C54116w.class);
                C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w.oy0((C54116w) c, C54067f0.C54085u0.APPLY_VIDEO_LINKMIC, (C54067f0.C54068a0) null, 0, 6, (Object) null);
                C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
                C61749s sVar3 = this.f171019j;
                if (sVar3 != null) {
                    eVar.mo86153W7("finder_live_apply_for_video_event", sVar3.f175534a, (Map<String, Object>) null, 25561);
                } else {
                    C87412m.m108603p("viewBinding");
                    throw null;
                }
            }
        }
    }
}
