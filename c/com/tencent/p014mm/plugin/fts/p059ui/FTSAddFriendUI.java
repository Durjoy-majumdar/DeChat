package com.tencent.p014mm.plugin.fts.p059ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.BizPreSearchEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.fts.p059ui.widget.FTSLocalPageRelevantView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C45286l;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kv1.C99251g;
import kv1.C99252h;
import kv1.C99254i;
import lv1.C99667f;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p196ln.C76705f;
import p248ug.C52574z;
import pv1.C22019b;
import sf0.C48374j0;
import sv1.C13787a;
import te3.C50324lx3;
import te3.C77967mx3;
import u73.C101987v0;
import u73.C22613h1;
import u73.C52468u0;
import u73.C78137s0;
import xv1.C23115a;
import zt3.C119157j;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.fts.ui.FTSAddFriendUI */
public class FTSAddFriendUI extends FTSBaseUI {

    /* renamed from: Q */
    public static final /* synthetic */ int f52662Q = 0;

    /* renamed from: A */
    public TextView f52663A;

    /* renamed from: B */
    public boolean f52664B;

    /* renamed from: C */
    public boolean f52665C;

    /* renamed from: D */
    public int f52666D = 1;

    /* renamed from: E */
    public FTSLocalPageRelevantView f52667E;

    /* renamed from: F */
    public C18846f f52668F;

    /* renamed from: G */
    public long f52669G;

    /* renamed from: H */
    public C77967mx3 f52670H;

    /* renamed from: I */
    public int f52671I;

    /* renamed from: J */
    public int f52672J;

    /* renamed from: K */
    public String f52673K;

    /* renamed from: L */
    public final C11385n f52674L = new C18810c();

    /* renamed from: M */
    public Dialog f52675M;

    /* renamed from: N */
    public int f52676N = -1;

    /* renamed from: P */
    public long f52677P;

    /* renamed from: o */
    public View f52678o;

    /* renamed from: p */
    public View f52679p;

    /* renamed from: q */
    public View f52680q;

    /* renamed from: r */
    public View f52681r;

    /* renamed from: s */
    public View f52682s;

    /* renamed from: t */
    public View f52683t;

    /* renamed from: u */
    public View f52684u;

    /* renamed from: v */
    public ImageView f52685v;

    /* renamed from: w */
    public TextView f52686w;

    /* renamed from: x */
    public TextView f52687x;

    /* renamed from: y */
    public TextView f52688y;

    /* renamed from: z */
    public TextView f52689z;

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSAddFriendUI$a */
    public class C18807a implements Runnable {
        public C18807a() {
        }

