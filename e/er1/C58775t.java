package er1;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderClickMentionStruct;
import com.tencent.p014mm.plugin.finder.p056ui.FinderPostAtUI;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.utils.LocalFinderAtContactParcel;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import df1.C7322a;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import h81.C59774i;
import ht1.C60172g4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import lc3.C10485b;
import pe1.C35464c;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C49712hj1;
import te3.C64589nq2;
import te3.C64757uq2;
import up1.C14274e;
import up1.C37521f;
import z04.C112550d0;
import z04.C66716g;
import z04.C66717h;
import z04.C66723k;
import zc1.C66785b;

/* renamed from: er1.t */
public final class C58775t {

    /* renamed from: a */
    public static final C58775t f168276a = new C58775t();

    /* renamed from: b */
    public static ArrayList<C66723k> f168277b;

    /* renamed from: c */
    public static final HashMap<String, FinderContact> f168278c = new HashMap<>();

    /* renamed from: er1.t$a */
    public static final class C58776a {

        /* renamed from: a */
        public final int f168279a;

        /* renamed from: b */
        public final int f168280b;

        /* renamed from: c */
        public final String f168281c;

        /* renamed from: d */
        public final FinderContact f168282d;

        public C58776a(int i, int i2, String str, FinderContact finderContact) {
            C87412m.m108594g(str, "atNickname");
            C87412m.m108594g(finderContact, "finderContact");
            this.f168279a = i;
            this.f168280b = i2;
            this.f168281c = str;
            this.f168282d = finderContact;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C58776a)) {
                return false;
            }
            C58776a aVar = (C58776a) obj;
            return this.f168279a == aVar.f168279a && this.f168280b == aVar.f168280b && C87412m.m108589b(this.f168281c, aVar.f168281c) && C87412m.m108589b(this.f168282d, aVar.f168282d);
        }

        public int hashCode() {
            return (((((this.f168279a * 31) + this.f168280b) * 31) + this.f168281c.hashCode()) * 31) + this.f168282d.hashCode();
        }

        public String toString() {
            return "AtStringInfo(start=" + this.f168279a + ", end=" + this.f168280b + ", atNickname=" + this.f168281c + ", finderContact=" + this.f168282d + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C58776a(int i, int i2, String str, FinderContact finderContact, int i3, C8480h hVar) {
            this(i, i2, str, (i3 & 8) != 0 ? new FinderContact() : finderContact);
        }
    }

    static {
        List<String> list;
        ArrayList<C66723k> arrayList = new ArrayList<>();
        C37521f.f99374d.getClass();
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("FinderMentionInputStopTokenList");
        if (!(c instanceof String)) {
            c = null;
        }
        String str = c;
        if (str == null || C87412m.m108589b(str, "")) {
            list = C64197v.m75537f("\\s", "\\n", "#", "@", "\\t");
        } else {
            List U = C112550d0.m153785U(str, new String[]{"_"}, false, 0, 6, (Object) null);
            ArrayList arrayList2 = new ArrayList();
            for (Object next : U) {
                if (!Util.isNullOrNil((String) next)) {
                    arrayList2.add(next);
                }
            }
            Log.m105924i("FinderConfig", "endchars: " + C110818d0.m150921S(arrayList2, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C14274e.f39821d, 31, (Object) null));
            list = arrayList2;
        }
        for (String str2 : list) {
            try {
                arrayList.add(new C66723k(str2));
            } catch (Throwable th) {
                Log.m105920e("Finder.FinderAtUtil", "ENDCHARS parse crash, crashStr=" + str2 + ", error=" + th);
            }
        }
        f168277b = arrayList;
    }

    /* renamed from: a */
    public final LinkedList<C64589nq2> mo83820a() {
        byte[] decodeBytes = mo83822c().decodeBytes("_finder_at_mmkv_recent_at");
        if (decodeBytes != null) {
            if (!(decodeBytes.length == 0)) {
                C64757uq2 uq22 = new C64757uq2();
                try {
                    uq22.parseFrom(decodeBytes);
                    return uq22.f185785d;
                } catch (IOException e) {
                    int i = FinderPostAtUI.f17001w;
                    int i2 = FinderPostAtUI.f17001w;
                    Log.printErrStackTrace("Finder.FinderPostAtUI", e, "_readRecentAt, LocalFinderRecentAtContactCache, _read: %s", e.getMessage());
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final int mo83821b(String str, int i) {
        C87412m.m108594g(str, "content");
        int i2 = -1;
        for (C66723k a : f168277b) {
            C66716g a2 = a.mo90757a(str, i);
            if (a2 != null && (i2 < 0 || ((C66717h) a2).mo90753c().mo59687f0().intValue() < i2)) {
                i2 = ((C66717h) a2).mo90753c().mo59687f0().intValue();
            }
        }
        return i2;
    }

    /* renamed from: c */
    public final MultiProcessMMKV mo83822c() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("_finder_at_mmkv" + C86709a0.m107523b().mo121110g());
        C87412m.m108593f(mmkv, "getMMKV(FINDER_AT_MMKV + MMKernel.account().uin)");
        return mmkv;
    }

    /* renamed from: d */
    public final void mo83823d(String str, Context context, FinderItem finderItem, Context context2) {
        C7322a b;
        String str2 = str;
        Context context3 = context;
        Intent intent = new Intent();
        intent.putExtra("finder_username", str2);
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        long j = finderItem.field_id;
        if (j == 0) {
            j = finderItem.getLocalId();
        }
        C13442s8.C13443a.m12791e(aVar, context, intent, j, (String) null, 0, 2, false, 0, 192, (Object) null);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        intent.putExtra("key_entrance_type", 4);
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context3, intent);
        C13442s8 f = aVar.mo12873f(context3);
        if (f != null) {
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
            C49712hj1 q3 = f.mo12861q3();
            y0Var.getClass();
            C87412m.m108594g(str2, "clickUsername");
            FinderClickMentionStruct finderClickMentionStruct = new FinderClickMentionStruct();
            finderClickMentionStruct.f155128d = finderClickMentionStruct.mo86045b("FeedId", y0Var.xx0(finderItem.getId()), true);
            finderClickMentionStruct.f155129e = finderClickMentionStruct.mo86045b("SessionId", ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb(), true);
            finderClickMentionStruct.f155130f = finderClickMentionStruct.mo86045b("PosterUsername", finderItem.getFeedObject().username, true);
            finderClickMentionStruct.f155131g = finderClickMentionStruct.mo86045b("ViewerUsername", C66785b.f191882e.mo90662O5(), true);
            finderClickMentionStruct.f155132h = finderClickMentionStruct.mo86045b("MentionedUsername", str2, true);
            finderClickMentionStruct.f155133i = (long) q3.f134675i;
            finderClickMentionStruct.f155134j = (long) finderItem.getFeedObject().orgRecommendType;
            finderClickMentionStruct.f155135k = (long) finderItem.getFeedObject().likeCount;
            finderClickMentionStruct.f155136l = (long) finderItem.getFeedObject().commentCount;
            finderClickMentionStruct.mo86054n();
            y0Var.Ec0(finderClickMentionStruct);
        }
        C13442s8 f2 = aVar.mo12873f(context2);
        if (f2 != null && (b = C60172g4.C60173a.m70190b(f2, 0, 1, (Object) null)) != null) {
            b.mo8766a(new C7322a.C7323a(20, finderItem.getId()));
        }
    }

    /* renamed from: e */
    public final void mo83824e(String str, Context context, Context context2) {
        Intent intent = new Intent();
        intent.putExtra("finder_username", str);
        C13442s8.C13443a.m12791e(C13442s8.f38060Q0, context, intent, 0, (String) null, 0, 2, false, 0, 192, (Object) null);
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context, intent);
    }

    /* renamed from: f */
    public final C13604l<ArrayList<C64589nq2>, ArrayList<C58776a>> mo83825f(String str, HashMap<String, C64589nq2> hashMap, C32228q<? super Integer, ? super Integer, ? super String, C13598b0> qVar) {
        int i;
        int D;
        String str2 = str;
        HashMap<String, C64589nq2> hashMap2 = hashMap;
        C32228q<? super Integer, ? super Integer, ? super String, C13598b0> qVar2 = qVar;
        C87412m.m108594g(str2, "sendContent");
        C87412m.m108594g(hashMap2, "atContactMap");
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Util.isNullOrNil(str)) {
            return new C13604l<>(arrayList, arrayList2);
        }
        LinkedList<String> linkedList = new LinkedList<>();
        int i2 = 0;
        while (true) {
            if (i2 < str.length() && (D = C112550d0.m153768D(str, '@', i2, false, 4, (Object) null)) != -1 && D < str.length() - 1) {
                int i3 = D + 1;
                int b = mo83821b(str2, i3);
                int length = b == -1 ? str.length() : b;
                if (length - D > 1) {
                    String substring = str2.substring(i3, length);
                    C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    linkedList.add(substring);
                    if (qVar2 != null) {
                        qVar2.invoke(Integer.valueOf(D), Integer.valueOf(length), substring);
                    }
                    arrayList2.add(new C58776a(D, length, substring, (FinderContact) null, 8, (C8480h) null));
                }
                C37521f fVar = C37521f.f99374d;
                fVar.getClass();
                C35464c<Integer> cVar = C37521f.f99229M1;
                if (cVar.mo60266n().intValue() != 1000) {
                    int size = arrayList2.size();
                    fVar.getClass();
                    if (size >= cVar.mo60266n().intValue()) {
                        break;
                    }
                }
                i2 = length;
            }
        }
        Log.m105925i("Finder.FinderAtUtil", "after split @ :%s", linkedList);
        if (linkedList.size() <= 0) {
            return new C13604l<>(arrayList, arrayList2);
        }
        if (linkedList.size() > 0) {
            int i4 = 0;
            for (String str3 : linkedList) {
                if (hashMap2.containsKey(str3)) {
                    C64589nq2 nq22 = hashMap2.get(str3);
                    if (nq22 != null) {
                        C64589nq2 nq23 = new C64589nq2();
                        nq23.f184530d = nq22.f184530d;
                        nq23.f184531e = nq22.f184531e;
                        nq23.f184532f = nq22.f184532f;
                        nq23.f184533g = nq22.f184533g;
                        nq23.f184534h = nq22.f184534h;
                        nq23.f184535i = nq22.f184535i;
                        i = i4 + 1;
                        nq23.f184536j = i4;
                        arrayList.add(nq23);
                    }
                } else {
                    C64589nq2 nq24 = new C64589nq2();
                    nq24.f184530d = "";
                    nq24.f184531e = "";
                    nq24.f184532f = str3;
                    nq24.f184533g = null;
                    nq24.f184534h = C31543z5.m39451a();
                    nq24.f184535i = 5;
                    i = i4 + 1;
                    nq24.f184536j = i4;
                    arrayList.add(nq24);
                }
                i4 = i;
            }
            Log.m105919d("Finder.FinderAtUtil", "[getAtContactList] cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return new C13604l<>(arrayList, arrayList2);
        }
        Log.m105928w("Finder.FinderAtUtil", "list is null or size 0");
        return new C13604l<>(arrayList, arrayList2);
    }

    /* renamed from: g */
    public final C13604l<ArrayList<C64589nq2>, ArrayList<C58776a>> mo83826g(String str, C32228q<? super Integer, ? super Integer, ? super String, C13598b0> qVar) {
        int D;
        String str2 = str;
        C32228q<? super Integer, ? super Integer, ? super String, C13598b0> qVar2 = qVar;
        C87412m.m108594g(str2, "sendContent");
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Util.isNullOrNil(str)) {
            return new C13604l<>(arrayList, arrayList2);
        }
        LinkedList<String> linkedList = new LinkedList<>();
        int i = 0;
        while (i < str.length() && (D = C112550d0.m153768D(str, '@', i, false, 4, (Object) null)) != -1 && D < str.length() - 1) {
            int i2 = D + 1;
            int b = mo83821b(str2, i2);
            int length = b == -1 ? str.length() : b;
            if (length - D > 1) {
                String substring = str2.substring(i2, length);
                C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                linkedList.add(substring);
                if (qVar2 != null) {
                    qVar2.invoke(Integer.valueOf(D), Integer.valueOf(length), substring);
                }
                arrayList2.add(new C58776a(D, length, substring, (FinderContact) null, 8, (C8480h) null));
            }
            i = length;
        }
        Log.m105925i("Finder.FinderAtUtil", "after split @ :%s", linkedList);
        if (linkedList.size() <= 0) {
            return new C13604l<>(arrayList, arrayList2);
        }
        if (linkedList.size() > 0) {
            int i3 = 0;
            for (String str3 : linkedList) {
                C64589nq2 nq22 = new C64589nq2();
                nq22.f184530d = "";
                nq22.f184531e = "";
                nq22.f184532f = str3;
                nq22.f184533g = null;
                nq22.f184534h = C31543z5.m39451a();
                nq22.f184535i = 5;
                nq22.f184536j = i3;
                arrayList.add(nq22);
                i3++;
            }
            Log.m105919d("Finder.FinderAtUtil", "[getAtContactList] cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return new C13604l<>(arrayList, arrayList2);
        }
        Log.m105928w("Finder.FinderAtUtil", "list is null or size 0");
        return new C13604l<>(arrayList, arrayList2);
    }

    /* renamed from: h */
    public final C64589nq2 mo83827h(LocalFinderAtContactParcel localFinderAtContactParcel) {
        C87412m.m108594g(localFinderAtContactParcel, "contactParcel");
        C64589nq2 nq22 = new C64589nq2();
        nq22.f184530d = localFinderAtContactParcel.f161647d;
        nq22.f184531e = localFinderAtContactParcel.f161648e;
        nq22.f184532f = localFinderAtContactParcel.f161649f;
        byte[] bArr = localFinderAtContactParcel.f161650g;
        if (bArr != null) {
            try {
                FinderAuthInfo finderAuthInfo = new FinderAuthInfo();
                finderAuthInfo.parseFrom(bArr);
                nq22.f184533g = finderAuthInfo;
            } catch (Exception e) {
                nq22.f184533g = null;
                Log.m105921e("Finder.FinderAtUtil", "transformToLocalFinderAtContact FinderAuthInfo parseFrom:%s", e.getMessage());
            }
        }
        nq22.f184534h = localFinderAtContactParcel.f161651h;
        return nq22;
    }

    /* renamed from: i */
    public final C64589nq2 mo83828i(FinderContact finderContact) {
        if (finderContact == null) {
            return null;
        }
        C64589nq2 nq22 = new C64589nq2();
        nq22.f184530d = finderContact.username;
        nq22.f184532f = finderContact.nickname;
        nq22.f184531e = finderContact.headUrl;
        nq22.f184533g = finderContact.authInfo;
        return nq22;
    }
}
