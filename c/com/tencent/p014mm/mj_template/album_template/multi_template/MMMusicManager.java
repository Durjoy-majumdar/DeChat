package com.tencent.p014mm.mj_template.album_template.multi_template;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103757e;
import ca0.C54679b;
import ca0.C54683f0;
import com.tencent.maas.model.MJLyricInfo;
import com.tencent.maas.model.MJMusicInfo;
import com.tencent.maas.model.time.MJTime;
import com.tencent.p014mm.mj_template.sns.compose.widget.C28971l;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import ga0.C59399a;
import gy3.C24565l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import na0.C61630a;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C60690y0;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64186f0;
import te3.C64758ut2;
import te3.C64839xt2;
import te3.C64866yt2;
import te3.o74;
import te3.p74;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C66731x;
import z90.C66738b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/mj_template/album_template/multi_template/MMMusicManager;", "Landroidx/lifecycle/e;", "La14/n0;", "scope", "", "", "imageList", "<init>", "(La14/n0;Ljava/util/List;)V", "plugin-mj-template_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager */
public final class MMMusicManager implements C103757e {

    /* renamed from: d */
    public final C0000n0 f157429d;

    /* renamed from: e */
    public final List<String> f157430e;

    /* renamed from: f */
    public final C60690y0<List<MJMusicInfo>> f157431f;

    /* renamed from: g */
    public final C60690y0<MJMusicInfo> f157432g;

    /* renamed from: h */
    public final C60690y0<Boolean> f157433h;

    /* renamed from: i */
    public final C60690y0<Boolean> f157434i;

    /* renamed from: j */
    public List<C64839xt2> f157435j = new ArrayList();

    /* renamed from: n */
    public C61630a f157436n;

    /* renamed from: o */
    public long f157437o;

    /* renamed from: p */
    public C53973z1 f157438p;

    /* renamed from: q */
    public C53973z1 f157439q;

    /* renamed from: r */
    public final C54683f0 f157440r;

    @C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager$innerRealSelectMusic$2$1", mo125469f = "MMMusicManager.kt", mo125470l = {144, 151}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager$a */
    public static final class C55269a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f157441d;

        /* renamed from: e */
        public Object f157442e;

        /* renamed from: f */
        public int f157443f;

        /* renamed from: g */
        public final /* synthetic */ MMMusicManager f157444g;

        /* renamed from: h */
        public final /* synthetic */ MJMusicInfo f157445h;

