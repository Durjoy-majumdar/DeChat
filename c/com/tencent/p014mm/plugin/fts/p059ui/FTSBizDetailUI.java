package com.tencent.p014mm.plugin.fts.p059ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.C93829e;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import kv1.C99251g;
import kv1.C99254i;
import kv1.C99260q;
import ob0.C11385n;
import ob0.C117747y;
import p206nj.C117627q;
import p255vr.C65873e;
import sx3.C64197v;
import te3.C22494eb3;
import te3.C49404fb3;
import te3.C51593us3;
import te3.C52241zb0;
import te3.pd4;
import te3.qd4;
import u73.C101982p;
import u73.C101987v0;
import u73.C22616y;
import u73.C52464j0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/fts/ui/FTSBizDetailUI;", "Lcom/tencent/mm/plugin/fts/ui/FTSBaseUI;", "Lob0/n;", "<init>", "()V", "ui-fts_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.fts.ui.FTSBizDetailUI */
public final class FTSBizDetailUI extends FTSBaseUI implements C11385n {

    /* renamed from: A */
    public long f52770A;

    /* renamed from: B */
    public HashSet<String> f52771B = new HashSet<>();

    /* renamed from: C */
    public int f52772C = 1;

    /* renamed from: o */
    public final String f52773o = "MicroMsg.FTS.FTSBizDetailUI";

    /* renamed from: p */
    public C18857u f52774p;

    /* renamed from: q */
    public View f52775q;

    /* renamed from: r */
    public View f52776r;

    /* renamed from: s */
    public View f52777s;

    /* renamed from: t */
    public View f52778t;

    /* renamed from: u */
    public LinearLayout f52779u;

    /* renamed from: v */
    public TextView f52780v;

    /* renamed from: w */
    public TextView f52781w;

    /* renamed from: x */
    public C49404fb3 f52782x;

    /* renamed from: y */
    public C22616y f52783y;

    /* renamed from: z */
    public String f52784z = C99251g.m129290k(69);

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSBizDetailUI$a */
    public static final class C18827a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FTSBizDetailUI f52785d;

