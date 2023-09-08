package com.tencent.p014mm.plugin.game.luggage.p801ui.circle;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.game.luggage.p801ui.circle.C42016b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import k20.C60958c;
import k20.C9556a;
import o90.C100301b;
import ob0.C47350c;
import ob0.C89132b;
import p823sg.C101611g;
import q90.C101062d;
import rx3.C13598b0;
import uw1.C52624b;
import uw1.C52628f;
import uy1.C52645f;
import zt3.C119157j;
import zx1.C53843a;

/* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView */
public class AtSomeoneView extends MRecyclerView {

    /* renamed from: C1 */
    public Context f113106C1;

    /* renamed from: D1 */
    public C42000e f113107D1;

    /* renamed from: E1 */
    public LinearLayoutManager f113108E1;

    /* renamed from: F1 */
    public C101611g<String, Bitmap> f113109F1;

    /* renamed from: G1 */
    public final List<C52628f> f113110G1 = new LinkedList();

    /* renamed from: H1 */
    public final List<C52628f> f113111H1 = new LinkedList();

    /* renamed from: I1 */
    public final List<C52628f> f113112I1 = new LinkedList();

    /* renamed from: J1 */
    public List<String> f113113J1 = new LinkedList();

    /* renamed from: K1 */
    public Bundle f113114K1;

    /* renamed from: L1 */
    public int f113115L1 = -1;

    /* renamed from: M1 */
    public boolean f113116M1 = false;

    /* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView$a */
    public class C41996a implements C87581a<Object, C89132b.C89134c<C52624b>> {

        /* renamed from: a */
        public final /* synthetic */ C42002f f113117a;

        public C41996a(C42002f fVar) {
            this.f113117a = fVar;
        }

