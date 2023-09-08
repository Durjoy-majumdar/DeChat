package lp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import dp1.C20480e0;
import dp1.C58417y0;
import dp1.C7434f1;
import eb0.C31543z5;
import eb0.C75592q0;
import er1.C58684b;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C60206u1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import os1.C11739f;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62345f;
import rs1.C13442s8;
import sx3.C110818d0;
import sx3.C64197v;
import tc0.C77885p;
import te3.C49712hj1;
import te3.C49739hq0;
import te3.C50581nr0;
import te3.C64266br1;
import up1.C27696y;
import up1.C37521f;
import z04.C112550d0;

/* renamed from: lp1.c */
public final class C10608c extends C10605a {

    /* renamed from: q */
    public C49739hq0 f31983q;

    /* renamed from: r */
    public Runnable f31984r;

    /* renamed from: s */
    public boolean f31985s;

    /* renamed from: t */
    public float f31986t = -1.0f;

    /* renamed from: u */
    public final int f31987u = ViewConfiguration.getTouchSlop();

    /* renamed from: lp1.c$a */
    public static final class C10609a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10608c f31988d;

        public C10609a(C10608c cVar) {
            this.f31988d = cVar;
        }

        public final void onClick(View view) {
            String str;
            int i;
            String str2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/share/FinderShareGuideEntranceUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C10608c cVar = this.f31988d;
            cVar.getClass();
            Class cls = C58417y0.class;
            long k = C75592q0.m90781k();
            if ((34359738368L & k) != 0) {
                long j = k & -34359738369L;
                C86709a0.m107535s().mo121142i().mo119676J(147457, Long.valueOf(j));
                Log.m105924i("FinderShareGuideBaseUIC", "openFinderEntrance extstatus:" + j);
                C64266br1 br12 = new C64266br1();
                br12.f182324d = 57;
                br12.f182325e = 1;
                ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
                Log.m105918d("FinderShareGuideBaseUIC", "openFinderEntrance switch functionId:" + br12.f182324d + " to " + br12.f182325e);
            }
            int i2 = 18;
            C37521f.f99374d.getClass();
            int intValue = C37521f.f99546w3.mo60266n().intValue();
            int i3 = 3;
            if (intValue == 0) {
                i2 = ((C58417y0) C86312j.m106911c(cls)).mo83328dc(3);
                str = "KEY_FINDER_POST_FINISH_JUMP_FOLLOW_TAB";
            } else if (intValue != 2) {
                str = "KEY_FINDER_POST_FINISH_JUMP_FRIEND_TAB";
                i3 = 1;
            } else {
                i2 = ((C58417y0) C86312j.m106911c(cls)).mo83328dc(4);
                str = "KEY_FINDER_POST_FINISH_JUMP_HOT_TAB";
                i3 = 4;
            }
            String string = cVar.getString(C0966R.string.fnf);
            C39818r rVar = C39818r.f106831a;
            C49712hj1 q3 = ((C13442s8) rVar.mo62444c(cVar.getActivity()).mo75002a(C13442s8.class)).mo12861q3();
            C7434f1 f1Var = C7434f1.f25625a;
            long c = C31543z5.m39453c();
            C49739hq0 hq02 = cVar.f31983q;
            if (!(hq02 == null || (str2 = hq02.f134817f) == null)) {
                string = str2;
            }
            C87412m.m108593f(string, "guideBarItem?.title ?: defaultWording");
            C49739hq0 hq03 = cVar.f31983q;
            C7434f1.m7549a(f1Var, q3, 2, c, 0, 2, string, Integer.valueOf(hq03 != null ? hq03.f134818g : 0), (String) null, 128, (Object) null);
            cVar.getActivity().finish();
            ((C11739f) rVar.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class)).mo11600c3(i3).f34376i = C11739f.C11742c.HardRefresh;
            Intent intent = new Intent();
            intent.putExtra(str, true);
            intent.putExtra("KEY_FROM_SHARE_REL", true);
            intent.putExtra("KEY_TARGET_TAB_TYPE", 4);
            C49739hq0 hq04 = cVar.f31983q;
            intent.putExtra("KEY_GUIDE_BAR_OBJ_ID", hq04 != null ? Long.valueOf(hq04.f134815d) : null);
            String str3 = q3.f134671e;
            if (str3 != null) {
                String str4 = (String) C112550d0.m153784T(str3, new char[]{'-'}, false, 0, 6, (Object) null).get(0);
                if (str4 != null) {
                    i = Integer.parseInt(str4);
                    if (i > 0 && i2 > 0) {
                        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76842e7(i, 9, i2, intent);
                    }
                    C20480e0.f57583a.mo32031d();
                    C7335d c2 = C86312j.m106911c(C58684b.class);
                    C87412m.m108593f(c2, "getService(ActivityRouter::class.java)");
                    C58684b.by0((C58684b) c2, cVar.getActivity(), intent, 1, false, 8, (Object) null);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/finder/share/FinderShareGuideEntranceUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            }
            i = -1;
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76842e7(i, 9, i2, intent);
            C20480e0.f57583a.mo32031d();
            C7335d c25 = C86312j.m106911c(C58684b.class);
            C87412m.m108593f(c25, "getService(ActivityRouter::class.java)");
            C58684b.by0((C58684b) c25, cVar.getActivity(), intent, 1, false, 8, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/share/FinderShareGuideEntranceUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10608c(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: f3 */
    public int mo10862f3() {
        return C0966R.C0970id.f358257e41;
    }

    /* renamed from: i3 */
    public void mo10864i3(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        super.mo10864i3(recyclerView);
        View view = this.f31970d;
        if (view != null) {
            view.setOnClickListener(new C10609a(this));
        }
    }

    /* renamed from: n3 */
    public boolean mo10869n3() {
        if (!this.f31985s) {
            C37521f fVar = C37521f.f99374d;
            fVar.getClass();
            if (C37521f.f99423i4.mo60266n().intValue() != 1 && !((C60206u1) C86312j.m106911c(C60206u1.class)).Cw0()) {
                fVar.getClass();
                return C37521f.f99141C3.mo60266n().intValue() == 1 && this.f31983q != null;
            }
        }
    }

    /* renamed from: o3 */
    public void mo10870o3() {
        String str;
        if (!this.f31971e && !mo10865j3()) {
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            View view = this.f31970d;
            if (view != null) {
                C49739hq0 hq02 = this.f31983q;
                int i = 0;
                if (hq02 != null) {
                    ((TextView) view.findViewById(C0966R.C0970id.lr8)).setText(hq02.f134817f);
                    View findViewById = view.findViewById(C0966R.C0970id.a1w);
                    C87412m.m108593f(findViewById, "layout.findViewById(R.id.avatar_3_iv)");
                    View findViewById2 = view.findViewById(C0966R.C0970id.a1u);
                    C87412m.m108593f(findViewById2, "layout.findViewById(R.id.avatar_2_iv)");
                    View findViewById3 = view.findViewById(C0966R.C0970id.a1s);
                    C87412m.m108593f(findViewById3, "layout.findViewById(R.id.avatar_1_iv)");
                    List f = C64197v.m75537f((ImageView) findViewById, (ImageView) findViewById2, (ImageView) findViewById3);
                    ArrayList arrayList = new ArrayList(hq02.f134816e);
                    Collections.reverse(arrayList);
                    int i2 = 0;
                    for (Object next : f) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            ImageView imageView = (ImageView) next;
                            C50581nr0 nr02 = (C50581nr0) C110818d0.m150917O(arrayList, i2);
                            if (nr02 != null) {
                                C39818r rVar = C39818r.f106831a;
                                ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11868R0().mo85957c(new C62345f(nr02.f138725e, (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
                            } else {
                                imageView.setVisibility(8);
                            }
                            i2 = i3;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                }
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(0.0f));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/share/FinderShareGuideEntranceUIC", "popupEntrance", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/share/FinderShareGuideEntranceUIC", "popupEntrance", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/share/FinderShareGuideEntranceUIC", "popupEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/share/FinderShareGuideEntranceUIC", "popupEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo10868m3((float) C76577a.m92151b(getContext(), 80), 300);
                view.animate().alpha(1.0f).setDuration(300).start();
                this.f31971e = true;
                view.removeCallbacks(this.f31984r);
                C10610d dVar = new C10610d(this);
                this.f31984r = dVar;
                view.postDelayed(dVar, 10000);
                String string = getString(C0966R.string.fnf);
                C7434f1 f1Var = C7434f1.f25625a;
                C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C13442s8.class)).mo12861q3();
                long c = C31543z5.m39453c();
                C49739hq0 hq03 = this.f31983q;
                if (!(hq03 == null || (str = hq03.f134817f) == null)) {
                    string = str;
                }
                C87412m.m108593f(string, "guideBarItem?.title ?: defaultWording");
                C49739hq0 hq04 = this.f31983q;
                if (hq04 != null) {
                    i = hq04.f134818g;
                }
                C7434f1.m7549a(f1Var, q3, 1, c, 0, 2, string, Integer.valueOf(i), (String) null, 128, (Object) null);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f31985s = getIntent().getBooleanExtra("is_from_ad", false);
    }

    public void onDestroy() {
        super.onDestroy();
        View view = this.f31970d;
        if (view != null) {
            view.removeCallbacks(this.f31984r);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10608c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }
}
