package rs1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import bl3.C54492n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.loader.FinderAtFeedLoader;
import com.tencent.p014mm.plugin.finder.viewmodel.component.AtFeedSelectStateMachine;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderAtFeedManageUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C24564k0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import je1.C46515d1;
import nj3.C76912y0;
import nr3.C89059e;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C49267ed1;
import te3.C49712hj1;
import te3.C51895wy2;
import tf1.C13916o;

/* renamed from: rs1.y0 */
public final class C13535y0 extends UIComponent {

    /* renamed from: d */
    public String f38374d;

    /* renamed from: e */
    public LinearLayout f38375e;

    /* renamed from: f */
    public TextView f38376f;

    /* renamed from: g */
    public TextView f38377g;

    /* renamed from: h */
    public TextView f38378h;

    /* renamed from: i */
    public Button f38379i;

    /* renamed from: j */
    public AtFeedSelectStateMachine f38380j;

    /* renamed from: rs1.y0$a */
    public static final class C13536a implements AtFeedSelectStateMachine.C4244b {

        /* renamed from: a */
        public final /* synthetic */ C13535y0 f38381a;

        /* renamed from: rs1.y0$a$a */
        public static final class C13537a extends C87413o implements C32226l<C89132b.C89134c<C49267ed1>, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C13535y0 f38382d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13537a(C13535y0 y0Var) {
                super(1);
                this.f38382d = y0Var;
            }

            public Object invoke(Object obj) {
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                StringBuilder sb = new StringBuilder();
                sb.append("NetSceneModMention errType ");
                sb.append(cVar != null ? Integer.valueOf(cVar.f256793a) : null);
                sb.append(", errCode ");
                sb.append(cVar != null ? Integer.valueOf(cVar.f256794b) : null);
                sb.append(", errMsg ");
                sb.append(cVar != null ? cVar.f256795c : null);
                Log.m105924i(C54492n.TAG, sb.toString());
                if (!(cVar != null && cVar.f256793a == 0) || cVar.f256794b != 0) {
                    C76912y0.makeText((Context) this.f38382d.getContext(), (int) C0966R.string.f360469d21, 0).show();
                } else {
                    AtFeedSelectStateMachine atFeedSelectStateMachine = this.f38382d.f38380j;
                    if (atFeedSelectStateMachine != null) {
                        atFeedSelectStateMachine.mo5107a(true);
                    } else {
                        C87412m.m108603p("stateMachine");
                        throw null;
                    }
                }
                return C13598b0.f38549a;
            }
        }

        public C13536a(C13535y0 y0Var) {
            this.f38381a = y0Var;
        }

