package com.tencent.p014mm.plugin.gallery.mjtemplate.refactor;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C103769x;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsTemplateReportStruct;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import da0.C58246d;
import da0.C58247e;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gw1.C98253a;
import gw1.C98254b;
import gy3.C24560g0;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import i21.C60242i;
import iy3.C60641c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import k21.C60960c;
import kotlin.Result;
import kotlin.ResultKt;
import nj3.C76879j;
import p166hy.C8830s0;
import rx3.C13598b0;
import te3.e94;

/* renamed from: com.tencent.mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew */
public final class MJTemplateHandleNew implements C0120a0<Integer> {

    /* renamed from: d */
    public static final MJTemplateHandleNew f271075d = new MJTemplateHandleNew();

    /* renamed from: e */
    public static HashMap<C98253a, C98254b> f271076e = new HashMap<>();

    /* renamed from: f */
    public static ArrayList<C98253a> f271077f = new ArrayList<>();

    /* renamed from: g */
    public static C98253a f271078g;

    /* renamed from: h */
    public static e94 f271079h;

    /* renamed from: i */
    public static int f271080i;

    /* renamed from: j */
    public static boolean f271081j;

    /* renamed from: n */
    public static boolean f271082n;

    /* renamed from: o */
    public static boolean f271083o;

    /* renamed from: p */
    public static boolean f271084p;

    /* renamed from: q */
    public static final C103769x<Integer> f271085q;

    /* renamed from: r */
    public static final C103769x<String> f271086r;

    /* renamed from: s */
    public static final C0120a0<Integer> f271087s = C56787g.f162746d;

    /* renamed from: t */
    public static final C0120a0<String> f271088t = C56784d.f162743d;

    /* renamed from: u */
    public static boolean f271089u;

    /* renamed from: v */
    public static WeakReference<Activity> f271090v;

    /* renamed from: w */
    public static final C32224a<C13598b0> f271091w = C93943h.f271094d;

    /* renamed from: com.tencent.mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew$c */
    public static final class C56783c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C56783c f162742d = new C56783c();

        public C56783c() {
            super(0);
        }

