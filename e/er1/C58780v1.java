package er1;

import android.content.Context;
import android.os.Bundle;
import bd1.C54446b;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.lite.C56832d;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import p244tt.C14088e;
import te3.C49701hg1;
import te3.C50259lg1;
import te3.C51286sr0;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: er1.v1 */
public final class C58780v1 {

    /* renamed from: a */
    public static final C58780v1 f168288a = new C58780v1();

    /* renamed from: er1.v1$a */
    public static abstract class C58781a implements C56832d.C56833a {

        /* renamed from: a */
        public C56832d f168289a;

        /* renamed from: a */
        public String mo80258a(String str, String str2) {
            C87412m.m108594g(str, "type");
            C87412m.m108594g(str2, "target");
            return "";
        }

        /* renamed from: b */
        public boolean mo80259b(long j, String str, String str2, int i) {
            if (C87412m.m108589b(str, "getEditingAudioUrl")) {
                return mo83376d(j, i);
            }
            if (!C87412m.m108589b(str, "finishMusicOriginInfo")) {
                return false;
            }
            mo83375c(str2);
            return false;
        }

        /* renamed from: c */
        public void mo83375c(String str) {
        }

        /* renamed from: d */
        public abstract boolean mo83376d(long j, int i);
    }

    /* renamed from: a */
    public final C50259lg1 mo83839a() {
        C49701hg1 hg12;
        LinkedList<C50259lg1> linkedList;
        C66785b bVar = C66785b.f191882e;
        T t = null;
        C54446b a = C66783a.C66784a.m78798a(bVar, bVar.mo90662O5(), false, 2, (Object) null);
        if (a == null || (hg12 = a.mo75251m2().f132492I) == null || (linkedList = hg12.f134612d) == null) {
            return null;
        }
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            boolean z = true;
            if (((C50259lg1) next).f137398d != 1) {
                z = false;
                continue;
            }
            if (z) {
                t = next;
                break;
            }
        }
        return (C50259lg1) t;
    }

    /* renamed from: b */
    public final C56832d mo83840b(Context context, C51286sr0 sr02, String str, C58781a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(sr02, "liteAppParam");
        C87412m.m108594g(aVar, "callback");
        Bundle bundle = new Bundle();
        bundle.putString("appId", sr02.f141695d);
        boolean z = false;
        if (str == null || str.length() == 0) {
            str = sr02.f141697f;
        } else {
            String str2 = sr02.f141697f;
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                str = sr02.f141697f + '&' + str;
            }
        }
        bundle.putString(SearchIntents.EXTRA_QUERY, str);
        bundle.putString("path", sr02.f141696e);
        bundle.putInt("nextAnimIn", C0966R.C0968anim.f2326n);
        bundle.putInt("currentAnimOut", C0966R.C0968anim.f2506eu);
        C56832d dVar = new C56832d();
        dVar.f162866c = aVar;
        aVar.f168289a = dVar;
        ((C14088e) C86312j.m106911c(C14088e.class)).gc0(context, bundle, true, false, dVar, (C14088e.C14090b) null);
        return dVar;
    }

    /* renamed from: c */
    public final void mo83841c(C56832d dVar, long j, int i, String str) {
        C87412m.m108594g(str, "url");
        int i2 = str.length() == 0 ? -1 : 0;
        if (dVar != null) {
            ((HashSet) dVar.f162864a).remove(String.format("%d_%d", new Object[]{Long.valueOf(j), Integer.valueOf(i)}));
            LiteAppCenter.storeSendResult(dVar.f162865b, j, i, "json", "{\"errCode\": " + i2 + ",\"audioUrl\": \"" + str + "\"}");
        }
    }
}
