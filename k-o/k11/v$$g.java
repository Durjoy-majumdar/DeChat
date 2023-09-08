package k11;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import com.tencent.wcdb.support.CancellationSignal;
import i11.C98586h;
import j11.C98895d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import nj3.C11184p0;
import nj3.C76879j;
import q41.C101028a;
import qo3.C89779i0;
import wy0.C102506a;
import zt3.C119157j;

public final /* synthetic */ class v$$g implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingUI f290503d;

    /* renamed from: e */
    public final /* synthetic */ int f290504e;

    public /* synthetic */ v$$g(CleanChattingUI cleanChattingUI, int i) {
        this.f290503d = cleanChattingUI;
        this.f290504e = i;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        CleanChattingUI cleanChattingUI = this.f290503d;
        int i2 = this.f290504e;
        long[] jArr = CleanChattingUI.f267888D;
        long[] H7 = cleanChattingUI.mo127432H7();
        C102506a aVar = C102506a.f301832a;
        C102506a.f301840i = false;
        C101028a.m132398a(true);
        ArrayList arrayList = new ArrayList(cleanChattingUI.f267895d.f290441e);
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        long j = 0;
        while (it.hasNext()) {
            C99086u a = cleanChattingUI.f267895d.getItem(((Integer) it.next()).intValue());
            if (a != null) {
                arrayList2.add(a.f290496a);
                j += a.f290497b[i2];
            }
        }
        boolean z = arrayList.size() == cleanChattingUI.f267895d.getCount();
        boolean z2 = i2 != 0;
        int size = arrayList2.size();
        if (i2 == 0) {
            size *= 2;
        }
        CleanChattingUI.C93016a aVar2 = new CleanChattingUI.C93016a(j, z2, z, size, i2 == 0 && cleanChattingUI.f267911w == -2 && z);
        CancellationSignal cancellationSignal = new CancellationSignal();
        ((C119157j) C119157j.f356862d).mo183870a(new C98586h(arrayList2, (List<C98895d>) null, CleanChattingUI.f267890F[i2], H7[0], H7[1], i2 != 0, aVar2, cancellationSignal));
        ((C119157j) C119157j.f356862d).mo183870a(new v$$p(cleanChattingUI, cancellationSignal, i2, aVar2, arrayList2, H7));
        C89779i0 Q = C76879j.m92723Q(cleanChattingUI, cleanChattingUI.getString(C0966R.string.a3h), cleanChattingUI.getString(C0966R.string.beu, new Object[]{"0%"}), false, true, new v$$q(cleanChattingUI, cancellationSignal));
        cleanChattingUI.f267904p = Q;
        Q.show();
    }
}
