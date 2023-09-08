package com.tencent.p014mm.mj_template.sns.compose.widget;

import a14.C0000n0;
import com.tencent.maas.model.MJTemplateInfo;
import com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.ResultKt;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;
import rx3.C13598b0;
import sx3.C36907w;
import sx3.C64186f0;
import te3.pr4;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.y1 */
public final class C55366y1 {

    /* renamed from: a */
    public final C0000n0 f157665a;

    /* renamed from: b */
    public final List<pr4> f157666b;

    /* renamed from: c */
    public final List<C55319n1> f157667c;

    /* renamed from: d */
    public final boolean f157668d;

    /* renamed from: e */
    public C32224a<C13598b0> f157669e = C55370d.f157681d;

    /* renamed from: f */
    public C32224a<C13598b0> f157670f = C55369c.f157680d;

    /* renamed from: g */
    public C32227p<? super String, ? super C15601d<? super Boolean>, ? extends Object> f157671g = new C55368b((C15601d<? super C55368b>) null);

    /* renamed from: h */
    public final C60690y0<List<C55319n1>> f157672h;

    /* renamed from: i */
    public final C60690y0 f157673i;

    /* renamed from: j */
    public final LinkedList<C55319n1> f157674j;

    /* renamed from: k */
    public final List<C55319n1.C55323d> f157675k;

    /* renamed from: l */
    public boolean f157676l;

    /* renamed from: m */
    public C55319n1 f157677m;

    /* renamed from: n */
    public C55367a f157678n;

    /* renamed from: o */
    public final HashSet<String> f157679o;

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.y1$a */
    public interface C55367a {
        /* renamed from: a */
        void mo76624a(String str);

