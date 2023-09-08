package ia1;

import android.util.Pair;
import android.view.ViewGroup;
import android.widget.ListView;
import com.tencent.p014mm.sdk.platformtools.Log;
import ia1.C98625h;
import j20.C21152b;
import j20.C21153d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o91.C100312d;
import o91.C100316i;

/* renamed from: ia1.f */
public final class C98621f {

    /* renamed from: a */
    public C100316i f289148a;

    /* renamed from: b */
    public final Map<String, Map<String, List<Pair<String, String>>>> f289149b;

    /* renamed from: c */
    public C98620c f289150c;

    /* renamed from: d */
    public final List<Pair<String, String>> f289151d;

    /* renamed from: e */
    public final Map<String, List<Pair<String, String>>> f289152e;

    /* renamed from: f */
    public final Map<String, List<Pair<String, String>>> f289153f;

    /* renamed from: g */
    public final C21153d f289154g = new C98622a();

    /* renamed from: h */
    public C21152b f289155h = new C98623b();

    /* renamed from: ia1.f$a */
    public class C98622a implements C21153d {
        public C98622a() {
        }

        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            C98620c cVar;
            C100312d dVar;
            C100316i iVar;
            C100316i iVar2;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            Object[] objArr2 = objArr;
            if ("onScrollStateChanged".equals(str5) && "(Landroid/widget/AbsListView;I)V".equals(str6)) {
                C98621f.this.getClass();
                if (str4.contains("com/tencent/mm/plugin/sns/ui/SnsUIAction$")) {
                    if (objArr2.length >= 2 && (iVar2 = C98621f.this.f289148a) != null) {
                        iVar2.mo35476a((ViewGroup) objArr2[0], ((Integer) objArr2[1]).intValue());
                        return;
                    }
                    return;
                }
            }
            if ("onScroll".equals(str5) && "(Landroid/widget/AbsListView;III)V".equals(str6)) {
                C98621f.this.getClass();
                if (str4.contains("com/tencent/mm/plugin/sns/ui/SnsUIAction$")) {
                    if (objArr2.length >= 4 && (iVar = C98621f.this.f289148a) != null) {
                        iVar.mo35477b((ViewGroup) objArr2[0], ((Integer) objArr2[1]).intValue(), ((Integer) objArr2[2]).intValue(), ((Integer) objArr2[3]).intValue(), 0, 0);
                        return;
                    }
                    return;
                }
            }
            if ("resetStoryHeader".equals(str5) && "()V".equals(str6) && (cVar = C98621f.this.f289150c) != null && (dVar = C98625h.this.f289181e) != null) {
                dVar.mo139592n(false);
            }
        }
    }

    /* renamed from: ia1.f$b */
    public class C98623b implements C21152b {
        public C98623b() {
        }

        /* renamed from: a */
        public void mo33108a(String str, String str2, String str3, String str4, String str5, Object obj, Object[] objArr) {
            if ((!str.startsWith("com/tencent/mm/plugin/sns/ui/SnsTimeLineUI") && !str.startsWith("com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC")) || C98621f.this.f289150c == null) {
                return;
            }
            if (str4.equals("smoothScrollToPosition")) {
                if (objArr != null && objArr.length >= 1) {
                    C98620c cVar = C98621f.this.f289150c;
                    int intValue = objArr[0].intValue();
                    C98625h.C98627b bVar = (C98625h.C98627b) cVar;
                    bVar.getClass();
                    Log.m105925i("HABBYGE-MALI.SnsMonitor", "SnsMonitor, smoothScrollToPosition: %d", Integer.valueOf(intValue));
                    C100312d dVar = C98625h.this.f289181e;
                    if (dVar != null) {
                        dVar.f293854n = intValue;
                    }
                }
            } else if (str4.equals("smoothScrollToPositionFromTop")) {
                if (objArr != null && objArr.length >= 2) {
                    C98620c cVar2 = C98621f.this.f289150c;
                    int intValue2 = objArr[0].intValue();
                    objArr[1].intValue();
                    C98625h.C98627b bVar2 = (C98625h.C98627b) cVar2;
                    bVar2.getClass();
                    Log.m105925i("HABBYGE-MALI.SnsMonitor", "SnsMonitor, smoothScrollToPositionFromTop: %d", Integer.valueOf(intValue2));
                    C100312d dVar2 = C98625h.this.f289181e;
                    if (dVar2 != null) {
                        dVar2.f293854n = intValue2;
                    }
                }
            } else if (str4.equals("scrollToTop")) {
                if (objArr != null && objArr.length >= 1) {
                    C98620c cVar3 = C98621f.this.f289150c;
                    ListView listView = objArr[0];
                    C98625h.C98627b bVar3 = (C98625h.C98627b) cVar3;
                    bVar3.getClass();
                    Log.m105924i("HABBYGE-MALI.SnsMonitor", "SnsMonitor, scrollToTop...");
                    C100312d dVar3 = C98625h.this.f289181e;
                    if (dVar3 != null) {
                        dVar3.f293854n = 0;
                    }
                }
            } else if (str4.equals("scrollToPositionWithOffset")) {
                if (objArr != null && objArr.length >= 1) {
                    C98620c cVar4 = C98621f.this.f289150c;
                    int intValue3 = objArr[0].intValue();
                    objArr[1].intValue();
                    C98625h.C98627b bVar4 = (C98625h.C98627b) cVar4;
                    bVar4.getClass();
                    Log.m105925i("HABBYGE-MALI.SnsMonitor", "SnsMonitor, scrollToPositionWithOffset: %d", Integer.valueOf(intValue3));
                    C100312d dVar4 = C98625h.this.f289181e;
                    if (dVar4 != null) {
                        dVar4.f293854n = intValue3;
                    }
                }
            } else if (str4.equals("scrollToPosition") && objArr != null && objArr.length >= 1) {
                C98620c cVar5 = C98621f.this.f289150c;
                int intValue4 = objArr[0].intValue();
                C98625h.C98627b bVar5 = (C98625h.C98627b) cVar5;
                bVar5.getClass();
                Log.m105925i("HABBYGE-MALI.SnsMonitor", "SnsMonitor, scrollToPosition: %d", Integer.valueOf(intValue4));
                C100312d dVar5 = C98625h.this.f289181e;
                if (dVar5 != null) {
                    dVar5.f293854n = intValue4;
                }
            }
        }

        /* renamed from: b */
        public void mo33109b(String str, String str2, String str3, String str4, String str5, Object obj, Object obj2) {
        }
    }

    public C98621f() {
        HashMap hashMap = new HashMap();
        this.f289153f = hashMap;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pair.create("onScrollStateChanged", "(Landroid/widget/AbsListView;I)V"));
        arrayList.add(Pair.create("onScroll", "(Landroid/widget/AbsListView;III)V"));
        new HashMap();
        hashMap.put("android/widget/AbsListView$OnScrollListener", arrayList);
        this.f289149b = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Pair.create("resetStoryHeader", "()V"));
        hashMap.put("com/tencent/mm/plugin/sns/ui/SnsUIAction", arrayList2);
        ArrayList arrayList3 = new ArrayList();
        this.f289151d = arrayList3;
        arrayList3.add(Pair.create("smoothScrollToPosition", "(I)V"));
        arrayList3.add(Pair.create("smoothScrollToPositionFromTop", "(II)V"));
        arrayList3.add(Pair.create("scrollToPositionWithOffset", "(II)V"));
        arrayList3.add(Pair.create("scrollToPosition", "(I)V"));
        arrayList3.add(Pair.create("smoothScrollToPosition", "(I)V"));
        HashMap hashMap2 = new HashMap();
        this.f289152e = hashMap2;
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(Pair.create("scrollToTop", "(Landroid/widget/ListView;)V"));
        hashMap2.put("com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory", arrayList4);
    }
}