        public Object call(Object obj) {
            T t;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.AtSomeoneView", "do GetRemindUserListResponse errtype: %s, errcode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            if (cVar.f256793a == 0 && cVar.f256794b == 0 && (t = cVar.f256796d) != null) {
                ((LinkedList) AtSomeoneView.this.f113111H1).addAll(((C52624b) t).f146932d);
                ((LinkedList) AtSomeoneView.this.f113112I1).addAll(((C52624b) cVar.f256796d).f146933e);
                if (((C52624b) cVar.f256796d).f146935g) {
                    C42016b.C42017a aVar = C42016b.f113176d;
                    if (aVar.mo65918a().size() != 0) {
                        AtSomeoneView atSomeoneView = AtSomeoneView.this;
                        atSomeoneView.mo65897E1(atSomeoneView.f113111H1, aVar.mo65918a());
                        C42002f fVar = this.f113117a;
                        if (fVar != null) {
                            fVar.mo65902a(true);
                        }
                    } else {
                        AtSomeoneView.this.f113114K1.putByteArray("context", ((C52624b) cVar.f256796d).f146934f.mo123703f());
                        AtSomeoneView.this.mo65895C1(this.f113117a);
                    }
                } else {
                    AtSomeoneView atSomeoneView2 = AtSomeoneView.this;
                    atSomeoneView2.mo65897E1(atSomeoneView2.f113111H1, atSomeoneView2.f113112I1);
                    List<C52628f> list = AtSomeoneView.this.f113112I1;
                    C87412m.m108594g(list, "normalFriends");
                    if (C42016b.f113177e == null) {
                        synchronized (C42016b.class) {
                            if (C42016b.f113177e == null) {
                                C42016b.f113177e = new C42016b();
                            }
                            C13598b0 b0Var = C13598b0.f38549a;
                        }
                    }
                    C42016b bVar = C42016b.f113177e;
                    if (bVar != null) {
                        bVar.f113178a = C86709a0.m107523b().mo121110g();
                        C42016b bVar2 = C42016b.f113177e;
                        if (bVar2 != null) {
                            bVar2.f113179b = list;
                            C42016b bVar3 = C42016b.f113177e;
                            if (bVar3 != null) {
                                bVar3.f113180c = System.currentTimeMillis();
                                C42002f fVar2 = this.f113117a;
                                if (fVar2 != null) {
                                    fVar2.mo65902a(true);
                                }
                            } else {
                                C87412m.m108603p("instance");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("instance");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("instance");
                        throw null;
                    }
                }
            } else {
                Log.m105920e("MicroMsg.AtSomeoneView", "cgi request fail");
                AtSomeoneView atSomeoneView3 = AtSomeoneView.this;
                atSomeoneView3.mo65897E1(atSomeoneView3.f113111H1, C42016b.f113176d.mo65918a());
                C42002f fVar3 = this.f113117a;
                if (fVar3 != null) {
                    fVar3.mo65902a(false);
                }
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView$b */
    public class C41997b implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C42002f f113119a;

        public C41997b(C42002f fVar) {
            this.f113119a = fVar;
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            Log.m105925i("MicroMsg.AtSomeoneView", "do GetRemindUserListResponse errType: %s, errCode: %s", Integer.valueOf(i), Integer.valueOf(i2));
            if (i == 0 && i2 == 0 && cVar != null) {
                C52624b bVar = (C52624b) cVar.f127056b.f127083a;
                ((LinkedList) AtSomeoneView.this.f113111H1).addAll(bVar.f146932d);
                ((LinkedList) AtSomeoneView.this.f113112I1).addAll(bVar.f146933e);
                if (bVar.f146935g) {
                    AtSomeoneView.this.f113114K1.putByteArray("context", bVar.f146934f.mo123703f());
                    AtSomeoneView.this.mo65895C1(this.f113119a);
                    return;
                }
                AtSomeoneView atSomeoneView = AtSomeoneView.this;
                atSomeoneView.mo65897E1(atSomeoneView.f113111H1, atSomeoneView.f113112I1);
                C42002f fVar = this.f113119a;
                if (fVar != null) {
                    fVar.mo65902a(true);
                    return;
                }
                return;
            }
            Log.m105920e("MicroMsg.AtSomeoneView", "cgi request fail");
            C42002f fVar2 = this.f113119a;
            if (fVar2 != null) {
                fVar2.mo65902a(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView$c */
    public class C41998c implements Runnable {
        public C41998c() {
        }

        public void run() {
            if (((LinkedList) AtSomeoneView.this.f113110G1).size() > 0) {
                View findViewById = AtSomeoneView.this.getRootView().findViewById(C0966R.C0970id.f358340l73);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById2 = AtSomeoneView.this.getRootView().findViewById(C0966R.C0970id.aa9);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view2 = findViewById2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View findViewById3 = AtSomeoneView.this.getRootView().findViewById(C0966R.C0970id.f358340l73);
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view3 = findViewById3;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById4 = AtSomeoneView.this.getRootView().findViewById(C0966R.C0970id.aa9);
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                View view4 = findViewById4;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C42000e eVar = AtSomeoneView.this.f113107D1;
            LinkedList linkedList = new LinkedList(AtSomeoneView.this.f113110G1);
            eVar.f113124d = ((LinkedList) AtSomeoneView.this.f113110G1).size();
            ((LinkedList) eVar.f113125e).clear();
            if (!Util.isNullOrNil((List) linkedList)) {
                ((LinkedList) eVar.f113125e).addAll(linkedList);
            }
            eVar.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView$d */
    public class C41999d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f113122d;

        public C41999d(List list) {
            this.f113122d = list;
        }

        public void run() {
            if (this.f113122d.size() > 0) {
                View findViewById = AtSomeoneView.this.getRootView().findViewById(C0966R.C0970id.f358340l73);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById2 = AtSomeoneView.this.getRootView().findViewById(C0966R.C0970id.aa9);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view2 = findViewById2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View findViewById3 = AtSomeoneView.this.getRootView().findViewById(C0966R.C0970id.f358340l73);
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view3 = findViewById3;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById4 = AtSomeoneView.this.getRootView().findViewById(C0966R.C0970id.aa9);
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                View view4 = findViewById4;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C42000e eVar = AtSomeoneView.this.f113107D1;
            List list = this.f113122d;
            eVar.f113124d = list.size();
            ((LinkedList) eVar.f113125e).clear();
            if (!Util.isNullOrNil(list)) {
                ((LinkedList) eVar.f113125e).addAll(list);
            }
            eVar.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView$e */
    public class C42000e extends RecyclerView.C16613e<C42001a> {

        /* renamed from: d */
        public int f113124d;

        /* renamed from: e */
        public final List<C52628f> f113125e = new LinkedList();

        /* renamed from: f */
        public final List<String> f113126f = new ArrayList();

        /* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView$e$a */
        public class C42001a extends RecyclerView.C16631z {

            /* renamed from: A */
            public final ImageView f113128A;

            /* renamed from: B */
            public final TextView f113129B;

            /* renamed from: C */
            public final TextView f113130C;

            /* renamed from: D */
            public final View f113131D;

            /* renamed from: z */
            public final ImageView f113133z;

            public C42001a(View view) {
                super(view);
                this.f113133z = (ImageView) view.findViewById(C0966R.C0970id.aac);
                this.f113129B = (TextView) view.findViewById(C0966R.C0970id.aad);
                this.f113128A = (ImageView) view.findViewById(C0966R.C0970id.aa6);
                this.f113130C = (TextView) view.findViewById(C0966R.C0970id.aae);
                this.f113131D = view.findViewById(C0966R.C0970id.aa_);
            }
        }

        public C42000e() {
        }

        public int getItemCount() {
            return this.f113124d;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            int i2 = i;
            C42001a aVar = (C42001a) zVar;
            boolean z = AtSomeoneView.this.f113115L1 == i2;
            C52628f fVar = (C52628f) ((LinkedList) this.f113125e).get(i2);
            aVar.f113128A.setVisibility(8);
            if (fVar != null) {
                if (MMApplicationContext.isMainProcess()) {
                    C42000e eVar = C42000e.this;
                    ImageView imageView = aVar.f113133z;
                    String str = fVar.f146945f;
                    if (((C101062d) AtSomeoneView.this.f113109F1).check(str)) {
                        Bitmap bitmap = (Bitmap) ((C100301b) AtSomeoneView.this.f113109F1).get(str);
                        if (bitmap == null || bitmap.isRecycled()) {
                            C52645f.C52650d.C52651a aVar2 = new C52645f.C52650d.C52651a();
                            aVar2.f147020a = false;
                            aVar2.f147026g = 0.083333336f;
                            C52645f.m59023a().mo73595e(imageView, str, aVar2.mo73598a(), new C42015a(eVar, str));
                        } else {
                            imageView.setImageBitmap(bitmap);
                        }
                    } else {
                        C52645f.C52650d.C52651a aVar3 = new C52645f.C52650d.C52651a();
                        aVar3.f147020a = false;
                        aVar3.f147026g = 0.083333336f;
                        C52645f.m59023a().mo73595e(imageView, str, aVar3.mo73598a(), new C42015a(eVar, str));
                    }
                } else {
                    C20937c.C20939b bVar = new C20937c.C20939b();
                    bVar.f59364t = true;
                    C20828a.m22825b().mo32519h(fVar.f146945f, aVar.f113133z, bVar.mo32666a());
                }
                aVar.f113129B.setText(fVar.f146944e);
                aVar.f113130C.setText(fVar.f146946g);
                if (AtSomeoneView.this.f113113J1.contains(fVar.f146943d)) {
                    aVar.f113128A.setVisibility(0);
                } else {
                    aVar.f113128A.setVisibility(8);
                }
            }
            if (C85875k4.m106211z()) {
                aVar.f113128A.setImageResource(C0966R.raw.game_at_select_someone_box_dark);
            } else {
                aVar.f113128A.setImageResource(C0966R.raw.game_at_select_someone_box);
            }
            if (z) {
                View view = aVar.f113131D;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar4.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$AtSomeoneAdapter$AtSomeoneViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/autogen/luggage/game/RemindUser;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$AtSomeoneAdapter$AtSomeoneViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/autogen/luggage/game/RemindUser;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view3 = aVar.f113131D;
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar5.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$AtSomeoneAdapter$AtSomeoneViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/autogen/luggage/game/RemindUser;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView$AtSomeoneAdapter$AtSomeoneViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/game/autogen/luggage/game/RemindUser;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C52628f fVar2 = (C52628f) ((LinkedList) this.f113125e).get(i2);
            if (fVar2 != null) {
                if (!((ArrayList) this.f113126f).contains(fVar2.f146943d)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(Scopes.OPEN_ID, fVar2.f146943d);
                    hashMap.put("is_search", AtSomeoneView.this.f113116M1 ? "1" : "0");
                    C40314g.m43484c(AtSomeoneView.this.f113106C1, 101, 1, i2 + 1, 1, 0, C40314g.m43483b(hashMap));
                    ((ArrayList) this.f113126f).add(fVar2.f146943d);
                }
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C42001a(LayoutInflater.from(AtSomeoneView.this.f113106C1).inflate(C0966R.C0971layout.d6e, (ViewGroup) null));
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView$f */
    public interface C42002f {
        /* renamed from: a */
        void mo65902a(boolean z);
    }

    public AtSomeoneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo23020y1();
    }

    /* renamed from: B1 */
    public void mo65894B1(int i) {
        View findViewByPosition = this.f113108E1.findViewByPosition(i);
        if (findViewByPosition != null) {
            View findViewById = findViewByPosition.findViewById(C0966R.C0970id.aa6);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView", "cancelAt", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/game/luggage/ui/circle/AtSomeoneView", "cancelAt", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: C1 */
    public void mo65895C1(C42002f fVar) {
        C53843a aVar = new C53843a(this.f113114K1);
        if (MMApplicationContext.isMainProcess()) {
            aVar.mo9225i().mo123062e(new C41996a(fVar));
        } else {
            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(aVar.f256789f, new C41997b(fVar));
        }
    }

    /* renamed from: D1 */
    public void mo65896D1(String str) {
        List<C52628f> list;
        if (Objects.equals(str, "")) {
            list = this.f113110G1;
            this.f113116M1 = false;
        } else {
            this.f113116M1 = true;
            this.f113115L1 = -1;
            LinkedList linkedList = new LinkedList();
            for (C52628f next : this.f113110G1) {
                if (next.f146944e.contains(str)) {
                    if (((LinkedList) this.f113111H1).contains(next)) {
                        this.f113115L1++;
                    }
                    linkedList.add(next);
                }
            }
            list = linkedList;
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C41999d(list));
    }

    /* renamed from: E1 */
    public void mo65897E1(List<C52628f> list, List<C52628f> list2) {
        boolean z;
        ((LinkedList) this.f113110G1).clear();
        ((LinkedList) this.f113110G1).addAll(list);
        if (list.size() != 0) {
            this.f113115L1 = list.size() - 1;
        } else {
            this.f113115L1 = -1;
        }
        for (C52628f next : list2) {
            Iterator<C52628f> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f146943d.equals(next.f146943d)) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                ((LinkedList) this.f113110G1).add(next);
            }
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C41998c());
    }

    public C42000e getmAdapter() {
        return this.f113107D1;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (Bitmap recycle : ((C100301b) this.f113109F1).values()) {
            recycle.recycle();
        }
        ((C101062d) this.f113109F1).clear();
    }

    public void setSelectedDatas(List<String> list) {
        this.f113113J1 = list;
    }

    /* renamed from: y1 */
    public final void mo23020y1() {
        this.f113106C1 = getContext();
        this.f113109F1 = new C100301b(30, getClass());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f113106C1);
        this.f113108E1 = linearLayoutManager;
        linearLayoutManager.mo16974W(0);
        setLayoutManager(this.f113108E1);
        C42000e eVar = new C42000e();
        this.f113107D1 = eVar;
        setAdapter(eVar);
    }

    public AtSomeoneView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo23020y1();
    }
}
