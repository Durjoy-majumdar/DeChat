package pe1;

import androidx.lifecycle.C54219z;
import com.tencent.p014mm.booter.C80814d;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jq3.C9493c;
import qe1.C35839a;
import qe1.C35842d;
import qe1.C35844e;
import qe1.C35846f;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C64197v;

/* renamed from: pe1.c */
public class C35464c<T> extends C35472g implements C9493c {

    /* renamed from: q */
    public static final MultiProcessMMKV f94890q = MultiProcessMMKV.getMMKV("FINDER_CONFIG_USER_KEY");

    /* renamed from: g */
    public final T f94891g;

    /* renamed from: h */
    public String f94892h;

    /* renamed from: i */
    public ArrayList<C35839a<T>> f94893i;

    /* renamed from: j */
    public C35839a<T> f94894j;

    /* renamed from: n */
    public C32226l<? super Integer, C13598b0> f94895n = C35468d.f94901d;

    /* renamed from: o */
    public final C54219z<T> f94896o = new C54219z<>();

    /* renamed from: p */
    public String f94897p = "";

    /* renamed from: pe1.c$a */
    public static final class C35465a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C35464c<T> f94898d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35465a(C35464c<T> cVar) {
            super(0);
            this.f94898d = cVar;
        }

        public Object invoke() {
            C35464c<T> cVar = this.f94898d;
            cVar.f94896o.postValue(cVar.mo60266n());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: pe1.c$b */
    public static final class C35466b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C35464c<T> f94899d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35466b(C35464c<T> cVar) {
            super(0);
            this.f94899d = cVar;
        }

        public Object invoke() {
            C35464c<T> cVar = this.f94899d;
            cVar.f94896o.postValue(cVar.mo60266n());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: pe1.c$c */
    public static final class C35467c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C35464c<T> f94900d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35467c(C35464c<T> cVar) {
            super(0);
            this.f94900d = cVar;
        }

        public Object invoke() {
            C35464c<T> cVar = this.f94900d;
            cVar.f94896o.postValue(cVar.mo60266n());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: pe1.c$d */
    public static final class C35468d extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public static final C35468d f94901d = new C35468d();

        public C35468d() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35464c(T t, String str) {
        super(str);
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f94891g = t;
    }

    /* renamed from: a */
    public final C35464c<T> mo60267a(String str) {
        C87412m.m108594g(str, "providerKeyName");
        ArrayList<C35839a<T>> arrayList = this.f94893i;
        if (arrayList != null) {
            C87412m.m108591d(arrayList);
            if (!arrayList.isEmpty()) {
                C80814d b = C80814d.m98665b(MMApplicationContext.getContext());
                if (b == null) {
                    Log.m105921e("Finder.FinderFakeConfig", "Fail to get debugger, skip apply chosen item from assist key %s", str);
                    return this;
                }
                Integer c = b.mo112568c(str);
                if (c == null || c.intValue() < 0) {
                    Log.m105929w("Finder.FinderFakeConfig", "Assist does not specify value with key %s", str);
                    return this;
                }
                int intValue = c.intValue();
                ArrayList<C35839a<T>> arrayList2 = this.f94893i;
                C87412m.m108591d(arrayList2);
                if (intValue >= arrayList2.size()) {
                    Log.m105921e("Finder.FinderFakeConfig", "Bad value %s from assist specified with key %s", c, str);
                    return this;
                }
                this.f94904e = c.intValue();
                Log.m105925i("Finder.FinderFakeConfig", "Chosen item of debug config %s was override by assist with key %s", this.f94892h, str);
                return this;
            }
        }
        Log.m105920e("Finder.FinderFakeConfig", "applyChosenDebugConfigFromAssist: please call bindDebugConfig first.");
        return this;
    }

    /* renamed from: b */
    public final C35464c<T> mo60268b(String str, List<? extends T> list, List<String> list2) {
        C13604l lVar;
        C87412m.m108594g(str, "keyName");
        C87412m.m108594g(list, "configDataList");
        C87412m.m108594g(list2, "configDataNameList");
        this.f94892h = str;
        LinkedList<C13604l> linkedList = new LinkedList<>();
        int i = 0;
        int i2 = 0;
        for (T next : list) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                String str2 = (String) C110818d0.m150917O(list2, i2);
                if (str2 == null) {
                    str2 = "";
                }
                linkedList.add(new C13604l(next, str2));
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        if (this.f94893i == null) {
            this.f94893i = new ArrayList<>();
        }
        for (C13604l lVar2 : linkedList) {
            ArrayList<C35839a<T>> arrayList = this.f94893i;
            if (arrayList != null) {
                arrayList.add(new C35839a(lVar2.f38555d, (String) lVar2.f38556e, (C32224a<C13598b0>) null));
            }
        }
        String str3 = this.f94892h;
        if (str3 != null) {
            Integer valueOf = Integer.valueOf(f94890q.getInt(str3, -1));
            lVar = new C13604l(valueOf, "get from mmkv");
            int intValue = valueOf.intValue();
            ArrayList<C35839a<T>> arrayList2 = this.f94893i;
            if (arrayList2 != null) {
                i = arrayList2.size();
            }
            if (intValue >= i) {
                lVar = new C13604l(-1, "reset_default");
            }
        } else {
            lVar = new C13604l(-1, "default");
        }
        Log.m105924i("Finder.FinderFakeConfig", "code:" + hashCode() + "  keyName " + this.f94892h + " initChosenIndex " + ((Number) lVar.f38555d).intValue() + " reason " + ((String) lVar.f38556e) + " defValue:" + this.f94891g);
        this.f94904e = ((Number) lVar.f38555d).intValue();
        return this;
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    /* renamed from: d */
    public final C35464c<T> mo60269d(String str) {
        C87412m.m108594g(str, "dyConfigKey");
        this.f94894j = new C35842d(this.f94891g, str, new C35465a(this));
        return this;
    }

    /* renamed from: f */
    public final C35464c<T> mo60270f(C32735h.C32736a aVar) {
        C87412m.m108594g(aVar, "expKey");
        this.f94894j = new C35844e(this.f94891g, aVar, new C35466b(this));
        return this;
    }

    public long getItemId() {
        String str = this.f94892h;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        T t = this.f94891g;
        if (t != null) {
            i = t.hashCode();
        }
        return (long) (hashCode + i);
    }

    /* renamed from: i */
    public final C35464c<T> mo60271i(int i, String str) {
        C87412m.m108594g(str, "exptKey");
        this.f94894j = new C35846f(this.f94891g, i, str, new C35467c(this));
        return this;
    }

    /* renamed from: j */
    public List<String> mo60272j() {
        LinkedList linkedList = new LinkedList();
        ArrayList<C35839a<T>> arrayList = this.f94893i;
        if (arrayList != null) {
            for (C35839a aVar : arrayList) {
                linkedList.add(aVar.f95665b);
            }
        }
        C35839a<T> aVar2 = this.f94894j;
        if (aVar2 != null) {
            linkedList.add(aVar2.f95665b + XVFSFile.PATH_SEPARATOR_CHAR + aVar2.mo60442c());
        }
        return linkedList;
    }

    /* renamed from: k */
    public void mo60264k(int i) {
        C35839a aVar;
        ArrayList<C35839a<T>> arrayList = this.f94893i;
        int i2 = i > (arrayList != null ? arrayList.size() : 0) ? -1 : i;
        this.f94904e = i2;
        ArrayList<C35839a<T>> arrayList2 = this.f94893i;
        if (!(arrayList2 == null || (aVar = (C35839a) C110818d0.m150917O(arrayList2, i2)) == null)) {
            this.f94896o.setValue(aVar.mo60442c());
        }
        String str = this.f94892h;
        if (str != null) {
            f94890q.putInt(str, i).commit();
        }
        if (BuildInfo.DEBUG) {
            Log.m105924i("Finder.FinderFakeConfig", "code:" + hashCode() + "  keyName " + this.f94892h + " onItemClick click: " + i + " chosenIndex: " + this.f94904e + " defValue:" + this.f94891g);
        }
        this.f94895n.invoke(Integer.valueOf(i));
    }

    /* renamed from: l */
    public void mo60265l() {
        Log.m105924i("Finder.FinderFakeConfig", "code:" + hashCode() + "  keyName " + this.f94892h + " reset");
        this.f94904e = -1;
        String str = this.f94892h;
        if (str != null) {
            f94890q.putInt(str, -1).commit();
        }
    }

    /* renamed from: m */
    public final C35464c<T> mo60273m(String str) {
        C87412m.m108594g(str, "tag");
        this.f94897p = str;
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T mo60266n() {
        /*
            r4 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            r1 = 0
            if (r0 != 0) goto L_0x0016
            boolean r0 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()
            if (r0 != 0) goto L_0x0016
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r0 != 0) goto L_0x0016
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r0 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r0 = 0
            goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            r2 = 0
            if (r0 == 0) goto L_0x0047
            int r0 = r4.f94904e
            r3 = -1
            if (r0 == r3) goto L_0x0047
            java.util.ArrayList<qe1.a<T>> r3 = r4.f94893i
            if (r3 == 0) goto L_0x0027
            int r1 = r3.size()
        L_0x0027:
            if (r0 >= r1) goto L_0x0047
            int r0 = r4.f94904e
            if (r0 >= 0) goto L_0x002e
            goto L_0x0047
        L_0x002e:
            java.util.ArrayList<qe1.a<T>> r1 = r4.f94893i
            if (r1 == 0) goto L_0x0057
            java.lang.Object r0 = sx3.C110818d0.m150917O(r1, r0)
            qe1.a r0 = (qe1.C35839a) r0
            if (r0 == 0) goto L_0x0057
            rx3.l r2 = new rx3.l
            java.lang.Object r0 = r0.mo60442c()
            java.lang.String r1 = "userConfig"
            r2.<init>(r0, r1)
            goto L_0x0057
        L_0x0047:
            qe1.a<T> r0 = r4.f94894j
            if (r0 == 0) goto L_0x0057
            rx3.l r2 = new rx3.l
            java.lang.Object r0 = r0.mo60442c()
            java.lang.String r1 = "svrConfig"
            r2.<init>(r0, r1)
        L_0x0057:
            if (r2 != 0) goto L_0x0062
            rx3.l r2 = new rx3.l
            T r0 = r4.f94891g
            java.lang.String r1 = "defaultValue"
            r2.<init>(r0, r1)
        L_0x0062:
            A r0 = r2.f38555d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pe1.C35464c.mo60266n():java.lang.Object");
    }
}
