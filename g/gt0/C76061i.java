package gt0;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import sx3.C36907w;

/* renamed from: gt0.i */
public final class C76061i implements C87378p0 {

    /* renamed from: a */
    public final C76062j f222905a;

    /* renamed from: b */
    public final C87362k f222906b;

    /* renamed from: c */
    public boolean f222907c;

    public C76061i(C76062j jVar, C87362k kVar) {
        C87412m.m108594g(jVar, "accessibilityFixer");
        C87412m.m108594g(kVar, "dialogContainer");
        this.f222905a = jVar;
        this.f222906b = kVar;
        kVar.setListener(this);
    }

    /* renamed from: a */
    public void mo106270a(boolean z, C87370k0 k0Var, C87370k0 k0Var2) {
        C76062j jVar = this.f222905a;
        C87362k kVar = this.f222906b;
        jVar.getClass();
        C87412m.m108594g(kVar, "dialogContainer");
        HashMap<C87362k, C76061i> hashMap = jVar.f222909b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<C87362k, C76061i>> it = hashMap.entrySet().iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            if (!C87412m.m108589b(kVar, next.getKey())) {
                z2 = ((C76061i) next.getValue()).f222907c;
            }
            if (z2) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        if (keySet.isEmpty()) {
            Log.m105924i(jVar.f222908a, "onDialogDismissed, othersShownContainer is empty");
            jVar.mo106273b(kVar, z, k0Var2, (List<? extends View>) null);
        } else {
            ArrayList arrayList = new ArrayList(C36907w.m41090l(keySet, 10));
            Iterator it4 = keySet.iterator();
            while (true) {
                if (it4.hasNext()) {
                    List<View> a = jVar.mo106272a((C87362k) it4.next());
                    if (a.contains(kVar)) {
                        Log.m105924i(jVar.f222908a, "onDialogDismissed, otherShownContainer cover me");
                        break;
                    }
                    arrayList.add(a);
                } else {
                    HashSet hashSet = new HashSet();
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        hashSet.addAll((List) it5.next());
                    }
                    List<View> a2 = jVar.mo106272a(kVar);
                    ArrayList arrayList2 = new ArrayList();
                    for (T next2 : a2) {
                        if (!hashSet.contains((View) next2)) {
                            arrayList2.add(next2);
                        }
                    }
                    jVar.mo106273b(kVar, z, k0Var2, arrayList2);
                }
            }
        }
        if (z) {
            this.f222907c = false;
        }
    }

    /* renamed from: b */
    public void mo106271b(boolean z, C87370k0 k0Var, C87370k0 k0Var2) {
        View contentView;
        boolean z2 = true;
        this.f222907c = true;
        C76062j jVar = this.f222905a;
        C87362k kVar = this.f222906b;
        jVar.getClass();
        C87412m.m108594g(kVar, "dialogContainer");
        if (z) {
            ViewGroup.LayoutParams layoutParams = kVar.getLayoutParams();
            if (!(layoutParams != null && -1 == layoutParams.width && -1 == layoutParams.height)) {
                z2 = false;
            }
            if (z2) {
                String str = jVar.f222908a;
                Log.m105924i(str, "onDialogShown#[" + kVar + "], isFirstDialog, clear siblings's importantForAccessibility");
                for (View importantForAccessibility : jVar.mo106272a(kVar)) {
                    importantForAccessibility.setImportantForAccessibility(4);
                }
            }
        }
        if (k0Var2 != null && (contentView = k0Var2.getContentView()) != null) {
            contentView.setImportantForAccessibility(4);
        }
    }
}
