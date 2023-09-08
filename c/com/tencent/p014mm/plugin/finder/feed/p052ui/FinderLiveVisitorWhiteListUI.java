package com.tencent.p014mm.plugin.finder.feed.p052ui;

import ak1.C54067f0;
import ak1.C54108o;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import el1.C7736a;
import el1.C7741d;
import el1.C7746g;
import el1.C7747h;
import el1.C7748i;
import el1.C7749j;
import el1.C7750k;
import el1.C7755p;
import el1.C7756q;
import el1.C7758r;
import el1.C7760s;
import el1.C7761t;
import el1.C7763u;
import el1.C7765v;
import er1.C58739j4;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C88989a;
import o40.C61926c;
import ok1.C62042e;
import qo3.C77407n;
import rx3.C36570n;
import sg1.C13677a;
import sk1.C63947a;
import sx3.C36907w;
import sx3.C64197v;
import te3.C50555nj3;
import te3.C51020qw0;
import te3.C51745vv0;
import te3.C51946xa1;
import vf1.C14830t3;
import vf1.C14835u3;
import vf1.C14839v3;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R$\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\f¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorWhiteListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "v", "Lrx3/b0;", "onClick", "o", "Landroid/view/View;", "getTitleGroup", "()Landroid/view/View;", "setTitleGroup", "(Landroid/view/View;)V", "titleGroup", "q", "getLiveModeGroup", "setLiveModeGroup", "liveModeGroup", "<init>", "()V", "a", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI */
public final class FinderLiveVisitorWhiteListUI extends MMFinderUI implements View.OnClickListener {

    /* renamed from: v */
    public static final C2981a f14583v = new C2981a((C8480h) null);

    /* renamed from: o */
    public View f14584o;

    /* renamed from: p */
    public TextView f14585p;

    /* renamed from: q */
    public View f14586q;

    /* renamed from: r */
    public TextView f14587r;

    /* renamed from: s */
    public int f14588s;

    /* renamed from: t */
    public C2981a.C2982a f14589t = C2981a.C2982a.PUBLIC;

    /* renamed from: u */
    public boolean f14590u;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI$a */
    public static final class C2981a {

        /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI$a$a */
        public enum C2982a {
            PUBLIC(1),
            PARTIAL(2),
            CHARGE(3),
            PREHEARSAL(4);

            /* access modifiers changed from: public */
            C2982a(int i) {
            }
        }