        public void run() {
            FTSAddFriendUI.this.f52754h.getFtsEditText().mo70355k();
            FTSAddFriendUI.this.f52754h.getFtsEditText().mo70361q();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSAddFriendUI$d */
    public class C18808d implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C45286l f52691d;

        public C18808d(C45286l lVar) {
            this.f52691d = lVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f52691d);
            C86709a0.m107524d().mo123470p(106, FTSAddFriendUI.this.f52674L);
            FTSAddFriendUI.this.f52675M = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSAddFriendUI$b */
    public class C18809b implements View.OnClickListener {
        public C18809b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fts/ui/FTSAddFriendUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FTSAddFriendUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSAddFriendUI$c */
    public class C18810c implements C11385n {
        public C18810c() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C86709a0.m107524d().mo123470p(106, this);
            FTSAddFriendUI fTSAddFriendUI = FTSAddFriendUI.this;
            int i3 = FTSAddFriendUI.f52662Q;
            fTSAddFriendUI.getClass();
            MMHandlerThread.postToMainThread(new C41654j(fTSAddFriendUI));
            if (i == 0 && i2 == 0) {
                C45286l lVar = (C45286l) yVar;
                FTSAddFriendUI.this.f52670H = lVar.mo70811l0();
                FTSAddFriendUI fTSAddFriendUI2 = FTSAddFriendUI.this;
                C50324lx3 lx32 = (C50324lx3) lVar.f122663e.f127055a.f127080a;
                fTSAddFriendUI2.f52673K = lx32 != null ? C48374j0.m53718g(lx32.f137693d) : "";
                C77967mx3 mx32 = FTSAddFriendUI.this.f52670H;
                if (mx32.f227845D > 0) {
                    if (mx32.f227846E.isEmpty()) {
                        C76879j.m92744o(FTSAddFriendUI.this, C0966R.string.igp, 0, true, (DialogInterface.OnClickListener) null);
                        return;
                    }
                    Intent intent = new Intent();
                    intent.putExtra("add_more_friend_search_scene", 3);
                    if (FTSAddFriendUI.this.f52670H.f227846E.size() > 1) {
                        try {
                            intent.putExtra("result", FTSAddFriendUI.this.f52670H.toByteArray());
                            C88144b.m109791i(FTSAddFriendUI.this.getContext(), "subapp", ".ui.pluginapp.ContactSearchResultUI", intent, (Bundle) null);
                            return;
                        } catch (IOException e) {
                            Log.printErrStackTrace("MicroMsg.FTS.FTSAddFriendUI", e, "", new Object[0]);
                            return;
                        }
                    } else {
                        ((C52574z) C86312j.m106911c(C52574z.class)).mo73535ek(intent, FTSAddFriendUI.this.f52670H.f227846E.getFirst(), FTSAddFriendUI.this.f52676N);
                    }
                }
                FTSAddFriendUI fTSAddFriendUI3 = FTSAddFriendUI.this;
                fTSAddFriendUI3.f52671I = 1;
                BizPreSearchEvent bizPreSearchEvent = new BizPreSearchEvent();
                BizPreSearchEvent.C40042a aVar = bizPreSearchEvent.f107375d;
                aVar.f107377a = fTSAddFriendUI3;
                aVar.f107378b = 16;
                aVar.f107379c = fTSAddFriendUI3.f52756j;
                aVar.f107382f = fTSAddFriendUI3.getString(C0966R.string.igq);
                BizPreSearchEvent.C40042a aVar2 = bizPreSearchEvent.f107375d;
                aVar2.f107380d = 1;
                C41653i iVar = new C41653i(fTSAddFriendUI3, bizPreSearchEvent);
                aVar2.f107383g = iVar;
                aVar2.f107381e = 1;
                if (!bizPreSearchEvent.publish()) {
                    bizPreSearchEvent.f107376e.f107384a = false;
                    iVar.run();
                }
            } else {
                if (i2 == -24) {
                    C7660a a = C7660a.m7782a(str);
                    if (a != null) {
                        FTSAddFriendUI.this.f52689z.setText(a.f26001b);
                    } else {
                        FTSAddFriendUI.this.f52689z.setText(C0966R.string.h9p);
                    }
                } else if (i2 != -4) {
                    FTSAddFriendUI.this.f52689z.setText(C0966R.string.h9p);
                } else if (i == 4) {
                    FTSAddFriendUI.this.f52689z.setText(C0966R.string.h9p);
                } else {
                    FTSAddFriendUI fTSAddFriendUI4 = FTSAddFriendUI.this;
                    fTSAddFriendUI4.f52689z.setText(fTSAddFriendUI4.getString(C0966R.string.igk));
                }
                FTSAddFriendUI fTSAddFriendUI5 = FTSAddFriendUI.this;
                fTSAddFriendUI5.f52671I = -1;
                fTSAddFriendUI5.f52672J = 1;
            }
            FTSAddFriendUI.m19566S7(FTSAddFriendUI.this);
        }
    }

    /* renamed from: S7 */
    public static void m19566S7(FTSAddFriendUI fTSAddFriendUI) {
        FTSAddFriendUI fTSAddFriendUI2 = fTSAddFriendUI;
        if (fTSAddFriendUI2.f52671I != 0 && fTSAddFriendUI2.f52672J != 0) {
            MMHandlerThread.postToMainThread(new C41654j(fTSAddFriendUI2));
            int i = fTSAddFriendUI2.f52671I;
            if (i <= 0 || fTSAddFriendUI2.f52672J >= 0) {
                if (i > 0) {
                    C77967mx3 mx32 = fTSAddFriendUI2.f52670H;
                    String g = C48374j0.m53718g(mx32.f227857d);
                    String g2 = C48374j0.m53718g(mx32.f227858e);
                    String str = mx32.f227865o;
                    fTSAddFriendUI2.f52750d.setVisibility(8);
                    View view = fTSAddFriendUI2.f52679p;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view2 = fTSAddFriendUI2.f52680q;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    fTSAddFriendUI2.f52684u.setOnClickListener(new C18849h(fTSAddFriendUI2));
                    fTSAddFriendUI2.f52686w.setText(g2);
                    fTSAddFriendUI2.f52687x.setText(str);
                    ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(fTSAddFriendUI2.f52685v, g);
                    View view4 = fTSAddFriendUI2.f52681r;
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(8);
                    View view5 = view4;
                    C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view6 = fTSAddFriendUI2.f52682s;
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(8);
                    View view7 = view6;
                    C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view7, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view8 = fTSAddFriendUI2.f52683t;
                    C9556a aVar5 = new C9556a();
                    aVar5.mo10233c(8);
                    C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view8, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    fTSAddFriendUI2.f52667E.setVisibility(8);
                } else {
                    fTSAddFriendUI2.f52750d.setVisibility(8);
                    View view9 = fTSAddFriendUI2.f52679p;
                    C9556a aVar6 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar6.mo10233c(0);
                    C117292a.m165358d(view9, aVar6.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view9, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view10 = fTSAddFriendUI2.f52680q;
                    C9556a aVar7 = new C9556a();
                    aVar7.mo10233c(8);
                    View view11 = view10;
                    C117292a.m165358d(view11, aVar7.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view10.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                    C117292a.m165359e(view11, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view12 = fTSAddFriendUI2.f52681r;
                    C9556a aVar8 = new C9556a();
                    aVar8.mo10233c(0);
                    C117292a.m165358d(view12, aVar8.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view12.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                    C117292a.m165359e(view12, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view13 = fTSAddFriendUI2.f52682s;
                    C9556a aVar9 = new C9556a();
                    aVar9.mo10233c(8);
                    View view14 = view13;
                    C117292a.m165358d(view14, aVar9.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view13.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                    C117292a.m165359e(view14, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view15 = fTSAddFriendUI2.f52683t;
                    C9556a aVar10 = new C9556a();
                    aVar10.mo10233c(8);
                    C117292a.m165358d(view15, aVar10.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view15.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                    C117292a.m165359e(view15, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    fTSAddFriendUI2.f52667E.setVisibility(8);
                }
                if (fTSAddFriendUI2.f52672J <= 0) {
                    View view16 = fTSAddFriendUI2.f52682s;
                    C9556a aVar11 = new C9556a();
                    aVar11.mo10233c(8);
                    C117292a.m165358d(view16, aVar11.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoSearchContentLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view16.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                    C117292a.m165359e(view16, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoSearchContentLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view17 = fTSAddFriendUI2.f52683t;
                    C9556a aVar12 = new C9556a();
                    aVar12.mo10233c(8);
                    View view18 = view17;
                    C117292a.m165358d(view18, aVar12.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoSearchContentLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view17.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
                    C117292a.m165359e(view18, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoSearchContentLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    fTSAddFriendUI2.f52667E.setVisibility(8);
                } else if (!C101987v0.m134276j()) {
                    View view19 = fTSAddFriendUI2.f52682s;
                    C9556a aVar13 = new C9556a();
                    aVar13.mo10233c(0);
                    View view20 = view19;
                    C117292a.m165358d(view20, aVar13.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasSearchContentLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view19.setVisibility(((Integer) aVar13.mo10231a(0)).intValue());
                    C117292a.m165359e(view20, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasSearchContentLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view21 = fTSAddFriendUI2.f52683t;
                    C9556a aVar14 = new C9556a();
                    aVar14.mo10233c(0);
                    View view22 = view21;
                    C117292a.m165358d(view22, aVar14.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasSearchContentLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view21.setVisibility(((Integer) aVar14.mo10231a(0)).intValue());
                    C117292a.m165359e(view22, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasSearchContentLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    TextView textView = fTSAddFriendUI2.f52688y;
                    String string = fTSAddFriendUI2.getString(C0966R.string.f3n);
                    String str2 = fTSAddFriendUI2.f52756j;
                    textView.setText(C99254i.m129307d(string, "", C99667f.m130088a(str2, str2, false, false)).f292107a);
                    fTSAddFriendUI2.f52666D = 2;
                    fTSAddFriendUI2.f52683t.setOnClickListener(new C18847g(fTSAddFriendUI2));
                }
            } else {
                fTSAddFriendUI2.f52665C = true;
                fTSAddFriendUI.mo23748U7();
            }
        }
    }

    /* renamed from: H7 */
    public C18852m mo23744H7(C18854q qVar) {
        if (this.f52668F == null) {
            this.f52668F = new C18846f(qVar);
        }
        return this.f52668F;
    }

    /* renamed from: Q7 */
    public void mo23745Q7() {
        super.mo23745Q7();
        View view = this.f52679p;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: R7 */
    public void mo23746R7() {
        super.mo23746R7();
        View view = this.f52679p;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "stopSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "stopSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: T7 */
    public final void mo23747T7(String str) {
        this.f52664B = true;
        this.f52665C = false;
        this.f52666D = 1;
        if (str != null && str.length() != 0 && str.trim().length() != 0) {
            this.f52676N = Character.isDigit(str.charAt(0)) ? 15 : 3;
            this.f52671I = 0;
            this.f52672J = 0;
            C86709a0.m107524d().mo123455a(106, this.f52674L);
            C45286l lVar = new C45286l(str, 3);
            C86709a0.m107524d().mo123460f(lVar);
            this.f52675M = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.igj), true, true, new C18808d(lVar));
        }
    }

    /* renamed from: U7 */
    public final void mo23748U7() {
        if (Util.nullAsNil(C48374j0.m53718g(this.f52670H.f227857d)).length() > 0) {
            int i = this.f52670H.f227852K;
            if (2 == i) {
                this.f52676N = 15;
            } else if (1 == i) {
                this.f52676N = 1;
            }
            Intent intent = new Intent();
            ((C52574z) C86312j.m106911c(C52574z.class)).mo73528B0(intent, this.f52670H, this.f52676N);
            if (this.f52676N == 15 && 2 == this.f52670H.f227852K) {
                intent.putExtra("Contact_Search_Mobile", this.f52673K);
            }
            intent.putExtra("add_more_friend_search_scene", 2);
            C88144b.m109791i(this, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        }
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        super.mo3001b3(str, str2, list, mVar);
        this.f52664B = false;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.asp;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        HashSet hashSet = new HashSet(super.importUIComponents());
        hashSet.add(C13787a.class);
        return hashSet;
    }

    /* renamed from: o6 */
    public void mo23749o6(View view, C22019b bVar, boolean z) {
        if ((bVar instanceof C23115a) && System.currentTimeMillis() - this.f52669G > 1000) {
            this.f52669G = System.currentTimeMillis();
            mo23747T7(bVar.mo35139k());
        }
    }

    public void onBackPressed() {
        finish();
    }

    public void onClickClearTextBtn(View view) {
        super.onClickClearTextBtn(view);
        if (!this.f52754h.getFtsEditText().mo70354j()) {
            this.f52754h.getFtsEditText().mo70355k();
            showVKB();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C99252h.f291030c = C99251g.m129286g(16);
        Transition inflateTransition = TransitionInflater.from(this).inflateTransition(17760258);
        inflateTransition.excludeTarget(getWindow().getDecorView().findViewById(C0966R.C0970id.f5383do), true);
        inflateTransition.excludeTarget(16908335, true);
        getWindow().setEnterTransition(inflateTransition);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.a7_));
        this.f52755i = getContext().getResources().getString(C0966R.string.bub);
        this.f52754h.getFtsEditText().setHint(mo23781J7());
        this.f52678o = findViewById(C0966R.C0970id.a8k);
        this.f52679p = findViewById(C0966R.C0970id.bmj);
        this.f52680q = findViewById(C0966R.C0970id.etj);
        this.f52684u = findViewById(C0966R.C0970id.bmk);
        this.f52681r = findViewById(C0966R.C0970id.hge);
        this.f52682s = findViewById(C0966R.C0970id.gsv);
        this.f52683t = findViewById(C0966R.C0970id.j5_);
        this.f52667E = (FTSLocalPageRelevantView) findViewById(C0966R.C0970id.ikr);
        this.f52685v = (ImageView) findViewById(C0966R.C0970id.bm_);
        this.f52686w = (TextView) findViewById(C0966R.C0970id.bqi);
        this.f52687x = (TextView) findViewById(C0966R.C0970id.bmo);
        this.f52688y = (TextView) findViewById(C0966R.C0970id.f359142j73);
        this.f52689z = (TextView) findViewById(C0966R.C0970id.bmp);
        this.f52663A = (TextView) findViewById(C0966R.C0970id.j5b);
        try {
            String optString = C78137s0.m94340d("webSearchBar").optString("wording");
            Log.m105925i("MicroMsg.FTS.FTSAddFriendUI", "set searchNetworkTips %s", optString);
            this.f52663A.setText(optString);
        } catch (Exception unused) {
        }
        getContentView().postDelayed(new C18807a(), 128);
        this.f52678o.setOnClickListener(new C18809b());
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(106, this.f52674L);
        if (this.f52664B && !this.f52665C) {
            C22613h1.m26478d(this.f52756j, this.f52666D, 3, 16);
        }
    }

    public void onResume() {
        super.onResume();
        ((C119157j) C119157j.f356862d).mo183879j(new C52468u0(true, false), 0, "WebSearchThread");
    }

    /* renamed from: y */
    public boolean mo3009y() {
        mo23747T7(this.f52756j);
        hideVKB();
        return true;
    }
}
