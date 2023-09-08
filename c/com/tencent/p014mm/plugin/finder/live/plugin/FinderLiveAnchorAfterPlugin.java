package com.tencent.p014mm.plugin.finder.live.plugin;

import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54795n5;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import dj1.C45381p0;
import eb0.C31543z5;
import f40.C86709a0;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import nk1.C11193b;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89132b;
import ok1.C62042e;
import org.json.JSONObject;
import p185kq.C10383h;
import p185kq.C61130g;
import pe3.C89349b;
import qj1.C12481k0;
import qj1.C62660c;
import rx3.C13598b0;
import te3.C48807b41;
import te3.C49712hj1;
import te3.C50401mh0;
import te3.C51778w31;
import te3.C64848y91;
import y50.C15936n0;
import z04.C112550d0;
import z04.C112551y;
import zc1.C66785b;
import zh0.C16196b;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin */
public final class FinderLiveAnchorAfterPlugin extends C62660c implements C11385n {

    /* renamed from: A */
    public final TextView f15094A;

    /* renamed from: B */
    public final ViewGroup f15095B;

    /* renamed from: C */
    public final ImageView f15096C;

    /* renamed from: D */
    public final View f15097D;

    /* renamed from: E */
    public final MMSwitchBtn f15098E;

    /* renamed from: F */
    public final View f15099F;

    /* renamed from: G */
    public final ImageView f15100G;

    /* renamed from: H */
    public final TextView f15101H;

    /* renamed from: I */
    public C3162d f15102I;

    /* renamed from: J */
    public final ConstraintLayout f15103J;

    /* renamed from: K */
    public boolean f15104K;

    /* renamed from: L */
    public int f15105L;

    /* renamed from: M */
    public long f15106M;

    /* renamed from: N */
    public long f15107N;

    /* renamed from: p */
    public final C58124b f15108p;

    /* renamed from: q */
    public final String f15109q = "Finder.LiveAnchorAfterPlugin";

    /* renamed from: r */
    public final int f15110r = 1;

    /* renamed from: s */
    public final int f15111s = 2;

    /* renamed from: t */
    public final int f15112t = 3;

    /* renamed from: u */
    public final int f15113u = 4;

    /* renamed from: v */
    public final int f15114v = 5;

    /* renamed from: w */
    public final int f15115w = 6;

    /* renamed from: x */
    public final int f15116x = 7;

    /* renamed from: y */
    public final int f15117y = 3;

    /* renamed from: z */
    public final TextView f15118z;

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$a */
    public static final class C3159a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveAnchorAfterPlugin f15119d;