        public C18827a(FTSBizDetailUI fTSBizDetailUI) {
            this.f52785d = fTSBizDetailUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$getFooterView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FTSBizDetailUI fTSBizDetailUI = this.f52785d;
            FTSBizDetailUI.m19644S7(fTSBizDetailUI, fTSBizDetailUI.f52756j);
            FTSBizDetailUI fTSBizDetailUI2 = this.f52785d;
            C49404fb3 fb32 = fTSBizDetailUI2.f52782x;
            if (fb32 != null) {
                fTSBizDetailUI2.mo23796U7(fb32, 3);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$getFooterView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.ui.FTSBizDetailUI$b */
    public static final class C18828b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FTSBizDetailUI f52786d;

        public C18828b(FTSBizDetailUI fTSBizDetailUI) {
            this.f52786d = fTSBizDetailUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$updateFooterView$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Object tag = view.getTag();
            if (tag != null) {
                FTSBizDetailUI fTSBizDetailUI = this.f52786d;
                if (tag instanceof C52241zb0) {
                    C52241zb0 zb02 = (C52241zb0) tag;
                    pd4 pd4 = zb02.f145785d;
                    FTSBizDetailUI.m19644S7(fTSBizDetailUI, pd4 != null ? pd4.f139710d : null);
                    C49404fb3 fb32 = fTSBizDetailUI.f52782x;
                    if (fb32 != null) {
                        fTSBizDetailUI.mo23795T7(zb02, fb32, 3);
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$updateFooterView$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: S7 */
    public static final void m19644S7(FTSBizDetailUI fTSBizDetailUI, String str) {
        fTSBizDetailUI.getClass();
        String str2 = ((C65873e) C86312j.m106911c(C65873e.class)).ep0(69).toString();
        HashMap hashMap = new HashMap();
        hashMap.put("sceneActionType", "1");
        hashMap.put("isHomePage", "0");
        hashMap.put("needCameraIcon", "0");
        Object[] objArr = new Object[4];
        objArr[0] = 35;
        C49404fb3 fb32 = fTSBizDetailUI.f52782x;
        String str3 = fb32 != null ? fb32.f133390d : null;
        if (str3 == null) {
            str3 = "";
        }
        objArr[1] = str3;
        objArr[2] = str;
        objArr[3] = Long.valueOf(fTSBizDetailUI.f52770A);
        String format = String.format("%s:%s:%s:%s", Arrays.copyOf(objArr, 4));
        C87412m.m108593f(format, "format(format, *args)");
        hashMap.put("parentSearchID", format);
        hashMap.put("businessType", "1");
        ((C101982p) C86312j.m106911c(C101982p.class)).mo6878da(fTSBizDetailUI, 69, str, str2, false, hashMap, 1, true);
    }

    /* renamed from: E2 */
    public void mo23760E2(int i, boolean z) {
        super.mo23760E2(i, z);
        mo23797V7();
    }

    /* renamed from: H7 */
    public C18852m mo23744H7(C18854q qVar) {
        C18857u uVar = this.f52774p;
        if (uVar != null) {
            return uVar;
        }
        C18857u uVar2 = new C18857u(this, 5);
        this.f52774p = uVar2;
        return uVar2;
    }

    /* renamed from: J7 */
    public String mo23781J7() {
        String string = getString(C0966R.string.ih4, new Object[]{getString(C0966R.string.f2o)});
        C87412m.m108593f(string, "getString(com.tencent.mm…R.string.fts_header_biz))");
        return string;
    }

    /* renamed from: O7 */
    public void mo23785O7() {
        super.mo23785O7();
        TextView textView = this.f52752f;
        if (textView != null) {
            textView.setText(getString(C0966R.string.bu_));
        }
        this.f52750d.setVisibility(0);
    }

    /* renamed from: Q7 */
    public void mo23745Q7() {
        super.mo23745Q7();
        if (this.f52783y != null) {
            C86709a0.m107524d().mo123458d(this.f52783y);
            this.f52783y = null;
        }
        this.f52770A = C99251g.m129286g(69);
        C22494eb3 eb32 = new C22494eb3();
        eb32.f63778d = this.f52756j;
        eb32.f63780f = String.valueOf(this.f52784z);
        eb32.f63781g = String.valueOf(this.f52770A);
        eb32.f63786o = 69;
        eb32.f63787p = 1;
        eb32.f63789r = C43471q.m46977a(0);
        C22616y yVar = new C22616y(eb32);
        C86709a0.m107524d().mo123460f(yVar);
        this.f52783y = yVar;
    }

    /* renamed from: R7 */
    public void mo23746R7() {
        super.mo23746R7();
        this.f52772C = 1;
        this.f52782x = null;
        View view = this.f52776r;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI", "resetUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI", "resetUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View view2 = this.f52777s;
        if (view2 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI", "resetUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI", "resetUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f52771B.clear();
        if (this.f52783y != null) {
            C86709a0.m107524d().mo123458d(this.f52783y);
            this.f52783y = null;
        }
    }

    /* renamed from: T7 */
    public final void mo23795T7(C52241zb0 zb02, C49404fb3 fb32, int i) {
        String str;
        String str2;
        C51593us3 us32 = new C51593us3();
        StringBuilder sb = new StringBuilder();
        sb.append("bizsugresultreport=1&searchid=");
        sb.append(fb32.f133390d);
        sb.append("&query=");
        sb.append(C117627q.m165909b(this.f52756j, "utf8"));
        sb.append("&scene=69&businesstype=1&type=");
        sb.append(i);
        sb.append("&clienttimestamp=");
        sb.append(C31543z5.m39453c());
        sb.append("&docid=");
        pd4 pd4 = zb02.f145785d;
        String str3 = "";
        if (pd4 == null || (str = pd4.f139711e) == null) {
            str = str3;
        }
        sb.append(str);
        sb.append("&sugpos=");
        sb.append(zb02.f145786e + 1);
        sb.append("&iss1sitem=0&sugresult=");
        pd4 pd42 = zb02.f145785d;
        if (!(pd42 == null || (str2 = pd42.f139710d) == null)) {
            str3 = str2;
        }
        sb.append(C117627q.m165909b(str3, "utf8"));
        us32.f143104t = sb.toString();
        String str4 = this.f52773o;
        Log.m105924i(str4, "reportSugAction " + us32.f143104t);
        C86709a0.m107524d().mo123460f(new C52464j0(us32));
    }

    /* renamed from: U7 */
    public final void mo23796U7(C49404fb3 fb32, int i) {
        C51593us3 us32 = new C51593us3();
        us32.f143104t = "bizsugresultreport=1&searchid=" + fb32.f133390d + "&query=" + C117627q.m165909b(this.f52756j, "utf8") + "&scene=69&businesstype=1&type=" + i + "&clienttimestamp=" + C31543z5.m39453c() + "&iss1sitem=1&docid=" + C117627q.m165909b(this.f52756j, "utf8");
        String str = this.f52773o;
        StringBuilder sb = new StringBuilder();
        sb.append("reportWebSearchBarAction ");
        sb.append(us32.f143104t);
        Log.m105924i(str, sb.toString());
        C86709a0.m107524d().mo123460f(new C52464j0(us32));
    }

    /* renamed from: V7 */
    public final void mo23797V7() {
        qd4 qd4;
        LinkedList<pd4> linkedList;
        if (!C101987v0.m134276j()) {
            LinearLayout linearLayout = this.f52779u;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            View view = this.f52776r;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI", "updateFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI", "updateFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view2 = this.f52777s;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI", "updateFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI", "updateFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView = this.f52780v;
            if (textView != null) {
                textView.setText(C99254i.m129316m(getString(C0966R.string.f3n), getString(C0966R.string.f35), this.f52756j + "  "));
            }
            C49404fb3 fb32 = this.f52782x;
            if (fb32 != null && (qd4 = fb32.f133396j) != null && (linkedList = qd4.f140251d) != null) {
                if (!(linkedList.size() > 0)) {
                    linkedList = null;
                }
                if (linkedList != null) {
                    int i = 0;
                    for (T next : linkedList) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            pd4 pd4 = (pd4) next;
                            View inflate = getLayoutInflater().inflate(C0966R.C0971layout.f359798au1, this.f52779u, false);
                            inflate.setOnClickListener(new C18828b(this));
                            TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.br8);
                            textView2.setText(pd4.f139710d);
                            textView2.setContentDescription(pd4.f139710d + getResources().getString(C0966R.string.f3s));
                            C52241zb0 zb02 = new C52241zb0();
                            zb02.f145785d = pd4;
                            zb02.f145786e = i;
                            inflate.setTag(zb02);
                            LinearLayout linearLayout2 = this.f52779u;
                            if (linearLayout2 != null) {
                                linearLayout2.addView(inflate);
                            }
                            i = i2;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                    LinearLayout linearLayout3 = this.f52779u;
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(0);
                    }
                }
            }
        }
    }

    public View getFooterView() {
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.atx, (ViewGroup) null, false);
        this.f52775q = inflate;
        if (inflate != null) {
            this.f52777s = inflate.findViewById(C0966R.C0970id.f359574lm0);
            this.f52776r = inflate.findViewById(C0966R.C0970id.f359577lm3);
            this.f52778t = inflate.findViewById(C0966R.C0970id.f359576lm2);
            this.f52780v = (TextView) inflate.findViewById(C0966R.C0970id.lm4);
            this.f52781w = (TextView) inflate.findViewById(C0966R.C0970id.f359575lm1);
            this.f52779u = (LinearLayout) inflate.findViewById(C0966R.C0970id.ikq);
        }
        View view = this.f52778t;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI", "getFooterView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        TextView textView = this.f52781w;
        if (textView != null) {
            textView.setVisibility(8);
        }
        View view3 = this.f52777s;
        if (view3 != null) {
            view3.setOnClickListener(new C18827a(this));
        }
        return this.f52775q;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.asr;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C93829e) ((C99260q) C86312j.m106911c(C99260q.class)).mo128746Ta()).mo128779g();
        C86709a0.m107524d().mo123455a(1076, this);
        this.f52754h.getFtsEditText().mo70338f();
        this.f52754h.getFtsEditText().mo70355k();
        this.f52754h.getFtsEditText().mo70361q();
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(1076, this);
        ((C93829e) ((C99260q) C86312j.m106911c(C99260q.class)).mo128746Ta()).mo128780h();
        C18857u uVar = this.f52774p;
        if (uVar != null) {
            uVar.mo23815g();
        }
        super.onDestroy();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        qd4 qd4;
        LinkedList<pd4> linkedList;
        C22616y yVar2 = this.f52783y;
        if (yVar2 != null) {
            Integer num = null;
            if (!C87412m.m108589b(yVar, yVar2)) {
                yVar2 = null;
            }
            if (yVar2 != null) {
                this.f52782x = yVar2.f65057f;
                String str2 = this.f52773o;
                StringBuilder sb = new StringBuilder();
                sb.append("onSceneEnd searchResponse GuideText:");
                C49404fb3 fb32 = this.f52782x;
                sb.append(fb32 != null ? fb32.f133394h : null);
                sb.append(" size:");
                C49404fb3 fb33 = this.f52782x;
                if (!(fb33 == null || (qd4 = fb33.f133396j) == null || (linkedList = qd4.f140251d) == null)) {
                    num = Integer.valueOf(linkedList.size());
                }
                sb.append(num);
                Log.m105924i(str2, sb.toString());
                mo23797V7();
            }
        }
    }
}