        public C2981a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo3049a(LinkedList<C51745vv0> linkedList) {
            int i = 0;
            if (linkedList == null || linkedList.isEmpty()) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (T next : linkedList) {
                int i2 = i + 1;
                if (i >= 0) {
                    sb.append(((C51745vv0) next).f143710e);
                    if (i < linkedList.size() - 1) {
                        sb.append(",");
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "result.toString()");
            return sb4;
        }

        /* renamed from: b */
        public final String mo3050b(List<String> list) {
            String pv02;
            C87412m.m108594g(list, "selectedList");
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (T next : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    C72996z1 N2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69664N2((String) next);
                    String str = "";
                    if (!(N2 == null || (pv02 = ((C75339i) C86312j.m106911c(C75339i.class)).pv0(N2, N2.getUsername())) == null)) {
                        str = pv02;
                    }
                    sb.append(str);
                    if (i < list.size() - 1) {
                        sb.append(",");
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "result.toString()");
            return sb4;
        }
    }

    /* renamed from: J7 */
    public String mo2994J7() {
        return "FinderLiveVisitorWhiteListUI";
    }

    /* renamed from: N7 */
    public final void mo3039N7(int i) {
        int i2 = this.f14588s;
        Pattern pattern = C61926c.f176038a;
        mo3044S7(i | i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        if ((r0.f140581e <= 0 && r2 > 0) != false) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042 A[ADDED_TO_REGION] */
    /* renamed from: O7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3040O7() {
        /*
            r7 = this;
            java.lang.Class<el1.d> r0 = el1.C7741d.class
            android.widget.TextView r1 = r7.f14585p
            if (r1 != 0) goto L_0x0007
            goto L_0x004e
        L_0x0007:
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r3 = r2.mo62444c(r7)
            androidx.lifecycle.i0 r3 = r3.mo75002a(r0)
            el1.d r3 = (el1.C7741d) r3
            boolean r3 = r3.f26217D
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x004a
            bl3.r$a r2 = r2.mo62444c(r7)
            androidx.lifecycle.i0 r0 = r2.mo75002a(r0)
            el1.d r0 = (el1.C7741d) r0
            te3.qw0 r0 = r0.f26214A
            te3.nj3 r2 = r0.f140583g
            if (r2 == 0) goto L_0x0030
            int r3 = r2.f138632d
            r6 = 2
            if (r3 != r6) goto L_0x0030
            r3 = 1
            goto L_0x0031
        L_0x0030:
            r3 = 0
        L_0x0031:
            if (r3 == 0) goto L_0x0038
            if (r2 == 0) goto L_0x003d
            int r2 = r2.f138634f
            goto L_0x003e
        L_0x0038:
            if (r2 == 0) goto L_0x003d
            int r2 = r2.f138633e
            goto L_0x003e
        L_0x003d:
            r2 = 0
        L_0x003e:
            int r0 = r0.f140581e
            if (r0 <= 0) goto L_0x0046
            if (r2 <= 0) goto L_0x0046
            r0 = 1
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            if (r0 == 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r4 = 0
        L_0x004b:
            r1.setEnabled(r4)
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWhiteListUI.mo3040O7():void");
    }

    /* renamed from: P7 */
    public final void mo3041P7(boolean z) {
        C39818r.C39819a aVar;
        Class cls;
        if (z) {
            aVar = C39818r.f106831a.mo62444c(this);
            cls = C7760s.class;
        } else {
            aVar = C39818r.f106831a.mo62444c(this);
            cls = C7765v.class;
        }
        C39622i0 a = aVar.mo75002a(cls);
        C87412m.m108593f(a, "UICProvider.of(this).get…WhiteListUIC::class.java)");
        C7736a aVar2 = (C7736a) a;
        TextView textView = this.f14585p;
        if (textView != null) {
            textView.setEnabled(aVar2.f26198p.size() > 0 || aVar2.f26199q.size() > 0 || aVar2.f26200r.size() > 0);
        }
    }

    /* renamed from: Q7 */
    public final void mo3042Q7(C2981a.C2982a aVar) {
        Class cls = C7741d.class;
        Class cls2 = C7755p.class;
        Class cls3 = C7760s.class;
        Class cls4 = C7765v.class;
        C87412m.m108594g(aVar, "mode");
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            TextView textView = this.f14587r;
            if (textView != null) {
                textView.setText(getString(C0966R.string.e_2));
            }
            C39818r rVar = C39818r.f106831a;
            ((C7755p) rVar.mo62444c(this).mo75002a(cls2)).getClass();
            ((C7765v) rVar.mo62444c(this).mo75002a(cls4)).mo8878o3(false);
            ((C7741d) rVar.mo62444c(this).mo75002a(cls)).mo8861c3(false);
            ((C7760s) rVar.mo62444c(this).mo75002a(cls3)).mo8875o3(false);
            TextView textView2 = this.f14585p;
            if (textView2 != null) {
                textView2.setEnabled(true);
            }
            ((C54108o) C86312j.m106911c(C54108o.class)).getClass();
            C54067f0 f0Var = C54108o.f151869h;
            C54067f0.C0067n0 n0Var = C54067f0.C0067n0.PUBLIC;
            f0Var.getClass();
            f0Var.f151424F = n0Var;
        } else if (ordinal == 1) {
            TextView textView3 = this.f14587r;
            if (textView3 != null) {
                textView3.setText(getString(C0966R.string.n9j));
            }
            C39818r rVar2 = C39818r.f106831a;
            ((C7755p) rVar2.mo62444c(this).mo75002a(cls2)).getClass();
            ((C7765v) rVar2.mo62444c(this).mo75002a(cls4)).mo8878o3(true);
            ((C7741d) rVar2.mo62444c(this).mo75002a(cls)).mo8861c3(false);
            ((C7760s) rVar2.mo62444c(this).mo75002a(cls3)).mo8875o3(false);
            ((C7765v) rVar2.mo62444c(this).mo75002a(cls4)).mo8853k3();
            mo3041P7(false);
        } else if (ordinal == 2) {
            TextView textView4 = this.f14587r;
            if (textView4 != null) {
                textView4.setText(getString(C0966R.string.e27));
            }
            C39818r rVar3 = C39818r.f106831a;
            ((C7755p) rVar3.mo62444c(this).mo75002a(cls2)).getClass();
            ((C7765v) rVar3.mo62444c(this).mo75002a(cls4)).mo8878o3(false);
            ((C7741d) rVar3.mo62444c(this).mo75002a(cls)).mo8861c3(true);
            ((C7760s) rVar3.mo62444c(this).mo75002a(cls3)).mo8875o3(false);
            mo3040O7();
        } else if (ordinal == 3) {
            TextView textView5 = this.f14587r;
            if (textView5 != null) {
                textView5.setText(getString(C0966R.string.n9t));
            }
            C39818r rVar4 = C39818r.f106831a;
            ((C7755p) rVar4.mo62444c(this).mo75002a(cls2)).getClass();
            ((C7765v) rVar4.mo62444c(this).mo75002a(cls4)).mo8878o3(false);
            ((C7741d) rVar4.mo62444c(this).mo75002a(cls)).mo8861c3(false);
            ((C7760s) rVar4.mo62444c(this).mo75002a(cls3)).mo8875o3(true);
            ((C7760s) rVar4.mo62444c(this).mo75002a(cls3)).mo8853k3();
            mo3041P7(true);
        }
    }

    /* renamed from: R7 */
    public final void mo3043R7(boolean z) {
        Class cls = C7741d.class;
        Class cls2 = C7765v.class;
        StringBuilder sb = new StringBuilder();
        sb.append("goBack isCancel:");
        sb.append(z);
        sb.append(" chooseMode:");
        sb.append(this.f14588s);
        sb.append(", chooseWhiteList.size:");
        C39818r rVar = C39818r.f106831a;
        sb.append(((C7765v) rVar.mo62444c(this).mo75002a(cls2)).f26198p.size());
        sb.append(", partician whiteList:");
        C63947a aVar = C63947a.f181274a;
        sb.append(aVar.mo88730p(((C7765v) rVar.mo62444c(this).mo75002a(cls2)).f26201s));
        sb.append(", chargeInfo:");
        sb.append(aVar.mo88724j(((C7741d) rVar.mo62444c(this).mo75002a(cls)).f26214A));
        Log.m105924i("FinderLiveVisitorWhiteListUI", sb.toString());
        boolean z2 = false;
        if (z) {
            setResult(0);
        } else {
            Intent intent = new Intent();
            C2981a.C2982a aVar2 = this.f14589t;
            boolean z3 = true;
            if (aVar2 == C2981a.C2982a.CHARGE) {
                C7741d dVar = (C7741d) rVar.mo62444c(this).mo75002a(cls);
                C50555nj3 nj32 = dVar.f26214A.f140583g;
                if (!(nj32 != null && nj32.f138632d == 1)) {
                    if (nj32 == null || nj32.f138632d != 2) {
                        z3 = false;
                    }
                    if (z3 && nj32 != null) {
                        nj32.f138633e = 0;
                    }
                } else if (nj32 != null) {
                    nj32.f138634f = 0;
                }
                Log.m105924i("FinderLiveChargeWhiteListUIC", "after adjustLiveChargeInfo liveChargeInfo:" + aVar.mo88724j(dVar.f26214A));
                intent.putExtra("KEY_PARAMS_VISIBILITY_MODE", 0);
                intent.putExtra("KEY_PARAMS_LIVE_CHARGE", ((C7741d) rVar.mo62444c(this).mo75002a(cls)).f26214A.toByteArray());
            } else {
                if (aVar2 == C2981a.C2982a.PREHEARSAL) {
                    z2 = true;
                }
                C39622i0 a = z2 ? rVar.mo62444c(this).mo75002a(C7760s.class) : rVar.mo62444c(this).mo75002a(cls2);
                C87412m.m108593f(a, "UICProvider.of(this).get…WhiteListUIC::class.java)");
                C7736a aVar3 = (C7736a) a;
                intent.putExtra("KEY_PARAMS_VISIBILITY_MODE", this.f14588s);
                intent.putExtra("KEY_PARAMS_IS_TEST_LIVE", z2);
                LinkedList<C51745vv0> linkedList = aVar3.f26198p;
                ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                for (C51745vv0 byteArray : linkedList) {
                    arrayList.add(byteArray.toByteArray());
                }
                intent.putExtra("KEY_PARAMS_CHOOSE_WHITE_LIST", arrayList);
                intent.putStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LIST_ROOM", new ArrayList(aVar3.f26199q));
                intent.putStringArrayListExtra("KEY_PARAMS_CHOOSE_WHITE_LIST_USER", new ArrayList(aVar3.f26200r));
                intent.putExtra("KEY_PARAMS_LIVE_PART_WHITE_LIST", aVar3.f26201s.toByteArray());
            }
            setResult(-1, intent);
        }
        finish();
    }

    /* renamed from: S7 */
    public final void mo3044S7(int i) {
        Log.m105924i("FinderLiveVisitorWhiteListUI", "chooseMode from:" + this.f14588s + " - to:" + i);
        this.f14588s = i;
    }

    /* renamed from: T7 */
    public final void mo3045T7(C2981a.C2982a aVar) {
        C87412m.m108594g(aVar, "value");
        Log.m105924i("FinderLiveVisitorWhiteListUI", "viewMode from:" + this.f14589t + " - to:" + aVar);
        this.f14589t = aVar;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d66;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorWhiteListUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.aq9) {
            mo3043R7(true);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.e_1) {
            mo3043R7(false);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.o2_ && !this.f14590u) {
            C77407n nVar = new C77407n((Context) this, 1, false);
            nVar.f225771i = new C14835u3(this);
            nVar.f225782p = new C14839v3(this);
            nVar.mo107573q();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisitorWhiteListUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        C2981a.C2982a aVar;
        Class cls = C7760s.class;
        Class cls2 = C7741d.class;
        Class cls3 = C7765v.class;
        Class cls4 = C7755p.class;
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        getContext().getWindow().addFlags(67108864);
        getContext().getWindow().clearFlags(67108864);
        getContext().getWindow().getDecorView().setSystemUiVisibility(1792);
        getContext().getWindow().addFlags(Integer.MIN_VALUE);
        getContext().getWindow().setStatusBarColor(0);
        getContext().getWindow().setNavigationBarColor(0);
        getContext().getWindow().setFormat(-3);
        getContext().getWindow().setSoftInputMode(51);
        getController().mo177049H0(C85875k4.m106211z());
        Log.m105924i("FinderLiveVisitorWhiteListUI", "[onCreate]");
        this.f14590u = getIntent().getBooleanExtra("KEY_PARAMS_IS_NOTICE_PAY_LIVE", false);
        View findViewById = findViewById(C0966R.C0970id.kom);
        this.f14584o = findViewById;
        if (findViewById != null) {
            findViewById.post(new C14830t3(this));
        }
        TextView textView = (TextView) findViewById(C0966R.C0970id.aq9);
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.e_1);
        this.f14585p = textView2;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        View findViewById2 = findViewById(C0966R.C0970id.o2_);
        this.f14586q = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        this.f14587r = (TextView) findViewById(C0966R.C0970id.o2d);
        C39818r rVar = C39818r.f106831a;
        ((C7755p) rVar.mo62444c(this).mo75002a(cls4)).getClass();
        C7765v vVar = (C7765v) rVar.mo62444c(this).mo75002a(cls3);
        vVar.f26189d = (ViewGroup) vVar.findViewById(C0966R.C0970id.o1x);
        View findViewById3 = vVar.findViewById(C0966R.C0970id.o1z);
        vVar.f26190e = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new C7761t(vVar));
        }
        vVar.f26191f = (TextView) vVar.findViewById(C0966R.C0970id.f358905o22);
        View findViewById4 = vVar.findViewById(C0966R.C0970id.f358907o24);
        vVar.f26192g = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new C7763u(vVar));
        }
        vVar.f26193h = vVar.findViewById(C0966R.C0970id.f358906o23);
        vVar.f26194i = vVar.findViewById(C0966R.C0970id.o26);
        vVar.f26195j = (TextView) vVar.findViewById(C0966R.C0970id.o27);
        TextView textView3 = (TextView) vVar.findViewById(C0966R.C0970id.o28);
        C13677a aVar2 = C13677a.f38723a;
        C87412m.m108593f(textView3, "this");
        aVar2.mo13063c(textView3);
        vVar.f26196n = textView3;
        C7741d dVar = (C7741d) rVar.mo62444c(this).mo75002a(cls2);
        dVar.f26219e = (ViewGroup) dVar.findViewById(C0966R.C0970id.fsd);
        View findViewById5 = dVar.findViewById(C0966R.C0970id.fsk);
        dVar.f26227p = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new C7746g(dVar));
        }
        TextView textView4 = (TextView) dVar.findViewById(C0966R.C0970id.o0i);
        dVar.f26229r = textView4;
        if (textView4 != null) {
            C58739j4.f168176a.mo83703c0(textView4, false);
        }
        dVar.f26228q = dVar.findViewById(C0966R.C0970id.fsl);
        View findViewById6 = dVar.findViewById(C0966R.C0970id.mmc);
        dVar.f26230s = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(new C7747h(dVar));
        }
        dVar.f26231t = (TextView) dVar.findViewById(C0966R.C0970id.n5h);
        View findViewById7 = dVar.findViewById(C0966R.C0970id.n2i);
        int i = ((Boolean) ((C36570n) dVar.f26218d).getValue()).booleanValue() ? 0 : 4;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar3.mo10233c(Integer.valueOf(i));
        View view = findViewById7;
        C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeWhiteListUIC", "initLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById7.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeWhiteListUIC", "initLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        dVar.f26232u = findViewById7;
        View findViewById8 = dVar.findViewById(C0966R.C0970id.n8r);
        dVar.f26233v = findViewById8;
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(new C7748i(dVar));
        }
        dVar.f26234w = (TextView) dVar.findViewById(C0966R.C0970id.n8t);
        View findViewById9 = dVar.findViewById(C0966R.C0970id.nat);
        dVar.f26220f = findViewById9;
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(new C7749j(dVar));
        }
        dVar.f26221g = (TextView) dVar.findViewById(C0966R.C0970id.nda);
        View findViewById10 = dVar.findViewById(C0966R.C0970id.o0c);
        dVar.f26222h = findViewById10;
        if (findViewById10 != null) {
            findViewById10.setOnClickListener(new C7750k(dVar));
        }
        dVar.f26223i = dVar.findViewById(C0966R.C0970id.ndb);
        dVar.f26224j = (TextView) dVar.findViewById(C0966R.C0970id.o0j);
        dVar.f26225n = dVar.findViewById(C0966R.C0970id.n8v);
        TextView textView5 = (TextView) dVar.findViewById(C0966R.C0970id.o0e);
        C87412m.m108593f(textView5, "this");
        aVar2.mo13063c(textView5);
        dVar.f26226o = textView5;
        C7760s sVar = (C7760s) rVar.mo62444c(this).mo75002a(cls);
        sVar.f26189d = (ViewGroup) sVar.findViewById(C0966R.C0970id.f359052o31);
        View findViewById11 = sVar.findViewById(C0966R.C0970id.o2s);
        sVar.f26190e = findViewById11;
        if (findViewById11 != null) {
            findViewById11.setOnClickListener(new C7756q(sVar));
        }
        sVar.f26191f = (TextView) sVar.findViewById(C0966R.C0970id.o2z);
        View findViewById12 = sVar.findViewById(C0966R.C0970id.f359054o33);
        sVar.f26192g = findViewById12;
        if (findViewById12 != null) {
            findViewById12.setOnClickListener(new C7758r(sVar));
        }
        sVar.f26193h = sVar.findViewById(C0966R.C0970id.f359053o32);
        sVar.f26194i = sVar.findViewById(C0966R.C0970id.o2v);
        sVar.f26195j = (TextView) sVar.findViewById(C0966R.C0970id.o2w);
        TextView textView6 = (TextView) sVar.findViewById(C0966R.C0970id.o2x);
        C87412m.m108593f(textView6, "this");
        aVar2.mo13063c(textView6);
        sVar.f26196n = textView6;
        ((C7755p) rVar.mo62444c(this).mo75002a(cls4)).getClass();
        ((C7760s) rVar.mo62444c(this).mo75002a(cls)).mo8850g3();
        ((C7765v) rVar.mo62444c(this).mo75002a(cls3)).mo8850g3();
        C7741d dVar2 = (C7741d) rVar.mo62444c(this).mo75002a(cls2);
        byte[] byteArrayExtra = dVar2.getIntent().getByteArrayExtra("KEY_PARAMS_LIVE_CHARGE");
        if (byteArrayExtra != null) {
            C51020qw0 qw02 = new C51020qw0();
            qw02.parseFrom(byteArrayExtra);
            dVar2.f26214A = qw02;
        }
        C51020qw0 qw03 = dVar2.f26214A;
        if (qw03.f140582f == null) {
            qw03.f140582f = new C51946xa1();
        }
        C51020qw0 qw04 = dVar2.f26214A;
        if (qw04.f140583g == null) {
            qw04.f140583g = new C50555nj3();
        }
        C50555nj3 nj32 = dVar2.f26214A.f140583g;
        if (nj32 != null) {
            if (nj32.f138632d == 0) {
                nj32.f138632d = 1;
            }
            if (nj32.f138633e == 0) {
                nj32.f138633e = 180;
            }
            if (nj32.f138634f == 0) {
                nj32.f138634f = 180;
            }
        }
        Serializable serializableExtra = dVar2.getIntent().getSerializableExtra("KEY_PARAMS_WHITE_LIST");
        List list = serializableExtra instanceof List ? (List) serializableExtra : null;
        if (list != null) {
            C62042e.f176370a.mo87126w1(list, dVar2.f26237z);
        }
        Log.m105924i("FinderLiveChargeWhiteListUIC", "live_charge_step1 initLogic liveChargeInfo:" + C63947a.f181274a.mo88724j(dVar2.f26214A));
        mo3044S7(getIntent().getIntExtra("KEY_PARAMS_VISIBILITY_MODE", 0));
        if (getIntent().getByteArrayExtra("KEY_PARAMS_LIVE_CHARGE") != null) {
            aVar = C2981a.C2982a.CHARGE;
        } else if (getIntent().getBooleanExtra("KEY_PARAMS_IS_TEST_LIVE", false)) {
            aVar = C2981a.C2982a.PREHEARSAL;
        } else {
            int i2 = this.f14588s;
            aVar = C61926c.m72696u(i2, 2) || C61926c.m72696u(i2, 4) || C61926c.m72696u(i2, 1) ? C2981a.C2982a.PARTIAL : C2981a.C2982a.PUBLIC;
        }
        mo3045T7(aVar);
        mo3042Q7(this.f14589t);
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_PARAMS_FIRST_ENTER_WHITE_LIST", false);
        if (booleanExtra && !this.f14590u) {
            C77407n nVar = new C77407n((Context) this, 1, false);
            nVar.f225771i = new C14835u3(this);
            nVar.f225782p = new C14839v3(this);
            nVar.mo107573q();
        }
        Log.m105924i("FinderLiveVisitorWhiteListUI", "initLogic chooseMode:" + this.f14588s + ",viewMode:" + this.f14589t + ",firstEnterWhiteList:" + booleanExtra + '!');
    }

    public void onSwipeBack() {
        super.onSwipeBack();
        mo3043R7(true);
    }

    public final void setLiveModeGroup(View view) {
        this.f14586q = view;
    }

    public final void setTitleGroup(View view) {
        this.f14584o = view;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C7755p.class);
        hashSet.add(C7765v.class);
        hashSet.add(C7741d.class);
        hashSet.add(C7760s.class);
    }
}