        public C3159a(FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin) {
            this.f15119d = finderLiveAnchorAfterPlugin;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f15119d.f15108p.statusChange(C58124b.C58125b.QUIT_LIVE, (Bundle) null);
            if (this.f15119d.f15108p.getLiveRole() == 1) {
                ((C54108o) C86312j.m106911c(C54108o.class)).Px0(C54067f0.C0049b.CLICK_FINISH, "");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$b */
    public static final class C3160b extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ FinderLiveAnchorAfterPlugin f15120a;

        public C3160b(FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin) {
            this.f15120a = finderLiveAnchorAfterPlugin;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            Class cls = C61130g.class;
            Class cls2 = C10383h.class;
            Class cls3 = C55001u.class;
            Class cls4 = C54991o.class;
            Class cls5 = C54116w.class;
            C87412m.m108594g(view, "view");
            if (z) {
                String str = "HABBYGE-MALI.HellLiveVisitorReoprter";
                String str2 = ", commentScene = ";
                String str3 = ", page_id = ";
                this.f15120a.f15107N = System.currentTimeMillis();
                String str4 = ((C54991o) this.f15120a.mo87696x0(cls4)).f154345o;
                Class cls6 = cls3;
                Class cls7 = cls4;
                long j3 = ((C55001u) this.f15120a.mo87696x0(cls3)).f154420q.f182392d;
                ((C54116w) C86312j.m106911c(cls5)).getClass();
                C87412m.m108594g(str4, "username");
                FinderBroadcastPageInStruct finderBroadcastPageInStruct = new FinderBroadcastPageInStruct();
                String E = ((C10383h) C86312j.m106911c(cls2)).mo10696E();
                if (E == null) {
                    E = "";
                }
                finderBroadcastPageInStruct.mo1021t(E);
                finderBroadcastPageInStruct.mo1022u("1002");
                String gK = ((C61130g) C86312j.m106911c(cls)).mo33244gK();
                if (gK == null) {
                    gK = "";
                }
                finderBroadcastPageInStruct.mo1020s(gK);
                HashMap hashMap = new HashMap();
                hashMap.put("finder_username", str4);
                hashMap.put("liveid", String.valueOf(j3));
                String obj = hashMap.toString();
                C87412m.m108593f(obj, "reportMap.toString()");
                finderBroadcastPageInStruct.mo1023v(C112551y.m153814n(obj, ",", ";", false));
                finderBroadcastPageInStruct.mo86054n();
                String str5 = str;
                Log.m105924i(str5, "report22946, contextid = " + finderBroadcastPageInStruct.f9761i + str3 + finderBroadcastPageInStruct.f9757e + str2 + finderBroadcastPageInStruct.f9766n);
                String str6 = ((C54991o) this.f15120a.mo87696x0(cls7)).f154345o;
                long j4 = ((C55001u) this.f15120a.mo87696x0(cls6)).f154420q.f182392d;
                ((C54116w) C86312j.m106911c(cls5)).getClass();
                C87412m.m108594g(str6, "username");
                HashMap hashMap2 = new HashMap();
                hashMap2.put("finder_username", str6);
                hashMap2.put("liveId", String.valueOf(j4));
                C7335d c = C86312j.m106911c(C54108o.class);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5 j5Var = (C8777j5) c;
                C54067f0.C0066n nVar = C54067f0.C0066n.LIVE_END_PAGE_LIVE;
                String E2 = ((C10383h) C86312j.m106911c(cls2)).mo10696E();
                C8777j5.C8778a.m8609j(j5Var, nVar, hashMap2, E2 == null ? "" : E2, "1002", (String) null, 16, (Object) null);
                Log.m105924i(str5, "report23057, liveid = " + ((String) hashMap2.get("liveId")));
                return;
            }
            String str7 = "HABBYGE-MALI.HellLiveVisitorReoprter";
            String str8 = ((C54991o) this.f15120a.mo87696x0(cls4)).f154345o;
            String str9 = ", page_id = ";
            String str10 = ", commentScene = ";
            long j5 = ((C55001u) this.f15120a.mo87696x0(cls3)).f154420q.f182392d;
            String str11 = ";";
            long currentTimeMillis = System.currentTimeMillis() - this.f15120a.f15107N;
            ((C54116w) C86312j.m106911c(cls5)).getClass();
            C87412m.m108594g(str8, "username");
            FinderBroadcastPageOutStruct finderBroadcastPageOutStruct = new FinderBroadcastPageOutStruct();
            String E3 = ((C10383h) C86312j.m106911c(cls2)).mo10696E();
            if (E3 == null) {
                E3 = "";
            }
            finderBroadcastPageOutStruct.mo1025t(E3);
            finderBroadcastPageOutStruct.mo1026u("1002");
            String gK2 = ((C61130g) C86312j.m106911c(cls)).mo33244gK();
            if (gK2 == null) {
                gK2 = "";
            }
            finderBroadcastPageOutStruct.mo1024s(gK2);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("finder_username", str8);
            hashMap3.put("liveid", String.valueOf(j5));
            hashMap3.put("stayTime", String.valueOf(currentTimeMillis));
            String obj2 = hashMap3.toString();
            C87412m.m108593f(obj2, "reportMap.toString()");
            finderBroadcastPageOutStruct.mo1027v(C112551y.m153814n(obj2, ",", str11, false));
            finderBroadcastPageOutStruct.mo86054n();
            Log.m105924i(str7, "report22947, contextid = " + finderBroadcastPageOutStruct.f9773i + str9 + finderBroadcastPageOutStruct.f9769e + str10 + finderBroadcastPageOutStruct.f9777m);
            this.f15120a.f15107N = -1;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$c */
    public static final class C3161c {

        /* renamed from: a */
        public final int f15121a;

        /* renamed from: b */
        public final long f15122b;

        /* renamed from: c */
        public final CharSequence f15123c;

        /* renamed from: d */
        public final long f15124d;

        /* renamed from: e */
        public final FinderJumpInfo f15125e;

        public C3161c(int i, long j, CharSequence charSequence, long j2, FinderJumpInfo finderJumpInfo, int i2, C8480h hVar) {
            j2 = (i2 & 8) != 0 ? 0 : j2;
            finderJumpInfo = (i2 & 16) != 0 ? null : finderJumpInfo;
            C87412m.m108594g(charSequence, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            this.f15121a = i;
            this.f15122b = j;
            this.f15123c = charSequence;
            this.f15124d = j2;
            this.f15125e = finderJumpInfo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3161c)) {
                return false;
            }
            C3161c cVar = (C3161c) obj;
            return this.f15121a == cVar.f15121a && this.f15122b == cVar.f15122b && C87412m.m108589b(this.f15123c, cVar.f15123c) && this.f15124d == cVar.f15124d && C87412m.m108589b(this.f15125e, cVar.f15125e);
        }

        public int hashCode() {
            long j = this.f15122b;
            long j2 = this.f15124d;
            int hashCode = ((((((this.f15121a * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f15123c.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            FinderJumpInfo finderJumpInfo = this.f15125e;
            return hashCode + (finderJumpInfo == null ? 0 : finderJumpInfo.hashCode());
        }

        public String toString() {
            return "CommonInfo(type=" + this.f15121a + ", value=" + this.f15122b + ", title=" + this.f15123c + ", value2=" + this.f15124d + ", jump=" + this.f15125e + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$d */
    public final class C3162d extends RecyclerView.C16613e<C3163e> {

        /* renamed from: d */
        public final ArrayList<C3161c> f15126d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveAnchorAfterPlugin f15127e;

        public C3162d(FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin, ArrayList<C3161c> arrayList) {
            C87412m.m108594g(arrayList, "dataList");
            this.f15127e = finderLiveAnchorAfterPlugin;
            this.f15126d = arrayList;
        }

        public int getItemCount() {
            return this.f15126d.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C3163e eVar = (C3163e) zVar;
            C87412m.m108594g(eVar, "holder");
            C3161c cVar = this.f15126d.get(i);
            C87412m.m108593f(cVar, "dataList[position]");
            C3161c cVar2 = cVar;
            eVar.f15131z.setText(cVar2.f15123c);
            int i2 = cVar2.f15121a;
            FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin = this.f15127e;
            if (i2 == finderLiveAnchorAfterPlugin.f15113u) {
                eVar.f15128A.setText(eVar.f44854d.getContext().getResources().getString(C0966R.string.dfc, new Object[]{C62042e.f176370a.mo87005G(cVar2.f15122b)}));
                if (cVar2.f15122b > 0) {
                    eVar.f44854d.setOnClickListener(new C3182a(this.f15127e));
                    eVar.f15129B.setVisibility(0);
                } else {
                    eVar.f15129B.setVisibility(8);
                    eVar.f44854d.setOnClickListener((View.OnClickListener) null);
                }
            } else if (i2 == finderLiveAnchorAfterPlugin.f15115w) {
                eVar.f15128A.setText(eVar.f44854d.getContext().getResources().getString(C0966R.string.dfc, new Object[]{C62042e.f176370a.mo87005G(cVar2.f15122b)}));
                eVar.f15129B.setVisibility(8);
                eVar.f44854d.setOnClickListener((View.OnClickListener) null);
            } else if (i2 == finderLiveAnchorAfterPlugin.f15114v) {
                eVar.f15128A.setText(C62042e.f176370a.mo87005G(cVar2.f15122b));
                eVar.f44854d.setOnClickListener(new C3183b(this.f15127e));
                if (cVar2.f15122b > 0) {
                    eVar.f15129B.setVisibility(0);
                } else {
                    eVar.f15129B.setVisibility(8);
                    eVar.f44854d.setOnClickListener((View.OnClickListener) null);
                }
            } else if (i2 == finderLiveAnchorAfterPlugin.f15111s) {
                List U = C112550d0.m153785U(C15936n0.C15937a.m14866a(C15936n0.f42815a, (int) cVar2.f15122b, XVFSFile.PATH_SEPARATOR, false, false, false, 28, (Object) null), new String[]{XVFSFile.PATH_SEPARATOR}, false, 0, 6, (Object) null);
                if (U.size() == 3) {
                    try {
                        if (C87412m.m108589b("00", U.get(0)) && C87412m.m108589b("00", U.get(1))) {
                            eVar.f15128A.setText(eVar.f44854d.getContext().getResources().getString(C0966R.string.dfa, new Object[]{Integer.valueOf(Integer.parseInt((String) U.get(2)))}));
                        } else if (C87412m.m108589b("00", U.get(0))) {
                            eVar.f15128A.setText(eVar.f44854d.getContext().getResources().getString(C0966R.string.df_, new Object[]{Integer.valueOf(Integer.parseInt((String) U.get(1))), Integer.valueOf(Integer.parseInt((String) U.get(2)))}));
                        } else {
                            eVar.f15128A.setText(eVar.f44854d.getContext().getResources().getString(C0966R.string.df9, new Object[]{Integer.valueOf(Integer.parseInt((String) U.get(0))), Integer.valueOf(Integer.parseInt((String) U.get(1)))}));
                        }
                    } catch (Exception e) {
                        String str = this.f15127e.f15109q;
                        Log.m105928w(str, "ex:" + e.getMessage() + " invalid duration:" + cVar2.f15122b);
                    }
                } else {
                    String str2 = this.f15127e.f15109q;
                    Log.m105928w(str2, "invalid duration:" + cVar2.f15122b);
                }
                eVar.f15129B.setVisibility(8);
                eVar.f44854d.setOnClickListener((View.OnClickListener) null);
            } else {
                if (i2 == 0 || i2 == finderLiveAnchorAfterPlugin.f15110r) {
                    eVar.f15128A.setText(eVar.f44854d.getContext().getResources().getString(C0966R.string.dfc, new Object[]{C62042e.f176370a.mo87005G(cVar2.f15122b)}));
                    eVar.f15129B.setVisibility(8);
                    eVar.f44854d.setOnClickListener((View.OnClickListener) null);
                } else if (i2 == finderLiveAnchorAfterPlugin.f15116x) {
                    eVar.f15128A.setText(eVar.f44854d.getContext().getResources().getString(C0966R.string.deo, new Object[]{C62042e.f176370a.mo87005G(cVar2.f15122b)}));
                    if (cVar2.f15122b > 0) {
                        eVar.f44854d.setOnClickListener(new C3184c(this.f15127e));
                        eVar.f15129B.setVisibility(0);
                    } else {
                        eVar.f15129B.setVisibility(8);
                        eVar.f44854d.setOnClickListener((View.OnClickListener) null);
                    }
                } else {
                    eVar.f15128A.setText(C62042e.f176370a.mo87005G(cVar2.f15122b));
                    eVar.f15129B.setVisibility(8);
                    eVar.f44854d.setOnClickListener((View.OnClickListener) null);
                }
            }
            FinderJumpInfo finderJumpInfo = cVar2.f15125e;
            if (finderJumpInfo == null) {
                eVar.f15130C.setVisibility(8);
                eVar.f15130C.setOnClickListener((View.OnClickListener) null);
                return;
            }
            eVar.f15130C.setVisibility(0);
            eVar.f15130C.setText(finderJumpInfo.wording);
            eVar.f15130C.setOnClickListener(new C3185d(eVar, finderJumpInfo));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.adt, (ViewGroup) null);
            C87412m.m108593f(inflate, "inflate(parent.context, …r_common_info_item, null)");
            return new C3163e(inflate);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$e */
    public static final class C3163e extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f15128A;

        /* renamed from: B */
        public final WeImageView f15129B;

        /* renamed from: C */
        public final TextView f15130C;

        /* renamed from: z */
        public final TextView f15131z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3163e(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            ViewGroup viewGroup = (ViewGroup) view.findViewById(C0966R.C0970id.f5815ph);
            this.f15131z = (TextView) view.findViewById(C0966R.C0970id.f5817pj);
            this.f15128A = (TextView) view.findViewById(C0966R.C0970id.f5818pk);
            this.f15129B = (WeImageView) view.findViewById(C0966R.C0970id.f5814pg);
            this.f15130C = (TextView) view.findViewById(C0966R.C0970id.ndr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$f */
    public final class C3164f extends RecyclerView.C0129l {

        /* renamed from: d */
        public final int f15132d;

        public C3164f(int i) {
            this.f15132d = i;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            if (adapter != null) {
                FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin = FinderLiveAnchorAfterPlugin.this;
                int itemCount = adapter.getItemCount();
                int N0 = recyclerView.mo17029N0(view);
                int i = finderLiveAnchorAfterPlugin.f15117y;
                int i2 = itemCount % i == 0 ? itemCount / i : (itemCount / i) + 1;
                if (i2 <= 1) {
                    rect.bottom = 0;
                } else if (N0 >= (i2 - 1) * i) {
                    rect.bottom = 0;
                } else {
                    rect.bottom = this.f15132d;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$h */
    public static final class C3165h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f15134d;

        public C3165h(C32224a aVar) {
            this.f15134d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f15134d.invoke();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$i */
    public static final class C3166i extends C87413o implements C32226l<C89132b.C89134c<C51778w31>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveAnchorAfterPlugin f15135d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3166i(FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin) {
            super(1);
            this.f15135d = finderLiveAnchorAfterPlugin;
        }

        public Object invoke(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            this.f15135d.f15098E.setEnabled(true);
            String str = this.f15135d.f15109q;
            StringBuilder sb = new StringBuilder();
            sb.append("setReplay errCode:");
            String str2 = null;
            sb.append(cVar != null ? Integer.valueOf(cVar.f256794b) : null);
            sb.append(", errType:");
            sb.append(cVar != null ? Integer.valueOf(cVar.f256793a) : null);
            sb.append(",errMsg:");
            if (cVar != null) {
                str2 = cVar.f256795c;
            }
            sb.append(str2);
            Log.m105924i(str, sb.toString());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$g */
    public /* synthetic */ class C3167g {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15136a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[27] = 1;
            f15136a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveAnchorAfterPlugin(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statueMonitor");
        this.f15108p = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.fqq);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.live_after_over_tv)");
        TextView textView = (TextView) findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.fq5);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.live_after_duration_tv)");
        this.f15118z = (TextView) findViewById2;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.f358589fz0);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.live_task_entrance)");
        this.f15094A = (TextView) findViewById3;
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.frb);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.live_after_ui_root_group)");
        this.f15095B = (ViewGroup) findViewById4;
        View findViewById5 = viewGroup.findViewById(C0966R.C0970id.a36);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.back_icon)");
        ImageView imageView = (ImageView) findViewById5;
        this.f15096C = imageView;
        View findViewById6 = viewGroup.findViewById(C0966R.C0970id.f5824po);
        C87412m.m108593f(findViewById6, "root.findViewById(R.id.a…_after_live_replay_group)");
        this.f15097D = findViewById6;
        View findViewById7 = viewGroup.findViewById(C0966R.C0970id.fqd);
        C87412m.m108593f(findViewById7, "root.findViewById(R.id.l…after_live_replay_switch)");
        this.f15098E = (MMSwitchBtn) findViewById7;
        View findViewById8 = viewGroup.findViewById(C0966R.C0970id.f357458cf1);
        C87412m.m108593f(findViewById8, "root.findViewById(R.id.anchor_tip_entry)");
        this.f15099F = findViewById8;
        View findViewById9 = viewGroup.findViewById(C0966R.C0970id.cjm);
        C87412m.m108593f(findViewById9, "root.findViewById(R.id.anchor_tip_icon)");
        this.f15100G = (ImageView) findViewById9;
        View findViewById10 = viewGroup.findViewById(C0966R.C0970id.cjn);
        C87412m.m108593f(findViewById10, "root.findViewById(R.id.anchor_tip_wording)");
        this.f15101H = (TextView) findViewById10;
        View findViewById11 = viewGroup.findViewById(C0966R.C0970id.f5819pl);
        C87412m.m108593f(findViewById11, "root.findViewById(R.id.a…_after_common_info_panel)");
        RecyclerView recyclerView = (RecyclerView) findViewById11;
        this.f15102I = new C3162d(this, new ArrayList());
        View findViewById12 = viewGroup.findViewById(C0966R.C0970id.f5822a3);
        C87412m.m108593f(findViewById12, "root.findViewById(R.id.a…hor_after_data_info_item)");
        this.f15103J = (ConstraintLayout) findViewById12;
        this.f15105L = -1;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin += C75044y4.m89994f(MMApplicationContext.getContext());
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        imageView.setImageDrawable(C74933u4.m89768e(viewGroup.getContext(), C0966R.raw.icons_filled_close, -1));
        imageView.setOnClickListener(new C3159a(this));
        recyclerView.setAdapter(this.f15102I);
        recyclerView.mo17085h0(new C3164f(C74942w4.m89784a(viewGroup.getContext(), 24)));
        recyclerView.setLayoutManager(new FinderLiveAnchorAfterPlugin$2$1(viewGroup.getContext(), 3));
        C23564m.m28138h(recyclerView, new C3160b(this));
        this.f15107N = -1;
    }

    /* renamed from: Z0 */
    public final void mo3198Z0(int i) {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", i);
        jSONObject.put("diagnosis_id", this.f15105L);
        String str2 = "";
        jSONObject.put("browse_time", i == 3 ? String.valueOf(System.currentTimeMillis() - this.f15106M) : str2);
        C64848y91 y912 = ((C54991o) mo87696x0(C54991o.class)).f154326i2;
        if (!(y912 == null || (str = y912.f186454e) == null)) {
            str2 = str;
        }
        jSONObject.put("anchor_category", str2);
        C54067f0.C0049b bVar = C54067f0.C0049b.ANCHOR_TIP;
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "json.toString()");
        ((C54108o) C86312j.m106911c(C54108o.class)).Px0(bVar, jSONObject2);
    }

    /* renamed from: a1 */
    public final void mo3199a1(boolean z) {
        Class cls = C55001u.class;
        this.f15098E.setEnabled(false);
        C50401mh0 mh02 = new C50401mh0();
        mh02.f138028d = 0;
        C48807b41 b412 = new C48807b41();
        b412.f130930d = z ? 1 : 0;
        mh02.f138029e = C89349b.m111674a(b412.toByteArray());
        C61926c.m72665J(new C45381p0(((C55001u) mo87696x0(cls)).f154420q.f182392d, ((C55001u) mo87696x0(cls)).f154416j, 0, mh02).mo9225i(), new C3166i(this));
        String str = this.f15109q;
        Log.m105924i(str, "setReplay replayLive:" + z);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: b1 */
    public final void mo3201b1(boolean z) {
        Context context;
        int i;
        MMSwitchBtn mMSwitchBtn = this.f15098E;
        if (z) {
            context = this.f166287d.getContext();
            i = C0966R.string.nd5;
        } else {
            context = this.f166287d.getContext();
            i = C0966R.string.nd6;
        }
        mMSwitchBtn.setContentDescription(context.getString(i));
    }

    /* renamed from: c1 */
    public final void mo3202c1(C32224a<C13598b0> aVar) {
        if (this.f15104K || C62042e.f176370a.mo87073d1(mo87684A0())) {
            this.f166287d.setAlpha(0.0f);
            mo10792g(0);
            this.f15096C.setVisibility(0);
            this.f166287d.animate().alpha(1.0f).setDuration(300).withEndAction(aVar != null ? new C3165h(aVar) : null).start();
        } else {
            mo10792g(0);
            this.f15096C.setVisibility(0);
            if (aVar != null) {
                aVar.invoke();
            }
        }
        if (this.f15108p.getLiveRole() == 1) {
            ((C54108o) C86312j.m106911c(C54108o.class)).Px0(C54067f0.C0049b.ENTER_LIVE_CLOSE_UI, "");
        }
        if (C58961d.f168673a.mo84157d("Entrance_LiveComplete")) {
            this.f15094A.setVisibility(0);
            C115669n.INSTANCE.mo160131h(22748, 3, 1, Long.valueOf(C31543z5.m39453c()), C66785b.f191882e.mo90662O5());
            this.f15094A.setOnClickListener(new C12481k0(this));
            return;
        }
        this.f15094A.setVisibility(8);
    }

    /* renamed from: d1 */
    public final void mo3203d1(String str) {
        Class cls = C54991o.class;
        C11193b.f33003a.mo11281b(((C54991o) mo87696x0(cls)).f154345o, ((C54991o) mo87696x0(cls)).mo75969L3(), this.f15095B, (C32226l<? super Boolean, C13598b0>) null);
    }

    /* renamed from: e1 */
    public final void mo3204e1() {
        Class cls = C54991o.class;
        this.f15095B.setBackgroundColor(this.f166287d.getContext().getResources().getColor(C0966R.color.f3421s_));
        String str = null;
        C58969q b = ((C54991o) mo87696x0(cls)).f154345o != null ? C58961d.f168673a.mo84155b(((C54991o) mo87696x0(cls)).f154345o) : null;
        if (!Util.isNullOrNil(b != null ? b.field_avatarUrl : null)) {
            if (b != null) {
                str = b.field_avatarUrl;
            }
            if (str == null) {
                str = "";
            }
            mo3203d1(str);
            return;
        }
        Log.m105924i(this.f15109q, "update bg fail,contact is null!");
        C86709a0.m107529k().f251779b.mo123455a(3736, this);
        C54795n5 D0 = mo14476D0();
        if (D0 != null) {
            D0.mo75710N(((C54991o) mo87696x0(cls)).f154345o);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x05c6  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x05cb  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x05ee  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x06b9  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x06bb  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x06be  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x06eb  */
    /* renamed from: f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3205f1(al1.C0079b r48) {
        /*
            r47 = this;
            r1 = r47
            r0 = r48
            java.lang.Class<cl1.l> r2 = cl1.C0668l.class
            java.lang.Class<kq.h> r3 = p185kq.C10383h.class
            java.lang.Class<ak1.o> r4 = ak1.C54108o.class
            java.lang.Class<ak1.w> r5 = ak1.C54116w.class
            java.lang.Class<cl1.u> r6 = cl1.C55001u.class
            java.lang.Class<cl1.o> r7 = cl1.C54991o.class
            java.lang.String r8 = "info"
            gy3.C87412m.m108594g(r0, r8)
            java.lang.String r8 = r1.f15109q
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "updateFinishInfo:"
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            android.widget.TextView r8 = r1.f15118z
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            android.view.ViewGroup r10 = r1.f166287d
            android.content.Context r10 = r10.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131827303(0x7f111a67, float:1.9287515E38)
            java.lang.String r10 = r10.getString(r11)
            r9.append(r10)
            r10 = 32
            r9.append(r10)
            y50.n0$a r11 = y50.C15936n0.f42815a
            int r12 = r0.f489a
            java.lang.String r13 = ":"
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 28
            r18 = 0
            java.lang.String r10 = y50.C15936n0.C15937a.m14866a(r11, r12, r13, r14, r15, r16, r17, r18)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.setText(r9)
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$d r8 = r1.f15102I
            java.util.ArrayList<com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$c> r8 = r8.f15126d
            r8.clear()
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$d r8 = r1.f15102I
            java.util.ArrayList<com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$c> r8 = r8.f15126d
            androidx.lifecycle.i0 r9 = r1.mo87696x0(r2)
            cl1.l r9 = (cl1.C0668l) r9
            r10 = 0
            r11 = 1
            boolean r9 = cl1.C0668l.m589e3(r9, r10, r11, r10)
            r12 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            if (r9 == 0) goto L_0x00f0
            java.lang.String r9 = r1.f15109q
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "add charge live:"
            r14.append(r15)
            androidx.lifecycle.i0 r15 = r1.mo87696x0(r2)
            cl1.l r15 = (cl1.C0668l) r15
            te3.e61 r15 = r15.mo630d3()
            if (r15 == 0) goto L_0x00a1
            int r15 = r15.f182922f
            goto L_0x00a2
        L_0x00a1:
            r15 = 0
        L_0x00a2:
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r14)
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$c r9 = new com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$c
            int r14 = r1.f15116x
            androidx.lifecycle.i0 r15 = r1.mo87696x0(r2)
            cl1.l r15 = (cl1.C0668l) r15
            te3.e61 r15 = r15.mo630d3()
            if (r15 == 0) goto L_0x00bf
            int r15 = r15.f182922f
            goto L_0x00c0
        L_0x00bf:
            r15 = 0
        L_0x00c0:
            r25 = r13
            long r12 = (long) r15
            android.view.ViewGroup r15 = r1.f166287d
            android.content.Context r15 = r15.getContext()
            android.content.res.Resources r15 = r15.getResources()
            r10 = 2131826939(0x7f1118fb, float:1.9286777E38)
            java.lang.String r10 = r15.getString(r10)
            java.lang.String r15 = "root.context.resources.g…_live_after_charge_title)"
            gy3.C87412m.m108593f(r10, r15)
            r20 = 0
            r22 = 0
            r23 = 24
            r24 = 0
            r15 = r9
            r16 = r14
            r17 = r12
            r19 = r10
            r15.<init>(r16, r17, r19, r20, r22, r23, r24)
            r8.add(r9)
            goto L_0x00f2
        L_0x00f0:
            r25 = r13
        L_0x00f2:
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$c r9 = new com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$c
            r28 = 0
            int r10 = r0.f490b
            long r12 = (long) r10
            android.view.ViewGroup r10 = r1.f166287d
            android.content.Context r10 = r10.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r14 = 2131826950(0x7f111906, float:1.9286799E38)
            java.lang.String r10 = r10.getString(r14)
            java.lang.String r14 = "root.context.resources.g…live_after_visitor_title)"
            gy3.C87412m.m108593f(r10, r14)
            r20 = 0
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r14 = r0.f502n
            r35 = 8
            r24 = 0
            r32 = 0
            r36 = 0
            r27 = r9
            r29 = r12
            r31 = r10
            r34 = r14
            r27.<init>(r28, r29, r31, r32, r34, r35, r36)
            r8.add(r9)
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$c r9 = new com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$c
            int r10 = r1.f15110r
            int r12 = r0.f494f
            long r12 = (long) r12
            android.view.ViewGroup r14 = r1.f166287d
            android.content.Context r14 = r14.getContext()
            android.content.res.Resources r14 = r14.getResources()
            r15 = 2131826943(0x7f1118ff, float:1.9286785E38)
            java.lang.String r14 = r14.getString(r15)
            java.lang.String r15 = "root.context.resources.g…_live_after_online_title)"
            gy3.C87412m.m108593f(r14, r15)
            r42 = 0
            r44 = 0
            r45 = 24
            r46 = 0
            r37 = r9
            r38 = r10
            r39 = r12
            r41 = r14
            r37.<init>(r38, r39, r41, r42, r44, r45, r46)
            r8.add(r9)
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$c r9 = new com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$c
            int r10 = r1.f15111s
            int r12 = r0.f495g
            long r12 = (long) r12
            android.view.ViewGroup r14 = r1.f166287d
            android.content.Context r14 = r14.getContext()
            android.content.res.Resources r14 = r14.getResources()
            r15 = 2131826937(0x7f1118f9, float:1.9286772E38)
            java.lang.String r14 = r14.getString(r15)
            java.lang.String r15 = "root.context.resources.g…after_avg_duration_title)"
            gy3.C87412m.m108593f(r14, r15)
            r22 = 0
            r23 = 24
            r15 = r9
            r16 = r10
            r17 = r12
            r19 = r14
            r15.<init>(r16, r17, r19, r20, r22, r23, r24)
            r8.add(r9)
            androidx.lifecycle.i0 r9 = r1.mo87696x0(r7)
            cl1.o r9 = (cl1.C54991o) r9
            boolean r9 = r9.f154182B
            if (r9 == 0) goto L_0x01c5
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$c r9 = new com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$c
            int r13 = r1.f15112t
            long r14 = r0.f491c
            android.view.ViewGroup r10 = r1.f166287d
            android.content.Context r10 = r10.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r12 = 2131826940(0x7f1118fc, float:1.9286779E38)
            java.lang.String r10 = r10.getString(r12)
            java.lang.String r12 = "root.context.resources.g…er_live_after_like_title)"
            gy3.C87412m.m108593f(r10, r12)
            r17 = 0
            r19 = 0
            r20 = 24
            r21 = 0
            r12 = r9
            r16 = r10
            r12.<init>(r13, r14, r16, r17, r19, r20, r21)
            r8.add(r9)
        L_0x01c5:
            java.lang.Class<cl1.b> r9 = cl1.C0654b.class
            androidx.lifecycle.i0 r9 = r1.mo87696x0(r9)
            cl1.b r9 = (cl1.C0654b) r9
            boolean r9 = r9.f1544f
            if (r9 == 0) goto L_0x0201
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$c r9 = new com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$c
            int r13 = r1.f15115w
            int r10 = r0.f497i
            long r14 = (long) r10
            android.view.ViewGroup r10 = r1.f166287d
            android.content.Context r10 = r10.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r12 = 2131826941(0x7f1118fd, float:1.928678E38)
            java.lang.String r10 = r10.getString(r12)
            java.lang.String r12 = "root.context.resources.g…ter_new_biz_follow_title)"
            gy3.C87412m.m108593f(r10, r12)
            r17 = 0
            r19 = 0
            r20 = 24
            r21 = 0
            r12 = r9
            r16 = r10
            r12.<init>(r13, r14, r16, r17, r19, r20, r21)
            r8.add(r9)
            goto L_0x0235
        L_0x0201:
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$c r9 = new com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$c
            int r10 = r1.f15113u
            int r12 = r0.f492d
            long r12 = (long) r12
            android.view.ViewGroup r14 = r1.f166287d
            android.content.Context r14 = r14.getContext()
            android.content.res.Resources r14 = r14.getResources()
            r15 = 2131826942(0x7f1118fe, float:1.9286783E38)
            java.lang.String r14 = r14.getString(r15)
            java.lang.String r15 = "root.context.resources.g…e_after_new_follow_title)"
            gy3.C87412m.m108593f(r14, r15)
            r32 = 0
            r34 = 0
            r35 = 24
            r36 = 0
            r27 = r9
            r28 = r10
            r29 = r12
            r31 = r14
            r27.<init>(r28, r29, r31, r32, r34, r35, r36)
            r8.add(r9)
        L_0x0235:
            androidx.lifecycle.i0 r9 = r1.mo87696x0(r7)
            cl1.o r9 = (cl1.C54991o) r9
            boolean r9 = r9.f154243Q1
            if (r9 == 0) goto L_0x026f
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$c r9 = new com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$c
            int r13 = r1.f15114v
            long r14 = r0.f493e
            android.view.ViewGroup r10 = r1.f166287d
            android.content.Context r10 = r10.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r12 = 2131826951(0x7f111907, float:1.92868E38)
            java.lang.String r10 = r10.getString(r12)
            java.lang.String r12 = "root.context.resources.g…e_after_wecoin_hot_title)"
            gy3.C87412m.m108593f(r10, r12)
            long r11 = r0.f496h
            r19 = 0
            r20 = 16
            r21 = 0
            r17 = r11
            r12 = r9
            r16 = r10
            r12.<init>(r13, r14, r16, r17, r19, r20, r21)
            r8.add(r9)
        L_0x026f:
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin$d r8 = r1.f15102I
            r8.notifyDataSetChanged()
            int r8 = r0.f499k
            r9 = 1
            if (r8 != r9) goto L_0x027b
            r8 = 1
            goto L_0x027c
        L_0x027b:
            r8 = 0
        L_0x027c:
            java.lang.String r9 = r1.f15109q
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "prepareReplayPanel replayPrivilege:"
            r10.append(r11)
            int r11 = r0.f499k
            r10.append(r11)
            java.lang.String r11 = " liveInfo:"
            r10.append(r11)
            sk1.a r11 = sk1.C63947a.f181274a
            androidx.lifecycle.i0 r12 = r1.mo87696x0(r6)
            cl1.u r12 = (cl1.C55001u) r12
            te3.c21 r12 = r12.f154420q
            java.lang.String r11 = r11.mo88736v(r12)
            r10.append(r11)
            java.lang.String r11 = ", haveJoinLive:"
            r10.append(r11)
            androidx.lifecycle.i0 r11 = r1.mo87696x0(r7)
            cl1.o r11 = (cl1.C54991o) r11
            boolean r11 = r11.f154186C
            r10.append(r11)
            java.lang.String r11 = " replaySwitchStatus="
            r10.append(r11)
            int r11 = r0.f501m
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            java.lang.String r9 = ""
            java.lang.String r10 = "HABBYGE-MALI.HellLiveVisitorReoprter"
            java.lang.String r11 = "report23057, liveid = "
            java.lang.String r12 = "getService(HellLiveReport::class.java)"
            java.lang.String r13 = "liveId"
            java.lang.String r14 = "finder_username"
            java.lang.String r15 = "username"
            r16 = r9
            if (r8 == 0) goto L_0x046d
            android.view.View r8 = r1.f15097D
            int r8 = r8.getVisibility()
            if (r8 == 0) goto L_0x039a
            android.view.View r8 = r1.f15097D
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r18 = k20.C60958c.f173611a
            r19 = r2
            r2 = r25
            r9.mo10233c(r2)
            java.lang.Object[] r28 = r9.mo10232b()
            java.lang.String r29 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin"
            java.lang.String r30 = "prepareReplayPanel"
            java.lang.String r31 = "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/AnchorFinishInfo;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            r27 = r8
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r2 = 0
            java.lang.Object r9 = r9.mo10231a(r2)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r2 = r9.intValue()
            r8.setVisibility(r2)
            java.lang.String r28 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin"
            java.lang.String r29 = "prepareReplayPanel"
            java.lang.String r30 = "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/AnchorFinishInfo;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            di3.d r2 = di3.C86312j.m106911c(r5)
            ak1.w r2 = (ak1.C54116w) r2
            androidx.lifecycle.i0 r8 = r1.mo87696x0(r7)
            cl1.o r8 = (cl1.C54991o) r8
            java.lang.String r8 = r8.f154345o
            androidx.lifecycle.i0 r9 = r1.mo87696x0(r6)
            cl1.u r9 = (cl1.C55001u) r9
            te3.c21 r9 = r9.f154420q
            r18 = r6
            r20 = r7
            long r6 = r9.f182392d
            r2.getClass()
            gy3.C87412m.m108594g(r8, r15)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r2.put(r14, r8)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r2.put(r13, r6)
            di3.d r6 = di3.C86312j.m106911c(r4)
            gy3.C87412m.m108593f(r6, r12)
            r27 = r6
            ht1.j5 r27 = (ht1.C8777j5) r27
            ak1.f0$n r28 = ak1.C54067f0.C0066n.LIVE_END_PAGE_LIVE_PLAYBACK
            di3.d r6 = di3.C86312j.m106911c(r3)
            kq.h r6 = (p185kq.C10383h) r6
            java.lang.String r6 = r6.mo10696E()
            if (r6 != 0) goto L_0x0370
            r30 = r16
            goto L_0x0372
        L_0x0370:
            r30 = r6
        L_0x0372:
            r32 = 0
            r33 = 16
            r34 = 0
            java.lang.String r31 = "1002"
            r29 = r2
            ht1.C8777j5.C8778a.m8609j(r27, r28, r29, r30, r31, r32, r33, r34)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r11)
            java.lang.Object r2 = r2.get(r13)
            java.lang.String r2 = (java.lang.String) r2
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            r2 = r19
            goto L_0x039e
        L_0x039a:
            r18 = r6
            r20 = r7
        L_0x039e:
            androidx.lifecycle.i0 r6 = r1.mo87696x0(r2)
            cl1.l r6 = (cl1.C0668l) r6
            r7 = 0
            r8 = 1
            boolean r6 = cl1.C0668l.m589e3(r6, r7, r8, r7)
            if (r6 == 0) goto L_0x03c3
            android.text.SpannableString r6 = new android.text.SpannableString
            android.view.ViewGroup r7 = r1.f166287d
            android.content.Context r7 = r7.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131826948(0x7f111904, float:1.9286795E38)
            java.lang.String r7 = r7.getString(r8)
            r6.<init>(r7)
            goto L_0x03d9
        L_0x03c3:
            android.text.SpannableString r6 = new android.text.SpannableString
            android.view.ViewGroup r7 = r1.f166287d
            android.content.Context r7 = r7.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131826947(0x7f111903, float:1.9286793E38)
            java.lang.String r7 = r7.getString(r8)
            r6.<init>(r7)
        L_0x03d9:
            android.view.ViewGroup r7 = r1.f166287d
            android.content.Context r7 = r7.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131826945(0x7f111901, float:1.9286789E38)
            java.lang.String r7 = r7.getString(r8)
            java.lang.String r8 = "root.context.resources.g…er_replay_desc_link_part)"
            gy3.C87412m.m108593f(r7, r8)
            r29 = 0
            r30 = 0
            r31 = 6
            r32 = 0
            r27 = r6
            r28 = r7
            int r8 = z04.C112550d0.m153769E(r27, r28, r29, r30, r31, r32)
            int r7 = r7.length()
            int r7 = r7 + r8
            if (r8 < 0) goto L_0x042f
            int r9 = r6.length()
            if (r7 > r9) goto L_0x042f
            qj1.g0 r9 = new qj1.g0
            r9.<init>(r1)
            r19 = r10
            r10 = 17
            r6.setSpan(r9, r8, r7, r10)
            android.view.ViewGroup r7 = r1.f166287d
            r8 = 2131307401(0x7f092b89, float:1.8233028E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r7.setText(r6)
            android.text.method.MovementMethod r6 = android.text.method.LinkMovementMethod.getInstance()
            r7.setMovementMethod(r6)
            goto L_0x0431
        L_0x042f:
            r19 = r10
        L_0x0431:
            com.tencent.mm.ui.widget.MMSwitchBtn r6 = r1.f15098E
            boolean r6 = r6.f220433y
            r1.mo3201b1(r6)
            com.tencent.mm.ui.widget.MMSwitchBtn r6 = r1.f15098E
            qj1.f0 r7 = new qj1.f0
            r7.<init>(r1)
            r6.setSwitchListener(r7)
            androidx.lifecycle.i0 r2 = r1.mo87696x0(r2)
            cl1.l r2 = (cl1.C0668l) r2
            r6 = 1
            r7 = 0
            boolean r2 = cl1.C0668l.m589e3(r2, r7, r6, r7)
            if (r2 == 0) goto L_0x0459
            com.tencent.mm.ui.widget.MMSwitchBtn r2 = r1.f15098E
            r2.setCheck(r6)
            r1.mo3199a1(r6)
            goto L_0x045f
        L_0x0459:
            com.tencent.mm.ui.widget.MMSwitchBtn r2 = r1.f15098E
            r8 = 0
            r2.setCheck(r8)
        L_0x045f:
            int r2 = r0.f501m
            if (r2 != r6) goto L_0x04ba
            com.tencent.mm.ui.widget.MMSwitchBtn r2 = r1.f15098E
            boolean r8 = r2.f220433y
            if (r8 != 0) goto L_0x04ba
            r2.setCheck(r6)
            goto L_0x04ba
        L_0x046d:
            r18 = r6
            r20 = r7
            r19 = r10
            r7 = 0
            android.view.View r2 = r1.f15097D
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r8 = 8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r6.mo10233c(r9)
            java.lang.Object[] r27 = r6.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin"
            java.lang.String r29 = "prepareReplayPanel"
            java.lang.String r30 = "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/AnchorFinishInfo;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r2
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            r8 = 0
            java.lang.Object r6 = r6.mo10231a(r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r2.setVisibility(r6)
            java.lang.String r27 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin"
            java.lang.String r28 = "prepareReplayPanel"
            java.lang.String r29 = "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/AnchorFinishInfo;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
        L_0x04ba:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = r0.f500l
            if (r2 == 0) goto L_0x04c1
            te3.ho2 r6 = r2.lite_app_info
            goto L_0x04c2
        L_0x04c1:
            r6 = r7
        L_0x04c2:
            if (r6 == 0) goto L_0x055a
            androidx.constraintlayout.widget.ConstraintLayout r6 = r1.f15103J
            int r6 = r6.getVisibility()
            if (r6 == 0) goto L_0x054b
            androidx.constraintlayout.widget.ConstraintLayout r6 = r1.f15103J
            r8 = 0
            r6.setVisibility(r8)
            di3.d r6 = di3.C86312j.m106911c(r5)
            ak1.w r6 = (ak1.C54116w) r6
            r8 = r20
            androidx.lifecycle.i0 r9 = r1.mo87696x0(r8)
            cl1.o r9 = (cl1.C54991o) r9
            java.lang.String r9 = r9.f154345o
            r10 = r18
            androidx.lifecycle.i0 r17 = r1.mo87696x0(r10)
            r7 = r17
            cl1.u r7 = (cl1.C55001u) r7
            te3.c21 r7 = r7.f154420q
            long r7 = r7.f182392d
            r6.getClass()
            gy3.C87412m.m108594g(r9, r15)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r6.put(r14, r9)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r6.put(r13, r7)
            di3.d r7 = di3.C86312j.m106911c(r4)
            gy3.C87412m.m108593f(r7, r12)
            r27 = r7
            ht1.j5 r27 = (ht1.C8777j5) r27
            ak1.f0$n r28 = ak1.C54067f0.C0066n.LIVE_END_PAGE_LIVE_DETAIL
            di3.d r7 = di3.C86312j.m106911c(r3)
            kq.h r7 = (p185kq.C10383h) r7
            java.lang.String r7 = r7.mo10696E()
            if (r7 != 0) goto L_0x0521
            r30 = r16
            goto L_0x0523
        L_0x0521:
            r30 = r7
        L_0x0523:
            r32 = 0
            r33 = 16
            r34 = 0
            java.lang.String r31 = "1002"
            r29 = r6
            ht1.C8777j5.C8778a.m8609j(r27, r28, r29, r30, r31, r32, r33, r34)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            java.lang.Object r6 = r6.get(r13)
            java.lang.String r6 = (java.lang.String) r6
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r7 = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            goto L_0x054f
        L_0x054b:
            r10 = r18
            r7 = r19
        L_0x054f:
            androidx.constraintlayout.widget.ConstraintLayout r6 = r1.f15103J
            qj1.e0 r8 = new qj1.e0
            r8.<init>(r1, r2)
            r6.setOnClickListener(r8)
            goto L_0x0565
        L_0x055a:
            r10 = r18
            r7 = r19
            androidx.constraintlayout.widget.ConstraintLayout r2 = r1.f15103J
            r6 = 8
            r2.setVisibility(r6)
        L_0x0565:
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderJumpInfo> r0 = r0.f498j
            if (r0 == 0) goto L_0x0709
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0571
            goto L_0x0709
        L_0x0571:
            java.util.Iterator r0 = r0.iterator()
        L_0x0575:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x058e
            java.lang.Object r2 = r0.next()
            r6 = r2
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r6 = (com.tencent.p014mm.protocal.protobuf.FinderJumpInfo) r6
            int r6 = r6.business_type
            r8 = 19
            if (r6 != r8) goto L_0x058a
            r6 = 1
            goto L_0x058b
        L_0x058a:
            r6 = 0
        L_0x058b:
            if (r6 == 0) goto L_0x0575
            goto L_0x058f
        L_0x058e:
            r2 = 0
        L_0x058f:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = (com.tencent.p014mm.protocal.protobuf.FinderJumpInfo) r2
            if (r2 == 0) goto L_0x0702
            te3.xo2 r0 = new te3.xo2
            r0.<init>()
            java.lang.String r6 = r2.report_info
            r8 = 0
            byte[] r6 = android.util.Base64.decode(r6, r8)
            if (r6 != 0) goto L_0x05a4
            r8 = r16
            goto L_0x05b9
        L_0x05a4:
            r0.parseFrom(r6)     // Catch:{ Exception -> 0x05aa }
            r8 = r16
            goto L_0x05ba
        L_0x05aa:
            r0 = move-exception
            r6 = r0
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r8] = r6
            java.lang.String r6 = "safeParser"
            r8 = r16
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r8, r0)
        L_0x05b9:
            r0 = 0
        L_0x05ba:
            if (r0 == 0) goto L_0x05cb
            java.lang.String r0 = r0.f144775d
            if (r0 == 0) goto L_0x05cb
            java.lang.Integer r0 = z04.C66731x.m78731e(r0)
            if (r0 == 0) goto L_0x05cb
            int r0 = r0.intValue()
            goto L_0x05cc
        L_0x05cb:
            r0 = -1
        L_0x05cc:
            r1.f15105L = r0
            java.lang.String r0 = r1.f15109q
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "on show guide, diagnosisId = "
            r6.append(r9)
            int r9 = r1.f15105L
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r6)
            android.view.View r0 = r1.f15099F
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x06a2
            android.view.View r0 = r1.f15099F
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            r9 = r25
            r6.mo10233c(r9)
            java.lang.Object[] r27 = r6.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin"
            java.lang.String r29 = "doShowGuide"
            java.lang.String r30 = "(Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r0
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            r9 = 0
            java.lang.Object r6 = r6.mo10231a(r9)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.setVisibility(r6)
            java.lang.String r27 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin"
            java.lang.String r28 = "doShowGuide"
            java.lang.String r29 = "(Lcom/tencent/mm/protocal/protobuf/FinderJumpInfo;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
            di3.d r0 = di3.C86312j.m106911c(r5)
            ak1.w r0 = (ak1.C54116w) r0
            r5 = r20
            androidx.lifecycle.i0 r5 = r1.mo87696x0(r5)
            cl1.o r5 = (cl1.C54991o) r5
            java.lang.String r5 = r5.f154345o
            androidx.lifecycle.i0 r6 = r1.mo87696x0(r10)
            cl1.u r6 = (cl1.C55001u) r6
            te3.c21 r6 = r6.f154420q
            long r9 = r6.f182392d
            r0.getClass()
            gy3.C87412m.m108594g(r5, r15)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r0.put(r14, r5)
            java.lang.String r5 = java.lang.String.valueOf(r9)
            r0.put(r13, r5)
            di3.d r4 = di3.C86312j.m106911c(r4)
            gy3.C87412m.m108593f(r4, r12)
            r25 = r4
            ht1.j5 r25 = (ht1.C8777j5) r25
            ak1.f0$n r26 = ak1.C54067f0.C0066n.LIVE_END_PAGE_DIAGNOSIS
            di3.d r3 = di3.C86312j.m106911c(r3)
            kq.h r3 = (p185kq.C10383h) r3
            java.lang.String r3 = r3.mo10696E()
            if (r3 != 0) goto L_0x067b
            r28 = r8
            goto L_0x067d
        L_0x067b:
            r28 = r3
        L_0x067d:
            r30 = 0
            r31 = 16
            r32 = 0
            java.lang.String r29 = "1002"
            r27 = r0
            ht1.C8777j5.C8778a.m8609j(r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            java.lang.Object r0 = r0.get(r13)
            java.lang.String r0 = (java.lang.String) r0
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
        L_0x06a2:
            android.widget.TextView r0 = r1.f15101H
            java.lang.String r3 = r2.wording
            r0.setText(r3)
            java.lang.String r0 = r2.icon_url
            android.widget.ImageView r3 = r1.f15100G
            r4 = 2131232497(0x7f0806f1, float:1.8081105E38)
            if (r0 == 0) goto L_0x06bb
            int r5 = r0.length()
            if (r5 != 0) goto L_0x06b9
            goto L_0x06bb
        L_0x06b9:
            r12 = 0
            goto L_0x06bc
        L_0x06bb:
            r12 = 1
        L_0x06bc:
            if (r12 != 0) goto L_0x06eb
            bl3.r r5 = bl3.C39818r.f106831a
            java.lang.Class<ht1.t1> r6 = ht1.C60200t1.class
            bl3.r$a r5 = r5.mo62446e(r6)
            java.lang.Class<pl1.s0> r6 = pl1.C11990s0.class
            bl3.c r5 = r5.mo62447c(r6)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11871f2()
            pl1.n0 r6 = new pl1.n0
            up1.y r7 = up1.C27696y.THUMB_IMAGE
            r6.<init>(r0, r7)
            l60.b r5 = r5.mo85955a(r6)
            qj1.i0 r6 = new qj1.i0
            r6.<init>(r3, r1, r0, r4)
            r5.getClass()
            r5.f291320d = r6
            r5.mo85951a()
            goto L_0x06f3
        L_0x06eb:
            qj1.j0 r0 = new qj1.j0
            r0.<init>(r3, r1, r4)
            o40.C61926c.m72668M(r0)
        L_0x06f3:
            android.view.View r0 = r1.f15099F
            qj1.d0 r3 = new qj1.d0
            r3.<init>(r1, r2)
            r0.setOnClickListener(r3)
            r2 = 1
            r1.mo3198Z0(r2)
            goto L_0x0709
        L_0x0702:
            java.lang.String r0 = r1.f15109q
            java.lang.String r2 = "invalid jump info"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
        L_0x0709:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin.mo3205f1(al1.b):void");
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (this.f15108p.getLiveRole() != 1) {
            return false;
        }
        ((C54108o) C86312j.m106911c(C54108o.class)).Px0(C54067f0.C0049b.CLICK_FINISH, "");
        return false;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        Class cls = C54991o.class;
        String str3 = this.f15109q;
        Log.m105924i(str3, "onSceneEnd errType:" + i + ", errCode:" + i2 + ", scene:" + yVar);
        if (yVar instanceof C16196b) {
            C16196b bVar = (C16196b) yVar;
            FinderContact P0 = bVar.mo10101P0();
            String str4 = this.f15109q;
            StringBuilder sb = new StringBuilder();
            sb.append("update bg,user page isOnlyFetchUserInfo:");
            sb.append(bVar.mo10103X0());
            sb.append(", local username:");
            sb.append(((C54991o) mo87696x0(cls)).f154345o);
            sb.append(",req username:");
            sb.append(bVar.mo10105c1());
            sb.append("，contact username:");
            sb.append(P0 != null ? P0.username : null);
            Log.m105924i(str4, sb.toString());
            if (bVar.mo10103X0() && C87412m.m108589b(bVar.mo10105c1(), ((C54991o) mo87696x0(cls)).f154345o)) {
                C86709a0.m107529k().f251779b.mo123470p(3736, this);
                if (P0 != null && (str2 = P0.headUrl) != null) {
                    mo3203d1(str2);
                }
            }
        }
    }

    /* renamed from: s0 */
    public void mo3209s0() {
        if (this.f15106M > 0) {
            mo3198Z0(3);
            this.f15106M = 0;
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        if (C3167g.f15136a[bVar.ordinal()] == 1) {
            this.f15104K = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_MANUAL") : false;
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        C86709a0.m107529k().f251779b.mo123470p(3736, this);
    }
}