        public Object invoke() {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_publish_template_media_total_duration_seconds, 600);
            Log.m105924i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaTotalDurationLimitSeconds: " + Qe);
            boolean z = false;
            if (MJTemplateHandleNew.f271080i / 1000 > Qe) {
                C76879j.m92726T(MMApplicationContext.getContext(), MMApplicationContext.getContext().getString(C0966R.string.m1w, new Object[]{Integer.valueOf(C60641c.m70921b(((float) Qe) / 60.0f))}));
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew$d */
    public static final class C56784d<T> implements C0120a0 {

        /* renamed from: d */
        public static final C56784d<T> f162743d = new C56784d<>();

        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
            String str = (String) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew$e */
    public static final class C56785e extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f162744d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56785e(C32224a<C13598b0> aVar) {
            super(1);
            this.f162744d = aVar;
        }

        public Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            C60960c.f173618a.mo85927k("SnsPublishProcess", "agreeCnt", 1, C60242i.APPEND);
            Log.m105924i("MicroMsg.MJTemplateHandleNew", "onSendItemClick get permission");
            this.f162744d.invoke();
            MJTemplateHandleNew.f271084p = false;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew$f */
    public static final class C56786f extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public static final C56786f f162745d = new C56786f();

        public C56786f() {
            super(1);
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C60960c.f173618a.mo85927k("SnsPublishProcess", booleanValue ? "blankCnt" : "refuseCnt", 1, C60242i.APPEND);
            Log.m105924i("MicroMsg.MJTemplateHandleNew", "onSendItemClick deny permission, cancel: " + booleanValue);
            MJTemplateHandleNew.f271084p = false;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew$g */
    public static final class C56787g<T> implements C0120a0 {

        /* renamed from: d */
        public static final C56787g<T> f162746d = new C56787g<>();

        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew$a */
    public static final class C93941a<T> implements C0120a0 {

        /* renamed from: d */
        public static final C93941a<T> f271092d = new C93941a<>();

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
            r3 = r1.f288064o;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onChanged(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Integer r8 = (java.lang.Integer) r8
                androidx.lifecycle.x<java.lang.Integer> r0 = com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew.f271085q
                java.lang.Object r1 = r0.getValue()
                boolean r1 = gy3.C87412m.m108589b(r8, r1)
                if (r1 == 0) goto L_0x0010
                goto L_0x00b0
            L_0x0010:
                r0.setValue(r8)
                java.util.ArrayList<gw1.a> r0 = com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew.f271077f
                java.util.Iterator r0 = r0.iterator()
            L_0x0019:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x00b0
                java.lang.Object r1 = r0.next()
                gw1.a r1 = (gw1.C98253a) r1
                java.util.HashMap<gw1.a, gw1.b> r2 = com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew.f271076e
                java.lang.Object r1 = r2.get(r1)
                gw1.b r1 = (gw1.C98254b) r1
                r2 = 0
                if (r1 == 0) goto L_0x003b
                androidx.lifecycle.z<java.lang.Integer> r3 = r1.f288064o
                if (r3 == 0) goto L_0x003b
                java.lang.Object r3 = r3.getValue()
                java.lang.Integer r3 = (java.lang.Integer) r3
                goto L_0x003c
            L_0x003b:
                r3 = r2
            L_0x003c:
                boolean r3 = gy3.C87412m.m108589b(r3, r8)
                if (r3 != 0) goto L_0x0019
                if (r1 == 0) goto L_0x00a3
                java.lang.String r3 = "it"
                gy3.C87412m.m108593f(r8, r3)
                int r3 = r8.intValue()
                r4 = 2
                r5 = 0
                r6 = 1
                if (r3 != r4) goto L_0x006e
                android.widget.ImageButton r3 = r1.f288059g
                if (r3 != 0) goto L_0x0058
                goto L_0x005b
            L_0x0058:
                r3.setSelected(r6)
            L_0x005b:
                android.widget.ImageButton r3 = r1.f288059g
                if (r3 != 0) goto L_0x0060
                goto L_0x0063
            L_0x0060:
                r3.setEnabled(r5)
            L_0x0063:
                android.widget.TextView r3 = r1.f288060h
                if (r3 != 0) goto L_0x0068
                goto L_0x006b
            L_0x0068:
                r3.setClickable(r5)
            L_0x006b:
                r1.f288063n = r4
                goto L_0x00a3
            L_0x006e:
                if (r3 != r6) goto L_0x008b
                android.widget.ImageButton r3 = r1.f288059g
                if (r3 != 0) goto L_0x0075
                goto L_0x0078
            L_0x0075:
                r3.setSelected(r6)
            L_0x0078:
                android.widget.ImageButton r3 = r1.f288059g
                if (r3 != 0) goto L_0x007d
                goto L_0x0080
            L_0x007d:
                r3.setEnabled(r6)
            L_0x0080:
                android.widget.TextView r3 = r1.f288060h
                if (r3 != 0) goto L_0x0085
                goto L_0x0088
            L_0x0085:
                r3.setClickable(r6)
            L_0x0088:
                r1.f288063n = r6
                goto L_0x00a3
            L_0x008b:
                android.widget.ImageButton r3 = r1.f288059g
                if (r3 != 0) goto L_0x0090
                goto L_0x0093
            L_0x0090:
                r3.setSelected(r5)
            L_0x0093:
                android.widget.ImageButton r3 = r1.f288059g
                if (r3 != 0) goto L_0x0098
                goto L_0x009b
            L_0x0098:
                r3.setEnabled(r6)
            L_0x009b:
                android.widget.TextView r3 = r1.f288060h
                if (r3 != 0) goto L_0x00a0
                goto L_0x00a3
            L_0x00a0:
                r3.setClickable(r6)
            L_0x00a3:
                if (r1 == 0) goto L_0x00a7
                androidx.lifecycle.z<java.lang.Integer> r2 = r1.f288064o
            L_0x00a7:
                if (r2 != 0) goto L_0x00ab
                goto L_0x0019
            L_0x00ab:
                r2.setValue(r8)
                goto L_0x0019
            L_0x00b0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew.C93941a.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew$b */
    public static final class C93942b<T> implements C0120a0 {

        /* renamed from: d */
        public static final C93942b<T> f271093d = new C93942b<>();

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
            r3 = r1.f288065p;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onChanged(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.String r7 = (java.lang.String) r7
                androidx.lifecycle.x<java.lang.String> r0 = com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew.f271086r
                java.lang.Object r1 = r0.getValue()
                boolean r1 = r7.equals(r1)
                if (r1 == 0) goto L_0x0010
                goto L_0x0081
            L_0x0010:
                r0.setValue(r7)
                java.util.ArrayList<gw1.a> r0 = com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew.f271077f
                java.util.Iterator r0 = r0.iterator()
            L_0x0019:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0081
                java.lang.Object r1 = r0.next()
                gw1.a r1 = (gw1.C98253a) r1
                java.util.HashMap<gw1.a, gw1.b> r2 = com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew.f271076e
                java.lang.Object r1 = r2.get(r1)
                gw1.b r1 = (gw1.C98254b) r1
                r2 = 0
                if (r1 == 0) goto L_0x003b
                androidx.lifecycle.z<java.lang.String> r3 = r1.f288065p
                if (r3 == 0) goto L_0x003b
                java.lang.Object r3 = r3.getValue()
                java.lang.String r3 = (java.lang.String) r3
                goto L_0x003c
            L_0x003b:
                r3 = r2
            L_0x003c:
                r4 = 2
                r5 = 0
                boolean r3 = z04.C112551y.m153810j(r3, r7, r5, r4, r2)
                if (r3 != 0) goto L_0x0019
                if (r1 == 0) goto L_0x0076
                int r3 = r7.length()
                if (r3 != 0) goto L_0x004e
                r3 = 1
                goto L_0x004f
            L_0x004e:
                r3 = 0
            L_0x004f:
                r4 = 8
                if (r3 == 0) goto L_0x0055
                r5 = 8
            L_0x0055:
                android.widget.TextView r3 = r1.f288062j
                if (r3 != 0) goto L_0x005a
                goto L_0x005d
            L_0x005a:
                r3.setText(r7)
            L_0x005d:
                gw1.a r3 = r1.f288056d
                boolean r3 = r3.mo80213b()
                if (r3 != 0) goto L_0x006e
                android.widget.LinearLayout r3 = r1.f288061i
                if (r3 != 0) goto L_0x006a
                goto L_0x0076
            L_0x006a:
                r3.setVisibility(r4)
                goto L_0x0076
            L_0x006e:
                android.widget.LinearLayout r3 = r1.f288061i
                if (r3 != 0) goto L_0x0073
                goto L_0x0076
            L_0x0073:
                r3.setVisibility(r5)
            L_0x0076:
                if (r1 == 0) goto L_0x007a
                androidx.lifecycle.z<java.lang.String> r2 = r1.f288065p
            L_0x007a:
                if (r2 != 0) goto L_0x007d
                goto L_0x0019
            L_0x007d:
                r2.setValue(r7)
                goto L_0x0019
            L_0x0081:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew.C93942b.onChanged(java.lang.Object):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew$h */
    public static final class C93943h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C93943h f271094d = new C93943h();

        public C93943h() {
            super(0);
        }

        public Object invoke() {
            int i;
            MJTemplateHandleNew mJTemplateHandleNew = MJTemplateHandleNew.f271075d;
            if (!MJTemplateHandleNew.f271089u) {
                i = -1;
            } else if (MJTemplateHandleNew.f271082n || mJTemplateHandleNew.mo128850c()) {
                i = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_publish_template_media_num, 20);
                Log.m105924i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaNum: " + i);
            } else {
                i = MJTemplateHandleNew.f271081j ? 1 : 9;
            }
            if (i > 0) {
                Iterator<C98253a> it = MJTemplateHandleNew.f271077f.iterator();
                while (it.hasNext()) {
                    it.next().mo80214c(i);
                }
            }
            return C13598b0.f38549a;
        }
    }

    static {
        C103769x<Integer> xVar = new C103769x<>();
        f271085q = xVar;
        C103769x<String> xVar2 = new C103769x<>();
        f271086r = xVar2;
        xVar.setValue(0);
        xVar2.setValue("");
    }

    /* renamed from: a */
    public final void mo128848a(C98253a aVar) {
        C87412m.m108594g(aVar, "templateView");
        if (f271077f.contains(aVar)) {
            Log.m105920e("MicroMsg.MJTemplateHandleNew", '[' + hashCode() + " already bind ui:" + aVar.hashCode() + ", return]");
            return;
        }
        C60960c.C60961a aVar2 = C60960c.f173618a;
        String e = C24560g0.m30725a(SnsTemplateReportStruct.class).mo51262e();
        C87412m.m108591d(e);
        aVar2.mo85925i("SnsTemplate", e);
        f271083o = false;
        Log.m105924i("MicroMsg.MJTemplateHandleNew", '[' + hashCode() + " bind ui:" + aVar.hashCode() + ']');
        f271077f.add(aVar);
        f271078g = aVar;
        C98254b bVar = new C98254b(aVar, f271079h);
        C56783c cVar = C56783c.f162742d;
        C87412m.m108594g(cVar, "<set-?>");
        bVar.f288066q = cVar;
        f271076e.put(aVar, bVar);
        C103769x<Integer> xVar = f271085q;
        xVar.observeForever(f271087s);
        xVar.addSource(bVar.f288064o, C93941a.f271092d);
        C103769x<String> xVar2 = f271086r;
        xVar2.observeForever(f271088t);
        xVar2.addSource(bVar.f288065p, C93942b.f271093d);
        aVar.getActivity().getLifecycle().addObserver(new MJTemplateHandleNew$bind$3(aVar));
        mo128854g(aVar.mo80212a());
    }

    /* renamed from: b */
    public final boolean mo128849b(GalleryItem$MediaItem galleryItem$MediaItem) {
        if (f271089u) {
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_publish_template_media_total_duration_seconds, 600);
            Log.m105924i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaTotalDurationLimitSeconds: " + Qe);
            GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = galleryItem$MediaItem instanceof GalleryItem$VideoMediaItem ? (GalleryItem$VideoMediaItem) galleryItem$MediaItem : null;
            int i = (galleryItem$VideoMediaItem != null ? galleryItem$VideoMediaItem.f162766w : 0) / 1000;
            if ((f271080i / 1000) + i > Qe || i > Qe) {
                C76879j.m92726T(MMApplicationContext.getContext(), MMApplicationContext.getContext().getString(C0966R.string.m1w, new Object[]{Integer.valueOf(C60641c.m70921b(((float) Qe) / 60.0f))}));
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo128850c() {
        Integer value = f271085q.getValue();
        return value == null || value.intValue() != 0;
    }

    /* renamed from: d */
    public final boolean mo128851d(ArrayList<GalleryItem$MediaItem> arrayList, C32224a<C13598b0> aVar) {
        Object obj;
        C60242i iVar = C60242i.APPEND;
        Class cls = C58247e.class;
        C87412m.m108594g(arrayList, "mediaList");
        C87412m.m108594g(aVar, "onRequestResult");
        if (f271089u && (mo128850c() || f271082n)) {
            WeakReference<Activity> weakReference = f271090v;
            if (weakReference == null) {
                C87412m.m108603p("context");
                throw null;
            } else if (weakReference.get() != null) {
                if (((C58247e) C86312j.m106911c(cls)).mo82982Tl().mo71103a("scene_sns")) {
                    Log.m105924i("MicroMsg.MJTemplateHandleNew", "onSendItemClick has permission");
                    WeakReference<Activity> weakReference2 = f271090v;
                    if (weakReference2 != null) {
                        Activity activity = weakReference2.get();
                        e94 e94 = f271079h;
                        Log.m105924i("MicroMsg.MJTemplateHandleNew", "jumpToTemplatePage");
                        if (activity != null) {
                            C60960c.f173618a.mo85927k("SnsPublishProcess", "egsessionCnt", 1, iVar);
                            C58247e eVar = (C58247e) C86312j.m106911c(cls);
                            Intent intent = new Intent();
                            if (e94 != null) {
                                try {
                                    Result.Companion companion = Result.Companion;
                                    obj = Result.m168114constructorimpl(intent.putExtra("key_video_template_info", e94.toByteArray()));
                                } catch (Throwable th) {
                                    Result.Companion companion2 = Result.Companion;
                                    obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
                                }
                                Throwable r2 = Result.m168117exceptionOrNullimpl(obj);
                                if (r2 != null) {
                                    Log.printErrStackTrace("MicroMsg.MJTemplateHandleNew", r2, "to array error", new Object[0]);
                                }
                                intent.putExtra("key_maas_entrance", 101);
                                Log.m105924i("MicroMsg.MJTemplateHandleNew", "cut same");
                            } else {
                                intent.putExtra("key_maas_entrance", 100);
                                Log.m105924i("MicroMsg.MJTemplateHandleNew", "post main");
                            }
                            C13598b0 b0Var = C13598b0.f38549a;
                            eVar.bv0(activity, 4384, arrayList, intent);
                        }
                        return true;
                    }
                    C87412m.m108603p("context");
                    throw null;
                }
                Log.m105924i("MicroMsg.MJTemplateHandleNew", "onSendItemClick no permission, permissionRequesting: " + f271084p);
                if (f271084p) {
                    return true;
                }
                f271084p = true;
                C60960c.f173618a.mo85927k("SnsPublishProcess", "permissionSheetCnt", 1, iVar);
                C58246d Tl = ((C58247e) C86312j.m106911c(cls)).mo82982Tl();
                WeakReference<Activity> weakReference3 = f271090v;
                if (weakReference3 != null) {
                    Context context = weakReference3.get();
                    if (context == null) {
                        context = MMApplicationContext.getContext();
                    }
                    C87412m.m108593f(context, "context.get() ?: MMApplicationContext.getContext()");
                    Tl.mo71104b("scene_sns", context, new C56785e(aVar), C56786f.f162745d);
                    return true;
                }
                C87412m.m108603p("context");
                throw null;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final void mo128852e() {
        C60960c.C60961a aVar = C60960c.f173618a;
        C98254b bVar = f271076e.get(f271078g);
        int i = 0;
        if (bVar != null) {
            e94 e94 = bVar.f288057e;
            if ((e94 != null ? e94.f182943e : null) != null) {
                i = 1;
            }
            i = i != 0 ? 3 : bVar.f288063n;
        }
        aVar.mo85926j("SnsTemplate", FirebaseAnalytics.C113379b.SOURCE, Integer.valueOf(i));
        String ey = ((C8830s0) C86312j.m106911c(C8830s0.class)).mo9667ey();
        C87412m.m108593f(ey, "getService(\n            …).checkSnsPostSessionId()");
        aVar.mo85926j("SnsTemplate", "sessionID", ey);
        C60960c.C60961a.m71444b(aVar, "SnsTemplate", false, false, 4, (Object) null);
        f271083o = true;
    }

    /* renamed from: f */
    public final void mo128853f(C98253a aVar, boolean z) {
        C87412m.m108594g(aVar, "templateView");
        Log.m105924i("MicroMsg.MJTemplateHandleNew", '[' + hashCode() + " unbind ui:" + aVar.hashCode() + ", unbind release maas: " + z + ']');
        if (!f271083o && mo128850c()) {
            mo128852e();
        }
        if (z) {
            ((C58247e) C86312j.m106911c(C58247e.class)).Ln0();
        }
        C98254b bVar = f271076e.get(aVar);
        if (bVar != null) {
            f271085q.removeSource(bVar.f288064o);
            f271086r.removeSource(bVar.f288065p);
        }
        f271077f.remove(aVar);
        f271076e.remove(aVar);
        if (f271077f.size() == 0) {
            Log.m105921e("MicroMsg.MJTemplateHandleNew", "viewList.size == 0", "update live data value");
            C103769x<Integer> xVar = f271085q;
            xVar.setValue(0);
            C103769x<String> xVar2 = f271086r;
            xVar2.setValue("");
            xVar.removeObserver(f271087s);
            xVar2.removeObserver(f271088t);
            f271078g = null;
            f271079h = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01bd  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo128854g(java.util.ArrayList<com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem> r12) {
        /*
            r11 = this;
            r0 = 0
            f271080i = r0
            r1 = 0
            r2 = 1
            r3 = 2
            if (r12 == 0) goto L_0x0051
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r12.iterator()
        L_0x0011:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x002d
            java.lang.Object r6 = r5.next()
            r7 = r6
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r7 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r7
            int r7 = r7.getType()
            if (r7 != r3) goto L_0x0026
            r7 = 1
            goto L_0x0027
        L_0x0026:
            r7 = 0
        L_0x0027:
            if (r7 == 0) goto L_0x0011
            r4.add(r6)
            goto L_0x0011
        L_0x002d:
            java.util.Iterator r4 = r4.iterator()
        L_0x0031:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0051
            java.lang.Object r5 = r4.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r5 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r5
            int r6 = f271080i
            boolean r7 = r5 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            if (r7 == 0) goto L_0x0046
            com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem r5 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem) r5
            goto L_0x0047
        L_0x0046:
            r5 = r1
        L_0x0047:
            if (r5 == 0) goto L_0x004c
            int r5 = r5.f162766w
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            int r6 = r6 + r5
            f271080i = r6
            goto L_0x0031
        L_0x0051:
            boolean r4 = f271089u
            if (r4 == 0) goto L_0x01c7
            if (r12 == 0) goto L_0x005a
            r12.size()
        L_0x005a:
            java.util.HashMap<gw1.a, gw1.b> r4 = f271076e
            gw1.a r5 = f271078g
            java.lang.Object r4 = r4.get(r5)
            gw1.b r4 = (gw1.C98254b) r4
            if (r4 == 0) goto L_0x014a
            boolean r5 = f271089u
            if (r5 != 0) goto L_0x006c
            goto L_0x014a
        L_0x006c:
            te3.e94 r5 = r4.f288057e
            if (r5 == 0) goto L_0x0072
            java.lang.String r1 = r5.f182943e
        L_0x0072:
            if (r1 == 0) goto L_0x0076
            r1 = 1
            goto L_0x0077
        L_0x0076:
            r1 = 0
        L_0x0077:
            if (r1 == 0) goto L_0x007b
            goto L_0x014a
        L_0x007b:
            androidx.lifecycle.z<java.lang.String> r1 = r4.f288065p
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            if (r12 == 0) goto L_0x00c8
            java.util.Iterator r6 = r12.iterator()
            r7 = 0
            r8 = 0
        L_0x008a:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x00ca
            java.lang.Object r9 = r6.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r9 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r9
            int r10 = r9.getType()
            if (r10 != r3) goto L_0x009e
            int r7 = r7 + 1
        L_0x009e:
            int r10 = r9.getType()
            if (r10 != r2) goto L_0x00a6
            int r8 = r8 + 1
        L_0x00a6:
            int r9 = r9.getType()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r5.add(r9)
            int r9 = r5.size()
            if (r9 < r3) goto L_0x008a
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2131830580(0x7f112734, float:1.9294161E38)
            java.lang.String r5 = kg3.C76577a.m92166q(r5, r6)
            java.lang.String r6 = "getString(\n             …deo_pic\n                )"
            gy3.C87412m.m108593f(r5, r6)
            goto L_0x00f4
        L_0x00c8:
            r7 = 0
            r8 = 0
        L_0x00ca:
            r5 = 9
            if (r8 <= r5) goto L_0x00df
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2131830578(0x7f112732, float:1.9294157E38)
            java.lang.String r5 = kg3.C76577a.m92166q(r5, r6)
            java.lang.String r6 = "getString(\n             …any_picture\n            )"
            gy3.C87412m.m108593f(r5, r6)
            goto L_0x00f4
        L_0x00df:
            if (r7 < r3) goto L_0x00f2
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2131830579(0x7f112733, float:1.929416E38)
            java.lang.String r5 = kg3.C76577a.m92166q(r5, r6)
            java.lang.String r6 = "getString(\n             …_many_video\n            )"
            gy3.C87412m.m108593f(r5, r6)
            goto L_0x00f4
        L_0x00f2:
            java.lang.String r5 = ""
        L_0x00f4:
            r1.setValue(r5)
            androidx.lifecycle.z<java.lang.String> r1 = r4.f288065p
            java.lang.Object r1 = r1.getValue()
            gy3.C87412m.m108591d(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 != 0) goto L_0x010a
            r1 = 1
            goto L_0x010b
        L_0x010a:
            r1 = 0
        L_0x010b:
            r5 = 8
            if (r1 == 0) goto L_0x0112
            r1 = 8
            goto L_0x0113
        L_0x0112:
            r1 = 0
        L_0x0113:
            gw1.a r6 = r4.f288056d
            boolean r6 = r6.mo80213b()
            if (r6 != 0) goto L_0x011c
            goto L_0x011d
        L_0x011c:
            r5 = r1
        L_0x011d:
            android.widget.TextView r6 = r4.f288062j
            if (r6 != 0) goto L_0x0122
            goto L_0x012d
        L_0x0122:
            androidx.lifecycle.z<java.lang.String> r7 = r4.f288065p
            java.lang.Object r7 = r7.getValue()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.setText(r7)
        L_0x012d:
            android.widget.LinearLayout r6 = r4.f288061i
            if (r6 == 0) goto L_0x0139
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0139
            r6 = 1
            goto L_0x013a
        L_0x0139:
            r6 = 0
        L_0x013a:
            if (r6 == 0) goto L_0x013f
            if (r1 != 0) goto L_0x013f
            goto L_0x014a
        L_0x013f:
            android.widget.LinearLayout r6 = r4.f288061i
            if (r6 != 0) goto L_0x0144
            goto L_0x0147
        L_0x0144:
            r6.setVisibility(r5)
        L_0x0147:
            r4.mo137557b(r1)
        L_0x014a:
            if (r12 == 0) goto L_0x0154
            int r1 = r12.size()
            if (r1 != r2) goto L_0x0154
            r1 = 1
            goto L_0x0155
        L_0x0154:
            r1 = 0
        L_0x0155:
            if (r1 == 0) goto L_0x0161
            java.lang.Object r1 = sx3.C110818d0.m150914L(r12)
            boolean r1 = r1 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            if (r1 == 0) goto L_0x0161
            r1 = 1
            goto L_0x0162
        L_0x0161:
            r1 = 0
        L_0x0162:
            f271081j = r1
            if (r12 == 0) goto L_0x018f
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L_0x016d
            goto L_0x018a
        L_0x016d:
            java.util.Iterator r1 = r12.iterator()
        L_0x0171:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x018a
            java.lang.Object r4 = r1.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r4 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r4
            int r4 = r4.getType()
            if (r4 != r3) goto L_0x0185
            r4 = 1
            goto L_0x0186
        L_0x0185:
            r4 = 0
        L_0x0186:
            if (r4 == 0) goto L_0x0171
            r1 = 1
            goto L_0x018b
        L_0x018a:
            r1 = 0
        L_0x018b:
            if (r1 != r2) goto L_0x018f
            r1 = 1
            goto L_0x0190
        L_0x018f:
            r1 = 0
        L_0x0190:
            if (r1 == 0) goto L_0x01be
            boolean r1 = r12 instanceof java.util.Collection
            if (r1 == 0) goto L_0x019d
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L_0x019d
            goto L_0x01ba
        L_0x019d:
            java.util.Iterator r12 = r12.iterator()
        L_0x01a1:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x01ba
            java.lang.Object r1 = r12.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r1 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r1
            int r1 = r1.getType()
            if (r1 != r2) goto L_0x01b5
            r1 = 1
            goto L_0x01b6
        L_0x01b5:
            r1 = 0
        L_0x01b6:
            if (r1 == 0) goto L_0x01a1
            r12 = 1
            goto L_0x01bb
        L_0x01ba:
            r12 = 0
        L_0x01bb:
            if (r12 == 0) goto L_0x01be
            r0 = 1
        L_0x01be:
            f271082n = r0
            fy3.a<rx3.b0> r12 = f271091w
            com.tencent.mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew$h r12 = (com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew.C93943h) r12
            r12.invoke()
        L_0x01c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.gallery.mjtemplate.refactor.MJTemplateHandleNew.mo128854g(java.util.ArrayList):void");
    }

    public /* bridge */ /* synthetic */ void onChanged(Object obj) {
        Integer num = (Integer) obj;
    }
}