        /* renamed from: b */
        void mo76625b(String str, int i);
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.sns.compose.widget.SnsTemplateListState$onSelectedTemplateChanged$1", mo125469f = "SnsTemplateList.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.y1$b */
    public static final class C55368b extends C91594j implements C32227p<String, C15601d<? super Boolean>, Object> {
        public C55368b(C15601d<? super C55368b> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C55368b(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            new C55368b((C15601d) obj2);
            ResultKt.throwOnFailure(C13598b0.f38549a);
            return Boolean.FALSE;
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            return Boolean.FALSE;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.y1$c */
    public static final class C55369c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C55369c f157680d = new C55369c();

        public C55369c() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.sns.compose.widget.y1$d */
    public static final class C55370d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C55370d f157681d = new C55370d();

        public C55370d() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    public C55366y1(C0000n0 n0Var, List<? extends pr4> list, List<? extends C55319n1> list2, boolean z) {
        C87412m.m108594g(n0Var, "asyncJobScope");
        C87412m.m108594g(list, "defaultTemplateList");
        C87412m.m108594g(list2, "topTemplate");
        this.f157665a = n0Var;
        this.f157666b = list;
        this.f157667c = list2;
        this.f157668d = z;
        C60690y0<List<C55319n1>> c = C108500f2.m146996c(C64186f0.f181907d, (C108497e2) null, 2, (Object) null);
        this.f157672h = c;
        this.f157673i = c;
        this.f157674j = new LinkedList<>();
        this.f157675k = new ArrayList();
        if (!list.isEmpty()) {
            mo76623f();
        }
        this.f157679o = new HashSet<>();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f157555a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo76618a() {
        /*
            r1 = this;
            com.tencent.mm.mj_template.sns.compose.widget.n1 r0 = r1.f157677m
            if (r0 == 0) goto L_0x0008
            java.lang.String r0 = r0.f157555a
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            java.lang.String r0 = ""
        L_0x000a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mj_template.sns.compose.widget.C55366y1.mo76618a():java.lang.String");
    }

    /* renamed from: b */
    public final List<C55319n1> mo76619b() {
        return (List) this.f157673i.getValue();
    }

    /* renamed from: c */
    public final void mo76620c(List<C55319n1.C55323d> list) {
        C87412m.m108594g(list, "list");
        if (list.isEmpty()) {
            Log.m105928w("MicroMsg.SnsTemplate.SnsTemplateListState", "empty template list");
        } else {
            this.f157676l = true;
        }
        List<C55319n1.C55323d> list2 = this.f157675k;
        list2.clear();
        list2.addAll(list);
        mo76623f();
    }

    /* renamed from: d */
    public final void mo76621d(List<? extends MJTemplateInfo> list) {
        T t;
        C87412m.m108594g(list, "list");
        ArrayList<MJTemplateInfo> arrayList = new ArrayList<>();
        for (T next : list) {
            MJTemplateInfo mJTemplateInfo = (MJTemplateInfo) next;
            List<pr4> list2 = this.f157666b;
            boolean z = false;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C87412m.m108589b(((pr4) it.next()).f139919d, mJTemplateInfo.getTemplateID())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        for (MJTemplateInfo mJTemplateInfo2 : arrayList) {
            Iterator<T> it4 = this.f157675k.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    t = null;
                    break;
                }
                t = it4.next();
                if (C87412m.m108589b(((C55319n1.C55323d) t).f157555a, mJTemplateInfo2.getTemplateID())) {
                    break;
                }
            }
            C55319n1.C55323d dVar = (C55319n1.C55323d) t;
            if (dVar == null) {
                C55319n1.C55323d.C55324a aVar = C55319n1.C55323d.f157561i;
                C87412m.m108594g(mJTemplateInfo2, "template");
                String templateID = mJTemplateInfo2.getTemplateID();
                C87412m.m108593f(templateID, "template.templateID");
                String displayName = mJTemplateInfo2.getDisplayName();
                C87412m.m108593f(displayName, "template.displayName");
                String thumbnailURL = mJTemplateInfo2.getThumbnailURL();
                C87412m.m108593f(thumbnailURL, "template.thumbnailURL");
                dVar = aVar.mo76617b(templateID, displayName, thumbnailURL, mJTemplateInfo2.getMinimumiOSSDKVersion(), mJTemplateInfo2.getMinimumAndroidSDKVersion());
            }
            arrayList2.add(dVar);
        }
        mo76620c(arrayList2);
    }

    /* renamed from: e */
    public final void mo76622e(String str) {
        T t;
        T t2;
        C87412m.m108594g(str, "templateId");
        Log.m105924i("MicroMsg.SnsTemplate.SnsTemplateListState", "updateCurSelectTemplate: " + str + ", curSelectedId: " + mo76618a());
        Iterator<T> it = mo76619b().iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (C87412m.m108589b(((C55319n1) t2).f157555a, mo76618a())) {
                break;
            }
        }
        C55319n1 n1Var = (C55319n1) t2;
        C60690y0<Boolean> y0Var = n1Var != null ? n1Var.f157556b : null;
        if (y0Var != null) {
            y0Var.setValue(Boolean.FALSE);
        }
        Iterator<T> it4 = mo76619b().iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            T next = it4.next();
            if (C87412m.m108589b(((C55319n1) next).f157555a, str)) {
                t = next;
                break;
            }
        }
        C55319n1 n1Var2 = (C55319n1) t;
        if (n1Var2 != null) {
            n1Var2.f157556b.setValue(Boolean.TRUE);
            this.f157677m = n1Var2;
        }
    }

    /* renamed from: f */
    public final void mo76623f() {
        T t;
        String str;
        Log.m105924i("MicroMsg.SnsTemplate.SnsTemplateListState", "updateTemplateList");
        C60690y0<List<C55319n1>> y0Var = this.f157672h;
        ArrayList arrayList = new ArrayList();
        Log.m105924i("MicroMsg.SnsTemplate.SnsTemplateListState", "updateTemplateList defaultTemplateList: " + this.f157666b.size());
        arrayList.addAll(this.f157667c);
        List<pr4> list = this.f157666b;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list, 10));
        for (pr4 a : list) {
            arrayList2.add(C55319n1.C55323d.f157561i.mo76616a(a));
        }
        arrayList.addAll(arrayList2);
        boolean z = false;
        if (!this.f157676l) {
            Log.m105924i("MicroMsg.SnsTemplate.SnsTemplateListState", "add loading item");
            for (int i = 0; i < 5; i++) {
                arrayList.add(new C55319n1.C55325e());
            }
        } else {
            Log.m105924i("MicroMsg.SnsTemplate.SnsTemplateListState", "add homepage item");
            arrayList.addAll(this.f157675k);
        }
        if (this.f157668d) {
            arrayList.add(C55319n1.C55321b.f157559e);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object next : arrayList) {
            if (hashSet.add(((C55319n1) next).f157555a)) {
                arrayList3.add(next);
            }
        }
        y0Var.setValue(arrayList3);
        if (mo76618a().length() == 0) {
            z = true;
        }
        if (z) {
            Log.m105924i("MicroMsg.SnsTemplate.SnsTemplateListState", "updateTemplateList curSelectedItemId is null");
            Iterator<T> it = mo76619b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C55319n1) t).f157557c) {
                    break;
                }
            }
            C55319n1 n1Var = (C55319n1) t;
            if (n1Var != null && (str = n1Var.f157555a) != null) {
                mo76622e(str);
            }
        }
    }
}
