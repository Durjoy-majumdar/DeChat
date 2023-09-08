package q23;

import ai2.C103373k;
import ai2.C26815p;
import ai2.C92007a;
import ai2.C92010c;
import ai2.C92012f;
import ai2.C92013g;
import ai2.C92015i;
import ai2.C92023q;
import ai2.C92025s;
import ai2.C92026t;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import bi2.C92262a;
import c30.C104289g;
import ci2.C104380d;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.plugin.vlog.model.C96551o;
import com.tencent.p014mm.plugin.vlog.p117ui.plugin.timeedit.TimeEditorItemContainer;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import ei2.C97651f;
import fy3.C32226l;
import gi2.C107818f;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l23.C109190g0;
import lh2.C99417a;
import qh2.C101198e;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64175a0;
import sx3.C90364q0;
import te3.C64368fm;
import yh2.C102864a;
import z04.C112551y;
import zg2.C103020m;

/* renamed from: q23.a */
public final class C110351a extends C99417a implements View.OnClickListener, C109190g0.C109192b {

    /* renamed from: f */
    public TimeEditorItemContainer f330093f;

    /* renamed from: g */
    public C92007a f330094g;

    /* renamed from: h */
    public C97651f f330095h;

    /* renamed from: q23.a$a */
    public static final class C110352a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public static final C110352a f330096d = new C110352a();

