package cj1;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import android.graphics.Bitmap;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.live.infrastructure.coroutine.C55908a;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import ig1.C8916d;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k60.C99102f;
import kotlin.ResultKt;
import l60.C99344b;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import p165hr.C60106t;
import p277yf.C15996c;
import pl1.C100810g0;
import pl1.C11977d0;
import pl1.C11984n0;
import pl1.C11990s0;
import ql1.C12874a;
import r60.C101339a;
import rx3.C13598b0;
import te3.C50381mc0;
import te3.C51548uh3;
import te3.C51765w03;
import te3.C51769w11;
import te3.C51905x03;
import te3.C51909x11;
import tf0.C64916p1;
import up1.C27696y;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: cj1.y1 */
public final class C0639y1 {

    /* renamed from: a */
    public static final C0639y1 f1510a = new C0639y1();

    /* renamed from: b */
    public static volatile boolean f1511b;

    /* renamed from: c */
    public static Map<String, List<String>> f1512c = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: d */
    public static final Map<String, C8916d> f1513d = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: e */
    public static final Map<String, C8916d> f1514e = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: f */
    public static final Map<String, String> f1515f = Collections.synchronizedMap(new HashMap());

    /* renamed from: g */
    public static final Map<String, String> f1516g = Collections.synchronizedMap(new HashMap());

    /* renamed from: h */
    public static final Map<String, String> f1517h = Collections.synchronizedMap(new HashMap());

    /* renamed from: i */
    public static final Map<String, LinkedList<C51548uh3>> f1518i = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: j */
    public static final Map<String, C8916d> f1519j = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: k */
    public static int f1520k;

    /* renamed from: l */
    public static final HashMap<String, Long> f1521l = new HashMap<>();

    /* renamed from: m */
    public static C51909x11 f1522m;

    /* renamed from: n */
    public static C50381mc0 f1523n;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.model.FinderLiveGiftLoader$fetchPag$1", mo125469f = "FinderLiveGiftLoader.kt", mo125470l = {162}, mo125471m = "invokeSuspend")
    /* renamed from: cj1.y1$a */
    public static final class C0640a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f1524d;

        /* renamed from: e */
        public final /* synthetic */ String f1525e;

        /* renamed from: f */
        public final /* synthetic */ boolean f1526f;

        /* renamed from: g */
        public final /* synthetic */ boolean f1527g;