        /* renamed from: i */
        public final /* synthetic */ String f157446i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55269a(MMMusicManager mMMusicManager, MJMusicInfo mJMusicInfo, String str, C15601d<? super C55269a> dVar) {
            super(2, dVar);
            this.f157444g = mMMusicManager;
            this.f157445h = mJMusicInfo;
            this.f157446i = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C55269a(this.f157444g, this.f157445h, this.f157446i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C55269a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            MMMusicManager mMMusicManager;
            C61630a aVar;
            MMMusicManager mMMusicManager2;
            String str;
            T t;
            C15911a aVar2 = C15911a.COROUTINE_SUSPENDED;
            int i = this.f157443f;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ((C108494d2) this.f157444g.f157432g).setValue(this.f157445h);
                C61630a aVar3 = this.f157444g.f157436n;
                if (aVar3 != null) {
                    this.f157443f = 1;
                    if (aVar3.mo86581d(this) == aVar2) {
                        return aVar2;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                mMMusicManager2 = (MMMusicManager) this.f157442e;
                aVar = (C61630a) this.f157441d;
                ResultKt.throwOnFailure(obj);
                mMMusicManager = mMMusicManager2;
                mMMusicManager.f157436n = aVar;
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mMMusicManager = this.f157444g;
            List<C64839xt2> list = mMMusicManager.f157435j;
            String str2 = this.f157446i;
            Iterator<T> it = list.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C87412m.m108589b(String.valueOf(((C64839xt2) t).f186384d), str2)) {
                    break;
                }
            }
            C64839xt2 xt22 = (C64839xt2) t;
            if (xt22 != null) {
                str = xt22.f186387g;
            }
            if (str == null) {
                str = "";
            }
            aVar = new C61630a(str, 0);
            if (!((Boolean) ((C108494d2) this.f157444g.f157433h).getValue()).booleanValue()) {
                this.f157441d = aVar;
                this.f157442e = mMMusicManager;
                this.f157443f = 2;
                if (aVar.mo86580c(this) == aVar2) {
                    return aVar2;
                }
                mMMusicManager2 = mMMusicManager;
                mMMusicManager = mMMusicManager2;
            }
            mMMusicManager.f157436n = aVar;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager$b */
    public static final class C55270b extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MMMusicManager f157447d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55270b(MMMusicManager mMMusicManager) {
            super(1);
            this.f157447d = mMMusicManager;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "musicId");
            if (C87412m.m108589b(str, ((MJMusicInfo) ((C108494d2) this.f157447d.f157432g).getValue()).getMusicID())) {
                Log.m105928w("MicroMsg.MMMusicManager", "switch music: current play music is " + str + ", no need to switch");
            } else {
                this.f157447d.mo76578a(str);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager$c */
    public static final class C55271c extends C87413o implements C32224a<List<? extends String>> {

        /* renamed from: d */
        public final /* synthetic */ MMMusicManager f157448d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55271c(MMMusicManager mMMusicManager) {
            super(0);
            this.f157448d = mMMusicManager;
        }

        public Object invoke() {
            Object[] lyricObjs = ((MJMusicInfo) ((C108494d2) this.f157448d.f157432g).getValue()).getLyricObjs();
            if (lyricObjs == null) {
                return C64186f0.f181907d;
            }
            ArrayList arrayList = new ArrayList(lyricObjs.length);
            for (Object obj : lyricObjs) {
                String str = null;
                MJLyricInfo mJLyricInfo = obj instanceof MJLyricInfo ? (MJLyricInfo) obj : null;
                if (mJLyricInfo != null) {
                    str = mJLyricInfo.getContent();
                }
                if (str == null) {
                    str = "";
                }
                arrayList.add(str);
            }
            return arrayList;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager$d */
    public static final class C55272d extends C87413o implements C32227p<Boolean, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MMMusicManager f157449d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55272d(MMMusicManager mMMusicManager) {
            super(2);
            this.f157449d = mMMusicManager;
        }

        public Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ((Boolean) obj2).booleanValue();
            ((C108494d2) this.f157449d.f157433h).setValue(Boolean.valueOf(booleanValue));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager$e */
    public static final class C55273e extends C87413o implements C32227p<Boolean, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MMMusicManager f157450d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55273e(MMMusicManager mMMusicManager) {
            super(2);
            this.f157450d = mMMusicManager;
        }

        public Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ((Boolean) obj2).booleanValue();
            if (booleanValue) {
                C61630a aVar = this.f157450d.f157436n;
                if (aVar != null) {
                    aVar.mo86578a();
                }
            } else {
                C61630a aVar2 = this.f157450d.f157436n;
                if (aVar2 != null) {
                    aVar2.mo86579b();
                }
            }
            ((C108494d2) this.f157450d.f157433h).setValue(Boolean.valueOf(booleanValue));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager$f */
    public /* synthetic */ class C55274f extends C24565l implements C32226l<Object, C13598b0> {
        public C55274f(Object obj) {
            super(1, obj, MMMusicManager.class, "selectMusic", "selectMusic(Ljava/lang/Object;)V", 0);
        }

        public Object invoke(Object obj) {
            Object obj2;
            Object obj3 = obj;
            C87412m.m108594g(obj3, "p0");
            MMMusicManager mMMusicManager = (MMMusicManager) this.receiver;
            mMMusicManager.getClass();
            C13598b0 b0Var = null;
            C28971l lVar = obj3 instanceof C28971l ? (C28971l) obj3 : null;
            if (lVar != null) {
                if (C87412m.m108589b(((MJMusicInfo) ((C108494d2) mMMusicManager.f157432g).getValue()).getMusicID(), ((o74) lVar.f79451a).f139006d)) {
                    Log.m105928w("MicroMsg.MMMusicManager", "selectMusic: current play music is " + ((o74) lVar.f79451a).f139006d + ", no need to switch");
                } else {
                    Iterator it = ((Iterable) ((C108494d2) mMMusicManager.f157431f).getValue()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (C87412m.m108589b(((MJMusicInfo) obj2).getMusicID(), ((o74) lVar.f79451a).f139006d)) {
                            break;
                        }
                    }
                    if (obj2 != null) {
                        Log.m105924i("MicroMsg.MMMusicManager", "selectMusic: contains " + ((o74) lVar.f79451a).f139006d);
                    } else {
                        Iterator it4 = ((ArrayList) mMMusicManager.f157435j).iterator();
                        int i = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                i = -1;
                                break;
                            } else if (C87412m.m108589b(String.valueOf(((C64839xt2) it4.next()).f186384d), ((MJMusicInfo) ((C108494d2) mMMusicManager.f157432g).getValue()).getMusicID())) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        List<C64839xt2> list = mMMusicManager.f157435j;
                        int i2 = i + 1;
                        C64839xt2 xt22 = new C64839xt2();
                        o74 o74 = (o74) lVar.f79451a;
                        String str = o74.f139006d;
                        C87412m.m108593f(str, "info.music_id");
                        Integer e = C66731x.m78731e(str);
                        xt22.f186384d = e != null ? e.intValue() : 0;
                        xt22.f186389i = o74.f139009g;
                        xt22.f186390j.add(o74.f139010h);
                        xt22.f186387g = o74.f139007e;
                        LinkedList<C64866yt2> linkedList = xt22.f186391n;
                        LinkedList<p74> linkedList2 = o74.f139011i;
                        C87412m.m108593f(linkedList2, "info.lyrics");
                        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
                        for (p74 p74 : linkedList2) {
                            C64866yt2 yt22 = new C64866yt2();
                            yt22.f186603e = p74.f139632e;
                            yt22.f186602d = p74.f139631d;
                            arrayList.add(yt22);
                        }
                        linkedList.addAll(arrayList);
                        C13598b0 b0Var2 = C13598b0.f38549a;
                        ((ArrayList) list).add(i2, xt22);
                        List<C64839xt2> list2 = mMMusicManager.f157435j;
                        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list2, 10));
                        Iterator it5 = ((ArrayList) list2).iterator();
                        while (it5.hasNext()) {
                            C64839xt2 xt23 = (C64839xt2) it5.next();
                            String valueOf = String.valueOf(xt23.f186384d);
                            String str2 = xt23.f186389i;
                            LinkedList<String> linkedList3 = xt23.f186390j;
                            C87412m.m108593f(linkedList3, "it.singer_name");
                            String S = C110818d0.m150921S(linkedList3, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 63, (Object) null);
                            MJTime mJTime = new MJTime();
                            LinkedList<C64866yt2> linkedList4 = xt23.f186391n;
                            C87412m.m108593f(linkedList4, "it.lyrics");
                            ArrayList arrayList3 = new ArrayList(C36907w.m41090l(linkedList4, 10));
                            for (C64866yt2 yt23 : linkedList4) {
                                arrayList3.add(new MJLyricInfo((MJTime) null, (MJTime) null, yt23.f186603e, (String) null));
                            }
                            Object[] array = arrayList3.toArray(new MJLyricInfo[0]);
                            C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                            arrayList2.add(new MJMusicInfo(valueOf, str2, S, mJTime, array));
                        }
                        ((C108494d2) mMMusicManager.f157431f).setValue(arrayList2);
                        Map<String, Long> map = mMMusicManager.f157440r.f153259k;
                        String str3 = ((o74) lVar.f79451a).f139006d;
                        C87412m.m108593f(str3, "it.data.music_id");
                        map.put(str3, Long.valueOf(lVar.f79452b));
                    }
                    String str4 = ((o74) lVar.f79451a).f139006d;
                    C87412m.m108593f(str4, "it.data.music_id");
                    mMMusicManager.mo76578a(str4);
                }
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105920e("MicroMsg.MMMusicManager", "selectMusic: obj is not valued type");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager$startRecommend$1", mo125469f = "MMMusicManager.kt", mo125470l = {179}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager$g */
    public static final class C55275g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f157451d;

        /* renamed from: e */
        public final /* synthetic */ MMMusicManager f157452e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55275g(MMMusicManager mMMusicManager, C15601d<? super C55275g> dVar) {
            super(2, dVar);
            this.f157452e = mMMusicManager;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C55275g(this.f157452e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C55275g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            List<MJMusicInfo> list;
            LinkedList<C64839xt2> linkedList;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f157451d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MMMusicManager mMMusicManager = this.f157452e;
                List<String> list2 = mMMusicManager.f157430e;
                long j = mMMusicManager.f157437o;
                this.f157451d = 1;
                obj2 = C53895h.m60469g(C53872d1.f151119c, new C59399a(list2, 60000, 10, j, 10, (C15601d<? super C59399a>) null), this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C64758ut2 ut22 = (C64758ut2) obj2;
            ArrayList arrayList = (ArrayList) this.f157452e.f157435j;
            arrayList.clear();
            Collection collection = ut22 != null ? ut22.f185792e : null;
            if (collection == null) {
                collection = C64186f0.f181907d;
            }
            arrayList.addAll(collection);
            this.f157452e.f157437o = ut22 != null ? ut22.f185791d : 0;
            if (ut22 == null || (linkedList = ut22.f185792e) == null) {
                list = C64186f0.f181907d;
            } else {
                list = new ArrayList<>(C36907w.m41090l(linkedList, 10));
                for (C64839xt2 xt22 : linkedList) {
                    String valueOf = String.valueOf(xt22.f186384d);
                    String str = xt22.f186389i;
                    LinkedList<String> linkedList2 = xt22.f186390j;
                    C87412m.m108593f(linkedList2, "it.singer_name");
                    String S = C110818d0.m150921S(linkedList2, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 63, (Object) null);
                    MJTime mJTime = new MJTime();
                    LinkedList<C64866yt2> linkedList3 = xt22.f186391n;
                    C87412m.m108593f(linkedList3, "it.lyrics");
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList3, 10));
                    for (C64866yt2 yt22 : linkedList3) {
                        arrayList2.add(new MJLyricInfo((MJTime) null, (MJTime) null, yt22.f186603e, (String) null));
                    }
                    Object[] array = arrayList2.toArray(new MJLyricInfo[0]);
                    C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    list.add(new MJMusicInfo(valueOf, str, S, mJTime, array));
                }
            }
            ((C108494d2) this.f157452e.f157431f).setValue(list);
            MMMusicManager mMMusicManager2 = this.f157452e;
            for (MJMusicInfo musicID : list) {
                Map<String, Long> map = mMMusicManager2.f157440r.f153259k;
                String musicID2 = musicID.getMusicID();
                C87412m.m108593f(musicID2, "it.musicID");
                map.put(musicID2, new Long(mMMusicManager2.f157437o));
            }
            if (!list.isEmpty()) {
                ((C108494d2) this.f157452e.f157432g).setValue(C110818d0.m150914L(list));
            }
            return C13598b0.f38549a;
        }
    }

    public MMMusicManager(C0000n0 n0Var, List<String> list) {
        C0000n0 n0Var2 = n0Var;
        List<String> list2 = list;
        C87412m.m108594g(n0Var2, "scope");
        C87412m.m108594g(list2, "imageList");
        this.f157429d = n0Var2;
        this.f157430e = list2;
        C60690y0<List<MJMusicInfo>> c = C108500f2.m146996c(C64186f0.f181907d, (C108497e2) null, 2, (Object) null);
        this.f157431f = c;
        C60690y0<MJMusicInfo> c2 = C108500f2.m146996c(new MJMusicInfo("", "", "", (MJTime) null, (Object[]) null), (C108497e2) null, 2, (Object) null);
        this.f157432g = c2;
        Boolean bool = Boolean.FALSE;
        C60690y0<Boolean> c3 = C108500f2.m146996c(bool, (C108497e2) null, 2, (Object) null);
        this.f157433h = c3;
        C60690y0<Boolean> c4 = C108500f2.m146996c(bool, (C108497e2) null, 2, (Object) null);
        this.f157434i = c4;
        C54683f0 f0Var = new C54683f0(c, c2, new C55270b(this), c3, c4, new C55271c(this), new C55272d(this), new C55273e(this), false, (C54679b) null, 512, (C8480h) null);
        f0Var.f153260l = new C55274f(this);
        this.f157440r = f0Var;
    }

    /* renamed from: a */
    public final void mo76578a(String str) {
        Object obj;
        Log.m105924i("MicroMsg.MMMusicManager", "innerRealSelectMusic() called with: musicId = " + str);
        Iterator it = ((Iterable) ((C108494d2) this.f157431f).getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C87412m.m108589b(((MJMusicInfo) obj).getMusicID(), str)) {
                break;
            }
        }
        MJMusicInfo mJMusicInfo = (MJMusicInfo) obj;
        if (mJMusicInfo != null) {
            Log.m105924i("MicroMsg.MMMusicManager", "switch music: switch to " + mJMusicInfo.getMusicID());
            C53973z1 z1Var = this.f157439q;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            this.f157439q = C53895h.m60466d(this.f157429d, (C66212f) null, (C53934p0) null, new C55269a(this, mJMusicInfo, str, (C15601d<? super C55269a>) null), 3, (Object) null);
        }
    }

    /* renamed from: b */
    public final void mo76579b() {
        C13598b0 b0Var;
        C61630a aVar = this.f157436n;
        if (aVar != null) {
            aVar.mo86579b();
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            String musicID = ((MJMusicInfo) ((C108494d2) this.f157432g).getValue()).getMusicID();
            C87412m.m108593f(musicID, "currentMusicState.value.musicID");
            mo76578a(musicID);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r2 != false) goto L_0x0021;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo76580c() {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.MMMusicManager"
            java.lang.String r1 = "startRecommend: "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.util.List<te3.xt2> r1 = r8.f157435j
            boolean r1 = r1.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 != 0) goto L_0x0021
            a14.z1 r1 = r8.f157438p
            r3 = 0
            if (r1 == 0) goto L_0x001e
            boolean r1 = r1.mo74466a()
            if (r1 != r2) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            if (r2 == 0) goto L_0x0027
        L_0x0021:
            java.lang.String r1 = "startRecommend: skip recommend"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x0027:
            a14.n0 r2 = r8.f157429d
            r3 = 0
            r4 = 0
            com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager$g r5 = new com.tencent.mm.mj_template.album_template.multi_template.MMMusicManager$g
            r0 = 0
            r5.<init>(r8, r0)
            r6 = 3
            r7 = 0
            a14.z1 r0 = a14.C53895h.m60466d(r2, r3, r4, r5, r6, r7)
            r8.f157438p = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mj_template.album_template.multi_template.MMMusicManager.mo76580c():void");
    }

    public /* synthetic */ void onCreate(C0125s sVar) {
    }

    public void onDestroy(C0125s sVar) {
        C87412m.m108594g(sVar, "owner");
        Log.m105924i("MicroMsg.MMMusicManager", "onDestroy: ");
        Log.m105924i("MicroMsg.MMMusicManager", "release: ");
        C53895h.m60466d(this.f157429d, (C66212f) null, (C53934p0) null, new C66738b(this, (C15601d<? super C66738b>) null), 3, (Object) null);
    }

    public void onPause(C0125s sVar) {
        C87412m.m108594g(sVar, "owner");
        Log.m105924i("MicroMsg.MMMusicManager", "onPause: ");
        Log.m105924i("MicroMsg.MMMusicManager", "pausePlay: ");
        C61630a aVar = this.f157436n;
        if (aVar != null) {
            aVar.mo86578a();
        }
    }

    public void onResume(C0125s sVar) {
        C87412m.m108594g(sVar, "owner");
        Log.m105924i("MicroMsg.MMMusicManager", "onResume: ");
        mo76579b();
    }

    public /* synthetic */ void onStart(C0125s sVar) {
    }

    public /* synthetic */ void onStop(C0125s sVar) {
    }
}