        public C110352a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q23.a$b */
    public static final class C110353b extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C101198e f330097d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110353b(C101198e eVar) {
            super(1);
            this.f330097d = eVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            if (view instanceof C107818f) {
                Bundle bundle = new Bundle();
                bundle.putInt("PARAM_DELETE_VIEW_TYPE_INT", ((C107818f) view).getType().ordinal());
                this.f330097d.mo14585p(C101198e.C101199b.EDIT_DELETE_ITEM_DONE, bundle);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q23.a$c */
    public static final class C110354c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C110351a f330098d;

        /* renamed from: e */
        public final /* synthetic */ C101198e f330099e;

        public C110354c(C110351a aVar, C101198e eVar) {
            this.f330098d = aVar;
            this.f330099e = eVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/timeedit/MultiEditItemContainerPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view instanceof C92026t) {
                C92026t tVar = (C92026t) view;
                tVar.setEnableNotify(false);
                tVar.setVisibility(4);
                C92007a editorData = tVar.getEditorData();
                C87412m.m108592e(editorData, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.item.TextItem");
                C92025s sVar = (C92025s) editorData;
                this.f330098d.f330094g = sVar;
                Bundle bundle = new Bundle();
                bundle.putCharSequence("PARAM_EDIT_TEXT_CONTENT", sVar.f263526g);
                bundle.putInt("PARAM_EDIT_TEXT_COLOR", sVar.f263527h);
                bundle.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", sVar.f263528i);
                bundle.putString("PARAM_EDIT_TEXT_FONT", sVar.f263530k);
                this.f330099e.mo14585p(C101198e.C101199b.EDIT_CHANGE_TEXT, bundle);
            } else if (view instanceof C102864a) {
                C102864a aVar = (C102864a) view;
                aVar.setVisibility(4);
                C64368fm currentCaption = aVar.getCurrentCaption();
                C92007a editorData2 = aVar.getEditorData();
                C87412m.m108592e(editorData2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.item.CaptionItem");
                C92010c cVar = (C92010c) editorData2;
                if (currentCaption != null) {
                    C101198e eVar = this.f330099e;
                    Bundle bundle2 = new Bundle();
                    bundle2.putByteArray("PARAM_1_BYTEARRAY", currentCaption.toByteArray());
                    bundle2.putInt("PARAM_EDIT_TEXT_COLOR", cVar.f263433h);
                    bundle2.putInt("PARAM_EDIT_TEXT_COLOR_BG_INT", cVar.f263434i);
                    bundle2.putString("PARAM_EDIT_TEXT_FONT", cVar.f263435j);
                    eVar.mo14585p(C101198e.C101199b.EDIT_CAPTION, bundle2);
                }
            } else if (view instanceof C26815p) {
                C26815p pVar = (C26815p) view;
                pVar.setVisibility(4);
                C92007a editorData3 = pVar.getEditorData();
                C87412m.m108592e(editorData3, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.item.PagStickerItem");
                this.f330098d.f330094g = pVar.getEditorData();
                Bundle bundle3 = new Bundle();
                bundle3.putCharSequence("PARAM_EDIT_TEXT_CONTENT", ((C92023q) editorData3).f263510i);
                this.f330099e.mo14585p(C101198e.C101199b.EDIT_CHANGE_PAG_TEXT, bundle3);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/timeedit/MultiEditItemContainerPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: q23.a$d */
    public static final class C110355d extends C87413o implements C32226l<C92007a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110351a f330100d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110355d(C110351a aVar) {
            super(1);
            this.f330100d = aVar;
        }

        public Object invoke(Object obj) {
            C92007a aVar = (C92007a) obj;
            if (aVar != null) {
                C110351a aVar2 = this.f330100d;
                aVar2.getClass();
                aVar2.f330094g = aVar;
                C101198e.C62622a.m73576a(aVar2.f291492d, C101198e.C101199b.EDIT_VLOG_EDIT_TIME, (Bundle) null, 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q23.a$e */
    public static final class C110356e extends C87413o implements C32226l<C102864a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C101198e f330101d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110356e(C101198e eVar) {
            super(1);
            this.f330101d = eVar;
        }

        public Object invoke(Object obj) {
            C102864a aVar = (C102864a) obj;
            C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
            C64368fm currentCaption = aVar.getCurrentCaption();
            if (currentCaption != null) {
                C101198e eVar = this.f330101d;
                aVar.setVisibility(4);
                Bundle bundle = new Bundle();
                bundle.putByteArray("PARAM_1_BYTEARRAY", currentCaption.toByteArray());
                eVar.mo14585p(C101198e.C101199b.EDIT_SHOW_CAPTION, bundle);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q23.a$f */
    public static final class C110357f extends C87413o implements C32226l<C92007a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110351a f330102d;

        /* renamed from: e */
        public final /* synthetic */ C101198e f330103e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110357f(C110351a aVar, C101198e eVar) {
            super(1);
            this.f330102d = aVar;
            this.f330103e = eVar;
        }

        public Object invoke(Object obj) {
            C92007a aVar = (C92007a) obj;
            if (aVar != null) {
                C110351a aVar2 = this.f330102d;
                C101198e eVar = this.f330103e;
                C103373k kVar = aVar instanceof C103373k ? (C103373k) aVar : null;
                boolean z = true;
                if (kVar == null || !kVar.mo125979a()) {
                    z = false;
                }
                if (z) {
                    aVar2.f330094g = aVar;
                    ((C103373k) aVar).mo125981c("", 0);
                    C101198e.C62622a.m73576a(eVar, C101198e.C101199b.EDIT_REMOVE_TTS, (Bundle) null, 2, (Object) null);
                    C101198e.C62622a.m73576a(eVar, C101198e.C101199b.EDIT_CLICK_VIEW, (Bundle) null, 2, (Object) null);
                } else {
                    aVar2.f330094g = aVar;
                    C101198e.C62622a.m73576a(eVar, C101198e.C101199b.EDIT_START_TTS, (Bundle) null, 2, (Object) null);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q23.a$g */
    public static final class C110358g extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C101198e f330104d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110358g(C101198e eVar) {
            super(1);
            this.f330104d = eVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                C101198e.C62622a.m73576a(this.f330104d, C101198e.C101199b.EDIT_CROP_VIDEO_PAUSE, (Bundle) null, 2, (Object) null);
                C101198e.C62622a.m73576a(this.f330104d, C101198e.C101199b.EDIT_HIDE_OPERATION, (Bundle) null, 2, (Object) null);
            } else {
                C101198e.C62622a.m73576a(this.f330104d, C101198e.C101199b.EDIT_CROP_VIDEO_RESUME, (Bundle) null, 2, (Object) null);
                C101198e.C62622a.m73576a(this.f330104d, C101198e.C101199b.EDIT_SHOW_OPERATION, (Bundle) null, 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q23.a$h */
    public static final class C110359h<T> implements Comparator {

        /* renamed from: d */
        public static final C110359h<T> f330105d = new C110359h<>();

        public int compare(Object obj, Object obj2) {
            C104380d dVar = (C104380d) obj;
            C104380d dVar2 = (C104380d) obj2;
            if (dVar.mo146049c() == dVar2.mo146049c()) {
                return 0;
            }
            if (dVar.mo146049c() < dVar2.mo146049c()) {
                return -1;
            }
            return (dVar.mo146049c() != dVar2.mo146049c() || dVar.mo146048b() >= dVar2.mo146048b()) ? 1 : -1;
        }
    }

    /* renamed from: q23.a$i */
    public static final class C110360i extends C87413o implements C32226l<C106205q0, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C104380d f330106d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110360i(C104380d dVar) {
            super(1);
            this.f330106d = dVar;
        }

        public Object invoke(Object obj) {
            C106205q0 q0Var = (C106205q0) obj;
            C87412m.m108594g(q0Var, LocaleUtil.ITALIAN);
            C104380d dVar = q0Var.f316494e;
            C104380d dVar2 = this.f330106d;
            dVar.getClass();
            C87412m.m108594g(dVar2, LocaleUtil.TURKEY);
            if (dVar.mo146049c() >= dVar2.mo146049c()) {
                C104380d dVar3 = dVar2;
                dVar2 = dVar;
                dVar = dVar3;
            }
            boolean z = true;
            if (!(dVar.mo146049c() == dVar2.mo146049c() && dVar.mo146048b() == dVar2.mo146048b()) && dVar.mo146048b() <= dVar2.mo146049c()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110351a(TimeEditorItemContainer timeEditorItemContainer, C101198e eVar) {
        super(eVar, (String) null);
        C87412m.m108594g(timeEditorItemContainer, "view");
        C87412m.m108594g(eVar, "status");
        this.f330093f = timeEditorItemContainer;
        timeEditorItemContainer.setDeleteStateListener(C110352a.f330096d);
        this.f330093f.setItemChangeListener(new C110353b(eVar));
        this.f330093f.setClickListener(new C110354c(this, eVar));
        this.f330093f.setTimeEditClickListener(new C110355d(this));
        this.f330093f.setShowCaptionDialogListener(new C110356e(eVar));
        this.f330093f.setReadTextListener(new C110357f(this, eVar));
        this.f330093f.setTimeEditMenuChangeListener(new C110358g(eVar));
    }

    /* renamed from: y */
    public static void m150171y(C110351a aVar, C92007a aVar2, C104380d dVar, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            dVar = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            j = -1;
        }
        aVar.getClass();
        Log.m105924i("MicroMsg.MultiEditItemContainerPlugin", "addTimeEditItemData " + aVar2 + ' ' + dVar + ' ' + str);
        if (aVar2 == null) {
            return;
        }
        if (aVar.f330094g == null || !aVar.mo161858P(aVar2)) {
            if (dVar != null) {
                C104380d.m139388a(aVar2.f263404c, dVar, false, false, 6, (Object) null);
            }
            if (dVar == null && j >= 0) {
                aVar2.f263404c.mo146050d(j, ((long) 10000) + j);
            }
            if (str != null) {
                aVar2.f263405d = str;
            }
            aVar.f330093f.mo152264j(aVar2);
        }
    }

    /* renamed from: z */
    public static /* synthetic */ void m150172z(C110351a aVar, C92007a aVar2, C106205q0 q0Var, String str, long j, int i, Object obj) {
        C106205q0 q0Var2 = (i & 2) != 0 ? null : q0Var;
        String str2 = (i & 4) != 0 ? null : str;
        if ((i & 8) != 0) {
            j = -1;
        }
        aVar.mo161860x(aVar2, q0Var2, str2, j);
    }

    /* renamed from: A */
    public final C13604l<Integer, Long> mo161843A(List<? extends C92007a> list, List<C106205q0> list2) {
        List<T> B0 = C110818d0.m150900B0(list2);
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C92007a aVar : list) {
            arrayList.add(aVar.f263404c);
        }
        long j = 0;
        long j2 = 0;
        for (T t : C110818d0.m150943o0(arrayList, C110359h.f330105d)) {
            if (t.mo146049c() >= j2) {
                j += t.mo146048b() - t.mo146049c();
            } else if (t.mo146048b() > j2) {
                j += t.mo146048b() - j2;
            }
            j2 = t.mo146048b();
            C64175a0.m75512t(B0, new C110360i(t));
        }
        return new C13604l<>(Integer.valueOf(list2.size() - ((ArrayList) B0).size()), Long.valueOf(j));
    }

    /* renamed from: B */
    public final void mo161844B(boolean z) {
        Log.m105924i("MicroMsg.MultiEditItemContainerPlugin", "enableGif:" + z);
        this.f330093f.f316775n = z ^ true;
    }

    /* renamed from: C */
    public final C92007a mo161845C() {
        return this.f330094g;
    }

    /* renamed from: D */
    public final ArrayList<C92007a> mo161846D() {
        return this.f330093f.getEditorDataList();
    }

    /* renamed from: E */
    public final int mo161847E() {
        int i = 0;
        for (C92015i iVar : this.f330093f.getAllItemViews()) {
            if (iVar instanceof C92013g) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: F */
    public final Bitmap mo161848F(String str, int i) {
        C87412m.m108594g(str, "cacheId");
        ArrayList<C92262a> k = this.f330093f.mo152265k(str);
        if (k.isEmpty()) {
            return null;
        }
        C97651f fVar = new C97651f(new float[]{(float) this.f330093f.getLeft(), (float) this.f330093f.getTop(), (float) this.f330093f.getRight(), (float) this.f330093f.getBottom()}, mo161850H(), k, i, (this.f330093f.getHeight() * i) / this.f330093f.getWidth());
        this.f330095h = fVar;
        fVar.start();
        C97651f fVar2 = this.f330095h;
        Bitmap a = fVar2 != null ? fVar2.mo136908a(1) : null;
        C97651f fVar3 = this.f330095h;
        if (fVar3 != null) {
            fVar3.destroy();
        }
        this.f330095h = null;
        return a;
    }

    /* renamed from: G */
    public final int mo161849G() {
        int i = 0;
        for (C92015i iVar : this.f330093f.getAllItemViews()) {
            if (iVar instanceof C92026t) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: H */
    public final float[] mo161850H() {
        C103020m mVar = C103020m.f303985a;
        Rect rect = C103020m.f303988d;
        return new float[]{(float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom};
    }

    /* renamed from: I */
    public final void mo161851I(float f, float f2) {
        this.f330093f.getClass();
        Rect rect = C103020m.f303987c;
        int i = (int) f2;
        rect.top = i;
        rect.bottom = i + ((int) f);
        Log.m105924i("MicroMsg.TimeEditorItemContainer", "initHeightSafeArea safeAreaRect:" + C103020m.f303987c);
    }

    /* renamed from: J */
    public final void mo161852J(float f, float f2) {
        this.f330093f.getClass();
        Rect rect = C103020m.f303987c;
        int i = (int) f2;
        rect.left = i;
        rect.right = i + ((int) f);
        Log.m105924i("MicroMsg.TimeEditorItemContainer", "initWidthSafeArea safeAreaRect:" + C103020m.f303987c);
    }

    /* renamed from: K */
    public final String mo161853K(List<C106205q0> list, boolean z) {
        T t;
        List<C106205q0> list2 = list;
        C87412m.m108594g(list2, "trackList");
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            t = null;
        } else {
            t = it.next();
            if (it.hasNext()) {
                long j = ((C106205q0) t).f316501l.f331465c;
                do {
                    T next = it.next();
                    long j2 = ((C106205q0) next).f316501l.f331465c;
                    if (j < j2) {
                        t = next;
                        j = j2;
                    }
                } while (it.hasNext());
            }
        }
        C106205q0 q0Var = (C106205q0) t;
        long j3 = q0Var != null ? q0Var.f316501l.f331465c : MAlarmHandler.NEXT_FIRE_INTERVAL;
        List<C92007a> allEditorData = this.f330093f.getAllEditorData();
        ArrayList<C92012f> arrayList = new ArrayList<>();
        for (C92007a aVar : allEditorData) {
            C92012f fVar = aVar instanceof C92012f ? (C92012f) aVar : null;
            C104380d dVar = aVar.f263404c;
            dVar.mo146050d(dVar.mo146049c(), Math.min(aVar.f263404c.mo146048b(), j3));
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        for (C92012f fVar2 : arrayList) {
            arrayList2.add(Long.valueOf(z ? 0 : fVar2.f263404c.mo146048b() - fVar2.f263404c.mo146049c()));
        }
        Map g = C90364q0.m113148g(new C13604l("emojiCount", Integer.valueOf(size)), new C13604l("emojiStatus", C110818d0.m150921S(arrayList2, "|", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null)));
        if (z) {
            ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList, 10));
            for (C92012f fVar3 : arrayList) {
                arrayList3.add(fVar3.f263405d);
            }
            g.put("useEmojiTrackCount", Integer.valueOf(C110818d0.m150904D0(arrayList3).size()));
            g.put("totalDurationMs", 0);
        } else {
            C13604l<Integer, Long> A = mo161843A(arrayList, list2);
            g.put("useEmojiTrackCount", A.f38555d);
            g.put("totalDurationMs", A.f38556e);
        }
        String gVar = new C104289g(g).toString();
        C87412m.m108593f(gVar, "JSONObject(info).toString()");
        return C112551y.m153814n(gVar, ",", ";", false);
    }

    /* renamed from: L */
    public final String mo161854L(List<C106205q0> list, boolean z) {
        T t;
        List<C106205q0> list2 = list;
        C87412m.m108594g(list2, "trackList");
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            t = null;
        } else {
            t = it.next();
            if (it.hasNext()) {
                long j = ((C106205q0) t).f316501l.f331465c;
                do {
                    T next = it.next();
                    long j2 = ((C106205q0) next).f316501l.f331465c;
                    if (j < j2) {
                        t = next;
                        j = j2;
                    }
                } while (it.hasNext());
            }
        }
        C106205q0 q0Var = (C106205q0) t;
        long j3 = q0Var != null ? q0Var.f316501l.f331465c : MAlarmHandler.NEXT_FIRE_INTERVAL;
        List<C92007a> allEditorData = this.f330093f.getAllEditorData();
        ArrayList arrayList = new ArrayList();
        for (C92007a aVar : allEditorData) {
            C92025s sVar = aVar instanceof C92025s ? (C92025s) aVar : null;
            if (sVar != null) {
                C104380d dVar = aVar.f263404c;
                dVar.mo146050d(dVar.mo146049c(), Math.min(aVar.f263404c.mo146048b(), j3));
            } else {
                sVar = null;
            }
            if (sVar != null) {
                arrayList.add(sVar);
            }
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it4.hasNext()) {
                break;
            }
            C92025s sVar2 = (C92025s) it4.next();
            C13604l[] lVarArr = new C13604l[3];
            lVarArr[0] = new C13604l("font", C96551o.m123872b(sVar2.f263530k));
            lVarArr[1] = new C13604l("durationMs", Long.valueOf(z ? 0 : sVar2.f263404c.mo146048b() - sVar2.f263404c.mo146049c()));
            if (sVar2.mo125980b().f78428a.length() > 0) {
                i = 1;
            }
            lVarArr[2] = new C13604l("isRead", Integer.valueOf(i));
            arrayList2.add(C90364q0.m113147f(lVarArr));
        }
        Map g = C90364q0.m113148g(new C13604l("textCount", Integer.valueOf(size)), new C13604l("textStatus", arrayList2));
        if (z) {
            ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList, 10));
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                arrayList3.add(((C92025s) it5.next()).f263405d);
            }
            g.put("useTextTrackCount", Integer.valueOf(C110818d0.m150904D0(arrayList3).size()));
            g.put("totalDurationMs", 0);
        } else {
            C13604l<Integer, Long> A = mo161843A(arrayList, list2);
            g.put("useTextTrackCount", A.f38555d);
            g.put("totalDurationMs", A.f38556e);
        }
        String gVar = new C104289g(g).toString();
        C87412m.m108593f(gVar, "JSONObject(info).toString()");
        return C112551y.m153814n(gVar, ",", ";", false);
    }

    /* renamed from: M */
    public final void mo161855M(boolean z) {
        TimeEditorItemContainer timeEditorItemContainer = this.f330093f;
        View view = timeEditorItemContainer.f316783v;
        if (view != null) {
            timeEditorItemContainer.mo152269o(view, z);
        }
        if (!z) {
            this.f330094g = null;
        }
    }

    /* renamed from: N */
    public final void mo161856N(boolean z) {
        Log.m105924i("MicroMsg.MultiEditItemContainerPlugin", "setFullScreen:" + z);
    }

    /* renamed from: O */
    public final void mo161857O() {
        this.f330093f.mo152285v();
    }

    /* renamed from: P */
    public final boolean mo161858P(C92007a aVar) {
        C92007a aVar2 = this.f330094g;
        if (!(aVar2 instanceof C92025s) || !(aVar instanceof C92025s)) {
            return false;
        }
        C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.item.TextItem");
        C92025s sVar = (C92025s) aVar2;
        C92025s sVar2 = (C92025s) aVar;
        C87412m.m108594g(sVar2, "item");
        sVar.f263526g = sVar2.f263526g;
        sVar.f263527h = sVar2.f263527h;
        sVar.f263528i = sVar2.f263528i;
        sVar.f263529j = sVar2.f263529j;
        sVar.f263407f.set(sVar2.f263407f);
        sVar.f263530k = sVar2.f263530k;
        Log.m105924i("MicroMsg.TextItem", sVar.toString());
        TimeEditorItemContainer timeEditorItemContainer = this.f330093f;
        C92007a aVar3 = this.f330094g;
        C87412m.m108591d(aVar3);
        timeEditorItemContainer.mo152286w(aVar3);
        this.f330094g = null;
        return true;
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/timeedit/MultiEditItemContainerPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/timeedit/MultiEditItemContainerPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onPause() {
        this.f330093f.mo152266l();
    }

    public void onResume() {
        this.f330093f.mo152273q();
    }

    public void onVideoPause() {
    }

    public void onVideoPlay() {
        TimeEditorItemContainer timeEditorItemContainer = this.f330093f;
        View view = timeEditorItemContainer.f316783v;
        if (view != null) {
            timeEditorItemContainer.mo152269o(view, false);
        }
    }

    public void release() {
        this.f330093f.mo152272p();
    }

    public void reset() {
        this.f330093f.mo152272p();
    }

    public void setVisibility(int i) {
        this.f330093f.setVisibility(i);
    }

    /* renamed from: x */
    public final void mo161860x(C92007a aVar, C106205q0 q0Var, String str, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("addTimeEditItemData ");
        sb.append(aVar);
        sb.append(' ');
        sb.append(q0Var != null ? q0Var.f316494e : null);
        sb.append(' ');
        sb.append(str);
        Log.m105924i("MicroMsg.MultiEditItemContainerPlugin", sb.toString());
        if (aVar == null) {
            return;
        }
        if (this.f330094g == null || !mo161858P(aVar)) {
            if (q0Var != null) {
                C104380d.m139388a(aVar.f263404c, q0Var.f316494e, false, false, 6, (Object) null);
            }
            if (q0Var == null && j >= 0) {
                aVar.f263404c.mo146050d(j, ((long) 10000) + j);
            }
            if (str != null) {
                aVar.f263405d = str;
            }
            this.f330093f.mo152264j(aVar);
        }
    }
}