        /* renamed from: h */
        public final /* synthetic */ String f1528h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0640a(String str, boolean z, boolean z2, String str2, C15601d<? super C0640a> dVar) {
            super(2, dVar);
            this.f1525e = str;
            this.f1526f = z;
            this.f1527g = z2;
            this.f1528h = str2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C0640a(this.f1525e, this.f1526f, this.f1527g, this.f1528h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C0640a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f1524d;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C15996c a = C12874a.f36849a.mo12389a();
                String str = this.f1525e;
                this.f1524d = 1;
                obj = C15996c.C15997a.m14901a(a, str, (String) null, this, 2, (Object) null);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PAGFile pAGFile = (PAGFile) obj;
            if (!(pAGFile != null)) {
                pAGFile = null;
            }
            if (pAGFile == null) {
                return null;
            }
            boolean z2 = this.f1526f;
            boolean z3 = this.f1527g;
            if (z2 || z3) {
                z = false;
            }
            if (!z) {
                pAGFile = null;
            }
            if (pAGFile == null) {
                return null;
            }
            String str2 = this.f1528h;
            C0639y1 y1Var = C0639y1.f1510a;
            HashMap<String, Long> hashMap = C0639y1.f1521l;
            Long l = hashMap.get(str2);
            if (l == null) {
                l = new Long(0);
            }
            if (0 == l.longValue()) {
                PAGView pAGView = new PAGView(MMApplicationContext.getContext());
                pAGView.setComposition(pAGFile);
                hashMap.put(str2, new Long(pAGView.duration()));
                Log.m105924i("Finder.FinderLiveGiftLoader", "updatePagMd5Cache");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m564a(C0639y1 y1Var, String str, String str2, String str3) {
        y1Var.getClass();
        HashMap<String, Long> hashMap = f1521l;
        Long l = hashMap.get(str);
        if (l == null) {
            l = 0L;
        }
        if (0 == l.longValue()) {
            PAGView pAGView = new PAGView(MMApplicationContext.getContext());
            pAGView.setComposition(PAGFile.Load(str2));
            hashMap.put(str, Long.valueOf(pAGView.duration()));
            Log.m105924i("Finder.FinderLiveGiftLoader", "checkAndDownloadMultiAnimation giftFullPagDurationMap: giftId = " + str3 + ", animationGiftId:" + str + ", duration = " + hashMap.get(str));
        }
    }

    /* renamed from: b */
    public final String mo610b(String str, C51769w11 w112) {
        C87412m.m108594g(str, "giftId");
        C87412m.m108594g(w112, "randomItem");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        String str2 = w112.f143810d;
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: c */
    public final void mo611c(String str, String str2, String str3, boolean z, boolean z2) {
        C55908a aVar;
        if (!(str.length() == 0)) {
            FinderLiveService.f159376d.getClass();
            C45795b bVar = FinderLiveService.f159348A;
            if (!(bVar == null || (aVar = bVar.f123702i) == null)) {
                C53895h.m60464b(aVar, C53872d1.f151119c, (C53934p0) null, new C0640a(str, z, z2, str2, (C15601d<? super C0640a>) null), 2, (Object) null);
            }
            ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76670MT(new C11977d0(str, str2, str3, z, z2, (C51765w03) null, 32, (C8480h) null));
        }
    }

    /* renamed from: d */
    public final C8916d mo612d(String str) {
        C8916d dVar = f1513d.get(str);
        return dVar == null ? f1519j.get(str) : dVar;
    }

    /* renamed from: e */
    public final boolean mo613e(String str) {
        C8916d dVar = f1513d.get(str);
        String str2 = null;
        Boolean valueOf = dVar != null ? Boolean.valueOf(dVar.mo9724o2()) : null;
        StringBuilder sb = new StringBuilder();
        sb.append("isPreciousGift id:");
        sb.append(dVar != null ? dVar.field_rewardProductId : null);
        sb.append(" name:");
        sb.append(dVar != null ? dVar.field_name : null);
        sb.append(" animationPagUrl:");
        sb.append(dVar != null ? dVar.field_animationPagUrl : null);
        sb.append(", isRandomGift:");
        sb.append(valueOf);
        Log.m105924i("Finder.FinderLiveGiftLoader", sb.toString());
        mo614f(str, false);
        if (dVar != null) {
            str2 = dVar.field_animationPagUrl;
        }
        return !Util.isNullOrNil(str2) || C87412m.m108589b(valueOf, Boolean.TRUE);
    }

    /* renamed from: f */
    public final boolean mo614f(String str, boolean z) {
        C8916d dVar = f1513d.get(str);
        StringBuilder sb = new StringBuilder();
        sb.append("isValidGift isPreview:");
        sb.append(z);
        sb.append(" id:");
        String str2 = null;
        sb.append(dVar != null ? dVar.field_rewardProductId : null);
        sb.append(" name:");
        sb.append(dVar != null ? dVar.field_name : null);
        sb.append(" previewMd5:");
        sb.append(dVar != null ? dVar.field_previewPagMd5 : null);
        sb.append(" filePreviewMd5:");
        sb.append(f1516g.get(str));
        sb.append(" fullMd5:");
        if (dVar != null) {
            str2 = dVar.field_animationPagMd5;
        }
        sb.append(str2);
        sb.append(" fileFulMd5:");
        sb.append(f1515f.get(str));
        Log.m105924i("Finder.FinderLiveGiftLoader", sb.toString());
        return true;
    }

    /* renamed from: g */
    public final String mo615g(String str, C51765w03 w032) {
        C8916d dVar = f1513d.get(str);
        if (dVar == null || str == null) {
            return "";
        }
        String str2 = dVar.field_landscapePagUrl;
        C87412m.m108593f(str2, "giftInfo.field_landscapePagUrl");
        String str3 = dVar.field_name;
        C87412m.m108593f(str3, "giftInfo.field_name");
        return ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76670MT(new C11977d0(str2, str, str3, false, true, (C51765w03) null));
    }

    /* renamed from: h */
    public final String mo616h(String str, boolean z, C51765w03 w032) {
        C8916d dVar = f1513d.get(str);
        if (dVar == null || str == null) {
            return "";
        }
        Class cls = C64916p1.class;
        if (z) {
            String str2 = dVar.field_previewPagUrl;
            C87412m.m108593f(str2, "giftInfo.field_previewPagUrl");
            String str3 = dVar.field_name;
            C87412m.m108593f(str3, "giftInfo.field_name");
            return ((C64916p1) C86312j.m106911c(cls)).mo76670MT(new C11977d0(str2, str, str3, true, false, (C51765w03) null, 48, (C8480h) null));
        }
        String str4 = dVar.field_animationPagUrl;
        C87412m.m108593f(str4, "giftInfo.field_animationPagUrl");
        String str5 = dVar.field_name;
        C87412m.m108593f(str5, "giftInfo.field_name");
        return ((C64916p1) C86312j.m106911c(cls)).mo76670MT(new C11977d0(str4, str, str5, false, false, w032));
    }

    /* renamed from: i */
    public final void mo617i() {
        Class cls = C60106t.class;
        boolean z = false;
        f1511b = false;
        f1513d.clear();
        List<C8916d> jo = ((C60106t) C86312j.m106911c(cls)).zx0().mo9740jo();
        if (jo.isEmpty()) {
            z = true;
        }
        if (z) {
            Log.m105928w("Finder.FinderLiveGiftLoader", "prepareLocalGift giftList from db is nullOrNil");
        }
        for (C8916d dVar : jo) {
            Map<String, C8916d> map = f1513d;
            C87412m.m108593f(map, "giftCache");
            map.put(dVar.field_rewardProductId, dVar);
        }
        f1512c.clear();
        LinkedHashMap<String, List<String>> Lo = ((C60106t) C86312j.m106911c(cls)).zx0().mo9739Lo();
        if (Lo != null) {
            f1512c = Collections.synchronizedMap(Lo);
        }
        Log.m105924i("Finder.FinderLiveGiftLoader", "prepareLocalGift cur gift cache:" + f1513d + ", giftTabInfoList:" + f1512c);
    }

    /* renamed from: j */
    public final void mo618j(String str) {
        long j;
        C87412m.m108594g(str, "productId");
        LinkedList<C51548uh3> linkedList = f1518i.get(str);
        if (linkedList != null) {
            j = 0;
            for (C51548uh3 uh32 : linkedList) {
                j += uh32.f142858e;
            }
        } else {
            j = 0;
        }
        Log.m105924i("Finder.FinderLiveGiftLoader", "[removePkgGiftIfBatchEmpty] productId:" + str + " , left_cnt_sum = " + j);
        if (j <= 0) {
            f1518i.remove(str);
            f1519j.remove(str);
        }
    }

    /* renamed from: k */
    public final void mo619k(C8916d dVar, String str) {
        C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11871f2().mo85955a(new C11984n0(dVar.field_thumbnailFileUrl, C27696y.THUMB_IMAGE));
        a.getClass();
        a.f291326j = new C101339a();
        C99102f fVar = new C99102f(a, a.f291318b);
        fVar.f290591t = fVar.f290572a.f291317a;
        fVar.mo138482b();
        String str2 = dVar.field_previewPagUrl;
        C87412m.m108593f(str2, "giftInfo.field_previewPagUrl");
        String str3 = dVar.field_rewardProductId;
        C87412m.m108593f(str3, "giftInfo.field_rewardProductId");
        String str4 = dVar.field_name;
        C87412m.m108593f(str4, "giftInfo.field_name");
        mo611c(str2, str3, str4, true, false);
        String str5 = dVar.field_animationPagUrl;
        C87412m.m108593f(str5, "giftInfo.field_animationPagUrl");
        String str6 = dVar.field_rewardProductId;
        C87412m.m108593f(str6, "giftInfo.field_rewardProductId");
        String str7 = dVar.field_name;
        C87412m.m108593f(str7, "giftInfo.field_name");
        mo611c(str5, str6, str7, false, false);
        String str8 = dVar.field_landscapePagUrl;
        C87412m.m108593f(str8, "giftInfo.field_landscapePagUrl");
        String str9 = dVar.field_rewardProductId;
        C87412m.m108593f(str9, "giftInfo.field_rewardProductId");
        String str10 = dVar.field_name;
        C87412m.m108593f(str10, "giftInfo.field_name");
        mo611c(str8, str9, str10, false, true);
        String str11 = dVar.field_rewardProductId;
        if (str11 == null) {
            str11 = "";
        }
        if (dVar.mo9724o2()) {
            ((C60106t) C86312j.m106911c(C60106t.class)).zx0().mo9741qq(dVar);
            C51905x03 x032 = dVar.field_multiAnimationList;
            Integer num = null;
            LinkedList<C51765w03> linkedList = x032 != null ? x032.f144381d : null;
            StringBuilder sb = new StringBuilder();
            sb.append("checkAndDownloadMultiAnimation reset, multiAnimationList:");
            sb.append(linkedList != null ? Integer.valueOf(linkedList.size()) : null);
            Log.m105924i("Finder.FinderLiveGiftLoader", sb.toString());
            if (linkedList == null || linkedList.size() <= 0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("checkAndDownloadMultiAnimation id:");
                sb4.append(str11);
                sb4.append(" name:");
                sb4.append(dVar.field_name);
                sb4.append(" multiAnimationList is empty:");
                if (linkedList != null) {
                    num = Integer.valueOf(linkedList.size());
                }
                sb4.append(num);
                Log.m105928w("Finder.FinderLiveGiftLoader", sb4.toString());
            } else {
                C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C0635x1(linkedList, str11, dVar, (C15601d<? super C0635x1>) null), 3, (Object) null);
            }
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("id:");
        sb5.append(dVar.field_rewardProductId);
        sb5.append(" name:");
        sb5.append(dVar.field_name);
        sb5.append(" isFullPag:");
        sb5.append(dVar.field_giftType == 2);
        sb5.append("  isLandscapeGift:");
        sb5.append(!Util.isNullOrNil(dVar.field_landscapePagUrl));
        Log.m105924i("Finder.FinderLiveGiftLoader", sb5.toString());
    }
}
