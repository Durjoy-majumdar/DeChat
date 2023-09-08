package ho1;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.plugin.finder.profile.FinderProfilePoiDrawer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import dp1.C58417y0;
import er1.C7826l2;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import ho1.C8637m;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import je1.C9375s1;
import o40.C61926c;
import ob0.C89132b;
import org.json.JSONObject;
import pe3.C89349b;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import te3.C50951qe3;
import te3.C51134ro1;
import te3.C51692vg1;
import te3.z74;
import z04.C112551y;

/* renamed from: ho1.e */
public final class C8626e extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final Activity f27740a;

    /* renamed from: b */
    public final C49712hj1 f27741b;

    /* renamed from: c */
    public final C13601g f27742c;

    /* renamed from: d */
    public final C13601g f27743d;

    /* renamed from: e */
    public final C13601g f27744e;

    /* renamed from: f */
    public C8637m f27745f;

    /* renamed from: g */
    public FinderProfilePoiDrawer f27746g;

    /* renamed from: h */
    public C89349b f27747h;

    /* renamed from: i */
    public int f27748i;

    /* renamed from: j */
    public String f27749j;

    /* renamed from: k */
    public boolean f27750k;

    /* renamed from: l */
    public boolean f27751l;

    /* renamed from: ho1.e$a */
    public static final class C8627a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C8626e f27752d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<z74> f27753e;

        public C8627a(C8626e eVar, C8479f0<z74> f0Var) {
            this.f27752d = eVar;
            this.f27753e = f0Var;
        }

        public final void onClick(View view) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/FinderProfilePoiHandler$handleProfilePoi$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7826l2 l2Var = C7826l2.f26364a;
            Activity activity = this.f27752d.f27740a;
            C50951qe3 qe32 = ((z74) this.f27753e.f27484d).f145743d;
            l2Var.mo8921a(activity, qe32 != null ? qe32.f140264d : null);
            C8626e eVar = this.f27752d;
            CharSequence text = eVar.mo9501g().getText();
            if (text == null || (str = text.toString()) == null) {
                str = "";
            }
            eVar.mo9503j(1, str, this.f27752d.f27749j);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/FinderProfilePoiHandler$handleProfilePoi$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ho1.e$b */
    public static final class C8628b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C8626e f27754a;

        /* renamed from: b */
        public final /* synthetic */ boolean f27755b;

        public C8628b(C8626e eVar, boolean z) {
            this.f27754a = eVar;
            this.f27755b = z;
        }

        public Object call(Object obj) {
            C8637m mVar;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                Log.m105924i("Finder.UserPoiHandler", "[requestUserPoi] " + ((C51134ro1) cVar.f256796d).f141058d.size());
                C8626e eVar = this.f27754a;
                C51134ro1 ro12 = (C51134ro1) cVar.f256796d;
                int i = ro12.f141059e;
                eVar.f27748i = i;
                eVar.f27747h = ro12.f141060f;
                boolean z = false;
                if (this.f27755b) {
                    LinkedList<C51692vg1> linkedList = ro12.f141058d;
                    C87412m.m108593f(linkedList, "it.resp.poi_list");
                    C8637m mVar2 = eVar.f27745f;
                    if (mVar2 != null) {
                        MMProcessBar mMProcessBar = mVar2.f27774g;
                        if (mMProcessBar != null) {
                            mMProcessBar.mo82304d();
                        }
                        if (!linkedList.isEmpty()) {
                            mVar2.f27775h.addAll(linkedList);
                            LinkedList<C51692vg1> linkedList2 = mVar2.f27775h;
                            C87412m.m108594g(linkedList2, "list");
                            mVar2.mo9509c(linkedList2.size());
                            C8637m.C8639b bVar = mVar2.f27777j;
                            if (bVar != null) {
                                bVar.notifyDataSetChanged();
                            } else {
                                C87412m.m108603p("adapter");
                                throw null;
                            }
                        }
                    }
                    if (eVar.f27748i != 0) {
                        z = true;
                    }
                    eVar.mo9500f(z);
                } else {
                    LinkedList<C51692vg1> linkedList3 = ro12.f141058d;
                    if (i != 0) {
                        z = true;
                    }
                    C8626e.m8476h(eVar, linkedList3, z, false, 4, (Object) null);
                }
            } else {
                Log.m105924i("Finder.UserPoiHandler", "[requestUserPoi] errType=" + cVar.f256793a + " errCode=" + cVar.f256794b + " errMsg=" + cVar.f256795c);
            }
            if (this.f27755b && (mVar = this.f27754a.f27745f) != null) {
                RefreshLoadMoreLayout refreshLoadMoreLayout = mVar.f27772e;
                if (refreshLoadMoreLayout != null) {
                    refreshLoadMoreLayout.mo82440F(((C51134ro1) cVar.f256796d).f141058d.size());
                } else {
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C8626e(Activity activity, View view, C49712hj1 hj12, int i, C8480h hVar) {
        hj12 = (i & 4) != 0 ? null : hj12;
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(view, "header");
        this.f27740a = activity;
        this.f27741b = hj12;
        this.f27742c = C36568h.m40985a(new C8631h(view));
        this.f27743d = C36568h.m40985a(new C8633j(view));
        this.f27744e = C36568h.m40985a(new C8632i(view));
        this.f27748i = -1;
        this.f27749j = "";
        this.f27750k = true;
    }

    /* renamed from: h */
    public static void m8476h(C8626e eVar, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        eVar.getClass();
        if (list == null || list.isEmpty()) {
            return;
        }
        if (!z2 || !eVar.f27751l) {
            if (!z2) {
                eVar.f27751l = true;
            }
            String str = eVar.f27749j;
            if (str != null) {
                if (!(str.length() == 0)) {
                    C61926c.m72656A((String) null, new C8636l(list, str));
                }
            }
            eVar.mo9502i(((C51692vg1) list.get(0)).f143476d);
            if (list.size() != 1) {
                ((RelativeLayout) ((C36570n) eVar.f27744e).getValue()).setVisibility(0);
                ((LinearLayout) ((C36570n) eVar.f27742c).getValue()).setOnClickListener(new C8625d(eVar, z, list));
            }
        }
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        mo9504k(true);
    }

    /* renamed from: c */
    public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
    }

    /* renamed from: f */
    public final void mo9500f(boolean z) {
        C8637m mVar = this.f27745f;
        RefreshLoadMoreLayout refreshLoadMoreLayout = null;
        if (mVar != null) {
            RefreshLoadMoreLayout refreshLoadMoreLayout2 = mVar.f27772e;
            if (refreshLoadMoreLayout2 != null) {
                refreshLoadMoreLayout = refreshLoadMoreLayout2;
            } else {
                C87412m.m108603p("rlLayout");
                throw null;
            }
        }
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.setEnableLoadMore(z);
        }
    }

    /* renamed from: g */
    public final TextView mo9501g() {
        return (TextView) ((C36570n) this.f27743d).getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r8 = r8.f16270i;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9502i(te3.z74 r8) {
        /*
            r7 = this;
            gy3.f0 r0 = new gy3.f0
            r0.<init>()
            r0.f27484d = r8
            r1 = 1
            r2 = 0
            r3 = 0
            if (r8 != 0) goto L_0x0069
            sg.i<java.lang.String, com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b> r8 = com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.f16192h1
            java.lang.String r4 = r7.f27749j
            java.lang.Object r8 = r8.get(r4)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r8 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.C3463b) r8
            if (r8 == 0) goto L_0x001f
            te3.mo1 r8 = r8.f16270i
            if (r8 == 0) goto L_0x001f
            java.util.LinkedList<te3.z74> r8 = r8.f138133d
            goto L_0x0020
        L_0x001f:
            r8 = r3
        L_0x0020:
            if (r8 == 0) goto L_0x002b
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r4 = 0
            goto L_0x002c
        L_0x002b:
            r4 = 1
        L_0x002c:
            if (r4 == 0) goto L_0x0030
            r4 = r3
            goto L_0x0050
        L_0x0030:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0039:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L_0x0050
            java.lang.Object r5 = r8.next()
            te3.z74 r5 = (te3.z74) r5
            te3.vg1 r6 = new te3.vg1
            r6.<init>()
            r6.f143476d = r5
            r4.add(r6)
            goto L_0x0039
        L_0x0050:
            if (r4 == 0) goto L_0x005b
            boolean r8 = r4.isEmpty()
            if (r8 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r8 = 0
            goto L_0x005c
        L_0x005b:
            r8 = 1
        L_0x005c:
            if (r8 == 0) goto L_0x005f
            return
        L_0x005f:
            java.lang.Object r8 = r4.get(r2)
            te3.vg1 r8 = (te3.C51692vg1) r8
            te3.z74 r8 = r8.f143476d
            r0.f27484d = r8
        L_0x0069:
            T r8 = r0.f27484d
            if (r8 != 0) goto L_0x006e
            return
        L_0x006e:
            boolean r8 = r7.f27750k
            if (r8 == 0) goto L_0x00ea
            java.lang.Class<ht1.v4> r8 = ht1.C8808v4.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            ht1.v4 r8 = (ht1.C8808v4) r8
            boolean r8 = r8.mo9635e()
            if (r8 != 0) goto L_0x00ea
            r7.f27750k = r2
            rx3.g r8 = r7.f27742c
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r8.setVisibility(r2)
            android.widget.TextView r8 = r7.mo9501g()
            T r4 = r0.f27484d
            te3.z74 r4 = (te3.z74) r4
            te3.qe3 r4 = r4.f145743d
            if (r4 == 0) goto L_0x00a2
            te3.je3 r4 = r4.f140264d
            if (r4 == 0) goto L_0x00a2
            java.lang.String r4 = r4.f136053e
            goto L_0x00a3
        L_0x00a2:
            r4 = r3
        L_0x00a3:
            r8.setText(r4)
            rx3.g r8 = r7.f27742c
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            ho1.e$a r4 = new ho1.e$a
            r4.<init>(r7, r0)
            r8.setOnClickListener(r4)
            java.lang.String r8 = r7.f27749j
            if (r8 == 0) goto L_0x00cf
            int r0 = r8.length()
            if (r0 != 0) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r1 = 0
        L_0x00c4:
            if (r1 == 0) goto L_0x00c7
            goto L_0x00cf
        L_0x00c7:
            ho1.g r0 = new ho1.g
            r0.<init>(r8, r7)
            o40.C61926c.m72656A(r3, r0)
        L_0x00cf:
            r7.mo9504k(r2)
            android.widget.TextView r8 = r7.mo9501g()
            java.lang.CharSequence r8 = r8.getText()
            if (r8 == 0) goto L_0x00e2
            java.lang.String r8 = r8.toString()
            if (r8 != 0) goto L_0x00e4
        L_0x00e2:
            java.lang.String r8 = ""
        L_0x00e4:
            java.lang.String r0 = r7.f27749j
            r7.mo9503j(r2, r8, r0)
            goto L_0x00f9
        L_0x00ea:
            rx3.g r8 = r7.f27742c
            rx3.n r8 = (rx3.C36570n) r8
            java.lang.Object r8 = r8.getValue()
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r0 = 8
            r8.setVisibility(r0)
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ho1.C8626e.mo9502i(te3.z74):void");
    }

    /* renamed from: j */
    public final void mo9503j(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("poi_name", str);
        jSONObject.put("finderusername", str2);
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "kvJson.toString()");
        String n = C112551y.m153814n(jSONObject2, ",", ";", false);
        C49712hj1 hj12 = this.f27741b;
        if (hj12 == null) {
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f27740a);
            hj12 = f != null ? f.mo12861q3() : null;
        }
        y0Var.Cx0(i, "channel_profile_poi", n, hj12);
    }

    /* renamed from: k */
    public final void mo9504k(boolean z) {
        if (!z || this.f27748i != 0) {
            new C9375s1(this.f27749j, this.f27747h).mo9225i().mo123420E(new C8628b(this, z));
            return;
        }
        Log.m105924i("Finder.UserPoiHandler", "[requestUserPoi] no load more");
        C8637m mVar = this.f27745f;
        RefreshLoadMoreLayout refreshLoadMoreLayout = null;
        if (mVar != null) {
            RefreshLoadMoreLayout refreshLoadMoreLayout2 = mVar.f27772e;
            if (refreshLoadMoreLayout2 != null) {
                refreshLoadMoreLayout2.mo82440F(0);
            } else {
                C87412m.m108603p("rlLayout");
                throw null;
            }
        }
        C8637m mVar2 = this.f27745f;
        if (mVar2 != null) {
            RefreshLoadMoreLayout refreshLoadMoreLayout3 = mVar2.f27772e;
            if (refreshLoadMoreLayout3 != null) {
                refreshLoadMoreLayout = refreshLoadMoreLayout3;
            } else {
                C87412m.m108603p("rlLayout");
                throw null;
            }
        }
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.setEnableLoadMore(false);
        }
    }
}