        /* renamed from: a */
        public void mo5111a(AtFeedSelectStateMachine.C4245c cVar, AtFeedSelectStateMachine.C4243a aVar) {
            C13916o.C13917a aVar2;
            Class cls = FinderAtFeedManageUIC.class;
            C87412m.m108594g(cVar, "state");
            C87412m.m108594g(aVar, "data");
            int ordinal = cVar.ordinal();
            if (ordinal == 1) {
                C13535y0 y0Var = this.f38381a;
                LinearLayout linearLayout = y0Var.f38375e;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                    TextView textView = y0Var.f38376f;
                    if (textView != null) {
                        textView.setVisibility(0);
                        TextView textView2 = y0Var.f38377g;
                        if (textView2 != null) {
                            textView2.setText(y0Var.getContext().getResources().getString(C0966R.string.d0z));
                            TextView textView3 = y0Var.f38378h;
                            if (textView3 != null) {
                                textView3.setVisibility(8);
                                Button button = y0Var.f38379i;
                                if (button != null) {
                                    button.setVisibility(0);
                                    FinderAtFeedManageUIC finderAtFeedManageUIC = (FinderAtFeedManageUIC) C39818r.f106831a.mo62444c(y0Var.getActivity()).mo75002a(cls);
                                    finderAtFeedManageUIC.f18586h.f35000a = true;
                                    finderAtFeedManageUIC.mo5112e3().dispatcher().mo13376a();
                                    return;
                                }
                                C87412m.m108603p("doneBtn");
                                throw null;
                            }
                            C87412m.m108603p("manageText");
                            throw null;
                        }
                        C87412m.m108603p("headerText");
                        throw null;
                    }
                    C87412m.m108603p("cancelText");
                    throw null;
                }
                C87412m.m108603p("backBtn");
                throw null;
            } else if (ordinal == 2) {
                LinkedList linkedList = new LinkedList();
                List<Long> list = aVar.f18572a;
                if (list != null && list.isEmpty()) {
                    List<Long> list2 = aVar.f18573b;
                    if (list2 != null && list2.isEmpty()) {
                        AtFeedSelectStateMachine atFeedSelectStateMachine = this.f38381a.f38380j;
                        if (atFeedSelectStateMachine != null) {
                            atFeedSelectStateMachine.mo5107a(false);
                            return;
                        } else {
                            C87412m.m108603p("stateMachine");
                            throw null;
                        }
                    }
                }
                C13535y0.m12850c3(this.f38381a, linkedList, aVar.f18572a, 0);
                C13535y0.m12850c3(this.f38381a, linkedList, aVar.f18573b, 1);
                C46515d1 d1Var = new C46515d1(0, 0, this.f38381a.f38374d, linkedList, (C49712hj1) null, 16, (C8480h) null);
                d1Var.mo85582k(this.f38381a.getActivity(), "", 100);
                C89059e i = d1Var.mo9225i();
                AppCompatActivity activity = this.f38381a.getActivity();
                C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                i.mo11397F((MMActivity) activity);
                C61926c.m72665J(i, new C13537a(this.f38381a));
            } else if (ordinal == 3) {
                AtFeedSelectStateMachine atFeedSelectStateMachine2 = this.f38381a.f38380j;
                if (atFeedSelectStateMachine2 != null) {
                    atFeedSelectStateMachine2.mo5110d(false);
                    atFeedSelectStateMachine2.mo5109c(AtFeedSelectStateMachine.C4245c.EXIT);
                    ConcurrentHashMap<String, C13916o.C13917a> concurrentHashMap = C13916o.f39110a;
                    AtFeedSelectStateMachine atFeedSelectStateMachine3 = this.f38381a.f38380j;
                    if (atFeedSelectStateMachine3 != null) {
                        C87412m.m108594g(atFeedSelectStateMachine3.f18568d, "idMap");
                        ConcurrentHashMap<String, C13916o.C13917a> concurrentHashMap2 = C13916o.f39110a;
                        if (concurrentHashMap2.keySet().contains("atFeedManage") && (aVar2 = concurrentHashMap2.get("atFeedManage")) != null && aVar2.f39111a != null) {
                            Iterator it = ((ArrayList) aVar2.f39112b).iterator();
                            while (it.hasNext()) {
                                ((C13916o.C13918b) it.next()).getClass();
                            }
                            return;
                        }
                        return;
                    }
                    C87412m.m108603p("stateMachine");
                    throw null;
                }
                C87412m.m108603p("stateMachine");
                throw null;
            } else if (ordinal == 4) {
                C39818r rVar = C39818r.f106831a;
                FinderAtFeedLoader e3 = ((FinderAtFeedManageUIC) rVar.mo62444c(this.f38381a.getActivity()).mo75002a(cls)).mo5112e3();
                AtFeedSelectStateMachine atFeedSelectStateMachine4 = this.f38381a.f38380j;
                if (atFeedSelectStateMachine4 != null) {
                    C13604l<List<Long>, List<Long>> b = atFeedSelectStateMachine4.mo5108b();
                    e3.mo3454e((List) b.f38555d, 3);
                    e3.mo3454e((List) b.f38556e, 2);
                    C13535y0 y0Var2 = this.f38381a;
                    LinearLayout linearLayout2 = y0Var2.f38375e;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(0);
                        TextView textView4 = y0Var2.f38376f;
                        if (textView4 != null) {
                            textView4.setVisibility(8);
                            TextView textView5 = y0Var2.f38377g;
                            if (textView5 != null) {
                                textView5.setText(y0Var2.getContext().getResources().getString(C0966R.string.d0y));
                                TextView textView6 = y0Var2.f38378h;
                                if (textView6 != null) {
                                    textView6.setVisibility(0);
                                    Button button2 = y0Var2.f38379i;
                                    if (button2 != null) {
                                        button2.setVisibility(8);
                                        FinderAtFeedManageUIC finderAtFeedManageUIC2 = (FinderAtFeedManageUIC) rVar.mo62444c(y0Var2.getActivity()).mo75002a(cls);
                                        finderAtFeedManageUIC2.f18586h.f35000a = false;
                                        finderAtFeedManageUIC2.mo5112e3().dispatcher().mo13376a();
                                        return;
                                    }
                                    C87412m.m108603p("doneBtn");
                                    throw null;
                                }
                                C87412m.m108603p("manageText");
                                throw null;
                            }
                            C87412m.m108603p("headerText");
                            throw null;
                        }
                        C87412m.m108603p("cancelText");
                        throw null;
                    }
                    C87412m.m108603p("backBtn");
                    throw null;
                }
                C87412m.m108603p("stateMachine");
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13535y0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        String stringExtra = getIntent().getStringExtra("KEY_PARAMS_USERNAME");
        this.f38374d = stringExtra == null ? "" : stringExtra;
    }

    /* renamed from: c3 */
    public static final void m12850c3(C13535y0 y0Var, LinkedList linkedList, List list, int i) {
        y0Var.getClass();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                C51895wy2 wy22 = new C51895wy2();
                wy22.f144359d = longValue;
                wy22.f144360e = i;
                linkedList.add(wy22);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = getActivity().findViewById(C0966R.C0970id.a2y);
        C87412m.m108593f(findViewById, "activity.findViewById(R.id.backBtn)");
        this.f38375e = (LinearLayout) findViewById;
        View findViewById2 = getActivity().findViewById(C0966R.C0970id.f6171za);
        C87412m.m108593f(findViewById2, "activity.findViewById(R.…_feed_header_cancel_text)");
        this.f38376f = (TextView) findViewById2;
        View findViewById3 = getActivity().findViewById(C0966R.C0970id.f6174zd);
        C87412m.m108593f(findViewById3, "activity.findViewById(R.id.at_feed_header_text)");
        this.f38377g = (TextView) findViewById3;
        View findViewById4 = getActivity().findViewById(C0966R.C0970id.f6173zc);
        C87412m.m108593f(findViewById4, "activity.findViewById(R.…_feed_header_manage_text)");
        this.f38378h = (TextView) findViewById4;
        View findViewById5 = getActivity().findViewById(C0966R.C0970id.f6172zb);
        C87412m.m108593f(findViewById5, "activity.findViewById(R.…d_header_manage_done_btn)");
        this.f38379i = (Button) findViewById5;
        TextView textView = this.f38377g;
        if (textView != null) {
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            LinearLayout linearLayout = this.f38375e;
            if (linearLayout != null) {
                linearLayout.setOnClickListener(new C13468u0(this));
                TextView textView2 = this.f38376f;
                if (textView2 != null) {
                    textView2.setOnClickListener(new C13482v0(this));
                    Button button = this.f38379i;
                    if (button != null) {
                        button.setOnClickListener(new C13494w0(this));
                        TextView textView3 = this.f38378h;
                        if (textView3 != null) {
                            textView3.setOnClickListener(new C13526x0(this));
                            TextView textView4 = this.f38376f;
                            if (textView4 != null) {
                                textView4.setTextSize(1, 17.0f);
                                TextView textView5 = this.f38377g;
                                if (textView5 != null) {
                                    textView5.setTextSize(1, 17.0f);
                                    TextView textView6 = this.f38378h;
                                    if (textView6 != null) {
                                        textView6.setTextSize(1, 17.0f);
                                        Button button2 = this.f38379i;
                                        if (button2 != null) {
                                            button2.setTextSize(1, 14.0f);
                                        } else {
                                            C87412m.m108603p("doneBtn");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("manageText");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("headerText");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("cancelText");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("manageText");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("doneBtn");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("cancelText");
                    throw null;
                }
            } else {
                C87412m.m108603p("backBtn");
                throw null;
            }
        } else {
            C87412m.m108603p("headerText");
            throw null;
        }
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        AppCompatActivity activity = getActivity();
        DataBuffer dataListJustForAdapter = ((FinderAtFeedManageUIC) C39818r.f106831a.mo62444c(getActivity()).mo75002a(FinderAtFeedManageUIC.class)).mo5112e3().getDataListJustForAdapter();
        C87412m.m108592e(dataListJustForAdapter, "null cannot be cast to non-null type kotlin.collections.MutableList<com.tencent.mm.plugin.finder.model.BaseFinderFeed>");
        AtFeedSelectStateMachine atFeedSelectStateMachine = new AtFeedSelectStateMachine(activity, C24564k0.m30738b(dataListJustForAdapter));
        this.f38380j = atFeedSelectStateMachine;
        atFeedSelectStateMachine.f18571g.alive();
        AtFeedSelectStateMachine atFeedSelectStateMachine2 = this.f38380j;
        if (atFeedSelectStateMachine2 != null) {
            C13536a aVar = new C13536a(this);
            if (!((ArrayList) atFeedSelectStateMachine2.f18570f).contains(aVar)) {
                ((ArrayList) atFeedSelectStateMachine2.f18570f).add(aVar);
                return;
            }
            return;
        }
        C87412m.m108603p("stateMachine");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        AtFeedSelectStateMachine atFeedSelectStateMachine = this.f38380j;
        if (atFeedSelectStateMachine != null) {
            ((ArrayList) atFeedSelectStateMachine.f18570f).clear();
            AtFeedSelectStateMachine atFeedSelectStateMachine2 = this.f38380j;
            if (atFeedSelectStateMachine2 != null) {
                atFeedSelectStateMachine2.f18571g.dead();
            } else {
                C87412m.m108603p("stateMachine");
                throw null;
            }
        } else {
            C87412m.m108603p("stateMachine");
            throw null;
        }
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }
}
